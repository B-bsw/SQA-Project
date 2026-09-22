package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private JsonFactory factory;
    private IOContext ctxt;

    @Before
    public void setUp() {
        factory = new JsonFactory();
        ctxt = new IOContext(JsonFactory.Feature.collectDefaults(), null, "test") {
            @Override
            public Object getSourceReference() {
                return super.getSourceReference();
            }
        };
    }

    private ReaderBasedJsonParser createParser(String json) throws IOException {
        return new ReaderBasedJsonParser(ctxt, 0, new StringReader(json), factory._getCodec());
    }

    @Test
    public void testGetCodecAndSetCodec() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        assertNotNull(parser.getCodec());
        ObjectCodec codec = factory.getCodec();
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        ReaderBasedJsonParser parser = createParser("  {}");
        parser.nextToken();
        StringWriter writer = new StringWriter();
        int result = parser.releaseBuffered(writer);
        assertEquals(2, result);
        assertEquals("  ", writer.toString());
    }

    @Test
    public void testReleaseBufferedZeroCount() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        parser.nextToken();
        StringWriter writer = new StringWriter();
        int result = parser.releaseBuffered(writer);
        assertEquals(0, result);
    }

    @Test
    public void testGetInputSource() throws IOException {
        Reader reader = new StringReader("{}");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, reader, null);
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testGetTextString() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextNonString() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken();
        assertEquals("123", parser.getText());
    }

    @Test
    public void testGetValueAsString() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"value\"");
        parser.nextToken();
        assertEquals("value", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("null");
        parser.nextToken();
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithDefault() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken();
        assertEquals("123", parser.getValueAsString("default"));
    }

    @Test
    public void testGetTextCharactersFieldName() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"field\": 1}");
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("field", new String(chars, 0, parser.getTextLength()));
    }

    @Test
    public void testGetTextCharactersString() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"abc\"");
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals("abc", new String(chars, parser.getTextOffset(), parser.getTextLength()));
    }

    @Test
    public void testGetTextLengthRoot() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        parser.nextToken();
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws IOException {
        ReaderBasedJsonParser parser = createParser("  \"x\"");
        parser.nextToken();
        assertEquals(2, parser.getTextOffset());
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueInvalidToken() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        parser.nextToken();
        parser.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
    }

    @Test
    public void testNextTokenSimple() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenArray() throws IOException {
        ReaderBasedJsonParser parser = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenStringValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"str\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("str", parser.getText());
    }

    @Test
    public void testNextTokenNumberInt() throws IOException {
        ReaderBasedJsonParser parser = createParser("42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenNumberNegative() throws IOException {
        ReaderBasedJsonParser parser = createParser("-7");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-7, parser.getIntValue());
    }

    @Test
    public void testNextTokenNumberFloat() throws IOException {
        ReaderBasedJsonParser parser = createParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNextTokenNumberExponent() throws IOException {
        ReaderBasedJsonParser parser = createParser("1e5");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(100000, parser.getIntValue());
    }

    @Test
    public void testNextTokenTrue() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws IOException {
        ReaderBasedJsonParser parser = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenNaN() throws IOException {
        ReaderBasedJsonParser parser = createParser("NaN");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));
    }

    @Test
    public void testNextTokenInfinity() throws IOException {
        ReaderBasedJsonParser parser = createParser("Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
    }

    @Test
    public void testNextTokenNegativeInfinity() throws IOException {
        ReaderBasedJsonParser parser = createParser("-Infinity");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isInfinite(parser.getDoubleValue()));
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenInvalidStart() throws IOException {
        ReaderBasedJsonParser parser = createParser("invalid");
        parser.nextToken();
    }

    @Test
    public void testNextFieldNameMatch() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"field\": 1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.nextFieldName(new SerializableString() {
            @Override
            public String getValue() { return "field"; }
            @Override
            public int charLength() { return 5; }
            @Override
            public char[] asQuotedChars() { return new char[0]; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[0]; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override
            public byte[] asQuotedBytes() { return new byte[0]; }
            @Override
            public byte[] asUnquotedBytes() { return new byte[0]; }
            @Override
            public String toString() { return "field"; }
        }));
    }

    @Test
    public void testNextFieldNameNoMatch() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"other\": true}");
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            @Override
            public String getValue() { return "field"; }
            @Override
            public int charLength() { return 5; }
            @Override
            public char[] asQuotedChars() { return new char[0]; }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[0]; }
            @Override
            public byte[] asQuotedUTF8() { return new byte[0]; }
            @Override
            public byte[] asQuotedBytes() { return new byte[0]; }
            @Override
            public byte[] asUnquotedBytes() { return new byte[0]; }
            @Override
            public String toString() { return "field"; }
        }));
    }

    @Test
    public void testNextTextValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"text\"");
        assertEquals("text", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueNotString() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("5");
        assertEquals(5, parser.nextIntValue(-1));
    }

    @Test
    public void testNextIntValueDefault() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(-1, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValue() throws IOException {
        ReaderBasedJsonParser parser = createParser("1234567890");
        assertEquals(1234567890L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextLongValueDefault() throws IOException {
        ReaderBasedJsonParser parser = createParser("false");
        assertEquals(-1L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValueTrue() throws IOException {
        ReaderBasedJsonParser parser = createParser("true");
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws IOException {
        ReaderBasedJsonParser parser = createParser("false");
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNull() throws IOException {
        ReaderBasedJsonParser parser = createParser("null");
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueOther() throws IOException {
        ReaderBasedJsonParser parser = createParser("123");
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testGetTokenLocation() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"a\": 1}");
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        ReaderBasedJsonParser parser = createParser("  {}");
        parser.nextToken();
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testParseNestedObject() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"a\": {\"b\": [1, 2, 3]}, \"c\": null}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("c", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testParseTrailingComma() throws IOException {
        ReaderBasedJsonParser parser = createParser("[1, 2,]");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testParseEmptyObject() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testParseSingleQuotedString() throws IOException {
        ReaderBasedJsonParser parser = createParser("'single'");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("single", parser.getText());
    }

    @Test
    public void testParseUnicodeEscape() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
    }

    @Test
    public void testParseControlCharacterEscape() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\n\\t\\r\\\\\\/\\b\\f\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\n\t\r\\/\b\f", parser.getText());
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidEscape() throws IOException {
        ReaderBasedJsonParser parser = createParser("\"\\x\"");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidNumber() throws IOException {
        ReaderBasedJsonParser parser = createParser("12abc");
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void testUnexpectedEndOfInput() throws IOException {
        ReaderBasedJsonParser parser = createParser("{\"a\": ");
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testCommentsDisabled() throws IOException {
        ReaderBasedJsonParser parser = createParser("[1, // comment\n 2]");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testParseNumberLeadingZero() throws IOException {
        ReaderBasedJsonParser parser = createParser("01");
        try {
            parser.nextToken();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testParseNumberZero() throws IOException {
        ReaderBasedJsonParser parser = createParser("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }

    @Test
    public void testParseNumberNegativeZero() throws IOException {
        ReaderBasedJsonParser parser = createParser("-0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
    }
}