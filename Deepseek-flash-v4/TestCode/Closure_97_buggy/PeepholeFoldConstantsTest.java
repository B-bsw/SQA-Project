package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeFoldConstantsTest {
    private PeepholeFoldConstants peepholeFoldConstants;
    private Node node;

    @Before
    public void setUp() {
        peepholeFoldConstants = new PeepholeFoldConstants();
    }

    @Test
    public void testOptimizeSubtreeWithNullNode() {
        Node result = peepholeFoldConstants.optimizeSubtree(null);
        assertNull("Expected null for null subtree", result);
    }

    @Test
    public void testOptimizeSubtreeWithTypeofNode() {
        node = new Node(Token.TYPEOF);
        Node child = Node.newString("test");
        node.addChildToFront(child);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("typeof should fold to string", Token.STRING, result.getType());
        assertEquals("Typeof result value should be 'string'", "string", result.getString());
    }

    @Test
    public void testOptimizeSubtreeWithNotNodeAndBooleanValue() {
        node = new Node(Token.NOT);
        Node trueNode = new Node(Token.TRUE);
        node.addChildToFront(trueNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("NOT TRUE should fold to FALSE", Token.FALSE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeWithNotNodeAndUnknownValue() {
        node = new Node(Token.NOT);
        Node nameNode = new Node(Token.NAME, "unknownVar");
        node.addChildToFront(nameNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertSame("Unknown value should keep NOT node", node, result);
    }

    @Test
    public void testTryFoldUnaryOperatorWithNegationAndNumber() {
        node = new Node(Token.NEG);
        Node numberNode = Node.newNumber(5.0);
        node.addChildToFront(numberNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Negation should fold to number", Token.NUMBER, result.getType());
        assertEquals("Negation of 5 should be -5", -5.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldUnaryOperatorWithNonNumericValue() {
        node = new Node(Token.NEG);
        Node nameNode = new Node(Token.NAME, "Infinity");
        node.addChildToFront(nameNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Negation should fold to number", Token.NUMBER, result.getType());
        assertEquals("Negation of Infinity should be -Infinity", Double.NEGATIVE_INFINITY, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldUnaryOperatorWithNaN() {
        node = new Node(Token.NEG);
        Node nanNode = new Node(Token.NAME, "NaN");
        node.addChildToFront(nanNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertSame("NaN should be replaced with NAME", Token.NAME, result.getType());
        assertEquals("NaN should be replaced", "NaN", result.getString());
    }

    @Test
    public void testTryFoldUnaryOperatorWithBitNot() {
        node = new Node(Token.BITNOT);
        Node numberNode = Node.newNumber(5.0);
        node.addChildToFront(numberNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("BitNot should fold to number", Token.NUMBER, result.getType());
        assertEquals("BitNot of 5 should be -6", -6.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithAddAndStrings() {
        node = new Node(Token.ADD);
        Node stringNode1 = Node.newString("Hello ");
        Node stringNode2 = Node.newString("World");
        node.addChildToFront(stringNode1);
        node.addChildToFront(stringNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Add should fold to string", Token.STRING, result.getType());
        assertEquals("Concatenation should be 'Hello World'", "Hello World", result.getString());
    }

    @Test
    public void testTryFoldBinaryOperatorWithAddAndNumbers() {
        node = new Node(Token.ADD);
        Node numNode1 = Node.newNumber(3.0);
        Node numNode2 = Node.newNumber(4.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Add should fold to number", Token.NUMBER, result.getType());
        assertEquals("3 + 4 should be 7", 7.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithSubtract() {
        node = new Node(Token.SUB);
        Node numNode1 = Node.newNumber(10.0);
        Node numNode2 = Node.newNumber(4.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Subtract should fold to number", Token.NUMBER, result.getType());
        assertEquals("10 - 4 should be 6", 6.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithMultiply() {
        node = new Node(Token.MUL);
        Node numNode1 = Node.newNumber(6.0);
        Node numNode2 = Node.newNumber(7.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Multiply should fold to number", Token.NUMBER, result.getType());
        assertEquals("6 * 7 should be 42", 42.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithDivide() {
        node = new Node(Token.DIV);
        Node numNode1 = Node.newNumber(10.0);
        Node numNode2 = Node.newNumber(2.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Divide should fold to number", Token.NUMBER, result.getType());
        assertEquals("10 / 2 should be 5", 5.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithDivideByZero() {
        node = new Node(Token.DIV);
        Node numNode1 = Node.newNumber(10.0);
        Node numNode2 = Node.newNumber(0.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNull("Division by zero should return null", result);
    }

    @Test
    public void testTryFoldBinaryOperatorWithShift() {
        node = new Node(Token.LSH);
        Node numNode1 = Node.newNumber(1.0);
        Node numNode2 = Node.newNumber(4.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Shift should fold to number", Token.NUMBER, result.getType());
        assertEquals("1 << 4 should be 16", 16.0, result.getDouble(), 0.001);
    }

    @Test
    public void testTryFoldBinaryOperatorWithComparison() {
        node = new Node(Token.LT);
        Node numNode1 = Node.newNumber(3.0);
        Node numNode2 = Node.newNumber(5.0);
        node.addChildToFront(numNode1);
        node.addChildToFront(numNode2);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("LT should fold to boolean", Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldBinaryOperatorWithAndOr() {
        node = new Node(Token.AND);
        Node trueNode = new Node(Token.TRUE);
        Node falseNode = new Node(Token.FALSE);
        node.addChildToFront(trueNode);
        node.addChildToFront(falseNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("AND should fold to FALSE", Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldBinaryOperatorWithGetProp() {
        node = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME, "obj");
        Node propNode = Node.newString("length");
        node.addChildToFront(objNode);
        node.addChildToFront(propNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertSame("GETPROP should not fold", node, result);
    }

    @Test
    public void testTryFoldInstanceofWithLiteralAndObject() {
        node = new Node(Token.INSTANCEOF);
        Node objNode = new Node(Token.OBJECTLIT);
        Node nameNode = new Node(Token.NAME, "Object");
        node.addChildToFront(objNode);
        node.addChildToFront(nameNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
        assertEquals("Instanceof should fold to TRUE", Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldAssignWithSimpleAssignment() {
        node = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME, "x");
        Node numNode = Node.newNumber(5.0);
        node.addChildToFront(nameNode);
        node.addChildToFront(numNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertSame("Simple assignment should not fold", node, result);
    }

    @Test
    public void testTryFoldGetElemWithArrayAndNumber() {
        node = new Node(Token.GETELEM);
        Node arrayNode = new Node(Token.ARRAYLIT);
        Node numNode = Node.newNumber(0.0);
        node.addChildToFront(arrayNode);
        node.addChildToFront(numNode);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(node);
        Node result = peepholeFoldConstants.optimizeSubtree(node);
        assertNotNull("Result should not be null", result);
    }
}