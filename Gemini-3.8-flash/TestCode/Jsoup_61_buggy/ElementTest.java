package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
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
    public void constructor_givenTagName_shouldInstantiateCorrectly() {
        Element el = new Element("div");
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("", el.baseUri());
        Assert.assertTrue(el.isBlock());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element((Tag) null, "http://example.com");
    }

    @Test
    public void constructor_givenTagAndBaseUriAndAttributes_shouldInitializeProperly() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        Element el = new Element(Tag.valueOf("span"), "http://example.com", attrs);
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertEquals("val", el.attr("key"));
        Assert.assertFalse(el.isBlock());
        Assert.assertSame(attrs, el.attributes());
    }

    @Test
    public void tagName_givenNewTagName_shouldChangeTagName() {
        Element el = new Element("div");
        el.tagName("span");
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals("span", el.nodeName());
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
    public void id_givenElementWithOrWithoutId_shouldReturnExpected() {
        Element el = new Element("div");
        Assert.assertEquals("", el.id());

        el.attr("id", "mainSection");
        Assert.assertEquals("mainSection", el.id());

        el.attr("ID", "upperCaseId");
        Assert.assertEquals("upperCaseId", el.id());
    }

    @Test
    public void attr_givenStringValue_shouldSetAndReturnElement() {
        Element el = new Element("div");
        Element returned = el.attr("title", "tooltip");
        Assert.assertSame(el, returned);
        Assert.assertEquals("tooltip", el.attr("title"));
    }

    @Test
    public void attr_givenBooleanValue_shouldSetAndReturnElement() {
        Element el = new Element("input");
        Element returned = el.attr("disabled", true);
        Assert.assertSame(el, returned);
        Assert.assertTrue(el.hasAttr("disabled"));
    }

    @Test
    public void dataset_givenCustomDataAttributes_shouldExtractMap() {
        Element el = new Element("div");
        el.attr("data-user-id", "1234");
        el.attr("data-role", "admin");
        el.attr("class", "profile");

        Map<String, String> data = el.dataset();
        Assert.assertEquals(2, data.size());
        Assert.assertEquals("1234", data.get("user-id"));
        Assert.assertEquals("admin", data.get("role"));
    }

    @Test
    public void parentAndParents_givenHierarchy_shouldTraverseCorrectly() {
        Document doc = new Document("http://example.com");
        Element body = doc.appendElement("body");
        Element div = body.appendElement("div");
        Element span = div.appendElement("span");

        Assert.assertSame(div, span.parent());
        Assert.assertSame(body, div.parent());

        Elements parents = span.parents();
        Assert.assertEquals(2, parents.size());
        Assert.assertEquals("div", parents.get(0).tagName());
        Assert.assertEquals("body", parents.get(1).tagName());

        Element orphan = new Element("p");
        Assert.assertNull(orphan.parent());
        Assert.assertEquals(0, orphan.parents().size());
    }

    @Test
    public void childrenAndChild_givenMixedNodes_shouldOnlyReturnElements() {
        Element div = new Element("div");
        div.appendText("Leading text");
        Element p = div.appendElement("p");
        div.append("<!-- comment -->");
        Element span = div.appendElement("span");

        Elements children = div.children();
        Assert.assertEquals(2, children.size());
        Assert.assertSame(p, children.get(0));
        Assert.assertSame(span, children.get(1));

        Assert.assertSame(p, div.child(0));
        Assert.assertSame(span, div.child(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void child_givenOutOfBoundsIndex_shouldThrowException() {
        Element div = new Element("div");
        div.child(0);
    }

    @Test
    public void textNodesAndDataNodes_givenNodes_shouldFilterTypes() {
        Element script = new Element("script");
        TextNode tn1 = new TextNode("var a = 1;", "");
        DataNode dn1 = new DataNode("alert(1);", "");
        script.appendChild(tn1);
        script.appendChild(dn1);

        List<TextNode> textNodes = script.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertSame(tn1, textNodes.get(0));

        List<DataNode> dataNodes = script.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertSame(dn1, dataNodes.get(0));
    }

    @Test
    public void selectAndIs_givenQueryAndEvaluator_shouldEvaluate() {
        Element div = new Element("div");
        div.attr("class", "container");
        Element span = div.appendElement("span");
        span.attr("id", "inner");

        Elements selected = div.select("span#inner");
        Assert.assertEquals(1, selected.size());
        Assert.assertSame(span, selected.get(0));

        Assert.assertTrue(span.is("span#inner"));
        Assert.assertFalse(span.is("div"));

        Assert.assertTrue(span.is(new Evaluator.Id("inner")));
        Assert.assertFalse(span.is(new Evaluator.Id("wrong")));
    }

    @Test
    public void appendChildAndPrependChild_givenNodes_shouldMaintainOrder() {
        Element div = new Element("div");
        Element c1 = new Element("p");
        Element c2 = new Element("span");

        div.appendChild(c1);
        Assert.assertEquals(1, div.childNodeSize());
        Assert.assertEquals(0, c1.siblingIndex());

        div.prependChild(c2);
        Assert.assertEquals(2, div.childNodeSize());
        Assert.assertSame(c2, div.child(0));
        Assert.assertSame(c1, div.child(1));
        Assert.assertEquals(0, c2.siblingIndex());
        Assert.assertEquals(1, c1.siblingIndex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNullChild_shouldThrowException() {
        Element div = new Element("div");
        div.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNullChild_shouldThrowException() {
        Element div = new Element("div");
        div.prependChild(null);
    }

    @Test
    public void insertChildren_givenValidIndices_shouldInsertNodesCorrectly() {
        Element div = new Element("div");
        Element el1 = new Element("h1");
        Element el2 = new Element("h2");
        div.appendChild(el1);
        div.appendChild(el2);

        List<Node> toInsert = new ArrayList<Node>();
        Element inserted1 = new Element("span");
        Element inserted2 = new Element("b");
        toInsert.add(inserted1);
        toInsert.add(inserted2);

        div.insertChildren(1, toInsert);
        Assert.assertEquals(4, div.childNodeSize());
        Assert.assertSame(el1, div.child(0));
        Assert.assertSame(inserted1, div.child(1));
        Assert.assertSame(inserted2, div.child(2));
        Assert.assertSame(el2, div.child(3));

        List<Node> negativeInsert = new ArrayList<Node>();
        Element negEl = new Element("footer");
        negativeInsert.add(negEl);

        div.insertChildren(-1, negativeInsert);
        Assert.assertEquals(5, div.childNodeSize());
        Assert.assertSame(negEl, div.child(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullChildren_shouldThrowException() {
        Element div = new Element("div");
        div.insertChildren(0, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element div = new Element("div");
        div.insertChildren(5, new ArrayList<Node>());
    }

    @Test
    public void appendAndPrependElement_givenTag_shouldCreateAndAddChild() {
        Element div = new Element("div");
        Element child1 = div.appendElement("span");
        Element child0 = div.prependElement("p");

        Assert.assertEquals(2, div.children().size());
        Assert.assertSame(child0, div.child(0));
        Assert.assertSame(child1, div.child(1));
        Assert.assertEquals("p", child0.tagName());
        Assert.assertEquals("span", child1.tagName());
    }

    @Test
    public void appendAndPrependText_givenText_shouldCreateAndAddTextNodes() {
        Element div = new Element("div");
        div.appendText("World");
        div.prependText("Hello ");

        Assert.assertEquals("Hello World", div.text());
        Assert.assertEquals(2, div.textNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendText_givenNullText_shouldThrowException() {
        Element div = new Element("div");
        div.appendText(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependText_givenNullText_shouldThrowException() {
        Element div = new Element("div");
        div.prependText(null);
    }

    @Test
    public void appendAndPrependHtml_givenHtmlString_shouldParseAndAdd() {
        Element div = new Element("div");
        div.append("<p>Paragraph</p>");
        Assert.assertEquals(1, div.children().size());
        Assert.assertEquals("p", div.child(0).tagName());

        div.prepend("<span>Header</span>");
        Assert.assertEquals(2, div.children().size());
        Assert.assertEquals("span", div.child(0).tagName());
        Assert.assertEquals("p", div.child(1).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullHtml_shouldThrowException() {
        Element div = new Element("div");
        div.append(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prepend_givenNullHtml_shouldThrowException() {
        Element div = new Element("div");
        div.prepend(null);
    }

    @Test
    public void beforeAndAfter_givenNodesAndHtml_shouldInsertCorrectly() {
        Element div = new Element("div");
        Element p = div.appendElement("p");

        p.before("<h1>Title</h1>");
        Assert.assertEquals("h1", div.child(0).tagName());
        Assert.assertEquals("p", div.child(1).tagName());

        Element footer = new Element("footer");
        p.after(footer);
        Assert.assertSame(footer, div.child(2));

        p.after("<span>SpanAfter</span>");
        Assert.assertEquals("span", div.child(2).tagName());

        Element aside = new Element("aside");
        p.before(aside);
        Assert.assertSame(aside, div.child(1));
    }

    @Test
    public void empty_givenChildren_shouldClearAllNodes() {
        Element div = new Element("div");
        div.appendElement("span");
        div.appendText("some text");
        Assert.assertTrue(div.childNodeSize() > 0);

        Element returned = div.empty();
        Assert.assertSame(div, returned);
        Assert.assertEquals(0, div.childNodeSize());
        Assert.assertEquals("", div.text());
    }

    @Test
    public void wrap_givenHtml_shouldWrapElement() {
        Element div = new Element("div");
        Element p = div.appendElement("p");
        p.appendText("Content");

        Element wrapped = p.wrap("<div class='wrapper'></div>");
        Assert.assertSame(p, wrapped);
        Assert.assertEquals("wrapper", p.parent().className());
        Assert.assertSame(div, p.parent().parent());
    }

    @Test
    public void cssSelector_givenVariousScenarios_shouldGenerateExpectedSelectors() {
        Element withId = new Element("div");
        withId.attr("id", "main");
        Assert.assertEquals("#main", withId.cssSelector());

        Element isolated = new Element("span");
        isolated.addClass("foo");
        isolated.addClass("bar");
        Assert.assertEquals("span.foo.bar", isolated.cssSelector());

        Element customTag = new Element("custom:elem");
        Assert.assertEquals("custom|elem", customTag.cssSelector());

        Document doc = new Document("");
        Element body = doc.appendElement("body");
        Element div1 = body.appendElement("div");
        Element div2 = body.appendElement("div");

        Assert.assertEquals("div", div1.cssSelector());

        Element p1 = div1.appendElement("p");
        Element p2 = div1.appendElement("p");
        Assert.assertEquals("p:nth-child(1)", p1.cssSelector());
        Assert.assertEquals("p:nth-child(2)", p2.cssSelector());
    }

    @Test
    public void siblingNavigation_givenSiblings_shouldNavigateCorrectly() {
        Element parent = new Element("div");
        Element first = parent.appendElement("span");
        Element second = parent.appendElement("p");
        Element third = parent.appendElement("footer");

        Elements firstSibs = first.siblingElements();
        Assert.assertEquals(2, firstSibs.size());
        Assert.assertSame(second, firstSibs.get(0));
        Assert.assertSame(third, firstSibs.get(1));

        Assert.assertSame(second, first.nextElementSibling());
        Assert.assertNull(first.previousElementSibling());

        Assert.assertSame(third, second.nextElementSibling());
        Assert.assertSame(first, second.previousElementSibling());

        Assert.assertNull(third.nextElementSibling());
        Assert.assertSame(second, third.previousElementSibling());

        Assert.assertSame(first, second.firstElementSibling());
        Assert.assertSame(third, second.lastElementSibling());

        Assert.assertEquals(Integer.valueOf(0), first.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), second.elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(2), third.elementSiblingIndex());
    }

    @Test
    public void siblingNavigation_givenOrphanOrSingleChild_shouldHandleEdgeCases() {
        Element orphan = new Element("div");
        Assert.assertEquals(0, orphan.siblingElements().size());
        Assert.assertNull(orphan.nextElementSibling());
        Assert.assertNull(orphan.previousElementSibling());
        Assert.assertEquals(Integer.valueOf(0), orphan.elementSiblingIndex());

        Element parent = new Element("div");
        Element singleChild = parent.appendElement("p");
        Assert.assertEquals(0, singleChild.siblingElements().size());
        Assert.assertNull(singleChild.firstElementSibling());
        Assert.assertNull(singleChild.lastElementSibling());
    }

    @Test
    public void getElementsByMethods_givenMatches_shouldCollectElements() {
        Element div = new Element("div");
        Element child1 = div.appendElement("p");
        child1.attr("id", "para1");
        child1.attr("class", "text highlight");
        child1.attr("data-val", "abc123xyz");
        child1.appendText("Hello World");

        Element child2 = div.appendElement("p");
        child2.attr("id", "para2");
        child2.attr("class", "text");
        child2.attr("data-val", "def456xyz");
        child2.appendText("Goodbye World");

        Element child3 = div.appendElement("span");
        child3.attr("data-other", "prefix-match");
        child3.appendText("Different text");

        Assert.assertEquals(2, div.getElementsByTag("P").size());
        Assert.assertSame(child1, div.getElementById("para1"));
        Assert.assertNull(div.getElementById("nonexistent"));
        Assert.assertEquals(2, div.getElementsByClass("text").size());
        Assert.assertEquals(1, div.getElementsByClass("highlight").size());

        Assert.assertEquals(2, div.getElementsByAttribute("data-val").size());
        Assert.assertEquals(3, div.getElementsByAttributeStarting("data-").size());
        Assert.assertEquals(1, div.getElementsByAttributeValue("data-val", "abc123xyz").size());
        Assert.assertEquals(2, div.getElementsByAttributeValueNot("data-val", "abc123xyz").size());
        Assert.assertEquals(1, div.getElementsByAttributeValueStarting("data-val", "abc").size());
        Assert.assertEquals(2, div.getElementsByAttributeValueEnding("data-val", "xyz").size());
        Assert.assertEquals(2, div.getElementsByAttributeValueContaining("data-val", "123").size());

        Assert.assertEquals(2, div.getElementsByAttributeValueMatching("data-val", Pattern.compile("\\d+")).size());
        Assert.assertEquals(2, div.getElementsByAttributeValueMatching("data-val", "\\d+").size());

        Assert.assertEquals(1, div.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(2, div.getElementsByIndexGreaterThan(0).size());
        Assert.assertEquals(1, div.getElementsByIndexEquals(1).size());

        Assert.assertEquals(2, div.getElementsContainingText("World").size());
        Assert.assertEquals(2, div.getElementsContainingOwnText("World").size());

        Assert.assertEquals(2, div.getElementsMatchingText(Pattern.compile("World$")).size());
        Assert.assertEquals(2, div.getElementsMatchingText("World$").size());

        Assert.assertEquals(2, div.getElementsMatchingOwnText(Pattern.compile("^Hello")).size());
        Assert.assertEquals(2, div.getElementsMatchingOwnText("^Hello").size());

        Assert.assertEquals(4, div.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element div = new Element("div");
        div.getElementsByAttributeValueMatching("key", "[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element("div");
        div.getElementsMatchingText("[invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowException() {
        Element div = new Element("div");
        div.getElementsMatchingOwnText("[invalid");
    }

    @Test
    public void textAndOwnText_givenHierarchyAndTags_shouldNormalizeWhitespace() {
        Element div = new Element("div");
        div.append("Line 1<br>Line 2<p>Paragraph</p><div>Block</div>");
        Assert.assertEquals("Line 1 Line 2 Paragraph Block", div.text());
        Assert.assertEquals("Line 1 Line 2", div.ownText());

        Element pre = new Element("pre");
        pre.appendText("  Multiple   spaces\nand newlines  ");
        Assert.assertEquals("  Multiple   spaces\nand newlines  ", pre.text());

        Element container = new Element("div");
        container.appendChild(pre);
        Assert.assertEquals("  Multiple   spaces\nand newlines  ", container.text());
    }

    @Test
    public void text_givenNewString_shouldReplaceChildrenWithTextNode() {
        Element div = new Element("div");
        div.appendElement("span").appendText("old");
        div.text("new text");
        Assert.assertEquals("new text", div.text());
        Assert.assertEquals(1, div.childNodes.size());
        Assert.assertTrue(div.childNode(0) instanceof TextNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void text_givenNullString_shouldThrowException() {
        Element div = new Element("div");
        div.text(null);
    }

    @Test
    public void hasText_givenVariousContents_shouldReturnExpected() {
        Element emptyEl = new Element("div");
        Assert.assertFalse(emptyEl.hasText());

        Element whitespaceEl = new Element("div");
        whitespaceEl.appendText("   ");
        Assert.assertFalse(whitespaceEl.hasText());

        Element directTextEl = new Element("div");
        directTextEl.appendText("hello");
        Assert.assertTrue(directTextEl.hasText());

        Element nestedTextEl = new Element("div");
        nestedTextEl.appendElement("span").appendText("nested");
        Assert.assertTrue(nestedTextEl.hasText());
    }

    @Test
    public void data_givenDataNodesAndComments_shouldConcatenateData() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var x = 10;", ""));
        script.appendChild(new Comment(" a comment "));
        Element subScript = script.appendElement("sub");
        subScript.appendChild(new DataNode("var y = 20;", ""));

        String data = script.data();
        Assert.assertEquals("var x = 10; a comment var y = 20;", data);
    }

    @Test
    public void classOperations_givenVariousScenarios_shouldManipulateCorrectly() {
        Element el = new Element("div");
        el.attr("class", "  first   second  ");
        Assert.assertEquals("first   second", el.className());

        Set<String> classes = el.classNames();
        Assert.assertEquals(2, classes.size());
        Assert.assertTrue(classes.contains("first"));
        Assert.assertTrue(classes.contains("second"));

        Set<String> newClasses = new LinkedHashSet<String>();
        newClasses.add("alpha");
        newClasses.add("beta");
        el.classNames(newClasses);
        Assert.assertEquals("alpha beta", el.className());

        Assert.assertTrue(el.hasClass("alpha"));
        Assert.assertTrue(el.hasClass("beta"));
        Assert.assertTrue(el.hasClass("ALPHA"));
        Assert.assertFalse(el.hasClass("gamma"));
        Assert.assertFalse(el.hasClass("alp"));

        el.addClass("gamma");
        Assert.assertTrue(el.hasClass("gamma"));

        el.removeClass("beta");
        Assert.assertFalse(el.hasClass("beta"));

        el.toggleClass("delta");
        Assert.assertTrue(el.hasClass("delta"));
        el.toggleClass("delta");
        Assert.assertFalse(el.hasClass("delta"));

        Element emptyClassEl = new Element("div");
        Assert.assertFalse(emptyClassEl.hasClass("any"));

        Element exactClassEl = new Element("div");
        exactClassEl.attr("class", "exact");
        Assert.assertTrue(exactClassEl.hasClass("exact"));
        Assert.assertFalse(exactClassEl.hasClass("other"));
    }

    @Test
    public void val_givenStandardInputAndTextarea_shouldGetAndSetValue() {
        Element input = new Element("input");
        input.val("testVal");
        Assert.assertEquals("testVal", input.attr("value"));
        Assert.assertEquals("testVal", input.val());

        Element textarea = new Element("textarea");
        textarea.val("content text");
        Assert.assertEquals("content text", textarea.text());
        Assert.assertEquals("content text", textarea.val());
    }

    @Test
    public void htmlAndOuterHtml_givenPrettyPrintAndSelfClosing_shouldRenderProperly() throws IOException {
        Element div = new Element("div");
        div.html("<p>Text</p><img src='foo.jpg'>");
        Assert.assertEquals("<p>Text</p>\n<img src=\"foo.jpg\">", div.html());

        StringWriter sw = new StringWriter();
        div.html(sw);
        Assert.assertEquals("<p>Text</p>\n<img src=\"foo.jpg\">", sw.toString());

        Element img = new Element(Tag.valueOf("img"), "");
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        StringBuilder accum = new StringBuilder();
        img.outerHtmlHead(accum, 0, settings);
        Assert.assertEquals("<img>", accum.toString());

        accum.setLength(0);
        settings.syntax(Document.OutputSettings.Syntax.xml);
        img.outerHtmlHead(accum, 0, settings);
        Assert.assertEquals("<img />", accum.toString());

        StringBuilder tailAccum = new StringBuilder();
        img.outerHtmlTail(tailAccum, 0, settings);
        Assert.assertEquals("", tailAccum.toString());

        Element blockDiv = new Element("div");
        blockDiv.appendElement("p").appendText("Child");
        StringBuilder blockTail = new StringBuilder();
        blockDiv.outerHtmlTail(blockTail, 0, new Document.OutputSettings().prettyPrint(true));
        Assert.assertEquals("\n</div>", blockTail.toString());
    }

    @Test
    public void clone_givenElementWithChildren_shouldCreateDeepCopy() {
        Element original = new Element("div");
        original.attr("id", "main");
        original.appendElement("p").appendText("Paragraph");

        Element cloned = original.clone();
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original.outerHtml(), cloned.outerHtml());

        cloned.attr("id", "clonedMain");
        Assert.assertEquals("main", original.id());
        Assert.assertEquals("clonedMain", cloned.id());

        cloned.child(0).text("Modified");
        Assert.assertEquals("Paragraph", original.child(0).text());
        Assert.assertEquals("Modified", cloned.child(0).text());
    }
}