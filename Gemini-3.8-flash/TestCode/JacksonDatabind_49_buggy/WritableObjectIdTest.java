package com.fasterxml.jackson.databind.ser.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Unit test suite for {@link WritableObjectId}.
 * Strict Java 1.4 / 7 syntax compatible, JUnit 4, without external mocking frameworks.
 */
public class WritableObjectIdTest {

    private MockObjectIdGenerator testGenerator;
    private MockJsonGenerator testJsonGen;
    private MockJsonSerializer testSerializer;
    private DummySerializableString testPropName;

    @Before
    public void setUp() {
        this.testGenerator = new MockObjectIdGenerator("default-generated-id");
        this.testJsonGen = new MockJsonGenerator();
        this.testSerializer = new MockJsonSerializer();
        this.testPropName = new DummySerializableString("@id");
    }

    @Test
    public void constructor_givenGenerator_shouldInitializeCorrectly() {
        // Arrange
        ObjectIdGenerator<Object> generator = new MockObjectIdGenerator("id-1");

        // Act
        WritableObjectId objectId = new WritableObjectId(generator);

        // Assert
        Assert.assertSame(generator, objectId.generator);
        Assert.assertNull(objectId.id);
        Assert.assertFalse(objectId.idWritten);
    }

    @Test
    public void generateId_givenPojo_shouldInvokeGeneratorAndSetId() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        Object pojo = new Object();

        // Act
        Object result = objectId.generateId(pojo);

