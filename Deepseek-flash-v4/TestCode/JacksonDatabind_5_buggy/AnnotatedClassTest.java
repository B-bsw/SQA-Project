package com.fasterxml.jackson.databind.introspect;

import org.junit.*;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class AnnotatedClassTest {

    // --- Stubs ---
    private static class FakeAnnotationIntrospector extends JacksonAnnotationIntrospector {
        private boolean isAnnotationBundle;
        private boolean hasIgnoreMarker;

        public FakeAnnotationIntrospector(boolean isAnnotationBundle, boolean hasIgnoreMarker) {
            this.isAnnotationBundle = isAnnotationBundle;
            this.hasIgnoreMarker = hasIgnoreMarker;
        }

        @Override
        public boolean isAnnotationBundle(Annotation ann) {
            return isAnnotationBundle;
        }

        @Override
        public boolean hasIgnoreMarker(AnnotatedMember member) {
            return hasIgnoreMarker;
        }
    }

    private static class SimpleMixInResolver implements MixInResolver {
        private final Map<Class<?>, Class<?>> mappings = new HashMap<>();

        public void addMixIn(Class<?> target, Class<?> mixin) {
            mappings.put(target, mixin);
        }

        @Override
        public Class<?> findMixInClassFor(Class<?> cls) {
            return mappings.get(cls);
        }
    }

    // --- Test Fixtures ---
    private AnnotatedClass ac;

    @Before
    public void setUp() {
        ac = AnnotatedClass.construct(Object.class, null, null);
    }

    // --- construct() and constructWithoutSuperTypes() ---
    @Test
    public void testConstructWithoutSuperTypes() {
        AnnotatedClass ac2 = AnnotatedClass.constructWithoutSuperTypes(String.class, null, null);
        assertNotNull(ac2);
    }

    @Test
    public void testConstructWithNullIntrospector() {
        AnnotatedClass ac2 = AnnotatedClass.construct(Integer.class, null, null);
        assertNotNull(ac2);
    }

    // --- Basic Info ---
    @Test
    public void testGetAnnotated() {
        assertEquals(Object.class, ac.getAnnotated());
    }

    @Test
    public void testGetName() {
        assertEquals("java.lang.Object", ac.getName());
    }

    @Test
    public void testGetModifiers() {
        assertEquals(Object.class.getModifiers(), ac.getModifiers());
    }

    @Test
    public void testGetRawType() {
        assertEquals(Object.class, ac.getRawType());
    }

    @Test
    public void testGetGenericType() {
        assertEquals(Object.class, ac.getGenericType());
    }

    // --- Annotations (null introspector) ---
    @Test
    public void testAnnotationsNullIntrospector() {
        assertNull(ac.getAnnotation(Deprecated.class));
        assertFalse(ac.hasAnnotations());
        assertNotNull(ac.annotations());
        assertNotNull(ac.getAnnotations());
    }

    // --- withAnnotations() ---
    @Test
    public void testWithAnnotations() {
        AnnotationMap map = new AnnotationMap();
        AnnotatedClass ac2 = ac.withAnnotations(map);
        assertNotNull(ac2);
        assertNotSame(ac, ac2);
    }

    // --- Default Constructor ---
    @Test
    public void testDefaultConstructorExists() {
        assertNotNull(ac.getDefaultConstructor());
    }

    @Test
    public void testDefaultConstructorNotFound() {
        // String has no default constructor
        AnnotatedClass ac2 = AnnotatedClass.construct(String.class, null, null);
        assertNull(ac2.getDefaultConstructor());
    }

    @Test
    public void testDefaultConstructorIgnored() {
        FakeAnnotationIntrospector intr = new FakeAnnotationIntrospector(false, true);
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, intr, null);
        assertNull(ac2.getDefaultConstructor());
    }

    // --- Constructors List ---
    @Test
    public void testConstructorsEmpty() {
        // Object has only default constructor -> no non-default constructors
        assertTrue(ac.getConstructors().isEmpty());
    }

    @Test
    public void testConstructorsNonEmpty() {
        AnnotatedClass ac2 = AnnotatedClass.construct(String.class, null, null);
        assertFalse(ac2.getConstructors().isEmpty());
    }

    // --- Static Methods ---
    @Test
    public void testStaticMethodsEmpty() {
        assertTrue(ac.getStaticMethods().isEmpty());
    }

    @Test
    public void testStaticMethodsNonEmpty() {
        // Integer has static methods like valueOf
        AnnotatedClass ac2 = AnnotatedClass.construct(Integer.class, null, null);
        assertFalse(ac2.getStaticMethods().isEmpty());
    }

    // --- Member Methods ---
    @Test
    public void testMemberMethodCount() {
        assertTrue(ac.getMemberMethodCount() > 0);
    }

    @Test
    public void testMemberMethodsIterable() {
        Iterable<AnnotatedMethod> methods = ac.memberMethods();
        assertNotNull(methods);
    }

    @Test
    public void testFindMethodFound() {
        AnnotatedMethod method = ac.findMethod("toString", new Class<?>[0]);
        assertNotNull(method);
        assertEquals("toString", method.getName());
    }

    @Test
    public void testFindMethodNotFound() {
        assertNull(ac.findMethod("nonexistent", new Class<?>[0]));
    }

    // --- Fields ---
    @Test
    public void testFieldsEmpty() {
        assertEquals(0, ac.getFieldCount());
        Iterable<AnnotatedField> fields = ac.fields();
        assertNotNull(fields);
        assertFalse(fields.iterator().hasNext());
    }

    @Test
    public void testFieldsNonEmpty() {
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, null, null);
        assertEquals(1, ac2.getFieldCount());
        Iterable<AnnotatedField> fields = ac2.fields();
        assertNotNull(fields);
        assertTrue(fields.iterator().hasNext());
    }

    // --- MixIn on class annotations ---
    @Test
    public void testMixInClassAnnotations() {
        @Deprecated
        class MixInWithDeprecated {}

        SimpleMixInResolver resolver = new SimpleMixInResolver();
        resolver.addMixIn(SimpleBean.class, MixInWithDeprecated.class);

        FakeAnnotationIntrospector intr = new FakeAnnotationIntrospector(false, false);
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, intr, resolver);
        assertNotNull(ac2.getAnnotation(Deprecated.class));
    }

    // --- Enum constructor adjustment ---
    @Test
    public void testEnumConstructors() {
        AnnotatedClass ac2 = AnnotatedClass.construct(Thread.State.class, null, null);
        assertFalse(ac2.getConstructors().isEmpty());
    }

    // --- Annotation bundle expansion (via introspector) ---
    @Test
    public void testAnnotationBundleExpansion() {
        // This test verifies that _addAnnotationsIfNotPresent processes bundles.
        // We use an annotation that contains other annotations and set isAnnotationBundle=true.
        // For simplicity, just confirm no exception is thrown.
        FakeAnnotationIntrospector intr = new FakeAnnotationIntrospector(true, false);
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, intr, null);
        // getAnnotation for an annotation that is inside the bundle (if any) - we can't guarantee, but verify basic call
        assertNotNull(ac2);
    }

    // --- Lazy resolution triggers ---
    @Test
    public void testLazyClassAnnotationResolution() {
        // Initially _classAnnotations is null, getAnnotation triggers resolution
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, null, null);
        assertNull(ac2.getAnnotation(Deprecated.class)); // no annotation, but trigger resolution
        // After resolution, internal state changes; second call should still return null
        assertNull(ac2.getAnnotation(Deprecated.class));
    }

    // --- Loop: multiple constructors with ignore marker ---
    @Test
    public void testConstructorIgnoreMarkerMultiple() {
        // SimpleBean has two constructors; mark both as ignored via hasIgnoreMarker=true
        FakeAnnotationIntrospector intr = new FakeAnnotationIntrospector(false, true);
        AnnotatedClass ac2 = AnnotatedClass.construct(SimpleBean.class, intr, null);
        assertNull(ac2.getDefaultConstructor());
        assertTrue(ac2.getConstructors().isEmpty()); // all ignored
    }

    // --- Helper class for tests ---
    static class SimpleBean {
        private int x;
        public SimpleBean() {}
        public SimpleBean(int x) { this.x = x; }
        public void foo() {}
        public static void bar() {}
    }
}