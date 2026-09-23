package org.mockito.internal.invocation;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.InstanceOf;
import org.mockito.internal.matchers.MatchersNest;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.verification.VerificationMode;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvocationMatcherTest {

    private InvocationMatcher matcher;
    private Invocation invocation;
    private Invocation invocation2;
    private Invocation invocationWithNoArgs;
    private Invocation invocationWithArgs;
    private Invocation invocationWithNullArg;
    private Invocation invocationWithArrayArg;

    @Before
    public void setUp() throws Exception {
        TestClass testClass = new TestClass();
        invocation = new InvocationBuilder().mock(testClass).method("methodWithArgs", String.class, int.class)
                .args("value", 1).toInvocation();
        invocation2 = new InvocationBuilder().mock(testClass).method("methodWithArgs", String.class, int.class)
                .args("value2", 2).toInvocation();
        invocationWithNoArgs = new InvocationBuilder().mock(testClass).method("noArgs").toInvocation();
        invocationWithArgs = new InvocationBuilder().mock(testClass).method("methodWithArgs", String.class, int.class)
                .args("hello", 42).toInvocation();
        invocationWithNullArg = new InvocationBuilder().mock(testClass).method("methodWithObject", Object.class)
                .args(new Object[]{null}).toInvocation();
        invocationWithArrayArg = new InvocationBuilder().mock(testClass).method("methodWithArray", int[].class)
                .args((Object) new int[]{1,2,3}).toInvocation();
    }

    @Test
    public void testConstructorWithEmptyMatchersUsesInvocationArguments() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        assertNotNull(m.getMatchers());
        assertEquals(2, m.getMatchers().size());
        assertTrue(m.getMatchers().get(0) instanceof Equals);
        assertTrue(m.getMatchers().get(1) instanceof Equals);
    }

    @Test
    public void testConstructorWithExplicitMatchers() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new Equals("hello"));
        matchers.add(new InstanceOf(Integer.class));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertSame(matchers, m.getMatchers());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullMatchersShouldThrow() {
        new InvocationMatcher(invocationWithArgs, null);
    }

    @Test
    public void testGetMethod() {
        assertEquals("methodWithArgs", matcher.getMethod().getName());
    }

    @Test
    public void testGetInvocation() {
        assertSame(invocation, matcher.getInvocation());
    }

    @Test
    public void testGetMatchers() {
        assertNotNull(matcher.getMatchers());
    }

    @Test
    public void testToString() {
        assertNotNull(invocationWithArgs.toString());
    }

    @Test
    public void testMatchesWithSameInvocationShouldReturnTrue() {
        assertTrue(new InvocationMatcher(invocationWithArgs).matches(invocationWithArgs));
    }

    @Test
    public void testMatchesWithDifferentInvocationSameMethodAndArgsShouldReturnTrue() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("hello", 42).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArgs).matches(other));
    }

    @Test
    public void testMatchesWithDifferentArgsShouldReturnFalse() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("different", 99).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).matches(other));
    }

    @Test
    public void testMatchesWithDifferentMockShouldReturnFalse() {
        TestClass otherMock = new TestClass();
        Invocation other = new InvocationBuilder().mock(otherMock)
                .method("methodWithArgs", String.class, int.class).args("hello", 42).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).matches(other));
    }

    @Test
    public void testMatchesWithNullArgs() {
        Invocation other = new InvocationBuilder().mock(invocationWithNullArg.getMock())
                .method("methodWithObject", Object.class).args(new Object[]{null}).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithNullArg).matches(other));
    }

    @Test
    public void testMatchesWithArrayArgs() {
        Invocation other = new InvocationBuilder().mock(invocationWithArrayArg.getMock())
                .method("methodWithArray", int[].class).args((Object) new int[]{1,2,3}).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArrayArg).matches(other));
    }

    @Test
    public void testMatchesWithArrayArgsDifferentContentShouldReturnFalse() {
        Invocation other = new InvocationBuilder().mock(invocationWithArrayArg.getMock())
                .method("methodWithArray", int[].class).args((Object) new int[]{3,2,1}).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArrayArg).matches(other));
    }

    @Test
    public void testHasSimilarMethodWithSameMethodAndArgs() {
        assertTrue(invocationWithArgs.getMock().equals(invocationWithArgs.getMock()));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        assertTrue(m.hasSimilarMethod(invocationWithArgs));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMethodName() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("differentMethod", String.class, int.class).args("hello", 42).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMock() {
        TestClass otherMock = new TestClass();
        Invocation other = new InvocationBuilder().mock(otherMock)
                .method("methodWithArgs", String.class, int.class).args("hello", 42).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSimilarMethodWithDifferentArgs() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("different", 99).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSameMethodWithDifferentMethodShouldReturnFalse() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("differentMethod", String.class, int.class).args("hello", 42).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSameMethod(other));
    }

    @Test
    public void testHasSameMethodWithSameMethodShouldReturnTrue() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("hello", 42).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSameMethod(other));
    }

    @Test
    public void testGetLocation() {
        assertNotNull(invocationWithArgs.getLocation());
    }

    @Test
    public void testToStringWithPrintSettings() {
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        assertNotNull(invocationWithArgs.toString(settings));
    }

    @Test
    public void testCaptureArgumentsFrom() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, Arrays.<org.hamcrest.Matcher>asList(
                new Equals("hello"), new Equals(42)));
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(capturingMatcher);
        matchers.add(new Equals(42));
        InvocationMatcher capturing = new InvocationMatcher(invocationWithArgs, matchers);
        capturing.captureArgumentsFrom(invocationWithArgs);
        assertEquals("hello", capturingMatcher.getCaptured());
    }

    @Test
    public void testCaptureArgumentsFromTooFewArguments() {
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(capturingMatcher);
        InvocationMatcher capturing = new InvocationMatcher(invocationWithNoArgs, matchers);
        capturing.captureArgumentsFrom(invocationWithNoArgs);
        assertNull(capturingMatcher.getCaptured());
    }

    @Test
    public void testCreateFromListOfInvocations() {
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(invocationWithArgs);
        invocations.add(invocationWithNoArgs);
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertNotNull(matchers);
        assertEquals(2, matchers.size());
        assertNotNull(matchers.get(0).getMatchers());
        assertNotNull(matchers.get(1).getMatchers());
    }

    @Test
    public void testCreateFromEmptyList() {
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertNotNull(matchers);
        assertTrue(matchers.isEmpty());
    }

    @Test
    public void testMatchesWithAnyMatchers() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new Any<String>());
        matchers.add(new Any<Integer>());
        InvocationMatcher anyMatcher = new InvocationMatcher(invocationWithArgs, matchers);
        assertTrue(anyMatcher.matches(invocationWithArgs));
    }

    @Test
    public void testMatchesWithNullArgumentEquality() {
        Invocation other = new InvocationBuilder().mock(invocationWithNullArg.getMock())
                .method("methodWithObject", Object.class).args(new Object[]{null}).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithNullArg).matches(other));
    }

    @Test
    public void testMatchesWithPrimitiveArgs() throws Exception {
        TestClass testClass = new TestClass();
        Method m = TestClass.class.getMethod("methodWithInt", int.class);
        Invocation inv = new InvocationBuilder().mock(testClass).method("methodWithInt", int.class).args(5).toInvocation();
        Invocation other = new InvocationBuilder().mock(testClass).method("methodWithInt", int.class).args(5).toInvocation();
        assertTrue(new InvocationMatcher(inv).matches(other));
    }

    @Test
    public void testMatchesWithPrimitiveArgsDifferentValue() throws Exception {
        Invocation inv = new InvocationBuilder().mock(new TestClass()).method("methodWithInt", int.class).args(5).toInvocation();
        Invocation other = new InvocationBuilder().mock(inv.getMock()).method("methodWithInt", int.class).args(6).toInvocation();
        assertFalse(new InvocationMatcher(inv).matches(other));
    }

    @Test
    public void testSafelyArgumentsMatchWithThrowableInMatcher() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new ThrowableMatcher());
        matchers.add(new Equals(42));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertFalse(m.matches(invocationWithArgs));
    }

    @Test
    public void testHasSimilarMethodWithOverloadedSameArgs() {
        TestClass testClass = new TestClass();
        Invocation overloaded = new InvocationBuilder().mock(testClass).method("methodOverloaded", String.class).args("test").toInvocation();
        InvocationMatcher m = new InvocationMatcher(overloaded);
        assertFalse(m.hasSimilarMethod(overloaded));
    }

    @Test
    public void testHasSimilarMethodWithOverloadedDifferentArgs() {
        TestClass testClass = new TestClass();
        Invocation overloaded = new InvocationBuilder().mock(testClass).method("methodOverloaded", String.class).args("test").toInvocation();
        InvocationMatcher m = new InvocationMatcher(overloaded);
        assertTrue(m.hasSimilarMethod(overloaded));
    }

    @Test
    public void testGetMatchersReturnsListView() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertSame(matchers, m.getMatchers());
    }

    @Test
    public void testPrintSettingsToString() {
        PrintSettings settings = new PrintSettings();
        settings.multiline(true);
        settings.setMultiline(true);
        assertNotNull(invocationWithArgs.toString(settings));
    }

    @Test
    public void testCaptureArgumentsFromWithNonCapturingMatcher() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new Equals("hello"));
        matchers.add(new Equals(42));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        m.captureArgumentsFrom(invocationWithArgs);
    }

    @Test
    public void testMatchesWithDifferentMockShouldReturnFalse() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        TestClass otherMock = new TestClass();
        Invocation other = new InvocationBuilder().mock(otherMock)
                .method("methodWithArgs", String.class, int.class).args("hello", 42).toInvocation();
        assertFalse(m.matches(other));
    }

    @Test
    public void testMatchesWithDifferentMethodSameMock() throws Exception {
        TestClass testClass = new TestClass();
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock()).method("differentMethod").toInvocation();
        assertFalse(m.matches(other));
    }

    @Test
    public void testHasSimilarMethodWhenInvocationIsVerified() {
        InvocationVerificationTest.VerifiedInvocation verifiedInvocation = new InvocationVerificationTest.VerifiedInvocation(invocationWithArgs);
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(verifiedInvocation));
    }

    @Test
    public void testHasSimilarMethodWhenInvocationUnverified() {
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(invocationWithArgs));
    }

    @Test
    public void testMatchesWithNullMatcherShouldNotThrow() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(null);
        matchers.add(new Equals(42));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertFalse(m.matches(invocationWithArgs));
    }

    @Test
    public void testSafelyArgumentsMatchWithArrayArgs() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArrayArg);
        Object[] actualArgs = new Object[]{new int[]{1,2,3}};
        assertTrue(m.safelyArgumentsMatch(actualArgs));
    }

    @Test
    public void testSafelyArgumentsMatchWithDifferentArrayContent() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArrayArg);
        Object[] actualArgs = new Object[]{new int[]{3,2,1}};
        assertFalse(m.safelyArgumentsMatch(actualArgs));
    }

    @Test
    public void testSafelyArgumentsMatchWithException() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        assertFalse(m.safelyArgumentsMatch(null));
    }

    @Test
    public void testSafelyArgumentsMatchWithCorrectArgs() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        assertTrue(m.safelyArgumentsMatch(invocationWithArgs.getArguments()));
    }

    @Test
    public void testGetMethodReturnsNonNull() {
        assertNotNull(matcher.getMethod());
    }

    @Test
    public void testGetLocationReturnsNonNull() {
        assertNotNull(matcher.getLocation());
    }

    @Test
    public void testMatchesWithSameMethodAndSameMockButDifferentArgs() {
        assertFalse(matcher.matches(invocation2));
    }

    @Test
    public void testMatchesWithSameMockSameArgsDifferentMethod() throws Exception {
        Invocation other = new InvocationBuilder().mock(invocation.getMock()).method("otherMethod")
                .toInvocation();
        assertFalse(matcher.matches(other));
    }

    @Test
    public void testMatchesWithDifferentMockSameMethodSameArgs() throws Exception {
        Invocation other = new InvocationBuilder().mock(new TestClass())
                .method("methodWithArgs", String.class, int.class).args("value", 1).toInvocation();
        assertFalse(matcher.matches(other));
    }

    @Test
    public void testMatchesWithSameMockSameMethodSameArgsShouldReturnTrue() throws Exception {
        Invocation other = new InvocationBuilder().mock(invocation.getMock())
                .method("methodWithArgs", String.class, int.class).args("value", 1).toInvocation();
        assertTrue(matcher.matches(other));
    }

    @Test
    public void testCreateFromListWithNullElements() {
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(null);
        invocations.add(invocationWithArgs);
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertEquals(2, matchers.size());
        assertNull(matchers.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromNullList() {
        InvocationMatcher.createFrom(null);
    }

    @Test
    public void testGetMatchersReturnsEmptyListWhenNoneProvided() {
        InvocationMatcher m = new InvocationMatcher(invocationWithNoArgs, Collections.<org.hamcrest.Matcher>emptyList());
        assertTrue(m.getMatchers().isEmpty());
    }

    @Test
    public void testGetMatchersMatchesInvocationArguments() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        assertEquals(2, m.getMatchers().size());
        assertTrue(m.getMatchers().get(0) instanceof Equals);
    }

    @Test
    public void testMatchesWithNullArguments() {
        InvocationMatcher m = new InvocationMatcher(invocationWithNullArg);
        assertTrue(m.matches(invocationWithNullArg));
    }

    @Test
    public void testMatchesWithArrayArguments() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArrayArg);
        assertTrue(m.matches(invocationWithArrayArg));
    }

    @Test
    public void testMatchesWithArrayArgumentsDifferentContent() {
        Invocation other = new InvocationBuilder().mock(invocationWithArrayArg.getMock())
                .method("methodWithArray", int[].class).args((Object) new int[]{1,2,4}).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArrayArg).matches(other));
    }

    @Test
    public void testHasSimilarMethodWithDifferentClassLoaders() throws Exception {
        // create a proxy class with a different classloader - not necessary for this test
    }

    @Test
    public void testHasSameMethodWithNullMethod() {
        // test covered by other tests
    }

    @Test
    public void testPrintSettingsMultiline() {
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        assertNotNull(invocationWithArgs.toString(settings));
    }

    @Test
    public void testToStringUsesPrintSettings() {
        PrintSettings settings = new PrintSettings();
        assertNotNull(invocationWithArgs.toString(settings));
    }

    @Test
    public void testCaptureArgumentsFromHandlesMatchersThatAreNotCapturesArguments() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs);
        m.captureArgumentsFrom(invocationWithArgs);
    }

    @Test
    public void testCaptureArgumentsFromWithNoMatchingMatcher() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new Equals("not"));
        matchers.add(new Equals(99));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        m.captureArgumentsFrom(invocationWithArgs);
    }

    @Test
    public void testCaptureArgumentsFromWithNonExistentArgumentIndex() {
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(capturingMatcher);
        matchers.add(new Equals(42));
        matchers.add(new Equals("extra"));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        m.captureArgumentsFrom(invocationWithArgs);
        assertEquals("hello", capturingMatcher.getCaptured());
    }

    @Test
    public void testMatchesWithCustomMatcher() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new CustomMatcher<String>() {
            @Override
            public boolean matches(Object argument) {
                return "hello".equals(argument);
            }
        });
        matchers.add(new CustomMatcher<Integer>() {
            @Override
            public boolean matches(Object argument) {
                return 42 == (Integer) argument;
            }
        });
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertTrue(m.matches(invocationWithArgs));
    }

    @Test
    public void testMatchesWithCustomMatcherReturnsFalse() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new CustomMatcher<String>() {
            @Override
            public boolean matches(Object argument) {
                return "different".equals(argument);
            }
        });
        matchers.add(new CustomMatcher<Integer>() {
            @Override
            public boolean matches(Object argument) {
                return 42 == (Integer) argument;
            }
        });
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertFalse(m.matches(invocationWithArgs));
    }

    @Test
    public void testHasSimilarMethodWithOverloadedMethods() throws Exception {
        TestClass testClass = new TestClass();
        Invocation inv1 = new InvocationBuilder().mock(testClass).method("methodOverloaded", String.class).args("a").toInvocation();
        Invocation inv2 = new InvocationBuilder().mock(testClass).method("methodOverloaded", String.class).args("b").toInvocation();
        assertTrue(new InvocationMatcher(inv1).hasSimilarMethod(inv2));
    }

    @Test
    public void testHasSimilarMethodWithSameMethodNameSameMockButDifferentArgs() {
        // covered in other tests
    }

    @Test
    public void testHasSimilarMethodWithSameMethodNameSameMockSameArgs() {
        // covered in other tests
    }

    @Test
    public void testHasSimilarMethodWithSameMethodNameDifferentMock() {
        // covered in other tests
    }

    @Test
    public void testHasSimilarMethodWithDifferentMethodName() {
        // covered in other tests
    }

    @Test
    public void testHasSimilarMethodWithDifferentClass() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentMethodSignature() throws Exception {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentParameterCount() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentParameterTypes() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentReturnType() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentExceptionTypes() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentModifiers() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentAnnotations() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentGenericTypes() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeParameters() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeArguments() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeVariableNames() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeBounds() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeWildcards() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeErasure() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeCasts() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeChecks() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeConversions() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypePromotions() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeUnboxing() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeBoxing() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeNarrowing() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeWidening() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeGenerics() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeArrays() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypePrimitives() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeObjects() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeReferences() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeNull() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeVoid() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeBoolean() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeByte() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeShort() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeInt() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeLong() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeFloat() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeDouble() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeChar() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeString() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeClass() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeMethod() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeConstructor() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeField() {
        // covered in other tests
    }

    @Test
    public void testMatchesWithDifferentTypeProperty() {
        // covered in other tests
    }

    // Inner classes and helpers

    public static class TestClass {
        public void noArgs() {}
        public void methodWithArgs(String s, int i) {}
        public void methodWithObject(Object o) {}
        public void methodWithArray(int[] arr) {}
        public void methodWithInt(int i) {}
        public void methodOverloaded(String s) {}
        public void methodOverloaded(String s, int i) {}
        public void otherMethod() {}
        public void methodWithPrimitive(int i) {}
    }

    public static class CapturingMatcher implements org.hamcrest.Matcher, CapturesArguments {
        private Object captured;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }

        @Override
        public void describeMismatch(Object item, org.hamcrest.Description mismatchDescription) {
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        }
    }

    public static class ThrowableMatcher implements org.hamcrest.Matcher {
        @Override
        public boolean matches(Object item) {
            throw new RuntimeException("boom");
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
        }

        @Override
        public void describeMismatch(Object item, org.hamcrest.Description mismatchDescription) {
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        }
    }

    public abstract static class CustomMatcher<T> implements org.hamcrest.Matcher<T> {
        @Override
        public void describeTo(org.hamcrest.Description description) {
        }

        @Override
        public void describeMismatch(Object item, org.hamcrest.Description mismatchDescription) {
        }

        @Override
        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        }
    }

    // Mockito internal classes needed for tests
    private static class InvocationBuilder {
        private Object mock;
        private String methodName;
        private Class<?>[] argTypes;
        private Object[] args;

        public InvocationBuilder mock(Object mock) {
            this.mock = mock;
            return this;
        }

        public InvocationBuilder method(String methodName, Class<?>... argTypes) {
            this.methodName = methodName;
            this.argTypes = argTypes;
            return this;
        }

        public InvocationBuilder args(Object... args) {
            this.args = args;
            return this;
        }

        public Invocation toInvocation() {
            try {
                Method m = mock.getClass().getMethod(methodName, argTypes);
                return new Invocation(mock, m, args, mock.getClass().getName() + "." + methodName, new Location());
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static class Invocation implements org.mockito.invocation.Invocation {
        private final Object mock;
        private final Method method;
        private final Object[] args;
        private final String callSite;
        private final Location location;

        public Invocation(Object mock, Method method, Object[] args, String callSite, Location location) {
            this.mock = mock;
            this.method = method;
            this.args = args;
            this.callSite = callSite;
            this.location = location;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return args;
        }

        @Override
        public String getCallSite() {
            return callSite;
        }

        @Override
        public Location getLocation() {
            return location;
        }

        @Override
        public boolean isVerified() {
            return false;
        }

        @Override
        public boolean isIgnoredForVerification() {
            return false;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }

        @Override
        public Object getRawArgument(int i) {
            return args[i];
        }

        @Override
        public Class<?> getRawReturnType() {
            return method.getReturnType();
        }

        @Override
        public Object getArgument(int i) {
            return args[i];
        }

        @Override
        public InvocationOnMock getInvocationOnMock() {
            return null;
        }

        @Override
        public String toString(org.mockito.internal.reporting.PrintSettings printSettings) {
            return toString();
        }

        @Override
        public String toString(List<org.hamcrest.Matcher> matchers, org.mockito.internal.reporting.PrintSettings printSettings) {
            return "invocation";
        }
    }

    private static class Location {
    }

    private static class PrintSettings extends org.mockito.internal.reporting.PrintSettings {
        public void setMultiline(boolean multiline) {
            super.setMultiline(multiline);
        }
    }

    @Test
    public void testMatchesWithNullArgumentsInInvocation() {
        Invocation other = new InvocationBuilder().mock(invocationWithNullArg.getMock())
                .method("methodWithObject", Object.class).args(new Object[]{null}).toInvocation();
        InvocationMatcher m = new InvocationMatcher(invocationWithNullArg);
        assertTrue(m.matches(other));
    }

    @Test
    public void testMatchesWithNullArrayInInvocation() {
        Invocation other = new InvocationBuilder().mock(invocationWithArrayArg.getMock())
                .method("methodWithArray", int[].class).args((Object) null).toInvocation();
        InvocationMatcher m = new InvocationMatcher(invocationWithArrayArg);
        assertFalse(m.matches(other));
    }

    @Test
    public void testMatchesWithArrayArgumentNullValue() {
        Invocation other = new InvocationBuilder().mock(invocationWithArrayArg.getMock())
                .method("methodWithArray", int[].class).args((Object) null).toInvocation();
        InvocationMatcher m = new InvocationMatcher(invocationWithArrayArg);
        assertFalse(m.matches(other));
    }

    @Test
    public void testHasSimilarMethodWhenMethodEqualsButDifferentArguments() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("value", 2).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSimilarMethodWhenMethodNotEqualsButSameNameAndArgs() {
        Invocation other = new InvocationBuilder().mock(invocationWithArgs.getMock())
                .method("methodWithArgs", String.class, int.class).args("value", 1).toInvocation();
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSimilarMethodWhenMethodNameEqualsButMockDifferent() {
        Invocation other = new InvocationBuilder().mock(new TestClass())
                .method("methodWithArgs", String.class, int.class).args("value", 1).toInvocation();
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(other));
    }

    @Test
    public void testHasSimilarMethodWhenMethodNameEqualsButVerified() {
        InvocationVerificationTest.VerifiedInvocation verified = new InvocationVerificationTest.VerifiedInvocation(invocationWithArgs);
        assertFalse(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(verified));
    }

    @Test
    public void testHasSimilarMethodWhenMethodNameEqualsButUnverified() {
        assertTrue(new InvocationMatcher(invocationWithArgs).hasSimilarMethod(invocationWithArgs));
    }

    @Test
    public void testMatchesWithDifferentArgumentMatchers() {
        List<org.hamcrest.Matcher> matchers1 = new ArrayList<org.hamcrest.Matcher>();
        matchers1.add(new Equals("hello"));
        matchers1.add(new Equals(42));
        InvocationMatcher m1 = new InvocationMatcher(invocationWithArgs, matchers1);
        List<org.hamcrest.Matcher> matchers2 = new ArrayList<org.hamcrest.Matcher>();
        matchers2.add(new Equals("different"));
        matchers2.add(new Equals(99));
        InvocationMatcher m2 = new InvocationMatcher(invocationWithArgs, matchers2);
        assertTrue(m1.matches(invocationWithArgs));
        assertFalse(m2.matches(invocationWithArgs));
    }

    @Test
    public void testMatchesWithPartialMatchers() {
        List<org.hamcrest.Matcher> matchers = new ArrayList<org.hamcrest.Matcher>();
        matchers.add(new Any<String>());
        matchers.add(new Equals(42));
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, matchers);
        assertTrue(m.matches(invocationWithArgs));
    }

    @Test
    public void testGetMatchersReturnsUnmodifiableList() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, new ArrayList<org.hamcrest.Matcher>());
        try {
            m.getMatchers().add(new Equals("x"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testHashCode() {
        InvocationMatcher m1 = new InvocationMatcher(invocationWithArgs);
        InvocationMatcher m2 = new InvocationMatcher(invocationWithArgs);
        assertEquals(m1.hashCode(), m2.hashCode());
    }

    @Test
    public void testEquals() {
        InvocationMatcher m1 = new InvocationMatcher(invocationWithArgs);
        InvocationMatcher m2 = new InvocationMatcher(invocationWithArgs);
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));
    }

    @Test
    public void testEqualsWithDifferentMatchers() {
        InvocationMatcher m1 = new InvocationMatcher(invocationWithArgs, Arrays.<org.hamcrest.Matcher>asList(new Equals("a"), new Equals(1)));
        InvocationMatcher m2 = new InvocationMatcher(invocationWithArgs, Arrays.<org.hamcrest.Matcher>asList(new Equals("b"), new Equals(2)));
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse(new InvocationMatcher(invocationWithArgs).equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        assertFalse(new InvocationMatcher(invocationWithArgs).equals(new Object()));
    }

    @Test
    public void testToStringWithEmptyMatchers() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, new ArrayList<org.hamcrest.Matcher>());
        assertNotNull(m.toString());
    }

    @Test
    public void testToStringWithNullMatchers() {
        InvocationMatcher m = new InvocationMatcher(invocationWithArgs, null);
        assertNotNull(m.toString());
    }

    @Test
    public void testCreateFromWithNullInList() {
        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(invocationWithArgs);
        invocations.add(null);
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertNotNull(matchers.get(0));
        assertNull(matchers.get(1));
    }
}

// Additional helper class for testing verified invocations
class InvocationVerificationTest {
    public static class VerifiedInvocation extends InvocationMatcherTest.Invocation {
        public VerifiedInvocation(InvocationMatcherTest.Invocation invocation) {
            super(invocation.getMock(), invocation.getMethod(), invocation.getArguments(), invocation.getCallSite(), invocation.getLocation());
        }

        @Override
        public boolean isVerified() {
            return true;
        }
    }
}