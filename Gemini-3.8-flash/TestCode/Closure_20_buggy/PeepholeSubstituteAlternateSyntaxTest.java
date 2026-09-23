package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeSubstituteAlternateSyntaxTest {

    private PeepholeSubstituteAlternateSyntax optimizer;

    @Before
    public void setUp() {
        optimizer = new PeepholeSubstituteAlternateSyntax(false);
    }

    @Test
    public void testOptimizeSubtreeReturnWithNoChildren() {
        Node node = new Node(Token.RETURN);
        Node result = optimizer.optimizeSubtree(node);
        assertEquals(node, result);
    }

    @Test
    public void testOptimizeSubtreeReturnWithValue() {
        Node returnNode = new Node(Token.RETURN);
        Node value = Node.newString("test");
        returnNode.addChildToBack(value);
        Node result = optimizer.optimizeSubtree(returnNode);
        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
    }

    @Test
    public void testOptimizeSubtreeThrow() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(Node.newString("error"));
        Node result = optimizer.optimizeSubtree(throwNode);
        assertNotNull(result);
        assertEquals(Token.THROW, result.getType());
    }

    @Test
    public void testOptimizeSubtreeNotWithSimplifiableCondition() {
        Node notNode = new Node(Token.NOT);
        Node child = new Node(Token.TRUE);
        notNode.addChildToBack(child);
        Node result = optimizer.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeIfWithBothBranches() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToBack(new Node(Token.RETURN));
        Node elseBlock = new Node(Token.BLOCK);
        elseBlock.addChildToBack(new Node(Token.RETURN));
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(thenBlock);
        ifNode.addChildToBack(elseBlock);
        Node result = optimizer.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeHook() {
        Node hookNode = new Node(Token.HOOK);
        hookNode.addChildToBack(new Node(Token.TRUE));
        hookNode.addChildToBack(Node.newString("a"));
        hookNode.addChildToBack(Node.newString("b"));
        Node result = optimizer.optimizeSubtree(hookNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeNotNull() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToBack(Node.newString("x"));
        Node result = optimizer.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeNewString() {
        Node newNode = new Node(Token.NEW);
        Node target = Node.newString("String");
        Node arg = Node.newString("hello");
        newNode.addChildToBack(target);
        newNode.addChildToBack(arg);
        Node result = optimizer.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeNewInvalidRegexp() {
        Node newNode = new Node(Token.NEW);
        Node target = Node.newString("RegExp");
        Node pattern = Node.newString("[");
        Node flags = Node.newString("g");
        newNode.addChildToBack(target);
        newNode.addChildToBack(pattern);
        newNode.addChildToBack(flags);
        Node result = optimizer.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeNewValidRegexp() {
        Node newNode = new Node(Token.NEW);
        Node target = Node.newString("RegExp");
        Node pattern = Node.newString("abc");
        Node flags = Node.newString("g");
        newNode.addChildToBack(target);
        newNode.addChildToBack(pattern);
        newNode.addChildToBack(flags);
        Node result = optimizer.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeCallWithString() {
        Node callNode = new Node(Token.CALL);
        Node target = Node.newString("String");
        Node arg = Node.newNumber(123);
        callNode.addChildToBack(target);
        callNode.addChildToBack(arg);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeCommaOperator() {
        Node commaNode = new Node(Token.COMMA);
        commaNode.addChildToBack(Node.newString("a"));
        commaNode.addChildToBack(Node.newString("b"));
        Node result = optimizer.optimizeSubtree(commaNode);
        assertNotNull(result);
    }

    @Test
    public void testTryJoinForConditionWithLateFalse() {
        PeepholeSubstituteAlternateSyntax lateOptimizer = new PeepholeSubstituteAlternateSyntax(false);
        Node forNode = new Node(Token.FOR);
        Node block = new Node(Token.BLOCK);
        forNode.addChildToBack(block);
        lateOptimizer.optimizeSubtree(forNode);
    }

    @Test
    public void testTryJoinForConditionWithLateTrue() {
        PeepholeSubstituteAlternateSyntax lateOptimizer = new PeepholeSubstituteAlternateSyntax(true);
        Node forNode = new Node(Token.FOR);
        Node block = new Node(Token.BLOCK);
        forNode.addChildToBack(block);
        lateOptimizer.optimizeSubtree(forNode);
    }

    @Test
    public void testTryFoldSimpleFunctionCallWithNullTarget() {
        Node callNode = new Node(Token.CALL);
        Node result = optimizer.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldStandardConstructorsWithNull() {
        Node newNode = new Node(Token.NEW);
        Node target = Node.newString("Array");
        newNode.addChildToBack(target);
        Node result = optimizer.optimizeSubtree(newNode);
        assertNotNull(result);
    }
}