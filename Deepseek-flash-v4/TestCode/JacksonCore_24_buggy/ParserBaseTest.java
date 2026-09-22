package com.fasterxml.jackson.core.base;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;

public class ParserBaseTest {

    private static class TestParserBase extends ParserBase {
        private final IOContext ioContext;
        
        protected TestParserBase(IOContext ctxt, int features) {
            super(ctxt, features);
            this.ioContext = ctxt;
            
        }
        
        @Override
        protected void _closeInput() throws IOException {
            
        }
        
        @Override
        protected void _releaseBuffers() throws IOException {
            
        }
        
        @Override
        protected boolean loadMore() throws IOException {
            return false;
        }
        
        @Override
        public JsonToken nextToken() throws IOException {
            return null;
        }
        
        @Override
        public String getText() throws IOException {
            return null;
        }
        
        @Override
        public char[] getTextCharacters() throws IOException {
            return null;
        }
        
        @Override
        public int getTextLength() throws IOException {
            return 0;
        }
        
        @Override
        public int getTextOffset() throws IOException {
            return 0;
        }
        
        @Override
        public void setCurrentValue(Object v) {
            super.setCurrentValue(v);
        }
        
        @Override
        public Object getCurrentValue() {
            return super.getCurrentValue();
        }
        
        @Override
        protected void _reportInvalidEOF(String msg, Object... args) throws JsonParseException {
            super._reportInvalidEOF(msg, args);
        }
        
        @Override
        protected void _reportError(String msg, Object... args) throws JsonParseException {
            super._reportError(msg, args);
        }
        
        @Override
        protected void _wrapError(String msg, Throwable t) throws JsonParseException {
            super._wrapError(msg, t);
        }
        
        @Override
        protected String _getSourceReference() {
            return "test-source";
        }
    }

    private IOContext ioContext;
    private TestParserBase parser;
    private static final int DEFAULT_FEATURES = 0;

    @Before
    public void setUp() throws IOException {
        ioContext = new IOContext(JsonParser.Feature.collectDefaults(), null, null, null, null, 0);
        parser = new TestParserBase(ioContext, DEFAULT_FEATURES);
        parser._currInputRow = 1;
        parser._currInputRowStart = 0;
        parser._inputPtr = 0;
        parser._inputEnd = 0;
        parser._currInputProcessed = 0;
    }

    @Test
    public void testConstructorInitializesFields() {
        assertNotNull(parser._ioContext);
        assertNotNull(parser._textBuffer);
        assertNotNull(parser._parsingContext);
        assertFalse(parser._closed);
        assertEquals(1, parser._currInputRow);
        assertEquals(0, parser._currInputRowStart);
        assertEquals(0, parser._inputPtr);
        assertEquals(0, parser._inputEnd);
        assertEquals(0L, parser._currInputProcessed);
        assertEquals(1, parser._tokenInputRow);
        assertEquals(0, parser._tokenInputCol);
        assertEquals(0L, parser._tokenInputTotal);
    }

    @Test
    public void testVersion() {
        assertNotNull(parser.version());
        assertTrue(parser.version().toString().contains("2."));
    }

    @Test
    public void testGetCurrentValueInitialNull() {
        assertNull(parser.getCurrentValue());
    }

    @Test
    public void testSetAndGetCurrentValue() {
        Object value = new Object();
        parser.setCurrentValue(value);
        assertSame(value, parser.getCurrentValue());
        
        String strValue = "test";
        parser.setCurrentValue(strValue);
        assertSame(strValue, parser.getCurrentValue());
    }

