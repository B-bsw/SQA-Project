package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.junit.Assert.*;

public class ElementTest {
    private Element element;
    private Tag divTag;
    private String baseUri = "http://example.com";

    @Before
    public void setUp() {
        divTag = Tag.valueOf("div");
        element = new Element(divTag, baseUri);
    }

    @Test
    public void testConstrutorWithAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("id", "testId");
        Element elem = new Element(divTag, baseUri, attributes);
        assertNotNull(elem);
        assertEquals("div", elem.tagName());
        assertEquals("testId", elem.id());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstrutorWithNullTag() {
        new Element(null, baseUri);
    }

    @Test
    public void testNodeName() {
        assertEquals("div", element.nodeName());
    }

    @Test
    public void testTagName() {
        assertEquals("div", element.tagName());
    }

    @Test
    public void testTag() {
        assertEquals(divTag, element.tag());
    }

    @Test
    public void testIsBlock() {
        assertTrue(element.isBlock());
        Element span = new Element(Tag.valueOf("span"), baseUri);
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        assertEquals("", element.id());
        element.attr("id", "main");
        assertEquals("main", element.id());
    }

    @Test
    public void testAttrWithReturn() {
        Element result = element.attr("data-x", "value");
        assertEquals(element, result);
        assertEquals("value", element.attr("data-x"));
    }

