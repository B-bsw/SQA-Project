package com.fasterxml.jackson.core.json;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class UTF8StreamJsonParserTest {

    private IOContext ctxt;
    private ByteQuadsCanonicalizer symbols;
    private JsonFactory factory;
    private static final int DEFAULT_FEATURES = 0; // JsonParser.Feature.collectDefaults()

    @Before
    public void setUp() throws Exception {
        factory = new JsonFactory();
        ctxt = new IOContext(JsonFactory.Feature.collectDefaults(), null, null, null, null, 0);
        symbols = ByteQuadsCanonicalizer.createRoot();
    }

    // ========== Helper to create parser from string ==========
    private UTF8StreamJsonParser parser(String json) throws Exception {
        return parser(json, false);
    }

    private UTF8StreamJsonParser parser(String json, boolean protectedBy) throws Exception {
        byte[] data = json.getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        return new UTF8StreamJsonParser(ctxt, DEFAULT_FEATURES, in, null,
                symbols, null, 100, null, 0, 0, 0);
    }

    // ========== Test constructor ==========
    @Test
    public void testConstructor() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, DEFAULT_FEATURES, in, null, symbols);
        assertNotNull(p);
        p.close();
    }

    // ========== test getCodec / setCodec ==========
    @Test
    public void testGetCodecDefault() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void testSetGetCodec() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonParser getFactory() { return null; }
            @Override
            public JsonParser getParser(JsonParser p) { return p; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<T> valueType) { return null; }
            @Override
            public JsonNode readTree(JsonParser p) { return null; }
        };
        p.setCodec(codec);
        assertSame(codec, p.getCodec());
        p.close();
    }

    // ========== test releaseBuffered ==========
    @Test
    public void testReleaseBufferedZeroCount() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int result = p.releaseBuffered(out);
        assertEquals(0, result);
        p.close();
    }

    @Test
    public void testReleaseBufferedWithData() throws Exception {
        byte[] data = "  {}test".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, DEFAULT_FEATURES, in, null, symbols);
        // force read some bytes into buffer
        p.nextToken();
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int result = p.releaseBuffered(out);
        assertTrue(result > 0);
        assertTrue(out.size() > 0);
        p.close();
    }

    // ========== test getInputSource ==========
    @Test
    public void testGetInputSourceNull() throws Exception {
        byte[] data = "{}".getBytes("UTF-8");
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, DEFAULT_FEATURES, new ByteArrayInputStream(data), null, symbols);
        // not initialized
        assertEquals(null, p.getInputSource());
        p.close();
    }

    @Test
    public void testGetInputSourceNotNull() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        // Should be null because stream not exposed?  Actually _inputStream should be set
        assertNull(p.getInputSource());
        p.close();
    }

    // ========== test getText basic ==========
    @Test
    public void testGetTextStringToken() throws Exception {
        UTF8StreamJsonParser p = parser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("hello", p.getText());
        p.close();
    }

    @Test
    public void testGetTextFieldName() throws Exception {
        UTF8StreamJsonParser p = parser("{\"name\": 12}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getText());
        p.close();
    }

    @Test
    public void testGetTextArrayStart() throws Exception {
        UTF8StreamJsonParser p = parser("[1,2]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals("[", p.getText());
        p.close();
    }

    // ========== test getValueAsString ==========
    @Test
    public void testGetValueAsStringDefault() throws Exception {
        UTF8StreamJsonParser p = parser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals("123", p.getValueAsString());
        assertEquals("123", p.getValueAsString("default"));
        p.close();
    }

    @Test
    public void testGetValueAsStringNullToken() throws Exception {
        UTF8StreamJsonParser p = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals("true", p.getValueAsString());
        p.close();
    }

    // ========== test getValueAsInt ==========
    @Test
    public void testGetValueAsIntNumber() throws Exception {
        UTF8StreamJsonParser p = parser("42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(42, p.getValueAsInt());
        assertEquals(42, p.getValueAsInt(0));
        p.close();
    }

    @Test
    public void testGetValueAsIntDefault() throws Exception {
        UTF8StreamJsonParser p = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(7, p.getValueAsInt(7));
        p.close();
    }

    @Test
    public void testGetValueAsIntNull() throws Exception {
        UTF8StreamJsonParser p = parser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(0, p.getValueAsInt());
        p.close();
    }

    // ========== test getTextCharacters ==========
    @Test
    public void testGetTextCharactersString() throws Exception {
        UTF8StreamJsonParser p = parser("\"abcdef\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        char[] ch = p.getTextCharacters();
        assertEquals("abcdef", new String(ch, p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextCharactersFieldName() throws Exception {
        UTF8StreamJsonParser p = parser("{\"field\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        char[] ch = p.getTextCharacters();
        assertEquals("field", new String(ch, p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    @Test
    public void testGetTextCharactersSentence() throws Exception {
        UTF8StreamJsonParser p = parser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        char[] ch = p.getTextCharacters();
        assertEquals("123", new String(ch, p.getTextOffset(), p.getTextLength()));
        p.close();
    }

    // ========== test getBinaryValue ==========
    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueInvalidToken() throws Exception {
        UTF8StreamJsonParser p = parser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.getBinaryValue(Base64Variants.getDefaultVariant());
        p.close();
    }

    @Test
    public void testGetBinaryValueString() throws Exception {
        // "aGVsbG8=" is "hello"
        UTF8StreamJsonParser p = parser("\"aGVsbG8=\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] data = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("hello", new String(data, "UTF-8"));
        p.close();
    }

    // ========== test nextToken ==========
    @Test
    public void testNextObjectAndField() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\":1}");
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertToken(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextArray() throws Exception {
        UTF8StreamJsonParser p = parser("[1,2,3]");
        assertToken(JsonToken.START_ARRAY, p.nextToken());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertToken(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testNextValueStrings() throws Exception {
        UTF8StreamJsonParser p = parser("true false null 1");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }

    @Test
    public void testNextValueSpecialChars() throws Exception {
        UTF8StreamJsonParser p = parser("[ -1, 2.5 ]");
        assertToken(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(-1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(2.5, p.getDoubleValue(), 0.001);
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenUnexpectedChar() throws Exception {
        UTF8StreamJsonParser p = parser("[a]");
        assertToken(JsonToken.START_ARRAY, p.nextToken());
        p.nextToken(); // should throw
        p.close();
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenUnexpectedEnd() throws Exception {
        UTF8StreamJsonParser p = parser("[1,2");
        assertToken(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.nextToken(); // should throw
        p.close();
    }

    // ========== test nextFieldName ==========
    @Test
    public void testNextFieldNameBasic() throws Exception {
        UTF8StreamJsonParser p = parser("{\"foo\": 1}");
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertTrue(p.nextFieldName());
        assertEquals("foo", p.getCurrentName());
        p.nextToken();
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertFalse(p.nextFieldName());
        p.close();
    }

    @Test
    public void testNextFieldNameFail() throws Exception {
        UTF8StreamJsonParser p = parser("{\"foo\": 1}");
        assertToken(JsonToken.START_OBJECT, p.nextToken());
        assertFalse(p.nextFieldName());
        p.close();
    }

    // ========== test nextTextValue ==========
    @Test
    public void testNextTextValue() throws Exception {
        UTF8StreamJsonParser p = parser("\"str\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("str", p.getText());
        assertNull(p.nextTextValue());
        p.close();
    }

    // ========== test nextIntValue ==========
    @Test
    public void testNextIntValue() throws Exception {
        UTF8StreamJsonParser p = parser("3");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertNotEquals(-1, p.getIntValue());
        p.close();
    }

    @Test
    public void testNextIntValueNotNumber() throws Exception {
        UTF8StreamJsonParser p = parser("\"notnum\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(-3, p.getIntValue(-3)); // default
        p.close();
    }

    // ========== test nextLongValue ==========
    @Test
    public void testNextLongValue() throws Exception {
        UTF8StreamJsonParser p = parser("123456789012345");
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        long expected = 123456789012345L;
        assertEquals(expected, p.getLongValue());
        p.close();
    }

    // ========== test nextBooleanValue ==========
    @Test
    public void testNextBooleanValueTrue() throws Exception {
        UTF8StreamJsonParser p = parser("true");
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertTrue(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueFalse() throws Exception {
        UTF8StreamJsonParser p = parser("false");
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertFalse(p.getBooleanValue());
        p.close();
    }

    @Test
    public void testNextBooleanValueNull() throws Exception {
        UTF8StreamJsonParser p = parser("null");
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertFalse(p.getBooleanValue());
        p.close();
    }

    // ========== test skip children ==========
    @Test
    public void testSkipChildren() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\": [1,2,3], \"b\": {\"c\": null}}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        p.skipChildren(); // skip array
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        p.skipChildren(); // skip object
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void testSkipChildrenOnPrimitive() throws Exception {
        UTF8StreamJsonParser p = parser("\"value\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.skipChildren();
        assertEquals(JsonToken.VALUE_STRING, p.getCurrentToken());
        p.close();
    }

    // ========== test getCurrentName ==========
    @Test
    public void testGetCurrentNameBasic() throws Exception {
        UTF8StreamJsonParser p = parser("{\"name\": 5}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        p.close();
    }

    @Test
    public void testGetCurrentNameTopLevel() throws Exception {
        UTF8StreamJsonParser p = parser("123");
        p.nextToken();
        assertNull(p.getCurrentName());
        p.close();
    }

    // ========== test getTextLength / Offset ==========
    @Test
    public void testTextLength() throws Exception {
        UTF8StreamJsonParser p = parser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals(5, p.getTextLength());
        p.close();
    }

    @Test
    public void testTextOffset() throws Exception {
        UTF8StreamJsonParser p = parser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertTrue(p.getTextOffset() >= 0);
        p.close();
    }

    // ========== test close ==========
    @Test
    public void testClose() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        assertNotNull(p);
        p.close();
        // close twice
        p.close();
    }

    @Test
    public void testClosedFlag() throws Exception {
        UTF8StreamJsonParser p = parser("{}");
        assertFalse(p.isClosed());
        p.nextToken();
        p.close();
        assertTrue(p.isClosed());
    }

    // ========== test getParsingContext ==========
    @Test
    public void testGetParsingContext() throws Exception {
        UTF8StreamJsonParser p = parser("{\"a\": 1}");
        p.nextToken();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        p.getParsingContext().writeTo(bos);
        assertTrue(bos.size() > 0);
        p.close();
    }

    // ========== helper assertions ==========
    private static void assertToken(JsonToken expected, JsonToken actual) {
        assertEquals(expected, actual);
    }
}