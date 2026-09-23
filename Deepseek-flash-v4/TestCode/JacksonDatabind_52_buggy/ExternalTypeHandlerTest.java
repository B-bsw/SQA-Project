package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ExternalTypeHandlerTest {

    private TestProperty prop;
    private ExternalTypeHandler handler;

    private ExternalTypeHandler newHandler(TestProperty p, TestTypeDeserializer td) {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        builder.addExternal(p, td);
        return builder.build().start();
    }

    private static JsonParser parser(String value) throws IOException {
        TokenBuffer buffer = new TokenBuffer(null);
        buffer.writeString(value);
        JsonParser p = buffer.asParser();
        p.nextToken();
        return p;
    }

    @Test
    public void testStartAndUnknownNames() throws Exception {
        ExternalTypeHandler h = new ExternalTypeHandler.Builder().build().start();
        Object bean = new Object();
        JsonParser p = parser("x");
        assertFalse(h.handleTypePropertyValue(p, null, "unknown", bean));
        assertFalse(h.handlePropertyValue(p, null, "unknown", bean));
        assertSame(bean, h.complete(p, null, bean));
    }

    @Test
    public void testTypePropertyThenValueDeserializes() throws Exception {
        prop = new TestProperty("value");
        handler = newHandler(prop, new TestTypeDeserializer("type", null, null));

        JsonParser p1 = parser("T1");
        assertTrue(handler.handleTypePropertyValue(p1, null, "type", null));

        TokenBuffer buf = new TokenBuffer(null);
        buf.writeString("VALUE");
        JsonParser p2 = buf.asParser();
        p2.nextToken();
        Object bean = new Object();

        assertTrue(handler.handlePropertyValue(p2, null, "value", bean));
        assertEquals("T1:VALUE", prop.setValue);
    }

    @Test
    public void testValueThenTypePropertyDeserializes() throws Exception {
        prop = new TestProperty("value");
        handler = newHandler(prop, new TestTypeDeserializer("type", null, null));

        TokenBuffer buf = new TokenBuffer(null);
        buf.writeString("VALUE");
        JsonParser p1 = buf.asParser();
        p1.nextToken();
        assertTrue(handler.handlePropertyValue(p1, null, "value", null));

        JsonParser p2 = parser("T1");
        Object bean = new Object();
        assertTrue(handler.handlePropertyValue(p2, null, "type", bean));
        assertEquals("T1:VALUE", prop.setValue);
    }

    @Test
    public void testCompleteNaturalScalarWithoutTypeId() throws Exception {
        prop = new TestProperty("value");
        handler = newHandler(prop, new TestTypeDeserializer("type", null, null));

        TokenBuffer buf = new TokenBuffer(null);
        buf.writeString("VALUE");
        JsonParser p1 = buf.asParser();
        p1.nextToken();
        assertTrue(handler.handlePropertyValue(p1, null, "value", null));

        Object bean = new Object();
        assertSame(bean, handler.complete(p1, null, bean));
        assertEquals("VALUE", prop.setValue);
    }

    @Test
    public void testCompleteUsesDefaultTypeForNonNaturalScalar() throws Exception {
        prop = new TestProperty("value");
        handler = newHandler(prop, new TestTypeDeserializer("type", Object.class, "DEFAULT"));

        TokenBuffer buf = new TokenBuffer(null);
        buf.writeNumber(123);
        JsonParser p1 = buf.asParser();
        p1.nextToken();
        assertTrue(handler.handlePropertyValue(p1, null, "value", null));

        Object bean = new Object();
        assertSame(bean, handler.complete(p1, null, bean));
        assertEquals("DEFAULT:123", prop.setValue);
    }

    private static class TestProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        final String name;
        Object setValue;

        TestProperty(String name) {
            super(PropertyName.construct(name),
                    TypeFactory.defaultInstance().constructType(String.class),
                    null, null, null);
            this.name = name;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(String simpleName) {
            return this;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return this;
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (p.currentToken() == JsonToken.START_ARRAY) {
                p.nextToken();
                String type = p.getText();
                p.nextToken();
                String value = p.getText();
                return type + ":" + value;
            }
            return p.getText();
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            set(instance, deserialize(p, ctxt));
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            Object value = deserialize(p, ctxt);
            set(instance, value);
            return value;
        }

        @Override
        public void set(Object instance, Object value) {
            setValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) {
            setValue = value;
            return value;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    private static class TestTypeDeserializer extends TypeDeserializer {
        private static final long serialVersionUID = 1L;
        private final String propertyName;
        private final Class<?> defaultImpl;
        private final String defaultTypeId;

        TestTypeDeserializer(String propertyName, Class<?> defaultImpl, String defaultTypeId) {
            this.propertyName = propertyName;
            this.defaultImpl = defaultImpl;
            this.defaultTypeId = defaultTypeId;
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public String getPropertyName() {
            return propertyName;
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return new TypeIdResolver() {
                @Override
                public void init(JavaType baseType) {
                }

                @Override
                public String idFromValue(Object value) {
                    return defaultTypeId;
                }

                @Override
                public String idFromValueAndType(Object value, Class<?> suggestedType) {
                    return defaultTypeId;
                }

                @Override
                public String idFromBaseType() {
                    return defaultTypeId;
                }

                @Override
                public String getMechanism() {
                    return "property";
                }

                public JavaType typeFromId(DeserializationContext ctxt, String id) {
                    return null;
                }
            };
        }

        @Override
        public Class<?> getDefaultImpl() {
            return defaultImpl;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }
}