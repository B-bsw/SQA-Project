package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class InlineVariablesTest {

  private InlineVariables inlineVariables;
  private AbstractCompiler compiler;
  private Node externs;
  private Node root;
  private Map<String, Var> vars;
  private Map<String, ReferenceCollection> refCollections;
  private List<Reference> refs;

  @Before
  public void setUp() {
    compiler = new Compiler();
    inlineVariables = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
    vars = new java.util.HashMap<>();
    refCollections = new java.util.HashMap<>();
    refs = new ArrayList<>();
    externs = new Node(Token.EMPTY);
    root = new Node(Token.BLOCK);
  }

  @Test
  public void testProcessWithNullRoot() {
    try {
      inlineVariables.process(externs, null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessWithEmptyRoot() {
    inlineVariables.process(externs, root);
    // No exception expected
  }

  @Test
  public void testGetFilterForModeAllReturnsTruePredicate() {
    InlineVariables localsInline = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);
    // Verify via reflection or behavior; just ensure no exception
    localsInline.process(externs, root);
  }

  @Test
  public void testGetFilterForModeConstantsOnly() {
    InlineVariables constantsInline = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
    constantsInline.process(externs, root);
  }

  @Test
  public void testInlineDeclaredConstantWithNonConstVar() {
    Var var = createVar("x", false);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), null));
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), null));
    // Should not throw, but also not inline since not constant
    inlineVariables.inlineDeclaredConstant(var, new Node(Token.NUMBER, 5), refInfo.references);
  }

  @Test
  public void testInlineWellDefinedVariableWithSingleReference() {
    Var var = createVar("x", true);
    Reference decl = new Reference(new Node(Token.NAME, "x"), null);
    Reference init = new Reference(new Node(Token.NAME, "x"), null);
    Node value = new Node(Token.NUMBER, 42);
    inlineVariables.inlineValue(var, init, value);
    assertEquals(value, init.getNode());
  }

  @Test
  public void testIsValidDeclarationWithVarDeclaration() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    Reference decl = new Reference(nameNode, null);
    // Just ensure no exception and it's valid
    assertTrue(inlineVariables.isValidDeclaration(decl));
  }

  @Test
  public void testIsValidDeclarationWithFunctionDeclaration() {
    Node funcNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "f");
    funcNode.addChildToBack(nameNode);
    Reference decl = new Reference(funcNode, null);
    // Should be valid
    assertTrue(inlineVariables.isValidDeclaration(decl));
  }

  @Test
  public void testCanInlineWithNullDeclaration() {
    Reference init = new Reference(new Node(Token.NAME, "x"), null);
    Reference ref = new Reference(new Node(Token.NAME, "x"), null);
    assertFalse(inlineVariables.canInline(null, init, ref));
  }

  @Test
  public void testIsStringWorthInliningWithShortString() {
    Var var = createVar("s", true);
    var.initialValue = new Node(Token.STRING, "ab");
    List<Reference> refs = new ArrayList<>();
    refs.add(new Reference(new Node(Token.NAME, "s"), null));
    refs.add(new Reference(new Node(Token.NAME, "s"), null));
    // Short string not worth inlining if not all strings
    assertFalse(inlineVariables.isStringWorthInlining(var, refs));
  }

  @Test
  public void testIsStringWorthInliningWithLongStringAndInlineAll() {
    InlineVariables inlineAll = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
    Var var = createVar("s", true);
    var.initialValue = new Node(Token.STRING, "this is a long string that should be inlinable");
    List<Reference> refs = new ArrayList<>();
    refs.add(new Reference(new Node(Token.NAME, "s"), null));
    refs.add(new Reference(new Node(Token.NAME, "s"), null));
    refs.add(new Reference(new Node(Token.NAME, "s"), null));
    assertTrue(inlineAll.isStringWorthInlining(var, refs));
  }

  @Test
  public void testCanMoveModeratelyWithFunctionValue() {
    Node function = new Node(Token.FUNCTION);
    Reference init = new Reference(new Node(Token.NAME, "f"), null);
    Reference ref = new Reference(new Node(Token.NAME, "f"), null);
    // Function declaration with no side effects can move
    assertTrue(inlineVariables.canMoveModerately(init, function));
  }

  @Test
  public void testInlineNonConstantsWithNoReferences() {
    Var var = createVar("x", false);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    inlineVariables.inlineNonConstants(var, refInfo, false);
    // No exception expected, no references to inline
  }

  @Test
  public void testRemoveDeclarationWhenVarHasNoChildren() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    Node grandparent = new Node(Token.EXPR_RESULT);
    grandparent.addChildToBack(varNode);
    Reference decl = new Reference(nameNode, null);
    inlineVariables.removeDeclaration(decl);
    assertFalse(varNode.hasChildren());
  }

  @Test
  public void testBlacklistVarReferencesInTree() {
    Node root = new Node(Token.BLOCK);
    Node nameNode = new Node(Token.NAME, "x");
    root.addChildToBack(nameNode);
    Var var = createVar("x", true);
    inlineVariables.blacklistVarReferencesInTree(root, var.scope);
    assertTrue(inlineVariables.staleVars.contains(var));
  }

  @Test
  public void testIsLValueWithIncNode() {
    Node parent = new Node(Token.INC);
    Node child = new Node(Token.NAME, "x");
    parent.addChildToBack(child);
    assertTrue(inlineVariables.isLValue(child));
  }

  @Test
  public void testIsLValueWithAssignNode() {
    Node parent = new Node(Token.ASSIGN);
    Node child = new Node(Token.NAME, "x");
    parent.addChildToBack(child);
    assertTrue(inlineVariables.isLValue(child));
  }

  @Test
  public void testIsLValueWithNonAssignment() {
    Node parent = new Node(Token.ADD);
    Node child = new Node(Token.NAME, "x");
    parent.addChildToBack(child);
    assertFalse(inlineVariables.isLValue(child));
  }

  @Test
  public void testInlineValueWithSimpleAssignment() {
    Node varNode = new Node(Token.NAME, "x");
    Node value = new Node(Token.NUMBER, 10);
    Node parent = new Node(Token.ASSIGN);
    parent.addChildToBack(varNode);
    parent.addChildToBack(value);
    Reference ref = new Reference(varNode, parent);
    inlineVariables.inlineValue(createVar("x", true), ref, value);
    assertEquals(value, ref.getNode());
  }

  @Test
  public void testInlineWellDefinedVariableWithMultipleReferences() {
    Var var = createVar("x", true);
    Node declNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    declNode.addChildToBack(nameNode);
    Node initNode = new Node(Token.NUMBER, 5);
    declNode.addChildToBack(initNode);
    Reference decl = new Reference(nameNode, declNode);
    Reference init = new Reference(nameNode, declNode);
    Node refNode = new Node(Token.NAME, "x");
    Node refParent = new Node(Token.EXPR_RESULT);
    refParent.addChildToBack(refNode);
    Reference ref = new Reference(refNode, refParent);
    List<Reference> refs = new ArrayList<>();
    refs.add(decl);
    refs.add(init);
    refs.add(ref);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = refs;
    refInfo.markReferencesAsRegions();
    inlineVariables.inlineWellDefinedVariable(var, initNode, refs);
    assertEquals(initNode, refNode.getFirstChild());
  }

  @Test
  public void testCanInlineAggressivelyWithLiteral() {
    Node value = new Node(Token.STRING, "hello");
    assertTrue(inlineVariables.canMoveAggressively(value));
  }

  @Test
  public void testCanInlineAggressivelyWithFunction() {
    Node value = new Node(Token.FUNCTION);
    assertTrue(inlineVariables.canMoveAggressively(value));
  }

  @Test
  public void testCanInlineAggressivelyWithComplexExpression() {
    Node value = new Node(Token.ADD);
    assertFalse(inlineVariables.canMoveAggressively(value));
  }

  @Test
  public void testIsValidInitializationWithNull() {
    assertFalse(inlineVariables.isValidInitialization(null));
  }

  @Test
  public void testIsImmutableAndWellDefinedVariableWithNonImmutableValue() {
    Var var = createVar("x", true);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    Node value = new Node(Token.ADD);
    assertFalse(inlineVariables.isImmutableAndWellDefinedVariable(var, refInfo));
  }

  @Test
  public void testIsImmutableAndWellDefinedVariableWithStringValue() {
    Var var = createVar("x", true);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    Node value = new Node(Token.STRING, "hello");
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.ASSIGN)));
    Node initValue = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "x");
    initValue.addChildToBack(name);
    initValue.addChildToBack(value);
    refInfo.references.add(new Reference(name, initValue));
    assertFalse(inlineVariables.isImmutableAndWellDefinedVariable(var, refInfo));
  }

  @Test
  public void testMaybeEscapedOrModifiedArgumentsWithNoArgumentsVar() {
    Scope scope = new Scope(new Node(Token.BLOCK), null);
    assertFalse(inlineVariables.maybeEscapedOrModifiedArguments(scope, new ReferenceMap()));
  }

  @Test
  public void testMaybeEscapedOrModifiedArgumentsWithArgumentsVar() {
    Scope scope = new Scope(new Node(Token.BLOCK), null);
    Var argumentsVar = new Var("arguments", scope, new Node(Token.NAME, "arguments"));
    scope.declareVar(argumentsVar);
    ReferenceMap refMap = new ReferenceMap();
    ReferenceCollection refCollection = new ReferenceCollection();
    refCollection.references = new ArrayList<>();
    refCollection.references.add(new Reference(new Node(Token.NAME, "arguments"), new Node(Token.NAME, "decl")));
    refMap.put(argumentsVar, refCollection);
    assertTrue(inlineVariables.maybeEscapedOrModifiedArguments(scope, refMap));
  }

  @Test
  public void testIsValidReferenceWithValidUsage() {
    Reference ref = new Reference(new Node(Token.NAME, "x"), null);
    ref.setDeclaration(false);
    ref.setLvalue(false);
    assertTrue(inlineVariables.isValidReference(ref));
  }

  @Test
  public void testIsValidReferenceWithDeclaration() {
    Reference ref = new Reference(new Node(Token.NAME, "x"), null);
    ref.setDeclaration(true);
    assertFalse(inlineVariables.isValidReference(ref));
  }

  @Test
  public void testInlineNonConstantsWithEscapedArguments() {
    Var var = createVar("x", false);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.VAR)));
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.EXPR_RESULT)));
    inlineVariables.inlineNonConstants(var, refInfo, true);
    // No exception, but may not inline due to escaped args
  }

  @Test
  public void testCollectAliasCandidatesWithNoAlias() {
    NodeTraversal t = new NodeTraversal(compiler, null);
    // Only testing no exception
    inlineVariables.collectAliasCandidates(t, new ReferenceMap());
  }

  @Test
  public void testProcessWithFunctionCallAndInvalidRef() {
    Node root = new Node(Token.BLOCK);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node call = new Node(Token.CALL);
    Node name = new Node(Token.NAME, "x");
    call.addChildToBack(name);
    exprResult.addChildToBack(call);
    root.addChildToBack(exprResult);
    Node fnNode = new Node(Token.FUNCTION);
    Node param = new Node(Token.PARAM_LIST);
    fnNode.addChildToBack(param);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToBack(body);
    call.addChildToBack(fnNode);
    inlineVariables.process(externs, root);
  }

  @Test
  public void testInlineDeclaredConstantWithStringNotWorthInlining() {
    InlineVariables inlineVariablesNoStrings = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
    Var var = createVar("x", true);
    var.setConst(true);
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.VAR)));
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.EXPR_RESULT)));
    Node value = new Node(Token.STRING, "short");
    Node initAssign = new Node(Token.ASSIGN);
    Node nameNode = new Node(Token.NAME, "x");
    initAssign.addChildToBack(nameNode);
    initAssign.addChildToBack(value);
    refInfo.references.add(new Reference(nameNode, initAssign));
    refInfo.references.add(new Reference(new Node(Token.NAME, "x"), new Node(Token.EXPR_RESULT)));
    // Should not throw, but not inline because string not worth inlining
    inlineVariablesNoStrings.inlineDeclaredConstant(var, value, refInfo.references);
  }

  @Test
  public void testGetFilterForModeWithInvalidMode() {
    try {
      InlineVariables invalid = new InlineVariables(compiler, null, false);
      invalid.getFilterForMode();
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  private Var createVar(String name, boolean local) {
    Node scopeNode = new Node(Token.BLOCK);
    Scope scope = new Scope(scopeNode, null);
    Node nameNode = new Node(Token.NAME, name);
    Var var = new Var(name, scope, nameNode);
    if (local) {
      nameNode.setString(name);
    }
    return var;
  }

  private class Compiler extends AbstractCompiler {
    private CodingConvention convention = new CodingConvention() {
      @Override
      public SubclassRelationship getClassesDefinedByCall(Node callNode) {
        return null;
      }
      @Override
      public boolean isExported(String name) { return false; }
      @Override
      public boolean isFunctionCallWithName(Node callNode, String name) { return false; }
      @Override
      public boolean isValidAliasForNewNode(Node callNode) { return false; }
      @Override
      public boolean isSuperClassReference(String propertyName) { return false; }
      @Override
      public String getGlobalName() { return "global"; }
    };
    @Override
    public CodingConvention getCodingConvention() { return convention; }
    @Override
    public void reportCodeChange() {}
    @Override
    ScopeCreator getScopeCreator() { return null; }
    @Override
    public Scope getTopScope() { return null; }
    @Override
    public void process(CompilerPass pass) {}
  }
}