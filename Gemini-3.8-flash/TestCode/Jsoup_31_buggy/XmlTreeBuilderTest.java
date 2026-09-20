package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void initialiseParse_givenInputAndBaseUri_shouldInitializeStackWithDocument() {
        // Arrange
        String input = "<root></root>";
        String baseUri = "http://example.com/test";
        ParseErrorList errors = ParseErrorList.noTracking();

        // Act
        treeBuilder.initialiseParse(input, baseUri, errors);

        // Assert
        Assert.assertNotNull("Document should not be null", treeBuilder.doc);
        Assert.assertEquals("Stack should contain exactly 1 element", 1, treeBuilder.stack.size());
        Assert.assertSame("Stack top should be document", treeBuilder.doc, treeBuilder.stack.get(0));
        Assert.assertEquals("Base URI should match", baseUri, treeBuilder.baseUri);
    }

    @Test
    public void process_givenStartTagNonSelfClosing_shouldInsertElementAndPushToStack() {
        // Arrange
        String xml = "<parent><child>Text</child></parent>";
        String baseUri = "http://example.com";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Element parent = doc.child(0);
        Assert.assertEquals("parent", parent.tagName());
        Assert.assertEquals("child", parent.child(0).tagName());
        Assert.assertEquals("Text", ((TextNode) parent.child(0).childNode(0)).getWholeText());
    }

    @Test
    public void process_givenSelfClosingUnknownTag_shouldSetTagSelfClosingAndNotPushToStack() {
        // Arrange
        String xml = "<root><custom-self-closing attr=\"val\"/></root>";
        String baseUri = "http://example.com";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Element customTag = doc.child(0).child(0);
        Assert.assertEquals("custom-self-closing", customTag.tagName());
        Assert.assertEquals("val", customTag.attr("attr"));
        Assert.assertTrue("Unknown self-closing tag must be flagged as self-closing", customTag.tag().isSelfClosing());
        Assert.assertFalse("Known tag check should return false for custom tag", customTag.tag().isKnownTag());
    }

    @Test
    public void process_givenSelfClosingKnownTag_shouldAcknowledgeFlagWithoutCallingSetSelfClosing() {
        // Arrange
        // 'img' is a known HTML/standard tag
        String xml = "<root><img src=\"test.png\"/></root>";
        String baseUri = "http://example.com";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Element img = doc.child(0).child(0);
        Assert.assertEquals("img", img.tagName());
        Assert.assertTrue("Known tag check should return true for img", img.tag().isKnownTag());
        Assert.assertEquals("test.png", img.attr("src"));
    }

    @Test
    public void process_givenEndTagMatchingCurrentElement_shouldPopStackDirectly() {
        // Arrange
        String xml = "<root><item>Hello</item></root>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("item", root.child(0).tagName());
    }

    @Test
    public void process_givenEndTagMatchingAncestor_shouldPopInterveningElementsAndAncestor() {
        // Arrange: <inner> is unclosed, </outer> should pop both <inner> and <outer>
        String xml = "<outer><inner>Some Content</outer>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element outer = doc.child(0);
        Assert.assertEquals("outer", outer.tagName());
        Assert.assertEquals(1, outer.children().size());
        Assert.assertEquals("inner", outer.child(0).tagName());
        Assert.assertEquals("Some Content", outer.child(0).text());
    }

    @Test
    public void process_givenEndTagNotInStack_shouldIgnoreAndSkipWithoutException() {
        // Arrange: </nonexistent> is not in the stack
        String xml = "<root></nonexistent><item>Content</item></root>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("item", root.child(0).tagName());
    }

    @Test
    public void process_givenCommentToken_shouldInsertCommentNodeUnderCurrentElement() {
        // Arrange
        String xml = "<root><!-- This is a comment --></root>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element root = doc.child(0);
        List<Node> childNodes = root.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue("Child should be Comment", childNodes.get(0) instanceof Comment);
        Comment comment = (Comment) childNodes.get(0);
        Assert.assertEquals(" This is a comment ", comment.getData());
    }

    @Test
    public void process_givenCharacterToken_shouldInsertTextNodeUnderCurrentElement() {
        // Arrange
        String xml = "<root>Simple text data</root>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element root = doc.child(0);
        List<Node> childNodes = root.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue("Child should be TextNode", childNodes.get(0) instanceof TextNode);
        TextNode textNode = (TextNode) childNodes.get(0);
        Assert.assertEquals("Simple text data", textNode.getWholeText());
    }

    @Test
    public void process_givenDoctypeToken_shouldInsertDocumentTypeNode() {
        // Arrange
        String xml = "<!DOCTYPE root PUBLIC \"-//W3C//DTD XHTML 1.0//EN\" \"http://www.w3.org/TR/xhtml1.dtd\"><root/>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        List<Node> nodes = doc.childNodes();
        Assert.assertTrue("First node should be DocumentType", nodes.get(0) instanceof DocumentType);
        DocumentType docType = (DocumentType) nodes.get(0);
        Assert.assertEquals("root", docType.attr("name"));
        Assert.assertEquals("-//W3C//DTD XHTML 1.0//EN", docType.attr("publicId"));
        Assert.assertEquals("http://www.w3.org/TR/xhtml1.dtd", docType.attr("systemId"));
    }

    @Test
    public void process_givenEofToken_shouldTerminateGracefully() {
        // Arrange
        String xml = "<root></root>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.children().size());
        Assert.assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void parse_givenEmptyString_shouldProduceEmptyDocument() {
        // Arrange
        String xml = "";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
        Assert.assertEquals(0, doc.childNodes().size());
    }

    @Test
    public void parse_givenWhitespaceOnly_shouldProduceDocumentWithWhitespaceNode() {
        // Arrange
        String xml = "   \n\t  ";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
        Assert.assertEquals(1, doc.childNodes().size());
        Assert.assertTrue(doc.childNode(0) instanceof TextNode);
    }

    @Test
    public void parse_givenCaseSensitiveTags_shouldPreserveCasingAndNotCloseMismatched() {
        // Arrange: XML tag names are case-sensitive
        String xml = "<CaseSensitive><SUB>value</SUB></casesensitive>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element root = doc.child(0);
        Assert.assertEquals("CaseSensitive", root.tagName());
        Assert.assertEquals("SUB", root.child(0).tagName());
        Assert.assertEquals("value", root.child(0).text());
    }

    @Test
    public void parse_givenMultipleRootElements_shouldAppendAllRootsToDocument() {
        // Arrange: In XML TreeBuilder, multiple roots are simply appended to Document
        String xml = "<first>1</first><second>2</second><third>3</third>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Assert.assertEquals(3, doc.children().size());
        Assert.assertEquals("first", doc.child(0).tagName());
        Assert.assertEquals("second", doc.child(1).tagName());
        Assert.assertEquals("third", doc.child(2).tagName());
    }

    @Test
    public void parse_givenDeeplyNestedElements_shouldMaintainCorrectHierarchy() {
        // Arrange
        String xml = "<a><b><c><d>Deep</d></c></b></a>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element a = doc.child(0);
        Element b = a.child(0);
        Element c = b.child(0);
        Element d = c.child(0);
        Assert.assertEquals("a", a.tagName());
        Assert.assertEquals("b", b.tagName());
        Assert.assertEquals("c", c.tagName());
        Assert.assertEquals("d", d.tagName());
        Assert.assertEquals("Deep", d.text());
    }

    @Test
    public void parse_givenCDataSection_shouldParseAsTextNode() {
        // Arrange
        String xml = "<data><![CDATA[Some <escaped> & 'special' chars]]></data>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com");

        // Assert
        Element data = doc.child(0);
        Assert.assertEquals(1, data.childNodes().size());
        Assert.assertEquals("Some <escaped> & 'special' chars", data.text());
    }

    @Test
    public void insert_givenCommentToken_shouldSetCorrectBaseUri() {
        // Arrange
        String baseUri = "http://example.com/base";
        treeBuilder.initialiseParse("<root></root>", baseUri, ParseErrorList.noTracking());
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Direct comment");

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> nodes = treeBuilder.doc.childNodes();
        boolean found = false;
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            if (n instanceof Comment) {
                Comment c = (Comment) n;
                if ("Direct comment".equals(c.getData())) {
                    Assert.assertEquals(baseUri, c.baseUri());
                    found = true;
                    break;
                }
            }
        }
        Assert.assertTrue("Inserted comment must be found", found);
    }

    @Test
    public void insert_givenCharacterToken_shouldSetCorrectBaseUri() {
        // Arrange
        String baseUri = "http://example.com/base";
        treeBuilder.initialiseParse("<root></root>", baseUri, ParseErrorList.noTracking());
        Token.Character charToken = new Token.Character();
        charToken.data("Direct text");

        // Act
        treeBuilder.insert(charToken);

        // Assert
        List<Node> nodes = treeBuilder.doc.childNodes();
        boolean found = false;
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            if (n instanceof TextNode) {
                TextNode t = (TextNode) n;
                if ("Direct text".equals(t.getWholeText())) {
                    Assert.assertEquals(baseUri, t.baseUri());
                    found = true;
                    break;
                }
            }
        }
        Assert.assertTrue("Inserted TextNode must be found", found);
    }

    @Test
    public void insert_givenDoctypeToken_shouldSetCorrectBaseUriAndAttributes() {
        // Arrange
        String baseUri = "http://example.com/base";
        treeBuilder.initialiseParse("<root></root>", baseUri, ParseErrorList.noTracking());
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("custom-doc");
        doctypeToken.publicIdentifier.append("pub-id");
        doctypeToken.systemIdentifier.append("sys-id");

        // Act
        treeBuilder.insert(doctypeToken);

        // Assert
        List<Node> nodes = treeBuilder.doc.childNodes();
        boolean found = false;
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            if (n instanceof DocumentType) {
                DocumentType dt = (DocumentType) n;
                if ("custom-doc".equals(dt.attr("name"))) {
                    Assert.assertEquals(baseUri, dt.baseUri());
                    Assert.assertEquals("pub-id", dt.attr("publicId"));
                    Assert.assertEquals("sys-id", dt.attr("systemId"));
                    found = true;
                    break;
                }
            }
        }
        Assert.assertTrue("Inserted DocumentType must be found", found);
    }

    @Test
    public void insert_givenStartTagToken_shouldReturnElementWithCorrectBaseUri() {
        // Arrange
        String baseUri = "http://example.com/base";
        treeBuilder.initialiseParse("<root></root>", baseUri, ParseErrorList.noTracking());
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("child-node", new org.jsoup.nodes.Attributes());

        // Act
        Element el = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(el);
        Assert.assertEquals("child-node", el.tagName());
        Assert.assertEquals(baseUri, el.baseUri());
        Assert.assertTrue(treeBuilder.stack.contains(el));
    }
}