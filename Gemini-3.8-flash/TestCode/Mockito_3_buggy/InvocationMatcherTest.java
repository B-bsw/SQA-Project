package org.mockito.internal.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

public class InvocationMatcherTest {

    public static class DummyTarget {
        public void simpleMethod(String arg) {}
        public void overloadedMethod(String arg) {}
        public void overloadedMethod(Integer arg) {}
        public void overloadedMethod(String a, String b) {}
        public void varargMethod(String prefix, Object... items) {}
        public void differentMethod(String arg) {}
    }

    private Method simpleMethod;
    private Method overloadedMethodString;
    private Method overloadedMethodInteger;
    private Method overloadedMethodTwoStrings;
    private Method varargMethod;
    private Method differentMethod;

    private Object mockObject1;
    private Object mockObject2;

    @Before
    public void setUp() throws Exception {
        mockObject1 = new Object();
        mockObject2 = new Object();

        simpleMethod = DummyTarget.class.getMethod("simpleMethod", new Class[] { String.class });
        overloadedMethodString = DummyTarget.class.getMethod("overloadedMethod", new Class[] { String.class });
        overloadedMethodInteger = DummyTarget.class.getMethod("overloadedMethod", new Class[] { Integer.class });
        overloadedMethodTwoStrings = DummyTarget.class.getMethod("overloadedMethod", new Class[] { String.class, String.class });
        varargMethod = DummyTarget.class.getMethod("varargMethod", new Class[] { String.class, Object[].class });
        differentMethod = DummyTarget.class.getMethod("differentMethod", new Class[] { String.class });
    }

