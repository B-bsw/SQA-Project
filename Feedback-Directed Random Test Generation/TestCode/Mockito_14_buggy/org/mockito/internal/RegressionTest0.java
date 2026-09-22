package org.mockito.internal;

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
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.CharSequence> charSequenceDeprecatedOngoingStubbing2 = mockitoCore0.stub((java.lang.CharSequence) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.Class<?>> wildcardClassDeprecatedOngoingStubbing3 = mockitoCore0.stub(wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.verification.VerificationMode verificationMode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = mockitoCore0.verify((java.lang.Object) 0, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.String> strDeprecatedOngoingStubbing2 = mockitoCore0.stub("");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.reflect.Type> typeDeprecatedOngoingStubbing3 = mockitoCore0.stub((java.lang.reflect.Type) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.MockitoCore mockitoCore3 = new org.mockito.internal.MockitoCore();
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 100, true, mockitoCore3, 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions(objArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler8 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl7);
        org.mockito.stubbing.Answer[] answerArray9 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList10 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList10, answerArray9);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList10);
        java.util.AbstractCollection[] abstractCollectionArray14 = new java.util.AbstractCollection[2];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<org.mockito.stubbing.Answer>[] answerCollectionArray15 = (java.util.AbstractCollection<org.mockito.stubbing.Answer>[]) abstractCollectionArray14;
        answerCollectionArray15[0] = answerList4;
        answerCollectionArray15[1] = answerList10;
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.reset(answerCollectionArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.ArrayList");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(answerArray9);
        org.junit.Assert.assertArrayEquals(answerArray9, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(abstractCollectionArray14);
        org.junit.Assert.assertNotNull(answerCollectionArray15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.lang.Iterable<org.mockito.stubbing.Answer>> answerIterableOngoingStubbing7 = mockitoCore0.when((java.lang.Iterable<org.mockito.stubbing.Answer>) answerList4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.util.Collection<org.mockito.stubbing.Answer>> answerCollectionMockHandler1 = new org.mockito.internal.MockHandler<java.util.Collection<org.mockito.stubbing.Answer>>(mockSettingsImpl0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.lang.Cloneable> cloneableVoidMethodStubbable7 = mockitoCore0.stubVoid((java.lang.Cloneable) answerList4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.ArrayList");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress4 = annotatedElementMockHandler1.mockingProgress;
        org.mockito.internal.invocation.Invocation invocation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = annotatedElementMockHandler1.handle(invocation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(mockingProgress4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.reflect.Type type1 = null;
        org.mockito.verification.VerificationMode verificationMode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type3 = mockitoCore0.verify(type1, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<java.util.List<org.mockito.stubbing.Answer>> answerListVoidMethodStubbable7 = mockitoCore0.stubVoid((java.util.List<org.mockito.stubbing.Answer>) answerList4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.ArrayList");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler8 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl7);
        org.mockito.stubbing.Answer[] answerArray9 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList10 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList10, answerArray9);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList10);
        org.mockito.stubbing.Answer[] answerArray13 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList14 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList14, answerArray13);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList14);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl17 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler18 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl17);
        org.mockito.stubbing.Answer[] answerArray19 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList20 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList20, answerArray19);
        annotatedElementMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList20);
        org.mockito.stubbing.Answer[] answerArray23 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList24 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList24, answerArray23);
        annotatedElementMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList24);
        java.util.Collection[] collectionArray28 = new java.util.Collection[3];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.mockito.stubbing.Answer>[] answerCollectionArray29 = (java.util.Collection<org.mockito.stubbing.Answer>[]) collectionArray28;
        answerCollectionArray29[0] = answerList4;
        answerCollectionArray29[1] = answerList14;
        answerCollectionArray29[2] = answerList24;
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.reset(answerCollectionArray29);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class java.util.ArrayList");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(answerArray9);
        org.junit.Assert.assertArrayEquals(answerArray9, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(answerArray13);
        org.junit.Assert.assertArrayEquals(answerArray13, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(answerArray19);
        org.junit.Assert.assertArrayEquals(answerArray19, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(answerArray23);
        org.junit.Assert.assertArrayEquals(answerArray23, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collectionArray28);
        org.junit.Assert.assertNotNull(answerCollectionArray29);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = annotatedElementMockHandler2.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress5 = annotatedElementMockHandler2.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer8 = annotatedElementMockHandler7.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = annotatedElementMockHandler7.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress10 = annotatedElementMockHandler7.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler12 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl11);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer13 = annotatedElementMockHandler12.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder14 = annotatedElementMockHandler12.matchersBinder;
        annotatedElementMockHandler7.matchersBinder = matchersBinder14;
        java.lang.Object[] objArray18 = new java.lang.Object[] { annotatedElementMockHandler2, matchersBinder14, (byte) 1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions(objArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder4);
        org.junit.Assert.assertNotNull(mockingProgress5);
        org.junit.Assert.assertNotNull(invocationContainer8);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(mockingProgress10);
        org.junit.Assert.assertNotNull(invocationContainer13);
        org.junit.Assert.assertNotNull(matchersBinder14);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler3 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = annotatedElementMockHandler3.matchersBinder;
        org.mockito.internal.invocation.Invocation invocation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = annotatedElementMockHandler3.handle(invocation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing1 = mockitoCore0.stub();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl2 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler3 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl2);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = annotatedElementMockHandler3.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler3.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer6 = annotatedElementMockHandler3.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler8 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl7);
        org.mockito.stubbing.Answer[] answerArray9 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList10 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList10, answerArray9);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList10);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl13 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler14 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl13);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer15 = annotatedElementMockHandler14.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder16 = annotatedElementMockHandler14.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler17 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler14);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl18 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler19 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl18);
        org.mockito.stubbing.Answer[] answerArray20 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList21 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList21, answerArray20);
        annotatedElementMockHandler19.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList21);
        org.mockito.internal.invocation.MatchersBinder matchersBinder24 = annotatedElementMockHandler19.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl25 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler26 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl25);
        org.mockito.stubbing.Answer[] answerArray27 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList28 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList28, answerArray27);
        annotatedElementMockHandler26.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList28);
        annotatedElementMockHandler19.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList28);
        annotatedElementMockHandler17.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList28);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList28);
        org.mockito.stubbing.Answer[] answerArray34 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList35 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList35, answerArray34);
        annotatedElementMockHandler8.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList35);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 1L, annotatedElementMockHandler3, answerList35 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder39 = mockitoCore0.inOrder(objArray38);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer4);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainer6);
        org.junit.Assert.assertNotNull(answerArray9);
        org.junit.Assert.assertArrayEquals(answerArray9, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(invocationContainer15);
        org.junit.Assert.assertNotNull(matchersBinder16);
        org.junit.Assert.assertNotNull(answerArray20);
        org.junit.Assert.assertArrayEquals(answerArray20, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(matchersBinder24);
        org.junit.Assert.assertNotNull(answerArray27);
        org.junit.Assert.assertArrayEquals(answerArray27, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(answerArray34);
        org.junit.Assert.assertArrayEquals(answerArray34, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing3 = mockitoCore0.stub();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer5 = annotatedElementMockHandler4.getInvocationContainer();
        java.lang.Object[] objArray6 = new java.lang.Object[] { invocationContainer5 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder7 = mockitoCore0.inOrder(objArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(invocationContainer5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[invocationForStubbing: null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[invocationForStubbing: null]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = annotatedElementMockHandler2.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler5 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler2);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.stubbing.Answer[] answerArray8 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList9 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList9, answerArray8);
        annotatedElementMockHandler7.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList9);
        org.mockito.internal.invocation.MatchersBinder matchersBinder12 = annotatedElementMockHandler7.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl13 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler14 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl13);
        org.mockito.stubbing.Answer[] answerArray15 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList16 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList16, answerArray15);
        annotatedElementMockHandler14.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        annotatedElementMockHandler7.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        annotatedElementMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        org.mockito.internal.MockitoInvocationHandler[] mockitoInvocationHandlerArray21 = new org.mockito.internal.MockitoInvocationHandler[] { annotatedElementMockHandler5 };
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.reset(mockitoInvocationHandlerArray21);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.MockHandler");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder4);
        org.junit.Assert.assertNotNull(answerArray8);
        org.junit.Assert.assertArrayEquals(answerArray8, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(matchersBinder12);
        org.junit.Assert.assertNotNull(answerArray15);
        org.junit.Assert.assertArrayEquals(answerArray15, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mockitoInvocationHandlerArray21);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer8 = annotatedElementMockHandler7.getInvocationContainer();
        java.lang.Class<?> wildcardClass9 = annotatedElementMockHandler7.getClass();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement> annotatedElementVoidMethodStubbable10 = annotatedElementMockHandler1.voidMethodStubbable((java.lang.reflect.AnnotatedElement) wildcardClass9);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = annotatedElementMockHandler1.getMockSettings();
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(invocationContainer4);
        org.junit.Assert.assertNull(mockSettingsImpl5);
        org.junit.Assert.assertNotNull(invocationContainer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(annotatedElementVoidMethodStubbable10);
        org.junit.Assert.assertNull(mockSettingsImpl11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer5 = annotatedElementMockHandler4.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = annotatedElementMockHandler4.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = annotatedElementMockHandler4.mockingProgress;
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1), 0L, mockingProgress7, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder10 = mockitoCore0.inOrder(objArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer5);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 0, iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 0, iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null, 10.0]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.Class<?>> wildcardClassMockHandler1 = new org.mockito.internal.MockHandler<java.lang.Class<?>>(mockSettingsImpl0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.invocation.Invocation invocation6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = annotatedElementMockHandler1.handle(invocation6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(invocationContainer4);
        org.junit.Assert.assertNull(mockSettingsImpl5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer8 = annotatedElementMockHandler7.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = annotatedElementMockHandler7.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer10 = annotatedElementMockHandler7.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = annotatedElementMockHandler7.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler13 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl12);
        org.mockito.internal.progress.MockingProgress mockingProgress14 = annotatedElementMockHandler13.mockingProgress;
        annotatedElementMockHandler7.mockingProgress = mockingProgress14;
        annotatedElementMockHandler1.mockingProgress = mockingProgress14;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl17 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler18 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl17);
        org.mockito.internal.progress.MockingProgress mockingProgress19 = annotatedElementMockHandler18.mockingProgress;
        annotatedElementMockHandler1.mockingProgress = mockingProgress19;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainer8);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(invocationContainer10);
        org.junit.Assert.assertNull(mockSettingsImpl11);
        org.junit.Assert.assertNotNull(mockingProgress14);
        org.junit.Assert.assertNotNull(mockingProgress19);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl5);
        org.mockito.stubbing.Answer[] answerArray7 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList8 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList8, answerArray7);
        annotatedElementMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList8);
        org.mockito.internal.invocation.MatchersBinder matchersBinder11 = annotatedElementMockHandler6.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler13 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl12);
        org.mockito.stubbing.Answer[] answerArray14 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList15 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList15, answerArray14);
        annotatedElementMockHandler13.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        annotatedElementMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer20 = annotatedElementMockHandler4.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainer invocationContainer21 = annotatedElementMockHandler4.getInvocationContainer();
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(answerArray7);
        org.junit.Assert.assertArrayEquals(answerArray7, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matchersBinder11);
        org.junit.Assert.assertNotNull(answerArray14);
        org.junit.Assert.assertArrayEquals(answerArray14, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(invocationContainer20);
        org.junit.Assert.assertNotNull(invocationContainer21);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = annotatedElementMockHandler2.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler5 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler2);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.stubbing.Answer[] answerArray8 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList9 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList9, answerArray8);
        annotatedElementMockHandler7.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList9);
        org.mockito.internal.invocation.MatchersBinder matchersBinder12 = annotatedElementMockHandler7.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl13 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler14 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl13);
        org.mockito.stubbing.Answer[] answerArray15 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList16 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList16, answerArray15);
        annotatedElementMockHandler14.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        annotatedElementMockHandler7.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        annotatedElementMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.List<org.mockito.stubbing.Answer>> answerListOngoingStubbing21 = mockitoCore0.when((java.util.List<org.mockito.stubbing.Answer>) answerList16);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.MissingMethodInvocationException; message: ?when() requires an argument which has to be a method call on a mock.?For example:?    when(mock.getArticles()).thenReturn(articles);??Also, this error might show up because you stub either of: final/private/equals()/hashCode() methods.?Those methods *cannot* be stubbed/verified.?");
        } catch (org.mockito.exceptions.misusing.MissingMethodInvocationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder4);
        org.junit.Assert.assertNotNull(answerArray8);
        org.junit.Assert.assertArrayEquals(answerArray8, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(matchersBinder12);
        org.junit.Assert.assertNotNull(answerArray15);
        org.junit.Assert.assertArrayEquals(answerArray15, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.util.ArrayList<org.mockito.stubbing.Answer>> answerListMockHandler1 = new org.mockito.internal.MockHandler<java.util.ArrayList<org.mockito.stubbing.Answer>>(mockSettingsImpl0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler3 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.invocation.Invocation invocation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = annotatedElementMockHandler1.handle(invocation5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNull(mockSettingsImpl4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl3 = annotatedElementMockHandler1.invocationContainerImpl;
        org.mockito.internal.invocation.Invocation invocation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = annotatedElementMockHandler1.handle(invocation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(invocationContainerImpl3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.invocation.Invocation invocation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = annotatedElementMockHandler1.handle(invocation4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler0 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler3 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl5);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer7 = annotatedElementMockHandler6.getInvocationContainer();
        java.lang.Class<?> wildcardClass8 = annotatedElementMockHandler6.getClass();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement> annotatedElementVoidMethodStubbable9 = annotatedElementMockHandler1.voidMethodStubbable((java.lang.reflect.AnnotatedElement) wildcardClass8);
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNull(mockSettingsImpl4);
        org.junit.Assert.assertNotNull(invocationContainer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(annotatedElementVoidMethodStubbable9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.stubbing.Answer[] answerArray5 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList6 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList6, answerArray5);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList6);
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = annotatedElementMockHandler4.matchersBinder;
        java.lang.Class<?> wildcardClass10 = annotatedElementMockHandler4.getClass();
        org.mockito.verification.VerificationMode verificationMode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = mockitoCore0.verify(wildcardClass10, verificationMode11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(answerArray5);
        org.junit.Assert.assertArrayEquals(answerArray5, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.Invocation invocation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = annotatedElementMockHandler1.handle(invocation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.stubbing.Answer[] answerArray2 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList3 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList3, answerArray2);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList3);
        org.mockito.stubbing.Answer[] answerArray6 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList7 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList7, answerArray6);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl10 = annotatedElementMockHandler1.invocationContainerImpl;
        org.junit.Assert.assertNotNull(answerArray2);
        org.junit.Assert.assertArrayEquals(answerArray2, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(answerArray6);
        org.junit.Assert.assertArrayEquals(answerArray6, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(invocationContainerImpl10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.internal.progress.MockingProgress mockingProgress3 = annotatedElementMockHandler2.mockingProgress;
        org.mockito.verification.VerificationMode verificationMode4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.progress.MockingProgress mockingProgress5 = mockitoCore0.verify(mockingProgress3, verificationMode4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockingProgress3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.validateMockitoUsage();
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler5 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl4);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer6 = annotatedElementMockHandler5.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl7 = annotatedElementMockHandler5.invocationContainerImpl;
        annotatedElementMockHandler1.invocationContainerImpl = invocationContainerImpl7;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(invocationContainer6);
        org.junit.Assert.assertNotNull(invocationContainerImpl7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        java.lang.Object[] objArray2 = new java.lang.Object[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions(objArray2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Examples of correct verifications:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[100.0]");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer3 = annotatedElementMockHandler2.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder4 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer5 = annotatedElementMockHandler2.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = annotatedElementMockHandler2.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler8 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl7);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer9 = annotatedElementMockHandler8.getInvocationContainer();
        java.lang.Class<?> wildcardClass10 = annotatedElementMockHandler8.getClass();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement> annotatedElementVoidMethodStubbable11 = annotatedElementMockHandler2.voidMethodStubbable((java.lang.reflect.AnnotatedElement) wildcardClass10);
        org.mockito.verification.VerificationMode verificationMode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = mockitoCore0.verify(wildcardClass10, verificationMode12);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer3);
        org.junit.Assert.assertNotNull(matchersBinder4);
        org.junit.Assert.assertNotNull(invocationContainer5);
        org.junit.Assert.assertNull(mockSettingsImpl6);
        org.junit.Assert.assertNotNull(invocationContainer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(annotatedElementVoidMethodStubbable11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.stubbing.Answer[] answerArray5 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList6 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList6, answerArray5);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList6);
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = annotatedElementMockHandler4.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl10 = annotatedElementMockHandler4.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = annotatedElementMockHandler4.getMockSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>> annotatedElementMockHandlerInterfaceVoidMethodStubbable12 = mockitoCore0.stubVoid((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler4);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.MockHandler");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(answerArray5);
        org.junit.Assert.assertArrayEquals(answerArray5, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNull(mockSettingsImpl10);
        org.junit.Assert.assertNull(mockSettingsImpl11);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.mockito.internal.MockHandlerInterface<org.mockito.internal.MockitoInvocationHandler> mockitoInvocationHandlerMockHandlerInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandler<org.mockito.internal.MockitoInvocationHandler> mockitoInvocationHandlerMockHandler1 = new org.mockito.internal.MockHandler<org.mockito.internal.MockitoInvocationHandler>(mockitoInvocationHandlerMockHandlerInterface0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.progress.MockingProgress mockingProgress2 = annotatedElementMockHandler1.mockingProgress;
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.junit.Assert.assertNotNull(mockingProgress2);
        org.junit.Assert.assertNotNull(matchersBinder3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer5 = annotatedElementMockHandler4.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = annotatedElementMockHandler4.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress7 = annotatedElementMockHandler4.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler9 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl8);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer10 = annotatedElementMockHandler9.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder11 = annotatedElementMockHandler9.matchersBinder;
        annotatedElementMockHandler4.matchersBinder = matchersBinder11;
        org.mockito.verification.VerificationMode verificationMode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.MatchersBinder matchersBinder14 = mockitoCore0.verify(matchersBinder11, verificationMode13);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(invocationContainer5);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNotNull(mockingProgress7);
        org.junit.Assert.assertNotNull(invocationContainer10);
        org.junit.Assert.assertNotNull(matchersBinder11);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler9 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl8);
        org.mockito.stubbing.Answer[] answerArray10 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList11 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList11, answerArray10);
        annotatedElementMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.OngoingStubbing<java.util.RandomAccess> randomAccessOngoingStubbing15 = mockitoCore0.when((java.util.RandomAccess) answerList11);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder7);
        org.junit.Assert.assertNotNull(answerArray10);
        org.junit.Assert.assertArrayEquals(answerArray10, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler9 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl8);
        org.mockito.stubbing.Answer[] answerArray10 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList11 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList11, answerArray10);
        annotatedElementMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl15 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler16 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl15);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer17 = annotatedElementMockHandler16.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = annotatedElementMockHandler16.invocationContainerImpl;
        annotatedElementMockHandler2.invocationContainerImpl = invocationContainerImpl18;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.VoidMethodStubbable<org.mockito.internal.stubbing.InvocationContainerImpl> invocationContainerImplVoidMethodStubbable20 = mockitoCore0.stubVoid(invocationContainerImpl18);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: Argument should be a mock, but is: class org.mockito.internal.stubbing.InvocationContainerImpl");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder7);
        org.junit.Assert.assertNotNull(answerArray10);
        org.junit.Assert.assertArrayEquals(answerArray10, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(invocationContainer17);
        org.junit.Assert.assertNotNull(invocationContainerImpl18);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        java.util.List<org.mockito.stubbing.Answer>[] answerListArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.reset(answerListArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.stubbing.Answer[] answerArray5 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList6 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList6, answerArray5);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList6);
        org.mockito.stubbing.Answer[] answerArray9 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList10 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList10, answerArray9);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.util.Collection<org.mockito.stubbing.Answer>> answerCollectionDeprecatedOngoingStubbing13 = mockitoCore0.stub((java.util.Collection<org.mockito.stubbing.Answer>) answerList10);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(answerArray5);
        org.junit.Assert.assertArrayEquals(answerArray5, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(answerArray9);
        org.junit.Assert.assertArrayEquals(answerArray9, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.internal.MockHandler<org.mockito.internal.stubbing.InvocationContainer> invocationContainerMockHandler0 = new org.mockito.internal.MockHandler<org.mockito.internal.stubbing.InvocationContainer>();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress4 = annotatedElementMockHandler1.mockingProgress;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl5);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer7 = annotatedElementMockHandler6.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder8 = annotatedElementMockHandler6.matchersBinder;
        annotatedElementMockHandler1.matchersBinder = matchersBinder8;
        java.lang.Class<?> wildcardClass10 = annotatedElementMockHandler1.getClass();
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(mockingProgress4);
        org.junit.Assert.assertNotNull(invocationContainer7);
        org.junit.Assert.assertNotNull(matchersBinder8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.stubbing.Answer[] answerArray6 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList7 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList7, answerArray6);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(answerArray6);
        org.junit.Assert.assertArrayEquals(answerArray6, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl2 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler3 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl2);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer4 = annotatedElementMockHandler3.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler3.matchersBinder;
        org.mockito.internal.stubbing.InvocationContainer invocationContainer6 = annotatedElementMockHandler3.getInvocationContainer();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler8 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl7);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer9 = annotatedElementMockHandler8.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder10 = annotatedElementMockHandler8.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler12 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl11);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer13 = annotatedElementMockHandler12.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = annotatedElementMockHandler12.invocationContainerImpl;
        annotatedElementMockHandler8.invocationContainerImpl = invocationContainerImpl14;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl16 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler17 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl16);
        org.mockito.internal.progress.MockingProgress mockingProgress18 = annotatedElementMockHandler17.mockingProgress;
        org.mockito.internal.invocation.MatchersBinder matchersBinder19 = annotatedElementMockHandler17.matchersBinder;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1L, annotatedElementMockHandler3, invocationContainerImpl14, matchersBinder19 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder21 = mockitoCore0.inOrder(objArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer4);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(invocationContainer6);
        org.junit.Assert.assertNotNull(invocationContainer9);
        org.junit.Assert.assertNotNull(matchersBinder10);
        org.junit.Assert.assertNotNull(invocationContainer13);
        org.junit.Assert.assertNotNull(invocationContainerImpl14);
        org.junit.Assert.assertNotNull(mockingProgress18);
        org.junit.Assert.assertNotNull(matchersBinder19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl5 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl5);
        org.mockito.stubbing.Answer[] answerArray7 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList8 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList8, answerArray7);
        annotatedElementMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList8);
        org.mockito.internal.invocation.MatchersBinder matchersBinder11 = annotatedElementMockHandler6.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl12 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler13 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl12);
        org.mockito.stubbing.Answer[] answerArray14 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList15 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList15, answerArray14);
        annotatedElementMockHandler13.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        annotatedElementMockHandler6.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList15);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer20 = annotatedElementMockHandler4.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl21 = annotatedElementMockHandler4.invocationContainerImpl;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(answerArray7);
        org.junit.Assert.assertArrayEquals(answerArray7, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(matchersBinder11);
        org.junit.Assert.assertNotNull(answerArray14);
        org.junit.Assert.assertArrayEquals(answerArray14, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(invocationContainer20);
        org.junit.Assert.assertNotNull(invocationContainerImpl21);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl3 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl3);
        org.mockito.stubbing.Answer[] answerArray5 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList6 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList6, answerArray5);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList6);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl9 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler10 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl9);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer11 = annotatedElementMockHandler10.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder12 = annotatedElementMockHandler10.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler13 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler10);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl14 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler15 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl14);
        org.mockito.stubbing.Answer[] answerArray16 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList17 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList17, answerArray16);
        annotatedElementMockHandler15.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList17);
        org.mockito.internal.invocation.MatchersBinder matchersBinder20 = annotatedElementMockHandler15.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl21 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler22 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl21);
        org.mockito.stubbing.Answer[] answerArray23 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList24 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList24, answerArray23);
        annotatedElementMockHandler22.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList24);
        annotatedElementMockHandler15.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList24);
        annotatedElementMockHandler13.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList24);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList24);
        org.mockito.stubbing.Answer[] answerArray30 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList31 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList31, answerArray30);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList31);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl34 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler35 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl34);
        org.mockito.stubbing.Answer[] answerArray36 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList37 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList37, answerArray36);
        annotatedElementMockHandler35.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList37);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl40 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler41 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl40);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer42 = annotatedElementMockHandler41.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder43 = annotatedElementMockHandler41.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler44 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler41);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl45 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler46 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl45);
        org.mockito.stubbing.Answer[] answerArray47 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList48 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList48, answerArray47);
        annotatedElementMockHandler46.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList48);
        org.mockito.internal.invocation.MatchersBinder matchersBinder51 = annotatedElementMockHandler46.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl52 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler53 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl52);
        org.mockito.stubbing.Answer[] answerArray54 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList55 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList55, answerArray54);
        annotatedElementMockHandler53.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList55);
        annotatedElementMockHandler46.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList55);
        annotatedElementMockHandler44.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList55);
        annotatedElementMockHandler35.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList55);
        org.mockito.stubbing.Answer[] answerArray61 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList62 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList62, answerArray61);
        annotatedElementMockHandler35.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList62);
        annotatedElementMockHandler4.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList62);
        java.lang.Object[] objArray67 = new java.lang.Object[] { annotatedElementMockHandler4, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.InOrder inOrder68 = mockitoCore0.inOrder(objArray67);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument(s) passed is not a mock!?Pass mocks that require verification in order.?For example:?    InOrder inOrder = inOrder(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(answerArray5);
        org.junit.Assert.assertArrayEquals(answerArray5, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(invocationContainer11);
        org.junit.Assert.assertNotNull(matchersBinder12);
        org.junit.Assert.assertNotNull(answerArray16);
        org.junit.Assert.assertArrayEquals(answerArray16, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(matchersBinder20);
        org.junit.Assert.assertNotNull(answerArray23);
        org.junit.Assert.assertArrayEquals(answerArray23, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(answerArray30);
        org.junit.Assert.assertArrayEquals(answerArray30, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(answerArray36);
        org.junit.Assert.assertArrayEquals(answerArray36, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(invocationContainer42);
        org.junit.Assert.assertNotNull(matchersBinder43);
        org.junit.Assert.assertNotNull(answerArray47);
        org.junit.Assert.assertArrayEquals(answerArray47, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(matchersBinder51);
        org.junit.Assert.assertNotNull(answerArray54);
        org.junit.Assert.assertArrayEquals(answerArray54, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(answerArray61);
        org.junit.Assert.assertArrayEquals(answerArray61, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray67);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.stubbing.Answer[] answerArray2 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList3 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList3, answerArray2);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList3);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl6 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler7 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl6);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer8 = annotatedElementMockHandler7.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder9 = annotatedElementMockHandler7.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler10 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler7);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl11 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler12 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl11);
        org.mockito.stubbing.Answer[] answerArray13 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList14 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList14, answerArray13);
        annotatedElementMockHandler12.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList14);
        org.mockito.internal.invocation.MatchersBinder matchersBinder17 = annotatedElementMockHandler12.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl18 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler19 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl18);
        org.mockito.stubbing.Answer[] answerArray20 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList21 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList21, answerArray20);
        annotatedElementMockHandler19.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList21);
        annotatedElementMockHandler12.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList21);
        annotatedElementMockHandler10.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList21);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList21);
        org.mockito.stubbing.Answer[] answerArray27 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList28 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList28, answerArray27);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList28);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl31 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler32 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl31);
        org.mockito.stubbing.Answer[] answerArray33 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList34 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList34, answerArray33);
        annotatedElementMockHandler32.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList34);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl37 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler38 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl37);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer39 = annotatedElementMockHandler38.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder40 = annotatedElementMockHandler38.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler41 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler38);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl42 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler43 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl42);
        org.mockito.stubbing.Answer[] answerArray44 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList45 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList45, answerArray44);
        annotatedElementMockHandler43.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList45);
        org.mockito.internal.invocation.MatchersBinder matchersBinder48 = annotatedElementMockHandler43.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl49 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler50 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl49);
        org.mockito.stubbing.Answer[] answerArray51 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList52 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList52, answerArray51);
        annotatedElementMockHandler50.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList52);
        annotatedElementMockHandler43.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList52);
        annotatedElementMockHandler41.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList52);
        annotatedElementMockHandler32.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList52);
        org.mockito.stubbing.Answer[] answerArray58 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList59 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList59, answerArray58);
        annotatedElementMockHandler32.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList59);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList59);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer63 = annotatedElementMockHandler1.getInvocationContainer();
        org.junit.Assert.assertNotNull(answerArray2);
        org.junit.Assert.assertArrayEquals(answerArray2, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(invocationContainer8);
        org.junit.Assert.assertNotNull(matchersBinder9);
        org.junit.Assert.assertNotNull(answerArray13);
        org.junit.Assert.assertArrayEquals(answerArray13, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(matchersBinder17);
        org.junit.Assert.assertNotNull(answerArray20);
        org.junit.Assert.assertArrayEquals(answerArray20, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(answerArray27);
        org.junit.Assert.assertArrayEquals(answerArray27, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(answerArray33);
        org.junit.Assert.assertArrayEquals(answerArray33, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(invocationContainer39);
        org.junit.Assert.assertNotNull(matchersBinder40);
        org.junit.Assert.assertNotNull(answerArray44);
        org.junit.Assert.assertArrayEquals(answerArray44, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(matchersBinder48);
        org.junit.Assert.assertNotNull(answerArray51);
        org.junit.Assert.assertArrayEquals(answerArray51, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(answerArray58);
        org.junit.Assert.assertArrayEquals(answerArray58, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(invocationContainer63);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.Invocation invocation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = annotatedElementMockHandler6.handle(invocation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl1 = null;
        org.mockito.verification.VerificationMode verificationMode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl3 = mockitoCore0.verify(invocationContainerImpl1, verificationMode2);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NullInsteadOfMockException; message: ?Argument passed to verify() is null!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();?Also, if you use @Mock annotation don't miss initMocks()");
        } catch (org.mockito.exceptions.misusing.NullInsteadOfMockException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler4 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder5 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler6 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler1);
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = annotatedElementMockHandler6.matchersBinder;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(matchersBinder5);
        org.junit.Assert.assertNotNull(matchersBinder7);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl3 = annotatedElementMockHandler1.invocationContainerImpl;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl4 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler5 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl4);
        org.mockito.stubbing.Answer[] answerArray6 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList7 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList7, answerArray6);
        annotatedElementMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList7);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl10 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler11 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl10);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer12 = annotatedElementMockHandler11.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder13 = annotatedElementMockHandler11.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler14 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler11);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl15 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler16 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl15);
        org.mockito.stubbing.Answer[] answerArray17 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList18 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList18, answerArray17);
        annotatedElementMockHandler16.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList18);
        org.mockito.internal.invocation.MatchersBinder matchersBinder21 = annotatedElementMockHandler16.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler23 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl22);
        org.mockito.stubbing.Answer[] answerArray24 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList25 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList25, answerArray24);
        annotatedElementMockHandler23.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        annotatedElementMockHandler16.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        annotatedElementMockHandler14.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        annotatedElementMockHandler5.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList25);
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = annotatedElementMockHandler5.invocationContainerImpl;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl32 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler33 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl32);
        org.mockito.internal.progress.MockingProgress mockingProgress34 = annotatedElementMockHandler33.mockingProgress;
        annotatedElementMockHandler5.mockingProgress = mockingProgress34;
        annotatedElementMockHandler1.mockingProgress = mockingProgress34;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(invocationContainerImpl3);
        org.junit.Assert.assertNotNull(answerArray6);
        org.junit.Assert.assertArrayEquals(answerArray6, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(invocationContainer12);
        org.junit.Assert.assertNotNull(matchersBinder13);
        org.junit.Assert.assertNotNull(answerArray17);
        org.junit.Assert.assertArrayEquals(answerArray17, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(matchersBinder21);
        org.junit.Assert.assertNotNull(answerArray24);
        org.junit.Assert.assertArrayEquals(answerArray24, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(invocationContainerImpl31);
        org.junit.Assert.assertNotNull(mockingProgress34);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        org.mockito.internal.invocation.MatchersBinder[] matchersBinderArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.reset(matchersBinderArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl1 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler2 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl1);
        org.mockito.stubbing.Answer[] answerArray3 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList4 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList4, answerArray3);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList4);
        org.mockito.internal.invocation.MatchersBinder matchersBinder7 = annotatedElementMockHandler2.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler9 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl8);
        org.mockito.stubbing.Answer[] answerArray10 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList11 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList11, answerArray10);
        annotatedElementMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList11);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl14 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler15 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl14);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer16 = annotatedElementMockHandler15.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder17 = annotatedElementMockHandler15.matchersBinder;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler18 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>((org.mockito.internal.MockHandlerInterface<java.lang.reflect.AnnotatedElement>) annotatedElementMockHandler15);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl19 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler20 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl19);
        org.mockito.stubbing.Answer[] answerArray21 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList22 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList22, answerArray21);
        annotatedElementMockHandler20.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList22);
        org.mockito.internal.invocation.MatchersBinder matchersBinder25 = annotatedElementMockHandler20.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl26 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler27 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl26);
        org.mockito.stubbing.Answer[] answerArray28 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList29 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList29, answerArray28);
        annotatedElementMockHandler27.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList29);
        annotatedElementMockHandler20.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList29);
        annotatedElementMockHandler18.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList29);
        annotatedElementMockHandler9.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList29);
        annotatedElementMockHandler2.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList29);
        org.mockito.verification.VerificationMode verificationMode36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<org.mockito.stubbing.Answer> answerList37 = mockitoCore0.verify((java.util.AbstractList<org.mockito.stubbing.Answer>) answerList29, verificationMode36);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.NotAMockException; message: ?Argument passed to verify() is not a mock!?Examples of correct verifications:?    verify(mock).someMethod();?    verify(mock, times(10)).someMethod();?    verify(mock, atLeastOnce()).someMethod();");
        } catch (org.mockito.exceptions.misusing.NotAMockException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(answerArray3);
        org.junit.Assert.assertArrayEquals(answerArray3, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(matchersBinder7);
        org.junit.Assert.assertNotNull(answerArray10);
        org.junit.Assert.assertArrayEquals(answerArray10, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(invocationContainer16);
        org.junit.Assert.assertNotNull(matchersBinder17);
        org.junit.Assert.assertNotNull(answerArray21);
        org.junit.Assert.assertArrayEquals(answerArray21, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(matchersBinder25);
        org.junit.Assert.assertNotNull(answerArray28);
        org.junit.Assert.assertArrayEquals(answerArray28, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.stubbing.Answer[] answerArray2 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList3 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList3, answerArray2);
        annotatedElementMockHandler1.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList3);
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl7 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl8 = annotatedElementMockHandler1.getMockSettings();
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl9 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler10 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl9);
        org.mockito.stubbing.Answer[] answerArray11 = new org.mockito.stubbing.Answer[] {};
        java.util.ArrayList<org.mockito.stubbing.Answer> answerList12 = new java.util.ArrayList<org.mockito.stubbing.Answer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.mockito.stubbing.Answer>) answerList12, answerArray11);
        annotatedElementMockHandler10.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) answerList12);
        org.mockito.internal.invocation.MatchersBinder matchersBinder15 = annotatedElementMockHandler10.matchersBinder;
        java.lang.Class<?> wildcardClass16 = matchersBinder15.getClass();
        org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement> annotatedElementVoidMethodStubbable17 = annotatedElementMockHandler1.voidMethodStubbable((java.lang.reflect.AnnotatedElement) wildcardClass16);
        org.junit.Assert.assertNotNull(answerArray2);
        org.junit.Assert.assertArrayEquals(answerArray2, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(matchersBinder6);
        org.junit.Assert.assertNull(mockSettingsImpl7);
        org.junit.Assert.assertNull(mockSettingsImpl8);
        org.junit.Assert.assertNotNull(answerArray11);
        org.junit.Assert.assertArrayEquals(answerArray11, new org.mockito.stubbing.Answer[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(matchersBinder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(annotatedElementVoidMethodStubbable17);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.stubbing.DeprecatedOngoingStubbing<java.lang.Comparable<java.lang.String>> strComparableDeprecatedOngoingStubbing4 = mockitoCore0.stub((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.misusing.UnfinishedStubbingException; message: ?Unfinished stubbing detected here:?-> at sun.reflect.GeneratedMethodAccessor5.invoke(Unknown Source)??E.g. thenReturn() may be missing.?Examples of correct stubbing:?    when(mock.isOk()).thenReturn(true);?    when(mock.isOk()).thenThrow(exception);?    doThrow(exception).when(mock).someVoidMethod();?Hints:? 1. missing thenReturn()? 2. although stubbed methods may return mocks, you cannot inline mock creation (mock()) call inside a thenReturn method (see issue 53)?");
        } catch (org.mockito.exceptions.misusing.UnfinishedStubbingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
        try {
            mockitoCore0.verifyNoMoreInteractions(objArray3);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?Method requires argument(s)!?Pass mocks that should be verified, e.g:?    verifyNoMoreInteractions(mockOne, mockTwo);?    verifyZeroInteractions(mockOne, mockTwo);");
        } catch (org.mockito.exceptions.base.MockitoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.Invocation invocation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = annotatedElementMockHandler1.handle(invocation3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(invocationContainer2);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.stubbing.Answer answer1 = null;
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer(answer1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.invocation.Invocation invocation3 = mockitoCore0.getLastInvocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stubber2);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl0 = null;
        org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement> annotatedElementMockHandler1 = new org.mockito.internal.MockHandler<java.lang.reflect.AnnotatedElement>(mockSettingsImpl0);
        org.mockito.internal.stubbing.InvocationContainer invocationContainer2 = annotatedElementMockHandler1.getInvocationContainer();
        org.mockito.internal.invocation.MatchersBinder matchersBinder3 = annotatedElementMockHandler1.matchersBinder;
        org.mockito.internal.progress.MockingProgress mockingProgress4 = annotatedElementMockHandler1.mockingProgress;
        org.mockito.internal.progress.MockingProgress mockingProgress5 = annotatedElementMockHandler1.mockingProgress;
        org.mockito.internal.invocation.MatchersBinder matchersBinder6 = annotatedElementMockHandler1.matchersBinder;
        org.junit.Assert.assertNotNull(invocationContainer2);
        org.junit.Assert.assertNotNull(matchersBinder3);
        org.junit.Assert.assertNotNull(mockingProgress4);
        org.junit.Assert.assertNotNull(mockingProgress5);
        org.junit.Assert.assertNotNull(matchersBinder6);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.mockito.internal.MockHandlerInterface<org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement>> annotatedElementVoidMethodStubbableMockHandlerInterface0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.MockHandler<org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement>> annotatedElementVoidMethodStubbableMockHandler1 = new org.mockito.internal.MockHandler<org.mockito.stubbing.VoidMethodStubbable<java.lang.reflect.AnnotatedElement>>(annotatedElementVoidMethodStubbableMockHandlerInterface0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

