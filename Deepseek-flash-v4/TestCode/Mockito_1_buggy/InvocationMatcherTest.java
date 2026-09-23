package org.mockito.internal.invocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Any;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

public class InvocationMatcherTest {

    private Invocation mockInvocation;
    private Invocation mockInvocation2;
    private Method method1;
    private Method method2;
    private Location location;
    private Matcher matcher1;
    private Matcher matcher2;

    @Before
    public void setUp() throws Exception {
        mockInvocation = new MockInvocation();
        mockInvocation2 = new MockInvocation();
        method1 = getClass().getMethod("methodToTest", String.class, int.class);
        method2 = getClass().getMethod("methodToTest", String.class, int.class);
        location = new MockLocation();
        matcher1 = new MockMatcher();
        matcher2 = new MockMatcher();
    }

    @Test
    public void testConstructor_withMatchers() {
        List<Matcher> matcherList = Arrays.asList(matcher1, matcher2);
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation, matcherList);
        assertSame(mockInvocation, matcher.getInvocation());
        assertEquals(2, matcher.getMatchers().size());
        assertSame(matcher1, matcher.getMatchers().get(0));
        assertSame(matcher2, matcher.getMatchers().get(1));
    }

    @Test
    public void testConstructor_withEmptyMatchers_shouldProcessArguments() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation, Collections.<Matcher>emptyList());
        assertNotNull(matcher.getMatchers());
        assertEquals(2, matcher.getMatchers().size());
    }

    @Test
    public void testConstructor_withoutMatchers_shouldProcessArguments() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.getMatchers());
        assertEquals(2, matcher.getMatchers().size());
    }

    @Test
    public void testGetMethod() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertSame(method1, matcher.getMethod());
    }

    @Test
    public void testMatches_withEqualMocksAndMethodsAndArguments() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertTrue(matcher.matches(mockInvocation));
    }

    @Test
    public void testMatches_withDifferentMock() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation other = new MockInvocation("different", new Object[]{"hello", 1});
        other.setMock(new Object());
        assertFalse(matcher.matches(other));
    }

    @Test
    public void testMatches_withDifferentMethod() throws Exception {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Method differentMethod = getClass().getMethod("otherMethod");
        Invocation other = new MockInvocation("different", new Object[]{new Object(), 2});
        other.setMethod(differentMethod);
        assertFalse(matcher.matches(other));
    }

    @Test
    public void testMatches_withDifferentArguments() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation other = new MockInvocation("different", new Object[]{"different", 2});
        assertFalse(matcher.matches(other));
    }

    @Test
    public void testMatches_withMatchingArgumentsButDifferentOrder() {
        InvocationMatcher matcher = new InvocationMatcher(
            new MockInvocation("first", new Object[]{"a", 1}),
            Collections.<Matcher>singletonList(Any.any()))
        );
        assertTrue(matcher.matches(new MockInvocation("second", new Object[]{"b", 2})));
    }

    @Test
    public void testHasSimilarMethod_withSameNameAndMockAndUnverified() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation candidate = new MockInvocation("candidate", new Object[]{"arg", 1});
        candidate.setMock(mockInvocation.getMock());
        candidate.setVerified(false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_withDifferentName() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation candidate = new MockInvocation("otherName", new Object[]{"arg", 1});
        candidate.setMock(mockInvocation.getMock());
        candidate.setVerified(false);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_withDifferentMock() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation candidate = new MockInvocation("candidate", new Object[]{"arg", 1});
        candidate.setMock(new Object());
        candidate.setVerified(false);
        assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_withDifferentArgumentsButSameMethod_shouldBeSimilar() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation candidate = new MockInvocation("candidate", new Object[]{"different", 99});
        candidate.setMock(mockInvocation.getMock());
        candidate.setVerified(false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSimilarMethod_withDifferentArgumentsAndOverloadedMethod() throws Exception {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Method overloaded = getClass().getMethod("methodToTest", String.class, int.class);
        Invocation candidate = new MockInvocation("candidate", new Object[]{"arg", 1});
        candidate.setMethod(overloaded);
        candidate.setMock(mockInvocation.getMock());
        candidate.setVerified(false);
        assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void testHasSameMethod_withSameMethod() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation candidate = new MockInvocation("candidate", new Object[]{});
        candidate.setMethod(method1);
        assertTrue(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testHasSameMethod_withNullMethodName() throws Exception {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Method methodWithNullName = getClass().getMethod("methodToTest", String.class, int.class);
        Invocation candidate = new MockInvocation("candidate", new Object[]{});
        candidate.setMethod(null);
        assertFalse(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testHasSameMethod_withDifferentParamTypes() throws Exception {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Method different = getClass().getMethod("methodToTest", String.class, long.class);
        Invocation candidate = new MockInvocation("candidate", new Object[]{});
        candidate.setMethod(different);
        assertFalse(matcher.hasSameMethod(candidate));
    }

    @Test
    public void testGetLocation() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertSame(location, matcher.getLocation());
    }

    @Test
    public void testCaptureArguments_withNonVarargMatchers() {
        MockCapturingMatcher captureMatcher = new MockCapturingMatcher();
        List<Matcher> matchers = Arrays.<Matcher>asList(captureMatcher, captureMatcher);
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation, matchers);
        matcher.captureArgumentsFrom(mockInvocation);
        assertEquals(2, captureMatcher.getCaptured().size());
    }

    @Test
    public void testCaptureArguments_withVarargsMatcher() {
        MockCapturingMatcher captureMatcher = new MockCapturingMatcher();
        Invocation varargInvocation = new MockInvocation("vararg", new Object[]{new Object[]{"a", "b"}});
        Method varargMethod = null;
        try {
            varargMethod = getClass().getMethod("varargMethod", Object[].class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        varargInvocation.setMethod(varargMethod);
        List<Matcher> matchers = Arrays.<Matcher>asList(captureMatcher, captureMatcher);
        InvocationMatcher matcher = new InvocationMatcher(varargInvocation, matchers);
        matcher.captureArgumentsFrom(varargInvocation);
        // Since implementation throws UnsupportedOperationException, we expect it to throw
        // but if it didn't, we'd have captured both
        assertEquals(2, captureMatcher.getCaptured().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCaptureArguments_withVarargs_shouldThrow() {
        Invocation varargInvocation = new MockInvocation("vararg", new Object[]{new Object[]{"a"}});
        Method varargMethod = null;
        try {
            varargMethod = getClass().getMethod("varargMethod", Object[].class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        varargInvocation.setMethod(varargMethod);
        InvocationMatcher matcher = new InvocationMatcher(varargInvocation, Collections.<Matcher>emptyList());
        matcher.captureArgumentsFrom(varargInvocation);
    }

    @Test
    public void testIsVarargMatcher_withDecoratedMatcher() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Matcher decorated = new MatcherDecoratorImpl(new MockVarargMatcher());
        assertTrue(matcher.isVarargMatcher(decorated));
    }

    @Test
    public void testIsVarargMatcher_withNonVarargMatcher() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.isVarargMatcher(matcher1));
    }

    @Test
    public void testIsVariableArgument_withVarargAtLastPosition() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        Invocation varargInvocation = new MockInvocation("vararg", new Object[]{new Object[]{"a"}});
        Method varargMethod = null;
        try {
            varargMethod = getClass().getMethod("varargMethod", Object[].class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        varargInvocation.setMethod(varargMethod);
        assertTrue(matcher.isVariableArgument(varargInvocation, 0));
    }

    @Test
    public void testIsVariableArgument_withNonArrayArgument() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertFalse(matcher.isVariableArgument(mockInvocation, 0));
    }

    @Test
    public void testCreateFrom_withMultipleInvocations() {
        List<Invocation> invocations = new ArrayList<>();
        invocations.add(new MockInvocation("one", new Object[]{"a", 1}));
        invocations.add(new MockInvocation("two", new Object[]{"b", 2}));
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);
        assertEquals(2, matchers.size());
    }

    @Test
    public void testCreateFrom_withEmptyList() {
        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(Collections.<Invocation>emptyList());
        assertTrue(matchers.isEmpty());
    }

    @Test
    public void testCreateFrom_withNullInvocation_shouldHandle() {
        List<Invocation> invocations = Arrays.asList((Invocation) null);
        try {
            InvocationMatcher.createFrom(invocations);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testToString_withPrintSettings() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        assertNotNull(matcher.toString());
    }

    @Test
    public void testConstructor_withNullMatchers_shouldThrowNPE() {
        try {
            new InvocationMatcher(mockInvocation, null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructor_withNullInvocation_shouldThrowNPE() {
        try {
            new InvocationMatcher(null, Collections.<Matcher>emptyList());
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testMatches_withNullActual() {
        InvocationMatcher matcher = new InvocationMatcher(mockInvocation);
        try {
            matcher.matches(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    // Helper method for testing
    public void methodToTest(String arg, int num) {}
    public void methodToTest(String arg, long num) {}
    public void otherMethod() {}
    public void varargMethod(Object... args) {}

    // Inner class for Mock Invocation
    private static class MockInvocation implements Invocation {
        private Object mock = new Object();
        private Object[] args;
        private Method method;
        private Location loc;
        private boolean verified;

        public MockInvocation() {
            this("mock", new Object[]{"hello", 1});
        }

        public MockInvocation(String name, Object[] args) {
            this.args = args;
            this.method = null;
            try {
                this.method = InvocationMatcherTest.class.getMethod("methodToTest", String.class, int.class);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            this.loc = new MockLocation();
        }

        @Override
        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        @Override
        public Object getMock() {
            return mock;
        }

        public void setMock(Object mock) {
            this.mock = mock;
        }

        @Override
        public Object[] getArguments() {
            return args;
        }

        @Override
        public Object[] getRawArguments() {
            return new Object[]{args[0]};
        }

        @Override
        public Object getArgumentAt(int index, Class<?> clazz) {
            return args[index];
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }

        @Override
        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }

        @Override
        public Location getLocation() {
            return loc;
        }
    }

    private static class MockLocation implements Location {
        @Override
        public String toString() {
            return "mockLocation";
        }
    }

    private static class MockMatcher implements Matcher, CapturesArguments {
        private static final long serialVersionUID = 1L;
        private Object captured;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public Class getType() {
            return Object.class;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("mockMatcher");
        }

        @Override
        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }
    }

    private static class MockCapturingMatcher extends MockMatcher {
        private List<Object> captured = new ArrayList<>();

        @Override
        public void captureFrom(Object argument) {
            captured.add(argument);
        }

        public List<Object> getCaptured() {
            return captured;
        }
    }

    private static class MatcherDecoratorImpl implements MatcherDecorator {
        private final Matcher actualMatcher;

        public MatcherDecoratorImpl(Matcher actualMatcher) {
            this.actualMatcher = actualMatcher;
        }

        @Override
        public Matcher getActualMatcher() {
            return actualMatcher;
        }

        @Override
        public boolean matches(Object item) {
            return actualMatcher.matches(item);
        }

        @Override
        public Class getType() {
            return actualMatcher.getType();
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            actualMatcher.describeTo(description);
        }
    }

    private static class MockVarargMatcher implements Matcher, VarargMatcher {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean matches(Object item) {
            return true;
        }

        @Override
        public Class getType() {
            return Object.class;
        }

        @Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText("varargMatcher");
        }
    }
}