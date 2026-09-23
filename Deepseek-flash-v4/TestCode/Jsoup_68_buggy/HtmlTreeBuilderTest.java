package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;
    private Document doc;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        doc = new Document("http://example.com/");
        builder.doc = doc;
        builder.settings = ParseSettings.htmlDefault;
        builder.tokeniser = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        builder.stack = new ArrayList<>();
        builder.formattingElements = new ArrayList<>();
        builder.pendingTableCharacters = new ArrayList<>();
        builder.errors = ParseErrorList.noTracking();
        builder.reader = new StringReader("");
        builder.tokeniser.reader = builder.reader;
    }

    @Test
    public void testInitialiseParse() {
        builder.initialiseParse(new StringReader(""), "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertFalse(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertNull(builder.originalState());
        assertNull(builder.headElement);
        assertNull(builder.formElement);
        assertNull(builder.contextElement);
        assertEquals(0, builder.formattingElements.size());
        assertEquals(0, builder.pendingTableCharacters.size());
        assertNotNull(builder.emptyEnd);
    }

    @Test
    public void testParseFragmentWithContext() {
        Element context = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.contextElement = context;
        builder.fragmentParsing = true;
        List<Node> nodes = builder.parseFragment("<p>text</p>", context, "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("p", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void testParseFragmentNullContext() {
        List<Node> nodes = builder.parseFragment("<p>text</p>", null, "http://example.com", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertTrue(nodes.size() >= 1);
    }

    @Test
    public void testProcessTokenWithState() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "div";
        Token token = startTag;
        assertTrue(builder.process(token, HtmlTreeBuilderState.InBody));
    }

    @Test
    public void testTransitionAndState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void testMarkInsertionMode() {
        builder.transition(HtmlTreeBuilderState.AfterBody);
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.AfterBody, builder.originalState());
    }

    @Test
    public void testFramesetOk() {
        assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
    }

    @Test
    public void testGetDocument() {
        assertSame(doc, builder.getDocument());
    }

    @Test
    public void testGetBaseUri() {
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri() {
        Element base = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        base.attr("href", "http://example.com/base");
        builder.maybeSetBaseUri(base);
        assertTrue(builder.baseUriSetFromDoc);
        assertEquals("http://example.com/base", builder.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriAlreadySet() {
        builder.baseUriSetFromDoc = true;
        Element base = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        base.attr("href", "http://example.com/other");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void testIsFragmentParsing() {
        assertFalse(builder.isFragmentParsing());
        builder.fragmentParsing = true;
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void testError() {
        builder.currentToken = new Token.StartTag();
        builder.error(HtmlTreeBuilderState.InBody);
        assertEquals(0, builder.errors.size());
    }

    @Test
    public void testInsertStartTag() {
        Element el = builder.insertStartTag("div");
        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testInsertElement() {
        Element el = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.insert(el);
        assertEquals(1, builder.stack.size());
        assertEquals(el, builder.stack.get(0));
    }

    @Test
    public void testInsertEmptyTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "br";
        Element el = builder.insertEmpty(startTag);
        assertNotNull(el);
        assertEquals("br", el.tagName());
    }

    @Test
    public void testInsertFormOnStack() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        FormElement form = builder.insertForm(startTag, true);
        assertNotNull(form);
        assertEquals(form, builder.formElement);
        assertTrue(builder.onStack(form));
    }

    @Test
    public void testInsertFormNotOnStack() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "form";
        FormElement form = builder.insertForm(startTag, false);
        assertNotNull(form);
        assertEquals(form, builder.formElement);
        assertFalse(builder.onStack(form));
    }

    @Test
    public void testInsertComment() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        builder.insert(commentToken);
        assertEquals(1, doc.childNodes().size());
        assertEquals("test comment", ((Comment) doc.childNode(0)).getData());
    }

    @Test
    public void testInsertCharacterInScript() {
        Element script = new Element(Tag.valueOf("script", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(script);
        builder.insertNode(script);
        Token.Character charToken = new Token.Character();
        charToken.data("var x=1;");
        builder.insert(charToken);
        assertEquals(1, script.childNodes().size());
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertCharacterText() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.insertNode(div);
        Token.Character charToken = new Token.Character();
        charToken.data("hello");
        builder.insert(charToken);
        assertEquals(1, div.childNodes().size());
        assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test
    public void testInsertNodeEmptyStack() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.insertNode(el);
        assertEquals(1, doc.childNodes().size());
        assertSame(el, doc.childNode(0));
    }

    @Test
    public void testPop() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el1);
        builder.stack.add(el2);
        assertSame(el2, builder.pop());
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testPush() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.push(el);
        assertEquals(1, builder.stack.size());
        assertSame(el, builder.stack.get(0));
    }

    @Test
    public void testGetStack() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        ArrayList<Element> stack = builder.getStack();
        assertEquals(1, stack.size());
        assertSame(el, stack.get(0));
    }

    @Test
    public void testOnStack() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertTrue(builder.onStack(el));
        Element other = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        assertFalse(builder.onStack(other));
    }

    @Test
    public void testGetFromStack() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.stack.add(span);
        assertSame(span, builder.getFromStack("span"));
        assertNull(builder.getFromStack("p"));
    }

    @Test
    public void testRemoveFromStack() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.stack.add(span);
        builder.removeFromStack(div);
        assertEquals(1, builder.stack.size());
        assertSame(span, builder.stack.get(0));
    }

    @Test
    public void testPopStackToCloseSingle() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.stack.add(span);
        builder.popStackToClose("span");
        assertEquals(1, builder.stack.size());
        assertEquals(0, builder.stack.size());
    }

    @Test
    public void testPopStackToCloseMultiple() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        Element p = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.stack.add(span);
        builder.stack.add(p);
        builder.popStackToClose("p", "span");
        assertEquals(1, builder.stack.size());
        assertSame(div, builder.stack.get(0));
    }

    @Test
    public void testPopStackToBefore() {
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(div);
        builder.stack.add(span);
        builder.popStackToBefore("div");
        assertEquals(0, builder.stack.size());
    }

    @Test
    public void testClearStackToTableContext() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "http://example.com");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(table);
        builder.stack.add(tr);
        builder.stack.add(div);
        builder.clearStackToTableContext();
        assertEquals(2, builder.stack.size());
        assertSame(html, builder.stack.get(0));
        assertSame(table, builder.stack.get(1));
    }

    @Test
    public void testClearStackToTableBodyContext() {
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        Element tbody = new Element(Tag.valueOf("tbody", ParseSettings.htmlDefault), "http://example.com");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(table);
        builder.stack.add(tbody);
        builder.stack.add(tr);
        builder.clearStackToTableBodyContext();
        assertEquals(2, builder.stack.size());
        assertSame(table, builder.stack.get(0));
        assertSame(tbody, builder.stack.get(1));
    }

    @Test
    public void testClearStackToTableRowContext() {
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        Element tbody = new Element(Tag.valueOf("tbody", ParseSettings.htmlDefault), "http://example.com");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(table);
        builder.stack.add(tbody);
        builder.stack.add(tr);
        builder.clearStackToTableRowContext();
        assertEquals(2, builder.stack.size());
        assertSame(table, builder.stack.get(0));
        assertSame(tbody, builder.stack.get(1));
    }

    @Test
    public void testClearStackToContext() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(table);
        builder.stack.add(div);
        builder.clearStackToContext("table");
        assertEquals(2, builder.stack.size());
        assertSame(html, builder.stack.get(0));
        assertSame(table, builder.stack.get(1));
    }

    @Test
    public void testAboveOnStack() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element body = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(body);
        assertSame(html, builder.aboveOnStack(body));
    }

    @Test
    public void testInsertOnStackAfter() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "http://example.com");
        Element body = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(body);
        builder.insertOnStackAfter(html, head);
        assertEquals(3, builder.stack.size());
        assertSame(head, builder.stack.get(1));
    }

    @Test
    public void testReplaceOnStack() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element body = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), "http://example.com");
        Element newBody = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(body);
        builder.replaceOnStack(body, newBody);
        assertEquals(2, builder.stack.size());
        assertSame(newBody, builder.stack.get(1));
    }

    @Test
    public void testReplaceInQueue() {
        ArrayList<Element> queue = new ArrayList<>();
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com");
        Element el3 = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "http://example.com");
        queue.add(el1);
        queue.add(el2);
        queue.add(el3);
        builder.replaceInQueue(queue, el2, el1);
        assertEquals(3, queue.size());
        assertSame(el1, queue.get(0));
        assertSame(el1, queue.get(1));
    }

    @Test
    public void testResetInsertionMode() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.pos = 0;
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void testInSpecificScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        Element td = new Element(Tag.valueOf("td", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(table);
        builder.stack.add(td);
        assertTrue(builder.inSpecificScope("td", new String[]{"applet", "caption", "html", "table", "td", "th"}, new String[]{"td"}));
        assertFalse(builder.inSpecificScope("th", new String[]{"applet", "caption", "html", "table", "td", "th"}, new String[]{"td"}));
    }

    @Test
    public void testInScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(div);
        assertTrue(builder.inScope("div"));
        assertTrue(builder.inScope("html"));
        assertFalse(builder.inScope("span"));
    }

    @Test
    public void testInListItemScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element ol = new Element(Tag.valueOf("ol", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(ol);
        assertTrue(builder.inListItemScope("ol"));
        assertFalse(builder.inListItemScope("ul"));
    }

    @Test
    public void testInButtonScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element button = new Element(Tag.valueOf("button", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(button);
        assertTrue(builder.inButtonScope("button"));
        assertFalse(builder.inButtonScope("div"));
    }

    @Test
    public void testInTableScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(table);
        assertTrue(builder.inTableScope("table"));
        assertFalse(builder.inTableScope("tr"));
    }

    @Test
    public void testInSelectScope() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com");
        Element option = new Element(Tag.valueOf("option", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(html);
        builder.stack.add(option);
        assertTrue(builder.inSelectScope("option"));
        assertFalse(builder.inSelectScope("optgroup"));
    }

    @Test
    public void testSetHeadElement() {
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "http://example.com");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());
    }

    @Test
    public void testGetHeadElement() {
        assertNull(builder.getHeadElement());
    }

    @Test
    public void testSetFosterInserts() {
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        assertFalse(builder.isFosterInserts());
    }

    @Test
    public void testSetFormElement() {
        Element form = new Element(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com");
        builder.setFormElement((FormElement) form);
        assertNotNull(builder.getFormElement());
    }

    @Test
    public void testGetFormElement() {
        assertNull(builder.getFormElement());
    }

    @Test
    public void testSetPendingTableCharacters() {
        List<String> chars = new ArrayList<>();
        chars.add("a");
        builder.setPendingTableCharacters(chars);
        assertEquals(1, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testGetPendingTableCharacters() {
        assertNotNull(builder.getPendingTableCharacters());
        assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void testIsSpecial() {
        assertTrue(builder.isSpecial(new Element(Tag.valueOf("script", ParseSettings.htmlDefault), "http://example.com")));
        assertFalse(builder.isSpecial(new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com")));
    }

    @Test
    public void testIsSameFormattingElement() {
        Element el1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        Element el2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        assertTrue(builder.isSameFormattingElement(el1, el2));
    }

    @Test
    public void testReconstructFormattingElements() {
        Element el = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(el);
        builder.reconstructFormattingElements();
        assertEquals(1, builder.stack.size());
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        Element el1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(el1);
        Element marker = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(marker);
        builder.clearFormattingElementsToLastMarker();
        assertEquals(0, builder.formattingElements.size());
    }

    @Test
    public void testGetActiveFormattingElement() {
        Element el = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(el);
        assertSame(el, builder.getActiveFormattingElement("b"));
        assertNull(builder.getActiveFormattingElement("i"));
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        Element el = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(el);
        builder.removeFromActiveFormattingElements(el);
        assertEquals(0, builder.formattingElements.size());
    }

    @Test
    public void testGetStackSize() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertEquals(1, builder.getStackSize());
    }

    @Test
    public void testContainsNode() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertTrue(builder.containsNode(el));
    }

    @Test
    public void testGetActiveFormattingElementCount() {
        Element el = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com");
        builder.formattingElements.add(el);
        assertEquals(1, builder.getActiveFormattingElementCount());
    }

    @Test
    public void testGetNodeFromStack() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertSame(el, builder.getNodeFromStack(0));
    }

    @Test
    public void testGetLastElement() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertSame(el, builder.getLastElement());
    }

    @Test
    public void testGetCurrentElement() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertSame(el, builder.currentElement());
    }

    @Test
    public void testGetStackAsString() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com");
        builder.stack.add(el);
        assertEquals("div", builder.getStackAsString());
    }

    @Test
    public void testToString() {
        assertNotNull(builder.toString());
    }
}