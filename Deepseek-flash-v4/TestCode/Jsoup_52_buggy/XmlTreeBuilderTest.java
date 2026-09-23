package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class XmlTreeBuilderTest {

    private XmlTreeBuilder builder;
    private Token.TokenType tokenType;
    private Token.StartTag startTag;
    private Token.EndTag endTag;
    private Token.Comment commentToken;
    private Token.Character characterToken;
    private Token.Doctype doctypeToken;
    private Token.EOF eofToken;
    private Token token;
    private Nodes.Document doc;
    private Nodes.Element element;
    private Nodes.Comment comment;
    private Nodes.TextNode textNode;
    private Nodes.DocumentType documentType;
    private Nodes.XmlDeclaration xmlDeclaration;
    private List<Node> nodes;
    private ParseErrorList errors;
    private String baseUri;

    @Before
    public void setUp() {
        builder = new XmlTreeBuilder();
        errors = new ParseErrorList(10, 10);
        baseUri = "http://example.com/";
        doc = new Document(baseUri);
        element = new Element(Tag.valueOf("div"), baseUri);
        comment = new Comment("test");
        textNode = new TextNode("text", baseUri);
        documentType = new DocumentType("html", null, null, baseUri);
        xmlDeclaration = new XmlDeclaration("xml version=\"1.0\"", baseUri, false);
        nodes = new java.util.ArrayList<>();
    }

    @After
    public void tearDown() {
        builder = null;
        doc = null;
        element = null;
        comment = null;
        textNode = null;
        documentType = null;
        xmlDeclaration = null;
        nodes = null;
        errors = null;
        baseUri = null;
        tokenType = null;
        token = null;
    }

    @Test
    public void testProcess_StartTag() {
        startTag = Token.StartTag.valueOf("div");
        startTag.attributes = new Attributes();
        builder.insert(startTag);
        assertEquals(1, builder.stack.size());
        assertEquals("div", builder.stack.get(0).nodeName());
    }

    @Test
    public void testProcess_EndTag() {
        builder.stack.add(new Element(Tag.valueOf("div"), baseUri));
        endTag = Token.EndTag.valueOf("div");
        builder.popStackToClose(endTag);
        assertTrue(builder.stack.isEmpty());
    }

    @Test
    public void testProcess_Comment() {
        commentToken = new Token.Comment();
        commentToken.setData("test");
        builder.insert(commentToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof Comment);
    }

    @Test
    public void testProcess_Character() {
        characterToken = new Token.Character();
        characterToken.setData("text");
        builder.insert(characterToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof TextNode);
    }

    @Test
    public void testProcess_Doctype() {
        doctypeToken = new Token.Doctype();
        doctypeToken.setName("html");
        builder.insert(doctypeToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof DocumentType);
    }

    @Test
    public void testProcess_EOF() {
        eofToken = new Token.EOF();
        builder.process(eofToken);
        assertTrue(builder.stack.isEmpty());
    }

    @Test
    public void testInsert_StartTag_SelfClosing() {
        startTag = Token.StartTag.valueOf("br");
        startTag.attributes = new Attributes();
        startTag.selfClosing = true;
        builder.insert(startTag);
        assertEquals(0, builder.stack.size());
        assertEquals(1, builder.stack.size());
        assertFalse(builder.stack.isEmpty());
    }

    @Test
    public void testInsert_Comment_Bogus() {
        commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.setData("?xml version=\"1.0\"?");
        builder.insert(commentToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof XmlDeclaration);
    }

    @Test
    public void testInsert_Character() {
        characterToken = new Token.Character();
        characterToken.setData("text");
        builder.insert(characterToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof TextNode);
    }

    @Test
    public void testInsert_Doctype() {
        doctypeToken = new Token.Doctype();
        doctypeToken.setName("html");
        builder.insert(doctypeToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof DocumentType);
    }

    @Test
    public void testPopStackToClose_NotFound() {
        builder.stack.add(new Element(Tag.valueOf("div"), baseUri));
        endTag = Token.EndTag.valueOf("span");
        builder.popStackToClose(endTag);
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testPopStackToClose_Found() {
        Element first = new Element(Tag.valueOf("div"), baseUri);
        Element second = new Element(Tag.valueOf("span"), baseUri);
        builder.stack.add(first);
        builder.stack.add(second);
        endTag = Token.EndTag.valueOf("span");
        builder.popStackToClose(endTag);
        assertEquals(1, builder.stack.size());
        assertSame(first, builder.stack.get(0));
    }

    @Test
    public void testParseFragment() {
        String input = "<root><child/></root>";
        List<Node> result = builder.parseFragment(input, baseUri, errors);
        assertEquals(1, result.size());
        assertEquals("root", result.get(0).nodeName());
    }

    @Test
    public void testProcess_Default() {
        token = new Token() {
            @Override
            public TokenType type() {
                return null;
            }
        };
        try {
            builder.process(token);
            fail("Expected Validate.fail to throw");
        } catch (Validate.WrongTypeException e) {
            // expected
        }
    }

    @Test
    public void testInsertNode_SideEffect() {
        Node node = new TextNode("text", baseUri);
        builder.insertNode(node);
        assertEquals(1, builder.currentElement().childNodeSize());
        assertTrue(builder.currentElement().childNode(0) instanceof TextNode);
    }

    @Test
    public void testInitialiseParse() {
        builder.initialiseParse("<root/>", baseUri, errors);
        assertEquals(1, builder.stack.size());
        assertSame(builder.doc, builder.stack.get(0));
    }

    @Test
    public void testBogusComment_IgnoresBogusWhenInvalid() {
        commentToken = new Token.Comment();
        commentToken.bogus = true;
        commentToken.setData("!test");
        builder.insert(commentToken);
        assertEquals(1, builder.stack.size());
        assertTrue(builder.stack.get(0).childNode(0) instanceof Comment);
    }

    @Test
    public void testSelfClosingTag_UnknownTag() {
        startTag = Token.StartTag.valueOf("foo");
        startTag.selfClosing = true;
        startTag.attributes = new Attributes();
        builder.insert(startTag);
        assertEquals(0, builder.stack.size());
        assertTrue(builder.stack.isEmpty());
    }

    @Test
    public void testNestedElements() {
        builder.insert(new Token.StartTag("div"));
        builder.insert(new Token.StartTag("span"));
        assertEquals(2, builder.stack.size());
        assertEquals("span", builder.stack.get(1).nodeName());
    }

    @Test
    public void testPopStackToClose_RemovesIntermediateElements() {
        builder.insert(new Token.StartTag("div"));
        builder.insert(new Token.StartTag("span"));
        builder.insert(new Token.StartTag("p"));
        endTag = Token.EndTag.valueOf("div");
        builder.popStackToClose(endTag);
        assertEquals(0, builder.stack.size());
    }

    @Test
    public void testProcessReturnTrue() {
        assertTrue(builder.process(new Token.StartTag("div")));
        assertTrue(builder.process(new Token.EndTag("div")));
        assertTrue(builder.process(new Token.Comment("test")));
        assertTrue(builder.process(new Token.Character("text")));
        assertTrue(builder.process(new Token.Doctype("html")));
        assertTrue(builder.process(new Token.EOF()));
    }

    @Test
    public void testProcessAllTokenTypes() {
        assertTrue(builder.process(new Token.StartTag("a")));
        assertTrue(builder.process(new Token.EndTag("a")));
        assertTrue(builder.process(new Token.Comment("comment")));
        assertTrue(builder.process(new Token.Character("char")));
        assertTrue(builder.process(new Token.Doctype("doc")));
        assertTrue(builder.process(new Token.EOF()));
    }
}