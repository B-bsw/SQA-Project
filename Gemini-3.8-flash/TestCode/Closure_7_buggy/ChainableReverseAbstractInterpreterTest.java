package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.ParameterizedType;

@RunWith(JUnit4.class)
public class ChainableReverseAbstractInterpreterTest {

  private ChainableReverseAbstractInterpreter interpreter;
  private ChainableReverseAbstractInterpreter secondLink;
  private JSTypeRegistry registry;
  private CodingConvention convention;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    convention = new CodingConvention() {};
    interpreter = new ChainableReverseAbstractInterpreter(convention, registry) {}.append(
        new ChainableReverseAbstractInterpreter(convention, registry) {});
    secondLink = new ChainableReverseAbstractInterpreter(convention, registry) {};
  }

  @Test
  public void testConstructor_NullConvention_ThrowsException() {
    try {
      new ChainableReverseAbstractInterpreter(null, registry) {};
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testAppend_NullLastLink_ThrowsException() {
    ChainableReverseAbstractInterpreter interpreter = new ChainableReverseAbstractInterpreter(convention, registry) {};
    try {
      interpreter.append(null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testAppend_WithNextLinkAlreadySet_ThrowsException() {
    ChainableReverseAbstractInterpreter first = new ChainableReverseAbstractInterpreter(convention, registry) {};
    ChainableReverseAbstractInterpreter second = new ChainableReverseAbstractInterpreter(convention, registry) {};
    ChainableReverseAbstractInterpreter third = new ChainableReverseAbstractInterpreter(convention, registry) {};
    first.append(second);
    try {
      first.append(third);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      // expected
    }
  }

  @Test
  public void testAppend_ValidChain_ReturnsLastLink() {
    ChainableReverseAbstractInterpreter first = new ChainableReverseAbstractInterpreter(convention, registry) {};
    ChainableReverseAbstractInterpreter second = new ChainableReverseAbstractInterpreter(convention, registry) {};
    ChainableReverseAbstractInterpreter result = first.append(second);
    assertSame(second, result);
    assertSame(first, second.getFirst());
  }

  @Test
  public void testGetFirst_WhenSingleLink_ReturnsSelf() {
    ChainableReverseAbstractInterpreter interpreter = new ChainableReverseAbstractInterpreter(convention, registry) {};
    assertSame(interpreter, interpreter.getFirst());
  }

  @Test
  public void testFirstPreciserScopeKnowingConditionOutcome_WithChain_DelegatesToFirst() {
    final ChainableReverseAbstractInterpreter[] firstCalled = new ChainableReverseAbstractInterpreter[1];
    ChainableReverseAbstractInterpreter first = new ChainableReverseAbstractInterpreter(convention, registry) {
      @Override
      protected FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome) {
        firstCalled[0] = this;
        return blindScope;
      }
    };
    ChainableReverseAbstractInterpreter second = new ChainableReverseAbstractInterpreter(convention, registry) {};
    first.append(second);
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) {}
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    first.firstPreciserScopeKnowingConditionOutcome(new Node(Token.NAME), scope, true);
    assertSame(first, firstCalled[0]);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_WithNextLink() {
    final boolean[] nextCalled = new boolean[1];
    ChainableReverseAbstractInterpreter first = new ChainableReverseAbstractInterpreter(convention, registry) {};
    ChainableReverseAbstractInterpreter second = new ChainableReverseAbstractInterpreter(convention, registry) {
      @Override
      protected FlowScope getPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome) {
        nextCalled[0] = true;
        return blindScope;
      }
    };
    first.append(second);
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) {}
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    first.nextPreciserScopeKnowingConditionOutcome(new Node(Token.NAME), scope, false);
    assertEquals(true, nextCalled[0]);
  }

  @Test
  public void testNextPreciserScopeKnowingConditionOutcome_NoNextLink_ReturnsBlindScope() {
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) {}
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    ChainableReverseAbstractInterpreter interpreter = new ChainableReverseAbstractInterpreter(convention, registry) {};
    assertSame(scope, interpreter.nextPreciserScopeKnowingConditionOutcome(new Node(Token.NAME), scope, true));
  }

  @Test
  public void testGetTypeIfRefinable_NameWithVarType_ReturnsType() {
    FlowScope scope = new FlowScope() {
      private StaticSlot<JSType> slot = new StaticSlot<JSType>() {
        private JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        @Override public String getName() { return "x"; }
        @Override public JSType getType() { return type; }
        @Override public boolean isTypeInferred() { return false; }
        @Override public JSType getJSType() { return type; }
        @Override public void setType(JSType type) { this.type = type; }
        @Override public void setJSType(JSType type) { this.type = type; }
      };
      @Override public StaticSlot<JSType> getSlot(String name) { return name.equals("x") ? slot : null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) { if (name.equals("x")) slot.setType(type); }
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    Node nameNode = new Node(Token.NAME, "x");
    JSType result = interpreter.getTypeIfRefinable(nameNode, scope);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetTypeIfRefinable_NameNoVar_ReturnsNull() {
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) {}
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    Node nameNode = new Node(Token.NAME, "nonexistent");
    assertNull(interpreter.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetTypeIfRefinable_GetPropWithPropVar_ReturnsType() {
    FlowScope scope = new FlowScope() {
      private StaticSlot<JSType> slot = new StaticSlot<JSType>() {
        private JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        @Override public String getName() { return "a.b"; }
        @Override public JSType getType() { return type; }
        @Override public boolean isTypeInferred() { return false; }
        @Override public JSType getJSType() { return type; }
        @Override public void setType(JSType type) { this.type = type; }
        @Override public void setJSType(JSType type) { this.type = type; }
      };
      @Override public StaticSlot<JSType> getSlot(String name) { return name.equals("a.b") ? slot : null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) { if (name.equals("a.b")) slot.setType(type); }
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "a"), new Node(Token.STRING, "b"));
    JSType result = interpreter.getTypeIfRefinable(getPropNode, scope);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), result);
  }

  @Test
  public void testGetTypeIfRefinable_GetPropWithNullPropVarType_ReturnsNodeType() {
    FlowScope scope = new FlowScope() {
      private StaticSlot<JSType> slot = new StaticSlot<JSType>() {
        private JSType type = null;
        @Override public String getName() { return "a.b"; }
        @Override public JSType getType() { return null; }
        @Override public boolean isTypeInferred() { return false; }
        @Override public JSType getJSType() { return type; }
        @Override public void setType(JSType type) { this.type = type; }
        @Override public void setJSType(JSType type) { this.type = type; }
      };
      @Override public StaticSlot<JSType> getSlot(String name) { return name.equals("a.b") ? slot : null; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) { if (name.equals("a.b")) slot.setType(type); }
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "a"), new Node(Token.STRING, "b"));
    getPropNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    JSType result = interpreter.getTypeIfRefinable(getPropNode, scope);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_WithTypeOfNumber_ReturnsNumber() {
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(type, "number", true);
    assertNotNull(result);
    assertEquals(type, result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_WithTypeOfObjectButNotObject_ReturnsNull() {
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(type, "object", true);
    assertNull(result);
  }

  @Test
  public void testGetNativeTypeForTypeOf_WithNumber() {
    JSType result = interpreter.getNativeTypeForTypeOf("number");
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testGetNativeTypeForTypeOf_WithInvalidValue_ReturnsNull() {
    JSType result = interpreter.getNativeTypeForTypeOf("invalid");
    assertNull(result);
  }

  @Test
  public void testGetRestrictedByTypeOfResult_WithTypeOfUnknownAndResultEqualsFalse_ReturnsUnknown() {
    JSType type = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType result = interpreter.getRestrictedByTypeOfResult(type, "string", false);
    assertNotNull(result);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictByOneTypeOfResultVisitor_WithMismatch_ReturnsNull() {
    ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor visitor = interpreter.new RestrictByOneTypeOfResultVisitor("number", true);
    JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = visitor.restrictByTypeOfResult(type);
    assertNull(result);
  }

  @Test
  public void testRestrictByOneTypeOfResultVisitor_WithMatchingNumber_ReturnsType() {
    ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor visitor = interpreter.new RestrictByOneTypeOfResultVisitor("number", true);
    JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = visitor.restrictByTypeOfResult(type);
    assertNotNull(result);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictByOneTypeOfResultVisitor_WithObjectCase_ReturnsRestrictedType() {
    ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor visitor = interpreter.new RestrictByOneTypeOfResultVisitor("object", true);
    JSType type = registry.createUnionType(registry.getNativeType(JSTypeNative.OBJECT_TYPE), registry.getNativeType(JSTypeNative.NULL_TYPE));
    JSType result = visitor.restrictByTypeOfResult(type);
    assertNotNull(result);
    assertEquals(registry.getNativeType(JSTypeNative.OBJECT_TYPE), result);
  }

  @Test
  public void testRestrictByOneTypeOfResultVisitor_WithFunctionCase_ReturnsCtorIfSubtype() {
    JSType ctorType = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    JSType type = registry.createUnionType(ctorType, registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    ChainableReverseAbstractInterpreter.RestrictByOneTypeOfResultVisitor visitor = interpreter.new RestrictByOneTypeOfResultVisitor("function", true);
    JSType result = visitor.restrictByTypeOfResult(type);
    assertNotNull(result);
    assertEquals(ctorType, result);
  }

  @Test
  public void testDeclareNameInScope_WithName_InfersSlotType() {
    final StaticSlot<JSType>[] slotHolder = new StaticSlot[1];
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return slotHolder[0]; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferSlotType(String name, JSType type) {
        if (slotHolder[0] != null) {
          slotHolder[0].setType(type);
        }
      }
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {}
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    slotHolder[0] = new StaticSlot<JSType>() {
      private JSType type = null;
      @Override public String getName() { return "x"; }
      @Override public JSType getType() { return type; }
      @Override public boolean isTypeInferred() { return false; }
      @Override public JSType getJSType() { return type; }
      @Override public void setType(JSType type) { this.type = type; }
      @Override public void setJSType(JSType type) { this.type = type; }
    };
    Node nameNode = new Node(Token.NAME, "x");
    JSType newType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    interpreter.declareNameInScope(scope, nameNode, newType);
    assertEquals(newType, slotHolder[0].getType());
  }

  @Test
  public void testDeclareNameInScope_WithGetProp_AndNoOrigType_UsesUnknown() {
    final StaticSlot<JSType>[] slotHolder = new StaticSlot[1];
    FlowScope scope = new FlowScope() {
      @Override public StaticSlot<JSType> getSlot(String name) { return slotHolder[0]; }
      @Override public StaticSlot<JSType> getOwnSlot(String name) { return null; }
      @Override public FlowScope createChildFlowScope() { return this; }
      @Override public void inferQualifiedSlot(Node node, String qualifiedName, JSType originType, JSType type) {
        if (slotHolder[0] != null) {
          slotHolder[0].setType(type);
        }
      }
      @Override public void inferQualifiedSlot(String name, JSType type) {}
      @Override public void inferSlotType(String name, JSType type) {}
      @Override public FlowScope join(FlowScope other) { return this; }
      @Override public boolean declareSymbol(StaticSlot<JSType> slot) { return false; }
      @Override public String toString() { return "scope"; }
    };
    slotHolder[0] = new StaticSlot<JSType>() {
      private JSType type = null;
      @Override public String getName() { return "a.b"; }
      @Override public JSType getType() { return type; }
      @Override public boolean isTypeInferred() { return false; }
      @Override public JSType getJSType() { return type; }
      @Override public void setType(JSType type) { this.type = type; }
      @Override public void setJSType(JSType type) { this.type = type; }
    };
    Node getPropNode = new Node(Token.GETPROP, new Node(Token.NAME, "a"), new Node(Token.STRING, "b"));
    JSType newType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    interpreter.declareNameInScope(scope, getPropNode, newType);
    assertEquals(newType, slotHolder[0].getType());
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseObjectType_ReturnsNull() {
    JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType result = interpreter.restrictUndefinedVisitor.caseObjectType((ObjectType) type);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseUnionType_RemovesVoid() {
    JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType union = registry.createUnionType(voidType, numberType);
    JSType result = interpreter.restrictUndefinedVisitor.caseUnionType((UnionType) union);
    assertEquals(numberType, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseEnumElementType_ReturnsRestrictedPrimitive() {
    JSType primitiveType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    final EnumElementType enumType = new EnumElementType(primitiveType, "MyEnum");
    JSType result = interpreter.restrictUndefinedVisitor.caseEnumElementType(enumType);
    assertEquals(primitiveType, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseAllType_ReturnsUnionWithoutVoid() {
    JSType result = interpreter.restrictUndefinedVisitor.caseAllType();
    assertNotNull(result);
    assertEquals(registry.createUnionType(
        registry.getNativeType(JSTypeNative.OBJECT_TYPE),
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        registry.getNativeType(JSTypeNative.BOOLEAN_TYPE),
        registry.getNativeType(JSTypeNative.NULL_TYPE)), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseNoType_ReturnsNoType() {
    JSType result = interpreter.restrictUndefinedVisitor.caseNoType();
    assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseNoObjectType_ReturnsNoObject() {
    JSType result = interpreter.restrictUndefinedVisitor.caseNoObjectType();
    assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseBooleanType_ReturnsBoolean() {
    JSType result = interpreter.restrictUndefinedVisitor.caseBooleanType();
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseNullType_ReturnsNull() {
    JSType result = interpreter.restrictUndefinedVisitor.caseNullType();
    assertEquals(registry.getNativeType(JSTypeNative.NULL_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseNumberType_ReturnsNumber() {
    JSType result = interpreter.restrictUndefinedVisitor.caseNumberType();
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseStringType_ReturnsString() {
    JSType result = interpreter.restrictUndefinedVisitor.caseStringType();
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseUnknownType_ReturnsUnknown() {
    JSType result = interpreter.restrictUndefinedVisitor.caseUnknownType();
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseVoidType_ReturnsVoid() {
    JSType result = interpreter.restrictUndefinedVisitor.caseVoidType();
    assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseFunctionType_ReturnsFunction() {
    JSType type = registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE);
    JSType result = interpreter.restrictUndefinedVisitor.caseFunctionType((FunctionType) type);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseTemplateType_ReturnsObject() {
    JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    TemplateType template = new TemplateType(registry, "T", type);
    JSType result = interpreter.restrictUndefinedVisitor.caseTemplateType(template);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseParameterizedType_ReturnsObject() {
    JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    ParameterizedType param = new ParameterizedType(registry, type, new JSType[]{registry.getNativeType(JSTypeNative.STRING_TYPE)});
    JSType result = interpreter.restrictUndefinedVisitor.caseParameterizedType(param);
    assertEquals(type, result);
  }

  @Test
  public void testRestrictUndefinedVisitor_CaseObjectTypeNonObject_ReturnsSameType() {
    ObjectType type = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    JSType result = interpreter.restrictUndefinedVisitor.caseObjectType(type);
    assertEquals(type, result);
  }

  @Test
  public void testGetNativeType_WithValidType_ReturnsRegisteredType() {
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        interpreter.getNativeType(JSTypeNative.NUMBER_TYPE));
  }

  @Test
  public void testGetNativeType_WithNonNullTypeId_ReturnsCorrectType() {
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE),
        interpreter.getNativeType(JSTypeNative.STRING_TYPE));
  }
}