package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private IOContext ctxt;
    private ByteQuadsCanonicalizer canonicalizer;
    private StringBuilder sb;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        sb = new StringBuilder();
        out = new ByteArrayOutputStream();
        ctxt = new IOContext(JsonFactory.DEFAULT_QUOTE_CHAR, "test", new ByteArrayOutputStream().toByteArray(), false, true);
        canonicalizer = ByteQuadsCanonicalizer.createRoot(64);
    }

    @After
    public void tearDown() throws Exception {
        ctxt.getSourceReference().release();
    }

    private UTF8StreamJsonParser createParser(String json, int features) throws IOException {
        InputStream in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        return new UTF8StreamJsonParser(ctxt, features, in, null, canonicalizer, null, 0);
    }

    @Test
    public void testGetCodecAndSetCodec() throws IOException {
        ObjectCodec codec = new ObjectCodec() {
            @Override
            public JsonParser getParser(JsonFactory factory) { return null; }
            @Override
            public JsonParser getParser(String json) { return null; }
            @Override
            public JsonParser getParser(File file) { return null; }
            @Override
            public JsonParser getParser(InputStream in) { return null; }
            @Override
            public JsonParser getParser(JsonParser parser) { return null; }
            @Override
            public JsonGenerator getGenerator(JsonFactory factory, OutputStream out) { return null; }
            @Override
            public JsonGenerator getGenerator(JsonFactory factory, Writer out) { return null; }
            @Override
            public JsonGenerator getGenerator(JsonFactory factory, File file) { return null; }
        };
        UTF8StreamJsonParser parser = createParser("{}", 0);
        assertNull(parser.getCodec());
        parser.setCodec(codec);
        assertSame(codec, parser.getCodec());
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        byte[] data = "{\"key\":\"value\"}".getBytes("UTF-8");
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, canonicalizer, null, 0);
        assertEquals(14, parser.releaseBuffered(out));
        parser.close();
    }

    @Test
    public void testGetInputSource() throws IOException {
        InputStream in = new ByteArrayInputStream("{}".getBytes("UTF-8"));
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, canonicalizer, null, 0);
        assertSame(in, parser.getInputSource());
        parser.close();
    }

    @Test
    public void testGetTextValueString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"test\"}", 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("test", parser.getText());
        parser.close();
    }

    @Test
    public void testGetValueAsStringWithNullDef() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":123}", 0);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("123", parser.getValueAsString());
        parser.close();
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abc\":\"def\"}", 0);
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertTrue(chars.length >= 3);
        parser.close();
    }

    @Test(expected = IOException.class)
    public void testGetBinaryValueInvalidToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":123}", 0);
        parser.nextToken();
        parser.nextToken();
        parser.getValueAsString();
        parser.getBinaryValue(Base64Variants.MIME_NO_LINEFEEDS);
        parser.close();
    }

    @Test
    public void testNextToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]", 0);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"foo\":1}", 0);
        SerializableString str = new SerializableString() {
            @Override
            public String getValue() { return "foo"; }
            @Override
            public int charLength() { return 3; }
            @Override
            public char[] asQuotedChars() { return "foo".toCharArray(); }
            @Override
            public byte[] asUnquotedUTF8() { return new byte[]{102, 111, 111}; }
            @Override
            public byte[] asQuotedUTF8() { return asUnquotedUTF8(); }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int start) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int start) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int start) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int start) { return 0; }
            @Override
            public int writeQuotedUTF8(OutputStream out) { return 0; }
            @Override
            public int writeUnquotedUTF8(OutputStream out) { return 0; }
            @Override
            public int writeQuoted(Writer writer) { return 0; }
            @Override
            public int writeUnquoted(Writer writer) { return 0; }
            @Override
            public int putQuotedUTF8(byte[] buffer, int start) { return 0; }
            @Override
            public int putUnquotedUTF8(byte[] buffer, int start) { return 0; }
        };
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertTrue(parser.nextFieldName(str));
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTextValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"s\":\"text\"}", 0);
        parser.nextToken();
        parser.nextToken();
        parser.nextTextValue();
        assertEquals("text", parser.nextTextValue());
        parser.close();
    }

    @Test
    public void testNextIntValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":42}", 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(42, parser.nextIntValue(-1));
        parser.close();
    }

    @Test
    public void testNextLongValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":9223372036854775807L}", 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(-1, parser.nextLongValue(-1));
        parser.close();
    }

    @Test
    public void testNextBooleanValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":true}", 0);
        parser.nextToken();
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testClose() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}", 0);
        parser.close();
        assertTrue(parser.isClosed());
        parser.close();
    }

    @Test
    public void testGrowArrayBy() {
        assertArrayEquals(new int[]{1, 2, 3}, UTF8StreamJsonParser.growArrayBy(new int[]{1}, 2));
        assertArrayEquals(new int[]{0, 0}, UTF8StreamJsonParser.growArrayBy(null, 2));
    }
}