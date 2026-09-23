package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ElementTest {
    private Element element;
    private Document document;

    @Before
    public void setUp() {
        document = new Document("http://example.com");
        element = new Element("div");
    }

    @Test
    public void testConstructorValidInputs() {
        Element el = new Element("p");
        assertNotNull(el);
        assertEquals("p", el.tagName());
        assertEquals("", el.baseUri());
        assertNotNull(el.attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTag() {
        new Element((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullTagObject() {
        new Element((Tag) null, "http://example.com", new Attributes());
    }

    @Test
    public void testTagName() {
        String originalName = element.tagName().toString();
        Element result = element.tagName("newTag");
        assertEquals("Tag name should not be changed to lower case since preserveCase is set", "newTag", element.tagName());
        assertSame(element, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyString() {
        element.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameNull() {
        element.tagName(null);
    }

    @Test
    public void testId() {
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void testIdWithCaseInsensitive() {
        element.attr("ID", "uppercaseId");
        assertEquals("uppercaseId", element.id());
    }

    @Test
    public void testIdWithNoAttributes() {
        assertNull(element.id());
    }

    @Test
    public void testParent() {
        assertNull(element.parent());
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParentOfNestedElement() {
        Element root = new Element("html");
        Element body = new Element("body");
        Element div = new Element("div");
        root.appendChild(body);
        body.appendChild(div);
        assertEquals(body, div.parent());
    }

    @Test
    public void testParentsWithNullParent() {
        Elements parents = element.parents();
        assertNotNull(parents);
        assertTrue(parents.isEmpty());
    }

    @Test
    public void testChildWithValidIndex() {
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        element.appendChild(child1);
        element.appendChild(child2);
        assertEquals(child1, element.child(0));
        assertEquals(child2, element.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildWithNegativeIndex() {
        element.child(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildWithOutOfBoundsIndex() {
        Element child = new Element("p");
        element.appendChild(child);
        element.child(1);
    }

    @Test
    public void testChildrenWithMixedContent() {
        Element child1 = new Element("p");
        TextNode textNode = new TextNode("text", "");
        Element child2 = new Element("span");
        element.appendChild(child1);
        element.appendChild(textNode);
        element.appendChild(child2);

        Elements children = element.children();
        assertEquals(2, children.size());
        assertEquals(child1, children.get(0));
        assertEquals(child2, children.get(1));
    }

    @Test
    public void testChildrenWithNoChildren() {
        Elements children = element.children();
        assertNotNull(children);
        assertTrue(children.isEmpty());
    }

    @Test
    public void testTextNodesEmpty() {
        element.appendChild(new Element("p"));
        assertTrue(element.textNodes().isEmpty());
    }

    @Test
    public void testDataNodesEmpty() {
        element.appendChild(new Element("p"));
        assertTrue(element.dataNodes().isEmpty());
    }

    @Test
    public void testSelectWithInvalidSelector() {
        try {
            element.select("invalid[selector]");
            fail("Expected Selector.SelectorParseException");
        } catch (Exception e) {
            assertTrue(e instanceof org.jsoup.select.Selector.SelectorParseException);
        }
    }

    @Test
    public void testAppendChildWithNull() {
        try {
            element.appendChild(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("must not be null"));
        }
    }

    @Test
    public void testPrependChildWithNode() {
        Element firstChild = new Element("p");
        Element secondChild = new Element("span");
        element.appendChild(secondChild);
        element.prependChild(firstChild);
        assertEquals(firstChild, element.child(0));
        assertEquals(secondChild, element.child(1));
    }

    @Test
    public void testInsertChildrenValid() {
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        element.appendChild(child1);
        element.appendChild(child2);
        Element newChild = new Element("div");
        assertEquals(element, element.insertChildren(1, Arrays.asList(newChild)));
        assertEquals(newChild, element.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollection() {
        element.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenOutOfBounds() {
        Element child = new Element("p");
        element.appendChild(child);
        Element newChild = new Element("div");
        element.insertChildren(5, Arrays.asList(newChild));
    }

    @Test
    public void testAppendElement() {
        Element result = element.appendElement("span");
        assertNotNull(result);
        assertEquals("span", result.tagName());
        assertEquals(element, result.parent());
    }

    @Test
    public void testPrependElement() {
        Element firstChild = new Element("p");
        element.appendChild(firstChild);
        Element result = element.prependElement("span");
        assertEquals(element, result.parent());
        assertEquals(firstChild, element.child(1));
    }

    @Test
    public void testAppendText() {
        element.appendText("Hello");
        assertEquals("Hello", element.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendTextNull() {
        element.appendText(null);
    }

    @Test
    public void testPrependText() {
        element.appendText("World");
        element.prependText("Hello ");
        assertEquals("Hello World", element.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        element.append((String) null);
    }

    @Test
    public void testBeforeAndAfterMethods() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);

        parent.children().get(1).before("<b>before</b>");
        parent.children().get(1).after("<i>after</i>");

        assertEquals("before", parent.children().get(0).tagName());
        assertEquals("b", parent.children().get(1).tagName());
        assertEquals("after", parent.children().get(2).tagName());
        assertEquals("i", parent.children().get(3).tagName());
    }

    @Test
    public void testEmptyClearsChildren() {
        element.appendChild(new Element("p"));
        element.appendChild(new Element("span"));
        assertFalse(element.children().isEmpty());
        element.empty();
        assertTrue(element.children().isEmpty());
    }

    @Test
    public void testWrap() {
        element.wrap("<div></div>");
        assertEquals("div", element.parent().tagName());
    }

    @Test
    public void testCssSelectorWithId() {
        element.tagName("div");
        element.attr("id", "test");
        assertEquals("#test", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithoutIdNoParent() {
        element.tagName("div");
        element.addClass("myclass");
        assertEquals("div.myclass", element.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        Elements siblings = child1.siblingElements();
        assertEquals(1, siblings.size());
        assertEquals(child2, siblings.get(0));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child2, child1.nextElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, child1.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        Element child3 = new Element("div");
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        assertEquals(2, child3.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child2, child1.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element div = new Element("div");
        Element span = new Element("span");
        element.appendChild(div);
        element.appendChild(span);
        Elements result = element.getElementsByTag("span");
        assertEquals(1, result.size());
        assertEquals(span, result.get(0));
    }

    @Test
    public void testGetElementById() {
        Element child = new Element("p");
        child.attr("id", "unique");
        element.appendChild(child);
        assertEquals(child, element.getElementById("unique"));
        assertNull(element.getElementById("notfound"));
    }

    @Test
    public void testGetElementsByClass() {
        Element child1 = new Element("p");
        child1.addClass("foo");
        Element child2 = new Element("p");
        child2.addClass("bar");
        element.appendChild(child1);
        element.appendChild(child2);
        Elements result = element.getElementsByClass("foo");
        assertEquals(1, result.size());
        assertEquals(child1, result.get(0));
    }

    @Test
    public void testGetElementsByAttribute() {
        element.attr("data-key", "value");
        Elements result = element.getElementsByAttribute("data-key");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        element.attr("data-key1", "value1");
        element.attr("data-key2", "value2");
        Elements result = element.getElementsByAttributeStarting("data-");
        assertEquals(2, result.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        element.attr("data-key", "exact");
        Elements result = element.getElementsByAttributeValue("data-key", "exact");
        assertEquals(1, result.size());
        assertTrue(result.getElementsByAttributeValue("data-key", "different").isEmpty());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        element.attr("data-key", "exact");
        Elements result = element.getElementsByAttributeValueNot("data-key", "different");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueStartingWithPrefix() {
        element.attr("data-key", "prefix-value");
        Elements result = element.getElementsByAttributeValueStarting("data-key", "pre");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        element.attr("data-key", "value-suffix");
        Elements result = element.getElementsByAttributeValueEnding("data-key", "suffix");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        element.attr("data-key", "hello-world");
        Elements result = element.getElementsByAttributeValueContaining("data-key", "lo-wo");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        element.attr("data-key", "12345");
        Elements result = element.getElementsByAttributeValueMatching("data-key", "\\d+");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = new Element("div");
        for (int i = 0; i < 5; i++) {
            parent.appendChild(new Element("p"));
        }
        Elements result = parent.getElementsByIndexLessThan(2);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = new Element("div");
        for (int i = 0; i < 5; i++) {
            parent.appendChild(new Element("p"));
        }
        Elements result = parent.getElementsByIndexGreaterThan(3);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = new Element("div");
        for (int i = 0; i < 5; i++) {
            parent.appendChild(new Element("p"));
        }
        Elements result = parent.getElementsByIndexEquals(2);
        assertEquals(1, result.size());
    }

    @Test
    public void testGetAllElements() {
        Element root = new Element("div");
        Element child = new Element("p");
        root.appendChild(child);
        Elements all = root.getAllElements();
        assertEquals(2, all.size());
    }

    @Test
    public void testText() {
        element.appendText("Hello ");
        Element span = new Element("span");
        span.appendText("World");
        element.appendChild(span);
        assertEquals("Hello World", element.text());
    }

    @Test
    public void testTextWithWhitespace() {
        element.appendText("  ");
        assertEquals("", element.text());
    }

    @Test
    public void testHasText() {
        element.appendText("Some text");
        assertTrue(element.hasText());
    }

    @Test
    public void testHasNoText() {
        assertFalse(element.hasText());
    }

    @Test
    public void testClassName() {
        element.attr("class", "foo  bar ");
        assertEquals("foo  bar", element.className());
    }

    @Test
    public void testClassNames() {
        element.attr("class", "foo bar baz");
        Set<String> classes = element.classNames();
        assertEquals(3, classes.size());
        assertTrue(classes.contains("foo"));
        assertTrue(classes.contains("bar"));
        assertTrue(classes.contains("baz"));
    }

    @Test
    public void testClassNamesEmpty() {
        assertTrue(element.classNames().isEmpty());
    }

    @Test
    public void testClassNamesWithSet() {
        Set<String> classes = new HashSet<>(Arrays.asList("foo", "bar"));
        element.classNames(classes);
        assertEquals("foo bar", element.attr("class"));
    }

    @Test
    public void testHasClass() {
        element.attr("class", "foo bar");
        assertTrue(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
        assertFalse(element.hasClass("baz"));
    }

    @Test
    public void testHasClassWithMultipleSpaces() {
        element.attr("class", "foo   bar");
        assertTrue(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
    }

    @Test
    public void testHasClassIgnoreCase() {
        element.attr("class", "MiXeDcAsE");
        assertTrue(element.hasClass("mixedcase"));
    }

    @Test
    public void testHasClassNullAndEmpty() {
        assertFalse(element.hasClass(null));
        assertFalse(element.hasClass(""));
    }

    @Test
    public void testAddClass() {
        element.addClass("foo");
        element.addClass("bar");
        assertTrue(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
        assertEquals("foo bar", element.attr("class"));
    }

    @Test
    public void testRemoveClass() {
        element.addClass("foo");
        element.addClass("bar");
        element.removeClass("foo");
        assertFalse(element.hasClass("foo"));
        assertTrue(element.hasClass("bar"));
        assertEquals("bar", element.attr("class"));
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
        element.attr("value", "test");
        assertEquals("test", element.val());
        element.val("newVal");
        assertEquals("newVal", element.val());
    }

    @Test
    public void testValOnTextArea() {
        Element textArea = new Element("textarea");
        textArea.text("Hello");
        assertEquals("Hello", textArea.val());
    }

    @Test
    public void testHtml() {
        Element child = new Element("p");
        child.appendText("Hello");
        element.appendChild(child);
        String html = element.html();
        assertTrue(html.contains("<p>Hello</p>"));
    }

    @Test
    public void testHtmlWithStringSetter() {
        element.html("<b>Bold</b>");
        assertEquals("Bold", element.text());
        assertEquals(1, element.children().size());
        assertEquals("b", element.child(0).tagName());
    }

    @Test
    public void testHtmlAppendable() {
        StringBuffer sb = new StringBuffer();
        element.html("Hello");
        element.html(sb);
        assertTrue(sb.toString().contains("Hello"));
    }

    @Test
    public void testToString() {
        element.attr("id", "testId");
        String str = element.toString();
        assertTrue(str.contains("<div"));
        assertTrue(str.contains("id=\"testId\""));
        assertTrue(str.contains("</div>"));
    }

    @Test
    public void testClone() {
        element.attr("id", "original");
        Element clone = element.clone();
        assertNotSame(element, clone);
        assertEquals(element.html(), clone.html());
        clone.attr("id", "modified");
        assertEquals("original", element.attr("id"));
        assertEquals("modified", clone.attr("id"));
    }

    @Test
    public void testData() {
        element.appendChild(new DataNode("data1", ""));
        element.appendChild(new DataNode("data2", ""));
        assertEquals("data1data2", element.data());
    }

    @Test
    public void testDataWithCommentsAndElements() {
        element.appendChild(new Comment("comment", ""));
        element.appendChild(new Element("p"));
        element.appendChild(new DataNode("data3", ""));
        assertEquals("data3", element.data());
    }

    @Test
    public void testGetElementsContainingText() {
        Element p1 = new Element("p");
        p1.appendText("Hello World");
        Element p2 = new Element("p");
        p2.appendText("Hello Universe");
        element.appendChild(p1);
        element.appendChild(p2);
        Elements result = element.getElementsContainingText("World");
        assertEquals(1, result.size());
        assertEquals(p1, result.get(0));
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element p1 = new Element("p");
        p1.appendText("Hello World");
        p1.appendChild(new Element("span").appendText("nested"));
        element.appendChild(p1);
        Elements result = element.getElementsContainingOwnText("World");
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsMatchingTextPattern() {
        Element p = new Element("p");
        p.appendText("Hello 123 World");
        element.appendChild(p);
        Elements result = element.getElementsMatchingText(Pattern.compile("\\d+"));
        assertEquals(1, result.size());
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element p = new Element("p");
        p.appendText("Hello");
        element.appendChild(p);
        Elements result = element.getElementsMatchingOwnText("Hello");
        assertEquals(1, result.size());
    }

    private static class Comment extends Node {
        public Comment(String data, String baseUri) {
            super(baseUri, new Attributes());
            attributes.put("data", data);
        }

        @Override
        public String nodeName() {
            return "#comment";
        }

        @Override
        void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
            accum.append("<!--" + attributes.get("data") + "-->");
        }

        @Override
        void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }
    }

    private static class DataNode extends Node {
        public DataNode(String data, String baseUri) {
            super(baseUri, new Attributes());
            attributes.put("data", data);
        }

        @Override
        public String nodeName() {
            return "#data";
        }

        @Override
        void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
            accum.append(attributes.get("data"));
        }

        @Override
        void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        }
    }
}