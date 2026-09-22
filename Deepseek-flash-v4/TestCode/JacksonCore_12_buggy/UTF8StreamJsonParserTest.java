package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UTF8StreamJsonParserTest {

    private IOContext ctxt;
    private ByteQuadsCanonicalizer symbols;
    private int features;
    private InputStream in;

    @Before
    public void setUp() {
        ctxt = new IOContext(JsonFactory.Factory._getBufferRecycler(), null, false, false);
        symbols = ByteQuadsCanonicalizer.createRoot(64).child();
        features = 0;
        in = null;
    }

    @After
    public void tearDown() throws IOException {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                // ignore
            }
            in = null;
        }
    }

    private UTF8StreamJsonParser createParser(String json) throws IOException {
        in = new ByteArrayInputStream(json.getBytes("UTF-8"));
        return new UTF8StreamJsonParser(ctxt, features, in, null, null, symbols, 0);
    }

    @Test
    public void testConstructorAndGetters() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1}");
        assertNotNull(parser);
        assertNull(parser.getCodec());
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        parser.setCodec(null);
        assertNull(parser.getCodec());
        parser.close();
    }

    @Test
    public void testGetText() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"value\"}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("name", parser.getText());
        parser.nextToken();
        assertEquals("value", parser.getText());
        parser.close();
    }

    @Test
    public void testGetTextWithEscapedChars() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\\\"b\":\"c\\\\d\"}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("a\"b", parser.getText());
        parser.nextToken();
        assertEquals("c\\d", parser.getText());
        parser.close();
    }

    @Test
    public void testGetTextUnterminatedString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"unterminated");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        try {
            parser.getText();
            fail("Expected exception for unterminated string");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
        parser.close();
    }

    @Test
    public void testGetTextForNonStringTokens() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,true,null]");
        parser.nextToken();
        parser.nextToken();
        assertEquals("1", parser.getText());
        parser.nextToken();
        assertEquals("true", parser.getText());
        parser.nextToken();
        assertEquals("null", parser.getText());
        parser.close();
    }

    @Test
    public void testGetValueAsString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"str\":\"hello\",\"num\":42,\"bool\":true}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("str", parser.getValueAsString());
        parser.nextToken();
        assertEquals("hello", parser.getValueAsString());
        parser.nextToken();
        assertEquals("num", parser.getValueAsString());
        parser.nextToken();
        assertEquals("42", parser.getValueAsString());
        parser.nextToken();
        assertEquals("bool", parser.getValueAsString());
        parser.nextToken();
        assertEquals("true", parser.getValueAsString());
        parser.close();
    }

    @Test
    public void testGetValueAsStringWithDefault() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,2]");
        parser.nextToken();
        parser.nextToken();
        assertEquals("1", parser.getValueAsString("default"));
        parser.nextToken();
        assertEquals("2", parser.getValueAsString("default"));
        parser.close();
    }

    @Test
    public void testGetValueAsStringNullToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("null");
        parser.nextToken();
        assertEquals("null", parser.getValueAsString());
        assertEquals("def", parser.getValueAsString("def"));
        parser.close();
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        UTF8StreamJsonParser parser = createParser("[123,-45,0]");
        parser.nextToken();
        parser.nextToken();
        assertEquals(123, parser.getValueAsInt());
        parser.nextToken();
        assertEquals(-45, parser.getValueAsInt());
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt());
        parser.close();
    }

    @Test
    public void testGetValueAsIntWithDefault() throws IOException {
        UTF8StreamJsonParser parser = createParser("[abc,1.5,10]");
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(0));
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(0)); // float falls back
        parser.nextToken();
        assertEquals(10, parser.getValueAsInt(0));
        parser.close();
    }

    @Test
    public void testGetValueAsIntFloatValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1.5]");
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getValueAsInt(0)); // float not converted
        parser.close();
    }

    @Test
    public void testGetTextCharacters() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"name\":\"value\"}");
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals("name", new String(chars, parser.getTextOffset(), parser.getTextLength()));
        parser.nextToken();
        chars = parser.getTextCharacters();
        assertEquals("value", new String(chars, parser.getTextOffset(), parser.getTextLength()));
        parser.close();
    }

    @Test
    public void testGetTextCharactersForFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"longFieldName\":1}");
        parser.nextToken();
        parser.nextToken();
        char[] chars = parser.getTextCharacters();
        assertEquals("longFieldName", new String(chars, parser.getTextOffset(), parser.getTextLength()));
        parser.close();
    }

    @Test
    public void testGetTextLengthBounds() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"b\"}");
        parser.nextToken();
        parser.nextToken();
        assertEquals(1, parser.getTextLength());
        parser.nextToken();
        assertEquals(1, parser.getTextLength());
        parser.close();
    }

    @Test
    public void testGetBinaryValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"data\":\"SGVsbG8=\"}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken(); // start string
        byte[] data = parser.getBinaryValue(Base64Variants.getDefaultVariant());
        assertNotNull(data);
        assertEquals("Hello", new String(data, "UTF-8"));
        parser.close();
    }

    @Test
    public void testGetBinaryValueInvalidToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("[123]");
        parser.nextToken();
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception for non-string token");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
        parser.close();
    }

    @Test
    public void testGetBinaryValueInvalidBase64() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"data\":\"###\"}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception for invalid base64");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
        parser.close();
    }

    @Test
    public void testReadBinaryValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"data\":\"SGVsbG8=\"}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int count = parser.readBinaryValue(Base64Variants.getDefaultVariant(), out);
        assertEquals(5, count);
        assertEquals("Hello", new String(out.toByteArray(), "UTF-8"));
        parser.close();
    }

    @Test
    public void testReadBinaryValueNotString() throws IOException {
        UTF8StreamJsonParser parser = createParser("[true]");
        parser.nextToken();
        parser.nextToken();
        try {
            parser.readBinaryValue(Base64Variants.getDefaultVariant(), new ByteArrayOutputStream());
            fail("Expected exception");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
        parser.close();
    }

    @Test
    public void testNextTokenBasicArray() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,2,3]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenEmptyArray() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenNestedArray() throws IOException {
        UTF8StreamJsonParser parser = createParser("[[1],[]]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenObject() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1,\"b\":\"two\"}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenEmptyObject() throws IOException {
        UTF8StreamJsonParser parser = createParser("{}");
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenPrimitiveValues() throws IOException {
        UTF8StreamJsonParser parser = createParser("[\"hello\", true, false, null]");
        parser.nextToken(); // [
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, parser.nextToken());
        assertEquals(JsonToken.VALUE_FALSE, parser.nextToken());
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        parser.nextToken(); // ]
        parser.close();
    }

    @Test
    public void testNextTokenNumbers() throws IOException {
        UTF8StreamJsonParser parser = createParser("[0,-0,1.5,-2.5e3,1E-2]");
        parser.nextToken();
        parser.nextToken();
        assertEquals(0, parser.getIntValue());
        parser.nextToken();
        assertEquals(-0, parser.getIntValue());
        parser.nextToken();
        assertEquals(1, parser.getIntValue());
        parser.nextToken();
        assertEquals(-25, parser.getIntValue());
        parser.nextToken();
        assertEquals(0, parser.getIntValue());
        parser.close();
    }

    @Test
    public void testNextTokenInvalidValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("[abc]");
        parser.nextToken();
        try {
            parser.nextToken();
            fail("Expected exception for invalid value");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTokenInvalidChar() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,)");
        parser.nextToken();
        parser.nextToken();
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTokenTrailingComma() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,]");
        parser.nextToken();
        parser.nextToken();
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTokenWhitespace() throws IOException {
        UTF8StreamJsonParser parser = createParser(" \t\r\n [ 1 ] \t\r\n ");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenEOLInString() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"line1\nline2\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("line1\nline2", parser.getText());
        parser.close();
    }

    @Test
    public void testNextTokenEscapedChars() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\\"\\\\\\/\\b\\f\\n\\r\\t\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("\"\\/\b\f\n\r\t", parser.getText());
        parser.close();
    }

    @Test
    public void testNextTokenInvalidEscape() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\x\"");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTokenUnicodeEscape() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\u0041\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals("A", parser.getText());
        parser.close();
    }

    @Test
    public void testNextTokenInvalidUnicodeEscape() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\u00G0\"");
        try {
            parser.nextToken();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTokenSurrogatePair() throws IOException {
        UTF8StreamJsonParser parser = createParser("\"\\uD83D\\uDE00\"");
        assertEquals(JsonToken.VALUE_STRING, parser.nextToken());
        assertEquals(0x1F600, parser.getText().codePointAt(0));
        parser.close();
    }

    @Test
    public void testNextTokenComment() throws IOException {
        UTF8StreamJsonParser parser = createParser("[/* comment */1,// line\n2]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextTokenYAMLComment() throws IOException {
        UTF8StreamJsonParser parser = createParser("[#comment\n1]");
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        parser.close();
    }

    @Test
    public void testNextFieldName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":1,\"b\":2}");
        parser.nextToken();
        assertEquals("a", parser.nextFieldName());
        parser.nextToken();
        assertEquals("b", parser.nextFieldName());
        assertEquals(null, parser.nextFieldName()); // end object
        parser.close();
    }

    @Test
    public void testNextFieldNameWithLatin1() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"é\":1}");
        parser.nextToken();
        assertEquals("é", parser.nextFieldName());
        parser.nextToken();
        parser.close();
    }

    @Test
    public void testNextFieldNameNull() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\\u0000b\":1}");
        parser.nextToken();
        assertEquals("a\u0000b", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testNextFieldNameEmptyName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"\":1}");
        parser.nextToken();
        assertEquals("", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testNextFieldNameInvalidToken() throws IOException {
        UTF8StreamJsonParser parser = createParser("123");
        try {
            parser.nextFieldName();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextFieldNameInvalidName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":}");
        parser.nextToken();
        assertEquals("a", parser.nextFieldName());
        try {
            parser.nextFieldName();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextFieldNameUnexpectedChar() throws IOException {
        UTF8StreamJsonParser parser = createParser("{a:1}");
        parser.nextToken();
        try {
            parser.nextFieldName();
            fail("Expected exception");
        } catch (IOException e) {
            // expected
        }
        parser.close();
    }

    @Test
    public void testNextTextValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":\"str\"}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("a", parser.nextTextValue());
        assertEquals("str", parser.nextTextValue());
        parser.nextToken();
        assertNull(parser.nextTextValue());
        parser.close();
    }

    @Test
    public void testNextTextValueNonString() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\":123}");
        parser.nextToken();
        parser.nextToken();
        assertEquals("a", parser.nextTextValue());
        assertEquals(null, parser.nextTextValue()); // number, not string
        parser.close();
    }

    @Test
    public void testNextIntValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("[5,abc,7]");
        parser.nextToken();
        assertEquals(5, parser.nextIntValue(-1));
        assertEquals(-1, parser.nextIntValue(-1)); // non-int, use default
        assertEquals(7, parser.nextIntValue(-1));
        parser.close();
    }

    @Test
    public void testNextIntValueAtEnd() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        parser.nextToken();
        assertEquals(-1, parser.nextIntValue(-1)); // end
        parser.close();
    }

    @Test
    public void testNextLongValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1234567890123L]");
        parser.nextToken();
        assertEquals(1234567890123L, parser.nextLongValue(-1L));
        parser.close();
    }

    @Test
    public void testNextLongValueNonLong() throws IOException {
        UTF8StreamJsonParser parser = createParser("[abc]");
        parser.nextToken();
        assertEquals(-1L, parser.nextLongValue(-1L));
        parser.close();
    }

    @Test
    public void testNextBooleanValue() throws IOException {
        UTF8StreamJsonParser parser = createParser("[true,false,null]");
        parser.nextToken();
        assertEquals(Boolean.TRUE, parser.nextBooleanValue());
        assertEquals(Boolean.FALSE, parser.nextBooleanValue());
        assertNull(parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testNextBooleanValueNonBoolean() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1]");
        parser.nextToken();
        assertNull(parser.nextBooleanValue());
        parser.close();
    }

    @Test
    public void testReleaseBuffered() throws IOException {
        UTF8StreamJsonParser parser = createParser("[1,2,3]");
        parser.nextToken();
        parser.nextToken();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        parser.releaseBuffered(out);
        assertFalse(out.size() == 0); // something was released
        parser.close();
    }

    @Test
    public void testGetInputSource() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        assertNotNull(parser.getInputSource());
        assertTrue(parser.getInputSource() instanceof InputStream);
        parser.close();
    }

    @Test
    public void testGetTokenLocation() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        parser.nextToken();
        JsonLocation loc = parser.getTokenLocation();
        assertNotNull(loc);
        parser.close();
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        parser.nextToken();
        JsonLocation loc = parser.getCurrentLocation();
        assertNotNull(loc);
        parser.close();
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        UTF8StreamJsonParser parser = createParser("[]");
        parser.nextToken();
        parser.close();
        parser.close(); // should not throw
    }

    @Test
    public void testParseNameWithLongName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"averyveryverylongfieldname\":1}");
        parser.nextToken();
        assertEquals("averyveryverylongfieldname", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseNameWithSpecialChars() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\\u0041\":1}");
        parser.nextToken();
        assertEquals("aA", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseNameWithEscapedBackslash() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"a\\\\b\":1}");
        parser.nextToken();
        assertEquals("a\\b", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcd\":1}");
        parser.nextToken();
        assertEquals("abcd", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName2() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcde\":1}");
        parser.nextToken();
        assertEquals("abcde", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName4() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefgh\":1}");
        parser.nextToken();
        assertEquals("abcdefgh", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName5() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghi\":1}");
        parser.nextToken();
        assertEquals("abcdefghi", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName6() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghij\":1}");
        parser.nextToken();
        assertEquals("abcdefghij", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName7() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijk\":1}");
        parser.nextToken();
        assertEquals("abcdefghijk", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName8() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijkl\":1}");
        parser.nextToken();
        assertEquals("abcdefghijkl", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName9() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijklm\":1}");
        parser.nextToken();
        assertEquals("abcdefghijklm", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName10() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijklmn\":1}");
        parser.nextToken();
        assertEquals("abcdefghijklmn", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName11() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijklmnop\":1}");
        parser.nextToken();
        assertEquals("abcdefghijklmnop", parser.nextFieldName());
        parser.close();
    }

    @Test
    public void testParseMediumName12() throws IOException {
        UTF8StreamJsonParser parser = createParser("{\"abcdefghijklmnopqrst\":1}");
        parser.nextToken();
        assertEquals("abcdefghijklmnopqrst", parser.nextFieldName());
        parser.close();
    }
}