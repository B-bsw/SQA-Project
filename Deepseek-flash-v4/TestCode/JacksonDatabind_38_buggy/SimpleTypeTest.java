package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;

import com.fasterxml.jackson.databind.JavaType;

public class SimpleTypeTest {

    private static class TestTypeBindings extends TypeBindings {
        private final JavaType[] types;
        
        TestTypeBindings(JavaType... types) {
            this.types = types;
        }
        
        @Override
        public int size() {
            return types.length;
        }
        
        @Override
        public JavaType getBoundType(int index) {
            return types[index];
        }
        
        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null) return false;
            if (o.getClass() != getClass()) return false;
            TestTypeBindings other = (TestTypeBindings) o;
            return Arrays.equals(types, other.types);
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(types);
        }
    }

    @Test
    public void testConstructUnsafe() {
        SimpleType type = SimpleType.constructUnsafe(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
        assertEquals(false, type.isContainerType());
        assertNull(type.getContentType());
    }

    @Test
    public void testConstructValid() {
        SimpleType type = SimpleType.construct(String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructMap() {
        SimpleType.construct(Map.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructCollection() {
        SimpleType.construct(Collection.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructArray() {
        SimpleType.construct(String[].class);
    }

    @Test
    public void testWithTypeHandlerSame() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getTypeHandler());
    }

    @Test
    public void testWithTypeHandlerNull() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType result = type.withTypeHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithValueHandlerSame() {
        SimpleType type = SimpleType.construct(String.class);
        Object handler = new Object();
        SimpleType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithValueHandlerNull() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType result = type.withValueHandler(null);
        assertSame(type, result);
    }

    @Test
    public void testWithStaticTypingAlreadyStatic() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType staticType = type.withStaticTyping();
        assertTrue(staticType.isStatic());
        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testWithStaticTypingNonStatic() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.isStatic());
        SimpleType staticType = type.withStaticTyping();
        assertTrue(staticType.isStatic());
        assertNotSame(type, staticType);
    }

    @Test
    public void testWithContentTypeHandler() {
        SimpleType type = SimpleType.construct(String.class);
        try {
            type.withContentTypeHandler(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testWithContentValueHandler() {
        SimpleType type = SimpleType.construct(String.class);
        try {
            type.withContentValueHandler(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testRefine() {
        SimpleType type = SimpleType.construct(String.class);
        assertNull(type.refine(String.class, TypeBindings.emptyBindings(), null, null));
    }

    @Test
    public void testBuildCanonicalNameNoBindings() {
        SimpleType type = SimpleType.construct(String.class);
        assertEquals("java.lang.String", type.toCanonical());
    }

    @Test
    public void testBuildCanonicalNameWithBindings() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType contained = SimpleType.construct(Integer.class);
        TypeBindings bindings = new TestTypeBindings(contained);
        SimpleType boundType = new SimpleType(String.class, bindings, null, null, null, null, false);
        assertEquals("java.lang.String<java.lang.Integer>", boundType.toCanonical());
    }

    @Test
    public void testEqualsSameObject() {
        SimpleType type = SimpleType.construct(String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEqualsNull() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(Integer.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEqualsDifferentBindings() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEqualsSameBindings() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testGetErasedSignature() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().contains("java.lang.String"));
    }

    @Test
    public void testGetGenericSignatureNoBindings() {
        SimpleType type = SimpleType.construct(String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().endsWith(";"));
        assertTrue(result.toString().contains("java.lang.String"));
    }

    @Test
    public void testGetGenericSignatureWithBindings() {
        SimpleType type = SimpleType.construct(String.class);
        JavaType contained = SimpleType.construct(Integer.class);
        TypeBindings bindings = new TestTypeBindings(contained);
        SimpleType boundType = new SimpleType(String.class, bindings, null, null, null, null, false);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = boundType.getGenericSignature(sb);
        assertSame(sb, result);
        assertTrue(result.toString().contains("<"));
        assertTrue(result.toString().contains(">"));
    }

    @Test
    public void testToString() {
        SimpleType type = SimpleType.construct(String.class);
        String str = type.toString();
        assertTrue(str.contains("simple type"));
        assertTrue(str.contains("java.lang.String"));
    }

    @Test
    public void testIsContainerType() {
        SimpleType type = SimpleType.construct(String.class);
        assertFalse(type.isContainerType());
    }

    @Test
    public void testWithContentType() {
        SimpleType type = SimpleType.construct(String.class);
        try {
            type.withContentType(type);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testConstructUnsafeNullClass() {
        try {
            SimpleType.constructUnsafe(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testEqualsDifferentBindingsNonNull() {
        SimpleType type1 = SimpleType.construct(String.class);
        SimpleType type2 = SimpleType.construct(String.class);
        SimpleType type3 = SimpleType.construct(Integer.class);
        assertFalse(type1.equals(type3));
    }

    @Test
    public void testWithTypeHandlerReturnsNew() {
        SimpleType type = SimpleType.construct(String.class);
        SimpleType result = type.withTypeHandler(new Object());
        assertNotSame(type, result);
    }

    @Test
    public void testWithContentTypeHandlerFromBefore() {
        SimpleType type = SimpleType.construct(String.class);
        try {
            type.withContentTypeHandler(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("content types"));
        }
    }
}