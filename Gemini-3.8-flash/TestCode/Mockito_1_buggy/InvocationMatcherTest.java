package org.mockito.internal.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.MatcherDecorator;
import org.mockito.internal.matchers.VarargMatcher;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.Location;

public class InvocationMatcherTest {

    private Method noArgMethod;
    private Method stringMethod;
    private Method overloadedMethodString;
    private Method overloadedMethodInt;
    private Method twoArgMethod;
    private Method twoArgMethodDiffType;
    private Method varargMethod;

    private Object mockObject;
    private Object differentMockObject;
    private Location dummyLocation;

    public static class DummyTarget {
        public void noArgMethod() {}
        public void stringMethod(String s) {}
        public void overloadedMethod(String s) {}
        public void overloadedMethod(Integer i) {}
        public void twoArgMethod(String s, Integer i) {}
        public void twoArgMethodDiffType(String s, Long l) {}
        public void varargMethod(String... args) {}
    }

    @Before
    public void setUp() throws Exception {
        noArgMethod = DummyTarget.class.getMethod("noArgMethod", new Class[0]);
        stringMethod = DummyTarget.class.getMethod("stringMethod", new Class[] { String.class });
        overloadedMethodString = DummyTarget.class.getMethod("overloadedMethod", new Class[] { String.class });
        overloadedMethodInt = DummyTarget.class.getMethod("overloadedMethod", new Class[] { Integer.class });
        twoArgMethod = DummyTarget.class.getMethod("twoArgMethod", new Class[] { String.class, Integer.class });
        twoArgMethodDiffType = DummyTarget.class.getMethod("twoArgMethodDiffType", new Class[] { String.class, Long.class });
        varargMethod = DummyTarget.class.getMethod("varargMethod", new Class[] { String[].class });

        mockObject = "mockInstance";
        differentMockObject = "differentMockInstance";

        dummyLocation = (Location) Proxy.newProxyInstance(
                Location.class.getClassLoader(),
                new Class[] { Location.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("toString".equals(method.getName())) {
                            return "-> at org.mockito.DummyTest.dummy(DummyTest.java:10)";
                        }
                        return null;
                    }
                }
        );
    }

    private Invocation createInvocation(final Object mock, final Method method, final Object[] args,
                                        final Object[] rawArgs, final boolean verified, final Location location) {
        return (Invocation) Proxy.newProxyInstance(
                Invocation.class.getClassLoader(),
                new Class[] { Invocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] mArgs) throws Throwable {
                        String name = m.getName();
                        if ("getMock".equals(name)) {
                            return mock;
                        }
                        if ("getMethod".equals(name)) {
                            return method;
                        }
                        if ("getArguments".equals(name)) {
                            return args != null ? args : new Object[0];
                        }
                        if ("getRawArguments".equals(name)) {
                            return rawArgs != null ? rawArgs : (args != null ? args : new Object[0]);
                        }
                        if ("isVerified".equals(name)) {
                            return Boolean.valueOf(verified);
                        }
                        if ("getLocation".equals(name)) {
                            return location;
                        }
                        if ("getArgumentAt".equals(name)) {
                            int idx = ((Integer) mArgs[0]).intValue();
                            return args != null && idx < args.length ? args[idx] : null;
                        }
                        if ("toString".equals(name)) {
                            return "MockInvocation";
                        }
                        if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == mArgs[0]);
                        }
                        if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private Matcher createMatcher(final boolean matchResult) {
        return (Matcher) Proxy.newProxyInstance(
                Matcher.class.getClassLoader(),
                new Class[] { Matcher.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("matches".equals(name)) {
                            return Boolean.valueOf(matchResult);
                        }
                        if ("describeTo".equals(name)) {
                            return null;
                        }
                        return null;
                    }
                }
        );
    }

    private Matcher createExplodingMatcher() {
        return (Matcher) Proxy.newProxyInstance(
                Matcher.class.getClassLoader(),
                new Class[] { Matcher.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("matches".equals(method.getName())) {
                            throw new RuntimeException("Matcher explosion for testing safelyArgumentsMatch");
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void constructor_givenEmptyMatchers_shouldUseArgumentsProcessor() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "param" }, null, false, dummyLocation);

        InvocationMatcher matcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        Assert.assertSame(invocation, matcher.getInvocation());
        Assert.assertEquals(stringMethod, matcher.getMethod());
        Assert.assertFalse(matcher.getMatchers().isEmpty());
    }

    @Test
    public void constructor_givenExplicitMatchers_shouldKeepExplicitMatchers() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "param" }, null, false, dummyLocation);
        List<Matcher> matchers = new ArrayList<Matcher>();
        Matcher customMatcher = createMatcher(true);
        matchers.add(customMatcher);

        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        Assert.assertSame(invocation, matcher.getInvocation());
        Assert.assertEquals(1, matcher.getMatchers().size());
        Assert.assertSame(customMatcher, matcher.getMatchers().get(0));
    }

    @Test
    public void singleArgConstructor_givenInvocation_shouldInitializeWithEmptyListDelegation() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "param" }, null, false, dummyLocation);

        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Assert.assertSame(invocation, matcher.getInvocation());
        Assert.assertNotNull(matcher.getMatchers());
        Assert.assertFalse(matcher.getMatchers().isEmpty());
    }

    @Test
    public void getLocation_givenInvocationWithLocation_shouldReturnLocation() {
        Invocation invocation = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        Location actualLocation = matcher.getLocation();

        Assert.assertSame(dummyLocation, actualLocation);
    }

    @Test
    public void toString_givenInvocationAndMatchers_shouldReturnFormattedString() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "param" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        String result = matcher.toString();

        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 0);
    }

    @Test
    public void hasSameMethod_givenIdenticalMethod_shouldReturnTrue() {
        Invocation invocation1 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, stringMethod, new Object[] { "differentArg" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean result = matcher.hasSameMethod(invocation2);

        Assert.assertTrue(result);
    }

    @Test
    public void hasSameMethod_givenDifferentMethodName_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean result = matcher.hasSameMethod(invocation2);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSameMethod_givenSameNameDifferentParamCount_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, overloadedMethodString, new Object[] { "arg" }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean result = matcher.hasSameMethod(invocation2);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSameMethod_givenSameNameSameParamCountDifferentParamType_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, twoArgMethod, new Object[] { "a", Integer.valueOf(1) }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, twoArgMethodDiffType, new Object[] { "a", Long.valueOf(1L) }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean result = matcher.hasSameMethod(invocation2);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSimilarMethod_givenDifferentMethodName_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSimilarMethod_givenVerifiedCandidate_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, true, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSimilarMethod_givenDifferentMockObject_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(differentMockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSimilarMethod_givenSameMethodSameMockUnverified_shouldReturnTrue() {
        Invocation wanted = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, stringMethod, new Object[] { "other" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertTrue(result);
    }

    @Test
    public void hasSimilarMethod_givenOverloadedMethodWithSameArgs_shouldReturnFalse() {
        Invocation wanted = createInvocation(mockObject, overloadedMethodString, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, overloadedMethodInt, new Object[] { "val" }, null, false, dummyLocation);

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createMatcher(true));
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertFalse(result);
    }

    @Test
    public void hasSimilarMethod_givenOverloadedMethodWithDifferentArgs_shouldReturnTrue() {
        Invocation wanted = createInvocation(mockObject, overloadedMethodString, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, overloadedMethodInt, new Object[] { Integer.valueOf(10) }, null, false, dummyLocation);

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createMatcher(false));
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertTrue(result);
    }

    @Test
    public void hasSimilarMethod_givenMatcherThrowsException_safelyArgumentsMatchShouldCatchAndReturnFalse() {
        Invocation wanted = createInvocation(mockObject, overloadedMethodString, new Object[] { "val" }, null, false, dummyLocation);
        Invocation candidate = createInvocation(mockObject, overloadedMethodInt, new Object[] { Integer.valueOf(10) }, null, false, dummyLocation);

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createExplodingMatcher());
        InvocationMatcher matcher = new InvocationMatcher(wanted, matchers);

        boolean result = matcher.hasSimilarMethod(candidate);

        Assert.assertTrue(result);
    }

    @Test
    public void matches_givenDifferentMock_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(differentMockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean matches = matcher.matches(invocation2);

        Assert.assertFalse(matches);
    }

    @Test
    public void matches_givenDifferentMethod_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        boolean matches = matcher.matches(invocation2);

        Assert.assertFalse(matches);
    }

    @Test
    public void matches_givenSameMockMethodAndMatchingArguments_shouldReturnTrue() {
        Invocation invocation1 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createMatcher(true));
        InvocationMatcher matcher = new InvocationMatcher(invocation1, matchers);

        boolean matches = matcher.matches(invocation2);

        Assert.assertTrue(matches);
    }

    @Test
    public void matches_givenSameMockMethodAndNonMatchingArguments_shouldReturnFalse() {
        Invocation invocation1 = createInvocation(mockObject, stringMethod, new Object[] { "arg" }, null, false, dummyLocation);
        Invocation invocation2 = createInvocation(mockObject, stringMethod, new Object[] { "other" }, null, false, dummyLocation);

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createMatcher(false));
        InvocationMatcher matcher = new InvocationMatcher(invocation1, matchers);

        boolean matches = matcher.matches(invocation2);

        Assert.assertFalse(matches);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void captureArgumentsFrom_givenVarArgsInvocation_shouldThrowUnsupportedOperationException() {
        Invocation invocation = createInvocation(mockObject, varargMethod, new Object[] { new String[] { "a", "b" } },
                new Object[] { new String[] { "a", "b" } }, false, dummyLocation);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        matcher.captureArgumentsFrom(invocation);
    }

    @Test
    public void captureArgumentsFrom_givenNonVarArgsWithCapturingMatcher_shouldCaptureArgument() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "capturedValue" }, null, false, dummyLocation);

        final Object[] capturedHolder = new Object[1];
        Matcher capturingMatcher = (Matcher) Proxy.newProxyInstance(
                InvocationMatcherTest.class.getClassLoader(),
                new Class[] { Matcher.class, CapturesArguments.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if ("captureFrom".equals(name)) {
                            capturedHolder[0] = args[0];
                            return null;
                        }
                        if ("matches".equals(name)) {
                            return Boolean.TRUE;
                        }
                        return null;
                    }
                }
        );

        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        matcher.captureArgumentsFrom(invocation);

        Assert.assertEquals("capturedValue", capturedHolder[0]);
    }

    @Test
    public void captureArgumentsFrom_givenNonCapturingMatcher_shouldNotThrowException() {
        Invocation invocation = createInvocation(mockObject, stringMethod, new Object[] { "val" }, null, false, dummyLocation);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(createMatcher(true));
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        matcher.captureArgumentsFrom(invocation);

        Assert.assertNotNull(matcher);
    }

    @Test
    public void createFrom_givenInvocationsList_shouldReturnInvocationMatchersList() {
        Invocation inv1 = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        Invocation inv2 = createInvocation(mockObject, stringMethod, new Object[] { "test" }, null, false, dummyLocation);

        List<Invocation> invocations = new ArrayList<Invocation>();
        invocations.add(inv1);
        invocations.add(inv2);

        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertSame(inv1, result.get(0).getInvocation());
        Assert.assertSame(inv2, result.get(1).getInvocation());
    }

    @Test
    public void createFrom_givenEmptyList_shouldReturnEmptyList() {
        List<Invocation> emptyList = Collections.emptyList();

        List<InvocationMatcher> result = InvocationMatcher.createFrom(emptyList);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void isVarargMatcher_reflectionTest_shouldIdentifyVarargMatcherCorrectly() throws Exception {
        Method isVarargMatcherMethod = InvocationMatcher.class.getDeclaredMethod("isVarargMatcher", new Class[] { Matcher.class });
        isVarargMatcherMethod.setAccessible(true);

        Invocation dummyInv = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        InvocationMatcher invocationMatcher = new InvocationMatcher(dummyInv);

        final Matcher regularMatcher = createMatcher(true);

        final Matcher varargMatcher = (Matcher) Proxy.newProxyInstance(
                InvocationMatcherTest.class.getClassLoader(),
                new Class[] { Matcher.class, VarargMatcher.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );

        Matcher decoratedVarargMatcher = (Matcher) Proxy.newProxyInstance(
                InvocationMatcherTest.class.getClassLoader(),
                new Class[] { Matcher.class, MatcherDecorator.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getActualMatcher".equals(method.getName())) {
                            return varargMatcher;
                        }
                        return null;
                    }
                }
        );

        Matcher decoratedRegularMatcher = (Matcher) Proxy.newProxyInstance(
                InvocationMatcherTest.class.getClassLoader(),
                new Class[] { Matcher.class, MatcherDecorator.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getActualMatcher".equals(method.getName())) {
                            return regularMatcher;
                        }
                        return null;
                    }
                }
        );

        Boolean regularResult = (Boolean) isVarargMatcherMethod.invoke(invocationMatcher, new Object[] { regularMatcher });
        Boolean varargResult = (Boolean) isVarargMatcherMethod.invoke(invocationMatcher, new Object[] { varargMatcher });
        Boolean decVarargResult = (Boolean) isVarargMatcherMethod.invoke(invocationMatcher, new Object[] { decoratedVarargMatcher });
        Boolean decRegularResult = (Boolean) isVarargMatcherMethod.invoke(invocationMatcher, new Object[] { decoratedRegularMatcher });

        Assert.assertFalse(regularResult.booleanValue());
        Assert.assertTrue(varargResult.booleanValue());
        Assert.assertTrue(decVarargResult.booleanValue());
        Assert.assertFalse(decRegularResult.booleanValue());
    }

    @Test
    public void isVariableArgument_reflectionTest_shouldCoverAllBranchConditions() throws Exception {
        Method isVariableArgumentMethod = InvocationMatcher.class.getDeclaredMethod(
                "isVariableArgument", new Class[] { Invocation.class, int.class });
        isVariableArgumentMethod.setAccessible(true);

        Invocation dummyInv = createInvocation(mockObject, noArgMethod, new Object[0], null, false, dummyLocation);
        InvocationMatcher invocationMatcher = new InvocationMatcher(dummyInv);

        // Branch 1: Position is not length - 1
        Invocation invPosMismatch = createInvocation(mockObject, varargMethod,
                new Object[] { new String[] { "a" } }, new Object[] { new String[] { "a" } }, false, dummyLocation);
        Boolean resPosMismatch = (Boolean) isVariableArgumentMethod.invoke(invocationMatcher, new Object[] { invPosMismatch, Integer.valueOf(1) });
        Assert.assertFalse(resPosMismatch.booleanValue());

        // Branch 2: Argument at position is null
        Invocation invNullArg = createInvocation(mockObject, varargMethod,
                new Object[] { null }, new Object[] { null }, false, dummyLocation);
        Boolean resNullArg = (Boolean) isVariableArgumentMethod.invoke(invocationMatcher, new Object[] { invNullArg, Integer.valueOf(0) });
        Assert.assertFalse(resNullArg.booleanValue());

        // Branch 3: Argument at position is not an array
        Invocation invNonArrayArg = createInvocation(mockObject, varargMethod,
                new Object[] { "notAnArray" }, new Object[] { "notAnArray" }, false, dummyLocation);
        Boolean resNonArrayArg = (Boolean) isVariableArgumentMethod.invoke(invocationMatcher, new Object[] { invNonArrayArg, Integer.valueOf(0) });
        Assert.assertFalse(resNonArrayArg.booleanValue());

        // Branch 4: Method is not varargs
        Invocation invNotVarArgsMethod = createInvocation(mockObject, stringMethod,
                new Object[] { new String[] { "val" } }, new Object[] { new String[] { "val" } }, false, dummyLocation);
        Boolean resNotVarArgsMethod = (Boolean) isVariableArgumentMethod.invoke(invocationMatcher, new Object[] { invNotVarArgsMethod, Integer.valueOf(0) });
        Assert.assertFalse(resNotVarArgsMethod.booleanValue());

        // Branch 5: All conditions satisfied -> true
        Invocation invValidVarArgs = createInvocation(mockObject, varargMethod,
                new Object[] { new String[] { "item" } }, new Object[] { new String[] { "item" } }, false, dummyLocation);
        Boolean resValidVarArgs = (Boolean) isVariableArgumentMethod.invoke(invocationMatcher, new Object[] { invValidVarArgs, Integer.valueOf(0) });
        Assert.assertTrue(resValidVarArgs.booleanValue());
    }
}