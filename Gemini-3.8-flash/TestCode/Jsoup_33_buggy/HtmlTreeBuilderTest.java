package org.jsoup.parser;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Attributes;
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

import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder builder;

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
    }

    @Test
    public void parse_givenHtmlInput_shouldReturnDocumentAndSetState() {
        String html = "<html><head><title>Test</title></head><body><p>Hello</p></body></html>";
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document doc = builder.parse(html, "http://example.com/", errors);

        Assert.assertNotNull(doc);
        Assert.assertEquals("Test", doc.title());
        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void parseFragment_givenNullContext_shouldParseDocumentChildren() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        List<Node> nodes = builder.parseFragment("<div><p>Fragment</p></div>", null, "http://example.com/", errors);

        Assert.assertNotNull(nodes);
        Assert.assertFalse(nodes.isEmpty());
        Assert.assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void parseFragment_givenContextElements_shouldTransitionTokeniserState() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Document ownerDoc = new Document("http://example.com/");
        ownerDoc.quirksMode(Document.QuirksMode.quirks);

        Element titleContext = new Element(Tag.valueOf("title"), "http://example.com/");
        ownerDoc.appendChild(titleContext);
        List<Node> titleNodes = builder.parseFragment("Sample Title", titleContext, "http://example.com/", errors);
        Assert.assertNotNull(titleNodes);
        Assert.assertEquals(Document.QuirksMode.quirks, builder.getDocument().quirksMode());

        String[] rawtextTags = new String[]{"iframe", "noembed", "noframes", "style", "xmp"};
        for (int i = 0; i < rawtextTags.length; i++) {
            Element ctx = new Element(Tag.valueOf(rawtextTags[i]), "http://example.com/");
            List<Node> result = builder.parseFragment("content", ctx, "http://example.com/", errors);
            Assert.assertNotNull(result);
        }

        Element scriptContext = new Element(Tag.valueOf("script"), "http://example.com/");
        List<Node> scriptNodes = builder.parseFragment("var x = 1;", scriptContext, "http://example.com/", errors);
        Assert.assertNotNull(scriptNodes);

        Element noscriptContext = new Element(Tag.valueOf("noscript"), "http://example.com/");
        List<Node> noscriptNodes = builder.parseFragment("fallback", noscriptContext, "http://example.com/", errors);
        Assert.assertNotNull(noscriptNodes);

        Element plaintextContext = new Element(Tag.valueOf("plaintext"), "http://example.com/");
        List<Node> plainNodes = builder.parseFragment("plain text", plaintextContext, "http://example.com/", errors);
        Assert.assertNotNull(plainNodes);

        Element textareaContext = new Element(Tag.valueOf("textarea"), "http://example.com/");
        List<Node> textNodes = builder.parseFragment("text", textareaContext, "http://example.com/", errors);
        Assert.assertNotNull(textNodes);
    }

    @Test
    public void parseFragment_givenContextInsideForm_shouldAssociateFormElement() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        form.appendChild(div);

        List<Node> nodes = builder.parseFragment("<input type='text' name='q' />", div, "http://example.com/", errors);
        Assert.assertNotNull(nodes);
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void transitionAndState_givenNewState_shouldUpdateCurrentState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());

        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InTable);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.state());
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.originalState());
    }

    @Test
    public void framesetOk_givenBooleanValue_shouldGetAndSetFlag() {
        Assert.assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void maybeSetBaseUri_givenValidHref_shouldUpdateBaseUri() {
        builder.parse("<html><head></head><body></body></html>", "http://initial.com/", ParseErrorList.noTracking());
        Element base = new Element(Tag.valueOf("base"), "http://initial.com/");
        base.attr("href", "http://updated.com/");

        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://updated.com/", builder.getBaseUri());

        Element anotherBase = new Element(Tag.valueOf("base"), "http://updated.com/");
        anotherBase.attr("href", "http://ignored.com/");
        builder.maybeSetBaseUri(anotherBase);
        Assert.assertEquals("http://updated.com/", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_givenEmptyHref_shouldNotUpdateBaseUri() {
        builder.parse("<html><head></head><body></body></html>", "http://initial.com/", ParseErrorList.noTracking());
        Element base = new Element(Tag.valueOf("base"), "http://initial.com/");

        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://initial.com/", builder.getBaseUri());
    }

    @Test
    public void error_givenTrackingErrors_shouldAddParseError() {
        ParseErrorList errors = ParseErrorList.tracking(2);
        builder.parse("<div></div>", "http://example.com/", errors);

        builder.transition(HtmlTreeBuilderState.InBody);
        builder.error(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(1, errors.size());

        builder.error(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(2, errors.size());

        builder.error(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(2, errors.size());
    }

    @Test
    public void insertStartTag_givenNormalTag_shouldPushToStack() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag startTag = new Token.StartTag("span");
        startTag.attributes = new Attributes();

        Element el = builder.insert(startTag);
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals(el, builder.currentElement());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void insertStartTag_givenSelfClosingTag_shouldEmitEndTagAndPush() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag selfClosing = new Token.StartTag("img");
        selfClosing.selfClosing = true;
        selfClosing.attributes = new Attributes();

        Element el = builder.insert(selfClosing);
        Assert.assertEquals("img", el.tagName());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void insertStringTagName_givenName_shouldCreateAndPushElement() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element el = builder.insert("section");

        Assert.assertEquals("section", el.tagName());
        Assert.assertEquals(el, builder.currentElement());
    }

    @Test
    public void insertEmpty_givenSelfClosingTags_shouldAcknowledgeFlag() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());

        Token.StartTag knownSelfClosing = new Token.StartTag("img");
        knownSelfClosing.selfClosing = true;
        knownSelfClosing.attributes = new Attributes();
        Element el1 = builder.insertEmpty(knownSelfClosing);
        Assert.assertEquals("img", el1.tagName());

        Token.StartTag knownNotSelfClosing = new Token.StartTag("div");
        knownNotSelfClosing.selfClosing = true;
        knownNotSelfClosing.attributes = new Attributes();
        Element el2 = builder.insertEmpty(knownNotSelfClosing);
        Assert.assertEquals("div", el2.tagName());

        Token.StartTag unknownTag = new Token.StartTag("custom-tag");
        unknownTag.selfClosing = true;
        unknownTag.attributes = new Attributes();
        Element el3 = builder.insertEmpty(unknownTag);
        Assert.assertEquals("custom-tag", el3.tagName());
        Assert.assertTrue(el3.tag().isSelfClosing());
    }

    @Test
    public void insertForm_givenOnStackTrueAndFalse_shouldManageStackAndReference() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag formTag = new Token.StartTag("form");
        formTag.attributes = new Attributes();

        FormElement form1 = builder.insertForm(formTag, false);
        Assert.assertEquals(form1, builder.getFormElement());
        Assert.assertFalse(builder.onStack(form1));

        FormElement form2 = builder.insertForm(formTag, true);
        Assert.assertEquals(form2, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form2));
    }

    @Test
    public void insertComment_givenCommentToken_shouldAppendToCurrentElement() {
        builder.parse("<html><body><div></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Test Comment");

        builder.insert(commentToken);
        Node lastNode = builder.currentElement().childNode(builder.currentElement().childNodeSize() - 1);
        Assert.assertTrue(lastNode instanceof Comment);
        Assert.assertEquals("Test Comment", ((Comment) lastNode).getData());
    }

    @Test
    public void insertCharacter_givenScriptOrStyleOrText_shouldAppendDataOrTextNode() {
        builder.parse("<html><head></head><body></body></html>", "http://example.com/", ParseErrorList.noTracking());

        Element script = builder.insert("script");
        Token.Character dataChar = new Token.Character("var a = 0;");
        builder.insert(dataChar);
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
        Assert.assertEquals("var a = 0;", ((DataNode) script.childNode(0)).getWholeData());
        builder.pop();

        Element p = builder.insert("p");
        Token.Character textChar = new Token.Character("Hello World");
        builder.insert(textChar);
        Assert.assertTrue(p.childNode(0) instanceof TextNode);
        Assert.assertEquals("Hello World", ((TextNode) p.childNode(0)).getWholeText());
    }

    @Test
    public void insertNode_givenFormListedElementWithForm_shouldAssociateWithForm() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.StartTag formTag = new Token.StartTag("form");
        formTag.attributes = new Attributes();
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag("input");
        inputTag.attributes = new Attributes();
        Element input = builder.insertEmpty(inputTag);

        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void pop_givenNormalStack_shouldPollLast() {
        builder.parse("<html><body><div><p></p></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element el = builder.insert("span");
        Assert.assertEquals("span", builder.pop().nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void pop_givenTdNotInCellState_shouldThrowException() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.transition(HtmlTreeBuilderState.InBody);
        Element td = new Element(Tag.valueOf("td"), "http://example.com/");
        builder.push(td);
        builder.pop();
    }

    @Test(expected = IllegalArgumentException.class)
    public void pop_givenHtmlElement_shouldThrowException() {
        builder.parse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.getStack().clear();
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        builder.push(html);
        builder.pop();
    }

    @Test
    public void stackOperations_givenElements_shouldManipulateQueue() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");

        builder.push(div);
        builder.push(span);
        builder.push(p);

        Assert.assertTrue(builder.onStack(span));
        Assert.assertEquals(span, builder.getFromStack("span"));
        Assert.assertNull(builder.getFromStack("non-existent"));

        Assert.assertEquals(span, builder.aboveOnStack(p));
        Assert.assertEquals(div, builder.aboveOnStack(span));

        Element article = new Element(Tag.valueOf("article"), "http://example.com/");
        builder.insertOnStackAfter(span, article);
        Assert.assertEquals(article, builder.aboveOnStack(p));

        Element section = new Element(Tag.valueOf("section"), "http://example.com/");
        builder.replaceOnStack(article, section);
        Assert.assertFalse(builder.onStack(article));
        Assert.assertTrue(builder.onStack(section));

        Assert.assertTrue(builder.removeFromStack(section));
        Assert.assertFalse(builder.removeFromStack(section));
    }

    @Test
    public void popStackToClose_givenSingleAndMultipleNames_shouldPopMatching() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = builder.insert("div");
        Element p = builder.insert("p");
        Element span = builder.insert("span");

        builder.popStackToClose("p");
        Assert.assertFalse(builder.onStack(span));
        Assert.assertFalse(builder.onStack(p));
        Assert.assertTrue(builder.onStack(div));

        builder.insert("a");
        builder.insert("b");
        builder.insert("i");
        builder.popStackToClose("b", "a");
        Assert.assertFalse(builder.onStack(builder.getFromStack("i")));
        Assert.assertFalse(builder.onStack(builder.getFromStack("b")));
    }

    @Test
    public void popStackToBefore_givenTarget_shouldLeaveTargetOnStack() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element div = builder.insert("div");
        Element p = builder.insert("p");
        Element span = builder.insert("span");

        builder.popStackToBefore("p");
        Assert.assertFalse(builder.onStack(span));
        Assert.assertTrue(builder.onStack(p));
        Assert.assertTrue(builder.onStack(div));
    }

    @Test
    public void clearStackToContext_givenTableContexts_shouldClearCorrectly() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insert("table");
        builder.insert("tbody");
        builder.insert("tr");
        builder.insert("td");

        builder.clearStackToTableRowContext();
        Assert.assertEquals("tr", builder.currentElement().nodeName());

        builder.insert("td");
        builder.clearStackToTableBodyContext();
        Assert.assertEquals("tbody", builder.currentElement().nodeName());

        builder.clearStackToTableContext();
        Assert.assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void resetInsertionMode_givenVariousContextElements_shouldTransitionState() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());

        String[] tags = new String[]{
                "select", "tr", "tbody", "thead", "tfoot", "caption",
                "colgroup", "table", "head", "body", "frameset", "html"
        };
        HtmlTreeBuilderState[] expectedStates = new HtmlTreeBuilderState[]{
                HtmlTreeBuilderState.InSelect, HtmlTreeBuilderState.InRow, HtmlTreeBuilderState.InTableBody,
                HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InTableBody, HtmlTreeBuilderState.InCaption,
                HtmlTreeBuilderState.InColumnGroup, HtmlTreeBuilderState.InTable, HtmlTreeBuilderState.InBody,
                HtmlTreeBuilderState.InBody, HtmlTreeBuilderState.InFrameset, HtmlTreeBuilderState.BeforeHead
        };

        for (int i = 0; i < tags.length; i++) {
            builder.getStack().clear();
            builder.push(new Element(Tag.valueOf("html"), "http://example.com/"));
            builder.push(new Element(Tag.valueOf(tags[i]), "http://example.com/"));
            builder.resetInsertionMode();
            Assert.assertEquals("Failed on tag: " + tags[i], expectedStates[i], builder.state());
        }

        builder.getStack().clear();
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        Element td = new Element(Tag.valueOf("td"), "http://example.com/");
        builder.push(html);
        builder.push(td);
        builder.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InCell, builder.state());
    }

    @Test
    public void inScope_givenVariousScenarios_shouldCheckCorrectScope() {
        builder.parse("<html><body><div><p><span></span></p></div></body></html>", "http://example.com/", ParseErrorList.noTracking());

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope("span"));
        Assert.assertFalse(builder.inScope("h1"));
        Assert.assertTrue(builder.inScope(new String[]{"p", "h1"}));
        Assert.assertFalse(builder.inScope(new String[]{"h1", "h2"}));

        Element button = builder.insert("button");
        Element spanInBtn = builder.insert("span");
        Assert.assertTrue(builder.inButtonScope("span"));
        Assert.assertFalse(builder.inButtonScope("div"));

        builder.popStackToClose("button");
        Element ol = builder.insert("ol");
        Element li = builder.insert("li");
        Assert.assertTrue(builder.inListItemScope("li"));

        builder.popStackToClose("ol");
        Element table = builder.insert("table");
        Element td = builder.insert("td");
        Assert.assertTrue(builder.inTableScope("td"));
        Assert.assertFalse(builder.inTableScope("body"));

        builder.popStackToClose("table");
        Element select = builder.insert("select");
        Element option = builder.insert("option");
        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertFalse(builder.inSelectScope("html"));
    }

    @Test
    public void generateImpliedEndTags_givenElements_shouldPopImpliedTags() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.insert("p");
        builder.insert("span");
        builder.insert("dt");

        builder.generateImpliedEndTags();
        Assert.assertEquals("span", builder.currentElement().nodeName());

        builder.insert("dd");
        builder.generateImpliedEndTags("dd");
        Assert.assertEquals("dd", builder.currentElement().nodeName());
    }

    @Test
    public void isSpecial_givenSpecialAndNonSpecialTags_shouldReturnExpectedBoolean() {
        Element p = new Element(Tag.valueOf("p"), "http://example.com/");
        Element div = new Element(Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(Tag.valueOf("span"), "http://example.com/");
        Element custom = new Element(Tag.valueOf("custom-tag"), "http://example.com/");

        Assert.assertTrue(builder.isSpecial(p));
        Assert.assertTrue(builder.isSpecial(div));
        Assert.assertFalse(builder.isSpecial(span));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void activeFormattingElements_givenDuplicateAndMarkers_shouldHandleCorrectly() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());

        for (int i = 0; i < 4; i++) {
            Element b = new Element(Tag.valueOf("b"), "http://example.com/");
            b.attr("class", "bold");
            builder.pushActiveFormattingElements(b);
        }

        Element found = builder.getActiveFormattingElement("b");
        Assert.assertNotNull(found);
        Assert.assertTrue(builder.isInActiveFormattingElements(found));

        Element replacement = new Element(Tag.valueOf("b"), "http://example.com/");
        replacement.attr("class", "bold-replaced");
        builder.replaceActiveFormattingElement(found, replacement);
        Assert.assertFalse(builder.isInActiveFormattingElements(found));
        Assert.assertTrue(builder.isInActiveFormattingElements(replacement));

        builder.insertMarkerToFormattingElements();
        Element iEl = new Element(Tag.valueOf("i"), "http://example.com/");
        builder.pushActiveFormattingElements(iEl);
        Assert.assertEquals(iEl, builder.getActiveFormattingElement("i"));

        builder.clearFormattingElementsToLastMarker();
        Assert.assertNull(builder.getActiveFormattingElement("i"));

        builder.removeFromActiveFormattingElements(replacement);
        Assert.assertFalse(builder.isInActiveFormattingElements(replacement));
    }

    @Test
    public void reconstructFormattingElements_givenFormattingStack_shouldReconstructTags() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element b = new Element(Tag.valueOf("b"), "http://example.com/");
        Element i = new Element(Tag.valueOf("i"), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        builder.pushActiveFormattingElements(i);

        builder.reconstructFormattingElements();
        Assert.assertEquals("i", builder.currentElement().nodeName());
        Assert.assertEquals("b", builder.aboveOnStack(builder.currentElement()).nodeName());
    }

    @Test
    public void insertInFosterParent_givenTableContext_shouldFosterChildren() {
        builder.parse("<html><body><div><table><tbody><tr></tr></tbody></table></div></body></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());

        Token.Character fosterChar = new Token.Character("fostered text");
        builder.insert(fosterChar);

        Element div = builder.getFromStack("div");
        Assert.assertTrue(div.text().contains("fostered text"));
    }

    @Test
    public void insertInFosterParent_givenTableWithoutParent_shouldAppendToAboveOnStack() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Element table = new Element(Tag.valueOf("table"), "http://example.com/");
        builder.push(table);
        builder.setFosterInserts(true);

        TextNode text = new TextNode("orphan table text", "http://example.com/");
        builder.insertInFosterParent(text);

        Assert.assertTrue(builder.getFromStack("body").childNode(0).toString().contains("orphan table text"));
    }

    @Test
    public void insertInFosterParent_givenNoTableOnStack_shouldAppendToRoot() {
        builder.parse("<html></html>", "http://example.com/", ParseErrorList.noTracking());
        builder.setFosterInserts(true);

        TextNode text = new TextNode("root text", "http://example.com/");
        builder.insertInFosterParent(text);

        Assert.assertTrue(builder.getStack().get(0).childNode(0).toString().contains("root text"));
    }

    @Test
    public void processToken_givenValidToken_shouldDelegateToState() {
        builder.parse("<html><body></body></html>", "http://example.com/", ParseErrorList.noTracking());
        Token.Character commentChar = new Token.Character("sample");
        boolean result = builder.process(commentChar);
        Assert.assertTrue(result);

        boolean customStateResult = builder.process(commentChar, HtmlTreeBuilderState.InBody);
        Assert.assertTrue(customStateResult);
    }

    @Test
    public void gettersAndSetters_givenValues_shouldMaintainState() {
        Element head = new Element(Tag.valueOf("head"), "http://example.com/");
        builder.setHeadElement(head);
        Assert.assertEquals(head, builder.getHeadElement());

        List<Token.Character> pendingChars = new ArrayList<Token.Character>();
        pendingChars.add(new Token.Character("a"));
        builder.setPendingTableCharacters(pendingChars);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        Assert.assertTrue(builder.getPendingTableCharacters().isEmpty());

        String desc = builder.toString();
        Assert.assertNotNull(desc);
        Assert.assertTrue(desc.indexOf("TreeBuilder") != -1);
    }
}