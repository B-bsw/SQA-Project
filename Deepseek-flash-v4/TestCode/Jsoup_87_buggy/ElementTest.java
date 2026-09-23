package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;

public class ElementTest {
    private Element parent;

    @Before
    public void setUp() {
        parent = new Element("div");
    }

    @Test
    public void testConstructorTagString() {
        Element e = new Element("p");
        assertEquals("p", e.tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTag() {
        new Element((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagObject() {
        new Element(null, "", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTagNameEmpty() {
        parent.tagName("");
    }

    @Test
    public void testTagNameChange() {
        parent.tagName("span");
        assertEquals("span", parent.tagName());
        assertEquals("span", parent.nodeName());
    }

    @Test
    public void testId() {
        parent.attr("id", "main");
        assertEquals("main", parent.id());
    }

    @Test
    public void testIdAbsent() {
        assertNull(parent.id());
    }

    @Test
    public void testChildOutOfBounds() {
        try {
            parent.child(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testChildrenEmpty() {
        assertTrue(parent.children().isEmpty());
    }

    @Test
    public void testAppendChildAndChildren() {
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(1, parent.children().size());
        assertSame(child, parent.child(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        parent.appendChild(null);
    }

    @Test
    public void testEmpty() {
        Element child = new Element("span");
        parent.appendChild(child);
        parent.empty();
        assertTrue(parent.children().isEmpty());
        assertTrue(parent.childNodes.isEmpty());
    }

    @Test
    public void testClassNames() {
        parent.attr("class", "foo bar");
        Set<String> classes = parent.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
    }

    @Test
    public void testClassNamesEmpty() {
        assertTrue(parent.classNames().isEmpty());
    }

    @Test
    public void testHasClassPresent() {
        parent.attr("class", "foo bar");
        assertTrue(parent.hasClass("foo"));
        assertTrue(parent.hasClass("bar"));
        assertFalse(parent.hasClass("baz"));
        assertTrue(parent.hasClass("FOO"));
        assertFalse(parent.hasClass("fo"));
    }

    @Test
    public void testHasClassSingle() {
        parent.attr("class", "foobar");
        assertTrue(parent.hasClass("foobar"));
        assertFalse(parent.hasClass("foo"));
    }

    @Test
    public void testAddClass() {
        parent.addClass("foo");
        assertTrue(parent.hasClass("foo"));
        parent.addClass("bar");
        assertEquals(2, parent.classNames().size());
    }

    @Test
    public void testRemoveClass() {
        parent.attr("class", "foo bar");
        parent.removeClass("foo");
        assertFalse(parent.hasClass("foo"));
        assertTrue(parent.hasClass("bar"));
    }

    @Test
    public void testToggleClass() {
        parent.attr("class", "foo");
        parent.toggleClass("foo");
        assertFalse(parent.hasClass("foo"));
        parent.toggleClass("foo");
        assertTrue(parent.hasClass("foo"));
    }

    @Test
    public void testText() {
        parent.appendChild(new TextNode("Hello"));
        assertEquals("Hello", parent.text());
    }

    @Test
    public void testTextBlock() {
        Element div = new Element("div");
        div.appendChild(new TextNode("Hello"));
        Element p = new Element("p");
        p.appendChild(new TextNode("World"));
        div.appendChild(p);
        assertEquals("Hello World", div.text());
    }

    @Test
    public void testOwnText() {
        parent.appendChild(new TextNode("Hello "));
        Element p = new Element("p");
        p.appendChild(new TextNode("World"));
        parent.appendChild(p);
        assertEquals("Hello", parent.ownText());
    }

    @Test
    public void testValInput() {
        Element input = new Element("input");
        input.attr("value", "test");
        assertEquals("test", input.val());
        input.val("new");
        assertEquals("new", input.val());
    }

    @Test
    public void testValTextarea() {
        Element textarea = new Element("textarea");
        textarea.text("content");
        assertEquals("content", textarea.val());
    }

    @Test
    public void testHtml() {
        Element child = new Element("span");
        child.text("text");
        parent.appendChild(child);
        String html = parent.html();
        assertTrue(html.contains("<span>text</span>"));
        assertTrue(html.startsWith("<div>"));
        assertTrue(html.endsWith("</div>"));
    }

    @Test
    public void testClone() {
        parent.attr("id", "main");
        Element clone = parent.clone();
        assertNotSame(parent, clone);
        assertEquals(parent.tagName(), clone.tagName());
        assertEquals("main", clone.id());
        assertNotNull(clone.attributes());
    }

    @Test
    public void testElementSiblingIndex() {
        Element p = new Element("div");
        Element c1 = new Element("span");
        Element c2 = new Element("span");
        p.appendChild(c1);
        p.appendChild(c2);
        assertEquals(0, c1.elementSiblingIndex());
        assertEquals(1, c2.elementSiblingIndex());
    }

    @Test
    public void testNextPreviousSibling() {
        Element parentDiv = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        Element c = new Element("c");
        parentDiv.appendChild(a);
        parentDiv.appendChild(b);
        parentDiv.appendChild(c);
        assertSame(b, a.nextElementSibling());
        assertNull(c.nextElementSibling());
        assertSame(b, c.previousElementSibling());
        assertNull(a.previousElementSibling());
    }

    @Test
    public void testFirstLastElementSibling() {
        Element parentDiv = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parentDiv.appendChild(a);
        parentDiv.appendChild(b);
        assertSame(a, a.firstElementSibling());
        assertSame(b, b.lastElementSibling());

        Element parent2 = new Element("div");
        Element only = new Element("span");
        parent2.appendChild(only);
        assertNull(only.firstElementSibling());
        assertNull(only.lastElementSibling());
    }

    @Test
    public void testCssSelectorWithId() {
        parent.attr("id", "myid");
        assertEquals("#myid", parent.cssSelector());
    }

    @Test
    public void testCssSelectorWithClass() {
        parent.attr("class", "foo");
        assertEquals("div.foo", parent.cssSelector());
    }

    @Test
    public void testParentOfDocumentRoot() {
        Element e = new Element("html");
        assertNull(e.parent());
    }

    @Test
    public void testSiblingElements() {
        Element parentDiv = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parentDiv.appendChild(a);
        parentDiv.appendChild(b);
        Elements siblings = a.siblingElements();
        assertEquals(1, siblings.size());
        assertSame(b, siblings.get(0));
    }

    @Test
    public void testGetElementById() {
        parent.attr("id", "main");
        Element result = parent.getElementById("main");
        assertSame(parent, result);
        assertNull(parent.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmpty() {
        parent.getElementById("");
    }

    @Test
    public void testEnsureChildNodesInitialEmpty() {
        Element child = new Element("span");
        parent.appendChild(child);
        assertNotNull(parent.childNodes);
        assertNotSame(java.util.Collections.emptyList(), parent.childNodes);
    }

    @Test
    public void testChildrenListCaching() {
        Element child1 = new Element("span");
        Element child2 = new Element("div");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.children();
        parent.appendChild(new Element("p"));
        List<Element> children3 = parent.children();
        assertEquals(3, children3.size());
    }
}