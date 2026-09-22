package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        Assert.assertTrue(el.hasAttributes());
        Assert.assertEquals(0, el.childNodeSize());
    }

    @Test
    public void constructor_givenTagAndBaseUri_shouldInitializeWithNullAttributes() {
        Tag tag = Tag.valueOf("p");
        Element el = new Element(tag, "http://example.com");
        Assert.assertEquals("p", el.tagName());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertFalse(el.hasAttributes());
        Assert.assertNotNull(el.attributes());
        Assert.assertTrue(el.hasAttributes());
    }

    @Test
    public void constructor_givenTagBaseUriAndAttributes_shouldRetainAttributes() {
        Tag tag = Tag.valueOf("span");
        Attributes attrs = new Attributes();
        attrs.put("title", "test");
        Element el = new Element(tag, "http://example.com", attrs);
        Assert.assertTrue(el.hasAttributes());
        Assert.assertEquals("test", el.attr("title"));
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
    public void tagName_givenNewValidTagName_shouldUpdateTagPreservingCase() {
        Element el = new Element("div");
        el.tagName("SPAN");
        Assert.assertEquals("SPAN", el.tagName());
        Assert.assertEquals("SPAN", el.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenNullTagName_shouldThrowException() {
        Element el = new Element("div");
        el.tagName(null);
    }

    @Test
    public void isBlock_givenBlockAndInlineTags_shouldReturnExpectedBoolean() {
        Element div = new Element("div");
        Assert.assertTrue(div.isBlock());

        Element span = new Element("span");
        Assert.assertFalse(span.isBlock());
    }

    @Test
    public void baseUri_and_doSetBaseUri_shouldUpdateCorrectly() {
        Element el = new Element("div");
        el.doSetBaseUri("http://example.org");
        Assert.assertEquals("http://example.org", el.baseUri());
    }

    @Test
    public void id_givenElementWithOrWithoutId_shouldReturnIdOrEmpty() {
        Element el = new Element("div");
        Assert.assertEquals("", el.id());

        el.attr("id", "main");
        Assert.assertEquals("main", el.id());
    }

    @Test
    public void attr_givenStringKeyValue_shouldSetAndReturnElement() {
        Element el = new Element("a");
        Element returned = el.attr("href", "http://jsoup.org");
        Assert.assertSame(el, returned);
        Assert.assertEquals("http://jsoup.org", el.attr("href"));
    }

    @Test
    public void attr_givenBooleanValue_shouldSetBooleanAttribute() {
        Element el = new Element("input");
        Element returned = el.attr("disabled", true);
        Assert.assertSame(el, returned);
        Assert.assertTrue(el.attributes().hasKey("disabled"));

        el.attr("disabled", false);
        Assert.assertFalse(el.attributes().hasKey("disabled"));
    }

    @Test
    public void dataset_givenDataAttributes_shouldReturnDatasetMap() {
        Element el = new Element("div");
        el.attr("data-role", "button");
        el.attr("data-action", "submit");
        el.attr("id", "btn");

        Map<String, String> dataset = el.dataset();
        Assert.assertEquals(2, dataset.size());
        Assert.assertEquals("button", dataset.get("role"));
        Assert.assertEquals("submit", dataset.get("action"));
    }

    @Test
    public void parent_and_parents_givenHierarchy_shouldReturnAncestorsExcludingRoot() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        Element div = body.appendElement("div");
        Element p = div.appendElement("p");

        Assert.assertSame(div, p.parent());
        Elements parents = p.parents();
        Assert.assertEquals(3, parents.size());
        Assert.assertSame(div, parents.get(0));
        Assert.assertSame(body, parents.get(1));
        Assert.assertSame(doc.selectFirst("html"), parents.get(2));
    }

    @Test
    public void parents_givenDetachedElement_shouldReturnEmpty() {
        Element el = new Element("div");
        Assert.assertTrue(el.parents().isEmpty());
    }

    @Test
    public void child_and_children_givenMixedChildren_shouldReturnOnlyElements() {
        Element parent = new Element("div");
        TextNode text1 = new TextNode("text1");
        Element child1 = new Element("span");
        TextNode text2 = new TextNode("text2");
        Element child2 = new Element("p");

        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);
        parent.appendChild(child2);

        Assert.assertEquals(4, parent.childNodeSize());
        Elements children = parent.children();
        Assert.assertEquals(2, children.size());
        Assert.assertSame(child1, children.get(0));
        Assert.assertSame(child2, children.get(1));
        Assert.assertSame(child1, parent.child(0));
        Assert.assertSame(child2, parent.child(1));
    }

    @Test
    public void textNodes_and_dataNodes_shouldFilterChildNodesCorrectly() {
        Element parent = new Element("div");
        TextNode tn = new TextNode("hello");
        DataNode dn = new DataNode("data content");
        Element span = new Element("span");

        parent.appendChild(tn);
        parent.appendChild(dn);
        parent.appendChild(span);

        List<TextNode> textNodes = parent.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertSame(tn, textNodes.get(0));

        List<DataNode> dataNodes = parent.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertSame(dn, dataNodes.get(0));
    }

    @Test
    public void select_and_selectFirst_and_is_shouldEvaluateSelectors() {
        Element root = new Element("div");
        root.attr("id", "root");
        Element child = root.appendElement("p");
        child.attr("class", "lead");
        child.text("para");

        Elements selected = root.select("p.lead");
        Assert.assertEquals(1, selected.size());
        Assert.assertSame(child, selected.first());

        Element first = root.selectFirst(".lead");
        Assert.assertSame(child, first);

        Assert.assertTrue(child.is(".lead"));
        Assert.assertFalse(child.is(".other"));
        Assert.assertTrue(child.is(new Evaluator.Class("lead")));
    }

    @Test
    public void appendChild_and_prependChild_and_appendTo_shouldManageOrdering() {
        Element parent = new Element("ul");
        Element li1 = new Element("li").text("1");
        Element li2 = new Element("li").text("2");
        Element li0 = new Element("li").text("0");

        parent.appendChild(li1);
        li2.appendTo(parent);
        parent.prependChild(li0);

        Assert.assertEquals(3, parent.children().size());
        Assert.assertSame(li0, parent.child(0));
        Assert.assertSame(li1, parent.child(1));
        Assert.assertSame(li2, parent.child(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNull_shouldThrowException() {
        new Element("div").appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendTo_givenNull_shouldThrowException() {
        new Element("div").appendTo(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNull_shouldThrowException() {
        new Element("div").prependChild(null);
    }

    @Test
    public void insertChildren_givenCollectionAndVarargsWithPositiveAndNegativeIndex_shouldInsertCorrectly() {
        Element parent = new Element("div");
        Element a = new Element("a");
        Element b = new Element("b");
        parent.appendChild(a);
        parent.appendChild(b);

        Element pre = new Element("pre");
        List<Node> list = new ArrayList<Node>();
        list.add(pre);
        parent.insertChildren(1, list);
        Assert.assertEquals(3, parent.children().size());
        Assert.assertSame(pre, parent.child(1));

        Element post = new Element("post");
        parent.insertChildren(-1, post);
        Assert.assertSame(post, parent.child(parent.children().size() - 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullCollection_shouldThrowException() {
        Element el = new Element("div");
        el.insertChildren(0, (List<Node>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element el = new Element("div");
        el.insertChildren(5, new Element("p"));
    }

    @Test
    public void appendElement_and_prependElement_shouldCreateAndAddChild() {
        Element parent = new Element("div");
        Element span = parent.appendElement("span");
        Element header = parent.prependElement("h1");

        Assert.assertEquals("span", span.tagName());
        Assert.assertEquals("h1", header.tagName());
        Assert.assertSame(header, parent.child(0));
        Assert.assertSame(span, parent.child(1));
    }

    @Test
    public void appendText_and_prependText_shouldAppendAndPrependTextNodes() {
        Element el = new Element("p");
        el.appendText("World");
        el.prependText("Hello ");
        Assert.assertEquals("Hello World", el.text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendText_givenNull_shouldThrowException() {
        new Element("p").appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependText_givenNull_shouldThrowException() {
        new Element("p").prependText(null);
    }

    @Test
    public void append_and_prepend_givenHtmlFragment_shouldParseAndAddNodes() {
        Element div = new Element("div");
        div.append("<span>One</span>");
        div.prepend("<b>Zero</b>");

        Assert.assertEquals("<b>Zero</b><span>One</span>", div.html().replaceAll("\\s+", ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullHtml_shouldThrowException() {
        new Element("div").append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_givenNullHtml_shouldThrowException() {
        new Element("div").prepend(null);
    }

    @Test
    public void before_and_after_givenHtmlAndNode_shouldInsertAtSiblings() {
        Element parent = new Element("div");
        Element mid = parent.appendElement("p");

        mid.before("<span>BeforeHtml</span>");
        Element bNode = new Element("b");
        mid.before(bNode);

        mid.after("<i>AfterHtml</i>");
        Element uNode = new Element("u");
        mid.after(uNode);

        Assert.assertEquals(5, parent.children().size());
        Assert.assertEquals("span", parent.child(0).tagName());
        Assert.assertEquals("b", parent.child(1).tagName());
        Assert.assertEquals("p", parent.child(2).tagName());
        Assert.assertEquals("u", parent.child(3).tagName());
        Assert.assertEquals("i", parent.child(4).tagName());
    }

    @Test
    public void empty_shouldRemoveAllChildNodes() {
        Element parent = new Element("div");
        parent.appendElement("p");
        parent.appendText("text");
        Assert.assertTrue(parent.childNodeSize() > 0);

        Element returned = parent.empty();
        Assert.assertSame(parent, returned);
        Assert.assertEquals(0, parent.childNodeSize());
        Assert.assertEquals(0, parent.children().size());
    }

    @Test
    public void wrap_givenHtmlSnippet_shouldWrapElement() {
        Element div = new Element("div");
        Element p = div.appendElement("p");
        p.wrap("<div class='wrapper'></div>");

        Assert.assertEquals("div", p.parent().tagName());
        Assert.assertEquals("wrapper", p.parent().className());
        Assert.assertSame(div, p.parent().parent());
    }

    @Test
    public void cssSelector_variousCases_shouldBuildCorrectSelectors() {
        Element elWithId = new Element("span");
        elWithId.attr("id", "foo");
        Assert.assertEquals("#foo", elWithId.cssSelector());

        Element standalone = new Element("div");
        standalone.addClass("c1");
        standalone.addClass("c2");
        Assert.assertEquals("div.c1.c2", standalone.cssSelector());

        Element parent = new Element("div");
        Element c1 = parent.appendElement("span");
        Element c2 = parent.appendElement("span");
        Assert.assertEquals("div > span:nth-child(1)", c1.cssSelector());
        Assert.assertEquals("div > span:nth-child(2)", c2.cssSelector());

        Document doc = new Document("http://example.com");
        Element childOfDoc = doc.appendElement("body");
        Assert.assertEquals("body", childOfDoc.cssSelector());
    }

    @Test
    public void siblingNavigation_shouldReturnCorrectSiblingElements() {
        Element parent = new Element("div");
        Element first = parent.appendElement("p");
        Element second = parent.appendElement("span");
        Element third = parent.appendElement("a");

        Assert.assertEquals(2, second.siblingElements().size());
        Assert.assertSame(first, second.siblingElements().get(0));
        Assert.assertSame(third, second.siblingElements().get(1));

        Assert.assertSame(second, first.nextElementSibling());
        Assert.assertNull(third.nextElementSibling());

        Assert.assertSame(second, third.previousElementSibling());
        Assert.assertNull(first.previousElementSibling());

        Assert.assertSame(first, second.firstElementSibling());
        Assert.assertSame(third, second.lastElementSibling());

        Assert.assertEquals(0, first.elementSiblingIndex());
        Assert.assertEquals(1, second.elementSiblingIndex());
        Assert.assertEquals(2, third.elementSiblingIndex());
    }

    @Test
    public void siblingNavigation_whenDetachedOrSingleChild_shouldHandleGracefully() {
        Element detached = new Element("div");
        Assert.assertEquals(0, detached.siblingElements().size());
        Assert.assertNull(detached.nextElementSibling());
        Assert.assertNull(detached.previousElementSibling());
        Assert.assertNull(detached.firstElementSibling());
        Assert.assertNull(detached.lastElementSibling());
        Assert.assertEquals(0, detached.elementSiblingIndex());

        Element parent = new Element("div");
        Element onlyChild = parent.appendElement("p");
        Assert.assertNull(onlyChild.firstElementSibling());
        Assert.assertNull(onlyChild.lastElementSibling());
    }

    @Test
    public void getElementsByTag_and_getElementById_and_getElementsByClass_shouldQueryNodes() {
        Element parent = new Element("div");
        Element p = parent.appendElement("p");
        p.attr("id", "targetId");
        p.addClass("targetClass");

        Elements byTag = parent.getElementsByTag("P");
        Assert.assertEquals(1, byTag.size());
        Assert.assertSame(p, byTag.first());

        Element byId = parent.getElementById("targetId");
        Assert.assertSame(p, byId);
        Assert.assertNull(parent.getElementById("nonExisting"));

        Elements byClass = parent.getElementsByClass("targetClass");
        Assert.assertEquals(1, byClass.size());
        Assert.assertSame(p, byClass.first());
    }

    @Test
    public void getElementsByAttribute_variants_shouldCollectMatchingElements() {
        Element parent = new Element("div");
        Element c1 = parent.appendElement("a");
        c1.attr("href", "http://example.com/one");
        c1.attr("target", "_blank");

        Element c2 = parent.appendElement("a");
        c2.attr("href", "http://jsoup.org/two");
        c2.attr("custom-attr", "value");

        Assert.assertEquals(2, parent.getElementsByAttribute("href").size());
        Assert.assertEquals(1, parent.getElementsByAttributeStarting("custom").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValue("href", "http://example.com/one").size());
        Assert.assertEquals(2, parent.getElementsByAttributeValueNot("target", "_blank").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueStarting("href", "http://jsoup").size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueEnding("href", "two").size());
        Assert.assertEquals(2, parent.getElementsByAttributeValueContaining("href", "http://").size());

        Pattern pat = Pattern.compile(".*jsoup.*");
        Assert.assertEquals(1, parent.getElementsByAttributeValueMatching("href", pat).size());
        Assert.assertEquals(1, parent.getElementsByAttributeValueMatching("href", ".*jsoup.*").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        new Element("div").getElementsByAttributeValueMatching("k", "[invalid(");
    }

    @Test
    public void getElementsByIndex_variants_shouldCollectByIndex() {
        Element parent = new Element("ul");
        parent.appendElement("li");
        parent.appendElement("li");
        parent.appendElement("li");

        Assert.assertEquals(1, parent.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(2, parent.getElementsByIndexGreaterThan(1).size());
        Assert.assertEquals(1, parent.getElementsByIndexEquals(1).size());
    }

    @Test
    public void getElementsMatchingText_and_getAllElements_shouldReturnExpected() {
        Element parent = new Element("div");
        Element p1 = parent.appendElement("p").text("Hello World");
        Element p2 = parent.appendElement("p").text("Hello Jsoup");

        Assert.assertEquals(2, parent.getElementsContainingText("Hello").size());
        Assert.assertEquals(1, parent.getElementsContainingOwnText("World").size());

        Pattern pattern = Pattern.compile(".*World.*");
        Assert.assertEquals(1, parent.getElementsMatchingText(pattern).size());
        Assert.assertEquals(1, parent.getElementsMatchingText(".*World.*").size());
        Assert.assertEquals(1, parent.getElementsMatchingOwnText(pattern).size());
        Assert.assertEquals(1, parent.getElementsMatchingOwnText(".*World.*").size());

        Assert.assertEquals(3, parent.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        new Element("div").getElementsMatchingText("[invalid(");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        new Element("div").getElementsMatchingOwnText("[invalid(");
    }

    @Test
    public void text_and_ownText_givenNestedElements_shouldAggregateProperly() {
        Element div = new Element("div");
        div.appendText("Outer ");
        Element p = div.appendElement("p");
        p.appendText("Paragraph");
        div.appendElement("br");
        div.appendText(" End");

        Assert.assertEquals("Outer Paragraph End", div.text());
        Assert.assertEquals("Outer End", div.ownText());
    }

    @Test
    public void text_givenPreserveWhitespaceTag_shouldRetainWhitespace() {
        Element pre = new Element("pre");
        pre.appendText("  line 1\n  line 2  ");
        Assert.assertEquals("  line 1\n  line 2  ", pre.text());

        Element code = pre.appendElement("code");
        code.appendText("  var x = 1;  ");
        Assert.assertTrue(pre.text().contains("  var x = 1;  "));
    }

    @Test
    public void text_givenSetter_shouldClearAndReplaceContent() {
        Element div = new Element("div");
        div.appendElement("span").text("old");
        div.text("new text");

        Assert.assertEquals(1, div.childNodeSize());
        Assert.assertEquals("new text", div.text());
    }

    @Test
    public void hasText_givenBlankOrNonBlankContent_shouldReturnExpectedBoolean() {
        Element emptyEl = new Element("div");
        Assert.assertFalse(emptyEl.hasText());

        Element whitespaceEl = new Element("div");
        whitespaceEl.appendText("   ");
        Assert.assertFalse(whitespaceEl.hasText());

        Element textEl = new Element("div");
        textEl.appendText("content");
        Assert.assertTrue(textEl.hasText());

        Element nestedEl = new Element("div");
        nestedEl.appendElement("span").text("nested");
        Assert.assertTrue(nestedEl.hasText());
    }

    @Test
    public void data_givenDataAndCommentsAndNestedElements_shouldAggregateData() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var a = 1;"));
        script.appendChild(new Comment("ignored data comment"));
        Element sub = script.appendElement("subdata");
        sub.appendChild(new DataNode("var b = 2;"));

        String data = script.data();
        Assert.assertTrue(data.contains("var a = 1;"));
        Assert.assertTrue(data.contains("ignored data comment"));
        Assert.assertTrue(data.contains("var b = 2;"));
    }

    @Test
    public void className_and_classNames_and_hasClass_and_addClass_and_removeClass_and_toggleClass() {
        Element el = new Element("div");
        Assert.assertEquals("", el.className());
        Assert.assertTrue(el.classNames().isEmpty());
        Assert.assertFalse(el.hasClass("active"));

        el.addClass("active");
        Assert.assertEquals("active", el.className());
        Assert.assertTrue(el.hasClass("active"));
        Assert.assertTrue(el.hasClass("ACTIVE"));

        el.addClass("btn");
        Assert.assertTrue(el.hasClass("active"));
        Assert.assertTrue(el.hasClass("btn"));
        Assert.assertFalse(el.hasClass("bt"));

        el.removeClass("active");
        Assert.assertFalse(el.hasClass("active"));
        Assert.assertTrue(el.hasClass("btn"));

        el.toggleClass("btn");
        Assert.assertFalse(el.hasClass("btn"));
        el.toggleClass("btn");
        Assert.assertTrue(el.hasClass("btn"));

        Set<String> set = new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        el.classNames(set);
        Assert.assertEquals("one two", el.className());

        el.classNames(Collections.<String>emptySet());
        Assert.assertFalse(el.hasAttributes());
    }

    @Test
    public void hasClass_boundaryConditions_shouldReturnAccurateResults() {
        Element el = new Element("div");
        el.attr("class", "  first   second  third  ");

        Assert.assertTrue(el.hasClass("first"));
        Assert.assertTrue(el.hasClass("second"));
        Assert.assertTrue(el.hasClass("third"));
        Assert.assertFalse(el.hasClass("fir"));
        Assert.assertFalse(el.hasClass("sec"));
        Assert.assertFalse(el.hasClass("fourth"));
        Assert.assertFalse(el.hasClass(""));
    }

    @Test
    public void val_givenNormalElementAndTextarea_shouldGetAndSetCorrectly() {
        Element input = new Element("input");
        input.val("foo");
        Assert.assertEquals("foo", input.val());
        Assert.assertEquals("foo", input.attr("value"));

        Element textarea = new Element("textarea");
        textarea.val("bar");
        Assert.assertEquals("bar", textarea.val());
        Assert.assertEquals("bar", textarea.text());
    }

    @Test
    public void outerHtml_selfClosingAndBlockFormatting_shouldRenderExpectedHtml() throws IOException {
        Element img = new Element("img");
        img.attr("src", "test.jpg");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sbXml = new StringBuilder();
        img.outerHtmlHead(sbXml, 0, out);
        img.outerHtmlTail(sbXml, 0, out);
        Assert.assertEquals("<img src=\"test.jpg\" />", sbXml.toString());

        out.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder sbHtml = new StringBuilder();
        img.outerHtmlHead(sbHtml, 0, out);
        img.outerHtmlTail(sbHtml, 0, out);
        Assert.assertEquals("<img src=\"test.jpg\">", sbHtml.toString());

        Element div = new Element("div");
        div.appendElement("p").text("content");
        String divHtml = div.outerHtml();
        Assert.assertTrue(divHtml.startsWith("<div>"));
        Assert.assertTrue(divHtml.endsWith("</div>"));
    }

    @Test
    public void html_and_htmlSetter_shouldRenderAndReplaceInnerHtml() {
        Element div = new Element("div");
        div.html("<p>Hello</p>");
        Assert.assertEquals(1, div.children().size());
        Assert.assertEquals("<p>Hello</p>", div.html().replaceAll("\\s+", ""));

        StringBuilder sb = new StringBuilder();
        div.html(sb);
        Assert.assertTrue(sb.toString().contains("<p>Hello</p>"));
    }

    @Test
    public void toString_shouldMatchOuterHtml() {
        Element el = new Element("p");
        el.text("Sample");
        Assert.assertEquals(el.outerHtml(), el.toString());
    }

    @Test
    public void clone_and_shallowClone_shouldDuplicateStructureProperly() {
        Element original = new Element(Tag.valueOf("div"), "http://example.com");
        original.attr("class", "container");
        Element child = original.appendElement("p");
        child.text("text");

        Element deepClone = original.clone();
        Assert.assertNotSame(original, deepClone);
        Assert.assertEquals(original.outerHtml(), deepClone.outerHtml());
        Assert.assertEquals(1, deepClone.children().size());
        Assert.assertNotSame(original.child(0), deepClone.child(0));

        Element shallow = original.shallowClone();
        Assert.assertNotSame(original, shallow);
        Assert.assertEquals("div", shallow.tagName());
        Assert.assertEquals("http://example.com", shallow.baseUri());
        Assert.assertEquals("container", shallow.attr("class"));
        Assert.assertEquals(0, shallow.childNodeSize());
    }

    @Test
    public void nodelistChanged_shouldInvalidateChildElementsShadowCache() {
        Element parent = new Element("div");
        Element c1 = parent.appendElement("span");
        Assert.assertEquals(1, parent.children().size());
        Assert.assertSame(c1, parent.child(0));

        Element c2 = new Element("p");
        parent.appendChild(c2);

        Assert.assertEquals(2, parent.children().size());
        Assert.assertSame(c2, parent.child(1));
    }
}