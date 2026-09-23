package com.fasterxml.jackson.core.json;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;

public class ReaderBasedJsonParserTest {
    private static final String SIMPLE_JSON = "{\"name\":\"John\",\"age\":30,\"active\":true,\"data\":null}";
    private static final String ARRAY_JSON = "[1,2,3,4,5]";
    private static final String NESTED_JSON = "{\"obj\":{\"inner\":\"value\"},\"arr\":[1,2,{\"x\":\"y\"}]}";
    private static final String EMPTY_JSON = "{}";
    private static final String TRAILING_COMMA_JSON = "{\"a\":1,\"b\":2,}";
    private static final String MISSING_VALUE_JSON = "{\"a\":1,\"b\":,\"c\":3}";
    private static final String SINGLE_QUOTE_JSON = "{'name':'John'}";
    private static final String UNQUOTED_JSON = "{name:John}";
    private static final String COMMENT_JSON = "{/* comment */\"a\":1}";
    private static final String YAML_COMMENT_JSON = "{# comment\n\"a\":1}";
    private static final String NON_NUMERIC_JSON = "[NaN, Infinity, -Infinity]";
    private static final String BASE64_JSON = "{\"data\":\"SGVsbG8gV29ybGQ=\"}";
    private static final String ESCAPED_JSON = "{\"text\":\"line\\nbreak\\ttab\\u0041\"}";
    private static final String LEADING_ZERO_JSON = "{\"num\":0123}";
    private static final String ROOT_ARRAY_JSON = "[true,false,null,\"text\",123,-45.6]";
    private static final String MISSING_ROOT_VALUE_JSON = "[1,2,]";
    
    private ReaderBasedJsonParser createParser(String json) throws Exception {
        return createParser(json, 0);
    }
    
    private ReaderBasedJsonParser createParser(String json, int features) throws Exception {
        return createParser(json, features, true);
    }
    
    private ReaderBasedJsonParser createParser(String json, boolean bufferRecyclable) throws Exception {
        return createParser(json, 0, bufferRecyclable);
    }
    
