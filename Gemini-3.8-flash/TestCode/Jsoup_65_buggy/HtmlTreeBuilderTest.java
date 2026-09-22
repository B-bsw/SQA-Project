package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
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

    private HtmlTreeBuilder treeBuilder;

    @Before
    public void setUp() {
        treeBuilder = new HtmlTreeBuilder();
        treeBuilder.initialiseParse(
                new StringReader(""),
                "http://example.com/",
                ParseErrorList.noTracking(),
                ParseSettings.htmlDefault
        );
    }

    @Test
    public void defaultSettings_always_shouldReturnHtmlDefault() {
        ParseSettings settings = treeBuilder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void initialiseParse_givenInitialState_shouldResetFieldsCorrectly() {
        treeBuilder.framesetOk(false);
        treeBuilder.setFosterInserts(true);

        treeBuilder.initialiseParse(
                new StringReader(""),
                "http://example.com/",
                ParseErrorList.tracking(10),
                ParseSettings.htmlDefault
        );

        Assert.assertEquals(HtmlTreeBuilderState.Initial, treeBuilder.state());
        Assert.assertNull(treeBuilder.originalState());
        Assert.assertNull(treeBuilder.getHeadElement());
        Assert.assertNull(treeBuilder.getFormElement());
        Assert.assertTrue(treeBuilder.framesetOk());
        Assert.assertFalse(treeBuilder.isFosterInserts());
        Assert.assertFalse(treeBuilder.isFragmentParsing());
        Assert.assertNotNull(treeBuilder.getDocument());
        Assert.assertEquals("http://example.com/", treeBuilder.getBaseUri());
    }

    @Test
    public void transitionAndState_givenNewState_shouldUpdateState() {
        treeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
        Assert.assertEquals(HtmlTreeBuilderState.BeforeHtml, treeBuilder.state());

        treeBuilder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, treeBuilder.state());
    }

    @Test
    public void markInsertionModeAndOriginalState_givenCurrentState_shouldSaveOriginalState() {
        treeBuilder.transition(HtmlTreeBuilderState.InTable);
        treeBuilder.markInsertionMode();

        Assert.assertEquals(HtmlTreeBuilderState.InTable, treeBuilder.originalState());

        treeBuilder.transition(HtmlTreeBuilderState.InCell);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, treeBuilder.originalState());
    }

    @Test
    public void framesetOk_givenTrueAndFalse_shouldUpdateFlag() {
        treeBuilder.framesetOk(false);
        Assert.assertFalse(treeBuilder.framesetOk());

        treeBuilder.framesetOk(true);
        Assert.assertTrue(treeBuilder.framesetOk());
    }

    @Test
    public void fosterInserts_givenTrueAndFalse_shouldUpdateFlag() {
        treeBuilder.setFosterInserts(true);
        Assert.assertTrue(treeBuilder.isFosterInserts());

        treeBuilder.setFosterInserts(false);
        Assert.assertFalse(treeBuilder.isFosterInserts());
    }

    @Test
    public void headElement_givenElement_shouldSetAndGetHeadElement() {
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "http://example.com/");
        treeBuilder.setHeadElement(head);
        Assert.assertSame(head, treeBuilder.getHeadElement());
    }

    @Test
    public void formElement_givenFormElement_shouldSetAndGetFormElement() {
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com/", new Attributes());
        treeBuilder.setFormElement(form);
        Assert.assertSame(form, treeBuilder.getFormElement());
    }

    @Test
    public void pendingTableCharacters_givenNewListOrReset_shouldManageList() {
        List<String> list = new ArrayList<String>();
        list.add("test");
        treeBuilder.setPendingTableCharacters(list);
        Assert.assertEquals(1, treeBuilder.getPendingTableCharacters().size());
        Assert.assertEquals("test", treeBuilder.getPendingTableCharacters().get(0));

        treeBuilder.newPendingTableCharacters();
        Assert.assertNotNull(treeBuilder.getPendingTableCharacters());
        Assert.assertEquals(0, treeBuilder.getPendingTableCharacters().size());
    }

    @Test
    public void maybeSetBaseUri_givenValidHref_shouldUpdateBaseUri() {
        Element base = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        base.attr("href", "http://example.org/path/");

        treeBuilder.maybeSetBaseUri(base);

        Assert.assertEquals("http://example.org/path/", treeBuilder.getBaseUri());
        Assert.assertEquals("http://example.org/path/", treeBuilder.getDocument().baseUri());

        Element secondBase = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        secondBase.attr("href", "http://example.net/other/");
        treeBuilder.maybeSetBaseUri(secondBase);

        Assert.assertEquals("http://example.org/path/", treeBuilder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_givenEmptyHref_shouldNotUpdateBaseUri() {
        Element base = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        treeBuilder.maybeSetBaseUri(base);

        Assert.assertEquals("http://example.com/", treeBuilder.getBaseUri());
    }

    @Test
    public void error_whenTrackingErrors_shouldAddParseError() {
        ParseErrorList errorList = ParseErrorList.tracking(5);
        treeBuilder.initialiseParse(
                new StringReader(""),
                "http://example.com/",
                errorList,
                ParseSettings.htmlDefault
        );

        Token.Character charToken = new Token.Character();
        charToken.data("a");
        treeBuilder.process(charToken, HtmlTreeBuilderState.Initial);

        treeBuilder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(1, errorList.size());
    }

    @Test
    public void pushAndPopAndGetStack_givenElements_shouldMaintainStackOrder() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertTrue(treeBuilder.onStack(el1));
        Assert.assertTrue(treeBuilder.onStack(el2));

        Element popped = treeBuilder.pop();
        Assert.assertSame(el2, popped);
        Assert.assertFalse(treeBuilder.onStack(el2));
        Assert.assertTrue(treeBuilder.onStack(el1));
        Assert.assertEquals(1, treeBuilder.getStack().size());
    }

    @Test
    public void onStack_givenUnstackedElement_shouldReturnFalse() {
        Element el = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Assert.assertFalse(treeBuilder.onStack(el));
    }

    @Test
    public void getFromStack_givenExistingAndNonExistingNames_shouldReturnExpectedElement() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        treeBuilder.push(el1);
        treeBuilder.push(el2);

        Assert.assertSame(el2, treeBuilder.getFromStack("p"));
        Assert.assertSame(el1, treeBuilder.getFromStack("div"));
        Assert.assertNull(treeBuilder.getFromStack("span"));
    }

    @Test
    public void removeFromStack_givenPresentAndAbsentElement_shouldReturnTrueOrFalse() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        Element el3 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);

        Assert.assertTrue(treeBuilder.removeFromStack(el2));
        Assert.assertFalse(treeBuilder.onStack(el2));
        Assert.assertFalse(treeBuilder.removeFromStack(el3));
    }

    @Test
    public void popStackToClose_singleName_shouldPopUntilTargetIsRemoved() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element el3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);
        treeBuilder.push(el3);

        treeBuilder.popStackToClose("span");

        Assert.assertEquals(1, treeBuilder.getStack().size());
        Assert.assertTrue(treeBuilder.onStack(el1));
        Assert.assertFalse(treeBuilder.onStack(el2));
        Assert.assertFalse(treeBuilder.onStack(el3));
    }

    @Test
    public void popStackToClose_multipleNames_shouldPopUntilAnyMatches() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        Element el3 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);
        treeBuilder.push(el3);

        treeBuilder.popStackToClose("p", "div");

        Assert.assertEquals(1, treeBuilder.getStack().size());
        Assert.assertTrue(treeBuilder.onStack(el1));
        Assert.assertFalse(treeBuilder.onStack(el2));
        Assert.assertFalse(treeBuilder.onStack(el3));
    }

    @Test
    public void popStackToBefore_givenTargetName_shouldPopUntilTargetIsTop() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element el3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);
        treeBuilder.push(el3);

        treeBuilder.popStackToBefore("span");

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertSame(el2, treeBuilder.getStack().get(treeBuilder.getStack().size() - 1));
        Assert.assertFalse(treeBuilder.onStack(el3));
    }

    @Test
    public void clearStackToTableContext_givenStack_shouldClearUntilTableOrHtml() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "");
        Element td = new Element(Tag.valueOf("td", ParseSettings.htmlDefault), "");

        treeBuilder.push(html);
        treeBuilder.push(table);
        treeBuilder.push(tr);
        treeBuilder.push(td);

        treeBuilder.clearStackToTableContext();

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertSame(table, treeBuilder.getStack().get(1));
    }

    @Test
    public void clearStackToTableBodyContext_givenStack_shouldClearUntilTbodyOrHtml() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        Element tbody = new Element(Tag.valueOf("tbody", ParseSettings.htmlDefault), "");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "");

        treeBuilder.push(html);
        treeBuilder.push(tbody);
        treeBuilder.push(tr);

        treeBuilder.clearStackToTableBodyContext();

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertSame(tbody, treeBuilder.getStack().get(1));
    }

    @Test
    public void clearStackToTableRowContext_givenStack_shouldClearUntilTrOrHtml() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        Element tr = new Element(Tag.valueOf("tr", ParseSettings.htmlDefault), "");
        Element td = new Element(Tag.valueOf("td", ParseSettings.htmlDefault), "");

        treeBuilder.push(html);
        treeBuilder.push(tr);
        treeBuilder.push(td);

        treeBuilder.clearStackToTableRowContext();

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertSame(tr, treeBuilder.getStack().get(1));
    }

    @Test
    public void aboveOnStack_givenElement_shouldReturnElementDirectlyAbove() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        treeBuilder.push(el1);
        treeBuilder.push(el2);

        Element above = treeBuilder.aboveOnStack(el2);
        Assert.assertSame(el1, above);
    }

    @Test
    public void insertOnStackAfter_givenExistingElement_shouldInsertCorrectly() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element inserted = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);

        treeBuilder.insertOnStackAfter(el1, inserted);

        Assert.assertEquals(3, treeBuilder.getStack().size());
        Assert.assertSame(el1, treeBuilder.getStack().get(0));
        Assert.assertSame(inserted, treeBuilder.getStack().get(1));
        Assert.assertSame(el2, treeBuilder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfter_givenMissingElement_shouldThrowException() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element notOnStack = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element inserted = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.insertOnStackAfter(notOnStack, inserted);
    }

    @Test
    public void replaceOnStack_givenElementOnStack_shouldReplaceAtSamePosition() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element el2 = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element replacement = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.push(el2);

        treeBuilder.replaceOnStack(el2, replacement);

        Assert.assertEquals(2, treeBuilder.getStack().size());
        Assert.assertSame(replacement, treeBuilder.getStack().get(1));
        Assert.assertFalse(treeBuilder.onStack(el2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceOnStack_givenElementNotOnStack_shouldThrowException() {
        Element el1 = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "");
        Element notOnStack = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");
        Element replacement = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");

        treeBuilder.push(el1);
        treeBuilder.replaceOnStack(notOnStack, replacement);
    }

    @Test
    public void resetInsertionMode_givenVariousStackNodes_shouldTransitionCorrectly() {
        String[] tags = new String[]{
                "select", "td", "th", "tr", "tbody", "thead", "tfoot",
                "caption", "colgroup", "table", "head", "body", "frameset", "html"
        };
        HtmlTreeBuilderState[] states = new HtmlTreeBuilderState[]{
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
            treeBuilder.getStack().clear();
            Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
            Element target = new Element(Tag.valueOf(tags[i], ParseSettings.htmlDefault), "");
            treeBuilder.push(html);
            treeBuilder.push(target);

            treeBuilder.resetInsertionMode();
            Assert.assertEquals("Failed for tag: " + tags[i], states[i], treeBuilder.state());
        }
    }

    @Test
    public void resetInsertionMode_whenOnlyRootAndNoMatch_shouldFallBackToInBody() {
        Element custom = new Element(Tag.valueOf("custom", ParseSettings.htmlDefault), "");
        treeBuilder.getStack().clear();
        treeBuilder.push(custom);

        treeBuilder.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, treeBuilder.state());
    }

    @Test
    public void inScope_targetInScope_shouldReturnTrue() {
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "");
        Element p = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "");
        Element span = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "");

        treeBuilder.push(html);
        treeBuilder.push(p);
        treeBuilder.push(span);

        Assert.assertTrue(treeBuilder.inScope("span"));