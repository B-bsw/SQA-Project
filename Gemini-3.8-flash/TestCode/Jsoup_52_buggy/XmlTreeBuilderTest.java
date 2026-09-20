package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class XmlTreeBuilderTest {

    @Test
    public void initialiseParse_givenBaseUriAndErrorList_shouldConfigureXmlSyntaxAndSeedStackWithDocument() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<test/>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        builder.initialiseParse(input, baseUri, errorList);

        // Assert
        Assert.assertNotNull(builder.doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, builder.doc.outputSettings().syntax());
        Assert.assertEquals(1, builder.stack.size());
        Assert.assertSame(builder.doc, builder.stack.get(0));
    }

    @Test
    public void parseFragment_givenEmptyInput_shouldReturnEmptyNodeList() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertTrue(nodes.isEmpty());
    }

    @Test
    public void parseFragment_givenSimpleElement_shouldCreateElementNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<item id=\"1\" name=\"test\"></item>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Element);
        Element element = (Element) nodes.get(0);
        Assert.assertEquals("item", element.nodeName());
        Assert.assertEquals("1", element.attr("id"));
        Assert.assertEquals("test", element.attr("name"));
        Assert.assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void parseFragment_givenNestedElements_shouldBuildProperTreeHierarchy() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<root><parent><child>Content</child></parent></root>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Element root = (Element) nodes.get(0);
        Assert.assertEquals("root", root.nodeName());
        Assert.assertEquals(1, root.children().size());

        Element parent = root.child(0);
        Assert.assertEquals("parent", parent.nodeName());
        Assert.assertEquals(1, parent.children().size());

        Element child = parent.child(0);
        Assert.assertEquals("child", child.nodeName());
        Assert.assertEquals("Content", child.text());
    }

    @Test
    public void parseFragment_givenSelfClosingKnownHtmlTag_shouldAcknowledgeSelfClosingWithoutMarkingTag() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<br />";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Element br = (Element) nodes.get(0);
        Assert.assertEquals("br", br.nodeName());
        Assert.assertTrue(br.tag().isKnownTag());
        Assert.assertTrue(builder.stack.isEmpty() || !builder.stack.contains(br));
    }

    @Test
    public void parseFragment_givenSelfClosingUnknownTag_shouldMarkTagAsSelfClosing() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<custom-widget id=\"w1\" />";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Element customTag = (Element) nodes.get(0);
        Assert.assertEquals("custom-widget", customTag.nodeName());
        Assert.assertFalse(customTag.tag().isKnownTag());
        Assert.assertTrue(customTag.tag().isSelfClosing());
    }

    @Test
    public void parseFragment_givenTextCharacters_shouldInsertTextNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "Plain Text Content";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof TextNode);
        TextNode textNode = (TextNode) nodes.get(0);
        Assert.assertEquals("Plain Text Content", textNode.text());
    }

    @Test
    public void parseFragment_givenStandardComment_shouldInsertCommentNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<!-- This is a regular comment -->";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Comment);
        Assert.assertFalse(nodes.get(0) instanceof XmlDeclaration);
        Comment comment = (Comment) nodes.get(0);
        Assert.assertEquals(" This is a regular comment ", comment.getData());
    }

    @Test
    public void parseFragment_givenBogusCommentWithQuestionMark_shouldInsertXmlDeclaration() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);
        Assert.assertEquals("xml version=\"1.0\" encoding=\"UTF-8\"", decl.name());
        Assert.assertEquals(baseUri, decl.baseUri());
    }

    @Test
    public void parseFragment_givenBogusCommentWithExclamationMark_shouldInsertProcessingInstructionXmlDeclaration() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<!ENTITY sample \"value\">";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) nodes.get(0);
        Assert.assertTrue(decl.name().startsWith("ENTITY sample"));
    }

    @Test
    public void parseFragment_givenBogusCommentWithSingleSpecialCharacter_shouldRemainCommentNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<?>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Comment);
        Assert.assertFalse(nodes.get(0) instanceof XmlDeclaration);
    }

    @Test
    public void parseFragment_givenBogusCommentWithSingleExclamation_shouldRemainCommentNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<!>";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment(fragment, baseUri, errorList);

        // Assert
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Comment);
        Assert.assertFalse(nodes.get(0) instanceof XmlDeclaration);
    }

    @Test
    public void parseFragment_givenDoctypeWithPublicAndSystemIds_shouldInsertDocumentTypeNode() {
        // Arrange
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String fragment = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
        String baseUri = "http://example.com/";
        ParseErrorList errorList = ParseErrorList.noTracking();

        // Act
        List<Node> nodes = builder.parseFragment