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

    @Before
    public void setUp() {
        builder = new HtmlTreeBuilder();
        builder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.tracking(10), ParseSettings.htmlDefault);
    }

    @Test
    public void defaultSettings_shouldReturnHtmlDefault() {
        ParseSettings settings = builder.defaultSettings();
        Assert.assertNotNull(settings);
        Assert.assertEquals(ParseSettings.htmlDefault, settings);
    }

    @Test
    public void initialiseParse_shouldResetStateVariables() {
        builder.framesetOk(false);
        builder.setFosterInserts(true);
        builder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        Assert.assertEquals(HtmlTreeBuilderState.Initial, builder.state());
        Assert.assertNull(builder.originalState());
        Assert.assertNull(builder.getHeadElement());
        Assert.assertNull(builder.getFormElement());
        Assert.assertTrue(builder.framesetOk());
        Assert.assertFalse(builder.isFosterInserts());
        Assert.assertFalse(builder.isFragmentParsing());
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void parseFragment_givenNullContext_shouldParseDocumentChildren() {
        List<Node> nodes = builder.parseFragment("<p>One</p><p>Two</p>", null, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertNotNull(nodes);
        Assert.assertTrue(nodes.size() > 0);
    }

    @Test
    public void parseFragment_givenVariousContextElements_shouldTransitionTokeniserState() {
        String[] tags = new String[]{"title", "textarea", "iframe", "noembed", "noframes", "style", "xmp", "script", "noscript", "plaintext", "div"};
        for (int i = 0; i < tags.length; i++) {
            String tagName = tags[i];
            Element context = new Element(Tag.valueOf(tagName, ParseSettings.htmlDefault), "http://example.com/");
            List<Node> nodes = builder.parseFragment("Hello world", context, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
            Assert.assertNotNull(nodes);
        }
    }

    @Test
    public void parseFragment_givenContextWithOwnerDocumentQuirksMode_shouldInheritQuirksMode() {
        Document owner = new Document("http://example.com/");
        owner.quirksMode(Document.QuirksMode.quirks);
        Element context = owner.createElement("div");
        owner.appendChild(context);

        builder.parseFragment("<p>Text</p>", context, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertEquals(Document.QuirksMode.quirks, builder.getDocument().quirksMode());
    }

    @Test
    public void parseFragment_givenContextWithFormParent_shouldSetFormElement() {
        Document doc = new Document("http://example.com/");
        FormElement form = new FormElement(Tag.valueOf("form", ParseSettings.htmlDefault), "http://example.com/", new Attributes());
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        doc.appendChild(form);
        form.appendChild(div);

        builder.parseFragment("<input name='foo'>", div, "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Assert.assertNotNull(builder.getFormElement());
        Assert.assertEquals(form, builder.getFormElement());
    }

    @Test
    public void process_givenToken_shouldDelegateToCurrentState() {
        builder.transition(HtmlTreeBuilderState.Initial);
        Token.Comment comment = new Token.Comment();
        comment.data.append("test comment");
        boolean result = builder.process(comment);
        Assert.assertTrue(result);
    }

    @Test
    public void process_givenTokenAndExplicitState_shouldDelegateToSpecifiedState() {
        Token.Comment comment = new Token.Comment();
        comment.data.append("test comment");
        boolean result = builder.process(comment, HtmlTreeBuilderState.Initial);
        Assert.assertTrue(result);
    }

    @Test
    public void transitionAndState_shouldUpdateAndReturnCurrentState() {
        builder.transition(HtmlTreeBuilderState.InBody);
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void markInsertionModeAndOriginalState_shouldSaveAndRestoreState() {
        builder.transition(HtmlTreeBuilderState.InTable);
        builder.markInsertionMode();
        builder.transition(HtmlTreeBuilderState.InRow);
        Assert.assertEquals(HtmlTreeBuilderState.InTable, builder.originalState());
    }

    @Test
    public void framesetOk_shouldSetAndGetFlag() {
        builder.framesetOk(false);
        Assert.assertFalse(builder.framesetOk());
        builder.framesetOk(true);
        Assert.assertTrue(builder.framesetOk());
    }

    @Test
    public void getDocumentAndBaseUri_shouldReturnInitializedValues() {
        Assert.assertNotNull(builder.getDocument());
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_givenBaseWithAbsoluteHref_shouldUpdateBaseUriOnce() {
        Element base1 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        base1.attr("href", "http://example.org/path/");
        builder.maybeSetBaseUri(base1);
        Assert.assertEquals("http://example.org/path/", builder.getBaseUri());

        Element base2 = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        base2.attr("href", "http://different.org/");
        builder.maybeSetBaseUri(base2);
        Assert.assertEquals("http://example.org/path/", builder.getBaseUri());
    }

    @Test
    public void maybeSetBaseUri_givenBaseWithEmptyHref_shouldNotUpdateBaseUri() {
        Element base = new Element(Tag.valueOf("base", ParseSettings.htmlDefault), "http://example.com/");
        builder.maybeSetBaseUri(base);
        Assert.assertEquals("http://example.com/", builder.getBaseUri());
    }

    @Test
    public void error_whenErrorsTrackingEnabled_shouldAddErrorToList() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        builder.process(tag, HtmlTreeBuilderState.Initial);
        int errorsBefore = builder.errors.size();
        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(errorsBefore + 1, builder.errors.size());
    }

    @Test
    public void error_whenErrorsTrackingDisabled_shouldNotAddError() {
        builder.initialiseParse(new StringReader(""), "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        Token.StartTag tag = new Token.StartTag();
        tag.name("p");
        builder.process(tag, HtmlTreeBuilderState.Initial);
        builder.error(HtmlTreeBuilderState.Initial);
        Assert.assertEquals(0, builder.errors.size());
    }

    @Test
    public void insertStartTag_givenTagName_shouldCreateAndPushElement() {
        Element el = builder.insertStartTag("span");
        Assert.assertNotNull(el);
        Assert.assertEquals("span", el.nodeName());
        Assert.assertTrue(builder.onStack(el));
        Assert.assertEquals(el, builder.currentElement());
    }

    @Test
    public void insert_givenStartTagNotSelfClosing_shouldCreateAndPushElement() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.attributes = new Attributes();
        tag.attributes.put("id", "testDiv");
        Element el = builder.insert(tag);
        Assert.assertNotNull(el);
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("testDiv", el.id());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void insert_givenSelfClosingStartTag_shouldEmitEmptyEndTag() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("img");
        tag.selfClosing = true;
        tag.attributes = new Attributes();
        Element el = builder.insert(tag);
        Assert.assertNotNull(el);
        Assert.assertEquals("img", el.nodeName());
        Assert.assertTrue(builder.onStack(el));
    }

    @Test
    public void insertEmpty_givenKnownSelfClosingTag_shouldAcknowledgeSelfClosing() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("img");
        tag.selfClosing = true;
        tag.attributes = new Attributes();
        Element el = builder.insertEmpty(tag);
        Assert.assertNotNull(el);
        Assert.assertEquals("img", el.nodeName());
    }

    @Test
    public void insertEmpty_givenUnknownTagMarkedSelfClosing_shouldSetSelfClosingAndAcknowledge() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("custom-tag");
        tag.selfClosing = true;
        tag.attributes = new Attributes();
        Element el = builder.insertEmpty(tag);
        Assert.assertNotNull(el);
        Assert.assertTrue(el.tag().isSelfClosing());
    }

    @Test
    public void insertForm_givenOnStackTrue_shouldSetFormAndAddToStack() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("form");
        tag.attributes = new Attributes();
        FormElement form = builder.insertForm(tag, true);
        Assert.assertNotNull(form);
        Assert.assertEquals(form, builder.getFormElement());
        Assert.assertTrue(builder.onStack(form));
    }

    @Test
    public void insertForm_givenOnStackFalse_shouldSetFormAndNotAddToStack() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("form");
        tag.attributes = new Attributes();
        FormElement form = builder.insertForm(tag, false);
        Assert.assertNotNull(form);
        Assert.assertEquals(form, builder.getFormElement());
        Assert.assertFalse(builder.onStack(form));
    }

    @Test
    public void insertComment_shouldAddCommentNode() {
        Element root = builder.insertStartTag("div");
        Token.Comment comment = new Token.Comment();
        comment.data.append("sample comment");
        builder.insert(comment);
        Assert.assertEquals(1, root.childNodeSize());
        Assert.assertTrue(root.childNode(0) instanceof Comment);
        Assert.assertEquals("sample comment", ((Comment) root.childNode(0)).getData());
    }

    @Test
    public void insertCharacter_givenStandardElement_shouldAddTextNode() {
        Element div = builder.insertStartTag("div");
        Token.Character character = new Token.Character();
        character.data("Regular text");
        builder.insert(character);
        Assert.assertEquals(1, div.childNodeSize());
        Assert.assertTrue(div.childNode(0) instanceof TextNode);
        Assert.assertEquals("Regular text", ((TextNode) div.childNode(0)).getWholeText());
    }

    @Test
    public void insertCharacter_givenScriptOrStyleElement_shouldAddDataNode() {
        Element script = builder.insertStartTag("script");
        Token.Character scriptData = new Token.Character();
        scriptData.data("var x = 10;");
        builder.insert(scriptData);
        Assert.assertEquals(1, script.childNodeSize());
        Assert.assertTrue(script.childNode(0) instanceof DataNode);
        Assert.assertEquals("var x = 10;", ((DataNode) script.childNode(0)).getWholeData());

        builder.pop();
        Element style = builder.insertStartTag("style");
        Token.Character styleData = new Token.Character();
        styleData.data("body { color: red; }");
        builder.insert(styleData);
        Assert.assertEquals(1, style.childNodeSize());
        Assert.assertTrue(style.childNode(0) instanceof DataNode);
        Assert.assertEquals("body { color: red; }", ((DataNode) style.childNode(0)).getWholeData());
    }

    @Test
    public void insertNode_whenFormListedElementInsertedAndFormElementPresent_shouldAssociateWithForm() {
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        formTag.attributes = new Attributes();
        FormElement form = builder.insertForm(formTag, true);

        Token.StartTag inputTag = new Token.StartTag();
        inputTag.name("input");
        inputTag.attributes = new Attributes();
        inputTag.attributes.put("name", "q");
        Element input = builder.insertEmpty(inputTag);

        Assert.assertTrue(form.elements().contains(input));
    }

    @Test
    public void stackOperations_pushPopGetRemove() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element p = builder.insertStartTag("p");

        Assert.assertEquals(p, builder.pop());
        Assert.assertEquals(body, builder.currentElement());

        builder.push(p);
        Assert.assertEquals(p, builder.currentElement());
        Assert.assertTrue(builder.onStack(p));
        Assert.assertEquals(p, builder.getFromStack("p"));
        Assert.assertNull(builder.getFromStack("table"));

        boolean removed = builder.removeFromStack(body);
        Assert.assertTrue(removed);
        Assert.assertFalse(builder.onStack(body));
        Assert.assertFalse(builder.removeFromStack(body));
    }

    @Test
    public void popStackToClose_singleTagName_shouldPopUntilTarget() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        builder.insertStartTag("p");

        builder.popStackToClose("div");
        Assert.assertFalse(builder.onStack(builder.getFromStack("p")));
        Assert.assertFalse(builder.onStack(builder.getFromStack("div")));
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToClose_multipleTagNames_shouldPopUntilFirstMatched() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("span");
        builder.insertStartTag("em");

        builder.popStackToClose("span", "div");
        Assert.assertEquals("body", builder.currentElement().nodeName());
    }

    @Test
    public void popStackToBefore_shouldPopUntilTargetIsTop() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("div");
        Element p = builder.insertStartTag("p");
        builder.insertStartTag("span");

        builder.popStackToBefore("p");
        Assert.assertEquals(p, builder.currentElement());
    }

    @Test
    public void clearStackToTableContext_shouldPopUntilTableOrHtml() {
        builder.insertStartTag("html");
        Element table = builder.insertStartTag("table");
        builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableContext();
        Assert.assertEquals(table, builder.currentElement());
    }

    @Test
    public void clearStackToTableBodyContext_shouldPopUntilTbodyTfootOrThead() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        Element tbody = builder.insertStartTag("tbody");
        builder.insertStartTag("tr");

        builder.clearStackToTableBodyContext();
        Assert.assertEquals(tbody, builder.currentElement());
    }

    @Test
    public void clearStackToTableRowContext_shouldPopUntilTr() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tbody");
        Element tr = builder.insertStartTag("tr");
        builder.insertStartTag("td");

        builder.clearStackToTableRowContext();
        Assert.assertEquals(tr, builder.currentElement());
    }

    @Test
    public void aboveOnStack_givenElementInStack_shouldReturnElementBelowIt() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = builder.insertStartTag("div");

        Assert.assertEquals(body, builder.aboveOnStack(div));
        Assert.assertEquals(html, builder.aboveOnStack(body));
    }

    @Test
    public void insertOnStackAfter_shouldInsertDirectlyAfterSpecifiedElement() {
        Element html = builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");

        builder.insertOnStackAfter(html, div);
        Assert.assertEquals(div, builder.getStack().get(1));
        Assert.assertEquals(body, builder.getStack().get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertOnStackAfter_givenElementNotInStack_shouldThrowException() {
        Element nonExistent = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com/");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        builder.insertOnStackAfter(nonExistent, div);
    }

    @Test
    public void replaceOnStack_shouldReplaceTargetElement() {
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element frameset = new Element(Tag.valueOf("frameset", ParseSettings.htmlDefault), "http://example.com/");

        builder.replaceOnStack(body, frameset);
        Assert.assertFalse(builder.onStack(body));
        Assert.assertTrue(builder.onStack(frameset));
        Assert.assertEquals(frameset, builder.getStack().get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void replaceOnStack_givenElementNotInStack_shouldThrowException() {
        Element nonExistent = new Element(Tag.valueOf("span", ParseSettings.htmlDefault), "http://example.com/");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        builder.replaceOnStack(nonExistent, div);
    }

    @Test
    public void resetInsertionMode_variousStackTops_shouldTransitionAppropriately() {
        String[] tags = new String[]{
                "select", "td", "th", "tr", "tbody", "thead", "tfoot", "caption", "colgroup", "table", "head", "body", "frameset", "html"
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
            builder.getStack().clear();
            builder.insertStartTag("html");
            builder.insertStartTag(tags[i]);
            builder.resetInsertionMode();
            Assert.assertEquals("Failed for tag: " + tags[i], expectedStates[i], builder.state());
        }
    }

    @Test
    public void resetInsertionMode_givenStackBottomWithNonHtml_shouldTransitionInBody() {
        builder.getStack().clear();
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        builder.push(div);
        builder.resetInsertionMode();
        Assert.assertEquals(HtmlTreeBuilderState.InBody, builder.state());
    }

    @Test
    public void inScope_targetFound_shouldReturnTrue() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");

        Assert.assertTrue(builder.inScope("p"));
        Assert.assertTrue(builder.inScope(new String[]{"p"}));
        Assert.assertTrue(builder.inScope("body"));
        Assert.assertTrue(builder.inScope("html"));
    }

    @Test
    public void inScope_scopeInterruptedByTable_shouldReturnFalse() {
        builder.insertStartTag("html");
        builder.insertStartTag("table");
        builder.insertStartTag("tr");

        Assert.assertFalse(builder.inScope("div"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inScope_emptyStack_shouldFailValidation() {
        builder.getStack().clear();
        builder.inScope("p");
    }

    @Test
    public void inListItemScope_inButtonScope_inTableScope() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("ul");
        builder.insertStartTag("li");

        Assert.assertTrue(builder.inListItemScope("li"));
        Assert.assertFalse(builder.inListItemScope("body"));

        builder.insertStartTag("button");
        Assert.assertTrue(builder.inButtonScope("button"));
        Assert.assertFalse(builder.inButtonScope("ul"));

        builder.insertStartTag("table");
        Assert.assertTrue(builder.inTableScope("table"));
        Assert.assertFalse(builder.inTableScope("body"));
    }

    @Test
    public void inSelectScope_whenInScope_shouldReturnTrue() {
        builder.insertStartTag("html");
        builder.insertStartTag("select");
        builder.insertStartTag("optgroup");
        builder.insertStartTag("option");

        Assert.assertTrue(builder.inSelectScope("option"));
        Assert.assertTrue(builder.inSelectScope("optgroup"));
        Assert.assertFalse(builder.inSelectScope("select"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inSelectScope_emptyStack_shouldFailValidation() {
        builder.getStack().clear();
        builder.inSelectScope("option");
    }

    @Test
    public void headElement_getterAndSetter() {
        Element head = new Element(Tag.valueOf("head", ParseSettings.htmlDefault), "http://example.com/");
        builder.setHeadElement(head);
        Assert.assertEquals(head, builder.getHeadElement());
    }

    @Test
    public void fosterInserts_getterAndSetter() {
        builder.setFosterInserts(true);
        Assert.assertTrue(builder.isFosterInserts());
        builder.setFosterInserts(false);
        Assert.assertFalse(builder.isFosterInserts());
    }

    @Test
    public void pendingTableCharacters_operations() {
        List<String> list = new ArrayList<String>();
        list.add("text");
        builder.setPendingTableCharacters(list);
        Assert.assertEquals(1, builder.getPendingTableCharacters().size());

        builder.newPendingTableCharacters();
        Assert.assertEquals(0, builder.getPendingTableCharacters().size());
    }

    @Test
    public void generateImpliedEndTags_shouldPopImpliedTags() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");
        builder.insertStartTag("p");
        builder.insertStartTag("dd");

        builder.generateImpliedEndTags();
        Assert.assertEquals("body", builder.currentElement().nodeName());

        builder.insertStartTag("p");
        builder.insertStartTag("dt");
        builder.generateImpliedEndTags("dt");
        Assert.assertEquals("dt", builder.currentElement().nodeName());
    }

    @Test
    public void isSpecial_givenVariousElements_shouldReturnExpectedBoolean() {
        Element p = new Element(Tag.valueOf("p", ParseSettings.htmlDefault), "http://example.com/");
        Element div = new Element(Tag.valueOf("div", ParseSettings.htmlDefault), "http://example.com/");
        Element custom = new Element(Tag.valueOf("custom-tag", ParseSettings.htmlDefault), "http://example.com/");

        Assert.assertTrue(builder.isSpecial(p));
        Assert.assertTrue(builder.isSpecial(div));
        Assert.assertFalse(builder.isSpecial(custom));
    }

    @Test
    public void formattingElements_pushPopAndLimitThree() {
        Assert.assertNull(builder.lastFormattingElement());
        Assert.assertNull(builder.removeLastFormattingElement());

        Attributes attrs = new Attributes();
        attrs.put("class", "bold");

        Element b1 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/", attrs.clone());
        Element b2 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/", attrs.clone());
        Element b3 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/", attrs.clone());
        Element b4 = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/", attrs.clone());

        builder.pushActiveFormattingElements(b1);
        builder.pushActiveFormattingElements(b2);
        builder.pushActiveFormattingElements(b3);
        Assert.assertEquals(3, builder.getActiveFormattingElement("b") != null ? 3 : 0);

        builder.pushActiveFormattingElements(b4);
        Assert.assertFalse(builder.isInActiveFormattingElements(b1));
        Assert.assertTrue(builder.isInActiveFormattingElements(b4));
        Assert.assertEquals(b4, builder.lastFormattingElement());

        Element removed = builder.removeLastFormattingElement();
        Assert.assertEquals(b4, removed);
    }

    @Test
    public void clearFormattingElementsToLastMarker_shouldClearUntilMarker() {
        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        builder.insertMarkerToFormattingElements();
        Element i = new Element(Tag.valueOf("i", ParseSettings.htmlDefault), "http://example.com/");
        builder.pushActiveFormattingElements(i);

        builder.clearFormattingElementsToLastMarker();
        Assert.assertTrue(builder.isInActiveFormattingElements(b));
        Assert.assertFalse(builder.isInActiveFormattingElements(i));
    }

    @Test
    public void removeFromActiveFormattingElements_shouldRemoveTarget() {
        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        Assert.assertTrue(builder.isInActiveFormattingElements(b));

        builder.removeFromActiveFormattingElements(b);
        Assert.assertFalse(builder.isInActiveFormattingElements(b));
    }

    @Test
    public void replaceActiveFormattingElement_shouldReplaceInList() {
        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/");
        Element i = new Element(Tag.valueOf("i", ParseSettings.htmlDefault), "http://example.com/");
        builder.pushActiveFormattingElements(b);
        builder.replaceActiveFormattingElement(b, i);

        Assert.assertFalse(builder.isInActiveFormattingElements(b));
        Assert.assertTrue(builder.isInActiveFormattingElements(i));
    }

    @Test
    public void reconstructFormattingElements_whenUnopenedElementsExist_shouldReopenThem() {
        builder.insertStartTag("html");
        builder.insertStartTag("body");

        Element b = new Element(Tag.valueOf("b", ParseSettings.htmlDefault), "http://example.com/");
        b.attr("class", "active");
        builder.pushActiveFormattingElements(b);

        builder.reconstructFormattingElements();
        Assert.assertEquals("b", builder.currentElement().nodeName());
        Assert.assertEquals("active", builder.currentElement().attr("class"));
    }

    @Test
    public void reconstructFormattingElements_whenEmptyOrAllOnStack_shouldNoOp() {
        builder.reconstructFormattingElements();

        Element html = builder.insertStartTag("html");
        builder.pushActiveFormattingElements(html);
        builder.reconstructFormattingElements();
        Assert.assertEquals("html", builder.currentElement().nodeName());
    }

    @Test
    public void insertInFosterParent_whenTableHasParent_shouldInsertBeforeTable() {
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = builder.insertStartTag("table");

        TextNode text = new TextNode("fostered text", "http://example.com/");
        builder.insertInFosterParent(text);

        Assert.assertEquals(text, body.childNode(0));
        Assert.assertEquals(table, body.childNode(1));
    }

    @Test
    public void insertInFosterParent_whenTableHasNoParent_shouldInsertIntoAboveOnStack() {
        builder.insertStartTag("html");
        Element body = builder.insertStartTag("body");
        Element table = new Element(Tag.valueOf("table", ParseSettings.htmlDefault), "http://example.com/");
        builder.push(table);

        TextNode text = new TextNode("fostered text", "http://example.com/");
        builder.insertInFosterParent(text);

        Assert.assertEquals(text, body.childNode(0));
    }

    @Test
    public void insertInFosterParent_whenNoTableOnStack_shouldInsertIntoRoot() {
        builder.getStack().clear();
        Element html = new Element(Tag.valueOf("html", ParseSettings.htmlDefault), "http://example.com/");
        builder.push(html);

        TextNode text = new TextNode("root text", "http://example.com/");
        builder.insertInFosterParent(text);

        Assert.assertEquals(text, html.childNode(0));
    }

    @Test
    public void toString_shouldReturnFormattedDiagnosticString() {
        builder.insertStartTag("html");
        String str = builder.toString();
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("TreeBuilder"));
        Assert.assertTrue(str.contains("state="));
        Assert.assertTrue(str.contains("currentElement="));
    }
}