package com.fasterxml.jackson.core;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.JsonParser.NumberType;

public class JsonGeneratorTest {

    private static class TestJsonGenerator extends JsonGenerator {
        private int featureMask;
        private String lastString;
        private int lastInt;
        private long lastLong;
        private double lastDouble;
        private float lastFloat;
        private short lastShort;
        private byte lastByte;
        private BigInteger lastBigInteger;
        private BigDecimal lastBigDecimal;
        private boolean lastBoolean;
        private boolean lastNull;
        private byte[] lastBytes;
        private Object lastObject;
        private String fieldName;
        private boolean closed;
        private boolean flushed;
        private JsonStreamContext outputContext;
        private boolean writeStartArrayCalled;
        private boolean writeEndArrayCalled;
        private boolean writeStartObjectCalled;
        private boolean writeEndObjectCalled;
        private int startArraySize;
        private Object startObjectValue;

        @Override
        public JsonGenerator setCodec(ObjectCodec oc) { return this; }
        @Override
        public ObjectCodec getCodec() { return null; }
        @Override
        public com.fasterxml.jackson.core.Version version() { return null; }
        @Override
        public JsonGenerator enable(Feature f) { featureMask |= f.getMask(); return this; }
        @Override
        public JsonGenerator disable(Feature f) { featureMask &= ~f.getMask(); return this; }
        @Override
        public boolean isEnabled(Feature f) { return (featureMask & f.getMask()) != 0; }
        @Override
        public int getFeatureMask() { return featureMask; }
        @Override
        @Deprecated
        public JsonGenerator setFeatureMask(int values) { featureMask = values; return this; }
        @Override
        public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override
        public void writeStartArray() throws IOException { writeStartArrayCalled = true; }
        @Override
        public void writeStartArray(int size) throws IOException { writeStartArrayCalled = true; startArraySize = size; writeStartArray(); }
        @Override
        public void writeEndArray() throws IOException { writeEndArrayCalled = true; }
        @Override
        public void writeStartObject() throws IOException { writeStartObjectCalled = true; }
        @Override
        public void writeStartObject(Object forValue) throws IOException { writeStartObjectCalled = true; startObjectValue = forValue; writeStartObject(); }
        @Override
        public void writeEndObject() throws IOException { writeEndObjectCalled = true; }
        @Override
        public void writeFieldName(String name) throws IOException { fieldName = name; }
        @Override
        public void writeFieldName(SerializableString name) throws IOException { fieldName = name.getValue(); }
        @Override
        public void writeString(String text) throws IOException { lastString = text; }
        @Override
        public void writeString(char[] text, int offset, int len) throws IOException { lastString = new String(text, offset, len); }
        @Override
        public void writeString(SerializableString text) throws IOException { lastString = text.getValue(); }
        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override
        public void writeUTF8String(byte[] text, int offset, int length) throws IOException { }
        @Override
        public void writeRaw(String text) throws IOException { }
        @Override
        public void writeRaw(String text, int offset, int len) throws IOException { }
        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException { }
        @Override
        public void writeRaw(char c) throws IOException { }
        @Override
        public void writeRawValue(String text) throws IOException { }
        @Override
        public void writeRawValue(String text, int offset, int len) throws IOException { }
        @Override
        public void writeRawValue(char[] text, int offset, int len) throws IOException { }
        @Override
        public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException { lastBytes = new byte[len]; System.arraycopy(data, offset, lastBytes, 0, len); }
        @Override
        public int writeBinary(Base64Variant bv, InputStream data, int dataLength) throws IOException { return 0; }
        @Override
        public void writeNumber(int v) throws IOException { lastInt = v; }
        @Override
        public void writeNumber(long v) throws IOException { lastLong = v; }
        @Override
        public void writeNumber(BigInteger v) throws IOException { lastBigInteger = v; }
        @Override
        public void writeNumber(double v) throws IOException { lastDouble = v; }
        @Override
        public void writeNumber(float v) throws IOException { lastFloat = v; }
        @Override
        public void writeNumber(BigDecimal v) throws IOException { lastBigDecimal = v; }
        @Override
        public void writeNumber(String encodedValue) throws IOException { lastString = encodedValue; }
        @Override
        public void writeBoolean(boolean state) throws IOException { lastBoolean = state; }
        @Override
        public void writeNull() throws IOException { lastNull = true; }
        @Override
        public void writeObject(Object pojo) throws IOException { lastObject = pojo; }
        @Override
        public void writeTree(TreeNode rootNode) throws IOException { lastObject = rootNode; }
        @Override
        public JsonStreamContext getOutputContext() { return outputContext; }
        @Override
        public void flush() throws IOException { flushed = true; }
        @Override
        public boolean isClosed() { return closed; }
        @Override
        public void close() throws IOException { closed = true; }
    }

