package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.util.*;
import java.util.regex.Pattern;

public class ElementTest {
    private Element element;
    private String baseUri = "http://example.com";

    @Before
    public void setUp() {
        element = new Element(Tag.valueOf("div"), baseUri);
    }

    @After
    public void tearDown() {
        element = null;
    }

    @Test
    public void testNodeName() {
        Element div = new Element(Tag.valueOf("div"), baseUri);
        assertEquals("div", div.nodeName());
        
        Element span = new Element(Tag.valueOf("span"), baseUri);
        assertEquals("span", span.nodeName());
    }

    @Test
    public void testTagName() {
        assertEquals("div", element.tagName());
        
        element.tagName("p");
        assertEquals("p", element.tagName());
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
        Element div = new Element(Tag.valueOf("div"), baseUri);
        assertTrue(div.isBlock());
        
        Element span = new Element(Tag.valueOf("span"), baseUri);
        assertFalse(span.isBlock());
    }

    @Test
    public void testId() {
        assertEquals("", element.id());
        
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void testDataset() {
        element.attr("data-name", "value");
        Map<String, String> dataset = element.dataset();
        assertNotNull(dataset);
        assertEquals("value", dataset.get("name"));
    }

    @Test
    public void testParent() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child);
        
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        Element grandparent = new Element(Tag.valueOf("div"), baseUri);
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child = new Element(Tag.valueOf("span"), baseUri);
        
        grandparent.appendChild(parent);
        parent.appendChild(child);
        
