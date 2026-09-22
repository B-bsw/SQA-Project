package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.JSTypeRegistry;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry.NodeType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrowTypeTest {

  private static final JSTypeRegistry registry = new JSTypeRegistry();
  private static final JSType UNKNOWN = registry.getNativeType(UNKNOWN_TYPE);
  private static final JSType NUMBER = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
  private static final JSType STRING = registry.getNativeType(JSTypeNative.STRING_TYPE);

  private Node singleParamNode;
  private Node multiParamNode;
  private Node varArgsParamNode;
  private Node emptyParamNode;
  private ArrowType arrowType;

  @Before
  public void setUp() {
    // Create a single parameter node with JSType of NUMBER
    Node param1 = new Node(Node.PARAM);
    param1.setJSType(NUMBER);
    singleParamNode = new Node(Node.PARAM_LIST);
    singleParamNode.addChildToBack(param1);

    // Create multi-param node: (number, string)
    Node param2 = new Node(Node.PARAM);
    param2.setJSType(STRING);
    multiParamNode = new Node(Node.PARAM_LIST);
    multiParamNode.addChildToBack(param1.clone());
    multiParamNode.addChildToBack(param2);

    // Create varargs param node: (...number)
    Node varParam = new Node(Node.PARAM);
    varParam.setJSType(NUMBER);
    varParam.setVarArgs(true);
    varArgsParamNode = new Node(Node.PARAM_LIST);
    varArgsParamNode.addChildToBack(varParam);

    emptyParamNode = new Node(Node.PARAM_LIST);

    arrowType = new ArrowType(registry, singleParamNode, NUMBER);
  }

  @Test
  public void testConstructorNullParametersAndReturnType() {
    ArrowType at = new ArrowType(registry, null, null);
    assertNotNull(at.parameters);
    assertEquals(UNKNOWN, at.parameters.getFirstChild().getJSType());
    assertEquals(UNKNOWN, at.returnType);
    assertFalse(at.returnTypeInferred);
  }

  @Test
  public void testConstructorWithAllParams() {
    ArrowType at = new ArrowType(registry, multiParamNode, STRING, true);
    assertEquals(multiParamNode, at.parameters);
    assertEquals(STRING, at.returnType);
    assertTrue(at.returnTypeInferred);
  }

  @Test
  public void testIsSubtypeWithNonArrowType() {
    JSType other = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(arrowType.isSubtype(other));
  }

  @Test
  public void testIsSubtypeReturnTypeNotSubtype() {
    ArrowType other = new ArrowType(registry, singleParamNode, STRING);
    assertFalse(arrowType.isSubtype(other));
  }

  @Test
  public void testIsSubtypeReturnTypeSubtype() {
    ArrowType other = new ArrowType(registry, singleParamNode, NUMBER);
    assertTrue(arrowType.isSubtype(other));
  }

  @Test
  public void testIsSubtypeParamContravariance() {
    ArrowType superType = new ArrowType(registry, emptyParamNode, NUMBER);
    ArrowType subType = new ArrowType(registry, singleParamNode, NUMBER);
    assertFalse(subType.isSubtype(superType));
    assertTrue(superType.isSubtype(subType));
  }

  @Test
  public void testIsSubtypeParamMismatch() {
    ArrowType withString = new ArrowType(registry, multiParamNode, NUMBER);
    ArrowType withNumber = new ArrowType(registry, singleParamNode, NUMBER);
    assertFalse(withNumber.isSubtype(withString));
    assertFalse(withString.isSubtype(withNumber));
  }

  @Test
  public void testIsSubtypeVarArgsExtraParam() {
    ArrowType withVarArgs = new ArrowType(registry, varArgsParamNode, NUMBER);
    ArrowType withSingle = new ArrowType(registry, singleParamNode, NUMBER);
    assertTrue(withVarArgs.isSubtype(withSingle));
    assertFalse(withSingle.isSubtype(withVarArgs));
  }

  @Test
  public void testIsSubtypeBothVarArgs() {
    ArrowType bothVarArgs = new ArrowType(registry, varArgsParamNode, NUMBER);
    ArrowType otherVarArgs = new ArrowType(registry, varArgsParamNode, NUMBER);
    assertTrue(bothVarArgs.isSubtype(otherVarArgs));
  }

  @Test
  public void testHasEqualParameters() {
    ArrowType other = new ArrowType(registry, singleParamNode, NUMBER);
    assertTrue(arrowType.hasEqualParameters(other));
  }

  @Test
  public void testHasEqualParametersDifferentTypes() {
    ArrowType other = new ArrowType(registry, multiParamNode, NUMBER);
    assertFalse(arrowType.hasEqualParameters(other));
  }

  @Test
  public void testHasEqualParametersNullTypeMismatch() {
    // One param has null JSType
    Node nullTypeParam = new Node(Node.PARAM);
    Node nullNode = new Node(Node.PARAM_LIST);
    nullNode.addChildToBack(nullTypeParam);
    ArrowType other = new ArrowType(registry, nullNode, NUMBER);
    assertFalse(arrowType.hasEqualParameters(other));
  }

  @Test
  public void testHasEqualParametersOneEndsEarlier() {
    ArrowType other = new ArrowType(registry, emptyParamNode, NUMBER);
    assertFalse(arrowType.hasEqualParameters(other));
  }

  @Test
  public void testHasEqualParametersBothEmpty() {
    ArrowType other = new ArrowType(registry, emptyParamNode, NUMBER);
    ArrowType emptyArrow = new ArrowType(registry, emptyParamNode, NUMBER);
    assertTrue(emptyArrow.hasEqualParameters(other));
  }

  @Test
  public void testHasEqualParametersWithVarArgs() {
    ArrowType other = new ArrowType(registry, varArgsParamNode, NUMBER);
    assertFalse(arrowType.hasEqualParameters(other));
  }

  @Test
  public void testIsEquivalentTo() {
    ArrowType other = new ArrowType(registry, singleParamNode, NUMBER);
    assertTrue(arrowType.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentToDifferentReturnType() {
    ArrowType other = new ArrowType(registry, singleParamNode, STRING);
    assertFalse(arrowType.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentToNotArrowType() {
    JSType other = registry.getNativeType(JSTypeNative.STRING_TYPE);
    assertFalse(arrowType.isEquivalentTo(other));
  }

  @Test
  public void testHashCode() {
    ArrowType other = new ArrowType(registry, singleParamNode, NUMBER);
    assertEquals(arrowType.hashCode(), other.hashCode());
  }

  @Test
  public void testHashCodeWithInferredReturnType() {
    ArrowType inferred = new ArrowType(registry, singleParamNode, NUMBER, true);
    ArrowType nonInferred = new ArrowType(registry, singleParamNode, NUMBER, false);
    assertFalse(inferred.hashCode() == nonInferred.hashCode());
  }

  @Test
  public void testHashCodeNullParamType() {
    Node untypedParam = new Node(Node.PARAM);
    Node untypedList = new Node(Node.PARAM_LIST);
    untypedList.addChildToBack(untypedParam);
    ArrowType at = new ArrowType(registry, untypedList, NUMBER);
    assertNotNull(at.hashCode());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetLeastSupertypeThrows() {
    arrowType.getLeastSupertype(null);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetGreatestSubtypeThrows() {
    arrowType.getGreatestSubtype(null);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testTestForEqualityThrows() {
    arrowType.testForEquality(null);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testVisitThrows() {
    arrowType.visit(null);
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testResolveInternal() {
    ErrorReporter reporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        fail("Unexpected warning: " + message);
      }
      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        fail("Unexpected error: " + message);
      }
    };
    StaticScope<JSType> scope = null;
    ArrowType resolved = (ArrowType) arrowType.resolveInternal(reporter, scope);
    assertNotNull(resolved);
    assertEquals(NUMBER, resolved.returnType);
  }

  @Test
  public void testHasUnknownParamsOrReturnNullParamType() {
    Node untypedParam = new Node(Node.PARAM);
    Node untypedList = new Node(Node.PARAM_LIST);
    untypedList.addChildToBack(untypedParam);
    ArrowType at = new ArrowType(registry, untypedList, UNKNOWN);
    assertTrue(at.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturnKnownTypes() {
    ArrowType at = new ArrowType(registry, singleParamNode, NUMBER);
    assertFalse(at.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturnUnknownReturn() {
    ArrowType at = new ArrowType(registry, singleParamNode, UNKNOWN);
    assertTrue(at.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturnNullTypeInParam() {
    Node untypedParam = new Node(Node.PARAM);
    Node untypedList = new Node(Node.PARAM_LIST);
    untypedList.addChildToBack(untypedParam);
    ArrowType at = new ArrowType(registry, untypedList, NUMBER);
    assertTrue(at.hasUnknownParamsOrReturn());
  }

  @Test
  public void testToStringHelper() {
    assertNotNull(arrowType.toStringHelper(false));
    assertNotNull(arrowType.toStringHelper(true));
  }
}