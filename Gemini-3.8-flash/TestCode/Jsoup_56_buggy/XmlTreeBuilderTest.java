package org.jsoup.parser;

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

import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void defaultSettings_shouldReturnPreserveCase() {
        // Arrange & Act
        ParseSettings settings = treeBuilder.defaultSettings();

        // Assert
        Assert.assertNotNull(settings);
        Assert.assertSame(ParseSettings.preserveCase, settings);
    }

    @Test
    public void parse_givenXmlInput_shouldSetXmlSyntaxAndPreserveCase() {
        // Arrange
        String xml = "<root><child ID=\"123\">Text</child></root>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Element child = root.child(0);
        Assert.assertEquals("child", child.tagName());
        Assert.assertEquals("123", child.attr("ID"));
        Assert.assertEquals("Text", child.text());
        Assert.assertEquals(baseUri, doc.baseUri());
    }

    @Test
    public void initialiseParse_givenParameters_shouldPlaceDocOnStackAndSetXmlSyntax() {
        // Arrange
        String input = "<test/>";
        String baseUri = "http://example.com/";
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;

        // Act
        treeBuilder.initialiseParse(input, baseUri, errors, settings);

        // Assert
        Assert.assertEquals(1, treeBuilder.stack.size());
        Assert.assertSame(treeBuilder.doc, treeBuilder.stack.get(0));
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, treeBuilder.doc.outputSettings().syntax());
    }

    @Test
    public void insert_startTagNotSelfClosing_shouldAddElementToStack() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        int initialStackSize = treeBuilder.stack.size();

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("testNode", new org.jsoup.nodes.Attributes());

        // Act
        Element el = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(el);
        Assert.assertEquals("testNode", el.tagName());
        Assert.assertEquals(initialStackSize + 1, treeBuilder.stack.size());
        Assert.assertSame(el, treeBuilder.currentElement());
    }

    @Test
    public void insert_startTagSelfClosingUnknownTag_shouldAcknowledgeFlagAndNotAddToStack() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        int initialStackSize = treeBuilder.stack.size();

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("unknownTag", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = true;

        // Act
        Element el = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(el);
        Assert.assertEquals("unknownTag", el.tagName());
        Assert.assertEquals(initialStackSize, treeBuilder.stack.size());
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void insert_startTagSelfClosingKnownTag_shouldAcknowledgeFlagAndNotAddToStack() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        int initialStackSize = treeBuilder.stack.size();

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("img", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = true;

        // Act
        Element el = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(el);
        Assert.assertEquals("img", el.tagName());
        Assert.assertEquals(initialStackSize, treeBuilder.stack.size());
    }

    @Test
    public void process_endTagExistingInStack_shouldPopStack() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("targetTag", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(startTag);
        Assert.assertEquals(2, treeBuilder.stack.size());

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("targetTag");

        // Act
        boolean processed = treeBuilder.process(endTag);

        // Assert
        Assert.assertTrue(processed);
        Assert.assertEquals(1, treeBuilder.stack.size());
        Assert.assertSame(treeBuilder.doc, treeBuilder.currentElement());
    }

    @Test
    public void process_endTagNestedInStack_shouldPopUpToFirstFound() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.StartTag tag1 = new Token.StartTag();
        tag1.nameAttr("level1", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(tag1);

        Token.StartTag tag2 = new Token.StartTag();
        tag2.nameAttr("level2", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(tag2);

        Token.StartTag tag3 = new Token.StartTag();
        tag3.nameAttr("level3", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(tag3);

        Assert.assertEquals(4, treeBuilder.stack.size());

        Token.EndTag endTag1 = new Token.EndTag();
        endTag1.name("level1");

        // Act
        boolean processed = treeBuilder.process(endTag1);

        // Assert
        Assert.assertTrue(processed);
        Assert.assertEquals(1, treeBuilder.stack.size());
        Assert.assertSame(treeBuilder.doc, treeBuilder.currentElement());
    }

    @Test
    public void process_endTagNonExistent_shouldIgnoreWithoutModifyingStack() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        int initialStackSize = treeBuilder.stack.size();

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("missingTag");

        // Act
        boolean processed = treeBuilder.process(endTag);

        // Assert
        Assert.assertTrue(processed);
        Assert.assertEquals(initialStackSize, treeBuilder.stack.size());
    }

    @Test
    public void process_normalComment_shouldInsertCommentNode() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("This is a standard comment");
        commentToken.bogus = false;

        // Act
        boolean processed = treeBuilder.process(commentToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof Comment);
        Comment comment = (Comment) childNodes.get(0);
        Assert.assertEquals("This is a standard comment", comment.getData());
    }

    @Test
    public void process_bogusCommentWithQuestionMark_shouldInsertXmlDeclaration() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        commentToken.bogus = true;

        // Act
        boolean processed = treeBuilder.process(commentToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) childNodes.get(0);
        Assert.assertEquals("xml", decl.name());
        Assert.assertEquals("1.0", decl.attr("version"));
        Assert.assertEquals("UTF-8", decl.attr("encoding"));
        Assert.assertFalse(decl.toString().startsWith("<!"));
    }

    @Test
    public void process_bogusCommentWithExclamation_shouldInsertXmlDeclarationWithExclamation() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("!DOCTYPE html");
        commentToken.bogus = true;

        // Act
        boolean processed = treeBuilder.process(commentToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) childNodes.get(0);
        Assert.assertEquals("DOCTYPE", decl.name());
    }

    @Test
    public void process_bogusCommentWithShortLength_shouldInsertPlainComment() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("?");
        commentToken.bogus = true;

        // Act
        boolean processed = treeBuilder.process(commentToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof Comment);
        Comment comment = (Comment) childNodes.get(0);
        Assert.assertEquals("?", comment.getData());
    }

    @Test
    public void process_bogusCommentWithoutSpecialStartChar_shouldInsertPlainComment() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("regular bogus comment");
        commentToken.bogus = true;

        // Act
        boolean processed = treeBuilder.process(commentToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof Comment);
        Comment comment = (Comment) childNodes.get(0);
        Assert.assertEquals("regular bogus comment", comment.getData());
    }

    @Test
    public void process_characterToken_shouldInsertTextNode() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Character characterToken = new Token.Character();
        characterToken.data("Sample Text Data");

        // Act
        boolean processed = treeBuilder.process(characterToken);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof TextNode);
        TextNode textNode = (TextNode) childNodes.get(0);
        Assert.assertEquals("Sample Text Data", textNode.text());
    }

    @Test
    public void process_doctypeToken_shouldInsertDocumentType() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        doctype.publicIdentifier.append("-//W3C//DTD XHTML 1.0 Strict//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");

        // Act
        boolean processed = treeBuilder.process(doctype);

        // Assert
        Assert.assertTrue(processed);
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Assert.assertTrue(childNodes.get(0) instanceof DocumentType);
        DocumentType docTypeNode = (DocumentType) childNodes.get(0);
        Assert.assertEquals("html", docTypeNode.attr("name"));
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", docTypeNode.attr("publicId"));
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", docTypeNode.attr("systemId"));
    }

    @Test
    public void process_eofToken_shouldReturnTrueWithoutError() {
        // Arrange
        treeBuilder.initialiseParse("<dummy/>", "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.EOF eofToken = new Token.EOF();

        // Act
        boolean processed = treeBuilder.process(eofToken);

        // Assert
        Assert.assertTrue(processed);
    }

    @Test
    public void parseFragment_givenFragmentInput_shouldReturnNodesList() {
        // Arrange
        String fragment = "<item key=\"val\">content</item>";
        String baseUri = "http://example.com/";
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;

        // Act
        List<Node> nodes = treeBuilder.parseFragment(fragment, baseUri, errors, settings);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(1, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Element);
        Element el = (Element) nodes.get(0);
        Assert.assertEquals("item", el.tagName());
        Assert.assertEquals("val", el.attr("key"));
        Assert.assertEquals("content", el.text());
    }

    @Test
    public void parseFragment_multipleNodes_shouldReturnAllNodes() {
        // Arrange
        String fragment = "<!-- comment --><one/>text<two/>";
        String baseUri = "http://example.com/";
        ParseErrorList errors = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;

        // Act
        List<Node> nodes = treeBuilder.parseFragment(fragment, baseUri, errors, settings);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(4, nodes.size());
        Assert.assertTrue(nodes.get(0) instanceof Comment);
        Assert.assertTrue(nodes.get(1) instanceof Element);
        Assert.assertTrue(nodes.get(2) instanceof TextNode);
        Assert.assertTrue(nodes.get(3) instanceof Element);
    }

    @Test
    public void parse_unclosedTags_shouldNestTagsGracefully() {
        // Arrange
        String xml = "<root><parent><child>Text";
        String baseUri = "http://example.com/";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Element root = doc.select("root").first();
        Assert.assertNotNull(root);
        Element parent = root.select("parent").first();
        Assert.assertNotNull(parent);
        Element child = parent.select("child").first();
        Assert.assertNotNull(child);
        Assert.assertEquals("Text", child.text());
    }

    @Test
    public void parse_closingTagMismatch_shouldRecoverAndCloseCorrectElement() {
        // Arrange
        String xml = "<outer><inner>content</outer>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Element outer = doc.select("outer").first();
        Assert.assertNotNull(outer);
        Element inner = outer.select("inner").first();
        Assert.assertNotNull(inner);
        Assert.assertEquals("content", inner.text());
    }
}