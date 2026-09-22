package org.jsoup.select;

import org.junit.Assert;
import org.junit.Test;

public class QueryParserTest {

    @Test
    public void parse_givenTagSelector_shouldReturnTagEvaluator() {
        // Arrange
        String query = "div";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void parse_givenIdSelector_shouldReturnIdEvaluator() {
        // Arrange
        String query = "#header";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void parse_givenClassSelector_shouldReturnClassEvaluator() {
        // Arrange
        String query = ".content";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void parse_givenAllElementsSelector_shouldReturnAllElementsEvaluator() {
        // Arrange
        String query = "*";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void parse_givenAttributeSelector_shouldReturnAttributeEvaluator() {
        // Arrange
        String query = "[disabled]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void parse_givenAttributeStartingSelector_shouldReturnAttributeStartingEvaluator() {
        // Arrange
        String query = "[^data-]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void parse_givenAttributeWithValueSelector_shouldReturnAttributeWithValueEvaluator() {
        // Arrange
        String query = "[type=text]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void parse_givenAttributeWithValueNotSelector_shouldReturnAttributeWithValueNotEvaluator() {
        // Arrange
        String query = "[type!=hidden]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void parse_givenAttributeWithValueStartingSelector_shouldReturnAttributeWithValueStartingEvaluator() {
        // Arrange
        String query = "[href^=https]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void parse_givenAttributeWithValueEndingSelector_shouldReturnAttributeWithValueEndingEvaluator() {
        // Arrange
        String query = "[src$=.png]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void parse_givenAttributeWithValueContainingSelector_shouldReturnAttributeWithValueContainingEvaluator() {
        // Arrange
        String query = "[class*=button]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void parse_givenAttributeWithValueMatchingSelector_shouldReturnAttributeWithValueMatchingEvaluator() {
        // Arrange
        String query = "[value~=[0-9]+]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenInvalidAttributeOperator_shouldThrowSelectorParseException() {
        // Arrange
        String query = "[name?value]";

        // Act
        QueryParser.parse(query);
    }

    @Test
    public void parse_givenNamespaceWildcardTag_shouldReturnOrWithTagEndsWith() {
        // Arrange
        String query = "*|svg";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenExplicitNamespaceTag_shouldConvertPipeToColon() {
        // Arrange
        String query = "fb|name";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void parse_givenIndexLessThanSelector_shouldReturnIndexLessThanEvaluator() {
        // Arrange
        String query = ":lt(5)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void parse_givenIndexGreaterThanSelector_shouldReturnIndexGreaterThanEvaluator() {
        // Arrange
        String query = ":gt(2)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void parse_givenIndexEqualsSelector_shouldReturnIndexEqualsEvaluator() {
        // Arrange
        String query = ":eq(0)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenNonNumericIndex_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":eq(abc)";

        // Act
        QueryParser.parse(query);
    }

    @Test
    public void parse_givenHasSelector_shouldReturnStructuralHasEvaluator() {
        // Arrange
        String query = ":has(span)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyHasSelector_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":has()";

        // Act
        QueryParser.parse(query);
    }

    @Test
    public void parse_givenContainsSelector_shouldReturnContainsTextEvaluator() {
        // Arrange
        String query = ":contains(sample text)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void parse_givenContainsOwnSelector_shouldReturnContainsOwnTextEvaluator() {
        // Arrange
        String query = ":containsOwn(sample text)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test
    public void parse_givenContainsDataSelector_shouldReturnContainsDataEvaluator() {
        // Arrange
        String query = ":containsData(script text)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test
    public void parse_givenMatchesSelector_shouldReturnMatchesEvaluator() {
        // Arrange
        String query = ":matches(\\d+)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void parse_givenMatchesOwnSelector_shouldReturnMatchesOwnEvaluator() {
        // Arrange
        String query = ":matchesOwn(^test.*)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test
    public void parse_givenNotSelector_shouldReturnStructuralNotEvaluator() {
        // Arrange
        String query = ":not(div.active)";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test(expected = IllegalArgumentException.class)
    public void parse_givenEmptyNotSelector_shouldThrowIllegalArgumentException() {
        // Arrange
        String query = ":not()";

        // Act
        QueryParser.parse(query);
    }

    @Test
    public void parse_givenFirstChildPseudo_shouldReturnIsFirstChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":first-child");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsFirstChild);
    }

    @Test
    public void parse_givenLastChildPseudo_shouldReturnIsLastChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":last-child");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsLastChild);
    }

    @Test
    public void parse_givenFirstOfTypePseudo_shouldReturnIsFirstOfType() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":first-of-type");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsFirstOfType);
    }

    @Test
    public void parse_givenLastOfTypePseudo_shouldReturnIsLastOfType() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":last-of-type");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsLastOfType);
    }

    @Test
    public void parse_givenOnlyChildPseudo_shouldReturnIsOnlyChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":only-child");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsOnlyChild);
    }

    @Test
    public void parse_givenOnlyOfTypePseudo_shouldReturnIsOnlyOfType() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":only-of-type");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsOnlyOfType);
    }

    @Test
    public void parse_givenEmptyPseudo_shouldReturnIsEmpty() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":empty");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsEmpty);
    }

    @Test
    public void parse_givenRootPseudo_shouldReturnIsRoot() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":root");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsRoot);
    }

    @Test
    public void parse_givenNthChildOdd_shouldReturnIsNthChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-child(odd)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildEven_shouldReturnIsNthChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-child(even)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildPatternAB_shouldReturnIsNthChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-child(2n+1)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildNoA_shouldReturnIsNthChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-child(n+3)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthChildSingleNumber_shouldReturnIsNthChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-child(4)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void parse_givenNthLastChild_shouldReturnIsNthLastChild() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-last-child(2)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void parse_givenNthOfType_shouldReturnIsNthOfType() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-of-type(3n-1)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void parse_givenNthLastOfType_shouldReturnIsNthLastOfType() {
        // Arrange & Act
        Evaluator eval = QueryParser.parse(":nth-last-of-type(1)");

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastOfType);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenInvalidNthPattern_shouldThrowSelectorParseException() {
        // Arrange & Act
        QueryParser.parse(":nth-child(xyz)");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void parse_givenUnknownPseudoSelector_shouldThrowSelectorParseException() {
        // Arrange & Act
        QueryParser.parse(":unsupported-pseudo");
    }

    @Test
    public void parse_givenDirectChildCombinator_shouldReturnCombiningEvaluatorAnd() {
        // Arrange
        String query = "div > p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenDescendantCombinator_shouldReturnCombiningEvaluatorAnd() {
        // Arrange
        String query = "div p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenAdjacentSiblingCombinator_shouldReturnCombiningEvaluatorAnd() {
        // Arrange
        String query = "h1 + p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenGeneralSiblingCombinator_shouldReturnCombiningEvaluatorAnd() {
        // Arrange
        String query = "h1 ~ p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenCommaGroupOrCombinator_shouldReturnCombiningEvaluatorOr() {
        // Arrange
        String query = "div, p, span";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenLeadingCombinator_shouldIncludeRootEvaluator() {
        // Arrange
        String query = "> p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenCompoundSelectorWithoutSpaces_shouldReturnCombiningEvaluatorAnd() {
        // Arrange
        String query = "div#main.hero[data-active]";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenOrCombinatorFollowedByDirectChild_shouldMaintainPrecedenceAndReplaceRightMost() {
        // Arrange
        String query = "div, p > span";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void parse_givenMultipleSelectorsCombinedWithAnd_shouldChainEvaluators() {
        // Arrange
        String query = "div.classA.classB > span + a";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void parse_givenSubQueryWithBracketsAndParentheses_shouldPreserveCombinatorsInsideSubQuery() {
        // Arrange
        String query = "div:has(span > a[href]) > p";

        // Act
        Evaluator eval = QueryParser.parse(query);

        // Assert
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }
}