package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RenameLabelsTest {

  private static class TestCompiler extends AbstractCompiler {
    TestCompiler() {
      super(null);
    }

    @Override
    String getDebugLog() {
      return null;
    }

    @Override
    void reportCodeChange() {
      // no-op
    }

    @Override
    void reportCodeChange(String changeDescription) {
      // no-op
    }

    @Override
    boolean hasCodeChanged() {
      return false;
    }

    @Override
    void addToDebugLog(String message) {
      // no-op
    }

    @Override
    void addToDebugLog(Node node, String message) {
      // no-op
    }

    @Override
    void report(CheckLevel level, DiagnosticType type, Node node, String description) {
      // no-op
    }

    @Override
    void report(DiagnosticType type, Node node, String description) {
      // no-op
    }
  }

  private RenameLabels renameLabels;
  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    renameLabels = new RenameLabels(compiler);
  }

  @Test
  public void testProcessWithUnreferencedLabel() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "unusedLabel");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    renameLabels.process(externs, root);
    // Verify label was removed
    assertEquals(0, root.getChildCount());
  }

  @Test
  public void testProcessWithReferencedLabel() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "labelName");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    Node breakNode = new Node(Token.BREAK);
    Node breakName = new Node(Token.NAME, "labelName");
    breakNode.addChildToBack(breakName);
    root.addChildToBack(breakNode);

    renameLabels.process(externs, root);
    // Verify label renamed to "a"
    assertEquals("a", labelNode.getFirstChild().getString());
    assertEquals("a", breakName.getString());
  }

  @Test
  public void testProcessWithNestedLabels() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node outerLabel = new Node(Token.LABEL);
    Node outerName = new Node(Token.NAME, "outerLabel");
    Node outerBlock = new Node(Token.BLOCK);
    outerLabel.addChildToBack(outerName);
    outerLabel.addChildToBack(outerBlock);
    root.addChildToBack(outerLabel);

    Node innerLabel = new Node(Token.LABEL);
    Node innerName = new Node(Token.NAME, "innerLabel");
    Node innerBlock = new Node(Token.BLOCK);
    innerLabel.addChildToBack(innerName);
    innerLabel.addChildToBack(innerBlock);
    outerBlock.addChildToBack(innerLabel);

    Node breakOuter = new Node(Token.BREAK);
    Node breakOuterName = new Node(Token.NAME, "outerLabel");
    breakOuter.addChildToBack(breakOuterName);
    outerBlock.addChildToBack(breakOuter);

    Node breakInner = new Node(Token.BREAK);
    Node breakInnerName = new Node(Token.NAME, "innerLabel");
    breakInner.addChildToBack(breakInnerName);
    innerBlock.addChildToBack(breakInner);

    renameLabels.process(externs, root);
    // Verify outer label renamed to "a", inner to "b"
    assertEquals("a", outerLabel.getFirstChild().getString());
    assertEquals("b", innerLabel.getFirstChild().getString());
    assertEquals("a", breakOuterName.getString());
    assertEquals("b", breakInnerName.getString());
  }

  @Test
  public void testProcessWithMultipleLabelsSameDepth() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node label1 = new Node(Token.LABEL);
    Node label1Name = new Node(Token.NAME, "label1");
    Node label1Block = new Node(Token.BLOCK);
    label1.addChildToBack(label1Name);
    label1.addChildToBack(label1Block);
    root.addChildToBack(label1);

    Node label2 = new Node(Token.LABEL);
    Node label2Name = new Node(Token.NAME, "label2");
    Node label2Block = new Node(Token.BLOCK);
    label2.addChildToBack(label2Name);
    label2.addChildToBack(label2Block);
    root.addChildToBack(label2);

    Node break2 = new Node(Token.BREAK);
    Node break2Name = new Node(Token.NAME, "label2");
    break2.addChildToBack(break2Name);
    root.addChildToBack(break2);

    renameLabels.process(externs, root);
    // Both labels at same depth should get "a" and "b"
    assertEquals("a", label1.getFirstChild().getString());
    assertEquals("b", label2.getFirstChild().getString());
    assertEquals("b", break2Name.getString());
  }

  @Test
  public void testProcessWithUnreferencedLabelNotFirst() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node label1 = new Node(Token.LABEL);
    Node label1Name = new Node(Token.NAME, "label1");
    Node label1Block = new Node(Token.BLOCK);
    label1.addChildToBack(label1Name);
    label1.addChildToBack(label1Block);
    root.addChildToBack(label1);

    Node label2 = new Node(Token.LABEL);
    Node label2Name = new Node(Token.NAME, "label2");
    Node label2Block = new Node(Token.BLOCK);
    label2.addChildToBack(label2Name);
    label2.addChildToBack(label2Block);
    root.addChildToBack(label2);

    Node continue1 = new Node(Token.CONTINUE);
    Node continue1Name = new Node(Token.NAME, "label1");
    continue1.addChildToBack(continue1Name);
    root.addChildToBack(continue1);

    renameLabels.process(externs, root);
    // First label gets "a", second unreferenced removed
    assertEquals("a", label1.getFirstChild().getString());
    assertEquals(2, root.getChildCount()); // label1 and continue remain
    assertNull(label2.getParent());
  }

  @Test
  public void testProcessWithUnreferencedLabelOnlyReferencedInBreak() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "unusedLabel");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    Node breakNode = new Node(Token.BREAK);
    Node breakName = new Node(Token.NAME, "unusedLabel");
    breakNode.addChildToBack(breakName);
    root.addChildToBack(breakNode);

    // Both are unreferenced because break is inside label block but not actually breaking
    // This is handled by visitLabel which checks referenced flag
    renameLabels.process(externs, root);
    // label removed, break remains
    assertEquals(1, root.getChildCount());
    assertEquals(Token.BREAK, root.getFirstChild().getType());
  }

  @Test
  public void testProcessWithBreakWithoutLabel() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node breakNode = new Node(Token.BREAK);
    root.addChildToBack(breakNode); // no child name

    renameLabels.process(externs, root);
    // No changes expected
    assertEquals(1, root.getChildCount());
  }

  @Test
  public void testProcessWithLabelInInnerScope() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node function = new Node(Token.FUNCTION);
    Node functionName = new Node(Token.NAME, "fn");
    Node functionBody = new Node(Token.BLOCK);
    function.addChildToBack(functionName);
    function.addChildToBack(functionBody);
    root.addChildToBack(function);

    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "innerLabel");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    functionBody.addChildToBack(labelNode);

    Node breakNode = new Node(Token.BREAK);
    Node breakName = new Node(Token.NAME, "innerLabel");
    breakNode.addChildToBack(breakName);
    functionBody.addChildToBack(breakNode);

    renameLabels.process(externs, root);
    // Label in separate scope should get its own namespace
    assertEquals("a", labelNode.getFirstChild().getString());
    assertEquals("a", breakName.getString());
  }

  @Test
  public void testProcessWithRedundantLabelRename() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "a");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    Node breakNode = new Node(Token.BREAK);
    Node breakName = new Node(Token.NAME, "a");
    breakNode.addChildToBack(breakName);
    root.addChildToBack(breakNode);

    renameLabels.process(externs, root);
    // Already named "a", should not change
    assertEquals("a", labelNode.getFirstChild().getString());
    assertEquals("a", breakName.getString());
  }

  @Test
  public void testProcessWithManyLabelsReferenced() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    int numLabels = 60;
    Node[] labelNodes = new Node[numLabels];
    Node[] nameNodes = new Node[numLabels];

    for (int i = 0; i < numLabels; i++) {
      labelNodes[i] = new Node(Token.LABEL);
      nameNodes[i] = new Node(Token.NAME, "label" + i);
      Node block = new Node(Token.BLOCK);
      block.addChildToBack(new Node(Token.EMPTY));
      labelNodes[i].addChildToBack(nameNodes[i]);
      labelNodes[i].addChildToBack(block);
      root.addChildToBack(labelNodes[i]);
    }

    // Reference all labels via breaks
    for (int i = 0; i < numLabels; i++) {
      Node breakNode = new Node(Token.BREAK);
      Node breakName = new Node(Token.NAME, "label" + i);
      breakNode.addChildToBack(breakName);
      root.addChildToBack(breakNode);
    }

    renameLabels.process(externs, root);
    // All labels should be renamed to unique 2-char names (a..z, aa..az...)
    for (int i = 0; i < numLabels; i++) {
      String newName = labelNodes[i].getFirstChild().getString();
      assertNotNull(newName);
      assertEquals(2, newName.length());
      // Ensure all names are unique (not explicitly tested, but at least not empty)
      assertTrue(newName.length() > 0);
    }
  }

  @Test
  public void testProcessWithRemoveUnusedFalse() {
    TestCompiler compiler2 = new TestCompiler();
    RenameLabels renameLabels2 = new RenameLabels(compiler2, new DefaultNameSupplier(), false);

    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "unusedLabel");
    Node blockNode = new Node(Token.BLOCK);
    blockNode.addChildToBack(new Node(Token.EMPTY));
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    renameLabels2.process(externs, root);
    // Label should not be removed since removeUnused is false
    assertEquals(1, root.getChildCount());
    assertEquals(Token.LABEL, root.getFirstChild().getType());
    assertEquals("unusedLabel", root.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void testProcessWithLabelRemovalAndBlockMerge() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node labelNode = new Node(Token.LABEL);
    Node nameNode = new Node(Token.NAME, "unusedLabel");
    Node blockNode = new Node(Token.BLOCK);
    Node child1 = new Node(Token.EXPR_RESULT);
    Node child2 = new Node(Token.EXPR_RESULT);
    blockNode.addChildToBack(child1);
    blockNode.addChildToBack(child2);
    labelNode.addChildToBack(nameNode);
    labelNode.addChildToBack(blockNode);
    root.addChildToBack(labelNode);

    renameLabels.process(externs, root);
    // Label block should be merged with parent (which is root), so root gets children
    assertEquals(2, root.getChildCount());
    assertEquals(child1, root.getFirstChild());
    assertEquals(child2, root.getLastChild());
  }

  @Test
  public void testGetNameForId() {
    RenameLabels.ProcessLabels process = renameLabels.new ProcessLabels();
    // Since we can't easily access private state, test through reflection or indirect
    // This is a basic test that the method exists and returns null for invalid id
    try {
      String name = process.getNameForId(0);
      fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test
  public void testGetLabelInfoWithNullName() {
    RenameLabels.ProcessLabels process = renameLabels.new ProcessLabels();
    // Should return null for non-existent label
    assertNull(process.getLabelInfo("nonexistent"));
  }
}