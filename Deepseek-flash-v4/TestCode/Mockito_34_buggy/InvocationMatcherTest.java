package org.mockito.internal.invocation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.internal.matchers.EqualsMatcher;

import static org.junit.Assert.*;

public class InvocationMatcherTest {

    private InvocationMatcher matcher;
    private Invocation mockInvocation;
    private Invocation actualInvocation;
    private Invocation differentMethodInvocation;
    private Invocation differentMockInvocation;
    private Method method1;
    private Method method2;

    @Before
    public void setUp() throws Exception {
        method1 = SampleClass.class.getMethod("method1", String.class);
        method2 = SampleClass.class.getMethod("method2", int.class);
        mockInvocation = new Invocation(new SampleClass(), method1, new Object[]{"test"}, null);
        actualInvocation = new Invocation(new SampleClass(), method1, new Object[]{"test"}, null);
        differentMethodInvocation = new Invocation(new SampleClass(), method2, new Object[]{42}, null);
        differentMockInvocation = new Invocation(new Object(), method1, new Object[]{"test"}, null);
    }

    @After
    public void tearDown() {
        matcher = null;
        mockInvocation = null;
        actualInvocation = null;
        differentMethodInvocation = null;
        differentMockInvocation = null;
    }

    @Test
    public void testConstructorWithEmptyMatchers() {
        List<Matcher> emptyMatchers = new ArrayList<Matcher>();
        matcher = new InvocationMatcher(mockInvocation, emptyMatchers);
        assertNotNull(matcher.getMatchers());
        assertTrue(matcher.getMatchers().size() > 0);
        assertEquals(0, matcher.getMatchers().size());
    }

