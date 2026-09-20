package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

public class StringArrayDeserializerTest {

    private final ObjectMapper mapper = new ObjectMapper();
    private final JsonFactory factory = new JsonFactory();

    private DeserializationContext createDeserializationContext(JsonParser jp) {
        DefaultDeserializationContext src = (DefaultDeserializationContext) mapper.getDeserializationContext();
        return src.createInstance(mapper.getDeserializationConfig(), jp, mapper.getInjectableValues());
    }

    @Test
    public void instance_givenStaticConstant_shouldBeNonNull() {
        // Arrange & Act & Assert
        Assert.assertNotNull(StringArrayDeserializer.instance);
        Assert.assertNull(StringArrayDeserializer.instance._elementDeserializer);
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldInitializeWithNullElementDeserializer() {
        // Arrange & Act
        StringArrayDeserializer deser = new StringArrayDeserializer();

        // Assert
        Assert.assertNull(deser._elementDeserializer);
    }

    @Test
    public void deserialize_givenEmptyArray_shouldReturnEmptyArray() throws Exception {
        // Arrange
        String json = "[]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
        jp.close();
    }

    @Test
    public void deserialize_givenSimpleStringArray_shouldReturnMatchingArray() throws Exception {
        // Arrange
        String json = "[\"first\", \"second\", \"third\"]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("first", result[0]);
        Assert.assertEquals("second", result[1]);
        Assert.assertEquals("third", result[2]);
        jp.close();
    }

    @Test
    public void deserialize_givenMoreElementsThanInitialBufferChunk_shouldGrowBufferProperly() throws Exception {
        // Arrange: Jackson ObjectBuffer initial chunk is typically 12; test with 30 items
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < 30; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"item").append(i).append("\"");
        }
        sb.append("]");

