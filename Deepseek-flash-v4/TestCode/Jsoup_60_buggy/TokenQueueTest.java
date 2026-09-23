package org.jsoup.parser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenQueueTest {
    
    private TokenQueue queue;

    @Before
    public void setUp() {
        queue = new TokenQueue("");
    }

    @After
    public void tearDown() {
        queue = null;
    }

    @Test
    public void testConstructor_NullData_ThrowsException() {
        try {
            new TokenQueue(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsEmpty_InitialQueue_ReturnsTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty_NonEmptyQueue_ReturnsFalse() {
        queue = new TokenQueue("content");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeek_EmptyQueue_ReturnsZero() {
        assertEquals(0, queue.peek());
    }

    @Test
    public void testPeek_NonEmptyQueue_ReturnsFirstCharacter() {
        queue = new TokenQueue("hello");
        assertEquals('h', queue.peek());
    }

    @Test
    public void testAddFirst_Character_AddsToStart() {
        queue = new TokenQueue("bcd");
        queue.addFirst('a');
        assertEquals("abcd", queue.toString());
        assertEquals(0, queue.remainingLength() - 3); // pos reset to 0
    }

    @Test
    public void testAddFirst_String_AddsToStart() {
        queue = new TokenQueue("def");
        queue.addFirst("abc");
        assertEquals("abcdef", queue.toString());
    }

    @Test
    public void testMatches_CaseInsensitive_ReturnsTrue() {
        queue = new TokenQueue("Hello World");
        assertTrue(queue.matches("hello"));
        assertTrue(queue.matches("HELLO"));
    }

    @Test
    public void testMatches_CaseInsensitive_NoMatch_ReturnsFalse() {
        queue = new TokenQueue("Hello");
        assertFalse(queue.matches("world"));
    }

    @Test
    public void testMatchesCS_CaseSensitive_ReturnsTrue() {
        queue = new TokenQueue("Hello");
        assertTrue(queue.matchesCS("Hello"));
    }

    @Test
    public void testMatchesCS_CaseSensitive_Mismatch_ReturnsFalse() {
        queue = new TokenQueue("Hello");
        assertFalse(queue.matchesCS("hello"));
    }

    @Test
    public void testMatchesAny_StringVarargs_MultipleSequences_ReturnsTrue() {
        queue = new TokenQueue("apple");
        assertTrue(queue.matchesAny("banana", "cherry", "apple"));
    }

    @Test
    public void testMatchesAny_StringVarargs_NoMatch_ReturnsFalse() {
        queue = new TokenQueue("apple");
        assertFalse(queue.matchesAny("banana", "cherry"));
    }

    @Test
    public void testMatchesAny_CharVarargs_EmptyQueue_ReturnsFalse() {
        assertFalse(queue.matchesAny('a', 'b'));
    }

    @Test
    public void testMatchesAny_CharVarargs_ContainsChar_ReturnsTrue() {
        queue = new TokenQueue("content");
        assertTrue(queue.matchesAny('a', 'n', 't'));
    }

    @Test
    public void testMatchesAny_CharVarargs_NotContained_ReturnsFalse() {
        queue = new TokenQueue("content");
        assertFalse(queue.matchesAny('z', 'x'));
    }

    @Test
    public void testMatchesStartTag_EmptyQueue_ReturnsFalse() {
        assertFalse(queue.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_ValidStartTag_ReturnsTrue() {
        queue = new TokenQueue("<div>");
        assertTrue(queue.matchesStartTag());
    }

    @Test
    public void testMatchesStartTag_InvalidStartTag_ReturnsFalse() {
        queue = new TokenQueue("<1div>");
        assertFalse(queue.matchesStartTag());
    }

    @Test
    public void testMatchChomp_MatchFound_ReturnsTrueAndAdvances() {
        queue = new TokenQueue("hello world");
        assertTrue(queue.matchChomp("hello"));
        assertEquals(" world", queue.toString());
    }

    @Test
    public void testMatchChomp_NoMatch_ReturnsFalseAndDoesNotAdvance() {
        queue = new TokenQueue("hello world");
        assertFalse(queue.matchChomp("world"));
        assertEquals("hello world", queue.toString());
        assertEquals(0, queue.remainingLength() - 11);
    }

    @Test
    public void testMatchesWhitespace_EmptyQueue_ReturnsFalse() {
        assertFalse(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_WhitespaceAtStart_ReturnsTrue() {
        queue = new TokenQueue("   content");
        assertTrue(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWhitespace_NonWhitespaceAtStart_ReturnsFalse() {
        queue = new TokenQueue("content");
        assertFalse(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWord_Letter_ReturnsTrue() {
        queue = new TokenQueue("word");
        assertTrue(queue.matchesWord());
    }

    @Test
    public void testMatchesWord_Digit_ReturnsTrue() {
        queue = new TokenQueue("123abc");
        assertTrue(queue.matchesWord());
    }

    @Test
    public void testMatchesWord_SpecialCharacter_ReturnsFalse() {
        queue = new TokenQueue("@word");
        assertFalse(queue.matchesWord());
    }

    @Test
    public void testAdvance_EmptyQueue_DoesNothing() {
        queue.advance();
        assertTrue(queue.isEmpty());
        assertEquals("", queue.toString());
    }

    @Test
    public void testAdvance_NonEmptyQueue_AdvancesPosition() {
        queue = new TokenQueue("hello");
        queue.advance();
        assertEquals("ello", queue.toString());
    }

    @Test
    public void testConsume_EmptyQueue_ThrowsException() {
        try {
            queue.consume();
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testConsume_NonEmptyQueue_ReturnsFirstCharacter() {
        queue = new TokenQueue("hello");
        assertEquals('h', queue.consume());
        assertEquals("ello", queue.toString());
    }

    @Test
    public void testConsumeString_MatchFound_AdvancesPosition() {
        queue = new TokenQueue("hello world");
        queue.consume("hello");
        assertEquals(" world", queue.toString());
    }

    @Test
    public void testConsumeString_NoMatch_ThrowsIllegalStateException() {
        queue = new TokenQueue("hello");
        try {
            queue.consume("hellx");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testConsumeString_QueueTooShort_ThrowsIllegalStateException() {
        queue = new TokenQueue("hello");
        try {
            queue.consume("hello world");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testConsumeTo_SequenceFound_ReturnsConsumedData() {
        queue = new TokenQueue("pre/post");
        assertEquals("pre", queue.consumeTo("/"));
        assertEquals("/post", queue.toString());
    }

    @Test
    public void testConsumeTo_SequenceNotFound_ReturnsRemainderAndEmptiesQueue() {
        queue = new TokenQueue("hello");
        assertEquals("hello", queue.consumeTo("xyz"));
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsumeToIgnoreCase_SequenceFound_ReturnsConsumedData() {
        queue = new TokenQueue("abcDEFghi");
        assertEquals("abc", queue.consumeToIgnoreCase("def"));
        assertEquals("DEFghi", queue.toString());
    }

    @Test
    public void testConsumeToIgnoreCase_SequenceNotFound_ReturnsRemainder() {
        queue = new TokenQueue("hello");
        assertEquals("hello", queue.consumeToIgnoreCase("xyz"));
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testChompTo_SequenceFound_ReturnsDataBeforeSequenceAndRemovesSequence() {
        queue = new TokenQueue("hello world");
        assertEquals("hello", queue.chompTo(" "));
        assertEquals("world", queue.toString());
    }

    @Test
    public void testChompTo_SequenceNotFound_ReturnsDataAndEmptiesQueue() {
        queue = new TokenQueue("hello");
        assertEquals("hello", queue.chompTo("x"));
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testChompToIgnoreCase_SequenceFound_ReturnsDataBeforeSequenceAndRemovesSequence() {
        queue = new TokenQueue("Hello World");
        assertEquals("Hello", queue.chompToIgnoreCase("World"));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalanced_BalancedContent_ReturnsInnerContent() {
        queue = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", queue.chompBalanced('(', ')'));
        assertEquals(" four", queue.toString());
    }

    @Test
    public void testChompBalanced_UnbalancedOpen_ReturnsEmptyString() {
        queue = new TokenQueue("((unclosed");
        assertEquals("", queue.chompBalanced('(', ')'));
    }

    @Test
    public void testChompBalanced_QuotedSpecialCharacters_ReturnsBalancedContent() {
        queue = new TokenQueue("('(') ) rest");
        assertEquals("'('", queue.chompBalanced('(', ')'));
        assertEquals(" ) rest", queue.toString());
    }

    @Test
    public void testUnescape_ReplacesEscapedCharacters() {
        assertEquals("hello\\world", TokenQueue.unescape("hello\\\\world"));
    }

    @Test
    public void testConsumeWhitespace_AllWhitespace_ReturnsTrueAndConsumesAll() {
        queue = new TokenQueue("   \t\n");
        assertTrue(queue.consumeWhitespace());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsumeWhitespace_NoWhitespace_ReturnsFalse() {
        queue = new TokenQueue("no-space");
        assertFalse(queue.consumeWhitespace());
        assertEquals("no-space", queue.toString());
    }

    @Test
    public void testConsumeWord_WordAtStart_ReturnsWord() {
        queue = new TokenQueue("hello123 world");
        assertEquals("hello123", queue.consumeWord());
        assertEquals(" world", queue.toString());
    }

    @Test
    public void testConsumeWord_NoWordAtStart_ReturnsEmptyString() {
        queue = new TokenQueue("  hello");
        assertEquals("", queue.consumeWord());
        assertEquals("  hello", queue.toString());
    }

    @Test
    public void testConsumeTagName_ValidTagName_ReturnsTagName() {
        queue = new TokenQueue("my-tag:part_other");
        assertEquals("my-tag:part_other", queue.consumeTagName());
    }

    @Test
    public void testConsumeElementSelector_ValidSelector_ReturnsSelector() {
        queue = new TokenQueue("my|tag#id.class");
        assertEquals("my|tag", queue.consumeElementSelector());
    }

    @Test
    public void testConsumeCssIdentifier_ValidIdentifier_ReturnsIdentifier() {
        queue = new TokenQueue("my_class-id_123");
        assertEquals("my_class-id_123", queue.consumeCssIdentifier());
    }

    @Test
    public void testConsumeAttributeKey_ValidKey_ReturnsKey() {
        queue = new TokenQueue("data-key:value");
        assertEquals("data-key", queue.consumeAttributeKey());
    }

    @Test
    public void testRemainder_ReturnsAllRemainingDataAndEmptiesQueue() {
        queue = new TokenQueue("hello world");
        queue.advance();
        queue.advance();
        assertEquals("llo world", queue.remainder());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testToString_ReturnsRemainingData() {
        queue = new TokenQueue("hello world");
        queue.advance();
        queue.advance();
        assertEquals("llo world", queue.toString());
    }

    @Test
    public void testChompBalanced_EmptyQueue_ReturnsEmptyString() {
        queue = new TokenQueue("");
        assertEquals("", queue.chompBalanced('(', ')'));
    }

    @Test
    public void testChompBalanced_EscapedCharacters_ReturnsBalancedCount() {
        queue = new TokenQueue("(a\\(b) end");
        assertEquals("a\\(b", queue.chompBalanced('(', ')'));
        assertEquals(" end", queue.toString());
    }
}