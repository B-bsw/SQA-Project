package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectorTest {

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNullQueryAndRoot_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select((String) null, doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyQueryAndRoot_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenWhitespaceQueryAndRoot_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("   ", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenValidQueryAndNullRoot_shouldThrowException() {
        // Act
        Selector.select("div", (Element) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNullQueryAndRootsCollection_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc);

        // Act
        Selector.select((String) null, roots);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenValidQueryAndNullRootsCollection_shouldThrowException() {
        // Act
        Selector.select("div", (Iterable<Element>) null);
    }

    @Test
    public void select_givenMultipleRoots_shouldCollectAndDeduplicateResults() {
        // Arrange
        Document doc1 = Jsoup.parse("<div><p class='target'>Doc1</p></div>");
        Document doc2 = Jsoup.parse("<div><p class='target'>Doc2</p></div>");
        List<Element> roots = new ArrayList<Element>();
        roots.add(doc1.body());
        roots.add(doc2.body());

        // Act
        Elements results = Selector.select("p.target", roots);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("Doc1", results.get(0).text());
        Assert.assertEquals("Doc2", results.get(1).text());
    }

    @Test
    public void select_givenByTag_shouldReturnMatchingTags() {
        // Arrange
        Document doc = Jsoup.parse("<div><span>1</span><span>2</span><p>3</p></div>");

        // Act
        Elements results = Selector.select("span", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("1", results.get(0).text());
        Assert.assertEquals("2", results.get(1).text());
    }

    @Test
    public void select_givenTagWithNamespace_shouldReplacePipeWithColon() {
        // Arrange
        Document doc = Jsoup.parse("<xml><fb:name>Facebook</fb:name></xml>");

        // Act
        Elements results = Selector.select("fb|name", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("fb:name", results.get(0).tagName());
        Assert.assertEquals("Facebook", results.get(0).text());
    }

    @Test
    public void select_givenById_shouldReturnMatchingElementWhenExists() {
        // Arrange
        Document doc = Jsoup.parse("<div id='header'>Header</div><div id='footer'>Footer</div>");

        // Act
        Elements results = Selector.select("#header", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("header", results.get(0).id());
    }

    @Test
    public void select_givenById_shouldReturnEmptyWhenNotFound() {
        // Arrange
        Document doc = Jsoup.parse("<div id='header'>Header</div>");

        // Act
        Elements results = Selector.select("#nonexistent", doc);

        // Assert
        Assert.assertEquals(0, results.size());
    }

    @Test
    public void select_givenByClass_shouldReturnMatchingElements() {
        // Arrange
        Document doc = Jsoup.parse("<div class='item'>One</div><p class='item'>Two</p><span class='other'>Three</span>");

        // Act
        Elements results = Selector.select(".item", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("One", results.get(0).text());
        Assert.assertEquals("Two", results.get(1).text());
    }

    @Test
    public void select_givenAllElementsWildcard_shouldReturnAllElements() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Hello</p></div>");

        // Act
        Elements results = Selector.select("*", doc.body());

        // Assert
        Assert.assertTrue(results.size() >= 2);
    }

    @Test
    public void select_givenAttributeOnly_shouldReturnElementsWithAttribute() {
        // Arrange
        Document doc = Jsoup.parse("<a href='http://example.com'>Link</a><a>No Link</a>");

        // Act
        Elements results = Selector.select("[href]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Link", results.get(0).text());
    }

    @Test
    public void select_givenAttributePrefix_shouldReturnElementsWithMatchingPrefix() {
        // Arrange
        Document doc = Jsoup.parse("<div data-role='admin' data-id='123' name='test'>Target</div>");

        // Act
        Elements results = Selector.select("[^data-]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Target", results.get(0).text());
    }

    @Test
    public void select_givenAttributeEquals_shouldMatchExactValue() {
        // Arrange
        Document doc = Jsoup.parse("<input type='text'/><input type='password'/>");

        // Act
        Elements results = Selector.select("[type=password]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("password", results.get(0).attr("type"));
    }

    @Test
    public void select_givenAttributeNotEquals_shouldMatchDifferentValue() {
        // Arrange
        Document doc = Jsoup.parse("<input type='text'/><input type='password'/><input/>");

        // Act
        Elements results = Selector.select("input[type!=text]", doc);

        // Assert
        Assert.assertEquals(2, results.size());
    }

    @Test
    public void select_givenAttributeStartingWith_shouldMatchPrefix() {
        // Arrange
        Document doc = Jsoup.parse("<a href='https://secure.com'>Sec</a><a href='http://insecure.com'>Insec</a>");

        // Act
        Elements results = Selector.select("[href^=https]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Sec", results.get(0).text());
    }

    @Test
    public void select_givenAttributeEndingWith_shouldMatchSuffix() {
        // Arrange
        Document doc = Jsoup.parse("<img src='pic.jpg'/><img src='pic.png'/>");

        // Act
        Elements results = Selector.select("[src$=.png]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("pic.png", results.get(0).attr("src"));
    }

    @Test
    public void select_givenAttributeContaining_shouldMatchSubstring() {
        // Arrange
        Document doc = Jsoup.parse("<a href='http://site.com/search/items'>Search</a><a href='http://site.com/home'>Home</a>");

        // Act
        Elements results = Selector.select("[href*=/search/]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Search", results.get(0).text());
    }

    @Test
    public void select_givenAttributeRegexMatching_shouldMatchPattern() {
        // Arrange
        Document doc = Jsoup.parse("<div class='item123'>Num</div><div class='itemabc'>Alpha</div>");

        // Act
        Elements results = Selector.select("[class~=item\\d+]", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Num", results.get(0).text());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void select_givenInvalidAttributeOperator_shouldThrowSelectorParseException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("[attr?val]", doc);
    }

    @Test
    public void select_givenIndexEquals_shouldReturnElementAtIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>A</li><li>B</li><li>C</li></ul>");

        // Act
        Elements results = Selector.select("li:eq(1)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("B", results.get(0).text());
    }

    @Test
    public void select_givenIndexLessThan_shouldReturnElementsBelowIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>A</li><li>B</li><li>C</li></ul>");

        // Act
        Elements results = Selector.select("li:lt(2)", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("A", results.get(0).text());
        Assert.assertEquals("B", results.get(1).text());
    }

    @Test
    public void select_givenIndexGreaterThan_shouldReturnElementsAboveIndex() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>A</li><li>B</li><li>C</li></ul>");

        // Act
        Elements results = Selector.select("li:gt(0)", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("B", results.get(0).text());
        Assert.assertEquals("C", results.get(1).text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenNonNumericIndexInPseudoSelector_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li>A</li></ul>");

        // Act
        Selector.select("li:eq(invalid)", doc);
    }

    @Test
    public void select_givenContains_shouldMatchTextInAnyDescendant() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Welcome to <b>jsoup</b> library</p></div>");

        // Act
        Elements results = Selector.select("div:contains(jsoup)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("div", results.get(0).tagName());
    }

    @Test
    public void select_givenContainsOwn_shouldMatchTextOnlyInElementItself() {
        // Arrange
        Document doc = Jsoup.parse("<div>Parent <p>Child jsoup</p></div>");

        // Act
        Elements divResults = Selector.select("div:containsOwn(jsoup)", doc);
        Elements pResults = Selector.select("p:containsOwn(jsoup)", doc);

        // Assert
        Assert.assertEquals(0, divResults.size());
        Assert.assertEquals(1, pResults.size());
        Assert.assertEquals("Child jsoup", pResults.get(0).text());
    }

    @Test
    public void select_givenMatchesRegex_shouldMatchTextRegexInAnyDescendant() {
        // Arrange
        Document doc = Jsoup.parse("<div><p>Order #12345</p></div>");

        // Act
        Elements results = Selector.select("div:matches(#\\d+)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
    }

    @Test
    public void select_givenMatchesOwnRegex_shouldMatchTextRegexInOwnText() {
        // Arrange
        Document doc = Jsoup.parse("<div>Order Header <p>ID #999</p></div>");

        // Act
        Elements divResults = Selector.select("div:matchesOwn(#\\d+)", doc);
        Elements pResults = Selector.select("p:matchesOwn(#\\d+)", doc);

        // Assert
        Assert.assertEquals(0, divResults.size());
        Assert.assertEquals(1, pResults.size());
    }

    @Test
    public void select_givenNotSelector_shouldFilterOutMatches() {
        // Arrange
        Document doc = Jsoup.parse("<ul><li class='skip'>1</li><li class='keep'>2</li><li class='keep'>3</li></ul>");

        // Act
        Elements results = Selector.select("li:not(.skip)", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("2", results.get(0).text());
        Assert.assertEquals("3", results.get(1).text());
    }

    @Test
    public void select_givenHasSelector_shouldReturnElementsContainingSubquery() {
        // Arrange
        Document doc = Jsoup.parse("<div id='d1'><p><span>Inside 1</span></p></div><div id='d2'><p>Inside 2</p></div>");

        // Act
        Elements results = Selector.select("div:has(span)", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("d1", results.get(0).id());
    }

    @Test
    public void select_givenQueryStartingWithHas_shouldEvaluateFromRootAllElements() {
        // Arrange
        Document doc = Jsoup.parse("<div id='d1'><span>Target</span></div><div id='d2'>No target</div>");

        // Act
        Elements results = Selector.select(":has(span)", doc);

        // Assert
        Assert.assertTrue(results.size() > 0);
    }

    @Test
    public void select_givenCombinedMultipleSelectorsWithoutSpace_shouldIntersect() {
        // Arrange
        Document doc = Jsoup.parse("<div id='main' class='content active'>A</div><div id='main' class='content'>B</div>");

        // Act
        Elements results = Selector.select("div#main.active", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("A", results.get(0).text());
    }

    @Test
    public void select_givenDescendantCombinatorSpace_shouldReturnDescendants() {
        // Arrange
        Document doc = Jsoup.parse("<div class='container'><p><span>Deep</span></p></div>");

        // Act
        Elements results = Selector.select(".container span", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Deep", results.get(0).text());
    }

    @Test
    public void select_givenDirectChildCombinator_shouldOnlyReturnDirectChildren() {
        // Arrange
        Document doc = Jsoup.parse("<div class='parent'><span>Child</span><p><span>Grandchild</span></p></div>");

        // Act
        Elements results = Selector.select(".parent > span", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Child", results.get(0).text());
    }

    @Test
    public void select_givenAdjacentSiblingCombinator_shouldReturnImmediatelyPrecededSibling() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1 id='h'>Title</h1><p id='p1'>First</p><p id='p2'>Second</p></div>");

        // Act
        Elements results = Selector.select("h1 + p", doc);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("p1", results.get(0).id());
    }

    @Test
    public void select_givenGeneralSiblingCombinator_shouldReturnAllPrecededSiblings() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1 id='h'>Title</h1><p id='p1'>First</p><p id='p2'>Second</p></div>");

        // Act
        Elements results = Selector.select("h1 ~ p", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("p1", results.get(0).id());
        Assert.assertEquals("p2", results.get(1).id());
    }

    @Test
    public void select_givenCommaSeparatedGroup_shouldUnionResults() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1>Heading</h1><p>Para</p><span>Span</span></div>");

        // Act
        Elements results = Selector.select("h1, span", doc);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("Heading", results.get(0).text());
        Assert.assertEquals("Span", results.get(1).text());
    }

    @Test
    public void select_givenLeadingChildCombinator_shouldUseRootAsParent() {
        // Arrange
        Document doc = Jsoup.parse("<div id='root'><span>Child 1</span><div><span>Child 2</span></div></div>");
        Element root = doc.getElementById("root");

        // Act
        Elements results = Selector.select("> span", root);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("Child 1", results.get(0).text());
    }

    @Test
    public void select_givenLeadingAdjacentSiblingCombinator_shouldUseRootSiblings() {
        // Arrange
        Document doc = Jsoup.parse("<div><span id='s1'>First</span><span id='s2'>Second</span><span id='s3'>Third</span></div>");
        Element s1 = doc.getElementById("s1");

        // Act
        Elements results = Selector.select("+ span", s1);

        // Assert
        Assert.assertEquals(1, results.size());
        Assert.assertEquals("s2", results.get(0).id());
    }

    @Test
    public void select_givenLeadingGeneralSiblingCombinator_shouldUseRootSiblings() {
        // Arrange
        Document doc = Jsoup.parse("<div><span id='s1'>First</span><span id='s2'>Second</span><span id='s3'>Third</span></div>");
        Element s1 = doc.getElementById("s1");

        // Act
        Elements results = Selector.select("~ span", s1);

        // Assert
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("s2", results.get(0).id());
        Assert.assertEquals("s3", results.get(1).id());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void select_givenUnhandledToken_shouldThrowSelectorParseException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("div & other", doc);
    }

    @Test
    public void filterOut_givenElementsAndOuts_shouldExcludeOutElements() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='1'>One</p><p id='2'>Two</p><p id='3'>Three</p></div>");
        Elements allP = doc.select("p");
        Elements outP = doc.select("#2");

        // Act
        Elements filtered = Selector.filterOut(allP, outP);

        // Assert
        Assert.assertEquals(2, filtered.size());
        Assert.assertEquals("1", filtered.get(0).id());
        Assert.assertEquals("3", filtered.get(1).id());
    }

    @Test
    public void filterOut_givenEmptyOuts_shouldReturnOriginalElements() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='1'>One</p></div>");
        Elements allP = doc.select("p");
        Elements emptyOuts = new Elements();

        // Act
        Elements filtered = Selector.filterOut(allP, emptyOuts);

        // Assert
        Assert.assertEquals(1, filtered.size());
        Assert.assertEquals("1", filtered.get(0).id());
    }

    @Test
    public void filterOut_givenEmptyElements_shouldReturnEmpty() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='1'>One</p></div>");
        Elements emptyElements = new Elements();
        Elements outs = doc.select("p");

        // Act
        Elements filtered = Selector.filterOut(emptyElements, outs);

        // Assert
        Assert.assertEquals(0, filtered.size());
    }

    @Test
    public void select_givenAdjacentSiblingWithNoMatch_shouldReturnEmpty() {
        // Arrange
        Document doc = Jsoup.parse("<div><h1>Title</h1><div>Not a P</div><p>Para</p></div>");

        // Act
        Elements results = Selector.select("h1 + p", doc);

        // Assert
        Assert.assertEquals(0, results.size());
    }

    @Test
    public void select_givenGeneralSiblingWithPrecedingElement_shouldNotReturnPrecedingElements() {
        // Arrange
        Document doc = Jsoup.parse("<div><p id='p1'>First</p><h1 id='h'>Title</h1></div>");

        // Act
        Elements results = Selector.select("h1 ~ p", doc);

        // Assert
        Assert.assertEquals(0, results.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyHasQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("div:has()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyContainsQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("div:contains()", doc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void select_givenEmptyNotQuery_shouldThrowException() {
        // Arrange
        Document doc = Jsoup.parse("<div></div>");

        // Act
        Selector.select("div:not()", doc);
    }
}