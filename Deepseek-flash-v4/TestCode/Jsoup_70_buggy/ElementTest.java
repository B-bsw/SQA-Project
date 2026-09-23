package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import static org.junit.Assert.*;

public class ElementTest {
    private Element element;

    @Before
    public void setUp() {
        element = new Element("div");
    }

    @Test
    public void testConstructorWithTagName() {
        Element el = new Element("span");
        assertNotNull(el);
        assertEquals("span", el.tagName());
    }

    @Test
    public void testConstructorWithNullTag() {
        try {
            new Element((Tag) null, "http://example.com", new Attributes());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullBaseUri() {
        try {
            new Element(Tag.valueOf("div"), null, new Attributes());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testTagName() {
        assertEquals("div", element.tagName());
        Element el = element.tagName("p");
        assertSame(element, el);
        assertEquals("p", element.tagName());
    }

    @Test
    public void testTagNameWithEmptyString() {
        try {
            element.tagName("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testTagNameWithNull() {
        try {
            element.tagName(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testIsBlock() {
        Element blockEl = new Element("div");
        assertTrue(blockEl.isBlock());
        Element inlineEl = new Element("span");
        assertFalse(inlineEl.isBlock());
    }

    @Test
    public void testId() {
        assertNull(element.id());
        element.attr("id", "test-id");
        assertEquals("test-id", element.id());
    }

    @Test
    public void testAttrWithStringValue() {
        Element el = element.attr("data-test", "value1");
        assertSame(element, el);
        assertEquals("value1", element.attr("data-test"));
    }

    @Test
    public void testAttrWithBooleanValue() {
        element.attr("disabled", true);
        assertEquals("", element.attr("disabled"));
    }

    @Test
    public void testParent() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertSame(parent, child.parent());
        assertNull(element.parent());
    }

    @Test
    public void testParents() {
        Document doc = Jsoup.parse("<html><body><div><p>text</p></div></body></html>");
        Element p = doc.selectFirst("p");
        Elements parents = p.parents();
        assertTrue(parents.size() >= 3);
    }

    @Test
    public void testChildWithIndex() {
        element.appendChild(new Element("span"));
        element.appendChild(new Element("p"));
        assertEquals("span", element.child(0).tagName());
        assertEquals("p", element.child(1).tagName());
    }

    @Test
    public void testChildWithInvalidIndex() {
        element.appendChild(new Element("span"));
        try {
            element.child(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testChildren() {
        element.appendChild(new Element("span"));
        element.appendChild(new Element("p"));
        element.appendChild(new TextNode("text", ""));
        Elements children = element.children();
        assertEquals(2, children.size());
    }

    @Test
    public void testSelect() {
        element.append("<span class='test'>one</span><span>two</span>");
        Elements selected = element.select(".test");
        assertEquals(1, selected.size());
        assertEquals("one", selected.first().text());
    }

    @Test
    public void testSelectFirst() {
        element.append("<span class='test'>one</span><span class='test'>two</span>");
        Element first = element.selectFirst(".test");
        assertNotNull(first);
        assertEquals("one", first.text());
    }

    @Test
    public void testIsWithCssQuery() {
        element.append("<span class='test'>one</span>");
        assertFalse(element.is(".test"));
        Element span = element.selectFirst("span");
        assertTrue(span.is(".test"));
    }

    @Test
    public void testAppendChild() {
        Element child = new Element("span");
        Element result = element.appendChild(child);
        assertSame(element, result);
        assertEquals(1, element.childNodeSize());
        assertSame(child, element.child(0));
    }

    @Test
    public void testAppendChildWithNull() {
        try {
            element.appendChild(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendTo() {
        Element parent = new Element("div");
        element.appendTo(parent);
        assertSame(parent, element.parent());
    }

    @Test
    public void testPrependChild() {
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        element.appendChild(child1);
        element.prependChild(child2);
        assertEquals(2, element.childNodeSize());
        assertSame(child2, element.child(0));
    }

    @Test
    public void testAppendElement() {
        Element child = element.appendElement("span");
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void testPrependElement() {
        element.appendElement("span");
        Element prepended = element.prependElement("p");
        assertNotNull(prepended);
        assertEquals("p", prepended.tagName());
        assertEquals(2, element.childNodeSize());
        assertSame(prepended, element.child(0));
    }

    @Test
    public void testAppendText() {
        element.appendText("hello");
        assertEquals("hello", element.text());
    }

    @Test
    public void testPrependText() {
        element.appendText("world");
        element.prependText("hello ");
        assertEquals("hello world", element.text());
    }

    @Test
    public void testEmpty() {
        element.appendElement("span");
        element.appendText("text");
        element.empty();
        assertEquals(0, element.childNodeSize());
        assertTrue(element.text().isEmpty());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        Element child3 = new Element("a");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        Elements siblings = child2.siblingElements();
        assertEquals(2, siblings.size());
        assertSame(child1, siblings.get(0));
        assertSame(child3, siblings.get(1));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child2, child1.nextElementSibling());
        assertNull(child2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, child2.previousElementSibling());
        assertNull(child1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, child2.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(0, child1.elementSiblingIndex());
        assertEquals(1, child2.elementSiblingIndex());
    }

    @Test
    public void testGetElementsByTag() {
        element.appendElement("span");
        element.appendElement("p");
        element.appendElement("span");
        Elements spans = element.getElementsByTag("span");
        assertEquals(2, spans.size());
    }

    @Test
    public void testGetElementById() {
        Element child = element.appendElement("div");
        child.attr("id", "unique-id");
        Element found = element.getElementById("unique-id");
        assertSame(child, found);
        assertNull(element.getElementById("missing"));
    }

    @Test
    public void testGetElementsByClass() {
        Element child1 = element.appendElement("span");
        child1.addClass("highlight");
        Element child2 = element.appendElement("p");
        child2.addClass("highlight");
        Elements found = element.getElementsByClass("highlight");
        assertEquals(2, found.size());
    }

    @Test
    public void testText() {
        element.appendChild(new TextNode("Hello ", ""));
        element.appendChild(new Element("br"));
        element.appendChild(new TextNode("World", ""));
        assertEquals("Hello World", element.text());
    }

    @Test
    public void testTextWithEmptyElement() {
        Element empty = new Element("div");
        assertEquals("", empty.text());
    }

    @Test
    public void testGetAllElements() {
        element.appendElement("span").appendElement("p");
        Elements all = element.getAllElements();
        assertTrue(all.size() >= 3);
        assertSame(element, all.get(0));
    }

    @Test
    public void testHasText() {
        element.appendText("hello");
        assertTrue(element.hasText());
        Element empty = new Element("div");
        assertFalse(empty.hasText());
    }

    @Test
    public void testData() {
        element.append("<![CDATA[raw data]]>");
        assertEquals("raw data", element.data());
    }

    @Test
    public void testClassName() {
        element.classNames(new java.util.LinkedHashSet<>(java.util.Arrays.asList("class1", "class2")));
        assertEquals("class1 class2", element.className());
        assertEquals(2, element.classNames().size());
    }

    @Test
    public void testClassNames() {
        element.attr("class", "one two three");
        Set<String> classes = element.classNames();
        assertTrue(classes.contains("one"));
        assertTrue(classes.contains("two"));
        assertTrue(classes.contains("three"));
        assertEquals(3, classes.size());
    }

    @Test
    public void testClassNamesWithEmptyString() {
        element.attr("class", "");
        assertTrue(element.classNames().isEmpty());
    }

    @Test
    public void testHasClass() {
        element.attr("class", "multiple classes here");
        assertTrue(element.hasClass("multiple"));
        assertTrue(element.hasClass("here"));
        assertFalse(element.hasClass("missing"));
    }

    @Test
    public void testHasClassWithNull() {
        try {
            element.hasClass(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected for some cases, depending on impl
        }
    }

    @Test
    public void testAddClass() {
        element.addClass("new-class");
        assertTrue(element.hasClass("new-class"));
        element.addClass("new-class");
        assertTrue(element.hasClass("new-class"));
    }

    @Test
    public void testRemoveClass() {
        element.attr("class", "one two");
        element.removeClass("one");
        assertFalse(element.hasClass("one"));
        assertTrue(element.hasClass("two"));
    }

    @Test
    public void testToggleClass() {
        element.attr("class", "toggle");
        element.toggleClass("toggle");
        assertFalse(element.hasClass("toggle"));
        element.toggleClass("toggle");
        assertTrue(element.hasClass("toggle"));
    }

    @Test
    public void testVal() {
        element.appendElement("input").attr("value", "test-value");
        assertEquals("", element.val());
        Element input = element.selectFirst("input");
        assertEquals("test-value", input.val());
    }

    @Test
    public void testValWithSet() {
        Element input = element.appendElement("input");
        input.val("new-value");
        assertEquals("new-value", input.attr("value"));
    }

    @Test
    public void testHtmlWithString() {
        element.html("<span>nested</span>");
        assertEquals(1, element.children().size());
        assertEquals("nested", element.selectFirst("span").text());
    }

    @Test
    public void testToString() {
        Element el = new Element("div");
        el.attr("data-test", "value");
        el.appendChild(new TextNode("text", ""));
        assertEquals("<div data-test=\"value\">\n text\n</div>", el.toString());
    }

    @Test
    public void testClone() {
        element.attr("id", "clone-test");
        Element child = element.appendElement("span").attr("class", "child");
        Element clone = element.clone();
        assertNotSame(element, clone);
        assertEquals("clone-test", clone.id());
        assertEquals(1, clone.children().size());
        clone.attr("id", "modified");
        assertNotEquals(element.id(), clone.id());
    }
}