package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NodeUtilTest {

    private Node node;

    @Before
    public void setUp() {
        node = new Node(Token.EMPTY);
    }

    @Test
    public void testIsFunctionObjectCall() {
        Node callNode = new Node(Token.CALL);
        Node getPropNode = new Node(Token.GETPROP);
        Node nameNode = Node.newString(Token.NAME, "call");
        getPropNode.addChildToBack(nameNode);
        callNode.addChildToBack(getPropNode);

        assertTrue(NodeUtil.isFunctionObjectCall(callNode));

        Node callNode2 = new Node(Token.CALL);
        Node nameNode2 = Node.newString(Token.NAME, "foo");
        callNode2.addChildToBack(nameNode2);
        assertFalse(NodeUtil.isFunctionObjectCall(callNode2));
    }

    @Test
    public void testIsExpressionResultUsed() {
        Node parent = new Node(Token.EXPR_RESULT);
        assertFalse(NodeUtil.isExpressionResultUsed(node));
    }

    @Test
    public void testGetNearestFunctionName() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "foo");
        functionNode.addChildToFront(nameNode);
        assertEquals("foo", NodeUtil.getNearestFunctionName(nameNode));
        assertNull(NodeUtil.getNearestFunctionName(new Node(Token.NAME)));
    }

    @Test
    public void testGetSourceName() {
        Node sourceNode = Node.newString(Token.STRING, "test.js");
        sourceNode.putProp(Node.SOURCENAME_PROP, "test.js");
        assertEquals("test.js", NodeUtil.getSourceName(sourceNode));
        assertNull(NodeUtil.getSourceName(null));
    }

    @Test
    public void testNewExpr() {
        Node expr = NodeUtil.newExpr(Node.newString(Token.NAME, "x"));
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertEquals(1, expr.getChildCount());
    }

    @Test
    public void testGetConditionExpression() {
        Node ifNode = new Node(Token.IF);
        Node condNode = new Node(Token.TRUE);
        ifNode.addChildToBack(condNode);
        Node blockNode = new Node(Token.BLOCK);
        ifNode.addChildToBack(blockNode);
        assertEquals(condNode, NodeUtil.getConditionExpression(ifNode));
    }

    @Test
    public void testIsStatementParent() {
        Node blockNode = new Node(Token.BLOCK);
        Node exprNode = Node.newString(Token.NAME, "x");
        blockNode.addChildToBack(exprNode);
        assertTrue(NodeUtil.isStatementParent(exprNode.getParent()));
        assertFalse(NodeUtil.isStatementParent(new Node(Token.NAME)));
    }

    @Test
    public void testIsReferenceTo() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isReferenceTo(nameNode, "x"));
        assertFalse(NodeUtil.isReferenceTo(nameNode, "y"));
    }

    @Test
    public void testGetVarsDeclaredInBranch() {
        Node scriptNode = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "a");
        varNode.addChildToBack(nameNode);
        scriptNode.addChildToBack(varNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(scriptNode);
        assertEquals(1, vars.size());
    }

    @Test
    public void testNewVarNode() {
        Node valueNode = Node.newString(Token.STRING, "test");
        Node varNode = NodeUtil.newVarNode("v", valueNode);
        assertEquals(Token.VAR, varNode.getType());
        assertNotNull(varNode.getFirstChild());
    }

    @Test
    public void testGetFunctionParameters() {
        Node functionNode = new Node(Token.FUNCTION);
        Node paramList = new Node(Token.PARAM_LIST);
        paramList.addChildToBack(Node.newString(Token.NAME, "a"));
        functionNode.addChildToBack(paramList);
        Node params = NodeUtil.getFunctionParameters(functionNode);
        assertNotNull(params);
        assertEquals(Token.PARAM_LIST, params.getType());
    }

    @Test
    public void testGetFunctionJSDocInfo() {
        Node functionNode = new Node(Token.FUNCTION);
        Node infoNode = new Node(Token.EMPTY);
        JSDocInfo info = new JSDocInfo();
        infoNode.setJSDocInfo(info);
        functionNode.addChildToBack(infoNode);
        assertNotNull(NodeUtil.getFunctionJSDocInfo(functionNode));
    }

    @Test
    public void testIsLiteralValue() {
        Node stringNode = Node.newString(Token.STRING, "test");
        assertTrue(NodeUtil.isLiteralValue(stringNode, true));
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertTrue(NodeUtil.isLiteralValue(nameNode, true));
    }

    @Test
    public void testIsValidDefineValue() {
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertTrue(NodeUtil.isValidDefineValue(numNode, Collections.emptySet()));
        Node stringNode = Node.newString(Token.STRING, "test");
        assertTrue(NodeUtil.isValidDefineValue(stringNode, Collections.emptySet()));
    }

    @Test
    public void testIsImmutableValue() {
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertTrue(NodeUtil.isImmutableValue(numNode));
        Node nameNode = Node.newString(Token.NAME, "undefined");
        assertTrue(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testGetStringValue() {
        Node stringNode = Node.newString(Token.STRING, "test");
        assertEquals("test", NodeUtil.getStringValue(stringNode));
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertEquals("42", NodeUtil.getStringValue(numNode));
        assertNull(NodeUtil.getStringValue(new Node(Token.EMPTY)));
    }

    @Test
    public void testGetStringNumberValue() {
        assertEquals(Double.valueOf(42.0), NodeUtil.getStringNumberValue("42"));
        assertEquals(Double.valueOf(-3.14), NodeUtil.getStringNumberValue("-3.14"));
        assertNull(NodeUtil.getStringNumberValue("abc"));
        assertNull(NodeUtil.getStringNumberValue(""));
        assertNull(NodeUtil.getStringNumberValue("infinity"));
    }

    @Test
    public void testIsNumericResult() {
        Node addNode = new Node(Token.ADD);
        assertTrue(NodeUtil.isNumericResult(addNode));
        Node stringNode = Node.newString(Token.STRING, "test");
        assertFalse(NodeUtil.isNumericResult(stringNode));
    }

    @Test
    public void testIsBooleanResult() {
        Node notNode = new Node(Token.NOT);
        assertTrue(NodeUtil.isBooleanResult(notNode));
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertFalse(NodeUtil.isBooleanResult(numNode));
    }

    @Test
    public void testIsMayBeString() {
        Node addNode = new Node(Token.ADD);
        assertTrue(NodeUtil.isMayBeString(addNode));
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertFalse(NodeUtil.isMayBeString(numNode));
    }

    @Test
    public void testIsCall() {
        Node callNode = new Node(Token.CALL);
        assertTrue(NodeUtil.isCall(callNode));
        assertFalse(NodeUtil.isCall(new Node(Token.NAME)));
    }

    @Test
    public void testIsVar() {
        Node varNode = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(varNode));
        assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsName() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isName(nameNode));
        assertFalse(NodeUtil.isName(new Node(Token.STRING)));
    }

    @Test
    public void testIsAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssign(assignNode));
        assertFalse(NodeUtil.isAssign(new Node(Token.NAME)));
    }

    @Test
    public void testIsExprAssign() {
        Node exprNode = new Node(Token.EXPR_RESULT);
        Node assignNode = new Node(Token.ASSIGN);
        exprNode.addChildToBack(assignNode);
        assertTrue(NodeUtil.isExprAssign(exprNode));
        assertFalse(NodeUtil.isExprAssign(new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testIsExpressionNode() {
        Node exprNode = new Node(Token.EXPR_RESULT);
        assertTrue(NodeUtil.isExpressionNode(exprNode));
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.NAME)));
    }

    @Test
    public void testGetExpressionNode() {
        Node exprNode = new Node(Token.EXPR_RESULT);
        Node assignNode = new Node(Token.ASSIGN);
        exprNode.addChildToBack(assignNode);
        assertEquals(assignNode, NodeUtil.getExpressionNode(exprNode));
    }

    @Test
    public void testIsLoopStructure() {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isLoopStructure(forNode));
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isLoopStructure(whileNode));
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsControlStructure() {
        Node ifNode = new Node(Token.IF);
        assertTrue(NodeUtil.isControlStructure(ifNode));
        assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsStatementBlock() {
        Node blockNode = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(blockNode));
        assertFalse(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsFunctionBlock() {
        Node functionNode = new Node(Token.FUNCTION);
        Node blockNode = new Node(Token.BLOCK);
        functionNode.addChildToBack(blockNode);
        assertTrue(NodeUtil.isFunctionBlock(blockNode));
        assertFalse(NodeUtil.isFunctionBlock(new Node(Token.BLOCK)));
    }

    @Test
    public void testHasCatchHandler() {
        Node tryNode = new Node(Token.TRY);
        Node blockNode = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        tryNode.addChildToBack(blockNode);
        tryNode.addChildToBack(catchNode);
        tryNode.addChildToBack(new Node(Token.EMPTY));
        assertTrue(NodeUtil.hasCatchHandler(tryNode));
    }

    @Test
    public void testIsFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isFunction(functionNode));
        assertFalse(NodeUtil.isFunction(new Node(Token.NAME)));
    }

    @Test
    public void testIsThis() {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.isThis(thisNode));
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsNumber() {
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertTrue(NodeUtil.isNumber(numNode));
        assertFalse(NodeUtil.isNumber(new Node(Token.NAME)));
    }

    @Test
    public void testIsString() {
        Node strNode = Node.newString(Token.STRING, "test");
        assertTrue(NodeUtil.isString(strNode));
        assertFalse(NodeUtil.isString(new Node(Token.NUMBER)));
    }

    @Test
    public void testIsBoolean() {
        Node boolNode = new Node(Token.TRUE);
        assertTrue(NodeUtil.isBoolean(boolNode));
        assertFalse(NodeUtil.isBoolean(new Node(Token.NAME)));
    }

    @Test
    public void testIsAssignee() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isAssignee(nameNode));
        Node getPropNode = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isAssignee(getPropNode));
        assertFalse(NodeUtil.isAssignee(new Node(Token.STRING)));
    }

    @Test
    public void testIsAssignmentOp() {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssignmentOp(assignNode));
        Node addNode = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssignmentOp(addNode));
    }

    @Test
    public void testIsExpressionResultUsed_basic() {
        Node exprNode = new Node(Token.EXPR_RESULT);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(exprNode);
        assertFalse(NodeUtil.isExpressionResultUsed(exprNode));
    }

    @Test
    public void testGetRootOfQualifiedName() {
        Node qName = Node.newString(Token.NAME, "a");
        assertEquals(qName, NodeUtil.getRootOfQualifiedName(qName));
    }

    @Test
    public void testIsSimpleOperatorType() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    @Test
    public void testNewQualifiedNameNode() {
        Node qName = NodeUtil.newQualifiedNameNode("a.b.c");
        assertNotNull(qName);
        assertEquals(Token.GETPROP, qName.getType());
    }

    @Test
    public void testIsLiteralValueFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isLiteralValue(functionNode, false));
        assertTrue(NodeUtil.isLiteralValue(functionNode, true));
    }

    @Test
    public void testCanBeSideEffected() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.canBeSideEffected(nameNode));
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertFalse(NodeUtil.canBeSideEffected(numNode));
    }

    @Test
    public void testIsImmutableNode() {
        Node numNode = Node.newString(Token.NUMBER, "42");
        assertTrue(NodeUtil.isImmutableNode(numNode));
        Node nameNode = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isImmutableNode(nameNode));
    }

    @Test
    public void testIsValidAssignmentTarget() {
        Node nameNode = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isValidAssignmentTarget(nameNode));
    }

    @Test
    public void testIsExprCall() {
        Node callNode = new Node(Token.CALL);
        assertTrue(NodeUtil.isExprCall(callNode));
        assertFalse(NodeUtil.isExprCall(new Node(Token.NAME)));
    }

    @Test
    public void testGetEnclosingType() {
        Node blockNode = new Node(Token.BLOCK);
        assertEquals(Token.TRY, NodeUtil.getEnclosingType(blockNode, Token.TRY));
    }

    @Test
    public void testGetEnclosingFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getEnclosingFunction(functionNode));
    }

    @Test
    public void testGetParentOfType() {
        Node blockNode = new Node(Token.BLOCK);
        assertNull(NodeUtil.getParentOfType(new Node(Token.NAME), Token.BLOCK));
    }

    @Test
    public void testGetNonFunctionParent() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertEquals(parent, NodeUtil.getNonFunctionParent(child));
    }

    @Test
    public void testGetFunctionName() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "foo");
        functionNode.addChildToFront(nameNode);
        assertEquals("foo", NodeUtil.getFunctionName(functionNode));
        assertNull(NodeUtil.getFunctionName(new Node(Token.FUNCTION)));
    }

    @Test
    public void testRedeclareVarsInsideBranch() {
        Node branch = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        branch.addChildToBack(varNode);
        NodeUtil.redeclareVarsInsideBranch(branch);
    }
}