package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private MockJsonGenerator mockGenerator;
    private MockSerializerProvider mockProvider;

    @Before
    public void setUp() {
        this.serializer = new StdKeySerializer();
        this.mockGenerator = new MockJsonGenerator();
        this.mockProvider = new MockSerializerProvider();
    }

    @Test
    public void constructor_shouldInitializeWithObjectClass() {
        // Arrange & Act
        StdKeySerializer testSerializer = new StdKeySerializer();

        // Assert
        Assert.assertEquals(Object.class, testSerializer.handledType());
    }

    @Test
    public void serialize_givenDateValue_shouldDelegateToProviderDefaultSerializeDateKey() throws IOException {
        // Arrange
        Date testDate = new Date(1609459200000L);

        // Act
        serializer.serialize(testDate, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockProvider.getDateKeyCallCount());
        Assert.assertSame(testDate, mockProvider.getRecordedDate());
        Assert.assertSame(mockGenerator, mockProvider.getRecordedGenerator());
        Assert.assertEquals(0, mockGenerator.getWriteFieldNameCallCount());
    }

    @Test
    public void serialize_givenSqlDateValue_shouldDelegateToProviderDefaultSerializeDateKey() throws IOException {
        // Arrange
        java.sql.Date sqlDate = new java.sql.Date(1609459200000L);

        // Act
        serializer.serialize(sqlDate, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockProvider.getDateKeyCallCount());
        Assert.assertSame(sqlDate, mockProvider.getRecordedDate());
        Assert.assertSame(mockGenerator, mockProvider.getRecordedGenerator());
        Assert.assertEquals(0, mockGenerator.getWriteFieldNameCallCount());
    }

    @Test
    public void serialize_givenStringValue_shouldWriteExactFieldName() throws IOException {
        // Arrange
        String key = "sampleJsonKey";

        // Act
        serializer.serialize(key, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockGenerator.getWriteFieldNameCallCount());
        Assert.assertEquals("sampleJsonKey", mockGenerator.getWrittenFieldName());
        Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
    }

    @Test
    public void serialize_givenEmptyStringValue_shouldWriteEmptyFieldName() throws IOException {
        // Arrange
        String emptyKey = "";

        // Act
        serializer.serialize(emptyKey, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockGenerator.getWriteFieldNameCallCount());
        Assert.assertEquals("", mockGenerator.getWrittenFieldName());
        Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
    }

    @Test
    public void serialize_givenIntegerValue_shouldWriteToStringRepresentation() throws IOException {
        // Arrange
        Integer intKey = Integer.valueOf(98765);

        // Act
        serializer.serialize(intKey, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockGenerator.getWriteFieldNameCallCount());
        Assert.assertEquals("98765", mockGenerator.getWrittenFieldName());
        Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
    }

    @Test
    public void serialize_givenCustomObject_shouldWriteCustomToStringRepresentation() throws IOException {
        // Arrange
        Object customObject = new Object() {
            public String toString() {
                return "custom_serialized_key";
            }
        };

        // Act
        serializer.serialize(customObject, mockGenerator, mockProvider);

        // Assert
        Assert.assertEquals(1, mockGenerator.getWriteFieldNameCallCount());
        Assert.assertEquals("custom_serialized_key", mockGenerator.getWrittenFieldName());
        Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
    }

    @Test
    public void serialize_givenNullValue_shouldThrowNullPointerException() throws IOException {
        // Arrange
        Object nullKey = null;

        // Act & Assert
        try {
            serializer.serialize(nullKey, mockGenerator, mockProvider);
            Assert.fail("Expected NullPointerException when serializing null key");
        } catch (NullPointerException e) {
            Assert.assertEquals(0, mockGenerator.getWriteFieldNameCallCount());
            Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
        }
    }

    @Test
    public void serialize_givenNullGeneratorForNonDate_shouldThrowNullPointerException() throws IOException {
        // Arrange
        String key = "keyWithoutGenerator";

        // Act & Assert
        try {
            serializer.serialize(key, null, mockProvider);
            Assert.fail("Expected NullPointerException when JsonGenerator is null");
        } catch (NullPointerException e) {
            Assert.assertEquals(0, mockProvider.getDateKeyCallCount());
        }
    }

    @Test
    public void getSchema_givenNonNullParameters_shouldReturnStringSchemaNode() throws JsonMappingException {
        // Arrange
        Type typeHint = String.class;

        // Act
        JsonNode schemaNode = serializer.getSchema(mockProvider, typeHint);

        // Assert
        Assert.assertNotNull(schemaNode);
        Assert.assertNotNull(schemaNode.get("type"));
        Assert.assertEquals("string", schemaNode.get("type").asText());
    }

    @Test
    public void getSchema_givenNullProviderAndNullTypeHint_shouldReturnStringSchemaNode() throws JsonMappingException {
        // Arrange & Act
        JsonNode schemaNode = serializer.getSchema(null, null);

        // Assert
        Assert.assertNotNull(schemaNode);
        Assert.assertNotNull(schemaNode.get("type"));
        Assert.assertEquals("string", schemaNode.get("type").asText());
    }

    @Test
    public void acceptJsonFormatVisitor_givenValidVisitor_shouldCallExpectStringFormat() throws JsonMappingException {
        // Arrange
        MockFormatVisitor visitor = new MockFormatVisitor();
        JavaType javaType = TypeFactory.defaultInstance().constructType(String.class);

        // Act
        serializer.acceptJsonFormatVisitor(visitor, javaType);

        // Assert
        Assert.assertEquals(1, visitor.getCallCount());
        Assert.assertSame(javaType, visitor.getVisitedType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenNullTypeHint_shouldPassNullTypeHintToVisitor() throws JsonMappingException {
        // Arrange
        MockFormatVisitor visitor = new MockFormatVisitor();

        // Act
        serializer.acceptJsonFormatVisitor(visitor, null);

        // Assert
        Assert.assertEquals(1, visitor.getCallCount());
        Assert.assertNull(visitor.getVisitedType());
    }

    @Test
    public void acceptJsonFormatVisitor_givenNullVisitor_shouldThrowNullPointerException() throws JsonMappingException {
        // Arrange
        JavaType javaType = TypeFactory.defaultInstance().constructType(Object.class);

        // Act & Assert
        try {
            serializer.acceptJsonFormatVisitor(null, javaType);
            Assert.fail("Expected NullPointerException when visitor is null");
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    private static class MockJsonGenerator extends TokenBuffer {
        private String writtenFieldName;
        private int writeFieldNameCallCount = 0;

        public MockJsonGenerator() {
            super((ObjectCodec) null);
        }

        public void writeFieldName(String name) throws IOException {
            this.writtenFieldName = name;
            this.writeFieldNameCallCount++;
            super.writeFieldName(name);
        }

        public String getWrittenFieldName() {
            return writtenFieldName;
        }

        public int getWriteFieldNameCallCount() {
            return writeFieldNameCallCount;
        }
    }

    private static class MockSerializerProvider extends DefaultSerializerProvider {
        private Date recordedDate;
        private JsonGenerator recordedGenerator;
        private int dateKeyCallCount = 0;

        public MockSerializerProvider() {
            super();
        }

        public MockSerializerProvider(SerializerProvider src, SerializationConfig config, SerializerFactory f) {
            super(src, config, f);
        }

        public DefaultSerializerProvider createInstance(SerializationConfig config, SerializerFactory jsf) {
            return new MockSerializerProvider(this, config, jsf);
        }

        public void defaultSerializeDateKey(Date date, JsonGenerator jgen) throws IOException {
            this.recordedDate = date;
            this.recordedGenerator = jgen;
            this.dateKeyCallCount++;
        }

        public Date getRecordedDate() {
            return recordedDate;
        }

        public JsonGenerator getRecordedGenerator() {
            return recordedGenerator;
        }

        public int getDateKeyCallCount() {
            return dateKeyCallCount;
        }
    }

    private static class MockFormatVisitor extends JsonFormatVisitorWrapper.Base {
        private JavaType visitedType;
        private int callCount = 0;

        public JsonStringFormatVisitor expectStringFormat(JavaType type) throws JsonMappingException {
            this.visitedType = type;
            this.callCount++;
            return null;
        }

        public JavaType getVisitedType() {
            return visitedType;
        }

        public int getCallCount() {
            return callCount;
        }
    }
}