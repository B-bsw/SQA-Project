package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeSubstituteAlternateSyntaxTest {
    private PeepholeSubstituteAlternateSyntax peephole;
    private Compiler compiler;
    private Node scriptNode;

    @Before
    public void setUp() {
        compiler = new Compiler();
        peephole = new PeepholeSubstituteAlternateSyntax(false);
        scriptNode = new Node(Token.SCRIPT);
    }

    @Test
    public void testOptimizeSubtreeWithReturnNode() {
        Node returnNode = new Node(Token.RETURN);
        Node result = peephole.optimizeSubtree(returnNode);
        assertNotNull(result);
        assertTrue(result.isReturn());
    }

    @Test
    public void testOptimizeSubtreeWithThrowNode() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(throwNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithNotNode() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithIfNode() {
        Node ifNode = new Node(Token.IF);
        Node cond = Node.newString(Token.NAME, "cond");
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithExprResultNode() {
        Node exprNode = new Node(Token.EXPR_RESULT);
        Node result = peephole.optimizeSubtree(exprNode);
        assertNotNull(result);
        assertTrue(result.isExprResult());
    }

    @Test
    public void testOptimizeSubtreeWithHookNode() {
        Node hookNode = new Node(Token.HOOK);
        Node cond = new Node(Token.NAME);
        hookNode.addChildToFront(cond);
        hookNode.addChildToFront(new Node(Token.NAME));
        hookNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(hookNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithWhileNode() {
        Node whileNode = new Node(Token.WHILE);
        whileNode.addChildToFront(new Node(Token.NAME));
        whileNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(whileNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithDoNode() {
        Node doNode = new Node(Token.DO);
        doNode.addChildToFront(new Node(Token.BLOCK));
        doNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(doNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithForNode() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(forNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithTrueNode() {
        Node trueNode = new Node(Token.TRUE);
        Node result = peephole.optimizeSubtree(trueNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithFalseNode() {
        Node falseNode = new Node(Token.FALSE);
        Node result = peephole.optimizeSubtree(falseNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithNewNode() {
        Node newNode = new Node(Token.NEW);
        Node target = Node.newString(Token.NAME, "Object");
        newNode.addChildToFront(target);
        Node result = peephole.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithCallNode() {
        Node callNode = new Node(Token.CALL);
        Node target = Node.newString(Token.NAME, "foo");
        callNode.addChildToFront(target);
        callNode.addChildToFront(Node.newString(Token.STRING, "arg"));
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithCommaNode() {
        Node commaNode = new Node(Token.COMMA);
        commaNode.addChildToFront(Node.newString(Token.NAME, "a"));
        commaNode.addChildToFront(Node.newString(Token.NAME, "b"));
        Node result = peephole.optimizeSubtree(commaNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithNameNode() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        Node result = peephole.optimizeSubtree(nameNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithBlockNode() {
        Node blockNode = new Node(Token.BLOCK);
        Node result = peephole.optimizeSubtree(blockNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithArrayLitNode() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToFront(Node.newString(Token.STRING, "a"));
        arrayNode.addChildToFront(Node.newString(Token.STRING, "b"));
        Node result = peephole.optimizeSubtree(arrayNode);
        assertNotNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithDefaultCase() {
        Node defaultNode = new Node(Token.SCRIPT);
        Node result = peephole.optimizeSubtree(defaultNode);
        assertNull(result);
    }

    @Test
    public void testOptimizeSubtreeNullInput() {
        Node result = peephole.optimizeSubtree(null);
        assertNull(result);
    }

    @Test
    public void testOptimizeSubtreeWithParentNode() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.RETURN);
        parent.addChildToFront(child);
        child.setParent(parent);
        Node result = peephole.optimizeSubtree(child);
        assertNotNull(result);
    }

    @Test
    public void testLateFlagTrue() {
        PeepholeSubstituteAlternateSyntax latePeephole = new PeepholeSubstituteAlternateSyntax(true);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        Node block = new Node(Token.BLOCK);
        block.addChildToFront(new Node(Token.IF));
        forNode.addChildToFront(block);
        Node result = latePeephole.optimizeSubtree(forNode);
        assertNotNull(result);
    }

    @Test
    public void testTryJoinForConditionWithLateTrueAndIfInBlock() {
        PeepholeSubstituteAlternateSyntax latePeephole = new PeepholeSubstituteAlternateSyntax(true);
        Node forNode = new Node(Token.FOR);
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        forNode.addChildToFront(new Node(Token.EMPTY));
        Node block = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToFront(new Node(Token.NAME, "cond"));
        ifNode.addChildToFront(new Node(Token.BLOCK));
        Node breakNode = new Node(Token.BREAK);
        ifNode.addChildToFront(breakNode);
        block.addChildToFront(ifNode);
        forNode.addChildToFront(block);
        
        Node result = latePeephole.optimizeSubtree(forNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldStandardConstructorsWithRegExp() {
        Node newNode = new Node(Token.NEW);
        Node constructorName = Node.newString(Token.NAME, "RegExp");
        newNode.addChildToFront(constructorName);
        newNode.addChildToFront(Node.newString(Token.STRING, "abc"));
        Node result = peephole.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldStandardConstructorsWithObject() {
        Node newNode = new Node(Token.NEW);
        Node constructorName = Node.newString(Token.NAME, "Object");
        newNode.addChildToFront(constructorName);
        Node result = peephole.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldStandardConstructorsWithArray() {
        Node newNode = new Node(Token.NEW);
        Node constructorName = Node.newString(Token.NAME, "Array");
        newNode.addChildToFront(constructorName);
        Node result = peephole.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldRegularExpressionConstructorWithInvalidFlags() {
        Node newNode = new Node(Token.NEW);
        Node constructorName = Node.newString(Token.NAME, "RegExp");
        newNode.addChildToFront(constructorName);
        newNode.addChildToFront(Node.newString(Token.STRING, "abc"));
        newNode.addChildToFront(Node.newString(Token.STRING, "xyz"));
        Node result = peephole.optimizeSubtree(newNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeStringArrayLiteral() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToFront(Node.newString(Token.STRING, "a"));
        arrayNode.addChildToFront(Node.newString(Token.STRING, "b"));
        Node result = peephole.optimizeSubtree(arrayNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeArrayLiteralWithNonStrings() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToFront(new Node(Token.NUMBER));
        Node result = peephole.optimizeSubtree(arrayNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeArrayLiteralWithDelimiters() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToFront(Node.newString(Token.STRING, "a,b"));
        arrayNode.addChildToFront(Node.newString(Token.STRING, "c,d"));
        Node result = peephole.optimizeSubtree(arrayNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeArrayLiteralWithNewlines() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        arrayNode.addChildToFront(Node.newString(Token.STRING, "a\nb"));
        Node result = peephole.optimizeSubtree(arrayNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeConditionWithNotEQ() {
        Node notNode = new Node(Token.NOT);
        Node eqNode = new Node(Token.EQ);
        eqNode.addChildToFront(new Node(Token.NAME));
        eqNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(eqNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeConditionWithNotNE() {
        Node notNode = new Node(Token.NOT);
        Node neNode = new Node(Token.NE);
        neNode.addChildToFront(new Node(Token.NAME));
        neNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(neNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeConditionWithNotSHEQ() {
        Node notNode = new Node(Token.NOT);
        Node sheqNode = new Node(Token.SHEQ);
        sheqNode.addChildToFront(new Node(Token.NAME));
        sheqNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(sheqNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeConditionWithNotSHNE() {
        Node notNode = new Node(Token.NOT);
        Node shneNode = new Node(Token.SHNE);
        shneNode.addChildToFront(new Node(Token.NAME));
        shneNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(shneNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeConditionWithBooleanOperand() {
        Node notNode = new Node(Token.NOT);
        Node boolNode = new Node(Token.NUMBER, 1);
        notNode.addChildToFront(boolNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeIfWithConditionNotAnd() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NOT);
        cond.addChildToFront(new Node(Token.NAME));
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeIfWithConditionNotOr() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NOT);
        cond.addChildToFront(new Node(Token.NAME));
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testTryReplaceIfWithVarAndExpressionBlock() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME);
        ifNode.addChildToFront(cond);
        Node varBlock = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        var.addChildToFront(new Node(Token.NAME));
        varBlock.addChildToFront(var);
        ifNode.addChildToFront(varBlock);
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testTryReplaceIfWithExpressionBlockAndVar() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME);
        ifNode.addChildToFront(cond);
        Node exprBlock = new Node(Token.BLOCK);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToFront(new Node(Token.NAME));
        exprBlock.addChildToFront(exprResult);
        ifNode.addChildToFront(exprBlock);
        Node varBlock = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        var.addChildToFront(new Node(Token.NAME));
        varBlock.addChildToFront(var);
        ifNode.addChildToFront(varBlock);
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testTryReplaceUndefinedWithVoid() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        Node parent = new Node(Token.EXPR_RESULT);
        nameNode.setParent(parent);
        Node result = peephole.optimizeSubtree(nameNode);
        assertNotNull(result);
    }

    @Test
    public void testTryReplaceUndefinedInVar() {
        Node nameNode = Node.newString(Token.NAME, "undefined");
        Node parent = new Node(Token.VAR);
        nameNode.setParent(parent);
        Node result = peephole.optimizeSubtree(nameNode);
        assertNotNull(result);
    }

    @Test
    public void testTryReplaceUndefinedRegular() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.EXPR_RESULT);
        nameNode.setParent(parent);
        Node result = peephole.optimizeSubtree(nameNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldImmediateCallToBoundFunctionWithBind() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.GETPROP, "bind");
        Node target = new Node(Token.FUNCTION);
        callee.addChildToFront(target);
        callNode.addChildToFront(callee);
        callNode.addChildToFront(new Node(Token.THIS));
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldImmediateCallToBoundFunctionWithoutBind() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "foo");
        callNode.addChildToFront(callee);
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldSimpleFunctionCallString() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.GETPROP, "join");
        callee.addChildToFront(new Node(Token.NAME));
        callNode.addChildToFront(callee);
        callNode.addChildToFront(Node.newString(Token.STRING, ","));
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldSimpleFunctionCallNotString() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "foo");
        callNode.addChildToFront(callee);
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldLiteralConstructorWithString() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "String");
        callNode.addChildToFront(callee);
        callNode.addChildToFront(Node.newString(Token.STRING, "abc"));
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTryFoldLiteralConstructorWithObject() {
        Node callNode = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "Object");
        callNode.addChildToFront(callee);
        callNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
    }

    @Test
    public void testTrySplitCommaWithNullLHS() {
        Node commaNode = new Node(Token.COMMA);
        commaNode.addChildToFront(new Node(Token.NAME));
        commaNode.addChildToFront(new Node(Token.NAME));
        Node result = peephole.optimizeSubtree(commaNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithNestedNot() {
        Node notNode = new Node(Token.NOT);
        Node innerNot = new Node(Token.NOT);
        innerNot.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(innerNot);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithAndNode() {
        Node notNode = new Node(Token.NOT);
        Node andNode = new Node(Token.AND);
        andNode.addChildToFront(new Node(Token.NAME));
        andNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(andNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithOrNode() {
        Node notNode = new Node(Token.NOT);
        Node orNode = new Node(Token.OR);
        orNode.addChildToFront(new Node(Token.NAME));
        orNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(orNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithDeepCondition() {
        Node notNode = new Node(Token.NOT);
        Node andNode = new Node(Token.AND);
        Node innerNot = new Node(Token.NOT);
        innerNot.addChildToFront(new Node(Token.NAME));
        andNode.addChildToFront(innerNot);
        andNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(andNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithDeepOrCondition() {
        Node notNode = new Node(Token.NOT);
        Node orNode = new Node(Token.OR);
        Node innerNot = new Node(Token.NOT);
        innerNot.addChildToFront(new Node(Token.NAME));
        orNode.addChildToFront(innerNot);
        orNode.addChildToFront(new Node(Token.NAME));
        notNode.addChildToFront(orNode);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeNotWithUnknownValue() {
        Node notNode = new Node(Token.NOT);
        Node unknown = new Node(Token.NUMBER);
        unknown.setDouble(Double.NaN);
        notNode.addChildToFront(unknown);
        Node result = peephole.optimizeSubtree(notNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeIfWithEmptyThenBlock() {
        Node ifNode = new Node(Token.IF);
        Node cond = Node.newString(Token.NAME, "cond");
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(new Node(Token.BLOCK));
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }

    @Test
    public void testTryMinimizeIfWithNonEmptyBlocks() {
        Node ifNode = new Node(Token.IF);
        Node cond = Node.newString(Token.NAME, "cond");
        ifNode.addChildToFront(cond);
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToFront(new Node(Token.EXPR_RESULT));
        ifNode.addChildToFront(thenBlock);
        Node result = peephole.optimizeSubtree(ifNode);
        assertNotNull(result);
    }
}