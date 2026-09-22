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
        builder = new HtmlTreeBuilder();
        parser = new Parser(builder);
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
    }

    @Test
    public void defaultSettings_whenCalled_returnsHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void initialiseParse_givenInitialState_resetsAllFields() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.setHeadElement(new Element(Tag.valueOf("head"), ""));
        builder.setFormElement(new FormElement(Tag.valueOf("form"), "", new Attributes()));

        builder.initialiseParse(new StringReader(""), "http://example.com/test", parser);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertEquals("http://example.com/test", builder.getBaseUri());
        Assert.assertNotNull(builder.getDocument());
    }

    @Test
    public void transitionAndState_givenNewState_changesStateCorrectly() {
        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void markInsertionModeAndOriginalState_whenMarked_storesPreviousState() {
        builder.transition(HtmlTreeBuilderState.InTable);
        builder.markInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.originalState());

        builder.transition(HtmlTreeBuilderState.InRow);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.originalState());
    }

    @Test
    public void framesetOk_givenBoolean_updatesCorrectly() {
        Assert.assertTrue(builder.framesetOk());
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void maybeSetBaseUri_whenBaseUriNotSet_updatesFromHrefAttribute() {
        Element base = new Element(Tag.valueOf("base"), "http://example.com/");
        base.attr("href", "http://example.com/path/test.html");

        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/path/test.html", builder.getBaseUri());
        Assert.assertEquals("http://example.com/path/test.html", builder.getDocument().baseUri());

        Element secondBase = new Element(Tag.valueOf("base"), "http://example.com/");
        secondBase.attr("href", "http://example.com/ignored.html");
        builder.maybeSetBaseUri(secondBase);
        Assert.assertEquals("http://example.com/path/test.html", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_whenHrefEmpty_doesNotUpdate() {
        Element base = new Element(Tag.valueOf("base"), "");
        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void error_whenErrorsTracked_addsParseError() {
        parser.setTrackErrors(10);
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);
        Token.StartTag tag = new Token.StartTag();
        tag.nameAttr("div", new Attributes());
        builder.process(tag, HtmlTreeBuilderState.Initial);

        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(1, parser.getErrors().size());
    }

    @Test
    public void stackOperations_pushPopGetAndCheck_manipulatesStackCorrectly() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);

        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertTrue(builder.onStack(el2));
        Assert.assertEquals(el3, builder.currentElement());

        Element popped = builder.pop();
        Assert.assertEquals(el3, popped);
        Assert.assertFalse(builder.onStack(el3));

        Assert.assertEquals(el2, builder.getFromStack("body"));
        Assert.assertNull(builder.getFromStack("div"));

        Assert.assertEquals(el1, builder.aboveOnStack(el2));

        Element el4 = new Element(Tag.valueOf("p"), "");
        builder.insertOnStackAfter(el1, el4);
        Assert.assertEquals(el4, builder.getStack().get(1));

        Element el5 = new Element(Tag.valueOf("span"), "");
        builder.replaceOnStack(el4, el5);
        Assert.assertEquals(el5, builder.getStack().get(1));
        Assert.assertFalse(builder.onStack(el4));

        boolean removed = builder.removeFromStack(el5);
        Assert.assertTrue(removed);
        Assert.assertFalse(builder.onStack(el5));
        Assert.assertFalse(builder.removeFromStack(el5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfter_whenNotFound_throwsValidationException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        builder.insertOnStackAfter(el1, el2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceOnStack_whenNotFound_throwsValidationException() {
        Element el1 = new Element(Tag.valueOf("div"), "");
        Element el2 = new Element(Tag.valueOf("span"), "");
        builder.replaceOnStack(el1, el2);
    }

    @Test
    public void popStackToClose_singleTarget_popsDownToTarget() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");
        Element el4 = new Element(Tag.valueOf("span"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);
        builder.push(el4);

        builder.popStackToClose("div");
        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToClose_multipleTargets_popsDownToFirstMatch() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");
        Element el4 = new Element(Tag.valueOf("span"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);
        builder.push(el4);

        builder.popStackToClose(new String[]{"div", "p"});
        Assert.assertEquals(2, builder.getStack().size());
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToBefore_givenTarget_popsUntilTargetIsTop() {
        Element el1 = new Element(Tag.valueOf("html"), "");
        Element el2 = new Element(Tag.valueOf("body"), "");
        Element el3 = new Element(Tag.valueOf("div"), "");
        Element el4 = new Element(Tag.valueOf("span"), "");

        builder.push(el1);
        builder.push(el2);
        builder.push(el3);
        builder.push(el4);

        builder.popStackToBefore("div");
        Assert.assertEquals(3, builder.getStack().size());
        Assert.assertEquals("div", builder.currentElement().nodeName());
    }

    @Test
    public void clearStackToContexts_variousContexts_popsStackUntilContextFound() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element tbody = new Element(Tag.valueOf("tbody"), "");
        Element tr = new Element(Tag.valueOf("tr"), "");
        Element td = new Element(Tag.valueOf("td"), "");

        builder.push(html);
        builder.push(table);
        builder.push(tbody);
        builder.push(tr);
        builder.push(td);

        builder.clearStackToTableRowContext();
        Assert.assertEquals("tr", builder.currentElement().nodeName());

        builder.clearStackToTableBodyContext();
        Assert.assertEquals("tbody", builder.currentElement().nodeName());

        builder.clearStackToTableContext();
        Assert.assertEquals("table", builder.currentElement().nodeName());
    }

    @Test
    public void insertElement_normalAndSelfClosing_handlesInsertionCorrectly() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        Token.StartTag normalTag = new Token.StartTag();
        normalTag.nameAttr("div", new Attributes());
        Element div = builder.insert(normalTag);
        Assert.assertEquals("div", div.nodeName());
        Assert.assertEquals(div, builder.currentElement());

        Token.StartTag selfClosing = new Token.StartTag();
        selfClosing.nameAttr("img", new Attributes());
        selfClosing.selfClosing = true;
        Element img = builder.insert(selfClosing);
        Assert.assertEquals("img", img.nodeName());
        Assert.assertTrue(builder.onStack(img));

        Token.StartTag customSelfClosing = new Token.StartTag();
        customSelfClosing.nameAttr("custom-elem", new Attributes());
        customSelfClosing.selfClosing = true;
        Element custom = builder.insertEmpty(customSelfClosing);
        Assert.assertTrue(custom.tag().isSelfClosing());
    }

    @Test
    public void insertEmpty_knownNonEmptySelfClosing_reportsTokeniserError() {
        parser.setTrackErrors(10);
        builder.initialiseParse(new StringReader(""), "http://example.com/", parser);

        Token.StartTag invalidSelfClosing = new Token.StartTag();
        invalidSelfClosing.nameAttr("div", new Attributes());
        invalidSelfClosing.selfClosing = true;

        builder.insertEmpty(invalidSelfClosing);
        Assert.assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void insertForm_withAndWithoutStack_updatesFormElement() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

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
    public void insertNodes_commentCharacterDataNode_appendsCorrectly() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("test comment");
        builder.insert(commentToken);
        Assert.assertEquals(1, html.childNodeSize());
        Assert.assertTrue(html.childNode(0) instanceof Comment);

        Token.Character charToken = new Token.Character();
        charToken.data("sample text");
        builder.insert(charToken);
        Assert.assertEquals(2, html.childNodeSize());
        Assert.assertTrue(html.childNode(1) instanceof TextNode);

        Token.Character cdataToken = new Token.Character();
        cdataToken.data("cdata content");
        Token.Character cdataAsCdata = new Token.Character();
        Token.Character mockCdata = new Token.Character() {
            @Override
            boolean isCData() {
                return true;
            }
        };
        mockCdata.data("cdata-data");
        builder.insert(mockCdata);
        Assert.assertEquals(3, html.childNodeSize());

        Element script = new Element(Tag.valueOf("script"), "");
        builder.push(script);
        Token.Character scriptChars = new Token.Character();
        scriptChars.data("var x = 1;");
        builder.insert(scriptChars);
        Assert.assertEquals(1, script.childNodeSize());
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void insertNode_formListedElement_registersWithForm() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        builder.setFormElement(form);

        Element input = new Element(Tag.valueOf("input"), "");
        builder.insert(input);

        Assert.assertEquals(1, form.elements().size());
        Assert.assertEquals(input, form.elements().get(0));
    }

    @Test
    public void insertInFosterParent_variousScenarios_insertsInCorrectPosition() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);

        Element textNode1 = new Element(Tag.valueOf("b"), "");
        builder.setFosterInserts(true);
        builder.insert(textNode1);
        Assert.assertTrue(html.children().contains(textNode1));

        Element table = new Element(Tag.valueOf("table"), "");
        html.appendChild(table);
        builder.push(table);

        Element fosteredNode = new Element(Tag.valueOf("span"), "");
        builder.insertInFosterParent(fosteredNode);
        Assert.assertEquals(fosteredNode, table.previousElementSibling());

        Element table2 = new Element(Tag.valueOf("table"), "");
        builder.push(table2);
        Element fosteredNode2 = new Element(Tag.valueOf("i"), "");
        builder.insertInFosterParent(fosteredNode2);
        Assert.assertTrue(table.children().contains(fosteredNode2));
    }

    @Test
    public void scopeChecks_inScopeInListInButtonInTableInSelect_returnsExpected() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element table = new Element(Tag.valueOf("table"), "");
        Element td = new Element(Tag.valueOf("td"), "");
        Element p = new Element(Tag.valueOf("p"), "");

        builder.push(html);
        builder.push(table);
        builder.push(td);
        builder.push(p);

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope("td"));
        Assert.assertTrue(builder.inScope(new String[]{"p", "div"}));
        Assert.assertFalse(builder.inScope("html"));
        Assert.assertFalse(builder.inTableScope("p"));
        Assert.assertTrue(builder.inTableScope("table"));

        Element ul = new Element(Tag.valueOf("ul"), "");
        Element li = new Element(Tag.valueOf("li"), "");
        builder.push(ul);
        builder.push(li);
        Assert.assertFalse(builder.inListItemScope("td"));
        Assert.assertTrue(builder.inListItemScope("li"));

        Element button = new Element(Tag.valueOf("button"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        builder.push(button);
        builder.push(span);
        Assert.assertFalse(builder.inButtonScope("li"));
        Assert.assertTrue(builder.inButtonScope("span"));

        HtmlTreeBuilder selectBuilder = new HtmlTreeBuilder();
        selectBuilder.initialiseParse(new StringReader(""), "http://example.com/", parser);
        Element optgroup = new Element(Tag.valueOf("optgroup"), "");
        Element option = new Element(Tag.valueOf("option"), "");
        selectBuilder.push(optgroup);
        selectBuilder.push(option);

        Assert.assertTrue(selectBuilder.inSelectScope("option"));
        Assert.assertFalse(selectBuilder.inSelectScope("input"));
    }

    @Test
    public void resetInsertionMode_variousTopElements_switchesToCorrectState() {
        checkResetMode("select", HtmlTreeBuilderState.InSelect);
        checkResetMode("td", HtmlTreeBuilderState.InCell);
        checkResetMode("th", HtmlTreeBuilderState.InCell);
        checkResetMode("tr", HtmlTreeBuilderState.InRow);
        checkResetMode("tbody", HtmlTreeBuilderState.InTableBody);
        checkResetMode("thead", HtmlTreeBuilderState.InTableBody);
        checkResetMode("tfoot", HtmlTreeBuilderState.InTableBody);
        checkResetMode("caption", HtmlTreeBuilderState.InCaption);
        checkResetMode("colgroup", HtmlTreeBuilderState.InColumnGroup);
        checkResetMode("table", HtmlTreeBuilderState.InTable);
        checkResetMode("head", HtmlTreeBuilderState.InBody);
        checkResetMode("body", HtmlTreeBuilderState.InBody);
        checkResetMode("frameset", HtmlTreeBuilderState.InFrameset);
        checkResetMode("html", HtmlTreeBuilderState.BeforeHead);
    }

    private void checkResetMode(String tagName, HtmlTreeBuilderState expected) {
        builder.getStack().clear();
        builder.push(new Element(Tag.valueOf("html"), ""));
        builder.push(new Element(Tag.valueOf(tagName), ""));
        builder.resetInsertionMode();
        Assert.assertEquals(expected, builder.state());
    }

    @Test
    public void generateImpliedEndTags_withAndWithoutExclusion_popsExpectedTags() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element p = new Element(Tag.valueOf("p"), "");
        Element dt = new Element(Tag.valueOf("dt"), "");
        Element dd = new Element(Tag.valueOf("dd"), "");

        builder.push(html);
        builder.push(p);
        builder.push(dt);
        builder.push(dd);

        builder.generateImpliedEndTags("dt");
        Assert.assertEquals("dt", builder.currentElement().nodeName());

        builder.generateImpliedEndTags();
        Assert.assertEquals("html", builder.currentElement().nodeName());
    }

    @Test
    public void isSpecial_forSpecialAndNonSpecialTags_classifiesCorrectly() {
        Assert.assertTrue(builder.isSpecial(new Element(Tag.valueOf("address"), "")));
        Assert.assertTrue(builder.isSpecial(new Element(Tag.valueOf("div"), "")));
        Assert.assertTrue(builder.isSpecial(new Element(Tag.valueOf("p"), "")));
        Assert.assertFalse(builder.isSpecial(new Element(Tag.valueOf("customtag"), "")));
        Assert.assertFalse(builder.isSpecial(new Element(Tag.valueOf("b"), "")));
    }

    @Test
    public void activeFormattingElements_allLifecycleOperations_executedCorrectly() {
        Assert.assertNull(builder.lastFormattingElement());
        Assert.assertNull(builder.removeLastFormattingElement());

        Element a1 = new Element(Tag.valueOf("a"), "");
        Element a2 = new Element(Tag.valueOf("a"), "");
        Element a3 = new Element(Tag.valueOf("a"), "");
        Element a4 = new Element(Tag.valueOf("a"), "");

        builder.pushActiveFormattingElements(a1);
        builder.pushActiveFormattingElements(a2);
        builder.pushActiveFormattingElements(a3);
        builder.pushActiveFormattingElements(a4);

        Assert.assertFalse(builder.isInActiveFormattingElements(a1));
        Assert.assertTrue(builder.isInActiveFormattingElements(a4));
        Assert.assertEquals(a4, builder.lastFormattingElement());

        Assert.assertEquals(a4, builder.getActiveFormattingElement("a"));
        Assert.assertNull(builder.getActiveFormattingElement("b"));

        Element rep = new Element(Tag.valueOf("a"), "");
        builder.replaceActiveFormattingElement(a4, rep);
        Assert.assertEquals(rep, builder.lastFormattingElement());

        builder.removeFromActiveFormattingElements(rep);
        Assert.assertFalse(builder.isInActiveFormattingElements(rep));

        builder.insertMarkerToFormattingElements();
        Assert.assertNull(builder.lastFormattingElement());

        builder.pushActiveFormattingElements(new Element(Tag.valueOf("i"), ""));
        builder.clearFormattingElementsToLastMarker();
        Assert.assertFalse(builder.isInActiveFormattingElements(new Element(Tag.valueOf("i"), "")));
    }

    @Test
    public void reconstructFormattingElements_whenUnclosedFormatting_reconstructsOnStack() {
        Element html = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        builder.push(html);
        builder.push(body);

        Element bold = new Element(Tag.valueOf("b"), "");
        Element italic = new Element(Tag.valueOf("i"), "");
        builder.pushActiveFormattingElements(bold);
        builder.pushActiveFormattingElements(italic);

        builder.reconstructFormattingElements();

        Assert.assertEquals(4, builder.getStack().size());
        Assert.assertEquals("i", builder.currentElement().nodeName());
    }

    @Test
    public void pendingTableCharacters_creationAndAccess_worksAsExpected() {
        builder.newPendingTableCharacters();
        List<String> list = builder.getPendingTableCharacters();
        Assert.assertNotNull(list);
        Assert.assertEquals(0, list.size());
        list.add("test");
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());
    }

    @Test
    public void parseFragment_variousContexts_returnsCorrectNodeList() {
        Element contextDiv = new Element(Tag.valueOf("div"), "http://example.com/");
        List<Node> nodes = builder.parseFragment("<p>Hello</p>", contextDiv, "http://example.com/", parser);
        Assert.assertTrue(nodes.size() > 0);
        Assert.assertEquals("p", nodes.get(0).nodeName());

        Element contextTitle = new Element(Tag.valueOf("title"), "http://example.com/");
        List<Node> titleNodes = builder.parseFragment("Title text", contextTitle, "http://example.com/", parser);
        Assert.assertTrue(titleNodes.size() > 0);

        Element contextIframe = new Element(Tag.valueOf("iframe"), "http://example.com/");
        List<Node> iframeNodes = builder.parseFragment("content", contextIframe, "http://example.com/", parser);
        Assert.assertTrue(iframeNodes.size() > 0);

        Element contextScript = new Element(Tag.valueOf("script"), "http://example.com/");
        List<Node> scriptNodes = builder.parseFragment("var a = 0;", contextScript, "http://example.com/", parser);
        Assert.assertTrue(scriptNodes.size() > 0);

        FormElement contextForm = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        Element innerDiv = new Element(Tag.valueOf("div"), "http://example.com/");
        contextForm.appendChild(innerDiv);
        List<Node> formChildNodes = builder.parseFragment("<input>", innerDiv, "http://example.com/", parser);
        Assert.assertTrue(formChildNodes.size() > 0);
        Assert.assertEquals(contextForm, builder.getFormElement());

        List<Node> nullContextNodes = builder.parseFragment("<div>Rootless</div>", null, "http://example.com/", parser);
        Assert.assertTrue(nullContextNodes.size() > 0);
    }

    @Test
    public void toString_whenInvoked_returnsFormattedDebugString() {
        Element html = new Element(Tag.valueOf("html"), "");
        builder.push(html);
        String str = builder.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.indexOf("TreeBuilder{") != -1);
        Assert.assertTrue(str.indexOf("state=") != -1);
    }
}