        Elements parents = child.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(parent));
        assertTrue(parents.contains(grandparent));
    }

    @Test
    public void testChild() {
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        
        element.appendChild(child1);
        element.appendChild(child2);
        
        assertEquals(child1, element.child(0));
        assertEquals(child2, element.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildIndexOutOfBounds() {
        element.child(0);
    }

    @Test
    public void testChildren() {
        assertTrue(element.children().isEmpty());
        
        Element child = new Element(Tag.valueOf("span"), baseUri);
        element.appendChild(child);
        
        Elements children = element.children();
        assertEquals(1, children.size());
        assertTrue(children.contains(child));
        
        element.appendChild(new TextNode("text", baseUri));
        assertEquals(1, element.children().size());
    }

    @Test
    public void testTextNodes() {
        assertTrue(element.textNodes().isEmpty());
        
        element.appendChild(new TextNode("text1", baseUri));
        element.appendChild(new TextNode("text2", baseUri));
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        
        List<TextNode> textNodes = element.textNodes();
        assertEquals(2, textNodes.size());
        assertEquals("text1", textNodes.get(0).getWholeText());
        assertEquals("text2", textNodes.get(1).getWholeText());
    }

    @Test
    public void testDataNodes() {
        assertTrue(element.dataNodes().isEmpty());
        
        element.appendChild(new DataNode("data", baseUri));
        element.appendChild(new DataNode("data2", baseUri));
        
        List<DataNode> dataNodes = element.dataNodes();
        assertEquals(2, dataNodes.size());
    }

    @Test
    public void testSelect() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri));
        
        Elements selected = element.select("span");
        assertEquals(1, selected.size());
        
        selected = element.select("span, p");
        assertEquals(2, selected.size());
    }

    @Test
    public void testAppendChild() {
        Element child = new Element(Tag.valueOf("span"), baseUri);
        element.appendChild(child);
        
        assertEquals(1, element.childNodes().size());
        assertEquals(child, element.child(0));
        assertEquals(element, child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        element.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        
        element.appendChild(child1);
        element.prependChild(child2);
        
        assertEquals(child2, element.child(0));
        assertEquals(child1, element.child(1));
    }

    @Test
    public void testAppendElement() {
        Element child = element.appendElement("span");
        
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(1, element.childNodes().size());
        assertEquals(element, child.parent());
    }

    @Test
    public void testPrependElement() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        Element prepended = element.prependElement("p");
        
        assertEquals("p", prepended.tagName());
        assertEquals(prepended, element.child(0));
    }

    @Test
    public void testAppendText() {
        element.appendText("some text");
        
        assertEquals(1, element.childNodes().size());
        TextNode textNode = (TextNode) element.child(0);
        assertEquals("some text", textNode.getWholeText());
    }

    @Test
    public void testPrependText() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.prependText("prefix");
        
        TextNode textNode = (TextNode) element.child(0);
        assertEquals("prefix", textNode.getWholeText());
    }

    @Test
    public void testAppend() {
        element.append("<span>content</span>");
        
        assertEquals(1, element.children().size());
        assertEquals("span", element.child(0).nodeName());
    }

    @Test
    public void testPrepend() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.prepend("<p>prepended</p>");
        
        assertEquals(2, element.children().size());
        assertEquals("p", element.child(0).nodeName());
    }

    @Test
    public void testBefore() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element target = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(target);
        
        target.before("<p>before</p>");
        
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.child(0).nodeName());
    }

    @Test
    public void testAfter() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element target = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(target);
        
        target.after("<p>after</p>");
        
        assertEquals(2, parent.children().size());
        assertEquals("p", parent.child(1).nodeName());
    }

    @Test
    public void testEmpty() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.appendChild(new TextNode("text", baseUri));
        
        element.empty();
        
        assertEquals(0, element.childNodes().size());
    }

    @Test
    public void testWrap() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child = new Element(Tag.valueOf("span"), baseUri);
        parent.appendChild(child);
        
        child.wrap("<div class='wrapper'></div>");
        
        assertEquals(1, parent.children().size());
        assertEquals("div", parent.child(0).nodeName());
        assertTrue(parent.child(0).children().contains(child));
    }

    @Test
    public void testSiblingElements() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        Element child3 = new Element(Tag.valueOf("a"), baseUri);
        
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        
        Elements siblings = child2.siblingElements();
        assertEquals(2, siblings.size());
        assertFalse(siblings.contains(child2));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        Element child3 = new Element(Tag.valueOf("a"), baseUri);
        
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        
        assertEquals(child2, child1.nextElementSibling());
        assertEquals(child3, child2.nextElementSibling());
        assertNull(child3.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        Element child3 = new Element(Tag.valueOf("a"), baseUri);
        
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        
        assertNull(child1.previousElementSibling());
        assertEquals(child1, child2.previousElementSibling());
        assertEquals(child2, child3.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        
        assertEquals(child1, child2.firstElementSibling());
        assertEquals(child1, child1.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        
        assertEquals(0, child1.elementSiblingIndex().intValue());
        assertEquals(1, child2.elementSiblingIndex().intValue());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = new Element(Tag.valueOf("div"), baseUri);
        
        Element child1 = new Element(Tag.valueOf("span"), baseUri);
        Element child2 = new Element(Tag.valueOf("p"), baseUri);
        Element child3 = new Element(Tag.valueOf("a"), baseUri);
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(child3);
        
        assertEquals(child3, child1.lastElementSibling());
        assertEquals(child3, child3.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.appendChild(new Element(Tag.valueOf("SPAN"), baseUri));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri));
        
        Elements spans = element.getElementsByTag("span");
        assertEquals(2, spans.size());
        
        Elements ps = element.getElementsByTag("p");
        assertEquals(1, ps.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagNull() {
        element.getElementsByTag(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        element.getElementsByTag("");
    }

    @Test
    public void testGetElementById() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).attr("id", "span1"));
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).attr("id", "span2"));
        
        Element found = element.getElementById("span1");
        assertNotNull(found);
        assertEquals("span1", found.id());
        
        assertNull(element.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdNull() {
        element.getElementById(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmpty() {
        element.getElementById("");
    }

    @Test
    public void testGetElementsByClass() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).addClass("test-class"));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).addClass("test-class"));
        element.appendChild(new Element(Tag.valueOf("a"), baseUri).addClass("other"));
        
        Elements elements = element.getElementsByClass("test-class");
        assertEquals(2, elements.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassNull() {
        element.getElementsByClass(null);
    }

    @Test
    public void testGetElementsByAttribute() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "value");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-other", "value"));
        
        Elements elements = element.getElementsByAttribute("data-test");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeNull() {
        element.getElementsByAttribute(null);
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "value");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-other", "value"));
        element.appendChild(new Element(Tag.valueOf("a"), baseUri).attr("title", "value"));
        
        Elements elements = element.getElementsByAttributeStarting("data-");
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "value1");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "value2"));
        element.appendChild(new Element(Tag.valueOf("a"), baseUri).attr("data-other", "value1"));
        
        Elements elements = element.getElementsByAttributeValue("data-test", "value1");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "value1");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "value2"));
        
        Elements elements = element.getElementsByAttributeValueNot("data-test", "value1");
        assertEquals(1, elements.size());
        assertEquals("p", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "prefix-value");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "suffix-value"));
        
        Elements elements = element.getElementsByAttributeValueStarting("data-test", "prefix-");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "value-suffix");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "value-other"));
        
        Elements elements = element.getElementsByAttributeValueEnding("data-test", "-suffix");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "hello world");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "hello there"));
        element.appendChild(new Element(Tag.valueOf("a"), baseUri).attr("data-test", "bye"));
        
        Elements elements = element.getElementsByAttributeValueContaining("data-test", "hello");
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "123abc");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "abc123"));
        
        Elements elements = element.getElementsByAttributeValueMatching("data-test", Pattern.compile("\\d+"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingString() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.attr("data-test", "123abc");
        element.appendChild(span);
        
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).attr("data-test", "abc"));
        
        Elements elements = element.getElementsByAttributeValueMatching("data-test", "\\d+");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidRegex() {
        element.getElementsByAttributeValueMatching("data-test", "[");
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        createChildElements(5);
        
        Elements elements = element.getElementsByIndexLessThan(2);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        createChildElements(5);
        
        Elements elements = element.getElementsByIndexGreaterThan(2);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        createChildElements(5);
        
        Elements elements = element.getElementsByIndexEquals(2);
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsContainingText() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).appendText("hello world"));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).appendText("goodbye"));
        
        Elements elements = element.getElementsContainingText("hello");
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.appendChild(new TextNode("hello", baseUri));
        element.appendChild(span);
        
        Element p = new Element(Tag.valueOf("p"), baseUri);
        p.appendChild(new TextNode("world", baseUri));
        element.appendChild(p);
        
        Elements elements = element.getElementsContainingOwnText("hello");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsMatchingText() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).appendText("hello 123"));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).appendText("world 456"));
        
        Elements elements = element.getElementsMatchingText(Pattern.compile("\\d+"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsMatchingTextString() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).appendText("hello 123"));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).appendText("world"));
        
        Elements elements = element.getElementsMatchingText("\\d+");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.appendChild(new TextNode("hello 123", baseUri));
        element.appendChild(span);
        
        Elements elements = element.getElementsMatchingOwnText(Pattern.compile("\\d+"));
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetElementsMatchingOwnTextString() {
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.appendChild(new TextNode("hello 123", baseUri));
        element.appendChild(span);
        
        Elements elements = element.getElementsMatchingOwnText("\\d+");
        assertEquals(1, elements.size());
        assertEquals("span", elements.get(0).nodeName());
    }

    @Test
    public void testGetAllElements() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        element.appendChild(new Element(Tag.valueOf("p"), baseUri).appendChild(new Element(Tag.valueOf("a"), baseUri)));
        
        Elements all = element.getAllElements();
        assertEquals(4, all.size());
        assertTrue(all.contains(element));
    }

    @Test
    public void testText() {
        element.appendChild(new TextNode("  hello  ", baseUri));
        element.appendChild(new Element(Tag.valueOf("br"), baseUri));
        element.appendChild(new TextNode("  world  ", baseUri));
        
        assertEquals("hello world", element.text());
    }

    @Test
    public void testTextEmptyElement() {
        Element div = new Element(Tag.valueOf("div"), baseUri);
        assertEquals("", div.text());
    }

    @Test
    public void testOwnText() {
        element.appendChild(new TextNode("hello", baseUri));
        Element span = new Element(Tag.valueOf("span"), baseUri);
        span.appendChild(new TextNode("world", baseUri));
        element.appendChild(span);
        
        assertEquals("hello", element.ownText());
    }

    @Test
    public void testHasText() {
        assertFalse(element.hasText());
        
        element.appendChild(new TextNode("  ", baseUri));
        assertFalse(element.hasText());
        
        element.appendChild(new TextNode("text", baseUri));
        assertTrue(element.hasText());
    }

    @Test
    public void testData() {
        element.appendChild(new DataNode("data1", baseUri));
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).appendChild(new DataNode("data2", baseUri)));
        
        assertEquals("data1data2", element.data());
    }

    @Test
    public void testClassName() {
        assertEquals("", element.className());
        
        element.attr("class", "test-class other-class");
        assertEquals("test-class other-class", element.className());
    }

    @Test
    public void testClassNames() {
        assertTrue(element.classNames().isEmpty());
        
        element.attr("class", "class1 class2 class1");
        Set<String> classNames = element.classNames();
        assertEquals(2, classNames.size());
        assertTrue(classNames.contains("class1"));
        assertTrue(classNames.contains("class2"));
    }

    @Test
    public void testClassNamesSet() {
        Set<String> classes = new LinkedHashSet<String>(Arrays.asList("class1", "class2"));
        element.classNames(classes);
        
        assertEquals("class1 class2", element.attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassNamesSetNull() {
        element.classNames(null);
    }

    @Test
    public void testHasClass() {
        element.attr("class", "Class1 Class2");
        
        assertTrue(element.hasClass("Class1"));
        assertTrue(element.hasClass("class1"));
        assertTrue(element.hasClass("CLASS2"));
        assertFalse(element.hasClass("class3"));
    }

    @Test
    public void testAddClass() {
        element.addClass("class1");
        element.addClass("class2");
        element.addClass("Class1");
        
        assertTrue(element.hasClass("class1"));
        assertTrue(element.hasClass("class2"));
        assertEquals(2, element.classNames().size());
    }

    @Test
    public void testRemoveClass() {
        element.attr("class", "class1 class2 class3");
        
        element.removeClass("class2");
        
        assertTrue(element.hasClass("class1"));
        assertFalse(element.hasClass("class2"));
        assertTrue(element.hasClass("class3"));
    }

    @Test
    public void testToggleClass() {
        element.attr("class", "class1");
        
        element.toggleClass("class1");
        assertFalse(element.hasClass("class1"));
        
        element.toggleClass("class1");
        assertTrue(element.hasClass("class1"));
    }

    @Test
    public void testVal() {
        assertEquals("", element.val());
        
        element.attr("value", "test-value");
        assertEquals("test-value", element.val());
        
        Element textarea = new Element(Tag.valueOf("textarea"), baseUri);
        textarea.text("textarea-value");
        assertEquals("textarea-value", textarea.val());
    }

    @Test
    public void testValSet() {
        element.val("new-value");
        assertEquals("new-value", element.attr("value"));
        
        Element textarea = new Element(Tag.valueOf("textarea"), baseUri);
        textarea.val("textarea-value");
        assertEquals("textarea-value", textarea.text());
    }

    @Test
    public void testHtml() {
        assertEquals("", element.html());
        
        element.append("<span>content</span>");
        assertEquals("<span>content</span>", element.html());
    }

    @Test
    public void testToString() {
        element.attr("id", "test");
        element.attr("class", "test-class");
        
        assertEquals("<div id=\"test\" class=\"test-class\"></div>", element.toString());
    }

    @Test
    public void testEquals() {
        Element other = new Element(Tag.valueOf("div"), baseUri);
        other.attr("id", "test");
        element.attr("id", "test");
        
        assertFalse(element.equals(other));
        assertTrue(element.equals(element));
        assertFalse(element.equals(null));
        assertFalse(element.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Element other = new Element(Tag.valueOf("div"), baseUri);
        other.attr("id", "test");
        element.attr("id", "test");
        
        assertEquals(other.hashCode(), element.hashCode());
    }

    @Test
    public void testClone() {
        element.attr("id", "test");
        element.attr("class", "test-class");
        element.appendChild(new Element(Tag.valueOf("span"), baseUri).appendText("text"));
        
        Element cloned = element.clone();
        
        assertNotSame(element, cloned);
        assertEquals(element.outerHtml(), cloned.outerHtml());
    }

    @Test
    public void testOuterHtmlHead() {
        element.attr("id", "test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        element.outerHtmlHead(accum, 0, out);
        assertTrue(accum.toString().contains("<div"));
        assertTrue(accum.toString().contains("id=\"test\""));
    }

    @Test
    public void testOuterHtmlTail() {
        element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        element.outerHtmlTail(accum, 0, out);
        assertTrue(accum.toString().contains("</div>"));
    }

    @Test
    public void testPreserveWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), baseUri);
        assertTrue(pre.preserveWhitespace());
        
        Element div = new Element(Tag.valueOf("div"), baseUri);
        assertFalse(div.preserveWhitespace());
    }

    @Test
    public void testTextMultipleNestedElements() {
        Element div = new Element(Tag.valueOf("div"), baseUri);
        Element p1 = new Element(Tag.valueOf("p"), baseUri);
        p1.appendChild(new TextNode("First", baseUri));
        Element p2 = new Element(Tag.valueOf("p"), baseUri);
        p2.appendChild(new TextNode("Second", baseUri));
        
        div.appendChild(p1);
        div.appendChild(p2);
        
        assertEquals("First Second", div.text());
    }

    @Test
    public void testElementAppendFragment() {
        element.append("<span>One</span><span>Two</span>");
        
        Elements children = element.children();
        assertEquals(2, children.size());
        assertEquals("One", children.get(0).text());
        assertEquals("Two", children.get(1).text());
    }

    private void createChildElements(int count) {
        for (int i = 0; i < count; i++) {
            element.appendChild(new Element(Tag.valueOf("span"), baseUri));
        }
    }
}