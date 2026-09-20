package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class W3CDomTest {

    private W3CDom w3cDom;

    @Before
    public void setUp() {
        w3cDom = new W3CDom();
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromJsoup_givenNullDocument_shouldThrowIllegalArgumentException() {
        // Arrange
        org.jsoup.nodes.Document nullDoc = null;

        // Act
        w3cDom.fromJsoup(nullDoc);
    }

    @Test
    public void fromJsoup_givenValidDocument_shouldConvertSuccessfully() {
        // Arrange
        String html = "<html><head><title>Test Page</title></head><body><p>Hello World</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull("Output W3C Document should not be null", w3cDoc);
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        NodeList paragraphs = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, paragraphs.getLength());
        Assert.assertEquals("Hello World", paragraphs.item(0).getTextContent());
    }

    @Test
    public void fromJsoup_givenDocumentWithLocation_shouldSetDocumentURI() {
        // Arrange
        String html = "<html><body><p>Content</p></body></html>";
        String baseUri = "http://example.com/page.html";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, baseUri);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertEquals(baseUri, w3cDoc.getDocumentURI());
    }

    @Test
    public void fromJsoup_givenDocumentWithBlankLocation_shouldNotSetDocumentURI() {
        // Arrange
        String html = "<html><body><p>No Location</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, "");

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNull("Document URI should be null when input location is blank", w3cDoc.getDocumentURI());
    }

    @Test(expected = IllegalStateException.class)
    public void fromJsoup_givenParserConfigurationException_shouldThrowIllegalStateException() {
        // Arrange
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        W3CDom domWithFailingFactory = new W3CDom();
        domWithFailingFactory.factory = new DocumentBuilderFactory() {
            public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                throw new ParserConfigurationException("Simulated configuration error");
            }
            public void setAttribute(String name, Object value) {}
            public Object getAttribute(String name) { return null; }
            public void setFeature(String name, boolean value) {}
            public boolean getFeature(String name) { return false; }
        };

        // Act
        domWithFailingFactory.fromJsoup(jsoupDoc);
    }

    @Test
    public void convert_givenNestedElements_shouldPreserveHierarchyAndUndescendInTail() {
        // Arrange
        String html = "<html><body><div><span>Deep text</span></div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        org.w3c.dom.Element htmlEl = w3cDoc.getDocumentElement();
        Assert.assertEquals("html", htmlEl.getTagName());

        NodeList spanList = w3cDoc.getElementsByTagName("span");
        Assert.assertEquals(1, spanList.getLength());
        Node spanNode = spanList.item(0);
        Assert.assertEquals("Deep text", spanNode.getTextContent());

        Node divNode = spanNode.getParentNode();
        Assert.assertNotNull(divNode);
        Assert.assertEquals("div", divNode.getNodeName());

        Node bodyNode = divNode.getParentNode();
        Assert.assertNotNull(bodyNode);
        Assert.assertEquals("body", bodyNode.getNodeName());
    }

    @Test
    public void convert_givenTextNodes_shouldAppendTextNodes() {
        // Arrange
        String html = "<html><body>Some <b>bold</b> text</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList bodyList = w3cDoc.getElementsByTagName("body");
        Assert.assertEquals(1, bodyList.getLength());
        Node bodyNode = bodyList.item(0);
        NodeList children = bodyNode.getChildNodes();

        Assert.assertTrue(children.getLength() >= 3);
        Assert.assertEquals(Node.TEXT_NODE, children.item(0).getNodeType());
        Assert.assertEquals("Some ", children.item(0).getNodeValue());
        Assert.assertEquals(Node.ELEMENT_NODE, children.item(1).getNodeType());
        Assert.assertEquals("b", children.item(1).getNodeName());
        Assert.assertEquals(Node.TEXT_NODE, children.item(2).getNodeType());
        Assert.assertEquals(" text", children.item(2).getNodeValue());
    }

    @Test
    public void convert_givenCommentNodes_shouldAppendCommentNodes() {
        // Arrange
        String html = "<html><body><!-- This is a comment --><p>Content</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList bodyList = w3cDoc.getElementsByTagName("body");
        Assert.assertEquals(1, bodyList.getLength());
        Node bodyNode = bodyList.item(0);

        boolean foundComment = false;
        NodeList children = bodyNode.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child.getNodeType() == Node.COMMENT_NODE) {
                foundComment = true;
                Assert.assertEquals(" This is a comment ", child.getNodeValue());
            }
        }
        Assert.assertTrue("Comment node should be present in W3C Document", foundComment);
    }

    @Test
    public void convert_givenDataNodes_shouldAppendAsTextNodes() {
        // Arrange
        String scriptContent = "alert('test');";
        String html = "<html><head><script>" + scriptContent + "</script></head><body></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList scriptList = w3cDoc.getElementsByTagName("script");
        Assert.assertEquals(1, scriptList.getLength());
        Node scriptNode = scriptList.item(0);
        NodeList children = scriptNode.getChildNodes();

        Assert.assertEquals(1, children.getLength());
        Assert.assertEquals(Node.TEXT_NODE, children.item(0).getNodeType());
        Assert.assertEquals(scriptContent, children.item(0).getNodeValue());
    }

    @Test
    public void convert_givenUnhandledNode_shouldSilentlyIgnore() {
        // Arrange
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        DocumentType docType = new DocumentType("html", "", "", "");
        jsoupDoc.body().appendChild(docType);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals(0, w3cDoc.getElementsByTagName("body").item(0).getChildNodes().getLength());
    }

    @Test
    public void convert_givenInvalidAttributeCharacters_shouldSanitizeAttributeKey() {
        // Arrange
        String html = "<html><body><div foo$bar=\"baz\" data-value:1=\"ok\" [ng-model]=\"val\"></div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        org.w3c.dom.Element div = (org.w3c.dom.Element) w3cDoc.getElementsByTagName("div").item(0);
        Assert.assertEquals("baz", div.getAttribute("foobar"));
        Assert.assertEquals("ok", div.getAttribute("data-value:1"));
        Assert.assertEquals("val", div.getAttribute("ng-model"));
    }

    @Test
    public void convert_givenDefaultNamespace_shouldPropagateNamespaceURI() {
        // Arrange
        String html = "<html xmlns=\"http://www.w3.org/1999/xhtml\"><head></head><body><div>Content</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        org.w3c.dom.Element htmlEl = w3cDoc.getDocumentElement();
        Assert.assertEquals("http://www.w3.org/1999/xhtml", htmlEl.getNamespaceURI());

        org.w3c.dom.Element divEl = (org.w3c.dom.Element) w3cDoc.getElementsByTagName("div").item(0);
        Assert.assertEquals("http://www.w3.org/1999/xhtml", divEl.getNamespaceURI());
    }

    @Test
    public void convert_givenPrefixedNamespace_shouldApplyMatchingNamespaceURI() {
        // Arrange
        String html = "<html xmlns:custom=\"http://example.com/ns\"><custom:tag attr=\"val\">Custom</custom:tag></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList customList = w3cDoc.getElementsByTagName("custom:tag");
        Assert.assertEquals(1, customList.getLength());
        Node customNode = customList.item(0);
        Assert.assertEquals("http://example.com/ns", customNode.getNamespaceURI());
        Assert.assertEquals("custom:tag", customNode.getNodeName());
    }

    @Test
    public void convert_givenTagStartingWithColon_shouldTreatPrefixAsEmpty() {
        // Arrange
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body></body></html>");
        Element colonEl = jsoupDoc.createElement(":tagname");
        colonEl.attr("xmlns", "http://default.com");
        jsoupDoc.body().appendChild(colonEl);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList nodes = w3cDoc.getElementsByTagName(":tagname");
        Assert.assertEquals(1, nodes.getLength());
        Assert.assertEquals("http://default.com", nodes.item(0).getNamespaceURI());
    }

    @Test
    public void asString_givenValidW3CDocument_shouldSerializeToXmlString() {
        // Arrange
        String html = "<html><head><title>Title</title></head><body><p>Content</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Act
        String result = w3cDom.asString(w3cDoc);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue("Serialized XML should contain the <title> tag", result.indexOf("<title>Title</title>") != -1);
        Assert.assertTrue("Serialized XML should contain the <p> tag", result.indexOf("<p>Content</p>") != -1);
    }

    @Test(expected = IllegalStateException.class)
    public void asString_givenBrokenDocumentCausingTransformerException_shouldThrowIllegalStateException() {
        // Arrange
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                throw new RuntimeException("Simulated DOM failure for transformer");
            }
        };
        Document proxyDoc = (Document) Proxy.newProxyInstance(
                Document.class.getClassLoader(),
                new Class[] { Document.class },
                handler
        );

        // Act
        w3cDom.asString(proxyDoc);
    }
}