package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {
    private HtmlTreeBuilder builder;
    private Parser parser;
    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        parser = Parser.htmlParser();
        builder.initialiseParse(new StringReader(""), BASE_URI, parser);
    }

    private Element element(String tagName) {
        return new Element(Tag.valueOf(tagName), BASE_URI);
    }

    @Test
    public void stateAndInitialValues() {
        assertSame(ParseSettings.htmlDefault, builder.defaultSettings());
        assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        assertTrue(builder.framesetOk());
        assertFalse(builder.isFragmentParsing());
        assertNotNull(builder.getDocument());
        assertNull(builder.getHeadElement());
        assertNull(builder.getFormElement());
    }

    @Test
    public void transitionsMarkOriginalState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, builder.state());
        builder.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void framesetAndPendingTableCharacters() {
        builder.framesetOk(false);
        assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        assertTrue(builder.framesetOk());

        builder.newPendingTableCharacters();
        assertNotNull(builder.getPendingTableCharacters());
        assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void maybeSetBaseUriOnlyOnce() {
        Element base = element("base");
        base.attr("href", "http://example.com/base");
        builder.maybeSetBaseUri(base);
        assertEquals("http://example.com/base", builder.getBaseUri());

        Element other = element("base");
        other.attr("href", "http://example.com/other");
        builder.maybeSetBaseUri(other);
        assertEquals("http://example.com/base", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUriIgnoresEmptyHref() {
        Element base = element("base");
        base.attr("href", "");
        builder.maybeSetBaseUri(base);
        assertEquals(BASE_URI, builder.getBaseUri());
    }

    @Test
    public void parseFragmentWithNullContextAndEmptyInput() {
        List<Node> nodes = builder.parseFragment("", null, BASE_URI, parser);
        assertNotNull(nodes);
    }

    @Test
    public void parseFragmentWithContextAndMarkup() {
        Element context = element("div");
        List<Node> nodes = builder.parseFragment("<b>one</b>", context, BASE_URI, parser);
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void insertStartTagAndStackPushPop() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        Element el = builder.insert(startTag);
        assertEquals("div", el.normalName());
        assertEquals(1, builder.getStack().size());
        assertSame(el, builder.getStack().get(0));

        Element child = builder.pop();
        assertSame(el, child);
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void insertSelfClosingStartTag() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("br");
        startTag.selfClosing(true);
        Element el = builder.insert(startTag);
        assertEquals("br", el.normalName());
        assertEquals(1, builder.getStack().size());
    }

    @Test
    public void insertCommentAndCharacterTokens() {
        builder.insert(new Token.Comment("comment"));
        Document doc = builder.getDocument();
        assertEquals(1, doc.childNodeSize());
        assertTrue(doc.childNode(0) instanceof Comment);

        Element div = element("div");
        builder.push(div);
        builder.insert(new Token.Character("text"));
        assertEquals(1, div.childNodeSize());
        assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test
    public void stackSearchAndRemove() {
        Element html = element("html");
        Element div = element("div");
        builder.push(html);
        builder.push(div);
        assertTrue(builder.onStack(div));
        assertSame(div, builder.getFromStack("div"));
        assertTrue(builder.removeFromStack(div));
        assertEquals(1, builder.getStack().size());
        assertFalse(builder.removeFromStack(div));
    }

    @Test
    public void popStackToCloseHandlesSingleAndVarargs() {
        Element div = element("div");
        Element p = element("p");
        Element li = element("li");
        builder.push(div);
        builder.push(p);
        builder.push(li);
        builder.popStackToClose("p");
        assertEquals(1, builder.getStack().size());
        assertSame(div, builder.getStack().get(0));

        builder.popStackToClose("html", "p");
        assertTrue(builder.getStack().isEmpty());
    }

    @Test
    public void clearStackToTableContextStopsAtHtml() {
        Element html = element("html");
        Element div = element("div");
        builder.push(html);
        builder.push(div);
        builder.clearStackToTableContext();
        assertEquals(1, builder.getStack().size());
        assertSame(html, builder.getStack().get(0));
    }

    @Test
    public void aboveAndReplaceStackOperations() {
        Element p = element("p");
        Element span = element("span");
        Element div = element("div");
        Element replacement = element("p");
        builder.push(p);
        builder.push(span);
        assertSame(p, builder.aboveOnStack(span));
        builder.insertOnStackAfter(p, div);
        assertEquals(3, builder.getStack().size());
        assertSame(div, builder.getStack().get(1));
        builder.replaceOnStack(div, replacement);
        assertSame(replacement, builder.getStack().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfterMissingElementThrows() {
        Element existing = element("span");
        Element missing = element("p");
        Element in = element("div");
        builder.push(existing);
        builder.insertOnStackAfter(missing, in);
    }

    @Test
    public void resetInsertionModeSelect() {
        builder.push(element("select"));
        builder.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, builder.state());
    }

    @Test
    public void scopeChecks() {
        builder.push(element("html"));
        builder.push(element("div"));
        assertTrue(builder.inScope("div"));
        assertFalse(builder.inScope("p"));
        assertFalse(builder.inTableScope("td"));
        builder.push(element("table"));
        builder.push(element("td"));
        assertTrue(builder.inTableScope("td"));

        builder.push(element("ul"));
        builder.push(element("li"));
        assertTrue(builder.inListItemScope("li"));
        builder.push(element("button"));
        assertTrue(builder.inButtonScope("button"));
    }

    @Test
    public void selectScopeChecks() {
        builder.push(element("select"));
        assertFalse(builder.inSelectScope("option"));
        builder.push(element("option"));
        assertTrue(builder.inSelectScope("option"));
    }

    @Test
    public void headAndFormElementAccessors() {
        Element head = element("head");
        builder.setHeadElement(head);
        assertSame(head, builder.getHeadElement());

        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI);
        builder.setFormElement(form);
        assertSame(form, builder.getFormElement());
    }

    @Test
    public void fosterInsertsFlag() {
        assertFalse(builder.isFosterInserts());
        builder.setFosterInserts(true);
        assertTrue(builder.isFosterInserts());
    }

    @Test
    public void generateImpliedEndTagsWithExclusion() {
        Element p = element("p");
        Element li = element("li");
        builder.push(p);
        builder.push(li);
        builder.generateImpliedEndTags("p");
        assertEquals(1, builder.getStack().size());
        assertSame(p, builder.getStack().get(0));
    }

    @Test
    public void isSpecialDetectsSpecialElements() {
        assertTrue(builder.isSpecial(element("script")));
        assertFalse(builder.isSpecial(element("div")));
    }

    @Test
    public void activeFormattingElementsLifecycle() {
        assertNull(builder.getActiveFormattingElement("b"));
        Element b = element("b");
        builder.pushActiveFormattingElements(b);
        assertSame(b, builder.lastFormattingElement());
        assertTrue(builder.isInActiveFormattingElements(b));
        assertSame(b, builder.getActiveFormattingElement("b"));

        Element replacement = element("b");
        builder.replaceActiveFormattingElement(b, replacement);
        assertSame(replacement, builder.getActiveFormattingElement("b"));
        builder.removeFromActiveFormattingElements(replacement);
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void activeFormattingElementsLimitsToThree() {
        Element b = element("b");
        for (int i = 0; i < 4; i++) {
            builder.pushActiveFormattingElements(b);
        }
        int count = 0;
        while (builder.removeLastFormattingElement() != null) {
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void clearFormattingElementsToLastMarker() {
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(element("b"));
        builder.clearFormattingElementsToLastMarker();
        assertNull(builder.lastFormattingElement());
    }

    @Test
    public void reconstructFormattingElementsWhenEmptyIsNoOp() {
        builder.reconstructFormattingElements();
        assertNull(builder.lastFormattingElement());
    }
}