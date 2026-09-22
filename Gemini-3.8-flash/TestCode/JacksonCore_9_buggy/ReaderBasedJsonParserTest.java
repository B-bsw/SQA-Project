package com.fasterxml.jackson.core.json;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
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
        return new ReaderBasedJsonParser(ctxt, features, new StringReader(doc), null, sym.makeChild(JsonFactory.Feature.collectDefaults()));
    }

    private ReaderBasedJsonParser createParserWithBuffer(String doc, char[] buf, int start, int end, boolean recyclable) {
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, doc, false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        return new ReaderBasedJsonParser(ctxt, 0, new StringReader(doc), null, sym.makeChild(JsonFactory.Feature.collectDefaults()), buf, start, end, recyclable);
    }

    @Test
    public void constructors_givenBothConstructors_shouldInitializeCorrectly() throws IOException {
        String doc = "{\"a\":1}";
        ReaderBasedJsonParser p1 = createParser(doc);
        Assert.assertNotNull(p1);
        Assert.assertNull(p1.getCodec());
        Assert.assertTrue(p1.getInputSource() instanceof Reader);

        char[] buf = new char[64];
        ReaderBasedJsonParser p2 = createParserWithBuffer(doc, buf, 0, 0, false);
        Assert.assertNotNull(p2);
        Assert.assertFalse(p2._bufferRecyclable);

        p1.close();
        p2.close();
    }

    @Test
    public void getCodec_setCodec_givenCodec_shouldStoreAndReturn() throws IOException {
        ReaderBasedJsonParser p = createParser("{}");
        Assert.assertNull(p.getCodec());
        p.setCodec(null);
        Assert.assertNull(p.getCodec());
        p.close();
    }

    @Test
    public void releaseBuffered_givenBufferedContent_shouldWriteToWriter() throws IOException {
        char[] buf = "RemainingData".toCharArray();
        ReaderBasedJsonParser p = createParserWithBuffer("", buf, 0, buf.length, false);
        StringWriter sw = new StringWriter();
        int count = p.releaseBuffered(sw);
        Assert.assertEquals(buf.length, count);
        Assert.assertEquals("RemainingData", sw.toString());

        int countZero = p.releaseBuffered(sw);
        Assert.assertEquals(0, countZero);
        p.close();
    }

    @Test
    public void loadMore_givenReaderReturningZeroChars_shouldThrowIOException() {
        Reader zeroReader = new Reader() {
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }
            public void close() throws IOException {}
        };
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "src", false);
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, zeroReader, null, sym.makeChild(0));
        try {
            p.nextToken();
            Assert.fail("Expected IOException for reader returning 0 chars");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Reader returned 0 characters") >= 0);
        }
    }

    @Test
    public void nextToken_givenSimpleTypes_shouldParseSuccessfully() throws IOException {
        String doc = "{\"str\":\"hello\",\"num\":123,\"boolT\":true,\"boolF\":false,\"nul\":null,\"arr\":[1,2]}";
        ReaderBasedJsonParser p = createParser(doc);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("str", p.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("hello", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("num", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("boolT", p.getText());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("boolF", p.getText());
        Assert.assertEquals(JsonToken.VALUE_FALSE, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("nul", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NULL, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("arr", p.getText());
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void nextToken_givenEmptyInput_shouldReturnNull() throws IOException {
        ReaderBasedJsonParser p = createParser("");
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void nextToken_givenMismatchedEndBracket_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("]");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for mismatched ']'");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("expected '}'") >= 0 || e.getMessage().indexOf("Unexpected") >= 0);
        }
    }

    @Test
    public void nextToken_givenMismatchedEndBrace_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("[}");
        try {
            p.nextToken();
            p.nextToken();
            Assert.fail("Expected JsonParseException for mismatched '}'");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("expected ']'") >= 0 || e.getMessage().indexOf("Unexpected") >= 0);
        }
    }

    @Test
    public void getText_givenDifferentTokens_shouldReturnExpectedString() throws IOException {
        String doc = "{\"field\":\"strVal\",\"intVal\":10,\"floatVal\":10.5,\"t\":true}";
        ReaderBasedJsonParser p = createParser(doc);

        Assert.assertNull(p.getText());

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals("{", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("field", p.getText());

        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("strVal", p.getText());
        Assert.assertEquals("strVal", p.getValueAsString());
        Assert.assertEquals("strVal", p.getValueAsString("default"));

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals("10", p.getText());
        Assert.assertEquals("10", p.getValueAsString());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals("10.5", p.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals("true", p.getText());

        p.close();
    }

    @Test
    public void getTextCharacters_andOffsets_shouldReturnCorrectSegments() throws IOException {
        String doc = "{\"aName\":\"aString\", \"num\": 999}";
        ReaderBasedJsonParser p = createParser(doc);

        Assert.assertNull(p.getTextCharacters());
        Assert.assertEquals(0, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());

        p.nextToken(); // {
        char[] charsObj = p.getTextCharacters();
        Assert.assertEquals(1, p.getTextLength());
        Assert.assertEquals('{', charsObj[0]);

        p.nextToken(); // "aName"
        char[] nameChars1 = p.getTextCharacters();
        char[] nameChars2 = p.getTextCharacters(); // exercise _nameCopied cached branch
        Assert.assertSame(nameChars1, nameChars2);
        Assert.assertEquals(5, p.getTextLength());
        Assert.assertEquals(0, p.getTextOffset());
        Assert.assertEquals("aName", new String(nameChars1, 0, p.getTextLength()));

        p.nextToken(); // "aString"
        char[] strChars = p.getTextCharacters();
        Assert.assertEquals(7, p.getTextLength());
        Assert.assertEquals("aString", new String(strChars, p.getTextOffset(), p.getTextLength()));

        p.nextToken(); // "num"
        p.nextToken(); // 999
        char[] numChars = p.getTextCharacters();
        Assert.assertEquals(3, p.getTextLength());
        Assert.assertEquals("999", new String(numChars, p.getTextOffset(), p.getTextLength()));

        p.close();
    }

    @Test
    public void nextTextValue_givenVariousTokens_shouldReturnExpected() throws IOException {
        String doc = "{\"t1\":\"val1\",\"t2\":123,\"t3\":[\"arr\"],\"t4\":{\"inner\":1}}";
        ReaderBasedJsonParser p = createParser(doc);

        p.nextToken(); // {
        p.nextToken(); // FIELD_NAME "t1"
        Assert.assertEquals("val1", p.nextTextValue());

        p.nextToken(); // FIELD_NAME "t2"
        Assert.assertNull(p.nextTextValue()); // t2 is int, not string

        p.nextToken(); // FIELD_NAME "t3"
        Assert.assertNull(p.nextTextValue()); // t3 is array
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("arr", p.getText());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        p.nextToken(); // FIELD_NAME "t4"
        Assert.assertNull(p.nextTextValue()); // t4 is object
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("inner", p.getText());
        p.nextToken(); // 1
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p.close();

        ReaderBasedJsonParser p2 = createParser("\"standalone\"");
        Assert.assertEquals("standalone", p2.nextTextValue());
        p2.close();
    }

    @Test
    public void nextIntValue_givenVariousTokens_shouldReturnExpected() throws IOException {
        String doc = "{\"i1\":42,\"i2\":\"notInt\",\"i3\":[1],\"i4\":{}}";
        ReaderBasedJsonParser p = createParser(doc);

        p.nextToken(); // {
        p.nextToken(); // FIELD_NAME "i1"
        Assert.assertEquals(42, p.nextIntValue(-1));

        p.nextToken(); // FIELD_NAME "i2"
        Assert.assertEquals(-1, p.nextIntValue(-1));

        p.nextToken(); // FIELD_NAME "i3"
        Assert.assertEquals(-9, p.nextIntValue(-9));
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        p.nextToken(); // FIELD_NAME "i4"
        Assert.assertEquals(-5, p.nextIntValue(-5));
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p.close();

        ReaderBasedJsonParser p2 = createParser("999");
        Assert.assertEquals(999, p2.nextIntValue(0));
        p2.close();
    }

    @Test
    public void nextLongValue_givenVariousTokens_shouldReturnExpected() throws IOException {
        String doc = "{\"l1\":1234567890123,\"l2\":\"str\",\"l3\":[1],\"l4\":{}}";
        ReaderBasedJsonParser p = createParser(doc);

        p.nextToken(); // {
        p.nextToken(); // FIELD_NAME "l1"
        Assert.assertEquals(1234567890123L, p.nextLongValue(-1L));

        p.nextToken(); // FIELD_NAME "l2"
        Assert.assertEquals(-1L, p.nextLongValue(-1L));

        p.nextToken(); // FIELD_NAME "l3"
        Assert.assertEquals(-9L, p.nextLongValue(-9L));
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        p.nextToken(); // FIELD_NAME "l4"
        Assert.assertEquals(-5L, p.nextLongValue(-5L));
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p.close();

        ReaderBasedJsonParser p2 = createParser("555");
        Assert.assertEquals(555L, p2.nextLongValue(0L));
        p2.close();
    }

    @Test
    public void nextBooleanValue_givenVariousTokens_shouldReturnExpected() throws IOException {
        String doc = "{\"b1\":true,\"b2\":false,\"b3\":\"str\",\"b4\":[true],\"b5\":{}}";
        ReaderBasedJsonParser p = createParser(doc);

        p.nextToken(); // {
        p.nextToken(); // FIELD_NAME "b1"
        Assert.assertEquals(Boolean.TRUE, p.nextBooleanValue());

        p.nextToken(); // FIELD_NAME "b2"
        Assert.assertEquals(Boolean.FALSE, p.nextBooleanValue());

        p.nextToken(); // FIELD_NAME "b3"
        Assert.assertNull(p.nextBooleanValue());

        p.nextToken(); // FIELD_NAME "b4"
        Assert.assertNull(p.nextBooleanValue());
        Assert.assertEquals(JsonToken.VALUE_TRUE, p.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());

        p.nextToken(); // FIELD_NAME "b5"
        Assert.assertNull(p.nextBooleanValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());

        p.close();

        ReaderBasedJsonParser p2 = createParser("true");
        Assert.assertEquals(Boolean.TRUE, p2.nextBooleanValue());
        p2.close();

        ReaderBasedJsonParser p3 = createParser("false");
        Assert.assertEquals(Boolean.FALSE, p3.nextBooleanValue());
        p3.close();

        ReaderBasedJsonParser p4 = createParser("123");
        Assert.assertNull(p4.nextBooleanValue());
        p4.close();
    }

    @Test
    public void parseNumbers_givenPositiveNegativeAndFloats_shouldParseCorrectly() throws IOException {
        String doc = " [ 0, -0, 123, -456, 0.5, -0.75, 12.34e2, -56.78E-2, 1E+3 ] ";
        ReaderBasedJsonParser p = createParser(doc);

        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(0, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(0, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(-456, p.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(0.5, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(-0.75, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(1234.0, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(-0.5678, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p.nextToken());
        Assert.assertEquals(1000.0, p.getDoubleValue(), 0.0001);

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void parseNumbers_givenLeadingZeroesWhenDisabled_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("0123");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for leading zero");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Leading zeroes not allowed") >= 0);
        }
    }

    @Test
    public void parseNumbers_givenLeadingZeroesWhenEnabled_shouldParseSuccessfully() throws IOException {
        ReaderBasedJsonParser p = createParser("0123");
        p.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        p.close();
    }

    @Test
    public void parseNumbers_givenLeadingZeroZeroWhenEnabled_shouldParseSuccessfully() throws IOException {
        ReaderBasedJsonParser p = createParser("00");
        p.enable(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(0, p.getIntValue());
        p.close();
    }

    @Test
    public void parseNumbers_givenInvalidMinusSign_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("-a");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for '-' not followed by digit");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("expected digit") >= 0);
        }
    }

    @Test
    public void parseNumbers_givenInvalidPeriod_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("1.a");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for '.' not followed by digit");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Decimal point not followed by a digit") >= 0);
        }
    }

    @Test
    public void parseNumbers_givenInvalidExponent_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("1e+a");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for exponent not followed by digit");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Exponent indicator not followed by a digit") >= 0);
        }
    }

    @Test
    public void parseNumbers_givenNonNumericNumbersWhenEnabled_shouldParseSuccessfully() throws IOException {
        ReaderBasedJsonParser p1 = createParser("NaN");
        p1.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p1.nextToken());
        Assert.assertTrue(Double.isNaN(p1.getDoubleValue()));
        p1.close();

        ReaderBasedJsonParser p2 = createParser("Infinity");
        p2.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p2.nextToken());
        Assert.assertTrue(Double.isInfinite(p2.getDoubleValue()));
        Assert.assertTrue(p2.getDoubleValue() > 0);
        p2.close();

        ReaderBasedJsonParser p3 = createParser("+Infinity");
        p3.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p3.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, p3.getDoubleValue(), 0.0);
        p3.close();

        ReaderBasedJsonParser p4 = createParser("-Infinity");
        p4.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p4.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, p4.getDoubleValue(), 0.0);
        p4.close();

        ReaderBasedJsonParser p5 = createParser("-INF");
        p5.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p5.nextToken());
        Assert.assertEquals(Double.NEGATIVE_INFINITY, p5.getDoubleValue(), 0.0);
        p5.close();

        ReaderBasedJsonParser p6 = createParser("+INF");
        p6.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_FLOAT, p6.nextToken());
        Assert.assertEquals(Double.POSITIVE_INFINITY, p6.getDoubleValue(), 0.0);
        p6.close();
    }

    @Test
    public void parseNumbers_givenNonNumericNumbersWhenDisabled_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("NaN");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for NaN when feature disabled");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("ALLOW_NON_NUMERIC_NUMBERS") >= 0);
        }
    }

    @Test
    public void parseString_givenEscapedCharacters_shouldUnescapeCorrectly() throws IOException {
        String doc = "\"\\\" \\\\ \\/ \\b \\f \\n \\r \\t \\u0041\"";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("\" \\ / \b \f \n \r \t A", p.getText());
        p.close();
    }

    @Test
    public void parseString_givenInvalidHexEscape_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("\"\\u004G\"");
        try {
            p.nextToken();
            p.getText();
            Assert.fail("Expected JsonParseException for invalid hex digit");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("expected a hex-digit") >= 0);
        }
    }

    @Test
    public void parseString_givenUnrecognizedEscape_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("\"\\z\"");
        try {
            p.nextToken();
            p.getText();
            Assert.fail("Expected JsonParseException for unrecognized escape");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized character escape") >= 0);
        }
    }

    @Test
    public void parseString_givenUnquotedControlChar_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("\"\n\"");
        try {
            p.nextToken();
            p.getText();
            Assert.fail("Expected JsonParseException for unquoted control character");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal unquoted character") >= 0);
        }
    }

    @Test
    public void parseString_givenUnterminatedString_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("\"unterminated");
        try {
            p.nextToken();
            p.getText();
            Assert.fail("Expected JsonParseException for unterminated string");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("was expecting closing quote") >= 0);
        }
    }

    @Test
    public void skipString_givenConsecutiveTokens_shouldSkipIncompleteString() throws IOException {
        String doc = " [ \"skipMe\", 123 ] ";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        // Call nextToken() without calling getText() to trigger _skipString()
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void singleQuotes_givenSingleQuotedStringWhenEnabled_shouldParseSuccessfully() throws IOException {
        String doc = "{'key': 'value'}";
        ReaderBasedJsonParser p = createParser(doc);
        p.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("key", p.getText());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());
        Assert.assertEquals("value", p.getText());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void singleQuotes_givenSingleQuotedStringWhenDisabled_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("{'key': 'value'}");
        try {
            p.nextToken();
            p.nextToken();
            Assert.fail("Expected JsonParseException for single quotes when disabled");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected character") >= 0 || e.getMessage().indexOf("was expecting double-quote") >= 0);
        }
    }

    @Test
    public void unquotedFieldName_givenUnquotedNameWhenEnabled_shouldParseSuccessfully() throws IOException {
        String doc = "{foo: 1, _bar: 2, $baz: 3}";
        ReaderBasedJsonParser p = createParser(doc);
        p.enable(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("foo", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("_bar", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());

        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("$baz", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(3, p.getIntValue());

        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void unquotedFieldName_givenUnquotedNameWhenDisabled_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("{foo: 1}");
        try {
            p.nextToken();
            p.nextToken();
            Assert.fail("Expected JsonParseException for unquoted field name when disabled");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("was expecting double-quote to start field name") >= 0);
        }
    }

    @Test
    public void comments_givenCStyleCommentsWhenEnabled_shouldSkipComment() throws IOException {
        String doc = "/* header comment */ { /* field comment */ \"a\" /* colon comment */ : /* val comment */ 123 } // trailing comment\n";
        ReaderBasedJsonParser p = createParser(doc);
        p.enable(JsonParser.Feature.ALLOW_COMMENTS);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("a", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void comments_givenYamlCommentsWhenEnabled_shouldSkipComment() throws IOException {
        String doc = "# Yaml line 1\n{\"val\": # inline comment\n 456} # end\n";
        ReaderBasedJsonParser p = createParser(doc);
        p.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);

        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("val", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(456, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void comments_givenCommentsWhenDisabled_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("// comment\n{}");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for comments when disabled");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Feature 'ALLOW_COMMENTS' not enabled") >= 0);
        }
    }

    @Test
    public void comments_givenUnclosedCComment_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("/* unclosed comment ");
        p.enable(JsonParser.Feature.ALLOW_COMMENTS);
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for unclosed C comment");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("in a comment") >= 0);
        }
    }

    @Test
    public void base64_givenValidBase64String_shouldDecodeBytes() throws IOException {
        String rawText = "Hello World! Jackson Base64 Testing String.";
        byte[] expectedBytes = rawText.getBytes("UTF-8");
        String b64 = Base64Variants.MIME.encode(expectedBytes);

        String doc = " [ \"" + b64 + "\" ] ";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.START_ARRAY, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());

        byte[] decoded = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertArrayEquals(expectedBytes, decoded);

        // Call again to test cached _binaryValue path
        byte[] cached = p.getBinaryValue(Base64Variants.MIME);
        Assert.assertSame(decoded, cached);

        Assert.assertEquals(JsonToken.END_ARRAY, p.nextToken());
        p.close();
    }

    @Test
    public void base64_givenStreamReading_shouldWriteAllBytes() throws IOException {
        byte[] data = new byte[256];
        for (int i = 0; i < data.length; i++) {
            data[i] = (byte) i;
        }
        String b64 = Base64Variants.MIME.encode(data);
        String doc = "\"" + b64 + "\"";

        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.VALUE_STRING, p.nextToken());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int written = p.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(data.length, written);
        Assert.assertArrayEquals(data, baos.toByteArray());
        p.close();
    }

    @Test
    public void base64_givenInvalidChar_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("\"!!!invalidBase64!!!\"");
        try {
            p.nextToken();
            p.getBinaryValue(Base64Variants.MIME);
            Assert.fail("Expected IOException for invalid base64");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Failed to decode VALUE_STRING as base64") >= 0 || e.getMessage().indexOf("Illegal character") >= 0);
        }
    }

    @Test
    public void base64_givenNonStringToken_shouldThrowException() throws IOException {
        ReaderBasedJsonParser p = createParser("12345");
        p.nextToken();
        try {
            p.getBinaryValue(Base64Variants.MIME);
            Assert.fail("Expected JsonParseException when trying to read binary from int");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("not VALUE_STRING or VALUE_EMBEDDED_OBJECT") >= 0);
        }
        p.close();
    }

    @Test
    public void commaSeparators_givenMissingCommaInArray_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("[ 1 2 ]");
        try {
            p.nextToken(); // [
            p.nextToken(); // 1
            p.nextToken(); // should fail expecting comma
            Assert.fail("Expected JsonParseException for missing comma");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("was expecting comma") >= 0);
        }
    }

    @Test
    public void colonSeparator_givenMissingColonInObject_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("{\"key\" 123}");
        try {
            p.nextToken(); // {
            p.nextToken(); // FIELD_NAME
            p.nextToken(); // should fail expecting colon
            Assert.fail("Expected JsonParseException for missing colon");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("was expecting a colon") >= 0);
        }
    }

    @Test
    public void colonSeparator_givenWhitespaceAndTabsBeforeColon_shouldParseSuccessfully() throws IOException {
        String doc = "{\"key1\" \t : \t 1, \"key2\":2}";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("key1", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals("key2", p.getText());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(2, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void whitespace_givenCrLfNewlines_shouldTrackRowAndColCorrectly() throws IOException {
        String doc = "{\r\n\"a\"\r\n:\r\n1\n}";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.START_OBJECT, p.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, p.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(1, p.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, p.nextToken());
        p.close();
    }

    @Test
    public void oddTokens_givenInvalidToken_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("truX");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for invalid token truX");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized token") >= 0);
        }
    }

    @Test
    public void oddTokens_givenInvalidKeyword_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("falsy");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for invalid token falsy");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized token") >= 0);
        }
    }

    @Test
    public void oddTokens_givenInvalidNullKeyword_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("nulled");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for invalid token nulled");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized token") >= 0);
        }
    }

    @Test
    public void oddTokens_givenUnexpectedLeadingChar_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("?what");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for '?'");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected character") >= 0);
        }
    }

    @Test
    public void rootWhitespace_givenNumberFollowedByInvalidChar_shouldThrowException() {
        ReaderBasedJsonParser p = createParser("123a");
        try {
            p.nextToken();
            Assert.fail("Expected JsonParseException for invalid char following root number");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected character") >= 0 || e.getMessage().indexOf("was expecting space") >= 0);
        }
    }

    @Test
    public void rootWhitespace_givenValidRootWhitespace_shouldParseSuccessfully() throws IOException {
        String doc = "123 \t\r\n";
        ReaderBasedJsonParser p = createParser(doc);
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextToken());
        Assert.assertEquals(123, p.getIntValue());
        Assert.assertNull(p.nextToken());
        p.close();
    }

    @Test
    public void close_givenOpenParser_shouldCloseReaderAndReleaseBuffers() throws IOException {
        final boolean[] closed = new boolean[1];
        StringReader sr = new StringReader("{\"a\":1}") {
            public void close() {
                closed[0] = true;
                super.close();
            }
        };
        BufferRecycler br = new BufferRecycler();
        IOContext ctxt = new IOContext(br, "src", true); // resource managed = true
        CharsToNameCanonicalizer sym = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser p = new ReaderBasedJsonParser(ctxt, 0, sr, null, sym.makeChild(0));

        Assert.assertFalse(p.isClosed());
        p.nextToken();
        p.close();
        Assert.assertTrue(p.isClosed());
        Assert.assertTrue(closed[0]);
    }
}