package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants optimizer;
    private Node root;
    private Node parent;
    private Node subtree;

    @Before
    public void setUp() {
        optimizer = new PeepholeFoldConstants();
        root = new Node(Token.SCRIPT);
        parent = new Node(Token.BLOCK);
        root.addChildToBack(parent);
    }

    @Test
    public void testOptimizeSubtreeNullChildren() {
        Node n = new Node(Token.ADD);
        parent.addChildToBack(n);
        assertNull(optimizer.optimizeSubtree(n));
    }

    @Test
    public void testTryFoldTypeofString() {
        Node n = new Node(Token.TYPEOF);
        Node str = Node.newString("hello");
        n.addChildToBack(str);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testTryFoldTypeofNumber() {
        Node n = new Node(Token.TYPEOF);
        Node num = Node.newNumber(42.5);
        n.addChildToBack(num);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals("number", result.getString());
    }

    @Test
    public void testTryFoldTypeofBoolean() {
        Node n = new Node(Token.TYPEOF);
        Node bool = new Node(Token.TRUE);
        n.addChildToBack(bool);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testTryFoldTypeofUndefinedName() {
        Node n = new Node(Token.TYPEOF);
        Node name = Node.newName("undefined");
        n.addChildToBack(name);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testTryFoldUnaryNotConstantBoolean() {
        Node n = new Node(Token.NOT);
        Node bool = new Node(Token.TRUE);
        n.addChildToBack(bool);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldUnaryNegConstantNumber() {
        Node n = new Node(Token.NEG);
        Node num = Node.newNumber(5.0);
        n.addChildToBack(num);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(-5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldUnaryBitnotConstant() {
        Node n = new Node(Token.BITNOT);
        Node num = Node.newNumber(5.0);
        n.addChildToBack(num);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(~5, (int) result.getDouble());
    }

    @Test
    public void testTryFoldUnaryNegNonNumber() {
        Node n = new Node(Token.NEG);
        Node str = Node.newString("abc");
        n.addChildToBack(str);
        parent.addChildToBack(n);
        optimizer.optimizeSubtree(n);
        // Should not crash, should return original
        assertEquals(n, parent.getFirstChild());
    }

    @Test
    public void testTryFoldBinaryAddStrings() {
        Node n = new Node(Token.ADD);
        Node left = Node.newString("a");
        Node right = Node.newString("b");
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("ab", result.getString());
    }

    @Test
    public void testTryFoldArithmeticSubtraction() {
        Node n = new Node(Token.SUB);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(4.0);
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(6.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldArithmeticDivisionByZero() {
        Node n = new Node(Token.DIV);
        Node left = Node.newNumber(10.0);
        Node right = Node.newNumber(0.0);
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNull(result);
        // Should keep original node
        assertEquals(n, parent.getFirstChild());
    }

    @Test
    public void testTryFoldBitwiseAnd() {
        Node n = new Node(Token.BITAND);
        Node left = Node.newNumber(12.0);
        Node right = Node.newNumber(5.0);
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(4, (int) result.getDouble());
    }

    @Test
    public void testTryFoldShiftWithOutOfRange() {
        Node n = new Node(Token.LSH);
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(32);
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNull(result);
    }

    @Test
    public void testTryFoldAndOrLeftUnknown() {
        Node n = new Node(Token.AND);
        Node left = new Node(Token.NAME);
        Node right = Node.newString("x");
        n.addChildToBack(left);
        n.addChildToBack(right);
        parent.addChildToBack(n);
        Node result = optimizer.optimizeSubtree(n);
        assertNotNull(result);
        assertEquals(n, result);
    }
}