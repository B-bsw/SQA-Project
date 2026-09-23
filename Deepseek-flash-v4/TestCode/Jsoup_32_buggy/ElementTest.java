package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.parser.Tag;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import static org.junit.Assert.*;

public class ElementTest {
    private Element element;
    private Element parent;
    private Element child1;
    private Element child2;

    @Before
    public void setUp() {
        parent = new Element(Tag.valueOf("div"), "http://example.com");
        child1 = new Element(Tag.valueOf("p"), "http://example.com");
        child2 = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child1);
        parent.appendChild(child2);
        element = parent;
    }

    @After
    public void tearDown() {
        element = null;
        parent = null;
        child1 = null;
        child2 = null;
    }

    @Test
    public void testNodeName() {
        assertEquals("div", element.nodeName());
        assertEquals("p", child1.nodeName());
    }

    @Test
    public void testTagName() {
        assertEquals("div", element.tagName());
        element.tagName("section");
        assertEquals("section", element.tagName());
        assertEquals("section", element.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameNull() {
        element.tagName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmpty() {
        element.tagName("");
    }

    @Test
    public void testIsBlock() {
        assertTrue(element.isBlock());
        Element span = new Element(Tag.valueOf("span"), "http://example.com");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        assertEquals("", element.id());
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void testAttr() {
        element.attr("data-test", "value");
        assertEquals("value", element.attr("data-test"));
    }

    @Test
    public void testDataset() {
        element.attr("data-key1", "value1");
        element.attr("data-key2", "value2");
        Map<String, String> dataset = element.dataset();
        assertEquals("value1", dataset.get("key1"));
        assertEquals("value2", dataset.get("key2"));
    }

    @Test
    public void testParent() {
        assertEquals(parent, child1.parent());
        assertNull(parent.parent());
    }

    @Test
    public void testParents() {
        Element grandparent = new Element(Tag.valueOf("body"), "http://example.com");
        grandparent.appendChild(parent);
        Elements parents = child1.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(parent));
        assertTrue(parents.contains(grandparent));
    }

    @Test
    public void testChild() {
        assertEquals(child1, element.child(0));
        assertEquals(child2, element.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        element.child(2);
    }

    @Test
    public void testChildren() {
        Elements children = element.children();
        assertEquals(2, children.size());
        assertTrue(children.contains(child1));
        assertTrue(children.contains(child2));
    }

    @Test
    public void testTextNodes() {
        element.appendChild(new TextNode("text1", "http://example.com"));
        List<TextNode> textNodes = element.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("text1", textNodes.get(0).getWholeText());
    }

    @Test
    public void testDataNodes() {
        element.appendChild(new DataNode("data1", "http://example.com"));
        List<DataNode> dataNodes = element.dataNodes();
        assertEquals(1, dataNodes.size());
        assertEquals("data1", dataNodes.get(0).getWholeData());
    }

    @Test
    public void testSelect() {
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        Element p1 = new Element(Tag.valueOf("p"), "http://example.com");
        Element p2 = new Element(Tag.valueOf("p"), "http://example.com");
        div.appendChild(p1);
        div.appendChild(p2);
        Elements selected = div.select("p");
        assertEquals(2, selected.size());
    }

    @Test
    public void testAppendChild() {
        Element newChild = new Element(Tag.valueOf("a"), "http://example.com");
        element.appendChild(newChild);
        assertEquals(3, element.children().size());
        assertEquals(newChild, element.child(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        element.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element newChild = new Element(Tag.valueOf("a"), "http://example.com");
        element.prependChild(newChild);
        assertEquals(newChild, element.child(0));
        assertEquals(3, element.children().size());
    }

    @Test
    public void testInsertChildren() {
        Element newChild = new Element(Tag.valueOf("a"), "http://example.com");
        element.insertChildren(1, Arrays.asList(newChild));
        assertEquals(newChild, element.child(1));
        assertEquals(3, element.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNull() {
        element.insertChildren(1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element newChild = new Element(Tag.valueOf("a"), "http://example.com");
        element.insertChildren(10, Arrays.asList(newChild));
    }

    @Test
    public void testAppendElement() {
        Element newElement = element.appendElement("a");
        assertNotNull(newElement);
        assertEquals("a", newElement.tagName());
        assertEquals(3, element.children().size());
    }

    @Test
    public void testPrependElement() {
        Element newElement = element.prependElement("a");
        assertNotNull(newElement);
        assertEquals("a", newElement.tagName());
        assertEquals(newElement, element.child(0));
    }

    @Test
    public void testAppendText() {
        element.appendText("some text");
        assertEquals("some text", element.text());
        assertTrue(element.hasText());
    }

    @Test
    public void testPrependText() {
        element.prependText("prefix");
        assertEquals("prefix", element.text());
        assertTrue(element.hasText());
    }

    @Test
    public void testAppend() {
        element.append("<p>new paragraph</p>");
        assertEquals(3, element.children().size());
        assertEquals("p", element.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNull() {
        element.append(null);
    }

    @Test
    public void testPrepend() {
        element.prepend("<p>first paragraph</p>");
        assertEquals(3, element.children().size());
        assertEquals("p", element.child(0).tagName());
    }

    @Test
    public void testBeforeNode() {
        Element newNode = new Element(Tag.valueOf("h1"), "http://example.com");
        child1.before(newNode);
        assertEquals(newNode, parent.child(0));
        assertEquals(3, parent.children().size());
    }

    @Test
    public void testAfterNode() {
        Element newNode = new Element(Tag.valueOf("h1"), "http://example.com");
        child1.after(newNode);
        assertEquals(newNode, parent.child(1));
        assertEquals(3, parent.children().size());
    }

    @Test
    public void testEmpty() {
        element.empty();
        assertEquals(0, element.children().size());
        assertTrue(element.childNodes().isEmpty());
    }

    @Test
    public void testWrap() {
        child1.wrap("<div class='wrapper'></div>");
        assertEquals("wrapper", child1.parent().className());
        assertEquals(parent, child1.parent().parent());
    }

    @Test
    public void testSiblingElements() {
        Elements siblings = child1.siblingElements();
        assertEquals(1, siblings.size());
        assertTrue(siblings.contains(child2));
    }

    @Test
    public void testNextElementSibling() {
        assertEquals(child2, child1.nextElementSibling());
        assertNull(child2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        assertEquals(child1, child2.previousElementSibling());
        assertNull(child1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        assertEquals(child1, child1.firstElementSibling());
        assertEquals(child1, child2.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        assertEquals(child2, child1.lastElementSibling());
        assertEquals(child2, child2.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        element.appendChild(new Element(Tag.valueOf("p"), "http://example.com"));
        Elements elements = element.getElementsByTag("p");
        assertEquals(1, elements.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagNull() {
        element.getElementsByTag(null);
    }

    @Test
    public void testGetElementById() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("id", "target");
        element.appendChild(target);
        Element found = element.getElementById("target");
        assertEquals(target, found);
        assertNull(element.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdNull() {
        element.getElementById(null);
    }

    @Test
    public void testGetElementsByClass() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.addClass("foo");
        element.appendChild(target);
        Elements elements = element.getElementsByClass("foo");
        assertEquals(1, elements.size());
        assertEquals(target, elements.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassNull() {
        element.getElementsByClass(null);
    }

    @Test
    public void testGetElementsByAttribute() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-custom", "value");
        element.appendChild(target);
        Elements elements = element.getElementsByAttribute("data-custom");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key1", "value1");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeStarting("data-");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "value");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValue("data-key", "value");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element target1 = new Element(Tag.valueOf("div"), "http://example.com");
        target1.attr("data-key", "value1");
        Element target2 = new Element(Tag.valueOf("div"), "http://example.com");
        target2.attr("data-key", "value2");
        element.appendChild(target1);
        element.appendChild(target2);
        Elements elements = element.getElementsByAttributeValueNot("data-key", "value1");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "prefix_value");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValueStarting("data-key", "prefix");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "value_suffix");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValueEnding("data-key", "suffix");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "somevalue");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValueContaining("data-key", "value");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "value123");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValueMatching("data-key", Pattern.compile("\\d+"));
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingString() {
        Element target = new Element(Tag.valueOf("div"), "http://example.com");
        target.attr("data-key", "value123");
        element.appendChild(target);
        Elements elements = element.getElementsByAttributeValueMatching("data-key", "\\d+");
        assertEquals(1, elements.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidPattern() {
        element.getElementsByAttributeValueMatching("data-key", "[invalid");
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Elements elements = element.getElementsByIndexLessThan(1);
        assertEquals(1, elements.size());
        assertEquals(child1, elements.get(0));
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Elements elements = element.getElementsByIndexGreaterThan(0);
        assertEquals(1, elements.size());
        assertEquals(child2, elements.get(0));
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Elements elements = element.getElementsByIndexEquals(1);
        assertEquals(1, elements.size());
        assertEquals(child2, elements.get(0));
    }

    @Test
    public void testGetElementsContainingText() {
        element.appendChild(new TextNode("some text here", "http://example.com"));
        Elements elements = element.getElementsContainingText("text");
        assertTrue(elements.size() >= 1);
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        target.appendChild(new TextNode("unique content", "http://example.com"));
        element.appendChild(target);
        Elements elements = element.getElementsContainingOwnText("unique");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsMatchingTextPattern() {
        element.appendChild(new TextNode("pattern match", "http://example.com"));
        Elements elements = element.getElementsMatchingText(Pattern.compile("pattern"));
        assertTrue(elements.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingTextString() {
        element.appendChild(new TextNode("pattern match", "http://example.com"));
        Elements elements = element.getElementsMatchingText("pattern");
        assertTrue(elements.size() >= 1);
    }

    @Test
    public void testGetElementsMatchingOwnTextPattern() {
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        target.appendChild(new TextNode("unique text", "http://example.com"));
        element.appendChild(target);
        Elements elements = element.getElementsMatchingOwnText(Pattern.compile("unique"));
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsMatchingOwnTextString() {
        Element target = new Element(Tag.valueOf("p"), "http://example.com");
        target.appendChild(new TextNode("unique text", "http://example.com"));
        element.appendChild(target);
        Elements elements = element.getElementsMatchingOwnText("unique");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetAllElements() {
        Elements all = element.getAllElements();
        assertTrue(all.size() >= 3);
        assertTrue(all.contains(element));
    }

    @Test
    public void testText() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.appendChild(new TextNode("  Hello ", "http://example.com"));
        container.appendChild(new Element(Tag.valueOf("br"), "http://example.com"));
        container.appendChild(new TextNode(" World  ", "http://example.com"));
        assertEquals("Hello \n World", container.text());
    }

    @Test
    public void testOwnText() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.appendChild(new TextNode("Own ", "http://example.com"));
        container.appendChild(new TextNode("Text", "http://example.com"));
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        child.appendChild(new TextNode(" child", "http://example.com"));
        container.appendChild(child);
        assertEquals("Own Text", container.ownText());
    }

    @Test
    public void testData() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        DataNode dataNode = new DataNode("data content", "http://example.com");
        container.appendChild(dataNode);
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        DataNode childData = new DataNode(" child data", "http://example.com");
        child.appendChild(childData);
        container.appendChild(child);
        assertEquals("data content child data", container.data());
    }

    @Test
    public void testClassName() {
        element.attr("class", "foo bar baz");
        assertEquals("foo bar baz", element.className());
    }

    @Test
    public void testClassNames() {
        element.attr("class", "foo bar baz");
        Set<String> names = element.classNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("foo"));
        assertTrue(names.contains("bar"));
        assertTrue(names.contains("baz"));
    }

    @Test
    public void testClassNamesSet() {
        element.classNames(new LinkedHashSet<>(Arrays.asList("foo", "bar")));
        assertEquals("foo bar", element.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetNull() {
        element.classNames(null);
    }

    @Test
    public void testHasClass() {
        element.addClass("foo");
        assertTrue(element.hasClass("foo"));
        assertFalse(element.hasClass("bar"));
        assertTrue(element.hasClass("FOO"));
    }

    @Test
    public void testAddClass() {
        element.addClass("foo");
        element.addClass("bar");
        assertTrue(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddClassNull() {
        element.addClass(null);
    }

    @Test
    public void testRemoveClass() {
        element.addClass("foo");
        element.addClass("bar");
        element.removeClass("foo");
        assertFalse(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
    }

    @Test
    public void testToggleClass() {
        element.toggleClass("foo");
        assertTrue(element.hasClass("foo"));
        element.toggleClass("foo");
        assertFalse(element.hasClass("foo"));
    }

    @Test
    public void testVal() {
        element.attr("value", "testValue");
        assertEquals("testValue", element.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com");
        textarea.text("textarea content");
        assertEquals("textarea content", textarea.val());
    }

    @Test
    public void testValSet() {
        element.val("new value");
        assertEquals("new value", element.attr("value"));
    }

    @Test
    public void testHtml() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.appendChild(new TextNode("text", "http://example.com"));
        Element child = new Element(Tag.valueOf("p"), "http://example.com");
        child.appendChild(new TextNode("para", "http://example.com"));
        container.appendChild(child);
        String html = container.html();
        assertTrue(html.contains("text"));
        assertTrue(html.contains("<p>"));
        assertTrue(html.contains("para"));
        assertTrue(html.contains("</p>"));
    }

    @Test
    public void testHtmlSet() {
        element.html("<p>new content</p>");
        assertEquals(1, element.children().size());
        assertEquals("p", element.child(0).tagName());
    }

    @Test
    public void testToString() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.attr("id", "test");
        assertEquals(container.outerHtml(), container.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(element.equals(element));
        assertFalse(element.equals(null));
        assertFalse(element.equals(child1));
        Element diff = new Element(Tag.valueOf("div"), "http://example.com");
        assertFalse(element.equals(diff));
    }

    @Test
    public void testHashCode() {
        assertTrue(element.hashCode() != child1.hashCode());
    }

    @Test
    public void testClone() {
        Element container = new Element(Tag.valueOf("div"), "http://example.com");
        container.attr("id", "original");
        container.addClass("test-class");
        Element cloned = container.clone();
        assertNotSame(container, cloned);
        assertEquals(container.tagName(), cloned.tagName());
        assertEquals(container.attr("id"), cloned.attr("id"));
        assertTrue(cloned.hasClass("test-class"));
    }

    @Test
    public void testPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "http://example.com");
        assertTrue(pre.preserveWhitespace());
    }
}