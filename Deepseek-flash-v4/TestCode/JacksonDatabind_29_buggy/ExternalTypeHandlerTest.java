package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonToken;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExternalTypeHandlerTest {

    private ExternalTypeHandler handler;
    private ExternalTypeHandler.Builder builder;
    private SettableBeanProperty mockProperty;
    private TypeDeserializer mockTypeDeserializer;
    private DeserializationContext ctxt;
    private JsonParser jp;

    @Before
    public void setUp() throws Exception {
        builder = new ExternalTypeHandler.Builder();
        mockProperty = new SettableBeanProperty(null, null, null, null, null, null, null, null) {
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
                set(instance, "value");
            }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
                return null;
            }
            @Override
            public SettableBeanProperty withName(String newName) {
                return null;
            }
        };
        mockTypeDeserializer = new TypeDeserializer() {
            @Override
            public TypeDeserializer forProperty(SettableBeanProperty prop) { return this; }
            @Override
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Class<?> getDefaultImpl() { return null; }
            @Override
            public String getPropertyName() { return "typeId"; }
            @Override
            public TypeIdResolver getTypeIdResolver() { return null; }
        };
        handler = builder.build();
        ctxt = null;
        jp = null;
    }

    @Test
    public void testHandlePropertyValue_TypeName() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
            put("prop", 0);
        }}, new String[1], new TokenBuffer[1]);
        try {
            h.handlePropertyValue(jp, ctxt, "typeId", null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testHandlePropertyValue_PropertyName() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("prop", 0);
        }}, new String[1], new TokenBuffer[1]);
        try {
            h.handlePropertyValue(jp, ctxt, "prop", null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testHandlePropertyValue_Unknown() throws Exception {
        assertFalse(handler.handlePropertyValue(jp, ctxt, "unknown", null));
    }

    @Test
    public void testHandleTypePropertyValue_Unknown() throws Exception {
        assertFalse(handler.handleTypePropertyValue(jp, ctxt, "unknown", null));
    }

    @Test
    public void testHandleTypePropertyValue_NullBean() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[1], new TokenBuffer[1]);
        try {
            h.handleTypePropertyValue(jp, ctxt, "typeId", null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Value for the type id property 'typeId' is null or empty", e.getMessage());
        }
    }

    @Test
    public void testComplete_MissingBoth() throws Exception {
        try {
            handler.complete(jp, ctxt, new Object());
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testComplete_MissingTypeId() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[]{null}, new TokenBuffer[]{new TokenBuffer(jp, false)});
        try {
            h.complete(jp, ctxt, new Object());
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testComplete_MissingProperty() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[]{"type"}, new TokenBuffer[]{null});
        try {
            h.complete(jp, ctxt, new Object());
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testComplete_ScalarNaturalType() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[]{"type"}, new TokenBuffer[]{new TokenBuffer(jp, false)});
        try {
            h.complete(jp, ctxt, new Object());
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testBuilder_addAndBuild() {
        ExternalTypeHandler.Builder b = new ExternalTypeHandler.Builder();
        b.addExternal(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = b.build();
        assertNotNull(h);
    }

    @Test
    public void testStart() {
        ExternalTypeHandler h2 = handler.start();
        assertNotSame(handler, h2);
        assertNotNull(h2);
    }

    @Test
    public void testExtTypedProperty_Getters() {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        assertTrue(prop.hasTypePropertyName("typeId"));
        assertFalse(prop.hasTypePropertyName("other"));
        assertFalse(prop.hasDefaultType());
        assertNull(prop.getDefaultTypeId());
        assertEquals("typeId", prop.getTypePropertyName());
        assertSame(mockProperty, prop.getProperty());
    }

    @Test
    public void testExtTypedProperty_HasDefaultType() {
        TypeDeserializer t = new TypeDeserializer() {
            @Override
            public TypeDeserializer forProperty(SettableBeanProperty prop) { return this; }
            @Override
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override
            public Class<?> getDefaultImpl() { return String.class; }
            @Override
            public String getPropertyName() { return "typeId"; }
            @Override
            public TypeIdResolver getTypeIdResolver() { return new TypeIdResolver() {
                @Override public String idFromValue(Object value) { return "string"; }
                @Override public String idFromValueAndType(Object value, Class<?> suggestedType) { return "string"; }
                @Override public String idFromBaseType() { return "string"; }
                @Override public String idFromToken(JsonToken token) { return "string"; }
                @Override public void init(JavaType type) {}
                @Override public JavaType typeFromId(DeserializationContext ctxt, String id) { return null; }
                @Override public JavaType typeFromId(String id) { return null; }
                @Override public String getMechanism() { return "string"; }
            }; }
        };
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, t);
        assertTrue(prop.hasDefaultType());
        assertEquals("string", prop.getDefaultTypeId());
    }

    @Test
    public void testCompleteWithCreatorBuffer() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[]{"type"}, new TokenBuffer[]{new TokenBuffer(jp, false)});
        try {
            h.complete(jp, ctxt, null, null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testDeserializeAndSet() throws Exception {
        ExtTypedProperty prop = new ExtTypedProperty(mockProperty, mockTypeDeserializer);
        ExternalTypeHandler h = new ExternalTypeHandler(new ExtTypedProperty[]{prop}, new HashMap<String, Integer>() {{
            put("typeId", 0);
        }}, new String[1], new TokenBuffer[]{new TokenBuffer(jp, false)});
        Object bean = new Object();
        try {
            h._deserializeAndSet(jp, ctxt, bean, 0, "type");
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e);
        }
    }
}