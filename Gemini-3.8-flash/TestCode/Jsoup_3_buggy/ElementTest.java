package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ElementTest {

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        // Arrange, Act, Assert
        new Element(null, "http://example.com");
    }

    @Test
    public void constructor_givenValidParameters_shouldInitializeCorrectly() {
        // Arrange
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");

        // Act
        Element el = new Element(tag, "http://example.com", attrs);

        // Assert
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals(tag, el.tag());
        Assert.assertTrue(el.isBlock());
        Assert.assertEquals("main", el.id());
        Assert.assertEquals("http://example.com", el.baseUri());
    }

    @Test
    public void id_whenIdAttributeMissing_shouldReturnEmptyString() {
        // Arrange
        Element el = new Element(Tag.valueOf("span"), "http://example.com");

        // Act
        String id = el.id();

        // Assert
        Assert.assertEquals("", id);
    }

    @Test
    public void attr_whenSettingAttribute_shouldReturnSelfForChaining() {
        // Arrange
        Element el = new Element(Tag.valueOf("a"), "");

        // Act
        Element returned = el.attr("href", "http://jsoup.org");

        // Assert
        Assert.assertSame(el, returned);
        Assert.assertEquals("http://jsoup.org", el.attr("href"));
    }

    @Test
    public void parentAndParents_givenNestedHierarchy_shouldAccumulateExcludingRoot() {
        // Arrange
        Element root = new Element(Tag.valueOf("#root"), "");
        Element body = root.appendElement("body");
        Element div = body.appendElement("div");
        Element span = div.appendElement("span");

        // Act
        Element spanParent = span.parent();
        Elements parents = span.parents();

        // Assert
        Assert.assertEquals(div, spanParent);
        Assert.assertEquals(2, parents.size());
        Assert.assertEquals(div, parents.get(0));
        Assert.assertEquals(body, parents.get(1));
    }

    @Test
    public void parents_whenNoParentExists_shouldReturnEmptyElements() {
        // Arrange
        Element el = new Element(Tag.valueOf("p"), "");

        // Act
        Elements parents = el.parents();

        // Assert
        Assert.assertNotNull(parents);
        Assert.assertTrue(parents.isEmpty());
    }

    @Test
    public void childAndChildren_givenMixedNodes_shouldReturnOnlyElements() {
        // Arrange
        Element div = new Element(Tag.valueOf("div"), "");
        TextNode textNode1 = new TextNode("Hello", "");
        Element span1 = new Element(Tag.valueOf("span"), "");
        TextNode textNode2 = new TextNode("World", "");
        Element span2 = new Element(Tag.valueOf("span"), "");

        div.appendChild(textNode1);
        div.appendChild(span1);
        div.appendChild(textNode2);
        div.appendChild(span2);

        // Act
        Elements children = div.children();
        Element firstChild = div.child(0);
        Element secondChild = div.child(1);

        // Assert
        Assert.assertEquals(2, children.size());
        Assert.assertEquals(span1, children.get(0));
        Assert.assertEquals(span2, children.get(1));
        Assert.assertEquals(span1, firstChild);
        Assert.assertEquals(span2, secondChild);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_givenInvalidIndex_shouldThrowIndexOutOfBoundsException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.child(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNullChild_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.appendChild(null);
    }

    @Test
    public void appendChild_givenValidNode_shouldSetParentAndAppend() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");

        // Act
        Element returned = parent.appendChild(child);

        // Assert
        Assert.assertSame(parent, returned);
        Assert.assertEquals(1, parent.childNodes.size());
        Assert.assertEquals(child, parent.childNodes.get(0));
        Assert.assertEquals(parent, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNullChild_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.prependChild(null);
    }

    @Test
    public void prependChild_givenValidNode_shouldInsertAtBeginning() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        Element child2 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child1);

        // Act
        Element returned = parent.prependChild(child2);

        // Assert
        Assert.assertSame(parent, returned);
        Assert.assertEquals(2, parent.childNodes.size());
        Assert.assertEquals(child2, parent.childNodes.get(0));
        Assert.assertEquals(child1, parent.childNodes.get(1));
        Assert.assertEquals(parent, child2.parent());
    }

    @Test
    public void appendElementAndPrependElement_givenTagName_shouldCreateAndInsert() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");

        // Act
        Element appended = parent.appendElement("span");
        Element prepended = parent.prependElement("p");

        // Assert
        Assert.assertEquals("p", prepended.tagName());
        Assert.assertEquals("span", appended.tagName());
        Assert.assertEquals("http://example.com", prepended.baseUri());
        Assert.assertEquals(2, parent.children().size());
        Assert.assertEquals(prepended, parent.child(0));
        Assert.assertEquals(appended, parent.child(1));
    }

    @Test
    public void appendTextAndPrependText_givenText_shouldAddTextNodesInOrder() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");

        // Act
        parent.appendText("World");
        parent.prependText("Hello ");

        // Assert
        Assert.assertEquals(2, parent.childNodes.size());
        Assert.assertTrue(parent.childNodes.get(0) instanceof TextNode);
        Assert.assertEquals("Hello ", ((TextNode) parent.childNodes.get(0)).getWholeText());
        Assert.assertEquals("World", ((TextNode) parent.childNodes.get(1)).getWholeText());
        Assert.assertEquals("Hello World", parent.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullHtml_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.append(null);
    }

    @Test
    public void append_givenHtml_shouldParseAndAppendChildren() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");

        // Act
        parent.append("<p>One</p><span>Two</span>");

        // Assert
        Assert.assertEquals(2, parent.children().size());
        Assert.assertEquals("p", parent.child(0).tagName());
        Assert.assertEquals("span", parent.child(1).tagName());
        Assert.assertEquals(parent, parent.child(0).parent());
        Assert.assertEquals(parent, parent.child(1).parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_givenNullHtml_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.prepend(null);
    }

    @Test
    public void prepend_givenHtml_shouldParseAndPrependChildrenMaintainingOrder() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<b>Existing</b>");

        // Act
        parent.prepend("<p>One</p><span>Two</span>");

        // Assert
        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("p", parent.child(0).tagName());
        Assert.assertEquals("span", parent.child(1).tagName());
        Assert.assertEquals("b", parent.child(2).tagName());
    }

    @Test
    public void empty_whenCalled_shouldRemoveAllChildNodes() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("p");
        parent.appendText("Some text");
        Assert.assertEquals(2, parent.childNodes.size());

        // Act
        Element returned = parent.empty();

        // Assert
        Assert.assertSame(parent, returned);
        Assert.assertTrue(parent.childNodes.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrap_givenEmptyString_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.wrap("");
    }

    @Test
    public void wrap_givenNoWrapChild_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");

        // Act
        Element result = child.wrap("<!-- only comment -->");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void wrap_givenValidWrapHtml_shouldWrapDeepestAndAdoptSiblings() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");

        // Act
        Element returned = child.wrap("<div class='outer'><div class='inner'></div><p class='extra'></p></div>");

        // Assert
        Assert.assertSame(child, returned);
        Assert.assertEquals("outer", parent.child(0).className());
        Element outer = parent.child(0);
        Assert.assertEquals("inner", outer.child(0).className());
        Assert.assertEquals(child, outer.child(0).child(0));
        Assert.assertEquals("extra", outer.child(1).className());
    }

    @Test
    public void siblingElements_whenElementHasSiblings_shouldReturnAllParentChildren() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Elements siblings = child1.siblingElements();

        // Assert
        Assert.assertEquals(2, siblings.size());
        Assert.assertEquals(child1, siblings.get(0));
        Assert.assertEquals(child2, siblings.get(1));
    }

    @Test
    public void nextElementSibling_givenLastSibling_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element next = child2.nextElementSibling();

        // Assert
        Assert.assertNull(next);
    }

    @Test
    public void nextElementSibling_givenMiddleSibling_shouldReturnNext() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element next = child1.nextElementSibling();

        // Assert
        Assert.assertEquals(child2, next);
    }

    @Test
    public void previousElementSibling_givenFirstSibling_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element prev = child1.previousElementSibling();

        // Assert
        Assert.assertNull(prev);
    }

    @Test
    public void previousElementSibling_givenSecondSibling_shouldReturnPrevious() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element prev = child2.previousElementSibling();

        // Assert
        Assert.assertEquals(child1, prev);
    }

    @Test
    public void firstElementSibling_givenMultipleSiblings_shouldReturnFirst() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element first = child2.firstElementSibling();

        // Assert
        Assert.assertEquals(child1, first);
    }

    @Test
    public void firstElementSibling_givenSingleChild_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");

        // Act
        Element first = child1.firstElementSibling();

        // Assert
        Assert.assertNull(first);
    }

    @Test
    public void lastElementSibling_givenMultipleSiblings_shouldReturnLast() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act
        Element last = child1.lastElementSibling();

        // Assert
        Assert.assertEquals(child2, last);
    }

    @Test
    public void lastElementSibling_givenSingleChild_shouldReturnNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("p");

        // Act
        Element last = child1.lastElementSibling();

        // Assert
        Assert.assertNull(last);
    }

    @Test
    public void elementSiblingIndex_givenNoParent_shouldReturnZero() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act
        Integer index = el.elementSiblingIndex();

        // Assert
        Assert.assertEquals(Integer.valueOf(0), index);
    }

    @Test
    public void elementSiblingIndex_givenParent_shouldReturnIndexAmongElementSiblings() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendText("Text node");
        Element child1 = parent.appendElement("p");
        Element child2 = parent.appendElement("span");

        // Act & Assert
        Assert.assertEquals(Integer.valueOf(0), child1.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), child2.elementSiblingIndex());
    }

    @Test
    public void select_givenValidQuery_shouldExecuteSelector() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p class='test'>One</p><p>Two</p>");

        // Act
        Elements results = parent.select("p.test");

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("One", results.get(0).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_givenEmptyString_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.getElementsByTag("");
    }

    @Test
    public void getElementsByTag_givenTag_shouldFindMatchingElements() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p><span>1</span></p><div><span>2</span></div>");

        // Act
        Elements spans = parent.getElementsByTag("SPAN");

        // Assert
        Assert.assertEquals(2, spans.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_givenEmptyId_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.getElementById("");
    }

    @Test
    public void getElementById_givenExistingAndNonExistingId_shouldReturnElementOrNull() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p id='target'>Found</p>");

        // Act
        Element found = parent.getElementById("target");
        Element notFound = parent.getElementById("unknown");

        // Assert
        Assert.assertNotNull(found);
        Assert.assertEquals("target", found.id());
        Assert.assertNull(notFound);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_givenEmptyClass_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.getElementsByClass("");
    }

    @Test
    public void getElementsByClass_givenValidClass_shouldReturnMatches() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<p class='highlight active'>1</p><p class='highlight'>2</p><p>3</p>");

        // Act
        Elements highlights = parent.getElementsByClass("highlight");
        Elements actives = parent.getElementsByClass("active");

        // Assert
        Assert.assertEquals(2, highlights.size());
        Assert.assertEquals(1, actives.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttribute_givenEmptyKey_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.getElementsByAttribute("");
    }

    @Test
    public void getElementsByAttributeMethods_givenVariousConditions_shouldReturnExpectedElements() {
        // Arrange
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.append("<a href='http://jsoup.org/download' title='download jsoup'>1</a>" +
                "<a href='http://example.com/test' title='sample'>2</a>" +
                "<p href='other'>3</p>");

        // Act & Assert
        Assert.assertEquals(3, parent.getElementsByAttribute("href").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValue("href", "http://example.com/test").size());
        Assert.assertEquals(2, parent.getElementsByAttributeValueNot("title", "sample").size());
        Assert.assertEquals(2, parent.getElementsByAttributeValueStarting("href", "http://").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueEnding("href", "download").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueContaining("title", "soup").size());
    }

    @Test
    public void getElementsByIndexMethods_givenIndices_shouldReturnMatchingElements() {
        // Arrange
        Element parent = new Element(Tag.valueOf("ul"), "");
        parent.append("<li>0</li><li>1</li><li>2</li><li>3</li>");

        // Act & Assert
        Assert.assertEquals(2, parent.getElementsByIndexLessThan(2).size());
        Assert.assertEquals(1, parent.getElementsByIndexGreaterThan(2).size());
        Assert.assertEquals(1, parent.getElementsByIndexEquals(1).size());
        Assert.assertEquals("1", parent.getElementsByIndexEquals(1).get(0).text());
        Assert.assertEquals(5, parent.getAllElements().size()); // parent (ul) + 4 li
    }

    @Test
    public void text_givenNestedElementsAndWhitespace_shouldFormatProperly() {
        // Arrange
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p> Hello   <b>World</b> </p><p>New   Paragraph</p>");

        // Act
        String text = div.text();

        // Assert
        Assert.assertEquals("Hello World New Paragraph", text);
    }

    @Test
    public void preserveWhitespace_whenInsidePreOrDirectlyPre_shouldRetainWhitespace() {
        // Arrange
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("  line 1  \n  line 2  ");

        // Act
        String preText = pre.text();

        // Assert
        Assert.assertTrue(pre.preserveWhitespace());
        Assert.assertEquals("line 1  \n  line 2", preText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void text_givenNullString_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.text(null);
    }

    @Test
    public void text_givenString_shouldClearExistingChildrenAndSetTextNode() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span");

        // Act
        Element returned = el.text("New Text");

        // Assert
        Assert.assertSame(el, returned);
        Assert.assertEquals(1, el.childNodes.size());
        Assert.assertEquals("New Text", el.text());
    }

    @Test
    public void hasText_givenDifferentContent_shouldIdentifyTextPresence() {
        // Arrange
        Element emptyEl = new Element(Tag.valueOf("div"), "");
        Element blankEl = new Element(Tag.valueOf("div"), "");
        blankEl.appendText("   ");
        Element textEl = new Element(Tag.valueOf("div"), "");
        textEl.appendText("content");
        Element nestedTextEl = new Element(Tag.valueOf("div"), "");
        nestedTextEl.appendElement("p").appendText("nested");

        // Act & Assert
        Assert.assertFalse(emptyEl.hasText());
        Assert.assertFalse(blankEl.hasText());
        Assert.assertTrue(textEl.hasText());
        Assert.assertTrue(nestedTextEl.hasText());
    }

    @Test
    public void data_givenDataNodeAndChildElements_shouldReturnCombinedData() {
        // Arrange
        Element script = new Element(Tag.valueOf("script"), "");
        DataNode dataNode1 = new DataNode("var a = 1;", "");
        script.appendChild(dataNode1);
        Element nested = script.appendElement("span");
        DataNode dataNode2 = new DataNode("var b = 2;", "");
        nested.appendChild(dataNode2);

        // Act
        String data = script.data();

        // Assert
        Assert.assertEquals("var a = 1;var b = 2;", data);
    }

    @Test
    public void classNameAndClassNames_whenManipulatingClasses_shouldOperateCorrectly() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals("", el.className());
        Assert.assertTrue(el.classNames().isEmpty());

        el.attr("class", "one two");

        // Act
        Assert.assertEquals("one two", el.className());
        Set<String> classNames = el.classNames();

        // Assert
        Assert.assertEquals(2, classNames.size());
        Assert.assertTrue(classNames.contains("one"));
        Assert.assertTrue(classNames.contains("two"));
        Assert.assertTrue(el.hasClass("one"));
        Assert.assertFalse(el.hasClass("three"));

        // Act
        el.addClass("three");

        // Assert
        Assert.assertTrue(el.hasClass("three"));
        Assert.assertEquals("one two three", el.className());

        // Act
        el.removeClass("two");

        // Assert
        Assert.assertFalse(el.hasClass("two"));
        Assert.assertTrue(el.hasClass("one"));
        Assert.assertTrue(el.hasClass("three"));

        // Act
        el.toggleClass("three");
        Assert.assertFalse(el.hasClass("three"));
        el.toggleClass("three");
        Assert.assertTrue(el.hasClass("three"));

        Set<String> newClasses = new LinkedHashSet<String>();
        newClasses.add("custom1");
        newClasses.add("custom2");
        el.classNames(newClasses);
        Assert.assertEquals("custom1 custom2", el.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNames_givenNullSet_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.classNames(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClass_givenNullClassName_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeClass_givenNullClassName_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toggleClass_givenNullClassName_shouldThrowException() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");

        // Act, Assert
        el.toggleClass(null);
    }

    @Test
    public void val_givenInputAndTextarea_shouldHandleAppropriately() {
        // Arrange
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "sample text");

        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("textarea content");

        // Act & Assert
        Assert.assertEquals("sample text", input.val());
        Assert.assertEquals("textarea content", textarea.val());

        input.val("new input val");
        textarea.val("new textarea val");

        Assert.assertEquals("new input val", input.attr("value"));
        Assert.assertEquals("new textarea val", textarea.text());
    }

    @Test
    public void htmlAndOuterHtml_givenEmptyTagAndStandardTags_shouldRenderCorrectHtml() {
        // Arrange
        Element img = new Element(Tag.valueOf("img"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        div.append("<p>Paragraph</p>");

        // Act
        String imgHtml = img.outerHtml();
        String divHtml = div.html();
        String divOuterHtml = div.outerHtml();

        // Assert
        Assert.assertEquals("<img />", imgHtml);
        Assert.assertEquals("<p>Paragraph</p>", divHtml);
        Assert.assertTrue(divOuterHtml.startsWith("<div>"));
        Assert.assertTrue(divOuterHtml.endsWith("</div>"));

        div.html("<span>Replaced</span>");
        Assert.assertEquals("<span>Replaced</span>", div.html());
    }

    @Test
    public void toString_whenCalled_shouldReturnOuterHtml() {
        // Arrange
        Element el = new Element(Tag.valueOf("div"), "");
        el.text("content");

        // Act
        String str = el.toString();

        // Assert
        Assert.assertEquals(el.outerHtml(), str);
    }

    @Test
    public void equalsAndHashCode_givenVariousScenarios_shouldRespectContract() {
        // Arrange
        Element el1 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el2 = new Element(Tag.valueOf("div"), "http://example.com");
        Element el3 = new Element(Tag.valueOf("span"), "http://example.com");

        // Act & Assert
        Assert.assertTrue(el1.equals(el1));
        Assert.assertTrue(el1.equals(el2));
        Assert.assertEquals(el1.hashCode(), el2.hashCode());

        Assert.assertFalse(el1.equals(el3));
        Assert.assertFalse(el1.equals(null));
        Assert.assertFalse(el1.equals("Not an Element"));
    }
}