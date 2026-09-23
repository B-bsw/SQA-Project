package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {

    private Element createElement() {
        return new Element(Tag.valueOf("div"), "http://example.com");
    }

    private Element createNestedElement() {
        Element root = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = new Element(Tag.valueOf("span"), "http://example.com");
        root.appendChild(child);
        return root;
    }

    @Test
    public void testTagName() {
        Element el = createElement();
        assertEquals("div", el.tagName());
        Element el2 = el.tagName("span");
        assertSame(el, el2);
        assertEquals("span", el.tagName());
    }

    @Test
    public void testTagNameNull() {
        Element el = createElement();
        try {
            el.tagName(null);
            fail("Should have thrown exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Tag name must not be empty.", e.getMessage());
        }
    }

    @Test
    public void testIsBlock() {
        Element div = new Element(Tag.valueOf("div"), "");
        assertTrue(div.isBlock());
        Element span = new Element(Tag.valueOf("span"), "");
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        Element el = new Element(Tag.valueOf("div"), "");
        assertNull(el.id());
        el.attr("id", "main");
        assertEquals("main", el.id());
    }

    @Test
    public void testParent() {
        Element root = createElement();
        Element child = new Element(Tag.valueOf("span"), "");
        root.appendChild(child);
        assertEquals(root, child.parent());
        assertNull(root.parent());
    }

    @Test
    public void testParents() {
        Element root = createElement();
        Element child = new Element(Tag.valueOf("span"), "");
        Element grandchild = new Element(Tag.valueOf("b"), "");
        root.appendChild(child);
        child.appendChild(grandchild);
        Elements parents = grandchild.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(child));
        assertTrue(parents.contains(root));
    }

    @Test
    public void testChildIndex() {
        Element root = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        Element c3 = new Element(Tag.valueOf("i"), "");
        root.appendChild(c1);
        root.appendChild(c2);
        root.appendChild(c3);
        assertEquals(c1, root.child(0));
        assertEquals(c3, root.child(2));
        try {
            root.child(3);
            fail("IndexOutOfBounds expected");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testChildren() {
        Element root = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        root.appendChild(c1);
        root.appendChild(c2);
        Elements children = root.children();
        assertEquals(2, children.size());
        assertTrue(children.contains(c1));
        assertTrue(children.contains(c2));
    }

    @Test
    public void testTextNodes() {
        Element root = createElement();
        root.appendChild(new TextNode("hello", ""));
        root.appendChild(new Element(Tag.valueOf("span"), ""));
        List<TextNode> textNodes = root.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("hello", textNodes.get(0).getWholeText());
    }

    @Test
    public void testAppendChildValidation() {
        Element root = createElement();
        try {
            root.appendChild(null);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendElement() {
        Element root = createElement();
        Element child = root.appendElement("span");
        assertEquals("span", child.tagName());
        assertEquals(root, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element root = createElement();
        root.appendChild(new Element(Tag.valueOf("b"), ""));
        Element prepended = root.prependElement("i");
        assertEquals("i", prepended.tagName());
        assertEquals(0, root.childNodes().indexOf(prepended));
    }

    @Test
    public void testInsertChildren() {
        Element root = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        root.appendChild(c1);
        root.insertChildren(0, Arrays.asList(c2));
        assertEquals(c2, root.child(0));
        assertEquals(c1, root.child(1));
    }

    @Test
    public void testInsertChildrenNegativeIndex() {
        Element root = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        root.appendChild(c1);
        Element c2 = new Element(Tag.valueOf("b"), "");
        root.insertChildren(-1, Arrays.asList(c2));
        assertEquals(2, root.children().size());
        assertEquals(c2, root.child(1));
    }

    @Test
    public void testInsertChildrenBadIndex() {
        Element root = createElement();
        try {
            root.insertChildren(5, Arrays.asList(new Element(Tag.valueOf("b"), "")));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Insert position out of bounds.", e.getMessage());
        }
    }

    @Test
    public void testText() {
        Element root = createElement();
        root.appendChild(new TextNode("Hello ", ""));
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new TextNode("World", ""));
        root.appendChild(span);
        assertEquals("Hello World", root.text());
    }

    @Test
    public void testTextEmpty() {
        Element root = createElement();
        assertEquals("", root.text());
        assertEquals("", root.ownText());
    }

    @Test
    public void testOwnText() {
        Element root = createElement();
        root.appendChild(new TextNode("Hello ", ""));
        Element span = new Element(Tag.valueOf("span"), "");
        span.appendChild(new TextNode("World", ""));
        root.appendChild(span);
        assertEquals("Hello", root.ownText());
    }

    @Test
    public void testHasText() {
        Element root = createElement();
        assertFalse(root.hasText());
        root.appendChild(new TextNode("text", ""));
        assertTrue(root.hasText());
    }

    @Test
    public void testData() {
        Element root = createElement();
        root.appendChild(new DataNode("data", ""));
        assertEquals("data", root.data());
    }

    @Test
    public void testClassName() {
        Element el = createElement();
        el.attr("class", "foo bar");
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = createElement();
        el.attr("class", "foo bar baz");
        Set<String> classes = el.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
        assertTrue(classes.contains("baz"));
    }

    @Test
    public void testClassNamesSet() {
        Element el = createElement();
        el.classNames(new HashSet<String>(Arrays.asList("a", "b")));
        assertEquals("a b", el.className());
    }

    @Test
    public void testHasClass() {
        Element el = createElement();
        el.attr("class", "foo bar");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
        assertFalse(el.hasClass("baz"));
        assertFalse(el.hasClass("fo"));
    }

    @Test
    public void testAddClass() {
        Element el = createElement();
        el.addClass("foo");
        el.addClass("bar");
        assertTrue(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
        el.addClass("foo"); 
        assertEquals("foo bar", el.className());
    }

    @Test
    public void testRemoveClass() {
        Element el = createElement();
        el.addClass("foo bar");
        el.removeClass("foo");
        assertFalse(el.hasClass("foo"));
        assertTrue(el.hasClass("bar"));
    }

    @Test
    public void testToggleClass() {
        Element el = createElement();
        el.toggleClass("foo");
        assertTrue(el.hasClass("foo"));
        el.toggleClass("foo");
        assertFalse(el.hasClass("foo"));
    }

    @Test
    public void testVal() {
        Element el = new Element(Tag.valueOf("input"), "");
        el.attr("value", "test");
        assertEquals("test", el.val());
        el.val("new");
        assertEquals("new", el.val());
    }

    @Test
    public void testValTextArea() {
        Element el = new Element(Tag.valueOf("textarea"), "");
        el.text("text here");
        assertEquals("text here", el.val());
    }

    @Test
    public void testAppendText() {
        Element el = createElement();
        el.appendText(" text ");
        el.appendText("more");
        assertEquals("text more", el.text());
    }

    @Test
    public void testPrependText() {
        Element el = createElement();
        el.appendText(" world");
        el.prependText("Hello");
        assertEquals("Hello world", el.text());
    }

    @Test
    public void testSiblingElements() {
        Element parent = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        Element c3 = new Element(Tag.valueOf("i"), "");
        parent.appendChild(c1);
        parent.appendChild(c2);
        parent.appendChild(c3);
        Elements siblings = c2.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(c1));
        assertTrue(siblings.contains(c3));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(c2, c1.nextElementSibling());
        assertNull(c2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(c1, c2.previousElementSibling());
        assertNull(c1.previousElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = createElement();
        Element c1 = new Element(Tag.valueOf("span"), "");
        Element c2 = new Element(Tag.valueOf("b"), "");
        parent.appendChild(c1);
        parent.appendChild(c2);
        assertEquals(0, c1.elementSiblingIndex().intValue());
        assertEquals(1, c2.elementSiblingIndex().intValue());
        Element orphan = createElement();
        assertEquals(0, orphan.elementSiblingIndex().intValue());
    }

    @Test
    public void testGetElementsByTag() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("span");
        root.appendElement("b");
        Elements spans = root.getElementsByTag("span");
        assertEquals(2, spans.size());
        assertEquals("span", spans.get(0).tagName());
    }

    @Test
    public void testGetElementById() {
        Element root = createElement();
        Element child1 = root.appendElement("span").attr("id", "one");
        root.appendElement("span").attr("id", "two");
        assertEquals(child1, root.getElementById("one"));
        assertNull(root.getElementById("none"));
    }

    @Test
    public void testGetElementsByClass() {
        Element root = createElement();
        root.appendElement("span").addClass("foo");
        root.appendElement("b").addClass("foo bar");
        root.appendElement("i");
        Elements foo = root.getElementsByClass("foo");
        assertEquals(2, foo.size());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "val");
        root.appendElement("b");
        Elements byAttr = root.getElementsByAttribute("data-test");
        assertEquals(1, byAttr.size());
        assertEquals("span", byAttr.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element root = createElement();
        root.appendElement("span").attr("data-one", "1");
        root.appendElement("b").attr("data-two", "2");
        root.appendElement("i");
        Elements byPrefix = root.getElementsByAttributeStarting("data-");
        assertEquals(2, byPrefix.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "value1");
        root.appendElement("b").attr("data-test", "value2");
        Elements byVal = root.getElementsByAttributeValue("data-test", "value1");
        assertEquals(1, byVal.size());
        assertEquals("span", byVal.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "value1");
        root.appendElement("b").attr("data-test", "value2");
        Elements byValNot = root.getElementsByAttributeValueNot("data-test", "value1");
        assertEquals(1, byValNot.size());
        assertEquals("b", byValNot.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "val1");
        root.appendElement("b").attr("data-test", "other");
        Elements byPrefix = root.getElementsByAttributeValueStarting("data-test", "val");
        assertEquals(1, byPrefix.size());
        assertEquals("span", byPrefix.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "test1");
        root.appendElement("b").attr("data-test", "other");
        Elements bySuffix = root.getElementsByAttributeValueEnding("data-test", "st1");
        assertEquals(1, bySuffix.size());
        assertEquals("span", bySuffix.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "hello world");
        root.appendElement("b").attr("data-test", "world");
        root.appendElement("i").attr("data-test", "hello");
        Elements byContaining = root.getElementsByAttributeValueContaining("data-test", "lo wo");
        assertEquals(1, byContaining.size());
        assertEquals("span", byContaining.get(0).tagName());
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "abc123");
        root.appendElement("b").attr("data-test", "def456");
        Elements byMatch = root.getElementsByAttributeValueMatching("data-test", "\\d+");
        assertEquals(2, byMatch.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingWithRegex() {
        Element root = createElement();
        root.appendElement("span").attr("data-test", "abc123");
        root.appendElement("b").attr("data-test", "def456");
        Elements byMatch = root.getElementsByAttributeValueMatching("data-test", "\\d+");
        assertEquals(2, byMatch.size());
        try {
            root.getElementsByAttributeValueMatching("data-test", "[invalid");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("b");
        root.appendElement("i");
        Elements less = root.getElementsByIndexLessThan(2);
        assertEquals(2, less.size());
        assertEquals("span", less.get(0).tagName());
        assertEquals("b", less.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("b");
        root.appendElement("i");
        Elements greater = root.getElementsByIndexGreaterThan(0);
        assertEquals(2, greater.size());
        assertEquals("b", greater.get(0).tagName());
        assertEquals("i", greater.get(1).tagName());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("b");
        Element i = root.appendElement("i");
        Elements equals = root.getElementsByIndexEquals(2);
        assertEquals(1, equals.size());
        assertEquals(i, equals.get(0));
    }

    @Test
    public void testGetElementsContainingText() {
        Element root = createElement();
        root.appendElement("span").appendText("hello world");
        root.appendElement("b").appendText("world");
        Elements containing = root.getElementsContainingText("lo wo");
        assertEquals(1, containing.size());
        assertEquals("span", containing.get(0).tagName());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element root = createElement();
        root.appendElement("span").appendText("hello");
        Element b = root.appendElement("b");
        b.text("world");
        Elements containing = root.getElementsContainingOwnText("world");
        assertEquals(1, containing.size());
        assertEquals("b", containing.get(0).tagName());
    }

    @Test
    public void testGetElementsMatchingText() {
        Element root = createElement();
        root.appendElement("span").appendText("hello123");
        root.appendElement("b").appendText("world456");
        Elements matching = root.getElementsMatchingText("\\d+");
        assertEquals(2, matching.size());
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element root = createElement();
        root.appendElement("span").appendText("hello123");
        Element b = root.appendElement("b");
        b.text("world456");
        Elements matching = root.getElementsMatchingOwnText("\\d+");
        assertEquals(1, matching.size());
        assertEquals("b", matching.get(0).tagName());
    }

    @Test
    public void testGetAllElements() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("b");
        Elements all = root.getAllElements();
        assertEquals(3, all.size());
        assertTrue(all.contains(root));
        assertTrue(all.contains(root.child(0)));
        assertTrue(all.contains(root.child(1)));
    }

    @Test
    public void testCssSelector() {
        Element root = createElement();
        root.attr("id", "top");
        assertEquals("#top", root.cssSelector());
        Element child = root.appendElement("span").addClass("cls");
        assertEquals("#top > span.cls", child.cssSelector());
    }

    @Test
    public void testEquals() {
        Element el1 = createElement();
        Element el2 = createElement();
        assertNotEquals(el1, el2);
        el1.attr("key", "value");
        el2.attr("key", "value");
        assertEquals(el1, el2);
    }

    @Test
    public void testHashCode() {
        Element el1 = createElement();
        Element el2 = createElement();
        el1.attr("key", "value");
        el2.attr("key", "value");
        assertEquals(el1.hashCode(), el2.hashCode());
    }

    @Test
    public void testClone() {
        Element el = createElement();
        el.attr("id", "clone-test");
        el.appendElement("span").text("text");
        Element clone = el.clone();
        assertNotSame(el, clone);
        assertEquals(el, clone);
        assertEquals("id", clone.attr("id"));
        assertEquals(1, clone.children().size());
        assertEquals("span", clone.child(0).tagName());
    }

    @Test
    public void testEmpty() {
        Element root = createElement();
        root.appendElement("span");
        root.appendElement("b");
        root.empty();
        assertEquals(0, root.childNodes().size());
    }

    @Test
    public void testHtml() {
        Element el = createElement();
        el.appendElement("span").text("Hello");
        assertEquals("<div>\n <span>Hello</span>\n</div>", el.html());
        el.html("<p>New</p>");
        assertEquals("<p>New</p>", el.html());
    }

    @Test
    public void testToString() {
        Element el = createElement();
        el.appendElement("span").text("Hi");
        assertEquals("<div>\n <span>Hi</span>\n</div>", el.toString());
    }

    @Test
    public void testSelect() {
        Element root = createElement();
        root.appendElement("span").addClass("foo");
        root.appendElement("div").addClass("bar");
        Elements selected = root.select(".foo");
        assertEquals(1, selected.size());
        assertEquals("span", selected.get(0).tagName());
    }

    @Test
    public void testWrap() {
        Element root = createElement();
        Element child = root.appendElement("span");
        child.wrap("<div class='wrapper'>");
        assertEquals(1, root.children().size());
        assertEquals("div", root.child(0).tagName());
        assertEquals("span", root.child(0).child(0).tagName());
    }

    @Test
    public void testBeforeHtml() {
        Element root = createElement();
        Element span = root.appendElement("span");
        span.before("<p>before</p>");
        assertEquals(2, root.children().size());
        assertEquals("p", root.child(0).tagName());
    }

    @Test
    public void testAfterHtml() {
        Element root = createElement();
        Element span = root.appendElement("span");
        span.after("<p>after</p>");
        assertEquals(2, root.children().size());
        assertEquals("p", root.child(1).tagName());
    }

    @Test
    public void testFirstElementSibling() {
        Element root = createElement();
        Element c1 = root.appendElement("span");
        root.appendElement("b");
        Element c3 = root.appendElement("i");
        assertEquals(c1, c3.firstElementSibling());
        assertNull(c1.firstElementSibling());
    }

    @Test
    public void testLastElementSibling() {
        Element root = createElement();
        Element c1 = root.appendElement("span");
        Element c2 = root.appendElement("b");
        root.appendElement("i");
        assertEquals(c2.lastElementSibling().previousElementSibling(), c1);
    }

    @Test
    public void testTextWithNewlines() {
        Element root = createElement();
        root.appendChild(new TextNode("  Hello  ", ""));
        assertEquals("Hello", root.text());
    }

    @Test
    public void testTextWithBlockElements() {
        Element root = createElement();
        root.appendChild(new TextNode("Hello", ""));
        Element p = root.appendElement("p");
        p.appendChild(new TextNode("World", ""));
        root.appendChild(new TextNode("Again", ""));
        assertEquals("Hello World Again", root.text());
    }

    @Test
    public void testTextWithBr() {
        Element root = createElement();
        root.appendChild(new TextNode("Line1", ""));
        root.appendElement("br");
        root.appendChild(new TextNode("Line2", ""));
        assertEquals("Line1 Line2", root.text());
    }

    @Test
    public void testDataWithElements() {
        Element root = createElement();
        root.appendChild(new DataNode("data1", ""));
        root.appendElement("span").text("data2");
        assertEquals("data1", root.data());
    }

    @Test
    public void testClassNamesEmpty() {
        Element el = createElement();
        assertEquals(0, el.classNames().size());
        assertTrue(el.className().isEmpty());
    }

    @Test
    public void testGetElementsMatchingTextInvalidRegex() {
        Element root = createElement();
        root.appendElement("span").text("text");
        try {
            root.getElementsMatchingText("[");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetElementsByTagCaseInsensitive() {
        Element root = createElement();
        root.appendElement("SPAN");
        Elements spans = root.getElementsByTag("span");
        assertEquals(1, spans.size());
    }

    @Test
    public void testGetElementByIdMultipleMatches() {
        Element root = createElement();
        Element child1 = root.appendElement("span").attr("id", "dup");
        root.appendElement("b").attr("id", "dup");
        assertEquals(child1, root.getElementById("dup"));
    }

    @Test
    public void testValidateNotNullAppendChild() {
        Element root = createElement();
        try {
            root.appendChild(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }
}