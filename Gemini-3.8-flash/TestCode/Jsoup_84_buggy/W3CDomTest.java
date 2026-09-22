package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class W3CDomTest {

    @Test
    public void fromJsoup_givenNullDocument_shouldThrowIllegalArgumentException() {
        W3CDom w3c = new W3CDom();
        try {
            w3c.fromJsoup(null);
            Assert.fail("Expected IllegalArgumentException when input document is null");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void fromJsoup_givenSimpleHtml_shouldConvertToW3cDocument() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test Title</title></head><body><p id=\"p1\">Hello World</p></body></html>");

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertNotNull(w3cDoc.getDocumentElement());
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());

        NodeList pList = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, pList.getLength());
        Element pElem = (Element) pList.item(0);
        Assert.assertEquals("Hello World", pElem.getTextContent());
        Assert.assertEquals("p1", pElem.getAttribute("id"));
    }

    @Test
    public void convert_givenDocumentWithLocation_shouldSetDocumentUri() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>", "http://example.com/test.html");

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("http://example.com/test.html", w3cDoc.getDocumentURI());
    }

    @Test
    public void convert_givenDocumentWithEmptyLocation_shouldNotSetDocumentUri() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void convert_givenDefaultNamespace_shouldAssignNamespaceToElements() {
        W3CDom w3c = new W3CDom();
        String html = "<html xmlns=\"http://www.w3.org/1999/xhtml\"><body xmlns=\"http://www.w3.org/1999/xhtml\"><p>Text</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Element root = w3cDoc.getDocumentElement();
        Assert.assertEquals("http://www.w3.org/1999/xhtml", root.getNamespaceURI());
        NodeList pList = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, pList.getLength());
        Assert.assertEquals("http://www.w3.org/1999/xhtml", pList.item(0).getNamespaceURI());
    }

    @Test
    public void convert_givenPrefixedNamespaces_shouldResolvePrefixAndInheritance() {
        W3CDom w3c = new W3CDom();
        String xml = "<root xmlns:ns1=\"http://example.com/ns1\">"
                + "<ns1:child xmlns:ns2=\"http://example.com/ns2\">"
                + "<ns2:subchild>Content</ns2:subchild>"
                + "</ns1:child>"
                + "<sibling>No namespace</sibling>"
                + "</root>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(xml);

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Element root = w3cDoc.getDocumentElement();
        Assert.assertNull(root.getNamespaceURI());

        NodeList childList = w3cDoc.getElementsByTagName("ns1:child");
        Assert.assertEquals(1, childList.getLength());
        Element child = (Element) childList.item(0);
        Assert.assertEquals("http://example.com/ns1", child.getNamespaceURI());

        NodeList subchildList = w3cDoc.getElementsByTagName("ns2:subchild");
        Assert.assertEquals(1, subchildList.getLength());
        Element subchild = (Element) subchildList.item(0);
        Assert.assertEquals("http://example.com/ns2", subchild.getNamespaceURI());

        NodeList siblingList = w3cDoc.getElementsByTagName("sibling");
        Assert.assertEquals(1, siblingList.getLength());
        Element sibling = (Element) siblingList.item(0);
        Assert.assertNull(sibling.getNamespaceURI());
    }

    @Test
    public void convert_givenTagWithColonAtStart_shouldHandleEmptyPrefix() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element root = jsoupDoc.appendElement("root");
        root.appendElement(":emptyPrefix");

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        NodeList nodes = w3cDoc.getElementsByTagName(":emptyPrefix");
        Assert.assertEquals(1, nodes.getLength());
        Assert.assertNull(nodes.item(0).getNamespaceURI());
    }

    @Test
    public void convert_givenHtmlWithComments_shouldConvertW3cCommentNodes() {
        W3CDom w3c = new W3CDom();
        String html = "<html><body><!-- This is a test comment --><p>After comment</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Node body = w3cDoc.getElementsByTagName("body").item(0);
        NodeList children = body.getChildNodes();
        boolean foundComment = false;
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.COMMENT_NODE) {
                Assert.assertEquals(" This is a test comment ", child.getNodeValue());
                foundComment = true;
            }
        }
        Assert.assertTrue("W3C Comment node should be present", foundComment);
    }

    @Test
    public void convert_givenScriptAndStyleDataNodes_shouldConvertAsTextNodes() {
        W3CDom w3c = new W3CDom();
        String html = "<html><head><script>var x = 10;</script><style>body { color: red; }</style></head><body></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        NodeList scripts = w3cDoc.getElementsByTagName("script");
        Assert.assertEquals(1, scripts.getLength());
        Element script = (Element) scripts.item(0);
        Assert.assertEquals("var x = 10;", script.getTextContent());

        NodeList styles = w3cDoc.getElementsByTagName("style");
        Assert.assertEquals(1, styles.getLength());
        Element style = (Element) styles.item(0);
        Assert.assertEquals("body { color: red; }", style.getTextContent());
    }

    @Test
    public void convert_givenUnhandledNodeTypes_shouldIgnoreWithoutException() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element root = jsoupDoc.appendElement("root");
        root.appendChild(new DocumentType("html", "publicId", "systemId", ""));

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("root", w3cDoc.getDocumentElement().getTagName());
    }

    @Test
    public void convert_givenValidAndInvalidAttributeNames_shouldFilterInvalidNames() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element root = jsoupDoc.appendElement("root");
        org.jsoup.nodes.Element item = root.appendElement("item");

        item.attr("valid-attr", "value1");
        item.attr("valid_attr:test.name", "value2");
        item.attr("123invalid", "value3");
        item.attr("-invalidStart", "value4");
        item.attr("$$$invalid$$$", "value5");
        item.attr("data-custom", "value6");

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        Element w3cItem = (Element) w3cDoc.getElementsByTagName("item").item(0);
        Assert.assertEquals("value1", w3cItem.getAttribute("valid-attr"));
        Assert.assertEquals("value2", w3cItem.getAttribute("valid_attr:test.name"));
        Assert.assertEquals("value6", w3cItem.getAttribute("data-custom"));

        Assert.assertEquals("", w3cItem.getAttribute("123invalid"));
        Assert.assertEquals("", w3cItem.getAttribute("-invalidStart"));
        Assert.assertEquals("", w3cItem.getAttribute("$$$invalid$$$"));
    }

    @Test
    public void asString_givenValidW3cDocument_shouldSerializeToString() {
        W3CDom w3c = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Title</title></head><body><p>Hello</p></body></html>");
        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        String result = w3c.asString(w3cDoc);

        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("<title>Title</title>"));
        Assert.assertTrue(result.contains("<p>Hello</p>"));
    }

    @Test
    public void fromJsoup_givenFactoryFails_shouldThrowIllegalStateException() {
        W3CDom w3c = new W3CDom();
        w3c.factory = new DocumentBuilderFactory() {
            public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                throw new ParserConfigurationException("Forced configuration error");
            }

            public void setAttribute(String name, Object value) {
            }

            public Object getAttribute(String name) {
                return null;
            }

            public void setFeature(String name, boolean value) {
            }

            public boolean getFeature(String name) {
                return false;
            }
        };

        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        try {
            w3c.fromJsoup(jsoupDoc);
            Assert.fail("Expected IllegalStateException wrapping ParserConfigurationException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getCause() instanceof ParserConfigurationException);
        }
    }

    @Test
    public void convert_givenDeeplyNestedElements_shouldProperlyAscendAndDescend() {
        W3CDom w3c = new W3CDom();
        String html = "<div><ul><li><span><strong>Deep</strong></span></li></ul></div>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document w3cDoc = w3c.fromJsoup(jsoupDoc);

        NodeList strongList = w3cDoc.getElementsByTagName("strong");
        Assert.assertEquals(1, strongList.getLength());
        Element strong = (Element) strongList.item(0);
        Assert.assertEquals("Deep", strong.getTextContent());

        Node span = strong.getParentNode();
        Assert.assertEquals("span", span.getNodeName());

        Node li = span.getParentNode();
        Assert.assertEquals("li", li.getNodeName());

        Node ul = li.getParentNode();
        Assert.assertEquals("ul", ul.getNodeName());

        Node div = ul.getParentNode();
        Assert.assertEquals("div", div.getNodeName());
    }
}