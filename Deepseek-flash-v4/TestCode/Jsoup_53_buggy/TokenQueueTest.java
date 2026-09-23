package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil; // adjusted import if needed
import org.jsoup.helper.Validate;

public class TokenQueueTest {
    private TokenQueue queue;

    @Before
    public void setUp() {
        queue = new TokenQueue("sample");
    }

    @Test
    public void testIsEmpty() {
        assertFalse(queue.isEmpty());
        queue.consumeTo("nomatch");
        assertFalse(queue.isEmpty());
        queue.consumeTo("");
    }

    @Test
    public void testPeek() {
        assertEquals('s', queue.peek());
        TokenQueue empty = new TokenQueue("");
        assertEquals(0, empty.peek());
    }

    @Test
    public void testAddFirst() {
        queue.addFirst('x');
        assertEquals("xsample", queue.toString());
        queue.addFirst("yy");
        assertEquals("yyxsample", queue.toString());
    }

    @Test
    public void testMatches() {
        assertTrue(queue.matches("sam"));
        assertFalse(queue.matches("SAM"));
        assertTrue(queue.matchesCS("sam"));
        assertFalse(queue.matchesCS("Sam"));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesNull() {
        queue.matches(null);
    }

    @Test
    public void testMatchesAny() {
        assertTrue(queue.matchesAny("sa", "mp"));
        assertFalse(queue.matchesAny("xx", "yy"));
    }

    @Test
    public void testMatchesAnyChar() {
        assertTrue(queue.matchesAny('s', 'a'));
        assertFalse(queue.matchesAny('x', 'y'));
        TokenQueue empty = new TokenQueue("");
        assertFalse(empty.matchesAny('s'));
    }

    @Test
    public void testMatchesStartTag() {
        TokenQueue tq = new TokenQueue("<div");
        assertTrue(tq.matchesStartTag());
        tq.advance();
        assertFalse(tq.matchesStartTag());
        TokenQueue shortQueue = new TokenQueue("<");
        assertFalse(shortQueue.matchesStartTag());
    }

    @Test
    public void testMatchChomp() {
        assertTrue(queue.matchChomp("sam"));
        assertEquals("ple", queue.toString());
        assertFalse(queue.matchChomp("nomatch"));
    }

    @Test
    public void testMatchesWhitespace() {
        TokenQueue ws = new TokenQueue("  x");
        assertTrue(ws.matchesWhitespace());
        assertFalse(queue.matchesWhitespace());
    }

    @Test
    public void testMatchesWord() {
        assertTrue(queue.matchesWord());
        TokenQueue sym = new TokenQueue("-x");
        assertFalse(sym.matchesWord());
    }

    @Test
    public void testAdvance() {
        assertEquals('s', queue.peek());
        queue.advance();
        assertEquals('a', queue.peek());
        queue.advance();
        assertEquals('m', queue.peek());
        queue.advance();
        queue.advance();
        queue.advance();
        assertFalse(queue.isEmpty());
        queue.advance();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsume() {
        assertEquals('s', queue.consume());
        assertEquals("ample", queue.toString());
    }

    @Test
    public void testConsumeString() {
        queue.consume("sam");
        assertEquals("ple", queue.toString());
    }

    @Test(expected = IllegalStateException.class)
    public void testConsumeStringMismatch() {
        queue.consume("xyz");
    }

    @Test
    public void testConsumeTo() {
        TokenQueue tq = new TokenQueue("one two three");
        assertEquals("one", tq.consumeTo(" "));
        assertEquals(" two three", tq.toString());
        assertEquals(" two", tq.consumeTo("th"));
        assertEquals("re", tq.toString());
    }

    @Test
    public void testConsumeToIgnoreCase() {
        TokenQueue tq = new TokenQueue("One TWO ThRee");
        assertEquals("One ", tq.consumeToIgnoreCase("two"));
        assertEquals("TWO", tq.consumeToIgnoreCase("TH"));
        assertEquals("Three", tq.toString());
    }

    @Test
    public void testConsumeToNotFound() {
        TokenQueue tq = new TokenQueue("hello");
        assertEquals("hello", tq.consumeTo("zzz"));
        assertFalse(tq.isEmpty());
    }

    @Test
    public void testChompTo() {
        TokenQueue tq = new TokenQueue("one two three");
        assertEquals("one", tq.chompTo(" "));
        assertEquals(" two three", tq.toString());
    }

    @Test
    public void testChompToIgnoreCase() {
        TokenQueue tq = new TokenQueue("One TWO ThRee");
        assertEquals("One ", tq.chompToIgnoreCase("two"));
        assertEquals("TWO", tq.chompToIgnoreCase("TH"));
        assertEquals(" three", tq.toString());
    }

    @Test
    public void testChompBalanced() {
        TokenQueue tq = new TokenQueue("(one (two) three) four");
        assertEquals("one (two) three", tq.chompBalanced('(', ')'));
        assertEquals(" four", tq.toString());
    }

    @Test
    public void testChompBalancedUnbalanced() {
        TokenQueue tq = new TokenQueue("(one two");
        assertEquals("", tq.chompBalanced('(', ')'));
        assertEquals("", tq.toString());
    }

    @Test
    public void testUnescape() {
        assertEquals("a\"b", TokenQueue.unescape("a\\\"b"));
        assertEquals("a\\b", TokenQueue.unescape("a\\\\b"));
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void testConsumeWhitespace() {
        TokenQueue tq = new TokenQueue("  hello");
        assertTrue(tq.consumeWhitespace());
        assertEquals("hello", tq.toString());
        assertFalse(queue.consumeWhitespace());
    }

    @Test
    public void testConsumeWord() {
        TokenQueue tq = new TokenQueue("hello world");
        assertEquals("hello", tq.consumeWord());
        assertEquals(" world", tq.toString());
        TokenQueue empty = new TokenQueue("  ");
        assertEquals("", empty.consumeWord());
    }

    @Test
    public void testConsumeTagName() {
        TokenQueue tq = new TokenQueue("my-tag:name");
        assertEquals("my-tag:name", tq.consumeTagName());
        TokenQueue tq2 = new TokenQueue("abc123_");
        assertEquals("abc123_", tq2.consumeTagName());
    }

    @Test
    public void testConsumeElementSelector() {
        TokenQueue tq = new TokenQueue("tagName|sub");
        assertEquals("tagName|sub", tq.consumeElementSelector());
        TokenQueue tq2 = new TokenQueue("my-class");
        assertEquals("my-class", tq2.consumeElementSelector());
    }

    @Test
    public void testConsumeCssIdentifier() {
        TokenQueue tq = new TokenQueue("-my-id_");
        assertEquals("-my-id_", tq.consumeCssIdentifier());
        TokenQueue tq2 = new TokenQueue("123abc");
        assertEquals("123abc", tq2.consumeCssIdentifier());
    }

    @Test
    public void testConsumeAttributeKey() {
        TokenQueue tq = new TokenQueue("data-id:val");
        assertEquals("data-id:val", tq.consumeAttributeKey());
        TokenQueue tq2 = new TokenQueue("simple_key");
        assertEquals("simple_key", tq2.consumeAttributeKey());
    }

    @Test
    public void testRemainder() {
        TokenQueue tq = new TokenQueue("hello world");
        assertEquals("hello world", tq.remainder());
        assertTrue(tq.isEmpty());
        assertEquals("", tq.remainder());
    }

    @Test
    public void testToString() {
        assertEquals("sample", queue.toString());
        queue.advance();
        assertEquals("ample", queue.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNull() {
        new TokenQueue(null);
    }

    @Test
    public void testConsumeToEnd() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("abc", tq.consumeTo("z"));
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testConsumeToEmptySeq() {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("", tq.consumeTo(""));
        assertEquals("abc", tq.toString());
    }

    @Test
    public void testChompBalancedWithEscapes() {
        TokenQueue tq = new TokenQueue("(a\\(b) c");
        assertEquals("a\\(b", tq.chompBalanced('(', ')'));
        assertEquals(" c", tq.toString());
    }

    @Test
    public void testChompBalancedWithQuotes() {
        TokenQueue tq = new TokenQueue("('a(') b");
        assertEquals("'a('", tq.chompBalanced('(', ')'));
        assertEquals(" b", tq.toString());
    }

    @Test
    public void testConsumeTagNameEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeTagName());
    }

    @Test
    public void testConsumeElementSelectorEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeElementSelector());
    }

    @Test
    public void testConsumeCssIdentifierEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeCssIdentifier());
    }

    @Test
    public void testConsumeAttributeKeyEmpty() {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.consumeAttributeKey());
    }

    @Test
    public void testConsumeWordBoundary() {
        TokenQueue tq = new TokenQueue("abc-def");
        assertEquals("abc", tq.consumeWord());
        assertEquals("-def", tq.toString());
    }

    @Test
    public void testMatchChompAtEnd() {
        TokenQueue tq = new TokenQueue("hello");
        assertTrue(tq.matchChomp("hello"));
        assertFalse(tq.matchChomp(""));
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testAdvancePastEnd() {
        TokenQueue tq = new TokenQueue("x");
        tq.advance();
        tq.advance();
        assertTrue(tq.isEmpty());
    }

    @Test
    public void testConsumeStringAtEnd() {
        TokenQueue tq = new TokenQueue("abc");
        tq.consume("abc");
        try {
            tq.consume("");
            fail("Should throw exception");
        } catch (IllegalStateException e) {
            // expected
        }
    }
}