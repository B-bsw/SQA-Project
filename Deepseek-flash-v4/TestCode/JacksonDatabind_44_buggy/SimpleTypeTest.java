package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {

    static class OneType<T> { }
    static class TwoTypes<T, U> { }

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    @Test
    public void testConstructUnsafe() {
        SimpleType type = SimpleType.constructUnsafe(String.class);

        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertEquals("[simple type, class java.lang.String]", type.toString());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructRejectsMapCollectionAndArray() {
        try {
            SimpleType.construct(HashMap.class);
            fail("Should reject Map types");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Map"));
        }

        try {
            SimpleType.construct(ArrayList.class);
            fail("Should reject Collection types");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Collection"));
        }

        try {
            SimpleType.construct(String[].class);
            fail("Should reject array types");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("array"));
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructValidType() {
        SimpleType type = SimpleType.construct(Object.class);

        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testEquals() {
        SimpleType first = SimpleType.construct(Object.class);
        SimpleType second = SimpleType.construct(Object.class);
        SimpleType stringType = SimpleType.construct(String.class);

        assertEquals(first, first);
        assertEquals(first, second);
        assertNotEquals(first, stringType);
        assertNotEquals(first, null);
        assertNotEquals(first, "not a SimpleType");
    }

    @Test
    public void testWithTypeHandlerAndValueHandler() {
        SimpleType base = SimpleType.constructUnsafe(String.class);

        assertSame(base, base.withTypeHandler(null));

        Object typeHandler = new Object();
        SimpleType withTypeHandler = base.withTypeHandler(typeHandler);

        assertNotSame(base, withTypeHandler);
        assertSame(typeHandler, withTypeHandler.getTypeHandler());
        assertSame(withTypeHandler, withTypeHandler.withTypeHandler(typeHandler));

        SimpleType withValueHandler = base.withValueHandler("value-handler");

        assertNotSame(base, withValueHandler);
        assertEquals("value-handler", withValueHandler.getValueHandler());
    }

    @Test
    public void testContentTypeMethodsRejectUnsupportedTypes() {
        SimpleType base = SimpleType.constructUnsafe(String.class);

        try {
            base.withContentTypeHandler("handler");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            base.withContentValueHandler("handler");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }

        try {
            base.withContentType(base);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testWithStaticTyping() {
        SimpleType base = SimpleType.constructUnsafe(String.class);
        JavaType staticType = base.withStaticTyping();

        assertNotSame(base, staticType);
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() {
        SimpleType base = SimpleType.constructUnsafe(String.class);

        assertNull(base.refine(String.class, null, null, null));
    }

    @Test
    public void testSignatures() {
        SimpleType stringType = SimpleType.constructUnsafe(String.class);

        assertEquals(
            "Ljava/lang/String;",
            stringType.getErasedSignature(new StringBuilder()).toString()
        );

        String nonGenericSignature = stringType.getGenericSignature(new StringBuilder()).toString();
        assertNotNull(nonGenericSignature);
        assertTrue(nonGenericSignature.endsWith(";"));

        JavaType oneType = typeFactory.constructParametricType(
                OneType.class, typeFactory.constructType(String.class));

        assertTrue(oneType instanceof SimpleType);
        SimpleType one = (SimpleType) oneType;

        String oneSignature = one.getGenericSignature(new StringBuilder()).toString();
        assertTrue(oneSignature.contains("<"));
        assertTrue(oneSignature.contains(">"));

        JavaType twoType = typeFactory.constructParametricType(
                TwoTypes.class,
                typeFactory.constructType(String.class),
                typeFactory.constructType(Integer.class));

        assertTrue(twoType instanceof SimpleType);
        SimpleType two = (SimpleType) twoType;

        String twoSignature = two.getGenericSignature(new StringBuilder()).toString();
        assertTrue(twoSignature.contains("<"));
        assertTrue(twoSignature.contains(">"));
        assertTrue(two.toString().contains("TwoTypes<java.lang.String,java.lang.Integer>"));
    }
}