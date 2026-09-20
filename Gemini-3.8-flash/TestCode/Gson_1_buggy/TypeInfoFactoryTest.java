package com.google.gson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link TypeInfoFactory}.
 */
public class TypeInfoFactoryTest {

  // Test helper classes
  private static class SimpleClass {
    private int primitiveField;
    private String stringField;
  }

  private static class GenericHolder<T> {
    private T genericField;
    private T[] genericArrayField;
    private List<T> genericListField;
  }

  private static class MultiGenericHolder<K, V> {
    private K keyField;
    private V valueField;
    private Map<K, V> mapField;
  }

  private static class WildcardHolder {
    private List<? extends Number> boundedWildcardField;
  }

  private static class ArrayHolder {
    private List<String>[] parameterizedArrayField;
  }

  private static class CustomParameterizedType implements ParameterizedType {
    private final Type rawType;
    private final Type[] actualTypeArguments;
    private final Type ownerType;

    public CustomParameterizedType(Type rawType, Type[] actualTypeArguments, Type ownerType) {
      this.rawType = rawType;
      this.actualTypeArguments = actualTypeArguments;
      this.ownerType = ownerType;
    }

    public Type[] getActualTypeArguments() {
      return actualTypeArguments;
    }

    public Type getRawType() {
      return rawType;
    }

    public Type getOwnerType() {
      return ownerType;
    }
  }

  private static class CustomUnknownType implements Type {
  }

  private static class CustomGenericArrayType implements GenericArrayType {
    private final Type componentType;

    public CustomGenericArrayType(Type componentType) {
      this.componentType = componentType;
    }

    public Type getGenericComponentType() {
      return componentType;
    }
  }

  @Test
  public void constructor_shouldBeInvokableViaReflection() throws Exception {
    Constructor<TypeInfoFactory> constructor = TypeInfoFactory.class.getDeclaredConstructor(new Class<?>[0]);
    constructor.setAccessible(true);
    TypeInfoFactory instance = constructor.newInstance(new Object[0]);
    Assert.assertNotNull(instance);
  }

  @Test
  public void getTypeInfoForArray_givenValidArrayClass_shouldReturnTypeInfoArray() {
    // Arrange
    Type arrayType = String[].class;

    // Act
    TypeInfoArray result = TypeInfoFactory.getTypeInfoForArray(arrayType);

    // Assert
    Assert.assertNotNull(result);
    Assert.assertEquals(String[].class, result.getRawClass());
  }

  @Test
  public void getTypeInfoForArray_givenNonArrayType_shouldThrowException() {
    // Arrange
    Type nonArrayType = String.class;

    // Act & Assert
    try {
      TypeInfoFactory.getTypeInfoForArray(nonArrayType);
      Assert.fail("Expected IllegalArgumentException for non-array type");
    } catch (IllegalArgumentException expected) {
      Assert.assertNotNull(expected);
    }
  }

  @Test
  public void getTypeInfoForField_givenPrimitiveAndStandardClasses_shouldResolveCorrectTypes() throws Exception {
    // Arrange
    Field intField = SimpleClass.class.getDeclaredField("primitiveField");
    Field stringField = SimpleClass.class.getDeclaredField("stringField");

    // Act
    TypeInfo intInfo = TypeInfoFactory.getTypeInfoForField(intField, SimpleClass.class);
    TypeInfo stringInfo = TypeInfoFactory.getTypeInfoForField(stringField, SimpleClass.class);

    // Assert
    Assert.assertEquals(int.class, intInfo.getActualType());
    Assert.assertEquals(String.class, stringInfo.getActualType());
  }

  @Test
  public void getTypeInfoForField_givenParameterizedTypeDefiningClass_shouldResolveTypeVariable() throws Exception {
    // Arrange
    Field genericField = GenericHolder.class.getDeclaredField("genericField");
    Type parameterizedParentType = new CustomParameterizedType(
        GenericHolder.class,
        new Type[] { String.class },
        null
    );

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(genericField, parameterizedParentType);

    // Assert
    Assert.assertEquals(String.class, typeInfo.getActualType());
  }

  @Test
  public void getTypeInfoForField_givenMultipleTypeVariables_shouldResolveCorrectIndex() throws Exception {
    // Arrange
    Field keyField = MultiGenericHolder.class.getDeclaredField("keyField");
    Field valueField = MultiGenericHolder.class.getDeclaredField("valueField");
    Type parameterizedParentType = new CustomParameterizedType(
        MultiGenericHolder.class,
        new Type[] { String.class, Integer.class },
        null
    );

    // Act
    TypeInfo keyInfo = TypeInfoFactory.getTypeInfoForField(keyField, parameterizedParentType);
    TypeInfo valueInfo = TypeInfoFactory.getTypeInfoForField(valueField, parameterizedParentType);

    // Assert
    Assert.assertEquals(String.class, keyInfo.getActualType());
    Assert.assertEquals(Integer.class, valueInfo.getActualType());
  }

