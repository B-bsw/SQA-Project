package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoldConstantsTest {

  private Compiler compiler;
  private FoldConstants pass;

  @Before
  public void setUp() {
    compiler = new Compiler();
    pass = new FoldConstants(compiler);
  }

  private void process(Node root) {
    Node script = new Node(Token.SCRIPT, root);
    pass.process(null, script);
  }

  @Test
  public void visit_givenTypeofString_shouldFoldToStringLiteral() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newString("hello"));
    Node expr = new Node(Token.EXPR_RESULT, typeofNode);
    process(expr);
    Assert.assertEquals(Token.STRING, expr.getFirstChild().getType());
    Assert.assertEquals("string", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenTypeofNumber_shouldFoldToNumberLiteral() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newNumber(42.0));
    Node expr = new Node(Token.EXPR_RESULT, typeofNode);
    process(expr);
    Assert.assertEquals(Token.STRING, expr.getFirstChild().getType());
    Assert.assertEquals("number", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenTypeofBoolean_shouldFoldToBooleanLiteral() {
    Node typeofTrue = new Node(Token.TYPEOF, new Node(Token.TRUE));
    Node expr1 = new Node(Token.EXPR_RESULT, typeofTrue);
    process(expr1);
    Assert.assertEquals(Token.STRING, expr1.getFirstChild().getType());
    Assert.assertEquals("boolean", expr1.getFirstChild().getString());

    Node typeofFalse = new Node(Token.TYPEOF, new Node(Token.FALSE));
    Node expr2 = new Node(Token.EXPR_RESULT, typeofFalse);
    process(expr2);
    Assert.assertEquals(Token.STRING, expr2.getFirstChild().getType());
    Assert.assertEquals("boolean", expr2.getFirstChild().getString());
  }

  @Test
  public void visit_givenTypeofObjectLiterals_shouldFoldToObject() {
    Node typeofNull = new Node(Token.TYPEOF, new Node(Token.NULL));
    Node expr1 = new Node(Token.EXPR_RESULT, typeofNull);
    process(expr1);
    Assert.assertEquals("object", expr1.getFirstChild().getString());

    Node typeofObj = new Node(Token.TYPEOF, new Node(Token.OBJECTLIT));
    Node expr2 = new Node(Token.EXPR_RESULT, typeofObj);
    process(expr2);
    Assert.assertEquals("object", expr2.getFirstChild().getString());

    Node typeofArr = new Node(Token.TYPEOF, new Node(Token.ARRAYLIT));
    Node expr3 = new Node(Token.EXPR_RESULT, typeofArr);
    process(expr3);
    Assert.assertEquals("object", expr3.getFirstChild().getString());
  }

  @Test
  public void visit_givenTypeofUndefinedName_shouldFoldToUndefined() {
    Node typeofUndefined = new Node(Token.TYPEOF, Node.newString(Token.NAME, "undefined"));
    Node expr = new Node(Token.EXPR_RESULT, typeofUndefined);
    process(expr);
    Assert.assertEquals("undefined", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenUnaryNotNegBitnotInExprResult_shouldUnwrap() {
    Node notChild = Node.newString(Token.NAME, "a");
    Node notNode = new Node(Token.NOT, notChild);
    Node exprResult = new Node(Token.EXPR_RESULT, notNode);
    process(exprResult);
    Assert.assertEquals(Token.NAME, exprResult.getFirstChild().getType());
    Assert.assertEquals("a", exprResult.getFirstChild().getString());
  }

  @Test
  public void visit_givenNotOnComparisonOperators_shouldInvertOperator() {
    Node eq = new Node(Token.EQ, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notEq = new Node(Token.NOT, eq);
    Node block = new Node(Token.BLOCK, notEq);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(Token.NE, block.getFirstChild().getType());

    Node ne = new Node(Token.NE, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notNe = new Node(Token.NOT, ne);
    Node block2 = new Node(Token.BLOCK, notNe);
    Node root2 = new Node(Token.SCRIPT, block2);
    NodeTraversal.traverse(compiler, root2, pass);
    Assert.assertEquals(Token.EQ, block2.getFirstChild().getType());

    Node sheq = new Node(Token.SHEQ, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notSheq = new Node(Token.NOT, sheq);
    Node block3 = new Node(Token.BLOCK, notSheq);
    Node root3 = new Node(Token.SCRIPT, block3);
    NodeTraversal.traverse(compiler, root3, pass);
    Assert.assertEquals(Token.SHNE, block3.getFirstChild().getType());

    Node shne = new Node(Token.SHNE, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    Node notShne = new Node(Token.NOT, shne);
    Node block4 = new Node(Token.BLOCK, notShne);
    Node root4 = new Node(Token.SCRIPT, block4);
    NodeTraversal.traverse(compiler, root4, pass);
    Assert.assertEquals(Token.SHEQ, block4.getFirstChild().getType());
  }

  @Test
  public void visit_givenNotOnLiteral_shouldFoldToBoolean() {
    Node notTrue = new Node(Token.NOT, new Node(Token.TRUE));
    Node block = new Node(Token.BLOCK, notTrue);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(Token.FALSE, block.getFirstChild().getType());
  }

  @Test
  public void visit_givenNegOnNumber_shouldFoldToNegativeNumber() {
    Node neg = new Node(Token.NEG, Node.newNumber(15.0));
    Node block = new Node(Token.BLOCK, neg);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(Token.NUMBER, block.getFirstChild().getType());
    Assert.assertEquals(-15.0, block.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenNegOnNaNAndInfinity_shouldHandleSpecialCases() {
    Node negNan = new Node(Token.NEG, Node.newString(Token.NAME, "NaN"));
    Node block = new Node(Token.BLOCK, negNan);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(Token.NAME, block.getFirstChild().getType());
    Assert.assertEquals("NaN", block.getFirstChild().getString());

    Node negInf = new Node(Token.NEG, Node.newString(Token.NAME, "Infinity"));
    Node block2 = new Node(Token.BLOCK, negInf);
    Node root2 = new Node(Token.SCRIPT, block2);
    NodeTraversal.traverse(compiler, root2, pass);
    Assert.assertEquals(Token.NEG, block2.getFirstChild().getType());
  }

  @Test
  public void visit_givenNegOnNonNumber_shouldReportError() {
    Node negStr = new Node(Token.NEG, Node.newString("not_a_num"));
    Node block = new Node(Token.BLOCK, negStr);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenBitnotOnValidNumber_shouldFold() {
    Node bitnot = new Node(Token.BITNOT, Node.newNumber(0.0));
    Node block = new Node(Token.BLOCK, bitnot);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertEquals(Token.NUMBER, block.getFirstChild().getType());
    Assert.assertEquals(~0, (int) block.getFirstChild().getDouble());
  }

  @Test
  public void visit_givenBitnotOnFractional_shouldReportError() {
    Node bitnot = new Node(Token.BITNOT, Node.newNumber(1.5));
    Node block = new Node(Token.BLOCK, bitnot);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenBitnotOutOfRange_shouldReportError() {
    Node bitnot = new Node(Token.BITNOT, Node.newNumber(1.0e12));
    Node block = new Node(Token.BLOCK, bitnot);
    Node root = new Node(Token.SCRIPT, block);
    NodeTraversal.traverse(compiler, root, pass);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenNewRegExp_shouldFoldToRegexLiteral() {
    Node newRegExp = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"), Node.newString("abc"));
    Node expr = new Node(Token.EXPR_RESULT, newRegExp);
    process(expr);
    Assert.assertEquals(Token.REGEXP, expr.getFirstChild().getType());
  }

  @Test
  public void visit_givenNewRegExpWithInvalidFlags_shouldReportError() {
    Node newRegExp = new Node(Token.NEW,
        Node.newString(Token.NAME, "RegExp"),
        Node.newString("abc"),
        Node.newString("z"));
    Node expr = new Node(Token.EXPR_RESULT, newRegExp);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenNewRegExpWithGlobalFlag_shouldNotFold() {
    Node newRegExp = new Node(Token.NEW,
        Node.newString(Token.NAME, "RegExp"),
        Node.newString("abc"),
        Node.newString("g"));
    Node expr = new Node(Token.EXPR_RESULT, newRegExp);
    process(expr);
    Assert.assertEquals(Token.NEW, expr.getFirstChild().getType());
  }

  @Test
  public void visit_givenNewArrayAndObjectWithoutArgs_shouldFoldToLiterals() {
    Node newArr = new Node(Token.NEW, Node.newString(Token.NAME, "Array"));
    Node expr1 = new Node(Token.EXPR_RESULT, newArr);
    process(expr1);
    Assert.assertEquals(Token.ARRAYLIT, expr1.getFirstChild().getType());

    Node newObj = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    Node expr2 = new Node(Token.EXPR_RESULT, newObj);
    process(expr2);
    Assert.assertEquals(Token.OBJECTLIT, expr2.getFirstChild().getType());
  }

  @Test
  public void visit_givenReturnWithVoidOrUndefined_shouldReduceReturn() {
    Node returnVoid = new Node(Token.RETURN, new Node(Token.VOID, Node.newNumber(0.0)));
    process(returnVoid);
    Assert.assertNull(returnVoid.getFirstChild());

    Node returnUndef = new Node(Token.RETURN, Node.newString(Token.NAME, "undefined"));
    process(returnUndef);
    Assert.assertNull(returnUndef.getFirstChild());
  }

  @Test
  public void visit_givenInstanceofWithImmutableLeft_shouldFoldToFalse() {
    Node inst = new Node(Token.INSTANCEOF, Node.newString("str"), Node.newString(Token.NAME, "String"));
    Node expr = new Node(Token.EXPR_RESULT, inst);
    process(expr);
    Assert.assertEquals(Token.FALSE, expr.getFirstChild().getType());
  }

  @Test
  public void visit_givenInstanceofWithObjectLiteralAndObject_shouldFoldToTrue() {
    Node inst = new Node(Token.INSTANCEOF, new Node(Token.OBJECTLIT), Node.newString(Token.NAME, "Object"));
    Node expr = new Node(Token.EXPR_RESULT, inst);
    process(expr);
    Assert.assertEquals(Token.TRUE, expr.getFirstChild().getType());
  }

  @Test
  public void visit_givenTryFoldAssign_shouldFoldToCompoundAssign() {
    Node left = Node.newString(Token.NAME, "x");
    Node right = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newNumber(1.0));
    Node assign = new Node(Token.ASSIGN, left, right);
    Node expr = new Node(Token.EXPR_RESULT, assign);
    process(expr);
    Assert.assertEquals(Token.ASSIGN_ADD, expr.getFirstChild().getType());
    Assert.assertEquals("x", expr.getFirstChild().getFirstChild().getString());
    Assert.assertEquals(1.0, expr.getFirstChild().getLastChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenArithmeticOperations_shouldFoldNumbers() {
    Node add = new Node(Token.ADD, Node.newNumber(10.0), Node.newNumber(20.0));
    Node expr1 = new Node(Token.EXPR_RESULT, add);
    process(expr1);
    Assert.assertEquals(30.0, expr1.getFirstChild().getDouble(), 0.0);

    Node sub = new Node(Token.SUB, Node.newNumber(20.0), Node.newNumber(5.0));
    Node expr2 = new Node(Token.EXPR_RESULT, sub);
    process(expr2);
    Assert.assertEquals(15.0, expr2.getFirstChild().getDouble(), 0.0);

    Node mul = new Node(Token.MUL, Node.newNumber(3.0), Node.newNumber(4.0));
    Node expr3 = new Node(Token.EXPR_RESULT, mul);
    process(expr3);
    Assert.assertEquals(12.0, expr3.getFirstChild().getDouble(), 0.0);

    Node div = new Node(Token.DIV, Node.newNumber(20.0), Node.newNumber(4.0));
    Node expr4 = new Node(Token.EXPR_RESULT, div);
    process(expr4);
    Assert.assertEquals(5.0, expr4.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenDivideByZero_shouldReportError() {
    Node div = new Node(Token.DIV, Node.newNumber(10.0), Node.newNumber(0.0));
    Node expr = new Node(Token.EXPR_RESULT, div);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenStringConcatenation_shouldFoldAdd() {
    Node add = new Node(Token.ADD, Node.newString("foo"), Node.newString("bar"));
    Node expr = new Node(Token.EXPR_RESULT, add);
    process(expr);
    Assert.assertEquals("foobar", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenLeftChildAddWithStrings_shouldFoldAssociativeAdd() {
    Node innerAdd = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newString("foo"));
    Node outerAdd = new Node(Token.ADD, innerAdd, Node.newString("bar"));
    Node expr = new Node(Token.EXPR_RESULT, outerAdd);
    process(expr);
    Assert.assertEquals(Token.ADD, expr.getFirstChild().getType());
    Assert.assertEquals("foobar", expr.getFirstChild().getLastChild().getString());
  }

  @Test
  public void visit_givenBitwiseAndOr_shouldFoldIntegerValues() {
    Node bitAnd = new Node(Token.BITAND, Node.newNumber(6.0), Node.newNumber(3.0));
    Node expr1 = new Node(Token.EXPR_RESULT, bitAnd);
    process(expr1);
    Assert.assertEquals(2.0, expr1.getFirstChild().getDouble(), 0.0);

    Node bitOr = new Node(Token.BITOR, Node.newNumber(4.0), Node.newNumber(1.0));
    Node expr2 = new Node(Token.EXPR_RESULT, bitOr);
    process(expr2);
    Assert.assertEquals(5.0, expr2.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenShiftOperations_shouldFoldCorrectly() {
    Node lsh = new Node(Token.LSH, Node.newNumber(1.0), Node.newNumber(2.0));
    Node expr1 = new Node(Token.EXPR_RESULT, lsh);
    process(expr1);
    Assert.assertEquals(4.0, expr1.getFirstChild().getDouble(), 0.0);

    Node rsh = new Node(Token.RSH, Node.newNumber(8.0), Node.newNumber(2.0));
    Node expr2 = new Node(Token.EXPR_RESULT, rsh);
    process(expr2);
    Assert.assertEquals(2.0, expr2.getFirstChild().getDouble(), 0.0);

    Node ursh = new Node(Token.URSH, Node.newNumber(-1.0), Node.newNumber(31.0));
    Node expr3 = new Node(Token.EXPR_RESULT, ursh);
    process(expr3);
    Assert.assertEquals(1.0, expr3.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenShiftAmountOutOfBounds_shouldReportError() {
    Node lsh = new Node(Token.LSH, Node.newNumber(1.0), Node.newNumber(35.0));
    Node expr = new Node(Token.EXPR_RESULT, lsh);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenShiftWithFractionalOperand_shouldReportError() {
    Node lsh = new Node(Token.LSH, Node.newNumber(1.5), Node.newNumber(2.0));
    Node expr = new Node(Token.EXPR_RESULT, lsh);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenComparisonsOnNumbers_shouldFoldToBooleans() {
    Node eq = new Node(Token.EQ, Node.newNumber(1.0), Node.newNumber(1.0));
    Node expr1 = new Node(Token.EXPR_RESULT, eq);
    process(expr1);
    Assert.assertEquals(Token.TRUE, expr1.getFirstChild().getType());

    Node lt = new Node(Token.LT, Node.newNumber(2.0), Node.newNumber(1.0));
    Node expr2 = new Node(Token.EXPR_RESULT, lt);
    process(expr2);
    Assert.assertEquals(Token.FALSE, expr2.getFirstChild().getType());

    Node ge = new Node(Token.GE, Node.newNumber(2.0), Node.newNumber(2.0));
    Node expr3 = new Node(Token.EXPR_RESULT, ge);
    process(expr3);
    Assert.assertEquals(Token.TRUE, expr3.getFirstChild().getType());
  }

  @Test
  public void visit_givenComparisonsOnStrings_shouldFoldToBooleans() {
    Node eq = new Node(Token.EQ, Node.newString("a"), Node.newString("a"));
    Node expr1 = new Node(Token.EXPR_RESULT, eq);
    process(expr1);
    Assert.assertEquals(Token.TRUE, expr1.getFirstChild().getType());

    Node ne = new Node(Token.NE, Node.newString("a"), Node.newString("b"));
    Node expr2 = new Node(Token.EXPR_RESULT, ne);
    process(expr2);
    Assert.assertEquals(Token.TRUE, expr2.getFirstChild().getType());
  }

  @Test
  public void visit_givenComparisonsWithUndefinedAndNull_shouldFoldProperly() {
    Node eq = new Node(Token.EQ, new Node(Token.NULL), Node.newString(Token.NAME, "undefined"));
    Node expr1 = new Node(Token.EXPR_RESULT, eq);
    process(expr1);
    Assert.assertEquals(Token.TRUE, expr1.getFirstChild().getType());

    Node sheq = new Node(Token.SHEQ, new Node(Token.NULL), Node.newString(Token.NAME, "undefined"));
    Node expr2 = new Node(Token.EXPR_RESULT, sheq);
    process(expr2);
    Assert.assertEquals(Token.FALSE, expr2.getFirstChild().getType());

    Node eqVoid = new Node(Token.EQ, new Node(Token.VOID, Node.newNumber(0.0)), new Node(Token.NULL));
    Node expr3 = new Node(Token.EXPR_RESULT, eqVoid);
    process(expr3);
    Assert.assertEquals(Token.TRUE, expr3.getFirstChild().getType());
  }

  @Test
  public void visit_givenStringIndexOf_shouldFoldToResultIndex() {
    Node getProp = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("indexOf"));
    Node call = new Node(Token.CALL, getProp, Node.newString("cd"));
    Node expr = new Node(Token.EXPR_RESULT, call);
    process(expr);
    Assert.assertEquals(Token.NUMBER, expr.getFirstChild().getType());
    Assert.assertEquals(2.0, expr.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenStringLastIndexOfWithFromIndex_shouldFold() {
    Node getProp = new Node(Token.GETPROP, Node.newString("banana"), Node.newString("lastIndexOf"));
    Node call = new Node(Token.CALL, getProp, Node.newString("a"), Node.newNumber(3.0));
    Node expr = new Node(Token.EXPR_RESULT, call);
    process(expr);
    Assert.assertEquals(Token.NUMBER, expr.getFirstChild().getType());
    Assert.assertEquals(3.0, expr.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenStringJoinOnArrayLiteral_shouldFoldToString() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getProp = new Node(Token.GETPROP, array, Node.newString("join"));
    Node call = new Node(Token.CALL, getProp, Node.newString(","));
    Node expr = new Node(Token.EXPR_RESULT, call);
    process(expr);
    Assert.assertEquals(Token.STRING, expr.getFirstChild().getType());
    Assert.assertEquals("a,b,c", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenStringJoinEmptyArray_shouldFoldToEmptyString() {
    Node array = new Node(Token.ARRAYLIT);
    Node getProp = new Node(Token.GETPROP, array, Node.newString("join"));
    Node call = new Node(Token.CALL, getProp, Node.newString(","));
    Node expr = new Node(Token.EXPR_RESULT, call);
    process(expr);
    Assert.assertEquals(Token.STRING, expr.getFirstChild().getType());
    Assert.assertEquals("", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenArrayGetElem_shouldFoldToIndexedElement() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("first"), Node.newString("second"));
    Node getElem = new Node(Token.GETELEM, array, Node.newNumber(1.0));
    Node expr = new Node(Token.EXPR_RESULT, getElem);
    process(expr);
    Assert.assertEquals(Token.STRING, expr.getFirstChild().getType());
    Assert.assertEquals("second", expr.getFirstChild().getString());
  }

  @Test
  public void visit_givenArrayGetElemWithInvalidIndex_shouldReportError() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node getElem = new Node(Token.GETELEM, array, Node.newNumber(1.5));
    Node expr = new Node(Token.EXPR_RESULT, getElem);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenArrayGetElemOutOfBounds_shouldReportError() {
    Node array = new Node(Token.ARRAYLIT, Node.newString("a"));
    Node getElem = new Node(Token.GETELEM, array, Node.newNumber(5.0));
    Node expr = new Node(Token.EXPR_RESULT, getElem);
    process(expr);
    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void visit_givenGetPropLengthOnArrayOrString_shouldFoldToLength() {
    Node array = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0));
    Node getPropArr = new Node(Token.GETPROP, array, Node.newString("length"));
    Node expr1 = new Node(Token.EXPR_RESULT, getPropArr);
    process(expr1);
    Assert.assertEquals(2.0, expr1.getFirstChild().getDouble(), 0.0);

    Node str = Node.newString("hello");
    Node getPropStr = new Node(Token.GETPROP, str, Node.newString("length"));
    Node expr2 = new Node(Token.EXPR_RESULT, getPropStr);
    process(expr2);
    Assert.assertEquals(5.0, expr2.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenWhileWithFalseCondition_shouldRemoveWhile() {
    Node whileNode = new Node(Token.WHILE, new Node(Token.FALSE), new Node(Token.BLOCK));
    Node parentBlock = new Node(Token.BLOCK, whileNode);
    process(parentBlock);
    Assert.assertEquals(0, parentBlock.getChildCount());
  }

  @Test
  public void visit_givenForWithEmptyInitAndFalseCondition_shouldRemoveFor() {
    Node forNode = new Node(Token.FOR,
        new Node(Token.EMPTY),
        new Node(Token.FALSE),
        new Node(Token.EMPTY),
        new Node(Token.BLOCK));
    Node parentBlock = new Node(Token.BLOCK, forNode);
    process(parentBlock);
    Assert.assertEquals(0, parentBlock.getChildCount());
  }

  @Test
  public void visit_givenDoWhileWithFalseCondition_shouldFoldToBlock() {
    Node body = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "x")));
    Node doNode = new Node(Token.DO, body, new Node(Token.FALSE));
    Node parentBlock = new Node(Token.BLOCK, doNode);
    process(parentBlock);
    Assert.assertEquals(1, parentBlock.getChildCount());
    Assert.assertEquals(Token.BLOCK, parentBlock.getFirstChild().getType());
  }

  @Test
  public void visit_givenIfWithTrueCondition_shouldFoldToThenBranch() {
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node ifNode = new Node(Token.IF, new Node(Token.TRUE), thenBlock);
    Node parentBlock = new Node(Token.BLOCK, ifNode);
    process(parentBlock);
    Assert.assertEquals(Token.BLOCK, parentBlock.getFirstChild().getType());
  }

  @Test
  public void visit_givenIfWithFalseConditionAndNoElse_shouldRemoveIf() {
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node ifNode = new Node(Token.IF, new Node(Token.FALSE), thenBlock);
    Node parentBlock = new Node(Token.BLOCK, ifNode);
    process(parentBlock);
    Assert.assertEquals(0, parentBlock.getChildCount());
  }

  @Test
  public void visit_givenIfWithFalseConditionAndElse_shouldFoldToElseBranch() {
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "a")));
    Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "b")));
    Node ifNode = new Node(Token.IF, new Node(Token.FALSE), thenBlock, elseBlock);
    Node parentBlock = new Node(Token.BLOCK, ifNode);
    process(parentBlock);
    Assert.assertEquals(Token.BLOCK, parentBlock.getFirstChild().getType());
    Assert.assertEquals("b", parentBlock.getFirstChild().getFirstChild().getFirstChild().getString());
  }

  @Test
  public void visit_givenHookWithLiteralCondition_shouldFoldToBranch() {
    Node hookTrue = new Node(Token.HOOK, new Node(Token.TRUE), Node.newNumber(1.0), Node.newNumber(2.0));
    Node expr1 = new Node(Token.EXPR_RESULT, hookTrue);
    process(expr1);
    Assert.assertEquals(1.0, expr1.getFirstChild().getDouble(), 0.0);

    Node hookFalse = new Node(Token.HOOK, new Node(Token.FALSE), Node.newNumber(1.0), Node.newNumber(2.0));
    Node expr2 = new Node(Token.EXPR_RESULT, hookFalse);
    process(expr2);
    Assert.assertEquals(2.0, expr2.getFirstChild().getDouble(), 0.0);
  }

  @Test
  public void visit_givenAndOrWithLiteralLeft_shouldFold() {
    Node orTrue = new Node(Token.OR, new Node(Token.TRUE), Node.newString(Token.NAME, "b"));
    Node expr1 = new Node(Token.EXPR_RESULT, orTrue);
    process(expr1);
    Assert.assertEquals(Token.TRUE, expr1.getFirstChild().getType());

    Node orFalse = new Node(Token.OR, new Node(Token.FALSE), Node.newString(Token.NAME, "b"));
    Node expr2 = new Node(Token.EXPR_RESULT, orFalse);
    process(expr2);
    Assert.assertEquals(Token.NAME, expr2.getFirstChild().getType());
    Assert.assertEquals("b", expr2.getFirstChild().getString());

    Node andTrue = new Node(Token.AND, new Node(Token.TRUE), Node.newString(Token.NAME, "b"));
    Node expr3 = new Node(Token.EXPR_RESULT, andTrue);
    process(expr3);
    Assert.assertEquals(Token.NAME, expr3.getFirstChild().getType());
    Assert.assertEquals("b", expr3.getFirstChild().getString());

    Node andFalse = new Node(Token.AND, new Node(Token.FALSE), Node.newString(Token.NAME, "b"));
    Node expr4 = new Node(Token.EXPR_RESULT, andFalse);
    process(expr4);
    Assert.assertEquals(Token.FALSE, expr4.getFirstChild().getType());
  }

  @Test
  public void visit_givenBlockWithSideEffectFreeChildren_shouldRemoveDeadNodes() {
    Node dead1 = Node.newNumber(1.0);
    Node dead2 = Node.newString("hello");
    Node alive = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(2.0));
    Node exprAlive = new Node(Token.EXPR_RESULT, alive);
    Node block = new Node(Token.BLOCK, dead1, dead2, exprAlive);
    Node parentBlock = new Node(Token.BLOCK, block);
    process(parentBlock);
    Assert.assertFalse(block.hasChildren() && block.getFirstChild().getType() == Token.NUMBER);
  }

  @Test
  public void tryMinimizeCondition_givenDoubleNegation_shouldEliminateNotNot() {
    Node doubleNot = new Node(Token.NOT, new Node(Token.NOT, Node.newString(Token.NAME, "x")));
    Node expr = new Node(Token.EXPR_RESULT, doubleNot);
    process(expr);
    Assert.assertEquals(Token.NAME, expr.getFirstChild().getType());
    Assert.assertEquals("x", expr.getFirstChild().getString());
  }

  @Test
  public void tryMinimizeCondition_givenDeMorganLaws_shouldFoldNotAndOr() {
    Node notA = new Node(Token.NOT, Node.newString(Token.NAME, "a"));
    Node notB = new Node(Token.NOT, Node.newString(Token.NAME, "b"));
    Node and = new Node(Token.AND, notA, notB);
    Node notAnd = new Node(Token.NOT, and);
    Node expr = new Node(Token.EXPR_RESULT, notAnd);
    process(expr);
    Assert.assertEquals(Token.OR, expr.getFirstChild().getType());
  }

  @Test
  public void tryMinimizeIf_givenReturnExpressBlocksInBothBranches_shouldFoldToReturnHook() {
    Node return1 = new Node(Token.RETURN, Node.newNumber(1.0));
    Node thenBlock = new Node(Token.BLOCK, return1);
    Node return2 = new Node(Token.RETURN, Node.newNumber(2.0));
    Node elseBlock = new Node(Token.BLOCK, return2);
    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "cond"), thenBlock, elseBlock);
    Node parentBlock = new Node(Token.BLOCK, ifNode);
    process(parentBlock);
    Assert.assertEquals(Token.RETURN, parentBlock.getFirstChild().getType());
    Assert.assertEquals(Token.HOOK, parentBlock.getFirstChild().getFirstChild().getType());
  }

  @Test
  public void tryMinimizeIf_givenAssignBlocksInBothBranches_shouldFoldToAssignHook() {
    Node assign1 = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(1.0));
    Node thenBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, assign1));
    Node assign2 = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newNumber(2.0));
    Node elseBlock = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, assign2));
    Node ifNode = new Node(Token.IF, Node.newString(Token.NAME, "cond"), thenBlock, elseBlock);
    Node parentBlock = new Node(Token.BLOCK, ifNode);
    process(parentBlock);
    Assert.assertEquals(Token.EXPR_RESULT, parentBlock.getFirstChild().getType());
    Assert.assertEquals(Token.ASSIGN, parentBlock.getFirstChild().getFirstChild().getType());
    Assert.assertEquals(Token.HOOK, parentBlock.getFirstChild().getFirstChild().getLastChild().getType());
  }

  @Test
  public void containsUnicodeEscape_givenEscapedStrings_shouldDetectCorrectly() {
    Assert.assertFalse(FoldConstants.containsUnicodeEscape("abc"));
    Assert.assertTrue(FoldConstants.containsUnicodeEscape("\u0000"));
  }
}