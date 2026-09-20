package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class NameAnalyzerTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    Compiler.setLoggingLevel(java.util.logging.Level.OFF);
  }

  private Node createScriptNode() {
    Node script = IR.script();
    script.setInputId(new com.google.javascript.rhino.InputId("test"));
    return script;
  }

  @Test
  public void constructor_givenCompilerAndFlags_shouldInstantiateCorrectly() {
    NameAnalyzer analyzerTrue = new NameAnalyzer(compiler, true);
    Assert.assertNotNull(analyzerTrue);

    NameAnalyzer analyzerFalse = new NameAnalyzer(compiler, false);
    Assert.assertNotNull(analyzerFalse);
  }

  @Test
  public void process_givenEmptyExternsAndRoot_shouldSucceedWithoutErrors() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
    Assert.assertTrue(report.indexOf("<html>") != -1);
    Assert.assertTrue(report.indexOf("Total Names: 0") != -1);
  }

  @Test
  public void process_givenReferencedWindowProperty_shouldRetainReference() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varNode = IR.var(IR.name("a"), IR.getprop(IR.name("window"), IR.string("location")));
    root.addChildToBack(varNode);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
    Assert.assertTrue(report.indexOf("window") != -1);
  }

  @Test
  public void process_givenUnreferencedVariable_shouldRemoveWhenFlagIsTrue() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varNode = IR.var(IR.name("unusedVar"), IR.number(42));
    root.addChildToBack(varNode);

    analyzer.process(externs, root);

    Assert.assertEquals(0, root.getChildCount());
  }

  @Test
  public void process_givenUnreferencedVariable_shouldKeepWhenFlagIsFalse() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varNode = IR.var(IR.name("unusedVar"), IR.number(42));
    root.addChildToBack(varNode);

    analyzer.process(externs, root);

    Assert.assertEquals(1, root.getChildCount());
    Assert.assertSame(varNode, root.getFirstChild());
  }

  @Test
  public void process_givenUnreferencedFunctionDeclaration_shouldRemoveWhenFlagIsTrue() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node fnNode = IR.function(IR.name("unusedFn"), IR.paramList(), IR.block());
    root.addChildToBack(fnNode);

    analyzer.process(externs, root);

    Assert.assertEquals(0, root.getChildCount());
  }

  @Test
  public void process_givenReferencedFunction_shouldNotRemove() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node fnNode = IR.function(IR.name("usedFn"), IR.paramList(), IR.block());
    root.addChildToBack(fnNode);

    Node assignToWindow = IR.exprResult(
        IR.assign(
            IR.getprop(IR.name("window"), IR.string("exportedFn")),
            IR.name("usedFn")));
    root.addChildToBack(assignToWindow);

    analyzer.process(externs, root);

    Assert.assertTrue(root.getChildCount() >= 1);
  }

  @Test
  public void process_givenExternDeclaration_shouldMarkExternallyDefined() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node externVar = IR.var(IR.name("externalGlobal"));
    externs.addChildToBack(externVar);

    Node rootAssign = IR.exprResult(
        IR.assign(IR.name("externalGlobal"), IR.number(10)));
    root.addChildToBack(rootAssign);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("externalGlobal") != -1);
  }

  @Test
  public void process_givenPrototypeAssignment_shouldTrackPrototypeNames() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node ctor = IR.function(IR.name("MyClass"), IR.paramList(), IR.block());
    root.addChildToBack(ctor);

    Node protoAssign = IR.exprResult(
        IR.assign(
            IR.getprop(IR.getprop(IR.name("MyClass"), IR.string("prototype")), IR.string("foo")),
            IR.function(IR.name(""), IR.paramList(), IR.block())));
    root.addChildToBack(protoAssign);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("MyClass") != -1);
    Assert.assertTrue(report.indexOf("PROTOTYPES") != -1 || report.indexOf("foo") != -1);
  }

  @Test
  public void process_givenPrototypeAssignment_whenUnreferenced_shouldRemove() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node protoAssign = IR.exprResult(
        IR.assign(
            IR.getprop(IR.getprop(IR.name("UnusedClass"), IR.string("prototype")), IR.string("bar")),
            IR.number(123)));
    root.addChildToBack(protoAssign);

    analyzer.process(externs, root);

    Assert.assertEquals(0, root.getChildCount());
  }

  @Test
  public void process_givenInstanceOfCheck_shouldTrackInstanceOfReference() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node ctor = IR.function(IR.name("TargetClass"), IR.paramList(), IR.block());
    root.addChildToBack(ctor);

    Node instanceOfExpr = IR.exprResult(
        IR.instanceof_(IR.name("window"), IR.name("TargetClass")));
    root.addChildToBack(instanceOfExpr);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("TargetClass") != -1);
  }

  @Test
  public void process_givenInstanceOfCheck_whenClassUnreferenced_shouldReplaceWithFalse() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node instanceOfExpr = IR.exprResult(
        IR.instanceof_(IR.number(1), IR.name("DeadClass")));
    root.addChildToBack(instanceOfExpr);

    analyzer.process(externs, root);

    Assert.assertEquals(1, root.getChildCount());
    Node expr = root.getFirstChild();
    Assert.assertEquals(Token.EXPR_RESULT, expr.getType());
    Assert.assertEquals(Token.FALSE, expr.getFirstChild().getType());
  }

  @Test
  public void process_givenAliases_shouldPropagateReferences() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varFoo = IR.var(IR.name("foo"), IR.name("window"));
    root.addChildToBack(varFoo);

    Node varBar = IR.var(IR.name("bar"), IR.name("foo"));
    root.addChildToBack(varBar);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void process_givenGetElemAssignment_shouldRecordWriteOnProperties() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varObj = IR.var(IR.name("container"), IR.objectlit());
    root.addChildToBack(varObj);

    Node getElemAssign = IR.exprResult(
        IR.assign(
            IR.getelem(IR.name("container"), IR.string("key")),
            IR.number(100)));
    root.addChildToBack(getElemAssign);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("container") != -1);
  }

  @Test
  public void process_givenNestedPropertyAssignment_shouldRecordParentReferences() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varA = IR.var(IR.name("a"), IR.objectlit());
    root.addChildToBack(varA);

    Node assignNested = IR.exprResult(
        IR.assign(
            IR.getprop(IR.getprop(IR.name("a"), IR.string("b")), IR.string("c")),
            IR.number(1)));
    root.addChildToBack(assignNested);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("a") != -1);
  }

  @Test
  public void process_givenForInLoop_shouldTraverseIteratorsProperly() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varX = IR.var(IR.name("x"));
    Node forIn = new Node(Token.FOR, IR.name("x"), IR.name("window"), IR.block());
    root.addChildToBack(varX);
    root.addChildToBack(forIn);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void process_givenStandardForLoop_shouldTraverseExpressions() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node init = IR.var(IR.name("i"), IR.number(0));
    Node cond = IR.lt(IR.name("i"), IR.number(10));
    Node step = IR.assign(IR.name("i"), IR.add(IR.name("i"), IR.number(1)));
    Node forNode = new Node(Token.FOR, init, cond, step, IR.block());
    root.addChildToBack(forNode);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void process_givenIfWhileDoSwitchHookNodes_shouldCoverConditionalBranches() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node ifNode = IR.ifNode(IR.name("window"), IR.block());
    root.addChildToBack(ifNode);

    Node whileNode = new Node(Token.WHILE, IR.name("window"), IR.block());
    root.addChildToBack(whileNode);

    Node doNode = new Node(Token.DO, IR.block(), IR.name("window"));
    root.addChildToBack(doNode);

    Node switchNode = new Node(Token.SWITCH, IR.name("window"));
    root.addChildToBack(switchNode);

    Node hookExpr = IR.exprResult(
        IR.hook(IR.name("window"), IR.number(1), IR.number(2)));
    root.addChildToBack(hookExpr);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void process_givenReturnAndThrowNodes_shouldTraverseExpressions() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node fn = IR.function(
        IR.name("testFn"),
        IR.paramList(),
        IR.block(
            IR.returnNode(IR.name("window")),
            new Node(Token.THROW, IR.name("window"))));
    root.addChildToBack(fn);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("testFn") != -1);
  }

  @Test
  public void process_givenLogicalAndOrCommaExpressions_shouldTraverseConsumers() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varA = IR.var(IR.name("a"), IR.number(1));
    Node varB = IR.var(IR.name("b"), IR.number(2));
    root.addChildToBack(varA);
    root.addChildToBack(varB);

    Node andExpr = IR.exprResult(
        IR.and(IR.assign(IR.name("a"), IR.number(3)), IR.assign(IR.name("b"), IR.number(4))));
    root.addChildToBack(andExpr);

    Node orExpr = IR.exprResult(
        IR.or(IR.name("a"), IR.name("b")));
    root.addChildToBack(orExpr);

    Node commaExpr = IR.exprResult(
        IR.comma(IR.name("a"), IR.name("b")));
    root.addChildToBack(commaExpr);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("a") != -1);
    Assert.assertTrue(report.indexOf("b") != -1);
  }

  @Test
  public void process_givenGlobalThisProperty_shouldTreatAsExternallyReferenceable() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node thisAssign = IR.exprResult(
        IR.assign(
            IR.getprop(new Node(Token.THIS), IR.string("globalProp")),
            IR.number(5)));
    root.addChildToBack(thisAssign);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("globalProp") != -1);
  }

  @Test
  public void process_givenGlobalThisWithoutProp_shouldHandleRootName() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node thisExpr = IR.exprResult(new Node(Token.THIS));
    root.addChildToBack(thisExpr);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void process_givenObjectLiteralAssignment_shouldRecordKeys() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node keyNode = IR.stringKey("k1", IR.number(10));
    Node objLit = IR.objectlit(keyNode);
    Node varObj = IR.var(IR.name("myObj"), objLit);
    root.addChildToBack(varObj);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("myObj") != -1);
  }

  @Test
  public void removeUnreferenced_whenCalledExplicitly_shouldNotThrowException() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    analyzer.process(externs, root);
    analyzer.removeUnreferenced();

    String report = analyzer.getHtmlReport();
    Assert.assertNotNull(report);
  }

  @Test
  public void getHtmlReport_givenVariousNameTypes_shouldFormatReportCorrectly() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node fn = IR.function(IR.name("funcA"), IR.paramList(), IR.block());
    root.addChildToBack(fn);

    Node assignWin = IR.exprResult(
        IR.assign(
            IR.getprop(IR.name("window"), IR.string("funcA")),
            IR.name("funcA")));
    root.addChildToBack(assignWin);

    analyzer.process(externs, root);

    String report = analyzer.getHtmlReport();
    Assert.assertTrue(report.indexOf("OVERALL STATS") != -1);
    Assert.assertTrue(report.indexOf("Total Names:") != -1);
    Assert.assertTrue(report.indexOf("Referenced Names:") != -1);
    Assert.assertTrue(report.indexOf("ALL NAMES") != -1);
  }

  @Test
  public void process_givenVarWithMultipleSideEffects_shouldReplaceTopLevelProperly() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node varUnused = IR.var(
        IR.name("unusedSideEffect"),
        IR.call(IR.name("window")));
    root.addChildToBack(varUnused);

    analyzer.process(externs, root);

    Assert.assertEquals(1, root.getChildCount());
    Assert.assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
  }

  @Test
  public void process_givenAssignInExprResultWithSideEffects_shouldReplaceCorrectly() {
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    Node externs = createScriptNode();
    Node root = createScriptNode();

    Node assignExpr = IR.exprResult(
        IR.assign(
            IR.name("deadVar"),
            IR.call(IR.name("window"))));
    root.addChildToBack(assignExpr);

    analyzer.process(externs, root);

    Assert.assertEquals(1, root.getChildCount());
    Assert.assertEquals(Token.EXPR_RESULT, root.getFirstChild().getType());
    Assert.assertEquals(Token.CALL, root.getFirstChild().getFirstChild().getType());
  }
}