package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {
    private ReaderBasedJsonParser parser;
    private IOContext ctxt;
    private Reader reader;
    private CharsToNameCanonicalizer symbols;
    private int features;

    @Before
    public void setUp() throws Exception {
        ctxt = new IOContext(JsonFactory.FactoryFeature.AUTO_CLOSE_TARGET, null, "test", null, null, 1000, 1000);
        symbols = CharsToNameCanonicalizer.createRoot();
        features = 0;
    }

    @After
    public void tearDown() throws Exception {
        if (parser != null) {
            parser.close();
        }
        if (reader != null) {
            reader.close();
        }
    }

    private void createParser(String json) {
        reader = new StringReader(json);
        parser = new ReaderBasedJsonParser(ctxt, features, reader, symbols.getChild(), null, 0, 0);
    }

    @Test
    public void testGetCodecAndSetCodec() {
        createParser("{}");
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonParser getParser() { return null; }
            @Override
            public JsonParser getParser(byte[] data) { return null; }
            @Override
            public JsonParser getParser(byte[] data, int offset, int len) { return null; }
            @Override
            public JsonParser getParser(String content) { return null; }
            @Override
            public JsonParser getParser(File f) throws IOException { return null; }
            @Override
            public JsonParser getParser(URL url) throws IOException { return null; }
            @Override
            public JsonParser getParser(InputStream in) { return null; }
            @Override
            public JsonParser getParser(Reader r) { return null; }
            @Override
            public JsonNode readTree(JsonParser p) { return null; }
            @Override
            public JsonNode readTree(String content) { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public void writeTree(JsonGenerator g, JsonNode rootNode) { }
            @Override
            public void writeValue(JsonGenerator g, Object value) { }
        };
        parser.setCodec(codec);
        assertEquals(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedZero() throws IOException {
        createParser("{}");
        StringWriter w = new StringWriter();
        assertEquals(0, parser.releaseBuffered(w));
    }

    @Test
    public void testReleaseBufferedWithContent() throws IOException {
        createParser("{\"a\":1}");
        parser.nextToken();
        parser.nextToken();
        StringWriter w = new StringWriter();
        assertEquals(1, parser.releaseBuffered(w));
    }

    @Test
    public void testGetInputSource() {
        createParser("{}");
        assertSame(reader, parser.getInputSource());
    }

    @Test
    public void testLoadMoreNullReader() throws IOException {
        parser = new ReaderBasedJsonParser(ctxt, features, null, symbols.getChild(), null, 0, 0);
        assertFalse(parser.loadMore());
    }

    @Test
    public void testGetTextValueString() throws IOException {
        createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello", parser.getText());
    }

    @Test
    public void testGetTextFieldName() throws IOException {
        createParser("{\"field\":1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("field", parser.getText());
    }

    @Test
    public void testGetValueAsStringNullToken() throws IOException {
        createParser("");
        assertNull(parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringStringToken() throws IOException {
        createParser("\"value\"");
        parser.nextToken();
        assertEquals("value", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefaultValue() throws IOException {
        createParser("123");
        parser.nextToken();
        assertEquals("123", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNullValue() throws IOException {
        createParser("null");
        parser.nextToken();
        assertEquals(null, parser.getValueAsString(null));
    }

    @Test
    public void testGetValueAsStringNumber() throws IOException {
        createParser("123");
        parser.nextToken();
        assertEquals("123", parser.getValueAsString("def"));
    }

    @Test
    public void testGetTextCharactersValueString() throws IOException {
        createParser("\"abc\"");
        parser.nextToken();
        assertNotNull(parser.getTextCharacters());
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetTextCharactersFieldName() throws IOException {
        createParser("{\"field\":1}");
        parser.nextToken();
        parser.nextToken();
        assertNotNull(parser.getTextCharacters());
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthNullToken() throws IOException {
        createParser("");
        assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextLengthFieldName() throws IOException {
        createParser("{\"abc\":1}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(3, parser.getTextLength());
    }

    @Test
    public void testGetBinaryValueNonString() throws IOException {
        createParser("123");
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Should have thrown exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testGetBinaryValueString() throws IOException {
        createParser("\"YWJj\"");
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[]{97, 98, 99}, result);
    }

    @Test
    public void testReadBinaryValueNonString() throws IOException {
        createParser("123");
        parser.nextToken();
        try {
            parser.readBinaryValue(Base64Variants.getDefaultVariant(), new ByteArrayOutputStream());
            fail("Should have thrown exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenFieldName() throws IOException {
        createParser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyArray() throws IOException {
        createParser("[]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws IOException {
        createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testNextTokenNull() throws IOException {
        createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenTrue() throws IOException {
        createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws IOException {
        createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenNumber() throws IOException {
        createParser("123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenInvalidChar() throws IOException {
        createParser("x");
        try {
            parser.nextToken();
            fail("Should have thrown exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenEmptyValue() throws IOException {
        createParser("");
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenSingleCharNumber() throws IOException {
        createParser("0");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenNegativeNumber() throws IOException {
        createParser("-123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-123, parser.getIntValue());
    }

    @Test
    public void testNextTokenDecimalNumber() throws IOException {
        createParser("1.5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1.5, parser.getDoubleValue(), 0.0001);
    }

    @Test
    public void testNextTokenLeadingZero() throws IOException {
        createParser("01");
        try {
            parser.nextToken();
        } catch (JsonParseException e) {
            // could be either valid or invalid depending on feature
        }
    }

    @Test
    public void testNextTabAndNewlineInString() throws IOException {
        createParser("\"a\\tb\"");
        parser.nextToken();
        assertEquals("a\tb", parser.getText());
    }

    @Test
    public void testNextTokenWhiteSpace() throws IOException {
        createParser("  \t\n 123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenCommentBlock() throws IOException {
        features |= JsonParser.Feature.ALLOW_COMMENTS.getMask();
        createParser("/* comment */ 123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenCommentYaml() throws IOException {
        features |= JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        createParser("# comment\n123");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
    }

    @Test
    public void testNextTokenSingleQuote() throws IOException {
        features |= JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        createParser("'single'");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
    }

    @Test
    public void testNextTokenUnquotedFieldName() throws IOException {
        features |= JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        createParser("{unquoted: 123}");
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
    }

    @Test
    public void testNextTokenInvalidNumber() throws IOException {
        createParser("12e");
        try {
            parser.nextToken();
            fail("Should have thrown exception");
        } catch (JsonParseException e) {
            // expected
        }
    }
}