package org.jsoup.select;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.parser.TokenQueue;

public class QueryParserTest {
    private String baseQuery;
    
    @Before
    public void setUp() {
        baseQuery = "div.class#id > p:first-child";
    }
    
    @After
    public void tearDown() {
        baseQuery = null;
    }
    
    @Test
    public void testParseWithEmptyQuery() {
        try {
            QueryParser.parse("");
            fail("Should throw exception for empty query");
        } catch (Selector.SelectorParseException e) {
            assertNotNull(e.getMessage());
        }
    }
    
    @Test
    public void testParseWithSingleTag() {
        Evaluator result = QueryParser.parse("div");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Tag);
    }
    
    @Test
    public void testParseWithMultipleSelectors() {
        Evaluator result = QueryParser.parse("div, span");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.Or);
    }
    
    @Test
    public void testParseWithChildCombinator() {
        Evaluator result = QueryParser.parse("div > span");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseWithAdjacentSibling() {
        Evaluator result = QueryParser.parse("div + span");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseWithGeneralSibling() {
        Evaluator result = QueryParser.parse("div ~ span");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseWithCommaGroup() {
        Evaluator result = QueryParser.parse("div, span, p");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.Or);
    }
    
    @Test
    public void testFindElementsById() {
        Evaluator result = QueryParser.parse("#myId");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Id);
    }
    
    @Test
    public void testFindElementsByClass() {
        Evaluator result = QueryParser.parse(".myClass");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Class);
    }
    
    @Test
    public void testFindElementsByAttribute() {
        Evaluator result = QueryParser.parse("[href]");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Attribute);
    }
    
    @Test
    public void testFindElementsByAttributeWithValue() {
        Evaluator result = QueryParser.parse("[href=example]");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValue);
    }
    
    @Test
    public void testFindElementsByAttributeNotEqual() {
        Evaluator result = QueryParser.parse("[href!=example]");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValueNot);
    }
    
    @Test
    public void testFindElementsByAttributeStarting() {
        Evaluator result = QueryParser.parse("[^data-]");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeStarting);
    }
    
    @Test
    public void testFindAllElements() {
        Evaluator result = QueryParser.parse("*");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AllElements);
    }
    
    @Test
    public void testPseudoFirstChild() {
        Evaluator result = QueryParser.parse("p:first-child");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsFirstChild);
    }
    
    @Test
    public void testPseudoLastChild() {
        Evaluator result = QueryParser.parse("p:last-child");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsLastChild);
    }
    
    @Test
    public void testPseudoNthChild() {
        Evaluator result = QueryParser.parse("p:nth-child(2)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsNthChild);
    }
    
    @Test
    public void testPseudoNthChildOdd() {
        Evaluator result = QueryParser.parse("p:nth-child(odd)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsNthChild);
    }
    
    @Test
    public void testPseudoNthChildEven() {
        Evaluator result = QueryParser.parse("p:nth-child(even)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsNthChild);
    }
    
    @Test
    public void testPseudoNthLastChild() {
        Evaluator result = QueryParser.parse("p:nth-last-child(2)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsNthLastChild);
    }
    
    @Test
    public void testPseudoFirstOfType() {
        Evaluator result = QueryParser.parse("p:first-of-type");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsFirstOfType);
    }
    
    @Test
    public void testPseudoLastOfType() {
        Evaluator result = QueryParser.parse("p:last-of-type");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsLastOfType);
    }
    
    @Test
    public void testPseudoOnlyChild() {
        Evaluator result = QueryParser.parse("p:only-child");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsOnlyChild);
    }
    
    @Test
    public void testPseudoOnlyOfType() {
        Evaluator result = QueryParser.parse("p:only-of-type");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsOnlyOfType);
    }
    
    @Test
    public void testPseudoEmpty() {
        Evaluator result = QueryParser.parse("p:empty");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsEmpty);
    }
    
    @Test
    public void testPseudoRoot() {
        Evaluator result = QueryParser.parse(":root");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IsRoot);
    }
    
    @Test
    public void testPseudoHas() {
        Evaluator result = QueryParser.parse(":has(span)");
        assertNotNull(result);
        assertTrue(result instanceof StructuralEvaluator.Has);
    }
    
    @Test
    public void testPseudoContains() {
        Evaluator result = QueryParser.parse(":contains(hello)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.ContainsText);
    }
    
    @Test
    public void testPseudoContainsOwn() {
        Evaluator result = QueryParser.parse(":containsOwn(hello)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.ContainsOwnText);
    }
    
    @Test
    public void testPseudoContainsData() {
        Evaluator result = QueryParser.parse(":containsData(data)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.ContainsData);
    }
    
    @Test
    public void testPseudoMatches() {
        Evaluator result = QueryParser.parse(":matches(\\d+)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Matches);
    }
    
    @Test
    public void testPseudoMatchesOwn() {
        Evaluator result = QueryParser.parse(":matchesOwn(\\d+)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.MatchesOwn);
    }
    
    @Test
    public void testPseudoNot() {
        Evaluator result = QueryParser.parse(":not(p)");
        assertNotNull(result);
        assertTrue(result instanceof StructuralEvaluator.Not);
    }
    
    @Test
    public void testIndexLessThan() {
        Evaluator result = QueryParser.parse(":lt(3)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IndexLessThan);
    }
    
    @Test
    public void testIndexGreaterThan() {
        Evaluator result = QueryParser.parse(":gt(3)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IndexGreaterThan);
    }
    
    @Test
    public void testIndexEquals() {
        Evaluator result = QueryParser.parse(":eq(3)");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.IndexEquals);
    }
    
    @Test
    public void testByTagWithNamespace() {
        Evaluator result = QueryParser.parse("svg|circle");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.Tag);
        assertEquals("svg:circle", ((Evaluator.Tag) result).getTagName());
    }
    
    @Test
    public void testByTagWithWildcardNamespace() {
        Evaluator result = QueryParser.parse("*|circle");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.Or);
    }
    
    @Test
    public void testParseWithWhitespaceCombinator() {
        Evaluator result = QueryParser.parse("div span");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseStartsWithCombinator() {
        Evaluator result = QueryParser.parse("> div");
        assertNotNull(result);
        assertTrue(result instanceof StructuralEvaluator.Root);
    }
    
    @Test
    public void testParseWithCommaAfterCombinator() {
        Evaluator result = QueryParser.parse("div > span, p > em");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.Or);
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidSelector() {
        QueryParser.parse("div~~~~");
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidPseudoSelector() {
        QueryParser.parse(":invalid-pseudo");
    }
    
    @Test(expected = Selector.SelectorParseException.class)
    public void testInvalidNthSelector() {
        QueryParser.parse("p:nth-child(abc)");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyClassSelector() {
        QueryParser.parse(". id");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyIdSelector() {
        QueryParser.parse("# id");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyTagSelector() {
        QueryParser.parse(" div");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyAttributeKey() {
        QueryParser.parse("[=value]");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyNthChildArg() {
        QueryParser.parse(":nth-child()");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyHasSelector() {
        QueryParser.parse(":has()");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyContainsSelector() {
        QueryParser.parse(":contains()");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyMatchesSelector() {
        QueryParser.parse(":matches()");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyNotSelector() {
        QueryParser.parse(":not()");
    }
    
    @Test
    public void testParseWithOnlyWhitespace() {
        try {
            QueryParser.parse("   ");
            fail("Should throw exception for whitespace only query");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }
    
    @Test
    public void testParseWithDoublePseudo() {
        Evaluator result = QueryParser.parse("p:first-child:not(.hidden)");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseWithNestedCombinators() {
        Evaluator result = QueryParser.parse("div > span + p ~ em, a b c");
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.Or);
    }
    
    @Test
    public void testParseWithAttributeStartsWithWildcard() {
        Evaluator result = QueryParser.parse("[href^='https://']");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValueStarting);
    }
    
    @Test
    public void testParseWithAttributeEndsWith() {
        Evaluator result = QueryParser.parse("[href$='.pdf']");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValueEnding);
    }
    
    @Test
    public void testParseWithAttributeContains() {
        Evaluator result = QueryParser.parse("[href*='google']");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValueContaining);
    }
    
    @Test
    public void testParseWithAttributeMatching() {
        Evaluator result = QueryParser.parse("[href~='^https?://']");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeWithValueMatching);
    }
    
    @Test
    public void testParseWithAttributeStartsWithCaret() {
        Evaluator result = QueryParser.parse("^data-custom");
        assertNotNull(result);
        assertTrue(result instanceof Evaluator.AttributeStarting);
    }
    
    @Test
    public void testParseComplexQueryWithManyBranches() {
        String complexQuery = "div.nav > ul > li.item:first-of-type:not(.active) + li:last-child > span[data-type='text']:contains(click)";
        Evaluator result = QueryParser.parse(complexQuery);
        assertNotNull(result);
        assertTrue(result instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testNullQuery() {
        try {
            QueryParser.parse(null);
            fail("Should throw exception for null query");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }
}