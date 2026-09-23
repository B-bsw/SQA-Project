package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClosureReverseAbstractInterpreterTest {
  private CodingConvention convention;
  private JSTypeRegistry typeRegistry;
  private ClosureReverseAbstractInterpreter interpreter;

  @Before
  public void setUp() {
    convention = new CodingConvention() {};
    typeRegistry = new JSTypeRegistry();
    interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
  }

  @Test
  public void testGetPreciserScopeKnowingConditionOutcome_nullCondition() {
    try {
      interpreter.getPreciserScopeKnowingConditionOutcome(
          null, null, true);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testGetPreciserScopeKnowingConditionOutcome_nonCallCondition() {
    Node condition = new Node(Token.NAME);
    FlowScope blindScope = null;
    try {
      interpreter.getPreciserScopeKnowingConditionOutcome(
          condition, blindScope, true);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testIsDefOutcomeTrue() {
    Node condition = createCall("goog.isDef", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsDefOutcomeFalse() {
    Node condition = createCall("goog.isDef", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsNullOutcomeTrue() {
    Node condition = createCall("goog.isNull", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsNullOutcomeFalse() {
    Node condition = createCall("goog.isNull", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsDefAndNotNullOutcomeTrue() {
    Node condition = createCall("goog.isDefAndNotNull", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsDefAndNotNullOutcomeFalse() {
    Node condition = createCall("goog.isDefAndNotNull", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsStringOutcomeTrue() {
    Node condition = createCall("goog.isString", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsStringOutcomeFalse() {
    Node condition = createCall("goog.isString", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsBooleanOutcomeTrue() {
    Node condition = createCall("goog.isBoolean", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsBooleanOutcomeFalse() {
    Node condition = createCall("goog.isBoolean", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsNumberOutcomeTrue() {
    Node condition = createCall("goog.isNumber", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsNumberOutcomeFalse() {
    Node condition = createCall("goog.isNumber", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsFunctionOutcomeTrue() {
    Node condition = createCall("goog.isFunction", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsFunctionOutcomeFalse() {
    Node condition = createCall("goog.isFunction", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsArrayOutcomeTrue() {
    Node condition = createCall("goog.isArray", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsArrayOutcomeFalse() {
    Node condition = createCall("goog.isArray", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testIsObjectOutcomeTrue() {
    Node condition = createCall("goog.isObject", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testIsObjectOutcomeFalse() {
    Node condition = createCall("goog.isObject", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, false);
    assertNotNull(result);
  }

  @Test
  public void testUnknownFunctionName() {
    Node condition = createCall("goog.isUnknown", "param");
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testParamNotQualifiedName() {
    Node condition = new Node(Token.CALL);
    Node callee = new Node(Token.GETPROP);
    callee.addChildToBack(Node.newString(Token.NAME, "goog"));
    callee.addChildToBack(Node.newString(Token.STRING, "isDef"));
    condition.addChildToBack(callee);
    condition.addChildToBack(new Node(Token.NAME));
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNull(result);
  }

  @Test
  public void testInvalidCalleeStructure() {
    Node condition = new Node(Token.CALL);
    Node callee = new Node(Token.GETPROP);
    callee.addChildToBack(new Node(Token.NAME));
    callee.addChildToBack(new Node(Token.NAME));
    callee.addChildToBack(new Node(Token.NAME));
    condition.addChildToBack(callee);
    condition.addChildToBack(new Node(Token.NAME, "param"));
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNull(result);
  }

  @Test
  public void testLeftNotGoog() {
    Node condition = new Node(Token.CALL);
    Node callee = new Node(Token.GETPROP);
    callee.addChildToBack(Node.newString(Token.NAME, "notGoog"));
    callee.addChildToBack(Node.newString(Token.STRING, "isDef"));
    condition.addChildToBack(callee);
    param = new Node(Token.NAME, "param");
    condition.addChildToBack(param);
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNull(result);
  }

  @Test
  public void testRightNotString() {
    Node condition = new Node(Token.CALL);
    Node callee = new Node(Token.GETPROP);
    callee.addChildToBack(Node.newString(Token.NAME, "goog"));
    callee.addChildToBack(new Node(Token.NAME));
    condition.addChildToBack(callee);
    param = new Node(Token.NAME, "param");
    condition.addChildToBack(param);
    FlowScope blindScope = createBlindScope();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);
    assertNull(result);
  }

  private Node createCall(String functionName, String paramName) {
    Node call = new Node(Token.CALL);
    Node callee = new Node(Token.GETPROP);
    callee.addChildToBack(Node.newString(Token.NAME, "goog"));
    callee.addChildToBack(Node.newString(Token.STRING, functionName));
    call.addChildToBack(callee);
    call.addChildToBack(new Node(Token.NAME, paramName));
    return call;
  }

  private FlowScope createBlindScope() {
    return new FlowScope() {
      @Override
      public FlowScope createChildFlowScope() {
        return this;
      }

      @Override
      public FlowScope createChildFlowScope(Node node) {
        return this;
      }

      @Override
      public void declareName(String name, JSType type) {
      }

      @Override
      public JSType getTypeOf(String name) {
        return null;
      }

      @Override
      public JSType getTypeOf(Node node) {
        return null;
      }

      @Override
      public void removeType(String name) {
      }

      @Override
      public void removeType(Node node) {
      }

      @Override
      public boolean hasName(String name) {
        return false;
      }

      @Override
      public boolean hasNode(Node node) {
        return false;
      }

      @Override
      public void addDependency(FlowScope scope) {
      }

      @Override
      public void addDependency(Node node, JSType type) {
      }

      @Override
      public void addDependency(String name) {
      }

      @Override
      public void addDependency(String name, JSType type) {
      }

      @Override
      public void addDependency(Node node) {
      }

      @Override
      public Iterable<FlowScope> getDependencies() {
        return null;
      }

      @Override
      public void clearDependencies() {
      }

      @Override
      public FlowScope merge(FlowScope other) {
        return this;
      }

      @Override
      public FlowScope merge(FlowScope other, boolean preferOther) {
        return this;
      }

      @Override
      public FlowScope getParentScope() {
        return null;
      }

      @Override
      public FlowScope getGlobalScope() {
        return this;
      }

      @Override
      public FlowScope getFunctionScope() {
        return this;
      }

      @Override
      public Iterable<String> getAllNames() {
        return null;
      }

      @Override
      public Iterable<Node> getAllNodes() {
        return null;
      }

      @Override
      public Iterable<Entry<String, JSType>> getAllNameTypes() {
        return null;
      }

      @Override
      public Iterable<Entry<Node, JSType>> getAllNodeTypes() {
        return null;
      }

      @Override
      public boolean equals(Object other) {
        return other == this;
      }

      @Override
      public int hashCode() {
        return 1;
      }

      @Override
      public String toString() {
        return "MockFlowScope";
      }
    };
  }
}