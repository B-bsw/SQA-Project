package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeFoldConstantsTest {
    private PeepholeFoldConstants peepholeFoldConstants;

    @Before
    public void setUp() {
        peepholeFoldConstants = new PeepholeFoldConstants();
    }

    @Test
    public void testFoldArithmeticOp_Numbers_Addition() {
        Node left = Node.newNumber(2.0);
        Node right = Node.newNumber(3.0);
        Node opNode = new Node(Token.ADD, left, right);
        
        Node result = peepholeFoldConstants.tryFoldArithmeticOp(opNode, left, right);
        
        assertNotNull("Result should not be null for numeric addition", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldArithmeticOp_Numbers_Subtraction() {
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(4.0);
        Node opNode = new Node(Token.SUB, left, right);
        
        Node result = peepholeFoldConstants.tryFoldArithmeticOp(opNode, left, right);
        
        assertNotNull("Result should not be null for numeric subtraction", result);
        assertEquals(6.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testFoldArithmeticOp_NullLeft_ReturnsSubtree() {
        Node right = Node.newNumber(3.0);
        Node opNode = new Node(Token.ADD, right);
        
        Node result = peepholeFoldConstants.tryFoldArithmeticOp(opNode, null, right);
        
        assertSame("Should return original node when left is null", opNode, result);
    }

    @Test
    public void testFoldArithmeticOp_NullRight_ReturnsSubtree() {
        Node left = Node.newNumber(3.0);
        Node opNode = new Node(Token.ADD, left);
        
        Node result = peepholeFoldConstants.tryFoldArithmeticOp(opNode, left, null);
        
        assertSame("Should return original node when right is null", opNode, result);
    }

    @Test
    public void testTryFoldComparison_LessThan_Strings() {
        Node left = Node.newString("apple");
        Node right = Node.newString("banana");
        Node compNode = new Node(Token.LT, left, right);
        
        Node result = peepholeFoldConstants.tryFoldComparison(compNode, left, right);
        
        assertNotNull("Comparison result should not be null", result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparison_GreaterThanEqual_Strings() {
        Node left = Node.newString("banana");
        Node right = Node.newString("apple");
        Node compNode = new Node(Token.GE, left, right);
        
        Node result = peepholeFoldConstants.tryFoldComparison(compNode, left, right);
        
        assertNotNull("Comparison result should not be null", result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparison_Undefined_Left() {
        Node left = Node.newString("undefined");
        left.setType(Token.NAME);
        Node right = Node.newNumber(5.0);
        Node compNode = new Node(Token.EQ, left, right);
        
        Node result = peepholeFoldConstants.tryFoldComparison(compNode, left, right);
        
        assertNotNull("Comparison result should not be null", result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldGetProp_ArrayLength() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToBack(Node.newNumber(1.0));
        arrayNode.addChildToBack(Node.newNumber(2.0));
        arrayNode.addChildToBack(Node.newNumber(3.0));
        
        Node lengthNode = new Node(Token.GETFIELD, arrayNode, Node.newString("length"));
        
        Node result = peepholeFoldConstants.tryFoldGetProp(lengthNode, arrayNode, Node.newString("length"));
        
        assertNotNull("Length folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldGetProp_StringLength() {
        Node stringNode = Node.newString("hello");
        Node lengthNode = new Node(Token.GETFIELD, stringNode, Node.newString("length"));
        
        Node result = peepholeFoldConstants.tryFoldGetProp(lengthNode, stringNode, Node.newString("length"));
        
        assertNotNull("String length folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldGetProp_InvalidProp_ReturnsNull() {
        Node objectNode = new Node(Token.NAME, "obj");
        objectNode.putStringProp(Node.SOURCE_PROP, "obj");
        
        Node getPropNode = new Node(Token.GETFIELD, objectNode, Node.newString("invalid"));
        
        Node result = peepholeFoldConstants.tryFoldGetProp(getPropNode, objectNode, Node.newString("invalid"));
        
        assertNull("Should return null for invalid property access", result);
    }

    @Test
    public void testTryFoldTypeof_Function() {
        Node funcNode = new Node(Token.FUNCTION);
        Node typeofNode = new Node(Token.TYPEOF, funcNode);
        
        Node result = peepholeFoldConstants.tryFoldTypeof(typeofNode);
        
        assertNotNull("Typeof should be foldable", result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("function", result.getString());
    }

    @Test
    public void testTryFoldTypeof_String() {
        Node stringNode = Node.newString("test");
        Node typeofNode = new Node(Token.TYPEOF, stringNode);
        
        Node result = peepholeFoldConstants.tryFoldTypeof(typeofNode);
        
        assertNotNull("Typeof should be foldable", result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testTryFoldUnaryOperator_Not_True() {
        Node trueNode = new Node(Token.TRUE);
        Node notNode = new Node(Token.NOT, trueNode);
        
        Node result = peepholeFoldConstants.tryFoldUnaryOperator(notNode);
        
        assertNotNull("NOT folding should not be null", result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldUnaryOperator_Negate_Number() {
        Node numNode = Node.newNumber(5.0);
        Node negNode = new Node(Token.NEG, numNode);
        
        Node result = peepholeFoldConstants.tryFoldUnaryOperator(negNode);
        
        assertNotNull("Negation folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldUnaryOperator_Pos_Number() {
        Node numNode = Node.newNumber(5.0);
        Node posNode = new Node(Token.POS, numNode);
        
        Node result = peepholeFoldConstants.tryFoldUnaryOperator(posNode);
        
        assertNotNull("POS folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldAndOr_And_TrueAndTrue() {
        Node trueNode1 = new Node(Token.TRUE);
        Node trueNode2 = new Node(Token.TRUE);
        Node andNode = new Node(Token.AND, trueNode1, trueNode2);
        
        Node result = peepholeFoldConstants.tryFoldAndOr(andNode, trueNode1, trueNode2);
        
        assertNotNull("AND folding should not be null", result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldAndOr_And_TrueAndFalse() {
        Node trueNode = new Node(Token.TRUE);
        Node falseNode = new Node(Token.FALSE);
        Node andNode = new Node(Token.AND, trueNode, falseNode);
        
        Node result = peepholeFoldConstants.tryFoldAndOr(andNode, trueNode, falseNode);
        
        assertNotNull("AND folding should not be null", result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldAndOr_Or_FalseAndFalse() {
        Node falseNode1 = new Node(Token.FALSE);
        Node falseNode2 = new Node(Token.FALSE);
        Node orNode = new Node(Token.OR, falseNode1, falseNode2);
        
        Node result = peepholeFoldConstants.tryFoldAndOr(orNode, falseNode1, falseNode2);
        
        assertNotNull("OR folding should not be null", result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldShift_LeftShift_ValidValues() {
        Node left = Node.newNumber(4.0);
        Node right = Node.newNumber(2.0);
        Node shiftNode = new Node(Token.LSH, left, right);
        
        Node result = peepholeFoldConstants.tryFoldShift(shiftNode, left, right);
        
        assertNotNull("Shift folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(16.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldShift_RightShift_ValidValues() {
        Node left = Node.newNumber(16.0);
        Node right = Node.newNumber(2.0);
        Node shiftNode = new Node(Token.RSH, left, right);
        
        Node result = peepholeFoldConstants.tryFoldShift(shiftNode, left, right);
        
        assertNotNull("Shift folding should not be null", result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.0001);
    }

    @Test
    public void testTryFoldShift_ShiftOutOfRange_ReturnsNull() {
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(32.0);
        Node shiftNode = new Node(Token.LSH, left, right);
        
        Node result = peepholeFoldConstants.tryFoldShift(shiftNode, left, right);
        
        assertNull("Shift out of range should return null", result);
    }

    @Test
    public void testTryFoldAdd_Strings() {
        Node left = Node.newString("hello ");
        Node right = Node.newString("world");
        Node addNode = new Node(Token.ADD, left, right);
        
        Node result = peepholeFoldConstants.tryFoldAdd(addNode, left, right);
        
        assertNotNull("String addition should not be null", result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello world", result.getString());
    }

    @Test
    public void testTryFoldAdd_NumberAndString() {
        Node left = Node.newNumber(5.0);
        Node right = Node.newString(" apples");
        Node addNode = new Node(Token.ADD, left, right);
        
        Node result = peepholeFoldConstants.tryFoldAdd(addNode, left, right);
        
        assertNotNull("Mixed addition should not be null", result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("5 apples", result.getString());
    }

    @Test
    public void testTryFoldAdd_NonFoldable_ReturnsNull() {
        Node left = new Node(Token.NAME, "x");
        Node right = new Node(Token.NAME, "y");
        Node addNode = new Node(Token.ADD, left, right);
        
        Node result = peepholeFoldConstants.tryFoldAdd(addNode, left, right);
        
        assertNull("Non-foldable addition should return null", result);
    }
}