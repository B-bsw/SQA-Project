package com.fasterxml.jackson.databind.node;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonNodeType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;

public class POJONodeTest {

    private static class RecordingJsonGenerator extends JsonGeneratorDelegate {
        private Object writtenObject = null;

        public RecordingJsonGenerator() {
            super(null);
        }

        public Object getWrittenObject() {
            return this.writtenObject;
        }

        @Override
        public void writeObject(Object pojo) throws IOException {
            this.writtenObject = pojo;
        }
    }

    private static class RecordingSerializerProvider extends DefaultSerializerProvider.Impl {
        private static final long serialVersionUID = 1L;
        private boolean defaultSerializeNullCalled = false;
        private JsonGenerator passedGenerator = null;

        public RecordingSerializerProvider() {
            super();
        }

        public RecordingSerializerProvider(RecordingSerializerProvider src) {
            super(src);
        }

        public boolean isDefaultSerializeNullCalled() {
            return this.defaultSerializeNullCalled;
        }

        public JsonGenerator getPassedGenerator() {
            return this.passedGenerator;
        }

        @Override
        public void defaultSerializeNull(JsonGenerator gen) throws IOException {
            this.defaultSerializeNullCalled = true;
            this.passedGenerator = gen;
        }

        @Override
        public DefaultSerializerProvider.Impl createInstance(
                com.fasterxml.jackson.databind.SerializationConfig config,
                com.fasterxml.jackson.databind.ser.SerializerFactory jsf) {
            return new RecordingSerializerProvider(this);
        }
    }

    private static class RecordingJsonSerializable implements JsonSerializable {
        private boolean serializeCalled = false;
        private JsonGenerator passedGenerator = null;
        private SerializerProvider passedProvider = null;

        public boolean isSerializeCalled() {
            return this.serializeCalled;
        }

        public JsonGenerator getPassedGenerator() {
            return this.passedGenerator;
        }

        public SerializerProvider getPassedProvider() {
            return this.passedProvider;
        }

        @Override
        public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
            this.serializeCalled = true;
            this.passedGenerator = gen;
            this.passedProvider = serializers;
        }

