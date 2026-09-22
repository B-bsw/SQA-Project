package com.fasterxml.jackson.core.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;

public class FilteringParserDelegateTest {

    private final JsonFactory jsonFactory = new JsonFactory();

    // =========================================================================
    // 1. Initial State & Basic Metadata Tests
    // =========================================================================

    @Test
    public void getFilter_givenConstructedDelegate_shouldReturnRootFilter() throws IOException {
        // Arrange
        JsonParser parser = jsonFactory.createParser("{}");
        TokenFilter filter = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);

        // Act
        TokenFilter resultFilter = delegate.getFilter();

        // Assert
        Assert.assertSame(filter, resultFilter);
        Assert.assertEquals(0, delegate.getMatchCount());
        parser.close();
    }

    @Test
    public void currentTokenMethods_givenUnconsumedParser_shouldReturnNullAndNoTokenDefaults() throws IOException {
        // Arrange
        JsonParser parser = jsonFactory.createParser("{\"a\": 1}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, false);

        // Act & Assert
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, delegate.getCurrentTokenId());
        Assert.assertFalse(delegate.hasCurrentToken());
        Assert.assertTrue(delegate.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        Assert.assertFalse(delegate.hasTokenId(JsonTokenId.ID_START_OBJECT));
        Assert.assertTrue(delegate.hasToken(null));
        Assert.assertFalse(delegate.hasToken(JsonToken.START_OBJECT));
        Assert.assertFalse(delegate.isExpectedStartArrayToken());
        Assert.assertFalse(delegate.isExpectedStartObjectToken());
        Assert.assertNull(delegate.getLastClearedToken());
        parser.close();
    }

    @Test
    public void clearCurrentToken_givenActiveToken_shouldStoreLastClearedToken() throws IOException {
        // Arrange
        JsonParser parser = jsonFactory.createParser("[1, 2]");
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, false);
        JsonToken firstToken = delegate.nextToken();
        Assert.assertEquals(JsonToken.START_ARRAY, firstToken);

        // Act
        delegate.clearCurrentToken();

        // Assert
        Assert.assertNull(delegate.getCurrentToken());
        Assert.assertEquals(JsonToken.START_ARRAY, delegate.getLastClearedToken());
        Assert.assertFalse(delegate.hasCurrentToken());

        // Repeated clear does nothing to cleared state
        delegate.clearCurrentToken();
        Assert.assertEquals(JsonToken.START_ARRAY, delegate.getLastClearedToken());
        parser.close();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void overrideCurrentName_whenInvoked_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        JsonParser parser = jsonFactory.createParser("{\"field\": \"value\"}");
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, false);

        // Act
        try {
            delegate.overrideCurrentName("newName");
        } finally {
            parser.close();
        }
    }

    // =========================================================================
    // 2. Token Navigation: Include All (Happy Path)
    // =========================================================================

    @Test
    public void nextToken_givenIncludeAllFilter_shouldTraverseAllTokens() throws IOException {
        // Arrange
        String json = "{\"name\":\"test\",\"values\":[10,true]}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertTrue(delegate.isExpectedStartObjectToken());
        Assert.assertTrue(delegate.hasToken(JsonToken.START_OBJECT));
        Assert.assertTrue(delegate.hasTokenId(JsonTokenId.ID_START_OBJECT));

        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("name", delegate.getCurrentName());

        Assert.assertEquals(JsonToken.VALUE_STRING, delegate.nextToken());
        Assert.assertEquals("test", delegate.getText());

        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("values", delegate.getCurrentName());

        Assert.assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        Assert.assertTrue(delegate.isExpectedStartArrayToken());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(10, delegate.getIntValue());

        Assert.assertEquals(JsonToken.VALUE_TRUE, delegate.nextToken());
        Assert.assertTrue(delegate.getBooleanValue());

        Assert.assertEquals(JsonToken.END_ARRAY, delegate.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    // =========================================================================
    // 3. Property Filtering with includePath = true & false
    // =========================================================================

    @Test
    public void nextToken_givenPropertyFilterAndIncludePathTrue_shouldIncludePathAndValue() throws IOException {
        // Arrange
        String json = "{\"target\": 123, \"ignore\": 456}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("target", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(123, delegate.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenPropertyFilterAndIncludePathFalse_shouldOnlyIncludeValueTokens() throws IOException {
        // Arrange
        String json = "{\"target\": 123, \"ignore\": 456}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);

        // Act & Assert: with includePath = false, FIELD_NAME is returned, but START_OBJECT / END_OBJECT are omitted
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("target", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(123, delegate.getIntValue());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenImmediateParentFlag_shouldExposeParentStartObject() throws IOException {
        // Arrange
        String json = "{\"target\": 999}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);
        delegate._includeImmediateParent = true;

        // Act & Assert: _includeImmediateParent triggers exposed context read
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("target", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(999, delegate.getIntValue());
        parser.close();
    }

    // =========================================================================
    // 4. Nested Structures, Array Filtering & skipChildren
    // =========================================================================

    @Test
    public void nextToken_givenArrayFilterWithIncludePathTrue_shouldEmitNestedMatches() throws IOException {
        // Arrange
        String json = "{\"array\": [1, 2, 3]}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("array".equals(name)) {
                    return new TokenFilter() {
                        public TokenFilter filterStartArray() {
                            return new TokenFilter() {
                                public boolean includeValue(JsonParser p) throws IOException {
                                    return p.getIntValue() == 2;
                                }
                            };
                        }
                    };
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("array", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(2, delegate.getIntValue());
        Assert.assertEquals(JsonToken.END_ARRAY, delegate.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenNullFilterOnNestedObject_shouldSkipObjectChildren() throws IOException {
        // Arrange: object containing non-matching nested object followed by matching field
        String json = "{\"skipped\": {\"inner\": 1}, \"kept\": 2}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("kept".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("kept", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(2, delegate.getIntValue());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenNullFilterOnNestedArray_shouldSkipArrayChildren() throws IOException {
        // Arrange: array inside skipped field
        String json = "{\"skippedArray\": [1, 2, 3], \"kept\": 42}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter() {
            public TokenFilter includeProperty(String name) {
                if ("kept".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("kept", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(42, delegate.getIntValue());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void skipChildren_givenOnStartObjectOrArray_shouldSkipToEndOfStruct() throws IOException {
        // Arrange
        String json = "{\"skipMe\": {\"a\": 1, \"b\": [2, 3]}, \"after\": \"ok\"}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("skipMe", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());

        // Skip the inner object
        delegate.skipChildren();
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.getCurrentToken());

        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("after", delegate.getCurrentName());
        Assert.assertEquals(JsonToken.VALUE_STRING, delegate.nextToken());
        Assert.assertEquals("ok", delegate.getText());

        // Calling skipChildren on a scalar does nothing
        delegate.skipChildren();
        Assert.assertEquals(JsonToken.VALUE_STRING, delegate.getCurrentToken());

        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    // =========================================================================
    // 5. nextValue Navigation
    // =========================================================================

    @Test
    public void nextValue_givenObjectProperties_shouldSkipFieldNamesAndReturnValues() throws IOException {
        // Arrange
        String json = "{\"x\": 10, \"y\": 20}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, false, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextValue());
        Assert.assertEquals(10, delegate.getIntValue());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextValue());
        Assert.assertEquals(20, delegate.getIntValue());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextValue());
        Assert.assertNull(delegate.nextValue());
        parser.close();
    }

    // =========================================================================
    // 6. Context and Current Name Edge Cases
    // =========================================================================

    @Test
    public void getCurrentName_givenRootObjectAndArray_shouldReturnExpectedContextNames() throws IOException {
        // Arrange
        String json = "{\"nested\": [1]}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.getCurrentName()); // Parent of root is null

        Assert.assertEquals(JsonToken.FIELD_NAME, delegate.nextToken());
        Assert.assertEquals("nested", delegate.getCurrentName());

        Assert.assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        Assert.assertEquals("nested", delegate.getCurrentName()); // Parent's name

        JsonStreamContext streamCtxt = delegate.getParsingContext();
        Assert.assertNotNull(streamCtxt);
        Assert.assertTrue(streamCtxt.inArray());

        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, delegate.nextToken());
        Assert.assertEquals(1, delegate.getIntValue());

        Assert.assertEquals(JsonToken.END_ARRAY, delegate.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        parser.close();
    }

    // =========================================================================
    // 7. Delegated Scalar and Type Accessor Tests
    // =========================================================================

    @Test
    public void delegatedMethods_givenVariousTokens_shouldDelegateAccurately() throws IOException {
        // Arrange
        String json = "{\"num\": 12345678901234567890, \"d\": 12.5, \"b\": true, \"str\": \"hello\", \"bin\": \"AQID\"}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, true, false);

        // START_OBJECT
        delegate.nextToken();
        JsonLocation loc = delegate.getCurrentLocation();
        Assert.assertNotNull(loc);

        // num
        delegate.nextToken(); // FIELD_NAME
        delegate.nextToken(); // VALUE_NUMBER_INT
        Assert.assertNotNull(delegate.getTokenLocation());
        Assert.assertEquals(new BigInteger("12345678901234567890"), delegate.getBigIntegerValue());
        Assert.assertEquals(JsonParser.NumberType.BIG_INTEGER, delegate.getNumberType());
        Assert.assertNotNull(delegate.getNumberValue());
        Assert.assertEquals(12345678901234567890L, delegate.getValueAsLong());
        Assert.assertEquals(12345678901234567890L, delegate.getValueAsLong(0L));
        Assert.assertEquals(12345678901234567890L, delegate.getLongValue());

        // d
        delegate.nextToken(); // FIELD_NAME
        delegate.nextToken(); // VALUE_NUMBER_FLOAT
        Assert.assertEquals(new BigDecimal("12.5"), delegate.getDecimalValue());
        Assert.assertEquals(12.5, delegate.getDoubleValue(), 0.0001);
        Assert.assertEquals(12.5, delegate.getValueAsDouble(), 0.0001);
        Assert.assertEquals(12.5, delegate.getValueAsDouble(0.0), 0.0001);
        Assert.assertEquals(12.5f, delegate.getFloatValue(), 0.0001f);
        Assert.assertEquals(12, delegate.getIntValue());
        Assert.assertEquals(12, delegate.getValueAsInt());
        Assert.assertEquals(12, delegate.getValueAsInt(1));
        Assert.assertEquals((byte) 12, delegate.getByteValue());
        Assert.assertEquals((short) 12, delegate.getShortValue());

        // b
        delegate.nextToken(); // FIELD_NAME
        delegate.nextToken(); // VALUE_TRUE
        Assert.assertTrue(delegate.getBooleanValue());
        Assert.assertTrue(delegate.getValueAsBoolean());
        Assert.assertTrue(delegate.getValueAsBoolean(false));

        // str
        delegate.nextToken(); // FIELD_NAME
        delegate.nextToken(); // VALUE_STRING
        Assert.assertEquals("hello", delegate.getText());
        Assert.assertTrue(delegate.hasTextCharacters());
        Assert.assertNotNull(delegate.getTextCharacters());
        Assert.assertEquals(5, delegate.getTextLength());
        Assert.assertTrue(delegate.getTextOffset() >= 0);
        Assert.assertEquals("hello", delegate.getValueAsString());
        Assert.assertEquals("hello", delegate.getValueAsString("fallback"));
        Assert.assertNull(delegate.getEmbeddedObject());

        // bin
        delegate.nextToken(); // FIELD_NAME
        delegate.nextToken(); // VALUE_STRING representing base64 "AQID" -> {1, 2, 3}
        byte[] binary = delegate.getBinaryValue(Base64Variants.MIME);
        Assert.assertNotNull(binary);
        Assert.assertEquals(3, binary.length);
        Assert.assertEquals(1, binary[0]);
        Assert.assertEquals(2, binary[1]);
        Assert.assertEquals(3, binary[2]);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int bytesRead = delegate.readBinaryValue(Base64Variants.MIME, baos);
        Assert.assertEquals(3, bytesRead);
        Assert.assertArrayEquals(binary, baos.toByteArray());

        delegate.nextToken(); // END_OBJECT
        parser.close();
    }

    // =========================================================================
    // 8. Edge Case: Complete Filter Exclusion
    // =========================================================================

    @Test
    public void nextToken_givenFilterRejectingAll_shouldReturnNull() throws IOException {
        // Arrange
        String json = "{\"a\": 1, \"b\": [2, 3], \"c\": {\"d\": 4}}";
        JsonParser parser = jsonFactory.createParser(json);
        TokenFilter filter = new TokenFilter(); // Default filter excludes everything
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, filter, false, false);

        // Act & Assert
        Assert.assertNull(delegate.nextToken());
        Assert.assertNull(delegate.getCurrentToken());
        parser.close();
    }

    @Test
    public void nextToken_givenIncludePathTrueAndEmptyObject_shouldReturnStartAndEndObject() throws IOException {
        // Arrange
        String json = "{}";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, delegate.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }

    @Test
    public void nextToken_givenIncludePathTrueAndEmptyArray_shouldReturnStartAndEndArray() throws IOException {
        // Arrange
        String json = "[]";
        JsonParser parser = jsonFactory.createParser(json);
        FilteringParserDelegate delegate = new FilteringParserDelegate(parser, TokenFilter.INCLUDE_ALL, true, false);

        // Act & Assert
        Assert.assertEquals(JsonToken.START_ARRAY, delegate.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, delegate.nextToken());
        Assert.assertNull(delegate.nextToken());
        parser.close();
    }
}