package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
    }

    @After
    public void tearDown() {
        builder = null;
    }

    @Test
    public void testDefaultSettings() {
        assertNotNull(builder.defaultSettings());
        assertEquals(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void testInitialiseParse() {
        builder.initialiseParse(new StringReader("<html></html>"), "http://example.com", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        assertNotNull(builder.getDocument());
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testParseFragmentWithNullContext() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader("frag"), "", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        List<Node> nodes = builder.parseFragment("div", null, "", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void testParseFragmentWithContext() {
        Element context = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = builder.parseFragment("<p>text</p>", context, "", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertTrue(nodes.size() >= 1);
    }

    @Test
    public void testProcessToken() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        boolean result = builder.process(startTag);
        assertTrue(result);
    }

    @Test
    public void testTransitionAndState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void testMarkAndOriginalState() {
        builder.markInsertionMode();
        builder.transition(HtmlTreeBuilderState.InTable);
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, builder.originalState());
    }

    @Test
    public void testFramesetOk() {
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testGetDocument() {
        assertNotNull(builder.getDocument());
        assertTrue(builder.getDocument() instanceof Document);
    }

    @Test
    public void testGetBaseUri() {
        builder.initialiseParse(new StringReader("<html/>"), "http://example.com/base", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com/");
        base.attr("href", "subdir/");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/", builder.getBaseUri());
        base.attr("href", "");
        builder.maybeSetBaseUri(base);
    }

    @Test
    public void testMaybeSetBaseUriOnlyOnce() {
        Element base1 = new Element(Tag.valueOf("base"), "http://example.com/");
        base1.attr("href", "one/");
        builder.maybeSetBaseUri(base1);
        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/");
        base2.attr("href", "two/");
        builder.maybeSetBaseUri(base2);
        assertEquals("http://example.com/one/", builder.getBaseUri());
    }

    @Test
    public void testIsFragmentParsing() {
        assertFalse(builder.isFragmentParsing());
        builder.parseFragment("div", null, "", new ParseErrorList(16, 100), ParseSettings.htmlDefault);
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void testError() {
        builder = new HtmlTreeBuilder();
        ParseErrorList errors = new ParseErrorList(16, 100);
        builder.initialiseParse(new StringReader("test"), "", errors, ParseSettings.htmlDefault);
        builder.error(HtmlTreeBuilderState.Initial);
        assertEquals(0, errors.size());
    }

    @Test
    public void testInsertStartTag() {
        Element el = builder.insertStartTag("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testInsertStartTagSelfClosing() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing();
        builder.process(startTag);
    }

    @Test
    public void testInsertNode() {
        Element el = new Element(Tag.valueOf("span"), "");
        builder.insertNode(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertNodeWithVoidParent() {
        builder.insertStartTag("div");
        Element el = new Element(Tag.valueOf("span"), "");
        builder.insertNode(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertComment() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        builder.insert(commentToken);
        assertNotNull(builder.getDocument().child(0));
    }

    @Test
    public void testInsertCharacterInStyle() {
        builder.insertStartTag("script");
        Token.Character character = new Token.Character();
        character.data("var x=1");
        builder.insert(character);
    }

    @Test
    public void testInsertCharacterNormal() {
        builder.insertStartTag("div");
        Token.Character character = new Token.Character();
        character.data("text");
        builder.insert(character);
    }

    @Test
    public void testPopStack() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        Element el = builder.pop();
        assertNotNull(el);
        assertEquals("body", el.tagName());
    }

    @Test
    public void testPopEmptyStack() {
        builder.pop();
        builder.pop();
    }

    @Test
    public void testPushAndGetStack() {
        Element el = new Element(Tag.valueOf("div"), "");
        builder.push(el);
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testOnStack() {
        Element el = builder.insertStartTag("div");
        assertTrue(builder.onStack(el));
        Element el2 = new Element(Tag.valueOf("span"), "");
        assertFalse(builder.onStack(el2));
    }

    @Test
    public void testGetFromStack() {
        Element el = builder.insertStartTag("div");
        assertEquals(el, builder.getFromStack("div"));
        assertNull(builder.getFromStack("span"));
    }

    @Test
    public void testRemoveFromStack() {
        Element el = builder.insertStartTag("div");
        assertTrue(builder.onStack(el));
        builder.removeFromStack(el);
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testPopStackToClose() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.popStackToClose("body");
        assertFalse(builder.onStack(builder.getFromStack("body")));
    }

    @Test
    public void testPopStackToCloseMultiple() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.popStackToClose("div", "body");
        assertFalse(builder.onStack(builder.getFromStack("div")));
    }

    @Test
    public void testPopStackToBefore() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.popStackToBefore("body");
        assertFalse(builder.onStack(builder.getFromStack("body")));
    }

    @Test
    public void testClearStackToTableContext() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.clearStackToTableContext();
        assertFalse(builder.onStack(builder.getFromStack("body")));
    }

    @Test
    public void testClearStackToTableBodyContext() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.clearStackToTableBodyContext();
        assertFalse(builder.onStack(builder.getFromStack("tbody")));
    }

    @Test
    public void testClearStackToTableRowContext() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.clearStackToTableRowContext();
        assertFalse(builder.onStack(builder.getFromStack("tr")));
    }

    @Test
    public void testInsertFormOnStack() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement form = builder.insertForm(startTag, true);
        assertNotNull(form);
        assertEquals("form", form.tagName());
    }

    @Test
    public void testInsertFormNotOnStack() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("form");
        FormElement form = builder.insertForm(startTag, false);
        assertNotNull(form);
    }

    @Test
    public void testInsertEmpty() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        Element el = builder.insertEmpty(startTag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertEmptyNonVoidTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        Element el = builder.insertEmpty(startTag);
        assertNotNull(el);
    }

    @Test
    public void testInsertOnStackAfter() {
        Element first = builder.insertStartTag("div");
        Element second = builder.insertStartTag("span");
        Element third = new Element(Tag.valueOf("a"), "");
        builder.insertOnStackAfter(second, third);
        assertTrue(builder.onStack(third));
    }

    @Test
    public void testReplaceOnStack() {
        Element old = builder.insertStartTag("div");
        Element newEl = new Element(Tag.valueOf("span"), "");
        builder.replaceOnStack(old, newEl);
        assertTrue(builder.onStack(newEl));
        assertFalse(builder.onStack(old));
    }

    @Test
    public void testToString() {
        assertNotNull(builder.toString());
        assertTrue(builder.toString().contains("TreeBuilder"));
    }
}