package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeFactoryTest {

    private final TypeFactory tf = TypeFactory.defaultInstance();

    private final TypeReference<List<String>> LIST_OF_STRING = new TypeReference<List<String>>() {};

    public static class GenericBean<T> {
    }

    @Test
    public void testDefaultInstanceAndUnknownType() {
        assertSame(TypeFactory.defaultInstance(), TypeFactory.defaultInstance());
        assertNotNull(tf);
        assertEquals(Object.class, tf.unknownType().getRawClass());
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        JavaType list = tf.constructType(LIST_OF_STRING);
        assertEquals(List.class, TypeFactory.rawClass(list));
        assertEquals(List.class, TypeFactory.rawClass(LIST_OF_STRING.getType()));
    }

    @Test
    public void testFindClass() throws Exception {
        assertEquals(String.class, tf.findClass("java.lang.String"));
        assertEquals(Integer.TYPE, tf.findClass("int"));
        assertEquals(Boolean.TYPE, tf.findClass("boolean"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        tf.findClass("no.such.Class");
    }

    @Test
    public void testConstructTypeClassAndJavaType() {
        JavaType str = tf.constructType(String.class);
        assertEquals(String.class, str.getRawClass());
        assertSame(str, tf.constructType(str));
    }

    @Test
    public void testConstructTypeReference() {
        JavaType list = tf.constructType(LIST_OF_STRING);
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructTypeNull() {
        tf.constructType((Type) null);
    }

    @Test
    public void testConstructArrayType() {
        JavaType arr1 = tf.constructArrayType(String.class);
        assertEquals(String[].class, arr1.getRawClass());
        assertEquals(String.class, arr1.getContentType().getRawClass());

        JavaType arr2 = tf.constructArrayType(tf.constructType(Integer.class));
        assertEquals(Integer[].class, arr2.getRawClass());
        assertEquals(Integer.class, arr2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType list1 = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, list1.getRawClass());
        assertEquals(String.class, list1.getContentType().getRawClass());

        CollectionType list2 = tf.constructCollectionType(LinkedList.class, tf.constructType(Integer.class));
        assertEquals(LinkedList.class, list2.getRawClass());
        assertEquals(Integer.class, list2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType map = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, map.getRawClass());
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());

        MapType props = tf.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(Properties.class, props.getRawClass());
        assertEquals(String.class, props.getKeyType().getRawClass());
        assertEquals(String.class, props.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        JavaType keyType = tf.constructType(String.class);
        JavaType valueType = tf.constructType(Integer.class);
        JavaType mapLike = tf.constructMapLikeType(Map.class, keyType, valueType);
        assertEquals(Map.class, mapLike.getRawClass());
        assertEquals(String.class, mapLike.getKeyType().getRawClass());
        assertEquals(Integer.class, mapLike.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleTypeAndFindTypeParameters() {
        JavaType[] params = new JavaType[] { tf.constructType(String.class) };
        JavaType simple = tf.constructSimpleType(GenericBean.class, params);
        assertEquals(GenericBean.class, simple.getRawClass());

        JavaType[] found = tf.findTypeParameters(simple, GenericBean.class);
        assertEquals(1, found.length);
        assertEquals(String.class, found[0].getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType ref = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(String.class, ref.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType map = tf.constructParametricType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, map.getRawClass());
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());

        JavaType list = tf.constructParametricType(List.class, tf.constructType(String.class));
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionAndMapType() {
        CollectionType rawColl = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(ArrayList.class, rawColl.getRawClass());
        assertEquals(Object.class, rawColl.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(HashMap.class);
        assertEquals(HashMap.class, rawMap.getRawClass());
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType str = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, str.getRawClass());

        JavaType intType = tf.constructFromCanonical("int");
        assertEquals(Integer.TYPE, intType.getRawClass());

        JavaType list = tf.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test
    public void testConstructSpecializedType() {
        JavaType list = tf.constructType(LIST_OF_STRING);
        JavaType arrayList = tf.constructSpecializedType(list, ArrayList.class);
        assertEquals(ArrayList.class, arrayList.getRawClass());
        assertEquals(String.class, arrayList.getContentType().getRawClass());

        JavaType map = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        JavaType hashMap = tf.constructSpecializedType(map, HashMap.class);
        assertEquals(HashMap.class, hashMap.getRawClass());
        assertEquals(String.class, hashMap.getKeyType().getRawClass());
        assertEquals(Integer.class, hashMap.getContentType().getRawClass());

        JavaType str = tf.constructType(String.class);
        assertSame(str, tf.constructSpecializedType(str, String.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeInvalidSubtype() {
        tf.constructSpecializedType(tf.constructType(String.class), Integer.class);
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType arrayList = tf.constructType(new TypeReference<ArrayList<String>>() {});
        JavaType list = tf.constructGeneralizedType(arrayList, List.class);
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedTypeInvalidSupertype() {
        tf.constructGeneralizedType(tf.constructType(String.class), Number.class);
    }

    @Test
    public void testFindTypeParameters() {
        JavaType list = tf.constructType(LIST_OF_STRING);
        JavaType[] params = tf.findTypeParameters(list, List.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());

        JavaType str = tf.constructType(String.class);
        assertEquals(0, tf.findTypeParameters(str, List.class).length);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType str = tf.constructType(String.class);
        JavaType obj = tf.constructType(Object.class);

        assertSame(str, tf.moreSpecificType(str, obj));
        assertSame(str, tf.moreSpecificType(obj, str));
        assertSame(str, tf.moreSpecificType(str, null));
        assertSame(str, tf.moreSpecificType(null, str));
        assertNull(tf.moreSpecificType(null, null));
    }

    @Test
    public void testWithClassLoaderAndClearCache() {
        assertNull(tf.getClassLoader());

        ClassLoader cl = getClass().getClassLoader();
        TypeFactory tf2 = tf.withClassLoader(cl);
        assertSame(cl, tf2.getClassLoader());
        tf2.clearCache();
        assertNotNull(tf2.constructType(String.class));

        TypeFactory tf3 = tf.withClassLoader(null);
        assertNull(tf3.getClassLoader());
    }

    @Test
    public void testWithModifierAndCache() {
        TypeFactory tf2 = tf.withModifier(null);
        assertNotNull(tf2);

        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(16, 200);
        TypeFactory tf3 = tf.withCache(cache);
        assertNotNull(tf3);
        tf3.clearCache();
    }
}