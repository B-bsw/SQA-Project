package org.jsoup.select;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class QueryParserTest {

    private QueryParser parser;
    private Evaluator evaluator;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    // Test for parse() normal case - tag selector
    @Test
    public void testParseTag() {
        evaluator = QueryParser.parse("div");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) evaluator).tagName);
    }

    // Test for parse() normal case - class selector
    @Test
    public void testParseClass() {
        evaluator = QueryParser.parse(".class");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.Class);
    }

    // Test for parse() normal case - id selector
    @Test
    public void testParseId() {
        evaluator = QueryParser.parse("#id");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.Id);
    }

    // Test for parse() boundary - single element
    @Test
    public void testParseSingleElement() {
        evaluator = QueryParser.parse("*");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.AllElements);
    }

    // Test for parse() boundary - empty query
    @Test
    public void testParseEmptyQuery() {
        try {
            evaluator = QueryParser.parse("");
            fail("Expected SelectorParseException");
        } catch (Exception e) {
            // expected
        }
    }

    // Test for parse() exception - invalid query
    @Test(expected = Throwable.class)
    public void testParseInvalidQuery() {
        evaluator = QueryParser.parse("124:*]");
    }

    // Test for parse() normal - tag with namespace
    @Test
    public void testParseTagWithNamespace() {
        evaluator = QueryParser.parse("div#id");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof CombiningEvaluator.And);
    }

    // Test for parse() normal - attribute selector
    @Test
    public void testParseAttribute() {
        evaluator = QueryParser.parse("[href]");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.Attribute);
    }

    // Test for parse() normal - attribute with value
    @Test
    public void testParseAttributeWithValue() {
        evaluator = QueryParser.parse("[href='www']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValue);
        Evaluator.AttributeWithValue attr = (Evaluator.AttributeWithValue) evaluator;
        assertEquals("href", attr.key);
        assertEquals("www", attr.value);
    }

    // Test for parse() null input exception
    @Test(expected = Throwable.class)
    public void testParseNullQuery() {
        evaluator = QueryParser.parse(null);
    }

    // Test for parse() branch - combinator '>' descendant
    @Test
    public void testParseChildCombinator() {
        evaluator = QueryParser.parse("div > p");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof CombiningEvaluator.And);
    }

    // Test for parse() branch - not selector
    @Test
    public void testParseNot() {
        evaluator = QueryParser.parse("div:not(.cls)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof CombiningEvaluator.And);
    }

    // Test for parse() branch - has pseudo selector
    @Test
    public void testParseHas() {
        evaluator = QueryParser.parse("div:has(p)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof StructuralEvaluator.Has);
    }

    // Test for parse() branch - contains pseudo selector
    @Test
    public void testParseContains() {
        evaluator = QueryParser.parse(":contains(text)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.ContainsText);
    }

    // Test for parse() branch - containsOwn
    @Test
    public void testParseContainsOwn() {
        evaluator = QueryParser.parse(":containsOwn(text)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.ContainsOwnText);
    }

    // Test for parse() branch - matches pseudo
    @Test
    public void testParseMatches() {
        evaluator = QueryParser.parse(":matches(regex)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.Matches);
    }

    // Test for parse() branch - matchesOwn
    @Test
    public void testParseMatchesOwn() {
        evaluator = QueryParser.parse(":matchesOwn(regex)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.MatchesOwn);
    }

    // Test for parse() branch - :eq
    @Test
    public void testParseIndexEquals() {
        evaluator = QueryParser.parse(":eq(2)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.IndexEquals);
    }

    // Test for parse() branch - :gt
    @Test
    public void testParseIndexGreaterThan() {
        evaluator = QueryParser.parse(":gt(3)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.IndexGreaterThan);
    }

    // Test for parse() branch - :lt
    @Test
    public void testParseIndexLessThan() {
        evaluator = QueryParser.parse(":lt(4)");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof Evaluator.IndexLessThan);
    }

    // Test for parse() with comma - Or combinator
    @Test
    public void testParseOrCombinator() {
        evaluator = QueryParser.parse("div, p");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof CombiningEvaluator.Or);
    }

    // Test for parse() with multiple selectors separated by space - descendant
    @Test
    public void testParseSpaceCombinator() {
        evaluator = QueryParser.parse("div p");
        assertNotNull(evaluator);
        assertTrue(evaluator instanceof CombiningEvaluator.And);
    }

    // Test for parse() branch - attribute with "!="
    @Test
    public void testParseAttributeValueNot() {
        evaluator = QueryParser.parse("[href!='www']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueNot);
    }

    // Test for parse() branch - attribute with "^="
    @Test
    public void testParseAttributeStarts() {
        evaluator = QueryParser.parse("[href^='http']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueStarting);
    }

    // Test for parse() branch - attribute with "$="
    @Test
    public void testParseAttributeEnds() {
        evaluator = QueryParser.parse("[href$='.pdf']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueEnding);
    }

    // Test for parse() branch - attribute with "*="
    @Test
    public void testParseAttributeContains() {
        evaluator = QueryParser.parse("[href*='example']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueContaining);
    }

    // Test for parse() branch - attribute with "~="
    @Test
    public void testParseAttributeMatching() {
        evaluator = QueryParser.parse("[href~='regex']");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueMatching);
    }

    // Test for parse() branch - attribute starting with ^
    @Test
    public void testParseAttributeStarting() {
        evaluator = QueryParser.parse("[^data-]");
        assertTrue(evaluator instanceof Evaluator.AttributeStarting);
    }
}