package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder builder;
    private String baseUri;
    private ParseErrorList errors;
    private Parser parser;
    private Token.TokenQueue queue;
    private String input;
    private Document doc;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment commentToken;
    private Token.Character characterToken;
    private Token.Doctype doctypeToken;
    private Token tokenEof;

    @Before
    public void setUp() {
        baseUri = "http://example.com/";
        errors = new ParseErrorList(1, 1);
        builder = new XmlTreeBuilder();
        parser = new Parser(builder);
        builder.initialiseParse("", baseUri, errors);
        input = "<root><child>text</child></root>";
        builder.parse(input, baseUri);
        builder.finalise();
        stack = new ArrayList<Element>();
        // Initialize stack with document and some elements
        stack.add(new Element(Tag.valueOf("root"), baseUri));
        stack.add(new Element(Tag.valueOf("child"), baseUri));
        // Set the stack via reflection for test
        try {
            java.lang.reflect.Field stackField = XmlTreeBuilder.class.getDeclaredField("stack");
            stackField.setAccessible(true);
            stackField.set(builder, stack);
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }

    private List<Element> stack;

    private void setStack(XmlTreeBuilder b, List<Element> s) throws Exception {
        java.lang.reflect.Field f = XmlTreeBuilder.class.getDeclaredField("stack");
        f.setAccessible(true);
        f.set(b, s);
    }

    @After
    public void tearDown() {
        builder = null;
        baseUri = null;
        errors = null;
        parser = null;
        queue = null;
        input = null;
        doc = null;
        startTag = null;
        endTag = null;
        commentToken = null;
        characterToken = null;
        doctypeToken = null;
        tokenEof = null;
    }

    @Test
    public void testInitialiseParse() {
        builder.initialiseParse("<root/>", baseUri, errors);
        assertNotNull(builder.doc);
        assertEquals("", builder.doc.text());
        assertEquals(0, errors.size());
        // Check stack has document at top
        assertNotNull(builder.stack);
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testProcessStartTag() throws Exception {
        List<Element> stackList = new ArrayList<Element>();
        stackList.add(builder.doc);
        setStack(builder, stackList);
        Token token = Token.StartTag.create("newTag");
        token.asStartTag().attributes.put("attr", "val");
        assertTrue(builder.process(token));
        // After processing, new element should be on stack
        assertEquals(2, builder.stack.size());
        Element added = builder.stack.get(builder.stack.size()-1);
        assertEquals("newTag", added.tagName());
        assertEquals(1, added.attributes().size());
    }

    @Test
    public void testProcessEndTag() {
        // Setup: stack with document, then child element
        // process end tag for child
        Token endToken = Token.EndTag.create("child");
        assertTrue(builder.process(endToken));
        // After popping, stack should have only document
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testProcessComment() {
        Token comment = Token.Comment.create("comment data");
        assertTrue(builder.process(comment));
        // After processing, document should have comment child
        assertEquals(1, builder.doc.childNodeSize());
        Node node = builder.doc.childNode(0);
        assertTrue(node instanceof Comment);
        assertEquals("comment data", ((Comment)node).getData());
    }

    @Test
    public void testProcessCharacter() {
        Token charToken = Token.Character.create("hello");
        assertTrue(builder.process(charToken));
        // After processing, document should have text node
        assertEquals(1, builder.doc.childNodeSize());
        Node node = builder.doc.childNode(0);
        assertTrue(node instanceof TextNode);
        assertEquals("hello", ((TextNode)node).text());
    }

    @Test
    public void testProcessDoctype() {
        Token docType = Token.Doctype.create("html", "public", "system");
        assertTrue(builder.process(docType));
        // After processing, document should have doctype node
        assertEquals(1, builder.doc.childNodeSize());
        Node node = builder.doc.childNode(0);
        assertTrue(node instanceof DocumentType);
        DocumentType dt = (DocumentType) node;
        assertEquals("html", dt.name());
        assertEquals("public", dt.publicId());
        assertEquals("system", dt.systemId());
    }

    @Test
    public void testProcessEof() {
        Token eof = Token.EOF.create();
        assertTrue(builder.process(eof));
    }

    @Test(expected = ValidateException.class)
    public void testProcessInvalidToken() {
        Token unknown = new Token();
        unknown.type = Token.Type.Unknown;
        builder.process(unknown);
    }

    @Test
    public void testInsertStartTagSelfClosing() throws Exception {
        List<Element> stackList = new ArrayList<Element>();
        stackList.add(builder.doc);
        setStack(builder, stackList);
        Token.StartTag start = Token.StartTag.create("selfClose");
        start.isSelfClosing(true);
        Element result = builder.insert(start);
        assertNotNull(result);
        assertEquals("selfClose", result.tagName());
        assertEquals(0, result.children().size());
        // Tokeniser's acknowledgeSelfClosingFlag should be called - need to mock tokeniser
        // We can't easily test tokeniser call, but element should be self-closing
        assertTrue(result.tag().isSelfClosing());
    }

    @Test
    public void testInsertCommentToken() {
        Token.Comment comment = Token.Comment.create("data");
        builder.insert(comment);
        assertEquals(1, builder.stack.get(builder.stack.size()-1).childNodeSize());
        Node node = builder.stack.get(builder.stack.size()-1).childNode(0);
        assertTrue(node instanceof Comment);
        assertEquals("data", ((Comment)node).getData());
    }

    @Test
    public void testInsertCharacterToken() {
        Token.Character charToken = Token.Character.create("text");
        builder.insert(charToken);
        Element current = builder.stack.get(builder.stack.size()-1);
        assertEquals(1, current.childNodeSize());
        Node node = current.childNode(0);
        assertTrue(node instanceof TextNode);
        assertEquals("text", ((TextNode)node).text());
    }

    @Test
    public void testInsertDoctypeToken() {
        Token.Doctype docType = Token.Doctype.create("html", "public", "system");
        builder.insert(docType);
        Element current = builder.stack.get(builder.stack.size()-1);
        assertEquals(1, current.childNodeSize());
        Node node = current.childNode(0);
        assertTrue(node instanceof DocumentType);
        DocumentType dt = (DocumentType) node;
        assertEquals("html", dt.name());
        assertEquals("public", dt.publicId());
        assertEquals("system", dt.systemId());
    }

    @Test
    public void testPopStackToCloseFound() {
        // Setup stack: doc -> root -> child -> child2
        // We'll just test with existing stack from setUp
        builder.popStackToClose(Token.EndTag.create("child"));
        // After popping, stack should have only doc and root
        assertEquals(2, builder.stack.size());
        assertEquals("child", builder.stack.get(builder.stack.size()-1).tagName());
    }

    @Test
    public void testPopStackToCloseNotFound() {
        builder.popStackToClose(Token.EndTag.create("notThere"));
        // Stack should be unchanged since not found
        assertEquals(2, builder.stack.size());
    }

    @Test
    public void testPopStackToCloseMultiple() throws Exception {
        // Setup stack with more elements
        List<Element> s = new ArrayList<Element>();
        s.add(builder.doc);
        s.add(new Element(Tag.valueOf("a"), baseUri));
        s.add(new Element(Tag.valueOf("b"), baseUri));
        s.add(new Element(Tag.valueOf("c"), baseUri));
        setStack(builder, s);
        builder.popStackToClose(Token.EndTag.create("b"));
        // After popping, a and b should be removed
        assertEquals(2, builder.stack.size());
        assertEquals("c", builder.stack.get(1).tagName());
    }

    @Test
    public void testInsertNode() throws Exception {
        Element el = new Element(Tag.valueOf("test"), baseUri);
        builder.insertNode(el);
        Element current = builder.stack.get(builder.stack.size()-1);
        assertTrue(current.children().contains(el));
    }

    @Test
    public void testParseRealistic() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root><child name=\"value\">text</child><!-- comment --></root>";
        Document doc = Parser.parse(xml, baseUri);
        assertNotNull(doc);
        assertEquals("text", doc.select("child").first().text());
        assertTrue(doc.children().size() > 0);
        Element root = doc.child(0);
        assertEquals("root", root.tagName());
        assertEquals(1, root.children().size());
        Element child = root.child(0);
        assertEquals("child", child.tagName());
        assertEquals("value", child.attr("name"));
        assertEquals("text", child.text());
        assertEquals(1, root.childNodes().size() - root.children().size() - 1); // comment node
    }

    @Test
    public void testParseEmpty() {
        String xml = "";
        try {
            Document doc = Parser.parse(xml, baseUri);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testParseSingleTag() {
        String xml = "<tag/>";
        Document doc = Parser.parse(xml, baseUri);
        assertNotNull(doc);
        Element el = doc.child(0);
        assertEquals("tag", el.tagName());
        assertEquals(0, el.childNodeSize());
    }
}