package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.TextNode;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private Document doc;
    private String baseUri = "http://example.com/";
    private ParseErrorList errors;
    private ParseSettings settings;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        doc = new Document(baseUri);
        errors = new ParseErrorList(16, 16);
        settings = ParseSettings.htmlDefault;
        builder.initialiseParse(new StringReader("<html><body></body></html>"), baseUri, errors, settings);
    }

    @After
    public void tearDown() {
        builder = null;
        doc = null;
        errors = null;
        settings = null;
    }

    @Test
    public void testDefaultSettings() {
        assertNotNull(builder.defaultSettings());
        assertEquals(ParseSettings.htmlDefault, builder.defaultSettings());
    }

    @Test
    public void testNewInstance() {
        HtmlTreeBuilder newBuilder = new HtmlTreeBuilder();
        assertNotNull(newBuilder);
    }

    @Test
    public void testInitialiseParseResetsState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        builder.framesetOk(true);
        builder.initialiseParse(new StringReader("<html></html>"), baseUri, errors, settings);
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testParseFragmentWithNullContext() {
        List<Node> nodes = builder.parseFragment("<p>Hello</p>", null, baseUri, errors, settings);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentWithContext() {
        Element context = new Element(Tag.valueOf("div", settings), baseUri);
        context.appendChild(new Element(Tag.valueOf("span", settings), baseUri));
        builder.initialiseParse(new StringReader("<p>test</p>"), baseUri, errors, settings);
        builder.parseFragment("<b>bold</b>", context, baseUri, errors, settings);
        assertNotNull(builder.getStack());
        assertFalse(builder.getStack().isEmpty());
    }

    @Test
    public void testProcessToken() {
        Token token = new Token.StartTag("p");
        boolean result = builder.process(token);
        assertTrue(result);
    }

    @Test
    public void testProcessTokenWithState() {
        Token token = new Token.StartTag("div");
        boolean result = builder.process(token, HtmlTreeBuilderState.InBody);
        assertTrue(result);
    }

    @Test
    public void testTransitionChangesState() {
        builder.transition(HtmlTreeBuilderState.InHead);
        assertEquals(HtmlTreeBuilderState.InHead, builder.state());
    }

    @Test
    public void testMarkInsertionMode() {
        builder.markInsertionMode();
        assertEquals(builder.state(), builder.originalState());
    }

    @Test
    public void testOriginalState() {
        builder.markInsertionMode();
        assertEquals(builder.state(), builder.originalState());
    }

    @Test
    public void testFramesetOkSetter() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());
    }

    @Test
    public void testGetDocument() {
        assertNotNull(builder.getDocument());
    }

    @Test
    public void testGetBaseUri() {
        assertNotNull(builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriBeforeSet() {
        Element base = new Element(Tag.valueOf("base", settings), baseUri);
        base.attr("href", "http://example.com/");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriAlreadySet() {
        Element base = new Element(Tag.valueOf("base", settings), baseUri);
        base.attr("href", "http://example.com/");
        builder.maybeSetBaseUri(base);
        String firstBaseUri = builder.getBaseUri();
        base.attr("href", "http://example.com/other");
        builder.maybeSetBaseUri(base);
        assertEquals(firstBaseUri, builder.getBaseUri());
    }

    @Test
    public void testIsFragmentParsingInitial() {
        assertFalse(builder.isFragmentParsing());
    }

    @Test
    public void testErrorWithState() {
        builder.error(HtmlTreeBuilderState.InBody);
        assertTrue(errors.size() > 0);
    }

    @Test
    public void testInsertStartTagSelfClosing() {
        Token.StartTag startTag = new Token.StartTag("br");
        startTag.selfClosing(true);
        Element inserted = builder.insert(startTag);
        assertNotNull(inserted);
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testInsertStartTagNotSelfClosing() {
        Token.StartTag startTag = new Token.StartTag("div");
        Element inserted = builder.insert(startTag);
        assertNotNull(inserted);
        assertFalse(startTag.isSelfClosing());
    }

    @Test
    public void testInsertStartTagName() {
        Element inserted = builder.insertStartTag("span");
        assertNotNull(inserted);
        assertEquals("span", inserted.tagName());
    }

    @Test
    public void testInsertElement() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        builder.insert(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testInsertEmptyNonVoidTag() {
        Token.StartTag startTag = new Token.StartTag("div");
        startTag.selfClosing(false);
        Element inserted = builder.insertEmpty(startTag);
        assertNotNull(inserted);
        assertTrue(startTag.isSelfClosing());
    }

    @Test
    public void testInsertFormOnStack() {
        Token.StartTag startTag = new Token.StartTag("form");
        FormElement form = builder.insertForm(startTag, true);
        assertNotNull(form);
        assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testInsertFormNotOnStack() {
        Token.StartTag startTag = new Token.StartTag("form");
        FormElement form = builder.insertForm(startTag, false);
        assertNotNull(form);
        assertEquals(form, builder.getFormElement());
    }

    @Test
    public void testInsertComment() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        builder.insert(commentToken);
        assertTrue(builder.getStack().get(0).childNodeSize() > 0);
    }

    @Test
    public void testInsertCharacter() {
        Token.Character characterToken = new Token.Character("text");
        builder.insert(characterToken);
        assertTrue(builder.getStack().get(0).childNodeSize() > 0);
    }

    @Test
    public void testInsertCharacterInScript() {
        builder.insertStartTag("script");
        Token.Character characterToken = new Token.Character("var x = 1;");
        builder.insert(characterToken);
        Element scriptEl = builder.getStack().get(builder.getStack().size() - 1);
        assertTrue(scriptEl.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertNodeEmptyStack() {
        builder.getStack().clear();
        Node node = new TextNode("test");
        builder.insertNode(node);
        assertEquals(1, builder.getDocument().childNodeSize());
    }

    @Test
    public void testInsertNodeWithStack() {
        builder.insertStartTag("div");
        Node node = new TextNode("test");
        builder.insertNode(node);
        assertEquals(1, builder.getStack().get(0).childNodeSize());
    }

    @Test
    public void testPop() {
        builder.insertStartTag("div");
        int stackSize = builder.getStack().size();
        Element popped = builder.pop();
        assertNotNull(popped);
        assertEquals(stackSize - 1, builder.getStack().size());
    }

    @Test
    public void testPush() {
        Element el = new Element(Tag.valueOf("span", settings), baseUri);
        builder.push(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testGetStack() {
        assertNotNull(builder.getStack());
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testOnStackWithElementOnStack() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        builder.push(el);
        assertTrue(builder.onStack(el));
    }

    @Test
    public void testOnStackWithElementNotOnStack() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testGetFromStackExisting() {
        builder.insertStartTag("div");
        Element el = builder.getFromStack("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testGetFromStackNonExisting() {
        Element el = builder.getFromStack("span");
        assertNull(el);
    }

    @Test
    public void testRemoveFromStackExisting() {
        builder.insertStartTag("div");
        Element el = builder.getFromStack("div");
        boolean removed = builder.removeFromStack(el);
        assertTrue(removed);
        assertFalse(builder.onStack(el));
    }

    @Test
    public void testRemoveFromStackNonExisting() {
        Element el = new Element(Tag.valueOf("span", settings), baseUri);
        boolean removed = builder.removeFromStack(el);
        assertFalse(removed);
    }

    @Test
    public void testPopStackToCloseSingle() {
        builder.insertStartTag("div");
        builder.popStackToClose("div");
        assertNull(builder.getFromStack("div"));
    }

    @Test
    public void testPopStackToCloseMultipleNames() {
        builder.insertStartTag("p");
        builder.popStackToClose("p", "div");
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testPopStackToBeforeExisting() {
        builder.insertStartTag("div");
        builder.insertStartTag("span");
        builder.popStackToBefore("div");
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void testPopStackToBeforeNonExisting() {
        builder.insertStartTag("div");
        builder.popStackToBefore("p");
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testClearStackToTableContext() {
        builder.clearStackToTableContext();
        assertTrue(builder.getStack().size() <= 1);
    }

    @Test
    public void testClearStackToTableBodyContext() {
        builder.clearStackToTableBodyContext();
        assertTrue(builder.getStack().size() <= 1);
    }

    @Test
    public void testClearStackToTableRowContext() {
        builder.clearStackToTableRowContext();
        assertTrue(builder.getStack().size() <= 1);
    }

    @Test
    public void testAppendToStack() {
        Element el = new Element(Tag.valueOf("br", settings), baseUri);
        builder.push(el);
        builder.insertOnStackAfter(builder.getStack().get(0), el);
        assertEquals(3, builder.getStack().size());
    }

    @Test
    public void testReplaceOnStack() {
        builder.insertStartTag("div");
        Element oldEl = builder.getFromStack("div");
        Element newEl = new Element(Tag.valueOf("span", settings), baseUri);
        builder.replaceOnStack(oldEl, newEl);
        assertEquals(newEl, builder.getFromStack("span"));
    }

    @Test
    public void testReplaceInQueue() {
        ArrayList<Element> queue = new ArrayList<>();
        Element el1 = new Element(Tag.valueOf("div", settings), baseUri);
        Element el2 = new Element(Tag.valueOf("span", settings), baseUri);
        queue.add(el1);
        builder.replaceInQueue(queue, el1, el2);
        assertEquals(el2, queue.get(0));
    }

    @Test
    public void testResetInsertionModeSelect() {
        Element selectEl = new Element(Tag.valueOf("select", settings), baseUri);
        builder.getStack().clear();
        builder.getStack().add(selectEl);
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());
    }

    @Test
    public void testIsElementInQueue() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        ArrayList<Element> queue = new ArrayList<>();
        queue.add(el);
        assertTrue(builder.isElementInQueue(queue, el));
    }

    @Test
    public void testIsElementInQueueFalse() {
        Element el1 = new Element(Tag.valueOf("div", settings), baseUri);
        Element el2 = new Element(Tag.valueOf("span", settings), baseUri);
        ArrayList<Element> queue = new ArrayList<>();
        queue.add(el1);
        assertFalse(builder.isElementInQueue(queue, el2));
    }

    @Test
    public void testInSpecificScopeWithMatch() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        builder.push(el);
        String[] target = {"div"};
        String[] base = {"html", "body"};
        assertTrue(builder.inSpecificScope(target, base, null));
    }

    @Test
    public void testInSpecificScopeNoMatch() {
        Element el = new Element(Tag.valueOf("span", settings), baseUri);
        builder.push(el);
        String[] target = {"div"};
        String[] base = {"html", "body"};
        assertFalse(builder.inSpecificScope(target, base, null));
    }

    @Test
    public void testInScope() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inScope("div"));
    }

    @Test
    public void testInScopeFalse() {
        Element el = new Element(Tag.valueOf("div", settings), baseUri);
        builder.push(el);
        assertFalse(builder.inScope("span"));
    }

    @Test
    public void testInListItemScope() {
        Element el = new Element(Tag.valueOf("li", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        Element el = new Element(Tag.valueOf("button", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inButtonScope("button"));
    }

    @Test
    public void testInTableScope() {
        Element el = new Element(Tag.valueOf("table", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inTableScope("table"));
    }

    @Test
    public void testInSelectScope() {
        Element el = new Element(Tag.valueOf("option", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inSelectScope("option"));
    }

    @Test
    public void testInTableBodyScope() {
        Element el = new Element(Tag.valueOf("tbody", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inTableBodyScope("tbody"));
    }

    @Test
    public void testInRowScope() {
        Element el = new Element(Tag.valueOf("tr", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inRowScope("tr"));
    }

    @Test
    public void testInCellScope() {
        Element el = new Element(Tag.valueOf("td", settings), baseUri);
        builder.push(el);
        assertTrue(builder.inCellScope("td"));
    }

    @Test
    public void testInSelectScopeFalse() {
        Element el = new Element(Tag.valueOf("option", settings), baseUri);
        builder.push(el);
        assertFalse(builder.inSelectScope("div"));
    }

    @Test
    public void testGetHeadElement() {
        assertNull(builder.getHeadElement());
    }

    @Test
    public void testGetFormElement() {
        assertNull(builder.getFormElement());
    }

    @Test
    public void testGetPendingTableCharacters() {
        assertNotNull(builder.getPendingTableCharacters());
        assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGenerateImpliedEndTags() {
        builder.insertStartTag("div");
        builder.push(new Element(Tag.valueOf("li", settings), baseUri));
        builder.generateImpliedEndTags();
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExclude() {
        builder.insertStartTag("div");
        builder.push(new Element(Tag.valueOf("li", settings), baseUri));
        builder.generateImpliedEndTags("li");
        assertEquals(2, builder.getStack().size());
    }

    @Test
    public void testIsSpecial() {
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("div", settings), baseUri)));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("p", settings), baseUri)));
    }

    @Test
    public void testLastFormattingElementEmpty() {
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElementEmpty() {
        assertNull(builder.removeLastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElementsEmpty() {
        builder.reconstructFormattingElements();
        assertEquals(0, builder.getStack().size());
    }

    @Test
    public void testIsSameFormattingElement() {
        Element a = new Element(Tag.valueOf("b", settings), baseUri);
        Element b = new Element(Tag.valueOf("i", settings), baseUri);
        assertFalse(builder.isSameFormattingElement(a, b));
        b = new Element(Tag.valueOf("b", settings), baseUri);
        assertTrue(builder.isSameFormattingElement(a, b));
    }

    @Test
    public void testIsLastFormattingElement() {
        Element el = new Element(Tag.valueOf("b", settings), baseUri);
        builder.formattingElements.add(el);
        assertTrue(builder.isLastFormattingElement(el));
    }

    @Test
    public void testPushFormattingElement() {
        Element el = new Element(Tag.valueOf("b", settings), baseUri);
        builder.pushFormattingElement(el);
        assertEquals(1, builder.formattingElements.size());
    }
}