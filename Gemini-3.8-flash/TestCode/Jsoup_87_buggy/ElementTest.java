package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class ElementTest {

    @Test
    public void constructor_givenTagName_shouldInitializeCorrectly() {
        Element el = new Element("div");
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("", el.baseUri());
        Assert.assertEquals(0, el.childNodeSize());
        Assert.assertTrue(el.attributes() != null);
    }

    @Test
    public void constructor_givenTagAndBaseUri_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("p");
        Element el = new Element(tag, "http://example.com");
        Assert.assertEquals("p", el.tagName());
        Assert.assertEquals("http://example.com", el.baseUri());
        Assert.assertEquals(0, el.childNodeSize());
    }

    @Test
    public void constructor_givenNullAttributes_shouldInitializeLazy() {
        Tag tag = Tag.valueOf("span");
        Element el = new Element(tag, "http://example.com", null);
        Assert.assertFalse(el.hasAttributes());
        Assert.assertNotNull(el.attributes());
        Assert.assertTrue(el.hasAttributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com", new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullBaseUri_shouldThrowException() {
        new Element(Tag.valueOf("div"), null, new Attributes());
    }

    @Test
    public void baseUri_givenNewBaseUri_shouldUpdate() {
        Element el = new Element("div");
        el.doSetBaseUri("http://foo.com");
        Assert.assertEquals("http://foo.com", el.baseUri());
    }

    @Test
    public void tagName_givenValidNewName_shouldUpdateTag() {
        Element el = new Element("div");
        el.tagName("span");
        Assert.assertEquals("span", el.tagName());
        Assert.assertEquals("span", el.tag().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element el = new Element("div");
        el.tagName("");
    }

    @Test
    public void isBlock_givenBlockAndInlineTags_shouldReturnExpected() {
        Element div = new Element("div");
        Assert.assertTrue(div.isBlock());
        Element span = new Element("span");
        Assert.assertFalse(span.isBlock());
    }

    @Test
    public void id_and_attr_shouldSetAndGetCorrectly() {
        Element el = new Element("div");
        Assert.assertEquals("", el.id());

        el.attr("id", "myId");
        Assert.assertEquals("myId", el.id());

        el.attr("disabled", true);
        Assert.assertTrue(el.hasAttr("disabled"));

        el.attr("disabled", false);
        Assert.assertFalse(el.hasAttr("disabled"));
    }

    @Test
    public void dataset_shouldExposeDataAttributes() {
        Element el = new Element("div");
        el.attr("data-role", "admin");
        Map<String, String> data = el.dataset();
        Assert.assertEquals("admin", data.get("role"));
    }

    @Test
    public void parentAndParents_shouldReturnAncestors() {
        Element parent = new Element("div");
        Element child = new Element("p");
        Element grandChild = new Element("span");

        parent.appendChild(child);
        child.appendChild(grandChild);

        Assert.assertEquals(child, grandChild.parent());
        Assert.assertEquals(parent, child.parent());

        Elements parents = grandChild.parents();
        Assert.assertEquals(2, parents.size());
        Assert.assertEquals(child, parents.get(0));
        Assert.assertEquals(parent, parents.get(1));
    }

    @Test
    public void parents_withRootElement_shouldStopAtRoot() {
        Element root = new Element("#root");
        Element child = new Element("div");
        root.appendChild(child);

        Elements parents = child.parents();
        Assert.assertEquals(0, parents.size());
    }

    @Test
    public void childAndChildren_shouldRetrieveChildElementsOnly() {
        Element parent = new Element("div");
        TextNode text1 = new TextNode("text1");
        Element child1 = new Element("p");
        TextNode text2 = new TextNode("text2");
        Element child2 = new Element("span");

        parent.appendChild(text1);
        parent.appendChild(child1);
        parent.appendChild(text2);
        parent.appendChild(child2);

        Assert.assertEquals(4, parent.childNodeSize());
        Assert.assertEquals(2, parent.children().size());
        Assert.assertEquals(child1, parent.child(0));
        Assert.assertEquals(child2, parent.child(1));
    }

    @Test
    public void textNodesAndDataNodes_shouldFilterByType() {
        Element parent = new Element("script");
        TextNode tNode = new TextNode("Hello");
        DataNode dNode = new DataNode("var x = 10;");

        parent.appendChild(tNode);
        parent.appendChild(dNode);

        List<TextNode> textNodes = parent.textNodes();
        Assert.assertEquals(1, textNodes.size());
        Assert.assertEquals("Hello", textNodes.get(0).getWholeText());

        List<DataNode> dataNodes = parent.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertEquals("var x = 10;", dataNodes.get(0).getWholeData());
    }

    @Test
    public void selectAndIs_givenQuery_shouldEvaluate() {
        Element root = new Element("div");
        Element child = root.appendElement("span");
        child.attr("id", "target");

        Elements result = root.select("#target");
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(child, result.get(0));

        Element first = root.selectFirst("#target");
        Assert.assertEquals(child, first);

        Assert.assertTrue(child.is("#target"));
        Assert.assertFalse(child.is("div"));
        Assert.assertTrue(child.is(new Evaluator.Id("target")));
    }

    @Test
    public void appendTo_shouldAppendToTargetParent() {
        Element parent = new Element("div");
        Element child = new Element("span");
        Element returned = child.appendTo(parent);

        Assert.assertEquals(child, returned);
        Assert.assertEquals(parent, child.parent());
        Assert.assertEquals(1, parent.children().size());
    }

    @Test
    public void prependChild_shouldAddAtBeginning() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");

        parent.appendChild(child1);
        parent.prependChild(child2);

        Assert.assertEquals(child2, parent.child(0));
        Assert.assertEquals(child1, parent.child(1));
    }

    @Test
    public void insertChildren_collectionAndVarargs_shouldSupportPositiveAndNegativeIndices() {
        Element parent = new Element("div");
        Element child1 = new Element("a");
        Element child2 = new Element("b");
        Element child3 = new Element("c");
        parent.appendChild(child1);
        parent.appendChild(child3);

        List<Node> collection = new ArrayList<Node>();
        collection.add(child2);
        parent.insertChildren(1, collection);

        Assert.assertEquals(3, parent.childNodeSize());
        Assert.assertEquals("a", ((Element) parent.childNode(0)).tagName());
        Assert.assertEquals("b", ((Element) parent.childNode(1)).tagName());
        Assert.assertEquals("c", ((Element) parent.childNode(2)).tagName());

        Element child0 = new Element("z");
        parent.insertChildren(-4, child0);
        Assert.assertEquals("z", ((Element) parent.childNode(0)).tagName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNull_shouldThrowException() {
        Element parent = new Element("div");
        parent.insertChildren(0, (Node[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element parent = new Element("div");
        parent.insertChildren(5, new Element("p"));
    }

    @Test
    public void appendAndPrependMethods_shouldCreateAndAddNodes() {
        Element parent = new Element("div");
        Element p = parent.appendElement("p");
        Assert.assertEquals("p", p.tagName());
        Assert.assertEquals(parent, p.parent());

        Element span = parent.prependElement("span");
        Assert.assertEquals("span", span.tagName());
        Assert.assertEquals(0, span.siblingIndex());

        parent.appendText(" appended text ");
        parent.prependText(" prepended text ");

        Assert.assertTrue(parent.childNode(0) instanceof TextNode);
        Assert.assertEquals(" prepended text ", ((TextNode) parent.childNode(0)).getWholeText());
    }

    @Test
    public void appendAndPrependHtml_shouldParseFragmentIntoChildren() {
        Element parent = new Element("div");
        parent.append("<p>Paragraph</p>");
        Assert.assertEquals(1, parent.children().size());
        Assert.assertEquals("p", parent.child(0).tagName());

        parent.prepend("<span>Span</span>");
        Assert.assertEquals(2, parent.children().size());
        Assert.assertEquals("span", parent.child(0).tagName());
    }

    @Test
    public void beforeAndAfter_shouldInsertSiblings() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");

        child.before("<p>Before Html</p>");
        child.before(new Element("b"));
        child.after("<i>After Html</i>");
        child.after(new Element("u"));

        Assert.assertEquals(5, parent.childNodeSize());
        Assert.assertEquals("p", ((Element) parent.childNode(0)).tagName());
        Assert.assertEquals("b", ((Element) parent.childNode(1)).tagName());
        Assert.assertEquals("span", ((Element) parent.childNode(2)).tagName());
        Assert.assertEquals("u", ((Element) parent.childNode(3)).tagName());
        Assert.assertEquals("i", ((Element) parent.childNode(4)).tagName());
    }

    @Test
    public void empty_shouldClearAllChildren() {
        Element parent = new Element("div");
        parent.appendElement("span");
        parent.appendText("Text");
        Assert.assertEquals(2, parent.childNodeSize());

        Element returned = parent.empty();
        Assert.assertEquals(parent, returned);
        Assert.assertEquals(0, parent.childNodeSize());
    }

    @Test
    public void wrap_shouldWrapElementInContainer() {
        Element parent = new Element("div");
        Element child = parent.appendElement("span");
        child.wrap("<div class='wrapper'></div>");

        Assert.assertEquals("div", parent.child(0).tagName());
        Assert.assertEquals("wrapper", parent.child(0).className());
        Assert.assertEquals(child, parent.child(0).child(0));
    }

    @Test
    public void cssSelector_shouldGenerateValidSelector() {
        Element div = new Element("div");
        div.attr("id", "main");
        Assert.assertEquals("#main", div.cssSelector());

        Element child = div.appendElement("span");
        child.addClass("item");
        Assert.assertEquals("#main > span.item", child.cssSelector());

        Element child2 = div.appendElement("span");
        child2.addClass("item");
        Assert.assertEquals("#main > span.item:nth-child(2)", child2.cssSelector());
    }

    @Test
    public void siblingNavigation_shouldReturnCorrectSiblings() {
        Element parent = new Element("div");
        Element c1 = parent.appendElement("p");
        Element c2 = parent.appendElement("span");
        Element c3 = parent.appendElement("b");

        Assert.assertEquals(2, c1.siblingElements().size());
        Assert.assertNull(c1.previousElementSibling());
        Assert.assertEquals(c2, c1.nextElementSibling());

        Assert.assertEquals(c1, c2.previousElementSibling());
        Assert.assertEquals(c3, c2.nextElementSibling());

        Assert.assertEquals(c2, c3.previousElementSibling());
        Assert.assertNull(c3.nextElementSibling());

        Assert.assertEquals(c1, c2.firstElementSibling());
        Assert.assertEquals(c3, c2.lastElementSibling());
        Assert.assertEquals(1, c2.elementSiblingIndex());

        Elements nextSiblings = c1.nextElementSiblings();
        Assert.assertEquals(2, nextSiblings.size());
        Assert.assertEquals(c2, nextSiblings.get(0));

        Elements prevSiblings = c3.previousElementSiblings();
        Assert.assertEquals(2, prevSiblings.size());
        Assert.assertEquals(c2, prevSiblings.get(0));
    }

    @Test
    public void siblingNavigation_orphanElement_shouldHandleNullGracefully() {
        Element orphan = new Element("div");
        Assert.assertEquals(0, orphan.siblingElements().size());
        Assert.assertNull(orphan.nextElementSibling());
        Assert.assertNull(orphan.previousElementSibling());
        Assert.assertEquals(0, orphan.nextElementSiblings().size());
        Assert.assertEquals(0, orphan.previousElementSiblings().size());
        Assert.assertEquals(0, orphan.elementSiblingIndex());
    }

    @Test
    public void getElementsByMethods_shouldCollectMatchingElements() {
        Element root = new Element("div");
        Element child1 = root.appendElement("p");
        child1.attr("id", "first");
        child1.attr("data-test", "val1");
        child1.addClass("highlight");
        child1.text("Hello World");

        Element child2 = root.appendElement("a");
        child2.attr("id", "second");
        child2.attr("data-test", "val2");
        child2.addClass("link");
        child2.text("Jsoup link");

        Assert.assertEquals(1, root.getElementsByTag("p").size());
        Assert.assertEquals(child1, root.getElementById("first"));
        Assert.assertNull(root.getElementById("non-existent"));
        Assert.assertEquals(1, root.getElementsByClass("highlight").size());
        Assert.assertEquals(2, root.getElementsByAttribute("data-test").size());
        Assert.assertEquals(2, root.getElementsByAttributeStarting("data-").size());
        Assert.assertEquals(1, root.getElementsByAttributeValue("data-test", "val1").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueNot("data-test", "val1").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueStarting("data-test", "val").size());
        Assert.assertEquals(1, root.getElementsByAttributeValueEnding("data-test", "1").size());
        Assert.assertEquals(2, root.getElementsByAttributeValueContaining("data-test", "al").size());

        Pattern pattern = Pattern.compile("val[0-9]");
        Assert.assertEquals(2, root.getElementsByAttributeValueMatching("data-test", pattern).size());
        Assert.assertEquals(2, root.getElementsByAttributeValueMatching("data-test", "val[0-9]").size());

        Assert.assertEquals(1, root.getElementsByIndexLessThan(1).size());
        Assert.assertEquals(1, root.getElementsByIndexGreaterThan(0).size());
        Assert.assertEquals(1, root.getElementsByIndexEquals(0).size());

        Assert.assertEquals(2, root.getElementsContainingText("Hello").size());
        Assert.assertEquals(1, root.getElementsContainingOwnText("Hello").size());

        Assert.assertEquals(2, root.getElementsMatchingText(".*Hello.*").size());
        Assert.assertEquals(2, root.getElementsMatchingText(Pattern.compile(".*Hello.*")).size());

        Assert.assertEquals(1, root.getElementsMatchingOwnText(".*Hello.*").size());
        Assert.assertEquals(1, root.getElementsMatchingOwnText(Pattern.compile(".*Hello.*")).size());

        Assert.assertEquals(3, root.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowException() {
        Element el = new Element("div");
        el.getElementsByAttributeValueMatching("test", "[invalid");
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
    public void textAndWholeTextAndOwnText_shouldHandleWhitespaceAndNodes() {
        Element div = new Element("div");
        div.appendText("  Hello  ");
        Element p = div.appendElement("p");
        p.appendText("World");
        div.appendElement("br");
        div.appendText("Again");

        Assert.assertEquals("Hello World Again", div.text());
        Assert.assertEquals("  Hello  WorldAgain", div.wholeText());
        Assert.assertEquals("Hello Again", div.ownText());
        Assert.assertTrue(div.hasText());

        Element emptyDiv = new Element("div");
        Assert.assertFalse(emptyDiv.hasText());
        Assert.assertEquals("", emptyDiv.text());
        Assert.assertEquals("", emptyDiv.ownText());

        div.text("Replaced");
        Assert.assertEquals("Replaced", div.text());
    }

    @Test
    public void preserveWhitespace_givenPreTag_shouldPreserveSpaces() {
        Element pre = new Element("pre");
        pre.appendText("   line 1\n   line 2   ");
        Assert.assertEquals("   line 1\n   line 2   ", pre.text());
    }

    @Test
    public void data_shouldConcatenateSpecialDataNodes() {
        Element script = new Element("script");
        script.appendChild(new DataNode("var x = 1;"));
        script.appendChild(new Comment(" a comment "));
        script.appendChild(new CDataNode("cdata content"));

        Element nested = script.appendElement("nested");
        nested.appendChild(new DataNode("nested data;"));

        Assert.assertEquals("var x = 1; a comment cdata contentnested data;", script.data());
    }

    @Test
    public void classManipulationMethods_shouldOperateAccurately() {
        Element el = new Element("div");
        el.attr("class", "  btn   btn-primary  ");

        Assert.assertEquals("btn   btn-primary", el.className());
        Set<String> classNames = el.classNames();
        Assert.assertEquals(2, classNames.size());
        Assert.assertTrue(classNames.contains("btn"));
        Assert.assertTrue(classNames.contains("btn-primary"));

        Assert.assertTrue(el.hasClass("btn"));
        Assert.assertTrue(el.hasClass("btn-primary"));
        Assert.assertFalse(el.hasClass("primary"));

        el.addClass("active");
        Assert.assertTrue(el.hasClass("active"));

        el.removeClass("btn");
        Assert.assertFalse(el.hasClass("btn"));
        Assert.assertTrue(el.hasClass("btn-primary"));

        el.toggleClass("active");
        Assert.assertFalse(el.hasClass("active"));
        el.toggleClass("active");
        Assert.assertTrue(el.hasClass("active"));

        Set<String> emptyClasses = Collections.emptySet();
        el.classNames(emptyClasses);
        Assert.assertFalse(el.hasAttr("class"));
    }

    @Test
    public void hasClass_boundaryConditions_shouldBehaveCorrectly() {
        Element el = new Element("div");
        Assert.assertFalse(el.hasClass("any"));

        el.attr("class", "a");
        Assert.assertTrue(el.hasClass("a"));
        Assert.assertFalse(el.hasClass("aa"));
        Assert.assertFalse(el.hasClass("b"));

        el.attr("class", "abc def ghi");
        Assert.assertTrue(el.hasClass("abc"));
        Assert.assertTrue(el.hasClass("def"));
        Assert.assertTrue(el.hasClass("ghi"));
        Assert.assertFalse(el.hasClass("de"));
    }

    @Test
    public void val_inputAndTextarea_shouldGetAndSetCorrectly() {
        Element input = new Element("input");
        input.val("user");
        Assert.assertEquals("user", input.val());
        Assert.assertEquals("user", input.attr("value"));

        Element textarea = new Element("textarea");
        textarea.val("content");
        Assert.assertEquals("content", textarea.val());
        Assert.assertEquals("content", textarea.text());
    }

    @Test
    public void outerHtml_blockAndInlineAndSelfClosing_shouldFormatCorrectly() throws IOException {
        Element img = new Element(Tag.valueOf("img"), "");
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, settings);
        img.outerHtmlTail(sb, 0, settings);
        Assert.assertEquals("<img>", sb.toString());

        settings.syntax(Document.OutputSettings.Syntax.xml);
        sb = new StringBuilder();
        img.outerHtmlHead(sb, 0, settings);
        img.outerHtmlTail(sb, 0, settings);
        Assert.assertEquals("<img />", sb.toString());

        Element div = new Element("div");
        div.appendElement("span").text("inner");
        String html = div.outerHtml();
        Assert.assertTrue(html.contains("<div>"));
        Assert.assertTrue(html.contains("<span>inner</span>"));
        Assert.assertTrue(html.contains("</div>"));
    }

    @Test
    public void html_getAndSet_shouldUpdateChildNodes() {
        Element div = new Element("div");
        div.html("<p>Hello <b>World</b></p>");

        Assert.assertEquals(1, div.children().size());
        Assert.assertEquals("p", div.child(0).tagName());
        Assert.assertEquals("<p>Hello <b>World</b></p>", div.html());
    }

    @Test
    public void cloneAndShallowClone_shouldProduceAccurateCopies() {
        Element parent = new Element("div");
        parent.attr("id", "root");
        Element child = parent.appendElement("span");
        child.text("child text");

        Element deepClone = parent.clone();
        Assert.assertNotSame(parent, deepClone);
        Assert.assertEquals(parent.id(), deepClone.id());
        Assert.assertEquals(1, deepClone.children().size());
        Assert.assertEquals("child text", deepClone.child(0).text());
        Assert.assertNotSame(child, deepClone.child(0));

        Element shallow = parent.shallowClone();
        Assert.assertNotSame(parent, shallow);
        Assert.assertEquals(parent.id(), shallow.id());
        Assert.assertEquals(0, shallow.childNodeSize());
    }
}