    private Invocation createInvocation(final Object mock, final Method method, final Object[] args, final boolean verified, final Location location) {
        return (Invocation) Proxy.newProxyInstance(
                Invocation.class.getClassLoader(),
                new Class[] { Invocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] methodArgs) throws Throwable {
                        String name = m.getName();
                        if ("getMock".equals(name)) {
                            return mock;
                        } else if ("getMethod".equals(name)) {
                            return method;
                        } else if ("getArguments".equals(name)) {
                            return args;
                        } else if ("getRawArguments".equals(name)) {
                            return args;
                        } else if ("isVerified".equals(name)) {
                            return Boolean.valueOf(verified);
                        } else if ("getLocation".equals(name)) {
                            return location;
                        } else if ("getArgumentAt".equals(name)) {
                            int idx = ((Integer) methodArgs[0]).intValue();
                            return (args != null && idx < args.length) ? methodArgs[1].cast(args[idx]) : null;
                        } else if ("toString".equals(name)) {
                            return "DummyInvocation(" + method.getName() + ")";
                        }
                        return null;
                    }
                }
        );
    }

    private static class CapturingMatcherMock implements Matcher, CapturesArguments {
        private Object captured;

        public void captureFrom(Object argument) {
            this.captured = argument;
        }

        public Object getCaptured() {
            return captured;
        }

        public boolean matches(Object item) {
            return true;
        }

        public void describeTo(org.hamcrest.Description description) {
            description.appendText("CapturingMatcherMock");
        }

        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}
    }

    private static class NonCapturingMatcherMock implements Matcher {
        private final boolean matchesResult;

        public NonCapturingMatcherMock(boolean matchesResult) {
            this.matchesResult = matchesResult;
        }

        public boolean matches(Object item) {
            return matchesResult;
        }

        public void describeTo(org.hamcrest.Description description) {
            description.appendText("NonCapturingMatcherMock");
        }

        public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {}
    }

    @Test
    public void constructor_givenEmptyMatchers_shouldConvertArgumentsToMatchers() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "test" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertSame(invocation, invocationMatcher.getInvocation());
        Assert.assertSame(simpleMethod, invocationMatcher.getMethod());
        Assert.assertNotNull(invocationMatcher.getMatchers());
        Assert.assertEquals(1, invocationMatcher.getMatchers().size());
    }

    @Test
    public void constructor_givenExplicitMatchers_shouldStoreProvidedMatchers() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "test" }, false, null);
        List<Matcher> matchers = new ArrayList<Matcher>();
        Matcher customMatcher = new NonCapturingMatcherMock(true);
        matchers.add(customMatcher);

        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, matchers);

        Assert.assertSame(invocation, invocationMatcher.getInvocation());
        Assert.assertSame(customMatcher, invocationMatcher.getMatchers().get(0));
    }

    @Test
    public void getLocation_givenInvocationWithLocation_shouldReturnLocation() {
        final Location location = (Location) Proxy.newProxyInstance(
                Location.class.getClassLoader(),
                new Class[] { Location.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) {
                        return "sample_location";
                    }
                }
        );
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "test" }, false, location);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertSame(location, invocationMatcher.getLocation());
    }

    @Test
    public void toString_givenInvocationMatcher_shouldReturnNonEmptyString() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "test" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        String result = invocationMatcher.toString();

        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void matches_givenSameMockSameMethodMatchingArgs_shouldReturnTrue() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertTrue(invocationMatcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentMock_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation actual = createInvocation(mockObject2, simpleMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentMethod_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation actual = createInvocation(mockObject1, differentMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentArguments_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "beta" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.matches(actual));
    }

    @Test
    public void hasSameMethod_givenSameMethodSignature_shouldReturnTrue() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, simpleMethod, new Object[] { "beta" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertTrue(invocationMatcher.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_givenDifferentMethodName_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, differentMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_givenSameNameDifferentParamCount_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, overloadedMethodString, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, overloadedMethodTwoStrings, new Object[] { "alpha", "beta" }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.hasSameMethod(candidate));
    }

    @Test
    public void hasSameMethod_givenSameNameDifferentParamTypes_shouldReturnFalse() {
        Invocation invocation = createInvocation(mockObject1, overloadedMethodString, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, overloadedMethodInteger, new Object[] { Integer.valueOf(1) }, false, null);
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        Assert.assertFalse(invocationMatcher.hasSameMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenDifferentMethodName_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, differentMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenVerifiedCandidate_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, true, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenDifferentMock_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject2, simpleMethod, new Object[] { "alpha" }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenSameMethodSignatureAndUnverified_shouldReturnTrue() {
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, simpleMethod, new Object[] { "beta" }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenOverloadedMethodWithDifferentArgs_shouldReturnTrue() {
        Invocation wanted = createInvocation(mockObject1, overloadedMethodString, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, overloadedMethodInteger, new Object[] { Integer.valueOf(10) }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenOverloadedMethodWithMatchingArgs_shouldReturnFalse() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new NonCapturingMatcherMock(true));

        Invocation wanted = createInvocation(mockObject1, overloadedMethodString, new Object[] { "alpha" }, false, null);
        Invocation candidate = createInvocation(mockObject1, overloadedMethodInteger, new Object[] { Integer.valueOf(10) }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenSafelyArgumentsMatchThrowsThrowable_shouldReturnTrue() {
        Invocation wanted = createInvocation(mockObject1, overloadedMethodString, new Object[] { "alpha" }, false, null);
        Invocation candidate = (Invocation) Proxy.newProxyInstance(
                Invocation.class.getClassLoader(),
                new Class[] { Invocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("getMethod".equals(name)) {
                            return overloadedMethodInteger;
                        } else if ("isVerified".equals(name)) {
                            return Boolean.FALSE;
                        } else if ("getMock".equals(name)) {
                            return mockObject1;
                        } else if ("getArguments".equals(name)) {
                            throw new RuntimeException("Simulated error in argument retrieval");
                        }
                        return null;
                    }
                }
        );

        InvocationMatcher matcher = new InvocationMatcher(wanted);

        Assert.assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void captureArgumentsFrom_givenNonVarArgsMethod_shouldCaptureArguments() {
        CapturingMatcherMock capturingMatcher = new CapturingMatcherMock();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);

        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "target" }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "capturedValue" }, false, null);
        matcher.captureArgumentsFrom(actual);

        Assert.assertEquals("capturedValue", capturingMatcher.getCaptured());
    }

    @Test
    public void captureArgumentsFrom_givenNonVarArgsWithNonCapturingMatcher_shouldDoNothing() {
        NonCapturingMatcherMock nonCapturingMatcher = new NonCapturingMatcherMock(true);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(nonCapturingMatcher);

        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "target" }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "value" }, false, null);
        matcher.captureArgumentsFrom(actual);
    }

    @Test
    public void captureArgumentsFrom_givenVarArgsMethod_shouldCaptureVarargsProperly() {
        CapturingMatcherMock prefixMatcher = new CapturingMatcherMock();
        CapturingMatcherMock varargItemMatcher1 = new CapturingMatcherMock();
        CapturingMatcherMock varargItemMatcher2 = new CapturingMatcherMock();

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(prefixMatcher);
        matchers.add(varargItemMatcher1);
        matchers.add(varargItemMatcher2);

        Invocation wanted = createInvocation(mockObject1, varargMethod, new Object[] { "prefix", new Object[] { "item1", "item2" } }, false, null);
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        Object[] rawArgs = new Object[] { "prefixActual", "item1Actual", "item2Actual" };
        Invocation actual = createInvocation(mockObject1, varargMethod, rawArgs, false, null);

        matcher.captureArgumentsFrom(actual);

        Assert.assertEquals("prefixActual", prefixMatcher.getCaptured());
        Assert.assertEquals("item1Actual", varargItemMatcher1.getCaptured());
        Assert.assertEquals("item2Actual", varargItemMatcher2.getCaptured());
    }

    @Test
    public void createFrom_givenInvocationsList_shouldReturnInvocationMatchersList() {
        Invocation inv1 = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, false, null);
        Invocation inv2 = createInvocation(mockObject1, simpleMethod, new Object[] { "b" }, false, null);
        List<Invocation> invocations = Arrays.asList(new Invocation[] { inv1, inv2 });

        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);

        Assert.assertEquals(2, matchers.size());
        Assert.assertSame(inv1, matchers.get(0).getInvocation());
        Assert.assertSame(inv2, matchers.get(1).getInvocation());
    }

    @Test
    public void createFrom_givenEmptyList_shouldReturnEmptyList() {
        List<Invocation> invocations = Collections.emptyList();

        List<InvocationMatcher> matchers = InvocationMatcher.createFrom(invocations);

        Assert.assertTrue(matchers.isEmpty());
    }
}