package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import static org.junit.Assert.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;

public class ElementTest {
    private Element element;
    private Document doc;

    @Before
    public void setUp() {
        doc = new Document("http://example.com");
        element = new Element(Tag.valueOf("div"), "http://example.com");
    }

    @After
    public void tearDown() {
        element = null;
        doc = null;
    }

    @Test
    public void testConstructorNullTagThrowsException() {
        try {
            new Element(null, "http://example.com");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testNodeName() {
        assertEquals("div", element.nodeName());
        Element span = new Element(Tag.valueOf("span"), "");
        assertEquals("span", span.nodeName());
    }

    @Test
    public void testTagNameGetter() {
        assertEquals("div", element.tagName());
    }

    @Test
    public void testTagNameSetter() {
        element.tagName("span");
        assertEquals("span", element.tagName());
        assertNotNull(element.tag());
    }

    @Test
    public void testTagNameSetterEmpty() {
        try {
            element.tagName("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTagNameSetterNull() {
        try {
            element.tagName(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsBlock() {
        assertFalse(element.isBlock());
        Element p = new Element(Tag.valueOf("p"), "");
        assertTrue(p.isBlock());
    }

    @Test
    public void testId() {
        assertEquals("", element.id());
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void testIdWhenNull() {
        element = new Element(Tag.valueOf("div"), "") {
            @Override
            public String attr(String attributeKey) {
                return null;
            }
        };
        assertEquals("", element.id());
    }

    @Test
    public void testAttrWithValue() {
        Element result = element.attr("class", "test");
        assertSame(element, result);
        assertEquals("test", element.attr("class"));
    }

    @Test
    public void testDataset() {
        Element e = Jsoup.parse("<div data-key='value'></div>").selectFirst("div");
        assertNotNull(e);
        assertEquals("value", e.dataset().get("key"));
    }

    @Test
    public void testParent() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertSame(parent, child.parent());
    }

    @Test
    public void testParentNull() {
        assertNull(element.parent());
    }

    @Test
    public void testParents() {
        Element grandParent = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        grandParent.appendChild(parent);
        parent.appendChild(child);
        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(parent));
        assertTrue(parents.contains(grandParent));
    }

    @Test
    public void testParentsNoParent() {
        Elements parents = element.parents();
        assertEquals(0, parents.size());
    }

    @Test
    public void testChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, parent.child(0));
        assertSame(child2, parent.child(1));
    }

    @Test
    public void testChildIndexOutOfBounds() {
        try {
            element.child(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testChildren() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        TextNode textNode = new TextNode("hello", "");
        parent.appendChild(child1);
        parent.appendChild(textNode);
        Elements children = parent.children();
        assertEquals(1, children.size());
        assertTrue(children.contains(child1));
    }

    @Test
    public void testChildrenEmpty() {
        Elements children = element.children();
        assertEquals(0, children.size());
    }

    @Test
    public void testTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        TextNode textNode = new TextNode("hello", "");
        parent.appendChild(textNode);
        List<TextNode> textNodes = parent.textNodes();
        assertEquals(1, textNodes.size());
        assertSame(textNode, textNodes.get(0));
    }

    @Test
    public void testTextNodesEmpty() {
        List<TextNode> textNodes = element.textNodes();
        assertEquals(0, textNodes.size());
    }

    @Test
    public void testDataNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        DataNode dataNode = new DataNode("hello", "");
        parent.appendChild(dataNode);
        List<DataNode> dataNodes = parent.dataNodes();
        assertEquals(1, dataNodes.size());
        assertSame(dataNode, dataNodes.get(0));
    }

    @Test
    public void testDataNodesEmpty() {
        List<DataNode> dataNodes = element.dataNodes();
        assertEquals(0, dataNodes.size());
    }

    @Test
    public void testSelect() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        Elements selected = parent.select("span");
        assertEquals(1, selected.size());
        assertSame(child, selected.get(0));
    }

    @Test
    public void testAppendChild() {
        Element child = new Element(Tag.valueOf("span"), "");
        Element result = element.appendChild(child);
        assertSame(element, result);
        assertEquals(1, element.childNodeSize());
        assertSame(child, element.child(0));
        assertSame(element, child.parent());
    }

    @Test
    public void testAppendChildNull() {
        try {
            element.appendChild(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testPrependChild() {
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        element.appendChild(child1);
        element.prependChild(child2);
        assertSame(child2, element.child(0));
        assertSame(child1, element.child(1));
    }

    @Test
    public void testInsertChildren() {
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        Element newChild = new Element(Tag.valueOf("div"), "");
        element.appendChild(child1);
        element.appendChild(child2);
        element.insertChildren(1, Arrays.asList(newChild));
        assertSame(child1, element.child(0));
        assertSame(newChild, element.child(1));
        assertSame(child2, element.child(2));
    }

    @Test
    public void testInsertChildrenNullCollection() {
        try {
            element.insertChildren(0, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInsertChildrenOutOfBounds() {
        try {
            element.insertChildren(5, Arrays.asList(new Element(Tag.valueOf("span"), "")));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testInsertChildrenNegativeIndex() {
        Element child = new Element(Tag.valueOf("span"), "");
        element.appendChild(child);
        Element newChild = new Element(Tag.valueOf("p"), "");
        element.insertChildren(-1, Arrays.asList(newChild));
        assertSame(child, element.child(0));
        assertSame(newChild, element.child(1));
    }

    @Test
    public void testAppendElement() {
        Element child = element.appendElement("span");
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(1, element.childNodeSize());
        assertSame(element, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element child1 = element.appendElement("span");
        Element child2 = element.prependElement("p");
        assertSame(child2, element.child(0));
        assertSame(child1, element.child(1));
    }

    @Test
    public void testAppendText() {
        element.appendText("hello");
        assertEquals("hello", element.text());
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void testPrependText() {
        element.appendText("world");
        element.prependText("hello ");
        assertEquals("hello world", element.text());
    }

    @Test
    public void testAppend() {
        element.append("<span>hello</span>");
        assertEquals(1, element.childNodeSize());
        assertEquals("span", element.child(0).tagName());
    }

    @Test
    public void testPrepend() {
        element.append("<span>world</span>");
        element.prepend("<p>hello</p>");
        assertEquals("p", element.child(0).tagName());
        assertEquals("span", element.child(1).tagName());
    }

    @Test
    public void testBeforeString() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        child.before("<p>before</p>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("p", parent.child(0).tagName());
        assertSame(child, parent.child(1));
    }

    @Test
    public void testBeforeNode() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        Element before = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        child.before(before);
        assertEquals(2, parent.childNodeSize());
        assertSame(before, parent.child(0));
    }

    @Test
    public void testAfterString() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        child.after("<p>after</p>");
        assertEquals(2, parent.childNodeSize());
        assertSame(child, parent.child(0));
        assertEquals("p", parent.child(1).tagName());
    }

    @Test
    public void testAfterNode() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        Element after = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child);
        child.after(after);
        assertEquals(2, parent.childNodeSize());
        assertSame(after, parent.child(1));
    }

    @Test
    public void testEmpty() {
        element.appendChild(new Element(Tag.valueOf("span"), ""));
        element.text("hello");
        element.empty();
        assertEquals(0, element.childNodeSize());
        assertEquals("", element.text());
    }

    @Test
    public void testWrap() {
        element.wrap("<div class='wrapper'></div>");
        assertEquals("div", element.parent().tagName());
        assertTrue(element.parent().hasClass("wrapper"));
    }

    @Test
    public void testCssSelectorById() {
        element.attr("id", "testId");
        assertEquals("#testId", element.cssSelector());
    }

    @Test
    public void testCssSelectorNoParent() {
        assertEquals("div", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithClass() {
        element.addClass("class1").addClass("class2");
        assertEquals("div.class1.class2", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithChild() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        parent.appendChild(child);
        assertEquals("div > span", child.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        Element child3 = new Element(Tag.valueOf("div"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        Elements siblings = child2.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(child1));
        assertTrue(siblings.contains(child3));
    }

    @Test
    public void testSiblingElementsNoParent() {
        Elements siblings = element.siblingElements();
        assertEquals(0, siblings.size());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child2, child1.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingNoNext() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertNull(child.nextElementSibling());
    }

    @Test
    public void testNextElementSiblingNoParent() {
        assertNull(element.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, child2.previousElementSibling());
    }

    @Test
    public void testPreviousElementSiblingNoPrevious() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertNull(child.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, child2.firstElementSibling());
    }

    @Test
    public void testFirstElementSiblingOnlyChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertNull(child.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
    }

    @Test
    public void testElementSiblingIndexNoParent() {
        assertEquals(0, element.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child2, child1.lastElementSibling());
    }

    @Test
    public void testLastElementSiblingOnlyChild() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);
        assertSame(child, child.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        Element child3 = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        Elements spans = parent.getElementsByTag("span");
        assertEquals(2, spans.size());
        assertTrue(spans.contains(child1));
        assertTrue(spans.contains(child3));
    }

    @Test
    public void testGetElementById() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        child1.attr("id", "testId");
        parent.appendChild(child1);
        assertSame(child1, parent.getElementById("testId"));
    }

    @Test
    public void testGetElementByIdNotFound() {
        assertNull(element.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        child1.addClass("testClass");
        parent.appendChild(child1);
        Elements elements = parent.getElementsByClass("testClass");
        assertEquals(1, elements.size());
        assertSame(child1, elements.get(0));
    }

    @Test
    public void testGetElementsByAttribute() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        child.attr("data-test", "value");
        parent.appendChild(child);
        Elements elements = parent.getElementsByAttribute("data-test");
        assertEquals(1, elements.size());
        assertSame(child, elements.get(0));
    }

    @Test
    public void testGetElementsByAttributeValueMatchingWithInvalidRegex() {
        try {
            element.getElementsByAttributeValueMatching("data-test", "[invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testText() {
        Element div = new Element(Tag.valueOf("div"), "");
        TextNode textNode = new TextNode("hello ", "");
        div.appendChild(textNode);
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new TextNode("world", ""));
        div.appendChild(span);
        assertEquals("hello world", div.text());
    }

    @Test
    public void testTextWithBlockElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendChild(new TextNode("hello", ""));
        div.appendChild(p);
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new TextNode("world", ""));
        div.appendChild(span);
        assertEquals("hello world", div.text());
    }

    @Test
    public void testOwnText() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendChild(new TextNode("hello", ""));
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new TextNode("world", ""));
        div.appendChild(span);
        assertEquals("hello", div.ownText());
    }

    @Test
    public void testTextSetter() {
        element.text("hello");
        assertEquals("hello", element.text());
        assertEquals(1, element.childNodeSize());
        assertTrue(element.child(0) instanceof TextNode);
    }

    @Test
    public void testHasText() {
        assertFalse(element.hasText());
        element.appendText("hello");
        assertTrue(element.hasText());
    }

    @Test
    public void testData() {
        Element div = new Element(Tag.valueOf("div"), "");
        DataNode dataNode = new DataNode("some data", "");
        div.appendChild(dataNode);
        assertEquals("some data", div.data());
    }

    @Test
    public void testDataWithElementChildren() {
        Element div = new Element(Tag.valueOf("div"), "");
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new DataNode("nested", ""));
        div.appendChild(span);
        assertEquals("nested", div.data());
    }

    @Test
    public void testClassName() {
        element.attr("class", "  test  ");
        assertEquals("test", element.className());
    }

    @Test
    public void testClassNames() {
        element.attr("class", "one two");
        Set<String> classNames = element.classNames();
        assertEquals(2, classNames.size());
        assertTrue(classNames.contains("one"));
        assertTrue(classNames.contains("two"));
    }

    @Test
    public void testClassNamesSet() {
        element.classNames(new HashSet<String>(Arrays.asList("one", "two")));
        assertEquals("one two", element.attr("class"));
    }

    @Test
    public void testHasClass() {
        element.addClass("test");
        assertTrue(element.hasClass("test"));
        assertFalse(element.hasClass("other"));
    }

    @Test
    public void testAddClass() {
        element.addClass("test");
        assertTrue(element.hasClass("test"));
        assertTrue(element.attr("class").contains("test"));
    }

    @Test
    public void testRemoveClass() {
        element.addClass("test");
        element.addClass("other");
        element.removeClass("test");
        assertFalse(element.hasClass("test"));
        assertTrue(element.hasClass("other"));
    }

    @Test
    public void testToggleClass() {
        element.addClass("test");
        element.toggleClass("test");
        assertFalse(element.hasClass("test"));
        element.toggleClass("test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.text("hello");
        assertEquals("hello", textarea.val());
    }

    @Test
    public void testValAttribute() {
        element.attr("value", "test");
        assertEquals("test", element.val());
    }

    @Test
    public void testValSetterTextarea() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("hello");
        assertEquals("hello", textarea.text());
    }

    @Test
    public void testValSetterNonTextarea() {
        element.val("hello");
        assertEquals("hello", element.attr("value"));
    }

    @Test
    public void testEquals() {
        Element e1 = new Element(Tag.valueOf("div"), "");
        Element e2 = new Element(Tag.valueOf("div"), "");
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals(element, element);
    }

    @Test
    public void testEqualsNull() {
        assertFalse(element.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(element.equals("string"));
    }

    @Test
    public void testClone() {
        element.attr("id", "testId");
        Element text = element.appendElement("span").text("hello").parent();
        Element cloned = element.clone();
        assertNotSame(element, cloned);
        assertEquals(element.html(), cloned.html());
        assertNotSame(element.getElementsByTag("span").first(), cloned.getElementsByTag("span").first());
    }
}