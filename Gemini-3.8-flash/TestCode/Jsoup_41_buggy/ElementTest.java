package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    @Test
    public void constructor_givenTagAndBaseUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("div");
        Element el = new Element(tag, "http://example.com");

        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals(tag, el.tag());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertTrue(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void tagName_givenNewValidTagName_shouldChangeTagName() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("span");

        Assert.assertEquals("span", el.tagName());
        Assert.assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void id_givenElementWithIdAttribute_shouldReturnId() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "main-content");

        Assert.assertEquals("main-content", el.id());
    }

    @Test
    public void id_givenElementWithoutIdAttribute_shouldReturnEmptyString() {
        Element el = new Element(Tag.valueOf("div"), "");

        Assert.assertEquals("", el.id());
    }

    @Test
    public void dataset_givenDataAttributes_shouldReturnDatasetMap() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-role", "admin");
        el.attr("data-action", "edit");

        Map<String, String> dataset = el.dataset();

        Assert.assertEquals("admin", dataset.get("role"));
        Assert.assertEquals("edit", dataset.get("action"));
    }

    @Test
    public void parent_givenChildElement_shouldReturnParentElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        Assert.assertEquals(parent, child.parent());
    }

    @Test
    public void parents_givenHierarchy_shouldReturnAllParentsExceptRoot() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");

        root.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();

        Assert.assertEquals(1, parents.size());
        Assert.assertEquals(parent, parents.get(0));
    }

    @Test
    public void children_givenMixedChildren_shouldReturnOnlyElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        TextNode textChild = new TextNode("Hello", "");
        Element child2 = new Element(Tag.valueOf("p"), "");

        parent.appendChild(child1);
        parent.appendChild(textChild);
        parent.appendChild(child2);

        Elements children = parent.children();

        Assert.assertEquals(2, children.size());
        Assert.assertEquals(child1, children.get(0));
        Assert.assertEquals(child2, children.get(1));
        Assert.assertEquals(child1, parent.child(0));
    }

    @Test
    public void textNodes_givenMixedChildren_shouldReturnOnlyTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        TextNode text1 = new TextNode("First", "");
        Element child = new Element(Tag.valueOf("span"), "");
        TextNode text2 = new TextNode("Second", "");

        parent.appendChild(text1);
        parent.appendChild(child);
        parent.appendChild(text2);

        List<TextNode> textNodes = parent.textNodes();

        Assert.assertEquals(2, textNodes.size());
        Assert.assertEquals("First", textNodes.get(0).getWholeText());
        Assert.assertEquals("Second", textNodes.get(1).getWholeText());
    }

    @Test
    public void dataNodes_givenDataNodeChild_shouldReturnDataNodes() {
        Element script = new Element(Tag.valueOf("script"), "");
        DataNode data = new DataNode("var x = 10;", "");
        script.appendChild(data);

        List<DataNode> dataNodes = script.dataNodes();

        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 10;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void appendChild_givenValidChild_shouldAppendAndSetSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(2, parent.childNodes.size());
        Assert.assertEquals(1, child2.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNullChild_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(null);
    }

    @Test
    public void prependChild_givenValidChild_shouldPrependAsFirstChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");

        parent.appendChild(child1);
        parent.prependChild(child2);

        Assert.assertEquals(2, parent.childNodes.size());
        Assert.assertEquals(child2, parent.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNullChild_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.prependChild(null);
    }

    @Test
    public void insertChildren_givenPositiveIndex_shouldInsertAtSpecifiedIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("c");

        List<Node> newNodes = new ArrayList<Node>();
        newNodes.add(new Element(Tag.valueOf("b"), ""));

        parent.insertChildren(1, newNodes);

        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("b", parent.child(1).tagName());
    }

    @Test
    public void insertChildren_givenNegativeIndex_shouldInsertFromEnd() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("c");

        List<Node> newNodes = new ArrayList<Node>();
        newNodes.add(new Element(Tag.valueOf("d"), ""));

        parent.insertChildren(-1, newNodes);

        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("d", parent.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(5, new ArrayList<Node>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullChildrenCollection_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(0, null);
    }

    @Test
    public void appendElementAndPrependElement_givenTagNames_shouldAppendAndPrepend() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element appended = parent.appendElement("p");
        Element prepended = parent.prependElement("header");

        Assert.assertEquals("p", appended.tagName());
        Assert.assertEquals("header", prepended.tagName());
        Assert.assertEquals(prepended, parent.child(0));
        Assert.assertEquals(appended, parent.child(1));
    }

    @Test
    public void appendTextAndPrependText_givenTextStrings_shouldAddTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("World");
        parent.prependText("Hello ");

        Assert.assertEquals("Hello World", parent.text());
    }

    @Test
    public void appendAndPrepend_givenHtmlFragments_shouldParseAndAddNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p>End</p>");
        parent.prepend("<h1>Start</h1>");

        Assert.assertEquals(2, parent.children().size());
        Assert.assertEquals("h1", parent.child(0).tagName());
        Assert.assertEquals("p", parent.child(1).tagName());
    }

    @Test
    public void empty_givenElementWithChildren_shouldClearChildNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        parent.appendText("Some text");

        Assert.assertFalse(parent.childNodes.isEmpty());
        parent.empty();
        Assert.assertTrue(parent.childNodes.isEmpty());
    }

    @Test
    public void cssSelector_givenElementWithId_shouldReturnIdSelector() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("id", "header");

        Assert.assertEquals("#header", el.cssSelector());
    }

    @Test
    public void cssSelector_givenElementWithClasses_shouldReturnClassSelector() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("main");
        el.addClass("highlight");

        Assert.assertEquals("div.main.highlight", el.cssSelector());
    }

    @Test
    public void cssSelector_givenParentWithMultipleMatchingChildren_shouldIncludeNthChild() {
        Element parent = new Element(Tag.valueOf("ul"), "");
        Element li1 = parent.appendElement("li");
        Element li2 = parent.appendElement("li");

        Assert.assertEquals("ul > li:nth-child(2)", li2.cssSelector());
    }

    @Test
    public void siblingElements_givenParentAndSiblings_shouldReturnAllOtherSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("h1");
        Element child2 = parent.appendElement("p");
        Element child3 = parent.appendElement("span");

        Elements siblings = child2.siblingElements();

        Assert.assertEquals(2, siblings.size());
        Assert.assertEquals(child1, siblings.get(0));
        Assert.assertEquals(child3, siblings.get(1));
    }

    @Test
    public void siblingElements_givenOrphanElement_shouldReturnEmptyElements() {
        Element el = new Element(Tag.valueOf("div"), "");

        Assert.assertEquals(0, el.siblingElements().size());
        Assert.assertNull(el.nextElementSibling());
        Assert.assertNull(el.previousElementSibling());
        Assert.assertEquals(Integer.valueOf(0), el.elementSiblingIndex());
    }

    @Test
    public void nextAndPreviousElementSibling_givenAdjacentSiblings_shouldNavigateCorrectly() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("h1");
        Element middle = parent.appendElement("p");
        Element last = parent.appendElement("span");

        Assert.assertEquals(middle, first.nextElementSibling());
        Assert.assertNull(first.previousElementSibling());
        Assert.assertEquals(first, middle.previousElementSibling());
        Assert.assertEquals(last, middle.nextElementSibling());
        Assert.assertEquals(middle, last.previousElementSibling());
        Assert.assertNull(last.nextElementSibling());
    }

    @Test
    public void firstAndLastElementSibling_givenMultipleChildren_shouldReturnBoundaries() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element first = parent.appendElement("h1");
        parent.appendElement("p");
        Element last = parent.appendElement("span");

        Assert.assertEquals(first, first.firstElementSibling());
        Assert.assertEquals(last, first.lastElementSibling());
    }

    @Test
    public void firstAndLastElementSibling_givenSingleChild_shouldReturnNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element onlyChild = parent.appendElement("h1");

        Assert.assertNull(onlyChild.firstElementSibling());
        Assert.assertNull(onlyChild.lastElementSibling());
    }

    @Test
    public void getElementsByTag_givenTagName_shouldReturnMatchingDescendants() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<span>1</span><p><span>2</span></p>");

        Elements spans = parent.getElementsByTag("span");

        Assert.assertEquals(2, spans.size());
    }

    @Test
    public void getElementById_givenExistingId_shouldReturnMatchingElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("p");
        child.attr("id", "target");

        Element result = parent.getElementById("target");

        Assert.assertNotNull(result);
        Assert.assertEquals(child, result);
    }

    @Test
    public void getElementById_givenNonExistingId_shouldReturnNull() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");

        Assert.assertNull(parent.getElementById("not-found"));
    }

    @Test
    public void getElementsByClass_givenClassName_shouldReturnMatchingElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p class='alert item'>1</p><span class='alert'>2</span>");

        Elements elements = parent.getElementsByClass("alert");

        Assert.assertEquals(2, elements.size());
    }

    @Test
    public void getElementsByAttribute_givenAttributeConditions_shouldReturnMatches() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<a href='http://jsoup.org' title='home'>Link 1</a>");
        parent.append("<a href='https://example.com'>Link 2</a>");

        Assert.assertEquals(2, parent.getElementsByAttribute("href").size());
        Assert.assertEquals(1, parent.getElementsByAttributeStarting("ti").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValue("title", "home").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueNot("title", "home").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueStarting("href", "https").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueEnding("href", ".org").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueContaining("href", "example").size());
    }

    @Test
    public void getElementsByAttributeValueMatching_givenPatternAndRegex_shouldMatch() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<input value='12345' /><input value='abc' />");

        Elements matchedPattern = parent.getElementsByAttributeValueMatching("value", Pattern.compile("^\\d+$"));
        Elements matchedRegex = parent.getElementsByAttributeValueMatching("value", "^[a-z]+$");

        Assert.assertEquals(1, matchedPattern.size());
        Assert.assertEquals("12345", matchedPattern.get(0).val());
        Assert.assertEquals(1, matchedRegex.size());
        Assert.assertEquals("abc", matchedRegex.get(0).val());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.getElementsByAttributeValueMatching("value", "[unclosed");
    }

    @Test
    public void getElementsByIndexQueries_givenValidIndexes_shouldReturnMatchingElements() {
        Element parent = new Element(Tag.valueOf("ul"), "");
        parent.append("<li>0</li><li>1</li><li>2</li>");

        Assert.assertEquals(1, parent.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(1, parent.getElementsByIndexGreaterThan(1).size());
        Assert.assertEquals(1, parent.getElementsByIndexEquals(1).size());
    }

    @Test
    public void getTextQueryMethods_givenTextsAndPatterns_shouldMatchCorrectly() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p>Hello World</p><p><span>Hello</span> Jsoup</p>");

        Assert.assertEquals(2, parent.getElementsContainingText("Hello").size());
        Assert.assertEquals(1, parent.getElementsContainingOwnText("Jsoup").size());
        Assert.assertEquals(2, parent.getElementsMatchingText("^Hello.*").size());
        Assert.assertEquals(1, parent.getElementsMatchingOwnText("World").size());
        Assert.assertEquals(4, parent.getAllElements().size()); // div, p, p, span
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.getElementsMatchingText("(?invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.getElementsMatchingOwnText("(?invalid");
    }

    @Test
    public void text_givenNestedBlockAndInlineElements_shouldFormatWithWhitespace() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("Hello<div>World</div><span>Foo</span><br>Bar");

        Assert.assertEquals("Hello World Foo Bar", parent.text());
        Assert.assertEquals("Hello Bar", parent.ownText());
    }

    @Test
    public void text_givenTextSetter_shouldReplaceChildrenWithTextNode() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p>Old Content</p>");

        parent.text("New Content");

        Assert.assertEquals("New Content", parent.text());
        Assert.assertEquals(1, parent.childNodes.size());
        Assert.assertTrue(parent.childNode(0) instanceof TextNode);
    }

    @Test
    public void hasText_givenElementsWithAndWithoutText_shouldReturnExpectedBoolean() {
        Element emptyEl = new Element(Tag.valueOf("div"), "");
        Element whitespaceEl = new Element(Tag.valueOf("div"), "");
        whitespaceEl.appendText("   ");
        Element textEl = new Element(Tag.valueOf("div"), "");
        textEl.append("<p>Content</p>");

        Assert.assertFalse(emptyEl.hasText());
        Assert.assertFalse(whitespaceEl.hasText());
        Assert.assertTrue(textEl.hasText());
    }

    @Test
    public void preserveWhitespace_givenPreformattedTag_shouldPreserveWhitespaceInText() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        TextNode text = new TextNode("  line 1  \n  line 2  ", "");
        pre.appendChild(text);

        Assert.assertTrue(Element.preserveWhitespace(pre));
        Assert.assertEquals("  line 1  \n  line 2  ", pre.text());
    }

    @Test
    public void preserveWhitespace_givenNullOrStandardTag_shouldReturnFalse() {
        Assert.assertFalse(Element.preserveWhitespace(null));
        Assert.assertFalse(Element.preserveWhitespace(new Element(Tag.valueOf("p"), "")));
    }

    @Test
    public void data_givenScriptWithDataNodeAndElement_shouldReturnCombinedData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        Element subScript = new Element(Tag.valueOf("script"), "");
        subScript.appendChild(new DataNode("var b = 2;", ""));
        script.appendChild(subScript);

        Assert.assertEquals("var a = 1;var b = 2;", script.data());
    }

    @Test
    public void classOperations_givenVariousScenarios_shouldManipulateClassesCorrectly() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "  btn   btn-primary  ");

        Assert.assertEquals("btn btn-primary", el.className());
        Set<String> classes = el.classNames();
        Assert.assertTrue(classes.contains("btn"));
        Assert.assertTrue(classes.contains("btn-primary"));
        Assert.assertTrue(el.hasClass("BTN"));

        el.addClass("active");
        Assert.assertTrue(el.hasClass("active"));

        el.removeClass("btn-primary");
        Assert.assertFalse(el.hasClass("btn-primary"));

        el.toggleClass("active");
        Assert.assertFalse(el.hasClass("active"));

        el.toggleClass("active");
        Assert.assertTrue(el.hasClass("active"));

        Set<String> newClasses = new LinkedHashSet<String>(Arrays.asList("custom1", "custom2"));
        el.classNames(newClasses);
        Assert.assertEquals("custom1 custom2", el.className());
    }

    @Test
    public void val_givenStandardInputAndTextarea_shouldGetAndSetValue() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("testValue");
        Assert.assertEquals("testValue", input.val());

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("multiline\ncontent");
        Assert.assertEquals("multiline content", textarea.val()); // normalised via text()
    }

    @Test
    public void html_givenHtmlSetterAndGetter_shouldRenderInnerHtml() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.html("<span>Hello</span>");

        Assert.assertEquals("<span>Hello</span>", el.html());
    }

    @Test
    public void outerHtml_givenSelfClosingTagInHtmlAndXmlSyntax_shouldFormatProperly() {
        Element img = new Element(Tag.valueOf("img"), "");

        Document.OutputSettings htmlSettings = new Document.OutputSettings();
        htmlSettings.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder htmlAccum = new StringBuilder();
        img.outerHtmlHead(htmlAccum, 0, htmlSettings);
        img.outerHtmlTail(htmlAccum, 0, htmlSettings);
        Assert.assertEquals("<img>", htmlAccum.toString());

        Document.OutputSettings xmlSettings = new Document.OutputSettings();
        xmlSettings.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder xmlAccum = new StringBuilder();
        img.outerHtmlHead(xmlAccum, 0, xmlSettings);
        img.outerHtmlTail