    @Test
    public void testEnableFeature() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        assertNotNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testDisableFeature() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        parser.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        assertNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testSetFeatureMask() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        int mask = parser.getFeatureMask();
        parser.setFeatureMask(0);
        assertEquals(0, parser.getFeatureMask());
        parser.setFeatureMask(mask);
        assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testOverrideStdFeatures() {
        int mask = Feature.STRICT_DUPLICATE_DETECTION.getMask();
        parser.overrideStdFeatures(mask, mask);
        assertTrue(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
        parser.overrideStdFeatures(0, mask);
        assertFalse(parser.isEnabled(Feature.STRICT_DUPLICATE_DETECTION));
    }

    @Test
    public void testGetCurrentNameInitial() {
        try {
            assertNull(parser.getCurrentName());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testCloseAndIsClosed() throws IOException {
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testCloseMultipleTimes() throws IOException {
        parser.close();
        parser.close();
        assertTrue(parser.isClosed());
    }

    @Test
    public void testGetParsingContextInitial() {
        JsonReadContext context = parser.getParsingContext();
        assertNotNull(context);
        assertTrue(context.inRoot());
    }

    @Test
    public void testGetTokenLocationWhenNullToken() {
        parser._currToken = null;
        JsonLocation location = parser.getTokenLocation();
        assertNotNull(location);
        assertEquals(-1L, location.getCharOffset());
        assertEquals(0L, location.getLineNr());
    }

    @Test
    public void testGetCurrentLocation() {
        parser._inputPtr = 5;
        parser._currInputRowStart = 2;
        parser._currInputRow = 3;
        parser._currInputProcessed = 10;
        JsonLocation location = parser.getCurrentLocation();
        assertNotNull(location);
        assertEquals(15L, location.getCharOffset());
        assertEquals(3, location.getLineNr());
        assertEquals(4, location.getColumnNr());
    }

    @Test
    public void testHasTextCharactersForStringToken() {
        parser._currToken = JsonToken.VALUE_STRING;
        assertTrue(parser.hasTextCharacters());
    }

    @Test
    public void testHasTextCharactersForOtherToken() {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        assertFalse(parser.hasTextCharacters());
        parser._currToken = null;
        assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetBinaryValueWhenNotStringToken() {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        try {
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            fail("Expected exception for non-string token");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGetBinaryValueCachesResult() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        Base64Variant variant = Base64Variants.getDefaultVariant();
        try {
            byte[] result = parser.getBinaryValue(variant);
            assertNotNull(result);
            assertSame(result, parser.getBinaryValue(variant));
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetTokenLocationWithNull() {
        parser._currToken = null;
        JsonLocation loc = parser.getTokenLocation();
        assertEquals(-1L, loc.getCharOffset());
    }

    @Test
    public void testGetTokenLocationWithToken() {
        parser._currToken = JsonToken.START_OBJECT;
        parser._tokenInputTotal = 100L;
        parser._tokenInputRow = 5;
        parser._tokenInputCol = 10;
        JsonLocation loc = parser.getTokenLocation();
        assertEquals(100L, loc.getCharOffset());
        assertEquals(5, loc.getLineNr());
        assertEquals(10, loc.getColumnNr());
    }

    @Test
    public void testGetTokenCharacterOffset() {
        parser._tokenInputTotal = 42L;
        assertEquals(42L, parser.getTokenCharacterOffset());
    }

    @Test
    public void testGetTokenLineNr() {
        parser._tokenInputRow = 7;
        assertEquals(7, parser.getTokenLineNr());
    }

    @Test
    public void testGetTokenColumnNr() {
        parser._tokenInputCol = 3;
        assertEquals(4, parser.getTokenColumnNr());
        parser._tokenInputCol = -1;
        assertEquals(-1, parser.getTokenColumnNr());
    }

    @Test
    public void testReleaseBuffersWithNameCopyBuffer() throws IOException {
        char[] buffer = new char[10];
        parser._nameCopyBuffer = buffer;
        parser._nameCopied = true;
        parser._releaseBuffers();
        assertNull(parser._nameCopyBuffer);
    }

    @Test
    public void testGetByteArrayBuilderCreatesIfNull() {
        assertNull(parser._byteArrayBuilder);
        ByteArrayBuilder builder = parser._getByteArrayBuilder();
        assertNotNull(builder);
        assertSame(builder, parser._getByteArrayBuilder());
    }

    @Test
    public void testGetByteArrayBuilderReusesExisting() {
        ByteArrayBuilder first = parser._getByteArrayBuilder();
        ByteArrayBuilder second = parser._getByteArrayBuilder();
        assertSame(first, second);
    }

    @Test
    public void testIsNaNForIntTypes() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = NR_INT;
        assertFalse(parser.isNaN());
    }

    @Test
    public void testIsNaNForDouble() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = NR_DOUBLE;
        parser._numberDouble = Double.NaN;
        assertTrue(parser.isNaN());
        parser._numberDouble = 1.0;
        assertFalse(parser.isNaN());
    }

    @Test
    public void testIsNaNForNonFloatToken() throws IOException {
        parser._currToken = JsonToken.VALUE_STRING;
        assertFalse(parser.isNaN());
    }

    @Test
    public void testGetNumberTypeUninitialized() throws IOException {
        parser._numTypesValid = NR_UNKNOWN;
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = NR_INT;
        assertEquals(NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeInt() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = NR_INT;
        assertEquals(NumberType.INT, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeLong() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = NR_LONG;
        assertEquals(NumberType.LONG, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeBigInteger() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_INT;
        parser._numTypesValid = NR_BIGINT;
        assertEquals(NumberType.BIG_INTEGER, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeBigDecimal() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = NR_BIGDECIMAL;
        assertEquals(NumberType.BIG_DECIMAL, parser.getNumberType());
    }

    @Test
    public void testGetNumberTypeDouble() throws IOException {
        parser._currToken = JsonToken.VALUE_NUMBER_FLOAT;
        parser._numTypesValid = NR_DOUBLE;
        assertEquals(NumberType.DOUBLE, parser.getNumberType());
    }

    @Test
    public void testGetIntValueFromInt() {
        parser._numTypesValid = NR_INT;
        parser._numberInt = 42;
        try {
            assertEquals(42, parser.getIntValue());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetLongValueFromLong() {
        parser._numTypesValid = NR_LONG;
        parser._numberLong = 42L;
        try {
            assertEquals(42L, parser.getLongValue());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetFloatValueFromDouble() {
        parser._numTypesValid = NR_DOUBLE;
        parser._numberDouble = 3.14;
        try {
            assertEquals(3.14f, parser.getFloatValue(), 0.001);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetDoubleValueFromDouble() {
        parser._numTypesValid = NR_DOUBLE;
        parser._numberDouble = 3.14159;
        try {
            assertEquals(3.14159, parser.getDoubleValue(), 0.0001);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetDecimalValueFromBigDecimal() {
        parser._numTypesValid = NR_BIGDECIMAL;
        BigDecimal value = new BigDecimal("123.45");
        parser._numberBigDecimal = value;
        try {
            assertEquals(value, parser.getDecimalValue());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetBigIntegerValueFromBigInteger() {
        parser._numTypesValid = NR_BIGINT;
        BigInteger value = new BigInteger("123456789");
        parser._numberBigInt = value;
        try {
            assertEquals(value, parser.getBigIntegerValue());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testEnableStrictDuplicateDetectionCreatesDupDetector() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNotNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testEnableOtherFeatureDoesNotCreateDupDetector() {
        parser.enable(Feature.ALLOW_COMMENTS);
        assertNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testDisableStrictDuplicateDetectionWithNoOps() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        parser.disable(Feature.STRICT_DUPLICATE_DETECTION);
        assertNull(parser._parsingContext.getDupDetector());
    }

    @Test
    public void testEnableDuplicateDetectionWhenAlreadyEnabled() {
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        DupDetector first = parser._parsingContext.getDupDetector();
        parser.enable(Feature.STRICT_DUPLICATE_DETECTION);
        assertSame(first, parser._parsingContext.getDupDetector());
    }

    @Test
    public void testOverrideCurrentNameWithEmptyContext() {
        try {
            parser.overrideCurrentName("test");
            fail("Expected exception for root context");
        } catch (IllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }
}