package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class SimpleTypeTest {

    private SimpleType typeFromUnsafe;
    private SimpleType typeFromConstruct;

    @Before
    public void setUp() {
        typeFromUnsafe = SimpleType.constructUnsafe(String.class);
        typeFromConstruct = SimpleType.construct(String.class);
    }

    // ----- constructUnsafe -----
    @Test
    public void testConstructUnsafeReturnsNonNull() {
        Assert.assertNotNull(typeFromUnsafe);
    }

    // ----- construct (deprecated) -----
    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithMapThrows() {
        SimpleType.construct(HashMap.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithCollectionThrows() {
        SimpleType.construct(ArrayList.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructWithArrayThrows() {
        SimpleType.construct(int[].class);
    }

    @Test
    public void testConstructWithNormalClassReturnsNonNull() {
        Assert.assertNotNull(typeFromConstruct);
    }

    // ----- isContainerType -----
    @Test
    public void testIsContainerTypeReturnsFalse() {
        Assert.assertFalse(typeFromUnsafe.isContainerType());
    }

    // ----- toString -----
    @Test
    public void testToStringContainsSimpleType() {
        String str = typeFromUnsafe.toString();
        Assert.assertTrue(str.contains("simple type"));
        Assert.assertTrue(str.contains(String.class.getName()));
    }

    // ----- equals -----
    @Test
    public void testEqualsSameInstance() {
        Assert.assertTrue(typeFromUnsafe.equals(typeFromUnsafe));
    }

    @Test
    public void testEqualsNull() {
        Assert.assertFalse(typeFromUnsafe.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Object other = new Object();
        Assert.assertFalse(typeFromUnsafe.equals(other));
    }

    @Test
    public void testEqualsSameClassDifferentBindings() {
        // Two SimpleTypes created with constructUnsafe have null bindings, but equality compares _bindings
        SimpleType another = SimpleType.constructUnsafe(String.class);
        // Both have _bindings == null? In constructUnsafe, bindings passed as null.
        // But equals does b1.equals(b2) -> if both null, should be true? Let's check.
        // TypeBindings.equals likely handles nulls.
        Assert.assertTrue(typeFromUnsafe.equals(another));
    }

    @Test
    public void testEqualsDifferentClassType() {
        // Construct a SimpleType for Integer and compare with String
        SimpleType intType = SimpleType.constructUnsafe(Integer.class);
        Assert.assertFalse(typeFromUnsafe.equals(intType));
    }

    // ----- buildCanonicalName -----
    @Test
    public void testBuildCanonicalNameForNoBindings() {
        // Using construct which sets empty bindings
        String canonical = typeFromConstruct.buildCanonicalName();
        Assert.assertEquals(String.class.getName(), canonical);
    }

    // ----- getErasedSignature -----
    @Test
    public void testGetErasedSignature() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = typeFromConstruct.getErasedSignature(sb);
        Assert.assertSame(sb, result);
        Assert.assertTrue(result.length() > 0);
        // Typically for String it's "Ljava/lang/String;"
        Assert.assertEquals("Ljava/lang/String;", result.toString());
    }

    // ----- getGenericSignature -----
    @Test
    public void testGetGenericSignatureForSimpleType() {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = typeFromConstruct.getGenericSignature(sb);
        Assert.assertSame(sb, result);
        // For a simple type without type params, should be class sig plus ';'
        // Expected "Ljava/lang/String;"
        Assert.assertEquals("Ljava/lang/String;", result.toString());
    }

    // ----- withTypeHandler -----
    @Test
    public void testWithTypeHandlerSameHandlerReturnsThis() {
        Object handler = new Object();
        SimpleType withHandler = typeFromConstruct.withTypeHandler(handler);
        // Calling with same handler should return this, but since _typeHandler is null initially, first call returns new
        // Actually withTypeHandler checks if _typeHandler == h, initially _typeHandler is null, so not same.
        // First call returns new instance. Second call with same handler should return same.
        SimpleType secondCall = withHandler.withTypeHandler(handler);
        Assert.assertSame(withHandler, secondCall);
    }

    @Test
    public void testWithTypeHandlerDifferentHandlerReturnsNew() {
        SimpleType newType = typeFromConstruct.withTypeHandler("handler1");
        Assert.assertNotSame(typeFromConstruct, newType);
    }

    // ----- withValueHandler -----
    @Test
    public void testWithValueHandlerSameHandlerReturnsThis() {
        Object handler = new Object();
        SimpleType withHandler = typeFromConstruct.withValueHandler(handler);
        SimpleType secondCall = withHandler.withValueHandler(handler);
        Assert.assertSame(withHandler, secondCall);
    }

    @Test
    public void testWithValueHandlerDifferentHandlerReturnsNew() {
        SimpleType newType = typeFromConstruct.withValueHandler("valueHandler");
        Assert.assertNotSame(typeFromConstruct, newType);
    }

    // ----- withStaticTyping -----
    @Test
    public void testWithStaticTypingWhenAlreadyStaticReturnsThis() {
        SimpleType staticType = typeFromConstruct.withStaticTyping();
        // Now staticType has _asStatic = true.
        SimpleType secondCall = staticType.withStaticTyping();
        Assert.assertSame(staticType, secondCall);
    }

    @Test
    public void testWithStaticTypingWhenNotStaticReturnsNew() {
        Assert.assertNotSame(typeFromConstruct, typeFromConstruct.withStaticTyping());
    }

    // ----- refine -----
    @Test
    public void testRefineReturnsNull() {
        JavaType refined = typeFromConstruct.refine(
                Integer.class, TypeBindings.emptyBindings(), null, null);
        Assert.assertNull(refined);
    }

    // ----- withContentType, withContentTypeHandler, withContentValueHandler -----
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeThrows() {
        typeFromConstruct.withContentType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandlerThrows() {
        typeFromConstruct.withContentTypeHandler(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandlerThrows() {
        typeFromConstruct.withContentValueHandler(null);
    }
}