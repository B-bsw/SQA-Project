package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {

    @Test
    public void constructor_givenValidTagAndUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("div");
        Element el = new Element(tag, "http://example.com");

        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals(tag, el.tag());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertNotNull(el.attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void tagName_givenNewValidTagName_shouldUpdateTag() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.tagName("p");

        Assert.assertSame(el, returned);
        Assert.assertEquals("p", el.tagName());
        Assert.assertEquals("p", el.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void isBlock_givenBlockAndInlineTags_shouldReturnExpectedBoolean() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");

        Assert.assertTrue(div.isBlock());
        Assert.assertFalse(span.isBlock());
    }

    @Test
    public void id_givenElementWithOrWithoutId_shouldReturnExpectedId() {
        Element elWithoutId = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals("", elWithoutId.id());

        Element elWithId = new Element(Tag.valueOf("div"), "");
        elWithId.attr("id", "main-header");
        Assert.assertEquals("main-header", elWithId.id());
    }

    @Test
    public void attr_givenKeyValue_shouldSetAttributeAndReturnThis() {
        Element el = new Element(Tag.valueOf("a"), "");
        Element returned = el.attr("href", "http://example.com");

        Assert.assertSame(el, returned);
        Assert.assertEquals("http://example.com", el.attr("href"));
    }

    @Test
    public void dataset_givenAttributes_shouldReturnDatasetMap() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-user-id", "12345");
        Map<String, String> dataset = el.dataset();

        Assert.assertNotNull(dataset);
        Assert.assertEquals("12345", dataset.get("user-id"));
    }

    @Test
    public void parentAndParents_givenHierarchy_shouldTraverseCorrectly() {
        Element root = new Element(Tag.valueOf("html"), "");
        Element body = root.appendElement("body");
        Element div = body.appendElement("div");
        Element p = div.appendElement("p");

        Assert.assertSame(div, p.parent());
        Assert.assertSame(body, div.parent());

        Elements parents = p.parents();
        Assert.assertEquals(3, parents.size());
        Assert.assertSame(div, parents.get(0));
        Assert.assertSame(body, parents.get(1));
        Assert.assertSame(root, parents.get(2));
    }

    @Test
    public void parents_givenRootTagParent_shouldStopAccumulatingAtRoot() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element child = root.appendElement("div");

        Elements parents = child.parents();
        Assert.assertEquals(0, parents.size());
    }

    @Test
    public void childrenAndChild_givenVariousNodeTypes_shouldReturnOnlyElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Some initial text");
        Element childSpan = div.appendElement("span");
        div.appendText("Middle text");
        Element childP = div.appendElement("p");

        Elements children = div.children();
        Assert.assertEquals(2, children.size());
        Assert.assertSame(childSpan, div.child(0));
        Assert.assertSame(childP, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_givenOutOfBoundsIndex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.child(0);
    }

    @Test
    public void textNodes_givenMixedChildren_shouldReturnOnlyTextNodes() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendText("First");
        div.appendElement("span");
        div.appendText("Second");

        List<TextNode> textNodes = div.textNodes();
        Assert.assertEquals(2, textNodes.size());
        Assert.assertEquals("First", textNodes.get(0).getWholeText());
        Assert.assertEquals("Second", textNodes.get(1).getWholeText());
    }

    @Test
    public void dataNodes_givenDataNodeChild_shouldReturnDataNodes() {
        Element script = new Element(Tag.valueOf("script"), "");
        DataNode dataNode = new DataNode("var x = 10;", "");
        script.appendChild(dataNode);
        script.appendElement("div");

        List<DataNode> dataNodes = script.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 10;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void select_givenValidCssQuery_shouldReturnMatchingElements() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element span = root.appendElement("span");
        span.attr("class", "findme");

        Elements matched = root.select("span.findme");
        Assert.assertEquals(1, matched.size());
        Assert.assertSame(span, matched.get(0));
    }

    @Test
    public void appendAndPrependChild_givenChildNodes_shouldInsertAtProperPositions() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");

        parent.appendChild(child1);
        Assert.assertEquals(1, parent.children().size());
        Assert.assertSame(child1, parent.child(0));

        parent.prependChild(child2);
        Assert.assertEquals(2, parent.children().size());
        Assert.assertSame(child2, parent.child(0));
        Assert.assertSame(child1, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNull_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNull_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.prependChild(null);
    }

    @Test
    public void appendAndPrependElement_givenTagNames_shouldCreateAndInsertElements() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("b");
        Element child0 = parent.prependElement("i");

        Assert.assertEquals("b", child1.tagName());
        Assert.assertEquals("i", child0.tagName());
        Assert.assertSame(child0, parent.child(0));
        Assert.assertSame(child1, parent.child(1));
    }

    @Test
    public void appendAndPrependText_givenStrings_shouldCreateAndInsertTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendText("World");
        parent.prependText("Hello ");

        Assert.assertEquals("Hello World", parent.text());
        Assert.assertEquals(2, parent.textNodes().size());
    }

    @Test
    public void appendAndPrependHtml_givenHtmlString_shouldParseAndInsertNodes() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.append("<span>World</span>");
        div.prepend("<b>Hello</b>");

        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("b", div.child(0).tagName());
        Assert.assertEquals("span", div.child(1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendHtml_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependHtml_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prepend(null);
    }

    @Test
    public void beforeAndAfter_givenNodesAndHtml_shouldInsertCorrectlyInParent() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element target = parent.appendElement("span");

        target.before("<p>First</p>");
        target.after("<i>Last</i>");

        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("p", parent.child(0).tagName());
        Assert.assertEquals("span", parent.child(1).tagName());
        Assert.assertEquals("i", parent.child(2).tagName());

        Element nodeBefore = new Element(Tag.valueOf("b"), "http://example.com");
        Element nodeAfter = new Element(Tag.valueOf("u"), "http://example.com");
        target.before(nodeBefore);
        target.after(nodeAfter);

        Assert.assertEquals(5, parent.children().size());
        Assert.assertSame(nodeBefore, parent.child(1));
        Assert.assertSame(target, parent.child(2));
        Assert.assertSame(nodeAfter, parent.child(3));
    }

    @Test
    public void empty_givenElementWithChildren_shouldClearAllChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        div.appendText("text");

        Assert.assertTrue(div.childNodes.size() > 0);
        Element returned = div.empty();

        Assert.assertSame(div, returned);
        Assert.assertEquals(0, div.childNodes.size());
        Assert.assertEquals(0, div.children().size());
    }

    @Test
    public void wrap_givenHtml_shouldWrapElementInHtmlStructure() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("span");
        child.text("Content");

        Element wrapped = child.wrap("<div class='wrapper'></div>");
        Assert.assertSame(child, wrapped);
        Assert.assertEquals("wrapper", child.parent().className());
        Assert.assertSame(root, child.parent().parent());
    }

    @Test
    public void siblingNavigation_givenMultipleSiblings_shouldTraverseCorrectly() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.appendElement("p");
        Element child3 = parent.appendElement("b");

        Elements siblings = child2.siblingElements();
        Assert.assertEquals(3, siblings.size());

        Assert.assertSame(child2, child1.nextElementSibling());
        Assert.assertSame(child3, child2.nextElementSibling());
        Assert.assertNull(child3.nextElementSibling());

        Assert.assertSame(child2, child3.previousElementSibling());
        Assert.assertSame(child1, child2.previousElementSibling());
        Assert.assertNull(child1.previousElementSibling());

        Assert.assertSame(child1, child1.firstElementSibling());
        Assert.assertSame(child1, child2.firstElementSibling());
        Assert.assertSame(child3, child2.lastElementSibling());

        Assert.assertEquals(Integer.valueOf(0), child1.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), child2.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(2), child3.elementSiblingIndex());
    }

    @Test
    public void siblingNavigation_givenSingleChildOrNoParent_shouldHandleGracefully() {
        Element orphan = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(Integer.valueOf(0), orphan.elementSiblingIndex());

        Element parent = new Element(Tag.valueOf("div"), "");
        Element onlyChild = parent.appendElement("span");
        Assert.assertNull(onlyChild.firstElementSibling());
        Assert.assertNull(onlyChild.lastElementSibling());
        Assert.assertNull(onlyChild.nextElementSibling());
        Assert.assertNull(onlyChild.previousElementSibling());
    }

    @Test
    public void getElementsByTag_givenTagName_shouldReturnMatchingDescendants() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span1 = div.appendElement("span");
        Element subDiv = div.appendElement("div");
        Element span2 = subDiv.appendElement("span");

        Elements spans = div.getElementsByTag("SPAN");
        Assert.assertEquals(2, spans.size());
        Assert.assertSame(span1, spans.get(0));
        Assert.assertSame(span2, spans.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_givenEmpty_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByTag("   ");
    }

    @Test
    public void getElementById_givenExistingAndNonExistingId_shouldReturnElementOrNull() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = div.appendElement("p");
        p.attr("id", "target");

        Element found = div.getElementById("target");
        Assert.assertSame(p, found);

        Element notFound = div.getElementById("missing");
        Assert.assertNull(notFound);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_givenEmptyId_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementById("");
    }

    @Test
    public void getElementsByClass_givenClassName_shouldReturnMatchingElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child1 = div.appendElement("span").attr("class", "alert alert-danger");
        Element child2 = div.appendElement("p").attr("class", "alert");
        div.appendElement("b").attr("class", "normal");

        Elements alerts = div.getElementsByClass("alert");
        Assert.assertEquals(2, alerts.size());
        Assert.assertSame(child1, alerts.get(0));
        Assert.assertSame(child2, alerts.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_givenEmptyClass_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByClass("");
    }

    @Test
    public void getElementsByAttribute_givenAttributeConditions_shouldReturnMatches() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child1 = div.appendElement("a").attr("href", "http://example.com/start");
        Element child2 = div.appendElement("a").attr("href", "http://jsoup.org/end");
        Element child3 = div.appendElement("div").attr("data-custom", "value-123");

        Elements hrefElements = div.getElementsByAttribute("HREF");
        Assert.assertEquals(2, hrefElements.size());

        Elements startingWithData = div.getElementsByAttributeStarting("DATA-");
        Assert.assertEquals(1, startingWithData.size());
        Assert.assertSame(child3, startingWithData.get(0));

        Elements exactVal = div.getElementsByAttributeValue("href", "http://jsoup.org/end");
        Assert.assertEquals(1, exactVal.size());
        Assert.assertSame(child2, exactVal.get(0));

        Elements notVal = div.getElementsByAttributeValueNot("href", "http://jsoup.org/end");
        Assert.assertTrue(notVal.contains(child1));
        Assert.assertTrue(notVal.contains(child3));
        Assert.assertFalse(notVal.contains(child2));

        Elements startsVal = div.getElementsByAttributeValueStarting("href", "http://example");
        Assert.assertEquals(1, startsVal.size());
        Assert.assertSame(child1, startsVal.get(0));

        Elements endsVal = div.getElementsByAttributeValueEnding("href", "end");
        Assert.assertEquals(1, endsVal.size());
        Assert.assertSame(child2, endsVal.get(0));

        Elements containsVal = div.getElementsByAttributeValueContaining("href", "jsoup");
        Assert.assertEquals(1, containsVal.size());
        Assert.assertSame(child2, containsVal.get(0));

        Elements matchingPattern = div.getElementsByAttributeValueMatching("data-custom", Pattern.compile("^value-\\d+$"));
        Assert.assertEquals(1, matchingPattern.size());
        Assert.assertSame(child3, matchingPattern.get(0));

        Elements matchingRegex = div.getElementsByAttributeValueMatching("data-custom", "^value-\\d+$");
        Assert.assertEquals(1, matchingRegex.size());
        Assert.assertSame(child3, matchingRegex.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttributeValueMatching("attr", "[invalid(");
    }

    @Test
    public void getElementsByIndexFilters_givenIndices_shouldReturnMatchingElements() {
        Element ul = new Element(Tag.valueOf("ul"), "");
        Element li0 = ul.appendElement("li");
        Element li1 = ul.appendElement("li");
        Element li2 = ul.appendElement("li");

        Elements lessThan1 = ul.getElementsByIndexLessThan(1);
        Assert.assertEquals(1, lessThan1.size());
        Assert.assertSame(li0, lessThan1.get(0));

        Elements greaterThan1 = ul.getElementsByIndexGreaterThan(1);
        Assert.assertEquals(1, greaterThan1.size());
        Assert.assertSame(li2, greaterThan1.get(0));

        Elements equals1 = ul.getElementsByIndexEquals(1);
        Assert.assertEquals(1, equals1.size());
        Assert.assertSame(li1, equals1.get(0));
    }

    @Test
    public void getTextSearchMethods_givenTextAndRegex_shouldReturnExpectedMatches() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = div.appendElement("p").text("Quick brown fox");
        Element p2 = div.appendElement("p").text("Lazy dog");

        Elements containing = div.getElementsContainingText("brown");
        Assert.assertTrue(containing.contains(div));
        Assert.assertTrue(containing.contains(p1));
        Assert.assertFalse(containing.contains(p2));

        Elements containingOwn = div.getElementsContainingOwnText("brown");
        Assert.assertFalse(containingOwn.contains(div));
        Assert.assertTrue(containingOwn.contains(p1));

        Elements matchingText = div.getElementsMatchingText(Pattern.compile(".*fox.*"));
        Assert.assertTrue(matchingText.contains(p1));

        Elements matchingTextRegex = div.getElementsMatchingText(".*lazy.*");
        Assert.assertEquals(0, matchingTextRegex.size());

        Elements matchingOwn = div.getElementsMatchingOwnText(Pattern.compile("^Quick.*"));
        Assert.assertEquals(1, matchingOwn.size());
        Assert.assertSame(p1, matchingOwn.get(0));

        Elements matchingOwnRegex = div.getElementsMatchingOwnText("^Lazy.*");
        Assert.assertEquals(1, matchingOwnRegex.size());
        Assert.assertSame(p2, matchingOwnRegex.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsMatchingText("(unclosed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsMatchingOwnText("(unclosed");
    }

    @Test
    public void getAllElements_givenHierarchy_shouldIncludeSelfAndAllDescendants() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        Element grandChild = child.appendElement("span");

        Elements all = root.getAllElements();
        Assert.assertEquals(3, all.size());
        Assert.assertSame(root, all.get(0));
        Assert.assertSame(child, all.get(1));
        Assert.assertSame(grandChild, all.get(2));
    }

    @Test
    public void text_givenNestedElementsAndBlocks_shouldAccumulateWithProperWhitespace() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Hello ");
        Element span = div.appendElement("span");
        span.text("World");
        Element p = div.appendElement("p");
        p.text("New paragraph");

        Assert.assertEquals("Hello World New paragraph", div.text());
        Assert.assertEquals("Hello", div.ownText());
        Assert.assertEquals("New paragraph", p.text());
        Assert.assertEquals("New paragraph", p.ownText());
    }

    @Test
    public void text_givenBrTag_shouldAppendWhitespace() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Line1");
        div.appendElement("br");
        div.appendText("Line2");

        Assert.assertEquals("Line1 Line2", div.text());
        Assert.assertEquals("Line1 Line2", div.ownText());
    }

    @Test
    public void text_givenWhitespacePreservingTag_shouldPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("  Line1 \n  Line2  ");

        Assert.assertTrue(pre.preserveWhitespace());
        Assert.assertEquals("Line1 \n  Line2", pre.text().trim());

        Element childSpan = pre.appendElement("span");
        childSpan.appendText("   more   ");
        Assert.assertTrue(childSpan.preserveWhitespace());
    }

    @Test
    public void textSetter_givenString_shouldClearExistingAndSetSingleTextNode() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.appendElement("span").text("to be replaced");
        Element returned = div.text("Replacement text");

        Assert.assertSame(div, returned);
        Assert.assertEquals(1, div.childNodes.size());
        Assert.assertEquals("Replacement text", div.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void textSetter_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.text(null);
    }

    @Test
    public void hasText_givenVariousContents_shouldReturnExpectedBoolean() {
        Element emptyDiv = new Element(Tag.valueOf("div"), "");
        Assert.assertFalse(emptyDiv.hasText());

        Element divWithWhitespace = new Element(Tag.valueOf("div"), "");
        divWithWhitespace.appendText("   ");
        Assert.assertFalse(divWithWhitespace.hasText());

        Element divWithText = new Element(Tag.valueOf("div"), "");
        divWithText.appendText("Text");
        Assert.assertTrue(divWithText.hasText());

        Element divWithNestedText = new Element(Tag.valueOf("div"), "");
        divWithNestedText.appendElement("span").text("Nested");
        Assert.assertTrue(divWithNestedText.hasText());
    }

    @Test
    public void data_givenDataNodesAndNestedElements_shouldConcatenateData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        Element subScript = script.appendElement("script");
        subScript.appendChild(new DataNode("var b = 2;", ""));

        Assert.assertEquals("var a = 1;var b = 2;", script.data());
    }

    @Test
    public void classMethods_givenClassManipulations_shouldWorkCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "one two");

        Assert.assertEquals("one two", div.className());
        Set<String> classes = div.classNames();
        Assert.assertEquals(2, classes.size());
        Assert.assertTrue(classes.contains("one"));
        Assert.assertTrue(classes.contains("two"));

        Assert.assertTrue(div.hasClass("ONE"));
        Assert.assertTrue(div.hasClass("two"));
        Assert.assertFalse(div.hasClass("three"));

        div.addClass("three");
        Assert.assertTrue(div.hasClass("three"));

        div.removeClass("two");
        Assert.assertFalse(div.hasClass("two"));

        div.toggleClass("four");
        Assert.assertTrue(div.hasClass("four"));
        div.toggleClass("four");
        Assert.assertFalse(div.hasClass("four"));

        Set<String> newClasses = new LinkedHashSet<String>();
        newClasses.add("alpha");
        newClasses.add("beta");
        div.classNames(newClasses);
        Assert.assertEquals("alpha beta", div.className());
        Assert.assertTrue(div.hasClass("alpha"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClass_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeClass_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toggleClass_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.toggleClass(null);
    }

    @Test
    public void val_givenInputAndTextarea_shouldGetAndSetValueProperly() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("test-value");
        Assert.assertEquals("test-value", input