package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;

public class NodeUtilTest {

    private Node buildNode(int type) {
        return new Node(type);
    }

    private Node buildNameNode(String name) {
        Node n = new Node(Token.NAME);
        n.setString(name);
        return n;
    }

    private Node buildStringNode(String str) {
        Node n = new Node(Token.STRING);
        n.setString(str);
        return n;
    }

    private Node buildNumberNode(double num) {
        Node n = new Node(Token.NUMBER);
        n.setDouble(num);
        return n;
    }

    private Node buildVarNode(String name, Node value) {
        Node var = new Node(Token.VAR);
        Node nameNode = buildNameNode(name);
        var.addChildToBack(nameNode);
        if (value != null) {
            nameNode.addChildToBack(value);
        }
        return var;
    }

    private Node buildAssignNode(Node target, Node value) {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(target);
        assign.addChildToBack(value);
        return assign;
    }

    private Node buildExprResultNode(Node expr) {
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(expr);
        return exprResult;
    }

    private Node buildFunctionNode(String name, List<Node> params) {
        FunctionNode fn = new FunctionNode(Token.FUNCTION, name);
        Node paramList = new Node(Token.LP);
        for (Node param : params) {
            paramList.addChildToBack(param);
        }
        Node block = new Node(Token.BLOCK);
        fn.addChildrenToBack(paramList);
        fn.addChildrenToBack(block);
        return fn;
    }

    @Before
    public void setUp() {
        // No setup needed
    }

