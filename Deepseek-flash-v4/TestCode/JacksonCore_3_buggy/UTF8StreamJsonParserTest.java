package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.type.TypeReference;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private IOContext ctxt;
    private BytesToNameCanonicalizer canonicalizer;
    private static final int DEFAULT_MAX_STRING_LEN = 2000000;

    @Before
    public void setUp() {
        ctxt = new IOContext(JsonFactory.DEFAULT_JSON_FACTORY._getBufferRecycler(),
                null, false, false, JsonFactory.DEFAULT_JSON_FACTORY._getSourceRef(null), false);
        canonicalizer = BytesToNameCanonicalizer.createRoot(17);
    }

    @After
    public void tearDown() {
        ctxt = null;
        canonicalizer = null;
    }

    private UTF8StreamJsonParser createParser(String json) throws IOException {
        byte[] data = json.getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        return new UTF8StreamJsonParser(ctxt, 0, in,
                canonicalizer.child(), null, 0, data, 0, data.length, false);
    }

    // ---- getCodec / setCodec ----
    @Test
    public void testGetCodecInitialNull() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        assertNull(p.getCodec());
    }

    @Test
    public void testSetAndGetCodec() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonToken nextToken() { return null; }
            @Override
            public JsonParser getParser() { return null; }
            @Override
            public JsonGenerator getGenerator() { return null; }
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<T> valueTypeRef) { return null; }
            @Override
            public <T> T readValue(JsonParser p, JavaType valueType) { return null; }
            @Override
            public JsonNode readTree(JsonParser p) { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) {}
            @Override
            public JsonNode valueToTree(Object value) { return null; }
            @Override
            public <T extends JsonNode> T valueToTree(Object value, Class<T> nodeType) { return null; }
            @Override
            public void writeTree(JsonGenerator g, JsonNode rootNode) {}
        };
        p.setCodec(codec);
        assertSame(codec, p.getCodec());
    }

    // ---- getInputSource ----
    @Test
    public void testGetInputSourceWithStream() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("{}".getBytes());
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, 0, in,
                canonicalizer.child(), null, 0, "{}".getBytes(), 0, 2, false);
        assertSame(in, p.getInputSource());
    }

    @Test
    public void testGetInputSourceNoStream() {
        assertNull(createParserNoStream());
    }

    private UTF8StreamJsonParser createParserNoStream() {
        return new UTF8StreamJsonParser(ctxt, 0, null,
                canonicalizer.child(), null, 0, new byte[0], 0, 0, false);
    }

    // ---- releaseBuffered ----
    @Test
    public void testReleaseBufferedNoData() throws IOException {
        UTF8StreamJsonParser p = createParserNoStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(0, p.releaseBuffered(out));
    }

    @Test
    public void testReleaseBufferedWithData() throws IOException {
        String json = "{}";
        byte[] data = json.getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, 0, in,
                canonicalizer.child(), null, 0, data, 0, data.length, false);
        p.nextToken(); // parse '{'
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        p.releaseBuffered(out);
    }

    // ---- nextToken with normal value ----
    @Test
    public void testNextTokenNormal() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"a\":1}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenEmptyObject() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
    }

    @Test
    public void testNextTokenArray() throws IOException {
        UTF8StreamJsonParser p = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void testNextTokenUnexpectedChar() throws IOException {
        UTF8StreamJsonParser p = createParser("{");
        p.nextToken();
    }

    // ---- nextFieldName ----
    @Test
    public void testNextFieldNameMatch() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        assertTrue(p.nextFieldName(new SerializedString("abc")));
    }

    @Test
    public void testNextFieldNameNoMatch() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"def\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(new SerializedString("abc")));
    }

    @Test
    public void testNextFieldNameNull() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        assertFalse(p.nextFieldName(null));
    }

    // ---- nextTextValue ----
    @Test
    public void testNextTextValueString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"hello\"");
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        p.nextToken(); // consume value
        assertNull(p.nextTextValue());
    }

    // ---- nextIntValue ----
    @Test
    public void testNextIntValue() throws IOException {
        UTF8StreamJsonParser p = createParser("123");
        p.nextToken();
        assertEquals(123, p.nextIntValue(0));
    }

    @Test
    public void testNextIntValueDefault() throws IOException {
        UTF8StreamJsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals(99, p.nextIntValue(99));
    }

    // ---- nextLongValue ----
    @Test
    public void testNextLongValue() throws IOException {
        UTF8StreamJsonParser p = createParser("1234567890123");
        p.nextToken();
        assertEquals(1234567890123L, p.nextLongValue(0L));
    }

    @Test
    public void testNextLongValueDefault() throws IOException {
        UTF8StreamJsonParser p = createParser("true");
        p.nextToken();
        assertEquals(42L, p.nextLongValue(42L));
    }

    // ---- nextBooleanValue ----
    @Test
    public void testNextBooleanValueTrue() throws IOException {
        UTF8StreamJsonParser p = createParser("true");
        p.nextToken();
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueFalse() throws IOException {
        UTF8StreamJsonParser p = createParser("false");
        p.nextToken();
        assertEquals(Boolean.FALSE, p.nextBooleanValue());
    }

    @Test
    public void testNextBooleanValueDefault() throws IOException {
        UTF8StreamJsonParser p = createParser("null");
        p.nextToken();
        assertNull(p.nextBooleanValue());
    }

    // ---- getText ----
    @Test
    public void testGetTextString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getText());
    }

    @Test
    public void testGetTextNumber() throws IOException {
        UTF8StreamJsonParser p = createParser("42");
        p.nextToken();
        assertEquals("42", p.getText());
    }

    @Test
    public void testGetTextNull() throws IOException {
        UTF8StreamJsonParser p = createParser("null");
        p.nextToken();
        assertEquals("null", p.getText());
    }

    @Test
    public void testGetTextFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        p.nextToken(); // field name
        assertEquals("abc", p.getText());
    }

    @Test
    public void testGetTextIncompleteString() throws IOException {
        String json = "\"abc";
        byte[] data = json.getBytes();
        UTF8StreamJsonParser p = new UTF8StreamJsonParser(ctxt, 0, new ByteArrayInputStream(data),
                canonicalizer.child(), null, 0, data, 0, data.length, false);
        p.nextToken();
        try {
            p.getText();
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    // ---- getValueAsString ----
    @Test
    public void testGetValueAsStringString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"hello\"");
        p.nextToken();
        assertEquals("hello", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringNumber() throws IOException {
        UTF8StreamJsonParser p = createParser("42");
        p.nextToken();
        assertEquals("42", p.getValueAsString());
    }

    @Test
    public void testGetValueAsStringDefault() throws IOException {
        UTF8StreamJsonParser p = createParser("[]");
        p.nextToken();
        assertEquals("def", p.getValueAsString("def"));
    }

    @Test
    public void testGetValueAsStringDefValue() throws IOException {
        UTF8StreamJsonParser p = createParser("{}");
        p.nextToken();
        assertEquals("def", p.getValueAsString("def"));
    }

    // ---- getTextCharacters ----
    @Test
    public void testGetTextCharactersString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"hello\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("hello", new String(chars, 0, p.getTextLength()));
    }

    @Test
    public void testGetTextCharactersFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals("abc", new String(chars, 0, p.getTextLength()));
    }

    @Test
    public void testGetTextCharactersOffset() throws IOException {
        UTF8StreamJsonParser p = createParser("  \"hello\"");
        p.nextToken();
        char[] chars = p.getTextCharacters();
        assertEquals(2, p.getValueOffset());
        assertEquals("hello", new String(chars, 0, p.getTextLength()));
    }

    // ---- getTextLength ----
    @Test
    public void testGetTextLengthFieldName() throws IOException {
        UTF8StreamJsonParser p = createParser("{\"abc\":1}");
        p.nextToken();
        p.nextToken();
        assertEquals(3, p.getTextLength());
    }

    @Test
    public void testGetTextLengthString() throws IOException {
        UTF8StreamJsonParser p = createParser("\"abcdef\"");
        p.nextToken();
        assertEquals(6, p.getTextLength());
    }

    // ---- getTextOffset ----
    @Test
    public void testGetTextOffset() throws IOException {
        UTF8StreamJsonParser p = createParser("\"abc\"");
        p.nextToken();
        assertEquals(0, p.getTextOffset());
    }

    // ---- getBinaryValue ----
    @Test
    public void testGetBinaryValueBase64() throws IOException {
        String json = "\"AAECAw==\"";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertArrayEquals(new byte[]{0, 1, 2, 3}, result);
    }

    @Test(expected = JsonParseException.class)
    public void testGetBinaryValueNotString() throws IOException {
        UTF8StreamJsonParser p = createParser("123");
        p.nextToken();
        p.getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Test
    public void testGetBinaryValueInvalid() throws IOException {
        String json = "\"not valid!\"";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    // ---- readBinaryValue ----
    @Test
    public void testReadBinaryValue() throws IOException {
        String json = "\"AAECAw==\"";
        UTF8StreamJsonParser p = createParser(json);
        p.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertEquals(4, p.readBinaryValue(Base64Variants.getDefaultVariant(), out));
        assertArrayEquals(new byte[]{0, 1, 2, 3}, out.toByteArray());
    }

    @Test(expected = IOException.class)
    public void testReadBinaryValueNotString() throws IOException {
        UTF8StreamJsonParser p = createParser("123");
        p.nextToken();
        p.readBinaryValue(Base64Variants.getDefaultVariant(), new ByteArrayOutputStream());
    }

    // ---- getTokenLocation ----
    @Test
    public void testGetTokenLocationDefault() throws IOException {
        UTF8StreamJsonParser p = createParser(" {}");
        p.nextToken();
        assertNotNull(p.getTokenLocation());
    }

    // ---- growArrayBy ----
    @Test
    public void testGrowArrayByNull() {
        int[] result = UTF8StreamJsonParser.growArrayBy(null, 5);
        assertNotNull(result);
        assertEquals(5, result.length);
    }

    @Test
    public void testGrowArrayByNonZero() {
        int[] arr = new int[3];
        int[] result = UTF8StreamJsonParser.growArrayBy(arr, 2);
        assertNotNull(result);
        assertEquals(5, result.length);
        assertNotSame(arr, result);
    }

    @Test
    public void testGrowArrayByZeroMore() {
        int[] arr = new int[3];
        int[] result = UTF8StreamJsonParser.growArrayBy(arr, 0);
        assertSame(arr, result);
    }
}