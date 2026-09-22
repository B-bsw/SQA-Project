package com.fasterxml.jackson.core.base;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;

public class ParserMinimalBaseTest {

    private static class StubParserMinimalBase extends ParserMinimalBase {
        private LinkedList<JsonToken> tokenQueue = new LinkedList<JsonToken>();
        private boolean closed = false;
        private String currentName;
        private String text;
        private int intVal;
        private long longVal;
        private double doubleVal;
        private Object embeddedObj;
        private boolean eofHandled = false;

        public StubParserMinimalBase() {
            super();
        }

        public StubParserMinimalBase(int features) {
            super(features);
        }

        public void setCurrToken(JsonToken t) {
            this._currToken = t;
        }

        public void queueToken(JsonToken t) {
            this.tokenQueue.add(t);
        }

        public void setTextValue(String s) {
            this.text = s;
        }

        public void setIntValue(int v) {
            this.intVal = v;
        }

        public void setLongValue(long v) {
            this.longVal = v;
        }

        public void setDoubleValue(double v) {
            this.doubleVal = v;
        }

        public void setEmbeddedObject(Object obj) {
            this.embeddedObj = obj;
        }

        public boolean wasEofHandled() {
            return this.eofHandled;
        }

        @Override
        public JsonToken nextToken() throws IOException {
            if (this.tokenQueue.isEmpty()) {
                this._currToken = null;
                return null;
            }
            this._currToken = this.tokenQueue.removeFirst();
            return this._currToken;
        }

        @Override
        protected void _handleEOF() throws JsonParseException {
            this.eofHandled = true;
            throw new JsonParseException("EOF reached", getCurrentLocation());
        }

        @Override
        public String getCurrentName() throws IOException {
            return currentName;
        }

        @Override
        public void overrideCurrentName(String name) {
            this.currentName = name;
        }

        @Override
        public void close() throws IOException {
            this.closed = true;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public String getText() throws IOException {
            return text;
        }

        @Override
        public char[] getTextCharacters() throws IOException {
            return text == null ? null : text.toCharArray();
        }

        @Override
        public boolean hasTextCharacters() {
            return text != null;
        }

        @Override
        public int getTextLength() throws IOException {
            return text == null ? 0 : text.length();
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
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return JsonLocation.NA;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return JsonLocation.NA;
        }

        @Override
        public Number getNumberValue() throws IOException {
            return Integer.valueOf(intVal);
        }

        @Override
        public NumberType getNumberType() throws IOException {
            return NumberType.INT;
        }

        @Override
        public int getIntValue() throws IOException {
            return intVal;
        }

        @Override
        public long getLongValue() throws IOException {
            return longVal;
        }

        @Override
        public BigInteger getBigIntegerValue() throws IOException {
            return BigInteger.valueOf(longVal);
        }

        @Override
        public float getFloatValue() throws IOException {
            return (float) doubleVal;
        }

        @Override
        public double getDoubleValue() throws IOException {
            return doubleVal;
        }

        @Override
        public BigDecimal getDecimalValue() throws IOException {
            return BigDecimal.valueOf(doubleVal);
        }

        @Override
        public Object getEmbeddedObject() throws IOException {
            return embeddedObj;
        }
    }

    @Test
    public void constructors_givenFeatures_shouldInitializeCorrectly() {
        StubParserMinimalBase parserDefault = new StubParserMinimalBase();
        Assert.assertNull(parserDefault.getCurrentToken());
        Assert.assertFalse(parserDefault.hasCurrentToken());

        StubParserMinimalBase parserFeatures = new StubParserMinimalBase(Feature.ALLOW_SINGLE_QUOTES.getMask());
        Assert.assertTrue(parserFeatures.isEnabled(Feature.ALLOW_SINGLE_QUOTES));
        Assert.assertFalse(parserFeatures.isEnabled(Feature.ALLOW_UNQUOTED_CONTROL_CHARS));
    }