    @Test
    public void testParent() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child);
        assertEquals(parent, child.parent());
        assertNull(element.parent());
    }

    @Test
    public void testParents() {
        Element root = new Element(Tag.valueOf("div"), baseUri);
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child = new Element(Tag.valueOf("span"), baseUri);
        root.appendChild(parent);
        parent.appendChild(child);
        
        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(parent));
        assertTrue(parents.contains(root));
    }

    @Test
    public void testChildren() {
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        element.appendChild(child1);
        element.appendChild(child2);
        
        assertEquals(2, element.children().size());
        assertEquals(child1, element.child(0));
        assertEquals(child2, element.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        element.child(0);
    }

    @Test
    public void testSelect() {
        element.appendElement("span").addClass("target");
        Elements results = element.select(".target");
        assertEquals(1, results.size());
    }

    @Test
    public void testAppendChild() {
        Element child = new Element(Tag.valueOf("span"), baseUri);
        Element result = element.appendChild(child);
        assertEquals(element, result);
        assertEquals(1, element.childNodes().size());
        assertEquals(element, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        element.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element first = new Element(Tag.valueOf("span"), baseUri);
        Element second = new Element(Tag.valueOf("div"), baseUri);
        element.appendChild(second);
        
        element.prependChild(first);
        assertEquals(2, element.children().size());
        assertEquals(first, element.child(0));
    }

    @Test
    public void testAppendElement() {
        Element child = element.appendElement("span");
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(element, child.parent());
    }

    @Test
    public void testPrependElement() {
        element.appendChild(new Element(Tag.valueOf("div"), baseUri));
        Element prepended = element.prependElement("span");
        assertEquals("span", prepended.tagName());
        assertEquals(prepended, element.child(0));
    }

    @Test
    public void testAppendText() {
        element.appendText("Hello");
        assertEquals("Hello", element.text());
    }

    @Test
    public void testPrependText() {
        element.appendText("World");
        element.prependText("Hello ");
        assertEquals("Hello World", element.text());
    }

    @Test
    public void testAppendHtml() {
        element.append("<span>Hello</span><div>World</div>");
        assertEquals(2, element.children().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        element.append(null);
    }

    @Test
    public void testPrependHtml() {
        element.append("<div>World</div>");
        element.prepend("<span>Hello</span>");
        assertEquals(2, element.children().size());
        assertEquals("span", element.child(0).tagName());
        assertEquals("div", element.child(1).tagName());
    }

    @Test
    public void testEmpty() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.appendText("text");
        Element result = element.empty();
        assertEquals(element, result);
        assertEquals(0, element.childNodes().size());
    }

    @Test
    public void testWrap() {
        element.appendText("content");
        element.wrap("<div class='wrapper'></div>");
        assertEquals(1, element.parent().tagName().equals("div"));
        assertTrue(element.parent().hasClass("wrapper"));
    }

    @Test
    public void testWrapSingle() {
        element.appendText("content");
        Element result = element.wrap("<div class='wrap'></div>");
        assertNotNull(result);
        assertEquals("div", element.parent().tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrapEmpty() {
        element.wrap("");
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        Element child3 = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(3, child1.siblingElements().size());
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        Element child3 = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(child2, child1.nextElementSibling());
        assertNull(child3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        Element child3 = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);

        assertEquals(child2, child3.previousElementSibling());
        assertNull(child1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child1, child2.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
        assertEquals(0, element.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("div"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);

        assertEquals(child2, child1.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        element.appendElement("span").text("one");
        element.appendElement("div").text("two");
        element.appendElement("span").text("three");
        
        Elements result = element.getElementsByTag("span");
        assertEquals(2, result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        element.getElementsByTag("");
    }

    @Test
    public void testGetElementById() {
        element.appendElement("div").attr("id", "unique");
        Element found = element.getElementById("unique");
        assertNotNull(found);
        assertEquals("unique", found.id());
        assertNull(element.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() {
        element.appendElement("div").addClass("class1");
        element.appendElement("span").addClass("class2");
        
        Elements result = element.getElementsByClass("class1");
        assertEquals(1, result.size());
        assertTrue(result.get(0).hasClass("class1"));
    }

    @Test
    public void testGetElementsByAttribute() {
        element.appendElement("div").attr("data-x", "value1");
        element.appendElement("span").attr("data-y", "value2");
        
        Elements result = element.getElementsByAttribute("data-x");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        element.appendElement("div").attr("data-x", "match");
        element.appendElement("span").attr("data-x", "other");
        
        Elements result = element.getElementsByAttributeValue("data-x", "match");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        element.appendElement("div").attr("data-x", "match");
        element.appendElement("span").attr("data-x", "other");
        
        Elements result = element.getElementsByAttributeValueNot("data-x", "match");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        element.appendElement("div").attr("data-x", "helloWorld");
        element.appendElement("span").attr("data-x", "goodbye");
        
        Elements result = element.getElementsByAttributeValueStarting("data-x", "hello");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        element.appendElement("div").attr("data-x", "helloWorld");
        element.appendElement("span").attr("data-x", "goodbyeWorld");
        
        Elements result = element.getElementsByAttributeValueEnding("data-x", "World");
        assertEquals(2, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        element.appendElement("div").attr("data-x", "helloWorld");
        element.appendElement("span").attr("data-x", "goodbye");
        
        Elements result = element.getElementsByAttributeValueContaining("data-x", "loWo");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        element.appendElement("div").text("0");
        element.appendElement("div").text("1");
        element.appendElement("div").text("2");
        
        Elements result = element.getElementsByIndexLessThan(2);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        element.appendElement("div").text("0");
        element.appendElement("div").text("1");
        element.appendElement("div").text("2");
        
        Elements result = element.getElementsByIndexGreaterThan(1);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        element.appendElement("div").text("0");
        element.appendElement("div").text("1");
        element.appendElement("div").text("2");
        
        Elements result = element.getElementsByIndexEquals(1);
        assertEquals(1, result.size());
        assertEquals("1", result.get(0).text());
    }

    @Test
    public void testGetAllElements() {
        element.appendElement("div").appendElement("span");
        element.appendElement("div").appendElement("p");
        
        Elements result = element.getAllElements();
        assertEquals(5, result.size());
    }

    @Test
    public void testText() {
        element.appendText("Hello ");
        element.appendElement("b").text("World");
        element.appendText(" !");
        assertEquals("Hello World !", element.text());
    }

    @Test
    public void testTextWithBlockElement() {
        element.appendText("Hello");
        element.appendElement("div").text("World");
        assertEquals("Hello World", element.text());
    }

    @Test
    public void testTextPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), baseUri);
        pre.appendText("  hello \n world  ");
        assertEquals("  hello \n world  ", pre.text());
    }

    @Test
    public void testHasText() {
        assertFalse(element.hasText());
        element.appendText("Hello");
        assertTrue(element.hasText());
    }

    @Test
    public void testData() {
        element.appendChild(new DataNode("someData", baseUri));
        element.appendElement("span").appendChild(new DataNode("more", baseUri));
        assertEquals("someDatamore", element.data());
    }

    @Test
    public void testClassName() {
        assertEquals("", element.className());
        element.attr("class", "cls1 cls2");
        assertEquals("cls1 cls2", element.className());
    }

    @Test
    public void testClassNames() {
        element.attr("class", "a b c");
        Set<String> names = element.classNames();
        assertEquals(3, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
        assertTrue(names.contains("c"));
    }

    @Test
    public void testClassNamesSet() {
        Set<String> newClasses = new LinkedHashSet<String>();
        newClasses.add("x");
        newClasses.add("y");
        element.classNames(newClasses);
        assertEquals("x y", element.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetNull() {
        element.classNames(null);
    }

    @Test
    public void testHasClass() {
        element.attr("class", "active highlight");
        assertTrue(element.hasClass("active"));
        assertTrue(element.hasClass("highlight"));
        assertFalse(element.hasClass("nonexistent"));
    }

    @Test
    public void testAddClass() {
        element.addClass("newClass");
        assertEquals("newClass", element.className());
        element.addClass("anotherClass");
        assertTrue(element.hasClass("newClass"));
        assertTrue(element.hasClass("anotherClass"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullClass() {
        element.addClass(null);
    }

    @Test
    public void testRemoveClass() {
        element.addClass("one two three");
        element.removeClass("two");
        assertFalse(element.hasClass("two"));
        assertTrue(element.hasClass("one"));
        assertTrue(element.hasClass("three"));
    }

    @Test
    public void testToggleClass() {
        element.addClass("toggle");
        assertTrue(element.hasClass("toggle"));
        element.toggleClass("toggle");
        assertFalse(element.hasClass("toggle"));
        element.toggleClass("toggle");
        assertTrue(element.hasClass("toggle"));
    }

    @Test
    public void testValForInput() {
        element.attr("value", "initial");
        assertEquals("initial", element.val());
    }

    @Test
    public void testValForTextArea() {
        Element textarea = new Element(Tag.valueOf("textarea"), baseUri);
        textarea.text("textareavalue");
        assertEquals("textareavalue", textarea.val());
    }

    @Test
    public void testSetVal() {
        Element input = new Element(Tag.valueOf("input"), baseUri);
        input.val("newValue");
        assertEquals("newValue", input.val());
        assertEquals("newValue", input.attr("value"));
    }

    @Test
    public void testSetValOnTextArea() {
        Element textarea = new Element(Tag.valueOf("textarea"), baseUri);
        textarea.val("textareaValue");
        assertEquals("textareaValue", textarea.text());
    }

    @Test
    public void testOuterHtml() {
        element.text("Hello");
        String html = element.outerHtml();
        assertTrue(html.contains("<div>"));
        assertTrue(html.contains("Hello"));
        assertTrue(html.contains("</div>"));
    }

    @Test
    public void testHtmlWithChildren() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).text("child"));
        String html = element.html();
        assertEquals("<span>child</span>", html);
    }

    @Test
    public void testSetHtml() {
        element.html("<span>content</span>");
        assertEquals(1, element.children().size());
        assertEquals("span", element.child(0).tagName());
    }

    @Test
    public void testToString() {
        element.text("content");
        assertTrue(element.toString().equals(element.outerHtml()));
    }

    @Test
    public void testEquals() {
        Element other = new Element(Tag.valueOf("div"), baseUri);
        assertTrue(element.equals(other));
        assertFalse(element.equals(null));
        assertTrue(element.equals(element));
        
        Element otherTag = new Element(Tag.valueOf("span"), baseUri);
        assertFalse(element.equals(otherTag));
        
        element.attr("data-x", "value");
        assertFalse(element.equals(other));
    }

    @Test
    public void testHashCode() {
        Element other = new Element(Tag.valueOf("div"), baseUri);
        assertEquals(element.hashCode(), other.hashCode());
        
        other.attr("data-x", "value");
        assertFalse(element.hashCode() == other.hashCode());
    }
}