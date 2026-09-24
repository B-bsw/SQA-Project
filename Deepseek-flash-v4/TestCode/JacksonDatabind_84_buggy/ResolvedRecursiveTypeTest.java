package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;

public class ResolvedRecursiveTypeTest {

    private ResolvedRecursiveType createType(Class<?> cls) {
        JavaType ref = TypeFactory.defaultInstance().constructType(cls);
        return new ResolvedRecursiveType(ref.getRawClass(), ref.getBindings());
    }

    private ResolvedRecursiveType createResolvedType(Class<?> cls, Class<?> refCls) {
        ResolvedRecursiveType type = createType(cls);
        JavaType ref = TypeFactory.defaultInstance().constructType(refCls);
        type.setReference(ref);
        return type;
    }

    @Test
    public void testConstructor() {
        ResolvedRecursiveType type = createType(String.class);
        assertEquals(String.class, type.getRawClass());
        assertFalse(type.isContainerType());
    }

    @Test
    public void testInitialSelfRefNull() {
        ResolvedRecursiveType type = createType(String.class);
        assertNull(type.getSelfReferencedType());
    }

    @Test
    public void testSetReference() {
        ResolvedRecursiveType type = createType(String.class);
        JavaType ref = TypeFactory.defaultInstance().constructType(Integer.class);
        type.setReference(ref);
        assertSame(ref, type.getSelfReferencedType());
    }

    @Test(expected = IllegalStateException.class)
    public void testSetReferenceTwiceThrows() {
        ResolvedRecursiveType type = createType(String.class);
        type.setReference(TypeFactory.defaultInstance().constructType(Integer.class));
        type.setReference(TypeFactory.defaultInstance().constructType(Long.class));
    }

    @Test
    public void testGetGenericSignature() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getGenericSignature(sb);
        assertSame(sb, result);
        assertTrue(sb.length() > 0);
    }

    @Test
    public void testGetErasedSignature() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = type.getErasedSignature(sb);
        assertSame(sb, result);
        assertTrue(sb.length() > 0);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericSignatureUnresolvedNPE() {
        ResolvedRecursiveType type = createType(String.class);
        type.getGenericSignature(new StringBuilder());
    }

    @Test
    public void testWithMethodsReturnThis() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        JavaType contentType = TypeFactory.defaultInstance().constructType(Integer.class);
        Object handler = new Object();
        assertSame(type, type.withContentType(contentType));
        assertSame(type, type.withTypeHandler(handler));
        assertSame(type, type.withContentTypeHandler(handler));
        assertSame(type, type.withValueHandler(handler));
        assertSame(type, type.withContentValueHandler(handler));
        assertSame(type, type.withStaticTyping());
    }

    @Test
    public void testRefineReturnsNull() {
        ResolvedRecursiveType type = createType(String.class);
        assertNull(type.refine(String.class, null, null, null));
    }

    @Test
    public void testToStringUnresolved() {
        ResolvedRecursiveType type = createType(String.class);
        assertEquals("[recursive type; UNRESOLVED]", type.toString());
    }

    @Test
    public void testToStringResolved() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        String str = type.toString();
        assertTrue(str.startsWith("[recursive type; "));
        assertTrue(str.contains("java.lang.String"));
        assertTrue(str.endsWith("]"));
    }

    @Test
    public void testEqualsSameObject() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        assertTrue(type.equals(type));
    }

    @Test
    public void testEqualsNull() {
        ResolvedRecursiveType type = createResolvedType(String.class, String.class);
        assertFalse(type.equals(null));
    }

    @Test
    public void testEqualsUnresolvedReturnsFalse() {
        ResolvedRecursiveType type1 = createType(String.class);
        ResolvedRecursiveType type2 = createType(String.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEqualsSameRefType() {
        ResolvedRecursiveType type1 = createResolvedType(String.class, Integer.class);
        ResolvedRecursiveType type2 = createResolvedType(String.class, Integer.class);
        assertTrue(type1.equals(type2));
    }

    @Test
    public void testEqualsDifferentRefType() {
        ResolvedRecursiveType type1 = createResolvedType(String.class, Integer.class);
        ResolvedRecursiveType type2 = createResolvedType(String.class, Long.class);
        assertFalse(type1.equals(type2));
    }

    @Test
    public void testEqualsDifferentClass() {
        ResolvedRecursiveType type1 = createResolvedType(String.class, String.class);
        assertFalse(type1.equals("not a recursive type"));
    }
}