package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private final static String FIELD_NAME = "field";
    private final static String FIELD_VALUE = "value";
    private final static String JSON_OBJECT = "{\"" + FIELD_NAME + "\":\"" + FIELD_VALUE + "\"}";
    private final static String JSON_ARRAY = "[1,2,3]";

    private IOContext ctxt;
    private ByteQuadsCanonicalizer symbols;
    private BufferRecycler recycler;

    @Before
    public void setUp() {
        recycler = new BufferRecycler();
        ctxt = new IOContext(recycler, null, false, null);
        symbols = ByteQuadsCanonicalizer.createRoot();
    }

    @After
    public void tearDown() {
        recycler = null;
        ctxt = null;
        symbols = null;
    }

    private UTF8StreamJsonParser createParser(String json) throws IOException {
        return createParser(json.getBytes("UTF-8"), 0, json.length());
    }

    private UTF8StreamJsonParser createParser(byte[] data, int offset, int len) throws IOException {
        InputStream in = new ByteArrayInputStream(data, offset, len);
        return new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
    }

    @Test
    public void testConstructorNullInput() throws Exception {
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, symbols, null, null, 0);
        assertNotNull(parser);
    }

    @Test
    public void testGetCodecNull() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonParser getParser() { return null; }
            @Override
            public JsonGenerator getGenerator() { return null; }
            @Override
            public JsonFactory getFactory() { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, ResolvedType valueType) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JavaType valueType) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, TypeReference<?> valueTypeRef) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JsonDeserializer<?> deserializer) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JsonNodeFactory containerFactory) throws IOException { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException {}
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public TreeNode readTree(JsonParser p) throws IOException { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) throws IOException { return null; }
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, JavaType valueType) throws IOException { return null; }
            @Override
            public TreeNode readTree(byte[] json) throws IOException { return null; }
            @Override
            public TreeNode readTree(byte[] json, int offset, int len) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, ResolvedType valueType, Class<?>... valueTypeParams) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JavaType valueType, Class<?>... valueTypeParams) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, Class<T> valueType, Class<?>... valueTypeParams) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, TypeReference<?> valueTypeRef, Class<?>... valueTypeParams) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JsonDeserializer<?> deserializer, Class<?>... valueTypeParams) throws IOException { return null; }
            @Override
            public <T extends TreeNode> T readValue(JsonParser p, JsonNodeFactory containerFactory, Class<?>... valueTypeParams) throws IOException { return null; }
        };
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBufferedZeroCount() throws IOException {
        byte[] data = "{}".getBytes();
        try (InputStream in = new ByteArrayInputStream(data)) {
            UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            assertEquals(0, parser.releaseBuffered(out));
            assertEquals(0, out.size());
        }
    }

    @Test
    public void testReleaseBufferedNonZeroCount() throws IOException {
        byte[] data = "  {}".getBytes();
        try (InputStream in = new ByteArrayInputStream(data)) {
            UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
            assertEquals('{', parser.nextToken());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            // release buffered content (the space before { will be consumed, but still buffered?)
            int count = parser.releaseBuffered(out);
            assertTrue(count >= 0);
            assertTrue(out.size() > 0);
        }
    }

    @Test
    public void testGetInputSource() throws IOException {
        byte[] data = "{}".getBytes();
        InputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
        assertSame(in, parser.getInputSource());
    }

    @Test
    public void testGetTextStringOnNullToken() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getText());
    }

    @Test
    public void testGetTextStringValue() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        parser.nextToken();
        parser.nextToken();
        assertEquals(FIELD_NAME, parser.getCurrentName());
        parser.nextToken();
        assertEquals(FIELD_VALUE, parser.getText());
    }

    @Test
    public void testGetTextOnNumericToken() throws Exception {
        UTF8StreamJsonParser parser = createParser("12345");
        parser.nextToken();
        assertEquals("12345", parser.getText());
    }

    @Test
    public void testGetValueAsStringDefault() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        parser.nextToken(); // {
        parser.nextToken(); // FIELD
        assertEquals(FIELD_NAME, parser.getValueAsString());
        parser.nextToken();
        assertEquals(FIELD_VALUE, parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringCustomDefault() throws Exception {
        UTF8StreamJsonParser parser = createParser("true");
        parser.nextToken();
        assertEquals("true", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringNullToken() throws Exception {
        UTF8StreamJsonParser parser = createParser("{");
        parser.nextToken();
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsIntFromIntToken() throws Exception {
        UTF8StreamJsonParser parser = createParser("123");
        parser.nextToken();
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntFromString() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"456\"");
        parser.nextToken();
        assertEquals(456, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNumeric() throws Exception {
        UTF8StreamJsonParser parser = createParser("123.45");
        parser.nextToken();
        assertEquals(123, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefaultOnNull() throws Exception {
        UTF8StreamJsonParser parser = createParser("{");
        parser.nextToken();
        assertEquals(99, parser.getValueAsInt(99));
    }

    @Test
    public void testGetValueAsIntFromBoolean() throws Exception {
        UTF8StreamJsonParser parser = createParser("true");
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(0));
    }

    @Test
    public void testGetTextCharactersForString() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"hello\"");
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals("hello", new String(chars));
    }

    @Test
    public void testGetTextCharactersNullToken() throws Exception {
        UTF8StreamJsonParser parser = createParser("{");
        parser.nextToken();
        assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLength() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"hello\"");
        parser.nextToken();
        assertEquals(5, parser.getTextLength());
    }

    @Test
    public void testGetTextOffset() throws Exception {
        UTF8StreamJsonParser parser = createParser("  \"hello\"");
        parser.nextToken();
        // offset is 0 because the string token starts right after whitespace
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetBinaryValueNotString() throws Exception {
        UTF8StreamJsonParser parser = createParser("123");
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testReadBinaryValueNotString() throws Exception {
        UTF8StreamJsonParser parser = createParser("123");
        parser.nextToken();
        try {
            parser.readBinaryValue(Base64Variants.getDefaultVariant(), new ByteArrayOutputStream());
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenSimpleObject() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenArray() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_ARRAY);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(3, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenNumeric() throws Exception {
        UTF8StreamJsonParser parser = createParser("42");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.getIntValue());
    }

    @Test
    public void testNextTokenNegativeNumber() throws Exception {
        UTF8StreamJsonParser parser = createParser("-17");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-17, parser.getIntValue());
    }

    @Test
    public void testNextTokenDecimal() throws Exception {
        UTF8StreamJsonParser parser = createParser("3.14");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3.14, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testNextTokenExponent() throws Exception {
        UTF8StreamJsonParser parser = createParser("1e5");
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(100000.0, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testNextTokenTrue() throws Exception {
        UTF8StreamJsonParser parser = createParser("true");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
    }

    @Test
    public void testNextTokenFalse() throws Exception {
        UTF8StreamJsonParser parser = createParser("false");
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
    }

    @Test
    public void testNextTokenNull() throws Exception {
        UTF8StreamJsonParser parser = createParser("null");
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
    }

    @Test
    public void testNextTokenStringSingleQuote() throws Exception {
        UTF8StreamJsonParser parser = createParser("'single'");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("'single'", parser.getText());
    }

    @Test
    public void testNextTokenUnquotedFieldName() throws Exception {
        UTF8StreamJsonParser parser = createParser("{ unquoted: 1 }");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("unquoted", parser.getCurrentName());
    }

    @Test
    public void testNextTokenUnexpectedChar() throws Exception {
        UTF8StreamJsonParser parser = createParser("?");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenUnquotedString() throws Exception {
        UTF8StreamJsonParser parser = createParser("hello");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenMissingColon() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"name\" 42}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenInvalidNumber() throws Exception {
        UTF8StreamJsonParser parser = createParser("12a");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenInvalidEscape() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"\\q\"");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testNextTokenUnicodeEscape() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
    }

    @Test
    public void testNextFieldName() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        parser.nextToken();
        assertTrue(parser.nextFieldName(new SerializableString() {
            @Override public String getValue() { return FIELD_NAME; }
            @Override public int charLength() { return FIELD_NAME.length(); }
            @Override public char[] asQuotedChars() { return FIELD_NAME.toCharArray(); }
            @Override public byte[] asUnquotedUTF8() { return FIELD_NAME.getBytes(); }
            @Override public byte[] asQuotedUTF8() { return FIELD_NAME.getBytes(); }
        }));
        assertEquals(FIELD_NAME, parser.getCurrentName());
    }

    @Test
    public void testNextFieldNameNotMatch() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        parser.nextToken();
        assertFalse(parser.nextFieldName(new SerializableString() {
            @Override public String getValue() { return "other"; }
            @Override public int charLength() { return 5; }
            @Override public char[] asQuotedChars() { return "other".toCharArray(); }
            @Override public byte[] asUnquotedUTF8() { return "other".getBytes(); }
            @Override public byte[] asQuotedUTF8() { return "other".getBytes(); }
        }));
        assertEquals(FIELD_NAME, parser.getCurrentName());
    }

    @Test
    public void testNextFieldNameNull() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        parser.nextToken();
        assertFalse(parser.nextFieldName((SerializableString) null));
    }

    @Test
    public void testNextFieldNameString() throws Exception {
        UTF8StreamJsonParser parser = createParser(JSON_OBJECT);
        parser.nextToken();
        assertEquals(FIELD_NAME, parser.nextFieldName());
    }

    @Test
    public void testNextFieldNameNotAField() throws Exception {
        UTF8StreamJsonParser parser = createParser("[1,2]");
        parser.nextToken();
        assertNull(parser.nextFieldName());
    }

    @Test
    public void testNextTextValue() throws Exception {
        UTF8StreamJsonParser parser = createParser("[\"hello\"]");
        parser.nextToken();
        assertEquals("hello", parser.nextTextValue());
    }

    @Test
    public void testNextTextValueNotString() throws Exception {
        UTF8StreamJsonParser parser = createParser("[42]");
        parser.nextToken();
        assertNull(parser.nextTextValue());
    }

    @Test
    public void testNextIntValue() throws Exception {
        UTF8StreamJsonParser parser = createParser("[42]");
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(0));
    }

    @Test
    public void testNextIntValueDefault() throws Exception {
        UTF8StreamJsonParser parser = createParser("[\"hello\"]");
        parser.nextToken();
        assertEquals(0, parser.nextIntValue(0));
    }

    @Test
    public void testNextLongValue() throws Exception {
        UTF8StreamJsonParser parser = createParser("[42]");
        parser.nextToken();
        assertEquals(42L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextLongValueDefault() throws Exception {
        UTF8StreamJsonParser parser = createParser("[\"hello\"]");
        parser.nextToken();
        assertEquals(0L, parser.nextLongValue(0L));
    }

    @Test
    public void testNextBooleanValueTrue() throws Exception {
        UTF8StreamJsonParser parser = createParser("[true]");
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws Exception {
        UTF8StreamJsonParser parser = createParser("[false]");
        parser.nextToken();
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueNull() throws Exception {
        UTF8StreamJsonParser parser = createParser("[null]");
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testEofInArray() throws Exception {
        UTF8StreamJsonParser parser = createParser("[1,2");
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testEofInObject() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\":1");
        parser.nextToken();
        parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testOrderedObject() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"b\":2,\"a\":1}");
        parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.nextToken();
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void testGrowArrayByNull() {
        int[] arr = UTF8StreamJsonParser.growArrayBy(null, 5);
        assertNotNull(arr);
        assertEquals(5, arr.length);
    }

    @Test
    public void testGrowArrayByExisting() {
        int[] arr = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(arr, 2);
        assertNotNull(grown);
        assertEquals(5, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(2, grown[1]);
        assertEquals(3, grown[2]);
    }

    @Test
    public void testParseInt() throws Exception {
        assertEquals(123, UTF8StreamJsonParser.parseInt(new char[]{'1','2','3'}, 0, 3));
    }

    @Test
    public void testParseLong() throws Exception {
        assertEquals(1234567890123L, UTF8StreamJsonParser.parseLong(new char[]{'1','2','3','4','5','6','7','8','9','0','1','2','3'}, 0, 13));
    }

    @Test
    public void testGetTokenLocation() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
    }

    @Test
    public void testGetCurrentLocation() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        parser.nextToken();
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
    }

    @Test
    public void testCloseAutoCloseSource() throws Exception {
        class CustomInputStream extends ByteArrayInputStream {
            boolean closed = false;
            CustomInputStream(byte[] buf) { super(buf); }
            @Override public void close() throws IOException { closed = true; super.close(); }
        }
        CustomInputStream in = new CustomInputStream("{}".getBytes());
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
        parser.close();
        assertTrue(in.closed);
    }

    @Test
    public void testCloseNoAutoClose() throws Exception {
        class CustomInputStream extends ByteArrayInputStream {
            boolean closed = false;
            CustomInputStream(byte[] buf) { super(buf); }
            @Override public void close() throws IOException { closed = true; super.close(); }
        }
        CustomInputStream in = new CustomInputStream("{}".getBytes());
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, symbols, null, null, 0);
        parser.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        parser.close();
        assertFalse(in.closed);
    }

    @Test
    public void testVersion() {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNotNull(parser.version());
    }
}