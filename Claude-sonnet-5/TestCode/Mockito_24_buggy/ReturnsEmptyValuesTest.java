package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues values;

    interface SampleInterface {
        int returnInt();
        boolean returnBoolean();
        byte returnByte();
        short returnShort();
        char returnChar();
        long returnLong();
        float returnFloat();
        double returnDouble();

        Integer returnIntegerWrapper();
        Boolean returnBooleanWrapper();
        Byte returnByteWrapper();
        Short returnShortWrapper();
        Character returnCharWrapper();
        Long returnLongWrapper();
        Float returnFloatWrapper();
        Double returnDoubleWrapper();

        Collection returnCollection();
        Set returnSet();
        HashSet returnHashSet();
        SortedSet returnSortedSet();
        TreeSet returnTreeSet();
        LinkedHashSet returnLinkedHashSet();
        List returnList();
        LinkedList returnLinkedList();
        ArrayList returnArrayList();
        Map returnMap();
        HashMap returnHashMap();
        SortedMap returnSortedMap();
        TreeMap returnTreeMap();
        LinkedHashMap returnLinkedHashMap();

        String returnString();
        Object returnObject();
    }

    @Before
    public void setUp() {
        values = new ReturnsEmptyValues();
    }

    private InvocationOnMock invocationWithMethod(Method method, Object mockObj) {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(method);
        when(invocation.getMock()).thenReturn(mockObj);
        return invocation;
    }

    private Method methodOf(String name, Class<?>... params) throws NoSuchMethodException {
        return SampleInterface.class.getMethod(name, params);
    }

    // ---------- answer() : toString branch ----------

    @Test
    public void shouldReturnDefaultToStringDescriptionWhenNameIsDefault() throws Exception {
        List<?> mockObject = mock(List.class);
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = invocationWithMethod(toStringMethod, mockObject);

        Object result = values.answer(invocation);

        assertTrue(result instanceof String);
        String expected = "Mock for " + List.class.getSimpleName() + ", hashCode: " + mockObject.hashCode();
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCustomNameWhenMockHasCustomName() throws Exception {
        List<?> mockObject = mock(List.class, withSettings().name("myCustomMock"));
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = invocationWithMethod(toStringMethod, mockObject);

        Object result = values.answer(invocation);

        assertEquals("myCustomMock", result);
    }

    // ---------- answer() : compareTo branch ----------

    @Test
    public void shouldReturnOneForCompareToMethod() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        Object mockObject = mock(Comparable.class);
        InvocationOnMock invocation = invocationWithMethod(compareToMethod, mockObject);

        Object result = values.answer(invocation);

        assertEquals(1, result);
    }

    // ---------- answer() : primitive returning methods via returnType ----------

    @Test
    public void shouldReturnZeroForIntReturningMethod() throws Exception {
        Method m = methodOf("returnInt");
        InvocationOnMock invocation = invocationWithMethod(m, mock(SampleInterface.class));

        Object result = values.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnFalseForBooleanReturningMethod() throws Exception {
        Method m = methodOf("returnBoolean");
        InvocationOnMock invocation = invocationWithMethod(m, mock(SampleInterface.class));

        Object result = values.answer(invocation);

        assertEquals(false, result);
    }

    @Test
    public void shouldReturnZeroIntegerWrapperForIntegerReturningMethod() throws Exception {
        Method m = methodOf("returnIntegerWrapper");
        InvocationOnMock invocation = invocationWithMethod(m, mock(SampleInterface.class));

        Object result = values.answer(invocation);

        assertEquals(Integer.valueOf(0), result);
    }

    // ---------- answer() : exception path ----------

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenInvocationIsNull() {
        values.answer(null);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenMethodIsNull() {
        InvocationOnMock invocation = mock(InvocationOnMock.class);
        when(invocation.getMethod()).thenReturn(null);

        values.answer(invocation);
    }

    // ---------- returnValueFor() : primitive & wrapper types ----------

    @Test
    public void shouldReturnDefaultValuesForPrimitiveTypes() {
        assertEquals(0, values.returnValueFor(int.class));
        assertEquals(false, values.returnValueFor(boolean.class));
        assertEquals((byte) 0, values.returnValueFor(byte.class));
        assertEquals((short) 0, values.returnValueFor(short.class));
        assertEquals((char) 0, values.returnValueFor(char.class));
        assertEquals(0L, values.returnValueFor(long.class));
        assertEquals(0f, values.returnValueFor(float.class));
        assertEquals(0d, values.returnValueFor(double.class));
    }

    @Test
    public void shouldReturnDefaultValuesForWrapperTypes() {
        assertEquals(Integer.valueOf(0), values.returnValueFor(Integer.class));
        assertEquals(Boolean.FALSE, values.returnValueFor(Boolean.class));
        assertEquals(Byte.valueOf((byte) 0), values.returnValueFor(Byte.class));
        assertEquals(Short.valueOf((short) 0), values.returnValueFor(Short.class));
        assertEquals(Character.valueOf((char) 0), values.returnValueFor(Character.class));
        assertEquals(Long.valueOf(0L), values.returnValueFor(Long.class));
        assertEquals(Float.valueOf(0f), values.returnValueFor(Float.class));
        assertEquals(Double.valueOf(0d), values.returnValueFor(Double.class));
    }

    // ---------- returnValueFor() : collection types ----------

    @Test
    public void shouldReturnEmptyLinkedListForCollectionType() {
        Object result = values.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyHashSetForSetType() {
        Object result = values.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyHashSetForHashSetType() {
        Object result = values.returnValueFor(HashSet.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyTreeSetForSortedSetType() {
        Object result = values.returnValueFor(SortedSet.class);
        assertTrue(result instanceof TreeSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyTreeSetForTreeSetType() {
        Object result = values.returnValueFor(TreeSet.class);
        assertTrue(result instanceof TreeSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyLinkedHashSetForLinkedHashSetType() {
        Object result = values.returnValueFor(LinkedHashSet.class);
        assertTrue(result instanceof LinkedHashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyLinkedListForListType() {
        Object result = values.returnValueFor(List.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyLinkedListForLinkedListType() {
        Object result = values.returnValueFor(LinkedList.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyArrayListForArrayListType() {
        Object result = values.returnValueFor(ArrayList.class);
        assertTrue(result instanceof ArrayList);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyHashMapForMapType() {
        Object result = values.returnValueFor(Map.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyHashMapForHashMapType() {
        Object result = values.returnValueFor(HashMap.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyTreeMapForSortedMapType() {
        Object result = values.returnValueFor(SortedMap.class);
        assertTrue(result instanceof TreeMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyTreeMapForTreeMapType() {
        Object result = values.returnValueFor(TreeMap.class);
        assertTrue(result instanceof TreeMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void shouldReturnEmptyLinkedHashMapForLinkedHashMapType() {
        Object result = values.returnValueFor(LinkedHashMap.class);
        assertTrue(result instanceof LinkedHashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    // ---------- returnValueFor() : unknown / null types ----------

    @Test
    public void shouldReturnNullForUnknownType() {
        Object result = values.returnValueFor(String.class);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullForObjectType() {
        Object result = values.returnValueFor(Object.class);
        assertNull(result);
    }

    @Test
    public void shouldReturnNullForNullType() {
        Object result = values.returnValueFor(null);
        assertNull(result);
    }

    // ---------- verifying different collection instances are distinct (no shared state) ----------

    @Test
    public void shouldReturnNewInstanceEachTimeForCollectionType() {
        Object first = values.returnValueFor(List.class);
        Object second = values.returnValueFor(List.class);

        assertTrue(first instanceof List);
        assertTrue(second instanceof List);
        assertTrue(first != second);

        ((List) first).add("item");
        assertEquals(1, ((List) first).size());
        assertEquals(0, ((List) second).size());
    }

    @Test
    public void shouldReturnNewInstanceEachTimeForMapType() {
        Object first = values.returnValueFor(Map.class);
        Object second = values.returnValueFor(Map.class);

        assertTrue(first instanceof Map);
        assertTrue(second instanceof Map);
        assertTrue(first != second);

        ((Map) first).put("key", "value");
        assertEquals(1, ((Map) first).size());
        assertEquals(0, ((Map) second).size());
    }
}