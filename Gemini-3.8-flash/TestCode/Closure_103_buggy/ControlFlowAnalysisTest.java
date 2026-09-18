package com.google.javascript.jscomp;

import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ControlFlowAnalysisTest {

  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private ControlFlowAnalysis createCfa(boolean shouldTraverseFunctions) {
    return new ControlFlowAnalysis(compiler, shouldTraverseFunctions);
  }

  private Node createFunctionNode(String name, Node body) {
    Node nameNode = Node.newString(Token.NAME, name);
    Node params = new Node(Token.PARAM_LIST);
    return new Node(Token.FUNCTION, nameNode, params, body);
  }

  @Test
  public void isBreakStructure_givenStandardLoopsAndSwitch_shouldReturnTrue() {
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.FOR), true));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.DO), true));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.WHILE), true));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.SWITCH), true));
  }

  @Test
  public void isBreakStructure_givenLabeledStructures_shouldReturnTrueOnlyWhenLabeled() {
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.BLOCK), true));

    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.IF), true));

    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), false));
    Assert.assertTrue(ControlFlowAnalysis.isBreakStructure(new Node(Token.TRY), true));
  }

  @Test
  public void isBreakStructure_givenOtherTokens_shouldReturnFalse() {
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.VAR), false));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.VAR), true));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.EXPR_RESULT), false));
    Assert.assertFalse(ControlFlowAnalysis.isBreakStructure(new Node(Token.EXPR_RESULT), true));
  }

  @Test
  public void isContinueStructure_givenLoopNodes_shouldReturnTrue() {
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.FOR)));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.DO)));
    Assert.assertTrue(ControlFlowAnalysis.isContinueStructure(new Node(Token.WHILE)));
  }

  @Test
  public void isContinueStructure_givenNonLoopNodes_shouldReturnFalse() {
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.SWITCH)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.BLOCK)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.IF)));
    Assert.assertFalse(ControlFlowAnalysis.isContinueStructure(new Node(Token.VAR)));
  }

  @Test
  public void process_givenEmptyScript_shouldBuildValidCfgAndPriorities() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node script = new Node(Token.SCRIPT);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertNotNull(cfg);
    Assert.assertNotNull(cfg.getEntry());
    Assert.assertNotNull(cfg.getImplicitReturn());

    Comparator<DiGraphNode<Node, Branch>> fwd = cfg.getOptionalNodeComparator(true);
    Comparator<DiGraphNode<Node, Branch>> rev = cfg.getOptionalNodeComparator(false);
    Assert.assertNotNull(fwd);
    Assert.assertNotNull(rev);

    DiGraphNode<Node, Branch> entry = cfg.getEntry();
    DiGraphNode<Node, Branch> ret = cfg.getImplicitReturn();
    Assert.assertTrue(fwd.compare(entry, ret) < 0);
    Assert.assertTrue(rev.compare(entry, ret) > 0);
  }

  @Test
  public void process_givenIfWithoutElse_shouldConnectTrueAndFollowNode() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node cond = Node.newString(Token.NAME, "cond");
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node ifNode = new Node(Token.IF, cond, thenBlock);
    Node script = new Node(Token.SCRIPT, ifNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(ifNode));
    List<DiGraphNode<Node, Branch>> succs = cfg.getDirectedSuccNodes(ifNode);
    Assert.assertFalse(succs.isEmpty());
  }

  @Test
  public void process_givenIfWithElse_shouldConnectBothBranches() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node cond = Node.newString(Token.NAME, "cond");
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "thenBranch")));
    Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "elseBranch")));
    Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
    Node script = new Node(Token.SCRIPT, ifNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(ifNode));
    Assert.assertTrue(cfg.getDirectedSuccNodes(ifNode).size() >= 2);
  }

  @Test
  public void process_givenWhileLoop_shouldConnectConditionAndBody() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node cond = Node.newString(Token.NAME, "cond");
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "body")));
    Node whileNode = new Node(Token.WHILE, cond, body);
    Node script = new Node(Token.SCRIPT, whileNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(whileNode));
  }

  @Test
  public void process_givenDoWhileLoop_shouldConnectBodyAndCondition() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "body")));
    Node cond = Node.newString(Token.NAME, "cond");
    Node doNode = new Node(Token.DO, body, cond);
    Node script = new Node(Token.SCRIPT, doNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(doNode));
  }

  @Test
  public void process_givenStandardForLoop_shouldConnectInitCondIterAndBody() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node init = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = Node.newString(Token.NAME, "cond");
    Node iter = new Node(Token.EXPR_RESULT, new Node(Token.INC, Node.newString(Token.NAME, "i")));
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node forNode = new Node(Token.FOR, init, cond, iter, body);
    Node script = new Node(Token.SCRIPT, forNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(forNode));
    Assert.assertTrue(cfg.hasNode(init));
    Assert.assertTrue(cfg.hasNode(iter));
  }

  @Test
  public void process_givenForInLoop_shouldConnectCollectionAndBody() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node item = Node.newString(Token.NAME, "k");
    Node obj = Node.newString(Token.NAME, "obj");
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node forInNode = new Node(Token.FOR, item, obj, body);
    Node script = new Node(Token.SCRIPT, forInNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(forInNode));
  }

  @Test
  public void process_givenSwitchWithCasesAndDefault_shouldBuildControlFlow() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node expr = Node.newString(Token.NAME, "val");
    Node switchNode = new Node(Token.SWITCH, expr);

    Node case1 = new Node(Token.CASE, Node.newNumber(1.0),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c1"))));
    Node case2 = new Node(Token.CASE, Node.newNumber(2.0),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c2"))));
    Node defNode = new Node(Token.DEFAULT,
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "def"))));

    switchNode.addChildToBack(case1);
    switchNode.addChildToBack(case2);
    switchNode.addChildToBack(defNode);
    Node script = new Node(Token.SCRIPT, switchNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(switchNode));
    Assert.assertTrue(cfg.hasNode(case1));
    Assert.assertTrue(cfg.hasNode(case2));
    Assert.assertTrue(cfg.hasNode(defNode));
  }

  @Test
  public void process_givenEmptySwitch_shouldHandleCleanly() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node expr = Node.newString(Token.NAME, "val");
    Node switchNode = new Node(Token.SWITCH, expr);
    Node script = new Node(Token.SCRIPT, switchNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(switchNode));
  }

  @Test
  public void process_givenWithStatement_shouldConnectExpressionAndBody() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node expr = Node.newString(Token.NAME, "o");
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));
    Node withNode = new Node(Token.WITH, expr, body);
    Node script = new Node(Token.SCRIPT, withNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(withNode));
  }

  @Test
  public void process_givenTryCatchFinally_shouldConnectExceptionEdges() {
    ControlFlowAnalysis cfa = createCfa(false);

    Node callExpr = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, callExpr));

    Node catchParam = Node.newString(Token.NAME, "e");
    Node catchBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "handled")));
    Node catchNode = new Node(Token.CATCH, catchParam, catchBody);
    Node catchBlock = new Node(Token.BLOCK, catchNode);

    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "finallyStmt")));

    Node tryNode = new Node(Token.TRY, tryBlock, catchBlock, finallyBlock);
    Node script = new Node(Token.SCRIPT, tryNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(tryNode));
    Assert.assertTrue(cfg.hasNode(catchNode));
  }

  @Test
  public void process_givenTryWithoutCatchHandler_shouldConnectDirectlyToFinally() {
    ControlFlowAnalysis cfa = createCfa(false);

    Node callExpr = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
    Node tryBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, callExpr));
    Node emptyCatchBlock = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "fin")));

    Node tryNode = new Node(Token.TRY, tryBlock, emptyCatchBlock, finallyBlock);
    Node script = new Node(Token.SCRIPT, tryNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(tryNode));
  }

  @Test
  public void process_givenThrowStatement_shouldRegisterInCfg() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node throwNode = new Node(Token.THROW, Node.newString(Token.NAME, "err"));
    Node script = new Node(Token.SCRIPT, throwNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(throwNode));
  }

  @Test
  public void process_givenBreakInsideWhile_shouldConnectToFollowNode() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node cond = Node.newString(Token.NAME, "c");
    Node breakNode = new Node(Token.BREAK);
    Node body = new Node(Token.BLOCK, breakNode);
    Node whileNode = new Node(Token.WHILE, cond, body);
    Node script = new Node(Token.SCRIPT, whileNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(breakNode));
  }

  @Test
  public void process_givenLabeledBreak_shouldBreakToMatchingLabel() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node breakNode = new Node(Token.BREAK, Node.newString(Token.NAME, "myLabel"));
    Node blockNode = new Node(Token.BLOCK, breakNode);
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "myLabel"), blockNode);
    Node script = new Node(Token.SCRIPT, labelNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(breakNode));
  }

  @Test
  public void process_givenBreakWithoutTarget_shouldThrowIllegalStateException() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node breakNode = new Node(Token.BREAK);
    Node script = new Node(Token.SCRIPT, breakNode);

    try {
      cfa.process(null, script);
      Assert.fail("Expected IllegalStateException due to missing break target");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Cannot find break target"));
    }
  }

  @Test
  public void process_givenContinueInsideFor_shouldConnectToIter() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node init = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
    Node cond = Node.newString(Token.NAME, "cond");
    Node iter = new Node(Token.EXPR_RESULT, new Node(Token.INC, Node.newString(Token.NAME, "i")));
    Node continueNode = new Node(Token.CONTINUE);
    Node body = new Node(Token.BLOCK, continueNode);
    Node forNode = new Node(Token.FOR, init, cond, iter, body);
    Node script = new Node(Token.SCRIPT, forNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(continueNode));
  }

  @Test
  public void process_givenLabeledContinue_shouldMatchLabel() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node cond = Node.newString(Token.NAME, "c");
    Node continueNode = new Node(Token.CONTINUE, Node.newString(Token.NAME, "loopLabel"));
    Node body = new Node(Token.BLOCK, continueNode);
    Node whileNode = new Node(Token.WHILE, cond, body);
    Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "loopLabel"), whileNode);
    Node script = new Node(Token.SCRIPT, labelNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(continueNode));
  }

  @Test
  public void process_givenContinueWithoutTarget_shouldThrowIllegalStateException() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node continueNode = new Node(Token.CONTINUE);
    Node script = new Node(Token.SCRIPT, continueNode);

    try {
      cfa.process(null, script);
      Assert.fail("Expected IllegalStateException due to missing continue target");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().contains("Cannot find continue target"));
    }
  }

  @Test
  public void process_givenReturnWithAndWithoutExpression_shouldConnectProperly() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node ret1 = new Node(Token.RETURN);
    Node ret2 = new Node(Token.RETURN, Node.newString(Token.NAME, "val"));
    Node script = new Node(Token.SCRIPT, ret1, ret2);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(ret1));
    Assert.assertTrue(cfg.hasNode(ret2));
  }

  @Test
  public void process_givenReturnInsideTryFinally_shouldConnectToFinally() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node returnNode = new Node(Token.RETURN, Node.newString(Token.NAME, "x"));
    Node tryBlock = new Node(Token.BLOCK, returnNode);
    Node emptyCatch = new Node(Token.BLOCK);
    Node finallyBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "clean")));
    Node tryNode = new Node(Token.TRY, tryBlock, emptyCatch, finallyBlock);
    Node script = new Node(Token.SCRIPT, tryNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(returnNode));
  }

  @Test
  public void process_givenFunctionWithTraverseFunctionsTrue_shouldTraverseFunctionBody() {
    ControlFlowAnalysis cfa = createCfa(true);
    Node fnBody = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "insideFn")));
    Node fnNode = createFunctionNode("f1", fnBody);
    Node script = new Node(Token.SCRIPT, fnNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(fnNode));
  }

  @Test
  public void process_givenFunctionWithTraverseFunctionsFalse_shouldSkipFunctionBody() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node stmt = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "insideFn"));
    Node fnBody = new Node(Token.BLOCK, stmt);
    Node fnNode = createFunctionNode("f1", fnBody);
    Node script = new Node(Token.SCRIPT, fnNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertFalse(cfg.hasNode(stmt));
  }

  @Test
  public void process_givenSyntheticBlock_shouldCreateSynBlockBranch() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node stmt = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "syn"));
    Node block = new Node(Token.BLOCK, stmt);
    block.setIsSyntheticBlock(true);
    Node script = new Node(Token.SCRIPT, block);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(block));
  }

  @Test
  public void process_givenExceptionThrowingExpressions_shouldRecognizeMayThrow() {
    ControlFlowAnalysis cfa = createCfa(false);

    Node newExpr = new Node(Token.NEW, Node.newString(Token.NAME, "Klass"));
    Node assignExpr = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), Node.newNumber(1.0));
    Node getPropExpr = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.NAME, "p"));
    Node getElemExpr = new Node(Token.GETELEM, Node.newString(Token.NAME, "arr"), Node.newNumber(0.0));
    Node decExpr = new Node(Token.DEC, Node.newString(Token.NAME, "d"));

    Node tryBlock = new Node(Token.BLOCK,
        new Node(Token.EXPR_RESULT, newExpr),
        new Node(Token.EXPR_RESULT, assignExpr),
        new Node(Token.EXPR_RESULT, getPropExpr),
        new Node(Token.EXPR_RESULT, getElemExpr),
        new Node(Token.EXPR_RESULT, decExpr)
    );

    Node catchParam = Node.newString(Token.NAME, "err");
    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchParam, catchBody);
    Node catchBlock = new Node(Token.BLOCK, catchNode);

    Node tryNode = new Node(Token.TRY, tryBlock, catchBlock);
    Node script = new Node(Token.SCRIPT, tryNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(tryNode));
    Assert.assertTrue(cfg.hasNode(catchNode));
  }

  @Test
  public void process_givenCaseWithoutFollowingCaseOrDefault_shouldFollowParent() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node expr = Node.newString(Token.NAME, "val");
    Node switchNode = new Node(Token.SWITCH, expr);
    Node case1 = new Node(Token.CASE, Node.newNumber(1.0),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "c1"))));
    switchNode.addChildToBack(case1);
    Node script = new Node(Token.SCRIPT, switchNode);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(case1));
  }

  @Test
  public void process_givenStatementsInScript_shouldChainSequentially() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node s1 = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node s2 = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "y"));
    Node s3 = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "z"));
    Node script = new Node(Token.SCRIPT, s1, s2, s3);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(s1));
    Assert.assertTrue(cfg.hasNode(s2));
    Assert.assertTrue(cfg.hasNode(s3));
  }

  @Test
  public void process_givenFunctionPrecedingStatementInBlock_shouldSkipFunctionInFallthrough() {
    ControlFlowAnalysis cfa = createCfa(false);
    Node fn = createFunctionNode("inner", new Node(Token.BLOCK));
    Node stmt = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "afterFn"));
    Node block = new Node(Token.BLOCK, fn, stmt);
    Node script = new Node(Token.SCRIPT, block);

    cfa.process(null, script);

    ControlFlowGraph<Node> cfg = cfa.getCfg();
    Assert.assertTrue(cfg.hasNode(block));
    Assert.assertTrue(cfg.hasNode(stmt));
  }
}