package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ReaderBasedJsonParserTest {

    private IOContext ctxt;
    private Reader reader;
    private ReaderBasedJsonParser parser;

    @Before
    public void setUp() {
        BufferRecycler br = new BufferRecycler();
        ctxt = new IOContext(br, null, true, null);
    }

    @After
    public void tearDown() throws IOException {
        if (parser != null) {
            parser.close();
        }
    }

    private ReaderBasedJsonParser createParser(String json) throws IOException {
        reader = new StringReader(json);
        return new ReaderBasedJsonParser(ctxt, 0, reader, null);
    }

    @Test
    public void testNextTokenSimpleObject() throws IOException {
        parser = createParser("{\"key\":\"value\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenArrayAndNumber() throws IOException {
        parser = createParser("[123, 4.5, true, null]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(4.5, parser.getDoubleValue(), 0.001);
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenNestedStructures() throws IOException {
        parser = createParser("{\"a\":[1, {\"b\":null}]}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetTextForStringValue() throws IOException {
        parser = createParser("\"hello world\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("hello world", parser.getText());
        assertEquals(11, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetTextArray() throws IOException {
        parser = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        char[] text = parser.getTextCharacters();
        assertArrayEquals("hello".toCharArray(), java.util.Arrays.copyOfRange(text, parser.getTextOffset(), parser.getTextOffset() + parser.getTextLength()));
    }

    @Test(expected = JsonParseException.class)
    public void testInvalidJson() throws IOException {
        parser = createParser("{ invalid }");
        parser.nextToken();
        parser.nextToken();
    }

    @Test
    public void testEmptyInput() throws IOException {
        parser = createParser("");
        assertNull(parser.nextToken());
    }

    @Test
    public void testGetValueAsStringWithBoolean() throws IOException {
        parser = createParser("true");
        parser.nextToken();
        assertEquals("true", parser.getValueAsString());
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testNextTextValue() throws IOException {
        parser = createParser("\"text\" 123 \"another\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("text", parser.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("another", parser.nextTextValue());
    }

    @Test
    public void testNextIntValue() throws IOException {
        parser = createParser("42 not_num 7");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(42, parser.nextIntValue(-1));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(-1, parser.nextIntValue(-1));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(7, parser.nextIntValue(-1));
    }

    @Test
    public void testNextLongValue() throws IOException {
        parser = createParser("1234567890123 not_num 1");
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1234567890123L, parser.nextLongValue(-1L));
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(-1L, parser.nextLongValue(-1L));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1L, parser.nextLongValue(-1L));
    }

    @Test
    public void testNextBooleanValue() throws IOException {
        parser = createParser("true false null 0");
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertNull(parser.nextBooleanValue());
    }

    @Test
    public void testSkipChildren() throws IOException {
        parser = createParser("{\"a\":[1,2],\"b\":3}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.skipChildren();
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void testGetBinaryValue() throws IOException {
        parser = createParser("\"SGVsbG8=\"");
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("Hello".getBytes("UTF-8"), result);
    }

    @Test
    public void testGetBinaryValueNonBase64() throws IOException {
        parser = createParser("\"hello\"");
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals("hello".getBytes("UTF-8"), result);
    }

    @Test
    public void testReadBinaryValue() throws IOException {
        parser = createParser("\"YWJjZGVm\"");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals("abcdef".getBytes("UTF-8").length, count);
        assertArrayEquals("abcdef".getBytes("UTF-8"), out.toByteArray());
    }

    @Test
    public void testReadBinaryValueInvalid() throws IOException {
        parser = createParser("\"12345\"");
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertTrue(count > 0);
    }

    @Test
    public void testGetCodec() throws IOException {
        parser = createParser("{}");
        assertNull(parser.getCodec());
    }

    @Test
    public void testSetCodec() throws IOException {
        parser = createParser("{}");
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonParser getParser(JsonFactory factory, JsonGenerator generator) { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T extends TreeNode> T readTree(JsonParser p) { return null; }
            @Override
            public void writeTree(JsonGenerator g, TreeNode rootNode) { }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override
            public Iterator<JsonParser> readValues(JsonParser p, Class<?> valueType) { return null; }
            @Override
            public Iterator<JsonParser> readValues(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) { }
        };
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        reader = new StringReader("{\"a\":1}");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null);
        parser.nextToken();
        StringWriter writer = new StringWriter();
        int released = parser.releaseBuffered(writer);
        assertEquals(0, released);
        assertTrue(writer.toString().isEmpty());
    }

    @Test
    public void testGetInputSource() throws IOException {
        reader = new StringReader("{}");
        parser = new ReaderBasedJsonParser(ctxt, 0, reader, null);
        assertSame(reader, parser.getInputSource());
    }
}