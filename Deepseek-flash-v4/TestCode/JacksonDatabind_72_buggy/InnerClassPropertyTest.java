package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class InnerClassPropertyTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    @Test
    public void testBasicDelegation() throws Exception {
        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(null, null);
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        assertNotNull(prop);
        assertNotNull(prop.getAnnotation(Deprecated.class));
        assertNull(prop.getMember());
        assertEquals(-1, prop.getPropertyIndex());

        prop.assignIndex(3);
        assertEquals(3, prop.getPropertyIndex());
    }

    @Test
    public void testWithNameAndDeserializer() throws Exception {
        InnerClassProperty prop = newProperty(new InnerDeserializer(), null);

        InnerClassProperty renamed = prop.withName(PropertyName.construct("renamed"));
        assertEquals("renamed", renamed.getName());

        JsonDeserializer<?> valueDeser = new InnerDeserializer();
        InnerClassProperty withDeser = prop.withValueDeserializer(valueDeser);
        assertSame(valueDeser, valueDeserializerOf(withDeser));
    }

    @Test
    public void testDeserializeAndSetNull() throws Exception {
        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(new InnerDeserializer(), null);
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        try (JsonParser p = factory.createParser("null")) {
            p.nextToken();
            Outer outer = new Outer(1);
            prop.deserializeAndSet(p, null, outer);
            assertNull(outer.inner);
            assertNull(delegate.lastValue);
        }
    }

    @Test
    public void testDeserializeAndSetRegular() throws Exception {
        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(new InnerDeserializer(), null);
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        try (JsonParser p = factory.createParser("\"hello\"")) {
            p.nextToken();
            Outer outer = new Outer(1);
            prop.deserializeAndSet(p, null, outer);
            assertNotNull(outer.inner);
            assertEquals("hello", outer.inner.value);
            assertSame(outer.inner, delegate.lastValue);
        }
    }

    @Test
    public void testDeserializeAndSetWithTypeDeserializer() throws Exception {
        Outer outer = new Outer(1);
        InnerDeserializer deser = new InnerDeserializer();
        deser.outer = outer;

        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(deser, new NoOpTypeDeserializer());
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        try (JsonParser p = factory.createParser("\"typed\"")) {
            p.nextToken();
            prop.deserializeAndSet(p, null, outer);
            assertNotNull(outer.inner);
            assertEquals("typed", outer.inner.value);
            assertSame(outer.inner, delegate.lastValue);
        }
    }

    @Test
    public void testDeserializeAndSetException() throws Exception {
        Constructor<?> badCtor = String.class.getConstructor();
        DelegateProperty delegate = newDelegate(null, null);
        InnerClassProperty prop = new InnerClassProperty(delegate, badCtor);

        try (JsonParser p = factory.createParser("123")) {
            p.nextToken();
            try {
                prop.deserializeAndSet(p, null, new Outer(1));
                fail("Should have thrown for failing inner-class instantiation");
            } catch (RuntimeException ex) {
                assertNotNull(ex.getMessage());
            }
        }
    }

    @Test
    public void testSetAndSetAndReturn() throws Exception {
        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(null, null);
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        Outer outer = new Outer(1);
        Outer.Inner value = outer.new Inner();

        prop.set(outer, value);
        assertSame(value, delegate.lastValue);

        assertSame(value, prop.setAndReturn(outer, value));
    }

    @Test
    public void testDeserializeSetAndReturnNull() throws Exception {
        Constructor<?> ctor = innerConstructor();
        DelegateProperty delegate = newDelegate(new InnerDeserializer(), null);
        InnerClassProperty prop = new InnerClassProperty(delegate, ctor);

        try (JsonParser p = factory.createParser("null")) {
            p.nextToken();
            Outer outer = new Outer(1);
            assertNull(prop.deserializeSetAndReturn(p, null, outer));
            assertNull(delegate.lastValue);
        }
    }

    @Test
    public void testDeserializeSetAndReturnValue() throws Exception {
        Outer outer = new Outer(42);
        InnerDeserializer deser = new InnerDeserializer();
        deser.outer = outer;

        DelegateProperty delegate = newDelegate(deser, null);
        InnerClassProperty prop = new InnerClassProperty(delegate, innerConstructor());

        try (JsonParser p = factory.createParser("\"setReturn\"")) {
            p.nextToken();
            Object result = prop.deserializeSetAndReturn(p, null, outer);
            assertNotNull(result);
            assertTrue(result instanceof Outer.Inner);
            assertEquals("setReturn", ((Outer.Inner) result).value);
            assertSame(result, delegate.lastValue);
        }
    }

    private static Constructor<?> innerConstructor() throws Exception {
        return Outer.Inner.class.getConstructor(Outer.class);
    }

    private static InnerClassProperty newProperty(JsonDeserializer<?> deser, TypeDeserializer typeDeser) throws Exception {
        return new InnerClassProperty(newDelegate(deser, typeDeser), innerConstructor());
    }

    private static DelegateProperty newDelegate(JsonDeserializer<?> deser, TypeDeserializer typeDeser) {
        return new DelegateProperty(
                PropertyName.construct("value"),
                TypeFactory.defaultInstance().constructType(Outer.Inner.class),
                deser,
                typeDeser);
    }

    @SuppressWarnings("unchecked")
    private static JsonDeserializer<?> valueDeserializerOf(InnerClassProperty prop) throws Exception {
        java.lang.reflect.Field f = SettableBeanProperty.class.getDeclaredField("_valueDeserializer");
        f.setAccessible(true);
        return (JsonDeserializer<?>) f.get(prop);
    }

    static class Outer {
        int id;
        Inner inner;

        Outer(int id) {
            this.id = id;
        }

        public class Inner {
            public String value;

            public Inner() {
            }
        }
    }

    static class InnerDeserializer extends JsonDeserializer<Outer.Inner> {
        Outer outer;

        @Override
        public Outer.Inner deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Outer.Inner value = (outer == null) ? null : outer.new Inner();
            if (value != null) {
                value.value = p.getText();
            }
            return value;
        }

        @Override
        public Outer.Inner deserialize(JsonParser p, DeserializationContext ctxt, Outer.Inner intoValue) throws IOException {
            if (intoValue != null) {
                intoValue.value = p.getText();
            }
            return intoValue;
        }

        @Override
        public Outer.Inner getNullValue(DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeWithType(JsonParser p, DeserializationContext ctxt,
                TypeDeserializer typeDeserializer) throws IOException {
            Outer.Inner value = (outer == null) ? null : outer.new Inner();
            if (value != null) {
                value.value = p.getText();
            }
            return value;
        }
    }

    @Deprecated
    static class AnnotatedHolder {
    }

    static class DelegateProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        private final PropertyName name;
        private final JsonDeserializer<?> deser;
        private final TypeDeserializer typeDeser;
        private final Annotation marker = AnnotatedHolder.class.getAnnotation(Deprecated.class);

        Object lastValue;
        Object lastTarget;

        DelegateProperty(PropertyName name, JavaType type, JsonDeserializer<?> deser, TypeDeserializer typeDeser) {
            super(name, type, null, typeDeser, deser);
            this.name = name;
            this.deser = deser;
            this.typeDeser = typeDeser;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return (A) (acls == Deprecated.class ? marker : null);
        }

        public <A extends Annotation> A getContextAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            lastTarget = instance;
            lastValue = value;
            if (instance instanceof Outer) {
                ((Outer) instance).inner = (Outer.Inner) value;
            }
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return value;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new DelegateProperty(newName, getType(), deser, typeDeser);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> newDeser) {
            return new DelegateProperty(name, getType(), newDeser, typeDeser);
        }

        public SettableBeanProperty withValueTypeDeserializer(TypeDeserializer newTypeDeser) {
            return new DelegateProperty(name, getType(), deser, newTypeDeser);
        }
    }

    static class NoOpTypeDeserializer extends TypeDeserializer {

        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.WRAPPER_ARRAY;
        }

        public String getPropertyName() {
            return null;
        }

        public TypeIdResolver getTypeIdResolver() {
            return null;
        }

        public Class<?> getDefaultImpl() {
            return null;
        }

        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }
}