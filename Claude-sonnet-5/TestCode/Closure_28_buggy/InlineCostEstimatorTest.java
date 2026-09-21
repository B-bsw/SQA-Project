package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import org.junit.Test;

/**
 * Unit tests for {@link InlineCostEstimator}.
 */
public class InlineCostEstimatorTest {

  private Node buildBlockWithNStatements(int n) {
    Node block = IR.block();
    for (int i = 0; i < n; i++) {
      Node nameNode = IR.name("x" + i);
      block.addChildToBack(IR.exprResult(nameNode));
    }
    return block;
  }

  @Test
  public void testEstimatedIdentifierCostConstant() {
    assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }

  @Test
  public void testGetCost_NullInput_ThrowsException() {
    try {
      InlineCostEstimator.getCost(null);
      fail("Expected a NullPointerException to be thrown for null input");
    } catch (NullPointerException expected) {
      // expected behavior
    }
  }

  @Test
  public void testGetCost_NullInput_WithThreshold_ThrowsException() {
    try {
      InlineCostEstimator.getCost(null, 10);
      fail("Expected a NullPointerException to be thrown for null input");
    } catch (NullPointerException expected) {
      // expected behavior
    }
  }

  @Test
  public void testGetCost_NameNode_UsesFixedIdentifierCostRegardlessOfLength() {
    Node shortName = IR.name("a");
    Node longName = IR.name("aVeryLongVariableNameThatShouldStillCostTheSame");

    int costShort = InlineCostEstimator.getCost(shortName);
    int costLong = InlineCostEstimator.getCost(longName);

    assertEquals(InlineCostEstimator.ESTIMATED_IDENTIFIER_COST, costShort);
    assertEquals(InlineCostEstimator.ESTIMATED_IDENTIFIER_COST, costLong);
    assertEquals(costShort, costLong);
  }

  @Test
  public void testGetCost_NumberNode_PositiveCost() {
    Node numberNode = IR.number(42);
    int cost = InlineCostEstimator.getCost(numberNode);
    assertTrue("Cost for a number literal should be positive", cost > 0);
  }

  @Test
  public void testGetCost_NumberNode_DifferentValuesCanDifferInCost() {
    Node smallNumber = IR.number(1);
    Node largeNumber = IR.number(1234567890);

    int costSmall = InlineCostEstimator.getCost(smallNumber);
    int costLarge = InlineCostEstimator.getCost(largeNumber);

    assertTrue("Larger numeric literal should generally cost more or equal",
        costLarge >= costSmall);
  }

  @Test
  public void testGetCost_StringNode_VariesWithContentLength() {
    Node shortString = IR.string("a");
    Node longString = IR.string("aaaaaaaaaaaaaaaaaaaa");

    int costShort = InlineCostEstimator.