package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @After
    public void tearDown() {
        w3cDom = null;
    }

    // Normal case: fromJsoup with simple document
    @Test
    public void testFromJsoupSimple() {
        Document jsoupDoc = Jsoup.parse("<root><child attr='val'>text</child></root>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull("W3C Document should not be null", w3cDoc);
        assertEquals("Root element tag name", "root", w3cDoc.getDocumentElement().getTagName());
        NodeList children = w3cDoc.getDocumentElement().getChildNodes();
        assertEquals("One child element", 1, children.getLength());
        org.w3c.dom.Element child = (org.w3c.dom.Element) children.item(0);
        assertEquals("Child tag name", "child", child.getTagName());
        assertEquals("Attribute value", "val", child.getAttribute("attr"));
        assertEquals("Text content", "text", child.getTextContent());
    }

    // Null input: fromJsoup(null) should throw IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void testFromJsoupNull() {
        w3cDom.fromJsoup(null);
    }

    // fromJsoup with namespace declaration
    @Test
    public void testFromJsoupWithNamespace() {
        String html = "<html xmlns='http://www.w3.org/1999/xhtml'><body>text</body></html>";
        Document jsoupDoc = Jsoup.parse(html);
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertEquals("Root namespace URI", "http://www.w3.org/1999/xhtml",
                w3cDoc.getDocumentElement().getNamespaceURI());
    }

    // fromJsoup with prefixed namespace
    @Test
    public void testFromJsoupWithPrefixedNamespace() {
        String html = "<ns:root xmlns:ns='http://example.com/ns'><ns:child/></ns:root>";
        Document jsoupDoc = Jsoup.parse(html);
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        assertEquals("Root prefix", "ns", root.getPrefix());
        assertEquals("Root namespace", "http://example.com/ns", root.getNamespaceURI());
        assertEquals("Child tag name", "ns:child", root.getChildNodes().item(0).getNodeName());
    }

    // convert: set document URI when location is not blank
    @Test
    public void testConvertSetsDocumentURI() {
        Document jsoupDoc = Jsoup.parse("<a></a>");
        jsoupDoc.setLocation("http://example.com/doc");
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        org.w3c.dom.Document w3cDoc;
        try {
            w3cDoc = factory.newDocumentBuilder().newDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        w3cDom.convert(jsoupDoc, w3cDoc);
        assertEquals("Document URI should be set", "http://example.com/doc", w3cDoc.getDocumentURI());
    }

    // convert: blank location does not set URI
    @Test
    public void testConvertBlankLocationDoesNotSetURI() {
        Document jsoupDoc = Jsoup.parse("<a></a>");
        jsoupDoc.setLocation("");
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        org.w3c.dom.Document w3cDoc;
        try {
            w3cDoc = factory.newDocumentBuilder().newDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        w3cDom.convert(jsoupDoc, w3cDoc);
        assertNull("Document URI should be null", w3cDoc.getDocumentURI());
    }

    // convert: includes Comment and DataNode
    @Test
    public void testConvertWithCommentAndDataNode() {
        Document jsoupDoc = Jsoup.parse("<root></root>");
        Element root = jsoupDoc.select("root").first();
        root.appendChild(new Comment("test comment"));
        root.appendChild(new DataNode("some data", ""));
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        org.w3c.dom.Document w3cDoc;
        try {
            w3cDoc = factory.newDocumentBuilder().newDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        w3cDom.convert(jsoupDoc, w3cDoc);
        NodeList children = w3cDoc.getDocumentElement().getChildNodes();
        assertEquals("Two child nodes (comment + text)", 2, children.getLength());
        assertEquals("First child is comment", Node.COMMENT_NODE, children.item(0).getNodeType());
        assertEquals("Second child is text node", Node.TEXT_NODE, children.item(1).getNodeType());
        assertEquals("Comment data", "test comment", children.item(0).getNodeValue());
        assertEquals("DataNode text", "some data", children.item(1).getNodeValue());
    }

    // asString normal case
    @Test
    public void testAsString() {
        Document jsoupDoc = Jsoup.parse("<p>hello</p>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertTrue("Output should contain <p>", result.contains("<p>"));
        assertTrue("Output should contain hello", result.contains("hello"));
        assertTrue("Output should contain </p>", result.contains("</p>"));
    }

    // asString with namespace output (basic check)
    @Test
    public void testAsStringWithNamespace() {
        Document jsoupDoc = Jsoup.parse("<html xmlns='http://www.w3.org/1999/xhtml'><body/></html>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(w3cDoc);
        assertTrue("Output should contain xmlns attribute", result.contains("xmlns=\"http://www.w3.org/1999/xhtml\""));
    }

    // Edge: attribute with invalid XML characters (replaced by empty string)
    @Test
    public void testCopyAttributesFiltersInvalidChars() {
        Document jsoupDoc = Jsoup.parse("<root att<r=\"value\"></root>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Element root = w3cDoc.getDocumentElement();
        // Attribute key "att<r" becomes "attr" after regex replacement
        assertFalse("Invalid attribute should be removed or filtered", root.hasAttribute("att<r"));
        // Actually the regex removes '<', so key becomes "attr"
        assertTrue("Filtered attribute should be present", root.hasAttribute("attr"));
    }

    // Edge: element with no child (only root)
    @Test
    public void testFromJsoupEmptyElement() {
        Document jsoupDoc = Jsoup.parse("<div></div>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        assertEquals("div", w3cDoc.getDocumentElement().getTagName());
        assertEquals("No child nodes", 0, w3cDoc.getDocumentElement().getChildNodes().getLength());
    }

    // Loop / branch: updateNamespaces with multiple xmlns definitions
    @Test
    public void testMultipleNamespaces() {
        String html = "<root xmlns:a='urn:a' xmlns:b='urn:b'><a:child>text</a:child></root>";
        Document jsoupDoc = Jsoup.parse(html);
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Element root = w3cDoc.getDocumentElement();
        // Root should have no namespace, but child should have prefix 'a'
        assertEquals("Root local name", "root", root.getLocalName());
        Node child = root.getChildNodes().item(0);
        assertEquals("Child node name", "a:child", child.getNodeName());
        assertEquals("Child namespace", "urn:a", child.getNamespaceURI());
    }
}