    @Test
    public void testConstructorWithNonEmptyMatchers() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertEquals(1, matcher.getMatchers().size());
        assertSame(matchers, matcher.getMatchers());
    }

    @Test
    public void testConstructorSingleArgument() {
        matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.getMatchers());
        assertNotNull(matcher.getInvocation());
        assertEquals(mockInvocation, matcher.getInvocation());
    }

    @Test
    public void testGetMethod() {
        matcher = new InvocationMatcher(mockInvocation);
        assertEquals(method1, matcher.getMethod());
    }

    @Test
    public void testGetInvocation() {
        matcher = new InvocationMatcher(mockInvocation);
        assertSame(mockInvocation, matcher.getInvocation());
    }

    @Test
    public void testGetMatchers() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertEquals(1, matcher.getMatchers().size());
    }

    @Test
    public void testToString() {
        matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.toString());
        assertTrue(matcher.toString().contains("method1"));
    }

    @Test
    public void testMatchesWithExactInvocation() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertTrue(matcher.matches(actualInvocation));
    }

    @Test
    public void testMatchesWithDifferentMethod() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertFalse(matcher.matches(differentMethodInvocation));
    }

    @Test
    public void testMatchesWithDifferentMock() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertFalse(matcher.matches(differentMockInvocation));
    }

    @Test
    public void testMatchesWithWrongArguments() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("wrong"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertFalse(matcher.matches(actualInvocation));
    }

    @Test
    public void testHasSimilarMethodWithSameMethod() {
        matcher = new InvocationMatcher(mockInvocation);
        assertTrue(matcher.hasSimilarMethod(actualInvocation));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMethodSameName() throws Exception {
        Method methodSameName = SampleClass.class.getMethod("method1", String.class);
        Invocation sameNameInvocation = new Invocation(new SampleClass(), methodSameName, new Object[]{"test"}, null);
        matcher = new InvocationMatcher(mockInvocation);
        assertTrue(matcher.hasSimilarMethod(sameNameInvocation));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMethodName() {
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(differentMethodInvocation));
    }

    @Test
    public void testHasSimilarMethodWithDifferentMock() {
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(differentMockInvocation));
    }

    @Test
    public void testHasSimilarMethodWithVerifiedInvocation() {
        Invocation verifiedInvocation = new Invocation(new SampleClass(), method1, new Object[]{"test"}, null);
        verifiedInvocation.markVerified();
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(verifiedInvocation));
    }

    @Test
    public void testHasSimilarMethodWithDifferentArgsSameMethod() {
        Invocation differentArgsInvocation = new Invocation(new SampleClass(), method1, new Object[]{"different"}, null);
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(differentArgsInvocation));
    }

    @Test
    public void testHasSameMethod() {
        matcher = new InvocationMatcher(mockInvocation);
        assertTrue(matcher.hasSameMethod(actualInvocation));
        assertFalse(matcher.hasSameMethod(differentMethodInvocation));
    }

    @Test
    public void testGetLocation() {
        matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.getLocation());
    }

    @Test
    public void testToStringWithPrintSettings() {
        matcher = new InvocationMatcher(mockInvocation);
        PrintSettings settings = new PrintSettings();
        assertNotNull(matcher.toString(settings));
        assertTrue(matcher.toString(settings).contains("method1"));
    }

    @Test
    public void testCaptureArgumentsFrom() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        matchers.add(capturingMatcher);
        matcher = new InvocationMatcher(mockInvocation, matchers);
        matcher.captureArgumentsFrom(actualInvocation);
        assertNotNull(capturingMatcher.getCapturedArgument());
        assertEquals("test", capturingMatcher.getCapturedArgument());
    }

    @Test
    public void testCaptureArgumentsFromWithMultipleMatchers() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        CapturingMatcher capturingMatcher1 = new CapturingMatcher();
        CapturingMatcher capturingMatcher2 = new CapturingMatcher();
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2);
        Invocation multiArgInvocation = new Invocation(new SampleClass(), method2, new Object[]{42}, null);
        matcher = new InvocationMatcher(multiArgInvocation, matchers);
        matcher.captureArgumentsFrom(multiArgInvocation);
        assertEquals(42, capturingMatcher2.getCapturedArgument());
    }

    @Test
    public void testMatchesWithNullArguments() {
        Invocation nullArgInvocation = new Invocation(new SampleClass(), method1, new Object[]{null}, null);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher(null));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        assertFalse(matcher.matches(nullArgInvocation));
    }

    @Test
    public void testHasSimilarMethodWithNullArgsSafe() {
        Invocation nullArgInvocation = new Invocation(new SampleClass(), method1, new Object[]{null}, null);
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(nullArgInvocation));
    }

    @Test
    public void testMatchesWithEmptyMatchers() {
        matcher = new InvocationMatcher(mockInvocation, new ArrayList<Matcher>());
        assertTrue(matcher.matches(actualInvocation));
    }

    @Test
    public void testHasSimilarMethodWithDifferentTypes() throws Exception {
        Method methodDifferentType = SampleClass.class.getMethod("method1", Object.class);
        Invocation invocationDifferentType = new Invocation(new SampleClass(), methodDifferentType, new Object[]{"test"}, null);
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSimilarMethod(invocationDifferentType));
    }

    @Test
    public void testGetLocationIsNotNull() {
        matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.getLocation());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullInvocation() {
        new InvocationMatcher(null, new ArrayList<Matcher>());
    }

    @Test
    public void testMatchesWithSameReference() {
        matcher = new InvocationMatcher(mockInvocation);
        assertTrue(matcher.matches(mockInvocation));
    }

    @Test
    public void testCaptureArgumentsFromWithNonCapturingMatcher() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new EqualsMatcher("test"));
        matcher = new InvocationMatcher(mockInvocation, matchers);
        matcher.captureArgumentsFrom(actualInvocation);
        assertTrue(true);
    }

    @Test
    public void testMatchesWithNullActual() {
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.matches(null));
    }

    @Test
    public void testHasSameMethodWithNullCandidate() {
        matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.hasSameMethod(null));
    }

    class CapturingMatcher implements Matcher<Object>, CapturesArguments {
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

        public Object getCapturedArgument() {
            return captured;
        }
    }

    static class SampleClass {
        public void method1(String param) {
        }

        public void method2(int param) {
        }
    }
}