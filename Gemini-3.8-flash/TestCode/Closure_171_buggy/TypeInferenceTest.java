package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import java.util.List;

public class TypeInferenceTest {

  private TypeInference inference;
  private JSTypeRegistry registry;
  private AbstractCompiler compiler;
  private FlowScope scope;
  private Scope syntacticScope;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    compiler = new SyntacticTypeInferenceCompiler();
    inference = new TypeInference(compiler, registry, null, null, null, null);
    scope = new SyntheticFlowScope();
    syntacticScope = new SyntheticScope();
  }

  @Test
  public void testIncrementDecrementOperator() {
    Node incNode = new Node(Token.INC);
    incNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    scope = inference.flowThrough(incNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testNumericAssignment() {
    Node assignNode = new Node(Token.ASSIGN);
    Node nameNode = new Node(Token.NAME, "x");
    assignNode.addChildToFront(nameNode);
    assignNode.addChildToFront(new Node(Token.NUMBER, 0.0));
    scope = inference.flowThrough(assignNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testStringAddition() {
    Node addNode = new Node(Token.ADD);
    Node left = new Node(Token.STRING, "a");
    Node right = new Node(Token.STRING, "b");
    addNode.addChildToBack(left);
    addNode.addChildToBack(right);
    scope = inference.flowThrough(addNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testConditionalExpression() {
    Node hookNode = new Node(Token.HOOK);
    Node cond = new Node(Token.TRUE);
    Node ifTrue = new Node(Token.NUMBER, 1.0);
    Node ifFalse = new Node(Token.NUMBER, 2.0);
    hookNode.addChildToBack(cond);
    hookNode.addChildToBack(ifTrue);
    hookNode.addChildToBack(ifFalse);
    scope = inference.flowThrough(hookNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testLogicalAnd() {
    Node andNode = new Node(Token.AND);
    Node left = new Node(Token.NULL);
    Node right = new Node(Token.NUMBER, 1.0);
    andNode.addChildToBack(left);
    andNode.addChildToBack(right);
    scope = inference.flowThrough(andNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testPropertyAccess() {
    Node getPropNode = new Node(Token.GETPROP);
    Node objNode = new Node(Token.NAME, "obj");
    Node propNode = new Node(Token.STRING, "prop");
    getPropNode.addChildToBack(objNode);
    getPropNode.addChildToBack(propNode);
    scope = inference.flowThrough(getPropNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testFunctionCall() {
    Node callNode = new Node(Token.CALL);
    Node targetNode = new Node(Token.NAME, "fn");
    callNode.addChildToBack(targetNode);
    callNode.addChildToBack(new Node(Token.NUMBER, 1));
    scope = inference.flowThrough(callNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testTypeOfName() {
    Node typeofNode = new Node(Token.TYPEOF);
    Node nameNode = new Node(Token.NAME, "x");
    typeofNode.addChildToBack(nameNode);
    scope = inference.flowThrough(typeofNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testArrayLiteral() {
    Node arrayNode = new Node(Token.ARRAYLIT);
    arrayNode.addChildToBack(new Node(Token.NUMBER, 1.0));
    arrayNode.addChildToBack(new Node(Token.NUMBER, 2.0));
    scope = inference.flowThrough(arrayNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testReturnWithoutValue() {
    Node returnNode = new Node(Token.RETURN);
    scope = inference.flowThrough(returnNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testThrowStatement() {
    Node throwNode = new Node(Token.THROW);
    throwNode.addChildToBack(new Node(Token.NAME, "e"));
    scope = inference.flowThrough(throwNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testVariableDeclaration() {
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    scope = inference.flowThrough(varNode, scope);
    assertNotNull(scope);
  }

  @Test
  public void testEmptyFlowThroughReturnsInput() {
    try {
      Node node = new Node(Token.EMPTY);
      FlowScope result = inference.flowThrough(node, scope);
      assertSame(scope, result);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testBottomScopeReturnsItself() {
    FlowScope bottom = new SyntheticFlowScope();
    try {
      Node node = new Node(Token.NAME, "x");
      FlowScope result = inference.flowThrough(node, bottom);
      assertSame(bottom, result);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testBranchFlowThroughWithNoEdges() {
    try {
      List<FlowScope> result = inference.branchedFlowThrough(new Node(Token.EMPTY), scope);
      assertNotNull(result);
      assertTrue(result.isEmpty());
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  private static class SyntacticTypeInferenceCompiler extends AbstractCompiler {
    @Override
    public void report(JSError error) {}
  }

  private static class SyntheticFlowScope implements FlowScope {
    @Override
    public FlowScope createChildFlowScope() {
      return new SyntheticFlowScope();
    }

    @Override
    public FlowScope createChildFlowScope(Node node) {
      return new SyntheticFlowScope();
    }

    @Override
    public Slot getSlot(String name) {
      return null;
    }

    @Override
    public void inferSlotType(String name, JSType type) {}

    @Override
    public void inferQualifiedSlot(Node node, String name, JSType type) {}

    @Override
    public void inferSymbolType(Symbol symbol, JSType type) {}

    @Override
    public void inferInstanceType(String name, JSType type) {}

    @Override
    public void initializeSlotType(String name, JSType type) {}

    @Override
    public Slot getOwnSlot(String name) {
      return null;
    }

    @Override
    public Iterable<Slot> getSlots() {
      return null;
    }

    @Override
    public Completable<Void> getAllSlotsAsync(Executor executor) {
      return null;
    }
  }

  private static class SyntheticScope implements Scope {

    @Override
    public Var getVar(String name) {
      return null;
    }

    @Override
    public Var getTopLevelVar(String name) {
      return null;
    }

    @Override
    public Var getTopLevelVarByName(String name) {
      return null;
    }

    @Override
    public Iterable<Var> getVars() {
      return null;
    }

    @Override
    public TypeLattice getTypeOf(String name) {
      return null;
    }

    @Override
    public ObjectType getTypeOfThis() {
      return null;
    }

    @Override
    public boolean isLocal() {
      return false;
    }

    @Override
    public boolean isGlobal() {
      return true;
    }

    @Override
    public boolean isBlock() {
      return false;
    }

    @Override
    public boolean isCatch() {
      return false;
    }

    @Override
    public boolean isWith() {
      return false;
    }
  }
}