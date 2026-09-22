package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private Parser parser;

    @Before
    public void setUp() {
        parser = Parser.htmlParser();
        parser.setTrackErrors(10);
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
    }

    @Test
    public void defaultSettings_whenCalled_shouldReturnHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void initialiseParse_givenInitialState_shouldResetFieldsCorrectly() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
        Assert.assertNotNull(builder.getDocument());
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void transitionAndState_givenNewState_shouldUpdateState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.AfterBody);
        Assert.assertEquals(HtmlTreeBuilderState.AfterBody, builder.state());
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void framesetOk_whenToggled_shouldReflectValue() {
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void fosterInserts_whenToggled_shouldReflectValue() {
        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        Assert.assertFalse(builder.isFosterInserts());
    }

    @Test
    public void maybeSetBaseUri_givenValidBaseElement_shouldSetBaseUriOnce() {
        Element baseEl = new Element(Tag.valueOf("base"), "http://example.com/");
        baseEl.attr("href", "http://example.com/sub/");

        builder.maybeSetBaseUri(baseEl);
        Assert.assertEquals("http://example.com/sub/", builder.getBaseUri());
        Assert.assertEquals("http://example.com/sub/", builder.getDocument().baseUri());

        Element secondBase = new Element(Tag.valueOf("base"), "http://example.com/");
        secondBase.attr("href", "http://other.com/");
        builder.maybeSetBaseUri(secondBase);
        Assert.assertEquals("http://example.com/sub/", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_givenEmptyHref_shouldNotUpdate() {
        Element baseEl = new Element(Tag.valueOf("base"), "http://example.com/");
        builder.maybeSetBaseUri(baseEl);
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void headAndFormElement_whenSet_shouldReturnSameInstances() {
        Element head = new Element(Tag.valueOf("head"), "http://example.com/");
        builder.setHeadElement(head);
        Assert.assertSame(head, builder.getHeadElement());

        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        builder.setFormElement(form);
        Assert.assertSame(form, builder.getFormElement());
    }

    @Test
    public void pendingTableCharacters_whenManipulated_shouldReflectChanges() {
        builder.newPendingTableCharacters();
        List<String> chars = builder.getPendingTableCharacters();
        Assert.assertNotNull(chars);
        Assert.assertEquals(0, chars.size());

        chars.add("abc");
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void processToken_givenValidToken_shouldDelegateToState() {
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test comment");
        boolean processed = builder.process(comment);
        Assert.assertTrue(processed);
    }

    @Test
    public void processTokenWithExplicitState_givenState_shouldUsePassedState() {
        Token.Character charToken = new Token.Character();
        charToken.data("   ");
        boolean processed = builder.process(charToken, HtmlTreeBuilderState.Initial);
        Assert.assertTrue(processed);
    }

    @Test
    public void error_whenErrorsTracked_shouldAddError() {
        Token.Character charToken = new Token.Character();
        charToken.data("x");
        builder.process(charToken);
        builder.error(HtmlTreeBuilderState.Initial);

        Assert.assertFalse(parser.getErrors().isEmpty());
    }

    @Test
    public void stackOperations_pushPopAndInspection_shouldWorkCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");

        builder.push(div);
        Assert.assertEquals(1, builder.getStack().size());
        Assert.assertTrue(builder.onStack(div));
        Assert.assertFalse(builder.onStack(span));

        builder.push(span);
        Assert.assertSame(span, builder.currentElement());
        Assert.assertSame(div, builder.aboveOnStack(span));

        Element popped = builder.pop();
        Assert.assertSame(span, popped);
        Assert.assertSame(div, builder.currentElement());
        Assert.assertNull(builder.aboveOnStack(div));
    }

    @Test(expected = AssertionError.class)
    public void aboveOnStack_givenElementNotInStack_shouldThrowAssertionError() {
        Element div = new Element(Tag.valueOf("div"), "");
        builder.aboveOnStack(div);
    }

    @Test
    public void getFromStack_givenExistingAndNonExistingTags_shouldFindCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");
        builder.push(div);
        builder.push(p);

        Assert.assertSame(div, builder.getFromStack("div"));
        Assert.assertSame(p, builder.getFromStack("p"));
        Assert.assertNull(builder.getFromStack("span"));
    }

    @Test
    public void removeFromStack_givenElement_shouldRemoveAndReturnTrue() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        builder.push(div);
        builder.push(span);

        Assert.assertTrue(builder.removeFromStack(div));
        Assert.assertFalse(builder.onStack(div));
        Assert.assertTrue(builder.onStack(span));

        Assert.assertFalse(builder.removeFromStack(div));
    }

    @Test
    public void popStackToClose_givenSingleTag_shouldPopElementsUpToAndIncludingTarget() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(body);
        builder.push(div);
        builder.push(p);

        builder.popStackToClose("div");
        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertSame(body, builder.currentElement());
    }

    @Test
    public void popStackToClose_givenVarargs_shouldPopToMatchingTag() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element ul = new Element(Tag.valueOf("ul"), "");
        Element li = new Element(Tag.valueOf("li"), "");

        builder.push(html);
        builder.push(body);
        builder.push(ul);
        builder.push(li);

        String[] targets = new String[]{"ol", "ul"};
        builder.popStackToClose(targets);
        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertSame(body, builder.currentElement());
    }

    @Test
    public void popStackToBefore_givenTarget_shouldPopUntilTargetIsCurrent() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tr);

        builder.popStackToBefore("table");
        Assert.assertSame(table, builder.currentElement());
        Assert.assertEquals(2, builder.getStack().size());
    }

    @Test
    public void clearStackToTableContext_givenStack_shouldClearUntilTableOrHtml() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tbody = new Element(Tag.valueOf("tbody"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tbody);
        builder.push(tr);

        builder.clearStackToTableContext();
        Assert.assertSame(table, builder.currentElement());

        builder.pop();
        builder.push(tr);
        builder.clearStackToTableContext();
        Assert.assertSame(html, builder.currentElement());
    }

    @Test
    public void clearStackToTableBodyContext_givenStack_shouldClearUntilTbodyTfootTheadTemplate() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tbody = new Element(Tag.valueOf("tbody"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tbody);
        builder.push(tr);

        builder.clearStackToTableBodyContext();
        Assert.assertSame(tbody, builder.currentElement());
    }

    @Test
    public void clearStackToTableRowContext_givenStack_shouldClearUntilTrOrTemplate() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");
        Element td = new Element(Tag.valueOf("td"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tr);
        builder.push(td);

        builder.clearStackToTableRowContext();
        Assert.assertSame(tr, builder.currentElement());
    }

    @Test
    public void insertOnStackAfter_givenExistingElement_shouldInsertDirectlyAfter() {
        Element first = new Element(Tag.valueOf("div"), "");
        Element third = new Element(Tag.valueOf("span"), "");
        Element second = new Element(Tag.valueOf("p"), "");

        builder.push(first);
        builder.push(third);
        builder.insertOnStackAfter(first, second);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertSame(first, builder.getStack().get(0));
        Assert.assertSame(second, builder.getStack().get(1));
        Assert.assertSame(third, builder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfter_givenMissingElement_shouldThrowException() {
        Element notOnStack = new Element(Tag.valueOf("div"), "");
        Element toInsert = new Element(Tag.valueOf("p"), "");
        builder.insertOnStackAfter(notOnStack, toInsert);
    }

    @Test
    public void replaceOnStack_givenElement_shouldReplaceAtSamePosition() {
        Element first = new Element(Tag.valueOf("div"), "");
        Element second = new Element(Tag.valueOf("p"), "");
        Element replacement = new Element(Tag.valueOf("span"), "");

        builder.push(first);
        builder.push(second);
        builder.replaceOnStack(second, replacement);

        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertSame(replacement, builder.getStack().get(1));
        Assert.assertFalse(builder.onStack(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceOnStack_givenMissingElement_shouldThrowException() {
        Element missing = new Element(Tag.valueOf("div"), "");
        Element replacement = new Element(Tag.valueOf("span"), "");
        builder.replaceOnStack(missing, replacement);
    }

    @Test
    public void insertStartTag_givenTagName_shouldCreateAndAddToStackAndDoc() {
        Element inserted = builder.insertStartTag("p");
        Assert.assertEquals("p", inserted.tagName());
        Assert.assertSame(inserted, builder.currentElement());
        Assert.assertTrue(builder.getDocument().children().contains(inserted));
    }

    @Test
    public void insertStartTagToken_givenNormalStartTag_shouldInsertElement() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("h1");
        Element el = builder.insert(startTag);

        Assert.assertEquals("h1", el.tagName());
        Assert.assertSame(el, builder.currentElement());
    }

    @Test
    public void insertStartTagToken_givenSelfClosingKnownTag_shouldHandleSelfClosing() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        Assert.assertEquals("img", el.tagName());
    }

    @Test
    public void insertStartTagToken_givenSelfClosingCustomTag_shouldMarkTagSelfClosing() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("custom-component");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);
        Assert.assertEquals("custom-component", el.tagName());
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void insertForm_givenFormTag_shouldSetFormElementAndOptionallyAddToStack() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");

        FormElement formEl = builder.insertForm(formTag, true);
        Assert.assertSame(formEl, builder.getFormElement());
        Assert.assertTrue(builder.onStack(formEl));

        Token.StartTag secondFormTag = new Token.StartTag();
        secondFormTag.name("form");
        FormElement formEl2 = builder.insertForm(secondFormTag, false);
        Assert.assertSame(formEl2, builder.getFormElement());
        Assert.assertFalse(builder.getStack().get(builder.getStack().size() - 1) == formEl2);
    }

    @Test
    public void insertComment_givenCommentToken_shouldAppendToCurrentElement() {
        builder.insertStartTag("div");
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("hello world");

        builder.insert(commentToken);
        Element current = builder.currentElement();
        Assert.assertEquals(1, current.childNodeSize());
        Assert.assertTrue(current.childNode(0) instanceof Comment);
        Assert.assertEquals("hello world", ((Comment) current.childNode(0)).getData());
    }

    @Test
    public void insertCharacter_givenCData_shouldAppendCDataNode() {
        builder.insertStartTag("div");
        Token.CData cdataToken = new Token.CData("data content");

        builder.insert(cdataToken);
        Element current = builder.currentElement();
        Assert.assertEquals(1, current.childNodeSize());
        Assert.assertTrue(current.childNode(0) instanceof CDataNode);
    }

    @Test
    public void insertCharacter_givenScriptOrStyleTag_shouldAppendDataNode() {
        builder.insertStartTag("script");
        Token.Character charToken = new Token.Character();
        charToken.data("var x = 1;");

        builder.insert(charToken);
        Element current = builder.currentElement();
        Assert.assertEquals(1, current.childNodeSize());
        Assert.assertTrue(current.childNode(0) instanceof DataNode);
        Assert.assertEquals("var x = 1;", ((DataNode) current.childNode(0)).getWholeData());
    }

    @Test
    public void insertCharacter_givenNormalTag_shouldAppendTextNode() {
        builder.insertStartTag("p");
        Token.Character charToken = new Token.Character();
        charToken.data("plain text");

        builder.insert(charToken);
        Element current = builder.currentElement();
        Assert.assertEquals(1, current.childNodeSize());
        Assert.assertTrue(current.childNode(0) instanceof TextNode);
        Assert.assertEquals("plain text", ((TextNode) current.childNode(0)).text());
    }

    @Test
    public void insertNode_whenFormListedAndFormElementPresent_shouldAddToFormElement() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement form = builder.insertForm(formTag, true);

        Element input = builder.insertStartTag("input");
        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void resetInsertionMode_givenVariousStackNodes_shouldTransitionCorrectly() {
        String[] tags = new String[]{
            "select", "td", "th", "tr", "tbody", "thead", "tfoot",
            "caption", "colgroup", "table", "head", "body", "frameset", "html"
        };

        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
            HtmlTreeBuilderState.InSelect,
            HtmlTreeBuilderState.InCell,
            HtmlTreeBuilderState.InCell,
            HtmlTreeBuilderState.InRow,
            HtmlTreeBuilderState.InTableBody,
            HtmlTreeBuilderState.InTableBody,
            HtmlTreeBuilderState.InTableBody,
            HtmlTreeBuilderState.InCaption,
            HtmlTreeBuilderState.InColumnGroup,
            HtmlTreeBuilderState.InTable,
            HtmlTreeBuilderState.InBody,
            HtmlTreeBuilderState.InBody,
            HtmlTreeBuilderState.InFrameset,
            HtmlTreeBuilderState.BeforeHead
        };

        for (int i = 0; i < tags.length; i++) {
            builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
            Element html = new Element(Tag.valueOf("html"), "");
            Element testEl = new Element(Tag.valueOf(tags[i]), "");
            builder.push(html);
            builder.push(testEl);

            builder.resetInsertionMode();
            Assert.assertEquals("Failed for tag: " + tags[i], expectedStates[i], builder.state());
        }
    }

    @Test
    public void resetInsertionMode_givenOnlyRootElement_shouldTransitionToInBody() {
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
        Element unknown = new Element(Tag.valueOf("div"), "");
        builder.push(unknown);

        builder.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void inScope_variousScopeChecks_shouldReturnAccurateResults() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(table);
        builder.push(div);
        builder.push(p);

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope("div"));
        Assert.assertTrue(builder.inScope("table"));

        Assert.assertTrue(builder.inTableScope("table"));
        Assert.assertFalse(builder.inTableScope("div"));

        Element ol = new Element(Tag.valueOf("ol"), "");
        Element li = new Element(Tag.valueOf("li"), "");
        builder.push(ol);
        builder.push(li);

        Assert.assertTrue(builder.inListItemScope("li"));
        Assert.assertFalse(builder.inListItemScope("div"));

        Element button = new Element(Tag.valueOf("button"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        builder.push(button);
        builder.push(span);

        Assert.assertTrue(builder.inButtonScope("span"));
        Assert.assertFalse(builder.inButtonScope("div"));

        Assert.assertTrue(builder.inScope(new String[]{"span", "a"}));
    }

    @Test
    public void inSelectScope_givenOptionsAndTarget_shouldEvaluateCorrectly() {
        Element select = new Element(Tag.valueOf("select"), "");
        Element optgroup = new Element(Tag.valueOf("optgroup"), "");
        Element option = new Element(Tag.valueOf("option"), "");

        builder.push(select);
        builder.push(optgroup);
        builder.push(option);

        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertTrue(builder.inSelectScope("optgroup"));
        Assert.assertFalse(builder.inSelectScope("select"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inSelectScope_givenEmptyStack_shouldFailAssertion() {
        builder.inSelectScope("option");
    }

    @Test
    public void generateImpliedEndTags_givenImpliedTags_shouldPopUntilNonImplied() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf("body"), ""));
        builder.push(new Element(Tag.valueOf("p"), ""));
        builder.push(new Element(Tag.valueOf("li"), ""));

        builder.generateImpliedEndTags();
        Assert.assertEquals("body", builder.currentElement().tagName());

        builder.push(new Element(Tag.valueOf("p"), ""));
        builder.push(new Element(Tag.valueOf("li"), ""));
        builder.generateImpliedEndTags("li");
        Assert.assertEquals("li", builder.currentElement().tagName());
    }

    @Test
    public void isSpecial_givenSpecialAndNonSpecialTags_shouldReturnExpected() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");
        Element custom = new Element(Tag.valueOf("custom-tag"), "");

        Assert.assertTrue(builder.isSpecial(div));
        Assert.assertTrue(builder.isSpecial(p));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void activeFormattingElements_pushLimitAndDeduplication_shouldEnforceThreeSameRule() {
        Element span1 = new Element(Tag.valueOf("span"), "");
        span1.attr("class", "highlight");
        Element span2 = new Element(Tag.valueOf("span"), "");
        span2.attr("class", "highlight");
        Element span3 = new Element(Tag.valueOf("span"), "");
        span3.attr("class", "highlight");
        Element span4 = new Element(Tag.valueOf("span"), "");
        span4.attr("class", "highlight");

        builder.pushActiveFormattingElements(span1);
        builder.pushActiveFormattingElements(span2);
        builder.pushActiveFormattingElements(span3);

        Assert.assertSame(span3, builder.lastFormattingElement());
        Assert.assertTrue(builder.isInActiveFormattingElements(span1));

        builder.pushActiveFormattingElements(span4);

        Assert.assertFalse(builder.isInActiveFormattingElements(span1));
        Assert.assertTrue(builder.isInActiveFormattingElements(span2));
        Assert.assertTrue(builder.isInActiveFormattingElements(span3));
        Assert.assertTrue(builder.isInActiveFormattingElements(span4));
    }

    @Test
    public void activeFormattingElements_markerAndClear_shouldClearToLastMarker() {
        Element b = new Element(Tag.valueOf("b"), "");
        Element i = new Element(Tag.valueOf("i"), "");

        builder.pushActiveFormattingElements(b);
        builder.insertMarkerToFormattingElements();
        builder.pushActiveFormattingElements(i);

        Assert.assertSame(i, builder.getActiveFormattingElement("i"));
        Assert.assertNotNull(builder.lastFormattingElement());

        builder.clearFormattingElementsToLastMarker();

        Assert.assertSame(b, builder.lastFormattingElement());
        Assert.assertNull(builder.getActiveFormattingElement("i"));
    }

    @Test
    public void activeFormattingElements_removeAndReplace_shouldUpdateListCorrectly() {
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        Element c = new Element(Tag.valueOf("c"), "");

        builder.pushActiveFormattingElements(a);
        builder.pushActiveFormattingElements(b);

        Assert.assertTrue(builder.isInActiveFormattingElements(a));
        builder.replaceActiveFormattingElement(a, c);
        Assert.assertFalse(builder.isInActiveFormattingElements(a));
        Assert.assertTrue(builder.isInActiveFormattingElements(c));

        builder.removeFromActiveFormattingElements(b);
        Assert.assertFalse(builder.isInActiveFormattingElements(b));

        Element removed = builder.removeLastFormattingElement();
        Assert.assertSame(c, removed);
        Assert.assertNull(builder.removeLastFormattingElement());
    }

    @Test
    public void reconstructFormattingElements_whenUnopenedElementsExist_shouldInsertThemToStack() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.push(html);
        builder.push(body);

        Element b = new Element(Tag.valueOf("b"), "");
        b.attr("class", "bold-text");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();

        Assert.assertEquals("b", builder.currentElement().tagName());
        Assert.assertEquals("bold-text", builder.currentElement().attr("class"));
        Assert.assertTrue(builder.onStack(builder.lastFormattingElement()));
    }

    @Test
    public void reconstructFormattingElements_whenAllOnStackOrEmpty_shouldNoOp() {
        builder.reconstructFormattingElements();

        Element b = new Element(Tag.valueOf("b"), "");
        builder.push(b);
        builder.pushActiveFormattingElements(b);

        int stackSizeBefore = builder.getStack().size();
        builder.reconstructFormattingElements();
        Assert.assertEquals(stackSizeBefore, builder.getStack().size());
    }

    @Test
    public void insertInFosterParent_whenTableHasParent_shouldInsertBeforeTable() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        body.appendChild(table);

        builder.push(html);
        builder.push(body);
        builder.push(table);

        TextNode textNode = new TextNode("fostered text");
        builder.setFosterInserts(true);
        builder.insert(new Token.Character().data("fostered text"));

        Assert.assertSame(body, textNode.parent() == null ? body : textNode.parent());
        Assert.assertEquals("table", body.child(1).tagName());
    }

    @Test
    public void insertInFosterParent_whenTableHasNoParent_shouldAppendToAboveOnStack() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");

        builder.push(html);
        builder.push(table);

        TextNode textNode = new TextNode("fostered");
        builder.insertInFosterParent(textNode);

        Assert.assertSame(html, textNode.parent());
    }

    @Test
    public void insertInFosterParent_whenNoTableOnStack_shouldAppendToRoot() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        TextNode textNode = new TextNode("fostered");
        builder.insertInFosterParent(textNode);

        Assert.assertSame(html, textNode.parent());
    }

    @Test
    public void parseFragment_withVariousContextElements_shouldReturnChildNodes() {
        Element divContext = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = builder.parseFragment("<p>fragment</p>", divContext, "http://example.com/", parser);

        Assert.assertFalse(nodes.isEmpty());
        Assert.assertEquals("p", ((Element) nodes.get(0)).tagName());

        Element titleContext = new Element(Tag.valueOf("title"), "");
        List<Node> titleNodes = builder.parseFragment("sample text", titleContext, "http://example.com/", parser);
        Assert.assertFalse(titleNodes.isEmpty());

        Element scriptContext = new Element(Tag.valueOf("script"), "");
        List<Node> scriptNodes = builder.parseFragment("console.log('hi');", scriptContext, "http://example.com/", parser);
        Assert.assertFalse(scriptNodes.isEmpty());

        Element styleContext = new Element(Tag.valueOf("style"), "");
        List<Node> styleNodes = builder.parseFragment("body { color: red; }", styleContext, "http://example.com/", parser);
        Assert.assertFalse(styleNodes.isEmpty());

        Element noscriptContext = new Element(Tag.valueOf("noscript"), "");
        List<Node> noscriptNodes = builder.parseFragment("noscript content", noscriptContext, "http://example.com/", parser);
        Assert.assertFalse(noscriptNodes.isEmpty());

        Element plaintextContext = new Element(Tag.valueOf("plaintext"), "");
        List<Node> plainNodes = builder.parseFragment("plain content", plaintextContext, "http://example.com/", parser);
        Assert.assertFalse(plainNodes.isEmpty());

        List<Node> nullContextNodes = builder.parseFragment("<div>root content</div>", null, "http://example.com/", parser);
        Assert.assertFalse(nullContextNodes.isEmpty());
    }

    @Test
    public void parseFragment_withFormParentContext_shouldAttachFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "");
        form.appendChild(div);

        List<Node> nodes = builder.parseFragment("<input name='foo'>", div, "http://example.com/", parser);
        Assert.assertFalse(nodes.isEmpty());
        Assert.assertNotNull(builder.getFormElement());
        Assert.assertSame(form, builder.getFormElement());
    }

    @Test
    public void toString_whenCalled_shouldContainStateAndCurrentElement() {
        builder.push(new Element(Tag.valueOf("html"), ""));
        String str = builder.toString();

        Assert.assertTrue(str.contains("TreeBuilder{"));
        Assert.assertTrue(str.contains("state="));
        Assert.assertTrue(str.contains("currentElement="));
    }
}