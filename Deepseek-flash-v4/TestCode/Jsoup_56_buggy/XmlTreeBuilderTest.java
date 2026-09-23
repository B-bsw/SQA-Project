package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private String baseUri = "http://example.com/";

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
    }

    @Test
    public void testDefaultSettingsPreserveCase() {
        assertSame(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void testParseBasicXml() {
        String input = "<root><child>text</child></root>";
        Document doc = builder.parse(input, baseUri);
        assertNotNull(doc);
        assertEquals("root", doc.child(0).tagName());
        assertEquals("child", doc.child(0).child(0).tagName());
        assertEquals("text", doc.child(0).child(0).text());
    }

    @Test
    public void testParseSelfClosingTag() {
        String input = "<root><empty/><element/></root>";
        Document doc = builder.parse(input, baseUri);
        assertEquals(2, doc.child(0).childNodes().size());
        assertTrue(doc.child(0).child(0).tag().isSelfClosing());
        assertTrue(doc.child(0).child(1).tag().isSelfClosing());
    }

    @Test
    public void testParseFragment() {
        String fragment = "<child>content</child>";
        List<Node> nodes = builder.parseFragment(fragment, baseUri, ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(1, nodes.size());
        assertEquals("child", nodes.get(0).nodeName());
        assertEquals("content", nodes.get(0).childNode(0).toString());
    }

    @Test
    public void testInsertCommentNormal() {
        Token.Comment c = Token.Comment.create("my comment", baseUri);
        builder.insert(c);
        Document doc = builder.doc;
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals("my comment", doc.childNode(0).nodeName());
    }

    @Test
    public void testInsertBogusCommentAsXmlDeclaration() {
        String data = "?xml version=\"1.0\"?";
        Token.Comment c = Token.Comment.bogus(data, baseUri);
        builder.insert(c);
        Document doc = builder.doc;
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        XmlDeclaration declaration = (XmlDeclaration) doc.childNode(0);
        assertTrue(declaration.isXmlDeclaration());
        assertFalse(declaration.name().contains("?"));
        assertFalse(declaration.name().equals("xml"));
        assertNotNull(declaration.attributes().get("version"));
    }

    @Test
    public void testInsertBogusCommentNotDeclaration() {
        String data = "some data";
        Token.Comment c = Token.Comment.bogus(data, baseUri);
        builder.insert(c);
        Document doc = builder.doc;
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);
        assertEquals(data, ((Comment) doc.childNode(0)).getData());
    }

    @Test
    public void testInsertCharacter() {
        Token.Character charTok = Token.Character.create("Hello", baseUri);
        builder.insert(charTok);
        Document doc = builder.doc;
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof TextNode);
        assertEquals("Hello", ((TextNode) doc.childNode(0)).getWholeText());
    }

    @Test
    public void testInsertDoctype() {
        Token.Doctype doctypeToken = Token.Doctype.create("html", "publicId", "systemId", baseUri);
        builder.insert(doctypeToken);
        Document doc = builder.doc;
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof DocumentType);
        assertEquals("html", ((DocumentType) doc.childNode(0)).nodeName());
        assertEquals("publicId", ((DocumentType) doc.childNode(0)).attr("PUBLIC"));
        assertEquals("systemId", ((DocumentType) doc.childNode(0)).attr("SYSTEM"));
    }

    @Test
    public void testInsertStartTagWithChild() {
        Token.StartTag startTag = Token.StartTag.create("parent", baseUri);
        builder.insert(startTag);
        Element parent = builder.currentElement();
        assertNotNull(parent);
        assertEquals("parent", parent.tagName());
        assertTrue(builder.stack.contains(parent));
        assertEquals(builder.stack.get(builder.stack.size() - 1), parent);
    }

    @Test
    public void testInsertStartTagSelfClosing() {
        Token.StartTag startTag = Token.StartTag.create("selfClosing", baseUri);
        startTag.attributes().put("attr", "val");
        startTag.selfClosing(true);
        builder.insert(startTag);
        Element el = builder.currentElement();
        assertNotNull(el);
        assertTrue(el.tag().isSelfClosing());
        assertFalse(builder.stack.contains(el));
        assertEquals("val", el.attr("attr"));
    }

    @Test
    public void testProcessEndTagEmbedded() {
        builder.parse("<root><child></child></root>", baseUri);
        Document doc = builder.doc;
        Element root = doc.child(0);
        assertEquals(1, root.childNodeSize());
        assertEquals(0, root.childNode(0).childNodeSize());
    }

    @Test
    public void testProcessEndTagNotFound() {
        builder.parse("<root><child></other></child></root>", baseUri);
        Document doc = builder.doc;
        assertEquals(1, doc.child(0).childNodeSize());
        assertEquals("child", doc.child(0).child(0).nodeName());
    }

    @Test
    public void testParseUnknownSelfClosingTag() {
        String input = "<custom>text</custom>";
        Document doc = builder.parse(input, baseUri);
        Element custom = doc.child(0);
        assertEquals("custom", custom.tagName());
        assertFalse(custom.tag().isSelfClosing());
        assertEquals("text", custom.text());
    }

    @Test
    public void testProcessUnhandledTokenType() {
        Token token = Token.EOF.create();
        try {
            builder.process(token);
        } catch (Exception e) {
            fail("Should not throw for EOF token");
        }
    }

    @Test
    public void testProcessDoctype() {
        Token.Doctype doctype = Token.Doctype.create("html", "public", "system", baseUri);
        builder.process(doctype);
        assertEquals(1, builder.doc.childNodeSize());
        assertTrue(builder.doc.childNode(0) instanceof DocumentType);
    }

    @Test
    public void testProcessComment() {
        Token.Comment comment = Token.Comment.create("hello", baseUri);
        builder.process(comment);
        assertEquals(1, builder.doc.childNodeSize());
        assertTrue(builder.doc.childNode(0) instanceof Comment);
    }

    @Test
    public void testProcessCharacter() {
        Token.Character charToken = Token.Character.create("data", baseUri);
        builder.process(charToken);
        assertEquals(1, builder.doc.childNodeSize());
        assertTrue(builder.doc.childNode(0) instanceof TextNode);
    }

    @Test
    public void testPopStackToCloseMatching() {
        builder.parse("<root><child></child></root>", baseUri);
        Element root = builder.doc.child(0);
        assertEquals(0, root.child(0).childNodeSize());
        assertEquals(0, builder.stack.size());
    }

    @Test
    public void testPopStackToCloseNonMatching() {
        builder.parse("<root><child><other></root>", baseUri);
        Element root = builder.doc.child(0);
        Element child = root.child(0);
        assertEquals(1, child.childNodeSize());
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testNormaliseAttributes() {
        String input = "<root><child a='1' b='2'/></root>";
        Document doc = builder.parse(input, baseUri);
        Element child = doc.child(0).child(0);
        assertEquals(2, child.attributes().size());
        assertEquals("1", child.attr("a"));
        assertEquals("2", child.attr("b"));
    }

    @Test
    public void testNestedElements() {
        String input = "<root><a><b><c>deep</c></b></a></root>";
        Document doc = builder.parse(input, baseUri);
        assertEquals("c", doc.child(0).child(0).child(0).child(0).tagName());
        assertEquals("deep", doc.child(0).child(0).child(0).child(0).text());
    }

    @Test
    public void testMultipleParses() {
        String input1 = "<xml1/>";
        String input2 = "<xml2/>";
        Document doc1 = builder.parse(input1, baseUri);
        Document doc2 = builder.parse(input2, baseUri);
        assertNotSame(doc1, doc2);
        assertEquals("xml1", doc1.child(0).tagName());
        assertEquals("xml2", doc2.child(0).tagName());
    }
}