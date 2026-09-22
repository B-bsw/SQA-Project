package com.fasterxml.jackson.core.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.*;
import java.math.*;
import java.io.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.json.*;
import com.fasterxml.jackson.core.sym.*;
import com.fasterxml.jackson.core.util.*;
import com.fasterxml.jackson.core.filter.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilteringParserDelegateTest {

    private JsonParser delegate;
    private FilteringParserDelegate parser;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        if (delegate != null) {
            delegate.close();
        }
    }

    private JsonParser createParser(String json) throws IOException {
        JsonFactory factory = new JsonFactory();
        return factory.createParser(new StringReader(json));
    }

    private TokenFilter includeAllFilter() {
        return TokenFilter.INCLUDE_ALL;
    }

    private TokenFilter includeNoneFilter() {
        return new TokenFilter() {
            @Override
            protected boolean includeValue(JsonParser p) throws IOException {
                return false;
            }

            @Override
            protected boolean includeProperty(String name) {
                return false;
            }

            @Override
            protected boolean includeStartObject() {
                return false;
            }

            @Override
            protected boolean includeEndObject() {
                return false;
            }

            @Override
            protected boolean includeStartArray() {
                return false;
            }

            @Override
            protected boolean includeEndArray() {
                return false;
            }

            @Override
            protected boolean includeRootValue(int mainState) {
                return false;
            }
        };
    }

    private TokenFilter includeSpecificFilter(final String fieldName) {
        return new TokenFilter() {
            @Override
            protected boolean includeProperty(String name) {
                return fieldName.equals(name);
            }

            @Override
            protected boolean includeValue(JsonParser p) throws IOException {
                return true;
            }
        };
    }

    private TokenFilter includeValueFilter() {
        return new TokenFilter() {
            @Override
            protected boolean includeValue(JsonParser p) throws IOException {
                return true;
            }
        };
    }

    @Test
    public void testGetFilter() throws IOException {
        TokenFilter filter = includeAllFilter();
        delegate = createParser("{}");
        parser = new FilteringParserDelegate(delegate, filter, true, true);
        assertSame(filter, parser.getFilter());
    }

    @Test
    public void testGetMatchCount() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        while (parser.nextToken() != null) {
        }
        assertEquals(0, parser.getMatchCount());
    }

    @Test
    public void testGetCurrentToken() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertNull(parser.getCurrentToken());
        assertNotNull(parser.nextToken());
        assertEquals(JsonToken.START_OBJECT, parser.getCurrentToken());
        assertEquals(JsonTokenId.ID_START_OBJECT, parser.getCurrentTokenId());
        assertEquals(parser.getCurrentTokenId(), JsonTokenId.ID_START_OBJECT);
    }

    @Test
    public void testHasCurrentToken() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertFalse(parser.hasCurrentToken());
        parser.nextToken();
        assertTrue(parser.hasCurrentToken());
    }

    @Test
    public void testHasTokenId() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertTrue(parser.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertFalse(parser.hasTokenId(JsonTokenId.ID_NO_TOKEN));
    }

    @Test
    public void testHasToken() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertTrue(parser.hasToken(JsonToken.START_ARRAY));
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
    }

    @Test
    public void testIsExpectedStartArrayToken() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertTrue(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
    }

    @Test
    public void testIsExpectedStartObjectToken() throws IOException {
        delegate = createParser("{}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertTrue(parser.isExpectedStartObjectToken());
        assertFalse(parser.isExpectedStartArrayToken());
    }

    @Test
    public void testGetCurrentLocation() throws IOException {
        delegate = createParser("[1,2,3]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertNotNull(parser.getCurrentLocation());
    }

    @Test
    public void testGetParsingContext() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertNotNull(parser.getParsingContext());
        assertEquals(0, parser.getParsingContext().getEntryCount());
    }

    @Test
    public void testGetCurrentName() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(null, parser.getCurrentName());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
    }

    @Test
    public void testClearCurrentToken() throws IOException {
        delegate = createParser("[1]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertNull(parser.getCurrentTokenId());
        assertEquals(JsonToken.START_ARRAY, parser.getLastClearedToken());
    }

    @Test
    public void testOverrideCurrentName() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        try {
            parser.overrideCurrentName("test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testNextTokenBasicArray() throws IOException {
        delegate = createParser("[1,2]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithFilterNone() throws IOException {
        delegate = createParser("[1,2]");
        parser = new FilteringParserDelegate(delegate, includeNoneFilter(), true, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNextTokenWithFilterIncludeValues() throws IOException {
        delegate = createParser("{\"a\":1,\"b\":2}");
        parser = new FilteringParserDelegate(delegate, includeSpecificFilter("a"), true, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals("a", parser.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSkipChildren() throws IOException {
        delegate = createParser("{\"a\":{\"b\":1},\"c\":2}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        parser.nextToken();
        parser.skipChildren();
        assertEquals(JsonToken.FIELD_NAME, parser.getCurrentToken());
    }

    @Test
    public void testGetBigIntegerValue() throws IOException {
        delegate = createParser("123456789012345678901234567890");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals(new BigInteger("123456789012345678901234567890"), parser.getBigIntegerValue());
    }

    @Test
    public void testGetDecimalValue() throws IOException {
        delegate = createParser("1234.5678");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals(new BigDecimal("1234.5678"), parser.getDecimalValue());
    }

    @Test
    public void testGetValueAsInt() throws IOException {
        delegate = createParser("42");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals(42, parser.getValueAsInt());
        assertEquals(42, parser.getValueAsInt(-1));
    }

    @Test
    public void testGetValueAsLong() throws IOException {
        delegate = createParser("123456789");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals(123456789L, parser.getValueAsLong());
        assertEquals(123456789L, parser.getValueAsLong(0L));
    }

    @Test
    public void testGetValueAsDouble() throws IOException {
        delegate = createParser("3.14");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals(3.14, parser.getValueAsDouble(), 0.001);
        assertEquals(3.14, parser.getValueAsDouble(1.0), 0.001);
    }

    @Test
    public void testGetValueAsBoolean() throws IOException {
        delegate = createParser("true");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertTrue(parser.getValueAsBoolean());
        assertTrue(parser.getValueAsBoolean(false));
    }

    @Test
    public void testGetValueAsString() throws IOException {
        delegate = createParser("\"hello\"");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals("hello", parser.getValueAsString());
        assertEquals("hello", parser.getValueAsString("default"));
    }

    @Test
    public void testGetEmbeddedObject() throws IOException {
        delegate = createParser("\"test\"");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals("test", parser.getEmbeddedObject());
    }

    @Test
    public void testGetBinaryValue() throws IOException {
        byte[] data = { 1, 2, 3 };
        String base64 = Base64.getEncoder().encodeToString(data);
        delegate = createParser("\"" + base64 + "\"");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        byte[] result = parser.getBinaryValue(Base64Variant.STD_BASE64);
        assertNotNull(result);
        assertEquals(data.length, result.length);
    }

    @Test
    public void testGetTokenLocation() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertNotNull(parser.getTokenLocation());
    }

    @Test
    public void testGetText() throws IOException {
        delegate = createParser("\"abc\"");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        parser.nextToken();
        assertEquals("abc", parser.getText());
        assertTrue(parser.hasTextCharacters());
        char[] chars = parser.getTextCharacters();
        assertEquals(3, parser.getTextLength());
        assertEquals(0, parser.getTextOffset());
    }

    @Test
    public void testNestedStructures() throws IOException {
        delegate = createParser("{\"a\":[1,{\"b\":2}],\"c\":3}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        int count = 0;
        while (parser.nextToken() != null) {
            count++;
        }
        assertEquals(11, count);
    }

    @Test
    public void testWithIncludePathFalse() throws IOException {
        delegate = createParser("{\"a\":1}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), false, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.FIELD_NAME, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testWithMultipleMatchesFalse() throws IOException {
        delegate = createParser("[1,2,3,4]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, false);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }

    @Test
    public void testEmptyObject() throws IOException {
        delegate = createParser("{}");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        assertEquals(JsonToken.END_OBJECT, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testEmptyArray() throws IOException {
        delegate = createParser("[]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testSingleValue() throws IOException {
        delegate = createParser("null");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.VALUE_NULL, parser.nextToken());
        assertNull(parser.nextToken());
    }

    @Test
    public void testNumberValues() throws IOException {
        delegate = createParser("[1,2.5,-3.14,0]");
        parser = new FilteringParserDelegate(delegate, includeAllFilter(), true, true);
        assertEquals(JsonToken.START_ARRAY, parser.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(1, parser.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(2.5, parser.getDoubleValue(), 0.01);
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, parser.nextToken());
        assertEquals(-3.14, parser.getDoubleValue(), 0.01);
        assertEquals(JsonToken.VALUE_NUMBER_INT, parser.nextToken());
        assertEquals(0, parser.getIntValue());
        assertEquals(JsonToken.END_ARRAY, parser.nextToken());
    }
}