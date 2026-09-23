package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.io.StringWriter;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import java.util.regex.Pattern;

public class ParserMinimalBaseTest {

    private TestParser parser;
    private final static String TEST_JSON = "{\"field\":123,\"str\":\"value\",\"arr\":[1,2,3]}";

    @Before
    public void setUp() throws Exception {
        parser = new TestParser();
    }

    @After
    public void tearDown() throws Exception {
        parser = null;
    }

    // Test class implementing abstract methods of ParserMinimalBase
    private static class TestParser extends ParserMinimalBase {
        private JsonToken token;
        private final String text;
        private int index = 0;
        private final TestToken[] tokens;
        private StringBuilder binaryContent;

        TestParser() {
            this.tokens = new TestToken[0];
            this.text = null;
        }

        TestParser(TestToken[] tokens, String text) {
            this.tokens = tokens;
            this.text = text;
        }

        TestParser(JsonToken[] tokenArray) {
            this.tokens = new TestToken[tokenArray.length];
            for (int i = 0; i < tokenArray.length; i++) {
                this.tokens[i] = new TestToken(tokenArray[i], i);
            }
            this.text = null;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (index < tokens.length) {
                _currToken = tokens[index++].token;
                return _currToken;
            }
            _currToken = null;
            return null;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            throw new JsonParseException("EOF", JsonLocation.NA);
        }

        @Override
        public String getCurrentName() throws IOException {
            if (_currToken == JsonToken.FIELD_NAME && index > 0) {
                return "field";
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            // no-op
        }

        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public void overrideCurrentName(String name) {
            // no-op
        }

        @Override
        public String getText() throws IOException {
            return text != null ? text : "test";
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            String t = getText();
            return t.toCharArray();
        }

        @Override
        public boolean hasTextCharacters() {
            return false;
        }

        @Override
        public int getTextLength() throws IOException {
            return getText().length();
        }

        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            return binaryContent != null ? binaryContent.toString().getBytes() : new byte[0];
        }

        @Override
        public JsonLocation getTokenLocation() {
            return JsonLocation.NA;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return JsonLocation.NA;
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        private static class TestToken {
            JsonToken token;
            int index;
            TestToken(JsonToken token, int index) {
                this.token = token;
                this.index = index;
            }
        }
    }

