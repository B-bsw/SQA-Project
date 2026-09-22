package com.fasterxml.jackson.core.json;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class UTF8StreamJsonParserTest {

    private UTF8StreamJsonParser createParser(byte[] input) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        return new UTF8StreamJsonParser(ctxt, 0, null, null, sym, input, 0, input.length, false);
    }

    private UTF8StreamJsonParser createParser(String json) {
        try {
            return createParser(json.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private UTF8StreamJsonParser createStreamParser(byte[] data, int bufSize) {
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        byte[] buf = new byte[bufSize];
        return new UTF8StreamJsonParser(ctxt, 0, in, null, sym, buf, 0, 0, true);
    }

    private UTF8StreamJsonParser createStreamParser(String json, int bufSize) {
        try {
            return createStreamParser(json.getBytes("UTF-8"), bufSize);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getCodec_givenCodecSet_shouldReturnSameCodec() {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{}");
        ObjectCodec mockCodec = null;

        // Act
        parser.setCodec(mockCodec);
        ObjectCodec result = parser.getCodec();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void releaseBuffered_givenBufferedBytes_shouldWriteToOutputStream() throws IOException {
        // Arrange
        byte[] data = new byte[] { 1, 2, 3, 4, 5 };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, sym, data, 1, 4, false);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        int released = parser.releaseBuffered(out);

        // Assert
        Assert.assertEquals(3, released);
        Assert.assertArrayEquals(new byte[] { 2, 3, 4 }, out.toByteArray());

        // Test empty release
        int releasedAgain = parser.releaseBuffered(out);
        Assert.assertEquals(0, releasedAgain);
    }

    @Test
    public void getInputSource_givenInputStream_shouldReturnSameSource() {
        // Arrange
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, bais, null, sym, new byte[10], 0, 0, false);

        // Act
        Object source = parser.getInputSource();

        // Assert
        Assert.assertSame(bais, source);
    }

    @Test
    public void loadMore_givenZeroBufferLength_shouldReturnFalse() throws IOException {
        // Arrange
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { 1 });
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, bais, null, sym, new byte[0], 0, 0, false);

        // Act
        boolean loaded = parser.loadMore();

        // Assert
        Assert.assertFalse(loaded);
    }

    @Test
    public void loadMore_givenStreamReturningZero_shouldThrowIOException() {
        // Arrange
        InputStream zeroStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                return 0;
            }
        };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, zeroStream, null, sym, new byte[10], 0, 0, false);

        // Act & Assert
        try {
            parser.loadMore();
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("returned 0 characters") >= 0);
        }
    }

    @Test
    public void _loadToHaveAtLeast_givenNullStream_shouldReturnFalse() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("[]");

        // Act
        boolean result = parser._loadToHaveAtLeast(5);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void _loadToHaveAtLeast_givenValidStream_shouldFillBuffer() throws IOException {
        // Arrange
        byte[] data = new byte[] { 'a', 'b', 'c', 'd', 'e' };
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] buf = new byte[10];
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, in, null, sym, buf, 0, 0, false);

        // Act
        boolean result = parser._loadToHaveAtLeast(3);

        // Assert
        Assert.assertTrue(result);
        Assert.assertTrue(parser._inputEnd >= 3);
    }

    @Test
    public void _closeInput_givenAutoCloseSourceEnabled_shouldCloseStream() throws IOException {
        // Arrange
        final boolean[] closed = new boolean[] { false };
        InputStream in = new ByteArrayInputStream(new byte[] { 1 }) {
            @Override
            public void close() throws IOException {
                closed[0] = true;
                super.close();
            }
        };
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, Feature.AUTO_CLOSE_SOURCE.getMask(), in, null, sym, new byte[10], 0, 0, false);

        // Act
        parser._closeInput();

        // Assert
        Assert.assertTrue(closed[0]);
        Assert.assertNull(parser._inputStream);
    }

    @Test
    public void _releaseBuffers_givenBufferRecyclable_shouldReleaseIOBuffer() throws IOException {
        // Arrange
        BufferRecycler recycler = new BufferRecycler();
        IOContext ctxt = new IOContext(recycler, "test", false);
        ByteQuadsCanonicalizer sym = ByteQuadsCanonicalizer.createRoot();
        byte[] buf = ctxt.allocReadIOBuffer();
        UTF8StreamJsonParser parser = new UTF8StreamJsonParser(ctxt, 0, null, null, sym, buf, 0, 0, true);

        // Act
        parser._releaseBuffers();

        // Assert
        Assert.assertSame(com.fasterxml.jackson.core.util.ByteArrayBuilder.NO_BYTES, parser._inputBuffer);
    }

    @Test
    public void nextToken_givenSimpleTypes_shouldParseCorrectly() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser(" [ true, false, null, \"hello\", 123, -456, 12.34, -0.5e+2 ] ");

        // Act & Assert
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("hello", parser.getText());
        Assert.assertEquals("hello", parser.getValueAsString());
        Assert.assertEquals("hello", parser.getValueAsString("default"));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getValueAsInt());
        Assert.assertEquals(123, parser.getValueAsInt(99));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(-456, parser.getValueAsInt());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(12, parser.getValueAsInt());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void nextToken_givenObjectWithVariousNames_shouldParseTokens() throws IOException {
        // Arrange
        String json = "{\"\":0, \"a\":1, \"abcd\":2, \"abcdefgh\":3, \"abcdefghijkl\":4, \"abcdefghijklmnop\":5}";
        UTF8StreamJsonParser parser = createParser(json);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("abcd", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("abcdefgh", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("abcdefghijkl", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("abcdefghijklmnop", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void nextFieldName_givenMatchingAndMismatching_shouldReturnExpected() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{\"first\":1, \"second\":\"val\", \"third\":true}");
        SerializedString first = new SerializedString("first");
        SerializedString wrong = new SerializedString("wrong");
        SerializedString third = new SerializedString("third");

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertTrue(parser.nextFieldName(first));
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertFalse(parser.nextFieldName(wrong));
        Assert.assertEquals("second", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        Assert.assertTrue(parser.nextFieldName(third));
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());

        Assert.assertFalse(parser.nextFieldName(first));
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void nextFieldName_stringVariant_shouldReturnNameOrNull() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{\"f1\":\"v1\", \"f2\":2, \"f3\":false, \"f4\":null, \"f5\":[1], \"f6\":{\"a\":1}}");

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals("f1", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        Assert.assertEquals("f2", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertEquals("f3", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());

        Assert.assertEquals("f4", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());

        Assert.assertEquals("f5", parser.nextFieldName());
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());

        Assert.assertEquals("f6", parser.nextFieldName());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals("a", parser.nextFieldName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());

        Assert.assertNull(parser.nextFieldName());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        Assert.assertNull(parser.nextFieldName());
    }

    @Test
    public void nextValueHelpers_shouldParseDirectly() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{\"t\":\"txt\", \"i\":42, \"l\":9999999999, \"b\":true, \"bf\":false, \"arr\":[]}");

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals("t", parser.nextFieldName());
        Assert.assertEquals("txt", parser.nextTextValue());

        Assert.assertEquals("i", parser.nextFieldName());
        Assert.assertEquals(42, parser.nextIntValue(0));

        Assert.assertEquals("l", parser.nextFieldName());
        Assert.assertEquals(9999999999L, parser.nextLongValue(0L));

        Assert.assertEquals("b", parser.nextFieldName());
        Assert.assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        Assert.assertEquals("bf", parser.nextFieldName());
        Assert.assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        Assert.assertEquals("arr", parser.nextFieldName());
        Assert.assertNull(parser.nextTextValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void getTextCharacters_andOffsets_shouldReturnValidData() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{\"key\":\"value\", \"num\":12345}");

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        char[] chars = parser.getTextCharacters();
        Assert.assertNotNull(chars);
        Assert.assertEquals("key", new String(chars, 0, parser.getTextLength()));
        Assert.assertEquals(0, parser.getTextOffset());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        chars = parser.getTextCharacters();
        Assert.assertEquals("value", new String(chars, parser.getTextOffset(), parser.getTextLength()));

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        chars = parser.getTextCharacters();
        Assert.assertEquals("12345", new String(chars, parser.getTextOffset(), parser.getTextLength()));

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNotNull(parser.getTextCharacters());
    }

    @Test
    public void getBinaryValue_givenBase64String_shouldDecodeProperly() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\"SGVsbG8gV29ybGQ=\"");

        // Act
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        byte[] decoded = parser.getBinaryValue(Base64Variants.MIME);

        // Assert
        Assert.assertEquals("Hello World", new String(decoded, "UTF-8"));

        // Second call when _tokenIncomplete is false
        byte[] cached = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertSame(decoded, cached);
    }

    @Test
    public void readBinaryValue_givenOutputStream_shouldStreamBytes() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\"SGVsbG8gV29ybGQ=\"");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        int count = parser.readBinaryValue(Base64Variants.MIME, out);

        // Assert
        Assert.assertEquals(11, count);
        Assert.assertEquals("Hello World", new String(out.toByteArray(), "UTF-8"));
    }

    @Test
    public void readBinaryValue_whenAlreadyDecoded_shouldWriteCached() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\"SGVsbG8=\"");
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Act
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        parser.getText(); // completes token
        int count = parser.readBinaryValue(Base64Variants.MIME, out);

        // Assert
        Assert.assertEquals(5, count);
        Assert.assertEquals("Hello", new String(out.toByteArray(), "UTF-8"));
    }

    @Test
    public void getBinaryValue_givenInvalidToken_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("12345");

        // Act & Assert
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        try {
            parser.getBinaryValue(Base64Variants.MIME);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("not VALUE_STRING") >= 0);
        }
    }

    @Test
    public void stringEscapes_allStandardEscapes_shouldDecodeCorrectly() throws IOException {
        // Arrange
        String json = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041\"";
        UTF8StreamJsonParser parser = createParser(json);

        // Act
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        String text = parser.getText();

        // Assert
        Assert.assertEquals("\" \\ / \b \f \n \r \t A", text);
    }

    @Test
    public void utf8Sequences_inStringAndNames_shouldDecodeProperly() throws IOException {
        // Arrange: 2-byte (¢ = \u00a2: C2 A2), 3-byte (€ = \u20ac: E2 82 AC), 4-byte (𐍈 = \uD800\uDF48: F0 90 8D 88)
        byte[] utf8Json = new byte[] {
            (byte)'{', (byte)'"', (byte)0xC2, (byte)0xA2, (byte)'"', (byte)':',
            (byte)'"', (byte)0xE2, (byte)0x82, (byte)0xAC, (byte)0xF0, (byte)0x90, (byte)0x8D, (byte)0x88, (byte)'"',
            (byte)'}'
        };
        UTF8StreamJsonParser parser = createParser(utf8Json);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("\u00a2", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\u20ac\uD800\uDF48", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void singleQuote_givenFeatureEnabled_shouldParseStringAndField() throws IOException {
        // Arrange
        String json = "{'my_field': 'single quoted value \\' with escape'}";
        UTF8StreamJsonParser parser = createParser(json);
        parser.enable(Feature.ALLOW_SINGLE_QUOTES);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("my_field", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("single quoted value ' with escape", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void unquotedFieldName_givenFeatureEnabled_shouldParseFieldName() throws IOException {
        // Arrange
        String json = "{ unquotedField : 123 }";
        UTF8StreamJsonParser parser = createParser(json);
        parser.enable(Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("unquotedField", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
    }

    @Test
    public void comments_givenFeatureEnabled_shouldSkipComments() throws IOException {
        // Arrange
        String json = "/* c-comment */ {\n // line comment\n \"a\": /* inline */ 1 # yaml comment\n }";
        UTF8StreamJsonParser parser = createParser(json);
        parser.enable(Feature.ALLOW_COMMENTS);
        parser.enable(Feature.ALLOW_YAML_COMMENTS);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("a", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void nonNumericNumbers_givenFeatureEnabled_shouldParseNaNAndInfinity() throws IOException {
        // Arrange
        String json = "[ NaN, Infinity, +Infinity, -Infinity, +INF, -INF ]";
        UTF8StreamJsonParser parser = createParser(json);
        parser.enable(Feature.ALLOW_NON_NUMERIC_NUMBERS);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertTrue(Double.isNaN(parser.getDoubleValue()));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void leadingZeroes_givenFeatureEnabled_shouldParse() throws IOException {
        // Arrange
        String json = "[ 0123, 0005 ]";
        UTF8StreamJsonParser parser = createParser(json);
        parser.enable(Feature.ALLOW_NUMERIC_LEADING_ZEROS);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(5, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test(expected = JsonParseException.class)
    public void leadingZeroes_givenFeatureDisabled_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("[ 0123 ]");

        // Act
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void mismatchedArrayClosing_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("}");

        // Act
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void mismatchedObjectClosing_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("]");

        // Act
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void missingComma_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("[1 2]");

        // Act
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void unquotedFieldName_givenFeatureDisabled_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("{ field: 1 }");

        // Act
        parser.nextToken();
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void comments_givenFeatureDisabled_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("/* comment */ 123");

        // Act
        parser.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void invalidEscapeSequence_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\"\\u12G4\"");

        // Act
        parser.nextToken();
        parser.getText();
    }

    @Test(expected = JsonParseException.class)
    public void unclosedString_shouldThrowException() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\"unclosed");

        // Act
        parser.nextToken();
        parser.getText();
    }

    @Test
    public void skipString_givenIncompleteToken_shouldSkip() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("[\"skip me\", 123]");

        // Act
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        // nextToken will trigger _skipString() because _tokenIncomplete is true
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void locations_getTokenLocationAndCurrentLocation_shouldReturnValidLocations() throws IOException {
        // Arrange
        UTF8StreamJsonParser parser = createParser("\n  123");

        // Act
        parser.nextToken();
        JsonLocation tokenLoc = parser.getTokenLocation();
        JsonLocation currLoc = parser.getCurrentLocation();

        // Assert
        Assert.assertEquals(2, tokenLoc.getLineNr());
        Assert.assertTrue(tokenLoc.getColumnNr() >= 1);
        Assert.assertEquals(2, currLoc.getLineNr());
    }

    @Test
    public void streamingChunkedInput_shouldParseAcrossBufferBoundaries() throws IOException {
        // Arrange
        String json = "{\"longString\":\"abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJK\", \"number\":987654321}";
        UTF8StreamJsonParser parser = createStreamParser(json, 8); // Very small 8-byte buffer to force loadMore

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("longString", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJK", parser.getText());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("number", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(987654321, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
    }

    @Test
    public void growArrayBy_givenArray_shouldGrowProperly() {
        // Arrange
        int[] original = new int[] { 1, 2, 3 };

        // Act
        int[] grown = UTF8StreamJsonParser.growArrayBy(original, 5);

        // Assert
        Assert.assertEquals(8, grown.length);
        Assert.assertEquals(1, grown[0]);
        Assert.assertEquals(2, grown[1]);
        Assert.assertEquals(3, grown[2]);

        int[] fromNull = UTF8StreamJsonParser.growArrayBy(null, 4);
        Assert.assertEquals(4, fromNull.length);
    }
}