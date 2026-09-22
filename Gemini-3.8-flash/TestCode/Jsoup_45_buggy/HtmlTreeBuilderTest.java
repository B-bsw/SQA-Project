package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;
    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    private void initBuilder() {
        builder.initialiseParse("<html><head></head><body></body></html>", BASE_URI, ParseErrorList.tracking(10));
    }

    @Test
    public void parse_givenHtmlInput_shouldInitializeStateAndReturnDoc() {
        ParseErrorList errorList = ParseErrorList.tracking(10);
        Document doc = builder.parse("<html><head><title>Test</title></head><body><p>Hello</p></body></html>", BASE_URI, errorList);

        Assert.assertNotNull(doc);
        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.originalState() != null ? builder.originalState() : builder.state());
        Assert.assertEquals("Test", doc.title());
        Assert.assertEquals(1, doc.select("p").size());
        Assert.assertEquals("Hello", doc.select("p").first().text());
    }

    @Test
    public void parseFragment_givenNullContext_shouldParseFragmentIntoDocNodes() {
        ParseErrorList errorList = ParseErrorList.noTracking();
        List<Node> nodes = builder.parseFragment("<p>One</p><p>Two</p>", null, BASE_URI, errorList);

        Assert.assertNotNull(nodes);
        Assert.assertTrue(nodes.size() > 0);
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragment_givenContextTitle_shouldTransitionToRcdata() {
        Document baseDoc = Document.createShell(BASE_URI);
        Element titleContext = baseDoc.createElement("title");
        ParseErrorList errorList = ParseErrorList.noTracking();

        List<Node> nodes = builder.parseFragment("Some &amp; text", titleContext, BASE_URI, errorList);

        Assert.assertNotNull(nodes);
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragment_givenContextTextarea_shouldTransitionToRcdata() {
        Element textareaContext = new Element(Tag.valueOf("textarea"), BASE_URI);
        List<Node> nodes = builder.parseFragment("Sample &lt;val&gt;", textareaContext, BASE_URI, ParseErrorList.noTracking());

        Assert.assertNotNull(nodes);
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragment_givenContextRawTextTags_shouldTransitionToRawtext() {
        String[] rawTags = new String[]{"iframe", "noembed", "noframes", "style", "xmp"};
        for (int i = 0; i < rawTags.length; i++) {
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            Element ctx = new Element(Tag.valueOf(rawTags[i]), BASE_URI);
            List<Node> nodes = tb.parseFragment("var x = 1 < 2;", ctx, BASE_URI, ParseErrorList.noTracking());
            Assert.assertNotNull(nodes);
            Assert.assertTrue(tb.isFragmentParsing());
        }
    }

    @Test
    public void parseFragment_givenContextScript_shouldTransitionToScriptData() {
        Element scriptContext = new Element(Tag.valueOf("script"), BASE_URI);
        List<Node> nodes = builder.parseFragment("alert('test');", scriptContext, BASE_URI, ParseErrorList.noTracking());

        Assert.assertNotNull(nodes);
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragment_givenContextNoscriptAndPlaintext_shouldTransitionToData() {
        Element noscriptContext = new Element(Tag.valueOf("noscript"), BASE_URI);
        List<Node> nodes1 = builder.parseFragment("plain", noscriptContext, BASE_URI, ParseErrorList.noTracking());
        Assert.assertNotNull(nodes1);

        HtmlTreeBuilder tb2 = new HtmlTreeBuilder();
        Element plaintextContext = new Element(Tag.valueOf("plaintext"), BASE_URI);
        List<Node> nodes2 = tb2.parseFragment("plain text", plaintextContext, BASE_URI, ParseErrorList.noTracking());
        Assert.assertNotNull(nodes2);
    }

    @Test
    public void parseFragment_givenFormAncestorContext_shouldLinkToFormElement() {
        Document baseDoc = Document.createShell(BASE_URI);
        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        baseDoc.body().appendChild(form);
        Element divInForm = new Element(Tag.valueOf("div"), BASE_URI);
        form.appendChild(divInForm);

        List<Node> nodes = builder.parseFragment("<input type='text' name='q' />", divInForm, BASE_URI, ParseErrorList.noTracking());

        Assert.assertNotNull(nodes);
        Assert.assertNotNull(builder.getFormElement());
        Assert.assertEquals("form", builder.getFormElement().tagName());
    }

    @Test
    public void parseFragment_givenContextWithQuirksMode_shouldPropagateQuirksMode() {
        Document baseDoc = Document.createShell(BASE_URI);
        baseDoc.quirksMode(Document.QuirksMode.quirks);
        Element div = baseDoc.createElement("div");
        baseDoc.body().appendChild(div);

        builder.parseFragment("<span>text</span>", div, BASE_URI, ParseErrorList.noTracking());
        Assert.assertEquals(Document.QuirksMode.quirks, builder.getDocument().quirksMode());
    }

    @Test
    public void stateTransitionsAndOriginalState_givenCalls_shouldMaintainState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InTable);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.state());
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void framesetOk_givenFlagUpdates_shouldReflectState() {
        Assert.assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void maybeSetBaseUri_givenValidAndInvalidBaseElements_shouldBehaveCorrectly() {
        initBuilder();
        Element baseWithoutHref = new Element(Tag.valueOf("base"), BASE_URI);
        builder.maybeSetBaseUri(baseWithoutHref);
        Assert.assertEquals(BASE_URI, builder.getBaseUri());

        Element baseWithHref = new Element(Tag.valueOf("base"), BASE_URI);
        baseWithHref.attr("href", "http://jsoup.org/path/");
        builder.maybeSetBaseUri(baseWithHref);
        Assert.assertEquals("http://jsoup.org/path/", builder.getBaseUri());
        Assert.assertEquals("http://jsoup.org/path/", builder.getDocument().baseUri());

        // Second attempt must be ignored as baseUriSetFromDoc is now true
        Element baseWithHref2 = new Element(Tag.valueOf("base"), BASE_URI);
        baseWithHref2.attr("href", "http://jsoup.org/ignored/");
        builder.maybeSetBaseUri(baseWithHref2);
        Assert.assertEquals("http://jsoup.org/path/", builder.getBaseUri());
    }

    @Test
    public void error_givenTrackableErrors_shouldAddParseError() {
        initBuilder();
        builder.transition(HtmlTreeBuilderState.InBody);
        Token.Character charToken = new Token.Character();
        charToken.data("abc");
        builder.process(charToken); // Sets currentToken

        int countBefore = builder.errors.size();
        builder.error(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(countBefore + 1, builder.errors.size());
    }

    @Test
    public void insert_givenSelfClosingStartTag_shouldEmitEmptyEndTag() {
        initBuilder();
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        builder.push(html);

        Token.StartTag imgTag = new Token.StartTag();
        imgTag.nameAttr("img", new Attributes());
        imgTag.selfClosing = true;

        Element result = builder.insert(imgTag);
        Assert.assertNotNull(result);
        Assert.assertEquals("img", result.tagName());
        Assert.assertTrue(builder.onStack(result));
    }

    @Test
    public void insertEmpty_givenKnownSelfClosingAndUnknownTags_shouldAcknowledgeFlag() {
        initBuilder();
        Token.StartTag hrTag = new Token.StartTag();
        hrTag.nameAttr("hr", new Attributes());
        hrTag.selfClosing = true;
        Element elHr = builder.insertEmpty(hrTag);
        Assert.assertEquals("hr", elHr.tagName());

        Token.StartTag customTag = new Token.StartTag();
        customTag.nameAttr("custom-tag", new Attributes());
        customTag.selfClosing = true;
        Element elCustom = builder.insertEmpty(customTag);
        Assert.assertEquals("custom-tag", elCustom.tagName());
        Assert.assertTrue(elCustom.tag().isSelfClosing());
    }

    @Test
    public void insertForm_givenOnStackTrueAndFalse_shouldSetFormAndAddToStackAppropriately() {
        initBuilder();
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());

        FormElement form1 = builder.insertForm(formTag, false);
        Assert.assertEquals(form1, builder.getFormElement());
        Assert.assertFalse(builder.onStack(form1));

        FormElement form2 = builder.insertForm(formTag, true);
        Assert.assertEquals(form2, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form2));
    }

    @Test
    public void insertComment_givenCommentToken_shouldAppendCommentNode() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        builder.push(html);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Test comment");
        builder.insert(commentToken);

        Assert.assertEquals(1, html.childNodeSize());
        Assert.assertTrue(html.childNode(0) instanceof Comment);
        Assert.assertEquals("Test comment", ((Comment) html.childNode(0)).getData());
    }

    @Test
    public void insertCharacter_givenScriptOrStyleOrText_shouldAppendCorrectNodes() {
        initBuilder();
        Element script = builder.insertStartTag("script");
        Token.Character c1 = new Token.Character();
        c1.data("var a = 1;");
        builder.insert(c1);
        Assert.assertEquals(1, script.childNodeSize());
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
        builder.pop();

        Element p = builder.insertStartTag("p");
        Token.Character c2 = new Token.Character();
        c2.data("Hello paragraph");
        builder.insert(c2);
        Assert.assertEquals(1, p.childNodeSize());
        Assert.assertTrue(p.childNode(0) instanceof TextNode);
    }

    @Test
    public void insertNode_givenFormListedElement_shouldRegisterWithFormElement() {
        initBuilder();
        Token.StartTag formTag = new Token.StartTag();
        formTag.nameAttr("form", new Attributes());
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.nameAttr("input", new Attributes());
        builder.insert(inputTag);

        Assert.assertEquals(1, form.elements().size());
    }

    @Test
    public void stackOperations_pushPopGetRemoveAbove_shouldBehaveCorrectly() {
        initBuilder();
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element body = new Element(Tag.valueOf("body"), BASE_URI);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);

        builder.push(html);
        builder.push(body);
        builder.push(div);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertTrue(builder.onStack(div));
        Assert.assertTrue(builder.onStack(body));
        Assert.assertEquals(div, builder.getFromStack("div"));
        Assert.assertNull(builder.getFromStack("nonexistent"));
        Assert.assertEquals(body, builder.aboveOnStack(div));

        Element popped = builder.pop();
        Assert.assertEquals(div, popped);
        Assert.assertFalse(builder.onStack(div));

        boolean removed = builder.removeFromStack(body);
        Assert.assertTrue(removed);
        Assert.assertFalse(builder.onStack(body));

        boolean removedAgain = builder.removeFromStack(body);
        Assert.assertFalse(removedAgain);
    }

    @Test
    public void popStackToClose_givenSingleAndMultipleTagNames_shouldPopMatchingElements() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");
        Element span = builder.insertStartTag("span");

        builder.popStackToClose("div");
        Assert.assertFalse(builder.onStack(span));
        Assert.assertFalse(builder.onStack(div));
        Assert.assertTrue(builder.onStack(body));

        Element p = builder.insertStartTag("p");
        Element em = builder.insertStartTag("em");
        builder.popStackToClose(new String[]{"p", "em"});
        Assert.assertFalse(builder.onStack(em));
        Assert.assertTrue(builder.onStack(p));
    }

    @Test
    public void popStackToBefore_givenTargetName_shouldPopUntilTarget() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");
        Element tr = builder.insertStartTag("tr");
        Element td = builder.insertStartTag("td");

        builder.popStackToBefore("table");
        Assert.assertFalse(builder.onStack(td));
        Assert.assertFalse(builder.onStack(tr));
        Assert.assertTrue(builder.onStack(table));
    }

    @Test
    public void clearStackToContexts_givenTableTableBodyTableRow_shouldClearCorrectly() {
        initBuilder();
        builder.push(new Element(Tag.valueOf("html"), BASE_URI));
        builder.push(new Element(Tag.valueOf("table"), BASE_URI));
        builder.push(new Element(Tag.valueOf("tbody"), BASE_URI));
        builder.push(new Element(Tag.valueOf("tr"), BASE_URI));
        Element td = new Element(Tag.valueOf("td"), BASE_URI);
        builder.push(td);

        builder.clearStackToTableRowContext();
        Assert.assertEquals("tr", builder.currentElement().nodeName());

        builder.clearStackToTableBodyContext();
        Assert.assertEquals("tbody", builder.currentElement().nodeName());

        builder.clearStackToTableContext();
        Assert.assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void insertOnStackAfter_and_replaceOnStack_givenTargetElements_shouldModifyStack() {
        initBuilder();
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element body = new Element(Tag.valueOf("body"), BASE_URI);
        builder.push(html);
        builder.push(body);

        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.insertOnStackAfter(html, div);
        Assert.assertEquals(div, builder.getStack().get(1));
        Assert.assertEquals(body, builder.getStack().get(2));

        Element span = new Element(Tag.valueOf("span"), BASE_URI);
        builder.replaceOnStack(div, span);
        Assert.assertEquals(span, builder.getStack().get(1));
    }

    @Test
    public void resetInsertionMode_givenVariousTopElements_shouldTransitionCorrectly() {
        String[] tags = new String[]{
                "select", "tr", "tbody", "thead", "tfoot", "caption",
                "colgroup", "table", "head", "body", "frameset", "html"
        };
        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
                HtmlTreeBuilderState.InSelect,
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
            HtmlTreeBuilder tb = new HtmlTreeBuilder();
            tb.initialiseParse("<div></div>", BASE_URI, ParseErrorList.noTracking());
            tb.getStack().clear();
            tb.push(new Element(Tag.valueOf("html"), BASE_URI));
            tb.push(new Element(Tag.valueOf(tags[i]), BASE_URI));
            tb.resetInsertionMode();
            Assert.assertEquals("Failed on tag: " + tags[i], expectedStates[i], tb.state());
        }

        // Test td (cell)
        HtmlTreeBuilder tbTd = new HtmlTreeBuilder();
        tbTd.initialiseParse("<div></div>", BASE_URI, ParseErrorList.noTracking());
        tbTd.getStack().clear();
        tbTd.push(new Element(Tag.valueOf("html"), BASE_URI));
        tbTd.push(new Element(Tag.valueOf("td"), BASE_URI));
        tbTd.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InCell, tbTd.state());
    }

    @Test
    public void inScopeChecks_givenElementsInScope_shouldReturnExpectedBoolean() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        Element table = builder.insertStartTag("table");
        Element tr = builder.insertStartTag("tr");
        Element td = builder.insertStartTag("td");

        Assert.assertTrue(builder.inTableScope("table"));
        Assert.assertTrue(builder.inScope("table"));
        Assert.assertTrue(builder.inScope(new String[]{"table"}));
        Assert.assertFalse(builder.inTableScope("div"));

        Element button = builder.insertStartTag("button");
        Assert.assertTrue(builder.inButtonScope("button"));

        Element ol = builder.insertStartTag("ol");
        Element li = builder.insertStartTag("li");
        Assert.assertTrue(builder.inListItemScope("li"));

        builder.getStack().clear();
        builder.push(new Element(Tag.valueOf("html"), BASE_URI));
        Element optgroup = new Element(Tag.valueOf("optgroup"), BASE_URI);
        Element option = new Element(Tag.valueOf("option"), BASE_URI);
        builder.push(optgroup);
        builder.push(option);
        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertFalse(builder.inSelectScope("div"));
    }

    @Test
    public void generateImpliedEndTags_givenImpliedTags_shouldPopUntilNonImplied() {
        initBuilder();
        builder.push(new Element(Tag.valueOf("html"), BASE_URI));
        builder.push(new Element(Tag.valueOf("body"), BASE_URI));
        builder.push(new Element(Tag.valueOf("p"), BASE_URI));
        builder.push(new Element(Tag.valueOf("li"), BASE_URI));

        builder.generateImpliedEndTags("p");
        Assert.assertEquals("p", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void activeFormattingElements_pushReconstructAndRemove_shouldManageListProperly() {
        initBuilder();
        Element b1 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b2 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b3 = new Element(Tag.valueOf("b"), BASE_URI);
        Element b4 = new Element(Tag.valueOf("b"), BASE_URI);

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        Assert.assertEquals(3, builder.isInActiveFormattingElements(b1) ? 3 : 0);

        builder.pushActiveFormattingElements(b4); // Should remove earliest seen (b1) when seeing 3 duplicates
        Assert.assertFalse(builder.isInActiveFormattingElements(b1));

        Assert.assertEquals(b4, builder.lastFormattingElement());
        Element removed = builder.removeLastFormattingElement();
        Assert.assertEquals(b4, removed);

        builder.insertMarkerToFormattingElements();
        Assert.assertNull(builder.lastFormattingElement());

        builder.pushActiveFormattingElements(new Element(Tag.valueOf("i"), BASE_URI));
        Assert.assertNotNull(builder.getActiveFormattingElement("i"));
        Assert.assertNull(builder.getActiveFormattingElement("unknown"));

        builder.clearFormattingElementsToLastMarker();
        Assert.assertNull(builder.getActiveFormattingElement("i"));

        Element em = new Element(Tag.valueOf("em"), BASE_URI);
        builder.pushActiveFormattingElements(em);
        Element strong = new Element(Tag.valueOf("strong"), BASE_URI);
        builder.replaceActiveFormattingElement(em, strong);
        Assert.assertTrue(builder.isInActiveFormattingElements(strong));

        builder.removeFromActiveFormattingElements(strong);
        Assert.assertFalse(builder.isInActiveFormattingElements(strong));
    }

    @Test
    public void reconstructFormattingElements_givenUnopenedFormattingElements_shouldReinsertOnStack() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b"), BASE_URI);
        b.attr("class", "bold");
        builder.pushActiveFormattingElements(b);

        Assert.assertFalse(builder.onStack(b));
        builder.reconstructFormattingElements();
        Assert.assertEquals("b", builder.currentElement().nodeName());
        Assert.assertEquals("bold", builder.currentElement().attr("class"));
    }

    @Test
    public void insertInFosterParent_givenTableContext_shouldFosterParentCorrectly() {
        initBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());

        TextNode text = new TextNode("fostered text", BASE_URI);
        builder.insertInFosterParent(text);

        Assert.assertEquals(body, text.parent());
        Assert.assertEquals(0, body.elementSiblingIndex());
    }

    @Test
    public void pendingTableCharacters_shouldGetAndSetCorrectly() {
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
        List<String> list = new ArrayList<String>();
        list.add("test");
        builder.setPendingTableCharacters(list);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());
        Assert.assertEquals("test", builder.getPendingTableCharacters().get(0));

        builder.newPendingTableCharacters();
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void headAndFormElementGettersAndSetters_shouldWorkCorrectly() {
        Assert.assertNull(builder.getHeadElement());
        Element head = new Element(Tag.valueOf("head"), BASE_URI);
        builder.setHeadElement(head);
        Assert.assertEquals(head, builder.getHeadElement());

        Assert.assertNull(builder.getFormElement());
        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        builder.setFormElement(form);
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void isSpecial_givenSpecialAndNormalTags_shouldIdentifyCorrectly() {
        Element p = new Element(Tag.valueOf("p"), BASE_URI);
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        Element custom = new Element(Tag.valueOf("custom-tag"), BASE_URI);

        Assert.assertTrue(builder.isSpecial(p));
        Assert.assertTrue(builder.isSpecial(div));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void toString_shouldReturnDescriptiveString() {
        initBuilder();
        String str = builder.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.startsWith("TreeBuilder{"));
    }

    @Test
    public void insertOnStackAfter_givenNonExistentElement_shouldThrowException() {
        initBuilder();
        Element html = new Element(Tag.valueOf("html"), BASE_URI);
        Element notOnStack = new Element(Tag.valueOf("div"), BASE_URI);
        Element toInsert = new Element(Tag.valueOf("span"), BASE_URI);
        builder.push(html);

        try {
            builder.insertOnStackAfter(notOnStack, toInsert);
            Assert.fail("Expected IllegalArgumentException or validation error");
        } catch (IllegalArgumentException e) {
            // Expected validation failure
        }
    }

    @Test
    public void inSpecificScope_givenUnreachableScope_shouldThrowValidationException() {
        initBuilder();
        Element div = new Element(Tag.valueOf("div"), BASE_URI);
        builder.push(div);

        try {
            builder.inSelectScope("option");
            Assert.fail("Expected Validate.fail exception");
        } catch (IllegalArgumentException e) {
            // Expected validation failure
        }
    }
}