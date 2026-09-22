package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(String json) throws Exception {
        return createParser(json.getBytes("UTF-8"), 0);
    }

    private UTF8StreamJsonParser createParser(String json, int features) throws Exception {
        return createParser(json.getBytes("UTF-8"), features);
    }

    private UTF8StreamJsonParser createParser(byte[] bytes, int features) throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test-source", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        byte[] buf = new byte[Math.max(bytes.length, 16)];
        System.arraycopy(bytes, 0, buf, 0, bytes.length);
        return new UTF8StreamJsonParser(ctxt, features, new ByteArrayInputStream(new byte[0]), null, sym, buf, 0, bytes.length, false);
    }

    private UTF8StreamJsonParser createStreamingParser(byte[] streamBytes, int bufferSize, int features) throws Exception {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test-stream", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        byte[] buf = new byte[bufferSize];
        InputStream in = new ByteArrayInputStream(streamBytes);
        return new UTF8StreamJsonParser(ctxt, features, in, null, sym, buf, 0, 0, false);
    }

    @Test
    public void getCodec_givenCodecSet_shouldReturnSameCodec() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        assertNull(parser.getCodec());
        parser.setCodec(null);
        assertNull(parser.getCodec());
        parser.close();
    }

    @Test
    public void getInputSource_givenInputStream_shouldReturnStream() throws Exception {
        byte[] bytes = "{}".getBytes("UTF-8");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, bais, null, sym, new byte[16], 0, 0, false);
        assertSame(bais, parser.getInputSource());
        parser.close();
    }

    @Test
    public void releaseBuffered_givenBufferedData_shouldWriteToOutputStream() throws Exception {
        byte[] bytes = "12345".getBytes("UTF-8");
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot().makeChild(0);
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, sym, bytes, 0, bytes.length, false);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int released = parser.releaseBuffered(out);
        assertEquals(5, released);
        assertArrayEquals(bytes, out.toByteArray());

        ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        int releasedAgain = parser.releaseBuffered(out2);
        assertEquals(0, releasedAgain);
        parser.close();
    }

    @Test
    public void nextToken_givenSimpleObject_shouldParseCorrectTokens() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"key\":\"value\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("key", parser.getCurrentName());
        assertEquals("key", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("value", parser.getText());
        assertEquals("value", parser.getValueAsString());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenSimpleArray_shouldParseCorrectTokens() throws Exception {
        UTF8StreamJsonParser parser = createParser("[true, false, null, 123, -456, 7.89]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertTrue(parser.getBooleanValue());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertFalse(parser.getBooleanValue());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(-456, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(7.89, parser.getDoubleValue(), 0.001);
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenNestedStructures_shouldParseCorrectly() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\":[1,{\"b\":2}]}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("b", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(2, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextFieldName_givenMatchingSerializableString_shouldReturnTrue() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"John\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        SerializedString str = new SerializedString("name");
        assertTrue(parser.nextFieldName(str));
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("John", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextFieldName_givenNonMatchingSerializableString_shouldReturnFalse() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"age\":30}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        SerializedString str = new SerializedString("name");
        assertFalse(parser.nextFieldName(str));
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        assertEquals("age", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(30, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextFieldName_noArg_shouldReturnNextFieldName() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"first\":\"A\",\"second\":\"B\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("first", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
        assertEquals("second", parser.nextFieldName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("B", parser.getText());
        assertNull(parser.nextFieldName());
        assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        parser.close();
    }

    @Test
    public void nextTextValue_givenString_shouldReturnStringValue() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"k1\":\"v1\",\"k2\":123}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("v1", parser.nextTextValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextTextValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getCurrentToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextIntValue_givenIntField_shouldReturnInt() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"n\":42,\"s\":\"str\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(42, parser.nextIntValue(0));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(-1, parser.nextIntValue(-1));
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextLongValue_givenLongField_shouldReturnLong() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"l\":9999999999,\"s\":\"str\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(9999999999L, parser.nextLongValue(0L));
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(-5L, parser.nextLongValue(-5L));
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextBooleanValue_givenBoolField_shouldReturnBoolean() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"b1\":true,\"b2\":false,\"s\":\"str\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertNull(parser.nextBooleanValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void getTextCharacters_andOffsets_givenVariousTokens_shouldReturnAccurateInfo() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"key\":\"hello\", \"num\": 12345}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertNotNull(parser.getTextCharacters());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        char[] chars = parser.getTextCharacters();
        assertNotNull(chars);
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
        assertEquals("key", new String(chars, 0, 3));

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        chars = parser.getTextCharacters();
        assertEquals("hello", new String(chars, parser.getTextOffset(), parser.getTextLength()));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        chars = parser.getTextCharacters();
        assertEquals("12345", new String(chars, parser.getTextOffset(), parser.getTextLength()));
        parser.close();
    }

    @Test
    public void getValueAsString_withDefault_shouldReturnExpected() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"val\", \"b\": 100}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals("default", parser.getValueAsString("default"));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getValueAsString("default"));

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("val", parser.getValueAsString("default"));

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals("100", parser.getValueAsString("default"));
        parser.close();
    }

    @Test
    public void getValueAsInt_givenTokens_shouldConvertOrReturnDefault() throws Exception {
        UTF8StreamJsonParser parser = createParser("[55, 3.14, \"notNum\"]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(99, parser.getValueAsInt(99));

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(55, parser.getValueAsInt());
        assertEquals(55, parser.getValueAsInt(0));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(3, parser.getValueAsInt());

        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(77, parser.getValueAsInt(77));
        parser.close();
    }

    @Test
    public void namesOfVariousLengths_shouldBeHandledCorrectly() throws Exception {
        String json = "{\"a\":1, \"ab\":2, \"abc\":3, \"abcd\":4, \"abcde\":5, \"abcdefgh\":8, \"abcdefghijklm\":13, \"veryLongFieldNameThatSpansMultipleQuadsInParser\":42}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        String[] expectedNames = new String[]{
            "a", "ab", "abc", "abcd", "abcde", "abcdefgh", "abcdefghijklm", "veryLongFieldNameThatSpansMultipleQuadsInParser"
        };
        int[] expectedValues = new int[]{1, 2, 3, 4, 5, 8, 13, 42};

        for (int i = 0; i < expectedNames.length; i++) {
            assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
            assertEquals(expectedNames[i], parser.getCurrentName());
            assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
            assertEquals(expectedValues[i], parser.getIntValue());
        }
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void stringEscapes_shouldBeDecodedCorrectly() throws Exception {
        String json = "[\"\\\"\", \"\\\\\", \"\\/\", \"\\b\", \"\\f\", \"\\n\", \"\\r\", \"\\t\", \"\\u0041\"]";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\"", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\\", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("/", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\b", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\f", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\n", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\r", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\t", parser.getText());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void utf8MultibyteCharacters_inStringAndFieldName_shouldDecodeCorrectly() throws Exception {
        String json = "{\"café\":\"\\u00E9\", \"привет\":\"мир\", \"\uD83D\uDE00\":\"\uD83D\uDE03\"}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("café", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("é", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("привет", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("мир", parser.getText());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("\uD83D\uDE00", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\uD83D\uDE03", parser.getText());

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void singleQuotedStringAndField_whenAllowed_shouldParseCorrectly() throws Exception {
        int feat = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        String json = "{'name':'O\\'Reilly'}";
        UTF8StreamJsonParser parser = createParser(json, feat);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("name", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("O'Reilly", parser.getText());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void unquotedFieldName_whenAllowed_shouldParseCorrectly() throws Exception {
        int feat = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String json = "{foo:123, bar_baz:456}";
        UTF8StreamJsonParser parser = createParser(json, feat);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("foo", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("bar_baz", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(456, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void comments_whenAllowed_shouldBeSkipped() throws Exception {
        int feat = JsonParser.Feature.ALLOW_COMMENTS.getMask() | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String json = "// comment 1\n/* comment 2 */ {\n# YAML comment\n\"a\": 1\n/* multi\nline */ }";
        UTF8StreamJsonParser parser = createParser(json, feat);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void base64_getBinaryValue_andReadBinaryValue_shouldSucceed() throws Exception {
        String base64Data = "SGVsbG8gV29ybGQ="; // "Hello World"
        String json = "[\"" + base64Data + "\"]";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int readCount = parser.readBinaryValue(Base64Variants.MIME, out);
        assertEquals(11, readCount);
        assertEquals("Hello World", new String(out.toByteArray(), "UTF-8"));

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void base64_getBinaryValue_completedString_shouldDecode() throws Exception {
        String base64Data = "VGVzdA=="; // "Test"
        String json = "[\"" + base64Data + "\"]";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(base64Data, parser.getText());

        byte[] b = parser.getBinaryValue(Base64Variants.MIME);
        assertEquals("Test", new String(b, "UTF-8"));
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void floatNumbers_variousFormats_shouldParseCorrectly() throws Exception {
        String json = "[0.5, -0.25, 1e3, 2E-2, -3.5e+2, 0.0]";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.5, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-0.25, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(1000.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.02, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-350.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(0.0, parser.getDoubleValue(), 0.0001);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void nonNumericNumbers_whenAllowed_shouldParseCorrectly() throws Exception {
        int feat = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String json = "[NaN, Infinity, -Infinity, +INF, -INF]";
        UTF8StreamJsonParser parser = createParser(json, feat);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertTrue(Double.isNaN(parser.getDoubleValue()));

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void location_tracking_shouldBeAccurate() throws Exception {
        String json = "{\n  \"field\": 1\n}";
        UTF8StreamJsonParser parser = createParser(json);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        JsonLocation loc = parser.getTokenLocation();
        assertEquals(1, loc.getLineNr());

        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        JsonLocation nameLoc = parser.getTokenLocation();
        assertEquals(2, nameLoc.getLineNr());

        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        JsonLocation currentLoc = parser.getCurrentLocation();
        assertNotNull(currentLoc);

        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void streamingChunks_loadMore_shouldHandleSplitTokens() throws Exception {
        byte[] data = "{\"longString\":\"abcdefghijklmnopqrstuvwxyz0123456789\", \"num\": 12345}".getBytes("UTF-8");
        UTF8StreamJsonParser parser = createStreamingParser(data, 8, 0);

        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("longString", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("abcdefghijklmnopqrstuvwxyz0123456789", parser.getText());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("num", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(12345, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void growArrayBy_utility_shouldWorkAsExpected() {
        int[] original = new int[]{1, 2, 3};
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 2);
        assertEquals(5, grown.length);
        assertEquals(1, grown[0]);
        assertEquals(2, grown[1]);
        assertEquals(3, grown[2]);
        assertEquals(0, grown[3]);
        assertEquals(0, grown[4]);

        int[] fromNull = UTF8StreamJsonParser.growArrayBy(null, 4);
        assertNotNull(fromNull);
        assertEquals(4, fromNull.length);
    }

    @Test
    public void mismatchedEndMarker_inArray_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("[1, 2}");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for mismatched end marker");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("mismatched"));
        }
        parser.close();
    }

    @Test
    public void mismatchedEndMarker_inObject_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"a\": 1]");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for mismatched end marker");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("mismatched"));
        }
        parser.close();
    }

    @Test
    public void leadingZero_whenNotAllowed_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("[0123]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for leading zero");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Leading zeroes not allowed"));
        }
        parser.close();
    }

    @Test
    public void leadingZero_whenAllowed_shouldSucceed() throws Exception {
        int feat = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        UTF8StreamJsonParser parser = createParser("[0123]", feat);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(123, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void unrecognizedToken_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("[unknownToken]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for unrecognized token");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Unrecognized token"));
        }
        parser.close();
    }

    @Test
    public void unquotedFieldName_whenNotAllowed_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("{name: 1}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for unquoted field name");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting double-quote"));
        }
        parser.close();
    }

    @Test
    public void comments_whenNotAllowed_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("// comment\n{}");
        try {
            parser.nextToken();
            fail("Expected JsonParseException for comment when not enabled");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("maybe a (non-standard) comment?"));
        }
        parser.close();
    }

    @Test
    public void unexpectedEndOfInput_inString_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("\"unclosed string");
        try {
            parser.nextToken();
            fail("Expected JsonParseException for unclosed string");
        } catch (JsonParseException e) {
            // expected EOF
        }
        parser.close();
    }

    @Test
    public void unexpectedEndOfInput_inFieldName_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"unclosed");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for unclosed field name");
        } catch (JsonParseException e) {
            // expected EOF
        }
        parser.close();
    }

    @Test
    public void invalidHexEscape_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("[\"\\u12G4\"]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for invalid hex digit");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("expected a hex-digit"));
        }
        parser.close();
    }

    @Test
    public void missingColon_betweenFieldAndValue_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("{\"key\" \"val\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for missing colon");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting a colon"));
        }
        parser.close();
    }

    @Test
    public void missingComma_betweenEntries_shouldThrowException() throws Exception {
        UTF8StreamJsonParser parser = createParser("[1 2]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.nextToken();
            fail("Expected JsonParseException for missing comma");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("was expecting comma"));
        }
        parser.close();
    }

    @Test
    public void close_multipleCalls_shouldBeIdempotent() throws Exception {
        UTF8StreamJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.close();
        assertTrue(parser.isClosed());
        parser.close();
        assertTrue(parser.isClosed());
    }
}