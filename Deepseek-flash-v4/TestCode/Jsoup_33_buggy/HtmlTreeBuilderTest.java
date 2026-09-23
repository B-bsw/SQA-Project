package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
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
    }

    @Test
    public void testParseBasic() {
        Document result = builder.parse("<html><body><p>Test</p></body></html>", "http://example.com", new ParseErrorList(10, 10));
        assertNotNull(result);
        assertEquals("Test", result.body().text());
    }

    @Test
    public void testParseEmptyInput() {
        Document result = builder.parse("", "http://example.com", new ParseErrorList(10, 10));
        assertNotNull(result);
    }

    @Test
    public void testParseNullInput() {
        Document result = builder.parse(null, "http://example.com", new ParseErrorList(10, 10));
        assertNotNull(result);
    }

    @Test
    public void testParseWithErrors() {
        ParseErrorList errors = new ParseErrorList(10, 10);
        builder.parse("<html><body>", "http://example.com", errors);
        assertFalse(errors.isEmpty());
    }

    @Test
    public void testFramesetOkDefault() {
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testFramesetOkSetter() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testIsFragmentParsingDefault() {
        assertFalse(builder.isFragmentParsing());
    }

    @Test
    public void testFragmentParsingWithContext() {
        Element context = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = builder.parseFragment("<span>text</span>", context, "http://example.com", new ParseErrorList(10, 10));
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void testFragmentParsingWithoutContext() {
        List<Node> nodes = builder.parseFragment("<p>text</p>", null, "http://example.com", new ParseErrorList(10, 10));
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testInsertStartTag() {
        builder.initialiseParse("<div>", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        StartTag tag = new StartTag("div");
        Element el = builder.insert(tag);
        assertNotNull(el);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testInsertSelfClosingTag() {
        builder.initialiseParse("<br/>", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        StartTag tag = new StartTag("br");
        tag.attributes.put("id", "test");
        Element el = builder.insert(tag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertCharacterText() {
        builder.initialiseParse("<div>", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        Character charToken = new Token.Character("hello");
        builder.insert(charToken);
        assertEquals("hello", builder.currentElement().text());
    }

    @Test
    public void testInsertCharacterInScriptTag() {
        builder.initialiseParse("<script>", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("script"), ""));
        Character charToken = new Token.Character("var x = 1");
        builder.insert(charToken);
        assertTrue(builder.currentElement().childNode(0) instanceof DataNode);
    }

    @Test
    public void testPopEmptyStack() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element result = builder.pop();
        assertNull(result);
    }

    @Test
    public void testPopSingleElement() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element div = new Element(Tag.valueOf("div"), "");
        builder.stack.add(div);
        Element result = builder.pop();
        assertEquals(div, result);
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void testOnStackMultipleElements() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.stack.add(html);
        builder.stack.add(body);
        assertTrue(builder.onStack(body));
        assertFalse(builder.onStack(new Element(Tag.valueOf("head"), "")));
    }

    @Test
    public void testGetFromStack() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        builder.stack.add(new Element(Tag.valueOf("p"), ""));
        Element result = builder.getFromStack("p");
        assertNotNull(result);
        assertEquals("p", result.tagName());
    }

    @Test
    public void testGetFromStackNotFound() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        assertNull(builder.getFromStack("span"));
    }

    @Test
    public void testRemoveFromStack() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element div = new Element(Tag.valueOf("div"), "");
        builder.stack.add(div);
        assertTrue(builder.removeFromStack(div));
        assertFalse(builder.onStack(div));
    }

    @Test
    public void testPopStackToCloseWithMatching() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        builder.stack.add(html);
        builder.stack.add(body);
        builder.stack.add(div);
        builder.popStackToClose("div");
        assertTrue(builder.onStack(body));
        assertFalse(builder.onStack(div));
    }

    @Test
    public void testPopStackToCloseNoMatch() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.stack.add(html);
        builder.stack.add(body);
        builder.popStackToClose("div");
        assertTrue(builder.onStack(body));
    }

    @Test
    public void testPopStackToBefore() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("html"), ""));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        builder.stack.add(new Element(Tag.valueOf("table"), ""));
        builder.popStackToBefore("body");
        assertTrue(builder.onStack(new Element(Tag.valueOf("body"), "")));
        assertEquals("body", builder.getStack().getLast().tagName());
    }

    @Test
    public void testClearStackToTableContext() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("html"), ""));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        builder.stack.add(new Element(Tag.valueOf("table"), ""));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        builder.clearStackToTableContext();
        assertEquals("table", builder.getStack().getLast().tagName());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("html"), ""));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        builder.stack.add(new Element(Tag.valueOf("table"), ""));
        builder.stack.add(new Element(Tag.valueOf("tbody"), ""));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        builder.clearStackToTableBodyContext();
        assertEquals("tbody", builder.getStack().getLast().tagName());
    }

    @Test
    public void testClearStackToTableRowContext() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        builder.stack.add(new Element(Tag.valueOf("html"), ""));
        builder.stack.add(new Element(Tag.valueOf("body"), ""));
        builder.stack.add(new Element(Tag.valueOf("table"), ""));
        builder.stack.add(new Element(Tag.valueOf("tr"), ""));
        builder.stack.add(new Element(Tag.valueOf("div"), ""));
        builder.clearStackToTableRowContext();
        assertEquals("tr", builder.getStack().getLast().tagName());
    }

    @Test
    public void testInsertOnStackAfter() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        builder.stack.add(html);
        builder.stack.add(body);
        builder.insertOnStackAfter(body, div);
        assertEquals(div, builder.getStack().get(2));
    }

    @Test
    public void testInsertOnStackAfterNoExisting() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.stack.add(html);
        try {
            builder.insertOnStackAfter(new Element(Tag.valueOf("p"), ""), body);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReplaceOnStack() {
        builder.initialiseParse("", "http://example.com", new ParseErrorList(10, 10));
        Element original = new Element(Tag.valueOf("div"), "");
        Element replacement = new Element(Tag.valueOf("p"), "");
        builder.stack.add(original);
        builder.replaceOnStack(original, replacement);
        assertFalse(builder.onStack(original));
        assertTrue(builder.onStack(replacement));
    }

    @Test
    public void testMaybeSetBaseUri() {
        builder.initialiseParse("", "http://old.com", new ParseErrorList(10, 10));
        Element base = new Element(Tag.valueOf("base"), "");
        base.attr("href", "http://new.com/path");
        builder.maybeSetBaseUri(base);
        assertEquals("http://new.com/path", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriOnce() {
        builder.initialiseParse("", "http://old.com", new ParseErrorList(10, 10));
        Element base = new Element(Tag.valueOf("base"), "");
        base.attr("href", "http://new1.com");
        builder.maybeSetBaseUri(base);
        Element base2 = new Element(Tag.valueOf("base"), "");
        base2.attr("href", "http://new2.com");
        builder.maybeSetBaseUri(base2);
        assertEquals("http://new1.com", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriEmptyHref() {
        builder.initialiseParse("", "http://old.com", new ParseErrorList(10, 10));
        Element base = new Element(Tag.valueOf("base"), "");
        base.attr("href", "");
        builder.maybeSetBaseUri(base);
        assertEquals("http://old.com", builder.getBaseUri());
    }

    @Test
    public void testErrorMethod() {
        ParseErrorList errors = new ParseErrorList(10, 10);
        builder.initialiseParse("", "http://example.com", errors);
        builder.error(HtmlTreeBuilderState.Initial);
        assertFalse(errors.isEmpty());
    }

    @Test
    public void testErrorMethodNoCapacity() {
        ParseErrorList errors = new ParseErrorList(1, 1);
        builder.initialiseParse("", "http://example.com", errors);
        builder.error(HtmlTreeBuilderState.Initial);
        builder.error(HtmlTreeBuilderState.BeforeHtml);
        assertTrue(errors.size() <= 1);
    }
}