package com.google.gson;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

public class TypeInfoFactoryTest {

  // ---------- Helper classes used for reflection-based type extraction ----------

  static class SimpleClass {
    String name;
  }

  static class Box<T> {
    T value;
    T[] values;
    List<String> stringList;
    List<? extends Number> wildcardList;
    List<T> genericList;
  }

  static class StringBox extends Box<String> {
  }

  static class ListStringBox extends Box<List<String>> {
  }

  static class MultiParam<A, B, C> {
  }

  private static Method getActualTypeMethod;
  private static Method extractRealTypesMethod;
  private static Method getIndexMethod;

  static {
    try {
      getActualTypeMethod = TypeInfoFactory.class.getDeclaredMethod(
          "getActualType", Type.class, Type.class, Class.class);
      getActualTypeMethod.setAccessible(true);

      extractRealTypesMethod = TypeInfoFactory.class.getDeclaredMethod(
          "extractRealTypes", Type[].class, Type.class, Class.class);
      extractRealTypesMethod.setAccessible(true);

      getIndexMethod = TypeInfoFactory.class.getDeclaredMethod(
          "getIndex", TypeVariable[].class, TypeVariable.class);
      getIndexMethod.setAccessible(true);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static Type invokeGetActualType(Type typeToEvaluate, Type parentType, Class<?> rawParentClass)
      throws Throwable {
    try {
      return (Type) getActualTypeMethod.invoke(null, typeToEvaluate, parentType, rawParentClass);
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  private static Type[] invokeExtractRealTypes(
      Type[] actualTypeArguments, Type parentType, Class<?> rawParentClass) throws Throwable {
    try {
      return (Type[]) extractRealTypesMethod.invoke(null, actualTypeArguments, parentType, rawParentClass);
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  private static int invokeGetIndex(TypeVariable<?>[] types, TypeVariable<?> type) throws Throwable {
    try {
      return (Integer) getIndexMethod.invoke(null, types, type);
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  private static Type extractActualType(Object typeInfo) throws Exception {
    try {
      Method m = typeInfo.getClass().getMethod("getType");
      return (Type) m.invoke(typeInfo);
    } catch (NoSuchMethodException e) {
      Class<?> c = typeInfo.getClass();
      while (c != null) {
        try {
          Field f = c.getDeclaredField("type");
          f.setAccessible(true);
          return (Type) f.get(typeInfo);
        } catch (NoSuchFieldException ex) {
          c = c.getSuperclass();
        }
      }
      throw new RuntimeException("Could not extract type from " + typeInfo);
    }
  }

  // ---------- getTypeInfoForArray tests ----------

  @Test
  public void testGetTypeInfoForArray_StringArray() throws Throwable {
    TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(String[].class);
    assertNotNull(info);
  }

  @Test
  public void testGetTypeInfoForArray_PrimitiveIntArray() throws Throwable {
    TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(int[].class);
    assertNotNull(info);
  }

  @Test
  public void testGetTypeInfoForArray_MultiDimensionalArray() throws Throwable {
    TypeInfoArray info = TypeInfoFactory.getTypeInfoForArray(int[][].class);
    assertNotNull(info);
  }

  @Test
  public void testGetTypeInfoForArray_NonArrayThrows() throws Throwable {
    try {
      TypeInfoFactory.getTypeInfoForArray(String.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // ok
    }
  }

  @Test
  public void testGetTypeInfoForArray_NullThrows() throws Throwable {
    try {
      TypeInfoFactory.getTypeInfoForArray(null);
      fail("Expected exception for null input");
    } catch (RuntimeException expected) {
      assertTrue(expected instanceof NullPointerException
          || expected instanceof IllegalArgumentException);
    }
  }

  // ---------- getTypeInfoForField tests ----------

  @Test
  public void testGetTypeInfoForField_SimpleClassField() throws Throwable {
    Field f = SimpleClass.class.getDeclaredField("name");
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, SimpleClass.class);
    assertNotNull(info);
    Type actual = extractActualType(info);
    assertEquals(String.class, actual);
  }

  @Test
  public void testGetTypeInfoForField_TypeVariableResolved() throws Throwable {
    Field f = Box.class.getDeclaredField("value");
    ParameterizedType parentType = (ParameterizedType) StringBox.class.getGenericSuperclass();
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, parentType);
    Type actual = extractActualType(info);
    assertEquals(String.class, actual);
  }

  @Test
  public void testGetTypeInfoForField_TypeVariableUnresolved_Throws() throws Throwable {
    Field f = Box.class.getDeclaredField("value");
    try {
      TypeInfoFactory.getTypeInfoForField(f, Box.class);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      // ok
    }
  }

  @Test
  public void testGetTypeInfoForField_ParameterizedTypeField() throws Throwable {
    Field f = Box.class.getDeclaredField("stringList");
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, Box.class);
    Type actual = extractActualType(info);
    assertTrue(actual instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) actual;
    assertEquals(List.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test
  public void testGetTypeInfoForField_GenericArrayField() throws Throwable {
    Field f = Box.class.getDeclaredField("values");
    ParameterizedType parentType = (ParameterizedType) StringBox.class.getGenericSuperclass();
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, parentType);
    Type actual = extractActualType(info);
    assertEquals(String[].class, actual);
  }

  @Test
  public void testGetTypeInfoForField_WildcardField() throws Throwable {
    Field f = Box.class.getDeclaredField("wildcardList");
    TypeInfo info = TypeInfoFactory.getTypeInfoForField(f, Box.class);
    Type actual = extractActualType(info);
    assertTrue(actual instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) actual;
    assertEquals(List.class, pt.getRawType());
    assertEquals(Number.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void testGetTypeInfoForField_NullFieldThrows() throws Throwable {
    try {
      TypeInfoFactory.getTypeInfoForField(null, String.class);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // ok
    }
  }

  // ---------- getActualType (private) tests via reflection ----------

  @Test
  public void testGetActualType_ClassBranch() throws Throwable {
    Type result = invokeGetActualType(String.class, null, null);
    assertEquals(String.class, result);
  }

  @Test
  public void testGetActualType_ParameterizedTypeBranch() throws Throwable {
    Field f = Box.class.getDeclaredField("stringList");
    ParameterizedType pt = (ParameterizedType) f.getGenericType();
    Type result = invokeGetActualType(pt, null, null);
    assertTrue(result instanceof ParameterizedType);
    ParameterizedType resultPt = (ParameterizedType) result;
    assertEquals(List.class, resultPt.getRawType());
    assertArrayEquals(new Type[] { String.class }, resultPt.getActualTypeArguments());
    assertNull(resultPt.getOwnerType());
  }

  @Test
  public void testGetActualType_GenericArrayType_Unchanged() throws Throwable {
    final GenericArrayType customArray = new GenericArrayType() {
      public Type getGenericComponentType() {
        return String.class;
      }
    };
    Type result = invokeGetActualType(customArray, null, null);
    assertSame(customArray, result);
  }

  @Test
  public void testGetActualType_GenericArrayType_WrapClass() throws Throwable {
    Field f = Box.class.getDeclaredField("values");
    Type fieldType = f.getGenericType();
    ParameterizedType parentType = (ParameterizedType) StringBox.class.getGenericSuperclass();
    Type result = invokeGetActualType(fieldType, parentType, Box.class);
    assertEquals(String[].class, result);
  }

  @Test
  public void testGetActualType_GenericArrayType_WrapNonClass() throws Throwable {
    Field f = Box.class.getDeclaredField("values");
    Type fieldType = f.getGenericType();
    ParameterizedType parentType = (ParameterizedType) ListStringBox.class.getGenericSuperclass();
    Type result = invokeGetActualType(fieldType, parentType, Box.class);
    assertTrue(result instanceof GenericArrayType);
    Type componentType = ((GenericArrayType) result).getGenericComponentType();
    assertTrue(componentType instanceof ParameterizedType);
    assertEquals(List.class, ((ParameterizedType) componentType).getRawType());
  }

  @Test
  public void testGetActualType_TypeVariable_Resolved() throws Throwable {
    TypeVariable<?> tv = Box.class.getTypeParameters()[0];
    ParameterizedType parentType = (ParameterizedType) StringBox.class.getGenericSuperclass();
    Type result = invokeGetActualType(tv, parentType, Box.class);
    assertEquals(String.class, result);
  }

  @Test
  public void testGetActualType_TypeVariable_Unresolved_Throws() throws Throwable {
    TypeVariable<?> tv = Box.class.getTypeParameters()[0];
    try {
      invokeGetActualType(tv, Box.class, Box.class);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      // ok
    }
  }

  @Test
  public void testGetActualType_WildcardType() throws Throwable {
    Field f = Box.class.getDeclaredField("wildcardList");
    ParameterizedType pt = (ParameterizedType) f.getGenericType();
    WildcardType wt = (WildcardType) pt.getActualTypeArguments()[0];
    Type result = invokeGetActualType(wt, null, null);
    assertEquals(Number.class, result);
  }

  @Test
  public void testGetActualType_UnknownType_Throws() throws Throwable {
    Type invalidType = new Type() {
    };
    try {
      invokeGetActualType(invalidType, null, null);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // ok
    }
  }

  // ---------- extractRealTypes (private) tests ----------

  @Test
  public void testExtractRealTypes_Empty() throws Throwable {
    Type[] result = invokeExtractRealTypes(new Type[0], null, null);
    assertEquals(0, result.length);
  }

  @Test
  public void testExtractRealTypes_Single() throws Throwable {
    Type[] result = invokeExtractRealTypes(new Type[] { String.class }, null, null);
    assertArrayEquals(new Type[] { String.class }, result);
  }

  @Test
  public void testExtractRealTypes_Multiple() throws Throwable {
    Type[] input = new Type[] { String.class, Integer.class, Double.class };
    Type[] result = invokeExtractRealTypes(input, null, null);
    assertArrayEquals(input, result);
  }

  @Test
  public void testExtractRealTypes_NullThrows() throws Throwable {
    try {
      invokeExtractRealTypes(null, null, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException expected) {
      // ok
    }
  }

  // ---------- getIndex (private) tests ----------

  @Test
  public void testGetIndex_FoundFirst() throws Throwable {
    TypeVariable<?>[] vars = MultiParam.class.getTypeParameters();
    int idx = invokeGetIndex(vars, vars[0]);
    assertEquals(0, idx);
  }

  @Test
  public void testGetIndex_FoundLast() throws Throwable {
    TypeVariable<?>[] vars = MultiParam.class.getTypeParameters();
    int idx = invokeGetIndex(vars, vars[2]);
    assertEquals(2, idx);
  }

  @Test
  public void testGetIndex_NotFound_Throws() throws Throwable {
    TypeVariable<?>[] vars = MultiParam.class.getTypeParameters();
    TypeVariable<?> foreign = Box.class.getTypeParameters()[0];
    try {
      invokeGetIndex(vars, foreign);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      // ok
    }
  }
}