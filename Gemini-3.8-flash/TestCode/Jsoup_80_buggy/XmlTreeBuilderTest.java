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
    public void defaultSettings_whenCalled_shouldReturnPreserveCase() {
        // Arrange & Act
        ParseSettings settings = treeBuilder.defaultSettings();

        // Assert
        Assert.assertNotNull(settings);
        Assert.assertSame(ParseSettings.preserveCase, settings);
    }

    @Test
    public void parse_givenReaderAndBaseUri_shouldParseCorrectly() {
        // Arrange
        Reader reader = new StringReader("<root><child attr=\"val\">text</child></root>");
        String baseUri = "http://example.com/test";

        // Act
        Document doc = treeBuilder.parse(reader, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Assert.assertEquals(baseUri, doc.baseUri());
        Assert.assertEquals(1, doc.children().size());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Assert.assertEquals(1, root.children().size());
        Element child = root.child(0);
        Assert.assertEquals("child", child.tagName());
        Assert.assertEquals("val", child.attr("attr"));
        Assert.assertEquals("text", child.text());
    }

    @Test
    public void parse_givenStringAndBaseUri_shouldParseCorrectly() {
        // Arrange
        String xml = "<note><to>User</to><from>Admin</from></note>";
        String baseUri = "http://example.com/";

        // Act
        Document doc = treeBuilder.parse(xml, baseUri);

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.children().size());
        Element note = doc.child(0);
        Assert.assertEquals("note", note.tagName());
        Assert.assertEquals("User", note.select("to").text());
        Assert.assertEquals("Admin", note.select("from").text());
    }

    @Test
    public void initialiseParse_givenParameters_shouldPlaceDocOnStackAndSetXmlSyntax() {
        // Arrange
        StringReader reader = new StringReader("<root/>");
        ParseErrorList errorList = ParseErrorList.noTracking();
        ParseSettings settings = ParseSettings.preserveCase;

        // Act
        treeBuilder.initialiseParse(reader, "http://example.com/", errorList, settings);

        // Assert
        Assert.assertNotNull(treeBuilder.doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, treeBuilder.doc.outputSettings().syntax());
        Assert.assertFalse(treeBuilder.stack.isEmpty());
        Assert.assertSame(treeBuilder.doc, treeBuilder.stack.get(0));
    }

    @Test
    public void insert_givenSelfClosingKnownTag_shouldNotBeAddedToStack() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("img", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = true;

        int stackSizeBefore = treeBuilder.stack.size();

        // Act
        Element inserted = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(inserted);
        Assert.assertEquals("img", inserted.tagName());
        Assert.assertEquals(stackSizeBefore, treeBuilder.stack.size());
    }

    @Test
    public void insert_givenSelfClosingUnknownTag_shouldMarkTagSelfClosingAndNotAddToStack() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("customSelfClosing", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = true;

        int stackSizeBefore = treeBuilder.stack.size();

        // Act
        Element inserted = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(inserted);
        Assert.assertEquals("customSelfClosing", inserted.tagName());
        Assert.assertTrue(inserted.tag().isSelfClosing());
        Assert.assertEquals(stackSizeBefore, treeBuilder.stack.size());
    }

    @Test
    public void insert_givenNonSelfClosingTag_shouldAddToStack() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("section", new org.jsoup.nodes.Attributes());
        startTag.selfClosing = false;

        int stackSizeBefore = treeBuilder.stack.size();

        // Act
        Element inserted = treeBuilder.insert(startTag);

        // Assert
        Assert.assertNotNull(inserted);
        Assert.assertEquals(stackSizeBefore + 1, treeBuilder.stack.size());
        Assert.assertSame(inserted, treeBuilder.stack.get(treeBuilder.stack.size() - 1));
    }

    @Test
    public void insert_givenNormalComment_shouldAppendCommentNode() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("This is regular comment");
        commentToken.bogus = false;

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof Comment);
        Assert.assertEquals("This is regular comment", ((Comment) lastNode).getData());
    }

    @Test
    public void insert_givenBogusCommentStartingWithQuestionMark_shouldAppendXmlDeclarationNode() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        commentToken.bogus = true;

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof XmlDeclaration);
        XmlDeclaration xmlDecl = (XmlDeclaration) lastNode;
        Assert.assertEquals("xml", xmlDecl.name());
        Assert.assertEquals("1.0", xmlDecl.attr("version"));
        Assert.assertEquals("UTF-8", xmlDecl.attr("encoding"));
    }

    @Test
    public void insert_givenBogusCommentStartingWithExclamationMark_shouldAppendXmlDeclarationProcessingInstruction() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("!custom-decl key=\"value\"!");
        commentToken.bogus = true;

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof XmlDeclaration);
        XmlDeclaration xmlDecl = (XmlDeclaration) lastNode;
        Assert.assertEquals("custom-decl", xmlDecl.name());
        Assert.assertEquals("value", xmlDecl.attr("key"));
    }

    @Test
    public void insert_givenBogusCommentWithShortLength_shouldFallBackToRegularComment() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("?");
        commentToken.bogus = true;

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof Comment);
        Assert.assertEquals("?", ((Comment) lastNode).getData());
    }

    @Test
    public void insert_givenBogusCommentNotStartingWithQuestionOrExclamation_shouldFallBackToRegularComment() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("regularBogusText");
        commentToken.bogus = true;

        // Act
        treeBuilder.insert(commentToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof Comment);
        Assert.assertEquals("regularBogusText", ((Comment) lastNode).getData());
    }

    @Test
    public void insert_givenTextCharacterToken_shouldAppendTextNode() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Character charToken = new Token.Character();
        charToken.data("Hello Plain Text");

        // Act
        treeBuilder.insert(charToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof TextNode);
        Assert.assertEquals("Hello Plain Text", ((TextNode) lastNode).text());
    }

    @Test
    public void insert_givenCDataCharacterToken_shouldAppendCDataNode() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.CData cdataToken = new Token.CData("CDATA content & special <chars>");

        // Act
        treeBuilder.insert(cdataToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof CDataNode);
        Assert.assertEquals("CDATA content & special <chars>", ((CDataNode) lastNode).text());
    }

    @Test
    public void insert_givenDoctypeToken_shouldAppendDocumentTypeNode() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        doctypeToken.publicIdentifier.append("-//W3C//DTD XHTML 1.0 Strict//EN");
        doctypeToken.systemIdentifier.append("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
        doctypeToken.pubSysKey = "PUBLIC";

        // Act
        treeBuilder.insert(doctypeToken);

        // Assert
        List<Node> childNodes = treeBuilder.doc.childNodes();
        Assert.assertFalse(childNodes.isEmpty());
        Node lastNode = childNodes.get(childNodes.size() - 1);
        Assert.assertTrue(lastNode instanceof DocumentType);
        DocumentType dt = (DocumentType) lastNode;
        Assert.assertEquals("html", dt.name());
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", dt.publicId());
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", dt.systemId());
    }

    @Test
    public void process_givenAllSupportedTokenTypes_shouldReturnTrue() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("item", new org.jsoup.nodes.Attributes());

        Token.Comment comment = new Token.Comment();
        comment.getData().append("comment");

        Token.Character character = new Token.Character();
        character.data("text");

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("item");

        Token.EOF eof = new Token.EOF();

        // Act & Assert
        Assert.assertTrue(treeBuilder.process(doctype));
        Assert.assertTrue(treeBuilder.process(startTag));
        Assert.assertTrue(treeBuilder.process(comment));
        Assert.assertTrue(treeBuilder.process(character));
        Assert.assertTrue(treeBuilder.process(endTag));
        Assert.assertTrue(treeBuilder.process(eof));
    }

    @Test
    public void popStackToClose_givenMatchingTag_shouldPopUpToMatchingElement() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.StartTag startRoot = new Token.StartTag();
        startRoot.nameAttr("root", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(startRoot);

        Token.StartTag startChild = new Token.StartTag();
        startChild.nameAttr("child", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(startChild);

        Token.StartTag startGrandchild = new Token.StartTag();
        startGrandchild.nameAttr("grandchild", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(startGrandchild);

        Assert.assertEquals(4, treeBuilder.stack.size()); // doc, root, child, grandchild

        Token.EndTag endChild = new Token.EndTag();
        endChild.name("child");

        // Act
        treeBuilder.process(endChild);

        // Assert
        Assert.assertEquals(2, treeBuilder.stack.size()); // doc, root (child and grandchild removed)
        Assert.assertEquals("root", treeBuilder.stack.get(treeBuilder.stack.size() - 1).nodeName());
    }

    @Test
    public void popStackToClose_givenNonExistentTag_shouldNotModifyStack() {
        // Arrange
        treeBuilder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.preserveCase);

        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("element", new org.jsoup.nodes.Attributes());
        treeBuilder.insert(startTag);

        int stackSizeBefore = treeBuilder.stack.size();

        Token.EndTag nonExistentEndTag = new Token.EndTag();
        nonExistentEndTag.name("nonExistent");

        // Act
        treeBuilder.process(nonExistentEndTag);

        // Assert
        Assert.assertEquals(stackSizeBefore, treeBuilder.stack.size());
    }

    @Test
    public void parseFragment_givenXmlFragment_shouldReturnParsedNodesList() {
        // Arrange
        String fragment = "<elem1 attr=\"1\">Text1</elem1><elem2>Text2</elem2>";
        ParseErrorList errors = ParseErrorList.tracking(10);
        ParseSettings settings = ParseSettings.preserveCase;

        // Act
        List<Node> nodes = treeBuilder.parseFragment(fragment, "http://example.com/", errors, settings);

        // Assert
        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());

        Node node1 = nodes.get(0);
        Assert.assertTrue(node1 instanceof Element);
        Element elem1 = (Element) node1;
        Assert.assertEquals("elem1", elem1.tagName());
        Assert.assertEquals("1", elem1.attr("attr"));
        Assert.assertEquals("Text1", elem1.text());

        Node node2 = nodes.get(1);
        Assert.assertTrue(node2 instanceof Element);
        Element elem2 = (Element) node2;
        Assert.assertEquals("elem2", elem2.tagName());
        Assert.assertEquals("Text2", elem2.text());
    }

    @Test
    public void parse_givenCasePreservingSettings_shouldPreserveTagAndAttributeCase() {
        // Arrange
        String xml = "<MixedCase TagAttr=\"Value\">Content</MixedCase>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Element elem = doc.child(0);
        Assert.assertEquals("MixedCase", elem.tagName());
        Assert.assertTrue(elem.hasAttr("TagAttr"));
        Assert.assertEquals("Value", elem.attr("TagAttr"));
    }

    @Test
    public void parse_givenEmptyXml_shouldReturnDocWithNoElements() {
        // Arrange
        String xml = "";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
    }

    @Test
    public void parse_givenCDataSectionInXml_shouldParseAsCDataNode() {
        // Arrange
        String xml = "<data><![CDATA[my <custom> data & symbols]]></data>";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Element dataElem = doc.child(0);
        Assert.assertEquals(1, dataElem.childNodes().size());
        Node child = dataElem.childNode(0);
        Assert.assertTrue(child instanceof CDataNode);
        Assert.assertEquals("my <custom> data & symbols", ((CDataNode) child).text());
    }

    @Test
    public void parse_givenNestedUnclosedTags_shouldMaintainStackHierarchy() {
        // Arrange
        String xml = "<a><b><c>leaf";

        // Act
        Document doc = treeBuilder.parse(xml, "http://example.com/");

        // Assert
        Assert.assertNotNull(doc);
        Element a = doc.select("a").first();
        Assert.assertNotNull(a);
        Element b = a.select("b").first();
        Assert.assertNotNull(b);
        Element c = b.select("c").first();
        Assert.assertNotNull(c);
        Assert.assertEquals("leaf", c.text());
    }
}