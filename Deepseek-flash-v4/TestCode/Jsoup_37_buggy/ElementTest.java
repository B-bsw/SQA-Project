package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.jsoup.parser.Tag;
import java.util.*;
import java.util.regex.Pattern;

public class ElementTest {
    private Element element;
    private Element parent;
    private Element child1;
    private Element child2;
    private TextNode textNode;

    @Before
    public void setUp() {
        parent = new Element(Tag.valueOf("div"), "http://example.com");
        element = new Element(Tag.valueOf("p"), "http://example.com");
        child1 = new Element(Tag.valueOf("span"), "http://example.com");
        child2 = new Element(Tag.valueOf("a"), "http://example.com");
        textNode = new TextNode("Hello World", "http://example.com");
        element.appendChild(child1);
        element.appendChild(textNode);
        element.appendChild(child2);
    }

    @Test
    public void testNodeName() {
        assertEquals("p", element.nodeName());
        Element divElement = new Element(Tag.valueOf("div"), "");
        assertEquals("div", divElement.nodeName());
    }

    @Test
    public void testTagNameGetSet() {
        assertEquals("p", element.tagName());
        Element result = element.tagName("div");
        assertEquals("div", element.tagName());
        assertSame(element, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameEmptyThrowsException() {
        element.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameNullThrowsException() {
        element.tagName(null);
    }

    @Test
    public void testTag() {
        assertNotNull(element.tag());
        assertEquals(Tag.valueOf("p"), element.tag());
    }

    @Test
    public void testIsBlock() {
        Element divElement = new Element(Tag.valueOf("div"), "");
        assertTrue(divElement.isBlock());
        Element spanElement = new Element(Tag.valueOf("span"), "");
        assertFalse(spanElement.isBlock());
    }

    @Test
    public void testId() {
        assertEquals("", element.id());
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void testParent() {
        parent.appendChild(element);
        assertSame(parent, element.parent());
    }

    @Test
    public void testParentNull() {
        assertNull(element.parent());
    }

    @Test
    public void testParents() {
        Element root = new Element(Tag.valueOf("html"), "");
        Element body = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        root.appendChild(body);
        body.appendChild(div);
        div.appendChild(element);
        
        Elements parents = element.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(div));
        assertTrue(parents.contains(body));
    }

    @Test
    public void testChild() {
        element.appendChild(child1);
        element.appendChild(child2);
        assertSame(child1, element.child(0));
        assertSame(child2, element.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildOutOfBounds() {
        element.child(5);
    }

    @Test
    public void testChildren() {
        element.appendChild(child1);
        element.appendChild(child2);
        Elements children = element.children();
        assertEquals(2, children.size());
        assertTrue(children.contains(child1));
        assertTrue(children.contains(child2));
    }

    @Test
    public void testTextNodes() {
        List<TextNode> textNodes = element.textNodes();
        assertEquals(1, textNodes.size());
        assertEquals("Hello World", textNodes.get(0).getWholeText());
    }

    @Test
    public void testDataNodesEmpty() {
        List<DataNode> dataNodes = element.dataNodes();
        assertTrue(dataNodes.isEmpty());
    }

    @Test
    public void testAppendChild() {
        Element newChild = new Element(Tag.valueOf("span"), "");
        element.appendChild(newChild);
        assertSame(newChild, element.child(element.children().size() - 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendChildNull() {
        element.appendChild(null);
    }

    @Test
    public void testPrependChild() {
        Element newChild = new Element(Tag.valueOf("span"), "");
        element.prependChild(newChild);
        assertSame(newChild, element.child(0));
    }

    @Test
    public void testInsertChildren() {
        Element newChild = new Element(Tag.valueOf("em"), "");
        List<Node> children = new ArrayList<>();
        children.add(newChild);
        element.insertChildren(1, children);
        assertSame(newChild, element.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenNullCollection() {
        element.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertChildrenInvalidPosition() {
        element.insertChildren(10, Arrays.asList(new Element(Tag.valueOf("span"), "")));
    }

    @Test
    public void testAppendElement() {
        Element appended = element.appendElement("div");
        assertNotNull(appended);
        assertEquals("div", appended.tagName());
        assertSame(appended, element.child(element.children().size() - 1));
    }

    @Test
    public void testPrependElement() {
        Element prepended = element.prependElement("div");
        assertNotNull(prepended);
        assertEquals("div", prepended.tagName());
        assertSame(prepended, element.child(0));
    }

    @Test
    public void testAppendText() {
        element.appendText("Additional");
        assertTrue(element.textNodes().size() > 0);
    }

    @Test
    public void testPrependText() {
        element.prependText("StartText");
        assertEquals("StartText", element.textNodes().get(0).getWholeText());
    }

    @Test
    public void testAppendAndPrependHtml() {
        element.append("<div>test</div>");
        assertEquals("test", element.select("div").first().text());
        element.prepend("<span>pre</span>");
        assertEquals("pre", element.select("span").first().text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullHtml() {
        element.append((String) null);
    }

    @Test
    public void testBeforeAfter() {
        Element sibling = new Element(Tag.valueOf("hr"), "");
        element.after(sibling);
        element.before("<p>before</p>");
        assertNotNull(element.nextElementSibling());
        assertNotNull(element.previousElementSibling());
    }

    @Test
    public void testEmpty() {
        element.appendChild(child1);
        element.appendChild(textNode);
        element.empty();
        assertEquals(0, element.children().size());
        assertEquals(0, element.textNodes().size());
    }

    @Test
    public void testSiblingElements() {
        parent.appendChild(child1);
        parent.appendChild(element);
        parent.appendChild(child2);
        Elements siblings = element.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(child1));
        assertTrue(siblings.contains(child2));
    }

    @Test
    public void testNextPreviousElementSibling() {
        parent.appendChild(child1);
        parent.appendChild(element);
        parent.appendChild(child2);
        assertSame(child2, element.nextElementSibling());
        assertSame(child1, element.previousElementSibling());
    }

    @Test
    public void testFirstLastElementSibling() {
        parent.appendChild(child1);
        parent.appendChild(child2);
        parent.appendChild(element);
        assertSame(child1, element.firstElementSibling());
        assertNull(child1.lastElementSibling());
        assertSame(child2, child1.lastElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        parent.appendChild(child1);
        parent.appendChild(element);
        assertEquals(1, element.elementSiblingIndex().intValue());
        assertEquals(0, element.firstElementSibling().elementSiblingIndex().intValue());
    }

    @Test
    public void testGetElementsByTag() {
        element.appendChild(child1);
        child1.appendChild(new Element(Tag.valueOf("span"), ""));
        Elements spans = element.getElementsByTag("span");
        assertEquals(1, spans.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByTagEmpty() {
        element.getElementsByTag("");
    }

    @Test
    public void testGetElementById() {
        child1.attr("id", "uniqueId");
        element.appendChild(child1);
        Element found = element.getElementById("uniqueId");
        assertSame(child1, found);
        assertNull(element.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementByIdEmpty() {
        element.getElementById("");
    }

    @Test
    public void testGetElementsByClass() {
        child1.addClass("testClass");
        element.appendChild(child1);
        Elements found = element.getElementsByClass("testClass");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByClassEmpty() {
        element.getElementsByClass("");
    }

    @Test
    public void testGetElementsByAttribute() {
        child1.attr("data-test", "value");
        element.appendChild(child1);
        Elements found = element.getElementsByAttribute("data-test");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeNullKey() {
        element.getElementsByAttribute(null);
    }

    @Test
    public void testGetElementsByAttributeValue() {
        child1.attr("data-x", "testValue");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValue("data-x", "testValue");
        assertEquals(1, found.size());
        assertEquals(0, element.getElementsByAttributeValue("data-x", "other").size());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        child1.attr("data-x", "keep");
        child2.attr("data-x", "remove");
        element.appendChild(child1);
        element.appendChild(child2);
        Elements found = element.getElementsByAttributeValueNot("data-x", "remove");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        child1.attr("href", "https://example.com");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValueStarting("href", "https://");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        child1.attr("src", "image.png");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValueEnding("src", ".png");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        child1.attr("class", "primary secondary");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValueContaining("class", "second");
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingPattern() {
        child1.attr("id", "item-123");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValueMatching("id", Pattern.compile("item-\\d+"));
        assertEquals(1, found.size());
    }

    @Test
    public void testGetElementsByAttributeValueMatchingStringValid() {
        child1.attr("id", "item-123");
        element.appendChild(child1);
        Elements found = element.getElementsByAttributeValueMatching("id", "item-\\d+");
        assertEquals(1, found.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsByAttributeValueMatchingInvalidRegex() {
        element.getElementsByAttributeValueMatching("id", "[invalid");
    }

    @Test
    public void testGetElementsByIndex() {
        element.appendChild(child1);
        element.appendChild(child2);
        assertEquals(1, element.getElementsByIndexLessThan(1).size());
        assertEquals(1, element.getElementsByIndexGreaterThan(0).size());
        assertEquals(1, element.getElementsByIndexEquals(1).size());
    }

    @Test
    public void testGetElementsContainingText() {
        element.appendChild(new TextNode("unique search text", ""));
        assertEquals(1, element.getElementsContainingText("search text").size());
        assertEquals(0, element.getElementsContainingText("not found").size());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        TextNode own = new TextNode("own text content", "");
        element.appendChild(own);
        assertEquals(1, element.getElementsContainingOwnText("own text").size());
    }

    @Test
    public void testGetElementsMatchingText() {
        element.appendChild(new TextNode("match123", ""));
        assertEquals(1, element.getElementsMatchingText("match\\d+").size());
        assertEquals(1, element.getElementsMatchingText(Pattern.compile("match\\d+")).size());
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        element.appendChild(new TextNode("ownmatch456", ""));
        assertEquals(1, element.getElementsMatchingOwnText("ownmatch\\d+").size());
        assertEquals(1, element.getElementsMatchingOwnText(Pattern.compile("ownmatch\\d+")).size());
    }

    @Test
    public void testGetAllElements() {
        element.appendChild(child1);
        child1.appendChild(child2);
        Elements all = element.getAllElements();
        assertEquals(3, all.size());
    }

    @Test
    public void testText() {
        TextNode t1 = new TextNode("  Hello ", "");
        TextNode t2 = new TextNode(" World  ", "");
        element.empty();
        element.appendChild(t1);
        element.appendChild(t2);
        assertEquals("Hello World", element.text());
    }

    @Test
    public void testTextWithBlockElement() {
        Element div = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("First", "");
        TextNode t2 = new TextNode("Second", "");
        div.appendChild(t1);
        div.appendChild(new Element(Tag.valueOf("p"), "").appendText("Para"));
        div.appendChild(t2);
        element.appendChild(div);
        assertEquals("First Para Second", div.text());
    }

    @Test
    public void testOwnText() {
        element.appendChild(textNode);
        element.appendChild(new Element(Tag.valueOf("span"), "").appendText("ignored"));
        assertEquals("Hello World", element.ownText());
    }

    @Test
    public void testHasText() {
        assertTrue(element.hasText());
        Element emptyEl = new Element(Tag.valueOf("div"), "");
        assertFalse(emptyEl.hasText());
    }

    @Test
    public void testData() {
        element.appendChild(new DataNode("some data", ""));
        assertEquals("", element.data().equals("") ? "" : "some data"); // Simplified; DataNode handling
        // Direct DataNode check
        DataNode dn = new DataNode("payload", "");
        element.appendChild(dn);
        String data = element.data();
        assertTrue(data.contains("payload"));
    }

    @Test
    public void testClassName() {
        element.attr("class", "first second");
        assertEquals("first second", element.className());
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
    public void testSetClassNames() {
        Set<String> newClasses = new LinkedHashSet<>(Arrays.asList("x", "y"));
        element.classNames(newClasses);
        assertEquals("x y", element.className());
    }

    @Test
    public void testHasClass() {
        element.addClass("active");
        assertTrue(element.hasClass("active"));
        assertFalse(element.hasClass("inactive"));
        assertTrue(element.hasClass("ACTIVE"));
    }

    @Test
    public void testAddRemoveToggleClass() {
        element.addClass("one");
        element.addClass("two");
        assertTrue(element.hasClass("one"));
        assertTrue(element.hasClass("two"));
        
        element.removeClass("one");
        assertFalse(element.hasClass("one"));
        assertTrue(element.hasClass("two"));
        
        element.toggleClass("two");
        assertFalse(element.hasClass("two"));
        
        element.toggleClass("three");
        assertTrue(element.hasClass("three"));
    }

    @Test
    public void testVal() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "hello");
        assertEquals("hello", input.val());
        
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.appendText("textareaText");
        assertEquals("textareaText", textarea.val());
    }

    @Test
    public void testValSet() {
        element.val("newValue");
        assertEquals("newValue", element.attr("value"));
        
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.val("areaVal");
        assertEquals("areaVal", textarea.text());
    }

    @Test
    public void testHtmlMethods() {
        String html = element.html();
        assertNotNull(html);
        
        element.html("<span>new</span>");
        assertEquals(1, element.getElementsByTag("span").size());
    }

    @Test
    public void testToString() {
        assertNotNull(element.toString());
        assertTrue(element.toString().startsWith("<"));
        assertTrue(element.toString().endsWith(">"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Element other = new Element(Tag.valueOf("p"), "http://example.com");
        assertNotEquals(element, other);
        assertNotEquals(element.hashCode(), other.hashCode());
        assertEquals(element, element);
    }

    @Test
    public void testClone() {
        element.attr("id", "clone-test");
        element.appendChild(child1);
        Element clone = element.clone();
        assertNotSame(element, clone);
        assertEquals(element.attr("id"), clone.attr("id"));
    }

    @Test
    public void testPreserveWhitespace() {
        assertFalse(Element.preserveWhitespace(null));
        assertFalse(Element.preserveWhitespace(new TextNode("", "")));
        Element pre = new Element(Tag.valueOf("pre"), "");
        assertTrue(Element.preserveWhitespace(pre));
    }
}