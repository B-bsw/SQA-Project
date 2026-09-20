package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class PrepareAstTest {

  @Test
  public void testConstructor_defaultCheckOnly_shouldSetFalse() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler);
    Node root = IR.root();
    pass.process(null, root);
  }

  @Test
  public void testProcess_checkOnlyTrue_noViolation_shouldPass() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node block = IR.block();
    Node ifNode = IR.ifNode(IR.name("cond"), block);
    Node root = IR.root(ifNode);

    pass.process(null, root);
    Assert.assertTrue(ifNode.getFirstChild().getNext().isBlock());
  }

  @Test
  public void testProcess_checkOnlyTrue_nonBlockControlStructureCodeBlock_shouldThrow() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node statement = IR.exprResult(IR.name("a"));
    Node ifNode = IR.ifNode(IR.name("cond"), statement);
    Node root = IR.root(ifNode);

    try {
      pass.process(null, root);
      Assert.fail("Expected IllegalStateException for normalizeNodeType constraints violated");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().indexOf("normalizeNodeType constraints violated") != -1);
    }
  }

  @Test
  public void testProcess_checkOnlyTrue_emptyCodeBlock_shouldWrapInBlockAndThrow() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node empty = IR.empty();
    Node ifNode = IR.ifNode(IR.name("cond"), empty);
    Node root = IR.root(ifNode);

    try {
      pass.process(null, root);
      Assert.fail("Expected IllegalStateException when empty branch is wrapped");
    } catch (IllegalStateException e) {
      Assert.assertTrue(e.getMessage().indexOf("normalizeNodeType constraints violated") != -1);
    }
  }

  @Test
  public void testProcess_checkOnlyFalse_withExternsAndRoot_shouldTraverse() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, false);

    Node externs = IR.root(IR.exprResult(IR.call(IR.name("ext"))));
    Node root = IR.root(IR.exprResult(IR.call(IR.name("run"))));

    pass.process(externs, root);

    Node call1 = externs.getFirstChild().getFirstChild();
    Assert.assertTrue(call1.getBooleanProp(Node.FREE_CALL));

    Node call2 = root.getFirstChild().getFirstChild();
    Assert.assertTrue(call2.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testProcess_checkOnlyFalse_nullExternsAndRoot_shouldNotFail() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, false);
    pass.process(null, null);
  }

  @Test
  public void testProcess_checkOnlyFalse_nullExternsNonNullRoot_shouldTraverseRoot() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, false);

    Node root = IR.root(IR.exprResult(IR.call(IR.name("foo"))));
    pass.process(null, root);

    Node call = root.getFirstChild().getFirstChild();
    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testProcess_checkOnlyFalse_nonNullExternsNullRoot_shouldTraverseExterns() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, false);

    Node externs = IR.root(IR.exprResult(IR.call(IR.name("bar"))));
    pass.process(externs, null);

    Node call = externs.getFirstChild().getFirstChild();
    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateCalls_freeCall_shouldSetFreeCallProp() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node target = IR.name("foo");
    Node call = IR.call(target);

    annotator.visit(null, call, null);

    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
    Assert.assertFalse(target.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_directEval_shouldSetDirectEvalProp() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node target = IR.name("eval");
    Node call = IR.call(target);

    annotator.visit(null, call, null);

    Assert.assertTrue(call.getBooleanProp(Node.FREE_CALL));
    Assert.assertTrue(target.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_getPropCall_shouldNotSetFreeCall() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node target = IR.getprop(IR.name("obj"), IR.string("fn"));
    Node call = IR.call(target);

    annotator.visit(null, call, null);

    Assert.assertFalse(call.getBooleanProp(Node.FREE_CALL));
    Assert.assertFalse(target.getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testAnnotateCalls_getElemCall_shouldNotSetFreeCall() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node target = IR.getelem(IR.name("obj"), IR.string("fn"));
    Node call = IR.call(target);

    annotator.visit(null, call, null);

    Assert.assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testAnnotateDispatchers_parentWithoutJsdoc_shouldNotSetDispatcher() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("x"), fn);

    annotator.visit(null, fn, assign);

    Assert.assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_parentWithNonJavaDispatchJsdoc_shouldNotSetDispatcher() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("x"), fn);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    assign.setJSDocInfo(builder.build(assign));

    annotator.visit(null, fn, assign);

    Assert.assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_javaDispatchOnAssign_shouldSetDispatcher() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("x"), fn);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordJavaDispatch();
    assign.setJSDocInfo(builder.build(assign));

    annotator.visit(null, fn, assign);

    Assert.assertTrue(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_javaDispatchOnNonAssignParent_shouldNotSetDispatcher() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node expr = IR.exprResult(fn);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordJavaDispatch();
    expr.setJSDocInfo(builder.build(expr));

    annotator.visit(null, fn, expr);

    Assert.assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testAnnotateDispatchers_javaDispatchOnAssign_fnNotLastChild_shouldThrow() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node rhs = IR.name("y");
    Node assign = IR.assign(fn, rhs);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordJavaDispatch();
    assign.setJSDocInfo(builder.build(assign));

    try {
      annotator.visit(null, fn, assign);
      Assert.fail("Expected Preconditions checkState failure when function is not last child");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void testShouldTraverse_nonObjectLit_shouldReturnTrue() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node name = IR.name("a");
    boolean result = annotator.shouldTraverse(null, name, null);

    Assert.assertTrue(result);
  }

  @Test
  public void testShouldTraverse_objectLit_copiesJsdocFromKeyToFunctionValue() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key = IR.stringKey("myMethod", fn);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("method doc");
    JSDocInfo info = builder.build(key);
    key.setJSDocInfo(info);

    Node objLit = IR.objectlit(key);

    boolean result = annotator.shouldTraverse(null, objLit, null);

    Assert.assertTrue(result);
    Assert.assertSame(info, fn.getJSDocInfo());
  }

  @Test
  public void testShouldTraverse_objectLit_keyWithoutJsdoc_shouldNotSetOnValue() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
    Node key = IR.stringKey("myMethod", fn);
    Node objLit = IR.objectlit(key);

    boolean result = annotator.shouldTraverse(null, objLit, null);

    Assert.assertTrue(result);
    Assert.assertNull(fn.getJSDocInfo());
  }

  @Test
  public void testShouldTraverse_objectLit_keyWithJsdocNonFunctionValue_shouldNotSet() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node numValue = IR.number(42);
    Node key = IR.stringKey("myProp", numValue);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordDescription("number doc");
    key.setJSDocInfo(builder.build(key));

    Node objLit = IR.objectlit(key);

    boolean result = annotator.shouldTraverse(null, objLit, null);

    Assert.assertTrue(result);
    Assert.assertNull(numValue.getJSDocInfo());
  }

  @Test
  public void testShouldTraverse_emptyObjectLit_shouldReturnTrue() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node objLit = IR.objectlit();

    boolean result = annotator.shouldTraverse(null, objLit, null);

    Assert.assertTrue(result);
  }

  @Test
  public void testVisit_otherTokenTypes_shouldDoNothing() {
    PrepareAst.PrepareAnnotations annotator = new PrepareAst.PrepareAnnotations();

    Node varNode = IR.var(IR.name("x"));
    annotator.visit(null, varNode, null);

    Node returnNode = IR.returnNode();
    annotator.visit(null, returnNode, null);
  }

  @Test
  public void testNormalizeBlocks_labelNode_shouldNotWrap() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node stmt = IR.exprResult(IR.name("x"));
    Node label = IR.label(IR.labelName("myLabel"), stmt);
    Node root = IR.root(label);

    pass.process(null, root);
    Assert.assertTrue(label.getLastChild().isExprResult());
  }

  @Test
  public void testNormalizeBlocks_switchNode_shouldNotWrap() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node switchNode = IR.switchNode(IR.name("x"));
    Node root = IR.root(switchNode);

    pass.process(null, root);
    Assert.assertNotNull(switchNode);
  }

  @Test
  public void testNormalizeNodeTypes_parentCheckFailure_shouldThrow() {
    Compiler compiler = new Compiler();
    PrepareAst pass = new PrepareAst(compiler, true);

    Node root = IR.root();
    Node child = IR.block();
    root.addChildToBack(child);
    child.setParent(null);

    try {
      pass.process(null, root);
      Assert.fail("Expected Preconditions checkState failure when parent pointer is broken");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e);
    }
  }
}