package org.jsoup.parser;

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

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    @Test
    public void defaultSettingsReturnsPreserveCase() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertSame(ParseSettings.preserveCase, builder.defaultSettings());
    }

    @Test
    public void parseReaderOverloadWorks() {
        Document doc = new XmlTreeBuilder().parse(new StringReader("<root/>"), "http://example.com/");
        assertEquals("root", doc.child(0).nodeName());
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void parseStringPreservesCaseAndStructure() {
        Document doc = new XmlTreeBuilder().parse("<Root><Child attr=\"val\">Text</Child></Root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals("Root", root.nodeName());
        assertEquals("Child", root.child(0).nodeName());
        assertEquals("Text", root.child(0).text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void parseEmptyInputReturnsNoChildren() {
        Document doc = new XmlTreeBuilder().parse("", "http://example.com/");
        assertEquals(0, doc.childNodes().size());
    }

    @Test(expected = NullPointerException.class)
    public void parseNullReaderThrows() {
        new XmlTreeBuilder().parse((Reader) null, "http://example.com/");
    }

    @Test
    public void parseSpecialNodeTypes() {
        Document doc = new XmlTreeBuilder().parse(
                "<?xml version=\"1.0\"?><!DOCTYPE root><root><!--a--><![CDATA[b]]></root>",
                "http://example.com/");

        assertTrue(doc.childNode(0) instanceof XmlDeclaration);
        assertTrue(doc.childNode(1) instanceof DocumentType);

        Element root = (Element) doc.childNode(2);
        assertTrue(root.childNode(0) instanceof Comment);
        assertTrue(root.childNode(1) instanceof CDataNode);
        assertEquals("b", ((TextNode) root.childNode(1)).getWholeText());
    }

    @Test
    public void parseSelfClosingUnknownTagMarksTagSelfClosing() {
        Document doc = new XmlTreeBuilder().parse("<root><unknown/></root>", "http://example.com/");
        Element root = doc.child(0);
        Element unknown = root.child(0);
        assertTrue(unknown.tag().isSelfClosing());
    }

    @Test
    public void parseUnmatchedEndTagIsIgnored() {
        Document doc = new XmlTreeBuilder().parse("<root></missing></root>", "http://example.com/");
        Element root = doc.child(0);
        assertEquals("root", root.nodeName());
        assertEquals(0, root.childNodes().size());
    }

    @Test
    public void parseEndTagClosesMultipleOpenElements() {
        Document doc = new XmlTreeBuilder().parse("<a><b><c></a>", "http://example.com/");
        Element a = doc.child(0);
        assertEquals("b", a.child(0).nodeName());
        assertEquals("c", a.child(0).child(0).nodeName());
    }

    @Test
    public void parseFragmentReturnsChildNodes() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<one/><two>text</two>", "http://example.com/", new Parser(builder));
        assertEquals(2, nodes.size());
        assertEquals("one", nodes.get(0).nodeName());
        assertEquals("two", nodes.get(1).nodeName());
        assertEquals("text", ((Element) nodes.get(1)).text());
    }
}