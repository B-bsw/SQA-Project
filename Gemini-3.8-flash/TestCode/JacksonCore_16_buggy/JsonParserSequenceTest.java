package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * Phase 1 - Code Analysis & Test Matrix:
 *
 * 1. Happy Path:
 *   - createFlattened with two standalone (non-sequence) parsers.
 *   - createFlattened with first as sequence, second standalone.
 *   - createFlattened with first standalone, second as sequence.
 *   - createFlattened with both as sequences.
 *   - nextToken traversing tokens across multiple underlying parsers until exhaustion.
 *   - containedParsersCount returning underlying array length.
 *   - close() closing all delegates in sequence.
 *
 * 2. Boundary & Edge Cases:
 *   - Sequences nested inside sequences (multi-level flattening).
 *   - Partially consumed sequence flattened (verifying _nextParser - 1 start index).
 *   - Parsers that yield no tokens (empty parsers) transitioning smoothly to the next.
 *   - All parsers in the sequence being empty.
 *   - Direct invocations of protected switchToNext() at boundary (end of array).
 *   - Sequence initialized with a single parser.
 *
 * 3. Error & Exception Branches:
 *   - nextToken() propagating IOException from underlying delegate.
 *   - nextToken() propagating JsonParseException from underlying delegate.
 *   - close() propagating IOException from delegate during closing loop.
 */
public class JsonParserSequenceTest {

    /*
     *******************************************************
     * Test Stubs (No external mocking libraries)
     *******************************************************
     */

    private static class MockParser extends JsonParserDelegate {
        private final List<JsonToken> tokens;
        private int tokenIndex;
        private boolean closed;
        private boolean throwOnClose;
        private boolean throwOnNextToken;
        private boolean throwParseException;

        public MockParser(JsonToken[] tokensArray) {
            super(null);
            this.tokens = (tokensArray == null)
                    ? new ArrayList<JsonToken>()
                    : new ArrayList<JsonToken>(Arrays.asList(tokensArray));
            this.tokenIndex = 0;
            this.closed = false;
        }

        public void setThrowOnClose(boolean throwOnClose) {
            this.throwOnClose = throwOnClose;
        }

        public void setThrowOnNextToken(boolean throwOnNextToken) {
            this.throwOnNextToken = throwOnNextToken;
        }

        public void setThrowParseException(boolean throwParseException) {
            this.throwParseException = throwParseException;
        }

        public boolean isClosed() {
            return closed;
        }

        @Override
        public JsonToken nextToken() throws IOException, JsonParseException {
            if (throwParseException) {
                throw new JsonParseException("Simulated Parse Exception", JsonLocation.NA);
            }
            if (throwOnNextToken) {
                throw new IOException("Simulated IO Exception on nextToken");
            }
            if (tokenIndex < tokens.size()) {
                JsonToken t = tokens.get(tokenIndex);
                tokenIndex++;
                return t;
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            closed = true;
            if (throwOnClose) {
                throw new IOException("Simulated IO Exception on close");
            }
        }
    }

    /*
     *******************************************************
     * Test Cases: Factory Method createFlattened
     *******************************************************
     */

    @Test
    public void createFlattened_givenBothNonSequenceParsers_shouldCreateSequenceWithBoth() {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });

