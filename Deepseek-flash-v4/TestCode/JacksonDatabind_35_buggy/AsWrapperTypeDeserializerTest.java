package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

public class AsWrapperTypeDeserializerTest {
    private JavaType baseType;
    private TypeIdResolver typeIdResolver;
    private DeserializationContext ctxt;
    private AsWrapperTypeDeserializer deserializer;

    @Before
    public void setUp() {
        baseType = TypeFactory.defaultInstance().constructType(Object.class);
        typeIdResolver = new TypeIdResolverStub();
        deserializer = new AsWrapperTypeDeserializer(baseType, typeIdResolver, "type", false, null);
    }

    @Test
    public void testGetTypeInclusion() {
        assertEquals(com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT, deserializer.getTypeInclusion());
    }

    @Test
    public void testForPropertySameInstance() {
        assertSame(deserializer, deserializer.forProperty(null));
    }

    @Test
    public void testDeserializeTypedFromObjectWithTypeId() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype");
        Object result = deserializer.deserializeTypedFromObject(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    @Test
    public void testDeserializeTypedFromObjectMissingStartObject() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.VALUE_STRING, "subtype");
        try {
            deserializer.deserializeTypedFromObject(jp, ctxt);
            fail("Expected JsonMappingException");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeTypedFromArrayWithTypeId() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype");
        Object result = deserializer.deserializeTypedFromArray(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    @Test
    public void testDeserializeTypedFromScalarWithTypeId() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype");
        Object result = deserializer.deserializeTypedFromScalar(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    @Test
    public void testDeserializeTypedFromAnyWithTypeId() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype");
        Object result = deserializer.deserializeTypedFromAny(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    @Test
    public void testDeserializeWithVisibleTypeId() throws IOException {
        AsWrapperTypeDeserializer visDeser = new AsWrapperTypeDeserializer(baseType, typeIdResolver, "type", true, null);
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype", true);
        Object result = visDeser.deserializeTypedFromObject(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    @Test
    public void testDeserializeNativeTypeId() throws IOException {
        JsonParser jp = new TestJsonParser(JsonToken.START_OBJECT, "subtype", false, true);
        Object result = deserializer.deserializeTypedFromObject(jp, ctxt);
        assertNotNull(result);
        assertEquals("subtype", result);
    }

    private static class TypeIdResolverStub implements TypeIdResolver {
        @Override
        public String idFromValue(Object value) { return null; }
        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }
        @Override
        public String idFromBaseType() { return null; }
        @Override
        public JavaType typeFromId(DeserializationContext ctxt, String id) {
            return TypeFactory.defaultInstance().constructType(Object.class);
        }
        @Override
        public String getMechanism() { return null; }
        @Override
        public void init(JavaType bt) {}
    }

    private static class TestJsonParser extends JsonParser {
        private JsonToken currentToken;
        private String typeId;
        private boolean hasTypeId;
        private int tokenCount = 0;

        TestJsonParser(JsonToken token, String tid) { this(token, tid, false, false); }
        TestJsonParser(JsonToken token, String tid, boolean visible) { this(token, tid, visible, false); }
        TestJsonParser(JsonToken token, String tid, boolean visible, boolean nativeId) {
            currentToken = token;
            typeId = tid;
            hasTypeId = nativeId;
        }

        @Override public JsonToken nextToken() throws IOException {
            tokenCount++;
            switch (tokenCount) {
                case 1: return JsonToken.FIELD_NAME;
                case 2: return JsonToken.VALUE_STRING;
                case 3: return JsonToken.START_OBJECT;
                case 4: return JsonToken.END_OBJECT;
                default: return JsonToken.END_OBJECT;
            }
        }

        @Override public boolean canReadTypeId() { return hasTypeId; }
        @Override public Object getTypeId() { return hasTypeId ? typeId : null; }
        @Override public JsonToken getCurrentToken() {
            if (tokenCount == 0) return currentToken;
            if (tokenCount > 3) return JsonToken.END_OBJECT;
            if (tokenCount == 3) return JsonToken.START_OBJECT;
            return JsonToken.VALUE_STRING;
        }
        @Override public String getText() throws IOException { return typeId; }
        @Override public int currentTokenId() { return 0; }
        @Override public boolean hasCurrentToken() { return currentToken != null; }
        @Override public JsonLocation getCurrentLocation() { return null; }
        @Override public JsonLocation getTokenLocation() { return null; }
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public void close() throws IOException {}
        @Override public void clearCurrentToken() {}
        @Override public JsonToken getLastToken() { return null; }
        @Override public int getText(Writer writer) throws IOException { return 0; }
        @Override public boolean hasTextCharacters() { return false; }
        @Override public Object getEmbeddedObject() { return null; }
        @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return new byte[0]; }
        @Override public boolean getBooleanValue(boolean def) throws IOException { return false; }
        @Override public byte getByteValue() throws IOException { return 0; }
        @Override public short getShortValue() throws IOException { return 0; }
        @Override public int getIntValue() throws IOException { return 0; }
        @Override public long getLongValue() throws IOException { return 0; }
        @Override public float getFloatValue() throws IOException { return 0; }
        @Override public double getDoubleValue() throws IOException { return 0; }
        @Override public Number getNumberValue() throws IOException { return null; }
        @Override public Number getNumberValueEx() throws IOException { return null; }
        @Override public com.fasterxml.jackson.core.type.TypeReference<?> getTypeId() { return null; }
        @Override public Version version() { return null; }
        @Override public int releaseBuffered(OutputStream out) throws IOException { return 0; }
        @Override public int releaseBuffered(Writer w) throws IOException { return 0; }
        @Override public Object getLastClearedToken() { return null; }
        @Override public int getFormatFeatures() { return 0; }
        @Override public JsonParser overrideFormatFeatures(int values, int mask) { return null; }
        @Override public JsonParser setCurrentValue(Object v) { return null; }
        @Override public Object getCurrentValue() { return null; }
        @Override public JsonParser overrideStdFeatures(int values, int mask) { return null; }
        @Override public int getStdFeatureDefaults() { return 0; }
        @Override public int getCurrentName() { return 0; }
        @Override public String getCurrentNameStr() { return null; }
        @Override public String getCurrentFieldName() { return null; }
        @Override public JsonToken currentToken() { return null; }
        @Override public JsonParser skipChildren() throws IOException { return null; }
        @Override public boolean isClosed() { return false; }
        @Override public JsonReadContext getParsingContext() { return null; }
        @Override public void assignCurrentToken(JsonToken token) {}
        @Override public void setCurrentToken(JsonToken token) {}
    }
}