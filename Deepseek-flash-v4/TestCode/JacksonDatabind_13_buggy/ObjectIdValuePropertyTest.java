package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

public class ObjectIdValuePropertyTest {

    private static class TestObjectIdReader extends ObjectIdReader {
        public TestObjectIdReader(PropertyName propertyName, JavaType idType, JsonDeserializer<?> deser,
                PropertyValueBuffer propertyValueBuffer, SettableBeanProperty idProperty,
                BeanProperty prop) {
            super(propertyName, idType, deser, propertyValueBuffer, idProperty, prop, null);
        }
    }

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        public Object setValue;
        public boolean setCalled;
        public Object setAndReturnValue;

        public TestSettableBeanProperty() {
            super(PropertyName.construct("id"), null, null, null, null);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) { return this; }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }

        @Override
        public AnnotatedMember getMember() { return null; }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            setCalled = true;
            setValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            setCalled = true;
            setValue = value;
            setAndReturnValue = value;
            return value;
        }
    }

    @Test
    public void testConstructorsAndWithMethods() {
        TestSettableBeanProperty idProp = new TestSettableBeanProperty();
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), null, null, idProp, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        assertNotNull(prop._objectIdReader);
        assertEquals(PropertyName.construct("id"), prop.getName());

        ObjectIdValueProperty prop2 = prop.withName(PropertyName.construct("newName"));
        assertNotNull(prop2);
        assertEquals(PropertyName.construct("newName"), prop2.getName());

        ObjectIdValueProperty prop3 = prop.withValueDeserializer(null);
        assertNotNull(prop3);

        ObjectIdValueProperty prop4 = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        assertNotNull(prop4);

        ObjectIdValueProperty prop5 = prop4.withName(PropertyName.construct("id2"));
        assertNotNull(prop5);

        ObjectIdValueProperty prop6 = prop5.withValueDeserializer(null);
        assertNotNull(prop6);
    }

    @Test
    public void testGetAnnotationAndGetMember() {
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), null, null, null, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        assertNull(prop.getAnnotation(Deprecated.class));
        assertNull(prop.getMember());
    }

    @Test
    public void testDeserializeSetAndReturnWithIdProperty() throws IOException {
        TestSettableBeanProperty idProp = new TestSettableBeanProperty();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "123";
            }
        };
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), deser, null, idProp, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object instance = new Object();
        Object result = prop.deserializeSetAndReturn(null, null, instance);
        assertNotNull(result);
        assertTrue(idProp.setCalled);
        assertEquals("123", idProp.setValue);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturnWithNoIdProperty() throws IOException {
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), null, null, null, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        prop.setAndReturn(new Object(), "value");
    }

    @Test
    public void testSetAndReturnWithIdProperty() throws IOException {
        TestSettableBeanProperty idProp = new TestSettableBeanProperty();
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), null, null, idProp, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object instance = new Object();
        Object result = prop.setAndReturn(instance, "value123");
        assertNotNull(result);
        assertEquals("value123", result);
        assertTrue(idProp.setCalled);
        assertEquals("value123", idProp.setValue);
    }

    @Test
    public void testSetAndDeserializeAndSet() throws IOException {
        TestSettableBeanProperty idProp = new TestSettableBeanProperty();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "456";
            }
        };
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), deser, null, idProp, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object instance = new Object();
        prop.set(instance, "setValue");
        assertTrue(idProp.setCalled);
        assertEquals("setValue", idProp.setValue);

        idProp.setCalled = false;
        prop.deserializeAndSet(null, null, instance);
        assertTrue(idProp.setCalled);
        assertEquals("456", idProp.setValue);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetWithNoIdProperty() throws IOException {
        TestObjectIdReader reader = new TestObjectIdReader(PropertyName.construct("id"),
                JavaTypeFactory.instance.constructType(String.class), null, null, null, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        prop.set(new Object(), "value");
    }
}