package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NodeUtilTest {
    private Node node;

    @Before
    public void setUp() {
        node = new Node(Token.EMPTY);
    }

    @Test
    public void testIsFunctionObjectCallWithNullCallNode() {
        assertFalse(NodeUtil.isFunctionObjectCall(null));
    }

    @Test
    public void testIsFunctionObjectCallNonNullCallNode() {
        Node callNode = new Node(Token.CALL);
        Node nameNode = new Node(Token.NAME, "eval");
        callNode.addChildToBack(nameNode);
        assertTrue(NodeUtil.isFunctionObjectCall(callNode));
    }

    @Test
    public void testIsLiteralValueWithFunctionType() {
        Node fnNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isLiteralValue(fnNode, false));
        assertFalse(NodeUtil.isLiteralValue(fnNode, true));
    }

    @Test
    public void testIsLiteralValueWithNameNode() {
        Node nameNode = new Node(Token.NAME, "undefined");
        assertFalse(NodeUtil.isLiteralValue(nameNode, false));
    }

    @Test
    public void testNewExprWithChild() {
        Node child = new Node(Token.NAME, "foo");
        Node result = NodeUtil.newExpr(child);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertEquals(child, result.getFirstChild());
    }

    @Test
    public void testGetFunctionNameWithNull() {
        assertNull(NodeUtil.getFunctionName(null));
    }

    @Test
    public void testGetFunctionNameWithFunctionNode() {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "bar");
        fnNode.addChildToBack(nameNode);
        assertNull("Expected null for function with name node at index 1", NodeUtil.getFunctionName(fnNode));
    }

    @Test
    public void testIsExpressionResultUsed() {
        Node n = new Node(Token.EXPR_RESULT);
        assertFalse(NodeUtil.isExpressionResultUsed(n));
    }

    @Test
    public void testIsThisWithThisNode() {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.isThis(thisNode));
    }

    @Test
    public void testIsThisWithNonThisNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isThis(nameNode));
    }

    @Test
    public void testIsVarWithVarNode() {
        Node varNode = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(varNode));
    }

    @Test
    public void testIsVarWithNonVarNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isVar(nameNode));
    }

    @Test
    public void testIsNameWithNameNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertTrue(NodeUtil.isName(nameNode));
    }

    @Test
    public void testIsNameWithNonNameNode() {
        Node thisNode = new Node(Token.THIS);
        assertFalse(NodeUtil.isName(thisNode));
    }

    @Test
    public void testIsAssignWithAssignNode() {
        Node assignNode = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssign(assignNode));
    }

    @Test
    public void testIsAssignWithNonAssignNode() {
        Node addNode = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssign(addNode));
    }

    @Test
    public void testIsGetWithGetPropNode() {
        Node getPropNode = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(getPropNode));
    }

    @Test
    public void testIsGetWithGetElemNode() {
        Node getElemNode = new Node(Token.GETELEM);
        assertTrue(NodeUtil.isGet(getElemNode));
    }

    @Test
    public void testIsGetWithNonGetNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isGet(nameNode));
    }

    @Test
    public void testIsStatementWithBlockNode() {
        Node blockNode = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatement(blockNode));
    }

    @Test
    public void testIsStatementWithNameNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isStatement(nameNode));
    }

    @Test
    public void testIsStatementBlockWithBlockNode() {
        Node blockNode = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(blockNode));
    }

    @Test
    public void testIsStatementBlockWithNonBlockNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isStatementBlock(nameNode));
    }

    @Test
    public void testIsLoopStructureWithForNode() {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isLoopStructure(forNode));
    }

    @Test
    public void testIsLoopStructureWithWhileNode() {
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isLoopStructure(whileNode));
    }

    @Test
    public void testIsLoopStructureWithNonLoopNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isLoopStructure(nameNode));
    }

    @Test
    public void testIsControlStructureWithIfNode() {
        Node ifNode = new Node(Token.IF);
        assertTrue(NodeUtil.isControlStructure(ifNode));
    }

    @Test
    public void testIsControlStructureWithNonCtrlNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isControlStructure(nameNode));
    }

    @Test
    public void testIsFunctionWithFunctionNode() {
        Node fnNode = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isFunction(fnNode));
    }

    @Test
    public void testIsFunctionWithNonFunctionNode() {
        Node nameNode = new Token(NAME, "x");
        assertFalse(NodeUtil.isFunction(nameNode));
    }

    @Test
    public void testGetOpTypeWithVariousTokens() {
        assertEquals("+", NodeUtil.getOpType(Token.ADD));
        assertEquals("||", NodeUtil.getOpType(Token.OR));
        assertEquals("&&", NodeUtil.getOpType(Token.AND));
        assertEquals("==", NodeUtil.getOpType(Token.EQ));
        assertEquals("!=", NodeUtil.getOpType(Token.NE));
        assertEquals("===", NodeUtil.getOpType(Token.SHEQ));
        assertEquals("!==", NodeUtil.getOpType(Token.SHNE));
        assertEquals("<", NodeUtil.getOpType(Token.LT));
        assertEquals("<=", NodeUtil.getOpType(Token.LE));
        assertEquals(">", NodeUtil.getOpType(Token.GT));
        assertEquals(">=", NodeUtil.getOpType(Token.GE));
        assertEquals("*", NodeUtil.getOpType(Token.MUL));
        assertEquals("/", NodeUtil.getOpType(Token.DIV));
        assertEquals("%", NodeUtil.getOpType(Token.MOD));
        assertEquals("-", NodeUtil.getOpType(Token.SUB));
    }

    @Test
    public void testGetOpTypeWithNull() {
        assertNull(NodeUtil.getOpType(Token.EMPTY));
    }

    @Test
    public void testIsSimpleOperatorTypeWithAdd() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorTypeWithAssign() {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    @Test
    public void testIsAssignmentOpWithAssign() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
    }

    @Test
    public void testIsAssignmentOpWithAdd() {
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
    }

    @Test
    public void testIsImmutableValueWithNumberNode() {
        Node numNode = new Node(Token.NUMBER);
        assertTrue(NodeUtil.isImmutableValue(numNode));
    }

    @Test
    public void testIsImmutableValueWithNameNode() {
        Node nameNode = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isImmutableValue(nameNode));
    }

    @Test
    public void testGetBooleanValueWithTrueNode() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));
    }

    @Test
    public void testGetBooleanValueWithFalseNode() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));
    }

    @Test
    public void testGetBooleanValueWithNameUndefined() {
        Node nameNode = new Node(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValueWithNameInfinity() {
        Node nameNode = new Node(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(nameNode));
    }

    @Test
    public void testGetBooleanValueWithNullNode() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    }

    @Test
    public void testGetBooleanValueWithEmptyNode() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(new Node(Token.EMPTY)));
    }

    @Test
    public void testGetStringNumberValueWithEmptyString() {
        assertNull(NodeUtil.getStringNumberValue(""));
    }

    @Test
    public void testGetStringNumberValueWithValidNumber() {
        assertEquals(Double.valueOf(42.0), NodeUtil.getStringNumberValue("42"));
    }

    @Test
    public void testGetStringNumberValueWithInvalidString() {
        assertNull(NodeUtil.getStringNumberValue("abc"));
    }

    @Test
    public void testGetStringNumberValueWithInfinity() {
        assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), NodeUtil.getStringNumberValue("Infinity"));
    }

    @Test
    public void testGetStringNumberValueWithHexString() {
        assertEquals(Double.valueOf(255.0), NodeUtil.getStringNumberValue("0xFF"));
    }

    @Test
    public void testGetStringNumberValueWithNegativeNumber() {
        assertEquals(Double.valueOf(-10.5), NodeUtil.getStringNumberValue("-10.5"));
    }

    @Test
    public void testGetStringNumberValueWithScientificNotation() {
        assertEquals(Double.valueOf(1.0e3), NodeUtil.getStringNumberValue("1e3"));
    }

    @Test
    public void testGetStringNumberValueWithTrailingWhitespace() {
        assertNull(NodeUtil.getStringNumberValue(" 42 "));
    }

    @Test
    public void testIsInliningForbiddenNull() {
        assertTrue(NodeUtil.isInliningForbidden(null));
    }

    @Test
    public void testNewVarNodeWithNullValue() {
        Node result = NodeUtil.newVarNode("x", null);
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
    }

    @Test
    public void testNewVarNodeWithNonNullValue() {
        Node value = new Node(Token.NUMBER, 42.0);
        Node result = NodeUtil.newVarNode("y", value);
        assertEquals(Token.NAME, result.getType());
        assertEquals("y", result.getString());
        assertNotNull(result.getFirstChild());
    }

    @Test
    public void testGetVarsDeclaredInBranchWithNoVars() {
        Node branch = new Node(Token.BLOCK);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertNotNull(vars);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranchWithVar() {
        Node branch = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "a");
        varNode.addChildToBack(nameNode);
        branch.addChildToBack(varNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(1, vars.size());
    }
}