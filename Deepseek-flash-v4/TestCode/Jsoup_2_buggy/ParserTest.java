package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ParserTest {
    private Parser parser;

    @Before
    public void setUp() {
        // Parser constructor is private, so we create instance via parse method
    }

    @Test
    public void testParseSimpleHtml() {
        Document doc = Parser.parse("<html><head></head><body>Hello</body></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.text());
        assertEquals("http://example.com", doc.baseUri());
    }

    @Test
    public void testParseBodyFragment() {
        Document doc = Parser.parseBodyFragment("<p>Hello</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("Hello", doc.text());
        assertEquals("body", doc.body().tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtml() {
        Parser.parse(null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullBaseUri() {
        Parser.parse("<html></html>", null);
    }

    @Test
    public void testParseEmptyString() {
        Document doc = Parser.parse("", "http://example.com");
        assertNotNull(doc);
        assertEquals("", doc.text());
    }

    @Test
    public void testParseWithComment() {
        Document doc = Parser.parse("<!-- comment --><p>text</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("text", doc.text());
        assertEquals(1, doc.getAllElements().size());
    }

    @Test
    public void testParseWithCdata() {
        Document doc = Parser.parse("<![CDATA[<b>bold</b>]]><p>after</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("after", doc.text());
        assertEquals(1, doc.getElementsByTag("p").size());
    }

    @Test
    public void testParseWithXmlDeclaration() {
        Document doc = Parser.parse("<?xml version=\"1.0\"?><root></root>", "http://example.com");
        assertNotNull(doc);
        assertEquals("root", doc.tagName());
    }

    @Test
    public void testParseWithDoctype() {
        Document doc = Parser.parse("<!DOCTYPE html><html></html>", "http://example.com");
        assertNotNull(doc);
        assertEquals("html", doc.tagName());
    }

    @Test
    public void testParseWithEndTag() {
        Document doc = Parser.parse("<div><p>Text</p></div>", "http://example.com");
        assertNotNull(doc);
        assertEquals("div", doc.children().first().tagName());
        assertTrue(doc.getElementsByTag("p").size() == 1);
    }

    @Test
    public void testParseWithSelfClosingTag() {
        Document doc = Parser.parse("<br/>", "http://example.com");
        assertNotNull(doc);
        assertEquals("br", doc.getElementsByTag("br").first().tagName());
    }

    @Test
    public void testParseWithEmptyTag() {
        Document doc = Parser.parse("<img src=\"test.jpg\">", "http://example.com");
        assertNotNull(doc);
        assertEquals("img", doc.getElementsByTag("img").first().tagName());
        assertEquals("test.jpg", doc.getElementsByTag("img").first().attr("src"));
    }

    @Test
    public void testParseWithBaseTag() {
        Document doc = Parser.parse("<base href=\"http://newbase.com/\"><p>text</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("http://newbase.com/", doc.baseUri());
    }

    @Test
    public void testParseTextAreaContent() {
        Document doc = Parser.parse("<textarea><b>not bold</b></textarea>", "http://example.com");
        assertNotNull(doc);
        assertEquals("<b>not bold</b>", doc.getElementsByTag("textarea").first().text());
    }

    @Test
    public void testParseScriptContent() {
        Document doc = Parser.parse("<script>if (a < b) { c(); }</script>", "http://example.com");
        assertNotNull(doc);
        assertEquals("if (a < b) { c(); }", doc.getElementsByTag("script").first().text());
    }

    @Test
    public void testNestedElements() {
        Document doc = Parser.parse("<div><div><span>deep</span></div></div>", "http://example.com");
        assertNotNull(doc);
        assertEquals("deep", doc.text());
    }

    @Test
    public void testUnclosedTags() {
        Document doc = Parser.parse("<p>one<p>two", "http://example.com");
        assertNotNull(doc);
        assertEquals("onetwo", doc.text());
    }

    @Test
    public void testMisplacedTags() {
        Document doc = Parser.parse("<p>first</div>second", "http://example.com");
        assertNotNull(doc);
        assertEquals("firstsecond", doc.text());
    }

    @Test
    public void testAttributeParsing() {
        Document doc = Parser.parse("<div class=\"test\" id='myId' data-x=value>content</div>", "http://example.com");
        assertNotNull(doc);
        Element div = doc.getElementsByTag("div").first();
        assertEquals("test", div.attr("class"));
        assertEquals("myId", div.attr("id"));
        assertEquals("value", div.attr("data-x"));
    }

    @Test
    public void testEntityText() {
        Document doc = Parser.parse("<p>a &amp; b</p>", "http://example.com");
        assertNotNull(doc);
        assertEquals("a & b", doc.text());
    }

    @Test
    public void testCreateFromEncodedText() throws Exception {
        Method method = Parser.class.getDeclaredMethod("parseTextNode");
        method.setAccessible(true);
        Parser p = Parser.parse("some <b>text</b>", "http://example.com");
        assertNotNull(p);
    }
}