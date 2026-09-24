package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.Linked;

public class POJOPropertyBuilderTest {

    static class Parent {
        public int value;
        public int getValue() { return 0; }
        public void setValue(int v) { }
    }

    static class Child extends Parent {
        public int value;
        @Override
        public int getValue() { return 0; }
        @Override
        public void setValue(int v) { }
    }

    static class FieldConflict {
        public int a;
        public int b;
    }

    static class GetterBean {
        public int getFoo() { return 0; }
        public boolean isFoo() { return false; }
        public int getBar() { return 0; }
    }

    static class SetterBean {
        public void setFoo(int v) { }
        public void setBar(int v) { }
    }

    static class CtorBean {
        public CtorBean(int x) { }
    }

    private POJOPropertyBuilder builder(boolean forSerialization) {
        return new POJOPropertyBuilder(null, null, forSerialization, new PropertyName("prop"));
    }

    private AnnotatedField newField(Field f) throws Exception {
        for (Constructor<?> ctor : AnnotatedField.class.getDeclaredConstructors()) {
            Class<?>[] params = ctor.getParameterTypes();
            Object[] args = new Object[params.length];
            boolean found = false;
            for (int i = 0; i < params.length; i++) {
                if (params[i].isAssignableFrom(Field.class)) {
                    args[i] = f;
                    found = true;
                }
            }
            if (!found) continue;
            ctor.setAccessible(true);
            return (AnnotatedField) ctor.newInstance(args);
        }
        throw new IllegalStateException("No AnnotatedField constructor");
    }

    private AnnotatedMethod newMethod(Method m) throws Exception {
        for (Constructor<?> ctor : AnnotatedMethod.class.getDeclaredConstructors()) {
            Class<?>[] params = ctor.getParameterTypes();
            Object[] args = new Object[params.length];
            boolean found = false;
            for (int i = 0; i < params.length; i++) {
                if (params[i].isAssignableFrom(Method.class)) {
                    args[i] = m;
                    found = true;
                }
            }
            if (!found) continue;
            ctor.setAccessible(true);
            return (AnnotatedMethod) ctor.newInstance(args);
        }
        throw new IllegalStateException("No AnnotatedMethod constructor");
    }

    private AnnotatedConstructor newConstructor(Constructor<?> c) throws Exception {
        for (Constructor<?> ctor : AnnotatedConstructor.class.getDeclaredConstructors()) {
            Class<?>[] params = ctor.getParameterTypes();
            Object[] args = new Object[params.length];
            boolean found = false;
            for (int i = 0; i < params.length; i++) {
                if (params[i].isAssignableFrom(Constructor.class)) {
                    args[i] = c;
                    found = true;
                }
            }
            if (!found) continue;
            ctor.setAccessible(true);
            return (AnnotatedConstructor) ctor.newInstance(args);
        }
        throw new IllegalStateException("No AnnotatedConstructor constructor");
    }

    private AnnotatedParameter newParameter(AnnotatedMember owner, int index) throws Exception {
        for (Constructor<?> ctor : AnnotatedParameter.class.getDeclaredConstructors()) {
            Class<?>[] params = ctor.getParameterTypes();
            Object[] args = new Object[params.length];
            boolean foundInt = false;
            for (int i = 0; i < params.length; i++) {
                if (params[i] == int.class) {
                    args[i] = index;
                    foundInt = true;
                } else if (owner != null && params[i].isAssignableFrom(owner.getClass())) {
                    args[i] = owner;
                } else if (params[i].isAssignableFrom(AnnotationMap.class)) {
                    args[i] = new AnnotationMap();
                }
            }
            if (!foundInt) continue;
            ctor.setAccessible(true);
            return (AnnotatedParameter) ctor.newInstance(args);
        }
        throw new IllegalStateException("No AnnotatedParameter constructor");
    }

    @Test
    public void testConstructionWithName() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertEquals("prop", b.getName());
        assertEquals("prop", b.getInternalName());
        assertEquals(new PropertyName("prop"), b.getFullName());
        assertTrue(b.hasName(new PropertyName("prop")));
        assertFalse(b.hasName(new PropertyName("other")));

        POJOPropertyBuilder renamed = b.withName(new PropertyName("renamed"));
        assertNotSame(b, renamed);
        assertEquals("renamed", renamed.getName());
        assertEquals("prop", b.getName());

