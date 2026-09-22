package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ElementTest {

    // ==========================================
    // Phase 1: Test Matrix & Code Analysis
    // ------------------------------------------
    // 1. Constructors & Basic Getters/Setters
    //    - Element(Tag, baseUri, attributes): valid, null tag (IllegalArgumentException)
    //    - Element(Tag, baseUri): default attributes
    //    - nodeName(), tagName(), tagName(String): valid, empty tagName, whitespace tagName
    //    - tag(), isBlock(), id(), attr(k, v), dataset()
    // 2. Hierarchy & Navigation
    //    - parent(), parents(): no parent, standard parent, root (#root) boundary, deep hierarchy
    //    - child(index), children(), childNodes filtering for Element/TextNode/DataNode
    //    - textNodes(), dataNodes(): empty, mixed, unmodifiable enforcement
    // 3. Child Manipulation & Content Insertion
    //    - appendChild(Node), prependChild(Node): null checks, reparenting, sibling index
    //    - insertChildren(int, Collection): null collection, negative index calculation, out of bounds
    //    - appendElement(tag), prependElement(tag)
    //    - appendText(text), prependText(text)
    //    - append(html), prepend(html), before(html), before(node), after(html), after(node)
    //    - empty(), wrap(html)
    // 4. Siblings & Positional Traversal
    //    - siblingElements(): null parent (size 0), single child (size 0), multiple children
    //    - nextElementSibling(), previousElementSibling(): null parent, first, middle, last elements
    //    - firstElementSibling(), lastElementSibling(): size <= 1 returns null, multiple children
    //    - elementSiblingIndex(): null parent returns 0, correct index in parent
    // 5. Query & Selectors
    //    - select(query), cssSelector(): id present, class present, root/Document parent, nth-child disambiguation
    //    - getElementsByTag(tag): case-insensitivity, trim, empty/null validation
    //    - getElementById(id): found, not found, empty validation
    //    - getElementsByClass(class): empty validation, found, not found
    //    - getElementsByAttribute*(key, val): by attr, attr starting, val equals, not, starting, ending, containing, regex matching
    //    - getElementsByIndex*(index): less than, greater than, equals
    //    - getElementsContainingText / OwnText, getElementsMatchingText / OwnText (Pattern and String regex)
    //    - getAllElements()
    // 6. Text, Whitespace, & Data
    //    - text(): blank, block formatting space, <br> whitespace insertion, collapse whitespace
    //    - ownText(): direct text nodes only, <br> whitespace
    //    - preserveWhitespace(): pre/textarea elements vs standard elements
    //    - text(String): sets text node, clears previous children, null check
    //    - hasText(): empty, only whitespace text, nested elements with text
    //    - data(): script/style DataNodes retrieval
    // 7. Class Manipulation
    //    - className(), classNames(), classNames(Set): split on whitespace, remove empty
    //    - hasClass(name): empty attr, shorter attr, case-insensitive match, not found
    //    - addClass(name), removeClass(name), toggleClass(name)
    // 8. Form Values & HTML Serialization
    //    - val(), val(value): standard input vs textarea
    //    - outerHtmlHead/Tail: prettyPrint on/off, selfClosing syntax (html vs xml/void), block indent
    //    - html(), html(String): get inner html, set html
    // 9. Object Identity & Cloning
    //    - equals(Object), hashCode(), clone()
    // ==========================================

    @Test
    public void constructor_givenValidTagAndAttributes_shouldInitializeCorrectly() {
        Tag tag = Tag.valueOf("div");
        Attributes attrs = new Attributes();
        attrs.put("id", "main");
        attrs.put("data-test", "val");
        Element el = new Element(tag, "http://example.com", attrs);

        Assert.assertEquals("div", el.nodeName());
        Assert.assertEquals("div", el.tagName());
        Assert.assertEquals(tag, el.tag());
        Assert.assertTrue(el.isBlock());
        Assert.assertEquals("main", el.id());
        Assert.assertEquals("http://example.com", el.baseUri());
        Map<String, String> dataset = el.dataset();
        Assert.assertEquals("val", dataset.get("test"));
    }

    @Test
    public void constructor_givenTagAndBaseUriOnly_shouldInitializeWithEmptyAttributes() {
        Element el = new Element(Tag.valueOf("span"), "http://example.com");
        Assert.assertEquals("span", el.tagName());
        Assert.assertFalse(el.isBlock());
        Assert.assertEquals("", el.id());
        Assert.assertEquals(0, el.dataset().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullTag_shouldThrowException() {
        new Element(null, "http://example.com", new Attributes());
    }

    @Test
    public void tagName_givenNewValidTagName_shouldChangeTag() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("p");
        Assert.assertEquals("p", el.tagName());
        Assert.assertEquals("p", el.nodeName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenEmptyTagName_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void tagName_givenWhitespaceTagName_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.tagName("   ");
    }

    @Test
    public void attr_givenKeyValue_shouldSetAndReturnThis() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element returned = el.attr("title", "tooltip");
        Assert.assertSame(el, returned);
        Assert.assertEquals("tooltip", el.attr("title"));
    }

    @Test
    public void parent_givenNoParent_shouldReturnNull() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(el.parent());
    }

    @Test
    public void parents_givenHierarchy_shouldCollectParentsUntilRoot() {
        Document doc = Jsoup.parse("<div><p><span>Hello</span></p></div>");
        Element span = doc.select("span").first();
        Elements parents = span.parents();

        Assert.assertEquals(3, parents.size());
        Assert.assertEquals("p", parents.get(0).tagName());
        Assert.assertEquals("div", parents.get(1).tagName());
        Assert.assertEquals("body", parents.get(2).tagName());
    }

    @Test
    public void parents_givenNoParent_shouldReturnEmptyElements() {
        Element el = new Element(Tag.valueOf("div"), "");
        Elements parents = el.parents();
        Assert.assertEquals(0, parents.size());
    }

    @Test
    public void childAndChildren_givenMixedNodes_shouldReturnOnlyElements() {
        Element el = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("Text1", "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        TextNode t2 = new TextNode("Text2", "");
        Element c2 = new Element(Tag.valueOf("span"), "");

        el.appendChild(t1);
        el.appendChild(c1);
        el.appendChild(t2);
        el.appendChild(c2);

        Elements children = el.children();
        Assert.assertEquals(2, children.size());
        Assert.assertSame(c1, children.get(0));
        Assert.assertSame(c2, children.get(1));
        Assert.assertSame(c1, el.child(0));
        Assert.assertSame(c2, el.child(1));
    }

    @Test
    public void textNodes_givenMixedNodes_shouldReturnOnlyTextNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("First", "");
        Element c1 = new Element(Tag.valueOf("p"), "");
        TextNode t2 = new TextNode("Second", "");
        DataNode d1 = new DataNode("var x = 1;", "");

        el.appendChild(t1);
        el.appendChild(c1);
        el.appendChild(t2);
        el.appendChild(d1);

        List<TextNode> textNodes = el.textNodes();
        Assert.assertEquals(2, textNodes.size());
        Assert.assertSame(t1, textNodes.get(0));
        Assert.assertSame(t2, textNodes.get(1));

        try {
            textNodes.clear();
            Assert.fail("textNodes list must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected behavior
        }
    }

    @Test
    public void dataNodes_givenMixedNodes_shouldReturnOnlyDataNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        TextNode t1 = new TextNode("First", "");
        DataNode d1 = new DataNode("data content", "");

        el.appendChild(t1);
        el.appendChild(d1);

        List<DataNode> dataNodes = el.dataNodes();
        Assert.assertEquals(1, dataNodes.size());
        Assert.assertSame(d1, dataNodes.get(0));

        try {
            dataNodes.clear();
            Assert.fail("dataNodes list must be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // expected behavior
        }
    }

    @Test
    public void prependChild_givenNode_shouldInsertAtBeginning() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element child1 = new Element(Tag.valueOf("span"), "");
        Element child2 = new Element(Tag.valueOf("p"), "");

        el.appendChild(child1);
        el.prependChild(child2);

        Assert.assertEquals(2, el.children().size());
        Assert.assertSame(child2, el.child(0));
        Assert.assertSame(child1, el.child(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendChild_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendChild(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void prependChild_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.prependChild(null);
    }

    @Test
    public void insertChildren_givenValidIndexAndCollection_shouldInsertCorrectly() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        Element c = new Element(Tag.valueOf("c"), "");
        Element d = new Element(Tag.valueOf("d"), "");

        el.appendChild(a);
        el.appendChild(d);

        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(b);
        toInsert.add(c);

        el.insertChildren(1, toInsert);

        Assert.assertEquals(4, el.children().size());
        Assert.assertSame(a, el.child(0));
        Assert.assertSame(b, el.child(1));
        Assert.assertSame(c, el.child(2));
        Assert.assertSame(d, el.child(3));
    }

    @Test
    public void insertChildren_givenNegativeIndex_shouldCalculateFromEnd() {
        Element el = new Element(Tag.valueOf("div"), "");
        Element a = new Element(Tag.valueOf("a"), "");
        Element b = new Element(Tag.valueOf("b"), "");
        el.appendChild(a);
        el.appendChild(b);

        Element c = new Element(Tag.valueOf("c"), "");
        List<Node> toInsert = new ArrayList<Node>();
        toInsert.add(c);

        // currentSize = 2. index = -1 -> index += 2 + 1 = 2 (appended at end)
        el.insertChildren(-1, toInsert);
        Assert.assertEquals(3, el.children().size());
        Assert.assertSame(c, el.child(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenOutOfBoundsIndex_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.insertChildren(1, new ArrayList<Node>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertChildren_givenNullCollection_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.insertChildren(0, null);
    }

    @Test
    public void appendAndPrependElement_givenValidTags_shouldCreateAndAddElements() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        Element p = el.appendElement("p");
        Element span = el.prependElement("span");

        Assert.assertEquals(2, el.children().size());
        Assert.assertSame(span, el.child(0));
        Assert.assertSame(p, el.child(1));
        Assert.assertEquals("http://example.com", p.baseUri());
    }

    @Test
    public void appendAndPrependText_givenStrings_shouldAddTextNodes() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.appendText("World");
        el.prependText("Hello ");

        Assert.assertEquals("Hello World", el.text());
        Assert.assertEquals(2, el.textNodes().size());
    }

    @Test
    public void appendAndPrependHtml_givenHtmlString_shouldParseAndAdd() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com");
        el.append("<p>Append</p>");
        el.prepend("<span>Prepend</span>");

        Assert.assertEquals(2, el.children().size());
        Assert.assertEquals("span", el.child(0).tagName());
        Assert.assertEquals("p", el.child(1).tagName());
    }

    @Test
    public void beforeAndAfter_givenNodesAndHtml_shouldInsertRelative() {
        Document doc = Jsoup.parse("<div><p id='target'>Target</p></div>");
        Element target = doc.getElementById("target");

        target.before("<span>BeforeHtml</span>");
        target.after("<span>AfterHtml</span>");
        Element beforeNode = new Element(Tag.valueOf("b"), "");
        Element afterNode = new Element(Tag.valueOf("i"), "");
        target.before(beforeNode);
        target.after(afterNode);

        Element div = doc.select("div").first();
        Assert.assertEquals(5, div.children().size());
        Assert.assertEquals("span", div.child(0).tagName());
        Assert.assertEquals("b", div.child(1).tagName());
        Assert.assertEquals("p", div.child(2).tagName());
        Assert.assertEquals("i", div.child(3).tagName());
        Assert.assertEquals("span", div.child(4).tagName());
    }

    @Test
    public void empty_givenChildren_shouldRemoveAllChildNodes() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span");
        el.appendText("Text");
        Assert.assertEquals(2, el.childNodes.size());

        Element returned = el.empty();
        Assert.assertSame(el, returned);
        Assert.assertEquals(0, el.childNodes.size());
    }

    @Test
    public void wrap_givenHtml_shouldWrapElement() {
        Document doc = Jsoup.parse("<div id='wrapMe'>Content</div>");
        Element el = doc.getElementById("wrapMe");
        el.wrap("<section class='container'></section>");

        Element parent = el.parent();
        Assert.assertEquals("section", parent.tagName());
        Assert.assertEquals("container", parent.className());
    }

    @Test
    public void cssSelector_givenVariousHierarchies_shouldGenerateCorrectSelector() {
        Document doc = Jsoup.parse("<div id='rootDiv'><p class='intro'>First</p><p class='intro'>Second</p></div>");
        Element rootDiv = doc.getElementById("rootDiv");
        Element firstP = doc.select("p").get(0);
        Element secondP = doc.select("p").get(1);

        Assert.assertEquals("#rootDiv", rootDiv.cssSelector());
        Assert.assertEquals("#rootDiv > p.intro:nth-child(1)", firstP.cssSelector());
        Assert.assertEquals("#rootDiv > p.intro:nth-child(2)", secondP.cssSelector());

        Element standalone = new Element(Tag.valueOf("div"), "");
        standalone.addClass("my-class");
        Assert.assertEquals("div.my-class", standalone.cssSelector());
    }

    @Test
    public void siblingElements_givenNoParent_shouldReturnEmpty() {
        Element el = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(0, el.siblingElements().size());
    }

    @Test
    public void siblingElements_givenParentWithMultipleChildren_shouldReturnOtherElements() {
        Document doc = Jsoup.parse("<div><span id='s1'></span><span id='s2'></span><span id='s3'></span></div>");
        Element s2 = doc.getElementById("s2");
        Elements siblings = s2.siblingElements();

        Assert.assertEquals(2, siblings.size());
        Assert.assertEquals("s1", siblings.get(0).id());
        Assert.assertEquals("s3", siblings.get(1).id());
    }

    @Test
    public void nextElementSibling_givenVariousPositions_shouldReturnCorrectSibling() {
        Element standalone = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(standalone.nextElementSibling());

        Document doc = Jsoup.parse("<div><a id='a'></a><b id='b'></b><c id='c'></c></div>");
        Element a = doc.getElementById("a");
        Element b = doc.getElementById("b");
        Element c = doc.getElementById("c");

        Assert.assertSame(b, a.nextElementSibling());
        Assert.assertSame(c, b.nextElementSibling());
        Assert.assertNull(c.nextElementSibling());
    }

    @Test
    public void previousElementSibling_givenVariousPositions_shouldReturnCorrectSibling() {
        Element standalone = new Element(Tag.valueOf("div"), "");
        Assert.assertNull(standalone.previousElementSibling());

        Document doc = Jsoup.parse("<div><a id='a'></a><b id='b'></b><c id='c'></c></div>");
        Element a = doc.getElementById("a");
        Element b = doc.getElementById("b");
        Element c = doc.getElementById("c");

        Assert.assertNull(a.previousElementSibling());
        Assert.assertSame(a, b.previousElementSibling());
        Assert.assertSame(b, c.previousElementSibling());
    }

    @Test
    public void firstAndLastElementSibling_givenChildren_shouldReturnFirstAndLastOrNull() {
        Document doc = Jsoup.parse("<div><p id='only'></p></div>");
        Element only = doc.getElementById("only");
        Assert.assertNull(only.firstElementSibling());
        Assert.assertNull(only.lastElementSibling());

        Document multiDoc = Jsoup.parse("<div><p id='p1'></p><p id='p2'></p><p id='p3'></p></div>");
        Element p2 = multiDoc.getElementById("p2");
        Assert.assertEquals("p1", p2.firstElementSibling().id());
        Assert.assertEquals("p3", p2.lastElementSibling().id());
    }

    @Test
    public void elementSiblingIndex_givenElement_shouldReturnIndex() {
        Element standalone = new Element(Tag.valueOf("div"), "");
        Assert.assertEquals(Integer.valueOf(0), standalone.elementSiblingIndex());

        Document doc = Jsoup.parse("<div><p id='p0'></p><p id='p1'></p></div>");
        Assert.assertEquals(Integer.valueOf(0), doc.getElementById("p0").elementSiblingIndex());
        Assert.assertEquals(Integer.valueOf(1), doc.getElementById("p1").elementSiblingIndex());
    }

    @Test
    public void getElementsByTag_givenTag_shouldFindMatchingElements() {
        Document doc = Jsoup.parse("<div><p>P1</p><div><P>P2</P></div></div>");
        Elements pTags = doc.getElementsByTag("p");
        Assert.assertEquals(2, pTags.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByTag_givenEmptyTag_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByTag("");
    }

    @Test
    public void getElementById_givenExistingAndNonExistingId_shouldReturnElementOrNull() {
        Document doc = Jsoup.parse("<div id='target'>Found</div>");
        Element el = doc.getElementById("target");
        Assert.assertNotNull(el);
        Assert.assertEquals("Found", el.text());

        Element notFound = doc.getElementById("missing");
        Assert.assertNull(notFound);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementById_givenEmptyId_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementById("");
    }

    @Test
    public void getElementsByClass_givenClassName_shouldReturnMatchingElements() {
        Document doc = Jsoup.parse("<div class='one two'></div><p class='two'></p><span class='three'></span>");
        Elements twoElements = doc.getElementsByClass("two");
        Assert.assertEquals(2, twoElements.size());
    }

    @Test
    public void getElementsByAttributeQueries_givenVariousAttributes_shouldReturnMatches() {
        Document doc = Jsoup.parse("<a href='http://jsoup.org' data-type='link' target='_blank'></a>"
                + "<a href='ftp://example.com' data-type='ftp'></a>");

        Assert.assertEquals(2, doc.getElementsByAttribute("href").size());
        Assert.assertEquals(2, doc.getElementsByAttributeStarting("data-").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValue("data-type", "link").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueNot("data-type", "link").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueStarting("href", "http").size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueEnding("href", ".org").size());
        Assert.assertEquals(2, doc.getElementsByAttributeValueContaining("href", "://").size());

        Pattern p = Pattern.compile("^http.*");
        Assert.assertEquals(1, doc.getElementsByAttributeValueMatching("href", p).size());
        Assert.assertEquals(1, doc.getElementsByAttributeValueMatching("href", "^http.*").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsByAttributeValueMatching_givenInvalidRegex_shouldThrowIllegalArgumentException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsByAttributeValueMatching("class", "[unclosed");
    }

    @Test
    public void getElementsByIndexQueries_givenIndexBounds_shouldReturnElements() {
        Document doc = Jsoup.parse("<ul><li>0</li><li>1</li><li>2</li><li>3</li></ul>");
        Element ul = doc.select("ul").first();

        Assert.assertEquals(2, ul.getElementsByIndexLessThan(2).size());
        Assert.assertEquals(2, ul.getElementsByIndexGreaterThan(1).size());
        Assert.assertEquals(1, ul.getElementsByIndexEquals(1).size());
    }

    @Test
    public void getElementsMatchingTextQueries_givenTextAndRegex_shouldFilterCorrectly() {
        Document doc = Jsoup.parse("<div><p>Apple Banana</p><p>Cherry</p></div>");

        Assert.assertEquals(1, doc.getElementsContainingText("Apple").size());
        Assert.assertEquals(1, doc.getElementsContainingOwnText("Cherry").size());
        Assert.assertEquals(1, doc.getElementsMatchingText(Pattern.compile("Apple.*")).size());
        Assert.assertEquals(1, doc.getElementsMatchingText("Apple.*").size());
        Assert.assertEquals(1, doc.getElementsMatchingOwnText(Pattern.compile("Cherry")).size());
        Assert.assertEquals(1, doc.getElementsMatchingOwnText("Cherry").size());
        Assert.assertEquals(3, doc.getAllElements().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingText_givenInvalidRegex_shouldThrowIllegalArgumentException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingText("[bad regex");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementsMatchingOwnText_givenInvalidRegex_shouldThrowIllegalArgumentException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.getElementsMatchingOwnText("[bad regex");
    }

    @Test
    public void text_givenNestedElementsAndBlocks_shouldFormatWithSpaces() {
        Document doc = Jsoup.parse("<div>First<br>Second<p>Third</p>Fourth</div>");
        Assert.assertEquals("First Second Third Fourth", doc.select("div").first().text());
    }

    @Test
    public void ownText_givenNestedChildren_shouldOnlyReturnDirectText() {
        Document doc = Jsoup.parse("<div>Parent text <p>Child text</p> more parent<br>after br</div>");
        Element div = doc.select("div").first();
        Assert.assertEquals("Parent text more parent after br", div.ownText());
    }

    @Test
    public void text_givenPreElement_shouldPreserveWhitespace() {
        Document doc = Jsoup.parse("<pre>  line 1  \n  line 2  </pre>");
        Element pre = doc.select("pre").first();
        Assert.assertEquals("  line 1  \n  line 2  ", pre.text());
        Assert.assertTrue(Element.preserveWhitespace(pre));
    }

    @Test
    public void preserveWhitespace_givenNonElementNodeOrNull_shouldReturnFalse() {
        Assert.assertFalse(Element.preserveWhitespace(null));
        Assert.assertFalse(Element.preserveWhitespace(new TextNode("text", "")));
    }

    @Test
    public void text_givenNewText_shouldReplaceAllChildren() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.appendElement("span").text("old child");
        Assert.assertEquals(1, el.children().size());

        Element returned = el.text("new text");
        Assert.assertSame(el, returned);
        Assert.assertEquals("new text", el.text());
        Assert.assertEquals(0, el.children().size());
        Assert.assertEquals(1, el.textNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void text_givenNull_shouldThrowException() {
        Element el = new Element(Tag.valueOf("div"), "");
        el.text(null);
    }

    @Test
    public void hasText_givenEmptyOrWhitespaceOrValidContent_shouldReturnExpectedBoolean() {
        Element empty = new Element(Tag.valueOf("div"), "");
        Assert.assertFalse(empty.hasText());

        Element whitespaceOnly = new Element(Tag.valueOf("div"), "");
        whitespaceOnly.appendText("   ");
        Assert.assertFalse(whitespaceOnly.hasText());

        Element withText = new Element(Tag.valueOf("div"), "");
        withText.appendText("content");
        Assert.assertTrue(withText.hasText());

        Element nested = new Element(Tag.valueOf("div"), "");
        Element child = nested.appendElement("p");
        child.appendText("nested text");
        Assert.assertTrue(nested.hasText());
    }

    @Test
    public void data_givenScriptAndStyleTags_shouldRetrieveDataNodes() {
        Document doc = Jsoup.parse("<script>var x = 10;</script><style>body { color: red; }</style>");
        Element script = doc.select("script").first();
        Element style = doc.select("style").first();

        Assert.assertEquals("var x = 10;", script.data());
        Assert.assertEquals("body { color: red; }", style.data());
    }

    @Test
    public void classMethods_givenVariousClass