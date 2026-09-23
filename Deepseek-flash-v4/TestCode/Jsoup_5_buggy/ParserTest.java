package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ParserTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void testParseEmptyString() {
        Document doc = Parser.parse("", BASE_URI);
        assertNotNull(doc);
        assertEquals("", doc.text());
    }

    @Test
    public void testParseSimpleHtml() {
        String html = "<html><body><p>Hello</p></body></html>";
        Document doc = Parser.parse(html, BASE_URI);
        assertEquals("Hello", doc.text());
    }

    @Test
    public void testParseBodyFragmentOnly() {
        String html = "<p>Hello</p>";
        Document doc = Parser.parseBodyFragment(html, BASE_URI);
        assertEquals("Hello", doc.text());
    }

    @Test
    public void testParseBodyFragmentWithEmptyTag() {
        String html = "<img src='test.png'>";
        Document doc = Parser.parseBodyFragment(html, BASE_URI);
        assertNotNull(doc);
        assertEquals("", doc.text());
    }

    @Test
    public void testParseBodyFragmentRelaxed() {
        String html = "<p>Hello";
        Document doc = Parser.parseBodyFragmentRelaxed(html, BASE_URI);
        assertNotNull(doc);
        assertTrue(doc.text().contains("Hello"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtml() {
        Parser.parse(null, BASE_URI);
    }
}