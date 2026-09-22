package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {
    private IOContext ctxt;
    private CharsToNameCanonicalizer symbolTable;
    private ReaderBasedJsonParser parser;

    @Before
    public void setUp() {
        ctxt = new IOContext(JsonFactory.builder().build()._getBufferRecycler(), null, false);
        symbolTable = CharsToNameCanonicalizer.createRoot(0);
    }

    private ReaderBasedJsonParser createParser(String json) throws IOException {
        return new ReaderBasedJsonParser(ctxt, 0, new StringReader(json), symbolTable, null);
    }

    @Test
    public void testGetCodecAndSetCodec() throws IOException {
        parser = createParser("{}");
        ObjectCodec customCodec = new ObjectCodec() {
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException {
                return null;
            }

            @Override
            public <T> T readValue(JsonParser p, TypeReference<T> valueTypeRef) throws IOException {
                return null;
            }

            @Override
            public <T> T readValue(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException {
                return null;
            }

            @Override
            public <T> T readValues(JsonParser p, Class<T> valueType) throws IOException {
                return null;
            }

            @Override
            public <T> T readValues(JsonParser p, TypeReference<T> valueTypeRef) throws IOException {
                return null;
            }

            @Override
            public <T> T readValues(JsonParser p, com.fasterxml.jackson.core.type.ResolvedType valueType) throws IOException {
                return null;
            }

            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException {
            }
        };
        assertNull(parser.getCodec());
        parser.setCodec(customCodec);
        assertSame(customCodec, parser.getCodec());
        parser.close();
    }

    @Test
    public void testReleaseBufferedWithContent() throws IOException {
        parser = createParser("\"abc\"");
        parser.nextToken();
        StringWriter w = new StringWriter();
        int count = parser.releaseBuffered(w);
        assertTrue(count > 0);
        assertTrue(w.toString().length() > 0);
        parser.close();
    }

    @Test
    public void testReleaseBufferedNoContent() throws IOException {
        parser = createParser("\"abc\"");
        StringWriter w = new StringWriter();
        int count = parser.releaseBuffered(w);
        assertEquals(0, count);
        assertEquals("", w.toString());
        parser.close();
    }

    @Test
    public void testGetInputSource() throws IOException {
        StringReader r = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, 0, r, symbolTable, null);
        assertSame(r, parser.getInputSource());
        parser.close();
    }

    @Test
    public void testNextTokenSimpleObject() throws IOException {
        parser = createParser("{\"a\":1}");
        assertSame(JsonToken.START_OBJECT, parser.nextToken());
        assertSame(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertSame(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenSimpleArray() throws IOException {
        parser = createParser("[1, \"two\", true, null]");
        assertSame(JsonToken.START_ARRAY, parser.nextToken());
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertSame(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("two", parser.getText());
        assertSame(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.getBooleanValue());
        assertSame(JsonToken.VALUE_NULL, parser.nextToken());
        assertTrue(parser.isExpectedStartObjectToken() == false);
        assertSame(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenEmptyObject() throws IOException {
        parser = createParser("{}");
        assertSame(JsonToken.START_OBJECT, parser.nextToken());
        assertSame(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenEmptyArray() throws IOException {
        parser = createParser("[]");
        assertSame(JsonToken.START_ARRAY, parser.nextToken());
        assertSame(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenValues() throws IOException {
        parser = createParser("true false null");
        assertSame(JsonToken.VALUE_TRUE, parser.nextToken());
        assertSame(JsonToken.VALUE_FALSE, parser.nextToken());
        assertSame(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenNumbers() throws IOException {
        parser = createParser("123 -456 0.25 1e2");
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-456, parser.getIntValue());
        assertSame(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.25, parser.getDoubleValue(), 0.001);
        assertSame(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100.0, parser.getDoubleValue(), 0.001);
        parser.close();
    }

    @Test
    public void testNextTokenStringEscapes() throws IOException {
        parser = createParser("\"line1\\nline2\\t\\\"quoted\\\"\"");
        assertSame(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("line1\nline2\t\"quoted\"", parser.getText());
        parser.close();
    }

    @Test
    public void testNextTokenUnicodeEscape() throws IOException {
        parser = createParser("\"\\u0041\"");
        assertSame(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
        parser.close();
    }

    @Test
    public void testNextTokenInvalidNumber() throws IOException {
        parser = createParser("1.");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testNextTokenUnexpectedChar() throws IOException {
        parser = createParser("?");
        parser.nextToken();
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testNextTokenUnexpectedEndOfStream() throws IOException {
        parser = createParser("{\"a\":");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test
    public void testNextFieldName() throws IOException {
        parser = createParser("{\"field1\":123, \"field2\":456}");
        assertSame(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.nextFieldName(new SerializableString() {
            @Override
            public String getValue() {
                return "field1";
            }

            @Override
            public int charLength() {
                return 6;
            }

            @Override
            public char[] asCharArray() {
                return "field1".toCharArray();
            }

            @Override
            public byte[] asUnquotedUTF8() {
                return "field1".getBytes();
            }

            @Override
            public byte[] asQuotedUTF8() {
                return "\"field1\"".getBytes();
            }

            @Override
            public String toString() {
                return "field1";
            }
        }));
        parser.close();
    }

    @Test
    public void testNextTextValueString() throws IOException {
        parser = createParser("\"hello\"");
        assertNull(parser.nextTextValue());
        parser.nextToken();
        assertEquals("hello", parser.getText());
        parser.close();
    }

    @Test
    public void testNextIntValueDefault() throws IOException {
        parser = createParser("\"notnum\"");
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(42));
        parser.close();
    }

    @Test
    public void testNextLongValueDefault() throws IOException {
        parser = createParser("\"notnum\"");
        parser.nextToken();
        assertEquals(99L, parser.nextLongValue(99L));
        parser.close();
    }

    @Test
    public void testNextBooleanValueDirect() throws IOException {
        parser = createParser("true");
        assertSame(Boolean.TRUE, parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testGetTextForFieldName() throws IOException {
        parser = createParser("{\"key\":null}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("key", parser.getText());
        parser.close();
    }

    @Test
    public void testGetTextCharactersString() throws IOException {
        parser = createParser("\"abc\"");
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals(3, parser.getTextLength());
        parser.close();
    }

    @Test
    public void testGetTextLengthFieldName() throws IOException {
        parser = createParser("{\"field\":1}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
        parser.close();
    }

    @Test
    public void testGetTextOffset() throws IOException {
        parser = createParser("\"abc\"");
        parser.nextToken();
        assertEquals(0, parser.getTextOffset());
        parser.close();
    }

    @Test
    public void testGetBinaryValueNotString() throws IOException {
        parser = createParser("123");
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testGetCurrentNameNull() throws IOException {
        parser = createParser("123");
        parser.nextToken();
        assertNull(parser.getCurrentName());
        parser.close();
    }

    @Test
    public void testCloseReleasesBuffer() throws IOException {
        parser = createParser("{}");
        parser.nextToken();
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testNextTokenWithNestedStructures() throws IOException {
        parser = createParser("{\"a\": {\"b\": [1,2], \"c\": {\"d\": null}}}");
        assertSame(JsonToken.START_OBJECT, parser.nextToken());
        assertSame(JsonToken.FIELD_NAME, parser.nextToken());
        assertSame(JsonToken.START_OBJECT, parser.nextToken());
        assertSame(JsonToken.FIELD_NAME, parser.nextToken());
        assertSame(JsonToken.START_ARRAY, parser.nextToken());
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertSame(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertSame(JsonToken.END_ARRAY, parser.nextToken());
        assertSame(JsonToken.FIELD_NAME, parser.nextToken());
        assertSame(JsonToken.VALUE_NULL, parser.nextToken());
        assertSame(JsonToken.END_OBJECT, parser.nextToken());
        assertSame(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }
}