package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;
import org.mockito.mock.MockName;
import org.mockito.internal.creation.MockSettingsImpl;

import java.lang.reflect.Method;
import java.util.*;
import static org.junit.Assert.*;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues answer;
    private InvocationOnMock invocation;
    private MockUtil mockUtil;

    @Before
    public void setUp() {
        answer = new ReturnsEmptyValues();
        mockUtil = new MockUtil();
    }

    @Test
    public void testAnswer_primitiveInt() throws Exception {
        invocation = createInvocation(int.class);
        assertEquals(0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperInteger() throws Exception {
        invocation = createInvocation(Integer.class);
        assertEquals(0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_boolean() throws Exception {
        invocation = createInvocation(boolean.class);
        assertEquals(false, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperBoolean() throws Exception {
        invocation = createInvocation(Boolean.class);
        assertEquals(false, answer.answer(invocation));
    }

    @Test
    public void testAnswer_collection() throws Exception {
        invocation = createInvocation(Collection.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection) result).isEmpty());
    }

    @Test
    public void testAnswer_list() throws Exception {
        invocation = createInvocation(List.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedList);
        assertTrue(((List) result).isEmpty());
    }

    @Test
    public void testAnswer_arrayList() throws Exception {
        invocation = createInvocation(ArrayList.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof ArrayList);
        assertTrue(((ArrayList) result).isEmpty());
    }

    @Test
    public void testAnswer_set() throws Exception {
        invocation = createInvocation(Set.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set) result).isEmpty());
    }

    @Test
    public void testAnswer_hashSet() throws Exception {
        invocation = createInvocation(HashSet.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testAnswer_sortedSet() throws Exception {
        invocation = createInvocation(SortedSet.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof TreeSet);
        assertTrue(((SortedSet) result).isEmpty());
    }

    @Test
    public void testAnswer_treeSet() throws Exception {
        invocation = createInvocation(TreeSet.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testAnswer_linkedHashSet() throws Exception {
        invocation = createInvocation(LinkedHashSet.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testAnswer_map() throws Exception {
        invocation = createInvocation(Map.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map) result).isEmpty());
    }

    @Test
    public void testAnswer_hashMap() throws Exception {
        invocation = createInvocation(HashMap.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testAnswer_sortedMap() throws Exception {
        invocation = createInvocation(SortedMap.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testAnswer_treeMap() throws Exception {
        invocation = createInvocation(TreeMap.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testAnswer_linkedHashMap() throws Exception {
        invocation = createInvocation(LinkedHashMap.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testAnswer_otherType() throws Exception {
        invocation = createInvocation(String.class);
        assertNull(answer.answer(invocation));
    }

    @Test
    public void testAnswer_linkedList() throws Exception {
        invocation = createInvocation(LinkedList.class);
        Object result = answer.answer(invocation);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testAnswer_equalsMethod_default() throws Exception {
        invocation = createInvocationForMethod("equals", new Class<?>[]{Object.class});
        assertNull(answer.answer(invocation));
    }

    @Test
    public void testAnswer_hashCodeMethod_default() throws Exception {
        invocation = createInvocationForMethod("hashCode");
        assertNull(answer.answer(invocation));
    }

    @Test
    public void testAnswer_toStringMethod_default() throws Exception {
        invocation = createInvocationForMethod("toString");
        Object result = answer.answer(invocation);
        assertNotNull(result);
        String resultStr = result.toString();
        assertTrue(resultStr.contains("Mock for"));
        assertTrue(resultStr.contains("hashCode:"));
    }

    @Test
    public void testAnswer_toStringMethod_named() throws Exception {
        MockSettingsImpl<?> settings = new MockSettingsImpl<>();
        settings.setName("myMock");
        Object mock = Mockito.mock(SampleClass.class, settings);
        InvocationOnMock inv = createInvocationForMethodOnMock("toString", mock, new Class<?>[]{});
        Object result = answer.answer(inv);
        assertEquals("myMock", result);
    }

    @Test
    public void testAnswer_compareToMethod() throws Exception {
        invocation = createInvocationForMethod("compareTo", new Class<?>[]{Object.class});
        assertEquals(1, answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveLong() throws Exception {
        invocation = createInvocation(long.class);
        assertEquals(0L, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperLong() throws Exception {
        invocation = createInvocation(Long.class);
        assertEquals(0L, answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveChar() throws Exception {
        invocation = createInvocation(char.class);
        assertEquals('\u0000', answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperCharacter() throws Exception {
        invocation = createInvocation(Character.class);
        assertEquals('\u0000', answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveDouble() throws Exception {
        invocation = createInvocation(double.class);
        assertEquals(0.0d, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperDouble() throws Exception {
        invocation = createInvocation(Double.class);
        assertEquals(0.0d, answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveFloat() throws Exception {
        invocation = createInvocation(float.class);
        assertEquals(0.0f, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperFloat() throws Exception {
        invocation = createInvocation(Float.class);
        assertEquals(0.0f, answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveShort() throws Exception {
        invocation = createInvocation(short.class);
        assertEquals((short) 0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperShort() throws Exception {
        invocation = createInvocation(Short.class);
        assertEquals((short) 0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_primitiveByte() throws Exception {
        invocation = createInvocation(byte.class);
        assertEquals((byte) 0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_wrapperByte() throws Exception {
        invocation = createInvocation(Byte.class);
        assertEquals((byte) 0, answer.answer(invocation));
    }

    @Test
    public void testAnswer_void() throws Exception {
        invocation = createInvocation(void.class);
        assertNull(answer.answer(invocation));
    }

    @Test
    public void testAnswer_nullReturnType() throws Exception {
        invocation = createInvocationForMethod("toString");
        Object result = answer.answer(invocation);
        assertNotNull(result);
    }

    private InvocationOnMock createInvocation(Class<?> returnType) throws Exception {
        return createInvocationForMethod("someMethod", new Class<?>[0], returnType, null);
    }

    private InvocationOnMock createInvocationForMethod(String methodName, Class<?>... params) throws Exception {
        return createInvocationForMethod(methodName, params, Object.class, Mockito.mock(MockName.class));
    }

    private InvocationOnMock createInvocationForMethodOnMock(String methodName, Object mock, Class<?>... params) throws Exception {
        return createInvocationForMethodOnMock(methodName, params, Object.class, mock);
    }

    private InvocationOnMock createInvocationForMethod(String methodName, Class<?>[] params, Class<?> returnType, MockName name) throws Exception {
        return createInvocationForMethodOnMock(methodName, params, returnType, Mockito.mock(SampleClass.class, name != null ? Mockito.withSettings().name(name.toString()) : Mockito.withSettings()));
    }

    private InvocationOnMock createInvocationForMethodOnMock(String methodName, Class<?>[] params, Class<?> returnType, Object mock) throws Exception {
        final Method method = SampleClass.class.getMethod(methodName, params);
        final Object mockFinal = mock;
        return new InvocationOnMock() {
            @Override
            public Object getMock() {
                return mockFinal;
            }

            @Override
            public Method getMethod() {
                return method;
            }

            @Override
            public Object[] getArguments() {
                return new Object[0];
            }

            @Override
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    static class SampleClass {
        public void someMethod() {}
        public int intMethod() { return 0; }
        public String stringMethod() { return null; }
        @Override
        public String toString() {
            return super.toString();
        }
        @Override
        public int hashCode() {
            return super.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}