    @Test
    public void getCurrentTokenId_givenNullAndValidTokens_shouldReturnExpectedIds() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());

        parser.setCurrToken(JsonToken.VALUE_STRING);
        Assert.assertEquals(JsonTokenId.ID_STRING, parser.getCurrentTokenId());
    }

    @Test
    public void hasTokenId_givenVariousTokens_shouldMatchCorrectly() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_END_ARRAY));
    }

    @Test
    public void hasToken_givenTokens_shouldMatchCorrectly() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertTrue(parser.hasToken(null));
        Assert.assertFalse(parser.hasToken(JsonToken.START_OBJECT));

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertTrue(parser.hasToken(JsonToken.VALUE_TRUE));
        Assert.assertFalse(parser.hasToken(JsonToken.VALUE_FALSE));
    }

    @Test
    public void isExpectedStartArrayToken_givenArrayAndNonArrayTokens_shouldReturnExpectedBoolean() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertFalse(parser.isExpectedStartArrayToken());

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertTrue(parser.isExpectedStartArrayToken());

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void isExpectedStartObjectToken_givenObjectAndNonObjectTokens_shouldReturnExpectedBoolean() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertFalse(parser.isExpectedStartObjectToken());

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertTrue(parser.isExpectedStartObjectToken());

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void nextValue_givenFieldNameNext_shouldSkipFieldNameToNextToken() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        parser.queueToken(JsonToken.FIELD_NAME);
        parser.queueToken(JsonToken.VALUE_STRING);

        JsonToken t = parser.nextValue();
        Assert.assertEquals(JsonToken.VALUE_STRING, t);
    }

    @Test
    public void nextValue_givenScalarNext_shouldReturnDirectly() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        parser.queueToken(JsonToken.VALUE_NUMBER_INT);

        JsonToken t = parser.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, t);
    }

    @Test
    public void skipChildren_givenNonContainerToken_shouldReturnImmediately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        parser.setCurrToken(JsonToken.VALUE_STRING);

        JsonParser result = parser.skipChildren();
        Assert.assertSame(parser, result);
    }

    @Test
    public void skipChildren_givenNestedObject_shouldSkipToEndOfObject() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        parser.setCurrToken(JsonToken.START_OBJECT);
        parser.queueToken(JsonToken.FIELD_NAME);
        parser.queueToken(JsonToken.START_ARRAY);
        parser.queueToken(JsonToken.VALUE_NUMBER_INT);
        parser.queueToken(JsonToken.END_ARRAY);
        parser.queueToken(JsonToken.END_OBJECT);

        JsonParser result = parser.skipChildren();
        Assert.assertSame(parser, result);
        Assert.assertEquals(JsonToken.END_OBJECT, parser.getCurrentToken());
    }

    @Test
    public void skipChildren_givenUnexpectedEof_shouldInvokeHandleEOF() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        parser.setCurrToken(JsonToken.START_OBJECT);
        parser.queueToken(JsonToken.START_ARRAY);

        try {
            parser.skipChildren();
            Assert.fail("Expected JsonParseException on EOF");
        } catch (JsonParseException e) {
            Assert.assertTrue(parser.wasEofHandled());
        }
    }

    @Test
    public void clearCurrentToken_givenSetAndNullToken_shouldTrackLastClearedCorrectly() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        Assert.assertNull(parser.getLastClearedToken());

        parser.clearCurrentToken();
        Assert.assertNull(parser.getLastClearedToken());

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        parser.clearCurrentToken();
        Assert.assertNull(parser.getCurrentToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.getLastClearedToken());

        parser.clearCurrentToken();
        Assert.assertEquals(JsonToken.VALUE_TRUE, parser.getLastClearedToken());
    }

    @Test
    public void getValueAsBoolean_givenVariousTokens_shouldEvaluateAccurately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertTrue(parser.getValueAsBoolean(true));
        Assert.assertFalse(parser.getValueAsBoolean(false));

        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.setTextValue("true");
        Assert.assertTrue(parser.getValueAsBoolean(false));

        parser.setTextValue(" true ");
        Assert.assertTrue(parser.getValueAsBoolean(false));

        parser.setTextValue("false");
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setTextValue(" false ");
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setTextValue("null");
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setTextValue("unrecognized");
        Assert.assertTrue(parser.getValueAsBoolean(true));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValue(1);
        Assert.assertTrue(parser.getValueAsBoolean(false));
        parser.setIntValue(0);
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertTrue(parser.getValueAsBoolean(false));

        parser.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertFalse(parser.getValueAsBoolean(true));

        parser.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Boolean.TRUE);
        Assert.assertTrue(parser.getValueAsBoolean(false));
        parser.setEmbeddedObject("not a boolean");
        Assert.assertTrue(parser.getValueAsBoolean(true));

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertTrue(parser.getValueAsBoolean(true));
    }

    @Test
    public void getValueAsInt_givenVariousTokens_shouldEvaluateAccurately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertEquals(0, parser.getValueAsInt());
        Assert.assertEquals(42, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setIntValue(123);
        Assert.assertEquals(123, parser.getValueAsInt());
        Assert.assertEquals(123, parser.getValueAsInt(99));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setIntValue(456);
        Assert.assertEquals(456, parser.getValueAsInt());
        Assert.assertEquals(456, parser.getValueAsInt(99));

        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.setTextValue("null");
        Assert.assertEquals(0, parser.getValueAsInt(42));

        parser.setTextValue("789");
        Assert.assertEquals(789, parser.getValueAsInt(42));

        parser.setTextValue("not-a-number");
        Assert.assertEquals(42, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Integer.valueOf(321));
        Assert.assertEquals(321, parser.getValueAsInt(42));
        parser.setEmbeddedObject("non-number");
        Assert.assertEquals(42, parser.getValueAsInt(42));

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertEquals(42, parser.getValueAsInt(42));
    }

    @Test
    public void getValueAsLong_givenVariousTokens_shouldEvaluateAccurately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertEquals(0L, parser.getValueAsLong());
        Assert.assertEquals(42L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setLongValue(1234567890123L);
        Assert.assertEquals(1234567890123L, parser.getValueAsLong());
        Assert.assertEquals(1234567890123L, parser.getValueAsLong(99L));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setLongValue(9876543210123L);
        Assert.assertEquals(9876543210123L, parser.getValueAsLong());
        Assert.assertEquals(9876543210123L, parser.getValueAsLong(99L));

        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.setTextValue("null");
        Assert.assertEquals(0L, parser.getValueAsLong(42L));

        parser.setTextValue("123456789");
        Assert.assertEquals(123456789L, parser.getValueAsLong(42L));

        parser.setTextValue("not-a-number");
        Assert.assertEquals(42L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Long.valueOf(55555L));
        Assert.assertEquals(55555L, parser.getValueAsLong(42L));
        parser.setEmbeddedObject("non-number");
        Assert.assertEquals(42L, parser.getValueAsLong(42L));

        parser.setCurrToken(JsonToken.START_ARRAY);
        Assert.assertEquals(42L, parser.getValueAsLong(42L));
    }

    @Test
    public void getValueAsDouble_givenVariousTokens_shouldEvaluateAccurately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertEquals(3.14, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.setTextValue("null");
        Assert.assertEquals(0.0, parser.getValueAsDouble(3.14), 0.0001);

        parser.setTextValue("2.718");
        Assert.assertEquals(2.718, parser.getValueAsDouble(3.14), 0.0001);

        parser.setTextValue("bad-double");
        Assert.assertEquals(3.14, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setDoubleValue(10.0);
        Assert.assertEquals(10.0, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_NUMBER_FLOAT);
        parser.setDoubleValue(20.5);
        Assert.assertEquals(20.5, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_TRUE);
        Assert.assertEquals(1.0, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_FALSE);
        Assert.assertEquals(0.0, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertEquals(0.0, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.VALUE_EMBEDDED_OBJECT);
        parser.setEmbeddedObject(Double.valueOf(99.9));
        Assert.assertEquals(99.9, parser.getValueAsDouble(3.14), 0.0001);
        parser.setEmbeddedObject("not-number");
        Assert.assertEquals(3.14, parser.getValueAsDouble(3.14), 0.0001);

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertEquals(3.14, parser.getValueAsDouble(3.14), 0.0001);
    }

    @Test
    public void getValueAsString_givenVariousTokens_shouldEvaluateAccurately() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("def", parser.getValueAsString("def"));

        parser.setCurrToken(JsonToken.VALUE_STRING);
        parser.setTextValue("sample");
        Assert.assertEquals("sample", parser.getValueAsString());
        Assert.assertEquals("sample", parser.getValueAsString("def"));

        parser.setCurrToken(JsonToken.VALUE_NULL);
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("def", parser.getValueAsString("def"));

        parser.setCurrToken(JsonToken.START_OBJECT);
        Assert.assertNull(parser.getValueAsString());
        Assert.assertEquals("def", parser.getValueAsString("def"));

        parser.setCurrToken(JsonToken.VALUE_NUMBER_INT);
        parser.setTextValue("100");
        Assert.assertEquals("100", parser.getValueAsString());
        Assert.assertEquals("100", parser.getValueAsString("def"));
    }

    @Test
    public void _decodeBase64_givenValidAndInvalidInputs_shouldBehaveProperly() throws IOException {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        ByteArrayBuilder builder = new ByteArrayBuilder();

        parser._decodeBase64("c3VyZQ==", builder, Base64Variants.MIME);
        byte[] result = builder.toByteArray();
        Assert.assertEquals("sure", new String(result, "US-ASCII"));

        try {
            parser._decodeBase64("!@#$%", builder, Base64Variants.MIME);
            Assert.fail("Expected JsonParseException for invalid base64");
        } catch (JsonParseException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void _reportInvalidBase64_givenDifferentCharacters_shouldConstructAccurateMessages() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        Base64Variant b64 = Base64Variants.MIME;

        try {
            parser._reportInvalidBase64(b64, ' ', 0, null);
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal white space character") != -1);
        }

        try {
            parser._reportInvalidBase64(b64, '=', 1, "test-msg");
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected padding character") != -1);
            Assert.assertTrue(e.getMessage().indexOf("test-msg") != -1);
        }

        try {
            parser._reportInvalidBase64(b64, (char) 0x01, 2, null);
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal character (code 0x1)") != -1);
        }

        try {
            parser._reportInvalidBase64(b64, '?', 2, "msg");
            Assert.fail("Expected exception");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal character '?'") != -1);
            Assert.assertTrue(e.getMessage().indexOf("msg") != -1);
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void _reportBase64EOF_always_shouldThrowExpectedMessage() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        try {
            parser._reportBase64EOF();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-String in base64 content") != -1);
        }
    }

    @Test
    public void _reportUnexpectedChar_givenVariousCharsAndComments_shouldThrowAccurateException() {
        StubParserMinimalBase parser = new StubParserMinimalBase();

        try {
            parser._reportUnexpectedChar(-1, null);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-input") != -1);
        }

        try {
            parser._reportUnexpectedChar('x', "extra details");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected character ('x' (code 120)): extra details") != -1);
        }

        try {
            parser._reportUnexpectedChar('z', null);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected character ('z' (code 122))") != -1);
        }
    }

    @Test
    public void _reportInvalidEOFInValue_always_shouldIncludeInValueInMessage() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        try {
            parser._reportInvalidEOFInValue();
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unexpected end-of-input in a value") != -1);
        }
    }

    @Test
    public void _reportMissingRootWS_always_shouldIncludeExpectedComment() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        try {
            parser._reportMissingRootWS('a');
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Expected space separating root-level values") != -1);
        }
    }

    @Test
    public void _throwInvalidSpace_always_shouldReportSpaceError() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        try {
            parser._throwInvalidSpace(12);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("only regular white space") != -1);
        }
    }

    @Test
    public void _throwUnquotedSpace_givenAllowedAndDisallowedSettings_shouldBehaveAccordingly() throws JsonParseException {
        StubParserMinimalBase parserNoAllow = new StubParserMinimalBase(0);
        try {
            parserNoAllow._throwUnquotedSpace('\t', "string value");
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal unquoted character") != -1);
            Assert.assertTrue(e.getMessage().indexOf("string value") != -1);
        }

        StubParserMinimalBase parserAllow = new StubParserMinimalBase(Feature.ALLOW_UNQUOTED_CONTROL_CHARS.getMask());
        parserAllow._throwUnquotedSpace('\t', "string value");

        try {
            parserAllow._throwUnquotedSpace(0x0021, "string value");
            Assert.fail("Expected JsonParseException for char > INT_SPACE");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Illegal unquoted character") != -1);
        }
    }

    @Test
    public void _handleUnrecognizedCharacterEscape_givenFeatureConfigs_shouldReturnOrThrow() throws Exception {
        StubParserMinimalBase parserDefault = new StubParserMinimalBase(0);
        try {
            parserDefault._handleUnrecognizedCharacterEscape('z');
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized character escape") != -1);
        }

        StubParserMinimalBase parserEscapeAny = new StubParserMinimalBase(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.getMask());
        char resAny = parserEscapeAny._handleUnrecognizedCharacterEscape('z');
        Assert.assertEquals('z', resAny);

        StubParserMinimalBase parserSingleQuote = new StubParserMinimalBase(Feature.ALLOW_SINGLE_QUOTES.getMask());
        char resQuote = parserSingleQuote._handleUnrecognizedCharacterEscape('\'');
        Assert.assertEquals('\'', resQuote);

        try {
            parserSingleQuote._handleUnrecognizedCharacterEscape('q');
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unrecognized character escape") != -1);
        }
    }

    @Test
    public void _getCharDesc_givenAsciiControlAndUnicode_shouldFormatAccurately() {
        Assert.assertEquals("(CTRL-CHAR, code 0)", ParserMinimalBase._getCharDesc(0));
        Assert.assertEquals("(CTRL-CHAR, code 10)", ParserMinimalBase._getCharDesc('\n'));
        Assert.assertEquals("'a' (code 97)", ParserMinimalBase._getCharDesc('a'));
        Assert.assertEquals("'\u0100' (code 256 / 0x100)", ParserMinimalBase._getCharDesc(256));
    }

    @Test
    public void _wrapError_givenMessageAndCause_shouldContainBoth() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        Throwable cause = new RuntimeException("Original root cause");
        try {
            parser._wrapError("Wrapped context", cause);
            Assert.fail("Expected JsonParseException");
        } catch (JsonParseException e) {
            Assert.assertTrue(e.getMessage().indexOf("Wrapped context") != -1);
            Assert.assertEquals(cause, e.getCause());
        }
    }

    @Test
    public void _throwInternal_always_shouldThrowInternalException() {
        StubParserMinimalBase parser = new StubParserMinimalBase();
        try {
            parser._throwInternal();
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().indexOf("Internal error") != -1);
        }
    }

    @Test
    public void _asciiBytesAndAsciiString_givenAsciiInput_shouldConvertBidirectionally() {
        String input = "Hello Jackson 123 !@#";
        byte[] bytes = ParserMinimalBase._asciiBytes(input);
        Assert.assertEquals(input.length(), bytes.length);
        String restored = ParserMinimalBase._ascii(bytes);
        Assert.assertEquals(input, restored);
    }
}