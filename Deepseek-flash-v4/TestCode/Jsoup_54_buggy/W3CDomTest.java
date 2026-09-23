package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class W3CDomTest {
    private W3CDom w3cDom;
    private org.jsoup.nodes.Document jsoupDoc;
    private W3CDom.W3CBuilder builder;
    private Document w3cDoc;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
        jsoupDoc = new org.jsoup.nodes.Document("");
        builder = new W3CDom.W3CBuilder(w3cDoc);
    }

    @Test
    public void testFromJsoup_NormalDocument() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        assertEquals("html", w3cDoc.getDocumentElement().getLocalName());
    }

    @Test
    public void testFromJsoup_WithNamespace() {
        String html = "<svg:svg xmlns:svg='http://www.w3.org/2000/svg'><svg:g/></svg:svg>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        assertEquals("svg", w3cDoc.getDocumentElement().getTagName());
    }

    @Test
    public void testFromJsoup_NullInput() {
        try {
            w3cDom.fromJsoup(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConvert_EmptyDocument() {
        jsoupDoc = new org.jsoup.nodes.Document("");
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        assertEquals("#document", w3cDoc.getNodeName());
    }

    @Test
    public void testConvert_SingleRootElement() {
        String html = "<html></html>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
        assertEquals(1, w3cDoc.getChildNodes().getLength());
    }

    @Test
    public void testConvert_WithTextNode() {
        String html = "<p>Hello World</p>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDoc.getElementsByTagName("p").item(0).getChildNodes();
        assertEquals(1, nodeList.getLength());
        assertEquals("#text", nodeList.item(0).getNodeName());
        assertEquals("Hello World", nodeList.item(0).getTextContent());
    }

    @Test
    public void testConvert_WithComment() {
        String html = "<!-- comment --><p>text</p>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList comments = w3cDoc.getElementsByTagName("body").item(0).getChildNodes();
        String commentData = null;
        for (int i = 0; i < comments.getLength(); i++) {
            if ("#comment".equals(comments.item(i).getNodeName())) {
                commentData = comments.item(i).getTextContent();
            }
        }
        assertEquals(" comment ", commentData);
    }

    @Test
    public void testConvert_WithAttributes() {
        String html = "<a href='http://example.com' data-test='value'>Link</a>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Node link = w3cDoc.getElementsByTagName("a").item(0);
        assertEquals("http://example.com", ((Element) link).getAttribute("href"));
        assertEquals("value", ((Element) link).getAttribute("data-test"));
    }

    @Test
    public void testConvert_WithSpecialCharsInAttribute() {
        String html = "<div data-name='john&doe'>Test</div>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Node div = w3cDoc.getElementsByTagName("div").item(0);
        assertEquals("john&doe", ((Element) div).getAttribute("data-name"));
    }

    @Test
    public void testConvert_WithNestedElement() {
        String html = "<div><p>Paragraph</p></div>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList paragraphs = w3cDoc.getElementsByTagName("p");
        assertEquals(1, paragraphs.getLength());
        assertEquals("Paragraph", paragraphs.item(0).getTextContent());
    }

    @Test
    public void testAsString_ValidDocument() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertTrue(result.contains("<html>"));
        assertTrue(result.contains("<p>Hello</p>"));
    }

    @Test
    public void testAsString_WithNamespace() {
        String html = "<svg:svg xmlns:svg='http://www.w3.org/2000/svg'><svg:g/></svg:svg>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertTrue(result.contains("xmlns:svg"));
    }

    @Test
    public void testCopyWithInvalidAttrNames() {
        builder = new W3CDom.W3CBuilder(w3cDoc);
        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element("div");
        el.attr("data-name", "value");
        el.attr("class", "test");
        builder.head(el, 0);
        // verify attributes processed without exception
        assertNotNull(el.attributes());
    }

    @Test
    public void testUpdateNamespaces_Prefixed() {
        W3CDom.W3CBuilder localBuilder = new W3CDom.W3CBuilder(w3cDoc);
        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element("ns:div");
        el.attr("xmlns:ns", "http://example.com/ns");
        String prefix = localBuilder.head(el, 0);
        assertEquals("", prefix);
    }

    @Test
    public void testUpdateNamespaces_NoPrefix() {
        W3CDom.W3CBuilder localBuilder = new W3CDom.W3CBuilder(w3cDoc);
        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element("div");
        el.attr("xmlns", "http://example.com/default");
        String prefix = localBuilder.head(el, 0);
        assertEquals("", prefix);
    }

    @Test
    public void testUpdateNamespaces_NoNamespace() {
        W3CDom.W3CBuilder localBuilder = new W3CDom.W3CBuilder(w3cDoc);
        org.jsoup.nodes.Element el = new org.jsoup.nodes.Element("div");
        el.attr("class", "test");
        String prefix = localBuilder.head(el, 0);
        assertEquals("", prefix);
    }

    @Test
    public void testAsString_NullDocument() {
        try {
            w3cDom.asString(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConvert_WithDataNode() {
        String html = "<script>var x = 1;</script>";
        jsoupDoc = org.jsoup.Jsoup.parse(html);
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList scripts = w3cDoc.getElementsByTagName("script");
        assertEquals(1, scripts.getLength());
        assertTrue(scripts.item(0).getTextContent().contains("var x = 1"));
    }

    @Test
    public void testFromJsoup_WithBaseUri() {
        String html = "<html><head><title>Test</title></head><body><a href='page.html'>Link</a></body></html>";
        jsoupDoc = org.jsoup.Jsoup.parse(html, "http://example.com");
        w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc.getDocumentURI());
    }
}