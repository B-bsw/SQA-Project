package com.fasterxml.jackson.core.json;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.CharacterEscapes;

public class JsonGeneratorImplTest {

    private IOContext ioContext;
    private ObjectCodec codec;

    // Testable subclass
    private static class TestableJsonGeneratorImpl extends JsonGeneratorImpl {
        TestableJsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec) {
            super(ctxt, features, codec);
        }

        @Override
        protected void _releaseBuffers() { }

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException { }

        @Override
        public void flush() throws IOException { }

        @Override
        public void close() throws IOException { }

        @Override
        public void writeStartArray() throws IOException { }

        @Override
        public void writeEndArray() throws IOException { }

        @Override
        public void writeStartObject() throws IOException { }

        @Override
        public void writeEndObject() throws IOException { }

        @Override
        public void writeFieldName(String name) throws IOException { }

        @Override
        public void writeFieldName(SerializableString name) throws IOException { }

        @Override
        public void writeString(String text) throws IOException { }

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException { }

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
        public void writeBinary(Base64Variant b64variant, byte[] data, int offset, int len) throws IOException { }
    }

    @Before
    public void setUp() {
        ioContext = new IOContext(
                new com.fasterxml.jackson.core.json.JsonFactory()._getBufferRecycler(),
                null, false, null);
        codec = null;
    }

    @Test
    public void testConstructorDefaultSettings() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        assertEquals(0, gen.getCurrentNestingLevel());
        assertNull(gen.getCurrentValue());
        assertFalse(gen.isClosed());
        // Default output escapes
        assertNotNull(gen._outputEscapes);
        // Default root value separator should be DEFAULT_ROOT_VALUE_SEPARATOR
        assertEquals(DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, gen._rootValueSeparator);
    }

    @Test
    public void testConstructorWithEscapeNonAsciiFeature() {
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask();
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, features, codec);
        assertEquals(127, gen.getHighestEscapedChar());
    }

    @Test
    public void testConstructorWithQuoteFieldNamesFeatureDisabled() {
        int features = ~JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, features, codec);
        assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void testConstructorWithQuoteFieldNamesFeatureEnabled() {
        int features = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, features, codec);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testEnableFeature() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        JsonGenerator result = gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertSame(gen, result);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testSetHighestNonEscapedCharNegative() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        JsonGenerator result = gen.setHighestNonEscapedChar(-1);
        assertSame(gen, result);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedCharPositive() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        gen.setHighestNonEscapedChar(255);
        assertEquals(255, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetCharacterEscapesNull() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        gen.setCharacterEscapes(new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return new int[128];
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                return null;
            }
        });
        assertNotNull(gen._characterEscapes);
        assertNotNull(gen._outputEscapes);
        JsonGenerator result = gen.setCharacterEscapes(null);
        assertSame(gen, result);
        assertNull(gen._characterEscapes);
        assertNotNull(gen._outputEscapes);
    }

    @Test
    public void testGetCharacterEscapes() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        assertNull(gen.getCharacterEscapes());
        CharacterEscapes esc = new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() {
                return new int[128];
            }

            @Override
            public SerializableString getEscapeSequence(int ch) {
                return null;
            }
        };
        gen.setCharacterEscapes(esc);
        assertSame(esc, gen.getCharacterEscapes());
    }

    @Test
    public void testSetRootValueSeparator() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        SerializableString sep = new SerializableString() {
            @Override
            public String getValue() {
                return "separator";
            }

            @Override
            public int charLength() {
                return 9;
            }

            @Override
            public char[] asQuotedChars() {
                return getValue().toCharArray();
            }

            @Override
            public byte[] asUnquotedUTF8() {
                return getValue().getBytes();
            }

            @Override
            public byte[] asQuotedUTF8() {
                return getValue().getBytes();
            }
        };
        JsonGenerator result = gen.setRootValueSeparator(sep);
        assertSame(gen, result);
        assertSame(sep, gen._rootValueSeparator);
    }

    @Test
    public void testVersion() {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec);
        assertNotNull(gen.version());
        assertNotNull(gen.version().getGroupId());
        assertNotNull(gen.version().getArtifactId());
    }

    @Test
    public void testWriteStringField() throws IOException {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec) {
            @Override
            public void writeFieldName(String name) {
                // No-op for test
            }

            @Override
            public void writeString(String value) {
                // No-op for test
            }
        };
        // Should not throw
        gen.writeStringField("field", "value");
    }

    @Test
    public void testWriteStringFieldWithNulls() throws IOException {
        TestableJsonGeneratorImpl gen = new TestableJsonGeneratorImpl(ioContext, 0, codec) {
            @Override
            public void writeFieldName(String name) {
                // No-op for test
            }

            @Override
            public void writeString(String value) {
                // No-op for test
            }
        };
        // Should not throw even with nulls
        gen.writeStringField(null, null);
    }
}