    private ReaderBasedJsonParser createParser(String json, int features, boolean bufferRecyclable) throws Exception {
        IOContext ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, false, null, null, null);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(json),
                null, symbols, new char[1024], 0, json.length(), bufferRecyclable);
    }
    
    @Test
    public void testNextTokenSimpleObject() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("John", p.getText());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("age", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(30, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("active", p.getCurrentName());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("data", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test
    public void testNextTokenArray() throws Exception {
        ReaderBasedJsonParser p = createParser(ARRAY_JSON);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        for (int i = 1; i <= 5; i++) {
            assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
            assertEquals(i, p.getIntValue());
        }
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test
    public void testNextTokenNested() throws Exception {
        ReaderBasedJsonParser p = createParser(NESTED_JSON);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("obj", p.getCurrentName());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("inner", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("value", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("arr", p.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("x", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("y", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test
    public void testEmptyObject() throws Exception {
        ReaderBasedJsonParser p = createParser(EMPTY_JSON);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test
    public void testTrailingCommaAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(TRAILING_COMMA_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testTrailingCommaNotAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(TRAILING_COMMA_JSON);
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.close();
    }
    
    @Test
    public void testMissingValuesAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(MISSING_VALUE_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("b", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("c", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(3, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testSingleQuotesAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(SINGLE_QUOTE_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("John", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testUnquotedFieldNamesAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(UNQUOTED_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("name", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("John", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testCommentsAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(COMMENT_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testYAMLCommentAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(YAML_COMMENT_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask() |
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("a", p.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testNonNumericNumbersAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(NON_NUMERIC_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NaN, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, p.getDoubleValue(), 0.0);
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }
    
    @Test
    public void testBase64Decode() throws Exception {
        ReaderBasedJsonParser p = createParser(BASE64_JSON);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("data", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        byte[] result = p.getBinaryValue(Base64Variants.getDefaultVariant());
        assertEquals("Hello World", new String(result));
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testEscapedCharacters() throws Exception {
        ReaderBasedJsonParser p = createParser(ESCAPED_JSON);
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals("text", p.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("line\nbreak\ttA", p.getText());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testRootArrayValues() throws Exception {
        ReaderBasedJsonParser p = createParser(ROOT_ARRAY_JSON);
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, p.nextToken());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        assertEquals("text", p.getText());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        assertEquals(-45.6, p.getDoubleValue(), 0.001);
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }
    
    @Test(expected = com.fasterxml.jackson.core.JsonParseException.class)
    public void testLeadingZeroNotAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(LEADING_ZERO_JSON);
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.close();
    }
    
    @Test
    public void testLeadingZeroAllowed() throws Exception {
        ReaderBasedJsonParser p = createParser(LEADING_ZERO_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask());
        assertEquals(JsonToken.START_OBJECT, p.nextToken());
        assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(123, p.getIntValue());
        assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }
    
    @Test
    public void testMissingRootValueInArray() throws Exception {
        ReaderBasedJsonParser p = createParser(MISSING_ROOT_VALUE_JSON,
                com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES.getMask());
        assertEquals(JsonToken.START_ARRAY, p.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(1, p.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        assertEquals(2, p.getIntValue());
        assertEquals(JsonToken.VALUE_NULL, p.nextToken());
        assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }
    
    @Test
    public void testGetCodecAndSetCodec() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        assertNull(p.getCodec());
        ObjectCodec codec = new ObjectCodec() {
            private static final long serialVersionUID = 1L;
            @Override
            public <T> T readValue(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, TypeReference<T> valueTypeRef) throws IOException { return null; }
            @Override
            public <T> T readValue(JsonParser p, ResolvedType valueType) throws IOException { return null; }
            @Override
            public <T> T readTree(JsonParser p) throws IOException { return null; }
            @Override
            public JsonNode createArrayNode() { return null; }
            @Override
            public JsonNode createObjectNode() { return null; }
            @Override
            public JsonParser treeAsTokens(TreeNode n) { return null; }
            @Override
            public <T> T treeToValue(TreeNode n, Class<T> valueType) throws JsonProcessingException { return null; }
            @Override
            public void writeValue(JsonGenerator g, Object value) throws IOException { }
            @Override
            public <T> T readValues(JsonParser p, ResolvedType valueType) throws IOException { return null; }
            @Override
            public <T> T readValues(JsonParser p, Class<T> valueType) throws IOException { return null; }
            @Override
            public <T> T readValues(JsonParser p, TypeReference<T> valueTypeRef) throws IOException { return null; }
            @Override
            public void writeTree(JsonGenerator g, TreeNode rootNode) throws IOException { }
            @Override
            public JsonGenerator createGenerator(OutputStream out) throws IOException { return null; }
            @Override
            public JsonGenerator createGenerator(OutputStream out, JsonEncoding enc) throws IOException { return null; }
            @Override
            public JsonGenerator createGenerator(Writer w) throws IOException { return null; }
            @Override
            public JsonGenerator createGenerator(File f, JsonEncoding enc) throws IOException { return null; }
            @Override
            public JsonFactory getFactory() { return null; }
        };
        p.setCodec(codec);
        assertSame(codec, p.getCodec());
        p.close();
    }
    
    @Test
    public void testGetInputSource() throws Exception {
        StringReader reader = new StringReader(SIMPLE_JSON);
        IOContext ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, false, null, null, null);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, reader,
                null, symbols, new char[1024], 0, SIMPLE_JSON.length(), true);
        assertSame(reader, p.getInputSource());
        p.close();
    }
    
    @Test
    public void testReleaseBuffered() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        StringWriter w = new StringWriter();
        int count = p.releaseBuffered(w);
        assertTrue(count > 0);
        assertTrue(w.toString().length() > 0);
        p.close();
    }
    
    @Test
    public void testReleaseBufferedEmpty() throws Exception {
        ReaderBasedJsonParser p = createParser(EMPTY_JSON);
        StringWriter w = new StringWriter();
        assertEquals(0, p.releaseBuffered(w));
        assertEquals("", w.toString());
        p.close();
    }
    
    @Test
    public void testGetTextVariants() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        p.nextToken();
        assertNull(p.getText());
        p.nextToken();
        assertEquals("John", p.getText());
        assertEquals("John", p.getValueAsString());
        assertEquals("default", p.getValueAsString("default"));
        StringWriter w = new StringWriter();
        assertEquals(4, p.getText(w));
        assertEquals("John", w.toString());
        p.close();
    }
    
    @Test
    public void testGetTextCharacters() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        p.nextToken();
        assertNull(p.getTextCharacters());
        p.nextToken();
        assertNotNull(p.getTextCharacters());
        assertEquals(4, p.getTextLength());
        assertEquals(0, p.getTextOffset());
        p.close();
    }
    
    @Test
    public void testNextFieldNameWithSerializableString() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        SerializableString ss = new SerializableString() {
            private static final long serialVersionUID = 1L;
            @Override
            public String getValue() { return "name"; }
            @Override
            public int charLength() { return 4; }
            @Override
            public char[] asQuotedChars() { return "\"name\"".toCharArray(); }
            @Override
            public byte[] asUnquotedUTF8() { return null; }
            @Override
            public byte[] asQuotedUTF8() { return null; }
            @Override
            public int appendQuotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendQuoted(char[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquotedUTF8(byte[] buffer, int offset) { return 0; }
            @Override
            public int appendUnquoted(char[] buffer, int offset) { return 0; }
            @Override
            public int putQuotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int putUnquotedUTF8(OutputStream out) throws IOException { return 0; }
            @Override
            public int putQuoted(Writer w) throws IOException { return 0; }
            @Override
            public int putUnquoted(Writer w) throws IOException { return 0; }
        };
        assertTrue(p.nextFieldName(ss));
        assertFalse(p.nextFieldName(ss));
        p.close();
    }
    
    @Test
    public void testNextTextValue() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        assertEquals("John", p.nextTextValue());
        assertNull(p.nextTextValue());
        p.close();
    }
    
    @Test
    public void testNextIntValue() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        assertEquals(30, p.nextIntValue(0));
        assertEquals(0, p.nextIntValue(0));
        p.close();
    }
    
    @Test
    public void testNextLongValue() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        assertEquals(30L, p.nextLongValue(0L));
        assertEquals(0L, p.nextLongValue(0L));
        p.close();
    }
    
    @Test
    public void testNextBooleanValue() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        assertNull(p.nextBooleanValue());
        p.nextTextValue();
        assertNull(p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        assertEquals(Boolean.TRUE, p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        assertNull(p.nextBooleanValue());
        p.close();
    }
    
    @Test
    public void testGetTokenLocation() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        JsonLocation loc = p.getTokenLocation();
        assertNotNull(loc);
        assertTrue(loc.getCharOffset() >= 0);
        loc = p.getCurrentLocation();
        assertNotNull(loc);
        p.close();
    }
    
    @Test
    public void testFinishToken() throws Exception {
        ReaderBasedJsonParser p = createParser(SIMPLE_JSON);
        p.nextToken();
        p.nextToken();
        p.nextToken();
        p.finishToken();
        p.close();
    }
    
    @Test
    public void testEmptyReader() throws Exception {
        ReaderBasedJsonParser p = createParser("");
        assertNull(p.nextToken());
        p.close();
    }
    
    @Test(expected = IOException.class)
    public void testReaderReturningZero() throws Exception {
        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            @Override
            public void close() throws IOException {}
        };
        IOContext ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, false, null, null, null);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, reader,
                null, symbols, new char[1024], 0, 0, true);
        p.nextToken();
        p.close();
    }
    
    @Test
    public void testCloseAutoClose() throws Exception {
        StringReader reader = new StringReader(SIMPLE_JSON);
        IOContext ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, false, null, null, null);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, reader,
                null, symbols, new char[1024], 0, SIMPLE_JSON.length(), true);
        p.nextToken();
        p.close();
        reader.close();
    }
    
    @Test
    public void testCloseNoAutoClose() throws Exception {
        StringReader reader = new StringReader(SIMPLE_JSON);
        IOContext ctxt = new IOContext(JsonFactory.Feature.collectDefaults(),
                null, null, false, null, null, null);
        CharsToNameCanonicalizer symbols = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, reader,
                null, symbols, new char[1024], 0, SIMPLE_JSON.length(), false);
        p.nextToken();
        p.close();
    }
}