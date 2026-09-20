```java
package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser(new HtmlTreeBuilder());
    }

    // Constructor & getTreeBuilder
    @Test
    public void testConstructorAndGetTreeBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertSame(tb, p.getTreeBuilder());
    }

    // setTreeBuilder
    @Test
    public void testSetTreeBuilder() {
        HtmlTreeBuilder tb1 = new HtmlTreeBuilder();
        Parser p = new Parser(tb1);
        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        Parser returned = p.setTreeBuilder(tb2);
        assertSame(p, returned);
        assertSame(tb2, p.getTreeBuilder());
    }

    // isTrackErrors default false (boundary: maxErrors == 0)
    @Test
    public void testIsTrackErrorsDefaultFalse() {
        assertFalse(parser.isTrackErrors());
    }

    // setTrackErrors with positive value enables tracking
    @Test
    public void testSetTrackErrorsPositive() {
        Parser returned = parser.setTrackErrors(10);
        assertSame(parser, returned);
        assertTrue(parser.isTrackErrors());
    }

    // setTrackErrors with 0 disables tracking (boundary)
    @Test
    public void testSetTrackErrorsZero() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    // setTrackErrors with negative value (boundary, should be false since maxErrors > 0 is false)
    @Test
    public void testSetTrackErrorsNegative() {
        parser.setTrackErrors(-5);
        assertFalse(parser.isTrackErrors());
    }

    // getErrors before any parse - should be null
    @Test
    public void testGetErrorsBeforeParse() {
        assertNull(parser.getErrors());
    }

    // parseInput without tracking - errors list should be present but empty (noTracking list)
    @Test
    public void testParseInputWithoutTracking() {
        Document doc = parser.parseInput("<html><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello", doc.select("p").text());
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
        assertTrue(errors.isEmpty());
    }

    // parseInput with tracking enabled
    @Test
    public void testParseInputWithTrackingEnabled() {
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<html><body><p>Hello</p></body></html>", "http://example.com/");
        assertNotNull(doc);
        List<ParseError> errors = parser.getErrors();
        assertNotNull(errors);
    }

    // parseInput with empty html
    @Test
    public void testParseInputEmptyHtml() {
        Document doc = parser.parseInput("", "http://example.com/");
        assertNotNull(doc);
    }

    // parseInput with null html - should throw exception (NullPointerException expected)
    @Test(expected = NullPointerException.class)
    public void testParseInputNullHtml() {
        parser.parseInput(null, "http://example.com/");
    }

    // static parse method - normal case
    @Test
    public void testStaticParseNormal() {
        Document doc = Parser.parse("<html><body><div>Test</div></body></html>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Test", doc.select("div").text());
    }

    // static parse method - empty string
    @Test
    public void testStaticParseEmpty() {
        Document doc = Parser.parse("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    // static parse method - null input should throw
    @Test(expected = NullPointerException.class)
    public void testStaticParseNull() {
        Parser.parse(null, "http://example.com/");
    }

    // parseFragment - normal case with context
    @Test
    public void testParseFragmentWithContext() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        List<Node> nodes = Parser.parseFragment("<p>Fragment</p>", body, "http://example.com/");
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("p", ((Element) nodes.get(0)).tagName());
    }

    // parseFragment - null context
    @Test
    public void testParseFragmentNullContext() {
        List<Node> nodes = Parser.parseFragment("<p>Fragment</p>", null, "http://example.com/");
        assertNotNull(nodes);
        assertTrue(nodes.size() >= 1);
    }

    // parseFragment - empty html
    @Test
    public void testParseFragmentEmptyHtml() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        List<Node> nodes = Parser.parseFragment("", body, "http://example.com/");
        assertNotNull(nodes);
        assertEquals(0, nodes.size());
    }

    // parseFragment - multiple nodes (loop multiple times)
    @Test
    public void testParseFragmentMultipleNodes() {
        Document doc = Document.createShell("http://example.com/");
        Element body = doc.body();
        List<Node> nodes = Parser.parseFragment("<p>One</p><p>Two</p><p>Three</p>", body, "http://example.com/");
        assertNotNull(nodes);
        assertEquals(3, nodes.size());
    }

    // parseBodyFragment - normal case
    @Test
    public void testParseBodyFragmentNormal() {
        Document doc = Parser.parseBodyFragment("<p>Hello Body</p>", "http://example.com/");
        assertNotNull(doc);
        assertEquals("Hello Body", doc.body().select("p").text());
    }

    // parseBodyFragment - empty input (loop 0 times)
    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Parser.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc);
        assertEquals("", doc.body().text());
    }

    // parseBodyFragment - multiple nodes (loop multiple times)
    @Test
    public void testParseBodyFragmentMultipleNodes() {
        Document doc = Parser.parseBodyFragment("<p>A</p><p>B</p><p>C</p>", "http://example.com/");
        assertN