        // Assert
        Assert.assertEquals("default-generated-id", result);
        Assert.assertEquals("default-generated-id", objectId.id);
        Assert.assertSame(pojo, this.testGenerator.capturedPojo);
    }

    @Test
    public void generateId_givenNullPojo_shouldInvokeGeneratorAndSetId() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);

        // Act
        Object result = objectId.generateId(null);

        // Assert
        Assert.assertEquals("default-generated-id", result);
        Assert.assertEquals("default-generated-id", objectId.id);
        Assert.assertNull(this.testGenerator.capturedPojo);
    }

    @Test
    public void writeAsId_givenNullId_shouldReturnFalse() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = null;
        objectId.idWritten = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertFalse(written);
        Assert.assertNull(this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsId_givenIdNotNullButNotWrittenAndNotAlwaysAsId_shouldReturnFalse() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "my-id";
        objectId.idWritten = false;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertFalse(written);
        Assert.assertNull(this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsId_givenIdWrittenAndNativeObjectIdSupported_shouldWriteObjectRefAndReturnTrue() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "native-id-123";
        objectId.idWritten = true;
        this.testJsonGen.canWriteObjectIdSupport = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(written);
        Assert.assertEquals("native-id-123", this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsId_givenIdWrittenAndNativeObjectIdNotSupported_shouldSerializeAndReturnTrue() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "fallback-id-456";
        objectId.idWritten = true;
        this.testJsonGen.canWriteObjectIdSupport = false;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(written);
        Assert.assertNull(this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(1, this.testSerializer.serializeCount);
        Assert.assertEquals("fallback-id-456", this.testSerializer.serializedValue);
    }

    @Test
    public void writeAsId_givenAlwaysAsIdTrueAndIdNotWrittenNativeSupported_shouldWriteObjectRefAndReturnTrue() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "always-id-789";
        objectId.idWritten = false;
        this.testJsonGen.canWriteObjectIdSupport = true;
        ObjectIdWriter writer = createWriter(this.testPropName, true);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(written);
        Assert.assertEquals("always-id-789", this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsId_givenAlwaysAsIdTrueAndIdNotWrittenNativeNotSupported_shouldSerializeAndReturnTrue() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "always-id-fallback";
        objectId.idWritten = false;
        this.testJsonGen.canWriteObjectIdSupport = false;
        ObjectIdWriter writer = createWriter(this.testPropName, true);

        // Act
        boolean written = objectId.writeAsId(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(written);
        Assert.assertNull(this.testJsonGen.writtenObjectRef);
        Assert.assertEquals(1, this.testSerializer.serializeCount);
        Assert.assertEquals("always-id-fallback", this.testSerializer.serializedValue);
    }

    @Test
    public void writeAsId_givenSerializerThrowsException_shouldPropagateException() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "err-id";
        objectId.idWritten = true;
        this.testJsonGen.canWriteObjectIdSupport = false;
        this.testSerializer.throwIOException = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act & Assert
        try {
            objectId.writeAsId(this.testJsonGen, null, writer);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertEquals("Simulated serialization exception", e.getMessage());
        }
    }

    @Test
    public void writeAsId_givenGeneratorThrowsException_shouldPropagateException() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "err-id";
        objectId.idWritten = true;
        this.testJsonGen.canWriteObjectIdSupport = true;
        this.testJsonGen.throwOnWriteObjectRef = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act & Assert
        try {
            objectId.writeAsId(this.testJsonGen, null, writer);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertEquals("Simulated writeObjectRef exception", e.getMessage());
        }
    }

    @Test
    public void writeAsField_givenNativeObjectIdSupported_shouldWriteObjectIdAndReturnEarly() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "native-field-id";
        objectId.idWritten = false;
        this.testJsonGen.canWriteObjectIdSupport = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        objectId.writeAsField(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(objectId.idWritten);
        Assert.assertEquals("native-field-id", this.testJsonGen.writtenObjectId);
        Assert.assertNull(this.testJsonGen.writtenFieldName);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsField_givenNativeNotSupportedAndPropertyNameNotNull_shouldWriteFieldAndSerialize() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "field-id-normal";
        objectId.idWritten = false;
        this.testJsonGen.canWriteObjectIdSupport = false;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act
        objectId.writeAsField(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(objectId.idWritten);
        Assert.assertNull(this.testJsonGen.writtenObjectId);
        Assert.assertSame(this.testPropName, this.testJsonGen.writtenFieldName);
        Assert.assertEquals(1, this.testSerializer.serializeCount);
        Assert.assertEquals("field-id-normal", this.testSerializer.serializedValue);
    }

    @Test
    public void writeAsField_givenNativeNotSupportedAndPropertyNameNull_shouldOnlySetIdWritten() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "field-id-no-name";
        objectId.idWritten = false;
        this.testJsonGen.canWriteObjectIdSupport = false;
        ObjectIdWriter writer = createWriter(null, false);

        // Act
        objectId.writeAsField(this.testJsonGen, null, writer);

        // Assert
        Assert.assertTrue(objectId.idWritten);
        Assert.assertNull(this.testJsonGen.writtenObjectId);
        Assert.assertNull(this.testJsonGen.writtenFieldName);
        Assert.assertEquals(0, this.testSerializer.serializeCount);
    }

    @Test
    public void writeAsField_givenNativeSupportedAndGenThrowsException_shouldPropagateException() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "err-id";
        this.testJsonGen.canWriteObjectIdSupport = true;
        this.testJsonGen.throwOnWriteObjectId = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act & Assert
        try {
            objectId.writeAsField(this.testJsonGen, null, writer);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertTrue(objectId.idWritten);
            Assert.assertEquals("Simulated writeObjectId exception", e.getMessage());
        }
    }

    @Test
    public void writeAsField_givenSerializerThrowsException_shouldPropagateException() {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        objectId.id = "err-id";
        this.testJsonGen.canWriteObjectIdSupport = false;
        this.testSerializer.throwIOException = true;
        ObjectIdWriter writer = createWriter(this.testPropName, false);

        // Act & Assert
        try {
            objectId.writeAsField(this.testJsonGen, null, writer);
            Assert.fail("Expected IOException was not thrown");
        } catch (IOException e) {
            Assert.assertTrue(objectId.idWritten);
            Assert.assertEquals("Simulated serialization exception", e.getMessage());
        }
    }

    @Test
    public void fullLifecycle_generateThenWriteAsFieldThenWriteAsId_shouldSucceed() throws IOException {
        // Arrange
        WritableObjectId objectId = new WritableObjectId(this.testGenerator);
        ObjectIdWriter writer = createWriter(this.testPropName, false);
        this.testJsonGen.canWriteObjectIdSupport = false;

        // 1. Generate Id
        Object generated = objectId.generateId("myPojo");
        Assert.assertEquals("default-generated-id", generated);
        Assert.assertFalse(objectId.idWritten);

        // 2. Before writeAsField, writeAsId should return false when alwaysAsId=false
        boolean preIdWritten = objectId.writeAsId(this.testJsonGen, null, writer);
        Assert.assertFalse(preIdWritten);

        // 3. Write as field
        objectId.writeAsField(this.testJsonGen, null, writer);
        Assert.assertTrue(objectId.idWritten);
        Assert.assertEquals(1, this.testSerializer.serializeCount);

        // 4. Now writeAsId should return true since idWritten is true
        boolean postIdWritten = objectId.writeAsId(this.testJsonGen, null, writer);
        Assert.assertTrue(postIdWritten);
        Assert.assertEquals(2, this.testSerializer.serializeCount);
    }

    // -------------------------------------------------------------------------
    // Helper Methods & Mock Classes
    // -------------------------------------------------------------------------

    private ObjectIdWriter createWriter(SerializableString propName, boolean alwaysAsId) {
        return new ObjectIdWriter(
                (JavaType) null,
                propName,
                this.testGenerator,
                this.testSerializer,
                alwaysAsId
        );
    }

    private static class MockObjectIdGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;

        private final Object idToReturn;
        public Object capturedPojo;

        public MockObjectIdGenerator(Object idToReturn) {
            this.idToReturn = idToReturn;
        }

        public Class<?> getScope() {
            return Object.class;
        }

        public boolean canUseFor(ObjectIdGenerator<?> gen) {
            return false;
        }

        public ObjectIdGenerator<Object> forScope(Class<?> scope) {
            return this;
        }

        public ObjectIdGenerator<Object> newForSerialization(Object context) {
            return this;
        }

        public IdKey key(Object key) {
            return null;
        }

        public Object generateId(Object forPojo) {
            this.capturedPojo = forPojo;
            return this.idToReturn;
        }
    }

    private static class MockJsonSerializer extends JsonSerializer<Object> {
        public Object serializedValue;
        public int serializeCount = 0;
        public boolean throwIOException = false;

        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (this.throwIOException) {
                throw new IOException("Simulated serialization exception");
            }
            this.serializedValue = value;
            this.serializeCount++;
        }
    }

    private static class MockJsonGenerator extends JsonGeneratorDelegate {
        public boolean canWriteObjectIdSupport = false;
        public String writtenObjectRef;
        public String writtenObjectId;
        public SerializableString writtenFieldName;
        public boolean throwOnWriteObjectRef = false;
        public boolean throwOnWriteObjectId = false;

        public MockJsonGenerator() {
            super(null);
        }

        public boolean canWriteObjectId() {
            return this.canWriteObjectIdSupport;
        }

        public void writeObjectRef(Object id) throws IOException {
            if (this.throwOnWriteObjectRef) {
                throw new IOException("Simulated writeObjectRef exception");
            }
            this.writtenObjectRef = String.valueOf(id);
        }

        public void writeObjectId(Object id) throws IOException {
            if (this.throwOnWriteObjectId) {
                throw new IOException("Simulated writeObjectId exception");
            }
            this.writtenObjectId = String.valueOf(id);
        }

        public void writeFieldName(SerializableString name) throws IOException {
            this.writtenFieldName = name;
        }
    }

    private static class DummySerializableString implements SerializableString {
        private final String value;

        public DummySerializableString(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public int charLength() {
            return (this.value == null) ? 0 : this.value.length();
        }

        public char[] asQuotedChars() {
            return (this.value == null) ? new char[0] : this.value.toCharArray();
        }

        public byte[] asUnquotedUTF8() {
            return (this.value == null) ? new byte[0] : this.value.getBytes();
        }

        public byte[] asQuotedUTF8() {
            return (this.value == null) ? new byte[0] : this.value.getBytes();
        }

        public int appendQuotedUTF8(byte[] buffer, int offset) {
            return 0;
        }

        public int appendQuoted(char[] buffer, int offset) {
            return 0;
        }

        public int appendUnquotedUTF8(byte[] buffer, int offset) {
            return 0;
        }

        public int appendUnquoted(char[] buffer, int offset) {
            return 0;
        }

        public int writeQuotedUTF8(OutputStream out) throws IOException {
            return 0;
        }

        public int writeUnquotedUTF8(OutputStream out) throws IOException {
            return 0;
        }

        public int putQuotedUTF8(ByteBuffer buffer) {
            return 0;
        }

        public int putUnquotedUTF8(ByteBuffer buffer) {
            return 0;
        }
    }
}