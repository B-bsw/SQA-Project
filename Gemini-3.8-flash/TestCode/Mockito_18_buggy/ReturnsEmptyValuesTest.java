package org.mockito.internal.stubbing.defaultanswers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockName;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object[] args) {
        return new InvocationOnMock() {
            public Object getMock() {
                return mock;
            }

            public Method getMethod() {
                return method;
            }

            public Object[] getArguments() {
                return args != null ? args : new Object[0];
            }

            public Object callRealMethod() throws Throwable {
                return null;
            }
        };
    }

    @Test
    public void returnValueFor_givenBooleanPrimitive_shouldReturnFalse() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(boolean.class);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void returnValueFor_givenBooleanWrapper_shouldReturnFalse() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Boolean.class);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void returnValueFor_givenBytePrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(byte.class);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void returnValueFor_givenByteWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Byte.class);

        // Assert
        Assert.assertEquals(Byte.valueOf((byte) 0), result);
    }

    @Test
    public void returnValueFor_givenCharPrimitive_shouldReturnZeroChar() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(char.class);

        // Assert
        Assert.assertEquals(Character.valueOf((char) 0), result);
    }

    @Test
    public void returnValueFor_givenCharWrapper_shouldReturnZeroChar() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Character.class);

        // Assert
        Assert.assertEquals(Character.valueOf((char) 0), result);
    }

    @Test
    public void returnValueFor_givenShortPrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(short.class);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void returnValueFor_givenShortWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Short.class);

        // Assert
        Assert.assertEquals(Short.valueOf((short) 0), result);
    }

    @Test
    public void returnValueFor_givenIntPrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(int.class);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void returnValueFor_givenIntWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Integer.class);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void returnValueFor_givenLongPrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(long.class);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void returnValueFor_givenLongWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Long.class);

        // Assert
        Assert.assertEquals(Long.valueOf(0L), result);
    }

    @Test
    public void returnValueFor_givenFloatPrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(float.class);

        // Assert
        Assert.assertEquals(Float.valueOf(0.0F), result);
    }

    @Test
    public void returnValueFor_givenFloatWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Float.class);

        // Assert
        Assert.assertEquals(Float.valueOf(0.0F), result);
    }

    @Test
    public void returnValueFor_givenDoublePrimitive_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(double.class);

        // Assert
        Assert.assertEquals(Double.valueOf(0.0D), result);
    }

    @Test
    public void returnValueFor_givenDoubleWrapper_shouldReturnZero() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Double.class);

        // Assert
        Assert.assertEquals(Double.valueOf(0.0D), result);
    }

    @Test
    public void returnValueFor_givenCollectionInterface_shouldReturnEmptyLinkedList() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Collection.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(LinkedList.class, result.getClass());
        Assert.assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSetInterface_shouldReturnEmptyHashSet() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Set.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(HashSet.class, result.getClass());
        Assert.assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenHashSetClass_shouldReturnEmptyHashSet() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(HashSet.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(HashSet.class, result.getClass());
        Assert.assertTrue(((HashSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSortedSetInterface_shouldReturnEmptyTreeSet() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(SortedSet.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(TreeSet.class, result.getClass());
        Assert.assertTrue(((SortedSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenTreeSetClass_shouldReturnEmptyTreeSet() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(TreeSet.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(TreeSet.class, result.getClass());
        Assert.assertTrue(((TreeSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedHashSetClass_shouldReturnEmptyLinkedHashSet() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(LinkedHashSet.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(LinkedHashSet.class, result.getClass());
        Assert.assertTrue(((LinkedHashSet<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenListInterface_shouldReturnEmptyLinkedList() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(List.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(LinkedList.class, result.getClass());
        Assert.assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedListClass_shouldReturnEmptyLinkedList() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(LinkedList.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(LinkedList.class, result.getClass());
        Assert.assertTrue(((LinkedList<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenArrayListClass_shouldReturnEmptyArrayList() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(ArrayList.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(ArrayList.class, result.getClass());
        Assert.assertTrue(((ArrayList<?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenMapInterface_shouldReturnEmptyHashMap() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(Map.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(HashMap.class, result.getClass());
        Assert.assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenHashMapClass_shouldReturnEmptyHashMap() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(HashMap.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(HashMap.class, result.getClass());
        Assert.assertTrue(((HashMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenSortedMapInterface_shouldReturnEmptyTreeMap() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(SortedMap.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(TreeMap.class, result.getClass());
        Assert.assertTrue(((SortedMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenTreeMapClass_shouldReturnEmptyTreeMap() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(TreeMap.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(TreeMap.class, result.getClass());
        Assert.assertTrue(((TreeMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenLinkedHashMapClass_shouldReturnEmptyLinkedHashMap() {
        // Arrange & Act
        Object result = returnsEmptyValues.returnValueFor(LinkedHashMap.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(LinkedHashMap.class, result.getClass());
        Assert.assertTrue(((LinkedHashMap<?, ?>) result).isEmpty());
    }

    @Test
    public void returnValueFor_givenUnsupportedType_shouldReturnNull() {
        // Arrange & Act
        Object stringResult = returnsEmptyValues.returnValueFor(String.class);
        Object objectResult = returnsEmptyValues.returnValueFor(Object.class);
        Object interfaceResult = returnsEmptyValues.returnValueFor(Comparable.class);

        // Assert
        Assert.assertNull(stringResult);
        Assert.assertNull(objectResult);
        Assert.assertNull(interfaceResult);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void returnValueFor_givenReturnedCollections_shouldBeMutable() {
        // Arrange & Act
        Collection<Object> collection = (Collection<Object>) returnsEmptyValues.returnValueFor(Collection.class);
        List<Object> list = (List<Object>) returnsEmptyValues.returnValueFor(List.class);
        Set<Object> set = (Set<Object>) returnsEmptyValues.returnValueFor(Set.class);
        Map<Object, Object> map = (Map<Object, Object>) returnsEmptyValues.returnValueFor(Map.class);

        // Assert
        collection.add("element1");
        list.add("element2");
        set.add("element3");
        map.put("key", "value");

        Assert.assertEquals(1, collection.size());
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(1, set.size());
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void answer_givenCompareToMethodWithSameReference_shouldReturnZero() throws Exception {
        // Arrange
        Method compareToMethod = Comparable.class.getMethod("compareTo", new Class[] { Object.class });
        Object mock = new Object();
        InvocationOnMock invocation = createInvocation(mock, compareToMethod, new Object[] { mock });

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenCompareToMethodWithDifferentReference_shouldReturnOne() throws Exception {
        // Arrange
        Method compareToMethod = Comparable.class.getMethod("compareTo", new Class[] { Object.class });
        Object mock = new Object();
        Object other = new Object();
        InvocationOnMock invocation = createInvocation(mock, compareToMethod, new Object[] { other });

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Integer.valueOf(1), result);
    }

    @Test
    public void answer_givenToStringMethodWithNonDefaultMockName_shouldReturnMockNameToString() throws Exception {
        // Arrange
        Method toStringMethod = Object.class.getMethod("toString", new Class[0]);
        Object mock = new Object();
        final String expectedName = "myCustomMock";

        returnsEmptyValues.mockUtil = new MockUtil() {
            public MockName getMockName(Object m) {
                return new MockName() {
                    public boolean isDefault() {
                        return false;
                    }

                    public String toString() {
                        return expectedName;
                    }
                };
            }
        };

        InvocationOnMock invocation = createInvocation(mock, toStringMethod, new Object[0]);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(expectedName, result);
    }

    @Test
    public void answer_givenMethodReturningPrimitiveInt_shouldReturnZero() throws Exception {
        // Arrange
        Method sizeMethod = List.class.getMethod("size", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), sizeMethod, new Object[0]);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertEquals(Integer.valueOf(0), result);
    }

    @Test
    public void answer_givenMethodReturningCollection_shouldReturnEmptyCollection() throws Exception {
        // Arrange
        Method keySetMethod = Map.class.getMethod("keySet", new Class[0]);
        InvocationOnMock invocation = createInvocation(new Object(), keySetMethod, new Object[0]);

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(HashSet.class, result.getClass());
        Assert.assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void answer_givenMethodReturningObject_shouldReturnNull() throws Exception {
        // Arrange
        Method getMethod = List.class.getMethod("get", new Class[] { int.class });
        InvocationOnMock invocation = createInvocation(new Object(), getMethod, new Object[] { Integer.valueOf(0) });

        // Act
        Object result = returnsEmptyValues.answer(invocation);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void returnsEmptyValues_givenSerialization_shouldDeserializeSuccessfully() throws Exception {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsEmptyValues);
        oos.close();

        // Act
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof ReturnsEmptyValues);
    }
}