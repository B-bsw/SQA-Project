package org.jsoup.select;

import org.junit.Assert;
import org.junit.Test;

public class QueryParserTest {

    @Test
    public void parse_givenTagSelector_shouldReturnTagEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void parse_givenIdSelector_shouldReturnIdEvaluator() {
        Evaluator eval = QueryParser.parse("#main");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void parse_givenClassSelector_shouldReturnClassEvaluator() {
        Evaluator eval = QueryParser.parse(".content");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void parse_givenAllElementsSelector_shouldReturnAllElementsEvaluator() {
        Evaluator eval = QueryParser.parse("*");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void parse_givenWildcardNamespaceTag_shouldReturnOrEvaluator() {
        Evaluator eval = QueryParser.parse("*|div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenNamespacedTag_shouldNormalizeTagSeparator() {
        Evaluator eval = QueryParser.parse("fb|name");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void parse_givenAttributeKeyOnly_shouldReturnAttributeEvaluator() {
        Evaluator eval = QueryParser.parse("[disabled]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void parse_givenAttributeKeyStartingPrefix_shouldReturnAttributeStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[^data-]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void parse_givenAttributeEquals_shouldReturnAttributeWithValue() {
        Evaluator eval = QueryParser.parse("[type=text]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void parse_givenAttributeNotEquals_shouldReturnAttributeWithValueNot() {
        Evaluator eval = QueryParser.parse("[type!=text]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void parse_givenAttributeStartsWith_shouldReturnAttributeWithValueStarting() {
        Evaluator eval = QueryParser.parse("[href^=https]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void parse_givenAttributeEndsWith_shouldReturnAttributeWithValueEnding() {
        Evaluator eval = QueryParser.parse("[href$=.png]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void parse_givenAttributeContains_shouldReturnAttributeWithValueContaining() {
        Evaluator eval = QueryParser.parse("[title*=test]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void parse_givenAttributeMatchesRegex_shouldReturnAttributeWithValueMatching() {
        Evaluator eval = QueryParser.parse("[val~=[0-9]+]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenInvalidAttributeOperator_shouldThrowSelectorParseException() {
        QueryParser.parse("[val?foo]");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyAttribute_shouldThrowSelectorParseException() {
        QueryParser.parse("[]");
    }

    @Test
    public void parse_givenIndexLessThan_shouldReturnIndexLessThanEvaluator() {
        Evaluator eval = QueryParser.parse(":lt(3)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void parse_givenIndexGreaterThan_shouldReturnIndexGreaterThanEvaluator() {
        Evaluator eval = QueryParser.parse(":gt(5)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void parse_givenIndexEquals_shouldReturnIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(0)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenNonNumericIndex_shouldThrowSelectorParseException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test
    public void parse_givenHas_shouldReturnHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyHas_shouldThrowSelectorParseException() {
        QueryParser.parse(":has()");
    }

    @Test
    public void parse_givenContains_shouldReturnContainsTextEvaluator() {
        Evaluator eval = QueryParser.parse(":contains(jsoup)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void parse_givenContainsOwn_shouldReturnContainsOwnTextEvaluator() {
        Evaluator eval = QueryParser.parse(":containsOwn(jsoup)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyContains_shouldThrowSelectorParseException() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void parse_givenContainsData_shouldReturnContainsDataEvaluator() {
        Evaluator eval = QueryParser.parse(":containsData(scriptData)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyContainsData_shouldThrowSelectorParseException() {
        QueryParser.parse(":containsData()");
    }

    @Test
    public void parse_givenMatches_shouldReturnMatchesEvaluator() {
        Evaluator eval = QueryParser.parse(":matches([a-z]+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void parse_givenMatchesOwn_shouldReturnMatchesOwnEvaluator() {
        Evaluator eval = QueryParser.parse(":matchesOwn([0-9]+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyMatches_shouldThrowSelectorParseException() {
        QueryParser.parse(":matches()");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyMatchesOwn_shouldThrowSelectorParseException() {
        QueryParser.parse(":matchesOwn()");
    }

    @Test
    public void parse_givenNot_shouldReturnNotEvaluator() {
        Evaluator eval = QueryParser.parse(":not(div.hidden)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyNot_shouldThrowSelectorParseException() {
        QueryParser.parse(":not()");
    }

    @Test
    public void parse_givenNthChildOdd_shouldReturnNthChildWithStepTwoOffsetOne() {
        Evaluator eval = QueryParser.parse(":nth-child(odd)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildEven_shouldReturnNthChildWithStepTwoOffsetZero() {
        Evaluator eval = QueryParser.parse(":nth-child(even)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildAnPlusB_shouldReturnNthChild() {
        Evaluator eval = QueryParser.parse(":nth-child(2n+1)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildNOnly_shouldReturnNthChild() {
        Evaluator eval = QueryParser.parse(":nth-child(n)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildConstantOnly_shouldReturnNthChild() {
        Evaluator eval = QueryParser.parse(":nth-child(3)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthLastChild_shouldReturnIsNthLastChild() {
        Evaluator eval = QueryParser.parse(":nth-last-child(2n-1)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void parse_givenNthOfType_shouldReturnIsNthOfType() {
        Evaluator eval = QueryParser.parse(":nth-of-type(+3n+2)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void parse_givenNthLastOfType_shouldReturnIsNthLastOfType() {
        Evaluator eval = QueryParser.parse(":nth-last-of-type(1)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastOfType);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenInvalidNthExpression_shouldThrowSelectorParseException() {
        QueryParser.parse(":nth-child(invalid)");
    }

    @Test
    public void parse_givenFirstChild_shouldReturnIsFirstChild() {
        Evaluator eval = QueryParser.parse(":first-child");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsFirstChild);
    }

    @Test
    public void parse_givenLastChild_shouldReturnIsLastChild() {
        Evaluator eval = QueryParser.parse(":last-child");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsLastChild);
    }

    @Test
    public void parse_givenFirstOfType_shouldReturnIsFirstOfType() {
        Evaluator eval = QueryParser.parse(":first-of-type");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsFirstOfType);
    }

    @Test
    public void parse_givenLastOfType_shouldReturnIsLastOfType() {
        Evaluator eval = QueryParser.parse(":last-of-type");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsLastOfType);
    }

    @Test
    public void parse_givenOnlyChild_shouldReturnIsOnlyChild() {
        Evaluator eval = QueryParser.parse(":only-child");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsOnlyChild);
    }

    @Test
    public void parse_givenOnlyOfType_shouldReturnIsOnlyOfType() {
        Evaluator eval = QueryParser.parse(":only-of-type");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsOnlyOfType);
    }

    @Test
    public void parse_givenEmpty_shouldReturnIsEmpty() {
        Evaluator eval = QueryParser.parse(":empty");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsEmpty);
    }

    @Test
    public void parse_givenRoot_shouldReturnIsRoot() {
        Evaluator eval = QueryParser.parse(":root");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsRoot);
    }

    @Test
    public void parse_givenLeadingCombinatorChild_shouldPrefixWithRootEvaluator() {
        Evaluator eval = QueryParser.parse("> div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenLeadingCombinatorSibling_shouldPrefixWithRootEvaluator() {
        Evaluator eval = QueryParser.parse("+ p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenLeadingCombinatorSubsequentSibling_shouldPrefixWithRootEvaluator() {
        Evaluator eval = QueryParser.parse("~ span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenChildCombinator_shouldCreateImmediateParentCombinator() {
        Evaluator eval = QueryParser.parse("div > p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenDescendantCombinator_shouldCreateParentCombinator() {
        Evaluator eval = QueryParser.parse("div p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenAdjacentSiblingCombinator_shouldCreateImmediatePreviousSiblingCombinator() {
        Evaluator eval = QueryParser.parse("div + p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenGeneralSiblingCombinator_shouldCreatePreviousSiblingCombinator() {
        Evaluator eval = QueryParser.parse("div ~ p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenCommaGroupOr_shouldReturnOrCombinator() {
        Evaluator eval = QueryParser.parse("div, p, span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenCommaWithSubsequentChildCombinator_shouldPreservePrecedence() {
        Evaluator eval = QueryParser.parse("a, b > c");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenCompoundSelectorWithIdAndClass_shouldCombineEvaluators() {
        Evaluator eval = QueryParser.parse("div#header.banner[data-role]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenCompoundSelectorWithMultipleClasses_shouldCombineEvaluators() {
        Evaluator eval = QueryParser.parse(".btn.btn-primary");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenChainedSubqueriesWithParenthesesAndBrackets_shouldChompBalancedCorrectly() {
        Evaluator eval = QueryParser.parse("div:has(p.test[data-val=foo]) > span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenUnhandledToken_shouldThrowSelectorParseException() {
        QueryParser.parse("div % foo");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenTrailingOr_shouldThrowSelectorParseException() {
        QueryParser.parse("div,");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyId_shouldThrowSelectorParseException() {
        QueryParser.parse("#");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenEmptyClass_shouldThrowSelectorParseException() {
        QueryParser.parse(".");
    }
}