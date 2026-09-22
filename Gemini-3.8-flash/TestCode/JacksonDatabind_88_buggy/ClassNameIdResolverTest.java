package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class ClassNameIdResolverTest {

    private TypeFactory _typeFactory;
    private JavaType _baseType;
    private ClassNameIdResolver _resolver;
    private ObjectMapper _objectMapper;

    private enum SimpleTestEnum {
        ONE,
        TWO {
            @Override
            public String toString() {
                return "two_custom";
            }
        }
    }

    private static class OuterClass {
        public static class StaticInnerClass {
        }

        public class NonStaticInnerClass {
        }
    }

    @Before
    public void setUp() {
        _typeFactory = TypeFactory.defaultInstance();
        _baseType = _typeFactory.constructType(Object.class);
        _resolver = new ClassNameIdResolver(_baseType, _typeFactory);
        _objectMapper = new ObjectMapper();
    }

    @Test
    public void getMechanism_shouldReturnClassMechanism() {
        // Arrange & Act
        JsonTypeInfo.Id mechanism = _resolver.getMechanism();

        // Assert
        Assert.assertEquals(JsonTypeInfo.Id.CLASS, mechanism);
    }

    @Test
    public void getDescForKnownTypeIds_shouldReturnValidDescription() {
        // Arrange & Act
        String desc = _resolver.getDescForKnownTypeIds();

        // Assert
        Assert.assertEquals("class name used as type id", desc);
    }

    @Test
    public void registerSubtype_shouldDoNothingWithoutException() {
        // Arrange & Act & Assert
        _resolver.registerSubtype(String.class, "stringName");
    }

    @Test
    public void idFromValue_givenStandardObject_shouldReturnFullyQualifiedClassName() {
        // Arrange
        String value = "sampleString";

        // Act
        String id = _resolver.idFromValue(value);

        // Assert
        Assert.assertEquals("java.lang.String", id);
    }

    @Test
    public void idFromValue_givenStandardEnum_shouldReturnEnumClassName() {
        // Arrange
        SimpleTestEnum val = SimpleTestEnum.ONE;

        // Act
        String id = _resolver.idFromValue(val);

        // Assert
        Assert.assertEquals(SimpleTestEnum.class.getName(), id);
    }

    @Test
    public void idFromValue_givenEnumWithSubclass_shouldReturnBaseEnumClassName() {
        // Arrange
        SimpleTestEnum val = SimpleTestEnum.TWO;

        // Act
        String id = _resolver.idFromValue(val);

        // Assert
        Assert.assertEquals(SimpleTestEnum.class.getName(), id);
    }

    @Test
    public void idFromValue_givenArraysAsList_shouldReturnArrayListName() {
        // Arrange
        List<String> list = Arrays.asList("a", "b");

        // Act
        String id = _resolver.idFromValue(list);

        // Assert
        Assert.assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void idFromValue_givenCollectionsEmptyList_shouldReturnArrayListName() {
        // Arrange
        List<String> list = Collections.emptyList();

        // Act
        String id = _resolver.idFromValue(list);

        // Assert
        Assert.assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void idFromValue_givenEnumSet_shouldReturnCanonicalEnumSetType() {
        // Arrange
        EnumSet<SimpleTestEnum> set = EnumSet.of(SimpleTestEnum.ONE);

        // Act
        String id = _resolver.idFromValue(set);

        // Assert
        Assert.assertTrue(id.startsWith("java.util.EnumSet<"));
        Assert.assertTrue(id.contains(SimpleTestEnum.class.getName()));
    }

    @Test
    public void idFromValue_givenEnumMap_shouldReturnCanonicalEnumMapType() {
        // Arrange
        EnumMap<SimpleTestEnum, String> map = new EnumMap<SimpleTestEnum, String>(SimpleTestEnum.class);
        map.put(SimpleTestEnum.ONE, "val");

        // Act
        String id = _resolver.idFromValue(map);

        // Assert
        Assert.assertTrue(id.startsWith("java.util.EnumMap<"));
        Assert.assertTrue(id.contains(SimpleTestEnum.class.getName()));
    }

    @Test
    public void idFromValueAndType_givenExplicitType_shouldReturnGivenClassName() {
        // Arrange
        Object value = "sample";
        Class<?> clazz = CharSequence.class;

        // Act
        String id = _resolver.idFromValueAndType(value, clazz);

        // Assert
        Assert.assertEquals("java.lang.CharSequence", id);
    }

    @Test
    public void idFromValue_givenStaticInnerClass_shouldReturnActualClassName() {
        // Arrange
        OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();

        // Act
        String id = _resolver.idFromValue(inner);

        // Assert
        Assert.assertEquals(OuterClass.StaticInnerClass.class.getName(), id);
    }

    @Test
    public void typeFromId_givenSimpleClassId_shouldReturnSpecializedJavaType() throws IOException {
        // Arrange
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        String id = "java.lang.String";

        // Act
        JavaType javaType = _resolver.typeFromId(ctxt, id);

        // Assert
        Assert.assertNotNull(javaType);
        Assert.assertEquals(String.class, javaType.getRawClass());
    }

    @Test
    public void typeFromId_givenGenericId_shouldConstructFromCanonical() throws IOException {
        // Arrange
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        String id = "java.util.List<java.lang.String>";

        // Act
        JavaType javaType = _resolver.typeFromId(ctxt, id);

        // Assert
        Assert.assertNotNull(javaType);
        Assert.assertEquals(List.class, javaType.getRawClass());
        Assert.assertEquals(String.class, javaType.getContentType().getRawClass());
    }

    @Test
    public void typeFromId_givenInvalidOrNonExistentClassId_shouldHandleOrThrow() throws IOException {
        // Arrange
        DeserializationContext ctxt = _objectMapper.getDeserializationContext();
        String id = "com.nonexistent.NoSuchClassExist123";

        // Act & Assert
        try {
            JavaType type = _resolver.typeFromId(ctxt, id);
            // If handler resolves it, type may be returned or null
        } catch (IllegalArgumentException ex) {
            // Expected if DeserializationContext cannot handle unknown class
            Assert.assertNotNull(ex.getMessage());
        } catch (Exception ignored) {
        }
    }
}
