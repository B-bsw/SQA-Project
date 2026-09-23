package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

    private Node node;
    private Node parent;

    @Before
    public void setUp() {
        node = new Node(Token.NAME, "test");
        parent = new Node(Token.BLOCK);
    }

    @Test
    public void testGetBooleanValue_Null() {
        assertNull(NodeUtil.getBooleanValue(new Node(Token.NULL)));
    }

    @Test
    public void testGetBooleanValue_False() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.FALSE)));
    }

    @Test
    public void testGetBooleanValue_True() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
    }

    @Test
    public void testGetBooleanValue_Void() {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(new Node(Token.VOID)));
    }

    @Test
    public void testGetExpressionBooleanValue_Not() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToBack(new Node(Token.FALSE));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(notNode));
    }

    @Test
    public void testGetExpressionBooleanValue_And_False() {
        Node andNode = new Node(Token.AND);
        andNode.addChildToBack(new Node(Token.FALSE));
        andNode.addChildToBack(new Node(Token.TRUE));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_And_Unknown() {
        Node andNode = new Node(Token.AND);
        andNode.addChildToBack(new Node(Token.NAME, "x"));
        andNode.addChildToBack(new Node(Token.TRUE));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(andNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Or_True() {
        Node orNode = new Node(Token.OR);
        orNode.addChildToBack(new Node(Token.TRUE));
        orNode.addChildToBack(new Node(Token.FALSE));
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Or_Unknown() {
        Node orNode = new Node(Token.OR);
        orNode.addChildToBack(new Node(Token.NAME, "x"));
        orNode.addChildToBack(new Node(Token.FALSE));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(orNode));
    }

    @Test
    public void testGetExpressionBooleanValue_Hook_True() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.FALSE));
        hook.addChildToBack(new Node(Token.FALSE));
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(hook));
    }

    @Test
    public void testGetExpressionBooleanValue_Hook_Unknown() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "x"));
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.FALSE));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.getExpressionBooleanValue(hook));
    }

    @Test
    public void testGetExpressionBooleanValue_String() {
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(new Node(Token.STRING, "abc")));
    }

    @Test
    public void testGetExpressionBooleanValue_Number_One() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(1.0);
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(num));
    }

    @Test
    public void testGetExpressionBooleanValue_Number_Zero() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(0.0);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(num));
    }

    @Test
    public void testGetExpressionBooleanValue_Name_Undefined() {
        Node name = new Node(Token.NAME, "undefined");
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(name));
    }

    @Test
    public void testGetExpressionBooleanValue_Name_Infinity() {
        Node name = new Node(Token.NAME, "Infinity");
        assertEquals(TernaryValue.TRUE, NodeUtil.getExpressionBooleanValue(name));
    }

    @Test
    public void testGetExpressionBooleanValue_Null() {
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(new Node(Token.NULL)));
    }

    @Test
    public void testGetBooleanValue_NegativeZero() {
        Node neg = new Node(Token.NEG);
        Node num = new Node(Token.NUMBER);
        num.setDouble(0.0);
        neg.addChildToBack(num);
        assertEquals(TernaryValue.FALSE, NodeUtil.getExpressionBooleanValue(neg));
    }

    @Test
    public void testIsLiteralValue_Number() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(42.0);
        assertTrue(NodeUtil.isLiteralValue(num, false));
    }

    @Test
    public void testIsLiteralValue_String() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.STRING, "x"), false));
    }

    @Test
    public void testIsLiteralValue_ArrayLit() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.ARRAYLIT), false));
    }

    @Test
    public void testIsLiteralValue_ObjectLit() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.OBJECTLIT), false));
    }

    @Test
    public void testIsLiteralValue_Function() {
        Node fn = new Node(Token.FUNCTION);
        assertTrue(NodeUtil.isLiteralValue(fn, true));
    }

    @Test
    public void testIsLiteralValue_FunctionNotInclude() {
        Node fn = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isLiteralValue(fn, false));
    }

    @Test
    public void testIsLiteralValue_Name() {
        assertFalse(NodeUtil.isLiteralValue(new Node(Token.NAME, "x"), false));
    }

    @Test
    public void testIsLiteralValue_Null() {
        assertTrue(NodeUtil.isLiteralValue(new Node(Token.NULL), false));
    }

    @Test
    public void testIsLiteralValue_Hook() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.STRING, "a"));
        hook.addChildToBack(new Node(Token.NULL));
        hook.addChildToBack(new Node(Token.FALSE));
        assertTrue(NodeUtil.isLiteralValue(hook, false));
    }

    @Test
    public void testIsLiteralValue_Add() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.STRING, "a"));
        add.addChildToBack(new Node(Token.STRING, "b"));
        assertTrue(NodeUtil.isLiteralValue(add, false));
    }

    @Test
    public void testIsLiteralValue_AddNotLiteral() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.NAME, "a"));
        add.addChildToBack(new Node(Token.STRING, "b"));
        assertFalse(NodeUtil.isLiteralValue(add, false));
    }

    @Test
    public void testIsValidAssignmentValue() {
        assertTrue(NodeUtil.isValidAssignmentValue(new Node(Token.STRING, "x")));
        assertFalse(NodeUtil.isValidAssignmentValue(new Node(Token.NAME, "x")));
    }

    @Test
    public void testNewExpr() {
        Node callee = new Node(Token.NAME, "Ctor");
        Node expr = NodeUtil.newExpr(callee);
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertSame(callee, expr.getFirstChild());
    }

    @Test
    public void testIsName() {
        assertTrue(NodeUtil.isName(new Node(Token.NAME, "x")));
        assertFalse(NodeUtil.isName(new Node(Token.STRING, "x")));
    }

    @Test
    public void testIsGet() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME, "x")));
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "a"));
        get.addChildToBack(new Node(Token.STRING, "b"));
        assertTrue(NodeUtil.isGet(get));
    }

    @Test
    public void testIsSimpleOperatorType() {
        assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.NAME));
    }

    @Test
    public void testIsAssignmentOp() {
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_ADD));
        assertFalse(NodeUtil.isAssignmentOp(Token.ADD));
    }

    @Test
    public void testIsAssignmentOp_Null() {
        assertFalse(NodeUtil.isAssignmentOp(-1));
    }

    @Test
    public void testIsExpressionNode() {
        assertTrue(NodeUtil.isExpressionNode(new Node(Token.EXPR_RESULT)));
        assertFalse(NodeUtil.isExpressionNode(new Node(Token.BLOCK)));
    }

    @Test
    public void testGetOpName_Valid() {
        assertEquals("+", NodeUtil.getOpName(new Node(Token.ADD)));
        assertEquals("&&", NodeUtil.getOpName(new Node(Token.AND)));
        assertEquals("=", NodeUtil.getOpName(new Node(Token.ASSIGN)));
    }

    @Test
    public void testGetOpName_Null() {
        assertNull(NodeUtil.getOpName(new Node(Token.NAME)));
    }

    @Test
    public void testIsImmutableValue_String() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.STRING, "x")));
    }

    @Test
    public void testIsImmutableValue_Number() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(1.5);
        assertTrue(NodeUtil.isImmutableValue(num));
    }

    @Test
    public void testIsImmutableValue_Null() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.NULL)));
    }

    @Test
    public void testIsImmutableValue_Name() {
        assertFalse(NodeUtil.isImmutableValue(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsImmutableValue_ArrayLit() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsImmutableValue_ObjectLit() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsImmutableValue_Function() {
        assertTrue(NodeUtil.isImmutableValue(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsImmutableValue_Hook() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.FALSE));
        hook.addChildToBack(new Node(Token.NULL));
        assertTrue(NodeUtil.isImmutableValue(hook));
    }

    @Test
    public void testIsImmutableValue_HookNotAllImmutable() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.NAME, "x"));
        hook.addChildToBack(new Node(Token.NULL));
        assertFalse(NodeUtil.isImmutableValue(hook));
    }

    @Test
    public void testIsImmutableValue_Add() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.STRING, "a"));
        add.addChildToBack(new Node(Token.STRING, "b"));
        assertTrue(NodeUtil.isImmutableValue(add));
    }

    @Test
    public void testGetVarsDeclaredInBranch_Empty() {
        Node branch = new Node(Token.BLOCK);
        assertTrue(NodeUtil.getVarsDeclaredInBranch(branch).isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_NonEmpty() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(1, vars.size());
        assertSame(name, vars.iterator().next());
    }

    @Test
    public void testIsVar() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
        assertFalse(NodeUtil.isVar(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsFunctionExpression_NotFunction() {
        assertFalse(NodeUtil.isFunctionExpression(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunctionExpression_FunctionWithName() {
        Node fn = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME, "x");
        fn.addChildToFront(name);
        assertFalse(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsFunctionExpression_Expression() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        assertTrue(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsFunctionExpression_Assignment() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToBack(new Node(Token.NAME, "x"));
        parent.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsFunctionExpression_NameParent() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        Node parent = new Node(Token.NAME);
        parent.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsStringRecursion() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.STRING, "length"));
        assertTrue(NodeUtil.isStringRecursion(get, null));
    }

    @Test
    public void testIsStringRecursion_NotString() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.NAME, "y"));
        assertFalse(NodeUtil.isStringRecursion(get, null));
    }

    @Test
    public void testIsPrototypeProperty_GetProp() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.STRING, "prototype"));
        assertTrue(NodeUtil.isPrototypeProperty(get));
    }

    @Test
    public void testIsPrototypeProperty_GetElem() {
        Node get = new Node(Token.GETELEM);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.STRING, "prototype"));
        assertTrue(NodeUtil.isPrototypeProperty(get));
    }

    @Test
    public void testIsPrototypeProperty_NotPrototype() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.STRING, "other"));
        assertFalse(NodeUtil.isPrototypeProperty(get));
    }

    @Test
    public void testIsPrototypeMethod() {
        Node get = new Node(Token.GETPROP);
        get.addChildToBack(new Node(Token.NAME, "x"));
        get.addChildToBack(new Node(Token.STRING, "prototype"));
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(get);
        assertTrue(NodeUtil.isPrototypeMethod(fn));
    }

    @Test
    public void testIsPrototypeMethod_NotMethod() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToBack(new Node(Token.NAME, "x"));
        assertFalse(NodeUtil.isPrototypeMethod(fn));
    }

    @Test
    public void testIsExprAssign_Assign() {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.STRING, "y"));
        assertTrue(NodeUtil.isExprAssign(assign));
    }

    @Test
    public void testIsExprAssign_NotAssign() {
        assertFalse(NodeUtil.isExprAssign(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetStringValue_Null() {
        assertNull(NodeUtil.getStringValue(new Node(Token.NULL)));
    }

    @Test
    public void testGetStringValue_String() {
        assertEquals("x", NodeUtil.getStringValue(new Node(Token.STRING, "x")));
    }

    @Test
    public void testGetStringValue_Number() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(3.14);
        assertEquals("3.14", NodeUtil.getStringValue(num));
    }

    @Test
    public void testGetStringValue_NumberInteger() {
        Node num = new Node(Token.NUMBER);
        num.setDouble(3.0);
        assertEquals("3", NodeUtil.getStringValue(num));
    }

    @Test
    public void testGetStringValue_Name() {
        assertNull(NodeUtil.getStringValue(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetStringValue_Undefined() {
        assertNull(NodeUtil.getStringValue(new Node(Token.NAME, "undefined")));
    }

    @Test
    public void testGetStringValue_Infinity() {
        assertEquals("Infinity", NodeUtil.getStringValue(new Node(Token.NAME, "Infinity")));
    }

    @Test
    public void testGetStringValue_Nan() {
        assertNull(NodeUtil.getStringValue(new Node(Token.NAME, "NaN")));
    }

    @Test
    public void testIsObjectLitKey_Prop() {
        Node key = new Node(Token.STRING, "key");
        Node obj = new Node(Token.OBJECTLIT);
        obj.addChildToBack(key);
        assertTrue(NodeUtil.isObjectLitKey(key, obj));
    }

    @Test
    public void testIsObjectLitKey_NotObject() {
        Node key = new Node(Token.STRING, "key");
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(key);
        assertFalse(NodeUtil.isObjectLitKey(key, block));
    }

    @Test
    public void testIsObjectLitKey_NullParent() {
        Node key = new Node(Token.STRING, "key");
        assertFalse(NodeUtil.isObjectLitKey(key, null));
    }

    @Test
    public void testRedeclareVarsInsideBranch_EmptyVars() {
        Node branch = new Node(Token.BLOCK);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(branch);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertEquals(1, parent.getChildCount());
    }

    @Test
    public void testRedeclareVarsInsideBranch_NonEmpty() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(branch);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertTrue(parent.getChildCount() > 0);
    }

    @Test
    public void testCopyNameAnnotations_NoAnnotations() {
        Node source = new Node(Token.NAME, "x");
        Node destination = new Node(Token.NAME, "y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertFalse(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testCopyNameAnnotations_WithAnnotations() {
        Node source = new Node(Token.NAME, "x");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = new Node(Token.NAME, "y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNewFunctionNode() {
        List<Node> params = Arrays.asList(new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
        Node fn = NodeUtil.newFunctionNode("foo", params, 0, 0, null);
        assertEquals(Token.FUNCTION, fn.getType());
        assertEquals("foo", fn.getFirstChild().getString());
        assertEquals(2, fn.getChildAtIndex(1).getChildCount());
    }

    @Test
    public void testNewQualifiedNameNode_NoEndPos() {
        Node qname = NodeUtil.newQualifiedNameNode("foo.bar", 0, -1, null);
        assertNotNull(qname);
        assertEquals(Token.GETPROP, qname.getType());
    }

    @Test
    public void testNewQualifiedNameNode_WithEndPos() {
        Node qname = NodeUtil.newQualifiedNameNode("foo.bar", 0, 7, null);
        assertNotNull(qname);
        assertEquals(Token.GETPROP, qname.getType());
    }

    @Test
    public void testNewStringNode() {
        Node str = NodeUtil.newStringNode("hello");
        assertEquals(Token.STRING, str.getType());
        assertEquals("hello", str.getString());
    }

    @Test
    public void testNewVarNode_WithValue() {
        Node value = NodeUtil.newStringNode("x");
        Node var = NodeUtil.newVarNode("v", value);
        assertEquals(Token.NAME, var.getType());
        assertEquals("v", var.getString());
        assertSame(value, var.getFirstChild());
    }

    @Test
    public void testNewVarNode_NullValue() {
        Node var = NodeUtil.newVarNode("v", null);
        assertEquals(Token.NAME, var.getType());
        assertEquals("v", var.getString());
        assertEquals(0, var.getChildCount());
    }

    @Test
    public void testNewVarNode_ValueWithNext() {
        Node value = NodeUtil.newStringNode("x");
        value.addChildToBack(new Node(Token.STRING, "y"));
        try {
            NodeUtil.newVarNode("v", value);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testIsVarOrAssignmentName_Name() {
        assertFalse(NodeUtil.isVarOrAssignmentName(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetVarsDeclaredInBranch_NoVar() {
        Node branch = new Node(Token.BLOCK);
        branch.addChildToBack(new Node(Token.EXPR_RESULT));
        assertTrue(NodeUtil.getVarsDeclaredInBranch(branch).isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_WithVar() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(1, vars.size());
    }

    @Test
    public void testGetVarsDeclaredInBranch_WithAssign() {
        Node branch = new Node(Token.BLOCK);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.STRING, "y"));
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(assign);
        branch.addChildToBack(expr);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(0, vars.size());
    }

    @Test
    public void testGetVarsDeclaredInBranch_WithNameAssign() {
        Node branch = new Node(Token.BLOCK);
        Node name = new Node(Token.NAME, "x");
        name.setType(Token.ASSIGN);
        name.addChildToBack(new Node(Token.NAME, "y"));
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(name);
        branch.addChildToBack(expr);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(0, vars.size());
    }

    @Test
    public void testGetVarsDeclaredInBranch_NullSrcRef() {
        Node branch = new Node(Token.BLOCK);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        node = assign;
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(0, vars.size());
    }

    @Test
    public void testMatchNameNode_Apply() {
        Node name = new Node(Token.NAME, "x");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("x");
        assertTrue(predicate.apply(name));
        assertFalse(predicate.apply(new Node(Token.NAME, "y")));
    }

    @Test
    public void testMatchNodeType_Apply() {
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NAME);
        assertTrue(predicate.apply(new Node(Token.NAME, "x")));
        assertFalse(predicate.apply(new Node(Token.STRING, "x")));
    }

    @Test
    public void testMatchDeclaration_Apply() {
        NodeUtil.MatchDeclaration predicate = new NodeUtil.MatchDeclaration();
        assertTrue(predicate.apply(new Node(Token.VAR)));
        assertTrue(predicate.apply(new Node(Token.FUNCTION)));
        assertFalse(predicate.apply(new Node(Token.NAME)));
    }

    @Test
    public void testMatchNotFunction_Apply() {
        NodeUtil.MatchNotFunction predicate = new NodeUtil.MatchNotFunction();
        assertTrue(predicate.apply(new Node(Token.NAME, "x")));
        assertFalse(predicate.apply(new Node(Token.FUNCTION)));
    }

    @Test
    public void testMatchShallowStatement_Apply() {
        NodeUtil.MatchShallowStatement predicate = new NodeUtil.MatchShallowStatement();
        assertTrue(predicate.apply(new Node(Token.BLOCK)));
        assertTrue(predicate.apply(new Node(Token.VAR)));
        assertFalse(predicate.apply(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsReferenceToDeclaration_Name() {
        Node name = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isReferenceToDeclaration(name, null));
    }

    @Test
    public void testIsReferenceToDeclaration_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.THIS));
        getProp.addChildToBack(new Node(Token.STRING, "x"));
        assertFalse(NodeUtil.isReferenceToDeclaration(getProp, null));
    }

    @Test
    public void testGetFunctionName_Unnamed() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        assertNull(NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testGetFunctionName_Named() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.NAME, "foo"));
        assertNull(NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testGetFunctionName_WithParentGetProp() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME, "a"));
        getProp.addChildToBack(new Node(Token.STRING, "b"));
        Node parent = new Node(Token.ASSIGN);
        parent.addChildToBack(getProp);
        parent.addChildToBack(fn);
        fn.setParent(parent);
        assertEquals("a.b", NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testGetFunctionName_WithParentName() {
        Node fn = new Node(Token.FUNCTION);
        fn.addChildToFront(new Node(Token.EMPTY));
        Node name = new Node(Token.NAME, "foo");
        Node parent = new Node(Token.NAME);
        parent.addChildToBack(fn);
        fn.setParent(parent);
        assertNull(NodeUtil.getFunctionName(fn));
    }

    @Test
    public void testIsInNewExpression_NoParent() {
        assertFalse(NodeUtil.isInNewExpression(new Node(Token.NEW)));
    }

    @Test
    public void testIsInNewExpression_WithNew() {
        Node newExpr = new Node(Token.NEW);
        Node name = new Node(Token.NAME, "x");
        newExpr.addChildToBack(name);
        name.setParent(newExpr);
        assertTrue(NodeUtil.isInNewExpression(name));
    }

    @Test
    public void testIsInNewExpression_NotDirectChild() {
        Node newExpr = new Node(Token.NEW);
        Node name = new Node(Token.NAME, "x");
        Node child = new Node(Token.CALL);
        child.addChildToBack(name);
        newExpr.addChildToBack(child);
        child.setParent(newExpr);
        name.setParent(child);
        assertFalse(NodeUtil.isInNewExpression(name));
    }

    @Test
    public void testIsLoopStructure() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
        assertTrue(NodeUtil.isControlStructure(new Node(Token.FOR)));
        assertFalse(NodeUtil.isControlStructure(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsControlStructureCode_If() {
        Node ifNode = new Node(Token.IF);
        assertTrue(NodeUtil.isControlStructureCode(ifNode, 0));
        assertFalse(NodeUtil.isControlStructureCode(ifNode, 1));
    }

    @Test
    public void testIsControlStructureCode_For() {
        Node forNode = new Node(Token.FOR);
        assertTrue(NodeUtil.isControlStructureCode(forNode, 0));
        assertFalse(NodeUtil.isControlStructureCode(forNode, 1));
    }

    @Test
    public void testIsControlStructureCode_While() {
        Node whileNode = new Node(Token.WHILE);
        assertTrue(NodeUtil.isControlStructureCode(whileNode, 0));
        assertFalse(NodeUtil.isControlStructureCode(whileNode, 1));
    }

    @Test
    public void testIsControlStructureCode_Do() {
        Node doNode = new Node(Token.DO);
        assertTrue(NodeUtil.isControlStructureCode(doNode, 1));
        assertFalse(NodeUtil.isControlStructureCode(doNode, 0));
    }

    @Test
    public void testIsControlStructureCode_NotControl() {
        assertFalse(NodeUtil.isControlStructureCode(new Node(Token.BLOCK), 0));
    }

    @Test
    public void testIsControlStructureCode_NotControlNonZero() {
        assertFalse(NodeUtil.isControlStructureCode(new Node(Token.BLOCK), 1));
    }

    @Test
    public void testIsFunctionCall_NoChildren() {
        Node fn = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isFunctionCall(fn));
    }

    @Test
    public void testIsFunctionCall_Call() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCall_FunctionWithName() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.FUNCTION));
        assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCall_NotCall() {
        Node name = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isFunctionCall(name));
    }

    @Test
    public void testHasSimpleOperator_Simple() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.STRING, "a"));
        add.addChildToBack(new Node(Token.STRING, "b"));
        assertTrue(NodeUtil.hasSimpleOperator(add));
    }

    @Test
    public void testHasSimpleOperator_NotSimple() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.NAME, "a"));
        assertFalse(NodeUtil.hasSimpleOperator(add));
    }

    @Test
    public void testIsSimpleOperator_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME, "a"));
        getProp.addChildToBack(new Node(Token.STRING, "b"));
        assertTrue(NodeUtil.isSimpleOperator(getProp));
    }

    @Test
    public void testIsSimpleOperator_GetElem() {
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(new Node(Token.NAME, "a"));
        getElem.addChildToBack(new Node(Token.STRING, "b"));
        assertFalse(NodeUtil.isSimpleOperator(getElem));
    }

    @Test
    public void testIsSimpleOperator_NotSimple() {
        assertFalse(NodeUtil.isSimpleOperator(new Node(Token.NAME)));
    }

    @Test
    public void testGetCallTarget_NoChildren() {
        Node call = new Node(Token.CALL);
        assertNull(NodeUtil.getCallTarget(call));
    }

    @Test
    public void testGetCallTarget_WithChildren() {
        Node call = new Node(Token.CALL);
        Node name = new Node(Token.NAME, "x");
        call.addChildToBack(name);
        assertSame(name, NodeUtil.getCallTarget(call));
    }

    @Test
    public void testGetCallTarget_NotCall() {
        assertNull(NodeUtil.getCallTarget(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetCallTarget_Function() {
        Node call = new Node(Token.CALL);
        Node fn = new Node(Token.FUNCTION);
        call.addChildToBack(fn);
        assertSame(fn, NodeUtil.getCallTarget(call));
    }

    @Test
    public void testIsCallTarget_Name() {
        assertTrue(NodeUtil.isCallTarget(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsCallTarget_Function() {
        assertTrue(NodeUtil.isCallTarget(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsCallTarget_NotCallTarget() {
        assertFalse(NodeUtil.isCallTarget(new Node(Token.STRING, "x")));
    }

    @Test
    public void testIsCallTarget_NotCallTargetParent() {
        Node call = new Node(Token.CALL);
        Node name = new Node(Token.NAME, "x");
        call.addChildToBack(name);
        name.setParent(call);
        assertFalse(NodeUtil.isCallTarget(name));
    }

    @Test
    public void testIsThis_This() {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_NotThis() {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsThis_NotThisParent() {
        Node thisNode = new Node(Token.THIS);
        Node getName = new Node(Token.GETPROP);
        getName.addChildToBack(thisNode);
        assertFalse(NodeUtil.isThis(thisNode));
    }

    @Test
    public void testIsFunction_EmptyStringFunction() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_NotFunction() {
        assertFalse(NodeUtil.isFunction(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsCall_EmptyStringCall() {
        assertTrue(NodeUtil.isCall(new Node(Token.CALL)));
    }

    @Test
    public void testIsCall_NotCall() {
        assertFalse(NodeUtil.isCall(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsNew_EmptyStringNew() {
        assertTrue(NodeUtil.isNew(new Node(Token.NEW)));
    }

    @Test
    public void testIsNew_NotNew() {
        assertFalse(NodeUtil.isNew(new Node(Token.NAME, "x")));
    }

    @Test
    public void testHasCorrespondingParseTree() {
        Node call = new Node(Token.CALL);
        call.setLineno(1);
        assertTrue(NodeUtil.hasCorrespondingParseTree(call));
        assertFalse(NodeUtil.hasCorrespondingParseTree(new Node(Token.CALL)));
    }

    @Test
    public void testIsInlinedFunction_NotFunction() {
        assertFalse(NodeUtil.isInlinedFunction(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsInlinedFunction_FunctionNotInline() {
        Node fn = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isInlinedFunction(fn));
    }

    @Test
    public void testIsInlinedFunction_WithParentCall() {
        Node fn = new Node(Token.FUNCTION);
        Node call = new Node(Token.CALL);
        call.addChildToBack(fn);
        fn.setParent(call);
        assertTrue(NodeUtil.isInlinedFunction(fn));
    }

    @Test
    public void testIsInlinedFunction_WithParentNotCall() {
        Node fn = new Token(Token.FUNCTION);
        Node name = new Node(Token.NAME, "x");
        name.addChildToBack(fn);
        fn.setParent(name);
        assertFalse(NodeUtil.isInlinedFunction(fn));
    }

    @Test
    public void testGetCallNode_NotFunction() {
        Node fn = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getCallNode(fn));
    }

    @Test
    public void testGetCallNode_WithParentCall() {
        Node fn = new Node(Token.FUNCTION);
        Node call = new Node(Token.CALL);
        call.addChildToBack(fn);
        fn.setParent(call);
        assertSame(call, NodeUtil.getCallNode(fn));
    }

    @Test
    public void testGetCallNode_WithGrandparentCall() {
        Node fn = new Node(Token.FUNCTION);
        Node call = new Node(Token.CALL);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(fn);
        call.addChildToBack(assign);
        assign.setParent(call);
        fn.setParent(assign);
        assertSame(call, NodeUtil.getCallNode(fn));
    }

    @Test
    public void testGetCallNode_NotCallParent() {
        Node fn = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(fn);
        fn.setParent(assign);
        assertNull(NodeUtil.getCallNode(fn));
    }

    @Test
    public void testIsVar_NoName() {
        Node var = new Node(Token.VAR);
        assertTrue(NodeUtil.isVar(var));
    }

    @Test
    public void testIsVar_NotVar() {
        assertFalse(NodeUtil.isVar(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsName_NoName() {
        Node name = new Node(Token.NAME, "");
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_NotName() {
        assertFalse(NodeUtil.isName(new Node(Token.STRING, "x")));
    }

    @Test
    public void testIsName_WithProperty() {
        Node name = new Node(Token.NAME, "x");
        name.putProp(Node.ORIGINALNAME_PROP, "y");
        assertFalse(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithNoProperty() {
        Node name = new Node(Token.NAME, "x");
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithParentGetProp() {
        Node name = new Node(Token.NAME, "x");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(name);
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithParentGetElemNotString() {
        Node name = new Node(Token.NAME, "x");
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(name);
        getElem.addChildToBack(new Node(Token.NAME, "y"));
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithParentGetElemString() {
        Node name = new Node(Token.NAME, "x");
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(name);
        getElem.addChildToBack(new Node(Token.STRING, "y"));
        assertFalse(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithParentNotGetElem() {
        Node name = new Node(Token.NAME, "x");
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(name);
        assertFalse(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_WithParentGetPropType() {
        Node name = new Node(Token.NAME, "x");
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(name);
        assertTrue(NodeUtil.isName(name));
    }

    @Test
    public void testIsName_NoParent() {
        Node name = new Node(Token.NAME, "x");
        assertFalse(NodeUtil.isName(name));
    }

    @Test
    public void testIsGet_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(getProp));
    }

    @Test
    public void testIsGet_GetElem() {
        Node getElem = new Node(Token.GETELEM);
        assertTrue(NodeUtil.isGet(getElem));
    }

    @Test
    public void testIsGet_NotGet() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetName_NoName() {
        Node name = new Node(Token.NAME);
        assertEquals("", NodeUtil.getName(name));
    }

    @Test
    public void testGetName_String() {
        Node name = new Node(Token.NAME, "x");
        assertEquals("x", NodeUtil.getName(name));
    }

    @Test
    public void testGetName_NotNameAndNotGet() {
        assertEquals("", NodeUtil.getName(new Node(Token.STRING, "x")));
    }

    @Test
    public void testGetName_GetProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME, "a"));
        getProp.addChildToBack(new Node(Token.STRING, "b"));
        assertEquals("b", NodeUtil.getName(getProp));
    }

    @Test
    public void testGetName_GetPropLastNotString() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME, "a"));
        getProp.addChildToBack(new Node(Token.NAME, "b"));
        assertEquals("", NodeUtil.getName(getProp));
    }

    @Test
    public void testGetName_GetElem() {
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(new Node(Token.NAME, "a"));
        getElem.addChildToBack(new Node(Token.STRING, "b"));
        assertEquals("b", NodeUtil.getName(getElem));
    }

    @Test
    public void testGetName_GetElemNotString() {
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(new Node(Token.NAME, "a"));
        getElem.addChildToBack(new Node(Token.NAME, "b"));
        assertEquals("", NodeUtil.getName(getElem));
    }

    @Test
    public void testGetName_GetElemEmptyString() {
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(new Node(Token.NAME, "a"));
        Node str = new Node(Token.STRING, "");
        str.setString("");
        getElem.addChildToBack(str);
        assertEquals("[]", NodeUtil.getName(getElem));
    }

    @Test
    public void testIsValidPropertyName_Valid() {
        assertTrue(NodeUtil.isValidPropertyName("foo"));
    }

    @Test
    public void testIsValidPropertyName_Invalid() {
        assertFalse(NodeUtil.isValidPropertyName("foo-bar"));
    }

    @Test
    public void testIsValidPropertyName_Number() {
        assertFalse(NodeUtil.isValidPropertyName("123"));
    }

    @Test
    public void testIsValidPropertyName_Reserved() {
        assertFalse(NodeUtil.isValidPropertyName("class"));
    }

    @Test
    public void testIsValidPropertyName_Empty() {
        assertFalse(NodeUtil.isValidPropertyName(""));
    }

    @Test
    public void testIsValidPropertyName_Reserved2() {
        assertFalse(NodeUtil.isValidPropertyName("default"));
    }

    @Test
    public void testIsValidPropertyName_Underscore() {
        assertTrue(NodeUtil.isValidPropertyName("_foo"));
    }

    @Test
    public void testIsValidPropertyName_Dollar() {
        assertTrue(NodeUtil.isValidPropertyName("$foo"));
    }

    @Test
    public void testIsValidPropertyName_Unicode() {
        assertTrue(NodeUtil.isValidPropertyName("éxample"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeLetter() {
        assertFalse(NodeUtil.isValidPropertyName("é"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeDigit() {
        assertFalse(NodeUtil.isValidPropertyName("1é"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeUnderscore() {
        assertTrue(NodeUtil.isValidPropertyName("_é"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeDollar() {
        assertTrue(NodeUtil.isValidPropertyName("$é"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeSpace() {
        assertFalse(NodeUtil.isValidPropertyName("é "));
    }

    @Test
    public void testIsValidPropertyName_UnicodeTab() {
        assertFalse(NodeUtil.isValidPropertyName("\t"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNewline() {
        assertFalse(NodeUtil.isValidPropertyName("\n"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeBOM() {
        assertFalse(NodeUtil.isValidPropertyName("\uFEFF"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeZeroWidthSpace() {
        assertFalse(NodeUtil.isValidPropertyName("\u200B"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeZeroWidthJoiner() {
        assertFalse(NodeUtil.isValidPropertyName("\u200D"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeZeroWidthNoBreakSpace() {
        assertFalse(NodeUtil.isValidPropertyName("\uFEFF"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter() {
        assertFalse(NodeUtil.isValidPropertyName("1"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter2() {
        assertFalse(NodeUtil.isValidPropertyName("!"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter3() {
        assertFalse(NodeUtil.isValidPropertyName("@"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter4() {
        assertFalse(NodeUtil.isValidPropertyName("["));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter5() {
        assertFalse(NodeUtil.isValidPropertyName("]"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter6() {
        assertFalse(NodeUtil.isValidPropertyName("{"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter7() {
        assertFalse(NodeUtil.isValidPropertyName("}"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter8() {
        assertFalse(NodeUtil.isValidPropertyName("|"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter9() {
        assertFalse(NodeUtil.isValidPropertyName("\\"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter10() {
        assertFalse(NodeUtil.isValidPropertyName("/"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter11() {
        assertFalse(NodeUtil.isValidPropertyName(":"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter12() {
        assertFalse(NodeUtil.isValidPropertyName(";"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter13() {
        assertFalse(NodeUtil.isValidPropertyName("'"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter14() {
        assertFalse(NodeUtil.isValidPropertyName("\""));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter15() {
        assertFalse(NodeUtil.isValidPropertyName("<"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter16() {
        assertFalse(NodeUtil.isValidPropertyName(">"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter17() {
        assertFalse(NodeUtil.isValidPropertyName("="));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter18() {
        assertFalse(NodeUtil.isValidPropertyName("+"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter19() {
        assertFalse(NodeUtil.isValidPropertyName("-"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter20() {
        assertFalse(NodeUtil.isValidPropertyName("*"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter21() {
        assertFalse(NodeUtil.isValidPropertyName("%"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter22() {
        assertFalse(NodeUtil.isValidPropertyName("&"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter23() {
        assertFalse(NodeUtil.isValidPropertyName("|"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter24() {
        assertFalse(NodeUtil.isValidPropertyName("^"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter25() {
        assertFalse(NodeUtil.isValidPropertyName("!"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter26() {
        assertFalse(NodeUtil.isValidPropertyName("~"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter27() {
        assertFalse(NodeUtil.isValidPropertyName("?"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter28() {
        assertFalse(NodeUtil.isValidPropertyName("."));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter29() {
        assertFalse(NodeUtil.isValidPropertyName(","));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter30() {
        assertFalse(NodeUtil.isValidPropertyName("("));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter31() {
        assertFalse(NodeUtil.isValidPropertyName(")"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter32() {
        assertFalse(NodeUtil.isValidPropertyName(" "));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter33() {
        assertFalse(NodeUtil.isValidPropertyName("\t"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter34() {
        assertFalse(NodeUtil.isValidPropertyName("\n"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter35() {
        assertFalse(NodeUtil.isValidPropertyName("\r"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter36() {
        assertFalse(NodeUtil.isValidPropertyName("\f"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter37() {
        assertFalse(NodeUtil.isValidPropertyName("\b"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter38() {
        assertFalse(NodeUtil.isValidPropertyName("\0"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter39() {
        assertFalse(NodeUtil.isValidPropertyName("\u0000"));
    }

    @Test
    public void testIsValidPropertyName_UnicodeNotLetter40() {
        assertFalse(NodeUtil.isValidPropertyName("\uFFFF"));
    }
}