        // Act
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        // Assert
        Assert.assertNotNull("Sequence should not be null", seq);
        Assert.assertEquals("Contained parsers count should be 2", 2, seq.containedParsersCount());
        Assert.assertSame("First delegate should be p1", p1, seq._parsers[0]);
        Assert.assertSame("Second delegate should be p2", p2, seq._parsers[1]);
    }

    @Test
    public void createFlattened_givenFirstIsSequenceAndSecondIsNot_shouldFlattenFirst() {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_ARRAY });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.VALUE_STRING });
        MockParser p3 = new MockParser(new JsonToken[] { JsonToken.END_ARRAY });

        JsonParserSequence firstSeq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Act
        JsonParserSequence result = JsonParserSequence.createFlattened(firstSeq, p3);

        // Assert
        Assert.assertEquals("Flattened sequence should contain 3 parsers", 3, result.containedParsersCount());
        Assert.assertSame("Parser at 0 should be p1", p1, result._parsers[0]);
        Assert.assertSame("Parser at 1 should be p2", p2, result._parsers[1]);
        Assert.assertSame("Parser at 2 should be p3", p3, result._parsers[2]);
    }

    @Test
    public void createFlattened_givenFirstIsNotAndSecondIsSequence_shouldFlattenSecond() {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.FIELD_NAME });
        MockParser p3 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });

        JsonParserSequence secondSeq = new JsonParserSequence(new JsonParser[] { p2, p3 });

        // Act
        JsonParserSequence result = JsonParserSequence.createFlattened(p1, secondSeq);

        // Assert
        Assert.assertEquals("Flattened sequence should contain 3 parsers", 3, result.containedParsersCount());
        Assert.assertSame("Parser at 0 should be p1", p1, result._parsers[0]);
        Assert.assertSame("Parser at 1 should be p2", p2, result._parsers[1]);
        Assert.assertSame("Parser at 2 should be p3", p3, result._parsers[2]);
    }

    @Test
    public void createFlattened_givenBothAreSequences_shouldFlattenBoth() {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.FIELD_NAME });
        MockParser p3 = new MockParser(new JsonToken[] { JsonToken.VALUE_NUMBER_INT });
        MockParser p4 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });

        JsonParserSequence firstSeq = new JsonParserSequence(new JsonParser[] { p1, p2 });
        JsonParserSequence secondSeq = new JsonParserSequence(new JsonParser[] { p3, p4 });

        // Act
        JsonParserSequence result = JsonParserSequence.createFlattened(firstSeq, secondSeq);

        // Assert
        Assert.assertEquals("Flattened sequence should contain 4 parsers", 4, result.containedParsersCount());
        Assert.assertSame("Parser at 0 should be p1", p1, result._parsers[0]);
        Assert.assertSame("Parser at 1 should be p2", p2, result._parsers[1]);
        Assert.assertSame("Parser at 2 should be p3", p3, result._parsers[2]);
        Assert.assertSame("Parser at 3 should be p4", p4, result._parsers[3]);
    }

    @Test
    public void createFlattened_givenNestedSequences_shouldFlattenAllRecursively() {
        // Arrange
        MockParser p1 = new MockParser(null);
        MockParser p2 = new MockParser(null);
        MockParser p3 = new MockParser(null);

        JsonParserSequence innerSeq = new JsonParserSequence(new JsonParser[] { p1, p2 });
        JsonParserSequence outerSeq = new JsonParserSequence(new JsonParser[] { innerSeq });

        // Act
        JsonParserSequence result = JsonParserSequence.createFlattened(outerSeq, p3);

        // Assert
        Assert.assertEquals("Recursively flattened sequence should contain 3 parsers", 3, result.containedParsersCount());
        Assert.assertSame("Parser at 0 should be p1", p1, result._parsers[0]);
        Assert.assertSame("Parser at 1 should be p2", p2, result._parsers[1]);
        Assert.assertSame("Parser at 2 should be p3", p3, result._parsers[2]);
    }

    @Test
    public void createFlattened_givenFirstSequencePartiallyConsumed_shouldOnlyIncludeActiveParsers() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.VALUE_TRUE });
        MockParser p3 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });

        JsonParserSequence firstSeq = new JsonParserSequence(new JsonParser[] { p1, p2 });
        // Consume p1 completely so it switches to p2
        Assert.assertEquals(JsonToken.START_OBJECT, firstSeq.nextToken());
        Assert.assertEquals(JsonToken.VALUE_TRUE, firstSeq.nextToken());
        // Currently _nextParser is 2, pointing past p2

        // Act
        JsonParserSequence result = JsonParserSequence.createFlattened(firstSeq, p3);

        // Assert: only p2 and p3 should be flattened (p1 was already completed)
        Assert.assertEquals("Should only include active parsers", 2, result.containedParsersCount());
        Assert.assertSame("First active parser should be p2", p2, result._parsers[0]);
        Assert.assertSame("Second parser should be p3", p3, result._parsers[1]);
    }

    /*
     *******************************************************
     * Test Cases: nextToken Logic
     *******************************************************
     */

    @Test
    public void nextToken_givenMultipleParsersWithTokens_shouldReturnTokensInOrderAcrossParsers() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_ARRAY, JsonToken.VALUE_NUMBER_INT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.VALUE_STRING, JsonToken.END_ARRAY });
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Act & Assert
        Assert.assertEquals(JsonToken.START_ARRAY, seq.nextToken());
        Assert.assertEquals(JsonToken.VALUE_NUMBER_INT, seq.nextToken());
        Assert.assertEquals(JsonToken.VALUE_STRING, seq.nextToken());
        Assert.assertEquals(JsonToken.END_ARRAY, seq.nextToken());
        Assert.assertNull("Expected null at end of tokens", seq.nextToken());
        Assert.assertNull("Repeated call after end should remain null", seq.nextToken());
    }

    @Test
    public void nextToken_givenIntermediateParserWithNoTokens_shouldSwitchAndContinue() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser emptyParser = new MockParser(new JsonToken[0]);
        MockParser p3 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, emptyParser, p3 });

        // Act & Assert
        Assert.assertEquals(JsonToken.START_OBJECT, seq.nextToken());
        Assert.assertEquals(JsonToken.END_OBJECT, seq.nextToken());
        Assert.assertNull(seq.nextToken());
    }

    @Test
    public void nextToken_givenAllParsersEmpty_shouldReturnNull() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[0]);
        MockParser p2 = new MockParser(new JsonToken[0]);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Act & Assert
        Assert.assertNull("Empty parsers should immediately return null token", seq.nextToken());
    }

    @Test(expected = IOException.class)
    public void nextToken_givenParserThrowsIOException_shouldPropagateException() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        p1.setThrowOnNextToken(true);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1 });

        // Act
        seq.nextToken();
    }

    @Test(expected = JsonParseException.class)
    public void nextToken_givenParserThrowsJsonParseException_shouldPropagateException() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        p1.setThrowParseException(true);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1 });

        // Act
        seq.nextToken();
    }

    /*
     *******************************************************
     * Test Cases: close Logic
     *******************************************************
     */

    @Test
    public void close_givenMultipleParsers_shouldCloseAllParsersInSequence() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });
        MockParser p3 = new MockParser(new JsonToken[0]);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2, p3 });

        // Act
        seq.close();

        // Assert
        Assert.assertTrue("p1 must be closed", p1.isClosed());
        Assert.assertTrue("p2 must be closed", p2.isClosed());
        Assert.assertTrue("p3 must be closed", p3.isClosed());
    }

    @Test
    public void close_givenPartiallyConsumedSequence_shouldCloseAllRemainingParsers() throws IOException {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[] { JsonToken.START_OBJECT });
        MockParser p2 = new MockParser(new JsonToken[] { JsonToken.END_OBJECT });
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Consume p1 completely
        seq.nextToken(); // START_OBJECT
        seq.nextToken(); // triggers switch to p2, returns END_OBJECT

        // Act
        seq.close();

        // Assert
        Assert.assertTrue("p2 must be closed", p2.isClosed());
    }

    @Test
    public void close_givenParserThrowsIOException_shouldPropagateException() {
        // Arrange
        MockParser p1 = new MockParser(new JsonToken[0]);
        p1.setThrowOnClose(true);
        MockParser p2 = new MockParser(new JsonToken[0]);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Act & Assert
        try {
            seq.close();
            Assert.fail("Expected IOException when closing p1");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IO Exception on close", e.getMessage());
        }
    }

    /*
     *******************************************************
     * Test Cases: Helper & Direct Method Coverage
     *******************************************************
     */

    @Test
    public void containedParsersCount_givenParsersArray_shouldReturnExactCount() {
        // Arrange
        MockParser p1 = new MockParser(null);
        MockParser p2 = new MockParser(null);
        MockParser p3 = new MockParser(null);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2, p3 });

        // Act & Assert
        Assert.assertEquals(3, seq.containedParsersCount());
    }

    @Test
    public void switchToNext_givenParsersAvailable_shouldSwitchAndReturnTrue() {
        // Arrange
        MockParser p1 = new MockParser(null);
        MockParser p2 = new MockParser(null);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1, p2 });

        // Act
        boolean switched = seq.switchToNext();

        // Assert
        Assert.assertTrue("Should return true when switching to existing parser", switched);
        Assert.assertSame("Delegate should now be p2", p2, seq.delegate);
    }

    @Test
    public void switchToNext_givenNoMoreParsers_shouldReturnFalse() {
        // Arrange
        MockParser p1 = new MockParser(null);
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1 });

        // Act
        boolean switched = seq.switchToNext();

        // Assert
        Assert.assertFalse("Should return false when no more parsers left", switched);
    }

    @Test
    public void constructor_givenSingleParser_shouldInitializeCorrectly() {
        // Arrange
        MockParser p1 = new MockParser(null);

        // Act
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1 });

        // Assert
        Assert.assertSame("Initial delegate should be first parser", p1, seq.delegate);
        Assert.assertEquals(1, seq.containedParsersCount());
        Assert.assertEquals(1, seq._nextParser);
    }
}