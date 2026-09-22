package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class NodeUtilTest {

    private NodeUtil nodeUtil;

    @Before
    public void setUp() {
        nodeUtil = new NodeUtil();
    }

    @After
    public void tearDown() {
        nodeUtil = null;
    }

    @Test
    public void testGetStringValue_normalCase() {
        assertEquals("1.5", NodeUtil.getStringValue(1.5));
        assertEquals("2", NodeUtil.getStringValue(2.0));
        assertEquals("3.25", NodeUtil.getStringValue(3.25));
    }

    @Test
    public void testGetStringValue_boundaryValues() {
        assertEquals("0", NodeUtil.getStringValue(0.0));
        assertEquals("-5", NodeUtil.getStringValue(-5.0));
        assertEquals("1.0E10", NodeUtil.getStringValue(1.0E10));
    }

    @Test
    public void testGetStringValue_null() {
        assertNull(NodeUtil.getStringValue(null));
    }

    @Test
    public void testGetStringNumberValue_normalCase() {
        assertEquals(Double.valueOf(1.5), NodeUtil.getStringNumberValue("1.5"));
        assertEquals(Double.valueOf(-2.0), NodeUtil.getStringNumberValue("-2"));
        assertEquals(Double.valueOf(3.0), NodeUtil.getStringNumberValue("3.0"));
    }

    @Test
    public void testGetStringNumberValue_invalid() {
        assertNull(NodeUtil.getStringNumberValue("abc"));
        assertNull(NodeUtil.getStringNumberValue("1.5.2"));
        assertNull(NodeUtil.getStringNumberValue("0x1G"));
    }

    @Test
    public void testGetStringNumberValue_empty() {
        assertNull(NodeUtil.getStringNumberValue(""));
        assertNull(NodeUtil.getStringNumberValue("   "));
    }

    @Test
    public void testIsStrWhiteSpaceChar() {
        assertTrue(NodeUtil.isStrWhiteSpaceChar(' '));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\n'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\t'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\r'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u000B'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u000C'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u00A0'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u2028'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u2029'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
        assertFalse(NodeUtil.isStrWhiteSpaceChar('a'));
        assertFalse(NodeUtil.isStrWhiteSpaceChar('1'));
    }

    @Test
    public void testIsValidQualifiedName() {
        assertTrue(NodeUtil.isValidQualifiedName("a.b.c"));
        assertTrue(NodeUtil.isValidQualifiedName("a"));
        assertTrue(NodeUtil.isValidQualifiedName("a_b.c2"));
        assertFalse(NodeUtil.isValidQualifiedName(""));
        assertFalse(NodeUtil.isValidQualifiedName(".a"));
        assertFalse(NodeUtil.isValidQualifiedName("a."));
        assertFalse(NodeUtil.isValidQualifiedName("1a"));
    }

    @Test
    public void testIsLValue_simpleName() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValue_nullParent() {
        Node name = Node.newString(Token.NAME, "x");
        assertEquals(false, NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValue_property() {
        Node parent = new Node(Token.GETPROP);
        Node name = Node.newString(Token.STRING, "x");
        parent.addChildToBack(Node.newString(Token.NAME, "obj"));
        parent.addChildToBack(name);
        name.setParent(parent);
        assertFalse(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValue_assignTarget() {
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        assign.addChildToBack(name);
        assign.addChildToBack(Node.newNumber(1));
        name.setParent(assign);
        assertFalse(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValue_incDec() {
        Node inc = new Node(Token.INC);
        Node name = Node.newString(Token.NAME, "x");
        inc.addChildToBack(name);
        name.setParent(inc);
        assertFalse(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValue_forInTarget() {
        Node forIn = new Node(Token.FOR_IN);
        Node name = Node.newString(Token.NAME, "x");
        forIn.addChildToBack(name);
        name.setParent(forIn);
        assertFalse(NodeUtil.isLValue(name));
    }

    @Test
    public void testGetNearestFunctionName_function() {
        Node fn = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "testFunc");
        fn.addChildToBack(name);
        fn.setParent(new Node(Token.SCRIPT));
        assertEquals("testFunc", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionName_assignedFunction() {
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "testFunc");
        Node fn = new Node(Token.FUNCTION);
        assign.addChildToBack(name);
        assign.addChildToBack(fn);
        assertEquals("testFunc", NodeUtil.getNearestFunctionName(assign));
    }

    @Test
    public void testGetNearestFunctionName_var() {
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "testFunc");
        Node fn = new Node(Token.FUNCTION);
        var.addChildToBack(name);
        name.addChildToBack(fn);
        assertEquals("testFunc", NodeUtil.getNearestFunctionName(var));
    }

    @Test
    public void testGetNearestFunctionName_objectLiteralKey() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "testFunc");
        Node fn = new Node(Token.FUNCTION);
        objLit.addChildToBack(key);
        key.addChildToBack(fn);
        assertEquals("testFunc", NodeUtil.getNearestFunctionName(objLit));
    }

    @Test
    public void testGetNearestFunctionName_notFunction() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getNearestFunctionName(n));
    }

    @Test
    public void testIsFunctionDeclaration_var() {
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "f");
        Node fn = new Node(Token.FUNCTION);
        var.addChildToBack(name);
        name.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_notDeclaration() {
        Node fn = new Node(Token.FUNCTION);
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_assigned() {
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "f");
        Node fn = new Node(Token.FUNCTION);
        assign.addChildToBack(name);
        assign.addChildToBack(fn);
        assertFalse(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testIsFunctionDeclaration_functionStatement() {
        Node script = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION);
        script.addChildToBack(fn);
        assertTrue(NodeUtil.isFunctionDeclaration(fn));
    }

    @Test
    public void testGetFunctionParameters_empty() {
        Node fn = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.PARAM_LIST);
        fn.addChildToBack(name);
        fn.addChildToBack(params);
        assertEquals(params, NodeUtil.getFunctionParameters(fn));
    }

    @Test
    public void testGetFunctionParameters_withParams() {
        Node fn = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.PARAM_LIST);
        params.addChildToBack(Node.newString(Token.NAME, "a"));
        params.addChildToBack(Node.newString(Token.NAME, "b"));
        fn.addChildToBack(name);
        fn.addChildToBack(params);
        assertEquals(params, NodeUtil.getFunctionParameters(fn));
    }

    @Test
    public void testGetFunctionJSDocInfo_null() {
        Node fn = new Node(Token.FUNCTION);
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetFunctionJSDocInfo_withJSDoc() {
        Node fn = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        fn.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetSourceName_simple() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getSourceName(n));
    }

    @Test
    public void testGetInputId_null() {
        Node n = new Node(Token.NAME);
        assertNull(NodeUtil.getInputId(n));
    }

    @Test
    public void testNewQualifiedNameNode_missingLeadingName() {
        Node result = NodeUtil.newQualifiedNameNode("a.b", 2, null);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
        assertTrue(result.getFirstChild().isName());
        assertEquals("a", result.getFirstChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode_normal() {
        Node result = NodeUtil.newQualifiedNameNode("a.b.c", 5, null);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testNewQualifiedNameNode_simpleName() {
        Node result = NodeUtil.newQualifiedNameNode("a", 0, null);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("a", result.getString());
    }

    @Test
    public void testNewQualifiedNameNodeDeclaration_var() {
        Node result = NodeUtil.newQualifiedNameNodeDeclaration(null, "a.b", new Node(Token.NUMBER), null);
        assertNotNull(result);
        assertEquals(Token.VAR, result.getType());
        assertTrue(result.hasOneChild());
        assertTrue(result.getFirstChild().isName());
        assertEquals("a", result.getFirstChild().getString());
    }

    @Test
    public void testNewQualifiedNameNodeDeclaration_assign() {
        Node result = NodeUtil.newQualifiedNameNodeDeclaration(null, "a.b.c", new Node(Token.NUMBER), null);
        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
        assertTrue(result.getFirstChild().isAssign());
    }

    @Test
    public void testMapMainToClone_empty() {
        Map<Node, Node> result = NodeUtil.mapMainToClone(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMapMainToClone_nonEmpty() {
        Node main = new Node(Token.SCRIPT);
        Node child = new Node(Token.NAME);
        main.addChildToBack(child);
        Node clone = new Node(Token.SCRIPT);
        Node cloneChild = new Node(Token.NAME);
        clone.addChildToBack(cloneChild);
        Map<Node, Node> result = NodeUtil.mapMainToClone(main, clone);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertSame(cloneChild, result.get(child));
        assertSame(clone, result.get(main));
    }

    @Test
    public void testBooleanNode_true() {
        Node result = NodeUtil.booleanNode(true);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testBooleanNode_false() {
        Node result = NodeUtil.booleanNode(false);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testNumberNode_regularNumber() {
        Node result = NodeUtil.numberNode(5.5, null);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.5, result.getDouble(), 0.001);
    }

    @Test
    public void testNumberNode_nan() {
        Node result = NodeUtil.numberNode(Double.NaN, null);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertTrue(Double.isNaN(result.getDouble()));
    }

    @Test
    public void testNumberNode_positiveInfinity() {
        Node result = NodeUtil.numberNode(Double.POSITIVE_INFINITY, null);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.POSITIVE_INFINITY, result.getDouble(), 0.0);
    }

    @Test
    public void testNumberNode_negativeInfinity() {
        Node result = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, null);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.NEGATIVE_INFINITY, result.getDouble(), 0.0);
    }

    @Test
    public void testNumberNode_withSrcRef() {
        Node src = new Node(Token.SCRIPT);
        Node result = NodeUtil.numberNode(1.0, src);
        assertNotNull(result);
        assertSame(src, result.getSourceFileName());
    }

    @Test
    public void testNewVarNode_nullValue() {
        Node result = NodeUtil.newVarNode("x", null);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testNewVarNode_withValue() {
        Node value = Node.newNumber(5);
        Node result = NodeUtil.newVarNode("x", value);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
        assertSame(value, result.getFirstChild());
    }

    @Test
    public void testIsImmutableValue_withoutSideEffects() {
        Node n = Node.newString("test");
        assertTrue(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsImmutableValue_withSideEffects() {
        Node n = new Node(Token.CALL);
        assertFalse(NodeUtil.isImmutableValue(n));
    }

    @Test
    public void testIsSimpleOperator_simple() {
        Node n = new Node(Token.ADD);
        assertTrue(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsSimpleOperator_notSimple() {
        Node n = new Node(Token.ASSIGN);
        assertFalse(NodeUtil.isSimpleOperator(n));
    }

    @Test
    public void testIsAssignmentOp_assign() {
        Node n = new Node(Token.ASSIGN);
        assertTrue(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsAssignmentOp_notAssign() {
        Node n = new Node(Token.ADD);
        assertFalse(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsAssignmentOp_assignAdd() {
        Node n = new Node(Token.ASSIGN_ADD);
        assertTrue(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsAssignmentOp_assignSub() {
        Node n = new Node(Token.ASSIGN_SUB);
        assertTrue(NodeUtil.isAssignmentOp(n));
    }

    @Test
    public void testIsGet_getProp() {
        Node n = new Node(Token.GETPROP);
        assertTrue(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGet_getElem() {
        Node n = new Node(Token.GETELEM);
        assertTrue(NodeUtil.isGet(n));
    }

    @Test
    public void testIsGet_notGet() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isGet(n));
    }

    @Test
    public void testIsFunctionCall_call() {
        Node n = new Node(Token.CALL);
        assertTrue(NodeUtil.isFunctionCall(n));
    }

    @Test
    public void testIsFunctionCall_notCall() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isFunctionCall(n));
    }

    @Test
    public void testIsNew_new() {
        Node n = new Node(Token.NEW);
        assertTrue(NodeUtil.isNew(n));
    }

    @Test
    public void testIsNew_notNew() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isNew(n));
    }

    @Test
    public void testIsCallOrNew_call() {
        Node n = new Node(Token.CALL);
        assertTrue(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsCallOrNew_new() {
        Node n = new Node(Token.NEW);
        assertTrue(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsCallOrNew_other() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isCallOrNew(n));
    }

    @Test
    public void testIsObjectLitKey_name() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node value = new Node(Token.NUMBER);
        objLit.addChildToBack(key);
        key.addChildToBack(value);
        assertTrue(NodeUtil.isObjectLitKey(key));
    }

    @Test
    public void testIsObjectLitKey_notKey() {
        Node key = Node.newString(Token.NAME, "notKey");
        assertFalse(NodeUtil.isObjectLitKey(key));
    }

    @Test
    public void testIsVarStage_var() {
        Node var = new Node(Token.VAR);
        assertTrue(NodeUtil.isVarStage(var));
    }

    @Test
    public void testIsVarStage_notVar() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isVarStage(n));
    }

    @Test
    public void testIsVar_statementVar() {
        Node var = new Node(Token.VAR);
        assertTrue(NodeUtil.isVarDeclaration(var));
    }

    @Test
    public void testIsVar_expressionVar() {
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        exprResult.addChildToBack(assign);
        assign.addChildToBack(name);
        assertTrue(NodeUtil.isVarDeclaration(exprResult));
    }

    @Test
    public void testIsVar_forInVar() {
        Node forIn = new Node(Token.FOR_IN);
        Node var = new Node(Token.VAR);
        forIn.addChildToBack(var);
        assertTrue(NodeUtil.isVarDeclaration(forIn));
    }

    @Test
    public void testIsVar_notVar() {
        Node n = new Node(Token.NAME);
        assertFalse(NodeUtil.isVarDeclaration(n));
    }

    @Test
    public void testIsUnscopedQualifiedName_normal() {
        Node name = Node.newString(Token.NAME, "a");
        assertTrue(NodeUtil.isUnscopedQualifiedName(name));
    }

    @Test
    public void testIsUnscopedQualifiedName_getProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "a"));
        getProp.addChildToBack(Node.newString(Token.STRING, "b"));
        assertTrue(NodeUtil.isUnscopedQualifiedName(getProp));
    }

    @Test
    public void testIsUnscopedQualifiedName_call() {
        Node call = new Node(Token.CALL);
        assertFalse(NodeUtil.isUnscopedQualifiedName(call));
    }

    @Test
    public void testIsValidLValue_simpleName() {
        Node name = Node.newString(Token.NAME, "x");
        assertTrue(NodeUtil.isValidLValue(name));
    }

    @Test
    public void testIsValidLValue_getProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString(Token.NAME, "a"));
        getProp.addChildToBack(Node.newString(Token.STRING, "b"));
        assertTrue(NodeUtil.isValidLValue(getProp));
    }

    @Test
    public void testIsValidLValue_this() {
        Node thisNode = new Node(Token.THIS);
        assertFalse(NodeUtil.isValidLValue(thisNode));
    }

    @Test
    public void testRedeclareVarsInsideBranch_noVars() {
        Node branch = new Node(Token.BLOCK);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertTrue(branch.isEmpty());
    }

    @Test
    public void testRedeclareVarsInsideBranch_withVars() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertTrue(branch.hasOneChild());
        assertTrue(branch.getFirstChild().isVar());
    }

    @Test
    public void testRedeclareVarsInsideBranch_withFunction() {
        Node branch = new Node(Token.BLOCK);
        Node fn = new Node(Token.FUNCTION);
        Node fnName = Node.newString(Token.NAME, "f");
        fn.addChildToBack(fnName);
        branch.addChildToBack(fn);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertTrue(branch.hasOneChild());
        assertTrue(branch.getFirstChild().isFunction());
    }

    @Test
    public void testRedeclareVarsInsideBranch_nestedBlock() {
        Node branch = new Node(Token.BLOCK);
        Node innerBlock = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "x");
        var.addChildToBack(name);
        innerBlock.addChildToBack(var);
        branch.addChildToBack(innerBlock);
        NodeUtil.redeclareVarsInsideBranch(branch);
        assertTrue(branch.hasOneChild());
        assertTrue(branch.getFirstChild().isBlock());
    }

    @Test
    public void testCopyNameAnnotations_noAnnotations() {
        Node source = Node.newString(Token.NAME, "x");
        Node destination = Node.newString(Token.NAME, "y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertFalse(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testCopyNameAnnotations_constantName() {
        Node source = Node.newString(Token.NAME, "x");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = Node.newString(Token.NAME, "y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testCopyNameAnnotations_function() {
        Node source = new Node(Token.FUNCTION);
        Node destination = new Node(Token.NAME);
        NodeUtil.copyNameAnnotations(source, destination);
        assertFalse(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNewVarNode_withNullValue() {
        Node result = NodeUtil.newVarNode("x", null);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testNewVarNode_withNonNullValue() {
        Node value = Node.newNumber(5);
        Node result = NodeUtil.newVarNode("x", value);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("x", result.getString());
        assertSame(value, result.getFirstChild());
    }
}