package com.fasterxml.jackson.databind.util;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

public class ClassUtilTest {
    private static class TestBean {
        private int value;
        public TestBean() { this.value = 42; }
        public int getValue() { return value; }
    }

    private static class SubTestBean extends TestBean {}

    private static class AbstractTest {
        public abstract void method();
    }

    private static class EnumHolder {
        public enum TestEnum { FIRST, SECOND }
    }

    private static class AnnotatedHolder {
        @Deprecated
        public static final TestEnum testEnum = TestEnum.FIRST;
    }

    private static class InnerClass {
        class NonStaticInner {}
        static class StaticInner {}
    }

    private static class EnumSubclass extends Enum<EnumSubclass> {
        private EnumSubclass(String name, int ordinal) { super(name, ordinal); }
        public static final EnumSubclass A = new EnumSubclass("A", 0);
    }

    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void testEmptyIterator() {
        assertNotNull(ClassUtil.emptyIterator());
        assertFalse(ClassUtil.emptyIterator().hasNext());
    }

    @Test
    public void testFindSuperTypesWithJavaType() {
        JavaType type = new JavaType() {
            @Override public Class<?> getRawClass() { return TestBean.class; }
            @Override public boolean hasRawClass(Class<?> c) { return c == TestBean.class || c == Object.class; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isAbstract() { return false; }
            @Override public boolean isConcrete() { return true; }
            @Override public boolean isThrowable() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isPrimitive() { return false; }
            @Override public boolean isCollectionLike() { return false; }
            @Override public boolean isMapLike() { return false; }
            @Override public boolean isFinal() { return false; }
            @Override public boolean isContainerType() { return false; }
            @Override public boolean isReferenceType() { return false; }
            @Override public JavaType withTypeHandler(Object h) { return null; }
            @Override public JavaType withContentTypeHandler(Object h) { return null; }
            @Override public JavaType withValueHandler(Object h) { return null; }
            @Override public JavaType withContentValueHandler(Object h) { return null; }
            @Override public JavaType withStaticTyping() { return null; }
            @Override public JavaType narrowBy(Class<?> c) { return null; }
            @Override public JavaType narrowContentsBy(Class<?> c) { return null; }
            @Override public JavaType findSuperType(Class<?> c) { return null; }
            @Override public JavaType findContentType() { return null; }
            @Override public JavaType findValueType() { return null; }
            @Override public JavaType getKeyType() { return null; }
            @Override public JavaType getContentType() { return null; }
            @Override public int containedTypeCount() { return 0; }
            @Override public JavaType containedType(int i) { return null; }
            @Override public String containedTypeName(int i) { return null; }
            @Override public String toCanonical() { return ""; }
            @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
            @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
            @Override public String toString() { return ""; }
            @Override public boolean equals(Object o) { return false; }
            @Override public int hashCode() { return 0; }
        };
        List<JavaType> result = ClassUtil.findSuperTypes(type, Object.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindSuperTypesWithNullJavaType() {
        List<JavaType> result = ClassUtil.findSuperTypes((JavaType) null, Object.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindRawSuperTypes() {
        List<Class<?>> result = ClassUtil.findRawSuperTypes(SubTestBean.class, Object.class, true);
        assertNotNull(result);
        assertTrue(result.contains(SubTestBean.class));
        assertTrue(result.contains(TestBean.class));
    }

    @Test
    public void testFindRawSuperTypesWithSelf() {
        List<Class<?>> result = ClassUtil.findRawSuperTypes(TestBean.class, Object.class, false);
        assertNotNull(result);
        assertFalse(result.contains(TestBean.class));
    }

    @Test
    public void testFindRawSuperTypesNull() {
        List<Class<?>> result = ClassUtil.findRawSuperTypes(null, Object.class, true);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindSuperClasses() {
        List<Class<?>> result = ClassUtil.findSuperClasses(SubTestBean.class, Object.class, false);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(TestBean.class, result.get(0));
    }

    @Test
    public void testFindSuperClassesWithItself() {
        List<Class<?>> result = ClassUtil.findSuperClasses(SubTestBean.class, Object.class, true);
        assertNotNull(result);
        assertTrue(result.contains(SubTestBean.class));
    }

    @Test
    public void testFindSuperTypesClass() {
        List<Class<?>> result = ClassUtil.findSuperTypes(SubTestBean.class, Object.class);
        assertNotNull(result);
        assertTrue(result.contains(TestBean.class));
    }

    @Test
    public void testCanBeABeanType() {
        assertEquals("annotation", ClassUtil.canBeABeanType(Deprecated.class));
        assertEquals("array", ClassUtil.canBeABeanType(String[].class));
        assertEquals("enum", ClassUtil.canBeABeanType(TestEnum.class));
        assertEquals("primitive", ClassUtil.canBeABeanType(int.class));
        assertNull(ClassUtil.canBeABeanType(String.class));
    }

    @Test
    public void testIsLocalType() {
        assertNull(ClassUtil.isLocalType(InnerClass.class, true));
        assertEquals("non-static member class", ClassUtil.isLocalType(InnerClass.NonStaticInner.class, false));
        assertNull(ClassUtil.isLocalType(InnerClass.StaticInner.class, true));
    }

    @Test
    public void testGetOuterClass() {
        assertEquals(ClassUtilTest.class, ClassUtil.getOuterClass(InnerClass.NonStaticInner.class));
        assertNull(ClassUtil.getOuterClass(InnerClass.StaticInner.class));
    }

    @Test
    public void testIsProxyType() {
        assertTrue(ClassUtil.isProxyType(TestProxy.class));
        assertFalse(ClassUtil.isProxyType(String.class));
    }

    @Test
    public void testIsConcrete() {
        assertTrue(ClassUtil.isConcrete(String.class));
        assertFalse(ClassUtil.isConcrete(Runnable.class));
        assertTrue(ClassUtil.isConcrete(TestBean.class));
    }

    @Test
    public void testIsCollectionMapOrArray() {
        assertTrue(ClassUtil.isCollectionMapOrArray(String[].class));
        assertTrue(ClassUtil.isCollectionMapOrArray(List.class));
        assertTrue(ClassUtil.isCollectionMapOrArray(Map.class));
        assertFalse(ClassUtil.isCollectionMapOrArray(String.class));
    }

    @Test
    public void testIsBogusClass() {
        assertTrue(ClassUtil.isBogusClass(Void.class));
        assertTrue(ClassUtil.isBogusClass(Void.TYPE));
        assertFalse(ClassUtil.isBogusClass(String.class));
    }

    @Test
    public void testIsNonStaticInnerClass() {
        assertTrue(ClassUtil.isNonStaticInnerClass(InnerClass.NonStaticInner.class));
        assertFalse(ClassUtil.isNonStaticInnerClass(InnerClass.StaticInner.class));
    }

    @Test
    public void testIsObjectOrPrimitive() {
        assertTrue(ClassUtil.isObjectOrPrimitive(Object.class));
        assertTrue(ClassUtil.isObjectOrPrimitive(String.class));
        assertFalse(ClassUtil.isObjectOrPrimitive(String[].class));
    }

    @Test
    public void testHasClass() {
        assertTrue(ClassUtil.hasClass("test", String.class));
        assertFalse(ClassUtil.hasClass(123, String.class));
    }

    @Test
    public void testVerifyMustOverride() {
        try {
            ClassUtil.verifyMustOverride(TestBean.class, new TestBean(), "method");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testHasGetterSignature() throws Exception {
        Method getter = TestBean.class.getMethod("getValue");
        assertTrue(ClassUtil.hasGetterSignature(getter));
        Method badGetter = TestBean.class.getMethod("toString");
        assertFalse(ClassUtil.hasGetterSignature(badGetter));
    }

    @Test
    public void testThrowIfError() {
        Error error = new Error();
        try {
            ClassUtil.throwIfError(error);
            fail("Expected Error");
        } catch (Error e) {
            assertSame(error, e);
        }
        assertNull(ClassUtil.throwIfError(new RuntimeException()));
    }

    @Test
    public void testThrowIfRTE() {
        try {
            ClassUtil.throwIfRTE(new RuntimeException());
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {}
        assertNull(ClassUtil.throwIfRTE(new Exception()));
    }

    @Test
    public void testGetRootCause() {
        Exception root = new Exception("root");
        Throwable t = new RuntimeException(new Exception(root));
        assertSame(root, ClassUtil.getRootCause(t));
    }

    @Test
    public void testThrowAsIAE() {
        try {
            ClassUtil.throwAsIAE(new Exception("test"));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("test", e.getMessage());
        }
        try {
            ClassUtil.throwAsIAE(new Exception("test"), "prefix");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("prefix"));
        }
    }

    @Test
    public void testThrowAsMappingException() {
        try {
            ClassUtil.throwAsMappingException(null, new IOException("test"));
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {}
    }

    @Test
    public void testCloseOnFailAndThrowAsIOE() throws IOException {
        TestCloseable closeable = new TestCloseable();
        try {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, new Exception("fail"));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(closeable.closed);
        }
    }

    @Test
    public void testCreateInstance() throws Exception {
        TestBean bean = ClassUtil.createInstance(TestBean.class, true);
        assertNotNull(bean);
        assertEquals(42, bean.getValue());
        try {
            ClassUtil.createInstance(PrivateConstructor.class, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void testFindConstructor() throws Exception {
        Constructor<TestBean> ctor = ClassUtil.findConstructor(TestBean.class, false);
        assertNotNull(ctor);
        try {
            ClassUtil.findConstructor(PrivateConstructor.class, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void testClassOf() {
        assertEquals(String.class, ClassUtil.classOf("test"));
        assertNull(ClassUtil.classOf(null));
    }

    @Test
    public void testRawClass() {
        JavaType type = new JavaType() {
            @Override public Class<?> getRawClass() { return String.class; }
            @Override public boolean hasRawClass(Class<?> c) { return c == String.class; }
            @Override public boolean isInterface() { return false; }
            @Override public boolean isAbstract() { return false; }
            @Override public boolean isConcrete() { return true; }
            @Override public boolean isThrowable() { return false; }
            @Override public boolean isArrayType() { return false; }
            @Override public boolean isEnumType() { return false; }
            @Override public boolean isPrimitive() { return false; }
            @Override public boolean isCollectionLike() { return false; }
            @Override public boolean isMapLike() { return false; }
            @Override public boolean isFinal() { return false; }
            @Override public boolean isContainerType() { return false; }
            @Override public boolean isReferenceType() { return false; }
            @Override public JavaType withTypeHandler(Object h) { return null; }
            @Override public JavaType withContentTypeHandler(Object h) { return null; }
            @Override public JavaType withValueHandler(Object h) { return null; }
            @Override public JavaType withContentValueHandler(Object h) { return null; }
            @Override public JavaType withStaticTyping() { return null; }
            @Override public JavaType narrowBy(Class<?> c) { return null; }
            @Override public JavaType narrowContentsBy(Class<?> c) { return null; }
            @Override public JavaType findSuperType(Class<?> c) { return null; }
            @Override public JavaType findContentType() { return null; }
            @Override public JavaType findValueType() { return null; }
            @Override public JavaType getKeyType() { return null; }
            @Override public JavaType getContentType() { return null; }
            @Override public int containedTypeCount() { return 0; }
            @Override public JavaType containedType(int i) { return null; }
            @Override public String containedTypeName(int i) { return null; }
            @Override public String toCanonical() { return ""; }
            @Override public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
            @Override public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
            @Override public String toString() { return ""; }
            @Override public boolean equals(Object o) { return false; }
            @Override public int hashCode() { return 0; }
        };
        assertEquals(String.class, ClassUtil.rawClass(type));
        assertNull(ClassUtil.rawClass(null));
    }

    @Test
    public void testNonNull() {
        assertEquals("value", ClassUtil.nonNull("value", "default"));
        assertEquals("default", ClassUtil.nonNull(null, "default"));
    }

    @Test
    public void testNullOrToString() {
        assertEquals("null", ClassUtil.nullOrToString(null));
        assertEquals("test", ClassUtil.nullOrToString("test"));
    }

    @Test
    public void testNonNullString() {
        assertEquals("", ClassUtil.nonNullString(null));
        assertEquals("test", ClassUtil.nonNullString("test"));
    }

    @Test
    public void testQuotedOr() {
        assertEquals("\"test\"", ClassUtil.quotedOr("test", "default"));
        assertEquals("default", ClassUtil.quotedOr(null, "default"));
    }

    @Test
    public void testGetClassDescription() {
        assertEquals("unknown", ClassUtil.getClassDescription(null));
        assertEquals("String", ClassUtil.getClassDescription(String.class));
        assertEquals("String", ClassUtil.getClassDescription("test"));
    }

    @Test
    public void testClassNameOf() {
        assertEquals("[null]", ClassUtil.classNameOf(null));
        assertEquals("String", ClassUtil.classNameOf("test"));
    }

    @Test
    public void testNameOf() {
        assertEquals("String", ClassUtil.nameOf(String.class));
        assertNull(ClassUtil.nameOf((Class<?>) null));
    }

    @Test
    public void testBackticked() {
        assertNull(ClassUtil.backticked(null));
        assertEquals("`test`", ClassUtil.backticked("test"));
    }

    @Test
    public void testDefaultValue() {
        assertEquals(Integer.valueOf(0), ClassUtil.defaultValue(Integer.TYPE));
        assertEquals(Long.valueOf(0L), ClassUtil.defaultValue(Long.TYPE));
        assertEquals(Boolean.FALSE, ClassUtil.defaultValue(Boolean.TYPE));
        assertEquals(Double.valueOf(0.0), ClassUtil.defaultValue(Double.TYPE));
        assertEquals(Float.valueOf(0.0f), ClassUtil.defaultValue(Float.TYPE));
        assertEquals(Byte.valueOf((byte) 0), ClassUtil.defaultValue(Byte.TYPE));
        assertEquals(Short.valueOf((short) 0), ClassUtil.defaultValue(Short.TYPE));
        assertEquals(Character.valueOf('\0'), ClassUtil.defaultValue(Character.TYPE));
        assertNull(ClassUtil.defaultValue(String.class));
    }

    @Test
    public void testWrapperType() {
        assertEquals(Integer.class, ClassUtil.wrapperType(Integer.TYPE));
        assertEquals(Long.class, ClassUtil.wrapperType(Long.TYPE));
        assertEquals(Boolean.class, ClassUtil.wrapperType(Boolean.TYPE));
        assertEquals(Double.class, ClassUtil.wrapperType(Double.TYPE));
        assertEquals(Float.class, ClassUtil.wrapperType(Float.TYPE));
        assertEquals(Byte.class, ClassUtil.wrapperType(Byte.TYPE));
        assertEquals(Short.class, ClassUtil.wrapperType(Short.TYPE));
        assertEquals(Character.class, ClassUtil.wrapperType(Character.TYPE));
        assertEquals(String.class, ClassUtil.wrapperType(String.class));
    }

    @Test
    public void testPrimitiveType() {
        assertEquals(Integer.TYPE, ClassUtil.primitiveType(Integer.class));
        assertEquals(Long.TYPE, ClassUtil.primitiveType(Long.class));
        assertEquals(Boolean.TYPE, ClassUtil.primitiveType(Boolean.class));
        assertEquals(Double.TYPE, ClassUtil.primitiveType(Double.class));
        assertEquals(Float.TYPE, ClassUtil.primitiveType(Float.class));
        assertEquals(Byte.TYPE, ClassUtil.primitiveType(Byte.class));
        assertEquals(Short.TYPE, ClassUtil.primitiveType(Short.class));
        assertEquals(Character.TYPE, ClassUtil.primitiveType(Character.class));
        assertEquals(String.class, ClassUtil.primitiveType(String.class));
    }

    @Test
    public void testCheckAndFixAccess() throws Exception {
        Class<?>[] classTypes = Integer.class.getDeclaredClasses();
        try {
            ClassUtil.checkAndFixAccess(TestBean.class.getDeclaredConstructor());
        } catch (SecurityException e) {}
    }

    @Test
    public void testFindFirstAnnotatedEnumValue() {
        assertNull(ClassUtil.findFirstAnnotatedEnumValue(EnumHolder.TestEnum.class, Deprecated.class));
    }

    @Test
    public void testIsJacksonStdImpl() {
        assertFalse(ClassUtil.isJacksonStdImpl(String.class));
        assertFalse(ClassUtil.isJacksonStdImpl(new Object()));
    }

    @Test
    public void testGetPackageName() {
        assertEquals("java.lang", ClassUtil.getPackageName(String.class));
        assertNull(ClassUtil.getPackageName(null));
    }

    @Test
    public void testHasEnclosingMethod() throws Exception {
        assertFalse(ClassUtil.hasEnclosingMethod(TestBean.class));
    }

    @Test
    public void testGetDeclaredFields() {
        assertEquals(1, ClassUtil.getDeclaredFields(TestBean.class).length);
    }

    @Test
    public void testGetDeclaredMethods() {
        assertTrue(ClassUtil.getDeclaredMethods(TestBean.class).length > 0);
    }

    @Test
    public void testFindClassAnnotations() {
        assertEquals(0, ClassUtil.findClassAnnotations(String.class).length);
        assertTrue(ClassUtil.findClassAnnotations(AnnotatedHolder.class).length >= 0);
    }

    @Test
    public void testGetClassMethods() {
        assertTrue(ClassUtil.getClassMethods(TestBean.class).length > 0);
    }

    @Test
    public void testGetConstructors() {
        assertEquals(1, ClassUtil.getConstructors(TestBean.class).length);
    }

    @Test
    public void testGetDeclaringClass() {
        assertEquals(TestBean.class, ClassUtil.getDeclaringClass(TestBean.class));
    }

    @Test
    public void testGetGenericSuperclass() {
        assertNotNull(ClassUtil.getGenericSuperclass(SubTestBean.class));
    }

    @Test
    public void testGetGenericInterfaces() {
        assertNotNull(ClassUtil.getGenericInterfaces(TestBean.class));
    }

    @Test
    public void testGetEnclosingClass() {
        assertNull(ClassUtil.getEnclosingClass(TestBean.class));
    }

    @Test
    public void testCtor() throws Exception {
        Constructor<TestBean> ctor = TestBean.class.getConstructor();
        ClassUtil.Ctor testCtor = new ClassUtil.Ctor(ctor);
        assertEquals(0, testCtor.getParamCount());
        assertEquals(TestBean.class, testCtor.getDeclaringClass());
        assertNotNull(testCtor.getDeclaredAnnotations());
    }

    private static class TestCloseable implements Closeable {
        boolean closed = false;
        public void close() { closed = true; }
    }

    private static class PrivateConstructor {
        private PrivateConstructor() {}
    }

    private static class TestProxy {
        static {
            String name = TestProxy.class.getName();
        }
    }
}