package com.fasterxml.jackson.core.filter;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FilteringParserDelegateTest {

    private JsonParser delegate;
    private FilteringParserDelegate filteringParser;
    private TokenFilter includeAllFilter;

    @Before
    public void setUp() throws Exception {
        String json = "{\"a\":1,\"b\":[true,false,null,\"x\"],\"c\":{\"d\":\"e\"}}";
        delegate = new JacksonJsonParser(json);
        includeAllFilter = TokenFilter.INCLUDE_ALL;
    }

    private static class JacksonJsonParser extends JsonParser {
        private final String json;
        private int pos = 0;
        private JsonToken currentToken;
        private JsonToken lastClearedToken;
        private final List<JsonToken> tokens;
        private final List<String> fieldNames;
        private int tokenIndex = -1;
        private int fieldIndex = -1;

        public JacksonJsonParser(String json) {
            this.json = json;
            this.tokens = new ArrayList<JsonToken>();
            this.fieldNames = new ArrayList<String>();
            tokenize();
        }

        private void tokenize() {
            int i = 0;
            while (i < json.length()) {
                char c = json.charAt(i);
                if (c == '{') { tokens.add(JsonToken.START_OBJECT); fieldNames.add(null); i++; }
                else if (c == '}') { tokens.add(JsonToken.END_OBJECT); fieldNames.add(null); i++; }
                else if (c == '[') { tokens.add(JsonToken.START_ARRAY); fieldNames.add(null); i++; }
                else if (c == ']') { tokens.add(JsonToken.END_ARRAY); fieldNames.add(null); i++; }
                else if (c == ',') { i++; }
                else if (c == ':') { i++; }
                else if (c == '"') {
                    int start = ++i;
                    while (json.charAt(i) != '"') i++;
                    String value = json.substring(start, i);
                    i++;
                    if (i < json.length() && json.charAt(i) == ':') {
                        tokens.add(JsonToken.FIELD_NAME);
                        fieldNames.add(value);
                        i++;
                        while (i < json.length() && (json.charAt(i) == ' ' || json.charAt(i) == ':')) i++;
                        if (i < json.length() && json.charAt(i) == '{') { tokens.add(JsonToken.START_OBJECT); fieldNames.add(null); i++; }
                        else if (i < json.length() && json.charAt(i) == '[') { tokens.add(JsonToken.START_ARRAY); fieldNames.add(null); i++; }
                        else if (i < json.length() && json.charAt(i) == '"') {
                            int vStart = ++i;
                            while (i < json.length() && json.charAt(i) != '"') i++;
                            tokens.add(JsonToken.VALUE_STRING);
                            fieldNames.add(json.substring(vStart, i));
                            i++;
                        } else if (i < json.length() && (json.charAt(i) == 't' || json.charAt(i) == 'f')) {
                            if (json.startsWith("true", i)) { tokens.add(JsonToken.VALUE_TRUE); fieldNames.add("true"); i += 4; }
                            else if (json.startsWith("false", i)) { tokens.add(JsonToken.VALUE_FALSE); fieldNames.add("false"); i += 5; }
                        } else if (i < json.length() && json.charAt(i) == 'n') {
                            tokens.add(JsonToken.VALUE_NULL); fieldNames.add("null"); i += 4;
                        } else {
                            int nStart = i;
                            while (i < json.length() && (Character.isDigit(json.charAt(i)) || json.charAt(i) == '-')) i++;
                            tokens.add(JsonToken.VALUE_NUMBER_INT);
                            fieldNames.add(json.substring(nStart, i));
                        }
                    } else {
                        tokens.add(JsonToken.VALUE_STRING);
                        fieldNames.add(value);
                        i++;
                    }
                } else if (Character.isDigit(c) || c == '-') {
                    int start = i;
                    while (i < json.length() && (Character.isDigit(json.charAt(i)) || json.charAt(i) == '-' || json.charAt(i) == '.')) i++;
                    tokens.add(JsonToken.VALUE_NUMBER_INT);
                    fieldNames.add(json.substring(start, i));
                } else {
                    i++;
                }
            }
        }

        @Override public JsonToken nextToken() throws IOException {
            tokenIndex++;
            if (tokenIndex >= tokens.size()) return null;
            currentToken = tokens.get(tokenIndex);
            return currentToken;
        }

        @Override public JsonToken getCurrentToken() { return currentToken; }
        @Override public JsonLocation getCurrentLocation() { return JsonLocation.NA; }
        @Override public JsonLocation getTokenLocation() { return JsonLocation.NA; }
        @Override public String getCurrentName() throws IOException { return fieldIndex >= 0 ? fieldNames.get(fieldIndex) : null; }
        @Override public void clearCurrentToken() { lastClearedToken = currentToken; currentToken = null; }
        @Override public JsonParser skipChildren() throws IOException { currentToken = null; return this; }
        @Override public boolean isClosed() { return false; }
        @Override public void close() throws IOException {}
        @Override public JsonStreamContext getParsingContext() { return null; }
        @Override public String getText() throws IOException { return fieldNames.get(tokenIndex); }
        @Override public char[] getTextCharacters() throws IOException { return getText().toCharArray(); }
        @Override public int getTextLength() throws IOException { return getText().length(); }
        @Override public int getTextOffset() throws IOException { return 0; }
        @Override public boolean hasTextCharacters() { return true; }
        @Override public Number getNumberValue() throws IOException { return 1; }
        @Override public NumberType getNumberType() throws IOException { return NumberType.INT; }
        @Override public int getIntValue() throws IOException { return Integer.parseInt(fieldNames.get(tokenIndex)); }
        @Override public long getLongValue() throws IOException { return getIntValue(); }
        @Override public double getDoubleValue() throws IOException { return getIntValue(); }
        @Override public float getFloatValue() throws IOException { return getIntValue(); }
        @Override public BigInteger getBigIntegerValue() throws IOException { return BigInteger.valueOf(getIntValue()); }
        @Override public BigDecimal getDecimalValue() throws IOException { return BigDecimal.valueOf(getIntValue()); }
        @Override public boolean getBooleanValue() throws IOException { return Boolean.parseBoolean(fieldNames.get(tokenIndex)); }
        @Override public byte getByteValue() throws IOException { return (byte)getIntValue(); }
        @Override public short getShortValue() throws IOException { return (short)getIntValue(); }
        @Override public Object getEmbeddedObject() throws IOException { return null; }
        @Override public String getValueAsString() throws IOException { return getText(); }
        @Override public String getValueAsString(String def) throws IOException { return getText() != null ? getText() : def; }
        @Override public int getValueAsInt() throws IOException { return getIntValue(); }
        @Override public int getValueAsInt(int def) throws IOException { return getIntValue(); }
        @Override public long getValueAsLong() throws IOException { return getLongValue(); }
        @Override public long getValueAsLong(long def) throws IOException { return getLongValue(); }
        @Override public double getValueAsDouble() throws IOException { return getDoubleValue(); }
        @Override public double getValueAsDouble(double def) throws IOException { return getDoubleValue(); }
        @Override public boolean getValueAsBoolean() throws IOException { return getBooleanValue(); }
        @Override public boolean getValueAsBoolean(boolean def) throws IOException { return getBooleanValue(); }
        @Override public int readBinaryValue(Base64Variant b64variant, OutputStream out) throws IOException { return 0; }
        @Override public byte[] getBinaryValue(Base64Variant b64variant) throws IOException { return new byte[0]; }
        @Override public boolean hasCurrentToken() { return currentToken != null; }
        @Override public boolean hasTokenId(int id) { return currentToken != null && currentToken.id() == id; }
        @Override public boolean hasToken(JsonToken t) { return currentToken == t; }
        @Override public boolean isExpectedStartArrayToken() { return currentToken == JsonToken.START_ARRAY; }
        @Override public boolean isExpectedStartObjectToken() { return currentToken == JsonToken.START_OBJECT; }
    }

    @Test
    public void testConstructorAndBasicGetters() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        assertNotNull(parser);
        assertEquals(includeAllFilter, parser.getFilter());
        assertEquals(0, parser.getMatchCount());
        assertNull(parser.getCurrentToken());
        assertNull(parser.currentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, parser.currentTokenId());
        assertFalse(parser.hasCurrentToken());
        assertFalse(parser.hasTokenId(JsonTokenId.ID_FIELD_NAME));
        assertFalse(parser.hasToken(JsonToken.START_OBJECT));
        assertFalse(parser.isExpectedStartArrayToken());
        assertFalse(parser.isExpectedStartObjectToken());
        assertNotNull(parser.getCurrentLocation());
        assertSame(JsonTokenId.ID_NO_TOKEN, parser.getCurrentTokenId());
    }

    @Test
    public void testNextTokenWithIncludeAllFilter() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("a", parser.getCurrentName());
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("b", parser.getCurrentName());
        token = parser.nextToken();
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NULL, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenWithFilterExcludingAll() throws Exception {
        TokenFilter excludeAllFilter = new TokenFilter() {
            @Override
            public boolean includeValue(JsonParser p) throws IOException { return false; }
            @Override
            public boolean includeProperty(String name) { return false; }
            @Override
            public TokenFilter filterStartObject() { return this; }
            @Override
            public TokenFilter filterStartArray() { return this; }
            @Override
            public void filterFinishObject() { }
            @Override
            public void filterFinishArray() { }
        };
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, excludeAllFilter, true, true);
        JsonToken token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenWithFieldNameExclusion() throws Exception {
        TokenFilter fieldFilter = new TokenFilter() {
            @Override
            public boolean includeProperty(String name) { return !"b".equals(name); }
            @Override
            public TokenFilter filterStartObject() { return this; }
            @Override
            public TokenFilter filterStartArray() { return this; }
            @Override
            public void filterFinishObject() { }
            @Override
            public void filterFinishArray() { }
        };
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, fieldFilter, true, true);
        JsonToken token = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        assertEquals("a", parser.getCurrentName());
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextValue() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        parser.nextToken();
        JsonToken value = parser.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, value);
        value = parser.nextValue();
        assertEquals(JsonToken.START_ARRAY, value);
        value = parser.nextValue();
        assertEquals(JsonToken.VALUE_TRUE, value);
    }

    @Test
    public void testSkipChildrenWithScalar() throws Exception {
        String json = "123";
        JacksonJsonParser parserDelegate = new JacksonJsonParser(json);
        parserDelegate.nextToken();
        FilteringParserDelegate parser = new FilteringParserDelegate(parserDelegate, includeAllFilter, true, true);
        parser.nextToken();
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test
    public void testSkipChildrenWithArray() throws Exception {
        String json = "[1,2,3]";
        JacksonJsonParser parserDelegate = new JacksonJsonParser(json);
        parserDelegate.nextToken();
        FilteringParserDelegate parser = new FilteringParserDelegate(parserDelegate, includeAllFilter, true, true);
        parser.nextToken();
        parser.nextValue();
        JsonParser result = parser.skipChildren();
        assertSame(parser, result);
    }

    @Test
    public void testClearCurrentToken() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        parser.nextToken();
        assertNotNull(parser.getCurrentToken());
        parser.clearCurrentToken();
        assertNull(parser.getCurrentToken());
        assertEquals(JsonToken.START_OBJECT, parser.getLastClearedToken());
    }

    @Test
    public void testGetCurrentNameAtStartObject() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        parser.nextToken();
        assertNull(parser.getCurrentName());
        parser.nextToken();
        assertEquals("a", parser.getCurrentName());
    }

    @Test
    public void testDelegatedMethods() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        parser.nextToken();
        parser.nextToken();
        try {
            parser.getText();
            parser.hasTextCharacters();
            parser.getTextCharacters();
            parser.getTextLength();
            parser.getTextOffset();
            parser.getNumberValue();
            parser.getNumberType();
            parser.getIntValue();
            parser.getLongValue();
            parser.getDoubleValue();
            parser.getFloatValue();
            parser.getByteValue();
            parser.getShortValue();
            parser.getBigIntegerValue();
            parser.getDecimalValue();
            parser.getBooleanValue();
            parser.getValueAsString();
            parser.getValueAsString("default");
            parser.getValueAsInt();
            parser.getValueAsInt(10);
            parser.getValueAsLong();
            parser.getValueAsLong(10L);
            parser.getValueAsDouble();
            parser.getValueAsDouble(10.0);
            parser.getValueAsBoolean();
            parser.getValueAsBoolean(true);
            parser.getEmbeddedObject();
            parser.getBinaryValue(Base64Variants.getDefaultVariant());
            parser.readBinaryValue(Base64Variants.getDefaultVariant(), new java.io.ByteArrayOutputStream());
            parser.getTokenLocation();
            parser.getCurrentLocation();
            assertNotNull(parser.getParsingContext());
            assertNotNull(parser.getFilter());
            assertEquals(0, parser.getMatchCount());
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, true, true);
        parser.overrideCurrentName("test");
    }

    @Test
    public void testNextTokenWithMultipleMatchesDisabled() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, false, false);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NULL, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.FIELD_NAME, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenWithIncludePathFalseAndMultipleMatchesFalse() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, includeAllFilter, false, false);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.START_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_FALSE, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_NULL, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_ARRAY, token);
        token = parser.nextToken();
        assertEquals(JsonToken.START_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.VALUE_STRING, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertEquals(JsonToken.END_OBJECT, token);
        token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testNextTokenWithNullFilter() throws Exception {
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, null, true, true);
        JsonToken token = parser.nextToken();
        assertNull(token);
    }

    @Test
    public void testFilterStartObjectReturnsFilter() throws Exception {
        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter filterStartObject() { return this; }
            @Override
            public TokenFilter filterStartArray() { return this; }
        };
        FilteringParserDelegate parser = new FilteringParserDelegate(delegate, filter, true, true);
        JsonToken token = parser.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.START_OBJECT, token);
    }

    @Test
    public void testGetCurrentNameAfterArrayStart() throws Exception {
        String json = "{\"arr\":[1,2]}";
        JacksonJsonParser delegateParser = new JacksonJsonParser(json);
        FilteringParserDelegate parser = new FilteringParserDelegate(delegateParser, includeAllFilter, true, true);
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();
        assertNotNull(parser.getCurrentToken());
    }
}