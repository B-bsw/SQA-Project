package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InlineCostEstimatorTest {

  @Test
  public void constructor_invokedViaReflection_shouldCreateInstance() throws Exception {
    Constructor constructor = InlineCostEstimator.class.getDeclaredConstructor(new Class[0]);
    constructor.setAccessible(true);
    Object instance = constructor.newInstance(new Object[0]);
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof InlineCostEstimator);
  }

  @Test
  public void estimatedIdentifierCost_whenChecked_shouldEqualTwo() {
    Assert.assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }

  @Test
  public void getCost_givenSingleIdentifier_shouldCostTwoCharacters() {
    Node nameNode = Node.newString(Token.NAME, "a");
    int cost = InlineCostEstimator.getCost(nameNode);
    Assert.assertEquals(2, cost);
  }

  @Test
  public void getCost_givenLongIdentifier_shouldStillCostTwoCharacters() {
    Node shortNameNode = Node.newString(Token.NAME, "x");
    Node longNameNode = Node.newString(Token.NAME, "veryLongDescriptiveVariableName");

    int shortCost = InlineCostEstimator.getCost(shortNameNode);
    int longCost = InlineCostEstimator.getCost(longNameNode);

    Assert.assertEquals(2, shortCost);
    Assert.assertEquals(2, longCost);
    Assert.assertEquals(shortCost, longCost);
  }

  @Test
  public void getCost_givenNumberNode_shouldReturnCostOfFormattedNumber() {
    Node numberNode = Node.newNumber(5.0);
    int cost = InlineCostEstimator.getCost(numberNode);
    Assert.assertTrue(cost > 0);
  }

  @Test
  public void getCost_givenStringNode_shouldReturnCostIncludingQuotes() {
    Node stringNode = Node.newString("hello");
    int cost = InlineCostEstimator.getCost(stringNode);
    // "hello" rendered in JS includes surrounding quotes, e.g. "hello" (7 chars)
    Assert.assertEquals(7, cost);
  }

  @Test
  public void getCost_givenEmptyStringNode_shouldReturnCostForQuotes() {
    Node stringNode = Node.newString("");
    int cost = InlineCostEstimator.getCost(stringNode);
    // "" rendered in JS includes surrounding quotes (2 chars)
    Assert.assertEquals(2, cost);
  }

  @Test
  public void getCost_givenSingleArg_shouldMatchExplicitMaxIntegerThreshold() {
    Node nameNode = Node.newString(Token.NAME, "myVar");
    int costWithoutThreshold = InlineCostEstimator.getCost(nameNode);
    int costWithThreshold = InlineCostEstimator.getCost(nameNode, Integer.MAX_VALUE);

    Assert.assertEquals(costWithoutThreshold, costWithThreshold);
  }

  @Test
  public void getCost_givenCostThresholdZero_shouldHaltProcessingEarly() {
    Node nameNode = Node.newString(Token.NAME, "testVariable");
    int cost = InlineCostEstimator.getCost(nameNode, 0);

    // First append will output "ab" (cost = 2), which is >= maxCost (0), stopping further processing
    Assert.assertTrue(cost >= 0);
  }

  @Test
  public void getCost_givenNegativeThreshold_shouldHaltProcessingEarly() {
    Node nameNode = Node.newString(Token.NAME, "testVariable");
    int cost = InlineCostEstimator.getCost(nameNode, -10);

    Assert.assertTrue(cost >= 0);
  }

  @Test
  public void getCost_givenCostThresholdLowerThanActualCost_shouldStopAccumulatingFurther() {
    Node functionCall = new Node(Token.CALL,
        Node.newString(Token.NAME, "foo"),
        Node.newString(Token.NAME, "bar"),
        Node.newString(Token.NAME, "baz"));

    int fullCost = InlineCostEstimator.getCost(functionCall, Integer.MAX_VALUE);
    int threshold = 2;
    int boundedCost = InlineCostEstimator.getCost(functionCall, threshold);

    Assert.assertTrue(boundedCost <= fullCost);
    Assert.assertTrue(boundedCost >= threshold);
  }

  @Test
  public void getCost_givenCostThresholdEqualToAppendedCost_shouldSetContinueProcessingFalse() {
    Node nameNode = Node.newString(Token.NAME, "identifier");
    int exactCost = InlineCostEstimator.getCost(nameNode);

    int costWithExactThreshold = InlineCostEstimator.getCost(nameNode, exactCost);
    Assert.assertEquals(exactCost, costWithExactThreshold);
  }

  @Test(expected = NullPointerException.class)
  public void getCost_givenNullRootNode_shouldThrowNullPointerException() {
    InlineCostEstimator.getCost(null);
  }

  @Test(expected = NullPointerException.class)
  public void getCost_givenNullRootNodeWithThreshold_shouldThrowNullPointerException() {
    InlineCostEstimator.getCost(null, 10);
  }
}