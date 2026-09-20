package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.Collections;
import java.util.List;

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

        // Assert - handled by expected exception
    }

    @Test
    public void fromJsoup_givenSimpleHtmlDocument_shouldConvertSuccessfully() {
        // Arrange
        String html = "<html><head><title>W3C Test</title></head><body><p id=\"p1\">Sample Text</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        NodeList titleList = w3cDoc.getElementsByTagName("title");
        Assert.assertEquals(1, titleList.getLength());
        Assert.assertEquals("W3C Test", titleList.item(0).getTextContent());
        NodeList pList = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, pList.getLength());
        org.w3c.dom.Element pEl = (org.w3c.dom.Element) pList.item(0);
        Assert.assertEquals("p1", pEl.getAttribute("id"));
        Assert.assertEquals("Sample Text", pEl.getTextContent());
    }

    @Test
    public void fromJsoup_givenDocumentWithLocation_shouldSetDocumentURI() {
        // Arrange
        String html = "<html><body><p>Located</p></body></html>";
        String baseUri = "http://example.com/test/index.html";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, baseUri);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        Assert.assertEquals(baseUri, w3cDoc.getDocumentURI());
    }

    @Test
    public void fromJsoup_givenDocumentWithBlankLocation_shouldNotSetDocumentURI() {
        // Arrange
        String html = "<html><body><p>No Base</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html, "");

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        Assert.assertNull(w3cDoc.getDocumentURI());
    }

    @Test
    public void fromJsoup_givenDefaultNamespace_shouldCreateElementWithNamespace() {
        // Arrange
        String html = "<html xmlns=\"http://www.w3.org/1999/xhtml\"><body><div>NS Content</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        org.w3c.dom.Element root = w3cDoc.getDocumentElement();
        Assert.assertEquals("http://www.w3.org/1999/xhtml", root.getNamespaceURI());
        NodeList divList = w3cDoc.getElementsByTagName("div");
        Assert.assertEquals(1, divList.getLength());
        Assert.assertEquals("http://www.w3.org/1999/xhtml", divList.item(0).getNamespaceURI());
    }

    @Test
    public void fromJsoup_givenPrefixedNamespace_shouldCreateElementWithPrefixAndNamespace() {
        // Arrange
        String xml = "<root xmlns:custom=\"http://example.com/custom\"><custom:item id=\"1\">Value</custom:item></root>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(xml, "", Parser.xmlParser());

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        NodeList itemList = w3cDoc.getElementsByTagName("custom:item");
        Assert.assertEquals(1, itemList.getLength());
        org.w3c.dom.Element itemEl = (org.w3c.dom.Element) itemList.item(0);
        Assert.assertEquals("http://example.com/custom", itemEl.getNamespaceURI());
        Assert.assertEquals("custom:item", itemEl.getTagName());
        Assert.assertEquals("1", itemEl.getAttribute("id"));
        Assert.assertEquals("Value", itemEl.getTextContent());
    }

    @Test
    public void fromJsoup_givenCommentAndDataNodes_shouldConvertBothCorrectly() {
        // Arrange
        String html = "<html><head><script>var x = 10;</script></head><body><!-- Test Comment --><p>Hello</p></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        Assert.assertNotNull(w3cDoc);
        NodeList scriptList = w3cDoc.getElementsByTagName("script");
        Assert.assertEquals(1, scriptList.getLength());
        Assert.assertEquals("var x = 10;", scriptList.item(0).getTextContent());

        org.w3c.dom.Node bodyNode = w3cDoc.getElementsByTagName("body").item(0);
        NodeList bodyChildren = bodyNode.getChildNodes();
        boolean foundComment = false;
        for (int i = 0; i < bodyChildren.getLength(); i++) {
            org.w3c.dom.Node child = bodyChildren.item(i);
            if (child.getNodeType() == org.w3c.dom.Node.COMMENT_NODE) {
                Assert.assertEquals(" Test Comment ", child.getTextContent());
                foundComment = true;
                break;
            }
        }
        Assert.assertTrue(foundComment);
    }

    @Test
    public void fromJsoup_givenVariousAttributeKeys_shouldFilterInvalidAndPreserveValid() {
        // Arrange
        String html = "<html><body><div id=\"main\" data-attr=\"value\" _validKey=\"ok\" 1invalidKey=\"bad\" @invalid=\"no\">Text</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList divList = w3cDoc.getElementsByTagName("div");
        Assert.assertEquals(1, divList.getLength());
        org.w3c.dom.Element divEl = (org.w3c.dom.Element) divList.item(0);

        Assert.assertEquals("main", divEl.getAttribute("id"));
        Assert.assertEquals("value", divEl.getAttribute("data-attr"));
        Assert.assertEquals("ok", divEl.getAttribute("_validKey"));
        Assert.assertEquals("", divEl.getAttribute("1invalidKey"));
        Assert.assertEquals("", divEl.getAttribute("@invalid"));
    }

    @Test
    public void fromJsoup_givenParserConfigurationException_shouldThrowIllegalStateException() {
        // Arrange
        w3cDom.factory = new DocumentBuilderFactory() {
            public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
                throw new ParserConfigurationException("Simulated configuration error");
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

        // Act & Assert
        try {
            w3cDom.fromJsoup(jsoupDoc);
            Assert.fail("Expected IllegalStateException due to ParserConfigurationException");
        } catch (IllegalStateException e) {
            Assert.assertNotNull(e.getCause());
            Assert.assertTrue(e.getCause() instanceof ParserConfigurationException);
        }
    }

    @Test
    public void convert_givenExistingW3cDocument_shouldPopulateGivenDocument() throws Exception {
        // Arrange
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><span>Converted</span></body></html>");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document w3cDoc = dbf.newDocumentBuilder().newDocument();

        // Act
        w3cDom.convert(jsoupDoc, w3cDoc);

        // Assert
        Assert.assertNotNull(w3cDoc.getDocumentElement());
        Assert.assertEquals("html", w3cDoc.getDocumentElement().getTagName());
        NodeList spanList = w3cDoc.getElementsByTagName("span");
        Assert.assertEquals(1, spanList.getLength());
        Assert.assertEquals("Converted", spanList.item(0).getTextContent());
    }

    @Test
    public void asString_givenW3cDocument_shouldSerializeToXmlString() {
        // Arrange
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head></head><body><p>Serialize Me</p></body></html>");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Act
        String serialized = w3cDom.asString(w3cDoc);

        // Assert
        Assert.assertNotNull(serialized);
        Assert.assertTrue(serialized.contains("<p>Serialize Me</p>"));
    }

    @Test
    public void w3cBuilder_givenUnhandledNode_shouldIgnoreSilently() throws Exception {
        // Arrange
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        Document outDoc = dbf.newDocumentBuilder().newDocument();
        W3CDom.W3CBuilder builder = new W3CDom.W3CBuilder(outDoc);

        Node unhandledNode = new Node("http://example.com") {
            public String nodeName() {
                return "#unhandled";
            }

            void outerHtmlHead(StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
            }

            void outerHtmlTail(StringBuilder accum, int depth, org.jsoup.nodes.Document.OutputSettings out) {
            }
        };

        // Act & Assert (head and tail should execute without exception)
        builder.head(unhandledNode, 0);
        builder.tail(unhandledNode, 0);
        Assert.assertNull(outDoc.getDocumentElement());
    }

    @Test
    public void w3cBuilder_givenDeeplyNestedElements_shouldDescendAndUndescendProperly() {
        // Arrange
        String html = "<div><ul><li>Item 1</li><li>Item 2</li></ul><p>Footer</p></div>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        // Act
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        // Assert
        NodeList liList = w3cDoc.getElementsByTagName("li");
        Assert.assertEquals(2, liList.getLength());
        Assert.assertEquals("Item 1", liList.item(0).getTextContent());
        Assert.assertEquals("Item 2", liList.item(1).getTextContent());

        NodeList pList = w3cDoc.getElementsByTagName("p");
        Assert.assertEquals(1, pList.getLength());
        Assert.assertEquals("Footer", pList.item(0).getTextContent());
        Assert.assertEquals("body", pList.item(0).getParentNode().getNodeName());
    }
}