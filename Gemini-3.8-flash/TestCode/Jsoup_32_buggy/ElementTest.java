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

public class ElementTest {

    @Test
    public void constructor_givenValidTagAndUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("div");
        Element element = new Element(tag, "http://example.com");

        Assert.assertEquals("div", element.nodeName());
        Assert.assertEquals("div", element.tagName());
        Assert.assertEquals(tag, element.tag());
        Assert.assertEquals("http://example.com", element.baseUri());
        Assert.assertTrue(element.isBlock());
        Assert.assertEquals("", element.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void tagName_givenNewValidTagName_shouldChangeTag() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.tagName("span");

        Assert.assertEquals("span", element.tagName());
        Assert.assertFalse(element.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.tagName("");
    }

    @Test
    public void id_givenIdAttribute_shouldReturnIdValue() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("id", "main-header");

        Assert.assertEquals("main-header", element.id());
    }

    @Test
    public void id_givenNoIdAttribute_shouldReturnEmptyString() {
        Element element = new Element(Tag.valueOf("div"), "");

        Assert.assertEquals("", element.id());
    }

    @Test
    public void attr_givenKeyValue_shouldSetAndChain() {
        Element element = new Element(Tag.valueOf("a"), "");
        Element returned = element.attr("href", "http://jsoup.org");

        Assert.assertSame(element, returned);
        Assert.assertEquals("http://jsoup.org", element.attr("href"));
    }

    @Test
    public void dataset_givenDataAttributes_shouldReturnDatasetMap() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("data-user-id", "12345");

