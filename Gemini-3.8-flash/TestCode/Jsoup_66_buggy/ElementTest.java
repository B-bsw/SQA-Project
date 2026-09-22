package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    @Test
    public void constructor_givenStringTag_shouldInitializeCorrectly() {
        Element el = new Element("div");
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("", el.baseUri());
        Assert.assertEquals(0, el.childNodeSize());
        Assert.assertNotNull(el.attributes());
        Assert.assertTrue(el.isBlock());
    }

    @Test
    public void constructor_givenTagAndBaseUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("span");
        Element el = new Element(tag, "http://example.com");
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertFalse(el.hasAttributes());
        Assert.assertNotNull(el.attributes());
        Assert.assertTrue(el.hasAttributes());
        Assert.assertFalse(el.isBlock());
    }

    @Test
    public void constructor_givenFullParameters_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("p");
        Attributes attrs = new Attributes();
        attrs.put("id", "intro");
        Element el = new Element(tag, "http://example.com", attrs);
        Assert.assertEquals("p", el.tagName());
        Assert.assertEquals("intro", el.id());
        Assert.assertTrue(el.hasAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element((Tag) null, "http://example.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        new Element(Tag.valueOf("div"), null);
    }

    @Test
    public void baseUri_givenNewUri_shouldUpdateCorrectly() {
        Element el = new Element("div");
        el.doSetBaseUri("http://foo.com");
        Assert.assertEquals("http://foo.com", el.baseUri());
    }

    @Test
    public void tagName_givenValidName_shouldChangeTagName() {
        Element el = new Element("div");
        el.tagName("SPAN");
        Assert.assertEquals("SPAN", el.tagName());
        Assert.assertEquals("SPAN", el.tag().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyName_shouldThrowException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenNullName_shouldThrowException() {
        Element el = new Element("div");
        el.tagName(null);
    }

    @Test
    public void attr_givenKeyValueAndBoolean_shouldSetProperAttributes() {
        Element el = new Element("div");
        el.attr("title", "hello");
        el.attr("hidden", true);

        Assert.assertEquals("hello", el.attr("title"));
        Assert.assertTrue(el.hasAttr("hidden"));
    }

    @Test
    public void dataset_givenDataAttributes_shouldExtractProperMap() {
        Element el = new Element("div");
        el.attr("data-id", "123");
        el.attr("data-name", "test");
        Map<String, String> data = el.dataset();
        Assert.assertEquals(2, data.size());
        Assert.assertEquals("123", data.get("id"));
        Assert.assertEquals("test", data.get("name"));
    }

    @Test
    public void parentAndParents_givenHierarchy_shouldTraverseCorrectly() {
        Document doc = Jsoup.parse("<html><body><div><p><span>Hello</span></p></div></body></html>");
        Element span = doc.selectFirst("span");
        Assert.assertNotNull(span);
        Assert.assertEquals("p", span.parent().tagName());

        Elements parents = span.parents();
        Assert.assertEquals(4, parents.size());
        Assert.assertEquals("p", parents.get(0).tagName());
        Assert.assertEquals("div", parents.get(1).tagName());
        Assert.assertEquals("body", parents.get(2).tagName());
        Assert.assertEquals("html", parents.get(3).tagName());

        Element orphan = new Element("div");
        Assert.assertEquals(0, orphan.parents().size());
        Assert.assertNull(orphan.parent());
    }

    @Test
    public void childAndChildren_givenMixedNodes_shouldReturnOnlyElementsAndCacheCorrectly() {
        Element div = new Element("div");
        TextNode t1 = new TextNode("text1");
        Element p1 = new Element("p");
        TextNode t2 = new TextNode("text2");
        Element p2 = new Element("p");

        div.appendChild(t1);
        div.appendChild(p1);
        div.appendChild(t2);
        div.appendChild(p2);

        Assert.assertEquals(4, div.childNodeSize());
        Elements children = div.children();
        Assert.assertEquals(2, children.size());
        Assert.assertSame(p1, div.child(0));
        Assert.assertSame(p2, div.child(1));

        // Test shadowChildren cache invalidation on list modification
        Element p3 = new Element("p");
        div.appendChild(p3);
        Assert.assertEquals(3, div.children().size());
        Assert.assertSame(p3, div.child(2));
    }

    @Test
    public void textNodesAndDataNodes_givenNodes_shouldReturnUnmodifiableFilteredLists() {
        Element el = new Element("script");
        el.appendText("Some text");
        DataNode data = new DataNode("var x = 1;");
        el.appendChild(data);

        List<TextNode> textNodes = el.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertEquals("Some text", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = el.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 1;", dataNodes.get(0).getWholeData());

        try {
            textNodes.clear();
            Assert.fail("Expected UnsupportedOperationException on unmodifiable list");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test
    public void appendAndPrependChild_givenElements_shouldMaintainOrder() {
        Element div = new Element("div");
        Element span1 = new Element("span");
        Element span2 = new Element("span");

        div.appendChild(span2);
        div.prependChild(span1);

        Assert.assertEquals(2, div.children().size());
        Assert.assertSame(span1, div.child(0));
        Assert.assertSame(span2, div.child(1));
    }

    @Test
    public void appendTo_givenParent_shouldAttachCorrectly() {
        Element div = new Element("div");
        Element span = new Element("span");
        span.appendTo(div);

        Assert.assertSame(div, span.parent());
        Assert.assertEquals(1, div.children().size());
    }

    @Test
    public void insertChildren_givenPositiveAndNegativeIndices_shouldInsertCorrectly() {
        Element div = new Element("div");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        div.appendChild(c1);
        div.appendChild(c2);

        Element ins1 = new Element("ins1");
        List<Node> list = new ArrayList<Node>();
        list.add(ins1);
        div.insertChildren(1, list);
        Assert.assertEquals(3, div.children().size());
        Assert.assertSame(ins1, div.child(1));

        Element ins2 = new Element("ins2");
        div.insertChildren(-1, ins2);
        Assert.assertEquals(4, div.children().size());
        Assert.assertSame(ins2, div.child(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element div = new Element("div");
        div.insertChildren(5, new Element("p"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullCollection_shouldThrowException() {
        Element div = new Element("div");
        div.insertChildren(0, (List<Node>) null);
    }

    @Test
    public void appendElementAndPrependElement_givenTag_shouldCreateAndInsert() {
        Element div = new Element("div");
        Element p = div.appendElement("p");
        Element h1 = div.prependElement("h1");

        Assert.assertEquals("p", p.tagName());
        Assert.assertEquals("h1", h1.tagName());
        Assert.assertSame(h1, div.child(0));
        Assert.assertSame(p, div.child(1));
    }

    @Test
    public void appendTextAndPrependText_givenText_shouldCreateAndInsertTextNodes() {
        Element div = new Element("div");
        div.appendText("world");
        div.prependText("hello ");

        Assert.assertEquals("hello world", div.text());
    }

    @Test
    public void appendAndPrependHtml_givenHtmlSnippet_shouldParseAndAdd() {
        Element div = new Element("div");
        div.append("<span>two</span>");
        div.prepend("<b>one</b>");

        Assert.assertEquals("<b>one</b><span>two</span>", div.html().replaceAll("\\s+", ""));
    }

    @Test
    public void beforeAndAfterAndWrap_givenNodeAndHtml_shouldMutateHierarchy() {
        Element parent = new Element("div");
        Element target = parent.appendElement("span");

        target.before("<i>beforeHtml</i>");
        target.before(new Element("b"));
        target.after("<em>afterHtml</em>");
        target.after(new Element("u"));

        Assert.assertEquals(5, parent.childNodeSize());

        target.wrap("<div class='wrapper'></div>");
        Assert.assertEquals("wrapper", target.parent().className());
    }

    @Test
    public void empty_givenPopulatedElement_shouldRemoveAllChildren() {
        Element div = new Element("div");
        div.appendElement("p");
        div.appendText("text");
        Assert.assertTrue(div.childNodeSize() > 0);

        div.empty();
        Assert.assertEquals(0, div.childNodeSize());
        Assert.assertEquals(0, div.children().size());
    }

    @Test
    public void cssSelector_givenVariousScenarios_shouldGenerateExpectedSelectors() {
        Element div = new Element("div");
        div.attr("id", "main");
        Assert.assertEquals("#main", div.cssSelector());

        Document doc = Jsoup.parse("<div id='root'><span class='a b'></span><span></span></div>");
        Element span1 = doc.selectFirst("span.a");
        Element span2 = doc.select("span").get(1);

        Assert.assertTrue(span1.cssSelector().contains("span.a.b"));
        Assert.assertTrue(span2.cssSelector().contains(":nth-child(2)"));

        Element colonTag = new Element("xml:tag");
        Assert.assertEquals("xml|tag", colonTag.cssSelector());
    }

    @Test
    public void siblingsNavigation_givenHierarchy_shouldTraverseSiblingsCorrectly() {
        Document doc = Jsoup.parse("<div><p id='1'></p><p id='2'></p><p id='3'></p></div>");
        Element div = doc.selectFirst("div");
        Element p1 = div.child(0);
        Element p2 = div.child(1);
        Element p3 = div.child(2);

        Assert.assertEquals(2, p2.siblingElements().size());
        Assert.assertSame(p1, p2.previousElementSibling());
        Assert.assertSame(p3, p2.nextElementSibling());
        Assert.assertSame(p1, p2.firstElementSibling());
        Assert.assertSame(p3, p2.lastElementSibling());
        Assert.assertEquals(1, p2.elementSiblingIndex());

        Assert.assertNull(p1.previousElementSibling());
        Assert.assertNull(p3.nextElementSibling());

        Element orphan = new Element("p");
        Assert.assertEquals(0, orphan.siblingElements().size());
        Assert.assertNull(orphan.nextElementSibling());
        Assert.assertNull(orphan.previousElementSibling());
        Assert.assertEquals(0, orphan.elementSiblingIndex());
    }

    @Test
    public void getElementsByMethods_givenDocument_shouldFindMatchingNodes() {
        Document doc = Jsoup.parse("<div id='test' class='content main'>"
                + "<p data-rel='foo' class='item'>One</p>"
                + "<p data-rel='bar' class='item sub'>Two</p>"
                + "<span data-info='text-val'>Three</span>"
                + "</div>");

        Assert.assertEquals(1, doc.getElementsByTag("div").size());
        Assert.assertNotNull(doc.getElementById("test"));
        Assert.assertNull(doc.getElementById("non-existent"));
        Assert.assertEquals(2, doc.getElementsByClass("item").size());
        Assert.assertEquals(2, doc.getElementsByAttribute("data-rel").size());
        Assert.assertEquals(2, doc.getElementsByAttributeStarting("data-").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValue("data-rel", "foo").size());
        Assert.assertTrue(doc.getElementsByAttributeValueNot("data-rel", "foo").size() > 0);
        Assert.assertEquals(1, doc.getElementsByAttributeValueStarting("data-info", "text").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueEnding("data-info", "val").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueContaining("data-info", "ext").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueMatching("data-rel", Pattern.compile("^f.*")).size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueMatching("data-rel", "^f.*").size());

        Assert.assertEquals(1, doc.getElementsByIndexLessThan(1).size());
        Assert.assertTrue(doc.getElementsByIndexGreaterThan(0).size() > 0);
        Assert.assertEquals(1, doc.getElementsByIndexEquals(0).size());

        Assert.assertEquals(1, doc.getElementsContainingText("One").size());
        Assert.assertEquals(1, doc.getElementsContainingOwnText("Two").size());
        Assert.assertEquals(1, doc.getElementsMatchingText(Pattern.compile("Three")).size());
        Assert.assertEquals(1, doc.getElementsMatchingText("Three").size());
        Assert.assertEquals(1, doc.getElementsMatchingOwnText(Pattern.compile("Three")).size());
        Assert.assertEquals(1, doc.getElementsMatchingOwnText("Three").size());
        Assert.assertTrue(doc.getAllElements().size() > 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("attr", "[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element el = new Element("div");
        el.getElementsMatchingText("[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element el = new Element("div");
        el.getElementsMatchingOwnText("[invalid");
    }

    @Test
    public void selectAndIs_givenQueryAndEvaluator_shouldMatchCorrectly() {
        Document doc = Jsoup.parse("<div><p class='intro'>First</p><p>Second</p></div>");
        Elements pTags = doc.select("p");
        Assert.assertEquals(2, pTags.size());

        Element firstP = doc.selectFirst("p.intro");
        Assert.assertNotNull(firstP);
        Assert.assertEquals("First", firstP.text());

        Assert.assertTrue(firstP.is("p.intro"));
        Assert.assertFalse(firstP.is("span"));
        Assert.assertTrue(firstP.is(new Evaluator.Class("intro")));
    }

    @Test
    public void textAndOwnText_givenNestedMarkupAndBreaks_shouldFormatWhitespaceCorrectly() {
        Element div = new Element("div");
        div.append("Hello <br> world! <p>Para <span>text</span></p>");

        Assert.assertEquals("Hello world! Para text", div.text());
        Assert.assertEquals("Hello world!", div.ownText());
        Assert.assertTrue(div.hasText());

        Element emptyDiv = new Element("div");
        Assert.assertEquals("", emptyDiv.text());
        Assert.assertEquals("", emptyDiv.ownText());
        Assert.assertFalse(emptyDiv.hasText());

        Element blankTextDiv = new Element("div");
        blankTextDiv.appendText("   ");
        Assert.assertFalse(blankTextDiv.hasText());
    }

    @Test
    public void text_givenPreserveWhitespaceTag_shouldRetainNewlinesAndSpaces() {
        Document doc = Jsoup.parse("<pre>  line 1 \n  line 2 </pre>");
        Element pre = doc.selectFirst("pre");
        Assert.assertEquals("line 1 \n  line 2", pre.text());
    }

    @Test
    public void textSetter_givenString_shouldReplaceAllChildren() {
        Element div = new Element("div");
        div.append("<span>old</span>");
        div.text("new text");

        Assert.assertEquals(1, div.childNodeSize());
        Assert.assertEquals("new text", div.text());
    }

    @Test
    public void data_givenDataNodesCommentsAndElements_shouldExtractDataCorrectly() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var a = 1;"));
        script.appendChild(new Comment("comment data"));
        Element inner = new Element("span");
        inner.appendChild(new DataNode("alert('hi');"));
        script.appendChild(inner);

        Assert.assertEquals("var a = 1;comment dataalert('hi');", script.data());
    }

    @Test
    public void classNamesManagement_givenVariousInputs_shouldHandleSetsAccurately() {
        Element div = new Element("div");
        Assert.assertEquals("", div.className());
        Assert.assertTrue(div.classNames().isEmpty());

        div.attr("class", "  foo   bar  foo  ");
        Assert.assertEquals("foo   bar  foo", div.className());
        Set<String> names = div.classNames();
        Assert.assertEquals(2, names.size());
        Assert.assertTrue(names.contains("foo"));
        Assert.assertTrue(names.contains("bar"));

        Set<String> newNames = new LinkedHashSet<String>();
        newNames.add("alpha");
        newNames.add("beta");
        div.classNames(newNames);
        Assert.assertEquals("alpha beta", div.className());

        div.addClass("gamma");
        Assert.assertTrue(div.hasClass("gamma"));

        div.removeClass("alpha");
        Assert.assertFalse(div.hasClass("alpha"));

        div.toggleClass("beta");
        Assert.assertFalse(div.hasClass("beta"));
        div.toggleClass("beta");
        Assert.assertTrue(div.hasClass("beta"));
    }

    @Test
    public void hasClass_boundaryConditions_shouldBeThoroughlyEvaluated() {
        Element el = new Element("div");
        Assert.assertFalse(el.hasClass("foo"));

        el.attr("class", "foo");
        Assert.assertTrue(el.hasClass("foo"));
        Assert.assertTrue(el.hasClass("FOO"));
        Assert.assertFalse(el.hasClass("fo"));
        Assert.assertFalse(el.hasClass("fooo"));

        el.attr("class", "foo bar baz");
        Assert.assertTrue(el.hasClass("foo"));
        Assert.assertTrue(el.hasClass("bar"));
        Assert.assertTrue(el.hasClass("baz"));
        Assert.assertFalse(el.hasClass("ba"));
        Assert.assertFalse(el.hasClass("qux"));

        el.attr("class", "   foo   ");
        Assert.assertTrue(el.hasClass("foo"));
    }

    @Test
    public void val_givenInputAndTextarea_shouldHandleDifferentBehaviors() {
        Element input = new Element("input");
        input.val("test-val");
        Assert.assertEquals("test-val", input.val());
        Assert.assertEquals("test-val", input.attr("value"));

        Element textarea = new Element("textarea");
        textarea.val("content text");
        Assert.assertEquals("content text", textarea.val());
        Assert.assertEquals("content text", textarea.text());
    }

    @Test
    public void htmlAndOuterHtml_givenHtmlSettings_shouldRenderCorrectly() throws IOException {
        Element div = new Element("div");
        div.attr("id", "container");
        Element p = div.appendElement("p");
        p.text("Paragraph");

        String expectedInner = "<p>Paragraph</p>";
        Assert.assertEquals(expectedInner, div.html());

        StringBuilder sb = new StringBuilder();
        div.html(sb);
        Assert.assertEquals(expectedInner, sb.toString());

        Element img = new Element("img");
        Assert.assertEquals("<img>", img.outerHtml());

        Document.OutputSettings xmlSettings = new Document.OutputSettings();
        xmlSettings.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder xmlSb = new StringBuilder();
        img.outerHtmlHead(xmlSb, 0, xmlSettings);
        Assert.assertEquals("<img />", xmlSb.toString());

        div.html("<span>replaced</span>");
        Assert.assertEquals("<span>replaced</span>", div.html());
    }

    @Test
    public void clone_givenElementWithHierarchy_shouldPerformDeepClone() {
        Element original = new Element("div");
        original.attr("key", "val");
        original.appendElement("span").text("inner");

        Element cloned = original.clone();
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original.outerHtml(), cloned.outerHtml());

        cloned.attr("key", "new-val");
        Assert.assertEquals("val", original.attr("key"));
        Assert.assertEquals("new-val", cloned.attr("key"));

        cloned.child(0).text("modified");
        Assert.assertEquals("inner", original.child(0).text());
        Assert.assertEquals("modified", cloned.child(0).text());
    }

    @Test
    public void preserveWhitespace_givenHierarchy_shouldInheritPreOrCode() {
        Element pre = new Element("pre");
        Element code = pre.appendElement("code");
        TextNode text = new TextNode("   white   space  ");
        code.appendChild(text);

        Assert.assertTrue(Element.preserveWhitespace(code));
        Assert.assertTrue(Element.preserveWhitespace(pre));
        Assert.assertFalse(Element.preserveWhitespace(new Element("div")));
        Assert.assertFalse(Element.preserveWhitespace(null));
    }

    @Test
    public void toString_shouldReturnOuterHtml() {
        Element el = new Element("p");
        el.text("Hello");
        Assert.assertEquals(el.outerHtml(), el.toString());
    }
}