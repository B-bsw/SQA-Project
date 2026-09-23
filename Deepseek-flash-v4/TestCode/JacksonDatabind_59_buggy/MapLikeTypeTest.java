package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

@SuppressWarnings("deprecation")
public class MapLikeTypeTest {

    private static final TypeFactory TF = TypeFactory.defaultInstance();

    private static JavaType stringType() {
        return TF.constructType(String.class);
    }

    private static JavaType integerType() {
        return TF.constructType(Integer.class);
    }

    private static MapLikeType sample() {
        return MapLikeType.construct(Map.class, stringType(), integerType());
    }

    @Test
    public void testConstructAndBasicAccessors() {
        JavaType key = stringType();
        JavaType value = integerType();
        MapLikeType map = MapLikeType.construct(Map.class, key, value);

        assertTrue(map.isContainerType());
        assertTrue(map.isMapLikeType());
        assertTrue(map.isTrueMapType());
        assertSame(key, map.getKeyType());
        assertSame(value, map.getContentType());
        assertEquals(Map.class, map.getRawClass());
        assertEquals("java.util.Map<java.lang.String,java.lang.Integer>", map.buildCanonicalName());
        assertEquals("Ljava/util/Map;", map.getErasedSignature(new StringBuilder()).toString());
        assertEquals("Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;",
                map.getGenericSignature(new StringBuilder()).toString());
        assertTrue(map.toString().contains("map-like type"));
        assertTrue(map.toString().contains("java.lang.String"));
        assertTrue(map.toString().contains("java.lang.Integer"));
    }

    @Test
    public void testUpgradeFrom() {
        JavaType key = stringType();
        JavaType value = integerType();
        MapLikeType base = MapLikeType.construct(Map.class, key, value);

        JavaType newKey = TF.constructType(Long.class);
        JavaType newValue = TF.constructType(Double.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(base, newKey, newValue);

        assertNotSame(base, upgraded);
        assertSame(newKey, upgraded.getKeyType());
        assertSame(newValue, upgraded.getContentType());
        assertEquals(Map.class, upgraded.getRawClass());
    }

    @Test
    public void testWithKeyAndContentType() {
        MapLikeType map = sample();

        assertSame(map, map.withKeyType(map.getKeyType()));
        assertSame(map, map.withContentType(map.getContentType()));

        JavaType newKey = TF.constructType(Long.class);
        MapLikeType changedKey = map.withKeyType(newKey);
        assertNotSame(map, changedKey);
        assertSame(newKey, changedKey.getKeyType());
        assertSame(map.getContentType(), changedKey.getContentType());

        JavaType newValue = TF.constructType(Boolean.class);
        JavaType changedValue = map.withContentType(newValue);
        assertNotSame(map, changedValue);
        assertSame(newValue, changedValue.getContentType());
        assertSame(map.getKeyType(), changedValue.getKeyType());
    }

    @Test
    public void testHandlerCopyMethods() {
        MapLikeType map = sample();
        assertNull(map.getContentValueHandler());
        assertNull(map.getContentTypeHandler());

        Object handler = new Object();

        assertTrue(map.withTypeHandler(handler).hasHandlers());
        assertTrue(map.withContentTypeHandler(handler).hasHandlers());
        assertTrue(map.withValueHandler(handler).hasHandlers());
        assertTrue(map.withContentValueHandler(handler).hasHandlers());
        assertTrue(map.withKeyTypeHandler(handler).hasHandlers());
        assertTrue(map.withKeyValueHandler(handler).hasHandlers());

        MapLikeType contentHandler = map.withContentTypeHandler(handler);
        assertSame(handler, contentHandler.getContentTypeHandler());

        MapLikeType contentValue = map.withContentValueHandler(handler);
        assertSame(handler, contentValue.getContentValueHandler());
    }

    @Test
    public void testStaticTypingAndRefine() {
        MapLikeType map = sample();

        MapLikeType staticTyped = map.withStaticTyping();
        assertNotSame(map, staticTyped);
        assertSame(staticTyped, staticTyped.withStaticTyping());

        MapLikeType refined = (MapLikeType) map.refine(HashMap.class,
                TypeBindings.emptyBindings(), null, null);
        assertEquals(HashMap.class, refined.getRawClass());
        assertEquals("java.util.HashMap<java.lang.String,java.lang.Integer>",
                refined.buildCanonicalName());
    }

    @Test
    public void testNotTrueMapType() {
        MapLikeType fakeMap = MapLikeType.construct(ArrayList.class, stringType(), integerType());
        assertTrue(fakeMap.isContainerType());
        assertTrue(fakeMap.isMapLikeType());
        assertFalse(fakeMap.isTrueMapType());
    }

    @Test
    public void testEquals() {
        MapLikeType map1 = sample();
        MapLikeType map2 = MapLikeType.construct(Map.class, stringType(), integerType());

        assertEquals(map1, map1);
        assertEquals(map1, map2);
        assertFalse(map1.equals(null));
        assertFalse(map1.equals("string"));

        MapLikeType differentValue = map1.withKeyType(TF.constructType(Long.class));
        assertFalse(map1.equals(differentValue));

        MapLikeType differentRaw = MapLikeType.construct(HashMap.class, stringType(), integerType());
        assertFalse(map1.equals(differentRaw));
    }
}