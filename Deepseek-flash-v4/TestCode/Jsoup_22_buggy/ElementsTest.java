package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class ElementsTest {
    private Elements elements;
    private Element element1;
    private Element element2;
    private Element element3;

    @Before
    public void setUp() {
        elements = new Elements();
        element1 = new Element("div").attr("class", "test");
        element2 = new Element("span").attr("class", "test2");
        element3 = new Element("p").attr("data-id", "123");
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(elements);
        assertTrue(elements.isEmpty());
        assertEquals(0, elements.size());
    }

    @Test
    public void testConstructorWithCollection() {
        List<Element> list = Arrays.asList(element1, element2);
        Elements elems = new Elements(list);
        assertEquals(2, elems.size());
        assertEquals(element1, elems.get(0));
    }

    @Test
    public void testConstructorWithList() {
        List<Element> list = new ArrayList<>();
        list.add(element1);
        Elements elems = new Elements(list);
        assertEquals(1, elems.size());
    }

    @Test
    public void testConstructorWithVarargs() {
        Elements elems = new Elements(element1, element2, element3);
        assertEquals(3, elems.size());
    }

    @Test
    public void testClone() {
        elements.add(element1);
        elements.add(element2);
        Elements cloned = elements.clone();
        assertNotNull(cloned);
        assertEquals(elements.size(), cloned.size());
        assertNotSame(elements, cloned);
        assertEquals(element1.tagName(), cloned.get(0).tagName());
    }

    @Test
    public void testAttrWithMatchingAttribute() {
        elements.add(element1);
        elements.add(element2);
        assertEquals("test", elements.attr("class"));
    }

    @Test
    public void testAttrWithNoMatchingAttribute() {
        elements.add(element1);
        elements.add(element2);
        assertEquals("", elements.attr("nonexistent"));
    }

    @Test
    public void testAttrWithEmptyElements() {
        assertEquals("", elements.attr("class"));
    }

    @Test
    public void testHasAttrTrue() {
        elements.add(element1);
        assertTrue(elements.hasAttr("class"));
    }

    @Test
    public void testHasAttrFalse() {
        elements.add(element1);
        assertFalse(elements.hasAttr("nonexistent"));
    }

    @Test
    public void testHasAttrWithEmptyElements() {
        assertFalse(elements.hasAttr("class"));
    }

    @Test
    public void testAttrSetter() {
        elements.add(element1);
        Elements result = elements.attr("data-new", "value");
        assertSame(elements, result);
        assertEquals("value", element1.attr("data-new"));
    }

    @Test
    public void testRemoveAttr() {
        element1.attr("data-temp", "abc");
        elements.add(element1);
        Elements result = elements.removeAttr("data-temp");
        assertSame(elements, result);
        assertFalse(element1.hasAttr("data-temp"));
    }

    @Test
    public void testAddClass() {
        element1.attr("class", "existing");
        elements.add(element1);
        elements.addClass("newclass");
        assertTrue(element1.hasClass("newclass"));
        assertTrue(element1.hasClass("existing"));
    }

    @Test
    public void testRemoveClass() {
        element1.attr("class", "one two three");
        elements.add(element1);
        elements.removeClass("two");
        assertFalse(element1.hasClass("two"));
        assertTrue(element1.hasClass("one"));
        assertTrue(element1.hasClass("three"));
    }

    @Test
    public void testToggleClassAdd() {
        element1.attr("class", "a");
        elements.add(element1);
        elements.toggleClass("b");
        assertTrue(element1.hasClass("b"));
    }

    @Test
    public void testToggleClassRemove() {
        element1.attr("class", "a b");
        elements.add(element1);
        elements.toggleClass("b");
        assertFalse(element1.hasClass("b"));
        assertTrue(element1.hasClass("a"));
    }

    @Test
    public void testHasClassTrue() {
        element1.attr("class", "testclass");
        elements.add(element1);
        assertTrue(elements.hasClass("testclass"));
    }

    @Test
    public void testHasClassFalse() {
        element1.attr("class", "testclass");
        elements.add(element1);
        assertFalse(elements.hasClass("other"));
    }

    @Test
    public void testValWithElements() {
        element1.val("some value");
        elements.add(element1);
        assertEquals("some value", elements.val());
    }

    @Test
    public void testValWithEmptyElements() {
        assertEquals("", elements.val());
    }

    @Test
    public void testValSetter() {
        elements.add(element1);
        elements.add(element2);
        elements.val("new value");
        assertEquals("new value", element1.val());
        assertEquals("new value", element2.val());
    }

    @Test
    public void testTextWithElements() {
        element1.text("one");
        element2.text("two");
        elements.add(element1);
        elements.add(element2);
        assertEquals("one two", elements.text());
    }

    @Test
    public void testTextWithSingleElement() {
        element1.text("one");
        elements.add(element1);
        assertEquals("one", elements.text());
    }

    @Test
    public void testTextWithEmptyElements() {
        assertEquals("", elements.text());
    }

    @Test
    public void testHasTextTrue() {
        element1.text("hello");
        elements.add(element1);
        assertTrue(elements.hasText());
    }

    @Test
    public void testHasTextFalse() {
        elements.add(element1);
        assertFalse(elements.hasText());
    }

    @Test
    public void testHtmlWithMultipleElements() {
        element1.html("<b>bold</b>");
        element2.html("<i>italic</i>");
        elements.add(element1);
        elements.add(element2);
        assertEquals("<b>bold</b>\n<i>italic</i>", elements.html());
    }

    @Test
    public void testHtmlWithEmptyElements() {
        assertEquals("", elements.html());
    }

    @Test
    public void testOuterHtml() {
        Element e = new Element("div").text("text");
        e.attr("class", "test");
        elements.add(e);
        String expected = "<div class=\"test\">\n text\n</div>";
        assertEquals(expected, elements.outerHtml());
    }

    @Test
    public void testToString() {
        Element e = new Element("a").attr("href", "http://example.com");
        elements.add(e);
        assertEquals(e.outerHtml(), elements.toString());
    }

    @Test
    public void testTagName() {
        element1.tagName("b");
        elements.add(element1);
        elements.add(element2);
        elements.tagName("strong");
        assertEquals("strong", element1.tagName());
        assertEquals("strong", element2.tagName());
    }

    @Test
    public void testHtmlSetter() {
        elements.add(element1);
        elements.html("<p>parsed</p>");
        assertEquals("<p>parsed</p>", element1.html());
    }

    @Test
    public void testPrepend() {
        element1.html("<p>existing</p>");
        elements.add(element1);
        elements.prepend("<span>new</span>");
        assertTrue(element1.html().contains("<span>new</span>"));
    }

    @Test
    public void testAppend() {
        element1.html("<p>existing</p>");
        elements.add(element1);
        elements.append("<span>new</span>");
        assertTrue(element1.html().contains("</p><span>new</span>"));
    }

    @Test
    public void testBefore() {
        Element parent = new Element("div");
        parent.appendChild(element1);
        elements.add(element1);
        elements.before("<span>before</span>");
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testAfter() {
        Element parent = new Element("div");
        parent.appendChild(element1);
        elements.add(element1);
        elements.after("<span>after</span>");
        assertEquals(2, parent.children().size());
    }

    @Test
    public void testWrap() {
        elements.add(element1);
        elements.wrap("<div class='wrapper'></div>");
        assertTrue(element1.parent().hasClass("wrapper"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapWithNull() {
        elements.add(element1);
        elements.wrap(null);
    }

    @Test
    public void testWrapWithEmptyString() {
        elements.add(element1);
        try {
            elements.wrap("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testUnwrap() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        child.appendChild(new Element("p").text("text"));
        Elements elems = new Elements(child);
        elems.unwrap();
        assertNotNull(parent.child(0));
    }

    @Test
    public void testEmpty() {
        Element inner = new Element("p").text("hello");
        Element outer = new Element("div");
        outer.appendChild(inner);
        elements.add(outer);
        elements.empty();
        assertEquals("", outer.html());
    }

    @Test
    public void testRemove() {
        Element parent = new Element("div");
        parent.appendChild(element1);
        elements.add(element1);
        elements.remove();
        assertEquals(0, parent.children().size());
    }

    @Test
    public void testSelect() {
        Element root = new Element("div");
        Element child1 = new Element("span").text("child");
        root.appendChild(child1);
        elements.add(root);
        Elements result = elements.select("span");
        assertEquals(1, result.size());
        assertEquals("child", result.text());
    }

    @Test
    public void testNot() {
        Element root = new Element("div");
        Element child1 = new Element("span").attr("class", "logo");
        Element child2 = new Element("span");
        root.appendChild(child1);
        root.appendChild(child2);
        elements.add(child1);
        elements.add(child2);
        Elements result = elements.not(".logo");
        assertEquals(1, result.size());
        assertSame(child2, result.get(0));
    }

    @Test
    public void testEqValidIndex() {
        elements.add(element1);
        elements.add(element2);
        Elements result = elements.eq(0);
        assertEquals(1, result.size());
        assertSame(element1, result.get(0));
    }

    @Test
    public void testEqInvalidIndex() {
        elements.add(element1);
        Elements result = elements.eq(5);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testIsTrue() {
        Element root = new Element("div");
        Element child = new Element("span").attr("class", "match");
        element1.appendChild(child);
        elements.add(element1);
        assertTrue(elements.is(".match"));
    }

    @Test
    public void testIsFalse() {
        elements.add(element1);
        assertFalse(elements.is(".nonexistent"));
    }

    @Test
    public void testParents() {
        Element grandparent = new Element("div").attr("class", "gp");
        Element parent = new Element("div").attr("class", "p");
        grandparent.appendChild(parent);
        parent.appendChild(element1);
        elements.add(element1);
        Elements parents = elements.parents();
        assertEquals(2, parents.size());
    }

    @Test
    public void testFirstWithEmptyList() {
        assertNull(elements.first());
    }

    @Test
    public void testFirstWithElements() {
        elements.add(element1);
        elements.add(element2);
        assertSame(element1, elements.first());
    }

    @Test
    public void testLastWithEmptyList() {
        assertNull(elements.last());
    }

    @Test
    public void testLastWithElements() {
        elements.add(element1);
        elements.add(element2);
        assertSame(element2, elements.last());
    }

    @Test(expected = NullPointerException.class)
    public void testTraverseWithNullVisitor() {
        elements.traverse(null);
    }

    @Test
    public void testListInterfaceMethods() {
        elements = new Elements();
        elements.add(new Element("div"));
        assertEquals(1, elements.size());
        assertFalse(elements.isEmpty());
        assertNotNull(elements.iterator());
        assertNotNull(elements.toArray());
        assertNotNull(elements.toArray(new Element[0]));
        assertFalse(elements.contains(null));
    }

    @Test
    public void testCollectionOperations() {
        elements.add(element1);
        elements.add(element2);
        assertTrue(elements.contains(element1));
        assertTrue(elements.containsAll(Arrays.asList(element1, element2)));
        assertTrue(elements.remove(element1));
        assertFalse(elements.remove(element1));
        assertTrue(elements.addAll(Arrays.asList(element1, element3)));
        assertTrue(elements.removeAll(Arrays.asList(element1, element2)));
        assertTrue(elements.retainAll(Arrays.asList(element3)));
        assertEquals(1, elements.size());
    }

    @Test
    public void testListSpecificOperations() {
        elements = new Elements();
        elements.add(0, element1);
        elements.add(element2);
        assertEquals(element1, elements.set(0, element3));
        assertEquals(2, elements.size());
        assertEquals(0, elements.indexOf(element3));
        assertEquals(1, elements.lastIndexOf(element2));
        assertNotNull(elements.listIterator());
        assertNotNull(elements.listIterator(0));
        assertNotNull(elements.subList(0, 1));
        assertEquals(element2, elements.remove(1));
        elements.clear();
        assertTrue(elements.isEmpty());
    }
}