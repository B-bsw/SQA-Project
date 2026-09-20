package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

public class StringArrayDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void deserialize_givenEmptyArray_shouldReturnEmptyStringArray() throws Exception {
        // Arrange
        String json = "[]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void deserialize_givenStringArrayWithElements_shouldReturnPopulatedArray() throws Exception {
        // Arrange
        String json = "[\"first\", \"second\", \"third\"]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("first", result[0]);
        Assert.assertEquals("second", result[1]);
        Assert.assertEquals("third", result[2]);
    }

    @Test
    public void deserialize_givenArrayWithNullElement_shouldPreserveNull() throws Exception {
        // Arrange
        String json = "[\"first\", null, \"third\"]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("first", result[0]);
        Assert.assertNull(result[1]);
        Assert.assertEquals("third", result[2]);
    }

    @Test
    public void deserialize_givenArrayWithNonStringTokens_shouldCoerceToString() throws Exception {
        // Arrange: non-string tokens (integer, boolean, double) should be handled via _parseString
        String json = "[123, true, 45.67]";

        // Act
        String[] result = mapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("123", result[0]);
        Assert.assertEquals("true", result[1]);
        Assert.assertEquals("45.67", result[2]);
    }

    @Test
    public void deserialize_givenLargeArrayExceedingBufferChunk_shouldExpandBufferProperly() throws Exception {
        // Arrange: ObjectBuffer default initial chunk length is typically small (e.g. 12 or 16),
        // constructing an array of 5000 items forces chunk buffer allocations.
        int count = 5000;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"item_").append(i).append("\"");
        }
        sb.append("]");

        // Act
        String[] result = mapper.readValue(sb.toString(), String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length);
        Assert.assertEquals("item_0", result[0]);
        Assert.assertEquals("item_" + (count - 1), result[count - 1]);
    }

    @Test
    public void deserialize_givenAcceptSingleValueAsArrayEnabled_shouldWrapSingleString() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"singleElement\"";

        // Act
        String[] result = localMapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("singleElement", result[0]);
    }

    @Test
    public void deserialize_givenAcceptSingleValueAsArrayEnabledAndSingleNull_shouldReturnArrayWithNull() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "null";

        // Act
        String[] result = localMapper.readValue(json, String[].class);

        // Assert: when reading root null with readValue, standard Jackson returns null unless invoked directly
        // Let's test direct deserializer invocation to verify handleNonArray VALUE_NULL branch
        StringArrayDeserializer deser = StringArrayDeserializer.instance;
        StubJsonParser parser = new StubJsonParser(JsonToken.VALUE_NULL, null);
        StubDeserializationContext ctxt = new StubDeserializationContext(true, false);

        String[] directResult = deser.deserialize(parser, ctxt);
        Assert.assertNotNull(directResult);
        Assert.assertEquals(1, directResult.length);
        Assert.assertNull(directResult[0]);
    }

    @Test
    public void deserialize_givenAcceptSingleValueAsArrayEnabledAndSingleNonString_shouldCoerce() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "12345";

        // Act
        String[] result = localMapper.readValue(json, String[].class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("12345", result[0]);
    }

    @Test(expected = JsonMappingException.class)
    public void deserialize_givenSingleValueWhenFeatureDisabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "\"notAnArray\"";

        // Act
        localMapper.readValue(json, String[].class);
    }

    @Test
    public void deserialize_givenEmptyStringAndAcceptEmptyStringAsNullObject_shouldReturnNull() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        localMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String json = "\"\"";

        // Act
        String[] result = localMapper.readValue(json, String[].class);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void deserialize_givenEmptyStringWhenFeatureDisabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        localMapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String json = "\"\"";

        // Act
        localMapper.readValue(json, String[].class);
    }

    @Test(expected = JsonMappingException.class)
    public void deserialize_givenNonEmptyStringWhenFeatureEnabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange: ACCEPT_EMPTY_STRING_AS_NULL_OBJECT is enabled, but string is NOT empty
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        localMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        String json = "\"abc\"";

        // Act
        localMapper.readValue(json, String[].class);
    }

    @Test
    public void deserialize_givenCustomElementDeserializer_shouldInvokeCustomDeserializer() throws Exception {
        // Arrange: create StringArrayDeserializer with a custom element deserializer
        JsonDeserializer<String> customElementDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "CUSTOM:" + jp.getText();
            }

            @Override
            public String getNullValue() {
                return "CUSTOM_NULL";
            }
        };

        StringArrayDeserializer deser = new StringArrayDeserializer(customElementDeser);
        String json = "[\"apple\", null, \"banana\"]";
        JsonParser jp = new JsonFactory().createParser(json);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // Act
        String[] result = deser.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("CUSTOM:apple", result[0]);
        Assert.assertEquals("CUSTOM_NULL", result[1]);
        Assert.assertEquals("CUSTOM:banana", result[2]);
    }

    @Test
    public void deserialize_givenCustomElementDeserializerAndLargeArray_shouldExpandBuffer() throws Exception {
        // Arrange
        JsonDeserializer<String> customElementDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return jp.getText();
            }
        };

        StringArrayDeserializer deser = new StringArrayDeserializer(customElementDeser);
        int count = 1000;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"val").append(i).append("\"");
        }
        sb.append("]");

        JsonParser jp = new JsonFactory().createParser(sb.toString());
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // Act
        String[] result = deser.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(count, result.length);
        Assert.assertEquals("val0", result[0]);
        Assert.assertEquals("val999", result[count - 1]);
    }

    @Test
    public void deserializeWithType_shouldDelegateToTypeDeserializer() throws Exception {
        // Arrange
        StringArrayDeserializer deser = StringArrayDeserializer.instance;
        final boolean[] called = new boolean[] { false };

        TypeDeserializer typeDeserializer = new TypeDeserializer() {
            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return this;
            }

            @Override
            public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion() {
                return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
            }

            @Override
            public String getPropertyName() {
                return "@type";
            }

            @Override
            public com.fasterxml.jackson.databind.jsontype.TypeIdResolver getTypeIdResolver() {
                return null;
            }

            @Override
            public Class<?> getDefaultImpl() {
                return String[].class;
            }

            @Override
            public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
                called[0] = true;
                return new String[] { "typed_result" };
            }

            @Override
            public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }
        };

        StubJsonParser parser = new StubJsonParser(JsonToken.START_ARRAY, null);
        StubDeserializationContext ctxt = new StubDeserializationContext(false, false);

        // Act
        Object result = deser.deserializeWithType(parser, ctxt, typeDeserializer);

        // Assert
        Assert.assertTrue(called[0]);
        Assert.assertTrue(result instanceof String[]);
        String[] arr = (String[]) result;
        Assert.assertEquals(1, arr.length);
        Assert.assertEquals("typed_result", arr[0]);
    }

    @Test
    public void createContextual_givenDefaultStringDeserializer_shouldReturnUnwrappedInstance() throws Exception {
        // Arrange
        StringArrayDeserializer deser = new StringArrayDeserializer();
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // Act
        JsonDeserializer<?> contextualDeser = deser.createContextual(ctxt, null);

        // Assert
        Assert.assertNotNull(contextualDeser);
        Assert.assertTrue(contextualDeser instanceof StringArrayDeserializer);
        Assert.assertNull(((StringArrayDeserializer) contextualDeser)._elementDeserializer);
    }

    @Test
    public void createContextual_givenCustomElementDeserializerAlreadyAssigned_shouldHandleSecondaryContextualization() throws Exception {
        // Arrange
        final boolean[] secondaryCalled = new boolean[] { false };
        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return jp.getText();
            }
        };

        StringArrayDeserializer deser = new StringArrayDeserializer(customDeser);

        DeserializationContext stubCtxt = new StubDeserializationContext(false, false) {
            @Override
            public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop) {
                secondaryCalled[0] = true;
                return deser;
            }
        };

        // Act
        JsonDeserializer<?> contextualDeser = deser.createContextual(stubCtxt, null);

        // Assert
        Assert.assertTrue(secondaryCalled[0]);
        Assert.assertSame(deser, contextualDeser);
    }

    @Test
    public void createContextual_givenDifferentCustomDeserializer_shouldReturnNewInstance() throws Exception {
        // Arrange
        final JsonDeserializer<String> initialDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return jp.getText();
            }
        };
        final JsonDeserializer<String> updatedDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return jp.getText() + "!";
            }
        };

        StringArrayDeserializer deser = new StringArrayDeserializer(initialDeser);

        DeserializationContext stubCtxt = new StubDeserializationContext(false, false) {
            @Override
            public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> d, BeanProperty prop) {
                return updatedDeser;
            }
        };

        // Act
        JsonDeserializer<?> contextualDeser = deser.createContextual(stubCtxt, null);

        // Assert
        Assert.assertNotNull(contextualDeser);
        Assert.assertNotSame(deser, contextualDeser);
        Assert.assertTrue(contextualDeser instanceof StringArrayDeserializer);
        Assert.assertSame(updatedDeser, ((StringArrayDeserializer) contextualDeser)._elementDeserializer);
    }

    // =========================================================================
    // Stubs for isolated edge testing
    // =========================================================================

    private static class StubJsonParser extends JsonParser {
        private final JsonToken currentToken;
        private final String text;

        public StubJsonParser(JsonToken token, String text) {
            this.currentToken = token;
            this.text = text;
        }

        @Override
        public boolean isExpectedStartArrayToken() {
            return currentToken == JsonToken.START_ARRAY;
        }

        @Override
        public JsonToken getCurrentToken() {
            return currentToken;
        }

        @Override
        public String getText() throws IOException {
            return text;
        }

        @Override
        public ObjectCodec getCodec() { return null; }
        @Override
        public void setCodec(ObjectCodec c) {}
        @Override
        public Version version() { return Version.unknownVersion(); }
        @Override
        public void close() throws IOException {}
        @Override
        public JsonToken nextToken() throws IOException { return null; }
        @Override
        public JsonParser skipChildren() throws IOException { return this; }
        @Override
        public boolean isClosed() { return false; }
        @Override
        public JsonStreamContext getParsingContext() { return null; }
        @Override
        public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override
        public JsonLocation getCurrentLocation() { return JsonLocation.NA; }
        @Override
        public String getCurrentName() throws IOException { return null; }
        @Override
        public char[] getTextCharacters() throws IOException { return text != null ? text.toCharArray() : null; }
        @Override
        public int getTextLength() throws IOException { return text != null ? text.length() : 0; }
        @Override
        public int getTextOffset() throws IOException { return 0; }
        @Override
        public boolean hasTextCharacters() { return false; }
        @Override
        public Number getNumberValue() throws IOException { return null; }
        @Override
        public NumberType getNumberType() throws IOException { return null; }
        @Override
        public int getIntValue() throws IOException { return 0; }
        @Override
        public long getLongValue() throws IOException { return 0L; }
        @Override
        public BigInteger getBigIntegerValue() throws IOException { return null; }
        @Override
        public float getFloatValue() throws IOException { return 0.0f; }
        @Override
        public double getDoubleValue() throws IOException { return 0.0; }
        @Override
        public BigDecimal getDecimalValue() throws IOException { return null; }
        @Override
        public byte[] getBinaryValue(Base64Variant bfv) throws IOException { return null; }
        @Override
        public void clearCurrentToken() {}
        @Override
        public JsonToken getLastClearedToken() { return null; }
        @Override
        public void overrideCurrentName(String name) {}
    }

    private static class StubDeserializationContext extends DeserializationContext {
        private static final long serialVersionUID = 1L;
        private final boolean acceptSingle;
        private final boolean acceptEmptyStringAsNull;
        private final ObjectBuffer objectBuffer = new ObjectBuffer();

        public StubDeserializationContext(boolean acceptSingle, boolean acceptEmptyStringAsNull) {
            super(new ObjectMapper().getDeserializationConfig());
            this.acceptSingle = acceptSingle;
            this.acceptEmptyStringAsNull = acceptEmptyStringAsNull;
        }

        @Override
        public boolean isEnabled(DeserializationFeature feat) {
            if (feat == DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY) {
                return acceptSingle;
            }
            if (feat == DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) {
                return acceptEmptyStringAsNull;
            }
            return false;
        }

        @Override
        public ObjectBuffer leaseObjectBuffer() {
            return objectBuffer;
        }

        @Override
        public void returnObjectBuffer(ObjectBuffer buf) {
        }

        @Override
        public JsonMappingException mappingException(Class<?> targetClass) {
            return new JsonMappingException("Mapping exception for " + targetClass);
        }

        @Override
        public JavaType constructType(java.lang.reflect.Type t) {
            return TypeFactory.defaultInstance().constructType(t);
        }

        @Override
        public JsonDeserializer<?> findContextualValueDeserializer(JavaType type, BeanProperty prop) {
            return null;
        }

        @Override
        public JsonDeserializer<?> handleSecondaryContextualization(JsonDeserializer<?> deser, BeanProperty prop) {
            return deser;
        }
    }
}