package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeSubstituteAlternateSyntaxTest {
    private PeepholeSubstituteAlternateSyntax optimizer;
    private Node dummyNode;

    @Before
    public void setUp() {
        optimizer = new PeepholeSubstituteAlternateSyntax();
        dummyNode = new Node(Token.EMPTY);
    }

    @Test
    public void testOptimizeSubtreeWithReturnNode() {
        Node returnNode = new Node(Token.RETURN);
        returnNode.addChildToFront(Node.newString("value"));
        Node result = optimizer.optimizeSubtree(returnNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithNotNode() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToFront(new Node(Token.NAME, "a"));
        Node result = optimizer.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithIfNode() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "cond");
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToFront(new Node(Token.EXPR_RESULT, new Node(Token.NAME, "x")));
        ifNode.addChildrenToBack(cond);
        ifNode.addChildrenToBack(thenBlock);
        Node result = optimizer.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithExprResult() {
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToFront(new Node(Token.NAME, "x"));
        Node result = optimizer.optimizeSubtree(exprResult);
        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
    }

    @Test
    public void testOptimizeSubtreeWithHookNode() {
        Node hookNode = new Node(Token.HOOK);
        hookNode.addChildToFront(new Node(Token.NAME, "cond"));
        hookNode.addChildToBack(Node.newString("a"));
        hookNode.addChildToBack(Node.newString("b"));
        Node result = optimizer.optimizeSubtree(hookNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithNoChildren() {
        Node emptyNode = new Node(Token.EMPTY);
        Node result = optimizer.optimizeSubtree(emptyNode);
        assertNull(result);
    }

    @Test
    public void testTryMinimizeNotWithComparisonOperators() {
        int[] operators = {Token.EQ, Token.NE, Token.SHEQ, Token.SHNE};
        for (int op : operators) {
            Node notNode = new Node(Token.NOT);
            Node child = new Node(op);
            child.addChildToBack(new Node(Token.NAME, "x"));
            child.addChildToBack(new Node(Token.NUMBER, 0));
            notNode.addChildToFront(child);
            Node parent = new Node(Token.EXPR_RESULT);
            parent.addChildToFront(notNode);
            optimizer.optimizeSubtree(parent);
            assertTrue(notNode.getType() == Token.NOT);
        }
    }

    @Test
    public void testTryFoldRegularExpressionConstructor() {
        Node callNode = new Node(Token.CALL);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToFront(Node.newString("RegExp"));
        callNode.addChildToFront(getProp);
        callNode.addChildToBack(Node.newString("test"));
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldArrayConstructor() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "Array"));
        callNode.addChildToBack(new Node(Token.NUMBER, 1));
        callNode.addChildToBack(new Node(Token.NUMBER, 2));
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldArrayConstructorWithZeroArgs() {
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "Array"));
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithForLoop() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.NAME, "i"));
        Node result = optimizer.optimizeSubtree(forNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithWhileLoop() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.NAME, "cond");
        whileNode.addChildToFront(cond);
        whileNode.addChildToBack(new Node(Token.BLOCK));
        Node result = optimizer.optimizeSubtree(whileNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithDoLoop() {
        Node doNode = new Node(Token.DO);
        doNode.addChildToBack(new Node(Token.BLOCK));
        Node result = optimizer.optimizeSubtree(doNode);
        assertNotNull(result);
    }
}