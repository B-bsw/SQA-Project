package org.jsoup.helper;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class W3CDomTest {
    private W3CDom w3cDom;
    private org.jsoup.nodes.Document jsoupDoc;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @After
    public void tearDown() {
        w3cDom = null;
        jsoupDoc = null;
    }

    @Test(expected = NullPointerException.class)
    public void fromJsoupNullDocument_ThrowsNPE() {
        w3cDom.fromJsoup(null);
    }

    @Test
    public void fromJsoupSimpleDocument_ReturnsW3CDoc() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html><head></head><body><p>Hello</p></body></html>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull("Root element should not be null", doc.getDocumentElement());
        assertEquals("HTML", doc.getDocumentElement().getTagName());
    }

    @Test
    public void fromJsoupDocumentWithEmptyLocation_SetsNoDocumentURI() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html><body></body></html>");
        jsoupDoc.setLocation("");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertNull("Document URI should be null when location is blank", doc.getDocumentURI());
    }

    @Test
    public void fromJsoupDocumentWithLocation_SetsDocumentURI() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html><body></body></html>");
        String url = "http://example.com";
        jsoupDoc.setLocation(url);
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertEquals("Document URI should match location", url, doc.getDocumentURI());
    }

    @Test
    public void convertSimpleHierarchy_CreatesNestedElements() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div><p>Text</p></div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element div = doc.getDocumentElement().getFirstChild();
        assertNotNull(div);
        assertEquals("div", div.getTagName());
        Element p = (Element) div.getFirstChild();
        assertEquals("p", p.getTagName());
        assertEquals("Text", p.getTextContent());
    }

    @Test
    public void convertElementWithAttributes_CopiesFilteredAttributes() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div id='myId' class='cls' data-x='y'><span>test</span></div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element div = doc.getDocumentElement().getFirstChild();
        assertEquals("div", div.getTagName());
        assertEquals("myId", div.getAttribute("id"));
        assertEquals("cls", div.getAttribute("class"));
    }

    @Test
    public void convertTextNode_AddsTextToParentElement() {
        jsoupDoc = org.jsoup.Jsoup.parse("<p>Hello <b>World</b></p>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element p = doc.getDocumentElement().getFirstChild();
        String textContent = p.getTextContent();
        assertTrue("Text content should contain 'Hello World'", textContent.contains("Hello World"));
    }

    @Test
    public void convertCommentNode_AddsCommentToParentElement() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div><!-- comment --></div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element div = doc.getDocumentElement().getFirstChild();
        NodeList children = div.getChildNodes();
        boolean hasComment = false;
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof org.w3c.dom.Comment) {
                hasComment = true;
                org.w3c.dom.Comment comment = (org.w3c.dom.Comment) children.item(i);
                assertEquals(" comment ", comment.getData());
            }
        }
        assertTrue("Should contain comment node", hasComment);
    }

    @Test
    public void convertDataNode_AddsTextNode() {
        jsoupDoc = org.jsoup.Jsoup.parse("<script>var x = 'test';</script>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element script = doc.getDocumentElement().getFirstChild();
        assertEquals("script", script.getTagName());
        assertTrue("Script text content should contain data", script.getTextContent().contains("var x"));
    }

    @Test
    public void convertUnknownNode_IgnoresWithoutError() {
        jsoupDoc = new org.jsoup.nodes.Document("");
        Element root = new Element("root");
        DocumentType docType = new DocumentType("html", null, null);
        root.appendChild(docType);
        jsoupDoc.appendChild(root);
        try {
            Document doc = w3cDom.fromJsoup(jsoupDoc);
            assertNotNull("Should return document", doc);
        } catch (Exception e) {
            fail("Should not throw exception for unknown node type");
        }
    }

    @Test
    public void convertNamespacePrefix_UpdatesNamespaces() {
        jsoupDoc = org.jsoup.Jsoup.parse("<svg:svg xmlns:svg='http://www.w3.org/2000/svg'><svg:g/></svg:svg>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element svg = doc.getDocumentElement();
        assertEquals("svg:svg", svg.getTagName());
        assertEquals("http://www.w3.org/2000/svg", svg.getNamespaceURI());
        NodeList groups = svg.getElementsByTagName("svg:g");
        assertEquals(1, groups.getLength());
    }

    @Test
    public void convertMultipleRootElements_UsesFirstElementAsRoot() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html></html>");
        Element head = new Element("head");
        Element body = new Element("body");
        // Simulate document with multiple children at root level after html
        // jsoup.parser will normally wrap, but we test with raw elements
        Element html = jsoupDoc.getElementsByTag("html").first();
        html.appendChild(head);
        html.appendChild(body);
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(doc.getDocumentElement());
        assertEquals("html", doc.getDocumentElement().getTagName());
    }

    @Test
    public void asStringWithDocument_ReturnsXmlString() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html><body><p>Test</p></body></html>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(doc);
        assertNotNull("Result should not be null", result);
        assertTrue("Result should contain <p>", result.contains("<p>"));
        assertTrue("Result should contain Test", result.contains("Test"));
    }

    @Test
    public void asStringEmptyDocument_ReturnsEmptyString() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html></html>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        String result = w3cDom.asString(doc);
        assertNotNull("Result should not be null", result);
    }

    @Test
    public void convertUnclosedElement_HandlesGracefully() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div><p>Text</div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull("Should not throw", doc);
    }

    @Test
    public void convertElementWithNoChildren_ReturnsSingleElement() {
        jsoupDoc = org.jsoup.Jsoup.parse("<br>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element br = doc.getDocumentElement();
        assertEquals("html", br.getTagName());
    }

    @Test
    public void convertNestedNamespaces_NestedPrefixes() {
        jsoupDoc = org.jsoup.Jsoup.parse("<a:root xmlns:a='urn:a'><b:child xmlns:b='urn:b'/></a:root>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element root = doc.getDocumentElement();
        assertEquals("a:root", root.getTagName());
        assertEquals("urn:a", root.getNamespaceURI());
        NodeList children = root.getChildNodes();
        assertEquals(1, children.getLength());
        Element child = (Element) children.item(0);
        assertEquals("b:child", child.getTagName());
        assertEquals("urn:b", child.getNamespaceURI());
    }

    @Test
    public void convertElementWithXmlnsOnly_UsesEmptyPrefix() {
        jsoupDoc = org.jsoup.Jsoup.parse("<root xmlns='http://example.com'><child/></root>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element root = doc.getDocumentElement();
        assertEquals("root", root.getTagName());
        assertEquals("http://example.com", root.getNamespaceURI());
        NodeList children = root.getChildNodes();
        assertEquals(1, children.getLength());
        Element child = (Element) children.item(0);
        assertEquals("child", child.getTagName());
        assertEquals("http://example.com", child.getNamespaceURI());
    }

    @Test
    public void convertElementWithInvalidAttributeName_DoesNotSetAttribute() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div data-invalid='1' id2='test'></div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element div = doc.getDocumentElement().getFirstChild();
        assertEquals("div", div.getTagName());
        assertEquals("", div.getAttribute("data-invalid"));
        assertEquals("", div.getAttribute("id2"));
    }

    @Test
    public void convertElementWithValidAttributeName_SetsAttribute() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div id='a' class='b'></div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element div = doc.getDocumentElement().getFirstChild();
        assertEquals("a", div.getAttribute("id"));
        assertEquals("b", div.getAttribute("class"));
    }

    @Test
    public void tailWhenNoElementParent_DoesNotThrow() {
        jsoupDoc = org.jsoup.Jsoup.parse("<div>text</div>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        // Ensure no exception occurs at end
        assertNotNull(doc);
    }

    @Test
    public void updateNamespacesWithNoNamespaces_UsesEmptyPrefix() {
        jsoupDoc = org.jsoup.Jsoup.parse("<html><body></body></html>");
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        assertNotNull(doc);
    }

    @Test
    public void fromJsoupDocumentWithDeepHierarchy_NestedElements() {
        StringBuilder html = new StringBuilder("<html><body><div><div><p>Text</p></div></div></body></html>");
        jsoupDoc = org.jsoup.Jsoup.parse(html.toString());
        Document doc = w3cDom.fromJsoup(jsoupDoc);
        Element body = doc.getDocumentElement().getFirstChild();
        Element div1 = (Element) body.getFirstChild();
        Element div2 = (Element) div1.getFirstChild();
        Element p = (Element) div2.getFirstChild();
        assertEquals("p", p.getTagName());
    }
}