        POJOPropertyBuilder simple = b.withSimpleName("simple");
        assertNotSame(b, simple);
        assertEquals("simple", simple.getName());
    }

    @Test
    public void testCompareTo() throws Exception {
        POJOPropertyBuilder a = new POJOPropertyBuilder(null, null, true, new PropertyName("a"));
        POJOPropertyBuilder b = new POJOPropertyBuilder(null, null, true, new PropertyName("b"));
        assertTrue(a.compareTo(b) < 0);
        assertTrue(b.compareTo(a) > 0);
        assertEquals(0, a.compareTo(new POJOPropertyBuilder(null, null, true, new PropertyName("a"))));

        POJOPropertyBuilder withCtor = new POJOPropertyBuilder(null, null, true, new PropertyName("c"));
        withCtor._ctorParameters = new Linked<AnnotatedParameter>(null, null, null, false, true, false);
        assertTrue(withCtor.compareTo(a) < 0);
        assertTrue(a.compareTo(withCtor) > 0);
    }

    @Test
    public void testHasAndCanWithEmpty() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertFalse(b.hasGetter());
        assertFalse(b.hasSetter());
        assertFalse(b.hasField());
        assertFalse(b.hasConstructorParameter());
        assertFalse(b.couldSerialize());
        assertFalse(b.couldDeserialize());
    }

    @Test
    public void testHasAndCanWithMembers() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addGetter(newMethod(Parent.class.getMethod("getValue")), null, false, true, false);
        assertTrue(b.hasGetter());
        assertTrue(b.couldSerialize());
        assertFalse(b.couldDeserialize());

        b.addSetter(newMethod(Parent.class.getMethod("setValue", int.class)), null, false, true, false);
        assertTrue(b.hasSetter());
        assertTrue(b.couldDeserialize());

        b.addField(newField(Parent.class.getField("value")), null, false, true, false);
        assertTrue(b.hasField());
    }

    @Test
    public void testGetGetterSingle() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertNull(b.getGetter());
        AnnotatedMethod m = newMethod(Parent.class.getMethod("getValue"));
        b.addGetter(m, null, false, true, false);
        assertSame(m, b.getGetter());
    }

    @Test
    public void testGetGetterSelectsMostSpecific() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addGetter(newMethod(Parent.class.getMethod("getValue")), null, false, true, false);
        b.addGetter(newMethod(Child.class.getMethod("getValue")), null, false, true, false);
        assertEquals(Child.class, b.getGetter().getDeclaringClass());
    }

    @Test
    public void testGetGetterPrefersGet() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addGetter(newMethod(GetterBean.class.getMethod("isFoo")), null, false, true, false);
        b.addGetter(newMethod(GetterBean.class.getMethod("getFoo")), null, false, true, false);
        assertEquals("getFoo", b.getGetter().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetGetterConflict() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addGetter(newMethod(GetterBean.class.getMethod("getFoo")), null, false, true, false);
        b.addGetter(newMethod(GetterBean.class.getMethod("getBar")), null, false, true, false);
        b.getGetter();
    }

    @Test
    public void testGetSetterSingle() throws Exception {
        POJOPropertyBuilder b = builder(false);
        assertNull(b.getSetter());
        AnnotatedMethod m = newMethod(Parent.class.getMethod("setValue", int.class));
        b.addSetter(m, null, false, true, false);
        assertSame(m, b.getSetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSetterConflict() throws Exception {
        POJOPropertyBuilder b = builder(false);
        b.addSetter(newMethod(SetterBean.class.getMethod("setFoo", int.class)), null, false, true, false);
        b.addSetter(newMethod(SetterBean.class.getMethod("setBar", int.class)), null, false, true, false);
        b.getSetter();
    }

    @Test
    public void testGetFieldSingle() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertNull(b.getField());
        AnnotatedField f = newField(Parent.class.getField("value"));
        b.addField(f, null, false, true, false);
        assertSame(f, b.getField());
    }

    @Test
    public void testGetFieldSelectsMostSpecific() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addField(newField(Parent.class.getField("value")), null, false, true, false);
        b.addField(newField(Child.class.getField("value")), null, false, true, false);
        assertEquals(Child.class, b.getField().getDeclaringClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFieldConflict() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addField(newField(FieldConflict.class.getField("a")), null, false, true, false);
        b.addField(newField(FieldConflict.class.getField("b")), null, false, true, false);
        b.getField();
    }

    @Test
    public void testGetAccessorAndMutator() throws Exception {
        POJOPropertyBuilder b = builder(true);
        AnnotatedField f = newField(Parent.class.getField("value"));
        b.addField(f, null, false, true, false);
        assertSame(f, b.getAccessor());
        assertSame(f, b.getMutator());
        assertSame(f, b.getNonConstructorMutator());
        assertEquals(f, b.getPrimaryMember());
    }

    @Test
    public void testGetConstructorParameter() throws Exception {
        POJOPropertyBuilder b = builder(false);
        assertNull(b.getConstructorParameter());

        AnnotatedConstructor owner = newConstructor(CtorBean.class.getConstructor(int.class));
        AnnotatedParameter p = newParameter(owner, 0);
        b.addCtor(p, null, false, true, false);
        assertSame(p, b.getConstructorParameter());
    }

    @Test
    public void testGetConstructorParameterFallback() throws Exception {
        POJOPropertyBuilder b = builder(false);
        AnnotatedParameter p = newParameter(null, 0);
        b.addCtor(p, null, false, true, false);
        assertSame(p, b.getConstructorParameter());
    }

    @Test
    public void testGetConstructorParameters() throws Exception {
        POJOPropertyBuilder b = builder(false);
        Iterator<AnnotatedParameter> empty = b.getConstructorParameters();
        assertFalse(empty.hasNext());

        AnnotatedConstructor owner = newConstructor(CtorBean.class.getConstructor(int.class));
        AnnotatedParameter p1 = newParameter(owner, 0);
        AnnotatedParameter p2 = newParameter(owner, 1);
        b.addCtor(p1, null, false, true, false);
        b.addCtor(p2, null, false, true, false);

        Iterator<AnnotatedParameter> it = b.getConstructorParameters();
        assertTrue(it.hasNext());
        assertNotNull(it.next());
        assertTrue(it.hasNext());
        assertNotNull(it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testExplicitFlags() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertFalse(b.isExplicitlyIncluded());
        assertFalse(b.isExplicitlyNamed());

        AnnotatedField f = newField(Parent.class.getField("value"));
        b.addField(f, null, false, true, false);
        assertFalse(b.isExplicitlyIncluded());
        assertFalse(b.isExplicitlyNamed());

        b.addField(newField(Parent.class.getField("value")), new PropertyName("explicit"), true, true, false);
        assertTrue(b.isExplicitlyIncluded());
        assertTrue(b.isExplicitlyNamed());
    }

    @Test
    public void testRemoveIgnored() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addField(newField(Parent.class.getField("value")), null, false, true, true);
        assertTrue(b.hasField());
        b.removeIgnored();
        assertFalse(b.hasField());
    }

    @Test
    public void testRemoveNonVisible() throws Exception {
        POJOPropertyBuilder b = builder(true);
        b.addGetter(newMethod(Parent.class.getMethod("getValue")), null, false, false, false);
        b.addSetter(newMethod(Parent.class.getMethod("setValue", int.class)), null, false, true, false);
        b.removeNonVisible(false);
        assertFalse(b.hasGetter());
        assertTrue(b.hasSetter());
    }

    @Test
    public void testAnyVisibleAndIgnorals() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertFalse(b.anyVisible());
        assertFalse(b.anyIgnorals());

        b.addField(newField(Parent.class.getField("value")), null, false, true, false);
        assertTrue(b.anyVisible());
        assertFalse(b.anyIgnorals());

        b.addField(newField(Parent.class.getField("value")), null, false, true, true);
        assertTrue(b.anyIgnorals());
    }

    @Test
    public void testFindExplicitNames() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertTrue(b.findExplicitNames().isEmpty());

        b.addField(newField(Parent.class.getField("value")), new PropertyName("fieldName"), true, true, false);
        b.addGetter(newMethod(Parent.class.getMethod("getValue")), null, false, true, false);

        Set<PropertyName> names = b.findExplicitNames();
        assertEquals(1, names.size());
        assertTrue(names.contains(new PropertyName("fieldName")));
    }

    @Test
    public void testNullAnnotationMethods() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertNull(b.findReferenceType());
        assertFalse(b.isTypeId());
        assertNull(b.findViews());
        assertNull(b.findAccess());
        assertNull(b.getWrapperName());
        assertNotNull(b.findInclusion());
    }

    @Test
    public void testGetMetadataWithNoMembers() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertSame(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL, b.getMetadata());
    }

    @Test
    public void testToString() throws Exception {
        POJOPropertyBuilder b = builder(true);
        assertTrue(b.toString().contains("prop"));
    }
}