    private TestJsonGenerator gen;
    private JsonParser parser;

    @org.junit.Before
    public void setUp() {
        gen = new TestJsonGenerator();
    }

    @Test
    public void testConfigure() {
        assertSame(gen, gen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true));
        assertTrue(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        gen.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        assertFalse(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testOverrideStdFeatures() {
        gen.setFeatureMask(0);
        gen.overrideStdFeatures(JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask(), JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        assertTrue(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        gen.overrideStdFeatures(0, JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        assertFalse(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testOverrideFormatFeatures() {
        try {
            gen.overrideFormatFeatures(0, 1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetSchema() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "test"; }
        };
        try {
            gen.setSchema(schema);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetPrettyPrinter() {
        PrettyPrinter pp = new PrettyPrinter() {
            @Override public void writeRootValueSeparator(JsonGenerator g) throws IOException { }
            @Override public void writeStartObject(JsonGenerator g) throws IOException { }
            @Override public void writeEndObject(JsonGenerator g, int nrOfEntries) throws IOException { }
            @Override public void writeObjectEntrySeparator(JsonGenerator g) throws IOException { }
            @Override public void writeObjectFieldValueSeparator(JsonGenerator g) throws IOException { }
            @Override public void writeStartArray(JsonGenerator g) throws IOException { }
            @Override public void writeEndArray(JsonGenerator g, int nrOfValues) throws IOException { }
            @Override public void writeArrayValueSeparator(JsonGenerator g) throws IOException { }
            @Override public void writeBeforeArrayValues(JsonGenerator g) throws IOException { }
            @Override public void writeBeforeObjectEntries(JsonGenerator g) throws IOException { }
        };
        gen.setPrettyPrinter(pp);
        assertSame(pp, gen.getPrettyPrinter());
    }

    @Test
    public void testWriteStartArraySize() throws IOException {
        gen.writeStartArray(10);
        assertTrue(gen.writeStartArrayCalled);
        assertEquals(10, gen.startArraySize);
        gen.writeEndArray();
        assertTrue(gen.writeEndArrayCalled);
    }

    @Test
    public void testWriteStartObjectValue() throws IOException {
        Object value = new Object();
        gen.writeStartObject(value);
        assertTrue(gen.writeStartObjectCalled);
        assertSame(value, gen.startObjectValue);
        gen.writeEndObject();
        assertTrue(gen.writeEndObjectCalled);
    }

    @Test
    public void testWriteFieldId() throws IOException {
        gen.writeFieldId(123L);
        assertEquals("123", gen.fieldName);
    }

    @Test
    public void testWriteArrayInt() throws IOException {
        int[] array = {1, 2, 3};
        gen.writeArray(array, 0, 3);
        assertEquals(3, gen.lastInt);
        assertTrue(gen.writeStartArrayCalled);
        assertTrue(gen.writeEndArrayCalled);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayIntInvalidOffsets() throws IOException {
        int[] array = {1, 2, 3};
        gen.writeArray(array, -1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriteArrayIntInvalidOffsets2() throws IOException {
        int[] array = {1, 2, 3};
        gen.writeArray(array, 1, 3);
    }

    @Test
    public void testWriteArrayIntNull() throws IOException {
        try {
            gen.writeArray((int[]) null, 0, 0);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testWriteArrayLong() throws IOException {
        long[] array = {1L, 2L};
        gen.writeArray(array, 0, 2);
        assertEquals(2L, gen.lastLong);
        assertTrue(gen.writeStartArrayCalled);
        assertTrue(gen.writeEndArrayCalled);
    }

    @Test
    public void testWriteArrayDouble() throws IOException {
        double[] array = {1.0, 2.0};
        gen.writeArray(array, 0, 2);
        assertEquals(2.0, gen.lastDouble, 0.0);
        assertTrue(gen.writeStartArrayCalled);
        assertTrue(gen.writeEndArrayCalled);
    }

    @Test
    public void testWriteBinary() throws IOException {
        byte[] data = {1, 2, 3};
        gen.writeBinary(data);
        assertArrayEquals(data, gen.lastBytes);
    }

    @Test
    public void testWriteBinaryWithOffsets() throws IOException {
        byte[] data = {1, 2, 3, 4};
        gen.writeBinary(data, 1, 2);
        assertArrayEquals(new byte[]{2, 3}, gen.lastBytes);
    }

    @Test
    public void testWriteBinary(BigInteger value) throws IOException {
        // Test writeNumber with various number types via _writeSimpleObject
        gen._writeSimpleObject(null);
        assertFalse(gen.lastNull); // no exception

        gen._writeSimpleObject("test");
        assertEquals("test", gen.lastString);

        gen._writeSimpleObject((short) 10);
        assertEquals(10, gen.lastInt);

        gen._writeSimpleObject((byte) 5);
        assertEquals(5, gen.lastInt);

        gen._writeSimpleObject(new AtomicInteger(7));
        assertEquals(7, gen.lastInt);

        gen._writeSimpleObject(new AtomicLong(8L));
        assertEquals(8L, gen.lastLong);

        gen._writeSimpleObject(new AtomicBoolean(true));
        assertTrue(gen.lastBoolean);

        gen._writeSimpleObject(new Object());
        // Should handle unknown object without error
    }

    @Test
    public void testCopyCurrentEvent() throws IOException {
        // Test with null token
        parser = new JsonParser() {
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public JsonToken currentToken() { return null; }
            @Override public JsonToken nextToken() throws IOException { return null; }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public void skipChildren() throws IOException { }
            @Override public JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return 0; }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
        };
        try {
            gen.copyCurrentEvent(parser);
            fail("Should throw IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testWriteNumberShort() throws IOException {
        gen.writeNumber((short) 5);
        assertEquals(5, gen.lastInt);
    }

    @Test
    public void testWriteStringField() throws IOException {
        gen.writeStringField("name", "value");
        assertEquals("name", gen.fieldName);
        assertEquals("value", gen.lastString);
    }

    @Test
    public void testWriteBooleanField() throws IOException {
        gen.writeBooleanField("flag", true);
        assertEquals("flag", gen.fieldName);
        assertTrue(gen.lastBoolean);
    }

    @Test
    public void testWriteNullField() throws IOException {
        gen.writeNullField("nullField");
        assertEquals("nullField", gen.fieldName);
        assertTrue(gen.lastNull);
    }

    @Test
    public void testWriteNumberFieldInt() throws IOException {
        gen.writeNumberField("intField", 10);
        assertEquals("intField", gen.fieldName);
        assertEquals(10, gen.lastInt);
    }

    @Test
    public void testWriteNumberFieldLong() throws IOException {
        gen.writeNumberField("longField", 10L);
        assertEquals("longField", gen.fieldName);
        assertEquals(10L, gen.lastLong);
    }

    @Test
    public void testWriteNumberFieldDouble() throws IOException {
        gen.writeNumberField("doubleField", 10.5);
        assertEquals("doubleField", gen.fieldName);
        assertEquals(10.5, gen.lastDouble, 0.0);
    }

    @Test
    public void testWriteNumberFieldFloat() throws IOException {
        gen.writeNumberField("floatField", 10.5f);
        assertEquals("floatField", gen.fieldName);
        assertEquals(10.5f, gen.lastFloat, 0.0f);
    }

    @Test
    public void testWriteNumberFieldBigDecimal() throws IOException {
        BigDecimal bd = new BigDecimal("10.5");
        gen.writeNumberField("bigDecimalField", bd);
        assertEquals("bigDecimalField", gen.fieldName);
        assertEquals(bd, gen.lastBigDecimal);
    }

    @Test
    public void testWriteBinaryField() throws IOException {
        byte[] data = {1, 2, 3};
        gen.writeBinaryField("binaryField", data);
        assertEquals("binaryField", gen.fieldName);
        assertArrayEquals(data, gen.lastBytes);
    }

    @Test
    public void testWriteArrayFieldStart() throws IOException {
        gen.writeArrayFieldStart("arrayField");
        assertEquals("arrayField", gen.fieldName);
        assertTrue(gen.writeStartArrayCalled);
    }

    @Test
    public void testWriteObjectFieldStart() throws IOException {
        gen.writeObjectFieldStart("objectField");
        assertEquals("objectField", gen.fieldName);
        assertTrue(gen.writeStartObjectCalled);
    }

    @Test
    public void testWriteObjectField() throws IOException {
        Object obj = new Object();
        gen.writeObjectField("objectField", obj);
        assertEquals("objectField", gen.fieldName);
        assertSame(obj, gen.lastObject);
    }

    @Test
    public void testWriteOmittedField() throws IOException {
        gen.writeOmittedField("omitted");
        assertNull(gen.fieldName);
    }

    @Test
    public void testWriteObjectRef() throws IOException {
        Object id = new Object();
        gen.writeObjectRef(id);
        assertSame(id, gen.lastObject);
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteEmbeddedObject() throws IOException {
        gen.writeEmbeddedObject(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteObjectId() throws IOException {
        gen.writeObjectId(new Object());
    }

    @Test(expected = JsonGenerationException.class)
    public void testWriteTypeId() throws IOException {
        gen.writeTypeId(new Object());
    }

    @Test
    public void testGetCurrentValue() {
        assertNull(gen.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue() {
        Object v = new Object();
        gen.setCurrentValue(v); // should not throw even if context is null
    }

    @Test
    public void testCanUseSchema() {
        assertFalse(gen.canUseSchema(null));
    }

    @Test
    public void testCanWriteObjectId() {
        assertFalse(gen.canWriteObjectId());
    }

    @Test
    public void testCanWriteTypeId() {
        assertFalse(gen.canWriteTypeId());
    }

    @Test
    public void testCanWriteBinaryNatively() {
        assertFalse(gen.canWriteBinaryNatively());
    }

    @Test
    public void testCanOmitFields() {
        assertTrue(gen.canOmitFields());
    }

    @Test
    public void testCanWriteFormattedNumbers() {
        assertFalse(gen.canWriteFormattedNumbers());
    }

    @Test
    public void testFeatureCollectDefaults() {
        int defaults = JsonGenerator.Feature.collectDefaults();
        assertTrue((defaults & JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask()) != 0);
        assertTrue((defaults & JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask()) != 0);
        assertTrue((defaults & JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask()) != 0);
        assertTrue((defaults & JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask()) != 0);
        assertTrue((defaults & JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask()) != 0);
        assertFalse((defaults & JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask()) != 0);
        assertFalse((defaults & JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask()) != 0);
        assertFalse((defaults & JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) != 0);
        assertFalse((defaults & JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask()) != 0);
        assertFalse((defaults & JsonGenerator.Feature.IGNORE_UNKNOWN.getMask()) != 0);
    }

    @Test
    public void testFeatureEnabledIn() {
        int flags = JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask();
        assertTrue(JsonGenerator.Feature.AUTO_CLOSE_TARGET.enabledIn(flags));
        assertFalse(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.enabledIn(flags));
    }

    @Test
    public void testFeatureGetMask() {
        assertEquals(1, JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask());
        assertEquals(2, JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT.getMask());
        assertEquals(4, JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM.getMask());
        assertEquals(8, JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask());
        assertEquals(16, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.getMask());
        assertEquals(32, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask());
    }

    @Test
    public void testSetHighestNonEscapedChar() {
        assertSame(gen, gen.setHighestNonEscapedChar(100));
    }

    @Test
    public void testGetHighestEscapedChar() {
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testGetCharacterEscapes() {
        assertNull(gen.getCharacterEscapes());
    }

    @Test
    public void testSetCharacterEscapes() {
        CharacterEscapes esc = new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return new int[128]; }
            @Override public SerializableString getEscapeSequence(int ch) { return null; }
        };
        gen.setCharacterEscapes(esc);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetRootValueSeparator() {
        gen.setRootValueSeparator(null);
    }

    @Test
    public void testGetOutputTarget() {
        assertNull(gen.getOutputTarget());
    }

    @Test
    public void testGetOutputBuffered() {
        assertEquals(-1, gen.getOutputBuffered());
    }

    @Test
    public void testGetFormatFeatures() {
        assertEquals(0, gen.getFormatFeatures());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetSchema() {
        gen.getSchema();
    }

    @Test
    public void testJsonGeneratorConstructor() {
        assertNotNull(gen);
    }

    @Test
    public void testCopyCurrentEventStartObject() throws IOException {
        parser = new JsonParser() {
            private JsonToken current = JsonToken.START_OBJECT;
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public JsonToken currentToken() { return current; }
            @Override public JsonToken nextToken() throws IOException { 
                if (current == JsonToken.START_OBJECT) { current = JsonToken.END_OBJECT; return current; }
                return null;
            }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public void skipChildren() throws IOException { }
            @Override public JsonToken getCurrentToken() { return current; }
            @Override public int getCurrentTokenId() { return current.id(); }
            @Override public boolean hasCurrentToken() { return current != null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
        };
        gen.copyCurrentEvent(parser);
        assertTrue(gen.writeStartObjectCalled);
    }

    @Test
    public void testCopyCurrentEventStartArray() throws IOException {
        parser = new JsonParser() {
            private JsonToken current = JsonToken.START_ARRAY;
            @Override public ObjectCodec getCodec() { return null; }
            @Override public void setCodec(ObjectCodec c) { }
            @Override public Object getEmbeddedObject() { return null; }
            @Override public JsonToken currentToken() { return current; }
            @Override public JsonToken nextToken() throws IOException { 
                if (current == JsonToken.START_ARRAY) { current = JsonToken.END_ARRAY; return current; }
                return null;
            }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public void skipChildren() throws IOException { }
            @Override public JsonToken getCurrentToken() { return current; }
            @Override public int getCurrentTokenId() { return current.id(); }
            @Override public boolean hasCurrentToken() { return current != null; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
        };
        gen.copyCurrentEvent(parser);
        assertTrue(gen.writeStartArrayCalled);
    }
}