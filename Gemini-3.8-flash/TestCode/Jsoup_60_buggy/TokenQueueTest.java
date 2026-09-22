package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokenQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullString_shouldThrowException() {
        new TokenQueue(null);
    }

    @Test
    public void isEmpty_givenEmptyString_shouldReturnTrue() {
        TokenQueue queue = new TokenQueue("");
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmpty_givenNonEmptyString_shouldReturnFalse() {
        TokenQueue queue = new TokenQueue("test");
        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void peek_givenEmptyQueue_shouldReturnZero() {
        TokenQueue queue = new TokenQueue("");
        Assert.assertEquals(0, queue.peek());
    }

    @Test
    public void peek_givenQueue_shouldReturnFirstCharWithoutConsuming() {
        TokenQueue queue = new TokenQueue("abc");
        Assert.assertEquals('a', queue.peek());
        Assert.assertEquals('a', queue.peek());
        Assert.assertEquals("abc", queue.toString());
    }

    @Test
    public void addFirst_givenCharacter_shouldPrependToQueue() {
        TokenQueue queue = new TokenQueue("bc");
        queue.addFirst(Character.valueOf('a'));
        Assert.assertEquals("abc", queue.toString());
        Assert.assertEquals('a', queue.peek());
    }

    @Test
    public void addFirst_givenString_shouldPrependToQueue() {
        TokenQueue queue = new TokenQueue("world");
        queue.addFirst("hello ");
        Assert.assertEquals("hello world", queue.toString());
    }

    @Test
    public void addFirst_afterPartiallyConsumed_shouldResetPosAndPrepend() {
        TokenQueue queue = new TokenQueue("12345");
        queue.consume(); // pos = 1
        queue.consume(); // pos = 2
        queue.addFirst("ab");
        Assert.assertEquals("ab345", queue.toString());
        Assert.assertEquals('a', queue.peek());
    }

    @Test
    public void matches_givenCaseInsensitiveMatch_shouldReturnTrue() {
        TokenQueue queue = new TokenQueue("HeLLo World");
        Assert.assertTrue(queue.matches("hello"));
        Assert.assertTrue(queue.matches("HELLO"));
    }

    @Test
    public void matches_givenMismatch_shouldReturnFalse() {
        TokenQueue queue = new TokenQueue("Hello World");
        Assert.assertFalse(queue.matches("world"));
    }

    @Test
    public void matchesCS_givenCaseSensitiveMatch_shouldReturnTrue() {
        TokenQueue queue = new TokenQueue("Hello World");
        Assert.assertTrue(queue.matchesCS("Hello"));
        Assert.assertFalse(queue.matchesCS("hello"));
    }

    @Test
    public void matchesAny_givenStringArray_shouldReturnTrueIfAnyMatches() {
        TokenQueue queue = new TokenQueue("Testing");
        Assert.assertTrue(queue.matchesAny(new String[]{"nomatch", "test"}));
        Assert.assertFalse(queue.matchesAny(new String[]{"nomatch1", "nomatch2"}));
    }

    @Test
    public void matchesAny_givenCharArray_shouldReturnTrueIfAnyMatches() {
        TokenQueue queue = new TokenQueue("apple");
        Assert.assertTrue(queue.matchesAny(new char[]{'x', 'y', 'a'}));
        Assert.assertFalse(queue.matchesAny(new char[]{'b', 'c'}));
    }

    @Test
    public void matchesAny_givenEmptyQueueForCharArray_shouldReturnFalse() {
        TokenQueue queue = new TokenQueue("");
        Assert.assertFalse(queue.matchesAny(new char[]{'a', 'b'}));
    }

    @Test
    public void matchesStartTag_givenValidStartTag_shouldReturnTrue() {
        TokenQueue queue = new TokenQueue("<p>Text</p>");
        Assert.assertTrue(queue.matchesStartTag());

        TokenQueue uppercaseTag = new TokenQueue("<DIV>");
        Assert.assertTrue(uppercaseTag.matchesStartTag());
    }

    @Test
    public void matchesStartTag_givenInvalidStartTagOrTooShort_shouldReturnFalse() {
        TokenQueue nonTag = new TokenQueue("p>");
        Assert.assertFalse(nonTag.matchesStartTag());

        TokenQueue symbolOnly = new TokenQueue("<!DOCTYPE html>");
        Assert.assertFalse(symbolOnly.matchesStartTag());

        TokenQueue numberTag = new TokenQueue("<1tag>");
        Assert.assertFalse(numberTag.matchesStartTag());

        TokenQueue singleChar = new TokenQueue("<");
        Assert.assertFalse(singleChar.matchesStartTag());

        TokenQueue empty = new TokenQueue("");
        Assert.assertFalse(empty.matchesStartTag());
    }

    @Test
    public void matchChomp_givenMatch_shouldAdvanceAndReturnTrue() {
        TokenQueue queue = new TokenQueue("OneTwoThree");
        Assert.assertTrue(queue.matchChomp("one"));
        Assert.assertEquals("TwoThree", queue.toString());
    }

    @Test
    public void matchChomp_givenMismatch_shouldNotAdvanceAndReturnFalse() {
        TokenQueue queue = new TokenQueue("OneTwoThree");
        Assert.assertFalse(queue.matchChomp("Two"));
        Assert.assertEquals("OneTwoThree", queue.toString());
    }

    @Test
    public void matchesWhitespace_givenWhitespace_shouldReturnTrue() {
        TokenQueue space = new TokenQueue("   hello");
        Assert.assertTrue(space.matchesWhitespace());

        TokenQueue tab = new TokenQueue("\tworld");
        Assert.assertTrue(tab.matchesWhitespace());

        TokenQueue newline = new TokenQueue("\nworld");
        Assert.assertTrue(newline.matchesWhitespace());
    }

    @Test
    public void matchesWhitespace_givenNonWhitespaceOrEmpty_shouldReturnFalse() {
        TokenQueue word = new TokenQueue("abc");
        Assert.assertFalse(word.matchesWhitespace());

        TokenQueue empty = new TokenQueue("");
        Assert.assertFalse(empty.matchesWhitespace());
    }

    @Test
    public void matchesWord_givenLetterOrDigit_shouldReturnTrue() {
        TokenQueue letter = new TokenQueue("abc");
        Assert.assertTrue(letter.matchesWord());

        TokenQueue digit = new TokenQueue("123");
        Assert.assertTrue(digit.matchesWord());
    }

    @Test
    public void matchesWord_givenSymbolsOrWhitespaceOrEmpty_shouldReturnFalse() {
        TokenQueue symbol = new TokenQueue("!abc");
        Assert.assertFalse(symbol.matchesWord());

        TokenQueue whitespace = new TokenQueue(" abc");
        Assert.assertFalse(whitespace.matchesWord());

        TokenQueue empty = new TokenQueue("");
        Assert.assertFalse(empty.matchesWord());
    }

    @Test
    public void advance_givenNonEmptyQueue_shouldAdvanceOnePosition() {
        TokenQueue queue = new TokenQueue("abc");
        queue.advance();
        Assert.assertEquals("bc", queue.toString());
    }

    @Test
    public void advance_givenEmptyQueue_shouldDoNothing() {
        TokenQueue queue = new TokenQueue("");
        queue.advance();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consume_givenNonEmptyQueue_shouldReturnCharAndAdvance() {
        TokenQueue queue = new TokenQueue("ab");
        Assert.assertEquals('a', queue.consume());
        Assert.assertEquals('b', queue.consume());
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consumeString_givenMatchingSequence_shouldConsume() {
        TokenQueue queue = new TokenQueue("abcdef");
        queue.consume("abc");
        Assert.assertEquals("def", queue.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void consumeString_givenMismatch_shouldThrowIllegalStateException() {
        TokenQueue queue = new TokenQueue("abcdef");
        queue.consume("xyz");
    }

    @Test(expected = IllegalStateException.class)
    public void consumeString_givenLongerMatchingSequenceThanRemaining_shouldThrowIllegalStateException() {
        TokenQueue queue = new TokenQueue("abc");
        queue.consume("abcd");
    }

    @Test
    public void consumeTo_givenSequenceFound_shouldConsumeUpToSequenceExclusive() {
        TokenQueue queue = new TokenQueue("one,two,three");
        String consumed = queue.consumeTo(",");
        Assert.assertEquals("one", consumed);
        Assert.assertEquals(",two,three", queue.toString());
    }

    @Test
    public void consumeTo_givenSequenceNotFound_shouldConsumeEntireQueue() {
        TokenQueue queue = new TokenQueue("onetwothree");
        String consumed = queue.consumeTo(",");
        Assert.assertEquals("onetwothree", consumed);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consumeToIgnoreCase_givenCasedLetter_shouldConsumeCorrectly() {
        TokenQueue queue = new TokenQueue("one TWO three");
        String consumed = queue.consumeToIgnoreCase("two");
        Assert.assertEquals("one ", consumed);
        Assert.assertEquals("TWO three", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedCharSkipEqualZero_shouldAdvancePos() {
        TokenQueue queue = new TokenQueue("==target");
        String consumed = queue.consumeToIgnoreCase("=target");
        Assert.assertEquals("=", consumed);
        Assert.assertEquals("=target", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedCharSkipPositive_shouldSkipAhead() {
        TokenQueue queue = new TokenQueue("abc=def=target");
        String consumed = queue.consumeToIgnoreCase("=target");
        Assert.assertEquals("abc=def", consumed);
        Assert.assertEquals("=target", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedCharNotFound_shouldConsumeToEnd() {
        TokenQueue queue = new TokenQueue("abcdef");
        String consumed = queue.consumeToIgnoreCase("=notfound");
        Assert.assertEquals("abcdef", consumed);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consumeToIgnoreCase_givenEmptyQueue_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("");
        String consumed = queue.consumeToIgnoreCase("target");
        Assert.assertEquals("", consumed);
    }

    @Test
    public void consumeToAny_givenMultipleTerminators_shouldStopAtFirstMatch() {
        TokenQueue queue = new TokenQueue("hello world; test");
        String consumed = queue.consumeToAny(new String[]{";", " "});
        Assert.assertEquals("hello", consumed);
        Assert.assertEquals(" world; test", queue.toString());
    }

    @Test
    public void consumeToAny_givenNoMatch_shouldConsumeToEnd() {
        TokenQueue queue = new TokenQueue("hello world");
        String consumed = queue.consumeToAny(new String[]{";", "!"});
        Assert.assertEquals("hello world", consumed);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompTo_givenMatchingSequence_shouldConsumeUpToAndRemoveSequence() {
        TokenQueue queue = new TokenQueue("title:jsoup;");
        String consumed = queue.chompTo(":");
        Assert.assertEquals("title", consumed);
        Assert.assertEquals("jsoup;", queue.toString());
    }

    @Test
    public void chompTo_givenNoMatch_shouldConsumeAllAndLeaveEmpty() {
        TokenQueue queue = new TokenQueue("title without colon");
        String consumed = queue.chompTo(":");
        Assert.assertEquals("title without colon", consumed);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompToIgnoreCase_givenCaseInsensitiveMatch_shouldConsumeAndRemoveSequence() {
        TokenQueue queue = new TokenQueue("header:VALUE;");
        String consumed = queue.chompToIgnoreCase("value");
        Assert.assertEquals("header:", consumed);
        Assert.assertEquals(";", queue.toString());
    }

    @Test
    public void chompToIgnoreCase_givenNoMatch_shouldConsumeAllAndLeaveEmpty() {
        TokenQueue queue = new TokenQueue("header without target");
        String consumed = queue.chompToIgnoreCase("target123");
        Assert.assertEquals("header without target", consumed);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompBalanced_givenSimpleNestedParentheses_shouldExtractContents() {
        TokenQueue queue = new TokenQueue("(one (two) three) four");
        String balanced = queue.chompBalanced('(', ')');
        Assert.assertEquals("one (two) three", balanced);
        Assert.assertEquals(" four", queue.toString());
    }

    @Test
    public void chompBalanced_givenQuotedParentheses_shouldIgnoreParenthesesInsideQuotes() {
        TokenQueue queue = new TokenQueue("(')' and \")\" and (nested)) after");
        String balanced = queue.chompBalanced('(', ')');
        Assert.assertEquals("')' and \")\" and (nested)", balanced);
        Assert.assertEquals(" after", queue.toString());
    }

    @Test
    public void chompBalanced_givenEscapedParentheses_shouldPreserveEscapeAndIgnoreNesting() {
        TokenQueue queue = new TokenQueue("(one \\( two \\) three) four");
        String balanced = queue.chompBalanced('(', ')');
        Assert.assertEquals("one \\( two \\) three", balanced);
        Assert.assertEquals(" four", queue.toString());
    }

    @Test
    public void chompBalanced_givenUnclosedQuotes_shouldProcessUntilEnd() {
        TokenQueue queue = new TokenQueue("('unclosed quote)");
        String balanced = queue.chompBalanced('(', ')');
        Assert.assertEquals("", balanced);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompBalanced_givenEmptyOrUnmatchedString_shouldReturnEmptyString() {
        TokenQueue empty = new TokenQueue("");
        Assert.assertEquals("", empty.chompBalanced('(', ')'));

        TokenQueue noOpen = new TokenQueue("no open paren here");
        Assert.assertEquals("", noOpen.chompBalanced('(', ')'));
    }

    @Test
    public void chompBalanced_givenQuoteCharAsOpenChar_shouldHandleWithoutTogglingQuote() {
        TokenQueue queue = new TokenQueue("'quoted text' rest");
        String balanced = queue.chompBalanced('\'', '\'');
        Assert.assertEquals("quoted text", balanced);
        Assert.assertEquals(" rest", queue.toString());
    }

    @Test
    public void unescape_givenEscapedCharacters_shouldUnescapeProperly() {
        Assert.assertEquals("a\\b", TokenQueue.unescape("a\\\\b"));
        Assert.assertEquals("hello world", TokenQueue.unescape("hello\\ world"));
        Assert.assertEquals("foo", TokenQueue.unescape("foo"));
        Assert.assertEquals("", TokenQueue.unescape(""));
    }

    @Test
    public void unescape_givenMultipleEscapes_shouldHandleConsecutiveBackslashes() {
        Assert.assertEquals("\\\\", TokenQueue.unescape("\\\\\\\\"));
    }

    @Test
    public void consumeWhitespace_givenWhitespacePrefix_shouldConsumeAllAndReturnTrue() {
        TokenQueue queue = new TokenQueue(" \t\n  hello");
        boolean result = queue.consumeWhitespace();
        Assert.assertTrue(result);
        Assert.assertEquals("hello", queue.toString());
    }

    @Test
    public void consumeWhitespace_givenNoWhitespace_shouldReturnFalseAndLeaveQueueIntact() {
        TokenQueue queue = new TokenQueue("hello");
        boolean result = queue.consumeWhitespace();
        Assert.assertFalse(result);
        Assert.assertEquals("hello", queue.toString());
    }

    @Test
    public void consumeWord_givenWordPrefix_shouldConsumeOnlyWordCharacters() {
        TokenQueue queue = new TokenQueue("word123 and more");
        String word = queue.consumeWord();
        Assert.assertEquals("word123", word);
        Assert.assertEquals(" and more", queue.toString());
    }

    @Test
    public void consumeWord_givenNonWordPrefix_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("!word");
        String word = queue.consumeWord();
        Assert.assertEquals("", word);
        Assert.assertEquals("!word", queue.toString());
    }

    @Test
    public void consumeTagName_givenValidTagName_shouldConsumeTagChars() {
        TokenQueue queue = new TokenQueue("ns:tag_name-1 rest");
        String tag = queue.consumeTagName();
        Assert.assertEquals("ns:tag_name-1", tag);
        Assert.assertEquals(" rest", queue.toString());
    }

    @Test
    public void consumeTagName_givenNonTagChar_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("!notATag");
        String tag = queue.consumeTagName();
        Assert.assertEquals("", tag);
        Assert.assertEquals("!notATag", queue.toString());
    }

    @Test
    public void consumeElementSelector_givenValidSelector_shouldConsumeSelectorChars() {
        TokenQueue queue = new TokenQueue("ns|tag_name-*|wildcard rest");
        String selector = queue.consumeElementSelector();
        Assert.assertEquals("ns|tag_name-*|wildcard", selector);
        Assert.assertEquals(" rest", queue.toString());
    }

    @Test
    public void consumeElementSelector_givenNonSelectorChar_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("!selector");
        String selector = queue.consumeElementSelector();
        Assert.assertEquals("", selector);
        Assert.assertEquals("!selector", queue.toString());
    }

    @Test
    public void consumeCssIdentifier_givenValidIdentifier_shouldConsumeCssChars() {
        TokenQueue queue = new TokenQueue("my-class_name123.rest");
        String identifier = queue.consumeCssIdentifier();
        Assert.assertEquals("my-class_name123", identifier);
        Assert.assertEquals(".rest", queue.toString());
    }

    @Test
    public void consumeCssIdentifier_givenNonCssChar_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue(":notAnIdentifier");
        String identifier = queue.consumeCssIdentifier();
        Assert.assertEquals("", identifier);
        Assert.assertEquals(":notAnIdentifier", queue.toString());
    }

    @Test
    public void consumeAttributeKey_givenValidAttributeKey_shouldConsumeAttributeChars() {
        TokenQueue queue = new TokenQueue("xml:attr_name-1=val");
        String key = queue.consumeAttributeKey();
        Assert.assertEquals("xml:attr_name-1", key);
        Assert.assertEquals("=val", queue.toString());
    }

    @Test
    public void consumeAttributeKey_givenNonKeyChar_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("=value");
        String key = queue.consumeAttributeKey();
        Assert.assertEquals("", key);
        Assert.assertEquals("=value", queue.toString());
    }

    @Test
    public void remainder_givenQueueWithConsumedPart_shouldReturnRemainingStringAndEmptyQueue() {
        TokenQueue queue = new TokenQueue("first second third");
        queue.consumeWord();
        queue.consumeWhitespace();
        String remainder = queue.remainder();
        Assert.assertEquals("second third", remainder);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void remainder_givenEmptyQueue_shouldReturnEmptyString() {
        TokenQueue queue = new TokenQueue("");
        String remainder = queue.remainder();
        Assert.assertEquals("", remainder);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void toString_shouldReturnUnconsumedPortion() {
        TokenQueue queue = new TokenQueue("abcdef");
        queue.consume();
        queue.consume();
        Assert.assertEquals("cdef", queue.toString());
    }
}