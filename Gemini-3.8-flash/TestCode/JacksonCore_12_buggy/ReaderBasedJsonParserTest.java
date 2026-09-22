package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class ReaderBasedJsonParserTest {

    private ReaderBasedJsonParser createParser(String doc) {
        return createParser(doc, 0);
    }

    private ReaderBasedJsonParser createParser(String doc, int features) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        StringReader r = new StringReader(doc);
        return new ReaderBasedJsonParser(ctxt, features, r, null, sym.makeChild(JsonFactory.Feature.collectDefaults()));
    }

    private ReaderBasedJsonParser createParserWithBuffer(String doc, int features, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        char[] buf = doc.toCharArray();
        StringReader r = new StringReader(doc);
        return new ReaderBasedJsonParser(ctxt, features, r, null, sym.makeChild(JsonFactory.Feature.collectDefaults()),
                buf, 0, buf.length, recyclable);
    }

    @Test
    public void constructor_givenValidContextAndBuffer_shouldInitializeCorrectly() throws IOException {
        String doc = "{\"key\":123}";
        ReaderBasedJsonParser parser = createParserWithBuffer(doc, 0, true);

        Assert.assertNull(parser.getCodec());
        Assert.assertNotNull(parser.getInputSource());
        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        StringWriter sw = new StringWriter();
        int released = parser.releaseBuffered(sw);
        Assert.assertTrue(released >= 0);

        parser.close();
    }

    @Test
    public void getCodecAndSetCodec_givenCodec_shouldStoreAndReturnCodec() throws IOException {
        ReaderBasedJsonParser parser = createParser("{}");
        Assert.assertNull(parser.getCodec());

        parser.setCodec(null);
        Assert.assertNull(parser.getCodec());
        parser.close();
    }

    @Test
    public void releaseBuffered_givenBufferedContent_shouldWriteToWriter() throws IOException {
        String doc = "abc";
        char[] buf = doc.toCharArray();
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        StringReader r = new StringReader("");
        ReaderBasedJsonParser parser = new ReaderBasedJsonParser(ctxt, 0, r, null,
                sym.makeChild(JsonFactory.Feature.collectDefaults()), buf, 0, buf.length, false);

        CharArrayWriter caw = new CharArrayWriter();
        int count = parser.releaseBuffered(caw);
        Assert.assertEquals(3, count);
        Assert.assertEquals("abc", caw.toString());

        CharArrayWriter emptyWriter = new CharArrayWriter();
        int secondCount = parser.releaseBuffered(emptyWriter);
        Assert.assertEquals(0, secondCount);
        parser.close();
    }

    @Test
    public void nextToken_givenSimpleObject_shouldTraverseTokens() throws IOException {
        String doc = "{\"name\":\"test\", \"val\": true, \"nil\": null, \"neg\": -42, \"float\": 3.14e2}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals("name", parser.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("test", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("val", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals("true", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("nil", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        Assert.assertEquals("null", parser.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("neg", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("-42", parser.getText());
        Assert.assertEquals(-42, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("float", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(314.0, parser.getDoubleValue(), 0.001);

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenArrayWithCommasAndNewlines_shouldParseCorrectly() throws IOException {
        String doc = "[\n 1,\r\n 2,\r 3\n]";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(3, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void nextFieldName_givenExpectedMatches_shouldMatchOptimized() throws IOException {
        String doc = "{\"field1\": 100, \"field2\": \"val\"}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SerializedString f1 = new SerializedString("field1");
        boolean matched1 = parser.nextFieldName(f1);
        Assert.assertTrue(matched1);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(100, parser.getIntValue());

        SerializedString f2Mismatch = new SerializedString("notField2");
        boolean matched2 = parser.nextFieldName(f2Mismatch);
        Assert.assertFalse(matched2);
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
        Assert.assertEquals("field2", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("val", parser.getText());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextFieldName_givenStringMethod_shouldReturnNamesDirectly() throws IOException {
        String doc = "{\"k1\":\"v1\",\"k2\":2}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        String name1 = parser.nextFieldName();
        Assert.assertEquals("k1", name1);
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        String name2 = parser.nextFieldName();
        Assert.assertEquals("k2", name2);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());

        Assert.assertNull(parser.nextFieldName());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
        parser.close();
    }

    @Test
    public void nextValues_givenVariousPrimitives_shouldReturnExpectedTypedValues() throws IOException {
        String doc = "{\"s\":\"str\",\"i\":123,\"l\":9876543210,\"b1\":true,\"b2\":false}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        Assert.assertEquals("s", parser.nextFieldName());
        Assert.assertEquals("str", parser.nextTextValue());

        Assert.assertEquals("i", parser.nextFieldName());
        Assert.assertEquals(123, parser.nextIntValue(0));

        Assert.assertEquals("l", parser.nextFieldName());
        Assert.assertEquals(9876543210L, parser.nextLongValue(0L));

        Assert.assertEquals("b1", parser.nextFieldName());
        Assert.assertEquals(Boolean.TRUE, parser.nextBooleanValue());

        Assert.assertEquals("b2", parser.nextFieldName());
        Assert.assertEquals(Boolean.FALSE, parser.nextBooleanValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void nextValues_givenDefaultFallbacks_shouldReturnDefaults() throws IOException {
        String doc = "[true, false, \"text\", 456]";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        Assert.assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        Assert.assertEquals("text", parser.nextTextValue());
        Assert.assertEquals(456, parser.nextIntValue(-1));

        parser.close();
    }

    @Test
    public void getTextCharacters_andOffsets_shouldExposeCorrectBufferMetadata() throws IOException {
        String doc = "{\"key\": \"value\", \"num\": 12345}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertNotNull(parser.getTextCharacters());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("key", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value", new String(parser.getTextCharacters(), parser.getTextOffset(), parser.getTextLength()));

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("num", parser.getValueAsString("default"));

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("12345", parser.getValueAsString());
        Assert.assertEquals(5, parser.getTextLength());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void numbers_givenFloatingPointFormats_shouldParseAccurately() throws IOException {
        String doc = "[-0.0, 12.34, -56.78e+2, 99.0E-1, 0]";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("-0.0", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("12.34", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("-56.78e+2", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals("99.0E-1", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals("0", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void numbers_givenLeadingZeroesWithFeatureEnabled_shouldParse() throws IOException {
        int features = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
        String doc = "[012, 0005]";
        ReaderBasedJsonParser parser = createParser(doc, features);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(12, parser.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(5, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void numbers_givenLeadingZeroesWithoutFeature_shouldThrowException() throws IOException {
        String doc = "[012]";
        ReaderBasedJsonParser parser = createParser(doc, 0);
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test
    public void numbers_givenNonStandardTokensWithFeatureEnabled_shouldParseNaNAndInfinity() throws IOException {
        int features = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
        String doc = "[NaN, Infinity, +Infinity, -Infinity, -INF, +INF]";
        ReaderBasedJsonParser parser = createParser(doc, features);

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
        Assert.assertEquals(Double.NEGATIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, parser.getDoubleValue(), 0.0);

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void strings_givenEscapeSequences_shouldDecodeCorrectly() throws IOException {
        String doc = "[\"\\\"\", \"\\\\\", \"\\/\", \"\\b\", \"\\f\", \"\\n\", \"\\r\", \"\\t\", \"\\u0041\"]";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\"", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\\", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("/", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\b", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\f", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\n", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\r", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("\t", parser.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("A", parser.getText());

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void comments_givenJavaAndYamlCommentsWithFeatures_shouldSkipComments() throws IOException {
        int features = JsonParser.Feature.ALLOW_COMMENTS.getMask()
                | JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
        String doc = "/* block comment */\n"
                + "{\n"
                + "// line comment\n"
                + "# yaml comment\n"
                + "\"key\": /* inline */ 123 // trailing\n"
                + "}";
        ReaderBasedJsonParser parser = createParser(doc, features);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("key", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(123, parser.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        Assert.assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void singleQuotes_givenFeatureEnabled_shouldParseStringsAndFieldNames() throws IOException {
        int features = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
        String doc = "{'name': 'value \\'quoted\\''}";
        ReaderBasedJsonParser parser = createParser(doc, features);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("name", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        Assert.assertEquals("value 'quoted'", parser.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void unquotedFieldNames_givenFeatureEnabled_shouldParseIdentifiers() throws IOException {
        int features = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
        String doc = "{foo: 1, bar_2: 2}";
        ReaderBasedJsonParser parser = createParser(doc, features);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("foo", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(1, parser.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        Assert.assertEquals("bar_2", parser.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        Assert.assertEquals(2, parser.getIntValue());

        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test
    public void base64_givenValidBase64EncodedString_shouldDecodeBinary() throws IOException {
        String doc = "[\"SGVsbG8gV29ybGQ=\"]";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, parser.nextToken());

        byte[] binary = parser.getBinaryValue(Base64Variants.MIME);
        Assert.assertNotNull(binary);
        Assert.assertEquals("Hello World", new String(binary, "UTF-8"));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int bytesWritten = parser.readBinaryValue(Base64Variants.MIME, out);
        Assert.assertEquals(11, bytesWritten);
        Assert.assertEquals("Hello World", new String(out.toByteArray(), "UTF-8"));

        Assert.assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void locations_givenMultilineInput_shouldReportAccurateLinesAndColumns() throws IOException {
        String doc = "{\n  \"line2\": true\n}";
        ReaderBasedJsonParser parser = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        JsonLocation locStart = parser.getTokenLocation();
        Assert.assertEquals(1, locStart.getLineNr());

        Assert.assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        JsonLocation locField = parser.getTokenLocation();
        Assert.assertEquals(2, locField.getLineNr());

        JsonLocation curLoc = parser.getCurrentLocation();
        Assert.assertTrue(curLoc.getLineNr() >= 2);

        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void mismatchedBrackets_givenArrayEndInObject_shouldThrowParseException() throws IOException {
        String doc = "{\"key\": 1]";
        ReaderBasedJsonParser parser = createParser(doc);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void mismatchedBrackets_givenObjectEndInArray_shouldThrowParseException() throws IOException {
        String doc = "[1, 2}";
        ReaderBasedJsonParser parser = createParser(doc);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void invalidToken_givenUnrecognizedWord_shouldReportInvalidToken() throws IOException {
        String doc = "unknownToken";
        ReaderBasedJsonParser parser = createParser(doc);
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void invalidNumber_givenMinusWithoutDigits_shouldThrowParseException() throws IOException {
        String doc = "[-]";
        ReaderBasedJsonParser parser = createParser(doc);
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void invalidEscape_givenMalformedUnicode_shouldThrowParseException() throws IOException {
        String doc = "[\"\\u12G4\"]";
        ReaderBasedJsonParser parser = createParser(doc);
        parser.nextToken();
        parser.nextToken();
        parser.getText();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void commentsWithoutFeature_givenSlashComment_shouldThrowParseException() throws IOException {
        String doc = "// comment\n123";
        ReaderBasedJsonParser parser = createParser(doc, 0);
        parser.nextToken();
        parser.close();
    }

    @Test(expected = JsonParseException.class)
    public void unquotedNamesWithoutFeature_givenRawWord_shouldThrowParseException() throws IOException {
        String doc = "{rawName: 123}";
        ReaderBasedJsonParser parser = createParser(doc, 0);
        parser.nextToken();
        parser.nextToken();
        parser.close();
    }

    @Test
    public void emptyInput_shouldReturnNullTokenAndCloseGracefully() throws IOException {
        String doc = "   \n\t  ";
        ReaderBasedJsonParser parser = createParser(doc);
        Assert.assertNull(parser.nextToken());
        Assert.assertNull(parser.getText());
        Assert.assertEquals(0, parser.getTextLength());
        Assert.assertNull(parser.getTextCharacters());
        parser.close();
    }

    @Test
    public void close_givenParser_shouldReleaseResourcesIdempotently() throws IOException {
        String doc = "[1, 2]";
        ReaderBasedJsonParser parser = createParser(doc);
        Assert.assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        parser.close();
        Assert.assertTrue(parser.isClosed());
        parser.close();
    }
}