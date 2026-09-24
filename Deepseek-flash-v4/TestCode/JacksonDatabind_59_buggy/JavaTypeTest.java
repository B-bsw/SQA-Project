package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JavaTypeTest {

    private enum TestEnum { VALUE }

    private static class TestJavaType extends JavaType {
        private final JavaType _contentType;
        private final int _containedTypeCount;

        TestJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            _contentType = null;
            _containedTypeCount = 0;
        }

        private TestJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler,
                boolean asStatic, JavaType contentType, int containedTypeCount) {
            super(raw, additionalHash, valueHandler, typeHandler, asStatic);
            _contentType = contentType;
            _containedTypeCount = containedTypeCount;
        }

        private int additionalHashForBase() {
            return _hash - _class.getName().hashCode();
        }

        private TestJavaType copyWith(Object valueHandler, Object typeHandler, boolean asStatic) {
            return new TestJavaType(_class, additionalHashForBase(), valueHandler, typeHandler, asStatic,
                    _contentType, _containedTypeCount);
        }

        @Override
        public JavaType withTypeHandler(Object h) {
            return copyWith(_valueHandler, h, _asStatic);
        }

        @Override
        public JavaType withContentTypeHandler(Object h) {
            return copyWith(_valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withValueHandler(Object h) {
            return copyWith(h, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentValueHandler(Object h) {
            return copyWith(_valueHandler, _typeHandler, _asStatic);
        }

        @Override
        public JavaType withContentType(JavaType contentType) {
            if (_containedTypeCount == 0) {
                throw new IllegalArgumentException("Type has no content type");
            }
            if (_contentType == contentType) {
                return this;
            }
            return new TestJavaType(_class, additionalHashForBase(), _valueHandler, _typeHandler, _asStatic,
                    contentType, _containedTypeCount);
        }

        @Override
        public JavaType withStaticTyping() {
            if (_asStatic) {
                return this;
            }
            return copyWith(_valueHandler, _typeHandler, true);
        }

        @Override
        public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) {
            return new TestJavaType(rawType, additionalHashForBase(), _valueHandler, _typeHandler, _asStatic,
                    _contentType, _containedTypeCount);
        }

        @Override
        protected JavaType _narrow(Class<?> subclass) {
            return new TestJavaType(subclass, 0, null, null, _asStatic);
        }

        @Override
        public boolean isContainerType() {
            return _containedTypeCount > 0;
        }

        @Override
        public int containedTypeCount() {
            return _containedTypeCount;
        }

        @Override
        public JavaType containedType(int index) {
            if (index < 0 || index >= _containedTypeCount) {
                return null;
            }
            return (index == 0) ? _contentType : null;
        }

        @Override
        public String containedTypeName(int index) {
            return "T" + index;
        }

        @Override
        public TypeBindings getBindings() {
            return null;
        }

        @Override
        public JavaType findSuperType(Class<?> erasedTarget) {
            return null;
        }

        @Override
        public JavaType getSuperClass() {
            return null;
        }

        @Override
        public List<JavaType> getInterfaces() {
            return Collections.emptyList();
        }

        @Override
        public JavaType[] findTypeParameters(Class<?> expType) {
            return new JavaType[0];
        }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) {
            sb.append('L').append(_class.getName().replace('.', '/')).append(';');
            return sb;
        }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) {
            sb.append('L').append(_class.getName().replace('.', '/')).append(';');
            return sb;
        }

        @Override
        public String toString() {
            return _class.getName();
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof JavaType)) {
                return false;
            }
            JavaType other = (JavaType) o;
            return (_class == other._class) && (_hash == other._hash);
        }

        @Override
        public JavaType getContentType() {
            return _contentType;
        }
    }

    @Test
    public void testRawClassAndHash() {
        JavaType type = new TestJavaType(String.class, 7, null, null, false);
        assertEquals(String.class, type.getRawClass());
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.hasRawClass(Integer.class));
        assertEquals(String.class.getName().hashCode() + 7, type.hashCode());
    }

    @Test
    public void testTypeRelationshipFlags() {
        JavaType stringType = new TestJavaType(String.class, 0, null, null, false);
        JavaType charSequenceType = new TestJavaType(CharSequence.class, 0, null, null, false);
        JavaType numberType = new TestJavaType(Number.class, 0, null, null, false);
        JavaType intType = new TestJavaType(int.class, 0, null, null, false);

        assertTrue(stringType.isTypeOrSubTypeOf(String.class));
        assertTrue(stringType.isTypeOrSubTypeOf(CharSequence.class));
        assertFalse(stringType.isTypeOrSubTypeOf(Integer.class));

        assertFalse(stringType.isAbstract());
        assertTrue(charSequenceType.isAbstract());
        assertTrue(numberType.isAbstract());

        assertFalse(stringType.isInterface());
        assertTrue(charSequenceType.isInterface());

        assertFalse(stringType.isPrimitive());
        assertTrue(intType.isPrimitive());

        assertTrue(stringType.isFinal());
        assertFalse(numberType.isFinal());

        assertTrue(stringType.isConcrete());
        assertFalse(numberType.isConcrete());
        assertTrue(intType.isConcrete());
        assertFalse(charSequenceType.isConcrete());

        assertFalse(stringType.isArrayType());
        assertFalse(stringType.isCollectionLikeType());
        assertFalse(stringType.isMapLikeType());
    }

    @Test
    public void testSpecialTypeFlags() {
        assertTrue(new TestJavaType(TestEnum.class, 0, null, null, false).isEnumType());
        assertFalse(new TestJavaType(String.class, 0, null, null, false).isEnumType());

        assertTrue(new TestJavaType(IllegalArgumentException.class, 0, null, null, false).isThrowable());
        assertFalse(new TestJavaType(String.class, 0, null, null, false).isThrowable());

        JavaType objectType = new TestJavaType(Object.class, 0, null, null, false);
        assertTrue(objectType.isJavaLangObject());
        assertFalse(new TestJavaType(String.class, 0, null, null, false).isJavaLangObject());

        assertTrue(new TestJavaType(String.class, 0, null, null, true).useStaticType());
        assertFalse(new TestJavaType(String.class, 0, null, null, false).useStaticType());

        JavaType simple = new TestJavaType(String.class, 0, null, null, false);
        assertTrue(simple.hasContentType());
        assertNull(simple.getKeyType());
        assertNull(simple.getContentType());
        assertNull(simple.getReferencedType());
        assertNull(simple.getParameterSource());
    }

    @Test
    public void testSignatures() {
        JavaType type = new TestJavaType(String.class, 0, null, null, false);
        assertEquals("Ljava/lang/String;", type.getGenericSignature());
        assertEquals("Ljava/lang/String;", type.getErasedSignature());

        StringBuilder generic = new StringBuilder("prefix");
        assertSame(generic, type.getGenericSignature(generic));
        assertEquals("prefixLjava/lang/String;", generic.toString());

        StringBuilder erased = new StringBuilder("prefix");
        assertSame(erased, type.getErasedSignature(erased));
        assertEquals("prefixLjava/lang/String;", erased.toString());
    }

    @Test
    public void testHandlers() {
        JavaType noHandlers = new TestJavaType(String.class, 0, null, null, false);
        assertNull(noHandlers.getValueHandler());
        assertNull(noHandlers.getTypeHandler());
        assertFalse(noHandlers.hasValueHandler());
        assertFalse(noHandlers.hasHandlers());
        assertNull(noHandlers.getContentValueHandler());
        assertNull(noHandlers.getContentTypeHandler());

        Object vh = new Object();
        Object th = new Object();
        JavaType withValue = new TestJavaType(String.class, 0, vh, null, false);
        JavaType withType = new TestJavaType(String.class, 0, null, th, false);
        JavaType withBoth = new TestJavaType(String.class, 0, vh, th, false);

        assertTrue(withValue.hasValueHandler());
        assertTrue(withValue.hasHandlers());
        assertTrue(withType.hasHandlers());
        assertTrue(withBoth.hasHandlers());
        assertSame(vh, withBoth.getValueHandler());
        assertSame(th, withBoth.getTypeHandler());
    }

    @Test
    public void testContainedTypesAndUnknown() {
        JavaType stringContent = new TestJavaType(String.class, 0, null, null, false);
        JavaType withContent = new TestJavaType(String.class, 0, null, null, false,
                stringContent, 1);

        assertTrue(withContent.hasGenericTypes());
        assertFalse(new TestJavaType(String.class, 0, null, null, false).hasGenericTypes());
        assertSame(stringContent, withContent.containedType(0));
        assertSame(stringContent, withContent.containedTypeOrUnknown(0));

        JavaType noContent = new TestJavaType(String.class, 0, null, null, false);
        JavaType unknown = noContent.containedTypeOrUnknown(0);
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testForcedNarrowBySameClassReturnsThis() {
        JavaType type = new TestJavaType(String.class, 5, "vh", "th", false);
        assertSame(type, type.forcedNarrowBy(String.class));
    }

    @Test
    public void testForcedNarrowByCopiesHandlers() {
        Object vh = new Object();
        Object th = new Object();
        JavaType type = new TestJavaType(String.class, 5, vh, th, false);
        JavaType narrowed = type.forcedNarrowBy(CharSequence.class);

        assertNotSame(type, narrowed);
        assertEquals(CharSequence.class, narrowed.getRawClass());
        assertSame(vh, narrowed.getValueHandler());
        assertSame(th, narrowed.getTypeHandler());
    }

    @Test
    public void testForcedNarrowByWithoutHandlers() {
        JavaType type = new TestJavaType(String.class, 5, null, null, false);
        JavaType narrowed = type.forcedNarrowBy(Number.class);

        assertEquals(Number.class, narrowed.getRawClass());
        assertNull(narrowed.getValueHandler());
        assertNull(narrowed.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeOnNonContainerThrows() {
        JavaType type = new TestJavaType(String.class, 0, null, null, false);
        type.withContentType(new TestJavaType(Integer.class, 0, null, null, false));
    }
}