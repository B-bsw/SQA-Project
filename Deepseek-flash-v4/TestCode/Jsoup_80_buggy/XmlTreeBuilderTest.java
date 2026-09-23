package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Before;
import org.junit.Test;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder tb;

    @Before
    public void setUp() {
        tb = new XmlTreeBuilder();
    }

    @Test
    public void defaultSettingsPreservesCase() {
        assertSame(ParseSettings.preserveCase, tb.defaultSettings());
    }

    @Test
    public void parseStringPreservesTagAndAttributeCase() {
        Document doc = tb.parse("<Root MyAttr='Val'></Root>", "");
        Element root = doc.child(0);
        assertEquals("Root", root.tagName());
        assertEquals("Val", root.attr("MyAttr"));
    }

    @Test
    public void parseReaderUsesXmlSyntax() {
        Document doc = tb.parse(new StringReader("<root/>"), "http://example.com/");
        assertNotNull(doc);
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals("root", doc.child(0).tagName());
    }

    @Test
    public void emptyInputHasNoChildren() {
        Document doc = tb.parse("", "");
        assertNotNull(doc);
        assertEquals(0, doc.childNodes().size());
    }

    @Test(expected = NullPointerException.class)
    public void parseNullStringThrowsNullPointerException() {
        tb.parse((String) null, "");
    }

    @Test
    public void insertsComment() {
        Document doc = tb.parse("<root><!--abc--></root>", "");
        Node comment = doc.child(0).childNode(0);
        assertTrue(comment instanceof Comment);
        assertEquals("abc", ((Comment) comment).getData());
    }

    @Test
    public void insertsBogusDeclarationAsXmlDeclaration() {
        Document doc = tb.parse("<?xml version=\"1.0\"?><root/>", "");
        Node first = doc.childNode(0);
        assertTrue(first instanceof XmlDeclaration);
        assertTrue(first.outerHtml().startsWith("<?xml"));
    }

    @Test
    public void insertsCData() {
        Document doc = tb.parse("<root><![CDATA[<not-tag>]]></root>", "");
        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof CDataNode);
        assertEquals("<not-tag>", ((CDataNode) node).getWholeText());
    }

    @Test
    public void insertsTextAndDecodesEntities() {
        Document doc = tb.parse("<root>hello &amp; world</root>", "");
        Node node = doc.child(0).childNode(0);
        assertTrue(node instanceof TextNode);
        assertEquals("hello & world", ((TextNode) node).getData());
    }

    @Test
    public void insertsDoctype() {
        Document doc = tb.parse("<!DOCTYPE root PUBLIC \"pub\" \"sys\"><root/>", "");
        Node doctype = doc.childNode(0);
        assertTrue(doctype instanceof DocumentType);
        assertTrue(doctype.outerHtml().contains("DOCTYPE root PUBLIC"));
    }

    @Test
    public void nestedEndTagsCloseUntilMatchingElement() {
        Document doc = tb.parse("<a><b><c></c></b></a>", "");
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals("b", a.child(0).tagName());
        assertEquals("c", a.child(0).child(0).tagName());
    }

    @Test
    public void endTagWithoutMatchIsSkipped() {
        Document doc = tb.parse("<a></b></a>", "");
        Element a = doc.child(0);
        assertEquals("a", a.tagName());
        assertEquals(0, a.childNodes().size());
    }

    @Test
    public void selfClosingStartTagDoesNotAddToStack() {
        Document doc = tb.parse("<root><empty/><child>text</child></root>", "");
        Element root = doc.child(0);
        assertEquals(2, root.childNodes().size());
        assertEquals("empty", root.child(0).tagName());
        assertEquals("child", root.child(1).tagName());
    }

    @Test
    public void parseFragmentReturnsTopLevelNodes() {
        List<Node> nodes = tb.parseFragment(
                "<one/><two/>", "http://example.com", ParseErrorList.noTracking(), ParseSettings.preserveCase);
        assertEquals(2, nodes.size());
        assertEquals("one", nodes.get(0).nodeName());
        assertEquals("two", nodes.get(1).nodeName());
    }
}