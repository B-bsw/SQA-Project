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

    static class Generic<T> { }

    static class IdModifier extends TypeModifier {
        @Override
        public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
            return type;
        }
    }

    @Test
    public void testConstructTypeBasics() {
        assertEquals(String.class, tf.constructType(String.class).getRawClass());
        assertEquals(Object.class, TypeFactory.unknownType().getRawClass());
        assertEquals(String.class, TypeFactory.rawClass(String.class));
    }

    @Test
    public void testConstructTypeNull() {
        try {
            tf.constructType((Type) null);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructTypeReference() {
        JavaType list = tf.constructType(new TypeReference<List<String>>() {});
        assertEquals(List.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());
    }

    @Test
    public void testFindClass() throws Exception {
        assertEquals(int.class, tf.findClass("int"));
        assertEquals(long.class, tf.findClass("long"));
        assertEquals(float.class, tf.findClass("float"));
        assertEquals(double.class, tf.findClass("double"));
        assertEquals(boolean.class, tf.findClass("boolean"));
        assertEquals(byte.class, tf.findClass("byte"));
        assertEquals(char.class, tf.findClass("char"));
        assertEquals(short.class, tf.findClass("short"));
        assertEquals(void.class, tf.findClass("void"));
        assertEquals(String.class, tf.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws Exception {
        tf.findClass("no.such.Class");
    }

    @Test
    public void testClearCache() {
        tf.constructType(String.class);
        tf.clearCache();
        assertNotNull(tf.constructType(String.class));
    }

    @Test
    public void testArrayType() {
        JavaType arr = tf.constructArrayType(String.class);
        assertEquals(String.class, arr.getContentType().getRawClass());
        JavaType arr2 = tf.constructArrayType(arr.getContentType());
        assertEquals(String.class, arr2.getContentType().getRawClass());
    }

    @Test
    public void testCollectionAndMapTypes() {
        CollectionType list = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, list.getRawClass());
        assertEquals(String.class, list.getContentType().getRawClass());

        MapType map = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(HashMap.class, map.getRawClass());
        assertEquals(String.class, map.getKeyType().getRawClass());
        assertEquals(Integer.class, map.getContentType().getRawClass());

        MapType props = tf.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(Properties.class, props.getRawClass());
        assertEquals(String.class, props.getKeyType().getRawClass());
        assertEquals(String.class, props.getContentType().getRawClass());

        MapType paramMap = (MapType) tf.constructParametricType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, paramMap.getRawClass());
        assertEquals(String.class, paramMap.getKeyType().getRawClass());
        assertEquals(Integer.class, paramMap.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        JavaType iterable = tf.constructCollectionLikeType(Iterable.class, String.class);
        assertEquals(Iterable.class, iterable.getRawClass());
        assertEquals(String.class, iterable.getContentType().getRawClass());
    }

    @Test
    public void testRawCollectionAndMapTypes() {
        JavaType rawList = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(ArrayList.class, rawList.getRawClass());
        assertEquals(Object.class, rawList.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(HashMap.class);
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());
    }

    @Test
    public void testConstructGenericAndSimpleTypes() {
        JavaType generic = tf.constructParametricType(Generic.class, String.class);
        assertEquals(Generic.class, generic.getRawClass());
        assertEquals(1, generic.containedTypeCount());
        assertEquals(String.class, generic.containedType(0).getRawClass());

        assertEquals(String.class, tf.constructSimpleType(String.class, new JavaType[0]).getRawClass());
        assertEquals(String.class, tf.uncheckedSimpleType(String.class).getRawClass());
    }

    @Test
    public void testConstructSpecializedType() {
        JavaType str = tf.constructType(String.class);
        assertSame(str, tf.constructSpecializedType(str, String.class));

        JavaType obj = tf.constructType(Object.class);
        assertEquals(String.class, tf.constructSpecializedType(obj, String.class).getRawClass());

        JavaType list = tf.constructType(new TypeReference<List<String>>() {});
        JavaType arrayList = tf.constructSpecializedType(list, ArrayList.class);
        assertEquals(ArrayList.class, arrayList.getRawClass());
        assertEquals(String.class, arrayList.getContentType().getRawClass());

        JavaType map = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        MapType hashMap = (MapType) tf.constructSpecializedType(map, HashMap.class);
        assertEquals(HashMap.class, hashMap.getRawClass());
        assertEquals(String.class, hashMap.getKeyType().getRawClass());
        assertEquals(Integer.class, hashMap.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeInvalid() {
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
    public void testConstructGeneralizedTypeInvalid() {
        tf.constructGeneralizedType(tf.constructType(String.class), Number.class);
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType type = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testFindTypeParameters() {
        JavaType map = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});
        JavaType[] params = tf.findTypeParameters(map, Map.class);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }

    @Test
    public void testMoreSpecificType() {
        JavaType obj = tf.constructType(Object.class);
        JavaType str = tf.constructType(String.class);
        assertSame(str, tf.moreSpecificType(null, str));
        assertSame(str, tf.moreSpecificType(obj, str));
        assertSame(str, tf.moreSpecificType(str, obj));
        assertSame(str, tf.moreSpecificType(str, str));
    }

    @Test
    public void testReferenceType() {
        JavaType ref = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(String.class, ref.getContentType().getRawClass());
    }

    @Test
    public void testWithModifierAndClassLoader() {
        TypeFactory withNullModifier = tf.withModifier(null);
        assertNotNull(withNullModifier);

        TypeFactory withModifier = tf.withModifier(new IdModifier());
        assertNotNull(withModifier);
        assertEquals(String.class, withModifier.constructType(String.class).getRawClass());

        ClassLoader cl = getClass().getClassLoader();
        TypeFactory withLoader = tf.withClassLoader(cl);
        assertNotSame(tf, withLoader);
        assertSame(cl, withLoader.getClassLoader());
    }
}