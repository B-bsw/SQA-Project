package com.fasterxml.jackson.databind;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;
    private TypeFactory defaultFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        defaultFactory = TypeFactory.defaultInstance();
    }

    @After
    public void tearDown() {
        typeFactory = null;
        defaultFactory = null;
    }

    @Test
    public void testWithModifierNull() {
        TypeFactory result = typeFactory.withModifier(null);
        assertNotNull(result);
        assertSame(typeFactory, result);
    }

    @Test
    public void testWithModifierValid() {
        TypeModifier mod = new TypeModifier() {
            public JavaType modifyType(JavaType type, TypeBindings bindings, TypeFactory typeFactory, Class<?> context) {
                return type;
            }
        };
        TypeFactory result = typeFactory.withModifier(mod);
        assertNotNull(result);
    }

    @Test
    public void testDefaultInstance() {
        TypeFactory instance = TypeFactory.defaultInstance();
        assertNotNull(instance);
        assertSame(instance, TypeFactory.defaultInstance());
    }

    @Test
    public void testRawClassWithClass() {
        Class<?> result = TypeFactory.rawClass(String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testRawClassWithParameterizedType() throws Exception {
        Type type = new TypeReference<Map<String, Integer>>() {}.getType();
        Class<?> result = TypeFactory.rawClass(type);
        assertEquals(Map.class, result);
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType baseType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, String.class);
        assertSame(baseType, result);
    }

    @Test
    public void testConstructSpecializedTypeValidSubclass() {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType result = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testFindTypeParametersForClass() {
        JavaType[] result = typeFactory.findTypeParameters(List.class, Collection.class);
        assertNull(result);
    }

    @Test
    public void testMoreSpecificTypeNullFirst() {
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificTypeNullSecond() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testConstructTypeWithClass() {
        JavaType result = typeFactory.constructType(String.class);
        assertNotNull(result);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructTypeWithParameterizedType() {
        Type type = new TypeReference<Map<String, Integer>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
        assertTrue(result.isMapType());
    }

    @Test
    public void testConstructArrayTypeWithClass() {
        ArrayType result = typeFactory.constructArrayType(String.class);
        assertNotNull(result);
        assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithClass() {
        CollectionType result = typeFactory.constructCollectionType(List.class, String.class);
        assertNotNull(result);
        assertEquals(List.class, result.getRawClass());
    }

    @Test
    public void testConstructMapTypeWithClasses() {
        MapType result = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(result);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSimpleTypeWithParameters() {
        JavaType result = typeFactory.constructSimpleType(Map.class, Map.Entry.class, new JavaType[]{
            typeFactory.constructType(String.class), typeFactory.constructType(Integer.class)
        });
        assertNotNull(result);
    }

    @Test
    public void testConstructReferenceType() {
        JavaType refType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructReferenceType(AtomicReference.class, refType);
        assertNotNull(result);
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType result = typeFactory.uncheckedSimpleType(MyClass.class);
        assertNotNull(result);
        assertEquals(MyClass.class, result.getRawClass());
    }

    @Test
    public void testConstructParametrizedType() {
        JavaType result = typeFactory.constructParametrizedType(MyParamClass.class, MyParamClass.class, String.class);
        assertNotNull(result);
    }

    @Test
    public void testConstructParametricTypeWithMap() {
        JavaType result = typeFactory.constructParametricType(HashMap.class, String.class, Integer.class);
        assertNotNull(result);
        assertTrue(result.isMapType());
    }

    @Test
    public void testConstructParametricTypeWithCollection() {
        JavaType result = typeFactory.constructParametricType(ArrayList.class, String.class);
        assertNotNull(result);
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType result = typeFactory.constructRawCollectionType(ArrayList.class);
        assertNotNull(result);
    }

    @Test
    public void testConstructRawMapType() {
        MapType result = typeFactory.constructRawMapType(HashMap.class);
        assertNotNull(result);
    }

    @Test
    public void testConstructMapTypeWithUnknownTypes() {
        MapType result = typeFactory.constructMapType(HashMap.class, typeFactory.unknownType(), typeFactory.unknownType());
        assertNotNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricTypeInvalidArray() {
        typeFactory.constructParametricType(int[].class, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricTypeInvalidMapParamCount() {
        typeFactory.constructParametricType(HashMap.class, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametricTypeInvalidCollectionParamCount() {
        typeFactory.constructParametricType(ArrayList.class, String.class, Integer.class);
    }

    @Test
    public void testConstructTypeWithGenericArrayType() throws Exception {
        Type type = new TypeReference<List<String>[]>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testConstructTypeWithTypeVariable() throws Exception {
        Type type = new TypeReference<MyGeneric<String>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testConstructTypeWithWildcardType() throws Exception {
        Type type = new TypeReference<List<? extends Number>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testClearCache() {
        typeFactory.clearCache();
        assertNotNull(typeFactory);
    }

    @Test
    public void testConstructTypeWithJavaType() {
        JavaType existingType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructType((Type) existingType, (TypeBindings) null);
        assertSame(existingType, result);
    }

    @Test
    public void testConstructMapTypeWithGenericClass() throws Exception {
        Type type = new TypeReference<MyMap<String, Integer>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testConstructCollectionTypeWithGenericClass() throws Exception {
        Type type = new TypeReference<MyCollection<String>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testFindTypeParametersWithType() throws Exception {
        Type type = new TypeReference<MyParamClass<String>>() {}.getType();
        JavaType javaType = typeFactory.constructType(type);
        JavaType[] result = typeFactory.findTypeParameters(javaType, MyParamClass.class);
        assertNotNull(result);
    }

    @Test
    public void testWithModifierWhenModifiersNotNull() {
        TypeModifier mod = new TypeModifier() {
            public JavaType modifyType(JavaType type, TypeBindings bindings, TypeFactory typeFactory, Class<?> context) {
                return type;
            }
        };
        TypeFactory result = typeFactory.withModifier(mod);
        TypeFactory secondResult = result.withModifier(mod);
        assertNotNull(secondResult);
    }

    @Test
    public void testConstructTypeWithParameterizedTypeInClass() throws Exception {
        Type type = new TypeReference<MyParamClass<List<String>>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testConstructArrayTypeWithJavaType() {
        JavaType elementType = typeFactory.constructType(String.class);
        ArrayType result = typeFactory.constructArrayType(elementType);
        assertNotNull(result);
    }

    @Test
    public void testConstructSimpleTypeWithMismatchedParams() {
        try {
            typeFactory.constructSimpleType(MyParamClass.class, MyParamClass.class, new JavaType[0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testConstructTypeWithAtomicReference() throws Exception {
        Type type = new TypeReference<AtomicReference<String>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testConstructTypeWithMapEntry() throws Exception {
        Type type = new TypeReference<Map.Entry<String, Integer>>() {}.getType();
        JavaType result = typeFactory.constructType(type);
        assertNotNull(result);
    }

    @Test
    public void testFindTypeParametersUnknownType() {
        JavaType[] result = typeFactory.findTypeParameters(typeFactory.unknownType(), Map.class);
        assertNull(result);
    }

    @Test
    public void testMoreSpecificTypeSameRawClass() {
        JavaType type1 = typeFactory.constructType(Number.class);
        JavaType type2 = typeFactory.constructType(Integer.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertNotNull(result);
    }

    static class MyClass {}
    static class MyParamClass<T> {}
    static class MyMap<K,V> extends HashMap<K,V> {}
    static class MyCollection<E> extends ArrayList<E> {}
    static class MyGeneric<T> {}
}