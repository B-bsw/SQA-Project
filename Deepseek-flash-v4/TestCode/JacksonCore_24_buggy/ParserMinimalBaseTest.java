package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.json.JsonReadContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class ParserMinimalBaseTest {
    private TestParserMinimalBase parser;

    @Before
    public void setUp() {
        parser = new TestParserMinimalBase();
    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void testCurrentTokenInitialState() {
        assertNull(parser.getCurrentToken());
        assertEquals(0, parser.getCurrentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertFalse(parser.hasTokenId(JsonTokenId.ID_FIELD_NAME));
        assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testClearCurrentToken() {
        parser._currToken = JsonToken.VALUE_STRING;
        parser._lastClearedToken = JsonToken.VALUE_STRING;
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.VALUE_STRING, parser.getLastClearedToken());
        assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testCurrentTokenIdWithNull() {
        parser._currToken = null;
        assertEquals(0, parser.getCurrentTokenId());
    }

    @Test
    public void testHasTokenIdWithValue() {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertTrue(parser.hasTokenId(JsonToken.VALUE_TRUE.id()));
        assertTrue(parser.hasTokenId(JsonTokenId.ID_TRUE));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_FALSE));
    }

    @Test
    public void testHasToken() {
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.hasToken(JsonToken.START_ARRAY));
        assertFalse(parser.hasToken(JsonToken.END_ARRAY));
    }

    @Test
    public void testIsExpectedStartArrayToken() {
        parser._currToken = JsonToken.START_ARRAY;
        assertTrue(parser.isExpectedStartArrayToken());
        parser._currToken = JsonToken.START_OBJECT;
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectToken() {
        parser._currToken = JsonToken.START_OBJECT;
        assertTrue(parser.isExpectedStartObjectToken());
        parser._currToken = JsonToken.START_ARRAY;
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testNextValueWithFieldName() throws IOException {
        parser._currToken = JsonToken.FIELD_NAME;
        parser.nextTokenResult = JsonToken.VALUE_STRING;
        assertEquals(JsonToken.VALUE_STRING, parser.nextValue());
        assertEquals(1, parser.nextTokenCount);
    }

    @Test
    public void testSkipChildrenWithNullToken() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertSame(parser, parser.skipChildren());
    }

    @Test
    public void testSkipChildrenWithStartObject() throws IOException {
        parser._currToken = JsonToken.START_OBJECT;
        parser._parsingContext = new TestJsonStreamContext();
        assertSame(parser, parser.skipChildren());
    }

    @Test
    public void testSkipChildrenWithStartArray() throws IOException {
        parser._currToken = JsonToken.START_ARRAY;
        parser._parsingContext = new TestJsonStreamContext();
        assertSame(parser, parser.skipChildren());
    }

    @Test
    public void testGetValueAsBooleanString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "true";
        assertTrue(parser.getValueAsBoolean(false));
        parser.textValue = "false";
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNull() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanNumberInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.intValue = 1;
        assertTrue(parser.getValueAsBoolean(false));
        parser.intValue = 0;
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanTrueFalse() throws IOException {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertTrue(parser.getValueAsBoolean(false));
        parser._currToken = JsonToken.VALUE_FALSE;
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanEmbedded() throws IOException {
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = Boolean.TRUE;
        assertTrue(parser.getValueAsBoolean(false));
        parser.embeddedObject = Boolean.FALSE;
        assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsBooleanDefault() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "notBoolean";
        assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsIntCurrentTokenNumberInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.intValue = 42;
        assertEquals(42, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntNumberFloat() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser.intValue = 10;
        assertEquals(10, parser.getValueAsInt());
    }

    @Test
    public void testGetValueAsIntDefault() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(5, parser.getValueAsInt(5));
    }

    @Test
    public void testGetValueAsIntString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "123";
        assertEquals(123, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntStringNullText() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "null";
        assertEquals(0, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntTrue() throws IOException {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsIntFalse() throws IOException {
        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0, parser.getValueAsInt(9));
    }

    @Test
    public void testGetValueAsIntEmbedded() throws IOException {
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = new Integer(77);
        assertEquals(77, parser.getValueAsInt(0));
    }

    @Test
    public void testGetValueAsLongCurrentTokenNumberInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.longValue = 100L;
        assertEquals(100L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongNumberFloat() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser.longValue = 200L;
        assertEquals(200L, parser.getValueAsLong());
    }

    @Test
    public void testGetValueAsLongDefault() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(7L, parser.getValueAsLong(7L));
    }

    @Test
    public void testGetValueAsLongString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "1234567890";
        assertEquals(1234567890L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongTrue() throws IOException {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsLongEmbedded() throws IOException {
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = new Long(56L);
        assertEquals(56L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsDoubleDefault() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals(1.5, parser.getValueAsDouble(1.5), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleString() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "3.14";
        assertEquals(3.14, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleNumberFloat() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser.doubleValue = 2.5;
        assertEquals(2.5, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleNumberInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.doubleValue = 3.0;
        assertEquals(3.0, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleTrue() throws IOException {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals(1.0, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleFalse() throws IOException {
        parser._currToken = JsonToken.VALUE_FALSE;
        assertEquals(0.0, parser.getValueAsDouble(5.0), 0.0001);
    }

    @Test
    public void testGetValueAsDoubleEmbedded() throws IOException {
        parser._currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        parser.embeddedObject = new Double(9.5);
        assertEquals(9.5, parser.getValueAsDouble(0.0), 0.0001);
    }

    @Test
    public void testGetValueAsStringWithStringToken() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.textValue = "hello";
        assertEquals("hello", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithFieldName() throws IOException {
        parser._currToken = JsonToken.FIELD_NAME;
        parser.currentName = "myField";
        assertEquals("myField", parser.getValueAsString());
    }

    @Test
    public void testGetValueAsStringWithNullToken() throws IOException {
        parser._currToken = null;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringWithNullValueToken() throws IOException {
        parser._currToken = JsonToken.VALUE_NULL;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringWithOtherToken() throws IOException {
        parser._currToken = JsonToken.VALUE_TRUE;
        assertEquals("true", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringWithOtherTokenNumber() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser.textValue = "42";
        assertEquals("42", parser.getValueAsString("default"));
    }

    @Test
    public void testGetValueAsStringWithNonScalar() throws IOException {
        parser._currToken = JsonToken.START_OBJECT;
        assertEquals("default", parser.getValueAsString("default"));
    }

    @Test
    public void testHasTextualNull() {
        assertTrue(parser.hasTextualNull("null"));
        assertFalse(parser.hasTextualNull("not-null"));
        assertFalse(parser.hasTextualNull(null));
    }

    @Test
    public void testReportInvalidNumber() throws IOException {
        try {
            parser.reportInvalidNumber("Invalid number");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertEquals("Invalid number", e.getMessage());
        }
    }

    @Test
    public void testReportInvalidNumberWithSpace() throws IOException {
        try {
            parser.reportInvalidNumber("123 abc");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("Invalid number"));
        }
    }

    @Test
    public void testReportInvalidInt() throws IOException {
        try {
            parser.reportInvalidInt();
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testReportInvalidIntWithNumber() throws IOException {
        try {
            parser.reportInvalidInt("12345678901");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testReportInvalidIntForLargeNumber() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('1');
        }
        try {
            parser.reportInvalidInt(sb.toString());
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of int"));
        }
    }

    @Test
    public void testReportInvalidLong() throws IOException {
        try {
            parser.reportInvalidLong();
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testReportInvalidLongWithNumber() throws IOException {
        try {
            parser.reportInvalidLong("999999999999999999999999");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testReportInvalidLongForLargeNumber() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append('9');
        }
        try {
            parser.reportInvalidLong(sb.toString());
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("out of range of long"));
        }
    }

    @Test
    public void testReportInputCoercionWithString() throws IOException {
        try {
            parser.reportInputCoercion("Coercion error", JsonToken.VALUE_STRING, Integer.class);
            fail("Should have thrown InputCoercionException");
        } catch (InputCoercionException e) {
            assertEquals("Coercion error", e.getMessage());
        }
    }

    @Test
    public void testReportInputCoercionWithNumberInt() throws IOException {
        try {
            parser.reportInputCoercion("Coercion error", JsonToken.VALUE_NUMBER_INT, Long.class);
            fail("Should have thrown InputCoercionException");
        } catch (InputCoercionException e) {
            assertEquals("Coercion error", e.getMessage());
        }
    }

    @Test
    public void testReportInputCoercionWithNumberFloat() throws IOException {
        try {
            parser.reportInputCoercion("Coercion error", JsonToken.VALUE_NUMBER_FLOAT, Double.class);
            fail("Should have thrown InputCoercionException");
        } catch (InputCoercionException e) {
            assertEquals("Coercion error", e.getMessage());
        }
    }

    @Test
    public void testReportInputCoercionWithOtherType() throws IOException {
        try {
            parser.reportInputCoercion("Coercion error", JsonToken.START_OBJECT, Boolean.class);
            fail("Should have thrown InputCoercionException");
        } catch (InputCoercionException e) {
            assertEquals("Coercion error", e.getMessage());
        }
    }

    @Test
    public void testReportUnexpectedCharControl() throws IOException {
        try {
            parser.reportUnexpectedChar('\t', "Unexpected control char");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("CTRL-CHAR"));
        }
    }

    @Test
    public void testReportUnexpectedCharHighChar() throws IOException {
        try {
            parser.reportUnexpectedChar('\u0100', "Unexpected high char");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("code 256"));
        }
    }

    @Test
    public void testReportUnexpectedCharNormal() throws IOException {
        try {
            parser.reportUnexpectedChar('x', "Unexpected normal char");
            fail("Should have thrown JsonParseException");
        } catch (JsonParseException e) {
            assertTrue(e.getMessage().contains("'x' (code 120)"));
        }
    }

    @Test
    public void testReportUnexpectedEndOfInput() throws IOException {
        try {
            parser.reportUnexpectedEndOfInput(" in a value");
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertEquals("Unexpected end-of-input in a value", e.getMessage());
        }
    }

    @Test
    public void testReportUnexpectedEndOfInputWithNullToken() throws IOException {
        parser._currToken = null;
        try {
            parser.reportUnexpectedEndOfInput(" in a value");
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertEquals("Unexpected end-of-input in a value", e.getMessage());
        }
    }

    @Test
    public void testReportInvalidEOFInValue() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        parser.expectEof = true;
        try {
            parser.reportInvalidEOF();
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertEquals("Unexpected end-of-input in a String value", e.getMessage());
        }
    }

    @Test
    public void testReportInvalidEOFFieldName() throws IOException {
        parser._currToken = JsonToken.FIELD_NAME;
        parser.expectEof = true;
        try {
            parser.reportInvalidEOF();
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertEquals("Unexpected end-of-input in a value", e.getMessage());
        }
    }

    @Test
    public void testReportInvalidEOFGeneral() throws IOException {
        parser._currToken = JsonToken.VALUE_FALSE;
        parser.expectEof = true;
        try {
            parser.reportInvalidEOF();
            fail("Should have thrown JsonEOFException");
        } catch (JsonEOFException e) {
            assertEquals("Unexpected end-of-input in a value", e.getMessage());
        }
    }

    @Test
    public void testNumericDescShort() {
        assertEquals("123", parser.numericDesc("123"));
    }

    @Test
    public void testNumericDescLong() {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < 999; i++) {
            sb.append('0');
        }
        String num = sb.toString();
        String result = parser.numericDesc(num);
        assertTrue(result.startsWith("[Integer with "));
        assertTrue(result.endsWith(" digits]"));
    }

    @Test
    public void testNumericDescLongFloat() {
        StringBuilder sb = new StringBuilder("1.0");
        for (int i = 0; i < 1000; i++) {
            sb.append('0');
        }
        String num = sb.toString();
        String result = parser.numericDesc(num);
        assertTrue(result.startsWith("[number with "));
        assertTrue(result.endsWith(" characters]"));
    }

    private static class TestParserMinimalBase extends ParserMinimalBase {
        String textValue;
        String currentName;
        int intValue;
        long longValue;
        double doubleValue;
        Object embeddedObject;
        boolean expectEof;
        JsonToken nextTokenResult;
        int nextTokenCount;
        JsonStreamContext _parsingContext;

        @Override
        public JsonToken nextToken() throws IOException {
            nextTokenCount++;
            return nextTokenResult;
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentName;
        }

        @Override
        public void close() throws IOException {
        }

        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return _parsingContext;
        }

        @Override
        public void overrideCurrentName(String name) {
        }

        @Override
        public String getText() throws IOException {
            return textValue;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return textValue != null ? textValue.toCharArray() : null;
        }

        @Override
        public boolean hasTextCharacters() {
            return textValue != null;
        }

        @Override
        public int getTextLength() throws IOException {
            return textValue != null ? textValue.length() : 0;
        }

        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant b64variant) throws IOException {
            return new byte[0];
        }

        @Override
        public int getIntValue() throws IOException {
            return intValue;
        }

        @Override
        public long getLongValue() throws IOException {
            return longValue;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return doubleValue;
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return embeddedObject;
        }

        @Override
        protected void _reportInvalidEOF(String msg) throws JsonEOFException {
            if (expectEof) {
                throw new JsonEOFException(this, _currToken, "Unexpected end-of-input" + msg);
            }
            throw new JsonEOFException(this, null, "Unexpected end-of-input" + msg);
        }

        @Override
        protected void _reportUnexpectedChar(int ch, String comment) throws JsonParseException {
            String msg = "Unexpected character (" + _getCharDesc(ch) + ")";
            if (comment != null) {
                msg += ": " + comment;
            }
            throw new JsonParseException(this, msg);
        }

        @Override
        protected void reportInvalidNumber(String msg) throws JsonParseException {
            throw new JsonParseException(this, msg);
        }

        @Override
        protected void reportInvalidInt() throws JsonParseException {
            reportInvalidInt(_longIntegerDesc(String.valueOf(intValue)));
        }

        @Override
        protected void reportInvalidInt(String numDesc) throws JsonParseException {
            _reportError(String.format("Numeric value (%s) out of range of int (%d - %s)",
                    _longIntegerDesc(numDesc), Integer.MIN_VALUE, Integer.MAX_VALUE));
        }

        @Override
        protected void reportInvalidLong() throws JsonParseException {
            reportInvalidLong(String.valueOf(longValue));
        }

        @Override
        protected void reportInvalidLong(String numDesc) throws JsonParseException {
            _reportError(String.format("Numeric value (%s) out of range of long (%d - %s)",
                    _longIntegerDesc(numDesc), Long.MIN_VALUE, Long.MAX_VALUE));
        }

        private void _reportError(String msg) throws JsonParseException {
            throw new JsonParseException(this, msg);
        }
    }

    private static class TestJsonStreamContext extends JsonStreamContext {
        TestJsonStreamContext() {
            super();
        }

        @Override
        public Object getCurrentValue() {
            return null;
        }

        @Override
        public void setCurrentValue(Object v) {
        }

        @Override
        public JsonStreamContext getParent() {
            return null;
        }

        @Override
        public String getCurrentName() {
            return null;
        }

        @Override
        public boolean hasCurrentName() {
            return false;
        }

        @Override
        public JsonLocation getStartLocation(Object srcRef) {
            return null;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }
    }
}