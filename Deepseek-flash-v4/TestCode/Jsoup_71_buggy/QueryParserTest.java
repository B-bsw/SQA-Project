package org.jsoup.select;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jsoup.select.Evaluator;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.StructuralEvaluator;
import org.jsoup.select.QueryParser;

public class QueryParserTest {
    
    @Test
    public void testParseNullQuery() {
        try {
            QueryParser.parse(null);
            fail("Expected SelectorParseException for null query");
        } catch (Selector.SelectorParseException e) {
            // expected
        }
    }
    
    @Test
    public void testParseEmptyQuery() {
        try {
            QueryParser.parse("");
            fail("Expected SelectorParseException for empty query");
        } catch (Selector.SelectorParseException e) {
            // expected
        }
    }
    
    @Test
    public void testParseSimpleTag() {
        Evaluator eval = QueryParser.parse("div");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Tag);
    }
    
    @Test
    public void testParseIdWithChildCombinator() {
        Evaluator eval = QueryParser.parse("#id > div");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseClassWithSpaceCombinator() {
        Evaluator eval = QueryParser.parse(".class1 .class2");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseMultipleSelectorsWithComma() {
        Evaluator eval = QueryParser.parse("div, span");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }
    
    @Test
    public void testParseNestedPseudoSelectors() {
        Evaluator eval = QueryParser.parse("div:not(.class)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseNthChildSelector() {
        Evaluator eval = QueryParser.parse("li:nth-child(2n+1)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseNthLastChildSelector() {
        Evaluator eval = QueryParser.parse("li:nth-last-child(3)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseNthOfTypeSelector() {
        Evaluator eval = QueryParser.parse("p:nth-of-type(2)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseFirstChildPseudo() {
        Evaluator eval = QueryParser.parse("div:first-child");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseLastChildPseudo() {
        Evaluator eval = QueryParser.parse("div:last-child");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseContainsWithSpecialChars() {
        Evaluator eval = QueryParser.parse("div:contains(Hello, World)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseInvalidCombinator() {
        try {
            QueryParser.parse("div$span");
            fail("Expected SelectorParseException for invalid query");
        } catch (Selector.SelectorParseException e) {
            // expected
        }
    }
    
    @Test
    public void testParseInvalidAttributeQuery() {
        try {
            QueryParser.parse("[attr!~=value]");
            fail("Expected SelectorParseException for invalid attribute query");
        } catch (Selector.SelectorParseException e) {
            // expected
        }
    }
    
    @Test
    public void testParseComplexSelector() {
        Evaluator eval = QueryParser.parse("div > p.class#id[attr^=val]:nth-child(2n)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseCombinatorRoot() {
        Evaluator eval = QueryParser.parse("> div");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseIndexLessThan() {
        Evaluator eval = QueryParser.parse("div:lt(3)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseIndexGreaterThan() {
        Evaluator eval = QueryParser.parse("div:gt(2)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseIndexEquals() {
        Evaluator eval = QueryParser.parse("div:eq(2)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseOnlyChild() {
        Evaluator eval = QueryParser.parse("div:only-child");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseOnlyOfType() {
        Evaluator eval = QueryParser.parse("div:only-of-type");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseContainsData() {
        Evaluator eval = QueryParser.parse("div:containsData(text)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
    
    @Test
    public void testParseMatchesOwn() {
        Evaluator eval = QueryParser.parse("div:matchesOwn(pattern)");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }
}