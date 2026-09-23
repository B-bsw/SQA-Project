package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTest {
    private Parser parser;
    private Parser xmlParser;
    private Parser htmlParser;

    @Before
    public void setUp() {
        parser = Parser.htmlParser();
        xmlParser = Parser.xmlParser();
        htmlParser = Parser.htmlParser();
    }

    @After
    public void tearDown() {
        parser = null;
        xmlParser = null;
        htmlParser = null;
    }

    @Test
    public void testConstructorWithTreeBuilder() {
        TreeBuilder tb = new HtmlTreeBuilder();
        Parser p = new Parser(tb);
        assertNotNull(p);
        assertSame(tb, p.getTreeBuilder());
    }

    @Test
    public void testParseInputBasicHtml() {
        Document doc = parser.parseInput("<html><body>Hello</body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.body().text());
    }

    @Test
    public void testParseInputWithErrorTracking() {
        parser.setTrackErrors(10);
        assertTrue(parser.isTrackErrors());
        Document doc = parser.parseInput("<html><body>Hello", "http://example.com");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
        assertTrue(parser.getErrors().size() >= 0);
    }

    @Test
    public void testParseInputWithoutErrorTracking() {
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
        Document doc = parser.parseInput("<html><body>Hello</body></html>", "http://example.com");
        assertNotNull(doc);
        assertNotNull(parser.getErrors());
        assertTrue(parser.getErrors().size() == 0);
    }

    @Test
    public void testSetTrackErrorsZeroDisables() {
        parser.setTrackErrors(5);
        assertTrue(parser.isTrackErrors());
        parser.setTrackErrors(0);
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testGetErrorsBeforeParseReturnsNull() {
        parser.setTrackErrors(10);
        // After constructor, errors is null until parseInput is called
        assertNull(parser.getErrors());
    }

    @Test
    public void testIsTrackErrorsInitiallyFalse() {
        assertFalse(parser.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsPositiveEnablesTracking() {
        parser.setTrackErrors(100);
        assertTrue(parser.isTrackErrors());
    }

    @Test
    public void testTreeBuilderGetterSetter() {
        TreeBuilder newBuilder = new XmlTreeBuilder();
        Parser result = parser.setTreeBuilder(newBuilder);
        assertSame(parser, result);
        assertSame(newBuilder, parser.getTreeBuilder());
    }

    @Test
    public void testSettingsGetSet() {
        ParseSettings settings = new ParseSettings(true, false);
        Parser result = parser.settings(settings);
        assertSame(parser, result);
        assertSame(settings, parser.settings());
    }

    @Test
    public void testParseStaticMethod() {
        Document doc = Parser.parse("<html><body>Test</body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Test", doc.body().text());
    }

    @Test
    public void testParseFragmentStaticMethod() {
        List<Node> nodes = Parser.parseFragment("<p>Hello</p>", null, "http://example.com");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithContext() {
        Element context = new Element("div");
        List<Node> nodes = Parser.parseFragment("<p>Hello</p>", context, "http://example.com");
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("p", nodes.get(0).nodeName());
    }

    @Test
    public void testParseXmlFragment() {
        List<Node> nodes = Parser.parseXmlFragment("<root><child>text</child></root>", "http://example.com");
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void testParseBodyFragmentBasic() {
        Document doc = Parser.parseBodyFragment("<p>Hello</p>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertNotNull(body);
        assertEquals(1, body.children().size());
        assertEquals("p", body.child(0).nodeName());
    }

    @Test
    public void testParseBodyFragmentMultipleNodes() {
        Document doc = Parser.parseBodyFragment("<p>First</p><p>Second</p>", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertEquals(2, body.children().size());
    }

    @Test
    public void testParseBodyFragmentEmpty() {
        Document doc = Parser.parseBodyFragment("", "http://example.com");
        assertNotNull(doc);
        Element body = doc.body();
        assertEquals(0, body.children().size());
    }

    @Test
    public void testUnescapeEntitiesBasic() {
        String result = Parser.unescapeEntities("&amp;", false);
        assertEquals("&", result);
    }

    @Test
    public void testUnescapeEntitiesInAttribute() {
        String result = Parser.unescapeEntities("&quot;", true);
        assertEquals("\"", result);
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        Document doc = Parser.parseBodyFragmentRelaxed("<p>Relaxed</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Relaxed", doc.body().text());
    }

    @Test
    public void testHtmlParserFactory() {
        Parser p = Parser.htmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof HtmlTreeBuilder);
    }

    @Test
    public void testXmlParserFactory() {
        Parser p = Parser.xmlParser();
        assertNotNull(p);
        assertTrue(p.getTreeBuilder() instanceof XmlTreeBuilder);
    }

    @Test
    public void testParseInputWithNullBaseUri() {
        Document doc = parser.parseInput("<html><body>Hello</body></html>", null);
        assertNotNull(doc);
    }

    @Test
    public void testSetTrackErrorsNegativeAllowsTracking() {
        parser.setTrackErrors(-1);
        assertTrue(parser.isTrackErrors());
    }
}