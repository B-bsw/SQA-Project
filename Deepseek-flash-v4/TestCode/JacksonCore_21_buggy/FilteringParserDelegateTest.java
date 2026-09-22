package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegateTest {

    private JsonParser delegate;
    private TokenFilter filter;
    private FilteringParserDelegate parser;

    @Before
    public void setUp() throws IOException {
        String json = "{\"a\":1,\"b\":[true,false],\"c\":{\"d\":null},\"e\":\"text\"}";
        delegate = new JsonFactory().createParser(json);
        parser = new FilteringParserDelegate(delegate, TokenFilter.INCLUDE_ALL, true, true);
    }

    @After
    public void tearDown() throws IOException {
        delegate.close();
    }

    @Test
    public void testGetFilter() {
        Assert.assertEquals(filter, parser.getFilter());
    }

    @Test
    public void testGetMatchCountInitialZero() {
        Assert.assertEquals(0, parser.getMatchCount());
    }

    @Test
    public void testGetCurrentTokenInitialNull() {
        Assert.assertNull(parser.getCurrentToken());
    }

    @Test
    public void testCurrentTokenInitialNull() {
        Assert.assertNull(parser.currentToken());
    }

    @Test
    public void testGetCurrentTokenIdInitial() {
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testCurrentTokenIdInitial() {
        Assert.assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
    }

    @Test
    public void testHasCurrentTokenInitial() {
        Assert.assertFalse(parser.hasCurrentToken());
    }

    @Test
    public void testHasTokenIdInitial() {
        Assert.assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
    }

    @Test
    public void testHasTokenInitial() {
        Assert.assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayTokenInitial() {
        Assert.assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testIsExpectedStartObjectTokenInitial() {
        Assert.assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testGetCurrentLocationInitial() throws IOException {
        Assert.assertNotNull(parser.getCurrentLocation());
    }

    @Test
    public void testGetParsingContextInitial() {
        Assert.assertNotNull(parser.getParsingContext());
    }

    @Test
    public void testGetCurrentNameInitial() throws IOException {
        Assert.assertNull(parser.getCurrentName());
    }

    @Test
    public void testGetLastClearedTokenInitial() {
        Assert.assertNull(parser.getLastClearedToken());
    }

    @Test
    public void testClearCurrentTokenWhenNull() {
        parser.clearCurrentToken();
        Assert.assertNull(parser.getLastClearedToken());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() throws IOException {
        parser.overrideCurrentName("name");
    }

    @Test
    public void testNextTokenStartObject() throws IOException {
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, token);
    }

    @Test
    public void testNextTokenFieldName() throws IOException {
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, token);
        Assert.assertEquals("a", parser.getCurrentName());
    }

    @Test
    public void testNextTokenValueInt() throws IOException {
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        Assert.assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testNextTokenArrayStart() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.START_ARRAY, token);
    }

    @Test
    public void testNextTokenArrayValueTrue() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_TRUE, token);
    }

    @Test
    public void testNextTokenArrayValueFalse() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_FALSE, token);
    }

    @Test
    public void testNextTokenArrayEnd() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.END_ARRAY, token);
    }

    @Test
    public void testNextTokenObjectStart() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, token);
    }

    @Test
    public void testNextTokenNullValue() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NULL, token);
    }

    @Test
    public void testNextTokenStringValue() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_STRING, token);
        Assert.assertEquals("text", parser.getText());
    }

    @Test
    public void testNextTokenEndObject() throws IOException {
        JsonToken token = null;
        while ((token = parser.nextToken()) != null) {
            if (token == JsonToken.END_OBJECT) {
                break;
            }
        }
        Assert.assertEquals(JsonToken.END_OBJECT, token);
    }

    @Test
    public void testNextValueAfterFieldName() throws IOException {
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextValue();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
    }

    @Test
    public void testSkipChildrenOnNonStruct() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        JsonParser result = parser.skipChildren();
        Assert.assertSame(parser, result);
    }

    @Test
    public void testGetTextInitial() throws IOException {
        Assert.assertNull(parser.getText());
    }

    @Test
    public void testGetValueAsIntDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1, parser.getValueAsInt());
        Assert.assertEquals(1, parser.getValueAsInt(5));
    }

    @Test
    public void testGetValueAsLongDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1L, parser.getValueAsLong());
        Assert.assertEquals(1L, parser.getValueAsLong(5L));
    }

    @Test
    public void testGetValueAsDoubleDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1.0, parser.getValueAsDouble(), 0.0);
        Assert.assertEquals(1.0, parser.getValueAsDouble(5.0), 0.0);
    }

    @Test
    public void testGetValueAsBooleanDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertFalse(parser.getValueAsBoolean());
        Assert.assertFalse(parser.getValueAsBoolean(true));
    }

    @Test
    public void testGetValueAsStringDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals("1", parser.getValueAsString());
        Assert.assertEquals("1", parser.getValueAsString("default"));
    }

    @Test
    public void testGetNumberValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1, parser.getNumberValue());
    }

    @Test
    public void testGetNumberTypeDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertNotNull(parser.getNumberType());
    }

    @Test
    public void testGetIntValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1, parser.getIntValue());
    }

    @Test
    public void testGetLongValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1L, parser.getLongValue());
    }

    @Test
    public void testGetDoubleValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(1.0, parser.getDoubleValue(), 0.0);
    }

    @Test
    public void testGetBooleanValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertFalse(parser.getBooleanValue());
    }

    @Test
    public void testGetDecimalValueDelegates() throws IOException {
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        Assert.assertEquals(new BigDecimal(1), parser.getDecimalValue());
    }

    @Test
    public void testGetBinaryValueDelegates() throws IOException {
        // Can't easily test without binary data, but should delegate
        Assert.assertThrows(IOException.class, () -> parser.getBinaryValue(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReadBinaryValueDelegates() throws IOException {
        Assert.assertThrows(IOException.class, () -> parser.readBinaryValue(Base64Variants.getDefaultVariant(), new java.io.ByteArrayOutputStream()));
    }

    @Test
    public void testGetTokenLocationInitial() throws IOException {
        Assert.assertNotNull(parser.getTokenLocation());
    }

    @Test
    public void testHasTextCharactersDelegates() throws IOException {
        Assert.assertFalse(parser.hasTextCharacters());
    }

    @Test
    public void testGetTextCharactersDelegates() throws IOException {
        Assert.assertNull(parser.getTextCharacters());
    }

    @Test
    public void testGetTextLengthDelegates() throws IOException {
        Assert.assertEquals(0, parser.getTextLength());
    }

    @Test
    public void testGetTextOffsetDelegates() throws IOException {
        Assert.assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testGetEmbeddedObjectDelegates() throws IOException {
        Assert.assertNull(parser.getEmbeddedObject());
    }

    @Test
    public void testGetByteValueDelegates() throws IOException {
        Assert.assertThrows(IOException.class, () -> parser.getByteValue());
    }

    @Test
    public void testGetShortValueDelegates() throws IOException {
        Assert.assertThrows(IOException.class, () -> parser.getShortValue());
    }

    @Test
    public void testGetFloatValueDelegates() throws IOException {
        Assert.assertThrows(IOException.class, () -> parser.getFloatValue());
    }

    @Test
    public void testNextTokenWithIncludePathFalse() throws IOException {
        parser.close();
        String json = "{\"a\":1}";
        delegate = new JsonFactory().createParser(json);
        parser = new FilteringParserDelegate(delegate, TokenFilter.INCLUDE_ALL, false, true);
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, token);
        Assert.assertEquals("a", parser.getCurrentName());
        token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
    }

    @Test
    public void testNextTokenWithNullFilter() throws IOException {
        parser.close();
        String json = "{\"a\":1}";
        delegate = new JsonFactory().createParser(json);
        parser = new FilteringParserDelegate(delegate, null, true, true);
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
    }

    @Test
    public void testNextTokenWithFilterIncludeAll() throws IOException {
        parser.close();
        String json = "{\"a\":1}";
        delegate = new JsonFactory().createParser(json);
        parser = new FilteringParserDelegate(delegate, TokenFilter.INCLUDE_ALL, false, true);
        parser.nextToken();
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, token);
    }

    @Test
    public void testNextTokenWithIncludeImmediateParent() throws IOException {
        parser.close();
        String json = "{\"a\":1}";
        delegate = new JsonFactory().createParser(json);
        parser = new FilteringParserDelegate(delegate, new TokenFilter() {
            @Override
            public boolean includeProperty(String name) {
                return true;
            }
            @Override
            public boolean includeValue(JsonParser p) throws IOException {
                return false;
            }
        }, true, true);
        parser.nextToken();
        JsonToken token = parser.nextToken();
        Assert.assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        Assert.assertEquals(JsonToken.START_OBJECT, token);
    }
}