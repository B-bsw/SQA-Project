package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.Mockito;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.util.Primitives;
import org.mockito.mock.MockName;
import org.mockito.internal.creation.MockSettingsImpl;
import java.lang.reflect.Method;
import java.util.*;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;
    private Object mock;

    @Before
    public void setUp() throws Exception {
        returnsEmptyValues = new ReturnsEmptyValues();
        mock = Mockito.mock(Object.class);
    }

    @Test
    public void testAnswer_nullMethodReturnDefaultPrimitive() throws Exception {
        Method method = Object.class.getMethod("hashCode");
        InvocationOnMock invocation = createInvocation(method, mock, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_primitiveIntReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(int.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_collectionReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(Collection.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_setReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(Set.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_linkedHashSetReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(LinkedHashSet.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testAnswer_sortedSetReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(SortedSet.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testAnswer_treeSetReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(TreeSet.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testAnswer_hashSetReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(HashSet.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testAnswer_listReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(List.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testAnswer_linkedListReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(LinkedList.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testAnswer_arrayListReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(ArrayList.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testAnswer_mapReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(Map.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testAnswer_hashMapReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(HashMap.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testAnswer_sortedMapReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(SortedMap.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testAnswer_treeMapReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(TreeMap.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testAnswer_linkedHashMapReturnType() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(LinkedHashMap.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testAnswer_unknownReturnTypeReturnsNull() throws Exception {
        InvocationOnMock invocation = createInvocationForReturnType(String.class);
        Object result = returnsEmptyValues.answer(invocation);
        assertNull(result);
    }

    @Test
    public void testAnswer_toStringWithDefaultName() throws Exception {
        MockName mockName = Mockito.mock(MockName.class);
        Mockito.when(mockName.isDefault()).thenReturn(true);
        Mockito.when(mockName.toString()).thenReturn("defaultName");
        
        MockUtil mockUtil = org.mockito.Mockito.mock(MockUtil.class);
        Mockito.when(mockUtil.getMockName(org.mockito.Mockito.any())).thenReturn(mockName);
        Mockito.when(mockUtil.getMockSettings(org.mockito.Mockito.any())).thenReturn(new MockSettingsImpl());
        
        ReturnsEmptyValues spy = org.mockito.Mockito.spy(new ReturnsEmptyValues());
        org.mockito.Mockito.doReturn(mockUtil).when(spy).mockUtil;
        org.mockito.Mockito.doReturn(true).when(spy).methodsGuru.isToString(org.mockito.Mockito.any());
        
        InvocationOnMock invocation = createToStringInvocation();
        Object result = spy.answer(invocation);
        assertNotNull(result);
        assertTrue(result.toString().contains("Mock for"));
    }

    private InvocationOnMock createInvocation(Method method, Object mock, Object[] args) {
        return new InvocationOnMock() {
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
            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    private InvocationOnMock createInvocationForReturnType(Class<?> returnType) {
        try {
            Method method;
            if (returnType == int.class) {
                method = TestClass.class.getMethod("intMethod");
            } else {
                method = TestClass.class.getMethod("method", returnType);
            }
            return createInvocation(method, mock, new Object[]{null});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    private InvocationOnMock createToStringInvocation() {
        try {
            Method method = Object.class.getMethod("toString");
            return createInvocation(method, mock, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static class TestClass {
        public int intMethod() { return 0; }
        public Collection method(Collection c) { return null; }
        public Set method(Set s) { return null; }
        public List method(List l) { return null; }
        public Map method(Map m) { return null; }
        public SortedSet method(SortedSet s) { return null; }
        public SortedMap method(SortedMap m) { return null; }
        public HashSet method(HashSet h) { return null; }
        public TreeSet method(TreeSet t) { return null; }
        public LinkedHashSet method(LinkedHashSet l) { return null; }
        public LinkedList method(LinkedList l) { return null; }
        public ArrayList method(ArrayList a) { return null; }
        public HashMap method(HashMap h) { return null; }
        public TreeMap method(TreeMap t) { return null; }
        public LinkedHashMap method(LinkedHashMap l) { return null; }
        public String method(String s) { return null; }
    }
}