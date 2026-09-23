package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {
    private Node node;

    @Before
    public void setUp() {
        node = new Node(Token.EMPTY);
    }

    @After
    public void tearDown() {
        node = null;
    }

    @Test
    public void testIsFunctionObjectCall_ValidCall() {
        Node callNode = new Node(Token.CALL);
        Node nameNode = Node.newString(Token.NAME, "foo");
        callNode.addChildToBack(nameNode);
        Node param = new Node(Token.NAME, "arg");
        callNode.addChildToBack(param);
        assertNotNull(callNode);
    }

    @Test
    public void testHasExceptionInCall_SimpleFunction() {
        Node callNode = new Node(Token.CALL);
        Node nameNode = Node.newString(Token.NAME, "console");
        Node propNode = Node.newString(Token.STRING, "log");
        Node getProp = new Node(Token.GETPROP, nameNode, propNode);
        callNode.addChildToBack(getProp);
        assertTrue(NodeUtil.mayHaveSideEffects(callNode));
    }

    @Test
    public void testIsAssignmentOp_AllCases() {
        int[] assignOps = {Token.ASSIGN, Token.ASSIGN_BITOR, Token.ASSIGN_BITXOR,
                Token.ASSIGN_BITAND, Token.ASSIGN_LSH, Token.ASSIGN_RSH,
                Token.ASSIGN_URSH, Token.ASSIGN_ADD, Token.ASSIGN_SUB,
                Token.ASSIGN_MUL, Token.ASSIGN_DIV, Token.ASSIGN_MOD};
        for (int op : assignOps) {
            assertTrue("Should be assignment op: " + Token.name(op),
                    NodeUtil.isAssignmentOp(new Node(op)));
        }
    }

    @Test
    public void testIsName_ValidName() {
        Node nameNode = Node.newString(Token.NAME, "myVar");
        assertTrue(NodeUtil.isName(nameNode));
    }

    @Test
    public void testIsName_Null() {
        assertFalse(NodeUtil.isName(null));
    }

    @Test
    public void testGetNearestFunctionName_Null() {
        assertNull(NodeUtil.getNearestFunctionName(new Node(Token.EMPTY)));
    }

    @Test
    public void testGetNearestFunctionName_Valid() {
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "foo");
        funcNode.addChildToBack(nameNode);
        assertEquals("foo", NodeUtil.getNearestFunctionName(nameNode));
    }

    @Test
    public void testIsLiteralValue_NullLiteral() {
        Node nullNode = new Node(Token.NULL);
        assertTrue(NodeUtil.isLiteralValue(nullNode, false));
    }

    @Test
    public void testIsLiteralValue_String() {
        Node strNode = Node.newString(Token.STRING, "hello");
        assertTrue(NodeUtil.isLiteralValue(strNode, false));
    }

    @Test
    public void testIsLiteralValue_ArrayLit() {
        Node arrayNode = new Node(Token.ARRAYLIT);
        assertTrue(NodeUtil.isLiteralValue(arrayNode, false));
    }

    @Test
    public void testIsLiteralValue_ObjectLit() {
        Node objNode = new Node(Token.OBJECTLIT);
        assertTrue(NodeUtil.isLiteralValue(objNode, false));
    }

    @Test
    public void testIsLiteralValue_Function() {
        Node funcNode = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isLiteralValue(funcNode, false));
        assertTrue(NodeUtil.isLiteralValue(funcNode, true));
    }

    @Test
    public void testIsNullOrUndefined_Null() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }

    @Test
    public void testIsNullOrUndefined_Void() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.VOID)));
    }

    @Test
    public void testIsNullOrUndefined_Other() {
        assertFalse(NodeUtil.isNullOrUndefined(new Node(Token.NAME, "x")));
    }

    @Test
    public void testGetImpureBooleanValue_And() {
        Node andNode = new Node(Token.AND);
        Node left = new Node(Token.TRUE);
        Node right = new Node(Token.FALSE);
        andNode.addChildToBack(left);
        andNode.addChildToBack(right);
        // For AND, if left is true, result is right's boolean value (false)
        assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(andNode));
    }

    @Test
    public void testGetImpureBooleanValue_Or() {
        Node orNode = new Node(Token.OR);
        Node left = new Node(Token.FALSE);
        Node right = new Node(Token.TRUE);
        orNode.addChildToBack(left);
        orNode.addChildToBack(right);
        assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(orNode));
    }

    @Test
    public void testGetStringValue_Integer() {
        assertEquals("42.0", NodeUtil.getStringValue(42.0));
    }

    @Test
    public void testGetStringValue_NaN() {
        assertEquals("NaN", NodeUtil.getStringValue(Double.NaN));
    }

    @Test
    public void testGetStringValue_Infinity() {
        assertEquals("Infinity", NodeUtil.getStringValue(Double.POSITIVE_INFINITY));
    }

    @Test
    public void testGetStringNumberValue_ValidHex() {
        assertEquals(255.0, NodeUtil.getStringNumberValue("0xFF"), 0.001);
    }

    @Test
    public void testGetStringNumberValue_Invalid() {
        assertNull(NodeUtil.getStringNumberValue("abc"));
    }

    @Test
    public void testIsSimpleOperatorType_AllOps() {
        int[] ops = {Token.BITOR, Token.OR, Token.BITXOR, Token.AND, Token.BITAND,
                Token.SHEQ, Token.EQ, Token.NOT, Token.NE, Token.SHNE, Token.LSH,
                Token.IN, Token.LE, Token.LT, Token.URSH, Token.RSH, Token.GE,
                Token.GT, Token.MUL, Token.DIV, Token.MOD, Token.BITNOT,
                Token.ADD, Token.SUB, Token.POS, Token.NEG, Token.INSTANCEOF,
                Token.TYPEOF, Token.VOID, Token.ASSIGN, Token.ASSIGN_BITOR,
                Token.ASSIGN_BITXOR, Token.ASSIGN_BITAND, Token.ASSIGN_LSH,
                Token.ASSIGN_RSH, Token.ASSIGN_URSH, Token.ASSIGN_ADD,
                Token.ASSIGN_SUB, Token.ASSIGN_MUL, Token.ASSIGN_DIV,
                Token.ASSIGN_MOD};
        for (int op : ops) {
            assertTrue("Should be simple: " + Token.name(op),
                    NodeUtil.isSimpleOperatorType(op));
        }
    }

    @Test
    public void testIsSimpleOperatorType_Negative() {
        assertFalse(NodeUtil.isSimpleOperatorType(Token.NAME));
        assertFalse(NodeUtil.isSimpleOperatorType(Token.FUNCTION));
    }

    @Test
    public void testIsLoopStructure_While() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
    }

    @Test
    public void testIsLoopStructure_Do() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
    }

    @Test
    public void testIsLoopStructure_For() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsLoopStructure_NotLoop() {
        assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsExprAssign_Assign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node target = Node.newString(Token.NAME, "x");
        Node value = new Node(Token.NUMBER, 1.0);
        assignNode.addChildToBack(target);
        assignNode.addChildToBack(value);
        assertTrue(NodeUtil.isExprAssign(assignNode));
    }

    @Test
    public void testIsExprAssign_Call() {
        Node callNode = new Node(Token.CALL);
        assertFalse(NodeUtil.isExprAssign(callNode));
    }

    @Test
    public void testGetRootOfQualifiedName_SimpleName() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        assertEquals(nameNode, NodeUtil.getRootOfQualifiedName(nameNode));
    }

    @Test
    public void testGetRootOfQualifiedName_Qualified() {
        Node qualNode = new Node(Token.GETPROP,
                new Node(Token.GETPROP, Node.newString(Token.NAME, "a"),
                        Node.newString(Token.STRING, "b")),
                Node.newString(Token.STRING, "c"));
        Node root = NodeUtil.getRootOfQualifiedName(qualNode);
        assertNotNull(root);
        assertEquals(Token.NAME, root.getType());
        assertEquals("a", root.getString());
    }

    @Test
    public void testGetVarsDeclaredInBranch_NoVars() {
        Node root = new Node(Token.BLOCK);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranch_WithVar() {
        Node root = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        var.addChildToBack(name);
        root.addChildToBack(var);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(root);
        assertEquals(1, vars.size());
    }

    @Test
    public void testIsReferenceTo_Valid() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node refNode = Node.newString(Token.NAME, "foo");
        assertTrue(NodeUtil.isReferenceTo(nameNode, refNode));
    }

    @Test
    public void testIsReferenceTo_DifferentName() {
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node refNode = Node.newString(Token.NAME, "bar");
        assertFalse(NodeUtil.isReferenceTo(nameNode, refNode));
    }

    @Test
    public void testContainsType_Null() {
        assertFalse(NodeUtil.containsType(null, Token.NAME));
    }

    @Test
    public void testContainsType_Simple() {
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(Node.newString(Token.NAME, "x"));
        assertTrue(NodeUtil.containsType(root, Token.NAME));
    }

    @Test
    public void testIsControlStructure_Normal() {
        assertTrue(NodeUtil.isControlStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsControlStructure_Not() {
        assertFalse(NodeUtil.isControlStructure(new Node(Token.NAME)));
    }

    @Test(expected = NullPointerException.class)
    public void testNewExpr_Null() {
        NodeUtil.newExpr(null);
    }

    @Test
    public void testNewExpr_Valid() {
        Node child = new Node(Token.NAME, "x");
        Node expr = NodeUtil.newExpr(child);
        assertNotNull(expr);
        assertEquals(Token.EXPR_RESULT, expr.getType());
    }

    @Test
    public void testGetSourceName_Null() {
        Node n = new Node(Token.EMPTY);
        assertNull(NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetFunctionJSDocInfo_Null() {
        Node func = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getFunctionJSDocInfo(func));
    }

    @Test
    public void testRemoveChild_Valid() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.EMPTY);
        parent.addChildToBack(child);
        assertTrue(parent.hasChildren());
        NodeUtil.removeChild(parent, child);
        assertFalse(parent.hasChildren());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveChild_NotChild() {
        Node parent = new Node(Token.BLOCK);
        Node child = new Node(Token.EMPTY);
        parent.addChildToBack(new Node(Token.EMPTY));
        NodeUtil.removeChild(parent, child);
    }

    @Test
    public void testMayHaveSideEffects_EmptyNode() {
        Node n = new Node(Token.EMPTY);
        assertFalse(NodeUtil.mayHaveSideEffects(n));
    }

    @Test
    public void testMayHaveSideEffects_Call() {
        Node call = new Node(Token.CALL);
        Node name = Node.newString(Token.NAME, "foo");
        call.addChildToBack(name);
        assertTrue(NodeUtil.mayHaveSideEffects(call));
    }

    @Test
    public void testMayHaveSideEffects_Delete() {
        Node del = new Node(Token.DELPROP);
        Node name = Node.newString(Token.NAME, "foo");
        del.addChildToBack(name);
        assertTrue(NodeUtil.mayHaveSideEffects(del));
    }

    @Test
    public void testMayHaveSideEffects_New() {
        Node newCall = new Node(Token.NEW);
        Node name = Node.newString(Token.NAME, "Foo");
        newCall.addChildToBack(name);
        assertTrue(NodeUtil.mayHaveSideEffects(newCall));
    }

    @Test
    public void testIsVar_Valid() {
        assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
    }

    @Test
    public void testIsVar_Invalid() {
        assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsLoopStructure_Valid() {
        assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
    }

    @Test
    public void testIsThis_Valid() {
        assertTrue(NodeUtil.isThis(new Node(Token.THIS)));
    }

    @Test
    public void testIsThis_Invalid() {
        assertFalse(NodeUtil.isThis(new Node(Token.NAME)));
    }

    @Test
    public void testIsHoistedFunctionDeclaration_Valid() {
        Node func = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isHoistedFunctionDeclaration(func));
    }

    @Test
    public void testIsFunction_Valid() {
        assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsFunction_Invalid() {
        assertFalse(NodeUtil.isFunction(new Node(Token.NAME)));
    }

    @Test
    public void testNameToEqualsNode_Null() {
        assertNull(NodeUtil.nameToEqualsNode(null));
    }

    @Test
    public void testNameToEqualsNode_Valid() {
        Node name = Node.newString(Token.NAME, "x");
        Node eq = NodeUtil.nameToEqualsNode(name);
        assertNotNull(eq);
        assertEquals(Token.EQ, eq.getType());
    }

    @Test
    public void testIsConstNumber_Valid() {
        Node num = new Node(Token.NUMBER, 5.0);
        assertTrue(NodeUtil.isConstNumber(num));
    }

    @Test
    public void testIsConstNumber_Invalid() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isConstNumber(name));
    }

    @Test
    public void testIsFunctionOrObjectLitKey_Valid() {
        Node key = Node.newString(Token.STRING, "foo");
        Node obj = new Node(Token.OBJECTLIT, key);
        key.setParent(obj);
        assertTrue(NodeUtil.isObjectLitKey(key, obj));
    }

    @Test
    public void testIsObjectLitKey_Invalid() {
        Node key = Node.newString(Token.STRING, "foo");
        Node parent = new Node(Token.NAME);
        key.setParent(parent);
        assertFalse(NodeUtil.isObjectLitKey(key, parent));
    }

    @Test
    public void testIsGet_Valid() {
        Node getProp = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(getProp));
    }

    @Test
    public void testIsGet_Invalid() {
        assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testGetNameFromNode_Null() {
        assertNull(NodeUtil.getNameFromNode(null));
    }

    @Test
    public void testGetNameFromNode_Simple() {
        Node name = Node.newString(Token.NAME, "foo");
        assertEquals("foo", NodeUtil.getNameFromNode(name));
    }

    @Test
    public void testGetNameFromNode_GetProp() {
        Node getProp = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "a"),
                Node.newString(Token.STRING, "b"));
        assertEquals("b", NodeUtil.getNameFromNode(getProp));
    }

    @Test
    public void testIsNullOrUndefined_True() {
        assertTrue(NodeUtil.isNullOrUndefined(new Node(Token.NULL)));
    }

    @Test
    public void testIsNullOrUndefined_False() {
        assertFalse(NodeUtil.isNullOrUndefined(new Node(Token.NAME)));
    }

    @Test
    public void testIsLiteralObjectOrArrayLit_Null() {
        assertFalse(NodeUtil.isLiteralObjectOrArrayLit(new Node(Token.NULL)));
    }

    @Test
    public void testIsLiteralObjectOrArrayLit_Obj() {
        assertTrue(NodeUtil.isLiteralObjectOrArrayLit(new Node(Token.OBJECTLIT)));
    }

    @Test
    public void testIsLiteralObjectOrArrayLit_Array() {
        assertTrue(NodeUtil.isLiteralObjectOrArrayLit(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testGetConditionalExpression_If() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.TRUE);
        ifNode.addChildToBack(cond);
        assertSame(cond, NodeUtil.getConditionalExpression(ifNode));
    }

    @Test
    public void testGetConditionalExpression_NotIf() {
        assertNull(NodeUtil.getConditionalExpression(new Node(Token.NAME)));
    }
}