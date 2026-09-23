package org.mockito.internal.invocation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ArrayEquals;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.MatchersPrinter;
import org.mockito.internal.reporting.PrintSettings;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class InvocationTest {

    private static class TestMockitoMethod implements MockitoMethod {
        private final Method method;
        private final boolean isVarArgs;
        private final Class<?>[] exceptionTypes;
        private final Class<?> returnType;
        private final String name;
        private final Class<?>[] parameterTypes;

        TestMockitoMethod(Method method, boolean isVarArgs, Class<?>[] exceptionTypes, Class<?> returnType, String name, Class<?>[] parameterTypes) {
            this.method = method;
            this.isVarArgs = isVarArgs;
            this.exceptionTypes = exceptionTypes;
            this.returnType = returnType;
            this.name = name;
            this.parameterTypes = parameterTypes;
        }

        @Override
        public String getName() { return name; }

        @Override
        public Class<?> getReturnType() { return returnType; }

        @Override
        public Class<?>[] getParameterTypes() { return parameterTypes; }

        @Override
        public Class<?>[] getExceptionTypes() { return exceptionTypes; }

        @Override
        public boolean isVarArgs() { return isVarArgs; }

        @Override
        public Method getJavaMethod() { return method; }
    }

    private Object mock;
    private StaticInnerRealMethod realMethod;
    private TestMockitoMethod method;
    private Invocation invocation;

    @Before
    public void setUp() throws Exception {
        mock = new Object();
        method = new TestMockitoMethod(
                Object.class.getMethod("toString"), false, new Class<?>[0], String.class, "toString", new Class<?>[0]
        );
        realMethod = new StaticInnerRealMethod();
        invocation = new Invocation(mock, method, new Object[]{"arg1", 123}, 42, realMethod);
    }

    @Test
    public void testConstructorAndBasicGetters() {
        Invocation inv = new Invocation(mock, method, new Object[]{"x"}, 1, realMethod);
        assertSame(mock, inv.getMock());
        assertSame(method, inv.getMethod());
        assertEquals(1, inv.getSequenceNumber().intValue());
        assertEquals("toString", inv.getMethodName());
        assertEquals(1, inv.getArgumentsCount());
        assertEquals(1, inv.getRawArguments().length);
    }

    @Test
    public void testExpandVarArgsWithNullArray() {
        // Non-varargs and null should return empty array
        TestMockitoMethod nonVar = new TestMockitoMethod(null, false, new Class<?>[0], void.class, "method", new Class<?>[0]);
        Invocation inv = new Invocation(mock, nonVar, null, 1, realMethod);
        assertEquals(0, inv.getArgumentsCount());
    }

    @Test
    public void testExpandVarArgsWithArray() {
        TestMockitoMethod var = new TestMockitoMethod(null, true, new Class<?>[0], int.class, "method", new Class<?>[]{int.class, int[].class});
        Invocation inv = new Invocation(mock, var, new Object[]{1, new int[]{2, 3}}, 1, realMethod);
        assertEquals(3, inv.getArgumentsCount());
        assertEquals(1, inv.getArguments()[0]);
        assertEquals(2, inv.getArguments()[1]);
        assertEquals(3, inv.getArguments()[2]);
    }

    @Test
    public void testExpandVarArgsWithNullVarArg() {
        TestMockitoMethod var = new TestMockitoMethod(null, true, new Class<?>[0], int.class, "method", new Class<?>[]{int.class, int[].class});
        Invocation inv = new Invocation(mock, var, new Object[]{1, null}, 1, realMethod);
        assertEquals(2, inv.getArgumentsCount());
        assertEquals(1, inv.getArguments()[0]);
        assertNull(inv.getArguments()[1]);
    }

    @Test
    public void testIsVerified() {
        assertFalse(invocation.isVerified());
    }

    @Test
    public void testEqualsNull() {
        assertFalse(invocation.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(invocation.equals(new Object()));
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals(invocation, invocation);
    }

    @Test
    public void testEqualsDifferentArguments() {
        Invocation other = new Invocation(mock, method, new Object[]{"arg2", 456}, 42, realMethod);
        assertFalse(invocation.equals(other));
    }

    @Test
    public void testEqualsSameArguments() {
        Invocation other = new Invocation(mock, method, new Object[]{"arg1", 123}, 42, realMethod);
        assertEquals(invocation, other);
    }

    @Test
    public void testHashCodeThrows() {
        try {
            invocation.hashCode();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIsToStringForToStringMethod() throws Exception {
        TestMockitoMethod namedMethod = new TestMockitoMethod(
                Object.class.getMethod("toString"), false, new Class<?>[0], String.class, "toString", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, namedMethod, new Object[0], 5, realMethod);
        assertTrue(Invocation.isToString(inv));
    }

    @Test
    public void testIsValidExceptionWithAssignable() {
        TestMockitoMethod methodWithEx = new TestMockitoMethod(
                null, false, new Class<?>[]{RuntimeException.class}, void.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, methodWithEx, new Object[0], 1, realMethod);
        assertTrue(inv.isValidException(new IllegalArgumentException()));
    }

    @Test
    public void testIsValidExceptionWithNonAssignable() {
        TestMockitoMethod methodWithEx = new TestMockitoMethod(
                null, false, new Class<?>[]{RuntimeException.class}, void.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, methodWithEx, new Object[0], 1, realMethod);
        assertFalse(inv.isValidException(new Exception()));
    }

    @Test
    public void testIsValidReturnTypePrimitive() {
        TestMockitoMethod primMethod = new TestMockitoMethod(
                null, false, new Class<?>[0], int.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, primMethod, new Object[0], 1, realMethod);
        assertTrue(inv.isValidReturnType(int.class));
        assertFalse(inv.isValidReturnType(long.class));
    }

    @Test
    public void testIsValidReturnTypeObject() {
        TestMockitoMethod objMethod = new TestMockitoMethod(
                null, false, new Class<?>[0], String.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, objMethod, new Object[0], 1, realMethod);
        assertTrue(inv.isValidReturnType(String.class));
        assertTrue(inv.isValidReturnType(CharSequence.class));
        assertFalse(inv.isValidReturnType(Integer.class));
    }

    @Test
    public void testIsVoidVoidReturnType() {
        TestMockitoMethod voidMethod = new TestMockitoMethod(
                null, false, new Class<?>[0], void.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, voidMethod, new Object[0], 1, realMethod);
        assertTrue(inv.isVoid());
    }

    @Test
    public void testIsVoidNonVoidReturnType() {
        assertFalse(invocation.isVoid());
    }

    @Test
    public void testReturnsPrimitiveForPrimitive() {
        TestMockitoMethod primMethod = new TestMockitoMethod(
                null, false, new Class<?>[0], int.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, primMethod, new Object[0], 1, realMethod);
        assertTrue(inv.returnsPrimitive());
    }

    @Test
    public void testReturnsPrimitiveForNonPrimitive() {
        assertFalse(invocation.returnsPrimitive());
    }

    @Test
    public void testGetLocation() {
        assertNotNull(invocation.getLocation());
    }

    @Test
    public void testCallRealMethod() throws Throwable {
        Object result = invocation.callRealMethod();
        // mock is Object, toString returns "mock.toString" + ""?
        assertNotNull(result);
    }

    @Test
    public void testMarkVerified() {
        invocation.markVerified();
        assertTrue(invocation.isVerified());
    }

    @Test
    public void testMarkVerifiedInOrder() {
        invocation.markVerifiedInOrder();
        assertTrue(invocation.isVerified());
        assertTrue(invocation.isVerifiedInOrder());
    }

    @Test
    public void testArgumentsToMatchers() {
        Invocation inv = new Invocation(mock, method, new Object[]{"string", new int[]{1,2}}, 1, realMethod);
        List<org.hamcrest.Matcher> matchers = inv.argumentsToMatchers();
        assertEquals(2, matchers.size());
        assertTrue(matchers.get(0) instanceof Equals);
        assertTrue(matchers.get(1) instanceof ArrayEquals);
    }

    @Test
    public void testArgumentsToMatchersWithNull() {
        Invocation inv = new Invocation(mock, method, new Object[]{null, 1}, 1, realMethod);
        List<org.hamcrest.Matcher> matchers = inv.argumentsToMatchers();
        assertEquals(2, matchers.size());
        assertTrue(matchers.get(0) instanceof Equals);
        assertTrue(matchers.get(1) instanceof Equals);
    }

    @Test
    public void testToString() {
        String s = invocation.toString();
        assertNotNull(s);
        assertTrue(s.contains("mock.toString"));
    }

    @Test
    public void testToStringWithPrintSettingsMultiline() {
        PrintSettings settings = new PrintSettings();
        settings.setMultiline(true);
        String s = invocation.toString(settings);
        assertNotNull(s);
        assertTrue(s.contains("mock.toString"));
    }

    @Test
    public void testToStringWithLongLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 60; i++) {
            sb.append("veryLongArgumentValue");
        }
        Invocation inv = new Invocation(mock, method, new Object[]{sb.toString()}, 1, realMethod);
        String s = inv.toString();
        assertNotNull(s);
        assertTrue(s.contains("mock.toString"));
    }

    @Test
    public void testGetArgumentsReturnsExpanded() {
        TestMockitoMethod var = new TestMockitoMethod(null, true, new Class<?>[0], int.class, "method", new Class<?>[]{int.class, int[].class});
        Invocation inv = new Invocation(mock, var, new Object[]{1, new int[]{2, 3}}, 1, realMethod);
        Object[] args = inv.getArguments();
        assertEquals(3, args.length);
    }

    @Test
    public void testGetRawArgumentsReturnsOriginal() {
        Object[] rawArgs = new Object[]{"raw", 123};
        Invocation inv = new Invocation(mock, method, rawArgs, 1, realMethod);
        assertSame(rawArgs, inv.getRawArguments());
    }

    @Test
    public void testPrintMethodReturnType() {
        TestMockitoMethod strMethod = new TestMockitoMethod(
                null, false, new Class<?>[0], String.class, "method", new Class<?>[0]
        );
        Invocation inv = new Invocation(mock, strMethod, new Object[0], 1, realMethod);
        assertEquals("String", inv.printMethodReturnType());
    }

    // Helper inner classes
    private static class StaticInnerRealMethod implements RealMethod {
        @Override
        public Object invoke(Object target, Object[] arguments) throws Throwable {
            if (target == null) {
                return null;
            }
            return target.toString();
        }
    }

    private interface RealMethod {
        Object invoke(Object target, Object[] arguments) throws Throwable;
    }

    private interface MockitoMethod {
        String getName();
        Class<?> getReturnType();
        Class<?>[] getParameterTypes();
        Class<?>[] getExceptionTypes();
        boolean isVarArgs();
        Method getJavaMethod();
    }
}