        @Override
        public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer)
                throws IOException {
        }
    }

    @Test
    public void getNodeType_givenAnyInstance_shouldReturnPOJO() {
        // Arrange
        POJONode node = new POJONode("test");

        // Act
        JsonNodeType result = node.getNodeType();

        // Assert
        Assert.assertEquals(JsonNodeType.POJO, result);
    }

    @Test
    public void asToken_givenAnyInstance_shouldReturnEmbeddedObjectToken() {
        // Arrange
        POJONode node = new POJONode("test");

        // Act
        JsonToken result = node.asToken();

        // Assert
        Assert.assertEquals(JsonToken.VALUE_EMBEDDED_OBJECT, result);
    }

    @Test
    public void binaryValue_givenByteArrayValue_shouldReturnByteArray() throws IOException {
        // Arrange
        byte[] expected = new byte[] { 1, 2, 3, 4 };
        POJONode node = new POJONode(expected);

        // Act
        byte[] actual = node.binaryValue();

        // Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void binaryValue_givenNonByteArrayValue_shouldDelegateToSuper() throws IOException {
        // Arrange
        POJONode node = new POJONode("not-bytes");

        // Act
        byte[] actual = node.binaryValue();

        // Assert
        Assert.assertNull(actual);
    }

    @Test
    public void asText_givenNullValue_shouldReturnNullString() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        String result = node.asText();

        // Assert
        Assert.assertEquals("null", result);
    }

    @Test
    public void asText_givenNonNullValue_shouldReturnToStringRepresentation() {
        // Arrange
        Integer value = Integer.valueOf(12345);
        POJONode node = new POJONode(value);

        // Act
        String result = node.asText();

        // Assert
        Assert.assertEquals("12345", result);
    }

    @Test
    public void asText_givenNullValueAndCustomDefault_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode(null);
        String defaultValue = "fallback";

        // Act
        String result = node.asText(defaultValue);

        // Assert
        Assert.assertEquals("fallback", result);
    }

    @Test
    public void asText_givenNonNullValueAndCustomDefault_shouldReturnValueString() {
        // Arrange
        POJONode node = new POJONode("actual");

        // Act
        String result = node.asText("fallback");

        // Assert
        Assert.assertEquals("actual", result);
    }

    @Test
    public void asBoolean_givenBooleanTrueValue_shouldReturnTrue() {
        // Arrange
        POJONode node = new POJONode(Boolean.TRUE);

        // Act
        boolean result = node.asBoolean(false);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asBoolean_givenBooleanFalseValue_shouldReturnFalse() {
        // Arrange
        POJONode node = new POJONode(Boolean.FALSE);

        // Act
        boolean result = node.asBoolean(true);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asBoolean_givenNullValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        boolean result = node.asBoolean(true);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void asBoolean_givenNonBooleanValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode("true");

        // Act
        boolean result = node.asBoolean(false);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void asInt_givenNumberValue_shouldReturnIntValue() {
        // Arrange
        POJONode node = new POJONode(Long.valueOf(42L));

        // Act
        int result = node.asInt(99);

        // Assert
        Assert.assertEquals(42, result);
    }

    @Test
    public void asInt_givenNullValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        int result = node.asInt(99);

        // Assert
        Assert.assertEquals(99, result);
    }

    @Test
    public void asInt_givenNonNumberValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode("42");

        // Act
        int result = node.asInt(99);

        // Assert
        Assert.assertEquals(99, result);
    }

    @Test
    public void asLong_givenNumberValue_shouldReturnLongValue() {
        // Arrange
        POJONode node = new POJONode(Integer.valueOf(100));

        // Act
        long result = node.asLong(999L);

        // Assert
        Assert.assertEquals(100L, result);
    }

    @Test
    public void asLong_givenNullValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        long result = node.asLong(999L);

        // Assert
        Assert.assertEquals(999L, result);
    }

    @Test
    public void asLong_givenNonNumberValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode("100");

        // Act
        long result = node.asLong(999L);

        // Assert
        Assert.assertEquals(999L, result);
    }

    @Test
    public void asDouble_givenNumberValue_shouldReturnDoubleValue() {
        // Arrange
        POJONode node = new POJONode(Float.valueOf(3.14f));

        // Act
        double result = node.asDouble(1.0d);

        // Assert
        Assert.assertEquals(3.14f, result, 0.0001d);
    }

    @Test
    public void asDouble_givenNullValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        double result = node.asDouble(1.23d);

        // Assert
        Assert.assertEquals(1.23d, result, 0.00001d);
    }

    @Test
    public void asDouble_givenNonNumberValue_shouldReturnDefaultValue() {
        // Arrange
        POJONode node = new POJONode("3.14");

        // Act
        double result = node.asDouble(1.23d);

        // Assert
        Assert.assertEquals(1.23d, result, 0.00001d);
    }

    @Test
    public void serialize_givenNullValue_shouldCallDefaultSerializeNull() throws IOException {
        // Arrange
        POJONode node = new POJONode(null);
        RecordingJsonGenerator gen = new RecordingJsonGenerator();
        RecordingSerializerProvider ctxt = new RecordingSerializerProvider();

        // Act
        node.serialize(gen, ctxt);

        // Assert
        Assert.assertTrue(ctxt.isDefaultSerializeNullCalled());
        Assert.assertSame(gen, ctxt.getPassedGenerator());
        Assert.assertNull(gen.getWrittenObject());
    }

    @Test
    public void serialize_givenJsonSerializableValue_shouldCallSerializeOnValue() throws IOException {
        // Arrange
        RecordingJsonSerializable serializable = new RecordingJsonSerializable();
        POJONode node = new POJONode(serializable);
        RecordingJsonGenerator gen = new RecordingJsonGenerator();
        RecordingSerializerProvider ctxt = new RecordingSerializerProvider();

        // Act
        node.serialize(gen, ctxt);

        // Assert
        Assert.assertTrue(serializable.isSerializeCalled());
        Assert.assertSame(gen, serializable.getPassedGenerator());
        Assert.assertSame(ctxt, serializable.getPassedProvider());
        Assert.assertFalse(ctxt.isDefaultSerializeNullCalled());
    }

    @Test
    public void serialize_givenPlainPojo_shouldCallWriteObjectOnGenerator() throws IOException {
        // Arrange
        String plainPojo = "plain string";
        POJONode node = new POJONode(plainPojo);
        RecordingJsonGenerator gen = new RecordingJsonGenerator();
        RecordingSerializerProvider ctxt = new RecordingSerializerProvider();

        // Act
        node.serialize(gen, ctxt);

        // Assert
        Assert.assertSame(plainPojo, gen.getWrittenObject());
        Assert.assertFalse(ctxt.isDefaultSerializeNullCalled());
    }

    @Test
    public void getPojo_givenNonNullValue_shouldReturnSameInstance() {
        // Arrange
        Object original = new Object();
        POJONode node = new POJONode(original);

        // Act
        Object result = node.getPojo();

        // Assert
        Assert.assertSame(original, result);
    }

    @Test
    public void getPojo_givenNullValue_shouldReturnNull() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        Object result = node.getPojo();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        POJONode node = new POJONode("test");

        // Act & Assert
        Assert.assertTrue(node.equals(node));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        POJONode node = new POJONode("test");

        // Act & Assert
        Assert.assertFalse(node.equals(null));
    }

    @Test
    public void equals_givenDifferentNodeType_shouldReturnFalse() {
        // Arrange
        POJONode node = new POJONode("test");
        TextNode textNode = new TextNode("test");

        // Act & Assert
        Assert.assertFalse(node.equals(textNode));
    }

    @Test
    public void equals_givenBothValuesNull_shouldReturnTrue() {
        // Arrange
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode(null);

        // Act & Assert
        Assert.assertTrue(node1.equals(node2));
    }

    @Test
    public void equals_givenThisNullAndOtherNonNull_shouldReturnFalse() {
        // Arrange
        POJONode node1 = new POJONode(null);
        POJONode node2 = new POJONode("value");

        // Act & Assert
        Assert.assertFalse(node1.equals(node2));
    }

    @Test
    public void equals_givenThisNonNullAndOtherNull_shouldReturnFalse() {
        // Arrange
        POJONode node1 = new POJONode("value");
        POJONode node2 = new POJONode(null);

        // Act & Assert
        Assert.assertFalse(node1.equals(node2));
    }

    @Test
    public void equals_givenEqualValues_shouldReturnTrue() {
        // Arrange
        POJONode node1 = new POJONode(new String("value"));
        POJONode node2 = new POJONode(new String("value"));

        // Act & Assert
        Assert.assertTrue(node1.equals(node2));
    }

    @Test
    public void equals_givenDifferentValues_shouldReturnFalse() {
        // Arrange
        POJONode node1 = new POJONode("value1");
        POJONode node2 = new POJONode("value2");

        // Act & Assert
        Assert.assertFalse(node1.equals(node2));
    }

    @Test
    public void hashCode_givenNonNullValue_shouldReturnUnderlyingValueHashCode() {
        // Arrange
        String value = "hash_target";
        POJONode node = new POJONode(value);

        // Act
        int hashCode = node.hashCode();

        // Assert
        Assert.assertEquals(value.hashCode(), hashCode);
    }

    @Test(expected = NullPointerException.class)
    public void hashCode_givenNullValue_shouldThrowNullPointerException() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        node.hashCode();
    }

    @Test
    public void toString_givenByteArrayValue_shouldReturnBinaryLengthFormat() {
        // Arrange
        byte[] data = new byte[] { 10, 20, 30 };
        POJONode node = new POJONode(data);

        // Act
        String result = node.toString();

        // Assert
        Assert.assertEquals("(binary value of 3 bytes)", result);
    }

    @Test
    public void toString_givenEmptyByteArray_shouldReturnZeroBytesFormat() {
        // Arrange
        byte[] data = new byte[0];
        POJONode node = new POJONode(data);

        // Act
        String result = node.toString();

        // Assert
        Assert.assertEquals("(binary value of 0 bytes)", result);
    }

    @Test
    public void toString_givenRawValue_shouldReturnRawValueFormat() {
        // Arrange
        RawValue raw = new RawValue("{\"k\":\"v\"}");
        POJONode node = new POJONode(raw);

        // Act
        String result = node.toString();

        // Assert
        Assert.assertEquals("(raw value '{\"k\":\"v\"}')", result);
    }

    @Test
    public void toString_givenNullValue_shouldReturnNullString() {
        // Arrange
        POJONode node = new POJONode(null);

        // Act
        String result = node.toString();

        // Assert
        Assert.assertEquals("null", result);
    }

    @Test
    public void toString_givenStandardObject_shouldReturnStringValueOfObject() {
        // Arrange
        Integer number = Integer.valueOf(999);
        POJONode node = new POJONode(number);

        // Act
        String result = node.toString();

        // Assert
        Assert.assertEquals("999", result);
    }
}