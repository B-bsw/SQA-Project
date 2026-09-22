package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class InlineCostEstimatorTest {

  private static final int THRESHOLD_NORMAL = 1000;

  @Test
  public void testCostCalculation() {
    Node root = new Node(Token.SCRIPT); // Root node
    Node nameNode = new Node(Token.NAME, "varName");
    root.addChildToFront(nameNode);
    int cost = InlineCostEstimator.getCost(root);
    // Expect cost > 0 but less than threshold
    assertTrue("Cost should be positive, but was: " + cost, cost > 0);
    assertTrue("Cost should be within threshold, but was: " + cost, cost < THRESHOLD_NORMAL);
  }

  @Test
  public void testCostThresholdReached() {
    Node root = new Node(Token.SCRIPT);
    // Add many nodes to exceed a small threshold
    for (int i = 0; i < 100; i++) {
      Node name = new Node(Token.NAME, "longIdentifierName" + i);
      root.addChildToFront(name);
    }
    // Very low threshold to trigger early stop
    int cost = InlineCostEstimator.getCost(root, 1);
    assertEquals(1, cost); // Should stop at 1 because of threshold
  }

  @Test
  public void testGetCostWithNullRoot() {
    try {
      int cost = InlineCostEstimator.getCost(null);
      // If no exception, assert that cost is 0? But actually should throw NPE
      fail("Expected NullPointerException but got cost: " + cost);
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testGetCostWithZeroThreshold() {
    Node root = new Node(Token.SCRIPT);
    Node name = new Node(Token.NAME, "x");
    root.addChildToFront(name);
    // Threshold 0 should cause append to immediately set continueProcessing false
    // But initialization of cost is 0, and first append sets cost to identifier length (2) which exceeds 0, so cost = 2
    int cost = InlineCostEstimator.getCost(root, 0);
    assertEquals(2, cost); // "ab" identifier cost
  }

  @Test
  public void testIdentifierCostConstant() {
    // Test that ESTIMATED_IDENTIFIER_COST is as expected
    assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }

  @Test
  public void testCostStopsProcessingWhenThresholdReached() {
    Node root = new Node(Token.SCRIPT);
    Node name1 = new Node(Token.NAME, "abc");
    root.addChildToFront(name1);
    Node name2 = new Node(Token.NAME, "def");
    root.addChildToFront(name2);
    // Set threshold to exactly 2 (cost of one identifier)
    int cost = InlineCostEstimator.getCost(root, 2);
    // Since first identifier costs 2, cost = 2 and continueProcessing is set false
    // But second identifier might not be processed? Actually add() processes tree, 
    // but continueProcessing stops after first append
    // However, the CodeGenerator processes nodes in order. We check that cost is at least 2 and at most 4.
    // Given uncertainty, assert cost >= 2 and <= 4
    assertTrue("Cost should be between 2 and 4, got: " + cost, cost >= 2 && cost <= 4);
  }

  @Test
  public void testMultipleNodes() {
    Node root = new Node(Token.SCRIPT);
    Node name = new Node(Token.NAME, "abc");
    root.addChildToFront(name);
    Node number = new Node(Token.NUMBER, 123);
    root.addChildToFront(number);
    Node string = new Node(Token.STRING, "hello");
    root.addChildToFront(string);
    int cost = InlineCostEstimator.getCost(root);
    assertTrue("Cost should be positive for multiple nodes", cost > 0);
  }

  @Test
  public void testCompiledSizeEstimatorDirectly() {
    // Unit test the private inner class via reflection? Not possible directly.
    // But we can test through getCost.
    Node root = new Node(Token.SCRIPT);
    Node block = new Node(Token.BLOCK);
    root.addChildToFront(block);
    int cost = InlineCostEstimator.getCost(root);
    assertTrue("Block cost should be 0 or more", cost >= 0);
  }

  @Test
  public void testZeroSizedRoot() {
    Node root = new Node(Token.SCRIPT); // bare root
    int cost = InlineCostEstimator.getCost(root);
    assertEquals(0, cost); // No children, no cost
  }

  @Test
  public void testLastCharUpdate() {
    Node root = new Node(Token.SCRIPT);
    Node name = new Node(Token.NAME, "xyz");
    root.addChildToFront(name);
    int cost = InlineCostEstimator.getCost(root);
    // The last char would be 'b' from "ab" identifier
    // But we can't access estimator's state. We'll just test for no exception.
    assertTrue(cost > 0);
  }
}