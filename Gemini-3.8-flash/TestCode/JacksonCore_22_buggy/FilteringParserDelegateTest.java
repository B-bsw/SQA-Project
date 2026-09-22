package com.fasterxml.jackson.core.filter;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.StringReader;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Comprehensive Unit Tests for {@link FilteringParserDelegate}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FilteringParserDelegateTest {

    @Test
    public void filterWithIncludeAll_shouldReturnAllTokens() throws Exception {
        // Arrange
        String json = "{\"a\":1,\"b\":\"test\"}";
        JsonFactory factory = new JsonFactory();
        JsonParser p = factory.createParser(new StringReader(json));
        FilteringParserDelegate filtered = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, false);

        // Act & Assert
        assertEquals(JsonToken.START_OBJECT, filtered.nextToken());
        assertEquals(JsonToken.FIELD_NAME, filtered.nextToken());
        assertEquals("a", filtered.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, filtered.nextToken());
        assertEquals(1, filtered.getIntValue());
        assertEquals(JsonToken.FIELD_NAME, filtered.nextToken());
        assertEquals("b", filtered.getCurrentName());
        assertEquals(JsonToken.VALUE_STRING, filtered.nextToken());
        assertEquals("test", filtered.getText());
        assertEquals(JsonToken.END_OBJECT, filtered.nextToken());
        assertNull(filtered.nextToken());

        filtered.close();
        assertTrue(filtered.isClosed());
    }

    @Test
    public void filterTargetProperty_shouldOnlyIncludeMatchedProperty() throws Exception {
        // Arrange
        String json = "{\"a\":1,\"target\":42,\"c\":3}";
        JsonFactory factory = new JsonFactory();
        JsonParser p = factory.createParser(new StringReader(json));

        TokenFilter filter = new TokenFilter() {
            @Override
            public TokenFilter includeProperty(String name) {
                if ("target".equals(name)) {
                    return TokenFilter.INCLUDE_ALL;
                }
                return null;
            }
        };

        FilteringParserDelegate filtered = new FilteringParserDelegate(p, filter, false, true);

        // Act & Assert
        JsonToken token = filtered.nextToken();
        assertNotNull(token);
        assertEquals(JsonToken.VALUE_NUMBER_INT, token);
        assertEquals(42, filtered.getIntValue());
        assertNull(filtered.nextToken());

        filtered.close();
    }
}