  @Test
  public void getTypeInfoForField_givenNestedParameterizedField_shouldResolveTypeArguments() throws Exception {
    // Arrange
    Field listField = GenericHolder.class.getDeclaredField("genericListField");
    Type parameterizedParentType = new CustomParameterizedType(
        GenericHolder.class,
        new Type[] { Long.class },
        null
    );

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(listField, parameterizedParentType);

    // Assert
    Assert.assertTrue(typeInfo.getActualType() instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) typeInfo.getActualType();
    Assert.assertEquals(List.class, pt.getRawType());
    Assert.assertEquals(1, pt.getActualTypeArguments().length);
    Assert.assertEquals(Long.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void getTypeInfoForField_givenGenericArrayResolvingToClass_shouldReturnWrappedClassArray() throws Exception {
    // Arrange
    Field genericArrayField = GenericHolder.class.getDeclaredField("genericArrayField");
    Type parameterizedParentType = new CustomParameterizedType(
        GenericHolder.class,
        new Type[] { Integer.class },
        null
    );

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(genericArrayField, parameterizedParentType);

    // Assert
    Assert.assertEquals(Integer[].class, typeInfo.getActualType());
  }

  @Test
  public void getTypeInfoForField_givenGenericArrayResolvingToParameterizedType_shouldReturnGenericArrayTypeImpl() throws Exception {
    // Arrange
    Field genericArrayField = GenericHolder.class.getDeclaredField("genericArrayField");
    Type innerListType = new CustomParameterizedType(
        List.class,
        new Type[] { String.class },
        null
    );
    Type parameterizedParentType = new CustomParameterizedType(
        GenericHolder.class,
        new Type[] { innerListType },
        null
    );

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(genericArrayField, parameterizedParentType);

    // Assert
    Assert.assertTrue(typeInfo.getActualType() instanceof GenericArrayType);
    GenericArrayType arrayType = (GenericArrayType) typeInfo.getActualType();
    Assert.assertTrue(arrayType.getGenericComponentType() instanceof ParameterizedType);
  }

  @Test
  public void getTypeInfoForField_givenGenericArrayFieldWithSameComponentType_shouldReturnSameGenericArrayType() throws Exception {
    // Arrange
    Field field = ArrayHolder.class.getDeclaredField("parameterizedArrayField");

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(field, ArrayHolder.class);

    // Assert
    Assert.assertTrue(typeInfo.getActualType() instanceof GenericArrayType);
    GenericArrayType arrayType = (GenericArrayType) typeInfo.getActualType();
    Assert.assertTrue(arrayType.getGenericComponentType() instanceof ParameterizedType);
  }

  @Test
  public void getTypeInfoForField_givenWildcardTypeField_shouldResolveUpperBound() throws Exception {
    // Arrange
    Field wildcardField = WildcardHolder.class.getDeclaredField("boundedWildcardField");

    // Act
    TypeInfo typeInfo = TypeInfoFactory.getTypeInfoForField(wildcardField, WildcardHolder.class);

    // Assert
    Assert.assertTrue(typeInfo.getActualType() instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) typeInfo.getActualType();
    Assert.assertEquals(1, pt.getActualTypeArguments().length);
    Assert.assertEquals(Number.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void getTypeInfoForField_givenTypeVariableWithRawParentClass_shouldThrowUnsupportedOperationException() throws Exception {
    // Arrange
    Field genericField = GenericHolder.class.getDeclaredField("genericField");

    // Act & Assert
    try {
      TypeInfoFactory.getTypeInfoForField(genericField, GenericHolder.class);
      Assert.fail("Expected UnsupportedOperationException when parentType is not ParameterizedType");
    } catch (UnsupportedOperationException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Expecting parameterized type") != -1);
    }
  }

  @Test
  public void getTypeInfoForField_givenTypeVariableMissingInParentClassDeclaration_shouldThrowIllegalStateException() throws Exception {
    // Arrange
    Field genericField = GenericHolder.class.getDeclaredField("genericField");
    Type mismatchedParentType = new CustomParameterizedType(
        SimpleClass.class,
        new Type[] { String.class },
        null
    );

    // Act & Assert
    try {
      TypeInfoFactory.getTypeInfoForField(genericField, mismatchedParentType);
      Assert.fail("Expected IllegalStateException when TypeVariable is not found in class declaration");
    } catch (IllegalStateException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("How can the type variable not be present") != -1);
    }
  }

  @Test
  public void getTypeInfoForField_givenUnsupportedType_shouldThrowIllegalArgumentException() throws Exception {
    // Arrange
    final Type customUnknown = new CustomUnknownType();
    Type customParameterized = new CustomParameterizedType(
        GenericHolder.class,
        new Type[] { customUnknown },
        null
    ) {
      public Type[] getActualTypeArguments() {
        return new Type[] { customUnknown };
      }
    };
    Field genericField = GenericHolder.class.getDeclaredField("genericField");

    // Act & Assert
    try {
      TypeInfoFactory.getTypeInfoForField(genericField, customParameterized);
      Assert.fail("Expected IllegalArgumentException for unknown Type implementation");
    } catch (IllegalArgumentException expected) {
      Assert.assertTrue(expected.getMessage().indexOf("Can't extract type") != -1);
    }
  }
}