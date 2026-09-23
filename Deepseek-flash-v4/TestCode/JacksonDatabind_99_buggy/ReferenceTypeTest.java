package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class ReferenceTypeTest {

    private JavaType stringType;
    private ReferenceType referenceType;

    @Before
    public void setUp() {
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        referenceType = ReferenceType.construct(String.class,
                TypeBindings.emptyBindings(), null, null, stringType);
    }

    @Test
    public void testUpgradeFromValidBase() {
        JavaType ref = TypeFactory.defaultInstance().constructType(Object.class);
        ReferenceType rt = ReferenceType.upgradeFrom(stringType, ref);

        assertNotNull(rt);
        assertSame(ref, rt.getReferencedType());
        assertEquals(String.class, rt.getRawClass());
        assertTrue(rt.isReferenceType());
        assertTrue(rt.hasContentType());
        assertTrue(rt.isAnchorType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFromNullRefThrows() {
        ReferenceType.upgradeFrom(stringType, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFromNonTypeBaseThrows() {
        ReferenceType.upgradeFrom(new NonTypeBaseJavaType(), stringType);
    }

    @Test
    public void testConstructAndAccessors() {
        assertNotNull(referenceType);
        assertSame(stringType, referenceType.getContentType());
        assertSame(stringType, referenceType.getReferencedType());
        assertTrue(referenceType.hasContentType());
        assertTrue(referenceType.isReferenceType());
        assertTrue(referenceType.isAnchorType());
        assertEquals(String.class, referenceType.getRawClass());
    }

    @Test
    public void testWithContentType() {
        assertSame(referenceType, referenceType.withContentType(stringType));

        JavaType other = TypeFactory.defaultInstance().constructType(Integer.class);
        ReferenceType changed = (ReferenceType) referenceType.withContentType(other);

        assertNotSame(referenceType, changed);
        assertSame(other, changed.getContentType());
        assertSame(referenceType, changed.getAnchorType());
        assertFalse(changed.isAnchorType());
    }

    @Test
    public void testWithTypeHandler() {
        assertSame(referenceType, referenceType.withTypeHandler(null));

        Object handler = new Object();
        ReferenceType changed = referenceType.withTypeHandler(handler);

        assertNotSame(referenceType, changed);
        assertSame(changed, changed.withTypeHandler(handler));
        assertFalse(changed.isAnchorType());
    }

    @Test
    public void testWithContentTypeHandler() {
        assertSame(referenceType, referenceType.withContentTypeHandler(null));

        Object handler = new Object();
        ReferenceType changed = referenceType.withContentTypeHandler(handler);

        assertNotSame(referenceType, changed);
        assertSame(changed, changed.withContentTypeHandler(handler));
        assertFalse(changed.isAnchorType());
    }

    @Test
    public void testWithValueHandler() {
        assertSame(referenceType, referenceType.withValueHandler(null));

        Object handler = new Object();
        ReferenceType changed = referenceType.withValueHandler(handler);

        assertNotSame(referenceType, changed);
        assertSame(changed, changed.withValueHandler(handler));
        assertFalse(changed.isAnchorType());
    }

    @Test
    public void testWithContentValueHandler() {
        assertSame(referenceType, referenceType.withContentValueHandler(null));

        Object handler = new Object();
        ReferenceType changed = referenceType.withContentValueHandler(handler);

        assertNotSame(referenceType, changed);
        assertSame(changed, changed.withContentValueHandler(handler));
        assertFalse(changed.isAnchorType());
    }

    @Test
    public void testWithStaticTyping() {
        ReferenceType changed = referenceType.withStaticTyping();

        assertNotSame(referenceType, changed);
        assertSame(changed, changed.withStaticTyping());
        assertTrue(changed.isStatic());
    }

    @Test
    public void testRefine() {
        JavaType refined = referenceType.refine(CharSequence.class,
                TypeBindings.emptyBindings(), null, null);

        assertTrue(refined instanceof ReferenceType);
        assertEquals(CharSequence.class, refined.getRawClass());
        assertSame(stringType, refined.getReferencedType());
    }

    @Test
    public void testBuildCanonicalName() {
        assertEquals("java.lang.String<java.lang.String",
                referenceType.buildCanonicalName());
    }

    @Test
    public void testToString() {
        String str = referenceType.toString();

        assertTrue(str.startsWith("[reference type, class "));
        assertTrue(str.contains("java.lang.String"));
    }

    @Test
    public void testEquals() {
        assertTrue(referenceType.equals(referenceType));
        assertFalse(referenceType.equals(null));
        assertFalse(referenceType.equals(new Object()));

        ReferenceType same = ReferenceType.construct(String.class,
                TypeBindings.emptyBindings(), null, null, stringType);
        assertTrue(referenceType.equals(same));

        ReferenceType otherClass = ReferenceType.construct(Integer.class,
                TypeBindings.emptyBindings(), null, null, stringType);
        assertFalse(referenceType.equals(otherClass));

        JavaType integerType = TypeFactory.defaultInstance().constructType(Integer.class);
        ReferenceType otherRef = ReferenceType.construct(String.class,
                TypeBindings.emptyBindings(), null, null, integerType);
        assertFalse(referenceType.equals(otherRef));
    }

    @Test
    public void testSignatures() {
        StringBuilder erased = new StringBuilder();
        assertSame(erased, referenceType.getErasedSignature(erased));
        assertTrue(erased.toString().contains("java/lang/String"));
        assertTrue(erased.toString().endsWith(";"));

        StringBuilder generic = new StringBuilder();
        assertSame(generic, referenceType.getGenericSignature(generic));
        String genericSig = generic.toString();
        assertTrue(genericSig.startsWith("Ljava/lang/String<"));
        assertTrue(genericSig.endsWith(">;"));
    }

    @Test(expected = NullPointerException.class)
    public void testDeprecatedConstructThrowsNpe() {
        ReferenceType.construct(String.class, stringType);
    }

    private static class NonTypeBaseJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        NonTypeBaseJavaType() {
            super(NonTypeBaseJavaType.class, 0, null, null, false);
        }

        @Override
        public JavaType withTypeHandler(Object h) { return this; }

        @Override
        public JavaType withContentType(JavaType contentType) { return this; }

        @Override
        public JavaType withContentTypeHandler(Object h) { return this; }

        @Override
        public JavaType withValueHandler(Object h) { return this; }

        @Override
        public JavaType withContentValueHandler(Object h) { return this; }

        @Override
        public JavaType withStaticTyping() { return this; }

        @Override
        public JavaType refine(Class<?> rawType, TypeBindings bindings,
                JavaType superClass, JavaType[] superInterfaces) {
            return this;
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return this;
        }

        @Override
        protected String buildCanonicalName() {
            return "stub";
        }

        @Override
        public boolean isContainerType() { return false; }

        @Override
        public boolean isReferenceType() { return false; }

        @Override
        public int containedTypeCount() { return 0; }

        @Override
        public JavaType containedType(int index) { return null; }

        @Override
        public String containedTypeName(int index) { return null; }

        @Override
        public JavaType getContentType() { return null; }

        @Override
        public JavaType getReferencedType() { return null; }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }

        @Override
        public String toCanonical() { return "stub"; }

        @Override
        public boolean hasContentType() { return false; }
    }
}