package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public class TypeFactoryTest {

    private final TypeFactory tf = TypeFactory.defaultInstance();

    @Test
    public void testDefaultAndUnknownType() {
        assertNotNull(TypeFactory.defaultInstance());
        assertEquals(Object.class, TypeFactory.unknownType().getRawClass());
    }

    @Test
    public void testWithClassLoader() {
        TypeFactory custom = tf.withClassLoader(getClass().getClassLoader());
        assertNotNull(custom);
        assertEquals(getClass().getClassLoader(), custom.getClassLoader());
        assertNull(tf.getClassLoader());
    }

    @Test
    public void testWithCache() {
        TypeFactory custom = tf.withCache(null);
        assertNotNull(custom);
    }

    @Test
    public void testClearCache() {
        tf.constructType(String.class);
        tf.clearCache();
        tf.constructType(String.class);
    }

    @Test
    public void testFindClass() throws Exception {
        assertEquals(Integer.TYPE, tf.findClass("int"));
        assertEquals(String.class, tf.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassThrowsOnUnknown() throws Exception {
        tf.findClass("no.such.Class");
    }

    @Test
    public void testRawClass() {
        assertEquals(String.class, TypeFactory.rawClass(String.class));
        Type listType = new TypeReference<List<String>>() {}.getType();
        assertEquals(List.class, TypeFactory.rawClass(listType));
    }

    @Test
    public void testWithModifier() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType,
                    TypeBindings context, TypeFactory typeFactory) {
                return TypeFactory.unknownType();
            }
        };

        TypeFactory modified = tf.withModifier(mod);
        assertEquals(Object.class, modified.constructType(String.class).getRawClass());

        TypeFactory reset = tf.withModifier(null);
        assertEquals(String.class, reset.constructType(String.class).getRawClass());
    }

    @Test
    public void testConstructTypeBasics() {
        JavaType str = tf.constructType(String.class);
        assertEquals(String.class, str.getRawClass());

        JavaType list = tf.constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, list.getRawClass());
        assertEquals(1, list.containedTypeCount());
        assertEquals(String.class, list.containedType(0).getRawClass());

        assertSame(str, tf.constructType((Type) str));
    }

    @Test
    public void testConstructTypeNullThrows() {
        try {
            tf.constructType((Type) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructArrayType() {
        ArrayType a1 = tf.constructArrayType(String.class);
        assertEquals(String[].class, a1.getRawClass());
        assertTrue(a1.isArrayType());

        ArrayType a2 = tf.constructArrayType(tf.constructType(Integer.class));
        assertEquals(Integer[].class, a2.getRawClass());
        assertEquals(Integer.class, a2.containedType(0).getRawClass());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType c1 = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, c1.getRawClass());
        assertEquals(String.class, c1.containedType(0).getRawClass());

        CollectionType c2 = tf.constructCollectionType(HashSet.class, tf.constructType(Long.class));
        assertEquals(HashSet.class, c2.getRawClass());
        assertEquals(Long.class, c2.containedType(0).getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType c1 = tf.constructCollectionLikeType(Collection.class, String.class);
        assertTrue(c1.isCollectionLikeType());
        assertEquals(Collection.class, c1.getRawClass());
        assertEquals(String.class, c1.containedType(0).getRawClass());

        CollectionLikeType c2 = tf.constructCollectionLikeType(Iterable.class, tf.constructType(Integer.class));
        assertTrue(c2.isCollectionLikeType());
        assertEquals(Iterable.class, c2.getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType m1 = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, m1.getRawClass());
        assertEquals(String.class, m1.containedType(0).getRawClass());
        assertEquals(Integer.class, m1.containedType(1).getRawClass());

        MapType props = tf.constructMapType(Properties.class, Long.class, Double.class);
        assertEquals(Properties.class, props.getRawClass());
        assertEquals(String.class, props.containedType(0).getRawClass());
        assertEquals(String.class, props.containedType(1).getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType m = tf.constructMapLikeType(Map.class, String.class, Integer.class);
        assertTrue(m.isMapLikeType());
        assertEquals(Map.class, m.getRawClass());
        assertEquals(String.class, m.containedType(0).getRawClass());
        assertEquals(Integer.class, m.containedType(1).getRawClass());
    }

    @Test
    public void testEmptyMapTypeParameters() {
        JavaType m = tf.constructSimpleType(Map.class, new JavaType[0]);
        assertEquals(Map.class, m.getRawClass());
        assertEquals(Object.class, m.containedType(0).getRawClass());
        assertEquals(Object.class, m.containedType(1).getRawClass());
    }

    @Test
    public void testConstructSimpleType() {
        JavaType st = tf.constructSimpleType(SimpleGeneric.class,
                new JavaType[] { tf.constructType(String.class) });
        assertEquals(SimpleGeneric.class, st.getRawClass());
        assertEquals(1, st.containedTypeCount());
        assertEquals(String.class, st.containedType(0).getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType ref = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(1, ref.containedTypeCount());
        assertEquals(String.class, ref.containedType(0).getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType st = tf.uncheckedSimpleType(String.class);
        assertEquals(String.class, st.getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType empty = tf.constructParametricType(String.class, new Class<?>[0]);
        assertEquals(String.class, empty.getRawClass());

        JavaType list = tf.constructParametricType(List.class, String.class);
        assertEquals(List.class, list.getRawClass());
        assertEquals(1, list.containedTypeCount());
        assertEquals(String.class, list.containedType(0).getRawClass());

        JavaType map = tf.constructParametricType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, map.getRawClass());
        assertEquals(2, map.containedTypeCount());

        JavaType list2 = tf.constructParametricType(List.class,
                new JavaType[] { tf.constructType(Long.class) });
        assertEquals(List.class, list2.getRawClass());
        assertEquals(Long.class, list2.containedType(0).getRawClass());
    }

    @Test
    public void testConstructParametrizedType() {
        JavaType list = tf.constructParametrizedType(LinkedList.class, Collection.class, Long.class);
        assertEquals(LinkedList.class, list.getRawClass());
        assertEquals(1, list.containedTypeCount());
        assertEquals(Long.class, list.containedType(0).getRawClass());
    }

    @Test
    public void testConstructRawTypes() {
        CollectionType ct = tf.constructRawCollectionType(LinkedList.class);
        assertEquals(LinkedList.class, ct.getRawClass());
        assertEquals(Object.class, ct.containedType(0).getRawClass());

        MapType mt = tf.constructRawMapType(HashMap.class);
        assertEquals(HashMap.class, mt.getRawClass());
        assertEquals(Object.class, mt.containedType(0).getRawClass());
        assertEquals(Object.class, mt.containedType(1).getRawClass());

        CollectionLikeType cl = tf.constructRawCollectionLikeType(Collection.class);
        assertEquals(Collection.class, cl.getRawClass());

        MapLikeType ml = tf.constructRawMapLikeType(Map.class);
        assertEquals(Map.class, ml.getRawClass());
    }

    @Test
    public void testConstructSpecializedType() {
        JavaType baseCollection = tf.constructCollectionType(Collection.class, String.class);
        assertSame(baseCollection, tf.constructSpecializedType(baseCollection, Collection.class));

        JavaType arrayList = tf.constructSpecializedType(baseCollection, ArrayList.class);
        assertEquals(ArrayList.class, arrayList.getRawClass());
        assertEquals(String.class, arrayList.containedType(0).getRawClass());

        JavaType baseMap = tf.constructMapType(Map.class, String.class, Integer.class);
        JavaType hashMap = tf.constructSpecializedType(baseMap, HashMap.class);
        assertEquals(HashMap.class, hashMap.getRawClass());
        assertEquals(String.class, hashMap.containedType(0).getRawClass());
        assertEquals(Integer.class, hashMap.containedType(1).getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeNonGenericSubclass() {
        JavaType base = tf.constructParametricType(GenericBase.class, String.class);
        JavaType sub = tf.constructSpecializedType(base, NonGenericSub.class);
        assertEquals(NonGenericSub.class, sub.getRawClass());
    }

    @Test
    public void testConstructSpecializedTypeInvalidSubclass() {
        try {
            tf.constructSpecializedType(tf.constructType(String.class), Integer.class);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType list = tf.constructCollectionType(ArrayList.class, String.class);
        assertSame(list, tf.constructGeneralizedType(list, ArrayList.class));

        JavaType superList = tf.constructGeneralizedType(list, List.class);
        assertEquals(List.class, superList.getRawClass());
        assertEquals(1, superList.containedTypeCount());
        assertEquals(String.class, superList.containedType(0).getRawClass());

        try {
            tf.constructGeneralizedType(list, String.class);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType str = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, str.getRawClass());

        JavaType prim = tf.constructFromCanonical("int");
        assertEquals(Integer.TYPE, prim.getRawClass());

        JavaType list = tf.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, list.getRawClass());
        assertEquals(1, list.containedTypeCount());
        assertEquals(String.class, list.containedType(0).getRawClass());

        JavaType map = tf.constructFromCanonical("java.util.Map<java.lang.String,java.lang.Integer>");
        assertEquals(Map.class, map.getRawClass());
        assertEquals(2, map.containedTypeCount());
    }

    @Test
    public void testConstructFromCanonicalInvalid() {
        try {
            tf.constructFromCanonical("java.util.List<java.lang.String");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testFindTypeParameters() {
        JavaType map = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        JavaType[] params = tf.findTypeParameters(map, Map.class);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());

        JavaType[] none = tf.findTypeParameters(tf.constructType(String.class), Map.class);
        assertNotNull(none);
        assertEquals(0, none.length);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType obj = tf.constructType(Object.class);
        JavaType str = tf.constructType(String.class);

        assertSame(str, tf.moreSpecificType(null, str));
        assertSame(obj, tf.moreSpecificType(obj, null));
        assertSame(str, tf.moreSpecificType(str, str));
        assertSame(str, tf.moreSpecificType(obj, str));
        assertSame(str, tf.moreSpecificType(str, obj));
    }

    static class SimpleGeneric<T> {
    }

    static class GenericBase<T> {
    }

    static class NonGenericSub extends GenericBase<String> {
    }
}