package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.UnionType;

public class ChainableReverseAbstractInterpreterTest {

  private static class TestCodingConvention extends CodingConvention {}

  private TestChainableReverseAbstractInterpreter interpreter;
  private JSTypeRegistry typeRegistry;

  private static class TestChainableReverseAbstractInterpreter
      extends ChainableReverseAbstractInterpreter {

    TestChainableReverseAbstractInterpreter(
        CodingConvention convention, JSTypeRegistry typeRegistry) {
      super(convention, typeRegistry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      return blindScope;
    }

    @Override
    public FlowScope getTypeRefiner() {
      return null;
    }

    // Public wrapper for package-private method
    public JSType getRestrictedByTypeOfResultPublic(JSType type, String value, boolean resultEqualsValue) {
      return getRestrictedByTypeOfResult(type, value, resultEqualsValue);
    }

    // Public wrapper for getTypeIfRefinable
    public JSType getTypeIfRefinablePublic(Node node, FlowScope scope) {
      return getTypeIfRefinable(node, scope);
    }
  }

  @Before
  public void setUp() {
    typeRegistry = new JSTypeRegistry(new TestCodingConvention());
    interpreter =
        new TestChainableReverseAbstractInterpreter(
            new TestCodingConvention(), typeRegistry);
  }

  @Test
  public void testConstructorNullConvention() {
    try {
      new TestChainableReverseAbstractInterpreter(null, typeRegistry);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testAppend() {
    TestChainableReverseAbstractInterpreter second =
        new TestChainableReverseAbstractInterpreter(
            new TestCodingConvention(), typeRegistry);
    ChainableReverseAbstractInterpreter last = interpreter.append(second);
    assertSame(second, last);
    assertSame(interpreter, second.getFirst());
  }

  @Test
  public void testAppendWithInvalidLastLink() {
    TestChainableReverseAbstractInterpreter second =
        new TestChainableReverseAbstractInterpreter(
            new TestCodingConvention(), typeRegistry);
    interpreter.append(second);
    try {
      interpreter.append(second);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  @Test
  public void testGetFirst() {
    TestChainableReverseAbstractInterpreter second =
        new TestChainableReverseAbstractInterpreter(
            new TestCodingConvention(), typeRegistry);
    interpreter.append(second);
    assertSame(interpreter, interpreter.getFirst());
    assertSame(interpreter, second.getFirst());
  }

  @Test
  public void testGetTypeIfRefinableName() {
    Node nameNode = new Node(Token.NAME, "x");
    JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    nameNode.setJSType(unknownType);
    TestFlowScope scope = new TestFlowScope(typeRegistry);
    scope.addSlot("x", unknownType);
    JSType result = interpreter.getTypeIfRefinablePublic(nameNode, scope);
    assertEquals(unknownType, result);
  }

  @Test
  public void testGetTypeIfRefinableNameNullType() {
    Node nameNode = new Node(Token.NAME, "x");
    TestFlowScope scope = new TestFlowScope(typeRegistry);
    scope.addSlot("x", null);
    JSType result = interpreter.getTypeIfRefinablePublic(nameNode, scope);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
  }

  @Test
  public void testGetTypeIfRefinableNameNoSlot() {
    Node nameNode = new Node(Token.NAME, "y");
    TestFlowScope scope = new TestFlowScope(typeRegistry);
    JSType result = interpreter.getTypeIfRefinablePublic(nameNode, scope);
    assertNull(result);
  }

  @Test
  public void testGetTypeIfRefinableGetProp() {
    Node getPropNode = new Node(Token.GETPROP);
    getPropNode.setQualifiedName("a.b");
    JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    getPropNode.setJSType(unknownType);
    TestFlowScope scope = new TestFlowScope(typeRegistry);
    scope.addSlot("a.b", null);
    JSType result = interpreter.getTypeIfRefinablePublic(getPropNode, scope);
    assertEquals(unknownType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultNumber() {
    JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(numberType, "number", true);
    assertEquals(numberType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultMismatch() {
    JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(numberType, "string", true);
    assertNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultBoolean() {
    JSType booleanType = typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(booleanType, "boolean", true);
    assertEquals(booleanType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultString() {
    JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(stringType, "string", true);
    assertEquals(stringType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultUndefined() {
    JSType voidType = typeRegistry.getNativeType(JSTypeNative.VOID_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(voidType, "undefined", true);
    assertEquals(voidType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultFunction() {
    JSType u2uCtor = typeRegistry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(u2uCtor, "function", true);
    assertEquals(u2uCtor, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultInterestingCase() {
    JSType union = typeRegistry.createUnionType(
        typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE),
        typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(
        union, "number", true);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultMismatchInterestingCase() {
    JSType union = typeRegistry.createUnionType(
        typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE),
        typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(
        union, "boolean", true);
    assertNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultEqualsFalse() {
    JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(numberType, "number", false);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultUnknown() {
    JSType unknownType = typeRegistry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(unknownType, "number", true);
    assertEquals(unknownType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultNullType() {
    JSType nullType = typeRegistry.getNativeType(JSTypeNative.NULL_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(nullType, "object", false);
    assertNotNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultObject() {
    JSType objectType = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(objectType, "object", true);
    assertEquals(objectType, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultNoObject() {
    JSType noObjectType = typeRegistry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(noObjectType, "undefined", false);
    assertNotNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultAll() {
    JSType allType = typeRegistry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(allType, "number", true);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultAllMismatch() {
    JSType allType = typeRegistry.getNativeType(JSTypeNative.ALL_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(allType, "boolean", true);
    assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultInvalidTypeof() {
    JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(stringType, "invalid", true);
    assertNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultEnum() {
    JSType enumType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    EnumElementType enumElement = new EnumElementType(enumType, "TestEnum");
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(enumElement, "number", true);
    assertEquals(enumElement, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResultEnumMismatch() {
    JSType enumType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
    EnumElementType enumElement = new EnumElementType(enumType, "TestEnum");
    JSType result = interpreter.getRestrictedByTypeOfResultPublic(enumElement, "string", true);
    assertNull(result);
  }
}