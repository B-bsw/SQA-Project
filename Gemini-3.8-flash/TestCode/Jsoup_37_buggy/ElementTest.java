package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    @Test
    public void constructor_givenTagAndBaseUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("div");
        Element el = new Element(tag, "http://example.com");

        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertSame(tag, el.tag());
        Assert.assertTrue(el.isBlock());
        Assert.assertEquals("", el.id());
    }

    @Test
    public void constructor_givenTagBaseUriAndAttributes_shouldRetainAttributes() {
        Tag tag = Tag.valueOf("a");
        Attributes attrs = new Attributes();
        attrs.put("href", "http://example.com/test");
        attrs.put("id", "link1");
        Element el = new Element(tag, "http://example.com", attrs);

        Assert.assertEquals("http://example.com/test", el.attr("href"));
        Assert.assertEquals("link1", el.id());
        Assert.assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com");
    }

    @Test
    public void tagName_givenValidName_shouldChangeTag() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("span");

        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals("span", el.nodeName());
        Assert.assertFalse(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenNullOrEmpty_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test
    public void id_givenNoIdAttribute_shouldReturnEmptyString() {
        Element el = new Element(Tag.valueOf("p"), "");
        Assert.assertEquals("", el.id());
    }

    @Test
    public void id_givenIdAttribute_shouldReturnIdValue() {
        Element el = new Element(Tag.valueOf("p"), "");
        el.attr("id", "para1");
        Assert.assertEquals("para1", el.id());
    }

    @Test
    public void attr_givenKeyValue_shouldSetAndReturnThis() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("title", "tooltip");

        Assert.assertSame(el, returned);
        Assert.assertEquals("tooltip", el.attr("title"));
    }

    @Test
    public void dataset_givenDataAttributes_shouldReturnDatasetMap() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("data-custom", "value1");
        el.attr("data-other", "value2");
        el.attr("class", "ignored");

        Map<String, String> dataset = el.dataset();
        Assert.assertEquals(2, dataset.size());
        Assert.assertEquals("value1", dataset.get("custom"));
        Assert.assertEquals("value2", dataset.get("other"));
    }

    @Test
    public void parent_givenNoParent_shouldReturnNull() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(el.parent());
    }

    @Test
    public void parent_givenParent_shouldReturnParent() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        Assert.assertSame(parent, child.parent());
    }

    @Test
    public void parents_givenHierarchy_shouldReturnAllParentsExceptRoot() {
        Element root = new Element(Tag.valueOf("#root"), "");
        Element grandparent = new Element(Tag.valueOf("div"), "");
        Element parent = new Element(Tag.valueOf("ul"), "");
        Element child = new Element(Tag.valueOf("li"), "");

        root.appendChild(grandparent);
        grandparent.appendChild(parent);
        parent.appendChild(child);

        Elements parents = child.parents();
        Assert.assertEquals(2, parents.size());
        Assert.assertSame(parent, parents.get(0));
        Assert.assertSame(grandparent, parents.get(1));
    }

    @Test
    public void parents_givenNoParent_shouldReturnEmptyElements() {
        Element el = new Element(Tag.valueOf("div"), "");
        Elements parents = el.parents();
        Assert.assertEquals(0, parents.size());
    }

    @Test
    public void child_givenValidIndex_shouldReturnChildElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");
        parent.appendChild(child1);
        parent.appendChild(new TextNode("some text", ""));
        parent.appendChild(child2);

        Assert.assertSame(child1, parent.child(0));
        Assert.assertSame(child2, parent.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_givenIndexOutOfBounds_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.child(0);
    }

    @Test
    public void children_givenMixedNodes_shouldReturnOnlyElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("p"), "");
        DataNode data = new DataNode("var x = 1;", "");
        TextNode text = new TextNode("hello", "");

        parent.appendChild(text);
        parent.appendChild(child1);
        parent.appendChild(data);

        Elements children = parent.children();
        Assert.assertEquals(1, children.size());
        Assert.assertSame(child1, children.get(0));
    }

    @Test
    public void textNodes_givenChildren_shouldReturnUnmodifiableTextNodes() {
        Element parent = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("one", "");
        TextNode t2 = new TextNode("two", "");
        parent.appendChild(t1);
        parent.appendChild(new Element(Tag.valueOf("b"), ""));
        parent.appendChild(t2);

        List<TextNode> textNodes = parent.textNodes();
        Assert.assertEquals(2, textNodes.size());
        Assert.assertSame(t1, textNodes.get(0));
        Assert.assertSame(t2, textNodes.get(1));

        try {
            textNodes.add(new TextNode("three", ""));
            Assert.fail("List should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void dataNodes_givenChildren_shouldReturnUnmodifiableDataNodes() {
        Element parent = new Element(Tag.valueOf("script"), "");
        DataNode d1 = new DataNode("code1", "");
        DataNode d2 = new DataNode("code2", "");
        parent.appendChild(d1);
        parent.appendChild(new TextNode("text", ""));
        parent.appendChild(d2);

        List<DataNode> dataNodes = parent.dataNodes();
        Assert.assertEquals(2, dataNodes.size());
        Assert.assertSame(d1, dataNodes.get(0));
        Assert.assertSame(d2, dataNodes.get(1));

        try {
            dataNodes.add(new DataNode("code3", ""));
            Assert.fail("List should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void select_givenCssQuery_shouldReturnMatchingElements() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");
        child.attr("class", "highlight");

        Elements result = parent.select("span.highlight");
        Assert.assertEquals(1, result.size());
        Assert.assertSame(child, result.get(0));
    }

    @Test
    public void appendChild_givenValidChild_shouldAppendToEnd() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("b"), "");

        parent.appendChild(child1);
        Element returned = parent.appendChild(child2);

        Assert.assertSame(parent, returned);
        Assert.assertEquals(2, parent.childNodeSize());
        Assert.assertSame(child1, parent.child(0));
        Assert.assertSame(child2, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNull_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendChild(null);
    }

    @Test
    public void prependChild_givenValidChild_shouldInsertAtBeginning() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("b"), "");

        parent.appendChild(child1);
        Element returned = parent.prependChild(child2);

        Assert.assertSame(parent, returned);
        Assert.assertEquals(2, parent.childNodeSize());
        Assert.assertSame(child2, parent.child(0));
        Assert.assertSame(child1, parent.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNull_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.prependChild(null);
    }

    @Test
    public void insertChildren_givenPositiveIndex_shouldInsertAtExpectedPosition() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("d");

        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new Element(Tag.valueOf("b"), ""));
        toInsert.add(new Element(Tag.valueOf("c"), ""));

        Element returned = parent.insertChildren(1, toInsert);
        Assert.assertSame(parent, returned);
        Assert.assertEquals(4, parent.children().size());
        Assert.assertEquals("a", parent.child(0).tagName());
        Assert.assertEquals("b", parent.child(1).tagName());
        Assert.assertEquals("c", parent.child(2).tagName());
        Assert.assertEquals("d", parent.child(3).tagName());
    }

    @Test
    public void insertChildren_givenNegativeIndex_shouldInsertCountingFromEnd() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.appendElement("a");
        parent.appendElement("b");

        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(new Element(Tag.valueOf("c"), ""));

        // currentSize = 2; index = -1 -> index = -1 + 2 + 1 = 2 (appended at end)
        parent.insertChildren(-1, toInsert);
        Assert.assertEquals(3, parent.children().size());
        Assert.assertEquals("c", parent.child(2).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullCollection_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element parent = new Element(Tag.valueOf("div"), "");
        parent.insertChildren(5, new ArrayList<Node>());
    }

    @Test
    public void appendElement_givenTagName_shouldCreateAndAppendElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");

        Assert.assertNotNull(child);
        Assert.assertEquals("p", child.tagName());
        Assert.assertEquals("http://example.com", child.baseUri());
        Assert.assertSame(parent, child.parent());
        Assert.assertEquals(1, parent.children().size());
    }

    @Test
    public void prependElement_givenTagName_shouldCreateAndPrependElement() {
        Element parent = new Element(Tag.valueOf("div"), "http://example.com");
        parent.appendElement("p");
        Element first = parent.prependElement("header");

        Assert.assertEquals("header", first.tagName());
        Assert.assertEquals(2, parent.children().size());
        Assert.assertSame(first, parent.child(0));
    }

    @Test
    public void appendText_and_prependText_givenText_shouldAddTextNodesCorrectly() {
        Element el = new Element(Tag.valueOf("p"), "http://example.com");
        el.appendText("World");
        el.prependText("Hello ");

        Assert.assertEquals("Hello World", el.text());
        Assert.assertEquals(2, el.textNodes().size());
        Assert.assertEquals("Hello ", el.textNodes().get(0).getWholeText());
        Assert.assertEquals("World", el.textNodes().get(1).getWholeText());
    }

    @Test
    public void append_and_prepend_givenHtml_shouldParseAndAddChildren() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Element ret1 = el.append("<p>world</p>");
        Assert.assertSame(el, ret1);

        Element ret2 = el.prepend("<h1>hello</h1>");
        Assert.assertSame(el, ret2);

        Assert.assertEquals(2, el.children().size());
        Assert.assertEquals("h1", el.child(0).tagName());
        Assert.assertEquals("p", el.child(1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullHtml_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_givenNullHtml_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.prepend(null);
    }

    @Test
    public void beforeAndAfter_givenHtmlAndNode_shouldInsertAroundElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");

        Element retBeforeStr = child.before("<b>first</b>");
        Assert.assertSame(child, retBeforeStr);

        Element nodeBefore = new Element(Tag.valueOf("i"), "");
        Element retBeforeNode = child.before(nodeBefore);
        Assert.assertSame(child, retBeforeNode);

        Element retAfterStr = child.after("<code>last</code>");
        Assert.assertSame(child, retAfterStr);

        Element nodeAfter = new Element(Tag.valueOf("em"), "");
        Element retAfterNode = child.after(nodeAfter);
        Assert.assertSame(child, retAfterNode);

        Assert.assertEquals(5, parent.children().size());
        Assert.assertEquals("b", parent.child(0).tagName());
        Assert.assertEquals("i", parent.child(1).tagName());
        Assert.assertEquals("span", parent.child(2).tagName());
        Assert.assertEquals("em", parent.child(3).tagName());
        Assert.assertEquals("code", parent.child(4).tagName());
    }

    @Test
    public void empty_givenPopulatedElement_shouldRemoveAllChildren() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span");
        el.appendText("Text");
        Assert.assertEquals(2, el.childNodeSize());

        Element ret = el.empty();
        Assert.assertSame(el, ret);
        Assert.assertEquals(0, el.childNodeSize());
    }

    @Test
    public void wrap_givenHtml_shouldWrapElement() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = parent.appendElement("span");
        Element wrapped = child.wrap("<div class='wrapper'></div>");

        Assert.assertSame(child, wrapped);
        Assert.assertEquals("wrapper", child.parent().className());
        Assert.assertSame(parent, child.parent().parent());
    }

    @Test
    public void siblingElements_givenNoParent_shouldReturnEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void siblingElements_givenParentAndSiblings_shouldReturnAllOtherSiblings() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element el1 = parent.appendElement("span");
        Element el2 = parent.appendElement("p");
        Element el3 = parent.appendElement("a");

        Elements siblings = el2.siblingElements();
        Assert.assertEquals(2, siblings.size());
        Assert.assertSame(el1, siblings.get(0));
        Assert.assertSame(el3, siblings.get(1));
    }

    @Test
    public void nextElementSibling_givenSiblings_shouldReturnNextOrNull() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(el.nextElementSibling());

        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.appendElement("b");

        Assert.assertSame(child2, child1.nextElementSibling());
        Assert.assertNull(child2.nextElementSibling());
    }

    @Test
    public void previousElementSibling_givenSiblings_shouldReturnPreviousOrNull() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(el.previousElementSibling());

        Element parent = new Element(Tag.valueOf("div"), "");
        Element child1 = parent.appendElement("span");
        Element child2 = parent.appendElement("b");

        Assert.assertNull(child1.previousElementSibling());
        Assert.assertSame(child1, child2.previousElementSibling());
    }

    @Test
    public void firstElementSibling_and_lastElementSibling_shouldReturnEndpoints() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element onlyChild = parent.appendElement("span");

        Assert.assertNull(onlyChild.firstElementSibling());
        Assert.assertNull(onlyChild.lastElementSibling());

        Element secondChild = parent.appendElement("p");
        Element thirdChild = parent.appendElement("b");

        Assert.assertSame(onlyChild, secondChild.firstElementSibling());
        Assert.assertSame(thirdChild, secondChild.lastElementSibling());
    }

    @Test
    public void elementSiblingIndex_shouldReturnIndexAmongElementSiblings() {
        Element lone = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(Integer.valueOf(0), lone.elementSiblingIndex());

        Element parent = new Element(Tag.valueOf("div"), "");
        Element e1 = parent.appendElement("span");
        parent.appendText("text");
        Element e2 = parent.appendElement("b");

        Assert.assertEquals(Integer.valueOf(0), e1.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), e2.elementSiblingIndex());
    }

    @Test
    public void getElementsByTag_givenTag_shouldFindMatchingElements() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p1 = root.appendElement("p");
        Element span = p1.appendElement("span");
        Element p2 = root.appendElement("P");

        Elements ps = root.getElementsByTag("p");
        Assert.assertEquals(2, ps.size());
        Assert.assertSame(p1, ps.get(0));
        Assert.assertSame(p2, ps.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_givenEmpty_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByTag("");
    }

    @Test
    public void getElementById_givenMatchingAndNonMatching_shouldReturnElementOrNull() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child1 = root.appendElement("p");
        child1.attr("id", "target");

        Assert.assertSame(child1, root.getElementById("target"));
        Assert.assertNull(root.getElementById("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_givenEmpty_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementById("");
    }

    @Test
    public void getElementsByClass_givenClassName_shouldReturnMatches() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element c1 = root.appendElement("span");
        c1.attr("class", "my-class other");
        Element c2 = root.appendElement("span");
        c2.attr("class", "other");

        Elements result = root.getElementsByClass("my-class");
        Assert.assertEquals(1, result.size());
        Assert.assertSame(c1, result.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByClass_givenEmpty_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByClass("");
    }

    @Test
    public void getElementsByAttribute_and_Starting_shouldMatchAttributes() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element c1 = root.appendElement("a");
        c1.attr("data-test", "val1");
        c1.attr("custom", "val2");

        Element c2 = root.appendElement("a");
        c2.attr("data-name", "val3");

        Elements byAttr = root.getElementsByAttribute("custom");
        Assert.assertEquals(1, byAttr.size());
        Assert.assertSame(c1, byAttr.get(0));

        Elements byAttrStart = root.getElementsByAttributeStarting("data-");
        Assert.assertEquals(2, byAttrStart.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttribute_givenEmpty_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByAttribute("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeStarting_givenEmpty_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByAttributeStarting("");
    }

    @Test
    public void getElementsByAttributeValue_variants_shouldFilterAccurately() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a1 = root.appendElement("a").attr("href", "http://example.com/index.html");
        Element a2 = root.appendElement("a").attr("href", "https://example.org/about.htm");
        Element a3 = root.appendElement("a").attr("href", "http://test.com/index.html");

        Assert.assertEquals(1, root.getElementsByAttributeValue("href", "https://example.org/about.htm").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueNot("href", "https://example.org/about.htm").size());
        Assert.assertEquals(1, root.getElementsByAttributeValueStarting("href", "https").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueEnding("href", ".html").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueContaining("href", "example").size());
    }

    @Test
    public void getElementsByAttributeValueMatching_patternAndRegex_shouldFilter() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element a1 = root.appendElement("a").attr("rel", "nofollow noopener");
        Element a2 = root.appendElement("a").attr("rel", "bookmark");

        Pattern pattern = Pattern.compile(".*follow.*");
        Assert.assertEquals(1, root.getElementsByAttributeValueMatching("rel", pattern).size());
        Assert.assertEquals(1, root.getElementsByAttributeValueMatching("rel", ".*opener.*").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsByAttributeValueMatching("rel", "[unclosed");
    }

    @Test
    public void getElementsByIndex_variants_shouldFilterByIndex() {
        Element root = new Element(Tag.valueOf("ul"), "");
        Element li1 = root.appendElement("li");
        Element li2 = root.appendElement("li");
        Element li3 = root.appendElement("li");

        Assert.assertEquals(1, root.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(1, root.getElementsByIndexGreaterThan(1).size());
        Assert.assertEquals(1, root.getElementsByIndexEquals(1).size());
        Assert.assertSame(li2, root.getElementsByIndexEquals(1).get(0));
    }

    @Test
    public void getElementsContainingText_and_OwnText_shouldFilter() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p").appendText("Hello Outer");
        Element span = p.appendElement("span").appendText("Inner");

        Assert.assertEquals(2, root.getElementsContainingText("Inner").size());
        Assert.assertEquals(1, root.getElementsContainingOwnText("Inner").size());
        Assert.assertSame(span, root.getElementsContainingOwnText("Inner").get(0));
    }

    @Test
    public void getElementsMatchingText_and_MatchingOwnText_shouldFilter() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element p = root.appendElement("p").appendText("Item 123");
        p.appendElement("span").appendText("456");

        Assert.assertEquals(2, root.getElementsMatchingText("\\d+").size());
        Assert.assertEquals(1, root.getElementsMatchingOwnText("Item \\d+").size());
        Assert.assertEquals(1, root.getElementsMatchingText(Pattern.compile("123")).size());
        Assert.assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile("Item.*")).size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingText("(invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element root = new Element(Tag.valueOf("div"), "");
        root.getElementsMatchingOwnText("(?invalid");
    }

    @Test
    public void getAllElements_shouldCollectEntireTreeIncludingSelf() {
        Element root = new Element(Tag.valueOf("div"), "");
        Element child = root.appendElement("p");
        child.appendElement("span");

        Elements all = root.getAllElements();
        Assert.assertEquals(3, all.size());
        Assert.assertSame(root, all.get(0));
    }

    @Test
    public void text_givenNestedElementsAndBlocks_shouldFormatProperly() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.appendText("Line 1");
        div.appendElement("br");
        div.appendText("Line 2");
        Element p = div.appendElement("p");
        p.appendText("Paragraph text");

        String text = div.text();
        Assert.assertEquals("Line 1 Line 2 Paragraph text", text);
    }

    @Test
    public void text_givenPreserveWhitespace_shouldKeepWhitespace() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        pre.appendText("  hello \n world  ");

        Assert.assertEquals("  hello \n world  ", pre.text());
    }

    @Test
    public void textSetter_givenString_shouldClearChildrenAndAddText() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span");
        Element returned = el.text("new text");

        Assert.assertSame(el, returned);
        Assert.assertEquals("new text", el.text());
        Assert.assertEquals(1, el.childNodeSize());
        Assert.assertTrue(el.childNode(0) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void textSetter_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.text(null);
    }

    @Test
    public void ownText_givenNestedChildren_shouldOnlyReturnOwnText() {
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendText("Hello ");
        p.appendElement("b").appendText("bold");
        p.appendElement("br");
        p.appendText(" world");

        Assert.assertEquals("Hello  world", p.ownText());
        Assert.assertEquals("Hello bold world", p.text());
    }

    @Test
    public void preserveWhitespace_givenHierarchy_shouldCheckSelfAndParent() {
        Element pre = new Element(Tag.valueOf("pre"), "");
        Element code = pre.appendElement("code");
        Element standard = new Element(Tag.valueOf("div"), "");

        Assert.assertTrue(Element.preserveWhitespace(pre));
        Assert.assertTrue(Element.preserveWhitespace(code));
        Assert.assertFalse(Element.preserveWhitespace(standard));
        Assert.assertFalse(Element.preserveWhitespace(null));
        Assert.assertFalse(Element.preserveWhitespace(new TextNode("txt", "")));
    }

    @Test
    public void hasText_givenVariousChildren_shouldReturnTrueOnlyWhenNonBlankTextExists() {
        Element blank = new Element(Tag.valueOf("div"), "");
        Assert.assertFalse(blank.hasText());

        blank.appendText("   \n\t ");
        Assert.assertFalse(blank.hasText());

        Element nestedBlank = new Element(Tag.valueOf("p"), "");
        blank.appendChild(nestedBlank);
        Assert.assertFalse(blank.hasText());

        nestedBlank.appendText("content");
        Assert.assertTrue(blank.hasText());
    }

    @Test
    public void data_givenDataNodesAndChildElements_shouldConcatenateData() {
        Element script = new Element(Tag.valueOf("script"), "");
        script.appendChild(new DataNode("var a = 1;", ""));
        Element inner = script.appendElement("nested");
        inner.appendChild(new DataNode("var b = 2;", ""));

        Assert.assertEquals("var a = 1;var b = 2;", script.data());
    }

    @Test
    public void className_and_classNames_shouldParseAndModifyClassSet() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.attr("class", "one two  three");

        Assert.assertEquals("one two  three", el.className());
        Set<String> classes = el.classNames();
        Assert.assertEquals(3, classes.size());
        Assert.assertTrue(classes.contains("one"));
        Assert.assertTrue(classes.contains("two"));
        Assert.assertTrue(classes.contains("three"));

        Set<String> newClasses = new HashSet<String>();
        newClasses.add("alpha");
        newClasses.add("beta");
        el.classNames(newClasses);

        Assert.assertTrue(el.hasClass("alpha"));
        Assert.assertTrue(el.hasClass("beta"));
        Assert.assertFalse(el.hasClass("one"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void classNames_givenNullSet_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.classNames(null);
    }

    @Test
    public void addClass_removeClass_toggleClass_shouldModifyClassAttribute() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass("highlight");
        Assert.assertTrue(el.hasClass("highlight"));
        Assert.assertTrue(el.hasClass("HIGHLIGHT"));

        el.addClass("selected");
        Assert.assertTrue(el.hasClass("highlight"));
        Assert.assertTrue(el.hasClass("selected"));

        el.removeClass("highlight");
        Assert.assertFalse(el.hasClass("highlight"));
        Assert.assertTrue(el.hasClass("selected"));

        el.toggleClass("active");
        Assert.assertTrue(el.hasClass("active"));

        el.toggleClass("active");
        Assert.assertFalse(el.hasClass("active"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addClass_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.addClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeClass_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.removeClass(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void toggleClass_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.toggleClass(null);
    }

    @Test
    public void val_givenTextarea_shouldGetAndSetText() {
        Element textarea = new Element(Tag.valueOf("textarea"), "");
        textarea.appendText("initial value");

        Assert.assertEquals("initial value", textarea.val());

        Element returned = textarea.val("updated value");
        Assert.assertSame(textarea, returned);
        Assert.assertEquals("updated value", textarea.val());
    }

    @Test
    public void val_givenInputElement_shouldGetAndSetAttribute() {
        Element input = new Element(Tag.valueOf("input"), "");
        input.attr("value", "initial input");

        Assert.assertEquals("initial input", input.val());

        Element returned = input.val("updated input");
        Assert.assertSame(input, returned);
        Assert.assertEquals("updated input", input.attr("value"));
    }

    @Test
    public void html_and_htmlSetter_shouldSerializeAndReplaceContent() {
        Element div = new Element(Tag.valueOf("div"), "");
        div.html("<p>Hello</p><span>World</span>");

        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("p", div.child(0).tagName());
        Assert.assertEquals("span", div.child(1).tagName());

        String innerHtml = div.html();
        Assert.assertTrue(innerHtml.contains("<p>Hello</p>"));
        Assert.assertTrue(innerHtml.contains("<span>World</span>"));
    }

    @Test
    public void toString_and_outerHtml_shouldProduceExpectedHtml() {
        Element img = new Element(Tag.valueOf("img"), "");
        img.attr("src", "test.png");
        Assert.assertEquals("<img src=\"test.png\" />", img.toString());

        Element span = new Element(Tag.valueOf("span"), "");
        span.appendText("text");
        Assert.assertEquals("<span>text</span>", span.toString());
    }

    @Test
    public void equals_and_hashCode_shouldFollowIdentityAndIncludeTag() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        Element el1 = new Element(tag1, "");
        Element el2 = new Element(tag2, "");

        Assert.assertEquals(el1, el1);
        Assert.assertFalse(el1.equals(el2));
        Assert.assertFalse(el1.equals("string"));
        Assert.assertFalse(el1.equals(null));

        int hash1 = el1.hashCode();
        int hash2 = el2.hashCode();
        Assert.assertTrue(hash1 != 0);
        Assert.assertTrue(hash2 != 0);
    }

    @Test
    public void clone_shouldPerformDeepCopyAndResetClassNames() {
        Element original = new Element(Tag.valueOf("div"), "http://example.com");
        original.attr("class", "c1 c2");
        original.appendElement("span").appendText("child text");

        Assert.assertTrue(original.hasClass("c1"));

        Element clone = original.clone();
        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original.tagName(), clone.tagName());
        Assert.assertEquals(original.html(), clone.html());
        Assert.assertTrue(clone.hasClass("c1"));

        clone.addClass("c3");
        Assert.assertFalse(original.hasClass("c3"));
        Assert.assertTrue(clone.hasClass("c3"));
    }
}