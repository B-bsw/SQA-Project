package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class TokenQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullData_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        new TokenQueue(null);
    }

    @Test
    public void isEmpty_givenEmptyString_shouldReturnTrue() {
        // Arrange
        TokenQueue queue = new TokenQueue("");

        // Act & Assert
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmpty_givenNonEmptyString_shouldReturnFalse() {
        // Arrange
        TokenQueue queue = new TokenQueue("abc");

        // Act & Assert
        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void peek_givenEmptyQueue_shouldReturnZeroChar() {
        // Arrange
        TokenQueue queue = new TokenQueue("");

        // Act
        char result = queue.peek();

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void peek_givenNonEmptyQueue_shouldReturnFirstCharWithoutConsuming() {
        // Arrange
        TokenQueue queue = new TokenQueue("abc");

        // Act
        char result1 = queue.peek();
        char result2 = queue.peek();

        // Assert
        Assert.assertEquals('a', result1);
        Assert.assertEquals('a', result2);
        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void addFirst_givenCharacter_shouldPrependToQueue() {
        // Arrange
        TokenQueue queue = new TokenQueue("world");

        // Act
        queue.addFirst(Character.valueOf(' '));

        // Assert
        Assert.assertEquals(" world", queue.toString());
        Assert.assertEquals(' ', queue.peek());
    }

    @Test
    public void addFirst_givenStringAfterAdvance_shouldPrependToCurrentPosition() {
        // Arrange
        TokenQueue queue = new TokenQueue("hello world");
        queue.consumeWord(); // consumes "hello"
        queue.consumeWhitespace(); // consumes " "

        // Act
        queue.addFirst("brave new ");

        // Assert
        Assert.assertEquals("brave new world", queue.toString());
        Assert.assertEquals("brave", queue.consumeWord());
    }

    @Test
    public void matches_givenCaseInsensitiveMatch_shouldReturnTrue() {
        // Arrange
        TokenQueue queue = new TokenQueue("HELLO World");

        // Act & Assert
        Assert.assertTrue(queue.matches("hello"));
        Assert.assertTrue(queue.matches("HELLO"));
        Assert.assertFalse(queue.matches("world"));
    }

    @Test
    public void matchesCS_givenCaseSensitiveMatch_shouldDistinguishCase() {
        // Arrange
        TokenQueue queue = new TokenQueue("Hello World");

        // Act & Assert
        Assert.assertTrue(queue.matchesCS("Hello"));
        Assert.assertFalse(queue.matchesCS("hello"));
        Assert.assertFalse(queue.matchesCS("World"));
    }

    @Test
    public void matchesAny_givenStringArray_shouldReturnTrueIfAnyMatches() {
        // Arrange
        TokenQueue queue = new TokenQueue("<div>content</div>");

        // Act & Assert
        Assert.assertTrue(queue.matchesAny(new String[]{"span", "div", "p"}));
        Assert.assertTrue(queue.matchesAny(new String[]{"<DIV", "<SPAN"}));
        Assert.assertFalse(queue.matchesAny(new String[]{"span", "section"}));
        Assert.assertFalse(queue.matchesAny(new String[0]));
    }

    @Test
    public void matchesAny_givenEmptyQueue_shouldReturnFalse() {
        // Arrange
        TokenQueue queue = new TokenQueue("");

        // Act & Assert
        Assert.assertFalse(queue.matchesAny(new char[]{'a', 'b'}));
    }

    @Test
    public void matchesAny_givenCharArray_shouldReturnTrueIfMatches() {
        // Arrange
        TokenQueue queue = new TokenQueue("test");

        // Act & Assert
        Assert.assertTrue(queue.matchesAny(new char[]{'x', 'y', 't'}));
        Assert.assertFalse(queue.matchesAny(new char[]{'a', 'b', 'c'}));
        Assert.assertFalse(queue.matchesAny(new char[0]));
    }

    @Test
    public void matchesStartTag_givenQueueStartingWithValidTag_shouldReturnTrue() {
        // Arrange
        TokenQueue queue = new TokenQueue("<p>Text</p>");

        // Act & Assert
        Assert.assertTrue(queue.matchesStartTag());
    }

    @Test
    public void matchesStartTag_givenQueueWithShortLengthOrNonLetter_shouldReturnFalse() {
        // Arrange
        TokenQueue emptyQueue = new TokenQueue("");
        TokenQueue singleCharQueue = new TokenQueue("<");
        TokenQueue numberTagQueue = new TokenQueue("<1tag>");
        TokenQueue spaceTagQueue = new TokenQueue("< tag>");
        TokenQueue closeTagQueue = new TokenQueue("</tag>");

        // Act & Assert
        Assert.assertFalse(emptyQueue.matchesStartTag());
        Assert.assertFalse(singleCharQueue.matchesStartTag());
        Assert.assertFalse(numberTagQueue.matchesStartTag());
        Assert.assertFalse(spaceTagQueue.matchesStartTag());
        Assert.assertFalse(closeTagQueue.matchesStartTag());
    }

    @Test
    public void matchChomp_givenMatchingPrefix_shouldConsumeAndReturnTrue() {
        // Arrange
        TokenQueue queue = new TokenQueue("HelloWorld");

        // Act
        boolean result = queue.matchChomp("hello");

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("World", queue.remainder());
    }

    @Test
    public void matchChomp_givenNonMatchingPrefix_shouldNotConsumeAndReturnFalse() {
        // Arrange
        TokenQueue queue = new TokenQueue("HelloWorld");

        // Act
        boolean result = queue.matchChomp("bye");

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals("HelloWorld", queue.remainder());
    }

    @Test
    public void matchesWhitespace_givenLeadingWhitespace_shouldReturnTrue() {
        // Arrange
        TokenQueue spaceQueue = new TokenQueue("   text");
        TokenQueue tabQueue = new TokenQueue("\ttext");
        TokenQueue newlineQueue = new TokenQueue("\ntext");
        TokenQueue emptyQueue = new TokenQueue("");
        TokenQueue nonWhitespaceQueue = new TokenQueue("text");

        // Act & Assert
        Assert.assertTrue(spaceQueue.matchesWhitespace());
        Assert.assertTrue(tabQueue.matchesWhitespace());
        Assert.assertTrue(newlineQueue.matchesWhitespace());
        Assert.assertFalse(emptyQueue.matchesWhitespace());
        Assert.assertFalse(nonWhitespaceQueue.matchesWhitespace());
    }

    @Test
    public void matchesWord_givenQueueStartingWithLetterOrDigit_shouldReturnTrue() {
        // Arrange
        TokenQueue letterQueue = new TokenQueue("abc");
        TokenQueue digitQueue = new TokenQueue("123");
        TokenQueue symbolQueue = new TokenQueue("-abc");
        TokenQueue emptyQueue = new TokenQueue("");

        // Act & Assert
        Assert.assertTrue(letterQueue.matchesWord());
        Assert.assertTrue(digitQueue.matchesWord());
        Assert.assertFalse(symbolQueue.matchesWord());
        Assert.assertFalse(emptyQueue.matchesWord());
    }

    @Test
    public void advance_givenNonEmptyQueue_shouldAdvancePosition() {
        // Arrange
        TokenQueue queue = new TokenQueue("abc");

        // Act
        queue.advance();

        // Assert
        Assert.assertEquals('b', queue.peek());
    }

    @Test
    public void advance_givenEmptyQueue_shouldDoNothing() {
        // Arrange
        TokenQueue queue = new TokenQueue("");

        // Act
        queue.advance();

        // Assert
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consume_givenNonEmptyQueue_shouldReturnCharAndAdvance() {
        // Arrange
        TokenQueue queue = new TokenQueue("abc");

        // Act
        char c1 = queue.consume();
        char c2 = queue.consume();

        // Assert
        Assert.assertEquals('a', c1);
        Assert.assertEquals('b', c2);
        Assert.assertEquals('c', queue.peek());
    }

    @Test
    public void consume_givenMatchingSequence_shouldConsumeEntireSequence() {
        // Arrange
        TokenQueue queue = new TokenQueue("Title Case text");

        // Act
        queue.consume("title case");

        // Assert
        Assert.assertEquals(" text", queue.remainder());
    }

    @Test(expected = IllegalStateException.class)
    public void consume_givenNonMatchingSequence_shouldThrowIllegalStateException() {
        // Arrange
        TokenQueue queue = new TokenQueue("Hello world");

        // Act & Assert
        queue.consume("world");
    }

    @Test
    public void consumeTo_givenSequenceFound_shouldConsumeUpToSequenceExclusive() {
        // Arrange
        TokenQueue queue = new TokenQueue("before:after");

        // Act
        String result = queue.consumeTo(":");

        // Assert
        Assert.assertEquals("before", result);
        Assert.assertEquals(":after", queue.toString());
    }

    @Test
    public void consumeTo_givenSequenceNotFound_shouldConsumeEntireQueue() {
        // Arrange
        TokenQueue queue = new TokenQueue("no delimiter in string");

        // Act
        String result = queue.consumeTo(":");

        // Assert
        Assert.assertEquals("no delimiter in string", result);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consumeToIgnoreCase_givenCasedTarget_shouldScanAndConsumeUpToTarget() {
        // Arrange
        TokenQueue queue = new TokenQueue("abcDefGhi");

        // Act
        String result = queue.consumeToIgnoreCase("def");

        // Assert
        Assert.assertEquals("abc", result);
        Assert.assertEquals("DefGhi", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedTargetSkipGreaterThanZero_shouldConsumeUpToTarget() {
        // Arrange
        TokenQueue queue = new TokenQueue("prefix 123 suffix");

        // Act - '1' is non-cased, so canScan is true
        String result = queue.consumeToIgnoreCase("123");

        // Assert
        Assert.assertEquals("prefix ", result);
        Assert.assertEquals("123 suffix", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedTargetAtCurrentPosition_shouldAdvance() {
        // Arrange
        // '1' is at current pos, but whole sequence "123" does not match initially because sequence is "123" and text is "10123"
        TokenQueue queue = new TokenQueue("10123");

        // Act
        String result = queue.consumeToIgnoreCase("123");

        // Assert
        Assert.assertEquals("10", result);
        Assert.assertEquals("123", queue.toString());
    }

    @Test
    public void consumeToIgnoreCase_givenNonCasedTargetNotFound_shouldConsumeToEnd() {
        // Arrange
        TokenQueue queue = new TokenQueue("text without target");

        // Act - '9' is non-cased and not present in queue
        String result = queue.consumeToIgnoreCase("999");

        // Assert
        Assert.assertEquals("text without target", result);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void consumeToAny_givenMultipleSequences_shouldConsumeToFirstMatch() {
        // Arrange
        TokenQueue queue = new TokenQueue("a quick brown fox");

        // Act
        String result = queue.consumeToAny(new String[]{"fox", "brown", "quick"});

        // Assert
        Assert.assertEquals("a ", result);
        Assert.assertEquals("quick brown fox", queue.toString());
    }

    @Test
    public void consumeToAny_givenNoMatches_shouldConsumeToEnd() {
        // Arrange
        TokenQueue queue = new TokenQueue("all remaining content");

        // Act
        String result = queue.consumeToAny(new String[]{"xyz", "123"});

        // Assert
        Assert.assertEquals("all remaining content", result);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompTo_givenMatchingSequence_shouldConsumeUpToAndIncludingSequence() {
        // Arrange
        TokenQueue queue = new TokenQueue("header: body");

        // Act
        String result = queue.chompTo(":");

        // Assert
        Assert.assertEquals("header", result);
        Assert.assertEquals(" body", queue.toString());
    }

    @Test
    public void chompTo_givenSequenceNotFound_shouldReturnRemainderAndEmptyQueue() {
        // Arrange
        TokenQueue queue = new TokenQueue("sole text");

        // Act
        String result = queue.chompTo("missing");

        // Assert
        Assert.assertEquals("sole text", result);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void chompToIgnoreCase_givenMatchingSequence_shouldConsumeUpToAndMatchChomp() {
        // Arrange
        TokenQueue queue = new TokenQueue("foo<DIV>bar");

        // Act
        String result = queue.chompToIgnoreCase("<div>");

        // Assert
        Assert.assertEquals("foo", result);
        Assert.assertEquals("bar", queue.toString());
    }

    @Test
    public void chompBalanced_givenStandardNestedPairs_shouldReturnInnerBalancedContent() {
        // Arrange
        TokenQueue queue = new TokenQueue("(one (two) three) four");

        // Act
        String result = queue.chompBalanced('(', ')');

        // Assert
        Assert.assertEquals("one (two) three", result);
        Assert.assertEquals(" four", queue.toString());
    }

    @Test
    public void chompBalanced_givenEscapedCharacters_shouldIgnoreEscapedBrackets() {
        // Arrange
        TokenQueue queue = new TokenQueue("(one \\(two\\) three) four");

        // Act
        String result = queue.chompBalanced('(', ')');

        // Assert
        Assert.assertEquals("one \\(two\\) three", result);
        Assert.assertEquals(" four", queue.toString());
    }

    @Test
    public void chompBalanced_givenEmptyQueue_shouldReturnEmptyString() {
        // Arrange
        TokenQueue queue = new TokenQueue("");

        // Act
        String result = queue.chompBalanced('(', ')');

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void chompBalanced_givenUnbalancedOpener_shouldReturnEmptyString() {
        // Arrange
        TokenQueue queue = new TokenQueue("(unbalanced");

        // Act
        String result = queue.chompBalanced('(', ')');

        // Assert
        Assert.assertEquals("", result);
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void unescape_givenVariousEscapeSequences_shouldUnescapeProperly() {
        // Arrange
        String input = "simple\\ttext\\\\escaped\\";

        // Act
        String output = TokenQueue.unescape(input);

        // Assert
        Assert.assertEquals("simpletescaped", output);
    }

    @Test
    public void unescape_givenDoubleEscapes_shouldKeepSingleEscape() {
        // Arrange
        String input = "\\\\";

        // Act
        String output = TokenQueue.unescape(input);

        // Assert
        Assert.assertEquals("\\", output);
    }

    @Test
    public void consumeWhitespace_givenLeadingWhitespace_shouldReturnTrueAndConsumeAll() {
        // Arrange
        TokenQueue queue = new TokenQueue("  \t\n  text");

        // Act
        boolean result = queue.consumeWhitespace();

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("text", queue.toString());
    }

    @Test
    public void consumeWhitespace_givenNoLeadingWhitespace_shouldReturnFalse() {
        // Arrange
        TokenQueue queue = new TokenQueue("text  ");

        // Act
        boolean result = queue.consumeWhitespace();

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals("text  ", queue.toString());
    }

    @Test
    public void consumeWord_givenQueueStartingWithWord_shouldReturnWordOnly() {
        // Arrange
        TokenQueue queue = new TokenQueue("word123-rest");

        // Act
        String word = queue.consumeWord();

        // Assert
        Assert.assertEquals("word123", word);
        Assert.assertEquals("-rest", queue.toString());
    }

    @Test
    public void consumeWord_givenQueueStartingWithNonWord_shouldReturnEmptyString() {
        // Arrange
        TokenQueue queue = new TokenQueue("!@#abc");

        // Act
        String word = queue.consumeWord();

        // Assert
        Assert.assertEquals("", word);
        Assert.assertEquals("!@#abc", queue.toString());
    }

    @Test
    public void consumeTagName_givenNamespaceAndHyphen_shouldConsumeFullTagName() {
        // Arrange
        TokenQueue queue = new TokenQueue("xml:custom_tag-name class='abc'");

        // Act
        String tagName = queue.consumeTagName();

        // Assert
        Assert.assertEquals("xml:custom_tag-name", tagName);
        Assert.assertEquals(" class='abc'", queue.toString());
    }

    @Test
    public void consumeElementSelector_givenNamespacePipe_shouldConsumeFullSelector() {
        // Arrange
        TokenQueue queue = new TokenQueue("ns|element_name-sub#id");

        // Act
        String selector = queue.consumeElementSelector();

        // Assert
        Assert.assertEquals("ns|element_name-sub", selector);
        Assert.assertEquals("#id", queue.toString());
    }

    @Test
    public void consumeCssIdentifier_givenIdentifierWithHyphenAndUnderscore_shouldConsumeIdentifier() {
        // Arrange
        TokenQueue queue = new TokenQueue("my-class_name:hover");

        // Act
        String id = queue.consumeCssIdentifier();

        // Assert
        Assert.assertEquals("my-class_name", id);
        Assert.assertEquals(":hover", queue.toString());
    }

    @Test
    public void consumeAttributeKey_givenKeyWithColonAndHyphen_shouldConsumeAttributeKey() {
        // Arrange
        TokenQueue queue = new TokenQueue("data-custom_attr:key=value");

        // Act
        String key = queue.consumeAttributeKey();

        // Assert
        Assert.assertEquals("data-custom_attr:key", key);
        Assert.assertEquals("=value", queue.toString());
    }

    @Test
    public void remainder_givenQueuePartiallyConsumed_shouldReturnRemainingStringAndEmptyQueue() {
        // Arrange
        TokenQueue queue = new TokenQueue("first second third");
        queue.consumeWord();
        queue.consumeWhitespace();

        // Act
        String remainder = queue.remainder();

        // Assert
        Assert.assertEquals("second third", remainder);
        Assert.assertTrue(queue.isEmpty());
        Assert.assertEquals("", queue.remainder());
    }

    @Test
    public void toString_givenQueuePartiallyConsumed_shouldReflectRemainingData() {
        // Arrange
        TokenQueue queue = new TokenQueue("sample text");
        queue.consumeWord();

        // Act
        String representation = queue.toString();

        // Assert
        Assert.assertEquals(" text", representation);
    }
}