    // Test additional methods of ParserMinimalBase
    @Test
    public void testGetCurrentTokenId() {
        parser._currToken = JsonToken.START_OBJECT;
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
        parser._currToken = null;
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testHasCurrentToken() {
        assertFalse(parser.hasCurrentToken());
        parser._currToken = JsonToken.VALUE_NULL;
        assertTrue(parser.hasCurrentToken());
        parser.clearCurrentToken();
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testHasTokenId() {
        parser._currToken = JsonToken.FIELD_NAME;
        assertTrue(parser.hasTokenId(JsonTokenId.ID_FIELD_NAME));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_VALUE_STRING));
        parser._currToken = null;
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void testHasToken() {
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.hasToken(JsonToken.START_ARRAY));
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayToken() {
        assertFalse(parser.isExpectedStartArrayToken());
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.isExpectedStartArrayToken());
        parser._currToken = JsonToken.START_OBJECT;
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectToken() {
        assertFalse(parser.isExpectedStartObjectToken());
        parser._currToken = JsonToken.START_OBJECT;
        assertTrue(parser.isExpectedStartObjectToken());
        parser._currToken = JsonToken.START_ARRAY;
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testNextValue() throws IOException {
        TestToken[] tokens = new TestToken[] {
            new TestToken(JsonToken.FIELD_NAME, 0),
            new TestToken(JsonToken.VALUE_NUMBER_INT, 1)
        };
        TestParser p = new TestParser(tokens, null);
        p._currToken = JsonToken.FIELD_NAME;
        assertEquals(JsonToken.VALUE_NUMBER_INT, p.nextValue());
    }

    @Test
    public void testGetValueAsBoolean() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals(true, parser.getValueAsBoolean(true));
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(true, parser.getValueAsBoolean(true));
        parser._currToken = null;
        assertEquals(true, parser.getValueAsBoolean(true));
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(true, parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals(123, parser.getValueAsInt(0));
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        assertEquals(5, parser.getValueAsInt(5));
        parser._currToken = null;
        assertEquals(10, parser.getValueAsInt(10));
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(0, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsLong() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals(123L, parser.getValueAsLong(0L));
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        assertEquals(5L, parser.getValueAsLong(5L));
        parser._currToken = null;
        assertEquals(10L, parser.getValueAsLong(10L));
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(0L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals("test", parser.getValueAsString());
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertEquals("default", parser.getValueAsString("default"));
        parser._currToken = null;
        assertEquals("default", parser.getValueAsString("default"));
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testClearCurrentToken() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.clearCurrentToken();
        assertNull(parser._currToken);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.getLastClearedToken());
    }

    @Test(expected = JsonParseException.class)
    public void testReportUnexpectedChar() throws Exception {
        parser._reportUnexpectedChar('x', "test comment");
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOF() throws Exception {
        parser._reportInvalidEOF();
    }

    @Test(expected = JsonParseException.class)
    public void testReportInvalidEOFInValue() throws Exception {
        parser._reportInvalidEOFInValue();
    }

    @Test(expected = JsonParseException.class)
    public void testReportMissingRootWS() throws Exception {
        parser._reportMissingRootWS(0);
    }

    @Test
    public void testThrowUnquotedSpace() throws Exception {
        try {
            parser._throwUnquotedSpace(0, "test");
            fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected
        }
    }

    @Test
    public void testHasTextualNull() {
        assertTrue(parser._hasTextualNull("null"));
        assertFalse(parser._hasTextualNull("NULL"));
        assertFalse(parser._hasTextualNull(null));
    }

    @Test
    public void testGetValueAsDouble() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        assertEquals(1.5, parser.getValueAsDouble(0.0), 0.001);
        parser._currToken = JsonToken.VALUE_STRING;
        assertEquals(2.5, parser.getValueAsDouble(2.5), 0.001);
        parser._currToken = null;
        assertEquals(1.0, parser.getValueAsDouble(1.0), 0.001);
    }

    @Test
    public void testSkipChildren() throws Exception {
        // Test simple non-struct token
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertSame(parser, parser.skipChildren());
        
        // Test struct start with single nesting
        TestToken[] tokens = new TestToken[] {
            new TestToken(JsonToken.START_OBJECT, 0),
            new TestToken(JsonToken.END_OBJECT, 1)
        };
        TestParser p = new TestParser(tokens, null);
        p._currToken = JsonToken.START_OBJECT;
        p.skipChildren();
        assertNull(p.getCurrentToken());
    }

    @Test
    public void testDecodeBase64() throws Exception {
        // Test valid base64 string
        ByteArrayBuilder builder = new ByteArrayBuilder();
        Base64Variant b64 = Base64Variants.MIME_NO_LINEFEEDS;
        parser._decodeBase64("aGVsbG8=", builder, b64);
        
        // Test invalid base64 character
        try {
            builder = new ByteArrayBuilder();
            parser._decodeBase64("!!!", builder, b64);
            fail("Should throw JsonParseException");
        } catch (JsonParseException e) {
            // expected - illegal character
        }
    }

    @Test
    public void testHandleUnrecognizedCharacterEscape() throws Exception {
        char result = parser._handleUnrecognizedCharacterEscape('x');
        assertEquals('x', result);
    }

    @Test
    public void testGetLastClearedTokenInitial() {
        assertNull(parser.getLastClearedToken());
    }

    @Test
    public void testGetCurrentTokenInitialNull() {
        assertNull(parser.getCurrentToken());
    }

    @Test
    public void testClearCurrentTokenWhenNull() throws Exception {
        parser._currToken = null;
        parser.clearCurrentToken();
        assertNull(parser.getLastClearedToken());
        assertNull(parser.getCurrentToken());
    }
}