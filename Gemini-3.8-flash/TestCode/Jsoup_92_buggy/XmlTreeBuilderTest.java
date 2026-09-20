package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void defaultSettings_whenCalled_shouldPreserveCase() {
        ParseSettings settings = builder.defaultSettings();

        Assert.assertNotNull(settings);
        Assert.assertTrue(settings.preserveTagCase());
        Assert.assertTrue(settings.preserveAttributeCase());
    }

    @Test
    public void initialiseParse_givenReaderAndBaseUri_shouldConfigureXmlSyntaxAndDocOnStack() {
        Parser parser = new Parser(builder);
        StringReader reader = new StringReader("<root/>");
        String baseUri = "http://example.com/";

        builder.initialiseParse(reader, baseUri, parser);

        Assert.assertEquals(Document.OutputSettings.Syntax.xml, builder.doc.outputSettings().syntax());
        Assert.assertEquals(1, builder.stack.size());
        Assert.assertSame(builder.doc, builder.stack.get(0));
    }

    @Test
    public void parse_givenStringInput_shouldConstructXmlDocument() {
        String xml = "<root><child id=\"1\">Sample Text</child></root>";
        String baseUri = "http://example.com/";

        Document doc = builder.parse(xml, baseUri);

        Assert.assertNotNull(doc);
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        Element root = doc.child(0);
        Assert.assertEquals("root", root.tagName());
        Element child = root.child(0);
        Assert.assertEquals("child", child.tagName());
        Assert.assertEquals("1", child.attr("id"));
        Assert.assertEquals("Sample Text", child.text());
    }

    @Test
    public void parse_givenReaderInput_shouldConstructXmlDocument() {
        Reader reader = new StringReader("<catalog><book name=\"Java\"/></catalog>");
        String baseUri = "http://example.com/";

        Document doc = builder.parse(reader, baseUri);

        Assert.assertNotNull(doc);
        Assert.assertEquals(1, doc.children().size());
        Element catalog = doc.child(0);
        Assert.assertEquals("catalog", catalog.tagName());
        Assert.assertEquals(1, catalog.children().size());
        Element book = catalog.child(0);
        Assert.assertEquals("book", book.tagName());
        Assert.assertEquals("Java", book.attr("name"));
    }

    @Test
    public void insert_givenSelfClosingKnownTag_shouldNotForceUnknownSelfClosing() {
        String xml = "<br/>";
        Document doc = builder.parse(xml, "");

        Assert.assertEquals(1, doc.children().size());
        Element br = doc.child(0);
        Assert.assertEquals("br", br.tagName());
        Assert.assertTrue(br.tag().isKnownTag());
    }

    @Test
    public void insert_givenSelfClosingUnknownTag_shouldMarkTagSelfClosing() {
        String xml = "<custom-element/>";
        Document doc = builder.parse(xml, "");

        Assert.assertEquals(1, doc.children().size());
        Element el = doc.child(0);
        Assert.assertEquals("custom-element", el.tagName());
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void insert_givenStandardComment_shouldInsertCommentNode() {
        String xml = "<root><!-- This is a comment --></root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.childNodeSize());
        Node childNode = root.childNode(0);
        Assert.assertTrue(childNode instanceof Comment);
        Comment comment = (Comment) childNode;
        Assert.assertEquals(" This is a comment ", comment.getData());
    }

    @Test
    public void insert_givenValidBogusCommentAsXmlDeclaration_shouldInsertXmlDeclaration() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root/>";
        Document doc = builder.parse(xml, "");

        List childNodes = doc.childNodes();
        Assert.assertTrue(childNodes.size() >= 2);
        Node firstNode = (Node) childNodes.get(0);
        Assert.assertTrue(firstNode instanceof XmlDeclaration);
        XmlDeclaration decl = (XmlDeclaration) firstNode;
        Assert.assertEquals("xml", decl.name());
        Assert.assertEquals("1.0", decl.attr("version"));
        Assert.assertEquals("UTF-8", decl.attr("encoding"));
    }

    @Test
    public void insert_givenBogusCommentNotParseableAsXmlDeclaration_shouldRemainCommentNode() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.data.append("?!");

        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "", parser);
        builder.insert(commentToken);

        List childNodes = builder.doc.childNodes();
        Assert.assertEquals(1, childNodes.size());
        Node inserted = (Node) childNodes.get(0);
        Assert.assertTrue(inserted instanceof Comment);
        Assert.assertFalse(inserted instanceof XmlDeclaration);
        Assert.assertEquals("?!", ((Comment) inserted).getData());
    }

    @Test
    public void insert_givenCharacterData_shouldInsertTextNode() {
        String xml = "<root>Plain text content</root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.childNodeSize());
        Node node = root.childNode(0);
        Assert.assertTrue(node instanceof TextNode);
        Assert.assertEquals("Plain text content", ((TextNode) node).getWholeText());
    }

    @Test
    public void insert_givenCDataSection_shouldInsertCDataNode() {
        String xml = "<root><![CDATA[<unescaped & content>]]></root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.childNodeSize());
        Node node = root.childNode(0);
        Assert.assertTrue(node instanceof CDataNode);
        Assert.assertEquals("<unescaped & content>", ((CDataNode) node).getWholeText());
    }

    @Test
    public void insert_givenDoctype_shouldInsertDocumentTypeWithIdentifiers() {
        String xml = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><root/>";
        Document doc = builder.parse(xml, "");

        Node firstNode = (Node) doc.childNodes().get(0);
        Assert.assertTrue(firstNode instanceof DocumentType);
        DocumentType doctype = (DocumentType) firstNode;
        Assert.assertEquals("html", doctype.name());
        Assert.assertEquals("-//W3C//DTD XHTML 1.0 Strict//EN", doctype.publicId());
        Assert.assertEquals("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd", doctype.systemId());
    }

    @Test
    public void insert_givenDoctypeWithSystemKey_shouldRetainPubSysKey() {
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name.append("html");
        doctypeToken.publicIdentifier.append("pub-id");
        doctypeToken.systemIdentifier.append("sys-id");
        doctypeToken.pubSysKey = "SYSTEM";

        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "", parser);
        builder.insert(doctypeToken);

        DocumentType doctype = (DocumentType) builder.doc.childNode(0);
        Assert.assertEquals("html", doctype.name());
        Assert.assertEquals("pub-id", doctype.publicId());
        Assert.assertEquals("sys-id", doctype.systemId());
        Assert.assertEquals("SYSTEM", doctype.attr("pubSysKey"));
    }

    @Test
    public void popStackToClose_givenMatchingTag_shouldPopStackToClosedElement() {
        String xml = "<root><a><b>text</b></a></root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Element a = root.child(0);
        Assert.assertEquals("a", a.tagName());
        Element b = a.child(0);
        Assert.assertEquals("b", b.tagName());
        Assert.assertEquals("text", b.text());
    }

    @Test
    public void popStackToClose_givenUnmatchedEndTagOutOfOrder_shouldPopInterveningElements() {
        String xml = "<root><outer><inner>content</outer></root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Element outer = root.child(0);
        Assert.assertEquals("outer", outer.tagName());
        Element inner = outer.child(0);
        Assert.assertEquals("inner", inner.tagName());
        Assert.assertEquals("content", inner.text());
    }

    @Test
    public void popStackToClose_givenNonExistentEndTag_shouldSkipWithoutException() {
        String xml = "<root><child>value</child></orphan></root>";
        Document doc = builder.parse(xml, "");

        Element root = doc.child(0);
        Assert.assertEquals(1, root.children().size());
        Element child = root.child(0);
        Assert.assertEquals("child", child.tagName());
        Assert.assertEquals("value", child.text());
    }

    @Test
    public void process_givenEofToken_shouldReturnTrueWithoutModifyingStack() {
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader("<root/>"), "", parser);
        int initialStackSize = builder.stack.size();

        Token.EOF eofToken = new Token.EOF();
        boolean result = builder.process(eofToken);

        Assert.assertTrue(result);
        Assert.assertEquals(initialStackSize, builder.stack.size());
    }

    @Test
    public void process_givenAllTokenTypesExplicitly_shouldProcessSuccessfully() {
        Parser parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "", parser);

        Token.Doctype doctype = new Token.Doctype();
        doctype.name.append("html");
        Assert.assertTrue(builder.process(doctype));

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("item");
        Assert.assertTrue(builder.process(startTag));

        Token.Character character = new Token.Character();
        character.data("text value");
        Assert.assertTrue(builder.process(character));

        Token.Comment comment = new Token.Comment();
        comment.data.append("note");
        Assert.assertTrue(builder.process(comment));

        Token.EndTag endTag = new Token.EndTag();
        endTag.name("item");
        Assert.assertTrue(builder.process(endTag));

        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(builder.process(eof));

        Element item = builder.doc.getElementsByTag("item").first();
        Assert.assertNotNull(item);
        Assert.assertEquals("text value", item.text());
    }

    @Test
    public void parseFragment_givenXmlFragmentAndNoContext_shouldReturnChildNodes() {
        Parser parser = new Parser(builder);
        String fragment = "<one>First</one><two>Second</two>";

        List nodes = builder.parseFragment(fragment, "http://example.com/", parser);

        Assert.assertNotNull(nodes);
        Assert.assertEquals(2, nodes.size());
        Node first = (Node) nodes.get(0);
        Node second = (Node) nodes.get(1);
        Assert.assertTrue(first instanceof Element);
        Assert.assertTrue(second instanceof Element);
        Assert.assertEquals("one", ((Element) first).tagName());
        Assert.assertEquals("two", ((Element) second).tagName());
    }

    @Test
    public void parseFragment_givenXmlFragmentWithContext_shouldDelegateAndReturnChildNodes() {
        Parser parser = new Parser(builder);
        Element context = new Element(Tag.valueOf("dummy"), "");
        String fragment = "<part id=\"1\">Value</part>";

        List nodes = builder.parseFragment(fragment, context, "http://example.com/", parser);

        Assert.assertNotNull(nodes);
        Assert.assertEquals(1, nodes.size());
        Element part = (Element) nodes.get(0);
        Assert.assertEquals("part", part.tagName());
        Assert.assertEquals("1", part.attr("id"));
        Assert.assertEquals("Value", part.text());
    }

    @Test
    public void parse_givenEmptyString_shouldProduceValidEmptyXmlDocument() {
        Document doc = builder.parse("", "");

        Assert.assertNotNull(doc);
        Assert.assertEquals(0, doc.children().size());
        Assert.assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void parse_givenCaseSensitiveTagsAndAttributes_shouldPreserveCasing() {
        String xml = "<MyTag MyAttr=\"Val\">Content</MyTag>";
        Document doc = builder.parse(xml, "");

        Element myTag = doc.child(0);
        Assert.assertEquals("MyTag", myTag.tagName());
        Assert.assertTrue(myTag.hasAttr("MyAttr"));
        Assert.assertEquals("Val", myTag.attr("MyAttr"));
    }

    @Test
    public void parse_givenDeeplyNestedXml_shouldParseAndCloseAllLevelsProperly() {
        String xml = "<lvl1><lvl2><lvl3 attr=\"deep\">End</lvl3></lvl2></lvl1>";
        Document doc = builder.parse(xml, "");

        Element lvl1 = doc.child(0);
        Assert.assertEquals("lvl1", lvl1.tagName());
        Element lvl2 = lvl1.child(0);
        Assert.assertEquals("lvl2", lvl2.tagName());
        Element lvl3 = lvl2.child(0);
        Assert.assertEquals("lvl3", lvl3.tagName());
        Assert.assertEquals("deep", lvl3.attr("attr"));
        Assert.assertEquals("End", lvl3.text());
    }
}