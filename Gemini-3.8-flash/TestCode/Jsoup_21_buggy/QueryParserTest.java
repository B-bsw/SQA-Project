package org.jsoup.select;

import org.junit.Assert;
import org.junit.Test;

public class QueryParserTest {

    @Test
    public void parse_givenTag_shouldReturnTagEvaluator() {
        // Arrange
        String query = "div";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
        Assert.assertEquals("div", eval.toString());
    }

    @Test
    public void parse_givenTagWithNamespace_shouldFlipPipeToColon() {
        // Arrange
        String query = "svg|rect";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
        Assert.assertEquals("svg:rect", eval.toString());
    }

    @Test
    public void parse_givenId_shouldReturnIdEvaluator() {
        // Arrange
        String query = "#header";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Id);
        Assert.assertEquals("#header", eval.toString());
    }

    @Test
    public void parse_givenClass_shouldReturnClassEvaluator() {
        // Arrange
        String query = ".highlight";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Class);
        Assert.assertEquals(".highlight", eval.toString());
    }

    @Test
    public void parse_givenAllElements_shouldReturnAllElementsEvaluator() {
        // Arrange
        String query = "*";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AllElements);
        Assert.assertEquals("*", eval.toString());
    }

    @Test
    public void parse_givenAttributeKeyOnly_shouldReturnAttributeEvaluator() {
        // Arrange
        String query = "[disabled]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Attribute);
        Assert.assertEquals("[disabled]", eval.toString());
    }

    @Test
    public void parse_givenAttributeStarting_shouldReturnAttributeStartingEvaluator() {
        // Arrange
        String query = "[^data-]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeStarting);
        Assert.assertEquals("[^data-]", eval.toString());
    }

    @Test
    public void parse_givenAttributeEquals_shouldReturnAttributeWithValueEvaluator() {
        // Arrange
        String query = "[type=text]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValue);
        Assert.assertEquals("[type=text]", eval.toString());
    }

    @Test
    public void parse_givenAttributeNotEquals_shouldReturnAttributeWithValueNotEvaluator() {
        // Arrange
        String query = "[type!=hidden]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
        Assert.assertEquals("[type!=hidden]", eval.toString());
    }

    @Test
    public void parse_givenAttributePrefix_shouldReturnAttributeWithValueStartingEvaluator() {
        // Arrange
        String query = "[href^=https]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
        Assert.assertEquals("[href^=https]", eval.toString());
    }

    @Test
    public void parse_givenAttributeSuffix_shouldReturnAttributeWithValueEndingEvaluator() {
        // Arrange
        String query = "[src$=.jpg]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
        Assert.assertEquals("[src$=.jpg]", eval.toString());
    }

    @Test
    public void parse_givenAttributeSubstring_shouldReturnAttributeWithValueContainingEvaluator() {
        // Arrange
        String query = "[class*=button]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
        Assert.assertEquals("[class*=button]", eval.toString());
    }

    @Test
    public void parse_givenAttributeRegex_shouldReturnAttributeWithValueMatchingEvaluator() {
        // Arrange
        String query = "[title~=^[0-9]+$]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
        Assert.assertEquals("[title~=^[0-9]+$]", eval.toString());
    }

    @Test
    public void parse_givenIndexLessThan_shouldReturnIndexLessThanEvaluator() {
        // Arrange
        String query = ":lt(5)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexLessThan);
        Assert.assertEquals(":lt(5)", eval.toString());
    }

    @Test
    public void parse_givenIndexGreaterThan_shouldReturnIndexGreaterThanEvaluator() {
        // Arrange
        String query = ":gt(2)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexGreaterThan);
        Assert.assertEquals(":gt(2)", eval.toString());
    }

    @Test
    public void parse_givenIndexEquals_shouldReturnIndexEqualsEvaluator() {
        // Arrange
        String query = ":eq(0)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexEquals);
        Assert.assertEquals(":eq(0)", eval.toString());
    }

    @Test
    public void parse_givenHas_shouldReturnStructuralHasEvaluator() {
        // Arrange
        String query = ":has(span.icon)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Has);
        Assert.assertEquals(":has(:and(span, .icon))", eval.toString());
    }

    @Test
    public void parse_givenContains_shouldReturnContainsTextEvaluator() {
        // Arrange
        String query = ":contains(welcome)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsText);
        Assert.assertEquals(":contains(welcome)", eval.toString());
    }

    @Test
    public void parse_givenContainsOwn_shouldReturnContainsOwnTextEvaluator() {
        // Arrange
        String query = ":containsOwn(welcome)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsOwnText);
        Assert.assertEquals(":containsOwn(welcome)", eval.toString());
    }

    @Test
    public void parse_givenMatches_shouldReturnMatchesEvaluator() {
        // Arrange
        String query = ":matches(\\d+)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Matches);
        Assert.assertEquals(":matches(\\d+)", eval.toString());
    }

    @Test
    public void parse_givenMatchesOwn_shouldReturnMatchesOwnEvaluator() {
        // Arrange
        String query = ":matchesOwn([a-z]+)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.MatchesOwn);
        Assert.assertEquals(":matchesOwn([a-z]+)", eval.toString());
    }

    @Test
    public void parse_givenNot_shouldReturnStructuralNotEvaluator() {
        // Arrange
        String query = ":not(div.hidden)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Not);
        Assert.assertEquals(":not(:and(div, .hidden))", eval.toString());
    }

    @Test
    public void parse_givenChainedEvaluatorsWithoutWhitespace_shouldReturnCombiningAnd() {
        // Arrange
        String query = "a#main.link[href]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(a, #main, .link, [href])", eval.toString());
    }

    @Test
    public void parse_givenWhitespaceSeparatedTags_shouldReturnAncestorCombinator() {
        // Arrange
        String query = "div p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :parent(div))", eval.toString());
    }

    @Test
    public void parse_givenImmediateParentCombinator_shouldReturnImmediateParentEvaluator() {
        // Arrange
        String query = "ul > li";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(li, :ImmediateParent(ul))", eval.toString());
    }

    @Test
    public void parse_givenImmediatePreviousSiblingCombinator_shouldReturnImmediatePreviousSiblingEvaluator() {
        // Arrange
        String query = "h1 + p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :prev(h1))", eval.toString());
    }

    @Test
    public void parse_givenPreviousSiblingCombinator_shouldReturnPreviousSiblingEvaluator() {
        // Arrange
        String query = "h1 ~ p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :prev*(h1))", eval.toString());
    }

    @Test
    public void parse_givenOrCombinator_shouldReturnCombiningOr() {
        // Arrange
        String query = "div, p, span";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
        Assert.assertEquals(":or(div, p, span)", eval.toString());
    }

    @Test
    public void parse_givenLeadingImmediateParentCombinator_shouldPrependRootEvaluator() {
        // Arrange
        String query = "> p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :ImmediateParent(:root))", eval.toString());
    }

    @Test
    public void parse_givenLeadingSiblingCombinator_shouldPrependRootEvaluator() {
        // Arrange
        String query = "+ p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :prev(:root))", eval.toString());
    }

    @Test
    public void parse_givenLeadingGeneralSiblingCombinator_shouldPrependRootEvaluator() {
        // Arrange
        String query = "~ p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(p, :prev*(:root))", eval.toString());
    }

    @Test
    public void parse_givenLeadingWhitespaceCombinator_shouldPrependRootEvaluator() {
        // Arrange
        String query = "   p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
        Assert.assertEquals("p", eval.toString());
    }

    @Test
    public void parse_givenSubqueryWithNestedParensAndBrackets_shouldParseCorrectly() {
        // Arrange
        String query = "div:has(p[class=active]) > a";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
        Assert.assertEquals(":and(a, :ImmediateParent(:and(div, :has(:and(p, [class=active])))))", eval.toString());
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenUnknownToken_shouldThrowSelectorParseException() {
        // Arrange
        String query = "$invalid";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenInvalidAttributeOperator_shouldThrowSelectorParseException() {
        // Arrange
        String query = "[attr?value]";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNonNumericIndex_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":lt(abc)";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyId_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = "#";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyClass_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ".";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyHas_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":has()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyNot_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":not()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyContains_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":contains()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyContainsOwn_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":containsOwn()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyMatches_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":matches()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyMatchesOwn_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":matchesOwn()";

        // Act
        QueryParser.parse(query);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyAttribute_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = "[]";

        // Act
        QueryParser.parse(query);
    }
}