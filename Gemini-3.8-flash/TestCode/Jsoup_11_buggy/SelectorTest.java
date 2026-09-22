package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectorTest {

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNullQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");

        // Act
        Selector.select((String) null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");

        // Act
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenWhitespaceQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");

        // Act
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNullRoot_shouldThrowException() {
        // Arrange & Act
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNullRootsIterable_shouldThrowException() {
        // Arrange & Act
        Selector.select("div", (Iterable<Element>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyQueryOnIterableRoots_shouldThrowException() {
        // Arrange
        List<Element> roots = new ArrayList<Element>();
        roots.add(Jsoup.parse("<div></div>"));

        // Act
        Selector.select("", roots);
    }

    @Test
    public void select_givenIterableRoots_shouldAggregateMatchingElements() {
        // Arrange
        Document doc1 = Jsoup.parse("<div><p class='intro'>First</p></div>");
        Document doc2 = Jsoup.parse("<div><p class='intro'>Second</p></div>");
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc1.body());
        roots.add(doc2.body());

        // Act
        Elements results = Selector.select("p.intro", roots);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("First", results.get(0).text());
        Assert.assertEquals("Second", results.get(1).text());
    }

    @Test
    public void select_givenTagSelector_shouldReturnMatchingTags() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><span>Three</span></div>");

        // Act
        Elements results = Selector.select("p", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("One", results.get(0).text());
        Assert.assertEquals("Two", results.get(1).text());
    }

    @Test
    public void select_givenIdSelector_shouldReturnMatchingElement() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='foo'>Bar</p><p id='baz'>Qux</p></div>");

        // Act
        Elements results = Selector.select("#foo", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Bar", results.first().text());
    }

    @Test
    public void select_givenNonExistingId_shouldReturnEmpty() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='foo'>Bar</p></div>");

        // Act
        Elements results = Selector.select("#notFound", doc);

        // Assert
        Assert.assertTrue(results.isEmpty());
    }

    @Test
    public void select_givenClassSelector_shouldReturnMatchingElements() {
        // Arrange
        Document doc = Jsoup.parse("<div class='item'>A</div><div class='item other'>B</div><div>C</div>");

        // Act
        Elements results = Selector.select(".item", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("A", results.get(0).text());
        Assert.assertEquals("B", results.get(1).text());
    }

    @Test
    public void select_givenAllElementsSelector_shouldReturnAll() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>A</p></div>");

        // Act
        Elements results = Selector.select("*", doc.body());

        // Assert
        // body + div + p = 3
        Assert.assertEquals(3, results.size());
    }

    @Test
    public void select_givenNamespacedTagSelector_shouldHandlePipeSyntax() {
        // Arrange
        Document doc = Jsoup.parse("<fb:name>John Doe</fb:name>");

        // Act
        Elements results = Selector.select("fb|name", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("John Doe", results.first().text());
    }

    @Test
    public void select_givenAttributeKeyOnly_shouldReturnMatchingElements() {
        // Arrange
        Document doc = Jsoup.parse("<a href='http://example.com'>Link</a><a>No Link</a>");

        // Act
        Elements results = Selector.select("[href]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Link", results.first().text());
    }

    @Test
    public void select_givenAttributePrefixKey_shouldReturnMatchingElements() {
        // Arrange
        Document doc = Jsoup.parse("<div data-user='123'>A</div><div data-name='John'>B</div><div class='other'>C</div>");

        // Act
        Elements results = Selector.select("[^data-]", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("A", results.get(0).text());
        Assert.assertEquals("B", results.get(1).text());
    }

    @Test
    public void select_givenAttributeEquals_shouldMatchExactValue() {
        // Arrange
        Document doc = Jsoup.parse("<input type='text'/><input type='password'/>");

        // Act
        Elements results = Selector.select("[type=password]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("password", results.first().attr("type"));
    }

    @Test
    public void select_givenAttributeNotEquals_shouldExcludeMatch() {
        // Arrange
        Document doc = Jsoup.parse("<input type='text'/><input type='password'/>");

        // Act
        Elements results = Selector.select("[type!=password]", doc.body());

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("text", results.first().attr("type"));
    }

    @Test
    public void select_givenAttributePrefixValue_shouldMatchStartsWith() {
        // Arrange
        Document doc = Jsoup.parse("<a href='http://jsoup.org'>1</a><a href='https://jsoup.org'>2</a><a href='ftp://jsoup.org'>3</a>");

        // Act
        Elements results = Selector.select("[href^=https]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("2", results.first().text());
    }

    @Test
    public void select_givenAttributeSuffixValue_shouldMatchEndsWith() {
        // Arrange
        Document doc = Jsoup.parse("<img src='pic.png'/><img src='pic.jpg'/><img src='pic.gif'/>");

        // Act
        Elements results = Selector.select("[src$=.png]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("pic.png", results.first().attr("src"));
    }

    @Test
    public void select_givenAttributeContainsValue_shouldMatchSubstring() {
        // Arrange
        Document doc = Jsoup.parse("<a href='/search/all'>A</a><a href='/index'>B</a>");

        // Act
        Elements results = Selector.select("[href*=/search/]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("A", results.first().text());
    }

    @Test
    public void select_givenAttributeRegexMatching_shouldMatchPattern() {
        // Arrange
        Document doc = Jsoup.parse("<img src='img1.png'/><img src='img2.jpg'/><img src='file.txt'/>");

        // Act
        Elements results = Selector.select("[src~=(?i)\\.(png|jpg)]", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("img1.png", results.get(0).attr("src"));
        Assert.assertEquals("img2.jpg", results.get(1).attr("src"));
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void select_givenInvalidAttributeOperator_shouldThrowSelectorParseException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("[attr?val]", doc);
    }

    @Test
    public void select_givenTagWithClassAndAttribute_shouldIntersectAll() {
        // Arrange
        Document doc = Jsoup.parse("<div class='item' title='target'>Match</div><div class='item'>No Title</div><p class='item' title='target'>No Div</p>");

        // Act
        Elements results = Selector.select("div.item[title=target]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Match", results.first().text());
    }

    @Test
    public void select_givenIndexEquals_shouldMatchIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>1</li><li>2</li><li>3</li></ul>");

        // Act
        Elements results = Selector.select("li:eq(1)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("2", results.first().text());
    }

    @Test
    public void select_givenIndexLessThan_shouldMatchElementsBeforeIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>1</li><li>2</li><li>3</li></ul>");

        // Act
        Elements results = Selector.select("li:lt(2)", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("1", results.get(0).text());
        Assert.assertEquals("2", results.get(1).text());
    }

    @Test
    public void select_givenIndexGreaterThan_shouldMatchElementsAfterIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>1</li><li>2</li><li>3</li></ul>");

        // Act
        Elements results = Selector.select("li:gt(0)", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("2", results.get(0).text());
        Assert.assertEquals("3", results.get(1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNonNumericIndex_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>1</li></ul>");

        // Act
        Selector.select("li:eq(abc)", doc);
    }

    @Test
    public void select_givenHasPseudoSelector_shouldReturnParentsContainingDescendant() {
        // Arrange
        Document doc = Jsoup.parse("<div class='parent'><span>Has span</span></div><div class='other'>No span</div>");

        // Act
        Elements results = Selector.select("div:has(span)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Has span", results.first().text());
    }

    @Test
    public void select_givenContainsPseudoSelector_shouldMatchTextAnywhereInElement() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Deep <b>jsoup</b> text</p><p>Other</p></div>");

        // Act
        Elements results = Selector.select("p:contains(jsoup)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Deep jsoup text", results.first().text());
    }

    @Test
    public void select_givenContainsOwnPseudoSelector_shouldMatchOnlyDirectText() {
        // Arrange
        Document doc = Jsoup.parse("<p>Direct jsoup <b>child</b></p><div><p>Inside <b>jsoup</b> only</p></div>");

        // Act
        Elements results = Selector.select("p:containsOwn(jsoup)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Direct jsoup child", results.first().text());
    }

    @Test
    public void select_givenMatchesPseudoSelector_shouldMatchRegexOnText() {
        // Arrange
        Document doc = Jsoup.parse("<p>Order #12345</p><p>Order #ABC</p>");

        // Act
        Elements results = Selector.select("p:matches(#\\d+)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Order #12345", results.first().text());
    }

    @Test
    public void select_givenMatchesOwnPseudoSelector_shouldMatchRegexOnDirectText() {
        // Arrange
        Document doc = Jsoup.parse("<p>Code 999 <span>Extra</span></p><p>Code <span>999</span></p>");

        // Act
        Elements results = Selector.select("p:matchesOwn(\\d+)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Code 999 Extra", results.first().text());
    }

    @Test
    public void select_givenChildCombinator_shouldReturnDirectChildren() {
        // Arrange
        Document doc = Jsoup.parse("<div id='p1'><span>Direct</span><div><span>Nested</span></div></div>");

        // Act
        Elements results = Selector.select("div#p1 > span", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Direct", results.first().text());
    }

    @Test
    public void select_givenDescendantCombinator_shouldReturnAllDescendants() {
        // Arrange
        Document doc = Jsoup.parse("<div id='p1'><span>Direct</span><div><span>Nested</span></div></div>");

        // Act
        Elements results = Selector.select("div#p1 span", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("Direct", results.get(0).text());
        Assert.assertEquals("Nested", results.get(1).text());
    }

    @Test
    public void select_givenAdjacentSiblingCombinator_shouldMatchImmediateSibling() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li class='first'>1</li><li>2</li><li>3</li></ul>");

        // Act
        Elements results = Selector.select("li.first + li", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("2", results.first().text());
    }

    @Test
    public void select_givenAdjacentSiblingCombinator_whenNotAdjacent_shouldReturnEmpty() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li class='first'>1</li><p>split</p><li>3</li></ul>");

        // Act
        Elements results = Selector.select("li.first + li", doc);

        // Assert
        Assert.assertTrue(results.isEmpty());
    }

    @Test
    public void select_givenGeneralSiblingCombinator_shouldMatchFollowingSiblings() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1>Title</h1><p>Para 1</p><div>Inner</div><p>Para 2</p></div>");

        // Act
        Elements results = Selector.select("h1 ~ p", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("Para 1", results.get(0).text());
        Assert.assertEquals("Para 2", results.get(1).text());
    }

    @Test
    public void select_givenGeneralSiblingCombinator_whenSiblingPrecedes_shouldNotMatch() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Para 0</p><h1>Title</h1></div>");

        // Act
        Elements results = Selector.select("h1 ~ p", doc);

        // Assert
        Assert.assertTrue(results.isEmpty());
    }

    @Test
    public void select_givenCommaGroupOrSelector_shouldMatchAllBranches() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1>Heading</h1><p>Paragraph</p><span>Span</span></div>");

        // Act
        Elements results = Selector.select("h1, span", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("Heading", results.get(0).text());
        Assert.assertEquals("Span", results.get(1).text());
    }

    @Test
    public void select_givenLeadingCombinator_shouldUseRootAsOrigin() {
        // Arrange
        Document doc = Jsoup.parse("<div id='root'><p>Child 1</p><div><p>Nested</p></div></div>");
        Element root = doc.getElementById("root");

        // Act
        Elements results = Selector.select("> p", root);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Child 1", results.first().text());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void select_givenUnexpectedToken_shouldThrowSelectorParseException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("div;bad", doc);
    }

    @Test
    public void selectorParseException_givenMessageAndParams_shouldFormatProperly() {
        // Arrange & Act
        Selector.SelectorParseException ex = new Selector.SelectorParseException("Error at %s in %d", "token", Integer.valueOf(10));

        // Assert
        Assert.assertEquals("Error at token in 10", ex.getMessage());
    }
}