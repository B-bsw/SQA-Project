package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;

public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;
  private NodeTraversal traversal;
  private Node rootNode;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    });
    rootNode = IR.script();
    rootNode.setSourceFileName("testcode.js");
  }

  private JSType getNative(JSTypeNative typeId) {
    return registry.getNativeType(typeId);
  }

  private int countMismatches() {
    int count = 0;
    for (TypeValidator.TypeMismatch mismatch : validator.getMismatches()) {
      count++;
    }
    return count;
  }

  @Test
  public void getMismatches_initiallyEmpty_shouldReturnEmpty() {
    Assert.assertNotNull(validator.getMismatches());
    Assert.assertFalse(validator.getMismatches().iterator().hasNext());
  }

  @Test
  public void expectValidTypeofName_givenUnknownType_shouldReportWarning() {
    Node node = IR.string("invalid_type");
    validator.expectValidTypeofName(traversal, node, "invalid_type");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.UNKNOWN_TYPEOF_VALUE, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectValidTypeofName_whenReportingDisabled_shouldNotReportWarning() {
    validator.setShouldReport(false);
    Node node = IR.string("invalid_type");
    validator.expectValidTypeofName(traversal, node, "invalid_type");

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectObject_givenObjectType_shouldReturnTrueAndNotReport() {
    Node node = IR.empty();
    JSType objectType = getNative(OBJECT_TYPE);

    boolean result = validator.expectObject(traversal, node, objectType, "expected object");

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectObject_givenNumberType_shouldReturnFalseAndReport() {
    Node node = IR.number(123);
    JSType numberType = getNative(NUMBER_TYPE);

    boolean result = validator.expectObject(traversal, node, numberType, "expected object");

    Assert.assertFalse(result);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectActualObject_givenObjectType_shouldNotReport() {
    Node node = IR.empty();
    JSType objectType = getNative(OBJECT_TYPE);

    validator.expectActualObject(traversal, node, objectType, "expected actual object");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectActualObject_givenStringType_shouldReport() {
    Node node = IR.string("abc");
    JSType stringType = getNative(STRING_TYPE);

    validator.expectActualObject(traversal, node, stringType, "expected actual object");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectAnyObject_givenObjectType_shouldNotReport() {
    Node node = IR.empty();
    JSType objectType = getNative(OBJECT_TYPE);

    validator.expectAnyObject(traversal, node, objectType, "expected any object");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectAnyObject_givenNoObjectType_shouldNotReport() {
    Node node = IR.empty();
    JSType noObjectType = getNative(NO_OBJECT_TYPE);

    validator.expectAnyObject(traversal, node, noObjectType, "expected any object");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectAnyObject_givenNumberType_shouldReport() {
    Node node = IR.number(42);
    JSType numberType = getNative(NUMBER_TYPE);

    validator.expectAnyObject(traversal, node, numberType, "expected any object");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectString_givenStringType_shouldNotReport() {
    Node node = IR.string("test");
    JSType stringType = getNative(STRING_TYPE);

    validator.expectString(traversal, node, stringType, "expected string");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectString_givenBooleanType_shouldReport() {
    Node node = IR.trueNode();
    JSType booleanType = getNative(BOOLEAN_TYPE);

    validator.expectString(traversal, node, booleanType, "expected string");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectNumber_givenNumberType_shouldNotReport() {
    Node node = IR.number(5);
    JSType numberType = getNative(NUMBER_TYPE);

    validator.expectNumber(traversal, node, numberType, "expected number");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectNumber_givenStringType_shouldReport() {
    Node node = IR.string("not number");
    JSType stringType = getNative(STRING_TYPE);

    validator.expectNumber(traversal, node, stringType, "expected number");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectBitwiseable_givenNumberType_shouldNotReport() {
    Node node = IR.number(1);
    JSType numberType = getNative(NUMBER_TYPE);

    validator.expectBitwiseable(traversal, node, numberType, "expected bitwiseable");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectBitwiseable_givenValueTypeSubtype_shouldNotReport() {
    Node node = IR.string("str");
    JSType stringType = getNative(STRING_TYPE);

    validator.expectBitwiseable(traversal, node, stringType, "expected bitwiseable");

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectBitwiseable_givenObjectType_shouldReport() {
    Node node = IR.empty();
    JSType objectType = getNative(OBJECT_TYPE);

    validator.expectBitwiseable(traversal, node, objectType, "expected bitwiseable");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectStringOrNumber_givenStringType_shouldNotReport() {
    Node node = IR.string("abc");
    JSType stringType = getNative(STRING_TYPE);

    validator.expectStringOrNumber(traversal, node, stringType, "expected string or number");

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectStringOrNumber_givenNumberType_shouldNotReport() {
    Node node = IR.number(10);
    JSType numberType = getNative(NUMBER_TYPE);

    validator.expectStringOrNumber(traversal, node, numberType, "expected string or number");

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectStringOrNumber_givenObjectType_shouldReport() {
    Node node = IR.empty();
    JSType objectType = getNative(OBJECT_TYPE);

    validator.expectStringOrNumber(traversal, node, objectType, "expected string or number");

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectNotNullOrUndefined_givenValidNumberType_shouldReturnTrue() {
    Node node = IR.number(1);
    JSType numberType = getNative(NUMBER_TYPE);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, numberType, "msg", numberType);

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectNotNullOrUndefined_givenNoType_shouldReturnTrue() {
    Node node = IR.empty();
    JSType noType = getNative(NO_TYPE);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, noType, "msg", getNative(NUMBER_TYPE));

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectNotNullOrUndefined_givenUnknownType_shouldReturnTrue() {
    Node node = IR.empty();
    JSType unknownType = getNative(UNKNOWN_TYPE);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, unknownType, "msg", getNative(NUMBER_TYPE));

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectNotNullOrUndefined_givenNullTypeNonGetProp_shouldReturnFalseAndReport() {
    Node node = IR.name("x");
    JSType nullType = getNative(NULL_TYPE);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, nullType, "null error", getNative(OBJECT_TYPE));

    Assert.assertFalse(result);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectNotNullOrUndefined_givenVoidType_shouldReturnFalseAndReport() {
    Node node = IR.name("x");
    JSType voidType = getNative(VOID_TYPE);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, voidType, "void error", getNative(OBJECT_TYPE));

    Assert.assertFalse(result);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void expectNotNullOrUndefined_givenForwardDeclaredUnresolvedType_shouldReturnTrue() {
    Node node = IR.name("forwardDeclared");
    JSType unresolved = registry.createNamedType("MissingType", null, 0, 0);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, unresolved, "msg", getNative(OBJECT_TYPE));

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectNotNullOrUndefined_givenUnionContainingForwardDeclaredUnresolved_shouldReturnTrue() {
    Node node = IR.name("forwardDeclaredUnion");
    JSType unresolved = registry.createNamedType("MissingType2", null, 0, 0);
    JSType union = registry.createUnionType(getNative(NULL_TYPE), unresolved);

    boolean result = validator.expectNotNullOrUndefined(traversal, node, union, "msg", getNative(OBJECT_TYPE));

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectSwitchMatchesCase_givenMatchingTypes_shouldNotReport() {
    Node switchNode = IR.switchNode(IR.name("s"), IR.caseNode(IR.number(1), IR.block()));
    Node caseNode = switchNode.getLastChild();
    JSType numberType = getNative(NUMBER_TYPE);

    validator.expectSwitchMatchesCase(traversal, caseNode, numberType, numberType);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectSwitchMatchesCase_givenIncompatibleTypes_shouldReport() {
    Node caseChild = IR.string("caseValue");
    Node caseNode = IR.caseNode(caseChild, IR.block());
    Node switchNode = IR.switchNode(IR.number(1), caseNode);

    JSType numberType = getNative(NUMBER_TYPE);
    JSType stringType = getNative(STRING_TYPE);

    validator.expectSwitchMatchesCase(traversal, caseNode, numberType, stringType);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test(expected = IllegalStateException.class)
  public void expectIndexMatch_givenNonGetElemNode_shouldThrowIllegalStateException() {
    Node getPropNode = IR.getprop(IR.name("a"), IR.string("b"));
    validator.expectIndexMatch(traversal, getPropNode, getNative(OBJECT_TYPE), getNative(STRING_TYPE));
  }

  @Test
  public void expectIndexMatch_givenStructType_shouldReportIllegalPropertyAccess() {
    Node target = IR.name("s");
    Node index = IR.string("p");
    Node getElemNode = IR.getelem(target, index);

    ObjectType structType = registry.createRecordTypeBuilder().build();
    structType.setStruct();

    validator.expectIndexMatch(traversal, getElemNode, structType, getNative(STRING_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.ILLEGAL_PROPERTY_ACCESS, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectIndexMatch_givenUnknownTypeAndValidIndex_shouldPass() {
    Node target = IR.name("u");
    Node index = IR.string("key");
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(UNKNOWN_TYPE), getNative(STRING_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenArrayTypeAndNumberIndex_shouldPass() {
    Node target = IR.name("arr");
    Node index = IR.number(0);
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(ARRAY_TYPE), getNative(NUMBER_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenArrayTypeAndStringIndex_shouldReportMismatch() {
    Node target = IR.name("arr");
    Node index = IR.string("idx");
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(ARRAY_TYPE), getNative(STRING_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenObjectTypeAndStringIndex_shouldPass() {
    Node target = IR.name("obj");
    Node index = IR.string("key");
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(OBJECT_TYPE), getNative(STRING_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenObjectTypeAndBooleanIndex_shouldReportMismatch() {
    Node target = IR.name("obj");
    Node index = IR.trueNode();
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(OBJECT_TYPE), getNative(BOOLEAN_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenRestrictedIndexObject_shouldMatchTemplateKey() {
    TemplateType keyType = registry.getObjectIndexKey();
    ObjectType templatedObj = registry.createObjectType("RestrictedMap", null);
    templatedObj.getTemplateTypeMap().putTemplateKey(keyType, getNative(NUMBER_TYPE));

    Node target = IR.name("map");
    Node index = IR.number(123);
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, templatedObj, getNative(NUMBER_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenRestrictedIndexObjectWithInvalidIndex_shouldReportMismatch() {
    TemplateType keyType = registry.getObjectIndexKey();
    ObjectType templatedObj = registry.createObjectType("RestrictedMap2", null);
    templatedObj.getTemplateTypeMap().putTemplateKey(keyType, getNative(NUMBER_TYPE));

    Node target = IR.name("map");
    Node index = IR.string("invalidKey");
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, templatedObj, getNative(STRING_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void expectIndexMatch_givenPrimitiveNumber_shouldReportMismatch() {
    Node target = IR.number(100);
    Node index = IR.number(0);
    Node getElemNode = IR.getelem(target, index);

    validator.expectIndexMatch(traversal, getElemNode, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectCanAssignToPropertyOf_givenSubtype_shouldReturnTrue() {
    Node ownerNode = IR.name("obj");
    ownerNode.setJSType(getNative(OBJECT_TYPE));
    Node propAssign = IR.assign(IR.getprop(ownerNode, IR.string("x")), IR.number(1));

    boolean result = validator.expectCanAssignToPropertyOf(
        traversal, propAssign, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE), ownerNode, "x");

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectCanAssignToPropertyOf_givenNoTypeLeft_shouldReturnTrue() {
    Node ownerNode = IR.name("obj");
    ownerNode.setJSType(getNative(OBJECT_TYPE));
    Node propAssign = IR.assign(IR.getprop(ownerNode, IR.string("x")), IR.number(1));

    boolean result = validator.expectCanAssignToPropertyOf(
        traversal, propAssign, getNative(NUMBER_TYPE), getNative(NO_TYPE), ownerNode, "x");

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectCanAssignToPropertyOf_givenIncompatibleTypes_shouldReturnFalseAndReport() {
    Node ownerNode = IR.name("obj");
    ownerNode.setJSType(getNative(OBJECT_TYPE));
    Node propAssign = IR.assign(IR.getprop(ownerNode, IR.string("x")), IR.string("text"));

    boolean result = validator.expectCanAssignToPropertyOf(
        traversal, propAssign, getNative(STRING_TYPE), getNative(NUMBER_TYPE), ownerNode, "x");

    Assert.assertFalse(result);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectCanAssignToPropertyOf_givenInterfacePrototypeMethod_shouldReturnTrue() {
    FunctionType ifaceFn = registry.createInterfaceType("MyInterface", null);
    ObjectType proto = ifaceFn.getPrototype();
    Node ownerNode = IR.getprop(IR.name("MyInterface"), IR.string("prototype"));
    ownerNode.setJSType(proto);

    FunctionType fnType1 = registry.createFunctionType(getNative(VOID_TYPE));
    FunctionType fnType2 = registry.createFunctionType(getNative(NUMBER_TYPE));

    Node assignNode = IR.assign(IR.getprop(ownerNode, IR.string("fn")), IR.function(IR.name(""), IR.paramList(), IR.block()));

    boolean result = validator.expectCanAssignToPropertyOf(
        traversal, assignNode, fnType1, fnType2, ownerNode, "fn");

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectCanAssignTo_givenSubtype_shouldReturnTrue() {
    Node node = IR.number(5);
    boolean result = validator.expectCanAssignTo(traversal, node, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE), "assign");

    Assert.assertTrue(result);
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectCanAssignTo_givenIncompatibleTypes_shouldReturnFalseAndReport() {
    Node node = IR.string("abc");
    boolean result = validator.expectCanAssignTo(traversal, node, getNative(STRING_TYPE), getNative(NUMBER_TYPE), "assign error");

    Assert.assertFalse(result);
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectArgumentMatchesParameter_givenSubtype_shouldNotReport() {
    Node callNode = IR.call(IR.name("fn"), IR.number(1));
    Node argNode = callNode.getLastChild();

    validator.expectArgumentMatchesParameter(traversal, argNode, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE), callNode, 1);

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectArgumentMatchesParameter_givenIncompatibleType_shouldReportMismatch() {
    Node callNode = IR.call(IR.name("fn"), IR.string("foo"));
    Node argNode = callNode.getLastChild();

    validator.expectArgumentMatchesParameter(traversal, argNode, getNative(STRING_TYPE), getNative(NUMBER_TYPE), callNode, 1);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectCanOverride_givenSubtype_shouldNotReport() {
    Node node = IR.name("prop");
    validator.expectCanOverride(traversal, node, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE), "x", getNative(OBJECT_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectCanOverride_givenIncompatibleType_shouldReportWarning() {
    Node node = IR.name("prop");
    validator.expectCanOverride(traversal, node, getNative(STRING_TYPE), getNative(NUMBER_TYPE), "x", getNative(OBJECT_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.HIDDEN_PROPERTY_MISMATCH, compiler.getWarnings()[0].getType());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectSuperType_givenEquivalentTypes_shouldNotReport() {
    Node node = IR.empty();
    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null, null);
    FunctionType superCtor = registry.createConstructorType("SuperClass", null, null, null, null);
    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());

    validator.expectSuperType(traversal, node, superCtor.getInstanceType(), subCtor.getInstanceType());

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectSuperType_missingExtendsTag_shouldReportWarning() {
    Node node = IR.empty();
    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null, null);
    FunctionType superCtor = registry.createConstructorType("SuperClass", null, null, null, null);

    validator.expectSuperType(traversal, node, superCtor.getInstanceType(), subCtor.getInstanceType());

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.MISSING_EXTENDS_TAG_WARNING, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectSuperType_mismatchInSuperClassDeclaration_shouldReportMismatch() {
    Node node = IR.empty();
    FunctionType base1 = registry.createConstructorType("Base1", null, null, null, null);
    FunctionType base2 = registry.createConstructorType("Base2", null, null, null, null);
    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null, null);

    subCtor.setPrototypeBasedOn(base1.getInstanceType());

    validator.expectSuperType(traversal, node, base2.getInstanceType(), subCtor.getInstanceType());

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.TYPE_MISMATCH_WARNING, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectCanCast_givenValidCast_shouldNotReport() {
    Node node = IR.empty();
    validator.expectCanCast(traversal, node, getNative(NUMBER_TYPE), getNative(NUMBER_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(0, countMismatches());
  }

  @Test
  public void expectCanCast_givenInvalidCast_shouldReportInvalidCastWarning() {
    Node node = IR.empty();
    validator.expectCanCast(traversal, node, getNative(NUMBER_TYPE), getNative(BOOLEAN_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.INVALID_CAST, compiler.getWarnings()[0].getType());
    Assert.assertEquals(1, countMismatches());
  }

  @Test
  public void expectUndeclaredVariable_varInputNullInVarParent_shouldRedeclareInScope() {
    Scope scope = Scope.createGlobalScope(IR.script());
    Node nameNode = IR.name("myVar");
    nameNode.setLineno(10);
    Node initVal = IR.number(42);
    nameNode.addChildToFront(initVal);
    Node parentVar = IR.var(nameNode);

    CompilerInput input = new CompilerInput(new JsAst(SourceFile.fromCode("input.js", "var myVar;")));
    Var origVar = scope.declare("myVar", nameNode, getNative(NUMBER_TYPE), null, false);

    Var result = validator.expectUndeclaredVariable("input.js", input, nameNode, parentVar, origVar, "myVar", getNative(NUMBER_TYPE));

    Assert.assertNotNull(result);
    Assert.assertEquals(input, result.input);
    Assert.assertEquals(getNative(NUMBER_TYPE), nameNode.getJSType());
    Assert.assertEquals(getNative(NUMBER_TYPE), initVal.getJSType());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectUndeclaredVariable_varInputNullInFunctionParent_shouldRedeclareAndSetFunctionType() {
    Scope scope = Scope.createGlobalScope(IR.script());
    Node fnName = IR.name("fn");
    fnName.setLineno(5);
    Node fnNode = IR.function(fnName, IR.paramList(), IR.block());

    CompilerInput input = new CompilerInput(new JsAst(SourceFile.fromCode("fn.js", "function fn() {}")));
    Var origVar = scope.declare("fn", fnName, getNative(NUMBER_TYPE), null, false);

    Var result = validator.expectUndeclaredVariable("fn.js", input, fnName, fnNode, origVar, "fn", getNative(NUMBER_TYPE));

    Assert.assertNotNull(result);
    Assert.assertEquals(input, result.input);
    Assert.assertEquals(getNative(NUMBER_TYPE), fnNode.getJSType());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectUndeclaredVariable_duplicateWithDifferentType_shouldReportDupVarWarning() {
    Scope scope = Scope.createGlobalScope(IR.script());
    Node origName = IR.name("x");
    origName.setLineno(1);
    Node origVarNode = IR.var(origName);
    CompilerInput input1 = new CompilerInput(new JsAst(SourceFile.fromCode("orig.js", "var x;")));
    Var origVar = scope.declare("x", origName, getNative(NUMBER_TYPE), input1, false);

    Node newName = IR.name("x");
    newName.setLineno(2);
    Node newVarNode = IR.var(newName);
    CompilerInput input2 = new CompilerInput(new JsAst(SourceFile.fromCode("new.js", "var x;")));

    validator.expectUndeclaredVariable("new.js", input2, newName, newVarNode, origVar, "x", getNative(STRING_TYPE));

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.DUP_VAR_DECLARATION, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectUndeclaredVariable_duplicateWithSuppression_shouldNotReportWarning() {
    Scope scope = Scope.createGlobalScope(IR.script());
    Node origName = IR.name("y");
    origName.setLineno(1);
    CompilerInput input1 = new CompilerInput(new JsAst(SourceFile.fromCode("orig.js", "var y;")));
    Var origVar = scope.declare("y", origName, getNative(NUMBER_TYPE), input1, false);

    Node newProp = IR.getprop(IR.name("obj"), IR.string("y"));
    newProp.setLineno(5);
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordSuppression("duplicate");
    newProp.setJSDocInfo(docBuilder.build(newProp));

    Node exprResult = IR.exprResult(newProp);
    CompilerInput input2 = new CompilerInput(new JsAst(SourceFile.fromCode("new.js", "obj.y;")));

    validator.expectUndeclaredVariable("new.js", input2, newProp, exprResult, origVar, "y", getNative(NUMBER_TYPE));

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectAllInterfaceProperties_whenInterfaceImplementedCorrectly_shouldNotReport() {
    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    iface.getPrototype().defineDeclaredProperty("foo", getNative(NUMBER_TYPE), null);

    FunctionType impl = registry.createConstructorType("MyClass", null, null, null, null);
    impl.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));
    impl.getPrototype().defineDeclaredProperty("foo", getNative(NUMBER_TYPE), null);

    Node node = IR.empty();
    validator.expectAllInterfaceProperties(traversal, node, impl);

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void expectAllInterfaceProperties_whenPropertyMissing_shouldReportInterfaceMethodNotImplemented() {
    FunctionType iface = registry.createInterfaceType("MyInterface2", null);
    iface.getPrototype().defineDeclaredProperty("missingProp", getNative(NUMBER_TYPE), null);

    FunctionType impl = registry.createConstructorType("MyClass2", null, null, null, null);
    impl.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    Node node = IR.empty();
    node.setSourceFileName("test.js");
    validator.expectAllInterfaceProperties(traversal, node, impl);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED, compiler.getWarnings()[0].getType());
  }

  @Test
  public void expectAllInterfaceProperties_whenPropertyTypeMismatch_shouldReportHiddenInterfacePropertyMismatch() {
    FunctionType iface = registry.createInterfaceType("MyInterface3", null);
    iface.getPrototype().defineDeclaredProperty("bar", getNative(NUMBER_TYPE), null);

    FunctionType impl = registry.createConstructorType("MyClass3", null, null, null, null);
    impl.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));
    impl.getPrototype().defineDeclaredProperty("bar", getNative(STRING_TYPE), null);

    Node node = IR.empty();
    validator.expectAllInterfaceProperties(traversal, node, impl);

    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH, compiler.getWarnings()[0].getType());
  }

  @Test
  public void getReadableJSTypeName_givenGetPropNode_shouldReturnObjectDotProp() {
    Node target = IR.name("instance");
    target.setJSType(getNative(OBJECT_TYPE));
    Node prop = IR.string("myProp");
    Node getPropNode = IR.getprop(target, prop);

    String name = validator.getReadableJSTypeName(getPropNode, false);

    Assert.assertEquals("Object.myProp", name);
  }

  @Test
  public void getReadableJSTypeName_givenQualifiedNameNode_shouldReturnQualifiedName() {
    Node node = IR.name("myVariable");

    String name = validator.getReadableJSTypeName(node, false);

    Assert.assertEquals("myVariable", name);
  }

  @Test
  public void getReadableJSTypeName_givenAnonymousFunctionNode_shouldReturnFunction() {
    Node node = IR.function(IR.name(""), IR.paramList(), IR.block());
    node.setJSType(registry.createFunctionType(getNative(VOID_TYPE)));

    String name = validator.getReadableJSTypeName(node, false);

    Assert.assertEquals("function", name);
  }

  @Test
  public void getReadableJSTypeName_givenDereferenceTrue_shouldDereference() {
    Node node = IR.number(5);
    node.setJSType(getNative(NUMBER_TYPE));

    String name = validator.getReadableJSTypeName(node, true);

    Assert.assertEquals("Number", name);
  }

  @Test
  public void typeMismatch_equalsHashCodeAndToString_shouldWorkProperly() {
    JSError error = JSError.make("test.js", 1, 1, TypeValidator.TYPE_MISMATCH_WARNING, "err");
    TypeValidator.TypeMismatch tm1 = new TypeValidator.TypeMismatch(getNative(NUMBER_TYPE), getNative(STRING_TYPE), error);
    TypeValidator.TypeMismatch tm2 = new TypeValidator.TypeMismatch(getNative(STRING_TYPE), getNative(NUMBER_TYPE), error);
    TypeValidator.TypeMismatch tm3 = new TypeValidator.TypeMismatch(getNative(NUMBER_TYPE), getNative(BOOLEAN_TYPE), error);

    Assert.assertTrue(tm1.equals(tm2));
    Assert.assertTrue(tm2.equals(tm1));
    Assert.assertFalse(tm1.equals(tm3));
    Assert.assertFalse(tm1.equals(null));
    Assert.assertFalse(tm1.equals("different object type"));

    Assert.assertEquals(tm1.hashCode(), tm2.hashCode());
    Assert.assertEquals("(number, string)", tm1.toString());
  }

  @Test
  public void registerMismatch_givenFunctionTypesWithMismatchedParamsAndReturn_shouldRegisterRecursiveMismatches() {
    FunctionType fnA = registry.createFunctionType(getNative(STRING_TYPE), getNative(NUMBER_TYPE));
    FunctionType fnB = registry.createFunctionType(getNative(BOOLEAN_TYPE), getNative(STRING_TYPE));

    Node node = IR.empty();
    validator.expectCanAssignTo(traversal, node, fnA, fnB, "fn assign");

    Assert.assertTrue(countMismatches() >= 2);
  }
}