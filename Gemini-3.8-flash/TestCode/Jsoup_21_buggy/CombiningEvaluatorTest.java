package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CombiningEvaluatorTest {

    private static class StubEvaluator extends Evaluator {
        private final boolean matchResult;
        private final String token;
        private int invocationCount;

        public StubEvaluator(boolean matchResult) {
            this(matchResult, matchResult ? "stub:true" : "stub:false");
        }

        public StubEvaluator(boolean matchResult, String token) {
            this.matchResult = matchResult;
            this.token = token;
            this.invocationCount = 0;
        }

        @Override
        public boolean matches(Element root, Element element) {
            invocationCount++;
            return matchResult;
        }

        public int getInvocationCount() {
            return invocationCount;
        }

        @Override
        public String toString() {
            return token;
        }
    }

    @Test
    public void and_givenEmptyVarargs_shouldReturnTrue() {
        // Arrange
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And();

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue("Empty AND evaluator should evaluate to true", result);
        Assert.assertEquals(0, andEvaluator.evaluators.size());
    }

    @Test
    public void and_givenEmptyCollection_shouldReturnTrue() {
        // Arrange
        Collection<Evaluator> evaluators = Collections.emptyList();
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(evaluators);

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue("Empty AND evaluator from collection should evaluate to true", result);
        Assert.assertEquals(0, andEvaluator.evaluators.size());
    }

    @Test
    public void and_givenAllMatchesTrue_shouldReturnTrue() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true);
        StubEvaluator eval2 = new StubEvaluator(true);
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(eval1, eval2);

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(1, eval2.getInvocationCount());
    }

    @Test
    public void and_givenFirstMatchesFalse_shouldShortCircuitAndReturnFalse() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(false);
        StubEvaluator eval2 = new StubEvaluator(true);
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(eval1, eval2);

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(0, eval2.getInvocationCount());
    }

    @Test
    public void and_givenSecondMatchesFalse_shouldReturnFalse() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true);
        StubEvaluator eval2 = new StubEvaluator(false);
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(eval1, eval2);

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(1, eval2.getInvocationCount());
    }

    @Test
    public void and_givenCollectionConstructor_shouldPopulateEvaluators() {
        // Arrange
        List<Evaluator> list = new ArrayList<Evaluator>();
        StubEvaluator eval1 = new StubEvaluator(true);
        list.add(eval1);
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(list);

        // Act
        boolean result = andEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(1, andEvaluator.evaluators.size());
    }

    @Test(expected = NullPointerException.class)
    public void and_givenNullCollection_shouldThrowNullPointerException() {
        // Arrange & Act
        new CombiningEvaluator.And((Collection<Evaluator>) null);
    }

    @Test
    public void and_toString_shouldJoinEvaluatorsWithSpace() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true, "div");
        StubEvaluator eval2 = new StubEvaluator(true, ".active");
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(eval1, eval2);

        // Act
        String result = andEvaluator.toString();

        // Assert
        Assert.assertEquals("div .active", result);
    }

    @Test
    public void and_toString_givenEmptyEvaluators_shouldReturnEmptyString() {
        // Arrange
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And();

        // Act
        String result = andEvaluator.toString();

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void or_givenEmptyCollection_shouldReturnFalseOnMatches() {
        // Arrange
        Collection<Evaluator> emptyList = Collections.emptyList();
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(emptyList);

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse("Empty OR evaluator should evaluate to false", result);
        Assert.assertEquals(0, orEvaluator.evaluators.size());
    }

    @Test
    public void or_givenSingleEvaluatorReturningTrue_shouldReturnTrue() {
        // Arrange
        StubEvaluator eval = new StubEvaluator(true);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) eval));

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(1, orEvaluator.evaluators.size());
        Assert.assertEquals(1, eval.getInvocationCount());
    }

    @Test
    public void or_givenSingleEvaluatorReturningFalse_shouldReturnFalse() {
        // Arrange
        StubEvaluator eval = new StubEvaluator(false);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) eval));

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, orEvaluator.evaluators.size());
        Assert.assertEquals(1, eval.getInvocationCount());
    }

    @Test
    public void or_givenMultipleEvaluators_shouldWrapIntoAndEvaluator() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true);
        StubEvaluator eval2 = new StubEvaluator(true);
        List<Evaluator> initialList = new ArrayList<Evaluator>();
        initialList.add(eval1);
        initialList.add(eval2);

        // Act
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(initialList);

        // Assert
        Assert.assertEquals(1, orEvaluator.evaluators.size());
        Assert.assertTrue(orEvaluator.evaluators.get(0) instanceof CombiningEvaluator.And);
        Assert.assertTrue(orEvaluator.matches((Element) null, (Element) null));
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(1, eval2.getInvocationCount());
    }

    @Test
    public void or_givenMultipleEvaluatorsWhereOneFailsInAndClause_shouldReturnFalse() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true);
        StubEvaluator eval2 = new StubEvaluator(false);
        List<Evaluator> initialList = new ArrayList<Evaluator>();
        initialList.add(eval1);
        initialList.add(eval2);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(initialList);

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(1, eval2.getInvocationCount());
    }

    @Test
    public void or_add_shouldAppendAdditionalClause() {
        // Arrange
        StubEvaluator initialClause = new StubEvaluator(false);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) initialClause));

        StubEvaluator addedClause = new StubEvaluator(true);

        // Act
        orEvaluator.add(addedClause);
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(2, orEvaluator.evaluators.size());
        Assert.assertEquals(1, initialClause.getInvocationCount());
        Assert.assertEquals(1, addedClause.getInvocationCount());
    }

    @Test
    public void or_givenFirstClauseTrue_shouldShortCircuitAndReturnTrue() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true);
        StubEvaluator eval2 = new StubEvaluator(false);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) eval1));
        orEvaluator.add(eval2);

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(0, eval2.getInvocationCount());
    }

    @Test
    public void or_givenAllClausesFalse_shouldReturnFalse() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(false);
        StubEvaluator eval2 = new StubEvaluator(false);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) eval1));
        orEvaluator.add(eval2);

        // Act
        boolean result = orEvaluator.matches((Element) null, (Element) null);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(1, eval1.getInvocationCount());
        Assert.assertEquals(1, eval2.getInvocationCount());
    }

    @Test(expected = NullPointerException.class)
    public void or_givenNullCollection_shouldThrowNullPointerException() {
        // Arrange & Act
        new CombiningEvaluator.Or((Collection<Evaluator>) null);
    }

    @Test
    public void or_toString_shouldFormatCorrectly() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true, "div");
        StubEvaluator eval2 = new StubEvaluator(true, "p");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.singletonList((Evaluator) eval1));
        orEvaluator.add(eval2);

        // Act
        String result = orEvaluator.toString();

        // Assert
        Assert.assertEquals(":or[div, p]", result);
    }

    @Test
    public void or_toString_givenEmpty_shouldFormatWithEmptyList() {
        // Arrange
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Collections.emptyList());

        // Act
        String result = orEvaluator.toString();

        // Assert
        Assert.assertEquals(":or[]", result);
    }

    @Test
    public void or_toString_givenMultipleInitialEvaluators_shouldShowNestedAnd() {
        // Arrange
        StubEvaluator eval1 = new StubEvaluator(true, "div");
        StubEvaluator eval2 = new StubEvaluator(true, ".cls");
        List<Evaluator> initialList = new ArrayList<Evaluator>();
        initialList.add(eval1);
        initialList.add(eval2);
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(initialList);

        // Act
        String result = orEvaluator.toString();

        // Assert
        Assert.assertEquals(":or[div .cls]", result);
    }
}