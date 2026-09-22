package org.mockito.internal.invocation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.CapturesArguments;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.reporting.PrintSettings;

public class InvocationMatcherTest {

    public static class DummyTarget {
        public void simpleMethod(String arg) {}
        public void twoArgs(String a, String b) {}
        public void differentMethod(String arg) {}
        public void noArgs() {}
    }

    private Method simpleMethod;
    private Method twoArgsMethod;
    private Method differentMethod;
    private Method noArgsMethod;

    private Object mockObject1;
    private Object mockObject2;

    @Before
    public void setUp() throws Exception {
        mockObject1 = "mock1";
        mockObject2 = "mock2";

        simpleMethod = DummyTarget.class.getMethod("simpleMethod", new Class<?>[] { String.class });
        twoArgsMethod = DummyTarget.class.getMethod("twoArgs", new Class<?>[] { String.class, String.class });
        differentMethod = DummyTarget.class.getMethod("differentMethod", new Class<?>[] { String.class });
        noArgsMethod = DummyTarget.class.getMethod("noArgs", new Class<?>[0]);
    }

    @Test
    public void constructor_givenEmptyMatchers_shouldUseArgumentsToMatchers() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "testVal" }, 1);

        // Act
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation, Collections.<Matcher>emptyList());

        // Assert
        Assert.assertNotNull(invocationMatcher.getMatchers());
        Assert.assertEquals(1, invocationMatcher.getMatchers().size());
        Assert.assertSame(invocation, invocationMatcher.getInvocation());
        Assert.assertEquals(simpleMethod, invocationMatcher.getMethod());
    }

    @Test
    public void constructor_singleArg_shouldInitializeDefaultMatchers() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "hello" }, 1);

        // Act
        InvocationMatcher invocationMatcher = new InvocationMatcher(invocation);

        // Assert
        Assert.assertEquals(1, invocationMatcher.getMatchers().size());
    }

    @Test
    public void constructor_givenExplicitMatchers_shouldUseProvidedMatchers() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "val" }, 1);
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new Equals("customVal"));

        // Act
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        // Assert
        Assert.assertEquals(matchers, matcher.getMatchers());
    }

    @Test
    public void matches_givenSameMockMethodAndArgs_shouldReturnTrue() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, 1);
        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act & Assert
        Assert.assertTrue(matcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentMock_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, 1);
        Invocation actual = createInvocation(mockObject2, simpleMethod, new Object[] { "alpha" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act & Assert
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentMethod_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, 1);
        Invocation actual = createInvocation(mockObject1, differentMethod, new Object[] { "alpha" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act & Assert
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void matches_givenDifferentArguments_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "alpha" }, 1);
        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "beta" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act & Assert
        Assert.assertFalse(matcher.matches(actual));
    }

    @Test
    public void hasSameMethod_givenSameMethod_shouldReturnTrue() throws Exception {
        // Arrange
        Invocation invocation1 = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 1);
        Invocation invocation2 = createInvocation(mockObject2, simpleMethod, new Object[] { "b" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        // Act & Assert
        Assert.assertTrue(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void hasSameMethod_givenDifferentMethod_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation invocation1 = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 1);
        Invocation invocation2 = createInvocation(mockObject1, differentMethod, new Object[] { "a" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation1);

        // Act & Assert
        Assert.assertFalse(matcher.hasSameMethod(invocation2));
    }

    @Test
    public void hasSimilarMethod_givenUnverifiedMatchingInvocation_shouldReturnTrue() throws Exception {
        // Arrange
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 1);
        Invocation candidate = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        // Act & Assert
        Assert.assertTrue(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenDifferentMock_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 1);
        Invocation candidate = createInvocation(mockObject2, simpleMethod, new Object[] { "a" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        // Act & Assert
        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void hasSimilarMethod_givenDifferentMethodName_shouldReturnFalse() throws Exception {
        // Arrange
        Invocation wanted = createInvocation(mockObject1, simpleMethod, new Object[] { "a" }, 1);
        Invocation candidate = createInvocation(mockObject1, differentMethod, new Object[] { "a" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(wanted);

        // Act & Assert
        Assert.assertFalse(matcher.hasSimilarMethod(candidate));
    }

    @Test
    public void captureArgumentsFrom_givenCapturingMatcher_shouldCaptureArgument() throws Exception {
        // Arrange
        CapturingMatcher capturingMatcher = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher);

        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "initial" }, 1);
        Invocation actual = createInvocation(mockObject1, simpleMethod, new Object[] { "capturedValue" }, 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        // Act
        matcher.captureArgumentsFrom(actual);

        // Assert
        Assert.assertEquals("capturedValue", capturingMatcher.captured);
    }

    @Test
    public void captureArgumentsFrom_givenFewerArgumentsThanMatchers_shouldNotThrow() throws Exception {
        // Arrange
        CapturingMatcher capturingMatcher1 = new CapturingMatcher();
        CapturingMatcher capturingMatcher2 = new CapturingMatcher();
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(capturingMatcher1);
        matchers.add(capturingMatcher2);

        Invocation invocation = createInvocation(mockObject1, twoArgsMethod, new Object[] { "a", "b" }, 1);
        Invocation actual = createInvocation(mockObject1, noArgsMethod, new Object[0], 2);
        InvocationMatcher matcher = new InvocationMatcher(invocation, matchers);

        // Act & Assert
        matcher.captureArgumentsFrom(actual);
        Assert.assertNull(capturingMatcher1.captured);
        Assert.assertNull(capturingMatcher2.captured);
    }

    @Test
    public void createFrom_givenInvocationsList_shouldReturnMatchersList() throws Exception {
        // Arrange
        Invocation inv1 = createInvocation(mockObject1, simpleMethod, new Object[] { "1" }, 1);
        Invocation inv2 = createInvocation(mockObject1, simpleMethod, new Object[] { "2" }, 2);
        List<Invocation> invocations = Arrays.asList(inv1, inv2);

        // Act
        List<InvocationMatcher> result = InvocationMatcher.createFrom(invocations);

        // Assert
        Assert.assertEquals(2, result.size());
        Assert.assertSame(inv1, result.get(0).getInvocation());
        Assert.assertSame(inv2, result.get(1).getInvocation());
    }

    @Test
    public void getLocation_shouldReturnInvocationLocation() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "val" }, 1);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act & Assert
        Assert.assertNotNull(matcher.getLocation());
    }

    @Test
    public void toString_shouldReturnNonEmptyString() throws Exception {
        // Arrange
        Invocation invocation = createInvocation(mockObject1, simpleMethod, new Object[] { "val" }, 1);
        InvocationMatcher matcher = new InvocationMatcher(invocation);

        // Act
        String result = matcher.toString();
        String resultWithSettings = matcher.toString(new PrintSettings());

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotNull(resultWithSettings);
    }

    // Helper capturing matcher
    private static class CapturingMatcher extends BaseMatcher<Object> implements CapturesArguments {
        Object captured;

        public boolean matches(Object item) {
            return true;
        }

        public void describeTo(Description description) {
            description.appendText("captures");
        }

        public void captureFrom(Object argument) {
            this.captured = argument;
        }
    }

    // Helper to dynamically create an Invocation test instance
    private static Invocation createInvocation(Object mock, Method method, Object[] args, int seq) throws Exception {
        for (Constructor<?> constructor : Invocation.class.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameterValues = new Object[parameterTypes.length];
            boolean compatible = true;

            for (int j = 0; j < parameterTypes.length; j++) {
                Class<?> paramType = parameterTypes[j];
                if (paramType.isAssignableFrom(mock.getClass())) {
                    parameterValues[j] = mock;
                } else if (paramType.getName().endsWith("MockitoMethod")) {
                    parameterValues[j] = createMockitoMethodProxy(method, paramType);
                } else if (paramType.isArray() && paramType.getComponentType() == Object.class) {
                    parameterValues[j] = (args != null) ? args : new Object[0];
                } else if (paramType == int.class || paramType == Integer.class) {
                    parameterValues[j] = Integer.valueOf(seq);
                } else if (paramType.getName().endsWith("RealMethod")) {
                    parameterValues[j] = createRealMethodProxy(paramType);
                } else {
                    parameterValues[j] = null;
                }
            }

            if (compatible) {
                try {
                    return (Invocation) constructor.newInstance(parameterValues);
                } catch (Exception ignored) {
                }
            }
        }
        throw new IllegalStateException("Failed to construct Invocation test double.");
    }

    private static Object createMockitoMethodProxy(final Method method, Class<?> mockitoMethodInterface) {
        return Proxy.newProxyInstance(
                mockitoMethodInterface.getClassLoader(),
                new Class<?>[] { mockitoMethodInterface },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        String name = invokedMethod.getName();
                        if ("getMethod".equals(name)) {
                            return method;
                        } else if ("getName".equals(name)) {
                            return method.getName();
                        } else if ("getReturnType".equals(name)) {
                            return method.getReturnType();
                        } else if ("getParameterTypes".equals(name)) {
                            return method.getParameterTypes();
                        } else if ("getExceptionTypes".equals(name)) {
                            return method.getExceptionTypes();
                        } else if ("isVarArgs".equals(name)) {
                            return Boolean.valueOf(method.isVarArgs());
                        } else if ("equals".equals(name)) {
                            return Boolean.valueOf(proxy == args[0]);
                        } else if ("hashCode".equals(name)) {
                            return Integer.valueOf(System.identityHashCode(proxy));
                        }
                        return null;
                    }
                }
        );
    }

    private static Object createRealMethodProxy(Class<?> realMethodInterface) {
        return Proxy.newProxyInstance(
                realMethodInterface.getClassLoader(),
                new Class<?>[] { realMethodInterface },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method invokedMethod, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
    }
}
