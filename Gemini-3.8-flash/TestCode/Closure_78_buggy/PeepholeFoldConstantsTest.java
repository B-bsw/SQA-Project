package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants peepholeFoldConstants;

    @Before
    public void setUp() {
        peepholeFoldConstants = new PeepholeFoldConstants();
    }

    @Test
    public void testOptimizeSubtree_NullNode_ReturnsNull() {
        assertNull(peepholeFoldConstants.optimizeSubtree(null));
    }

    @Test
    public void testOptimizeSubtree_NonFoldableNode_ReturnsSameNode() {
        Node node = new Node(Token.EMPTY);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertSame(node, result);
    }

    @Test
    public void testTryFoldGetElem_ArrayLiteral_NormalIndex() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("test"));
        arrayLit.addChildToBack(Node.newNumber(42));

        Node getElem = Node.newGetElem(arrayLit, Node.newNumber(1));
        Node result = peepholeFoldConstants.optimizeSubtree(getElem);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldGetElem_ArrayLiteral_OutOfBounds() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("test"));

        Node getElem = Node.newGetElem(arrayLit, Node.newNumber(5));
        Node result = peepholeFoldConstants.optimizeSubtree(getElem);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }

    @Test
    public void testTryFoldGetElem_ArrayLiteral_NegativeIndex() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("test"));

        Node getElem = Node.newGetElem(arrayLit, Node.newNumber(-1));
        Node result = peepholeFoldConstants.optimizeSubtree(getElem);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }

    @Test
    public void testTryFoldGetElem_ArrayLiteral_NonNumberIndex() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("test"));

        Node getElem = Node.newGetElem(arrayLit, Node.newString("0"));
        Node result = peepholeFoldConstants.optimizeSubtree(getElem);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldGetProp_Length() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newString("a"));
        arrayLit.addChildToBack(Node.newString("b"));

        Node getProp = new Node(Token.GETPROP, arrayLit, Node.newString("length"));
        Node result = peepholeFoldConstants.optimizeSubtree(getProp);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldTypeof_StringLiteral() {
        Node typeofNode = new Node(Token.TYPEOF, Node.newString("hello"));
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testTryFoldTypeof_NumberLiteral() {
        Node typeofNode = new Node(Token.TYPEOF, Node.newNumber(42));
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testTryFoldTypeof_UndefinedName() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        Node typeofNode = new Node(Token.TYPEOF, nameNode);
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testTryFoldUnaryOperator_Negation_NegativeNumber() {
        Node negNode = new Node(Token.NEG, Node.newNumber(5));
        Node result = peepholeFoldConstants.optimizeSubtree(negNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldUnaryOperator_Negation_PositiveNumber() {
        Node negNode = new Node(Token.NEG, Node.newNumber(-3));
        Node result = peepholeFoldConstants.optimizeSubtree(negNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldUnaryOperator_Negation_Infinity() {
        Node nameNode = Node.newString(Token.NAME, "Infinity");
        Node negNode = new Node(Token.NEG, nameNode);
        Node result = peepholeFoldConstants.optimizeSubtree(negNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.NEGATIVE_INFINITY, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldUnaryOperator_Not_TrueNode() {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        Node result = peepholeFoldConstants.optimizeSubtree(notNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.FALSE || result.getType() == Token.TRUE);
    }

    @Test
    public void testTryFoldBinaryOperator_Addition_Number() {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(20);
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(30.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperator_Addition_StringConcatenation() {
        Node left = Node.newString("Hello ");
        Node right = Node.newString("World");
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("Hello World", result.getString());
    }

    @Test
    public void testTryFoldBinaryOperator_Addition_NumberAndString() {
        Node left = Node.newNumber(42);
        Node right = Node.newString(" test");
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("42 test", result.getString());
    }

    @Test
    public void testTryFoldBinaryOperator_Subtraction_Numbers() {
        Node left = Node.newNumber(20);
        Node right = Node.newNumber(5);
        Node subNode = new Node(Token.SUB, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(subNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(15.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperator_Multiplication() {
        Node left = Node.newNumber(6);
        Node right = Node.newNumber(7);
        Node mulNode = new Node(Token.MUL, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(mulNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperator_Division() {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(2);
        Node divNode = new Node(Token.DIV, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(divNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperator_Division_ByZero() {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(0);
        Node divNode = new Node(Token.DIV, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(divNode);
        assertNotNull(result);
        assertEquals(Token.DIV, result.getType());
    }

    @Test
    public void testTryFoldBinaryOperator_Modulo() {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(3);
        Node modNode = new Node(Token.MOD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(modNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldComparison_LessThan_Number() {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(10);
        Node compNode = new Node(Token.LT, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparison_LessThan_False() {
        Node left = Node.newNumber(10);
        Node right = Node.newNumber(5);
        Node compNode = new Node(Token.LT, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldComparison_GreaterThan_Number() {
        Node left = Node.newNumber(15);
        Node right = Node.newNumber(10);
        Node compNode = new Node(Token.GT, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparison_EqualNumbers() {
        Node left = Node.newNumber(5);
        Node right = Node.newNumber(5);
        Node compNode = new Node(Token.EQ, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldComparison_StringComparison() {
        Node left = Node.newString("apple");
        Node right = Node.newString("banana");
        Node compNode = new Node(Token.LT, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparison_UndefinedAndNull() {
        Node undefNode = Node.newString(Token.NAME, "undefined");
        Node nullNode = new Node(Token.NULL);
        Node compNode = new Node(Token.EQ, undefNode, nullNode);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldAndOr_And_TrueAndTrue() {
        Node left = new Node(Token.TRUE);
        Node right = new Node(Token.TRUE);
        Node andNode = new Node(Token.AND, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(andNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldAndOr_Or_FalseAndNumber() {
        Node left = new Node(Token.FALSE);
        Node right = Node.newNumber(42);
        Node orNode = new Node(Token.OR, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(orNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldShift_LeftShift() {
        Node left = Node.newNumber(1);
        Node right = Node.newNumber(4);
        Node shiftNode = new Node(Token.LSH, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(shiftNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(16.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldShift_RightShift() {
        Node left = Node.newNumber(16);
        Node right = Node.newNumber(2);
        Node shiftNode = new Node(Token.RSH, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(shiftNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldAssign_SimpleAssignment() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node valueNode = Node.newNumber(5);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        Node result = peepholeFoldConstants.optimizeSubtree(assignNode);
        assertNotNull(result);
        assertEquals(Token.ASSIGN, result.getType());
    }

    @Test
    public void testTryFoldKnownMethods_StringIndexOf() {
        Node callTarget = new Node(Token.GETPROP, Node.newString("hello world"), Node.newString("indexOf"));
        Node arg = Node.newString("world");
        Node callNode = new Node(Token.CALL, callTarget, arg);
        Node result = peepholeFoldConstants.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldKnownMethods_StringSubstring() {
        Node callTarget = new Node(Token.GETPROP, Node.newString("hello world"), Node.newString("substring"));
        Node arg1 = Node.newNumber(0);
        Node arg2 = Node.newNumber(5);
        Node callNode = new Node(Token.CALL, callTarget, arg1, arg2);
        Node result = peepholeFoldConstants.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testTryFoldKnownMethods_StringToUpperCase() {
        Node callTarget = new Node(Token.GETPROP, Node.newString("hello"), Node.newString("toUpperCase"));
        Node callNode = new Node(Token.CALL, callTarget);
        Node result = peepholeFoldConstants.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("HELLO", result.getString());
    }

    @Test
    public void testTryFoldKnownMethods_StringToLowerCase() {
        Node callTarget = new Node(Token.GETPROP, Node.newString("HELLO"), Node.newString("toLowerCase"));
        Node callNode = new Node(Token.CALL, callTarget);
        Node result = peepholeFoldConstants.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testTryFoldCtorCall_ArrayConstructor_WithNumbers() {
        Node ctorNode = new Node(Token.NEW, Node.newString("Array"));
        ctorNode.addChildToBack(Node.newNumber(1));
        ctorNode.addChildToBack(Node.newNumber(2));
        ctorNode.addChildToBack(Node.newNumber(3));
        Node result = peepholeFoldConstants.optimizeSubtree(ctorNode);
        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
    }

    @Test
    public void testTryFoldCtorCall_StringConstructor() {
        Node ctorNode = new Node(Token.NEW, Node.newString("String"));
        ctorNode.addChildToBack(Node.newString("test"));
        Node result = peepholeFoldConstants.optimizeSubtree(ctorNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldTypeof_Function() {
        Node functionNode = new Node(Token.FUNCTION);
        Node typeofNode = new Node(Token.TYPEOF, functionNode);
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("function", result.getString());
    }

    @Test
    public void testTryFoldTypeof_Null() {
        Node nullNode = new Node(Token.NULL);
        Node typeofNode = new Node(Token.TYPEOF, nullNode);
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testTryFoldTypeof_ArrayLit() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        Node typeofNode = new Node(Token.TYPEOF, arrayNode);
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testTryFoldTypeof_ObjectLit() {
        Node objectNode = new Node(Token.OBJECTLIT);
        Node typeofNode = new Node(Token.TYPEOF, objectNode);
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testTryFoldInstanceof_StringIsInstanceOfObject() {
        Node left = Node.newString("test");
        Node right = new Node(Token.GETPROP, Node.newString("Object"), Node.newString("prototype"));
        Node instanceNode = new Node(Token.INSTANCEOF, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(instanceNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldAdd_NullAndString() {
        Node left = new Node(Token.NULL);
        Node right = Node.newString("test");
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("nulltest", result.getString());
    }

    @Test
    public void testTryFoldAdd_UndefinedAndString() {
        Node left = Node.newString(Token.NAME, "undefined");
        Node right = Node.newString("test");
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefinedtest", result.getString());
    }

    @Test
    public void testTryFoldComparison_NaNComparison() {
        Node left = Node.newString(Token.NAME, "NaN");
        Node right = Node.newNumber(0);
        Node compNode = new Node(Token.EQ, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldComparison_undefinedEquality() {
        Node left = Node.newString(Token.NAME, "undefined");
        Node right = new Node(Token.TRUE);
        Node compNode = new Node(Token.NE, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldComparison_StringAndNumber() {
        Node left = Node.newString("5");
        Node right = Node.newNumber(5);
        Node compNode = new Node(Token.EQ, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertTrue(result.getType() == Token.TRUE || result.getType() == Token.FALSE);
    }

    @Test
    public void testTryFoldComparison_DifferentStrings() {
        Node left = Node.newString("hello");
        Node right = Node.newString("world");
        Node compNode = new Node(Token.SHEQ, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(compNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldKnownMethods_substr() {
        Node callTarget = new Node(Token.GETPROP, Node.newString("hello world"), Node.newString("substr"));
        Node arg1 = Node.newNumber(6);
        Node callNode = new Node(Token.CALL, callTarget, arg1);
        Node result = peepholeFoldConstants.optimizeSubtree(callNode);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("world", result.getString());
    }

    @Test
    public void testTryFoldKnownMethods_ArrayLength() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToBack(Node.newString("a"));
        arrayNode.addChildToBack(Node.newString("b"));
        Node getPropNode = new Node(Token.GETPROP, arrayNode, Node.newString("length"));
        Node result = peepholeFoldConstants.optimizeSubtree(getPropNode);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperator_Addition_StringConcatMutiple() {
        Node innerAdd = new Node(Token.ADD, Node.newString("a"), Node.newString("b"));
        Node outerAdd = new Node(Token.ADD, innerAdd, Node.newString("c"));
        Node result = peepholeFoldConstants.optimizeSubtree(outerAdd);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("abc", result.getString());
    }

    @Test
    public void testTryFoldBinaryOperator_Addition_NumberAndBool() {
        Node left = Node.newNumber(1);
        Node right = new Node(Token.TRUE);
        Node addNode = new Node(Token.ADD, left, right);
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        assertNotNull(result);
    }
}