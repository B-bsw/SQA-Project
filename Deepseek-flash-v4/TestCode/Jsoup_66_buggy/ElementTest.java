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

    private Element createElement(String tag) {
        return new Element(Tag.valueOf(tag), "", new Attributes());
    }

    @Test
    public void testTagName() {
        Element el = createElement("div");
        assertEquals("div", el.tagName());
        el.tagName("span");
        assertEquals("span", el.tagName());
        assertThrows(IllegalArgumentException.class, () -> el.tagName(""));
    }

    @Test
    public void testIsBlock() {
        assertTrue(createElement("div").isBlock());
        assertFalse(createElement("span").isBlock());
    }

    @Test
    public void testId() {
        Element el = createElement("div");
        assertNull(el.id());
        el.attr("id", "test-id");
        assertEquals("test-id", el.id());
    }

    @Test
    public void testAttrStringString() {
        Element el = createElement("div");
        el.attr("data-key", "value");
        assertEquals("value", el.attr("data-key"));
        assertNull(el.attr("data-nonexistent"));
    }

    @Test
    public void testAttrStringBoolean() {
        Element el = createElement("input");
        el.attr("disabled", true);
        assertEquals("", el.attr("disabled"));
        assertNotNull(el.attr("disabled"));
    }

    @Test
    public void testDataset() {
        Element el = createElement("div");
        el.attr("data-name", "John");
        el.attr("data-age", "30");
        assertEquals(2, el.dataset().size());
        assertEquals("John", el.dataset().get("name"));
        assertEquals("30", el.dataset().get("age"));
    }

    @Test
    public void testParentWithoutParent() {
        Element el = createElement("div");
        assertNull(el.parent());
    }

    @Test
    public void testParentWithParent() {
        Element parent = createElement("div");
        Element child = createElement("span");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

    @Test
    public void testParents() {
        Element root = createElement("html");
        Element body = createElement("body");
        Element div = createElement("div");
        root.appendChild(body);
        body.appendChild(div);
        Elements parents = div.parents();
        assertEquals(2, parents.size());
        assertTrue(parents.contains(body));
        assertTrue(parents.contains(root));
    }

    @Test
    public void testChildAtIndex() {
        Element parent = createElement("div");
        Element child1 = createElement("span");
        Element child2 = createElement("p");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(child1, parent.child(0));
        assertEquals(child2, parent.child(1));
    }

    @Test
    public void testChildren() {
        Element parent = createElement("div");
        parent.appendChild(createElement("span"));
        parent.appendChild(new TextNode("text", ""));
        parent.appendChild(createElement("p"));
        Elements children = parent.children();
        assertEquals(2, children.size());
        assertEquals("span", children.get(0).tagName());
        assertEquals("p", children.get(1).tagName());
    }

    @Test
    public void testTextNodes() {
        Element parent = createElement("div");
        parent.appendChild(new TextNode("hello", ""));
        parent.appendChild(createElement("span"));
        parent.appendChild(new TextNode("world", ""));
        assertEquals(2, parent.textNodes().size());
        assertEquals("hello", parent.textNodes().get(0).getWholeText());
        assertEquals("world", parent.textNodes().get(1).getWholeText());
    }

    @Test
    public void testDataNodes() {
        Element parent = createElement("div");
        parent.appendChild(new DataNode("data1", ""));
        parent.appendChild(createElement("span"));
        parent.appendChild(new DataNode("data2", ""));
        assertEquals(2, parent.dataNodes().size());
        assertEquals("data1", parent.dataNodes().get(0).getWholeData());
        assertEquals("data2", parent.dataNodes().get(1).getWholeData());
    }

    @Test
    public void testSelect() {
        String html = "<div><p class='one'>One</p><p>Two</p></div>";
        Element div = Jsoup.parse(html).selectFirst("div");
        Elements selected = div.select("p");
        assertEquals(2, selected.size());
        assertEquals("One", selected.get(0).text());
        assertEquals("Two", selected.get(1).text());
    }

    @Test
    public void testSelectFirst() {
        String html = "<div><p class='one'>One</p><p>Two</p></div>";
        Element div = Jsoup.parse(html).selectFirst("div");
        Element first = div.selectFirst("p");
        assertNotNull(first);
        assertEquals("One", first.text());
    }

    @Test
    public void testIsCssQuery() {
        String html = "<div class='test' id='main'><p>Hello</p></div>";
        Element div = Jsoup.parse(html).selectFirst("div");
        assertTrue(div.is("#main"));
        assertTrue(div.is(".test"));
        assertFalse(div.is("span"));
    }

    @Test
    public void testAppendChild() {
        Element parent = createElement("div");
        Element child = createElement("span");
        parent.appendChild(child);
        assertEquals(1, parent.childNodeSize());
        assertEquals(parent, child.parent());
    }

    @Test
    public void testAppendTo() {
        Element parent = createElement("div");
        Element child = createElement("span");
        child.appendTo(parent);
        assertEquals(1, parent.childNodeSize());
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependChild() {
        Element parent = createElement("div");
        Element child1 = createElement("span");
        Element child2 = createElement("p");
        parent.appendChild(child1);
        parent.prependChild(child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
    }

    @Test
    public void testInsertChildrenAtIndex() {
        Element parent = createElement("div");
        Element child1 = createElement("span");
        Element child2 = createElement("p");
        parent.appendChild(child1);
        parent.insertChildren(0, child2);
        assertEquals(2, parent.childNodeSize());
        assertEquals(child2, parent.childNode(0));
        assertEquals(child1, parent.childNode(1));
    }

    @Test
    public void testAppendElement() {
        Element parent = createElement("div");
        Element child = parent.appendElement("span");
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(1, parent.childNodeSize());
        assertEquals(parent, child.parent());
    }

    @Test
    public void testPrependElement() {
        Element parent = createElement("div");
        Element existing = parent.appendElement("p");
        Element child = parent.prependElement("span");
        assertNotNull(child);
        assertEquals("span", child.tagName());
        assertEquals(2, parent.childNodeSize());
        assertEquals(child, parent.childNode(0));
    }

    @Test
    public void testAppendText() {
        Element parent = createElement("div");
        parent.appendText("hello");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof TextNode);
        assertEquals("hello", ((TextNode) parent.childNode(0)).getWholeText());
    }

    @Test
    public void testPrependText() {
        Element parent = createElement("div");
        parent.appendText("world");
        parent.prependText("hello ");
        assertEquals("hello world", parent.text());
    }

    @Test
    public void testAppend() {
        Element parent = createElement("div");
        parent.append("<p>Test</p>");
        assertEquals(1, parent.childNodeSize());
        assertTrue(parent.childNode(0) instanceof Element);
        assertEquals("p", ((Element) parent.childNode(0)).tagName());
    }

    @Test
    public void testPrepend() {
        Element parent = createElement("div");
        parent.append("<p>Test</p>");
        parent.prepend("<span>Prepended</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", ((Element) parent.childNode(0)).tagName());
    }

    @Test
    public void testBeforeString() {
        Element parent = createElement("div");
        Element child = parent.appendElement("p");
        child.before("<span>Before</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", ((Element) parent.childNode(0)).tagName());
    }

    @Test
    public void testBeforeNode() {
        Element parent = createElement("div");
        Element child = parent.appendElement("p");
        Element before = createElement("span");
        child.before(before);
        assertEquals(2, parent.childNodeSize());
        assertEquals(before, parent.childNode(0));
    }

    @Test
    public void testAfterString() {
        Element parent = createElement("div");
        Element child = parent.appendElement("p");
        child.after("<span>After</span>");
        assertEquals(2, parent.childNodeSize());
        assertEquals("span", ((Element) parent.childNode(1)).tagName());
    }

    @Test
    public void testAfterNode() {
        Element parent = createElement("div");
        Element child = parent.appendElement("p");
        Element after = createElement("span");
        child.after(after);
        assertEquals(2, parent.childNodeSize());
        assertEquals(after, parent.childNode(1));
    }

    @Test
    public void testEmpty() {
        Element parent = createElement("div");
        parent.appendElement("span");
        parent.appendText("text");
        parent.empty();
        assertEquals(0, parent.childNodeSize());
        assertEquals("", parent.text());
    }

    @Test
    public void testWrap() {
        Element parent = createElement("div");
        Element child = parent.appendElement("span");
        child.wrap("<div class='wrapper'></div>");
        assertEquals(1, parent.childNodeSize());
        Element wrapper = (Element) parent.childNode(0);
        assertEquals("div", wrapper.tagName());
        assertEquals(1, wrapper.childNodeSize());
        assertEquals(child, wrapper.childNode(0));
    }

    @Test
    public void testCssSelectorWithId() {
        Element el = createElement("div");
        el.attr("id", "unique");
        assertEquals("#unique", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithClass() {
        Element el = createElement("div");
        el.addClass("test-class");
        assertEquals("div.test-class", el.cssSelector());
    }

    @Test
    public void testCssSelectorWithoutParent() {
        Element el = createElement("div");
        assertEquals("div", el.cssSelector());
    }

    @Test
    public void testSiblingElements() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        Element sib3 = parent.appendElement("a");
        Elements siblings = sib2.siblingElements();
        assertEquals(2, siblings.size());
        assertTrue(siblings.contains(sib1));
        assertTrue(siblings.contains(sib3));
    }

    @Test
    public void testNextElementSibling() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        assertEquals(sib2, sib1.nextElementSibling());
        assertNull(sib2.nextElementSibling());
    }

    @Test
    public void testPreviousElementSibling() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        assertEquals(sib1, sib2.previousElementSibling());
        assertNull(sib1.previousElementSibling());
    }

    @Test
    public void testFirstElementSibling() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        assertEquals(sib1, sib2.firstElementSibling());
        assertEquals(sib1, sib1.firstElementSibling());
    }

    @Test
    public void testElementSiblingIndex() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        assertEquals(0, sib1.elementSiblingIndex());
        assertEquals(1, sib2.elementSiblingIndex());
    }

    @Test
    public void testLastElementSibling() {
        Element parent = createElement("div");
        Element sib1 = parent.appendElement("span");
        Element sib2 = parent.appendElement("p");
        assertEquals(sib2, sib1.lastElementSibling());
        assertEquals(sib2, sib2.lastElementSibling());
    }

    @Test
    public void testGetElementsByTag() {
        Element div = Jsoup.parse("<div><p>One</p><p>Two</p><span>Three</span></div>").selectFirst("div");
        Elements paragraphs = div.getElementsByTag("p");
        assertEquals(2, paragraphs.size());
        assertEquals("One", paragraphs.get(0).text());
        assertEquals("Two", paragraphs.get(1).text());
    }

    @Test
    public void testGetElementById() {
        Element div = Jsoup.parse("<div><p id='unique'>One</p><p>Two</p></div>").selectFirst("div");
        Element found = div.getElementById("unique");
        assertNotNull(found);
        assertEquals("One", found.text());
        assertNull(div.getElementById("nonexistent"));
    }

    @Test
    public void testGetElementsByClass() {
        Element div = Jsoup.parse("<div><p class='test'>One</p><p>Two</p><span class='test'>Three</span></div>").selectFirst("div");
        Elements elements = div.getElementsByClass("test");
        assertEquals(2, elements.size());
        assertEquals("One", elements.get(0).text());
        assertEquals("Three", elements.get(1).text());
    }

    @Test
    public void testGetElementsByAttribute() {
        Element div = Jsoup.parse("<div><p data-key='value'>One</p><p>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttribute("data-key");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element div = Jsoup.parse("<div><p data-test='v1'>One</p><p>Two</p><span data-other='v2'>Three</span></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeStarting("data-");
        assertEquals(2, elements.size());
        assertEquals("One", elements.get(0).text());
        assertEquals("Three", elements.get(1).text());
    }

    @Test
    public void testGetElementsByAttributeValue() {
        Element div = Jsoup.parse("<div><p data-key='value'>One</p><p>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValue("data-key", "value");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeValueNot() {
        Element div = Jsoup.parse("<div><p data-key='value'>One</p><p data-key='other'>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValueNot("data-key", "value");
        assertEquals(1, elements.size());
        assertEquals("Two", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeValueStarting() {
        Element div = Jsoup.parse("<div><p data-key='prefix-value'>One</p><p data-key='other'>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValueStarting("data-key", "prefix");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeValueEnding() {
        Element div = Jsoup.parse("<div><p data-key='value-suffix'>One</p><p data-key='other'>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValueEnding("data-key", "suffix");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeValueContaining() {
        Element div = Jsoup.parse("<div><p data-key='hello-world'>One</p><p data-key='other'>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValueContaining("data-key", "lo-wor");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByAttributeValueMatching() {
        Element div = Jsoup.parse("<div><p data-key='hello123'>One</p><p data-key='other'>Two</p></div>").selectFirst("div");
        Elements elements = div.getElementsByAttributeValueMatching("data-key", "\\d+");
        assertEquals(1, elements.size());
        assertEquals("One", elements.get(0).text());
    }

    @Test
    public void testGetElementsByIndexLessThan() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("p");
        parent.appendElement("p");
        Elements elements = parent.getElementsByIndexLessThan(2);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexGreaterThan() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("p");
        parent.appendElement("p");
        Elements elements = parent.getElementsByIndexGreaterThan(1);
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsByIndexEquals() {
        Element parent = createElement("div");
        parent.appendElement("p");
        parent.appendElement("p");
        parent.appendElement("p");
        Elements elements = parent.getElementsByIndexEquals(1);
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetElementsContainingText() {
        Element div = Jsoup.parse("<div><p>Hello World</p><p>Goodbye World</p></div>").selectFirst("div");
        Elements elements = div.getElementsContainingText("Hello");
        assertEquals(1, elements.size());
        assertEquals("Hello World", elements.get(0).text());
    }

    @Test
    public void testGetElementsContainingOwnText() {
        Element div = Jsoup.parse("<div><p>Hello <span>World</span></p><p>Goodbye</p></div>").selectFirst("div");
        Elements elements = div.getElementsContainingOwnText("Hello");
        assertEquals(1, elements.size());
        assertEquals("Hello World", elements.get(0).text());
    }

    @Test
    public void testGetElementsMatchingText() {
        Element div = Jsoup.parse("<div><p>Hello123</p><p>Hello456</p></div>").selectFirst("div");
        Elements elements = div.getElementsMatchingText(Pattern.compile("\\d+"));
        assertEquals(2, elements.size());
    }

    @Test
    public void testGetElementsMatchingOwnText() {
        Element div = Jsoup.parse("<div><p>Hello <span>123</span></p><p>World</p></div>").selectFirst("div");
        Elements elements = div.getElementsMatchingOwnText(Pattern.compile("Hello"));
        assertEquals(1, elements.size());
    }

    @Test
    public void testGetAllElements() {
        Element div = Jsoup.parse("<div><p><span>One</span></p><p>Two</p></div>").selectFirst("div");
        Elements all = div.getAllElements();
        assertEquals(3, all.size());
    }

    @Test
    public void testText() {
        Element div = Jsoup.parse("<div>Hello <span>World</span> <p>Test</p></div>").selectFirst("div");
        assertEquals("Hello World Test", div.text());
    }

    @Test
    public void testOwnText() {
        Element div = Jsoup.parse("<div>Hello <span>World</span></div>").selectFirst("div");
        assertEquals("Hello", div.ownText());
    }

    @Test
    public void testTextSetContent() {
        Element div = createElement("div");
        div.appendElement("span");
        div.text("Hello");
        assertEquals(1, div.childNodeSize());
        assertEquals("Hello", div.text());
    }

    @Test
    public void testHasText() {
        Element div = createElement("div");
        assertFalse(div.hasText());
        div.appendText("Hello");
        assertTrue(div.hasText());
    }

    @Test
    public void testData() {
        Element div = createElement("div");
        div.appendChild(new DataNode("data-content", ""));
        assertEquals("data-content", div.data());
    }

    @Test
    public void testClassName() {
        Element el = createElement("div");
        el.addClass("test1");
        el.addClass("test2");
        assertEquals("test1 test2", el.className());
    }

    @Test
    public void testClassNames() {
        Element el = createElement("div");
        el.addClass("test1");
        el.addClass("test2");
        Set<String> classes = el.classNames();
        assertEquals(2, classes.size());
        assertTrue(classes.contains("test1"));
        assertTrue(classes.contains("test2"));
    }

    @Test
    public void testHasClass() {
        Element el = createElement("div");
        el.addClass("test1");
        assertTrue(el.hasClass("test1"));
        assertFalse(el.hasClass("test2"));
    }

    @Test
    public void testAddClass() {
        Element el = createElement("div");
        el.addClass("test");
        assertTrue(el.hasClass("test"));
    }

    @Test
    public void testRemoveClass() {
        Element el = createElement("div");
        el.addClass("test");
        el.removeClass("test");
        assertFalse(el.hasClass("test"));
    }

    @Test
    public void testToggleClass() {
        Element el = createElement("div");
        el.toggleClass("test");
        assertTrue(el.hasClass("test"));
        el.toggleClass("test");
        assertFalse(el.hasClass("test"));
    }

    @Test
    public void testValForTextArea() {
        Element textarea = createElement("textarea");
        textarea.text("value");
        assertEquals("value", textarea.val());
    }

    @Test
    public void testValForInput() {
        Element input = createElement("input");
        input.attr("value", "test-value");
        assertEquals("test-value", input.val());
    }

    @Test
    public void testValSet() {
        Element input = createElement("input");
        input.val("new-value");
        assertEquals("new-value", input.attr("value"));
    }

    @Test
    public void testHtml() {
        Element div = createElement("div");
        div.appendElement("p").text("Hello");
        assertEquals("<div><p>Hello</p></div>", div.html());
    }

    @Test
    public void testHtmlSet() {
        Element div = createElement("div");
        div.html("<p>New</p>");
        assertEquals(1, div.childNodeSize());
        assertEquals("p", ((Element) div.childNode(0)).tagName());
    }

    @Test
    public void testToString() {
        Element div = createElement("div");
        div.appendElement("p").text("Hello");
        assertEquals("<div><p>Hello</p></div>", div.toString());
    }

    @Test
    public void testClone() {
        Element div = createElement("div");
        div.appendElement("p").text("Hello");
        Element clone = div.clone();
        assertNotSame(div, clone);
        assertEquals(div.html(), clone.html());
    }

    @Test
    public void testChildNodeSize() {
        Element div = createElement("div");
        assertEquals(0, div.childNodeSize());
        div.appendElement("p");
        assertEquals(1, div.childNodeSize());
    }

    @Test
    public void testNodeName() {
        Element div = createElement("div");
        assertEquals("div", div.nodeName());
    }
}