        JsonParser jp = factory.createParser(sb.toString());
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(30, result.length);
        for (int i = 0; i < 30; i++) {
            Assert.assertEquals("item" + i, result[i]);
        }
        jp.close();
    }

    @Test
    public void deserialize_givenNonStringTokens_shouldCoerceViaParseString() throws Exception {
        // Arrange: integers, booleans in the array
        String json = "[100, true, 3.14]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("100", result[0]);
        Assert.assertEquals("true", result[1]);
        Assert.assertEquals("3.14", result[2]);
        jp.close();
    }

    @Test(expected = NullPointerException.class)
    public void deserialize_givenNullTokenWithDefaultDeserializer_shouldThrowNullPointerException() throws Exception {
        // Arrange: Default deserializer branch invokes _elementDeserializer.getNullValue() which is null
        String json = "[null]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
        } finally {
            jp.close();
        }
    }

    @Test
    public void deserialize_givenCustomDeserializer_shouldDelegateToCustomDeserializer() throws Exception {
        // Arrange
        JsonDeserializer<String> upperCaseDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext c) throws IOException {
                return p.getText().toUpperCase();
            }
        };
        StringArrayDeserializer deser = new StringArrayDeserializer(upperCaseDeser);

        String json = "[\"apple\", \"banana\"]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = deser.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals("APPLE", result[0]);
        Assert.assertEquals("BANANA", result[1]);
        jp.close();
    }

    @Test
    public void deserialize_givenCustomDeserializerAndNullToken_shouldSetNullValue() throws Exception {
        // Arrange
        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext c) throws IOException {
                return p.getText();
            }
        };
        StringArrayDeserializer deser = new StringArrayDeserializer(customDeser);

        String json = "[\"first\", null, \"third\"]";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = deser.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.length);
        Assert.assertEquals("first", result[0]);
        Assert.assertNull(result[1]);
        Assert.assertEquals("third", result[2]);
        jp.close();
    }

    @Test
    public void deserialize_givenCustomDeserializerAndBufferChunkOverflow_shouldGrowBufferProperly() throws Exception {
        // Arrange
        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext c) throws IOException {
                return "prefix_" + p.getText();
            }
        };
        StringArrayDeserializer deser = new StringArrayDeserializer(customDeser);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < 25; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"val").append(i).append("\"");
        }
        sb.append("]");

        JsonParser jp = factory.createParser(sb.toString());
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        String[] result = deser.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(25, result.length);
        for (int i = 0; i < 25; i++) {
            Assert.assertEquals("prefix_val" + i, result[i]);
        }
        jp.close();
    }

    @Test
    public void deserializeWithType_givenTypeDeserializer_shouldInvokeDeserializeTypedFromArray() throws Exception {
        // Arrange
        final boolean[] invoked = new boolean[] { false };
        final String[] expectedArray = new String[] { "typedResult" };

        TypeDeserializer typeDeser = new TypeDeserializer() {
            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return this;
            }

            @Override
            public As getTypeInclusion() {
                return As.WRAPPER_ARRAY;
            }

            @Override
            public String getPropertyName() {
                return null;
            }

            @Override
            public TypeIdResolver getTypeIdResolver() {
                return null;
            }

            @Override
            public Class<?> getDefaultImpl() {
                return String[].class;
            }

            @Override
            public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) {
                return null;
            }

            @Override
            public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) {
                invoked[0] = true;
                return expectedArray;
            }

            @Override
            public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) {
                return null;
            }

            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) {
                return null;
            }
        };

        JsonParser jp = factory.createParser("[\"test\"]");
        jp.nextToken();
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        Object result = StringArrayDeserializer.instance.deserializeWithType(jp, ctxt, typeDeser);

        // Assert
        Assert.assertTrue(invoked[0]);
        Assert.assertSame(expectedArray, result);
        jp.close();
    }

    @Test
    public void deserialize_givenNonArrayAndSingleValueAsArrayEnabled_shouldReturnSingleElementArray() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "\"singleString\"";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("singleString", result[0]);
        jp.close();
    }

    @Test
    public void deserialize_givenNonArrayNullAndSingleValueAsArrayEnabled_shouldReturnArrayWithNull() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "null";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertNull(result[0]);
        jp.close();
    }

    @Test
    public void deserialize_givenNonArrayNumberAndSingleValueAsArrayEnabled_shouldParseString() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "999";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals("999", result[0]);
        jp.close();
    }

    @Test
    public void deserialize_givenEmptyStringAndAcceptEmptyStringAsNullObjectEnabled_shouldReturnNull() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        customMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "\"\"";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act
        String[] result = StringArrayDeserializer.instance.deserialize(jp, ctxt);

        // Assert
        Assert.assertNull(result);
        jp.close();
    }

    @Test
    public void deserialize_givenNonEmptyStringAndAcceptEmptyStringAsNullObjectEnabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        customMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "\"notEmpty\"";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act & Assert
        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
            Assert.fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            // expected exception
        } finally {
            jp.close();
        }
    }

    @Test
    public void deserialize_givenNonArrayAndAllSpecialFeaturesDisabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        customMapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        String json = "\"notAnArray\"";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act & Assert
        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
            Assert.fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            // expected exception
        } finally {
            jp.close();
        }
    }

    @Test
    public void deserialize_givenNumericTokenAndSpecialFeaturesDisabled_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        String json = "42";
        JsonParser jp = factory.createParser(json);
        jp.nextToken();
        DefaultDeserializationContext src = (DefaultDeserializationContext) customMapper.getDeserializationContext();
        DeserializationContext ctxt = src.createInstance(customMapper.getDeserializationConfig(), jp, customMapper.getInjectableValues());

        // Act & Assert
        try {
            StringArrayDeserializer.instance.deserialize(jp, ctxt);
            Assert.fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            // expected exception
        } finally {
            jp.close();
        }
    }

    @Test
    public void createContextual_givenDefaultStringDeserializer_shouldReturnSameInstance() throws Exception {
        // Arrange
        JsonParser jp = factory.createParser("[]");
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        JsonDeserializer<?> deser = StringArrayDeserializer.instance.createContextual(ctxt, null);

        // Assert
        Assert.assertSame(StringArrayDeserializer.instance, deser);
        jp.close();
    }

    @Test
    public void createContextual_givenCustomDeserializerAlreadyAssigned_shouldReturnThisIfUnchanged() throws Exception {
        // Arrange
        JsonDeserializer<String> customDeser = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser p, DeserializationContext c) throws IOException {
                return p.getText();
            }
        };
        StringArrayDeserializer original = new StringArrayDeserializer(customDeser);

        JsonParser jp = factory.createParser("[]");
        DeserializationContext ctxt = createDeserializationContext(jp);

        // Act
        JsonDeserializer<?> contextual = original.createContextual(ctxt, null);

        // Assert
        Assert.assertSame(original, contextual);
        jp.close();
    }
}