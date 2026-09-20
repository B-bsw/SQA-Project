package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaybeReachingVariableUseTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private MaybeReachingVariableUse createAnalysis(String jsCode) {
    Node root = compiler.parseTestCode(jsCode);
    Node func = root.getFirstChild();
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(func, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, func.getLastChild());
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    return new MaybeReachingVariableUse(cfg, scope, compiler);
  }

  @Test
  public void isForward_givenInstance_shouldReturnFalse() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");

    // Act
    boolean isForward = analysis.isForward();

    // Assert
    Assert.assertFalse(isForward);
  }

  @Test
  public void createEntryLattice_givenCall_shouldReturnEmptyLattice() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");

    // Act
    MaybeReachingVariableUse.ReachingUses lattice = analysis.createEntryLattice();

    // Assert
    Assert.assertNotNull(lattice);
    Assert.assertTrue(lattice.mayUseMap.isEmpty());
  }

  @Test
  public void createInitialEstimateLattice_givenCall_shouldReturnEmptyLattice() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");

    // Act
    MaybeReachingVariableUse.ReachingUses lattice = analysis.createInitialEstimateLattice();

    // Assert
    Assert.assertNotNull(lattice);
    Assert.assertTrue(lattice.mayUseMap.isEmpty());
  }

  @Test
  public void reachingUses_equalsAndHashCode_shouldAdhereToContract() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    Scope.Var varX = analysis.getUses("x", analysis.getCfg().getEntry().getValue()) != null ? null : null;
    Node dummyNode1 = Node.newString(Token.NAME, "x");
    Node dummyNode2 = Node.newString(Token.NAME, "y");

    MaybeReachingVariableUse.ReachingUses uses1 = new MaybeReachingVariableUse.ReachingUses();
    MaybeReachingVariableUse.ReachingUses uses2 = new MaybeReachingVariableUse.ReachingUses();

    // Act & Assert - reflexive & empty equality
    Assert.assertTrue(uses1.equals(uses1));
    Assert.assertTrue(uses1.equals(uses2));
    Assert.assertEquals(uses1.hashCode(), uses2.hashCode());

    // Act & Assert - non-equality with null and other objects
    Assert.assertFalse(uses1.equals(null));
    Assert.assertFalse(uses1.equals("Not a ReachingUses instance"));

    // Act & Assert - copy constructor and inequality upon modification
    Node root = compiler.parseTestCode("function f() { var x = 1; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varObj = scope.getVar("x");

    uses1.mayUseMap.put(varObj, dummyNode1);
    Assert.assertFalse(uses1.equals(uses2));

    MaybeReachingVariableUse.ReachingUses copy = new MaybeReachingVariableUse.ReachingUses(uses1);
    Assert.assertTrue(uses1.equals(copy));
    Assert.assertEquals(uses1.hashCode(), copy.hashCode());

    copy.mayUseMap.put(varObj, dummyNode2);
    Assert.assertFalse(uses1.equals(copy));
  }

  @Test
  public void reachingUsesJoinOp_givenMultipleEstimates_shouldUnionEntries() {
    // Arrange
    Node root = compiler.parseTestCode("function f() { var x = 1; var y = 2; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");
    Scope.Var varY = scope.getVar("y");

    Node nodeX = Node.newString(Token.NAME, "x");
    Node nodeY = Node.newString(Token.NAME, "y");

    MaybeReachingVariableUse.ReachingUses u1 = new MaybeReachingVariableUse.ReachingUses();
    u1.mayUseMap.put(varX, nodeX);

    MaybeReachingVariableUse.ReachingUses u2 = new MaybeReachingVariableUse.ReachingUses();
    u2.mayUseMap.put(varY, nodeY);

    List<MaybeReachingVariableUse.ReachingUses> list = new ArrayList<MaybeReachingVariableUse.ReachingUses>();
    list.add(u1);
    list.add(u2);

    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root.getFirstChild().getLastChild());
    MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfa.getCfg(), scope, compiler);

    // Act
    MaybeReachingVariableUse.ReachingUses joined = analysis.joinOp.apply(list);

    // Assert
    Assert.assertEquals(2, joined.mayUseMap.size());
    Assert.assertTrue(joined.mayUseMap.containsEntry(varX, nodeX));
    Assert.assertTrue(joined.mayUseMap.containsEntry(varY, nodeY));
  }

  @Test
  public void flowThrough_givenBlockAndFunctionNodes_shouldReturnUnmodifiedLattice() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    Node blockNode = new Node(Token.BLOCK);
    Node funcNode = new Node(Token.FUNCTION);

    // Act
    MaybeReachingVariableUse.ReachingUses outBlock = analysis.flowThrough(blockNode, input);
    MaybeReachingVariableUse.ReachingUses outFunc = analysis.flowThrough(funcNode, input);

    // Assert
    Assert.assertTrue(outBlock.mayUseMap.isEmpty());
    Assert.assertTrue(outFunc.mayUseMap.isEmpty());
  }

  @Test
  public void flowThrough_givenNameNode_shouldAddLocalToUseMap() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    Node nameNode = Node.newString(Token.NAME, "x");

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(nameNode, input);

    // Assert
    Assert.assertEquals(1, output.mayUseMap.size());
    Assert.assertTrue(output.mayUseMap.containsKey(analysis.getUses("x", nameNode) != null ? null : null));
    Assert.assertFalse(input.equals(output));
  }

  @Test
  public void flowThrough_givenNonLocalOrUndeclaredName_shouldNotAddToUseMap() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    Node undeclaredName = Node.newString(Token.NAME, "undeclaredVar");

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(undeclaredName, input);

    // Assert
    Assert.assertTrue(output.mayUseMap.isEmpty());
  }

  @Test
  public void flowThrough_givenEscapedVariable_shouldNotAddToUseMap() {
    // Arrange: x escapes to inner closure
    MaybeReachingVariableUse analysis = createAnalysis(
        "function f() { var x = 1; function inner() { return x; } }"
    );
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    Node nameNode = Node.newString(Token.NAME, "x");

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(nameNode, input);

    // Assert: Escaped variable must not be added to upward exposed uses
    Assert.assertTrue(output.mayUseMap.isEmpty());
  }

  @Test
  public void flowThrough_givenConditionalStatements_shouldComputeConditionExpression() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "x"), new Node(Token.BLOCK));
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "x"), new Node(Token.BLOCK));
    Node doNode = new Node(Token.DO, new Node(Token.BLOCK), Node.newString(Token.NAME, "x"));

    // Act
    MaybeReachingVariableUse.ReachingUses outIf = analysis.flowThrough(ifNode, input);
    MaybeReachingVariableUse.ReachingUses outWhile = analysis.flowThrough(whileNode, input);
    MaybeReachingVariableUse.ReachingUses outDo = analysis.flowThrough(doNode, input);

    // Assert
    Assert.assertEquals(1, outIf.mayUseMap.size());
    Assert.assertEquals(1, outWhile.mayUseMap.size());
    Assert.assertEquals(1, outDo.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenStandardForLoop_shouldComputeConditionExpression() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node init = new Node(Token.EMPTY);
    Node cond = Node.newString(Token.NAME, "x");
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, init, cond, incr, body);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(forNode, input);

    // Assert
    Assert.assertEquals(1, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenForInWithoutVar_shouldRemoveLhsAndComputeRhs() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    Node root = compiler.parseTestCode("function f() { var x = 1; var y = 2; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");

    Node dummyDef = Node.newString(Token.NAME, "x");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    input.mayUseMap.put(varX, dummyDef);

    Node lhs = Node.newString(Token.NAME, "x");
    Node rhs = Node.newString(Token.NAME, "y");
    Node body = new Node(Token.BLOCK);
    Node forInNode = new Node(Token.FOR, lhs, rhs, body);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(forInNode, input);

    // Assert
    Assert.assertFalse(output.mayUseMap.containsKey(varX));
    Assert.assertEquals(1, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenForInWithVar_shouldRemoveLhsAndComputeRhs() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    Node root = compiler.parseTestCode("function f() { var x = 1; var y = 2; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");

    Node dummyDef = Node.newString(Token.NAME, "x");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    input.mayUseMap.put(varX, dummyDef);

    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
    Node rhs = Node.newString(Token.NAME, "y");
    Node body = new Node(Token.BLOCK);
    Node forInNode = new Node(Token.FOR, varNode, rhs, body);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(forInNode, input);

    // Assert
    Assert.assertFalse(output.mayUseMap.containsKey(varX));
    Assert.assertEquals(1, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenAndOrOperators_shouldEvaluateBranches() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node andNode = new Node(Token.AND, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));
    Node orNode = new Node(Token.OR, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));

    // Act
    MaybeReachingVariableUse.ReachingUses outAnd = analysis.flowThrough(andNode, input);
    MaybeReachingVariableUse.ReachingUses outOr = analysis.flowThrough(orNode, input);

    // Assert
    Assert.assertEquals(2, outAnd.mayUseMap.size());
    Assert.assertEquals(2, outOr.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenHookOperator_shouldEvaluateAllBranches() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; var z = 3; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node cond = Node.newString(Token.NAME, "x");
    Node trueBranch = Node.newString(Token.NAME, "y");
    Node falseBranch = Node.newString(Token.NAME, "z");
    Node hookNode = new Node(Token.HOOK, cond, trueBranch, falseBranch);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(hookNode, input);

    // Assert
    Assert.assertEquals(3, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenVarDeclarationWithInit_shouldRemoveVarAndComputeInit() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    Node root = compiler.parseTestCode("function f() { var x = 1; var y = 2; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");

    Node dummyDef = Node.newString(Token.NAME, "x");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    input.mayUseMap.put(varX, dummyDef);

    Node nameWithInit = Node.newString(Token.NAME, "x");
    nameWithInit.addChildToBack(Node.newString(Token.NAME, "y"));
    Node varNode = new Node(Token.VAR, nameWithInit);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(varNode, input);

    // Assert
    Assert.assertFalse(output.mayUseMap.containsKey(varX));
    Assert.assertEquals(1, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenVarDeclarationWithoutInit_shouldDoNothing() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    Node root = compiler.parseTestCode("function f() { var x = 1; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");

    Node dummyDef = Node.newString(Token.NAME, "x");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    input.mayUseMap.put(varX, dummyDef);

    Node nameWithoutInit = Node.newString(Token.NAME, "x");
    Node varNode = new Node(Token.VAR, nameWithoutInit);

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(varNode, input);

    // Assert
    Assert.assertTrue(output.mayUseMap.containsKey(varX));
  }

  @Test(expected = IllegalStateException.class)
  public void flowThrough_givenVarWithoutChildren_shouldThrowIllegalStateException() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    Node invalidVar = new Node(Token.VAR);

    // Act
    analysis.flowThrough(invalidVar, input);
  }

  @Test
  public void flowThrough_givenSimpleAssignment_shouldRemoveLhsAndComputeRhs() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    Node root = compiler.parseTestCode("function f() { var x = 1; var y = 2; }");
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root.getFirstChild(), null);
    Scope.Var varX = scope.getVar("x");

    Node dummyDef = Node.newString(Token.NAME, "x");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();
    input.mayUseMap.put(varX, dummyDef);

    Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(assignNode, input);

    // Assert: x was killed, y was read
    Assert.assertFalse(output.mayUseMap.containsKey(varX));
    Assert.assertEquals(1, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenCompoundAssignment_shouldAddLhsAndRhsToUse() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node addAssignNode = new Node(Token.ASSIGN_ADD, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(addAssignNode, input);

    // Assert: x += y reads both x and y
    Assert.assertEquals(2, output.mayUseMap.size());
  }

  @Test
  public void flowThrough_givenGenericExpression_shouldTraverseChildrenInReverse() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; var y = 2; }");
    MaybeReachingVariableUse.ReachingUses input = new MaybeReachingVariableUse.ReachingUses();

    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "x"), Node.newString(Token.NAME, "y"));

    // Act
    MaybeReachingVariableUse.ReachingUses output = analysis.flowThrough(callNode, input);

    // Assert
    Assert.assertEquals(2, output.mayUseMap.size());
  }

  @Test(expected = NullPointerException.class)
  public void getUses_givenNodeNotInCfg_shouldThrowNullPointerException() {
    // Arrange
    MaybeReachingVariableUse analysis = createAnalysis("function f() { var x = 1; }");
    Node extraneousNode = Node.newString(Token.NAME, "x");

    // Act
    analysis.getUses("x", extraneousNode);
  }

  @Test
  public void getUses_givenCompleteDataFlow_shouldFindReachingUse() {
    // Arrange
    String code = "function f() { var x = 1; alert(x); }";
    Node root = compiler.parseTestCode(code);
    Node func = root.getFirstChild();
    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(func, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, func.getLastChild());
    ControlFlowGraph<Node> cfg = cfa.getCfg();

    MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfg, scope, compiler);
    analysis.analyze();

    Node block = func.getLastChild();
    Node varNode = block.getFirstChild(); // var x = 1;

    // Act
    Collection<Node> uses = analysis.getUses("x", varNode);

    // Assert
    Assert.assertNotNull(uses);
    Assert.assertFalse(uses.isEmpty());
  }
}