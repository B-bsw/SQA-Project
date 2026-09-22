package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder createInitializedBuilder(String html, String baseUri) {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(html), baseUri, ParseErrorList.tracking(100), ParseSettings.htmlDefault);
        return builder;
    }

    private HtmlTreeBuilder createInitializedBuilder() {
        return createInitializedBuilder("", "http://example.com/");
    }

    @Test
    public void defaultSettings_whenCalled_returnsHtmlDefault() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertSame(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void initialiseParse_givenValidArguments_initialisesStateAndFlags() {
        HtmlTreeBuilder builder = createInitializedBuilder();

        Assert.assertSame(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertNotNull(builder.getDocument());
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
        Assert.assertNotNull(builder.getStack());
        Assert.assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void transition_givenNewState_changesCurrentState() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertSame(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void markInsertionMode_andOriginalState_storesCurrentState() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.transition(HtmlTreeBuilderState.InTable);
        builder.markInsertionMode();
        Assert.assertSame(HtmlTreeBuilderState.InTable, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertSame(HtmlTreeBuilderState.InTable, builder.originalState());
    }

    @Test
    public void framesetOk_givenTrueAndFalse_togglesCorrectly() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void maybeSetBaseUri_whenHrefPresentAndNotSet_updatesBaseUri() {
        HtmlTreeBuilder builder = createInitializedBuilder("", "http://initial.com/");
        Element baseElement = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://initial.com/");
        baseElement.attr("href", "http://updated.com/");

        builder.maybeSetBaseUri(baseElement);

        Assert.assertEquals("http://updated.com/", builder.getBaseUri());
        Assert.assertEquals("http://updated.com/", builder.getDocument().baseUri());

        Element secondBase = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://updated.com/");
        secondBase.attr("href", "http://second.com/");
        builder.maybeSetBaseUri(secondBase);
        Assert.assertEquals("http://updated.com/", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_whenHrefEmpty_doesNotUpdate() {
        HtmlTreeBuilder builder = createInitializedBuilder("", "http://initial.com/");
        Element baseElement = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://initial.com/");

        builder.maybeSetBaseUri(baseElement);

        Assert.assertEquals("http://initial.com/", builder.getBaseUri());
    }

    @Test
    public void error_whenErrorsTracking_addsParseError() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        builder.currentToken = tag;

        builder.error(HtmlTreeBuilderState.Initial);

        Assert.assertEquals(1, builder.errors.size());
        ParseError err = builder.errors.get(0);
        Assert.assertNotNull(err.getErrorMessage());
    }

    @Test
    public void process_givenTokenAndExplicitState_delegatesToGivenState() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test comment");

        boolean result = builder.process(comment, HtmlTreeBuilderState.Initial);

        Assert.assertTrue(result);
        Assert.assertEquals(comment, builder.currentToken);
    }

    @Test
    public void process_givenToken_delegatesToCurrentState() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Token.Comment comment = new Token.Comment();
        comment.getData().append("test");

        boolean result = builder.process(comment);

        Assert.assertTrue(result);
        Assert.assertEquals(comment, builder.currentToken);
    }

    @Test
    public void insertStartTag_givenTagName_createsElementAndPushesToStack() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element el = builder.insertStartTag("div");

        Assert.assertNotNull(el);
        Assert.assertEquals("div", el.nodeName());
        Assert.assertTrue(builder.onStack(el));
        Assert.assertSame(el, builder.currentElement());
    }

    @Test
    public void insert_givenElement_appendsToCurrentAndPushesToStack() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element parent = builder.insertStartTag("div");
        Element child = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.insert(child);

        Assert.assertTrue(builder.onStack(child));
        Assert.assertSame(child, builder.currentElement());
        Assert.assertSame(parent, child.parent());
    }

    @Test
    public void insert_givenSelfClosingStartTag_emitsEndTag() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("div");

        Token.StartTag startTag = new Token.StartTag();
        startTag.name("img");
        startTag.selfClosing = true;

        Element el = builder.insert(startTag);

        Assert.assertNotNull(el);
        Assert.assertEquals("img", el.nodeName());
    }

    @Test
    public void insertEmpty_givenNonEmptyTagWithSelfClosing_recordsError() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("div");
        startTag.selfClosing = true;

        Element el = builder.insertEmpty(startTag);

        Assert.assertEquals("div", el.nodeName());
        Assert.assertTrue(builder.errors.size() > 0);
    }

    @Test
    public void insertEmpty_givenCustomUnknownTagWithSelfClosing_marksSelfClosing() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("custom-tag");
        startTag.selfClosing = true;

        Element el = builder.insertEmpty(startTag);

        Assert.assertEquals("custom-tag", el.nodeName());
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void insertForm_givenOnStackTrueAndFalse_managesStackAndFormElement() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("body");

        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement form1 = builder.insertForm(formTag, true);

        Assert.assertSame(form1, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form1));

        Token.StartTag formTag2 = new Token.StartTag();
        formTag2.name("form");
        FormElement form2 = builder.insertForm(formTag2, false);

        Assert.assertSame(form2, builder.getFormElement());
        Assert.assertFalse(builder.currentElement() == form2);
    }

    @Test
    public void insertComment_givenCommentToken_insertsCommentNode() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("div");

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("hello world");

        builder.insert(commentToken);

        Element div = builder.currentElement();
        Assert.assertEquals(1, div.childNodeSize());
        Assert.assertTrue(div.childNode(0) instanceof Comment);
        Assert.assertEquals("hello world", ((Comment) div.childNode(0)).getData());
    }

    @Test
    public void insertCharacter_givenScriptOrStyleContext_insertsDataNode() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("script");

        Token.Character charToken = new Token.Character();
        charToken.data("var x = 1;");

        builder.insert(charToken);

        Element script = builder.currentElement();
        Assert.assertEquals(1, script.childNodeSize());
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
        Assert.assertEquals("var x = 1;", ((DataNode) script.childNode(0)).getWholeData());
    }

    @Test
    public void insertCharacter_givenRegularContext_insertsTextNode() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("p");

        Token.Character charToken = new Token.Character();
        charToken.data("Sample Text");

        builder.insert(charToken);

        Element p = builder.currentElement();
        Assert.assertEquals(1, p.childNodeSize());
        Assert.assertTrue(p.childNode(0) instanceof TextNode);
        Assert.assertEquals("Sample Text", ((TextNode) p.childNode(0)).getWholeText());
    }

    @Test
    public void insertNode_givenFormListedElementAndActiveForm_addsToForm() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("body");

        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.name("input");
        Element input = builder.insert(inputTag);

        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void pop_andPush_managesStack() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element el1 = builder.insertStartTag("html");
        Element el2 = builder.insertStartTag("body");

        Assert.assertSame(el2, builder.currentElement());

        Element popped = builder.pop();
        Assert.assertSame(el2, popped);
        Assert.assertSame(el1, builder.currentElement());

        builder.push(popped);
        Assert.assertSame(el2, builder.currentElement());
    }

    @Test
    public void onStack_givenExistingAndNonExisting_returnsExpected() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), builder.getBaseUri());

        Assert.assertTrue(builder.onStack(html));
        Assert.assertFalse(builder.onStack(div));
    }

    @Test
    public void getFromStack_givenExistingAndNonExisting_returnsElementOrNull() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");

        Assert.assertSame(html, builder.getFromStack("html"));
        Assert.assertSame(body, builder.getFromStack("body"));
        Assert.assertNull(builder.getFromStack("table"));
    }

    @Test
    public void removeFromStack_givenPresentAndAbsent_returnsTrueOrFalse() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element detached = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), builder.getBaseUri());

        Assert.assertFalse(builder.removeFromStack(detached));
        Assert.assertTrue(builder.removeFromStack(body));
        Assert.assertFalse(builder.onStack(body));
        Assert.assertTrue(builder.onStack(html));
    }

    @Test
    public void popStackToClose_givenSingleTagName_popsUntilClosed() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("span");

        builder.popStackToClose("div");

        Assert.assertFalse(builder.onStack(builder.getFromStack("span")));
        Assert.assertFalse(builder.onStack(builder.getFromStack("div")));
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToClose_givenArrayOfTagNames_popsUntilMatchFound() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("p");

        builder.popStackToClose(new String[]{"div", "p"});

        Assert.assertEquals("div", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToBefore_givenTagName_popsElementsAboveIt() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("span");

        builder.popStackToBefore("div");

        Assert.assertEquals("div", builder.currentElement().nodeName());
        Assert.assertNull(builder.getFromStack("span"));
    }

    @Test
    public void clearStackToTableContext_clearsUntilTableOrHtml() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableContext();

        Assert.assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void clearStackToTableBodyContext_clearsUntilTbodyTheadOrTfoot() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableBodyContext();

        Assert.assertEquals("tbody", builder.currentElement().nodeName());
    }

    @Test
    public void clearStackToTableRowContext_clearsUntilTr() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableRowContext();

        Assert.assertEquals("tr", builder.currentElement().nodeName());
    }

    @Test
    public void aboveOnStack_givenElement_returnsElementImmediatelyAbove() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");

        Assert.assertSame(body, builder.aboveOnStack(div));
        Assert.assertSame(html, builder.aboveOnStack(body));
        Assert.assertNull(builder.aboveOnStack(html));
    }

    @Test
    public void insertOnStackAfter_givenExistingElement_insertsDirectlyAfter() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.insertOnStackAfter(html, div);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertSame(html, builder.getStack().get(0));
        Assert.assertSame(div, builder.getStack().get(1));
        Assert.assertSame(body, builder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfter_givenMissingElement_throwsException() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        Element absent = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), builder.getBaseUri());
        Element toInsert = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.insertOnStackAfter(absent, toInsert);
    }

    @Test
    public void replaceOnStack_givenExistingElement_replacesInPlace() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        Element oldBody = builder.insertStartTag("body");
        Element newBody = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.replaceOnStack(oldBody, newBody);

        Assert.assertSame(newBody, builder.getStack().get(1));
        Assert.assertFalse(builder.onStack(oldBody));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceOnStack_givenMissingElement_throwsException() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        Element absent = new Element(Tag.valueOf("body", ParseSettings.htmlDefault), builder.getBaseUri());
        Element replacement = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.replaceOnStack(absent, replacement);
    }

    @Test
    public void resetInsertionMode_branches_transitionsToCorrectModes() {
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
            HtmlTreeBuilder builder = createInitializedBuilder();
            builder.insertStartTag("html");
            if (!"html".equals(tags[i])) {
                builder.insertStartTag(tags[i]);
            }
            builder.resetInsertionMode();
            Assert.assertEquals("Failed for tag: " + tags[i], expectedStates[i], builder.state());
        }
    }

    @Test
    public void resetInsertionMode_whenLastAndNoMatch_transitionsToInBody() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("customtag");
        builder.resetInsertionMode();
        Assert.assertSame(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void inScope_variousScopeChecks_evaluateCorrectly() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        Element p = builder.insertStartTag("p");

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope(new String[]{"p"}));
        Assert.assertFalse(builder.inScope("div"));

        builder.insertStartTag("table");
        Assert.assertFalse(builder.inScope("p"));
        Assert.assertTrue(builder.inTableScope("table"));
        Assert.assertFalse(builder.inTableScope("p"));

        builder.insertStartTag("tr");
        builder.insertStartTag("td");
        Element ul = builder.insertStartTag("ul");
        Element li = builder.insertStartTag("li");

        Assert.assertTrue(builder.inListItemScope("li"));
        Assert.assertFalse(builder.inListItemScope("ul"));

        builder.insertStartTag("button");
        Assert.assertTrue(builder.inButtonScope("button"));
    }

    @Test
    public void inSelectScope_givenTargetInSelectScope_returnsExpected() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("select");
        builder.insertStartTag("option");

        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertFalse(builder.inSelectScope("optgroup"));
    }

    @Test
    public void headElement_getterAndSetter() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.setHeadElement(head);
        Assert.assertSame(head, builder.getHeadElement());
    }

    @Test
    public void fosterInserts_getterAndSetter() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Assert.assertFalse(builder.isFosterInserts());

        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());
    }

    @Test
    public void formElement_getterAndSetter() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), builder.getBaseUri(), new Attributes());

        builder.setFormElement(form);
        Assert.assertSame(form, builder.getFormElement());
    }

    @Test
    public void pendingTableCharacters_getterSetterAndNew() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        List<String> list = new ArrayList<String>();
        list.add("abc");

        builder.setPendingTableCharacters(list);
        Assert.assertSame(list, builder.getPendingTableCharacters());

        builder.newPendingTableCharacters();
        Assert.assertNotSame(list, builder.getPendingTableCharacters());
        Assert.assertTrue(builder.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void generateImpliedEndTags_withAndWithoutExclude_popsMatchingTags() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("li");

        builder.generateImpliedEndTags("li");
        Assert.assertEquals("li", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void isSpecial_givenSpecialAndNonSpecialTags_returnsExpected() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element address = new Element(Tag.valueOf("address", ParseSettings.htmlDefault), builder.getBaseUri());
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), builder.getBaseUri());
        Element custom = new Element(Tag.valueOf("customtag", ParseSettings.htmlDefault), builder.getBaseUri());

        Assert.assertTrue(builder.isSpecial(address));
        Assert.assertTrue(builder.isSpecial(div));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void activeFormattingElements_pushAndLimitToThreeIdentical() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Attributes attrs = new Attributes();
        attrs.put("class", "bold");

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri(), attrs.clone());
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri(), attrs.clone());
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri(), attrs.clone());
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri(), attrs.clone());

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);

        Assert.assertTrue(builder.isInActiveFormattingElements(b1));
        Assert.assertSame(b3, builder.lastFormattingElement());

        builder.pushActiveFormattingElements(b4);

        Assert.assertFalse(builder.isInActiveFormattingElements(b1));
        Assert.assertTrue(builder.isInActiveFormattingElements(b2));
        Assert.assertTrue(builder.isInActiveFormattingElements(b3));
        Assert.assertTrue(builder.isInActiveFormattingElements(b4));
    }

    @Test
    public void activeFormattingElements_removeAndClearToMarker() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Assert.assertNull(builder.lastFormattingElement());
        Assert.assertNull(builder.removeLastFormattingElement());

        Element a = new Element(Tag.valueOf("a", ParseSettings.htmlDefault), builder.getBaseUri());
        builder.pushActiveFormattingElements(a);
        builder.insertMarkerToFormattingElements();
        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri());
        builder.pushActiveFormattingElements(b);

        Assert.assertSame(b, builder.getActiveFormattingElement("b"));
        Assert.assertNull(builder.getActiveFormattingElement("a"));

        builder.clearFormattingElementsToLastMarker();

        Assert.assertTrue(builder.isInActiveFormattingElements(a));
        Assert.assertFalse(builder.isInActiveFormattingElements(b));

        builder.removeFromActiveFormattingElements(a);
        Assert.assertFalse(builder.isInActiveFormattingElements(a));
    }

    @Test
    public void replaceActiveFormattingElement_givenExistingElement_replacesCorrectly() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element oldEl = new Element(Tag.valueOf("i", ParseSettings.htmlDefault), builder.getBaseUri());
        Element newEl = new Element(Tag.valueOf("em", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.pushActiveFormattingElements(oldEl);
        builder.replaceActiveFormattingElement(oldEl, newEl);

        Assert.assertFalse(builder.isInActiveFormattingElements(oldEl));
        Assert.assertTrue(builder.isInActiveFormattingElements(newEl));
    }

    @Test
    public void reconstructFormattingElements_whenUnreconstructed_reconstructsOnStack() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), builder.getBaseUri());
        b.attr("class", "my-bold");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();

        Assert.assertEquals("b", builder.currentElement().nodeName());
        Assert.assertEquals("my-bold", builder.currentElement().attr("class"));
    }

    @Test
    public void reconstructFormattingElements_whenAlreadyOnStackOrEmpty_doesNothing() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");

        builder.reconstructFormattingElements();
        Assert.assertEquals(1, builder.getStack().size());

        Element b = builder.insertStartTag("b");
        builder.pushActiveFormattingElements(b);
        builder.reconstructFormattingElements();
        Assert.assertEquals(2, builder.getStack().size());
    }

    @Test
    public void insertInFosterParent_whenNoTable_appendsToRootElement() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        Element html = builder.insertStartTag("html");
        Element text = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), builder.getBaseUri());

        builder.insertInFosterParent(text);

        Assert.assertSame(html, text.parent());
    }

    @Test
    public void insertInFosterParent_whenTableHasParent_insertsBeforeTable() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");
        body.appendChild(table);

        Element toInsert = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), builder.getBaseUri());
        builder.insertInFosterParent(toInsert);

        Assert.assertSame(body, toInsert.parent());
        Assert.assertEquals(0, toInsert.siblingIndex());
        Assert.assertEquals(1, table.siblingIndex());
    }

    @Test
    public void insertInFosterParent_whenTableHasNoParent_appendsToAboveOnStack() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), builder.getBaseUri());
        builder.push(table);

        Element toInsert = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), builder.getBaseUri());
        builder.insertInFosterParent(toInsert);

        Assert.assertSame(body, toInsert.parent());
    }

    @Test
    public void parseFragment_givenNullContext_parsesHtmlRoot() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<div>content</div>", null, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Assert.assertNotNull(nodes);
        Assert.assertFalse(nodes.isEmpty());
        Assert.assertEquals("html", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragment_givenContextElements_transitionsTokeniserAndParses() {
        String[] contextTags = new String[]{
            "title", "iframe", "script", "noscript", "plaintext", "div"
        };

        for (int i = 0; i < contextTags.length; i++) {
            String tagName = contextTags[i];
            HtmlTreeBuilder builder = new HtmlTreeBuilder();
            Element context = new Element(Tag.valueOf(tagName, ParseSettings.htmlDefault), "http://example.com/");
            Document ownerDoc = new Document("http://example.com/");
            ownerDoc.quirksMode(Document.OutputSettings.Syntax.html.equals(Document.OutputSettings.Syntax.html) ? Document.QuirksMode.noQuirks : Document.QuirksMode.quirks);
            ownerDoc.appendChild(context);

            List<Node> nodes = builder.parseFragment("<span>text</span>", context, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Assert.assertNotNull("Nodes should not be null for context: " + tagName, nodes);
        }
    }

    @Test
    public void parseFragment_givenContextWithParentForm_setsFormElement() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        form.appendChild(div);

        List<Node> nodes = builder.parseFragment("<input name='foo'/>", div, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Assert.assertNotNull(nodes);
        Assert.assertSame(form, builder.getFormElement());
    }

    @Test
    public void toString_whenCalled_returnsInformativeRepresentation() {
        HtmlTreeBuilder builder = createInitializedBuilder();
        builder.insertStartTag("html");
        String stringVal = builder.toString();

        Assert.assertNotNull(stringVal);
        Assert.assertTrue(stringVal.indexOf("currentToken=") != -1);
        Assert.assertTrue(stringVal.indexOf("state=") != -1);
        Assert.assertTrue(stringVal.indexOf("currentElement=") != -1);
    }
}