    @Test
    public void testIsLiteralValue() {
        assertTrue(NodeUtil.isLiteralValue(buildNameNode("undefined"), false));
        assertTrue(NodeUtil.isLiteralValue(buildNameNode("Infinity"), false));
        assertTrue(NodeUtil.isLiteralValue(buildStringNode("hello"), false));
        assertTrue(NodeUtil.isLiteralValue(buildNumberNode(42), false));
        assertTrue(NodeUtil.isLiteralValue(buildNumberNode(42.5), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.TRUE), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.FALSE), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.NULL), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.VOID), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.REGEXP), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.OBJECTLIT), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT), false));
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.NAME).setString("Infinity"), false));
        Node str = new Node(Token.STRING);
        str.setString("");
        assertFalse(NodeUtil.isLiteralValue(str, false));
        str.setString("x");
        assertTrue(NodeUtil.isLiteralValue(str, false));
        Node numZero = new Node(Token.NUMBER);
        numZero.setDouble(0);
        assertFalse(NodeUtil.isLiteralValue(numZero, false));
        numZero.setDouble(-0.0);
        assertFalse(NodeUtil.isLiteralValue(numZero, false));
        numZero.setDouble(1.0);
        assertTrue(NodeUtil.isLiteralValue(numZero, false));
        try {
            NodeUtil.isLiteralValue(new Node(Token.REGEXP), false);
            fail("Expected IllegalArgument for REGEXP");
        } catch (IllegalArgumentException e) {
            // expected
        }
        Node undefName = buildNameNode("undefined");
        assertTrue(NodeUtil.isLiteralValue(undefName, false));
        Node infName = buildNameNode("Infinity");
        assertTrue(NodeUtil.isLiteralValue(infName, false));
        Node otherName = buildNameNode("foo");
        assertFalse(NodeUtil.isLiteralValue(otherName, false));
        Node plus = new Node(Token.ADD);
        assertFalse(NodeUtil.isLiteralValue(plus, false));
        assertFalse(NodeUtil.isLiteralValue(plus, true));
    }

    @Test
    public void testIsImmutableValue() {
        Node str = buildStringNode("hello");
        assertTrue(NodeUtil.isImmutableValue(str));
        Node num = buildNumberNode(1.5);
        assertTrue(NodeUtil.isImmutableValue(num));
        Node name = buildNameNode("x");
        assertFalse(NodeUtil.isImmutableValue(name));
        Node bitNot = new Node(Token.BITNOT);
        bitNot.addChildToBack(num);
        assertTrue(NodeUtil.isImmutableValue(bitNot));
        Node add = new Node(Token.ADD);
        add.addChildToBack(str);
        add.addChildToBack(num);
        assertFalse(NodeUtil.isImmutableValue(add));
        Node pos = new Node(Token.POS);
        pos.addChildToBack(str);
        assertTrue(NodeUtil.isImmutableValue(pos));
        Node neg = new Node(Token.NEG);
        neg.addChildToBack(str);
        assertTrue(NodeUtil.isImmutableValue(neg));
        Node not = new Node(Token.NOT);
        not.addChildToBack(str);
        assertFalse(NodeUtil.isImmutableValue(not));
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(name);
        getProp.addChildToBack(buildStringNode("length"));
        assertFalse(NodeUtil.isImmutableValue(getProp));
        getProp.getFirstChild().setQualifiedName(true);
        assertTrue(NodeUtil.isImmutableValue(getProp));
    }

    @Test
    public void testIsFunctionObjectCall() {
        Node name = buildNameNode("fn");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(name);
        getProp.addChildToBack(buildStringNode("call"));
        Node call = new Node(Token.CALL);
        call.addChildToBack(getProp);
        call.addChildToBack(buildNameNode("this"));
        call.addChildToBack(buildNameNode("arg"));
        assertTrue(NodeUtil.isFunctionObjectCall(call));
        Node call2 = new Node(Token.CALL);
        call2.addChildToBack(name);
        assertFalse(NodeUtil.isFunctionObjectCall(call2));
    }

    @Test
    public void testIsFunctionObjectApply() {
        Node name = buildNameNode("fn");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(name);
        getProp.addChildToBack(buildStringNode("apply"));
        Node call = new Node(Token.CALL);
        call.addChildToBack(getProp);
        call.addChildToBack(buildNameNode("this"));
        call.addChildToBack(buildNameNode("arg"));
        assertTrue(NodeUtil.isFunctionObjectApply(call));
        Node call2 = new Node(Token.CALL);
        call2.addChildToBack(name);
        assertFalse(NodeUtil.isFunctionObjectApply(call2));
    }

    @Test
    public void testIsNameDeclaration() {
        Node var = buildVarNode("x", buildNumberNode(1));
        Node nameNode = var.getFirstChild();
        assertTrue(NodeUtil.isNameDeclaration(nameNode));
        Node assign = buildAssignNode(buildNameNode("x"), buildNumberNode(1));
        assertFalse(NodeUtil.isNameDeclaration(assign.getFirstChild()));
        Node name = buildNameNode("x");
        assertFalse(NodeUtil.isNameDeclaration(name));
    }

    @Test
    public void testIsAssignmentOp() {
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_ADD)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_SUB)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_MUL)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_DIV)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_MOD)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_BAND)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_BOR)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_BXOR)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_LSH)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_RSH)));
        assertTrue(NodeUtil.isAssignmentOp(new Node(Token.ASSIGN_URSH)));
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.ADD)));
        assertFalse(NodeUtil.isAssignmentOp(new Node(Token.VAR)));
    }

    @Test
    public void testIsSimpleOperatorType() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.SUB));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.MUL));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.DIV));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.MOD));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.BITAND));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.BITOR));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.BITXOR));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.LSH));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.RSH));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.URSH));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.NOT));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.NEG));
        assertTrue(NodeUtil.isSimpleOperatorType(Token.POS));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.NEW));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.CALL));
    }

    @Test
    public void testIsExprAssign() {
        Node assign = buildAssignNode(buildNameNode("x"), buildNumberNode(1));
        Node expr = buildExprResultNode(assign);
        assertTrue(NodeUtil.isExprAssign(expr));
        Node call = new Node(Token.CALL);
        assertFalse(NodeUtil.isExprAssign(call));
    }

    @Test
    public void testIsForIn() {
        Node forNode = new Node(Token.FOR);
        Node assign = buildAssignNode(buildNameNode("x"), new Node(Token.NAME));
        forNode.addChildToBack(assign);
        forNode.addChildToBack(buildNameNode("obj"));
        forNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(NodeUtil.isForIn(forNode));
        Node forNode2 = new Node(Token.FOR);
        forNode2.addChildToBack(new Node(Token.EMPTY));
        assertFalse(NodeUtil.isForIn(forNode2));
    }

    @Test
    public void testIsNormalBlock() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isNormalBlock(block));
        Node script = new Node(Token.SCRIPT);
        script.putBooleanProp(Node.SYNTHETIC_BLOCK_PROP, true);
        assertFalse(NodeUtil.isNormalBlock(script));
    }

    @Test
    public void testIsStatementParent() {
        Node parent = new Node(Token.SCRIPT);
        Node child = new Node(Token.EMPTY);
        parent.addChildToBack(child);
        assertTrue(NodeUtil.isStatementParent(parent));
        Node block = new Node(Token.BLOCK);
        Node child2 = new Node(Token.EMPTY);
        block.addChildToBack(child2);
        assertTrue(NodeUtil.isStatementParent(block));
        Node expr = new Node(Token.EXPR_RESULT);
        Node child3 = new Node(Token.EMPTY);
        expr.addChildToBack(child3);
        assertFalse(NodeUtil.isStatementParent(expr));
    }

    @Test
    public void testIsStatementBlock() {
        Node block = new Node(Token.BLOCK);
        assertTrue(NodeUtil.isStatementBlock(block));
        Node script = new Node(Token.SCRIPT);
        assertTrue(NodeUtil.isStatementBlock(script));
        Node empty = new Node(Token.EMPTY);
        assertFalse(NodeUtil.isStatementBlock(empty));
    }

    @Test
    public void testIsExpressionNode() {
        Node expr = new Node(Token.EXPR_RESULT);
        assertFalse(NodeUtil.isExpressionNode(expr));
        Node other = new Node(Token.NAME);
        assertTrue(NodeUtil.isExpressionNode(other));
    }

    @Test
    public void testIsCall() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.isCall(call));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isCall(name));
    }

    @Test
    public void testIsGet() {
        Node get = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(get));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isGet(name));
    }

    @Test
    public void testIsVar() {
        Node var = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(var));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isVar(name));
    }

    @Test
    public void testIsSimpleFunctionObjectCall() {
        Node getName = new Node(Token.GETPROP);
        getName.addChildToBack(buildNameNode("obj"));
        getName.addChildToBack(buildStringNode("method"));
        Node call = new Node(Token.CALL);
        call.addChildToBack(getName);
        assertTrue(NodeUtil.isSimpleFunctionObjectCall(call));
        Node call2 = new Node(Token.CALL);
        call2.addChildToBack(buildNameNode("fn"));
        assertFalse(NodeUtil.isSimpleFunctionObjectCall(call2));
    }

    @Test
    public void testIsReferenceTo() {
        Node name = buildNameNode("x");
        assertTrue(NodeUtil.isReferenceTo(name, "x"));
        assertFalse(NodeUtil.isReferenceTo(name, "y"));
        Node getElem = new Node(Token.GETELEM);
        assertFalse(NodeUtil.isReferenceTo(getElem, "x"));
    }

    @Test
    public void testIsString() {
        Node str = new Node(Token.STRING);
        assertTrue(NodeUtil.isString(str));
        Node num = new Node(Token.NUMBER);
        assertFalse(NodeUtil.isString(num));
    }

    @Test
    public void testIsNumber() {
        Node num = new Node(Token.NUMBER);
        assertTrue(NodeUtil.isNumber(num));
        Node str = new Node(Token.STRING);
        assertFalse(NodeUtil.isNumber(str));
    }

    @Test
    public void testGetNameString() {
        Node name = buildNameNode("foo");
        assertEquals("foo", NodeUtil.getNameString(name));
        String s = "bar";
        assertEquals(s, NodeUtil.getNameString(s));
        assertNull(NodeUtil.getNameString(123));
    }

    @Test
    public void testIsName() {
        Node n = buildNameNode("x");
        assertTrue(NodeUtil.isName(n));
        Node num = new Node(Token.NUMBER);
        assertFalse(NodeUtil.isName(num));
    }

    @Test
    public void testIsNew() {
        Node n = new Node(Token.NEW);
        assertTrue(NodeUtil.isNew(n));
        Node call = new Node(Token.CALL);
        assertFalse(NodeUtil.isNew(call));
    }

    @Test
    public void testIsVarOrSimpleAssignLhs() {
        Node name = buildNameNode("x");
        assertTrue(NodeUtil.isVarOrSimpleAssignLhs(name));
        Node assign = buildAssignNode(name, buildNumberNode(1));
        assertFalse(NodeUtil.isVarOrSimpleAssignLhs(assign.getFirstChild()));
    }

    @Test
    public void testIsLValue() {
        Node name = buildNameNode("x");
        assertTrue(NodeUtil.isLValue(name));
        Node assign = buildAssignNode(name, buildNumberNode(1));
        assertFalse(NodeUtil.isLValue(assign.getFirstChild()));
    }

    @Test
    public void testIsNestedAssign() {
        Node assign = buildAssignNode(buildNameNode("x"), buildNumberNode(1));
        assertTrue(NodeUtil.isNestedAssign(assign));
        Node expr = buildExprResultNode(assign);
        assertFalse(NodeUtil.isNestedAssign(expr));
    }

    @Test
    public void testIsUsingOwnNameProperty() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(buildNameNode("obj"));
        getProp.addChildToBack(buildStringNode("prop"));
        assertTrue(NodeUtil.isUsingOwnNameProperty(getProp));
        Node getElem = new Node(Token.GETELEM);
        assertFalse(NodeUtil.isUsingOwnNameProperty(getElem));
    }

    @Test
    public void testIsPrototypeProperty() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(buildNameNode("func"));
        getProp.addChildToBack(buildStringNode("prototype"));
        assertTrue(NodeUtil.isPrototypeProperty(getProp));
        Node getProp2 = new Node(Token.GETPROP);
        getProp2.addChildToBack(buildNameNode("func"));
        getProp2.addChildToBack(buildStringNode("other"));
        assertFalse(NodeUtil.isPrototypeProperty(getProp2));
    }

    @Test
    public void testIsPrototypeMethod() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(buildNameNode("func"));
        getProp.addChildToBack(buildStringNode("prototype"));
        Node getProp2 = new Node(Token.GETPROP);
        getProp2.addChildToBack(getProp);
        getProp2.addChildToBack(buildStringNode("method"));
        assertTrue(NodeUtil.isPrototypeMethod(getProp2));
        Node getProp3 = new Node(Token.GETPROP);
        getProp3.addChildToBack(buildNameNode("func"));
        getProp3.addChildToBack(buildStringNode("method"));
        assertFalse(NodeUtil.isPrototypeMethod(getProp3));
    }

    @Test
    public void testIsExprCall() {
        Node call = new Node(Token.CALL);
        Node expr = buildExprResultNode(call);
        assertTrue(NodeUtil.isExprCall(expr));
        Node expr2 = buildExprResultNode(new Node(Token.NAME));
        assertFalse(NodeUtil.isExprCall(expr2));
    }

    @Test
    public void testIsFunctionCall() {
        Node call = new Node(Token.CALL);
        assertTrue(NodeUtil.isFunctionCall(call));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isFunctionCall(name));
    }

    @Test
    public void testIsFunction() {
        Node fn = new FunctionNode(Token.FUNCTION, "f");
        assertTrue(NodeUtil.isFunction(fn));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isFunction(name));
    }

    @Test
    public void testContainsType() {
        Node root = new Node(Token.BLOCK);
        Node name = buildNameNode("x");
        root.addChildToBack(name);
        assertTrue(NodeUtil.containsType(root, Token.NAME));
        assertFalse(NodeUtil.containsType(root, Token.NUMBER));
    }

    @Test
    public void testGetSourceName() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getSourceName(n));
        n.setSourceName("file.js");
        assertEquals("file.js", NodeUtil.getSourceName(n));
    }

    @Test
    public void testIsParameterList() {
        Node lp = new Node(Token.LP);
        assertTrue(NodeUtil.isParameterList(lp));
        Node block = new Node(Token.BLOCK);
        assertFalse(NodeUtil.isParameterList(block));
    }

    @Test
    public void testIsVarArgs() {
        Node fn = buildFunctionNode("f", new ArrayList<Node>());
        Node paramList = fn.getFirstChild();
        assertFalse(NodeUtil.isVarArgs(paramList));
        paramList.putBooleanProp(Node.VAR_ARGS_NAME, true);
        assertTrue(NodeUtil.isVarArgs(paramList));
    }

    @Test
    public void testIsStatement() {
        Node script = new Node(Token.SCRIPT);
        assertTrue(NodeUtil.isStatement(script));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isStatement(name));
    }

    @Test
    public void testIsExpression() {
        Node name = new Node(Token.NAME);
        assertTrue(NodeUtil.isExpression(name));
        Node script = new Node(Token.SCRIPT);
        assertFalse(NodeUtil.isExpression(script));
    }

    @Test
    public void testIsVarDeclaration() {
        Node name = buildNameNode("x");
        assertTrue(NodeUtil.isVarDeclaration(name));
        Node assign = buildAssignNode(name, buildNumberNode(1));
        assertFalse(NodeUtil.isVarDeclaration(assign.getFirstChild()));
    }

    @Test
    public void testIsThis() {
        Node thisNode = new Node(Token.THIS);
        assertTrue(NodeUtil.isThis(thisNode));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isThis(name));
    }

    @Test
    public void testIsArrayLit() {
        Node arr = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.isArrayLit(arr));
        Node name = new Node(Token.NAME);
        assertFalse(NodeUtil.isArrayLit(name));
    }

    @Test
    public void testIsCallTo() {
        Node call = new Node(Token.CALL);
        assertNotNull(NodeUtil.isCallTo(call));
        Node name = new Node(Token.NAME);
        assertNull(NodeUtil.isCallTo(name));
    }

    @Test
    public void testIsFunctionExpression() {
        Node fn = new FunctionNode(Token.FUNCTION, "f");
        fn.setFunctionType(FunctionNode.EXPRESSION);
        assertTrue(NodeUtil.isFunctionExpression(fn));
        fn.setFunctionType(FunctionNode.DECLARATION);
        assertFalse(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsNameReferenced() {
        Node root = new Node(Token.BLOCK);
        Node name = buildNameNode("x");
        root.addChildToBack(name);
        assertTrue(NodeUtil.isNameReferenced(root, "x"));
        assertFalse(NodeUtil.isNameReferenced(root, "y"));
    }

    @Test
    public void testGetEnclosingFunction() {
        Node block = new Node(Token.BLOCK);
        Node fn = new FunctionNode(Token.FUNCTION, "f");
        block.addChildToBack(fn);
        Node name = buildNameNode("x");
        fn.addChildToBack(name);
        assertSame(fn, NodeUtil.getEnclosingFunction(name));
    }

    @Test
    public void testGetEnclosingStatement() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertEquals(parent, NodeUtil.getEnclosingStatement(child));
    }

    @Test
    public void testGetEnclosingType() {
        Node parent = new Node(Token.CALL);
        Node child = new Node(Token.NAME);
        parent.addChildToBack(child);
        assertEquals(Token.CALL, NodeUtil.getEnclosingType(child));
    }

    @Test
    public void testGetEnclosingScript() {
        Node script = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        script.addChildToBack(block);
        Node name = buildNameNode("x");
        block.addChildToBack(name);
        assertSame(script, NodeUtil.getEnclosingScript(name));
    }

    @Test
    public void testGetEnclosingVar() {
        Node var = buildVarNode("x", buildNumberNode(1));
        Node name = var.getFirstChild();
        assertSame(var, NodeUtil.getEnclosingVar(name));
    }

    @Test
    public void testGetFunctionName() {
        FunctionNode fn = new FunctionNode(Token.FUNCTION, "myFunc");
        assertEquals("myFunc", NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testGetFunctionNameNode() {
        FunctionNode fn = new FunctionNode(Token.FUNCTION, "myFunc");
        Node nameNode = buildNameNode("myFunc");
        assertSame(nameNode, NodeUtil.getFunctionNameNode(nameNode));
    }

    @Test
    public void testGetCodeToLineColumn() {
        Node n = new Node(Token.NAME);
        assertNotNull(NodeUtil.getCodeToLineColumn(n));
    }
}