package com.fasterxml.jackson.databind.deser.std;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

public class NullifyingDeserializerTest {

    private static class StubJsonParser extends JsonParserDelegate {
        private int currentTokenId;
        private int skipChildrenCallCount;
        private boolean throwOnSkip;

        public StubJsonParser(int currentTokenId) {
            super(null);
            this.currentTokenId = currentTokenId;
            this.skipChildrenCallCount = 0;
            this.throwOnSkip = false;
        }

        public void setThrowOnSkip(boolean throwOnSkip) {
            this.throwOnSkip = throwOnSkip;
        }

        public int getSkipChildrenCallCount() {
            return this.skipChildrenCallCount;
        }

        @Override
        public int getCurrentTokenId() {
            return this.currentTokenId;
        }

        @Override
        public JsonParser skipChildren() throws IOException {
            this.skipChildrenCallCount++;
            if (this.throwOnSkip) {
                throw new IOException("Simulated IO failure during skipChildren");
            }
            return this;
        }
    }

    private static class StubTypeDeserializer extends TypeDeserializer {
        private Object desiredResult;
        private boolean deserializeTypedFromAnyCalled;
        private boolean throwOnDeserialize;
        private JsonParser receivedParser;
        private DeserializationContext receivedContext;

        public StubTypeDeserializer(Object desiredResult) {
            this.desiredResult = desiredResult;
            this.deserializeTypedFromAnyCalled = false;
            this.throwOnDeserialize = false;
        }

        public void setThrowOnDeserialize(boolean throwOnDeserialize) {
            this.throwOnDeserialize = throwOnDeserialize;
        }

        public boolean isDeserializeTypedFromAnyCalled() {
            return this.deserializeTypedFromAnyCalled;
        }

        public JsonParser getReceivedParser() {
            return this.receivedParser;
        }

        public DeserializationContext getReceivedContext() {
            return this.receivedContext;
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return null;
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
            return null;
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
            this.deserializeTypedFromAnyCalled = true;
            this.receivedParser = p;
            this.receivedContext = ctxt;
            if (this.throwOnDeserialize) {
                throw new IOException("Simulated IO failure during deserializeTypedFromAny");
            }
            return this.desiredResult;
        }
    }

    @Test
    public void instance_staticConstant_shouldNotBeNullAndHaveProperTargetType() {
        // Arrange & Act & Assert
        Assert.assertNotNull(NullifyingDeserializer.instance);
        Assert.assertEquals(Object.class, NullifyingDeserializer.instance.handledType());
    }

    @Test
    public void constructor_default_shouldCreateInstanceWithObjectHandledType() {
        // Arrange & Act
        NullifyingDeserializer deserializer = new NullifyingDeserializer();

        // Assert
        Assert.assertNotNull(deserializer);
        Assert.assertEquals(Object.class, deserializer.handledType());
    }

    @Test
    public void deserialize_validParser_shouldSkipChildrenAndReturnNull() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NO_TOKEN);

        // Act
        Object result = deserializer.deserialize(parser, null);

        // Assert
        Assert.assertNull(result);
        Assert.assertEquals(1, parser.getSkipChildrenCallCount());
    }

    @Test
    public void deserialize_parserThrowsIOException_shouldPropagateException() {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NO_TOKEN);
        parser.setThrowOnSkip(true);

        // Act & Assert
        try {
            deserializer.deserialize(parser, null);
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IO failure during skipChildren", e.getMessage());
            Assert.assertEquals(1, parser.getSkipChildrenCallCount());
        }
    }

    @Test
    public void deserializeWithType_tokenStartArray_shouldDelegateToTypeDeserializer() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_START_ARRAY);
        Object expectedObject = new Object();
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer(expectedObject);

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertSame(expectedObject, result);
        Assert.assertTrue(typeDeserializer.isDeserializeTypedFromAnyCalled());
        Assert.assertSame(parser, typeDeserializer.getReceivedParser());
        Assert.assertNull(typeDeserializer.getReceivedContext());
    }

    @Test
    public void deserializeWithType_tokenStartObject_shouldDelegateToTypeDeserializer() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_START_OBJECT);
        String expectedObject = "customTypedObject";
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer(expectedObject);

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertSame(expectedObject, result);
        Assert.assertTrue(typeDeserializer.isDeserializeTypedFromAnyCalled());
        Assert.assertSame(parser, typeDeserializer.getReceivedParser());
    }

    @Test
    public void deserializeWithType_tokenFieldName_shouldDelegateToTypeDeserializer() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_FIELD_NAME);
        Integer expectedObject = Integer.valueOf(12345);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer(expectedObject);

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertSame(expectedObject, result);
        Assert.assertTrue(typeDeserializer.isDeserializeTypedFromAnyCalled());
        Assert.assertSame(parser, typeDeserializer.getReceivedParser());
    }

    @Test
    public void deserializeWithType_tokenString_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_STRING);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenNumberInt_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NUMBER_INT);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenNumberFloat_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NUMBER_FLOAT);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenTrue_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_TRUE);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenFalse_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_FALSE);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenNull_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NULL);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenEndObject_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_END_OBJECT);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenEndArray_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_END_ARRAY);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_tokenNotAvailable_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_NOT_AVAILABLE);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_negativeTokenIdBoundary_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(-1);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_unrecognizedHighTokenIdBoundary_shouldReturnNullAndNotDelegate() throws IOException {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(9999);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer("notExpected");

        // Act
        Object result = deserializer.deserializeWithType(parser, null, typeDeserializer);

        // Assert
        Assert.assertNull(result);
        Assert.assertFalse(typeDeserializer.isDeserializeTypedFromAnyCalled());
    }

    @Test
    public void deserializeWithType_typeDeserializerThrowsIOException_shouldPropagateException() {
        // Arrange
        NullifyingDeserializer deserializer = new NullifyingDeserializer();
        StubJsonParser parser = new StubJsonParser(JsonTokenId.ID_START_OBJECT);
        StubTypeDeserializer typeDeserializer = new StubTypeDeserializer(null);
        typeDeserializer.setThrowOnDeserialize(true);

        // Act & Assert
        try {
            deserializer.deserializeWithType(parser, null, typeDeserializer);
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IO failure during deserializeTypedFromAny", e.getMessage());
            Assert.assertTrue(typeDeserializer.isDeserializeTypedFromAnyCalled());
        }
    }
}