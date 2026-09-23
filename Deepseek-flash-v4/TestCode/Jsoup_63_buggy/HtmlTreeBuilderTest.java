package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private Document doc;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        doc = new Document("http://example.com");
        builder.doc = doc;
        builder.settings = ParseSettings.htmlDefault;
        builder.tokeniser = new Tokeniser(new StringReader(""), ParseErrorList.noTracking());
        builder.errors = new ParseErrorList(16, 16);
        builder.stack = new ArrayList<>();
        builder.pos = 0;
        builder.baseUri = "http://example.com";
    }

    @After
    public void tearDown() {
        builder = null;
        doc = null;
    }

    @Test
    public void testDefaultSettings() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void testPopEmptyStack() {
        assertNull(builder.pop());
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPushAndPop() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertEquals(1, builder.getStack().size());
        assertSame(el, builder.pop());
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testGetStackEmpty() {
        assertNotNull(builder.getStack());
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testOnStackNullElement() {
        assertFalse(builder.onStack(null));
    }

    @Test
    public void testOnStackElementNotOnStack() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testOnStackElementOnStack() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testGetFromStackEmpty() {
        assertNull(builder.getFromStack("div"));
    }

    @Test
    public void testGetFromStackNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertNull(builder.getFromStack("span"));
    }

    @Test
    public void testGetFromStackFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertSame(el, builder.getFromStack("div"));
    }

    @Test
    public void testRemoveFromStackEmpty() {
        assertFalse(builder.removeFromStack(new Element(Tag.valueOf("div"), "http://example.com")));
    }

    @Test
    public void testRemoveFromStackNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertFalse(builder.removeFromStack(new Element(Tag.valueOf("span"), "http://example.com")));
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testRemoveFromStackFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        assertTrue(builder.removeFromStack(el));
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPopStackToCloseEmptyStack() {
        builder.popStackToClose("div");
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPopStackToCloseNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        builder.popStackToClose("span");
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testPopStackToCloseFoundSingle() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        builder.popStackToClose("div");
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPopStackToCloseMultiple() {
        Element div1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element div2 = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        builder.push(span);
        builder.push(div1);
        builder.push(div2);
        builder.popStackToClose("div");
        assertEquals(1, builder.getStack().size());
        assertSame(span, builder.getStack().get(0));
    }

    @Test
    public void testPopStackToCloseWithVarargsEmpty() {
        builder.popStackToClose();
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPopStackToBeforeEmptyStack() {
        builder.popStackToBefore("div");
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testPopStackToBeforeNotFound() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(el);
        builder.popStackToBefore("span");
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testPopStackToBeforeFound() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        builder.push(div);
        builder.push(span);
        builder.popStackToBefore("span");
        assertEquals(1, builder.getStack().size());
        assertSame(div, builder.getStack().get(0));
    }

    @Test
    public void testInsertStartTagBasic() {
        Element el = builder.insertStartTag("div");
        assertNotNull(el);
        assertEquals("div", el.nodeName());
    }

    @Test
    public void testInsertStartTagWithAttributes() {
        Token.StartTag startTag = new Token.StartTag("div");
        startTag.attributes.put("class", "test");
        Element el = builder.insertStartTag(startTag);
        assertNotNull(el);
        assertEquals("div", el.nodeName());
        assertEquals("test", el.attr("class"));
    }

    @Test
    public void testInsertCommentBasic() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        builder.insert(commentToken);
        assertEquals(1, doc.childNodesSize());
        assertTrue(doc.childNode(0) instanceof Comment);
    }

    @Test
    public void testInsertCharacterTextNode() {
        builder.stack.add(new Element(Tag.valueOf("div"), "http://example.com"));
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        builder.insert(charToken);
        Element div = builder.getFromStack("div");
        assertNotNull(div);
        assertEquals(1, div.childNodesSize());
        assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test
    public void testInsertCharacterDataNode() {
        builder.stack.add(new Element(Tag.valueOf("script"), "http://example.com"));
        Token.Character charToken = new Token.Character();
        charToken.data("var x = 1;");
        builder.insert(charToken);
        Element script = builder.getFromStack("script");
        assertNotNull(script);
        assertEquals(1, script.childNodesSize());
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testPopStackEmpty() {
        assertNull(builder.pop());
    }

    @Test
    public void testFramesetOkDefault() {
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testFramesetOkSetFalse() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testGetDocumentNull() {
        assertNull(builder.getDocument());
    }

    @Test
    public void testGetDocumentNonNull() {
        builder.doc = doc;
        assertSame(doc, builder.getDocument());
    }

    @Test
    public void testGetBaseUriInitial() {
        assertEquals("http://example.com", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriNoHref() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com");
        builder.maybeSetBaseUri(base);
        assertFalse(builder.baseUriSetFromDoc);
        assertEquals("http://example.com", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriWithHref() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com");
        base.attr("href", "/path");
        builder.maybeSetBaseUri(base);
        assertTrue(builder.baseUriSetFromDoc);
        assertTrue(builder.getBaseUri().endsWith("/path"));
    }

    @Test
    public void testIsFragmentParsingDefault() {
        assertFalse(builder.isFragmentParsing());
    }

    @Test
    public void testInsertFormElement() {
        Token.StartTag startTag = new Token.StartTag("form");
        FormElement form = builder.insertForm(startTag, true);
        assertNotNull(form);
        assertEquals("form", form.nodeName());
    }

    @Test
    public void testTransitionState() {
        builder.transition(HtmlTreeBuilderState.AfterAfterBody);
        assertEquals(HtmlTreeBuilderState.AfterAfterBody, builder.state());
    }

    @Test
    public void testMarkInsertionMode() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void testErrorCanAddError() {
        builder.errors = new ParseErrorList(1, 1);
        builder.error(HtmlTreeBuilderState.InBody);
        assertEquals(1, builder.errors.size());
    }

    @Test
    public void testErrorCannotAddError() {
        builder.errors = new ParseErrorList(0, 0);
        builder.error(HtmlTreeBuilderState.InBody);
        assertEquals(0, builder.errors.size());
    }

    @Test
    public void testInsertNodeElementOnStackEmpty() {
        Node node = new Element(Tag.valueOf("div"), "http://example.com");
        builder.insertNode(node);
        assertEquals(1, doc.childNodesSize());
    }

    @Test
    public void testInsertNodeElementOnStackNonEmpty() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        builder.push(div);
        Node node = new Element(Tag.valueOf("span"), "http://example.com");
        builder.insertNode(node);
        assertEquals(1, div.childNodesSize());
    }

    @Test
    public void testInsertNodeWithFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", null);
        builder.formElement = form;
        builder.push(new Element(Tag.valueOf("div"), "http://example.com"));
        Node node = new Element(Tag.valueOf("input"), "http://example.com");
        builder.insertNode(node);
        assertEquals(1, form.elements().size());
    }

    @Test
    public void testClearStackToTableContextEmptyStack() {
        builder.clearStackToTableContext();
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testClearStackToTableBodyContextEmptyStack() {
        builder.clearStackToTableBodyContext();
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testClearStackToTableRowContextEmptyStack() {
        builder.clearStackToTableRowContext();
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testReplaceOnStackEmptyQueue() {
        Element out = new Element(Tag.valueOf("div"), "http://example.com");
        Element in = new Element(Tag.valueOf("span"), "http://example.com");
        builder.replaceOnStack(out, in);
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testReplaceOnStackNotFound() {
        Element out = new Element(Tag.valueOf("div"), "http://example.com");
        Element in = new Element(Tag.valueOf("span"), "http://example.com");
        builder.push(new Element(Tag.valueOf("p"), "http://example.com"));
        builder.replaceOnStack(out, in);
        assertEquals(1, builder.getStack().size());
        assertEquals("p", builder.getStack().get(0).nodeName());
    }

    @Test
    public void testReplaceOnStackFound() {
        Element out = new Element(Tag.valueOf("div"), "http://example.com");
        Element in = new Element(Tag.valueOf("span"), "http://example.com");
        builder.push(out);
        builder.replaceOnStack(out, in);
        assertEquals(1, builder.getStack().size());
        assertSame(in, builder.getStack().get(0));
    }

    @Test
    public void testToString() {
        assertNotNull(builder.toString());
        assertTrue(builder.toString().contains("TreeBuilder"));
    }

    @Test
    public void testGetBaseUriAfterSet() {
        builder.baseUri = "http://new.example.com";
        assertEquals("http://new.example.com", builder.getBaseUri());
    }
}