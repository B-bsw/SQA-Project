package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;

public class TypeFactoryTest {
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testDefaultInstance() {
        assertNotNull(typeFactory);
        assertSame(typeFactory, TypeFactory.defaultInstance());
    }

    @Test
    public void testWithModifierNull() {
        TypeFactory result = typeFactory.withModifier(null);
        assertNotNull(result);
        assertNotSame(typeFactory, result);
    }

    @Test
    public void testWithModifierNotNull() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory result = typeFactory.withModifier(mod);
        assertNotNull(result);
        assertNotSame(typeFactory, result);
    }

    @Test
    public void testClearCache() {
        typeFactory.clearCache();
        assertNotNull(typeFactory);
    }

    @Test
    public void testUnknownType() {
        JavaType type = TypeFactory.unknownType();
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testRawClassWithClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testRawClassWithJavaType() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(String.class, TypeFactory.rawClass(type));
    }

    @Test
    public void testFindClassPrimitive() throws Exception {
        assertEquals(Integer.TYPE, typeFactory.findClass("int"));
        assertEquals(Long.TYPE, typeFactory.findClass("long"));
        assertNull(typeFactory.findClass("not_exists_anywhere"));
    }

    @Test
    public void testFindClassWithDot() throws Exception {
        assertEquals(String.class, typeFactory.findClass("java.lang.String"));
    }

    @Test
    public void testFindClassNoDotPrimitiveFirst() throws Exception {
        assertNotNull(typeFactory.findClass("HashMap"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        typeFactory.findClass("NoSuchClassXYZ");
    }

    @Test
    public void testFindPrimitive() {
        assertEquals(Integer.TYPE, typeFactory._findPrimitive("int"));
        assertEquals(Long.TYPE, typeFactory._findPrimitive("long"));
        assertEquals(Float.TYPE, typeFactory._findPrimitive("float"));
        assertEquals(Double.TYPE, typeFactory._findPrimitive("double"));
        assertEquals(Boolean.TYPE, typeFactory._findPrimitive("boolean"));
        assertEquals(Byte.TYPE, typeFactory._findPrimitive("byte"));
        assertEquals(Character.TYPE, typeFactory._findPrimitive("char"));
        assertEquals(Short.TYPE, typeFactory._findPrimitive("short"));
        assertEquals(Void.TYPE, typeFactory._findPrimitive("void"));
        assertNull(typeFactory._findPrimitive("unknown"));
    }

    @Test
    public void testConstructSpecializedTypeSameRawClass() {
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(base, Number.class);
        assertSame(base, result);
    }

    @Test
    public void testConstructSpecializedTypeSubclass() {
        JavaType base = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(base, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeNotSubtype() {
        JavaType base = typeFactory.constructType(String.class);
        typeFactory.constructSpecializedType(base, Integer.class);
    }

    @Test
    public void testConstructSpecializedTypeObjectBase() {
        JavaType base = typeFactory.constructType(Object.class);
        JavaType result = typeFactory.constructSpecializedType(base, String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructGeneralizedTypeSameClass() {
        JavaType base = typeFactory.constructType(Integer.class);
        JavaType result = typeFactory.constructGeneralizedType(base, Number.class);
        assertEquals(Number.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedTypeInvalid() {
        JavaType base = typeFactory.constructType(Integer.class);
        typeFactory.constructGeneralizedType(base, String.class);
    }

    @Test
    public void testConstructFromCanonicalSimple() throws Exception {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructParametricTypeWithClasses() {
        JavaType type = typeFactory.constructParametricType(List.class, String.class);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructParametricTypeWithJavaTypes() {
        JavaType elementType = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructParametricType(List.class, elementType);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructRawCollectionType() {
        CollectionType type = typeFactory.constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructRawCollectionLikeType(ArrayList.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType() {
        MapType type = typeFactory.constructRawMapType(HashMap.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getValueType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() {
        MapLikeType type = typeFactory.constructRawMapLikeType(Properties.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getValueType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType type = typeFactory.constructMapType(Properties.class, String.class, String.class);
        assertEquals(Properties.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getValueType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType type = typeFactory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getValueType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeClass() {
        ArrayType type = typeFactory.constructArrayType(String.class);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayTypeJavaType() {
        JavaType elementType = typeFactory.constructType(String.class);
        ArrayType type = typeFactory.constructArrayType(elementType);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        JavaType type = typeFactory.constructSimpleType(String.class, new JavaType[0]);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType type = typeFactory.uncheckedSimpleType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType referred = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructReferenceType(AtomicReference.class, referred);
        assertEquals(AtomicReference.class, type.getRawClass());
    }

    @Test
    public void testFindTypeParametersWithClass() {
        JavaType[] types = typeFactory.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(types);
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, String.class);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructCollectionLikeType(ArrayList.class, String.class);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeTypeFromJavaTypes() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);
        MapLikeType type = typeFactory.constructMapLikeType(HashMap.class, keyType, valueType);
        assertEquals(String.class, type.getKeyType().getRawClass());
    }

    @Test
    public void testConstructTypeFromClass() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeWithBindings() {
        JavaType type = typeFactory.constructType(Map.class, TypeBindings.create(Map.class, new JavaType[0]));
        assertNotNull(type);
    }

    @Test
    public void testConstructTypeFromTypeReference() {
        TypeReference<List<String>> typeRef = new TypeReference<List<String>>() {};
        JavaType type = typeFactory.constructType(typeRef);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeFromTypeAndContextClass() {
        JavaType type = typeFactory.constructType(List.class, String.class);
        assertNotNull(type);
    }

    @Test
    public void testMoreSpecificTypeFirstNull() {
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificTypeSecondNull() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificTypeSame() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, type1);
        assertSame(type1, result);
    }

    @Test
    public void testGetClassLoader() {
        assertNotNull(typeFactory.getClassLoader());
    }

    @Test
    public void testConstructParametrizedType() {
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithClass() {
        JavaType type = typeFactory.constructType(Integer.class);
        assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithInterface() {
        JavaType type = typeFactory.constructType(Comparable.class);
        assertEquals(Comparable.class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithArray() {
        JavaType type = typeFactory.constructType(String[].class);
        assertEquals(String[].class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithProperties() {
        JavaType type = typeFactory.constructType(Properties.class);
        assertEquals(Properties.class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithAtomicReference() {
        JavaType type = typeFactory.constructType(AtomicReference.class);
        assertEquals(AtomicReference.class, type.getRawClass());
    }

    @Test
    public void testConstructFromAnyWithEnumMap() {
        JavaType type = typeFactory.constructType(new EnumMap<SampleEnum, String>(SampleEnum.class));
        assertEquals(EnumMap.class, type.getRawClass());
    }

    @Test
    public void testConstructMapWithSubtypes() {
        MapType type = typeFactory.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, type.getRawClass());
    }

    @Test
    public void testConstructCollectionWithSubtypeHashMap() {
        CollectionType type = typeFactory.constructCollectionType(HashSet.class, String.class);
        assertEquals(HashSet.class, type.getRawClass());
    }

    @Test
    public void testConstructCollectionWithTreeSet() {
        CollectionType type = typeFactory.constructCollectionType(TreeSet.class, String.class);
        assertEquals(TreeSet.class, type.getRawClass());
    }

    @Test
    public void testConstructCollectionWithLinkedList() {
        CollectionType type = typeFactory.constructCollectionType(LinkedList.class, String.class);
        assertEquals(LinkedList.class, type.getRawClass());
    }

    @Test
    public void testConstructCollectionWithArrayList() {
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    @Test
    public void testConstructMapWithLinkedHashMap() {
        MapType type = typeFactory.constructMapType(LinkedHashMap.class, String.class, Integer.class);
        assertEquals(LinkedHashMap.class, type.getRawClass());
    }

    @Test
    public void testConstructMapWithTreeMap() {
        MapType type = typeFactory.constructMapType(TreeMap.class, String.class, Integer.class);
        assertEquals(TreeMap.class, type.getRawClass());
    }

    @Test
    public void testConstructMapWithEnumMap() {
        MapType type = typeFactory.constructMapType(EnumMap.class, String.class, Integer.class);
        assertEquals(EnumMap.class, type.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeHashMap() {
        JavaType base = typeFactory.constructType(Map.class);
        JavaType result = typeFactory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeLinkedHashMap() {
        JavaType base = typeFactory.constructType(Map.class);
        JavaType result = typeFactory.constructSpecializedType(base, LinkedHashMap.class);
        assertEquals(LinkedHashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeTreeMap() {
        JavaType base = typeFactory.constructType(Map.class);
        JavaType result = typeFactory.constructSpecializedType(base, TreeMap.class);
        assertEquals(TreeMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeEnumMap() {
        JavaType base = typeFactory.constructType(Map.class);
        JavaType result = typeFactory.constructSpecializedType(base, EnumMap.class);
        assertEquals(EnumMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeArrayList() {
        JavaType base = typeFactory.constructType(Collection.class);
        JavaType result = typeFactory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeLinkedList() {
        JavaType base = typeFactory.constructType(Collection.class);
        JavaType result = typeFactory.constructSpecializedType(base, LinkedList.class);
        assertEquals(LinkedList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeHashSet() {
        JavaType base = typeFactory.constructType(Collection.class);
        JavaType result = typeFactory.constructSpecializedType(base, HashSet.class);
        assertEquals(HashSet.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeTreeSet() {
        JavaType base = typeFactory.constructType(Collection.class);
        JavaType result = typeFactory.constructSpecializedType(base, TreeSet.class);
        assertEquals(TreeSet.class, result.getRawClass());
    }

    @Test
    public void testFindClassWithLoader() throws Exception {
        Class<?> clazz = typeFactory.findClass("java.lang.String");
        assertEquals(String.class, clazz);
    }

    @Test
    public void testClearCacheAndConstruct() {
        typeFactory.clearCache();
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testWithClassLoader() {
        ClassLoader cl = getClass().getClassLoader();
        TypeFactory tf = typeFactory.withClassLoader(cl);
        assertNotNull(tf);
        assertEquals(cl, tf.getClassLoader());
    }

    @Test
    public void testConstructTypeFromTypeWithContext() {
        JavaType context = typeFactory.constructType(Map.class);
        JavaType type = typeFactory.constructType(String.class, context);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructTypeFromJavaType() {
        JavaType type = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructType(type);
        assertSame(type, result);
    }

    @Test
    public void testConstructReferenceTypeWithArray() {
        JavaType referred = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructReferenceType(ArrayType.class, referred);
        assertNotNull(type);
    }

    @Test
    public void testFindTypeParametersWithClassNoBindings() {
        JavaType[] types = typeFactory.findTypeParameters(HashMap.class, Map.class);
        assertNotNull(types);
    }

    @Test
    public void testConstructMapLikeTypeWithPrimitiveKey() {
        MapLikeType type = typeFactory.constructMapLikeType(HashMap.class, Integer.TYPE, String.class);
        assertEquals(Integer.TYPE, type.getKeyType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypeWithPrimitiveElement() {
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, Integer.TYPE);
        assertEquals(Integer.TYPE, type.getContentType().getRawClass());
    }

    private enum SampleEnum {
        VAL1, VAL2
    }
}