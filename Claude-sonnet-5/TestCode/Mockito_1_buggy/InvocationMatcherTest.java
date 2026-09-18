package org.mockito.internal.invocation;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvocationMatcherTest {

    private Method noArgMethod;
    private Method oneArgStringMethod;
    private Method oneArgIntegerMethod;
    private Method twoArgMethod;
    private Method varargsMethod;

    private Object mock1 = new Object();
    private Object mock2 = new Object();

    @Before
    public void setUp() throws Exception {
        noArgMethod = SampleMethods.class.getMethod("noArgMethod");
        oneArgStringMethod = SampleMethods.class.getMethod("oneArgMethod", String.class);
        oneArgIntegerMethod = SampleMethods.class.getMethod("oneArgMethod", Integer.class);
        twoArgMethod = SampleMethods.class.getMethod("twoArgMethod", String.class, Integer.class);
        varargsMethod = SampleMethods.class.getMethod("varargsMethod", String[].class);
    }

    public static class SampleMethods {
        public void noArgMethod() {}
        public void oneArgMethod(String s) {}
        public void oneArgMethod(Integer i) {}
        public void twoArgMethod(String s, Integer i) {}
        public void varargsMethod(String... args) {}
    }

    private Invocation mockInvocation(Object mock, Method method, Object[] args, boolean verified) {
        Invocation invocation = mock(Invocation.class);
        when(invocation.getMock()).thenReturn(mock);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getArguments()).thenReturn(args);
        when(invocation.getRawArguments()).thenReturn(args);
        when(invocation.isVerified()).thenReturn(verified);
        for (int i = 0; i < args.length; i++) {
            when(invocation.getArgumentAt(i, Object.class)).thenReturn(args[i]);
        }
        return invocation;
    }

    // ---- Constructor tests ----

    @Test
    public void shouldCreateMatchersFromArgumentsWhenMatchersListEmpty() {
        Invocation invocation = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());
        assertEquals(1, im.getMatchers().size());
    }

    @Test
    public void shouldUseGivenMatchersWhenNotEmpty() {
        Invocation invocation = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Matcher m = mock(Matcher.class);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(m);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        assertEquals(1, im.getMatchers().size());
        assertSame(m, im.getMatchers().get(0));
    }

    @Test
    public void shouldUseEmptyMatchersConstructorDefault() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertEquals(0, im.getMatchers().size());
    }

    @Test
    public void shouldCreateMatchersFromMultipleArgumentsWhenMatchersListEmpty() {
        Invocation invocation = mockInvocation(mock1, twoArgMethod, new Object[]{"hello", 1}, false);
        InvocationMatcher im = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());
        assertEquals(2, im.getMatchers().size());
    }

    // ---- getMethod, getInvocation, getMatchers ----

    @Test
    public void shouldReturnMethodFromInvocation() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertEquals(noArgMethod, im.getMethod());
    }

    @Test
    public void shouldReturnInvocation() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertSame(invocation, im.getInvocation());
    }

    @Test
    public void shouldReturnMatchersList() {
        Invocation invocation = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Matcher m = mock(Matcher.class);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(m);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        assertNotNull(im.getMatchers());
        assertEquals(1, im.getMatchers().size());
    }

    // ---- toString ----

    @Test
    public void shouldReturnNonNullToString() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        when(invocation.getLocation()).thenReturn(mock(Location.class));
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertNotNull(im.toString());
    }

    // ---- matches ----

    @Test
    public void shouldMatchWhenSameMockSameMethodSameArguments() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertTrue(im.matches(invocation2));
    }

    @Test
    public void shouldNotMatchWhenDifferentMock() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Invocation invocation2 = mockInvocation(mock2, oneArgStringMethod, new Object[]{"hello"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.matches(invocation2));
    }

    @Test
    public void shouldNotMatchWhenDifferentMethod() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Invocation invocation2 = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.matches(invocation2));
    }

    @Test
    public void shouldNotMatchWhenDifferentArguments() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"world"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.matches(invocation2));
    }

    // ---- hasSameMethod ----

    @Test
    public void shouldHaveSameMethodWhenNameAndParamsMatch() {
        Invocation invocation1 = mockInvocation(mock1, twoArgMethod, new Object[]{"a", 1}, false);
        Invocation invocation2 = mockInvocation(mock1, twoArgMethod, new Object[]{"b", 2}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertTrue(im.hasSameMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSameMethodWhenDifferentName() {
        Invocation invocation1 = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSameMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSameMethodWhenDifferentParamCount() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        Invocation invocation2 = mockInvocation(mock1, twoArgMethod, new Object[]{"a", 1}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSameMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSameMethodWhenDifferentParamTypes() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgIntegerMethod, new Object[]{1}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSameMethod(invocation2));
    }

    // ---- hasSimilarMethod ----

    @Test
    public void shouldHaveSimilarMethodWhenSameNameSameMockUnverifiedAndSameMethod() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"b"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertTrue(im.hasSimilarMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSimilarMethodWhenDifferentMethodName() {
        Invocation invocation1 = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSimilarMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSimilarMethodWhenCandidateIsVerified() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, true);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSimilarMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSimilarMethodWhenDifferentMock() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        Invocation invocation2 = mockInvocation(mock2, oneArgStringMethod, new Object[]{"a"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSimilarMethod(invocation2));
    }

    @Test
    public void shouldNotHaveSimilarMethodWhenOverloadedWithSameArgs() {
        Invocation invocation1 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgIntegerMethod, new Object[]{"hello"}, false);
        InvocationMatcher im = new InvocationMatcher(invocation1);
        assertFalse(im.hasSimilarMethod(invocation2));
    }

    // ---- getLocation ----

    @Test
    public void shouldReturnLocationFromInvocation() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        Location location = mock(Location.class);
        when(invocation.getLocation()).thenReturn(location);
        InvocationMatcher im = new InvocationMatcher(invocation);
        assertSame(location, im.getLocation());
    }

    // ---- captureArgumentsFrom ----

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowWhenVarargsMethod() {
        Invocation invocation = mockInvocation(mock1, varargsMethod, new Object[]{new String[]{"a", "b"}}, false);
        InvocationMatcher im = new InvocationMatcher(invocation);
        im.captureArgumentsFrom(invocation);
    }

    @Test
    public void shouldCaptureArgumentsWhenMatcherImplementsCapturesArguments() {
        Invocation invocation = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);
        assertEquals("hello", capturingMatcher.captured);
    }

    @Test
    public void shouldNotCaptureWhenMatcherDoesNotImplementCapturesArguments() {
        Invocation invocation = mockInvocation(mock1, oneArgStringMethod, new Object[]{"hello"}, false);
        Matcher plainMatcher = mock(Matcher.class);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(plainMatcher);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);
        assertEquals(1, im.getMatchers().size());
    }

    @Test
    public void shouldHandleEmptyMatchersListInCaptureArguments() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        InvocationMatcher im = new InvocationMatcher(invocation);
        im.captureArgumentsFrom(invocation);
        assertEquals(0, im.getMatchers().size());
    }

    @Test
    public void shouldCaptureMultipleArgumentsWhenMultipleMatchers() {
        Invocation invocation = mockInvocation(mock1, twoArgMethod, new Object[]{"hello", 42}, false);
        CapturingMatcher capturingMatcher1 = new CapturingMatcher();
        CapturingMatcher capturingMatcher2 = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2);
        InvocationMatcher im = new InvocationMatcher(invocation, matchers);
        im.captureArgumentsFrom(invocation);
        assertEquals("hello", capturingMatcher1.captured);
        assertEquals(42, capturingMatcher2.captured);
    }

    // ---- createFrom ----

    @Test
    public void shouldCreateEmptyListFromEmptyInvocations() {
        List<Invocation> invocations = new LinkedList<Invocation>();
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldCreateListWithOneMatcherFromOneInvocation() {
        Invocation invocation = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        List<Invocation> invocations = new LinkedList<Invocation>();
        invocations.add(invocation);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertEquals(1, result.size());
        assertSame(invocation, result.get(0).getInvocation());
    }

    @Test
    public void shouldCreateListWithMultipleMatchersFromMultipleInvocations() {
        Invocation invocation1 = mockInvocation(mock1, noArgMethod, new Object[]{}, false);
        Invocation invocation2 = mockInvocation(mock1, oneArgStringMethod, new Object[]{"a"}, false);
        List<Invocation> invocations = new LinkedList<Invocation>();
        invocations.add(invocation1);
        invocations.add(invocation2);
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);
        assertEquals(2, result.size());
        assertSame(invocation1, result.get(0).getInvocation());
        assertSame(invocation2, result.get(1).getInvocation());
    }

    // helper matcher class for capture tests
    static class CapturingMatcher extends BaseMatcher implements CapturesArguments {
        Object captured;

        public boolean matches(Object item) {
            return true;
        }

        public void describeTo(Description description) {
        }

        public void captureFrom(Object argument) {
            this.captured = argument;
        }
    }
}