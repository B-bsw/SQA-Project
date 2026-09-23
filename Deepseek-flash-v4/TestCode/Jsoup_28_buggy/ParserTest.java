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
    private static final String HTML = "<html><head><title>Title</title></head><body><p>Hello</p></body></html>";

    @Before
    public void setUp() {
        parser = new Parser(new HtmlTreeBuilder());
    }

    @Test
    public void testDefaultTrackErrorsDisabled() {
        assertFalse(parser.isTrackErrors());
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testSetTrackErrorsPositive() {
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testSetTrackErrorsZero() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testParseInputWithTrackingEnabled() {
        parser.setTrackErrors(10);
        Document doc = parser.parseInput("<div>Test", "http://example.com");
        assertNotNull(doc);
        assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testParseInputWithoutTracking() {
        Document doc = parser.parseInput(HTML, "http://example.com");
        assertNotNull(doc);
        assertFalse(parser.isTrackErrors());
        assertNotNull(doc.title());
    }

    @Test
    public void testParseInputWithNullBaseUri() {
        Document doc = parser.parseInput(HTML, null);
        assertNotNull(doc);
        assertEquals("Title", doc.title());
    }

    @Test
    public void testParseInputWithEmptyString() {
        Document doc = parser.parseInput("", "http://example.com");
        assertNotNull(doc);
        assertFalse(doc.hasText());
    }

    @Test
    public void testGetTreeBuilder() {
        TreeBuilder tb = parser.getTreeBuilder();
        assertNotNull(tb);
        assertTrue(tb instanceof HtmlTreeBuilder);
    }

    @Test
    public void testSetTreeBuilder() {
        TreeBuilder newTb = new XmlTreeBuilder();
        Parser returned = parser.setTreeBuilder(newTb);
        assertSame(parser, returned);
        assertSame(newTb, parser.getTreeBuilder());
    }

    @Test
    public void testStaticParseWithValidHtml() {
        Document doc = Parser.parse(HTML, "http://example.com");
        assertNotNull(doc);
        assertEquals("Title", doc.title());
    }

    @Test
    public void testStaticParseWithEmptyHtml() {
        Document doc = Parser.parse("", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseFragment() throws Exception {
        Parser fragmentParser = Parser.htmlParser();
        String fragment = "<div>Hello</div>";
        Element context = null;
        List<Node> nodes = fragmentParser.parseFragment(fragment, context, "http://example.com");
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void testParseFragmentWithMultipleNodes() throws Exception {
        Parser fragmentParser = Parser.htmlParser();
        String fragment = "<p>First</p><p>Second</p>";
        Element context = null;
        List<Node> nodes = fragmentParser.parseFragment(fragment, context, "http://example.com");
        assertNotNull(nodes);
        assertEquals(2, nodes.size());
    }

    @Test
    public void testParseBodyFragmentValid() {
        String bodyHtml = "<p>Hello</p>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        List<Element> pElements = doc.body().getElementsByTag("p");
        assertEquals(1, pElements.size());
        assertEquals("Hello", pElements.get(0).text());
    }

    @Test
    public void testParseBodyFragmentWithNestedHtml() {
        String bodyHtml = "<div><span>Hi</span></div>";
        Document doc = Parser.parseBodyFragment(bodyHtml, "http://example.com");
        assertNotNull(doc);
        List<Element> spans = doc.body().getElementsByTag("span");
        assertEquals(1, spans.size());
        assertEquals("Hi", spans.get(0).text());
    }

    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Parser.parseBodyFragment("", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
        assertFalse(doc.body().hasText());
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        String bodyHtml = "<i>Italic</i>";
        Document doc = Parser.parseBodyFragmentRelaxed(bodyHtml, "http://example.com");
        assertNotNull(doc);
        assertTrue(doc.body().hasText());
        List<Element> iElements = doc.body().getElementsByTag("i");
        assertEquals(1, iElements.size());
        assertEquals("Italic", iElements.get(0).text());
    }

    @Test
    public void testHtmlParser() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParser() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test
    public void testParseXmlUsingParserInstance() {
        Parser xmlParser = Parser.xmlParser();
        Document doc = xmlParser.parseInput("<root><item>Content</item></root>", "http://example.com");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test
    public void testParseInputWithTrackingReset() {
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        parser.setTrackErrors(0);
        parser.parseInput("<div>", "http://example.com");
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testParseErrorsListLifecycle() {
        parser.setTrackErrors(5);
        parser.parseInput("<bad>", "http://example.com");
        List<ParseError> originalErrors = parser.getErrors();
        assertTrue(originalErrors.size() > 0);
        
        parser.setTrackErrors(0);
        parser.parseInput("<bad>", "http://example.com");
        List<ParseError> newErrors = parser.getErrors();
        assertNotSame(originalErrors, newErrors);
        assertEquals(0, newErrors.size());
    }

    @Test
    public void testTrackErrorsMaxLimit() {
        parser.setTrackErrors(3);
        parser.parseInput("<a><a><a><a><a>", "http://example.com");
        assertTrue(parser.getErrors().size() <= 3);
    }

    @Test
    public void testSetTrackErrorsNegative() {
        parser.setTrackErrors(-5);
        assertFalse(parser.isTrackErrors());
        Document doc = parser.parseInput("<div>", "http://example.com");
        assertNotNull(doc);
    }
}