package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class ExternalTypeHandlerTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
    }

    private static class Bean {
    }

    private JavaType beanType() {
        return TypeFactory.defaultInstance().constructType(Bean.class);
    }

    private BeanPropertyMap emptyPropertyMap() {
        List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
        props.add(new FakeProperty("dummy", false, -1));
        return BeanPropertyMap.construct(props);
    }

    private JsonParser parserWithText(String text) throws IOException {
        TokenBuffer buf = new TokenBuffer((JsonParser) null, ctxt);
        buf.writeString(text);
        JsonParser p = buf.asParser();
        p.nextToken();
        return p;
    }

    private JsonParser parserWithObject() throws IOException {
        TokenBuffer buf = new TokenBuffer((JsonParser) null, ctxt);
        buf.writeStartObject();
        buf.writeFieldName("a");
        buf.writeString("b");
        buf.writeEndObject();
        JsonParser p = buf.asParser();
        p.nextToken();
        return p;
    }

    private JsonParser parserWithNull() throws IOException {
        TokenBuffer buf = new TokenBuffer((JsonParser) null, ctxt);
        buf.writeNull();
        JsonParser p = buf.asParser();
        p.nextToken();
        return p;
    }

    private ExternalTypeHandler createSingleHandler(FakeProperty prop, String typePropName, Class<?> defaultImpl) {
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType());
        builder.addExternal(prop, new FakeTypeDeserializer(typePropName, defaultImpl));
        return builder.build(emptyPropertyMap()).start();
    }

    private ExternalTypeHandler createDoubleHandler(FakeProperty p1, FakeProperty p2, String typePropName) {
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(beanType());
        builder.addExternal(p1, new FakeTypeDeserializer(typePropName, null));
        builder.addExternal(p2, new FakeTypeDeserializer(typePropName, null));
        return builder.build(emptyPropertyMap()).start();
    }

    @Test
    public void testHandleTypePropertyValueAndComplete() throws Exception {
        FakeProperty prop = new FakeProperty("value", false, -1);
        ExternalTypeHandler handler = createSingleHandler(prop, "type", null);

        JsonParser typeParser = parserWithText("cat");
        assertTrue(handler.handleTypePropertyValue(typeParser, ctxt, "type", null));

        assertFalse(handler.handleTypePropertyValue(typeParser, ctxt, "unknown", null));

        JsonParser valueParser = parserWithObject();
        assertTrue(handler.handlePropertyValue(valueParser, ctxt, "value", null));

        Bean bean = new Bean();
        Object result = handler.complete(valueParser, ctxt, bean);
        assertSame(bean, result);
        assertEquals("property-value", prop.value);
    }

    @Test
    public void testHandleTypePropertyValueWithMultipleIndexes() throws Exception {
        FakeProperty p1 = new FakeProperty("p1", false, -1);
        FakeProperty p2 = new FakeProperty("p2", false, -1);
        ExternalTypeHandler handler = createDoubleHandler(p1, p2, "type");

        JsonParser typeParser = parserWithText("id1");
        assertTrue(handler.handleTypePropertyValue(typeParser, ctxt, "type", null));

        JsonParser p1Parser = parserWithObject();
        assertTrue(handler.handlePropertyValue(p1Parser, ctxt, "p1", null));
        JsonParser p2Parser = parserWithObject();
        assertTrue(handler.handlePropertyValue(p2Parser, ctxt, "p2", null));

        Bean bean = new Bean();
        assertSame(bean, handler.complete(p2Parser, ctxt, bean));
        assertEquals("property-value", p1.value);
        assertEquals("property-value", p2.value);
    }

    @Test
    public void testHandlePropertyValueWithMultipleIndexes() throws Exception {
        FakeProperty p1 = new FakeProperty("p1", false, -1);
        FakeProperty p2 = new FakeProperty("p2", false, -1);
        ExternalTypeHandler handler = createDoubleHandler(p1, p2, "type");

        JsonParser typeParser = parserWithText("id2");
        assertTrue(handler.handlePropertyValue(typeParser, ctxt, "type", null));

        JsonParser p1Parser = parserWithObject();
        assertTrue(handler.handlePropertyValue(p1Parser, ctxt, "p1", null));
        JsonParser p2Parser = parserWithObject();
        assertTrue(handler.handlePropertyValue(p2Parser, ctxt, "p2", null));

        Bean bean = new Bean();
        assertSame(bean, handler.complete(p2Parser, ctxt, bean));
        assertEquals("property-value", p1.value);
        assertEquals("property-value", p2.value);
    }

    @Test
    public void testCompleteAllowsMissingTypeIdAndValue() throws Exception {
        FakeProperty prop = new FakeProperty("value", false, -1);
        ExternalTypeHandler handler = createSingleHandler(prop, "type", null);

        Bean bean = new Bean();
        JsonParser parser = parserWithNull();
        assertSame(bean, handler.complete(parser, ctxt, bean));
        assertNull(prop.value);
    }

    @Test(expected = JsonMappingException.class)
    public void testCompleteReportsMissingPropertyForTypeId() throws Exception {
        FakeProperty prop = new FakeProperty("value", true, -1);
        ExternalTypeHandler handler = createSingleHandler(prop, "type", null);

        JsonParser typeParser = parserWithText("id3");
        handler.handleTypePropertyValue(typeParser, ctxt, "type", null);

        JsonParser valueParser = parserWithObject();
        handler.complete(valueParser, ctxt, new Bean());
        fail("Should have thrown JsonMappingException");
    }

    @Test(expected = JsonMappingException.class)
    public void testCompleteReportsMissingTypeIdForValue() throws Exception {
        FakeProperty prop = new FakeProperty("value", false, -1);
        ExternalTypeHandler handler = createSingleHandler(prop, "type", null);

        JsonParser nullParser = parserWithNull();
        handler.handlePropertyValue(nullParser, ctxt, "value", null);

        JsonParser completeParser = parserWithNull();
        handler.complete(completeParser, ctxt, new Bean());
        fail("Should have thrown JsonMappingException");
    }

    private static class FakeProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final boolean required;
        private final int creatorIndex;
        private Object value;

        FakeProperty(String name, boolean required, int creatorIndex) {
            super(PropertyName.construct(name),
                    TypeFactory.defaultInstance().constructType(String.class),
                    null, null, dummyDeserializer());
            this.required = required;
            this.creatorIndex = creatorIndex;
        }

        private static JsonDeserializer<Object> dummyDeserializer() {
            return new JsonDeserializer<Object>() {
                @Override
                public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                    return "property-value";
                }
            };
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.value = value;
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
        public void fixAccess(DeserializationConfig config) {
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return this;
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nvp) {
            return this;
        }

        @Override
        public JsonDeserializer<Object> getValueDeserializer() {
            return dummyDeserializer();
        }

        @Override
        public boolean isRequired() {
            return required;
        }

        @Override
        public int getCreatorIndex() {
            return creatorIndex;
        }
    }

    private static class FakeTypeDeserializer extends TypeDeserializer {
        private final String typePropertyName;
        private final Class<?> defaultImpl;
        private final TypeIdResolver idResolver;

        FakeTypeDeserializer(String typePropertyName, Class<?> defaultImpl) {
            super(TypeFactory.defaultInstance().constructType(Object.class),
                    new FakeTypeIdResolver(), typePropertyName, false, null);
            this.typePropertyName = typePropertyName;
            this.defaultImpl = defaultImpl;
            this.idResolver = new FakeTypeIdResolver();
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return defaultImpl;
        }

        public JsonDeserializer<Object> getDefaultImplDeserializer() {
            return null;
        }

        @Override
        public String getPropertyName() {
            return typePropertyName;
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return idResolver;
        }

        public JavaType getBaseType() {
            return TypeFactory.defaultInstance().constructType(Object.class);
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

    private static class FakeTypeIdResolver implements TypeIdResolver {
        @Override
        public void init(JavaType baseType) {
        }

        @Override
        public String idFromValue(Object value) {
            return "DEFAULT";
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> type) {
            return "DEFAULT";
        }

        @Override
        public String idFromBaseType() {
            return "DEFAULT";
        }

        @Override
        public JavaType typeFromId(DeserializationContext ctxt, String id) {
            return null;
        }

        @Override
        public String getDescForKnownTypeIds() {
            return "DEFAULT";
        }
    }
}