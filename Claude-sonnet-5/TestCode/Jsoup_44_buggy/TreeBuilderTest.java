package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeBuilderTest {

    // Concrete subclass to exercise the abstract TreeBuilder
    static class DummyTreeBuilder extends TreeBuilder {
        int processCount = 0;
        Token.TokenType lastTokenType = null;
        String lastTagName = null;
        List<Token.TokenType> typesLog = new ArrayList<Token.TokenType>();

        @Override
        protected boolean process(Token token) {
            processCount++;
            lastTokenType = token.type;
            typesLog.add(token.type);
            if (token instanceof Token.Tag) {
                lastTagName = ((Token.Tag) token).name();
            }
            return true;
        }
    }

    // ---------- initialiseParse tests ----------

    @Test
    public void testInitialiseParseNormal() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        assertNotNull(tb.doc);
        assertNotNull(tb.reader);
        assertNotNull(tb.tokeniser);
        assertNotNull(tb.stack);
        assertEquals(0, tb.stack.size());
        assertEquals("http://example.com/", tb.baseUri);
        assertNotNull(tb.errors);
    }

    @Test
    public void testInitialiseParseEmptyInput() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        assertNotNull(tb.doc);
        assertEquals("http://example.com/", tb.baseUri);
    }

    @Test
    public void testInitialiseParseNullInputThrows() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        try {
            tb.initialiseParse(null, "http://example.com/", ParseErrorList.noTracking());
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInitialiseParseNullBaseUriThrows() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        try {
            tb.initialiseParse("<html></html>", null, ParseErrorList.noTracking());
            fail("Expected IllegalArgumentException for null baseUri");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // ---------- parse(input, baseUri) tests ----------

    @Test
    public void testParseTwoArgNormal() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        Document doc = tb.parse("<p>Hello</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("http://example.com/", tb.baseUri);
        assertTrue(tb.processCount > 0);
        assertTrue(tb.typesLog.contains(Token.TokenType.EOF));
    }

    @Test
    public void testParseTwoArgEmptyInput() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        Document doc = tb.parse("", "http://example.com/");
        assertNotNull(doc);
        // even with empty input, at least EOF token is processed
        assertTrue(tb.processCount >= 1);
        assertEquals(Token.TokenType.EOF, tb.typesLog.get(tb.typesLog.size() - 1));
    }

    // ---------- parse(input, baseUri, errors) tests ----------

    @Test
    public void testParseThreeArgWithTrackingErrors() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document doc = tb.parse("<div", "http://example.com/", errors);
        assertNotNull(doc);
        assertSame(errors, tb.errors);
    }

    @Test
    public void testParseThreeArgWithNoTracking() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        ParseErrorList errors = ParseErrorList.noTracking();
        Document doc = tb.parse("<a><b><c>text</c></b></a>", "http://example.com/", errors);
        assertNotNull(doc);
        assertSame(errors, tb.errors);
        // multiple tokens should have been processed (many iterations)
        assertTrue(tb.processCount > 5);
    }

    // ---------- runParser (indirectly via parse) loop coverage ----------

    @Test
    public void testRunParserSingleEOFIteration() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.parse("", "http://example.com/");
        // Only the EOF token should be present (1 iteration effectively)
        assertEquals(1, tb.typesLog.size());
        assertEquals(Token.TokenType.EOF, tb.typesLog.get(0));
    }

    @Test
    public void testRunParserMultipleIterations() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.parse("<html><head></head><body>text</body></html>", "http://example.com/");
        assertTrue(tb.typesLog.size() > 1);
        assertEquals(Token.TokenType.EOF, tb.typesLog.get(tb.typesLog.size() - 1));
    }

    // ---------- processStartTag(String name) tests ----------

    @Test
    public void testProcessStartTagName() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        boolean result = tb.processStartTag("div");
        assertTrue(result);
        assertEquals(Token.TokenType.StartTag, tb.lastTokenType);
        assertEquals("div", tb.lastTagName);
        assertEquals(1, tb.processCount);
    }

    @Test
    public void testProcessStartTagNameEmptyString() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        boolean result = tb.processStartTag("");
        assertTrue(result);
        assertEquals(Token.TokenType.StartTag, tb.lastTokenType);
        assertEquals("", tb.lastTagName);
    }

    // ---------- processStartTag(String name, Attributes attrs) tests ----------

    @Test
    public void testProcessStartTagWithAttributes() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        attrs.put("id", "test");
        boolean result = tb.processStartTag("span", attrs);
        assertTrue(result);
        assertEquals(Token.TokenType.StartTag, tb.lastTokenType);
        assertEquals("span", tb.lastTagName);
        assertEquals(1, tb.processCount);
    }

    @Test
    public void testProcessStartTagWithEmptyAttributes() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        Attributes attrs = new Attributes();
        boolean result = tb.processStartTag("br", attrs);
        assertTrue(result);
        assertEquals("br", tb.lastTagName);
    }

    // ---------- processEndTag(String name) tests ----------

    @Test
    public void testProcessEndTagName() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        boolean result = tb.processEndTag("div");
        assertTrue(result);
        assertEquals(Token.TokenType.EndTag, tb.lastTokenType);
        assertEquals("div", tb.lastTagName);
        assertEquals(1, tb.processCount);
    }

    @Test
    public void testProcessEndTagNameEmptyString() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        boolean result = tb.processEndTag("");
        assertTrue(result);
        assertEquals(Token.TokenType.EndTag, tb.lastTokenType);
        assertEquals("", tb.lastTagName);
    }

    // ---------- currentElement() tests ----------

    @Test
    public void testCurrentElementEmptyStack() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        assertNull(tb.currentElement());
    }

    @Test
    public void testCurrentElementSingleElement() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        Element e1 = new Element(Tag.valueOf("div"), "http://example.com/");
        tb.stack.add(e1);
        assertEquals(e1, tb.currentElement());
    }

    @Test
    public void testCurrentElementMultipleElementsReturnsLast() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());
        Element e1 = new Element(Tag.valueOf("div"), "http://example.com/");
        Element e2 = new Element(Tag.valueOf("span"), "http://example.com/");
        Element e3 = new Element(Tag.valueOf("p"), "http://example.com/");
        tb.stack.add(e1);
        tb.stack.add(e2);
        tb.stack.add(e3);
        assertEquals(e3, tb.currentElement());
        assertEquals(3, tb.stack.size());
    }

    // ---------- combined workflow test ----------

    @Test
    public void testFullWorkflowWithMultipleTagsAndAttributes() {
        DummyTreeBuilder tb = new DummyTreeBuilder();
        tb.initialiseParse("", "http://example.com/", ParseErrorList.noTracking());

        Attributes attrs = new Attributes();
        attrs.put("class", "container");
        assertTrue(tb.processStartTag("div", attrs));
        assertEquals("div", tb.lastTagName);

        assertTrue(tb.processStartTag("p"));
        assertEquals("p", tb.lastTagName);

        assertTrue(tb.processEndTag("p"));
        assertEquals(Token.TokenType.EndTag, tb.lastTokenType);

        assertTrue(tb.processEndTag("div"));
        assertEquals(4, tb.processCount);
    }
}