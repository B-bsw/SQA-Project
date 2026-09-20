package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    private interface SampleComparable extends Comparable<SampleComparable> {
        int compareTo(SampleComparable other);
    }

    private interface SampleService {
        String fetchName();
        int fetchCount();
        boolean isActive();
        List<String> fetchItems();
        Set<String> fetchUniqueItems();
        Map<String, Object> fetchAttributes();
        String toString();
    }

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    private InvocationOnMock createInvocation(final Object mock, final Method method) {
        return (InvocationOnMock) Proxy.newProxyInstance(
                InvocationOnMock.class.getClassLoader(),
                new Class[] { InvocationOnMock.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
                        if ("getMethod".equals(m.getName())) {
                            return method;
                        }
                        if ("getMock".equals(m.getName())) {
                            return mock;
                        }
                        return null;
                    }
                }
        );
    }

    @Test
    public void returnValueFor_givenPrimitiveBoolean_shouldReturnFalse() {
        // Arrange
        Class<?> type = boolean.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void returnValueFor_givenWrapperBoolean_shouldReturnFalse() {
        // Arrange
        Class<?> type = Boolean.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void returnValueFor_givenPrimitiveChar_shouldReturnZeroChar() {
        // Arrange
        Class<?> type = char.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Character.valueOf((char) 0), result);
    }

    @Test
    public void returnValueFor_givenWrapperCharacter_shouldReturnZeroChar() {
        // Arrange
        Class<?> type = Character.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Character.valueOf((char) 0), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveByte_shouldReturnZero() {
        // Arrange
        Class<?> type = byte.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void returnValueFor_givenWrapperByte_shouldReturnZero() {
        // Arrange
        Class<?> type = Byte.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveShort_shouldReturnZero() {
        // Arrange
        Class<?> type = short.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void returnValueFor_givenWrapperShort_shouldReturnZero() {
        // Arrange
        Class<?> type = Short.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveInt_shouldReturnZero() {
        // Arrange
        Class<?> type = int.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void returnValueFor_givenWrapperInteger_shouldReturnZero() {
        // Arrange
        Class<?> type = Integer.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveLong_shouldReturnZero() {
        // Arrange
        Class<?> type = long.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void returnValueFor_givenWrapperLong_shouldReturnZero() {
        // Arrange
        Class<?> type = Long.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveFloat_shouldReturnZero() {
        // Arrange
        Class<?> type = float.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Float.valueOf(0.0f), result);
    }

    @Test
    public void returnValueFor_givenWrapperFloat_shouldReturnZero() {
        // Arrange
        Class<?> type = Float.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Float.valueOf(0.0f), result);
    }

    @Test
    public void returnValueFor_givenPrimitiveDouble_shouldReturnZero() {
        // Arrange
        Class<?> type = double.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Double.valueOf(0.0d), result);
    }

    @Test
    public void returnValueFor_givenWrapperDouble_shouldReturnZero() {
        // Arrange
        Class<?> type = Double.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertEquals(Double.valueOf(0.0d), result);
    }

    @Test
    public void returnValueFor_givenCollectionInterface_shouldReturnEmptyLinkedList() {
        // Arrange
        Class<?> type = Collection.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedList);
        Assert.assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSetInterface_shouldReturnEmptyHashSet() {
        // Arrange
        Class<?> type = Set.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashSet);
        Assert.assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenHashSetClass_shouldReturnEmptyHashSet() {
        // Arrange
        Class<?> type = HashSet.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashSet);
        Assert.assertTrue(((HashSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSortedSetInterface_shouldReturnEmptyTreeSet() {
        // Arrange
        Class<?> type = SortedSet.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TreeSet);
        Assert.assertTrue(((SortedSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenTreeSetClass_shouldReturnEmptyTreeSet() {
        // Arrange
        Class<?> type = TreeSet.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TreeSet);
        Assert.assertTrue(((TreeSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedHashSetClass_shouldReturnEmptyLinkedHashSet() {
        // Arrange
        Class<?> type = LinkedHashSet.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedHashSet);
        Assert.assertTrue(((LinkedHashSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenListInterface_shouldReturnEmptyLinkedList() {
        // Arrange
        Class<?> type = List.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedList);
        Assert.assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedListClass_shouldReturnEmptyLinkedList() {
        // Arrange
        Class<?> type = LinkedList.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedList);
        Assert.assertTrue(((LinkedList<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenArrayListClass_shouldReturnEmptyArrayList() {
        // Arrange
        Class<?> type = ArrayList.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof ArrayList);
        Assert.assertTrue(((ArrayList<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenMapInterface_shouldReturnEmptyHashMap() {
        // Arrange
        Class<?> type = Map.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashMap);
        Assert.assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenHashMapClass_shouldReturnEmptyHashMap() {
        // Arrange
        Class<?> type = HashMap.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashMap);
        Assert.assertTrue(((HashMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSortedMapInterface_shouldReturnEmptyTreeMap() {
        // Arrange
        Class<?> type = SortedMap.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TreeMap);
        Assert.assertTrue(((SortedMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenTreeMapClass_shouldReturnEmptyTreeMap() {
        // Arrange
        Class<?> type = TreeMap.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TreeMap);
        Assert.assertTrue(((TreeMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedHashMapClass_shouldReturnEmptyLinkedHashMap() {
        // Arrange
        Class<?> type = LinkedHashMap.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedHashMap);
        Assert.assertTrue(((LinkedHashMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenReturnedCollections_shouldBeMutable() {
        // Arrange
        Object listResult = returnsEmptyValues.returnValueFor(List.class);
        Object mapResult = returnsEmptyValues.returnValueFor(Map.class);

        // Act
        List<Object> list = (List<Object>) listResult;
        list.add("testElement");

        Map<Object, Object> map = (Map<Object, Object>) mapResult;
        map.put("key", "value");

        // Assert
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("testElement", list.get(0));
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("value", map.get("key"));
    }

    @Test
    public void returnValueFor_givenNonCollectionAndNonPrimitiveClass_shouldReturnNull() {
        // Arrange
        Class<?> type = String.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void returnValueFor_givenObjectClass_shouldReturnNull() {
        // Arrange
        Class<?> type = Object.class;

        // Act
        Object result = returnsEmptyValues.returnValueFor(type);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void answer_givenCompareToMethod_shouldReturnOne() throws Exception {
        // Arrange
        Method compareToMethod = SampleComparable.class.getMethod("compareTo", new Class[] { SampleComparable.class });
        InvocationOnMock invocation = createInvocation(new Object(), compareToMethod);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    public void answer_givenStringReturningMethod_shouldReturnNull() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("fetchName", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void answer_givenIntReturningMethod_shouldReturnZero() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("fetchCount", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenBooleanReturningMethod_shouldReturnFalse() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("isActive", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void answer_givenListReturningMethod_shouldReturnEmptyList() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("fetchItems", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LinkedList);
        Assert.assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void answer_givenSetReturningMethod_shouldReturnEmptySet() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("fetchUniqueItems", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashSet);
        Assert.assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void answer_givenMapReturningMethod_shouldReturnEmptyMap() throws Exception {
        // Arrange
        Method method = SampleService.class.getMethod("fetchAttributes", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), method);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HashMap);
        Assert.assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void answer_givenToStringMethodOnNonMockObject_shouldThrowException() throws Exception {
        // Arrange
        Method toStringMethod = SampleService.class.getMethod("toString", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), toStringMethod);

        // Act & Assert
        try {
            returnsEmptyValues.answer(invocation);
            Assert.fail("Expected exception when calling toString on non-mock instance");
        } catch (Exception expected) {
            Assert.assertNotNull(expected);
        }
    }
}