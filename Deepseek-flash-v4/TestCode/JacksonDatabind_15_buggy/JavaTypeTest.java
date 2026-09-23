package com.fasterxml.jackson.databind;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class JavaTypeTest {
    private static class TestJavaType extends JavaType {
        protected TestJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return new TestJavaType(_class, 0, _valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return new TestJavaType(_class, 0, h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return this;
        }

        @Override
        public JavaType withStaticTyping() {
            return new TestJavaType(_class, 0, _valueHandler, _typeHandler, true);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, 0, _valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType narrowContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public JavaType widenContentsBy(Class<?> contentClass) {
            return this;
        }

        @Override
        public Class<?> getParameterSource() {
            return null;
        }

        @Override
        public String toString() {
            return _class.getName();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestJavaType)) return false;
            return _class.equals(((TestJavaType) o)._class);
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            return sb.append(_class.getName());
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            return sb.append(_class.getName());
        }
    }

    private TestJavaType type;

    @Before
    public void setUp() {
        type = new TestJavaType(String.class, 0, null, null, false);
    }

    @After
    public void tearDown() {
        type = null;
    }

    @Test
    public void testNarrowBySameClass() {
        assertSame(type, type.narrowBy(String.class));
    }

    @Test
    public void testNarrowBySubclass() {
        TestJavaType narrowed = (TestJavaType) type.narrowBy(SubString.class);
        assertEquals(SubString.class, narrowed.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNarrowByInvalidClass() {
        type.narrowBy(Integer.class);
    }

    @Test
    public void testWidenBySameClass() {
        assertSame(type, type.widenBy(String.class));
    }

    @Test
    public void testWidenBySuperclass() {
        TestJavaType widened = (TestJavaType) type.widenBy(CharSequence.class);
        assertEquals(CharSequence.class, widened.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWidenByInvalidClass() {
        type.widenBy(Object.class);
    }

    @Test
    public void testForcedNarrowBySameClass() {
        assertSame(type, type.forcedNarrowBy(String.class));
    }

    @Test
    public void testGetRawClass() {
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testHasRawClass() {
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.hasRawClass(Integer.class));
    }

    @Test
    public void testIsAbstract() {
        TestJavaType abstractType = new TestJavaType(AbstractClass.class, 0, null, null, false);
        assertTrue(abstractType.isAbstract());
        assertFalse(type.isAbstract());
    }

    @Test
    public void testIsConcrete() {
        assertTrue(type.isConcrete());
        TestJavaType abstractType = new TestJavaType(AbstractClass.class, 0, null, null, false);
        assertFalse(abstractType.isConcrete());
        TestJavaType interfaceType = new TestJavaType(Runnable.class, 0, null, null, false);
        assertFalse(interfaceType.isConcrete());
        TestJavaType primitiveType = new TestJavaType(int.class, 0, null, null, false);
        assertTrue(primitiveType.isConcrete());
    }

    @Test
    public void testIsThrowable() {
        TestJavaType throwableType = new TestJavaType(Exception.class, 0, null, null, false);
        assertTrue(throwableType.isThrowable());
        assertFalse(type.isThrowable());
    }

    @Test
    public void testIsArrayType() {
        assertFalse(type.isArrayType());
    }

    @Test
    public void testIsEnumType() {
        TestJavaType enumType = new TestJavaType(MyEnum.class, 0, null, null, false);
        assertTrue(enumType.isEnumType());
        assertFalse(type.isEnumType());
    }

    @Test
    public void testIsInterface() {
        TestJavaType interfaceType = new TestJavaType(Runnable.class, 0, null, null, false);
        assertTrue(interfaceType.isInterface());
        assertFalse(type.isInterface());
    }

    @Test
    public void testIsPrimitive() {
        TestJavaType primitiveType = new TestJavaType(int.class, 0, null, null, false);
        assertTrue(primitiveType.isPrimitive());
        assertFalse(type.isPrimitive());
    }

    @Test
    public void testIsFinal() {
        TestJavaType finalType = new TestJavaType(String.class, 0, null, null, false);
        assertTrue(finalType.isFinal());
        assertFalse(type.isFinal());
    }

    @Test
    public void testIsContainerType() {
        assertFalse(type.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType() {
        assertFalse(type.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType() {
        assertFalse(type.isMapLikeType());
    }

    @Test
    public void testUseStaticType() {
        TestJavaType staticType = new TestJavaType(String.class, 0, null, null, true);
        assertTrue(staticType.useStaticType());
        assertFalse(type.useStaticType());
    }

    @Test
    public void testHasGenericTypes() {
        assertFalse(type.hasGenericTypes());
    }

    @Test
    public void testGetKeyType() {
        assertNull(type.getKeyType());
    }

    @Test
    public void testGetContentType() {
        assertNull(type.getContentType());
    }

    @Test
    public void testContainedTypeCount() {
        assertEquals(0, type.containedTypeCount());
    }

    @Test
    public void testContainedType() {
        assertNull(type.containedType(0));
    }

    @Test
    public void testContainedTypeName() {
        assertNull(type.containedTypeName(0));
    }

    @Test
    public void testContainedTypeOrUnknownWhenNonNull() {
        assertNull(type.containedTypeOrUnknown(0));
    }

    @Test
    public void testGetValueHandler() {
        Object handler = new Object();
        TestJavaType withHandler = new TestJavaType(String.class, 0, handler, null, false);
        assertSame(handler, withHandler.getValueHandler());
        assertNull(type.getValueHandler());
    }

    @Test
    public void testGetTypeHandler() {
        Object handler = new Object();
        TestJavaType withHandler = new TestJavaType(String.class, 0, null, handler, false);
        assertSame(handler, withHandler.getTypeHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testGetGenericSignature() {
        String signature = type.getGenericSignature();
        assertNotNull(signature);
        assertTrue(signature.contains("String"));
    }

    @Test
    public void testGetErasedSignature() {
        String signature = type.getErasedSignature();
        assertNotNull(signature);
        assertTrue(signature.contains("String"));
    }

    @Test
    public void testHashCode() {
        TestJavaType other = new TestJavaType(String.class, 0, null, null, false);
        assertEquals(other.hashCode(), type.hashCode());
        TestJavaType different = new TestJavaType(Integer.class, 0, null, null, false);
        assertNotEquals(different.hashCode(), type.hashCode());
    }

    @Test
    public void testWithTypeHandler() {
        Object handler = new Object();
        JavaType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        assertSame(handler, result.getTypeHandler());
    }

    @Test
    public void testWithValueHandler() {
        Object handler = new Object();
        JavaType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        assertSame(handler, result.getValueHandler());
    }

    @Test
    public void testWithStaticTyping() {
        JavaType result = type.withStaticTyping();
        assertNotSame(type, result);
        assertTrue(result.useStaticType());
    }

    @Test
    public void testWithContentTypeHandler() {
        assertSame(type, type.withContentTypeHandler(new Object()));
    }

    @Test
    public void testWithContentValueHandler() {
        assertSame(type, type.withContentValueHandler(new Object()));
    }

    private static class SubString extends String {
        public SubString() {
            super();
        }
    }

    private abstract static class AbstractClass {
    }

    private enum MyEnum {
        VALUE
    }
}