        Map<String, String> dataset = element.dataset();
        Assert.assertEquals("12345", dataset.get("user-id"));
    }

    @Test
    public void parentAndParents_givenHierarchy_shouldTraverseCorrectly() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element html = root.appendElement("html");
        Element body = html.appendElement("body");
        Element div = body.appendElement("div");

        Assert.assertSame(body, div.parent());
        Elements parents = div.parents();
        Assert.assertEquals(2, parents.size());
        Assert.assertEquals("body", parents.get(0).tagName());
        Assert.assertEquals("html", parents.get(1).tagName());
    }

    @Test
    public void childAndChildren_givenMixedNodes_shouldFilterOnlyElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("Text before ");
        Element child1 = parent.appendElement("span");
        parent.appendText(" Text middle ");
        Element child2 = parent.appendElement("b");

        Assert.assertEquals(2, parent.children().size());
        Assert.assertSame(child1, parent.child(0));
        Assert.assertSame(child2, parent.child(1));
    }

    @Test
    public void textNodesAndDataNodes_givenNodes_shouldReturnUnmodifiableFilteredLists() {
        Element parent = new Element(Tag.valueOf("script"), "");
        parent.appendText("Sample Text");
        DataNode dataNode = new DataNode("var x = 1;", "");
        parent.appendChild(dataNode);

        List<TextNode> textNodes = parent.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertEquals("Sample Text", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = parent.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 1;", dataNodes.get(0).getWholeData());

        try {
            textNodes.add(new TextNode("Forbidden", ""));
            Assert.fail("textNodes list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }

        try {
            dataNodes.add(new DataNode("Forbidden", ""));
            Assert.fail("dataNodes list should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void select_givenQuery_shouldReturnMatchingElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = div.appendElement("span");
        span.addClass("test-class");

        Elements result = div.select("span.test-class");
        Assert.assertEquals(1, result.size());
        Assert.assertSame(span, result.first());
    }

    @Test
    public void appendChildAndPrependChild_givenNodes_shouldInsertAtBoundaries() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("b"), "");

        parent.appendChild(child1);
        parent.prependChild(child2);

        Assert.assertEquals(2, parent.children().size());
        Assert.assertSame(child2, parent.child(0));
        Assert.assertSame(child1, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNull_shouldThrowException() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNull_shouldThrowException() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.prependChild(null);
    }

    @Test
    public void insertChildren_givenValidIndexAndNegativeIndex_shouldInsertCorrectly() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        parent.appendElement("b");

        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new Element(Tag.valueOf("span"), ""));

        parent.insertChildren(1, toInsert);
        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("span", parent.child(1).tagName());

        List<Node> toInsertNegative = new ArrayList<Node>();
        toInsertNegative.add(new Element(Tag.valueOf("i"), ""));
        parent.insertChildren(-1, toInsertNegative);
        Assert.assertEquals(4, parent.children().size());
        Assert.assertEquals("i", parent.child(3).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullChildren_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        List<Node> list = new ArrayList<Node>();
        list.add(new Element(Tag.valueOf("span"), ""));
        parent.insertChildren(5, list);
    }

    @Test
    public void appendElementAndPrependElement_givenTag_shouldCreateAndInsert() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element b = div.appendElement("b");
        Element i = div.prependElement("i");

        Assert.assertEquals(2, div.children().size());
        Assert.assertSame(i, div.child(0));
        Assert.assertSame(b, div.child(1));
    }

    @Test
    public void appendTextAndPrependText_givenText_shouldInsertTextNodes() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("World");
        div.prependText("Hello ");

        Assert.assertEquals("Hello World", div.text());
    }

    @Test
    public void appendAndPrepend_givenHtml_shouldParseAndAdd() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<span>Last</span>");
        div.prepend("<b>First</b>");

        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("b", div.child(0).tagName());
        Assert.assertEquals("span", div.child(1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullHtml_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_givenNullHtml_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.prepend(null);
    }

    @Test
    public void beforeAndAfter_givenNodeAndHtml_shouldInsertSiblings() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p");

        p.before("<h1>Header</h1>");
        p.after("<footer>Footer</footer>");

        Assert.assertEquals(3, root.children().size());
        Assert.assertEquals("h1", root.child(0).tagName());
        Assert.assertEquals("p", root.child(1).tagName());
        Assert.assertEquals("footer", root.child(2).tagName());

        Element nodeBefore = new Element(Tag.valueOf("hr"), "");
        Element nodeAfter = new Element(Tag.valueOf("br"), "");
        p.before(nodeBefore);
        p.after(nodeAfter);

        Assert.assertEquals(5, root.children().size());
        Assert.assertEquals("hr", root.child(1).tagName());
        Assert.assertEquals("p", root.child(2).tagName());
        Assert.assertEquals("br", root.child(3).tagName());
    }

    @Test
    public void empty_givenChildren_shouldRemoveAllChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        div.appendText("hello");

        Assert.assertFalse(div.childNodes.isEmpty());
        div.empty();
        Assert.assertTrue(div.childNodes.isEmpty());
    }

    @Test
    public void wrap_givenWrappingHtml_shouldWrapElement() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element target = root.appendElement("span");
        target.wrap("<div class='wrapper'></div>");

        Assert.assertEquals("wrapper", root.child(0).className());
        Assert.assertEquals("span", root.child(0).child(0).tagName());
    }

    @Test
    public void siblingsNavigation_givenHierarchy_shouldTraverseCorrectly() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child0 = root.appendElement("span");
        Element child1 = root.appendElement("p");
        Element child2 = root.appendElement("b");

        Assert.assertEquals(2, child1.siblingElements().size());
        Assert.assertSame(child2, child1.nextElementSibling());
        Assert.assertNull(child2.nextElementSibling());

        Assert.assertSame(child0, child1.previousElementSibling());
        Assert.assertNull(child0.previousElementSibling());

        Assert.assertSame(child0, child1.firstElementSibling());
        Assert.assertSame(child2, child1.lastElementSibling());

        Assert.assertEquals(Integer.valueOf(1), child1.elementSiblingIndex());
    }

    @Test
    public void siblingsNavigation_givenIsolatedElement_shouldReturnSafeDefaults() {
        Element isolated = new Element(Tag.valueOf("div"), "");

        Assert.assertEquals(0, isolated.siblingElements().size());
        Assert.assertNull(isolated.nextElementSibling());
        Assert.assertNull(isolated.previousElementSibling());
        Assert.assertNull(isolated.firstElementSibling());
        Assert.assertNull(isolated.lastElementSibling());
        Assert.assertEquals(Integer.valueOf(0), isolated.elementSiblingIndex());
    }

    @Test
    public void getElementsByTag_givenTag_shouldFindMatchingElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendElement("span");
        div.appendElement("SPAN");
        div.appendElement("b");

        Elements spans = div.getElementsByTag("span");
        Assert.assertEquals(2, spans.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_givenEmpty_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByTag("");
    }

    @Test
    public void getElementById_givenExistingAndNonExistingId_shouldReturnElementOrNull() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element target = div.appendElement("p");
        target.attr("id", "targetId");

        Assert.assertSame(target, div.getElementById("targetId"));
        Assert.assertNull(div.getElementById("nonExisting"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_givenEmptyId_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementById("");
    }

    @Test
    public void getElementsByClass_givenClass_shouldFindElements() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p1 = div.appendElement("p").addClass("highlight");
        div.appendElement("p").addClass("other");
        Element p3 = div.appendElement("p").addClass("highlight");

        Elements highlights = div.getElementsByClass("highlight");
        Assert.assertEquals(2, highlights.size());
        Assert.assertSame(p1, highlights.get(0));
        Assert.assertSame(p3, highlights.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_givenEmptyClass_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByClass("");
    }

    @Test
    public void getElementsByAttributeCriteria_givenAttributes_shouldFilterCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element a1 = div.appendElement("a").attr("href", "http://example.com/one");
        Element a2 = div.appendElement("a").attr("href", "ftp://example.com/two");
        Element a3 = div.appendElement("a").attr("title", "example one");

        Assert.assertEquals(2, div.getElementsByAttribute("HREF").size());
        Assert.assertEquals(2, div.getElementsByAttributeStarting("hr").size());
        Assert.assertEquals(1, div.getElementsByAttributeValue("href", "http://example.com/one").size());
        Assert.assertEquals(2, div.getElementsByAttributeValueNot("href", "http://example.com/one").size());
        Assert.assertEquals(1, div.getElementsByAttributeValueStarting("href", "ftp").size());
        Assert.assertEquals(1, div.getElementsByAttributeValueEnding("href", "two").size());
        Assert.assertEquals(2, div.getElementsByAttributeValueContaining("href", "example").size());
        Assert.assertEquals(1, div.getElementsByAttributeValueMatching("href", Pattern.compile("^http:.*")).size());
        Assert.assertEquals(1, div.getElementsByAttributeValueMatching("href", "^ftp:.*").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttributeValueMatching("href", "[unclosed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttribute_givenEmpty_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttribute("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeStarting_givenEmpty_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsByAttributeStarting("");
    }

    @Test
    public void getElementsByIndex_givenIndex_shouldFilterCorrectly() {
        Element ul = new Element(Tag.valueOf("ul"), "");
        ul.appendElement("li");
        ul.appendElement("li");
        ul.appendElement("li");

        Assert.assertEquals(1, ul.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(1, ul.getElementsByIndexGreaterThan(1).size());
        Assert.assertEquals(1, ul.getElementsByIndexEquals(1).size());
    }

    @Test
    public void getTextMethods_givenTextAndChildren_shouldMatchAndExtract() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = div.appendElement("p");
        p.appendText("Hello World");
        Element span = p.appendElement("span");
        span.appendText("Subtext");

        Assert.assertEquals(2, div.getElementsContainingText("World").size());
        Assert.assertEquals(1, div.getElementsContainingOwnText("World").size());

        Pattern pattern = Pattern.compile(".*World.*");
        Assert.assertEquals(2, div.getElementsMatchingText(pattern).size());
        Assert.assertEquals(2, div.getElementsMatchingText(".*World.*").size());
        Assert.assertEquals(1, div.getElementsMatchingOwnText(pattern).size());
        Assert.assertEquals(1, div.getElementsMatchingOwnText(".*World.*").size());

        Assert.assertEquals(3, div.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsMatchingText("(invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.getElementsMatchingOwnText("(invalid");
    }

    @Test
    public void textAndOwnText_givenStructureWithWhitespaceAndBr_shouldFormatCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("   Line 1   ");
        div.appendElement("br");
        div.appendText("   Line 2   ");
        Element p = div.appendElement("p");
        p.appendText("Paragraph block");

        Assert.assertEquals("Line 1 Line 2 Paragraph block", div.text());
        Assert.assertEquals("Line 1 Line 2", div.ownText());

        div.text("Replaced text");
        Assert.assertEquals("Replaced text", div.text());
        Assert.assertTrue(div.hasText());

        div.empty();
        Assert.assertFalse(div.hasText());
    }

    @Test(expected = IllegalArgumentException.class)
    public void textSetter_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.text(null);
    }

    @Test
    public void preserveWhitespace_givenPreTag_shouldRetainWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("   line 1\n   line 2   ");

        Assert.assertTrue(pre.preserveWhitespace());
        Assert.assertEquals("   line 1\n   line 2   ", pre.text());

        Element code = pre.appendElement("code");
        Assert.assertTrue(code.preserveWhitespace());
    }

    @Test
    public void hasText_givenNestedElementsWithBlankAndNonBlankText_shouldDetectProperly() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element child = div.appendElement("span");

        Assert.assertFalse(div.hasText());

        child.appendText("   ");
        Assert.assertFalse(div.hasText());

        child.appendText("content");
        Assert.assertTrue(div.hasText());
    }

    @Test
    public void data_givenDataNodesAndNestedElements_shouldAccumulateData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("alert(1);", ""));
        Element subScript = script.appendElement("sub");
        subScript.appendChild(new DataNode("alert(2);", ""));

        Assert.assertEquals("alert(1);alert(2);", script.data());
    }

    @Test
    public void classOperations_givenVariousClassNames_shouldManipulateCorrectly() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("class", "btn btn-primary active");

        Assert.assertEquals("btn btn-primary active", div.className());
        Assert.assertTrue(div.hasClass("btn-primary"));
        Assert.assertTrue(div.hasClass("ACTIVE"));
        Assert.assertFalse(div.hasClass("disabled"));

        div.removeClass("active");
        Assert.assertFalse(div.hasClass("active"));

        div.addClass("custom");
        Assert.assertTrue(div.hasClass("custom"));

        div.toggleClass("custom");
        Assert.assertFalse(div.hasClass("custom"));

        div.toggleClass("custom");
        Assert.assertTrue(div.hasClass("custom"));

        Set<String> newClasses = new LinkedHashSet<String>();
        newClasses.add("one");
        newClasses.add("two");
        div.classNames(newClasses);

        Assert.assertEquals("one two", div.className());
        Assert.assertTrue(div.hasClass("one"));
        Assert.assertTrue(div.hasClass("two"));
        Assert.assertFalse(div.hasClass("btn"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNamesSetter_givenNull_shouldThrowException() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.classNames((Set<String>) null);
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
    public void val_givenInputAndTextarea_shouldGetAndSetCorrectly() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.val("user123");
        Assert.assertEquals("user123", input.val());
        Assert.assertEquals("user123", input.attr("value"));

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("content text");
        Assert.assertEquals("content text", textarea.val());
        Assert.assertEquals("content text", textarea.text());
    }

    @Test
    public void htmlAndOuterHtml_givenElement_shouldRenderExpectedHtml() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<span>Hello</span>");

        Assert.assertEquals("<span>Hello</span>", div.html());
        Assert.assertEquals("<div>\n <span>Hello</span>\n</div>", div.outerHtml());
        Assert.assertEquals("<div>\n <span>Hello</span>\n</div>", div.toString());

        Element img = new Element(Tag.valueOf("img"), "");
        Assert.assertEquals("<img />", img.outerHtml());
    }

    @Test
    public void equalsAndHashCode_givenSameAndDifferentElements_shouldFollowContract() {
        Element e1 = new Element(Tag.valueOf("div"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");

        Assert.assertEquals(e1, e1);
        Assert.assertFalse(e1.equals(e2));
        Assert.assertFalse(e1.equals("NotAnElement"));
        Assert.assertFalse(e1.equals(null));

        Assert.assertEquals(e1.hashCode(), e1.hashCode());
    }

    @Test
    public void clone_givenElementWithClasses_shouldReturnIndependentClone() {
        Element original = new Element(Tag.valueOf("div"), "");
        original.addClass("original-class");
        original.appendElement("span").text("Child Text");

        Element clone = original.clone();

        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original.className(), clone.className());
        Assert.assertEquals(original.outerHtml(), clone.outerHtml());

        clone.addClass("clone-only");
        Assert.assertFalse(original.hasClass("clone-only"));
        Assert.assertTrue(clone.hasClass("clone-only"));
    }
}