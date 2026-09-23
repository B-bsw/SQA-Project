package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Test;

public class ReferenceTypeTest {

    private JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    private JavaType integerType() {
        return TypeFactory.defaultInstance().constructType(Integer.class);
    }

    @Test
    public void testConstructAndBasicAccessors() {
        JavaType ref = stringType();
        ReferenceType type = ReferenceType.construct(String.class, ref, new Object(), new Object());

        assertNotNull(type);
        assertTrue(type.isReferenceType());
        assertSame(ref, type.getReferencedType());

        assertEquals(1, type.containedTypeCount());
        assertSame(ref, type.containedType(0));
        assertNull(type.containedType(1));

        assertEquals("T", type.containedTypeName(0));
        assertNull(type.containedTypeName(1));

        assertSame(String.class, type.getParameterSource());

        // ReferenceType.construct intentionally ignores these handlers.
        assertNull(type.getValueHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler() {
        Object handler = "th";

        ReferenceType same = new ReferenceType(String.class, stringType(), "vh", handler, false);
        assertSame(same, same.withTypeHandler(handler));

        ReferenceType type = new ReferenceType(String.class, stringType(), null, null, false);
        ReferenceType changed = type.withTypeHandler(handler);

        assertNotSame(type, changed);
        assertSame(handler, changed.getTypeHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler() {
        JavaType refWithHandler = stringType().withTypeHandler("th");
        ReferenceType same = new ReferenceType(String.class, refWithHandler, null, null, false);
        assertSame(same, same.withContentTypeHandler("th"));

        ReferenceType type = new ReferenceType(String.class, stringType(), null, null, false);
        ReferenceType changed = type.withContentTypeHandler("th");

        assertNotSame(type, changed);
        assertEquals("th", changed.getReferencedType().getTypeHandler());
        assertNull(type.getReferencedType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler() {
        Object valueHandler = "vh";

        ReferenceType same = new ReferenceType(String.class, stringType(), valueHandler, "th", false);
        assertSame(same, same.withValueHandler(valueHandler));

        ReferenceType type = new ReferenceType(String.class, stringType(), null, null, false);
        ReferenceType changed = type.withValueHandler(valueHandler);

        assertNotSame(type, changed);
        assertSame(valueHandler, changed.getValueHandler());
        assertNull(type.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler() {
        JavaType refWithValue = stringType().withValueHandler("vh");
        ReferenceType same = new ReferenceType(String.class, refWithValue, null, null, false);
        assertSame(same, same.withContentValueHandler("vh"));

        ReferenceType type = new ReferenceType(String.class, stringType(), null, null, false);
        ReferenceType changed = type.withContentValueHandler("vh");

        assertNotSame(type, changed);
        assertEquals("vh", changed.getReferencedType().getValueHandler());
        assertNull(type.getReferencedType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping() {
        ReferenceType staticType = new ReferenceType(String.class, stringType(), null, null, true);
        assertSame(staticType, staticType.withStaticTyping());

        ReferenceType nonStaticType = new ReferenceType(String.class, stringType(), null, null, false);
        ReferenceType changed = nonStaticType.withStaticTyping();

        assertNotSame(nonStaticType, changed);
        assertTrue(changed.isStaticTyping());
        assertSame(changed, changed.withStaticTyping());
    }

    @Test
    public void testBuildCanonicalNameAndToString() {
        JavaType ref = stringType();
        ReferenceType type = ReferenceType.construct(String.class, ref, null, null);

        String expectedCanonical = String.class.getName() + "<" + ref.toCanonical();
        assertEquals(expectedCanonical, type.buildCanonicalName());

        String toString = type.toString();
        assertTrue(toString.startsWith("[reference type, class " + String.class.getName() + "<"));
        assertTrue(toString.contains(ref.toCanonical()));
        assertTrue(toString.endsWith("]"));
    }

    @Test
    public void testNarrow() {
        JavaType ref = stringType();
        ReferenceType type = new ReferenceType(Number.class, ref, "vh", "th", false);

        ReferenceType narrowed = (ReferenceType) type._narrow(Integer.class);

        assertNotNull(narrowed);
        assertSame(Integer.class, narrowed.getParameterSource());
        assertSame(ref, narrowed.getReferencedType());
        assertEquals("vh", narrowed.getValueHandler());
        assertEquals("th", narrowed.getTypeHandler());
    }

    @Test
    public void testGetErasedAndGenericSignatures() {
        ReferenceType type = new ReferenceType(ReferenceType.class, stringType(), null, null, false);

        StringBuilder erasedBuilder = new StringBuilder();
        assertSame(erasedBuilder, type.getErasedSignature(erasedBuilder));
        assertEquals("Lcom/fasterxml/jackson/databind/type/ReferenceType;", erasedBuilder.toString());

        StringBuilder genericBuilder = new StringBuilder();
        assertSame(genericBuilder, type.getGenericSignature(genericBuilder));

        String genericSignature = genericBuilder.toString();
        assertTrue(genericSignature.startsWith("Lcom/fasterxml/jackson/databind/type/ReferenceType"));
        assertTrue(genericSignature.contains("Ljava/lang/String;"));
    }

    @Test
    public void testEquals() {
        JavaType ref = stringType();
        ReferenceType type = new ReferenceType(String.class, ref, "vh", "th", false);

        assertTrue(type.equals(type));
        assertFalse(type.equals(null));
        assertFalse(type.equals("x"));
        assertFalse(type.equals(new ReferenceType(Integer.class, ref, null, null, false)));
        assertFalse(type.equals(new ReferenceType(String.class, integerType(), null, null, false)));

        ReferenceType same = new ReferenceType(String.class, ref, null, null, true);
        assertTrue(type.equals(same));
    }
}