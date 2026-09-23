package com.fasterxml.jackson.databind;

import java.util.*;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.LRUMap;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @After
    public void tearDown() {
        typeFactory.clearCache();
    }

    @Test
    public void testDefaultInstance() {
        assertNotNull(TypeFactory.defaultInstance());
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
    }

    @Test
    public void testWithModifierNull() {
        TypeFactory result = typeFactory.withModifier(null);
        assertNotNull(result);
        assertNotSame(typeFactory, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeInvalidSubclass() {
        typeFactory.constructSpecializedType(typeFactory.constructType(String.class), Integer.class);
    }

    @Test
    public void testConstructSpecializedTypeSameClass() {
        JavaType baseType = typeFactory.constructType(String.class);
        assertSame(baseType, typeFactory.constructSpecializedType(baseType, String.class));
    }

    @Test
    public void testConstructSpecializedTypeSimpleToMap() {
        JavaType baseType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, HashMap.class);
        assertNotNull(result);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructFromCanonical() throws Exception {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonicalInvalid() {
        typeFactory.constructFromCanonical("not.a.valid.Class");
    }

    @Test
    public void testFindTypeParametersNonGeneric() {
        assertNull(typeFactory.findTypeParameters(String.class, Comparable.class));
    }

    @Test
    public void testFindTypeParametersMap() {
        JavaType[] params = typeFactory.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
    }

    @Test
    public void testMoreSpecificTypeFirstNull() {
        JavaType type2 = typeFactory.constructType(String.class);
        assertSame(type2, typeFactory.moreSpecificType(null, type2));
    }

    @Test
    public void testMoreSpecificTypeSecondNull() {
        JavaType type1 = typeFactory.constructType(String.class);
        assertSame(type1, typeFactory.moreSpecificType(type1, null));
    }

    @Test
    public void testMoreSpecificTypeSameRaw() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType type2 = typeFactory.constructType(String.class);
        assertSame(type1, typeFactory.moreSpecificType(type1, type2));
    }

    @Test
    public void testConstructTypeClass() {
        JavaType type = typeFactory.constructType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeTypeReference() {
        TypeReference<List<String>> typeRef = new TypeReference<List<String>>() {};
        JavaType type = typeFactory.constructType(typeRef);
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeJavaType() {
        JavaType original = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructType(original);
        assertSame(original, result);
    }

    @Test
    public void testConstructTypeGenericArray() {
        JavaType type = typeFactory.constructType(GenericArrayType.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructTypeTypeVariable() {
        JavaType type = typeFactory.constructType(new TypeVariable<String>() {
            @Override
            public String getName() { return "T"; }
            @Override
            public Type[] getBounds() { return new Type[] { String.class }; }
            @Override
            public Class<?> getGenericDeclaration() { return TypeFactoryTest.class; }
        });
        assertNotNull(type);
    }

    @Test
    public void testConstructArrayTypeClass() {
        ArrayType type = typeFactory.constructArrayType(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeJavaType() {
        JavaType elementType = typeFactory.constructType(String.class);
        ArrayType type = typeFactory.constructArrayType(elementType);
        assertNotNull(type);
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructCollectionLikeType(ArrayList.class, String.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructMapType() {
        MapType type = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(type);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType type = typeFactory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructSimpleType() {
        JavaType type = typeFactory.constructSimpleType(String.class, new JavaType[] {});
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleTypeMismatchParams() {
        typeFactory.constructSimpleType(String.class, new Class<?>[]{}, new JavaType[] { typeFactory.constructType(String.class) });
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType type = typeFactory.uncheckedSimpleType(String.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructParametrizedType() {
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, ArrayList.class, String.class);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType type = typeFactory.constructParametricType(ArrayList.class, String.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructParametrizedTypeArrayInvalidLength() {
        try {
            typeFactory.constructParametrizedType(String[].class, String[].class, String.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructParametrizedTypeMap() {
        JavaType type = typeFactory.constructParametrizedType(HashMap.class, Map.class, String.class, Integer.class);
        assertNotNull(type);
        assertEquals(HashMap.class, type.getRawClass());
    }

    @Test
    public void testConstructParametrizedTypeMapInvalidParams() {
        try {
            typeFactory.constructParametrizedType(HashMap.class, Map.class, String.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructParametrizedTypeCollection() {
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, Collection.class, String.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructParametrizedTypeCollectionInvalidParams() {
        try {
            typeFactory.constructParametrizedType(ArrayList.class, Collection.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType type = typeFactory.constructRawCollectionType(ArrayList.class);
        assertNotNull(type);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructRawCollectionLikeType(ArrayList.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructRawMapType() {
        MapType type = typeFactory.constructRawMapType(HashMap.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType type = typeFactory.constructRawMapLikeType(HashMap.class);
        assertNotNull(type);
    }

    @Test
    public void testFromClassString() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(CORE_TYPE_STRING, type);
    }

    @Test
    public void testFromClassBoolean() {
        JavaType type = typeFactory.constructType(Boolean.TYPE);
        assertEquals(CORE_TYPE_BOOL, type);
    }

    @Test
    public void testFromClassInteger() {
        JavaType type = typeFactory.constructType(Integer.TYPE);
        assertEquals(CORE_TYPE_INT, type);
    }

    @Test
    public void testFromClassLong() {
        JavaType type = typeFactory.constructType(Long.TYPE);
        assertEquals(CORE_TYPE_LONG, type);
    }

    @Test
    public void testFromClassArray() {
        JavaType type = typeFactory.constructType(String[].class);
        assertTrue(type.isArrayType());
    }

    @Test
    public void testFromClassEnum() {
        JavaType type = typeFactory.constructType(TestEnum.class);
        assertTrue(type.isEnumType());
    }

    @Test
    public void testFromClassMap() {
        JavaType type = typeFactory.constructType(HashMap.class);
        assertTrue(type.isMapLikeType());
    }

    @Test
    public void testFromClassCollection() {
        JavaType type = typeFactory.constructType(ArrayList.class);
        assertTrue(type.isCollectionLikeType());
    }

    @Test
    public void testFromClassMapEntry() {
        JavaType type = typeFactory.constructType(Map.Entry.class);
        assertNotNull(type);
    }

    @Test
    public void testFromClassSimple() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(SimpleType.class, type.getClass());
    }

    @Test
    public void testFromClassParametrizedMap() {
        JavaType type = typeFactory.constructType(HashMap.class);
        assertEquals(HashMap.class, type.getRawClass());
    }

    @Test
    public void testFromClassParametrizedCollection() {
        JavaType type = typeFactory.constructType(ArrayList.class);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeParameterizedType() {
        JavaType type = typeFactory.constructType(new TypeReference<Map<String, Integer>>() {}.getType());
        assertNotNull(type);
        assertTrue(type.isMapLikeType());
    }

    @Test
    public void testConstructTypeGenericArrayType() {
        JavaType type = typeFactory.constructType(new TypeReference<List<String>[]>() {}.getType());
        assertNotNull(type);
    }

    @Test
    public void testConstructTypeWildcardType() {
        JavaType type = typeFactory.constructType(new TypeReference<List<? extends Number>>() {}.getType());
        assertNotNull(type);
    }

    @Test
    public void testMapTypeWithInvalidParams() {
        try {
            typeFactory.constructMapType(HashMap.class, String.class, Integer.class, String.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCollectionTypeWithInvalidParams() {
        try {
            typeFactory.constructCollectionType(ArrayList.class, String.class, Integer.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUnknownType() {
        JavaType type = TypeFactory.unknownType();
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        assertEquals(String.class, TypeFactory.rawClass(typeFactory.constructType(String.class)));
    }

    @Test
    public void testFindTypeParametersClass() {
        JavaType[] params = typeFactory.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
    }

    @Test
    public void testFindTypeParametersClassWithBindings() {
        JavaType[] params = typeFactory.findTypeParameters(HashMap.class, Map.class, new TypeBindings(typeFactory));
        assertNotNull(params);
    }

    @Test
    public void testFindTypeParametersNoSubtype() {
        try {
            typeFactory.findTypeParameters(String.class, Map.class);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFindTypeParametersSuperTypeNotGeneric() {
        assertNull(typeFactory.findTypeParameters(String.class, Comparable.class));
    }

    @Test
    public void testMoreSpecificTypeWithSubclass() {
        JavaType type1 = typeFactory.constructType(Number.class);
        JavaType type2 = typeFactory.constructType(Integer.class);
        assertSame(type1, typeFactory.moreSpecificType(type1, type2));
    }

    @Test
    public void testMoreSpecificTypeWithSubclassReverse() {
        JavaType type1 = typeFactory.constructType(Integer.class);
        JavaType type2 = typeFactory.constructType(Number.class);
        assertSame(type2, typeFactory.moreSpecificType(type1, type2));
    }

    private enum TestEnum {
        VALUE1, VALUE2
    }
}