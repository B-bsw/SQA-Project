package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NodeUtilTest {

  private static class DummyCodingConvention extends CodingConventions.Proxy {
    public DummyCodingConvention() {
      super(CodingConventions.getDefault());
    }

    @Override
    public boolean isConstant(String name) {
      return name != null && name.startsWith("CONST_");
    }

    @Override
    public boolean isConstantKey(String key) {
      return key != null && key.endsWith("_KEY");
    }
  }

  @Test
  public void getImpureBooleanValue_givenLiteralAndPureNodes_shouldReturnExpectedTernaryValue() {
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.string("hello")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.string("")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.number(1.0)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.number(0.0)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(IR.trueNode()));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.falseNode()));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(IR.nullNode()));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(new Node(Token.ARRAYLIT)));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(new Node(Token.OBJECTLIT)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(new Node(Token.VOID, IR.number(0))));

    Node assignNode = IR.assign(IR.name("a"), IR.number(1.0));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(assignNode));

    Node commaNode = IR.comma(IR.name("a"), IR.falseNode());
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(commaNode));

    Node notNode = IR.not(IR.trueNode());
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(notNode));

    Node andNode = IR.and(IR.trueNode(), IR.number(0.0));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andNode));

    Node orNode = IR.or(IR.falseNode(), IR.string("test"));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));

    Node hookMatching = IR.hook(IR.name("cond"), IR.trueNode(), IR.trueNode());
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(hookMatching));

    Node hookMismatch = IR.hook(IR.name("cond"), IR.trueNode(), IR.falseNode());
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getImpureBooleanValue(hookMismatch));
  }

  @Test
  public void getPureBooleanValue_givenVariousNodes_shouldEvaluatePurityCorrectly() {
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("undefined")));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.name("NaN")));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(IR.name("Infinity")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.name("otherName")));

    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(new Node(Token.REGEXP)));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(IR.voidNode(IR.number(0))));

    Node impureVoid = IR.voidNode(IR.call(IR.name("func")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(impureVoid));

    Node pureArray = new Node(Token.ARRAYLIT);
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(pureArray));

    Node impureArray = new Node(Token.ARRAYLIT, IR.call(IR.name("foo")));
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(impureArray));

    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getPureBooleanValue(IR.getprop(IR.name("a"), IR.string("b"))));
  }

  @Test
  public void getStringValue_givenPrimitivesAndExpressions_shouldReturnStandardRepresentation() {
    Assert.assertEquals("foo", NodeUtil.getStringValue(IR.string("foo")));
    Assert.assertEquals("key", NodeUtil.getStringValue(IR.stringKey("key")));
    Assert.assertEquals("undefined", NodeUtil.getStringValue(IR.name("undefined")));
    Assert.assertEquals("Infinity", NodeUtil.getStringValue(IR.name("Infinity")));
    Assert.assertEquals("NaN", NodeUtil.getStringValue(IR.name("NaN")));
    Assert.assertNull(NodeUtil.getStringValue(IR.name("custom")));

    Assert.assertEquals("42", NodeUtil.getStringValue(IR.number(42.0)));
    Assert.assertEquals("42.5", NodeUtil.getStringValue(IR.number(42.5)));
    Assert.assertEquals("false", NodeUtil.getStringValue(IR.falseNode()));
    Assert.assertEquals("true", NodeUtil.getStringValue(IR.trueNode()));
    Assert.assertEquals("null", NodeUtil.getStringValue(IR.nullNode()));
    Assert.assertEquals("undefined", NodeUtil.getStringValue(IR.voidNode(IR.number(0))));
    Assert.assertEquals("[object Object]", NodeUtil.getStringValue(new Node(Token.OBJECTLIT)));

    Node notTrue = IR.not(IR.trueNode());
    Assert.assertEquals("false", NodeUtil.getStringValue(notTrue));
    Node notFalse = IR.not(IR.falseNode());
    Assert.assertEquals("true", NodeUtil.getStringValue(notFalse));

    Node notUnknown = IR.not(IR.name("unknownVar"));
    Assert.assertNull(NodeUtil.getStringValue(notUnknown));

    Node array = new Node(Token.ARRAYLIT, IR.number(1), IR.string("two"));
    Assert.assertEquals("1,two", NodeUtil.getStringValue(array));

    Node arrayWithHoleAndNull = new Node(Token.ARRAYLIT, IR.empty(), IR.nullNode(), IR.voidNode(IR.number(0)));
    Assert.assertEquals(",,", NodeUtil.getStringValue(arrayWithHoleAndNull));

    Node arrayWithUnknown = new Node(Token.ARRAYLIT, IR.name("unknown"));
    Assert.assertNull(NodeUtil.getStringValue(arrayWithUnknown));
  }

  @Test
  public void getNumberValue_givenVariousNodes_shouldParseCorrectDouble() {
    Assert.assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(IR.trueNode()));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.falseNode()));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(IR.nullNode()));
    Assert.assertEquals(Double.valueOf(10.5), NodeUtil.getNumberValue(IR.number(10.5)));

    Assert.assertTrue(Double.isNaN(NodeUtil.getNumberValue(IR.voidNode(IR.number(0))).doubleValue()));
    Assert.assertNull(NodeUtil.getNumberValue(IR.voidNode(IR.call(IR.name("call")))));

    Assert.assertTrue(Double.isNaN(NodeUtil.getNumberValue(IR.name("undefined")).doubleValue()));
    Assert.assertTrue(Double.isNaN(NodeUtil.getNumberValue(IR.name("NaN")).doubleValue()));
    Assert.assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getNumberValue(IR.name("Infinity")));
    Assert.assertNull(NodeUtil.getNumberValue(IR.name("other")));

    Node negInfinity = IR.neg(IR.name("Infinity"));
    Assert.assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), NodeUtil.getNumberValue(negInfinity));
    Assert.assertNull(NodeUtil.getNumberValue(IR.neg(IR.name("foo"))));

    Node notTrue = IR.not(IR.trueNode());
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getNumberValue(notTrue));
    Node notFalse = IR.not(IR.falseNode());
    Assert.assertEquals(Double.valueOf(1.0), NodeUtil.getNumberValue(notFalse));
    Assert.assertNull(NodeUtil.getNumberValue(IR.not(IR.name("x"))));

    Assert.assertEquals(Double.valueOf(123.0), NodeUtil.getNumberValue(IR.string("123")));

    Node arrayLit = new Node(Token.ARRAYLIT, IR.string("456"));
    Assert.assertEquals(Double.valueOf(456.0), NodeUtil.getNumberValue(arrayLit));

    Node arrayLitUnknown = new Node(Token.ARRAYLIT, IR.name("x"));
    Assert.assertNull(NodeUtil.getNumberValue(arrayLitUnknown));
  }

  @Test
  public void getStringNumberValue_givenJsStrings_shouldConvertExpectedDoubles() {
    Assert.assertNull(NodeUtil.getStringNumberValue("hello\u000Bworld"));
    Assert.assertEquals(Double.valueOf(0.0), NodeUtil.getStringNumberValue("   "));
    Assert.assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    Assert.assertEquals(Double.valueOf(16.0), NodeUtil.getStringNumberValue("0x10"));
    Assert.assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("0xZZZ").doubleValue()));
    Assert.assertNull(NodeUtil.getStringNumberValue("+0x10"));
    Assert.assertNull(NodeUtil.getStringNumberValue("-0x10"));
    Assert.assertNull(NodeUtil.getStringNumberValue("infinity"));
    Assert.assertNull(NodeUtil.getStringNumberValue("-infinity"));
    Assert.assertNull(NodeUtil.getStringNumberValue("+infinity"));
    Assert.assertEquals(Double.valueOf(123.45), NodeUtil.getStringNumberValue(" 123.45  "));
    Assert.assertTrue(Double.isNaN(NodeUtil.getStringNumberValue("invalid_number").doubleValue()));
  }

  @Test
  public void isStrWhiteSpaceChar_givenVariousChars_shouldClassifyCorrectly() {
    Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\n'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\r'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\t'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u00A0'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u000C'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2028'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2029'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    Assert.assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar('\u2000'));
    Assert.assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('a'));
  }

  @Test
  public void getFunctionName_andNearestFunctionName_givenNodes_shouldReturnExpectedNames() {
    Node fn = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    Assert.assertEquals("foo", NodeUtil.getFunctionName(fn));
    Assert.assertEquals("foo", NodeUtil.getNearestFunctionName(fn));

    Node varName = IR.name("bar");
    Node anonFn = IR.function(IR.name(""), IR.paramList(), IR.block());
    varName.addChildToBack(anonFn);
    Node varNode = IR.var(varName);
    Assert.assertEquals("bar", NodeUtil.getFunctionName(anonFn));

    Node assign = IR.assign(IR.name("baz"), anonFn.cloneTree());
    Assert.assertEquals("baz", NodeUtil.getFunctionName(assign.getLastChild()));

    Node objKey = IR.stringKey("propKey", anonFn.cloneTree());
    Assert.assertEquals("propKey", NodeUtil.getNearestFunctionName(objKey.getFirstChild()));

    Node getter = new Node(Token.GETTER_DEF, anonFn.cloneTree());
    getter.setString("getterProp");
    Assert.assertEquals("getterProp", NodeUtil.getNearestFunctionName(getter.getFirstChild()));

    Node setter = new Node(Token.SETTER_DEF, anonFn.cloneTree());
    setter.setString("setterProp");
    Assert.assertEquals("setterProp", NodeUtil.getNearestFunctionName(setter.getFirstChild()));

    Node numProp = IR.number(12.0);
    numProp.addChildToBack(anonFn.cloneTree());
    Assert.assertEquals("12", NodeUtil.getNearestFunctionName(numProp.getFirstChild()));

    Assert.assertNull(NodeUtil.getNearestFunctionName(IR.number(1.0)));
  }

  @Test
  public void isImmutableValue_givenVariousNodes_shouldReturnExpectedBoolean() {
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.string("str")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.number(1.0)));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.nullNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.trueNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.falseNode()));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.not(IR.trueNode())));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.neg(IR.number(5))));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("undefined")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("Infinity")));
    Assert.assertTrue(NodeUtil.isImmutableValue(IR.name("NaN")));
    Assert.assertFalse(NodeUtil.isImmutableValue(IR.name("other")));
    Assert.assertFalse(NodeUtil.isImmutableValue(IR.call(IR.name("fn"))));
  }

  @Test
  public void operators_symmetricAndRelationalAndInverse_shouldMatchDefinitions() {
    Assert.assertTrue(NodeUtil.isSymmetricOperation(new Node(Token.EQ)));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(new Node(Token.NE)));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(new Node(Token.SHEQ)));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(new Node(Token.SHNE)));
    Assert.assertTrue(NodeUtil.isSymmetricOperation(new Node(Token.MUL)));
    Assert.assertFalse(NodeUtil.isSymmetricOperation(new Node(Token.ADD)));

    Assert.assertTrue(NodeUtil.isRelationalOperation(new Node(Token.GT)));
    Assert.assertTrue(NodeUtil.isRelationalOperation(new Node(Token.GE)));
    Assert.assertTrue(NodeUtil.isRelationalOperation(new Node(Token.LT)));
    Assert.assertTrue(NodeUtil.isRelationalOperation(new Node(Token.LE)));
    Assert.assertFalse(NodeUtil.isRelationalOperation(new Node(Token.EQ)));

    Assert.assertEquals(Token.LT, NodeUtil.getInverseOperator(Token.GT));
    Assert.assertEquals(Token.GT, NodeUtil.getInverseOperator(Token.LT));
    Assert.assertEquals(Token.LE, NodeUtil.getInverseOperator(Token.GE));
    Assert.assertEquals(Token.GE, NodeUtil.getInverseOperator(Token.LE));
    Assert.assertEquals(Token.ERROR, NodeUtil.getInverseOperator(Token.EQ));
  }

  @Test
  public void isLiteralValue_givenLiteralsAndExpressions_shouldEvaluateCorrectly() {
    Node array = new Node(Token.ARRAYLIT, IR.number(1), IR.empty(), IR.string("x"));
    Assert.assertTrue(NodeUtil.isLiteralValue(array, true));

    Node badArray = new Node(Token.ARRAYLIT, IR.name("variable"));
    Assert.assertFalse(NodeUtil.isLiteralValue(badArray, true));

    Node regexp = new Node(Token.REGEXP, IR.string("pattern"), IR.string("g"));
    Assert.assertTrue(NodeUtil.isLiteralValue(regexp, true));

    Node badRegexp = new Node(Token.REGEXP, IR.name("varPat"));
    Assert.assertFalse(NodeUtil.isLiteralValue(badRegexp, true));

    Node objLit = new Node(Token.OBJECTLIT, IR.stringKey("k", IR.number(1)));
    Assert.assertTrue(NodeUtil.isLiteralValue(objLit, true));

    Node badObjLit = new Node(Token.OBJECTLIT, IR.stringKey("k", IR.name("varVal")));
    Assert.assertFalse(NodeUtil.isLiteralValue(badObjLit, true));

    Node fnDecl = IR.function(IR.name("f"), IR.paramList(), IR.block());
    IR.script(fnDecl);
    Assert.assertFalse(NodeUtil.isLiteralValue(fnDecl, true));

    Node fnExpr = IR.function(IR.name(""), IR.paramList(), IR.block());
    Assert.assertTrue(NodeUtil.isLiteralValue(fnExpr, true));
    Assert.assertFalse(NodeUtil.isLiteralValue(fnExpr, false));
  }

  @Test
  public void isValidDefineValue_givenDefinesSet_shouldValidateRecursively() {
    Set<String> defines = new HashSet<String>();
    defines.add("DEF_A");
    defines.add("a.b.c");

    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.string("s"), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.number(1), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.trueNode(), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.falseNode(), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.add(IR.number(1), IR.number(2)), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.not(IR.trueNode()), defines));
    Assert.assertTrue(NodeUtil.isValidDefineValue(IR.name("DEF_A"), defines));

    Node getprop = IR.getprop(IR.getprop(IR.name("a"), IR.string("b")), IR.string("c"));
    Assert.assertTrue(NodeUtil.isValidDefineValue(getprop, defines));

    Assert.assertFalse(NodeUtil.isValidDefineValue(IR.name("NOT_DEF"), defines));
    Assert.assertFalse(NodeUtil.isValidDefineValue(IR.call(IR.name("call")), defines));
  }

  @Test
  public void isEmptyBlock_givenBlockNodes_shouldVerifyEmptiness() {
    Assert.assertFalse(NodeUtil.isEmptyBlock(IR.empty()));
    Assert.assertTrue(NodeUtil.isEmptyBlock(IR.block()));
    Assert.assertTrue(NodeUtil.isEmptyBlock(IR.block(IR.empty(), IR.empty())));
    Assert.assertFalse(NodeUtil.isEmptyBlock(IR.block(IR.exprResult(IR.number(1)))));
  }

  @Test
  public void isSimpleOperator_givenOperatorTokens_shouldMatch() {
    Assert.assertTrue(NodeUtil.isSimpleOperator(new Node(Token.ADD)));
    Assert.assertTrue(NodeUtil.isSimpleOperator(new Node(Token.BITNOT)));
    Assert.assertTrue(NodeUtil.isSimpleOperator(new Node(Token.COMMA)));
    Assert.assertTrue(NodeUtil.isSimpleOperator(new Node(Token.VOID)));
    Assert.assertFalse(NodeUtil.isSimpleOperator(new Node(Token.CALL)));
  }

  @Test
  public void newExpr_givenChild_shouldWrapInExprResult() {
    Node child = IR.number(1);
    child.setLineno(10);
    child.setCharno(5);
    Node expr = NodeUtil.newExpr(child);
    Assert.assertTrue(expr.isExprResult());
    Assert.assertSame(child, expr.getFirstChild());
    Assert.assertEquals(10, expr.getLineno());
  }

  @Test
  public void mayHaveSideEffects_andMayEffectMutableState_shouldCheckStateChanges() {
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(IR.number(1)));
    Assert.assertFalse(NodeUtil.mayEffectMutableState(IR.number(1)));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(new Node(Token.THROW, IR.string("err"))));

    Node objLit = new Node(Token.OBJECTLIT, IR.stringKey("a", IR.number(1)));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(objLit));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(objLit));

    Node objLitImpure = new Node(Token.OBJECTLIT, IR.stringKey("a", IR.call(IR.name("sideEffect"))));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(objLitImpure));

    Assert.assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.ARRAYLIT)));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(new Node(Token.ARRAYLIT)));

    Node varNode = IR.var(IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(varNode));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(new Node(Token.VAR)));

    Node nameWithChild = IR.name("y");
    nameWithChild.addChildToBack(IR.number(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(nameWithChild));

    Node fnExpr = IR.function(IR.name(""), IR.paramList(), IR.block());
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(fnExpr));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(fnExpr));

    Node newArray = new Node(Token.NEW, IR.name("Array"));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newArray));
    Assert.assertTrue(NodeUtil.mayEffectMutableState(newArray));

    Node newCustom = new Node(Token.NEW, IR.name("CustomClass"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(newCustom));

    Node newNoSideEffects = new Node(Token.NEW, IR.name("CustomClass"));
    newNoSideEffects.setSideEffectFlags(Node.NO_SIDE_EFFECTS);
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(newNoSideEffects));

    Node callBuiltin = IR.call(IR.name("String"), IR.number(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callBuiltin));

    Node callMethodToString = IR.call(IR.getprop(IR.name("obj"), IR.string("toString")));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callMethodToString));

    Node callMathFloor = IR.call(IR.getprop(IR.name("Math"), IR.string("floor")), IR.number(1.5));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(callMathFloor));

    Node callCustom = IR.call(IR.name("foo"));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(callCustom));

    Node assignName = IR.assign(IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.mayHaveSideEffects(assignName));

    Node assignToLocalGet = IR.assign(IR.getprop(new Node(Token.OBJECTLIT), IR.string("prop")), IR.number(1));
    Assert.assertFalse(NodeUtil.mayHaveSideEffects(assignToLocalGet));
  }

  @Test(expected = IllegalStateException.class)
  public void constructorCallHasSideEffects_givenNonNewNode_shouldThrowException() {
    NodeUtil.constructorCallHasSideEffects(IR.call(IR.name("foo")));
  }

  @Test(expected = IllegalStateException.class)
  public void functionCallHasSideEffects_givenNonCallNode_shouldThrowException() {
    NodeUtil.functionCallHasSideEffects(new Node(Token.NEW, IR.name("foo")));
  }

  @Test
  public void nodeTypeMayHaveSideEffects_andCanBeSideEffected_shouldEvaluateCorrectly() {
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DELPROP, IR.name("x"))));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.DEC, IR.name("x"))));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.INC, IR.name("x"))));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(new Node(Token.THROW, IR.name("x"))));

    Node nameWithChild = IR.name("x");
    nameWithChild.addChildToBack(IR.number(1));
    Assert.assertTrue(NodeUtil.nodeTypeMayHaveSideEffects(nameWithChild));
    Assert.assertFalse(NodeUtil.nodeTypeMayHaveSideEffects(IR.name("x")));

    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.call(IR.name("f"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(new Node(Token.NEW, IR.name("F"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.getprop(IR.name("a"), IR.string("b"))));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.getelem(IR.name("a"), IR.number(0))));

    Node constName = IR.name("CONST_VAL");
    constName.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    Assert.assertFalse(NodeUtil.canBeSideEffected(constName));

    Set<String> knownConsts = new HashSet<String>();
    knownConsts.add("KNOWN_CONST");
    Assert.assertFalse(NodeUtil.canBeSideEffected(IR.name("KNOWN_CONST"), knownConsts));
    Assert.assertTrue(NodeUtil.canBeSideEffected(IR.name("UNKNOWN_VAR"), knownConsts));
  }

  @Test
  public void precedence_givenTokens_shouldReturnExactHierarchy() {
    Assert.assertEquals(0, NodeUtil.precedence(Token.COMMA));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN));
    Assert.assertEquals(1, NodeUtil.precedence(Token.ASSIGN_ADD));
    Assert.assertEquals(2, NodeUtil.precedence(Token.HOOK));
    Assert.assertEquals(3, NodeUtil.precedence(Token.OR));
    Assert.assertEquals(4, NodeUtil.precedence(Token.AND));
    Assert.assertEquals(5, NodeUtil.precedence(Token.BITOR));
    Assert.assertEquals(6, NodeUtil.precedence(Token.BITXOR));
    Assert.assertEquals(7, NodeUtil.precedence(Token.BITAND));
    Assert.assertEquals(8, NodeUtil.precedence(Token.EQ));
    Assert.assertEquals(9, NodeUtil.precedence(Token.LT));
    Assert.assertEquals(10, NodeUtil.precedence(Token.LSH));
    Assert.assertEquals(11, NodeUtil.precedence(Token.ADD));
    Assert.assertEquals(12, NodeUtil.precedence(Token.MUL));
    Assert.assertEquals(13, NodeUtil.precedence(Token.NOT));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NAME));
    Assert.assertEquals(15, NodeUtil.precedence(Token.NUMBER));
  }

  @Test(expected = Error.class)
  public void precedence_givenInvalidToken_shouldThrowError() {
    NodeUtil.precedence(Token.ERROR);
  }

  @Test
  public void isUndefined_andIsNullOrUndefined_shouldDetectCorrectly() {
    Assert.assertTrue(NodeUtil.isUndefined(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.isUndefined(IR.name("undefined")));
    Assert.assertFalse(NodeUtil.isUndefined(IR.nullNode()));

    Assert.assertTrue(NodeUtil.isNullOrUndefined(IR.nullNode()));
    Assert.assertTrue(NodeUtil.isNullOrUndefined(IR.voidNode(IR.number(0))));
    Assert.assertTrue(NodeUtil.isNullOrUndefined(IR.name("undefined")));
    Assert.assertFalse(NodeUtil.isNullOrUndefined(IR.number(0)));
  }

  @Test
  public void predicateMatching_allResultsMatch_andAnyResultsMatch_shouldEvaluateTrees() {
    Predicate<Node> isNumber = new Predicate<Node>() {
      @Override
      public boolean apply(Node input) {
        return input.isNumber();
      }
    };

    Node hookBothNum = IR.hook(IR.name("c"), IR.number(1), IR.number(2));
    Assert.assertTrue(NodeUtil.allResultsMatch(hookBothNum, isNumber));
    Assert.assertTrue(NodeUtil.anyResultsMatch(hookBothNum, isNumber));

    Node hookOneNum = IR.hook(IR.name("c"), IR.number(1), IR.string("str"));
    Assert.assertFalse(NodeUtil.allResultsMatch(hookOneNum, isNumber));
    Assert.assertTrue(NodeUtil.anyResultsMatch(hookOneNum, isNumber));

    Node assignNode = IR.assign(IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.allResultsMatch(assignNode, isNumber));

    Node commaNode = IR.comma(IR.string("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.allResultsMatch(commaNode, isNumber));

    Node andNode = IR.and(IR.number(1), IR.number(2));
    Assert.assertTrue(NodeUtil.allResultsMatch(andNode, isNumber));

    Node orNode = IR.or(IR.string("x"), IR.string("y"));
    Assert.assertFalse(NodeUtil.anyResultsMatch(orNode, isNumber));
  }

  @Test
  public void isNumericResult_isBooleanResult_mayBeString_shouldClassifyTypes() {
    Assert.assertTrue(NodeUtil.isNumericResult(IR.add(IR.number(1), IR.number(2))));
    Assert.assertFalse(NodeUtil.isNumericResult(IR.add(IR.number(1), IR.string("2"))));
    Assert.assertTrue(NodeUtil.isNumericResult(IR.name("NaN")));
    Assert.assertTrue(NodeUtil.isNumericResult(IR.name("Infinity")));
    Assert.assertFalse(NodeUtil.isNumericResult(IR.name("other")));
    Assert.assertTrue(NodeUtil.isNumericResult(new Node(Token.BITNOT, IR.number(1))));

    Assert.assertTrue(NodeUtil.isBooleanResult(IR.trueNode()));
    Assert.assertTrue(NodeUtil.isBooleanResult(IR.falseNode()));
    Assert.assertTrue(NodeUtil.isBooleanResult(new Node(Token.EQ, IR.number(1), IR.number(2))));
    Assert.assertTrue(NodeUtil.isBooleanResult(new Node(Token.INSTANCEOF, IR.name("a"), IR.name("b"))));
    Assert.assertFalse(NodeUtil.isBooleanResult(IR.number(1)));

    Assert.assertTrue(NodeUtil.mayBeString(IR.string("foo")));
    Assert.assertTrue(NodeUtil.mayBeString(IR.name("variable")));
    Assert.assertFalse(NodeUtil.mayBeString(IR.number(1)));
    Assert.assertFalse(NodeUtil.mayBeString(IR.trueNode()));
    Assert.assertFalse(NodeUtil.mayBeString(IR.nullNode()));
    Assert.assertFalse(NodeUtil.mayBeString(IR.voidNode(IR.number(0))));
  }

  @Test
  public void associativityAndCommutativity_shouldMatchSpec() {
    Assert.assertTrue(NodeUtil.isAssociative(Token.MUL));
    Assert.assertTrue(NodeUtil.isAssociative(Token.AND));
    Assert.assertTrue(NodeUtil.isAssociative(Token.OR));
    Assert.assertTrue(NodeUtil.isAssociative(Token.BITOR));
    Assert.assertFalse(NodeUtil.isAssociative(Token.SUB));

    Assert.assertTrue(NodeUtil.isCommutative(Token.MUL));
    Assert.assertTrue(NodeUtil.isCommutative(Token.BITAND));
    Assert.assertFalse(NodeUtil.isCommutative(Token.AND));
    Assert.assertFalse(NodeUtil.isCommutative(Token.SUB));
  }

  @Test
  public void assignmentOps_shouldRecognizeAndExtractOp() {
    Node assignAdd = new Node(Token.ASSIGN_ADD, IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.isAssignmentOp(assignAdd));
    Assert.assertEquals(Token.ADD, NodeUtil.getOpFromAssignmentOp(assignAdd));

    Node assignSub = new Node(Token.ASSIGN_SUB, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.SUB, NodeUtil.getOpFromAssignmentOp(assignSub));

    Node assignMul = new Node(Token.ASSIGN_MUL, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.MUL, NodeUtil.getOpFromAssignmentOp(assignMul));

    Node assignDiv = new Node(Token.ASSIGN_DIV, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.DIV, NodeUtil.getOpFromAssignmentOp(assignDiv));

    Node assignMod = new Node(Token.ASSIGN_MOD, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.MOD, NodeUtil.getOpFromAssignmentOp(assignMod));

    Node assignBitAnd = new Node(Token.ASSIGN_BITAND, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.BITAND, NodeUtil.getOpFromAssignmentOp(assignBitAnd));

    Node assignBitOr = new Node(Token.ASSIGN_BITOR, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.BITOR, NodeUtil.getOpFromAssignmentOp(assignBitOr));

    Node assignBitXor = new Node(Token.ASSIGN_BITXOR, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.BITXOR, NodeUtil.getOpFromAssignmentOp(assignBitXor));

    Node assignLsh = new Node(Token.ASSIGN_LSH, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.LSH, NodeUtil.getOpFromAssignmentOp(assignLsh));

    Node assignRsh = new Node(Token.ASSIGN_RSH, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.RSH, NodeUtil.getOpFromAssignmentOp(assignRsh));

    Node assignUrsh = new Node(Token.ASSIGN_URSH, IR.name("x"), IR.number(1));
    Assert.assertEquals(Token.URSH, NodeUtil.getOpFromAssignmentOp(assignUrsh));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getOpFromAssignmentOp_givenNonAssignmentOp_shouldThrowException() {
    NodeUtil.getOpFromAssignmentOp(IR.number(1));
  }

  @Test
  public void referencesThis_andContainsFunction_shouldInspectTree() {
    Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block(new Node(Token.THIS)));
    Assert.assertTrue(NodeUtil.referencesThis(fn));

    Node fnNoThis = IR.function(IR.name("f"), IR.paramList(), IR.block(IR.number(1)));
    Assert.assertFalse(NodeUtil.referencesThis(fnNoThis));

    Node outerWithInnerFn = IR.block(IR.function(IR.name("inner"), IR.paramList(), IR.block(new Node(Token.THIS))));
    Assert.assertFalse(NodeUtil.referencesThis(outerWithInnerFn));

    Assert.assertTrue(NodeUtil.containsFunction(outerWithInnerFn));
    Assert.assertFalse(NodeUtil.containsFunction(IR.block(IR.number(1))));
  }

  @Test
  public void getAssignedValue_andIsVarOrSimpleAssignLhs_shouldInspectAssignment() {
    Node varName = IR.name("x");
    Node varVal = IR.number(10);
    varName.addChildToBack(varVal);
    IR.var(varName);
    Assert.assertSame(varVal, NodeUtil.getAssignedValue(varName));
    Assert.assertTrue(NodeUtil.isVarDeclaration(varName));
    Assert.assertTrue(NodeUtil.isVarOrSimpleAssignLhs(varName, varName.getParent()));

    Node assignLhs = IR.name("y");
    Node assignRhs = IR.number(20);
    Node assign = IR.assign(assignLhs, assignRhs);
    Assert.assertSame(assignRhs, NodeUtil.getAssignedValue(assignLhs));
    Assert.assertTrue(NodeUtil.isVarOrSimpleAssignLhs(assignLhs, assign));
    Assert.assertFalse(NodeUtil.isVarOrSimpleAssignLhs(assignRhs, assign));

    Node standaloneName = IR.name("z");
    IR.exprResult(standaloneName);
    Assert.assertNull(NodeUtil.getAssignedValue(standaloneName));
  }

  @Test
  public void loopAndControlStructures_shouldBeIdentifiedCorrectly() {
    Node forNode = new Node(Token.FOR, IR.empty(), IR.empty(), IR.empty(), IR.block());
    Assert.assertTrue(NodeUtil.isLoopStructure(forNode));
    Assert.assertFalse(NodeUtil.isForIn(forNode));
    Assert.assertTrue(forNode.getLastChild() == NodeUtil.getLoopCodeBlock(forNode));

    Node forInNode = new Node(Token.FOR, IR.name("k"), IR.name("obj"), IR.block());
    Assert.assertTrue(NodeUtil.isForIn(forInNode));

    Node whileNode = new Node(Token.WHILE, IR.trueNode(), IR.block());
    Assert.assertTrue(NodeUtil.isLoopStructure(whileNode));
    Assert.assertTrue(whileNode.getLastChild() == NodeUtil.getLoopCodeBlock(whileNode));

    Node doNode = new Node(Token.DO, IR.block(), IR.trueNode());
    Assert.assertTrue(NodeUtil.isLoopStructure(doNode));
    Assert.assertTrue(doNode.getFirstChild() == NodeUtil.getLoopCodeBlock(doNode));

    Assert.assertNull(NodeUtil.getLoopCodeBlock(IR.number(1)));

    Node innerNode = IR.number(1);
    whileNode.getLastChild().addChildToBack(innerNode);
    Assert.assertTrue(NodeUtil.isWithinLoop(innerNode));

    Node outsideLoop = IR.number(1);
    Assert.assertFalse(NodeUtil.isWithinLoop(outsideLoop));

    Assert.assertTrue(NodeUtil.isControlStructure(new Node(Token.WITH, IR.name("x"), IR.block())));
    Assert.assertTrue(NodeUtil.isControlStructure(new Node(Token.IF, IR.trueNode(), IR.block())));
    Assert.assertTrue(NodeUtil.isControlStructure(new Node(Token.SWITCH, IR.name("s"))));
    Assert.assertFalse(NodeUtil.isControlStructure(IR.number(1)));

    Node ifNode = IR.ifNode(IR.trueNode(), IR.block(), IR.block());
    Assert.assertFalse(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getFirstChild()));
    Assert.assertTrue(NodeUtil.isControlStructureCodeBlock(ifNode, ifNode.getLastChild()));

    Assert.assertSame(ifNode.getFirstChild(), NodeUtil.getConditionExpression(ifNode));
    Assert.assertSame(whileNode.getFirstChild(), NodeUtil.getConditionExpression(whileNode));
    Assert.assertSame(doNode.getLastChild(), NodeUtil.getConditionExpression(doNode));
    Assert.assertSame(forNode.getFirstChild().getNext(), NodeUtil.getConditionExpression(forNode));
    Assert.assertNull(NodeUtil.getConditionExpression(forInNode));
    Assert.assertNull(NodeUtil.getConditionExpression(new Node(Token.CASE, IR.number(1), IR.block())));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getConditionExpression_givenNonConditionNode_shouldThrowException() {
    NodeUtil.getConditionExpression(IR.number(1));
  }

  @Test
  public void statementsAndBlocks_shouldBeDetectedCorrectly() {
    Node script = IR.script();
    Node block = IR.block();
    Assert.assertTrue(NodeUtil.isStatementBlock(script));
    Assert.assertTrue(NodeUtil.isStatementBlock(block));
    Assert.assertFalse(NodeUtil.isStatementBlock(IR.number(1)));

    Node stmt = IR.exprResult(IR.number(1));
    block.addChildToBack(stmt);
    Assert.assertTrue(NodeUtil.isStatement(stmt));

    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.CASE)));
    Assert.assertTrue(NodeUtil.isSwitchCase(new Node(Token.DEFAULT_CASE)));
    Assert.assertFalse(NodeUtil.isSwitchCase(new Node(Token.IF)));

    Assert.assertTrue(NodeUtil.isReferenceName(IR.name("valid")));
    Assert.assertFalse(NodeUtil.isReferenceName(IR.name("")));
    Assert.assertFalse(NodeUtil.isReferenceName(IR.number(1)));
  }

  @Test
  public void removeChild_andTryMergeBlock_shouldModifyASTCorrectly() {
    Node block = IR.block();
    Node stmt1 = IR.exprResult(IR.number(1));
    Node stmt2 = IR.exprResult(IR.number(2));
    block.addChildToBack(stmt1);
    block.addChildToBack(stmt2);

    NodeUtil.removeChild(block, stmt1);
    Assert.assertEquals(1, block.getChildCount());
    Assert.assertSame(stmt2, block.getFirstChild());

    Node rootBlock = IR.block();
    Node nestedBlock = IR.block(IR.exprResult(IR.string("nested")));
    rootBlock.addChildToBack(nestedBlock);

    boolean merged = NodeUtil.tryMergeBlock(nestedBlock);
    Assert.assertTrue(merged);
    Assert.assertEquals(1, rootBlock.getChildCount());
    Assert.assertTrue(rootBlock.getFirstChild().isExprResult());

    Node tryCatchFinally = IR.tryFinally(
        IR.block(),
        IR.catchNode(IR.name("e"), IR.block()),
        IR.block(IR.exprResult(IR.number(3)))
    );
    Node finallyBlock = tryCatchFinally.getLastChild();
    Assert.assertTrue(NodeUtil.isTryFinallyNode(tryCatchFinally, finallyBlock));
    NodeUtil.removeChild(tryCatchFinally, finallyBlock);
    Assert.assertEquals(2, tryCatchFinally.getChildCount());

    Node multiVar = IR.var(IR.name("a"), IR.name("b"));
    NodeUtil.removeChild(multiVar, multiVar.getFirstChild());
    Assert.assertEquals(1, multiVar.getChildCount());
  }

  @Test
  public void maybeAddFinally_shouldAddFinallyBlockIfNotPresent() {
    Node tryNode = IR.tryCatch(IR.block(), IR.catchNode(IR.name("e"), IR.block()));
    Assert.assertFalse(NodeUtil.hasFinally(tryNode));
    NodeUtil.maybeAddFinally(tryNode);
    Assert.assertTrue(NodeUtil.hasFinally(tryNode));
    Assert.assertTrue(tryNode.getLastChild().isBlock());
  }

  @Test
  public void functions_declarationsExpressionsBleedingAndVarArgs_shouldBeClassified() {
    Node fnDecl = IR.function(IR.name("f"), IR.paramList(), IR.block());
    Node script = IR.script(fnDecl);
    Assert.assertTrue(NodeUtil.isFunctionDeclaration(fnDecl));
    Assert.assertTrue(NodeUtil.isHoistedFunctionDeclaration(fnDecl));
    Assert.assertFalse(NodeUtil.isFunctionExpression(fnDecl));

    Node fnExpr = IR.function(IR.name("g"), IR.paramList(), IR.block());
    Node assign = IR.assign(IR.name("x"), fnExpr);
    script.addChildToBack(IR.exprResult(assign));
    Assert.assertFalse(NodeUtil.isFunctionDeclaration(fnExpr));
    Assert.assertTrue(NodeUtil.isFunctionExpression(fnExpr));
    Assert.assertTrue(NodeUtil.isBleedingFunctionName(fnExpr.getFirstChild()));
    Assert.assertTrue(NodeUtil.isEmptyFunctionExpression(fnExpr));

    Node fnWithArgs = IR.function(IR.name("h"), IR.paramList(), IR.block(IR.exprResult(IR.name("arguments"))));
    Assert.assertTrue(NodeUtil.isVarArgsFunction(fnWithArgs));

    Node callMethod = IR.call(IR.getprop(IR.name("fn"), IR.string("call")), IR.nullNode());
    Assert.assertTrue(NodeUtil.isFunctionObjectCall(callMethod));
    Assert.assertFalse(NodeUtil.isFunctionObjectApply(callMethod));

    Node applyMethod = IR.call(IR.getprop(IR.name("fn"), IR.string("apply")), IR.nullNode());
    Assert.assertTrue(NodeUtil.isFunctionObjectApply(applyMethod));
    Assert.assertFalse(NodeUtil.isFunctionObjectCall(applyMethod));
  }

  @Test
  public void isLValue_givenDifferentNodeContexts_shouldDetermineCorrectly() {
    Node nameAssign = IR.name("target");
    IR.assign(nameAssign, IR.number(1));
    Assert.assertTrue(NodeUtil.isLValue(nameAssign));

    Node nameVar = IR.name("v");
    IR.var(nameVar);
    Assert.assertTrue(NodeUtil.isLValue(nameVar));

    Node nameInc = IR.name("count");
    new Node(Token.INC, nameInc);
    Assert.assertTrue(NodeUtil.isLValue(nameInc));

    Node nameStandalone = IR.name("readOnly");
    Assert.assertFalse(NodeUtil.isLValue(nameStandalone));
  }

  @Test
  public void objectLitKeys_shouldVerifyNamesAndTypes() {
    Node stringKey = IR.stringKey("prop1", IR.number(1));
    Assert.assertTrue(NodeUtil.isObjectLitKey(stringKey, null));
    Assert.assertEquals("prop1", NodeUtil.getObjectLitKeyName(stringKey));

    Node getterKey = new Node(Token.GETTER_DEF);
    getterKey.setString("prop2");
    Assert.assertTrue(NodeUtil.isGetOrSetKey(getterKey));
    Assert.assertEquals("prop2", NodeUtil.getObjectLitKeyName(getterKey));

    Assert.assertNull(NodeUtil.getObjectLitKeyTypeFromValueType(getterKey, null));
  }

  @Test(expected = IllegalStateException.class)
  public void getObjectLitKeyName_givenInvalidNode_shouldThrowException() {
    NodeUtil.getObjectLitKeyName(IR.number(1));
  }

  @Test
  public void opToStr_andOpToStrNoFail_shouldMapTokensToStrings() {
    Assert.assertEquals("+", NodeUtil.opToStr(Token.ADD));
    Assert.assertEquals("-", NodeUtil.opToStr(Token.SUB));
    Assert.assertEquals("===", NodeUtil.opToStr(Token.SHEQ));
    Assert.assertEquals("instanceof", NodeUtil.opToStr(Token.INSTANCEOF));
    Assert.assertNull(NodeUtil.opToStr(Token.SCRIPT));

    Assert.assertEquals("+", NodeUtil.opToStrNoFail(Token.ADD));
  }

  @Test(expected = Error.class)
  public void opToStrNoFail_givenInvalidToken_shouldThrowError() {
    NodeUtil.opToStrNoFail(Token.SCRIPT);
  }

  @Test
  public void qualifiedNamesAndIdentifierValidation_shouldHandleComplexNames() {
    DummyCodingConvention convention = new DummyCodingConvention();
    Node qNameNode = NodeUtil.newQualifiedNameNode(convention, "a.b.CONST_KEY");
    Assert.assertTrue(qNameNode.isGetProp());
    Assert.assertTrue(NodeUtil.getRootOfQualifiedName(qNameNode).isName());
    Assert.assertEquals("a", NodeUtil.getRootOfQualifiedName(qNameNode).getString());

    Assert.assertTrue(NodeUtil.isLatin("asciiOnly"));
    Assert.assertFalse(NodeUtil.isLatin("utf8_ทดสอบ"));

    Assert.assertTrue(NodeUtil.isValidSimpleName("validVar"));
    Assert.assertFalse(NodeUtil.isValidSimpleName("for"));
    Assert.assertFalse(NodeUtil.isValidSimpleName("123bad"));

    Assert.assertTrue(NodeUtil.isValidQualifiedName("a.b.c"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName(".a.b"));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a.b."));
    Assert.assertFalse(NodeUtil.isValidQualifiedName("a..b"));
    Assert.assertTrue(NodeUtil.isValidPropertyName("validProp"));
  }

  @Test
  public void prototypes_shouldAnalyzeAndExtractClassAndProperties() {
    Node protoProp = IR.getprop(
        IR.getprop(IR.name("MyClass"), IR.string("prototype")),
        IR.string("myMethod")
    );
    Assert.assertTrue(NodeUtil.isPrototypeProperty(protoProp));
    Assert.assertEquals("myMethod", NodeUtil.getPrototypePropertyName(protoProp));
    Assert.assertEquals("MyClass", NodeUtil.getPrototypeClassName(protoProp).getQualifiedName());

    Node assignProto = IR.exprResult(IR.assign(protoProp, IR.function(IR.name(""), IR.paramList(), IR.block())));
    Assert.assertTrue(NodeUtil.isPrototypePropertyDeclaration(assignProto));

    Node nonProto = IR.getprop(IR.name("MyClass"), IR.string("myMethod"));
    Assert.assertFalse(NodeUtil.isPrototypeProperty(nonProto));
  }

  @Test
  public void astTraversal_visitorAndCounting_shouldFindAllOccurrences() {
    Node root = IR.block(
        IR.exprResult(IR.name("x")),
        IR.exprResult(IR.add(IR.name("x"), IR.name("y"))),
        IR.exprResult(IR.name("x"))
    );

    Assert.assertEquals(3, NodeUtil.getNameReferenceCount(root, "x"));
    Assert.assertTrue(NodeUtil.isNameReferenced(root, "y"));
    Assert.assertFalse(NodeUtil.isNameReferenced(root, "z"));
    Assert.assertEquals(1, NodeUtil.getNodeTypeReferenceCount(root, Token.ADD, Predicates.<Node>alwaysTrue()));

    final List<String> preOrderTokens = new ArrayList<String>();
    NodeUtil.visitPreOrder(root, new NodeUtil.Visitor() {
      @Override
      public void visit(Node node) {
        preOrderTokens.add(Token.name(node.getType()));
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertEquals("BLOCK", preOrderTokens.get(0));

    final List<String> postOrderTokens = new ArrayList<String>();
    NodeUtil.visitPostOrder(root, new NodeUtil.Visitor() {
      @Override
      public void visit(Node node) {
        postOrderTokens.add(Token.name(node.getType()));
      }
    }, Predicates.<Node>alwaysTrue());
    Assert.assertEquals("BLOCK", postOrderTokens.get(postOrderTokens.size() - 1));
  }

  @Test
  public void evaluatesToLocalValue_shouldCheckExpressions() {
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.number(1)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.string("s")));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.ARRAYLIT)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.OBJECTLIT)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(new Node(Token.REGEXP)));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(IR.function(IR.name(""), IR.paramList(), IR.block())));

    Node incPost = new Node(Token.INC, IR.name("x"));
    incPost.putBooleanProp(Node.INCRDECR_PROP, false);
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(incPost));

    Node commaLocal = IR.comma(IR.name("x"), IR.number(1));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(commaLocal));

    Node callToString = IR.call(IR.getprop(IR.name("x"), IR.string("toString")));
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(callToString));

    Node callLocalRes = IR.call(IR.name("factory"));
    callLocalRes.setSideEffectFlags(Node.FLAG_LOCAL_RESULTS);
    Assert.assertTrue(NodeUtil.evaluatesToLocalValue(callLocalRes));

    Assert.assertFalse(NodeUtil.evaluatesToLocalValue(IR.name("unknown")));
  }

  @Test
  public void metadataAndArguments_helpersShouldReturnExpectedNodes() {
    Node fn = IR.function(IR.name("myFn"), IR.paramList(IR.name("p1"), IR.name("p2")), IR.block());
    Assert.assertEquals("p1", NodeUtil.getArgumentForFunction(fn, 0).getString());
    Assert.assertEquals("p2", NodeUtil.getArgumentForFunction(fn, 1).getString());
    Assert.assertNull(NodeUtil.getArgumentForFunction(fn, 2));

    Node call = IR.call(IR.name("fn"), IR.number(100), IR.string("arg2"));
    Assert.assertEquals(100.0, NodeUtil.getArgumentForCallOrNew(call, 0).getDouble(), 0.0001);
    Assert.assertEquals("arg2", NodeUtil.getArgumentForCallOrNew(call, 1).getString());
    Assert.assertNull(NodeUtil.getArgumentForCallOrNew(call, 2));
  }

  @Test
  public void bestLValueAndOwner_shouldResolveCorrectTargets() {
    Node fnDecl = IR.function(IR.name("declaredFn"), IR.paramList(), IR.block());
    IR.script(fnDecl);
    Assert.assertEquals("declaredFn", NodeUtil.getBestLValueName(fnDecl));
    Assert.assertNull(NodeUtil.getBestLValueOwner(fnDecl));

    Node assignTarget = IR.getprop(IR.name("obj"), IR.string("prop"));
    Node assignVal = IR.number(1);
    IR.assign(assignTarget, assignVal);
    Assert.assertEquals("obj.prop", NodeUtil.getBestLValueName(assignVal));
    Assert.assertEquals("obj", NodeUtil.getBestLValueOwner(assignTarget).getQualifiedName());

    Node objLit = new Node(Token.OBJECTLIT);
    Node stringKey = IR.stringKey("innerKey", IR.number(2));
    objLit.addChildToBack(stringKey);
    IR.assign(IR.name("container"), objLit);
    Assert.assertEquals("container.innerKey", NodeUtil.getBestLValueName(stringKey));
  }

  @Test
  public void isExpressionResultUsed_shouldAnalyzeParentContext() {
    Node exprStmt = IR.exprResult(IR.number(1));
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(exprStmt.getFirstChild()));

    Node hook = IR.hook(IR.name("c"), IR.number(1), IR.number(2));
    IR.exprResult(hook);
    Assert.assertTrue(NodeUtil.isExpressionResultUsed(hook.getFirstChild()));
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(hook.getFirstChild().getNext()));

    Node comma = IR.comma(IR.number(1), IR.number(2));
    IR.exprResult(comma);
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(comma.getFirstChild()));
    Assert.assertFalse(NodeUtil.isExpressionResultUsed(comma.getLastChild()));

    Node evalComma = IR.comma(IR.number(1), IR.name("eval"));
    IR.call(evalComma);
    Assert.assertTrue(NodeUtil.isExpressionResultUsed(evalComma.getFirstChild()));
  }

  @Test
  public void isExecutedExactlyOnce_shouldTraceExecutionGuarantees() {
    Node script = IR.script();
    Node stmt1 = IR.exprResult(IR.number(1));
    script.addChildToBack(stmt1);
    Assert.assertTrue(NodeUtil.isExecutedExactlyOnce(stmt1.getFirstChild()));

    Node ifStmt = IR.ifNode(IR.trueNode(), IR.block(IR.exprResult(IR.number(2))));
    script.addChildToBack(ifStmt);
    Assert.assertTrue(NodeUtil.isExecutedExactlyOnce(ifStmt.getFirstChild()));
    Assert.assertFalse(NodeUtil.isExecutedExactlyOnce(ifStmt.getLastChild().getFirstChild()));

    Node whileStmt = new Node(Token.WHILE, IR.trueNode(), IR.block(IR.exprResult(IR.number(3))));
    script.addChildToBack(whileStmt);
    Assert.assertFalse(NodeUtil.isExecutedExactlyOnce(whileStmt.getLastChild()));
  }

  @Test
  public void booleanNode_andNumberNode_shouldProduceExactAST() {
    Node trueNode = NodeUtil.booleanNode(true);
    Assert.assertTrue(trueNode.isTrue());
    Node falseNode = NodeUtil.booleanNode(false);
    Assert.assertTrue(falseNode.isFalse());

    Node numNode = NodeUtil.numberNode(12.34, null);
    Assert.assertTrue(numNode.isNumber());
    Assert.assertEquals(12.34, numNode.getDouble(), 0.0001);

    Node nanNode = NodeUtil.numberNode(Double.NaN, null);
    Assert.assertTrue(nanNode.isName());
    Assert.assertEquals("NaN", nanNode.getString());

    Node posInfNode = NodeUtil.numberNode(Double.POSITIVE_INFINITY, null);
    Assert.assertTrue(posInfNode.isName());
    Assert.assertEquals("Infinity", posInfNode.getString());

    Node negInfNode = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, null);
    Assert.assertTrue(negInfNode.isNeg());
    Assert.assertEquals("Infinity", negInfNode.getFirstChild().getString());
  }

  @Test
  public void redeclareVarsInsideBranch_shouldHoistDeclarationsToRoot() {
    Node varNode = IR.var(IR.name("scopedVar"));
    Node block = IR.block(varNode);
    Node script = IR.script(block);

    NodeUtil.redeclareVarsInsideBranch(block);
    Assert.assertTrue(script.getFirstChild().isVar());
    Assert.assertEquals("scopedVar", script.getFirstChild().getFirstChild().getString());
  }

  @Test
  public void newVarNode_andNewUndefinedNode_shouldConstructCorrectTrees() {
    Node refNode = IR.number(1);
    refNode.setLineno(15);
    Node undef = NodeUtil.newUndefinedNode(refNode);
    Assert.assertTrue(undef.isVoid());
    Assert.assertEquals(15, undef.getLineno());

    Node var = NodeUtil.newVarNode("myVar", IR.number(99));
    Assert.assertTrue(var.isVar());
    Assert.assertEquals("myVar", var.getFirstChild().getString());
    Assert.assertEquals(99.0, var.getFirstChild().getFirstChild().getDouble(), 0.0001);
  }

  @Test
  public void getSourceName_getSourceFile_getInputId_shouldTraverseAncestors() {
    Node script = IR.script();
    script.setSourceFileName("test_script.js");
    InputId id = new InputId("input_1");
    script.setInputId(id);

    Node stmt = IR.exprResult(IR.number(1));
    script.addChildToBack(stmt);
    Node num = stmt.getFirstChild();

    Assert.assertEquals("test_script.js", NodeUtil.getSourceName(num));
    Assert.assertEquals(id, NodeUtil.getInputId(num));
    Assert.assertNull(NodeUtil.getSourceName(null));
    Assert.assertNull(NodeUtil.getInputId(null));
  }
}