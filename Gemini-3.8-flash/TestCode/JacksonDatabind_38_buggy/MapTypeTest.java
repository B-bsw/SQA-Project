package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import org.junit.Assert;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.JavaType;

public class MapTypeTest {

    private static class SubclassMapType extends MapType {
        private static final long serialVersionUID = 1L;

        public SubclassMapType(TypeBase base, JavaType keyT, JavaType valueT) {
            super(base, keyT, valueT);
        }
    }

    @Test
    public void construct_givenBasicTypes_shouldCreateExpectedMapType() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);

        // Act
        MapType mapType = MapType.construct(Map.class, keyType, valueType);

        // Assert
        Assert.assertNotNull(mapType);
        Assert.assertEquals(Map.class, mapType.getRawClass());
        Assert.assertEquals(keyType, mapType.getKeyType());
        Assert.assertEquals(valueType, mapType.getContentType());
        Assert.assertNull(mapType.getValueHandler());
        Assert.assertNull(mapType.getTypeHandler());
        Assert.assertFalse(mapType.useStaticType());
    }

    @Test
    public void construct_givenFullParameters_shouldCreateCompleteMapType() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Object.class);
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInterfaces = new JavaType[] { SimpleType.constructUnsafe(Map.class) };
        TypeBindings bindings = TypeBindings.create(HashMap.class, new JavaType[] { keyType, valueType });

        // Act
        MapType mapType = MapType.construct(HashMap.class, bindings, superClass, superInterfaces, keyType, valueType);

        // Assert
        Assert.assertNotNull(mapType);
        Assert.assertEquals(HashMap.class, mapType.getRawClass());
        Assert.assertEquals(bindings, mapType.getBindings());
        Assert.assertEquals(superClass, mapType.getSuperClass());
        Assert.assertArrayEquals(superInterfaces, mapType.getInterfaces().toArray(new JavaType[0]));
        Assert.assertEquals(keyType, mapType.getKeyType());
        Assert.assertEquals(valueType, mapType.getContentType());
        Assert.assertFalse(mapType.useStaticType());
    }

    @Test
    public void protectedConstructor_givenBaseAndKeyVal_shouldInstantiateCorrectly() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Long.class);
        MapType base = MapType.construct(Map.class, keyType, valueType);

        // Act
        SubclassMapType sub = new SubclassMapType(base, keyType, valueType);

        // Assert
        Assert.assertNotNull(sub);
        Assert.assertEquals(Map.class, sub.getRawClass());
        Assert.assertEquals(keyType, sub.getKeyType());
        Assert.assertEquals(valueType, sub.getContentType());
    }

    @Test
    public void narrow_givenSubclass_shouldReturnNarrowedInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType baseMap = MapType.construct(Map.class, keyType, valueType);

        // Act
        JavaType narrowed = baseMap._narrow(LinkedHashMap.class);

        // Assert
        Assert.assertNotNull(narrowed);
        Assert.assertTrue(narrowed instanceof MapType);
        Assert.assertEquals(LinkedHashMap.class, narrowed.getRawClass());
        Assert.assertEquals(keyType, ((MapType) narrowed).getKeyType());
        Assert.assertEquals(valueType, narrowed.getContentType());
    }

    @Test
    public void withTypeHandler_givenHandler_shouldSetTypeHandler() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customTypeHandler";

        // Act
        MapType result = mapType.withTypeHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getTypeHandler());
        Assert.assertNull(mapType.getTypeHandler());
    }

    @Test
    public void withContentTypeHandler_givenHandler_shouldSetContentTypeHandler() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customContentTypeHandler";

        // Act
        MapType result = mapType.withContentTypeHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getContentType().getTypeHandler());
        Assert.assertNull(mapType.getContentType().getTypeHandler());
    }

    @Test
    public void withValueHandler_givenHandler_shouldSetValueHandler() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customValueHandler";

        // Act
        MapType result = mapType.withValueHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getValueHandler());
        Assert.assertNull(mapType.getValueHandler());
    }

    @Test
    public void withContentValueHandler_givenHandler_shouldSetContentValueHandler() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customContentValueHandler";

        // Act
        MapType result = mapType.withContentValueHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getContentType().getValueHandler());
        Assert.assertNull(mapType.getContentType().getValueHandler());
    }

    @Test
    public void withStaticTyping_whenNotStatic_shouldReturnNewInstanceWithStaticTyping() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);

        // Act
        MapType staticType = mapType.withStaticTyping();

        // Assert
        Assert.assertNotNull(staticType);
        Assert.assertNotSame(mapType, staticType);
        Assert.assertTrue(staticType.useStaticType());
        Assert.assertTrue(staticType.getKeyType().useStaticType());
        Assert.assertTrue(staticType.getContentType().useStaticType());
    }

    @Test
    public void withStaticTyping_whenAlreadyStatic_shouldReturnSameInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(String.class);
        MapType staticType = MapType.construct(Map.class, keyType, valueType).withStaticTyping();

        // Act
        MapType result = staticType.withStaticTyping();

        // Assert
        Assert.assertSame(staticType, result);
    }

    @Test
    public void withContentType_whenSameContentType_shouldReturnSameInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);

        // Act
        JavaType result = mapType.withContentType(valueType);

        // Assert
        Assert.assertSame(mapType, result);
    }

    @Test
    public void withContentType_whenDifferentContentType_shouldReturnNewInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType1 = SimpleType.constructUnsafe(Integer.class);
        JavaType valueType2 = SimpleType.constructUnsafe(Double.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType1);

        // Act
        JavaType result = mapType.withContentType(valueType2);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(valueType2, result.getContentType());
        Assert.assertEquals(keyType, ((MapType) result).getKeyType());
    }

    @Test
    public void withKeyType_whenSameKeyType_shouldReturnSameInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);

        // Act
        MapType result = mapType.withKeyType(keyType);

        // Assert
        Assert.assertSame(mapType, result);
    }

    @Test
    public void withKeyType_whenDifferentKeyType_shouldReturnNewInstance() {
        // Arrange
        JavaType keyType1 = SimpleType.constructUnsafe(String.class);
        JavaType keyType2 = SimpleType.constructUnsafe(Long.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType1, valueType);

        // Act
        MapType result = mapType.withKeyType(keyType2);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(keyType2, result.getKeyType());
        Assert.assertEquals(valueType, result.getContentType());
    }

    @Test
    public void refine_givenNewParameters_shouldReturnRefinedInstance() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Object.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        JavaType newSuperClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] newSuperInts = new JavaType[] { SimpleType.constructUnsafe(Map.class) };
        TypeBindings newBindings = TypeBindings.create(HashMap.class, new JavaType[] { keyType, valueType });

        // Act
        JavaType refined = mapType.refine(HashMap.class, newBindings, newSuperClass, newSuperInts);

        // Assert
        Assert.assertNotNull(refined);
        Assert.assertTrue(refined instanceof MapType);
        Assert.assertEquals(HashMap.class, refined.getRawClass());
        Assert.assertEquals(newBindings, refined.getBindings());
        Assert.assertEquals(newSuperClass, refined.getSuperClass());
        Assert.assertEquals(keyType, ((MapType) refined).getKeyType());
        Assert.assertEquals(valueType, refined.getContentType());
    }

    @Test
    public void withKeyTypeHandler_givenHandler_shouldSetHandlerOnKeyType() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customKeyTypeHandler";

        // Act
        MapType result = mapType.withKeyTypeHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getKeyType().getTypeHandler());
        Assert.assertNull(mapType.getKeyType().getTypeHandler());
    }

    @Test
    public void withKeyValueHandler_givenHandler_shouldSetHandlerOnKeyType() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);
        Object handler = "customKeyValueHandler";

        // Act
        MapType result = mapType.withKeyValueHandler(handler);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(mapType, result);
        Assert.assertEquals(handler, result.getKeyType().getValueHandler());
        Assert.assertNull(mapType.getKeyType().getValueHandler());
    }

    @Test
    public void toString_givenValidMapType_shouldReturnFormattedString() {
        // Arrange
        JavaType keyType = SimpleType.constructUnsafe(String.class);
        JavaType valueType = SimpleType.constructUnsafe(Integer.class);
        MapType mapType = MapType.construct(Map.class, keyType, valueType);

        // Act
        String stringVal = mapType.toString();

        // Assert
        Assert.assertNotNull(stringVal);
        String expected = "[map type; class " + Map.class.getName() + ", " + keyType.toString() + " -> " + valueType.toString() + "]";
        Assert.assertEquals(expected, stringVal);
    }
}