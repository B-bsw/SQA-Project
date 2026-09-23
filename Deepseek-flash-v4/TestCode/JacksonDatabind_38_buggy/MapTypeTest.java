package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.util.Map;
import java.util.HashMap;

public class MapTypeTest {
    private TypeFactory typeFactory;
    private JavaType keyType;
    private JavaType valueType;
    private MapType mapType;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        keyType = typeFactory.constructType(String.class);
        valueType = typeFactory.constructType(Integer.class);
        mapType = MapType.construct(HashMap.class, null, null, null, keyType, valueType);
    }

    @Test
    public void testConstructWithBindings() {
        MapType mt = MapType.construct(HashMap.class, null, null, null, keyType, valueType);
        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
        assertEquals(keyType, mt.getKeyType());
        assertEquals(valueType, mt.getContentType());
        assertFalse(mt.isContainerType() == false);
    }

    @Test
    public void testConstructDeprecated() {
        MapType mt = MapType.construct(HashMap.class, keyType, valueType);
        assertNotNull(mt);
        assertEquals(HashMap.class, mt.getRawClass());
        assertEquals(keyType, mt.getKeyType());
        assertEquals(valueType, mt.getContentType());
    }

    @Test
    public void testWithTypeHandler() {
        Object handler = new Object();
        MapType result = mapType.withTypeHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        Object handler = new Object();
        MapType result = mapType.withContentTypeHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getContentTypeHandler());
    }

    @Test
    public void testWithValueHandler() {
        Object handler = new Object();
        MapType result = mapType.withValueHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        Object handler = new Object();
        MapType result = mapType.withContentValueHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getContentValueHandler());
    }

    @Test
    public void testWithStaticTypingWhenNotStatic() {
        MapType result = mapType.withStaticTyping();
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertTrue(result.isStaticTyping());
    }

    @Test
    public void testWithStaticTypingWhenAlreadyStatic() {
        MapType staticType = mapType.withStaticTyping();
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testWithContentType() {
        JavaType newValueType = typeFactory.constructType(Double.class);
        MapType result = mapType.withContentType(newValueType);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertEquals(newValueType, result.getContentType());
    }

    @Test
    public void testWithContentTypeSame() {
        assertSame(mapType, mapType.withContentType(mapType.getContentType()));
    }

    @Test
    public void testWithKeyType() {
        JavaType newKeyType = typeFactory.constructType(Long.class);
        MapType result = mapType.withKeyType(newKeyType);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertEquals(newKeyType, result.getKeyType());
    }

    @Test
    public void testWithKeyTypeSame() {
        assertSame(mapType, mapType.withKeyType(mapType.getKeyType()));
    }

    @Test
    public void testRefine() {
        MapType result = mapType.refine(HashMap.class, null, null, null);
        assertNotNull(result);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testWithKeyTypeHandler() {
        Object handler = new Object();
        MapType result = mapType.withKeyTypeHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getKeyType().getTypeHandler());
    }

    @Test
    public void testWithKeyValueHandler() {
        Object handler = new Object();
        MapType result = mapType.withKeyValueHandler(handler);
        assertNotNull(result);
        assertNotSame(mapType, result);
        assertSame(handler, result.getKeyType().getValueHandler());
    }

    @Test
    public void testNarrow() {
        MapType result = mapType._narrow(HashMap.class);
        assertNotNull(result);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testToString() {
        String str = mapType.toString();
        assertNotNull(str);
        assertTrue(str.contains("map type"));
        assertTrue(str.contains(HashMap.class.getName()));
        assertTrue(str.contains("String"));
        assertTrue(str.contains("Integer"));
    }

    @Test
    public void testNullKeyType() {
        try {
            MapType.construct(HashMap.class, null, null, null, null, valueType);
            fail("Should throw IllegalArgumentException for null key type");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testNullValueType() {
        try {
            MapType.construct(HashMap.class, null, null, null, keyType, null);
            fail("Should throw IllegalArgumentException for null value type");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithContentTypeNull() {
        try {
            mapType.withContentType(null);
            fail("Should throw IllegalArgumentException for null content type");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithKeyTypeNull() {
        try {
            mapType.withKeyType(null);
            fail("Should throw IllegalArgumentException for null key type");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructWithNullRawType() {
        try {
            MapType.construct(null, null, null, null, keyType, valueType);
            fail("Should throw IllegalArgumentException for null raw type");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWithTypeHandlerNull() {
        MapType result = mapType.withTypeHandler(null);
        assertNotNull(result);
        assertNull(result.getTypeHandler());
    }
}