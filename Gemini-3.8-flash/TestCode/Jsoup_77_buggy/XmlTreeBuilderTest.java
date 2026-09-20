package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void defaultSettings_whenInvoked_shouldPreserveCase() {
        // Arrange & Act
        ParseSettings settings = treeBuilder.defaultSettings();

        // Assert
        Assert.assertNotNull(settings);
        Assert.assertEquals("camelCase", settings.normalizeTag("camelCase"));
        Assert.assertEquals("AttrCASE", settings.normalizeAttribute("AttrCASE"));
    }

    @Test
    public void parse_givenStringInputAndBaseUri_shouldParseValidXmlDocument() {
        // Arrange
        String xml = "<root id=\"1\"><child>Content</child></root>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(baseUri, doc.baseUri());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals("1", root.attr("id"));
        Assert.assertEquals(1, root.children().size());
        Assert.assertEquals("child", root.child(0).tagName());
        Assert.assertEquals("Content", root.child(0).text());
    }

    @Test
    public void parse_givenReaderInputAndBaseUri_shouldParseCorrectly() {
        // Arrange
        String xml = "<message><text>Hello World</text></message>";
        Reader reader = new StringReader(xml);
        String baseUri = "http://example.com/api";

        // Act
        Document doc = treeBuilder.parse(reader, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals("message", doc.child(0).tagName());
        Assert.assertEquals("Hello World", doc.child(0).child(0).text());
    }

    @Test
    public void parse_givenXmlDeclarationWithQuestionMark_shouldInsertXmlDeclarationNode() {
        // Arrange
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Assert.assertTrue(doc.childNodeSize() > 0);
        Node firstChild = doc.childNode(0);
        Assert.assertTrue(firstChild instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) firstChild;
        Assert.assertEquals("xml", decl.name());
        Assert.assertEquals("1.0", decl.attr("version"));
        Assert.assertEquals("UTF-8", decl.attr("encoding"));
        Assert.assertFalse(decl.toString().startsWith("<!"));
    }

    @Test
    public void parse_givenXmlDeclarationWithExclamationMark_shouldInsertXmlDeclarationNodeWithExclamation() {
        // Arrange
        String xml = "<!foo version=\"2.0\"?><data/>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Assert.assertTrue(doc.childNodeSize() > 0);
        Node firstChild = doc.childNode(0);
        Assert.assertTrue(firstChild instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) firstChild;
        Assert.assertEquals("foo", decl.name());
        Assert.assertEquals("2.0", decl.attr("version"));
    }

    @Test
    public void parse_givenBogusCommentWithShortData_shouldTreatAsNormalComment() {
        // Arrange
        Token.Comment bogusShort = new Token.Comment();
        bogusShort.bogus = true;
        bogusShort.getData().append("?");

        // Act
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.insert(bogusShort);

        // Assert
        Document doc = treeBuilder.doc;
        Assert.assertEquals(1, doc.childNodeSize());
        Assert.assertTrue(doc.childNode(0) instanceof Comment);
        Comment comment = (Comment) doc.childNode(0);
        Assert.assertEquals("?", comment.getData());
    }

    @Test
    public void parse_givenBogusCommentWithoutXmlPrefix_shouldTreatAsNormalComment() {
        // Arrange
        Token.Comment bogusComment = new Token.Comment();
        bogusComment.bogus = true;
        bogusComment.getData().append("regular comment data");

        // Act
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        treeBuilder.insert(bogusComment);

        // Assert
        Document doc = treeBuilder.doc;
        Assert.assertEquals(1, doc.childNodeSize());
        Assert.assertTrue(doc.childNode(0) instanceof Comment);
        Comment comment = (Comment) doc.childNode(0);
        Assert.assertEquals("regular comment data", comment.getData());
    }

    @Test
    public void parse_givenStandardComment_shouldInsertCommentNode() {
        // Arrange
        String xml = "<!-- This is a regular comment --><root/>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Assert.assertTrue(doc.childNodeSize() >= 2);
        Node firstNode = doc.childNode(0);
        Assert.assertTrue(firstNode instanceof Comment);
        Comment comment = (Comment) firstNode;
        Assert.assertEquals(" This is a regular comment ", comment.getData());
    }

    @Test
    public void parse_givenCDataSection_shouldInsertCDataNode() {
        // Arrange
        String xml = "<root><![CDATA[<unescaped & content>]]></root>";

        // Act
        Document doc = treeBuilder.parse