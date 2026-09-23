package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.jscomp.NodeUtil;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NodeUtilTest {

    private Node node;

    @Before
    public void setUp() {
        node = new Node(Token.SCRIPT);
    }

    @After
    public void tearDown() {
        node = null;
    }

    @Test
    public void testIsLiteralValueNull() {
        Node n = new Node(Token.NULL);
        Assert.assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValueNumber() {
        Node n = new Node(Token.NUMBER, 42.0);
        Assert.assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValueString() {
        Node n = new Node(Token.STRING, "test");
        Assert.assertTrue(NodeUtil.isLiteralValue(n, false));
    }

    @Test
    public void testIsLiteralValueArrayLitWithLiteralElements() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(new Node(Token.NUMBER, 1.0));
        arrayLit.addChildToBack(new Node(Token.STRING, "x"));
        Assert.assertTrue(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValueArrayLitWithNonLiteralElements() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(new Node(Token.NAME, "a"));
        Assert.assertFalse(NodeUtil.isLiteralValue(arrayLit, false));
    }

    @Test
    public void testIsLiteralValueObjectLit() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Assert.assertTrue(NodeUtil.isLiteralValue(objectLit, false));
    }

    @Test
    public void testIsLiteralValueRegexp() {
        Node regexp = new Node(Token.REGEXP);
        Assert.assertTrue(NodeUtil.isLiteralValue(regexp, false));
    }

    @Test
    public void testIsLiteralValueAddWithBothLiteral() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.NUMBER, 1.0));
        add.addChildToBack(new Node(Token.NUMBER, 2.0));
        Assert.assertTrue(NodeUtil.isLiteralValue(add, false));
    }

    @Test
    public void testIsLiteralValueAddWithNonLiteral() {
        Node add = new Node(Token.ADD);
        add.addChildToBack(new Node(Token.NUMBER, 1.0));
        add.addChildToBack(new Node(Token.NAME, "a"));
        Assert.assertFalse(NodeUtil.isLiteralValue(add, false));
    }

    @Test
    public void testGetBooleanValueBooleanLiteral() {
        Node n = new Node(Token.TRUE);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueFalseLiteral() {
        Node n = new Node(Token.FALSE);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNull() {
        Node n = new Node(Token.NULL);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNumber() {
        Node n = new Node(Token.NUMBER, 0.0);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
        n = new Node(Token.NUMBER, 1.0);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueString() {
        Node n = new Node(Token.STRING, "");
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
        n = new Node(Token.STRING, "a");
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNameUndefined() {
        Node n = new Node(Token.NAME, "undefined");
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNameInfinity() {
        Node n = new Node(Token.NAME, "Infinity");
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNameUnknown() {
        Node n = new Node(Token.NAME, "x");
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueVoid() {
        Node n = new Node(Token.VOID);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(n));
    }

    @Test
    public void testGetBooleanValueNot() {
        Node not = new Node(Token.NOT);
        not.addChildToBack(new Node(Token.TRUE));
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(not));
    }

    @Test
    public void testGetBooleanValueAndBothTrue() {
        Node and = new Node(Token.AND);
        and.addChildToBack(new Node(Token.TRUE));
        and.addChildToBack(new Node(Token.TRUE));
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueAndOneFalse() {
        Node and = new Node(Token.AND);
        and.addChildToBack(new Node(Token.TRUE));
        and.addChildToBack(new Node(Token.FALSE));
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueOrBothFalse() {
        Node or = new Node(Token.OR);
        or.addChildToBack(new Node(Token.FALSE));
        or.addChildToBack(new Node(Token.FALSE));
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(or));
    }

    @Test
    public void testGetBooleanValueHookDifferentValues() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.STRING, "a"));
        hook.addChildToBack(new Node(Token.STRING, "b"));
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueHookSameValues() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.STRING, "b"));
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testIsAssignmentOp() {
        Assert.assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN));
        Assert.assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_ADD));
        Assert.assertFalse(NodeUtil.isAssignmentOp(Token.ADD));
    }

    @Test
    public void testIsSimpleOperatorType() {
        Assert.assertTrue(NodeUtil.isSimpleOperatorType(Token.ADD));
        Assert.assertTrue(NodeUtil.isSimpleOperatorType(Token.BITNOT));
        Assert.assertFalse(NodeUtil.isSimpleOperatorType(Token.ASSIGN));
    }

    @Test
    public void testIsName() {
        Assert.assertTrue(NodeUtil.isName(new Node(Token.NAME, "x")));
        Assert.assertFalse(NodeUtil.isName(new Node(Token.STRING, "x")));
    }

    @Test
    public void testIsGet() {
        Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETELEM)));
        Assert.assertTrue(NodeUtil.isGet(new Node(Token.GETPROP)));
        Assert.assertFalse(NodeUtil.isGet(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunctionObjectCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETELEM));
        call.addChildToBack(new Node(Token.STRING, "call"));
        Assert.assertTrue(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsFunctionObjectCallNotCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertFalse(NodeUtil.isFunctionObjectCall(call));
    }

    @Test
    public void testIsExpressionResultUsedAsStatement() {
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(new Node(Token.ASSIGN));
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(new Node(Token.ASSIGN), expr));
    }

    @Test
    public void testIsExpressionResultUsedInFor() {
        Node forNode = new Node(Token.FOR);
        Node var = new Node(Token.VAR);
        var.addChildToBack(new Node(Token.NAME, "x"));
        forNode.addChildToBack(var);
        Node cond = new Node(Token.NAME, "c");
        forNode.addChildToBack(cond);
        Node incr = new Node(Token.ASSIGN);
        incr.addChildToBack(new Node(Token.NAME, "x"));
        forNode.addChildToBack(new Node(Token.NUMBER, 1.0));
        forNode.addChildToBack(incr);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(incr, forNode));
    }

    @Test
    public void testIsExpressionResultUsedInComma() {
        Node comma = new Node(Token.COMMA);
        comma.addChildToBack(new Node(Token.NAME, "x"));
        comma.addChildToBack(new Node(Token.NAME, "y"));
        Node expr = new Node(Token.EXPR_RESULT);
        expr.addChildToBack(comma);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(comma, expr));
    }

    @Test
    public void testIsExpressionResultUsedNotUsed() {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(assign, new Node(Token.EXPR_RESULT)));
    }

    @Test
    public void testIsExpressionResultUsedInExpression() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        expr.addChildToBack(assign);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(assign, expr));
    }

    @Test
    public void testIsExpressionResultUsedInIf() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "c");
        ifNode.addChildToBack(cond);
        Node block = new Node(Token.BLOCK);
        ifNode.addChildToBack(block);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(cond, ifNode));
    }

    @Test
    public void testIsExpressionResultUsedInWhile() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.NAME, "c");
        whileNode.addChildToBack(cond);
        Node block = new Node(Token.BLOCK);
        whileNode.addChildToBack(block);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(cond, whileNode));
    }

    @Test
    public void testIsExpressionResultUsedInReturn() {
        Node ret = new Node(Token.RETURN);
        Node expr = new Node(Token.NAME, "x");
        ret.addChildToBack(expr);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(expr, ret));
    }

    @Test
    public void testIsExpressionResultUsedInVar() {
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        name.addChildToBack(assign);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(assign, name));
    }

    @Test
    public void testIsExpressionResultUsedInCase() {
        Node caseNode = new Node(Token.CASE);
        Node expr = new Node(Token.NUMBER, 1.0);
        caseNode.addChildToBack(expr);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(expr, caseNode));
    }

    @Test
    public void testIsExpressionResultUsedInDefault() {
        Node defaultNode = new Node(Token.DEFAULT);
        Node block = new Node(Token.BLOCK);
        defaultNode.addChildToBack(block);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(block, defaultNode));
    }

    @Test
    public void testIsExpressionResultUsedInSwitch() {
        Node switchNode = new Node(Token.SWITCH);
        Node cond = new Node(Token.NAME, "x");
        switchNode.addChildToBack(cond);
        Node caseNode = new Node(Token.CASE);
        Node expr = new Node(Token.NUMBER, 1.0);
        caseNode.addChildToBack(expr);
        switchNode.addChildToBack(caseNode);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(expr, switchNode));
    }

    @Test
    public void testIsExpressionResultUsedInThrow() {
        Node throwNode = new Node(Token.THROW);
        Node expr = new Node(Token.NAME, "x");
        throwNode.addChildToBack(expr);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(expr, throwNode));
    }

    @Test
    public void testIsExpressionResultUsedInCatch() {
        Node catchNode = new Node(Token.CATCH);
        Node name = new Node(Token.NAME, "e");
        catchNode.addChildToBack(name);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(name, catchNode));
    }

    @Test
    public void testIsExpressionResultUsedInLabel() {
        Node label = new Node(Token.LABEL);
        Node name = new Node(Token.NAME, "l");
        label.addChildToBack(name);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(name, label));
    }

    @Test
    public void testIsExpressionResultUsedInWith() {
        Node with = new Node(Token.WITH);
        Node cond = new Node(Token.NAME, "x");
        with.addChildToBack(cond);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(cond, with));
    }

    @Test
    public void testIsExpressionResultUsedInThrow2() {
        Node throwNode = new Node(Token.THROW);
        Node expr = new Node(Token.NAME, "x");
        throwNode.addChildToBack(expr);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(throwNode);
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(expr, exprResult));
    }

    @Test
    public void testIsExpressionResultUsedInExprResult() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        expr.addChildToBack(assign);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(assign, expr));
    }

    @Test
    public void testIsExpressionResultUsedInVar2() {
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        name.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isExpressionResultUsed(name, var));
    }

    @Test
    public void testIsExpressionResultUsedInForIncrement() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        Node incr = new Node(Token.ASSIGN);
        incr.addChildToBack(new Node(Token.NAME, "x"));
        incr.addChildToBack(new Node(Token.NUMBER, 1.0));
        forNode.addChildToBack(incr);
        Assert.assertTrue(NodeUtil.isExpressionResultUsed(incr, forNode));
    }

    @Test
    public void testGetOpValue() {
        Assert.assertEquals("+", NodeUtil.getOpValue(new Node(Token.ADD)));
        Assert.assertEquals("||", NodeUtil.getOpValue(new Node(Token.OR)));
        Assert.assertEquals("==", NodeUtil.getOpValue(new Node(Token.EQ)));
        Assert.assertEquals("instanceof", NodeUtil.getOpValue(new Node(Token.INSTANCEOF)));
        Assert.assertEquals("void", NodeUtil.getOpValue(new Node(Token.VOID)));
        Assert.assertEquals("typeof", NodeUtil.getOpValue(new Node(Token.TYPEOF)));
        Assert.assertEquals("<=", NodeUtil.getOpValue(new Node(Token.LE)));
    }

    @Test
    public void testGetOpValueIn() {
        Assert.assertEquals("in", NodeUtil.getOpValue(new Node(Token.IN)));
    }

    @Test
    public void testIsVar() {
        Assert.assertTrue(NodeUtil.isVar(new Node(Token.VAR)));
        Assert.assertFalse(NodeUtil.isVar(new Node(Token.NAME)));
    }

    @Test
    public void testIsVarName() {
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        Assert.assertTrue(NodeUtil.isVarName(name));
    }

    @Test
    public void testIsVarNameNotVar() {
        Node name = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isVarName(name));
    }

    @Test
    public void testIsLoopStructure() {
        Assert.assertTrue(NodeUtil.isLoopStructure(new Node(Token.FOR)));
        Assert.assertTrue(NodeUtil.isLoopStructure(new Node(Token.WHILE)));
        Assert.assertTrue(NodeUtil.isLoopStructure(new Node(Token.DO)));
        Assert.assertFalse(NodeUtil.isLoopStructure(new Node(Token.IF)));
    }

    @Test
    public void testIsFunction() {
        Assert.assertTrue(NodeUtil.isFunction(new Node(Token.FUNCTION)));
        Assert.assertFalse(NodeUtil.isFunction(new Node(Token.NAME)));
    }

    @Test
    public void testIsStatement() {
        Assert.assertTrue(NodeUtil.isStatement(new Node(Token.EXPR_RESULT)));
        Assert.assertTrue(NodeUtil.isStatement(new Node(Token.VAR)));
        Assert.assertTrue(NodeUtil.isStatement(new Node(Token.RETURN)));
        Assert.assertFalse(NodeUtil.isStatement(new Node(Token.NAME)));
    }

    @Test
    public void testIsStatementBlock() {
        Assert.assertTrue(NodeUtil.isStatementBlock(new Node(Token.BLOCK)));
        Assert.assertTrue(NodeUtil.isStatementBlock(new Node(Token.SCRIPT)));
        Assert.assertFalse(NodeUtil.isStatementBlock(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunctionExpression() {
        Node fn = new Node(Token.FUNCTION);
        Assert.assertTrue(NodeUtil.isFunctionExpression(fn));
        Node fnName = new Node(Token.NAME, "f");
        fn.addChildToBack(fnName);
        Assert.assertFalse(NodeUtil.isFunctionExpression(fn));
    }

    @Test
    public void testIsDirective() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node str = new Node(Token.STRING, "use strict");
        expr.addChildToBack(str);
        Assert.assertTrue(NodeUtil.isDirective(expr));
    }

    @Test
    public void testIsDirectiveNot() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node num = new Node(Token.NUMBER, 1.0);
        expr.addChildToBack(num);
        Assert.assertFalse(NodeUtil.isDirective(expr));
    }

    @Test
    public void testGetVarsDeclaredInBranchEmpty() {
        Node branch = new Node(Token.BLOCK);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertNotNull(vars);
        Assert.assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranchWithVar() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertEquals(1, vars.size());
        Assert.assertTrue(vars.contains(name));
    }

    @Test
    public void testGetVarsDeclaredInBranchWithAssign() {
        Node branch = new Node(Token.BLOCK);
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node name = new Node(Token.NAME, "x");
        assign.addChildToBack(name);
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        expr.addChildToBack(assign);
        branch.addChildToBack(expr);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertNotNull(vars);
        Assert.assertTrue(vars.isEmpty());
    }

    @Test
    public void testGetVarsDeclaredInBranchNested() {
        Node branch = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "c");
        ifNode.addChildToBack(cond);
        Node block = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "y");
        var.addChildToBack(name);
        block.addChildToBack(var);
        ifNode.addChildToBack(block);
        branch.addChildToBack(ifNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertNotNull(vars);
        Assert.assertTrue(vars.isEmpty());
    }

    @Test
    public void testRedeclareVarsInsideBranchVar() {
        Node branch = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "x");
        var.addChildToBack(name);
        branch.addChildToBack(var);
        NodeUtil.redeclareVarsInsideBranch(branch);
        Assert.assertNull(name.getParent());
    }

    @Test
    public void testRedeclareVarsInsideBranchNoVars() {
        Node branch = new Node(Token.BLOCK);
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(new Node(Token.NAME, "x"));
        assign.addChildToBack(new Node(Token.NUMBER, 1.0));
        expr.addChildToBack(assign);
        branch.addChildToBack(expr);
        NodeUtil.redeclareVarsInsideBranch(branch);
        Assert.assertNotNull(branch.getFirstChild());
    }

    @Test
    public void testCopyNameAnnotations() {
        Node src = new Node(Token.NAME, "x");
        src.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node dest = new Node(Token.NAME, "y");
        NodeUtil.copyNameAnnotations(src, dest);
        Assert.assertTrue(dest.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testNewFunctionNode() {
        Node fn = NodeUtil.newFunctionNode("f", Collections.<Node>emptyList(), 0, 0);
        Assert.assertEquals(Token.FUNCTION, fn.getType());
        Assert.assertEquals("f", fn.getFirstChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode() {
        Node qname = NodeUtil.newQualifiedNameNode("a.b.c", 0, 0);
        Assert.assertEquals(Token.GETPROP, qname.getType());
    }

    @Test
    public void testNewQualifiedNameNodeSimple() {
        Node qname = NodeUtil.newQualifiedNameNode("abc", 0, 0);
        Assert.assertEquals(Token.NAME, qname.getType());
    }

    @Test
    public void testNewVarNode() {
        Node var = NodeUtil.newVarNode("x", new Node(Token.NUMBER, 1.0));
        Assert.assertEquals(Token.VAR, var.getType());
        Assert.assertEquals("x", var.getFirstChild().getString());
    }

    @Test
    public void testNewVarNodeNullValue() {
        Node var = NodeUtil.newVarNode("x", null);
        Assert.assertEquals(Token.VAR, var.getType());
        Assert.assertNull(var.getFirstChild().getString());
    }

    @Test
    public void testGetVarsDeclaredInBranchNestedVar() {
        Node branch = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "c");
        ifNode.addChildToBack(cond);
        Node block = new Node(Token.BLOCK);
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "y");
        var.addChildToBack(name);
        block.addChildToBack(var);
        ifNode.addChildToBack(block);
        branch.addChildToBack(ifNode);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        Assert.assertNotNull(vars);
        Assert.assertTrue(vars.isEmpty());
    }

    @Test
    public void testIsReferenceTo() {
        Node parent = new Node(Token.NAME, "x");
        Node child = new Node(Token.NAME, "x");
        parent.addChildToBack(child);
        Assert.assertTrue(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToNo() {
        Node parent = new Node(Token.NAME, "x");
        Node child = new Node(Token.NAME, "y");
        parent.addChildToBack(child);
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToNotName() {
        Node parent = new Node(Token.STRING, "x");
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToNull() {
        Node parent = new Node(Token.NULL);
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToThis() {
        Node parent = new Node(Token.THIS);
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToGetProp() {
        Node parent = new Node(Token.GETPROP);
        Node name = new Node(Token.NAME, "x");
        parent.addChildToBack(name);
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToNested() {
        Node parent = new Node(Token.NAME, "x");
        Node child = new Node(Token.NAME, "x");
        Node grandchild = new Node(Token.NAME, "y");
        parent.addChildToBack(child);
        child.addChildToBack(grandchild);
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "y"));
    }

    @Test
    public void testIsReferenceToMultipleChildren() {
        Node parent = new Node(Token.NAME, "x");
        parent.addChildToBack(new Node(Token.NAME, "y"));
        parent.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToChildNull() {
        Node parent = new Node(Token.NAME, "x");
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToChildNotName() {
        Node parent = new Node(Token.NAME, "x");
        parent.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToChildNameDifferent() {
        Node parent = new Node(Token.NAME, "x");
        parent.addChildToBack(new Node(Token.NAME, "y"));
        Assert.assertFalse(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testIsReferenceToChildNameSame() {
        Node parent = new Node(Token.NAME, "x");
        parent.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isReferenceTo(parent, "x"));
    }

    @Test
    public void testGetBooleanValueHookSecondChildTrue() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        Node trueNode = new Node(Token.TRUE);
        hook.addChildToBack(trueNode);
        Node falseNode = new Node(Token.STRING, "a");
        hook.addChildToBack(falseNode);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueHookSecondChildFalse() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        Node trueNode = new Node(Token.FALSE);
        hook.addChildToBack(trueNode);
        Node falseNode = new Node(Token.STRING, "a");
        hook.addChildToBack(falseNode);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueHookUnknown() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        Node trueNode = new Node(Token.NAME, "x");
        hook.addChildToBack(trueNode);
        Node falseNode = new Node(Token.STRING, "a");
        hook.addChildToBack(falseNode);
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testIsNumber() {
        Assert.assertTrue(NodeUtil.isNumber(new Node(Token.NUMBER)));
        Assert.assertFalse(NodeUtil.isNumber(new Node(Token.STRING)));
    }

    @Test
    public void testIsString() {
        Assert.assertTrue(NodeUtil.isString(new Node(Token.STRING)));
        Assert.assertFalse(NodeUtil.isString(new Node(Token.NAME)));
    }

    @Test
    public void testIsObjectLitKey() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.STRING, "a");
        objLit.addChildToBack(key);
        Assert.assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKeyNot() {
        Assert.assertFalse(NodeUtil.isObjectLitKey(new Node(Token.NAME, "a"), new Node(Token.NAME)));
    }

    @Test
    public void testIsExprAssign() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        expr.addChildToBack(assign);
        Assert.assertTrue(NodeUtil.isExprAssign(expr));
    }

    @Test
    public void testIsExprAssignNot() {
        Assert.assertFalse(NodeUtil.isExprAssign(new Node(Token.NAME)));
    }

    @Test
    public void testGetPrototypeName() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "x");
        Node prop = new Node(Token.STRING, "prototype");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        Assert.assertEquals("x", NodeUtil.getPrototypeName(getprop));
    }

    @Test
    public void testGetPrototypeNameNot() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "x");
        Node prop = new Node(Token.STRING, "y");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        Assert.assertNull(NodeUtil.getPrototypeName(getprop));
    }

    @Test
    public void testGetPrototypeNameNotGetProp() {
        Assert.assertNull(NodeUtil.getPrototypeName(new Node(Token.NAME)));
    }

    @Test
    public void testGetPrototypeNameNoParent() {
        Node getprop = new Node(Token.GETPROP);
        Assert.assertNull(NodeUtil.getPrototypeName(getprop));
    }

    @Test
    public void testGetPrototypeNameNullObj() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "x");
        Node prop = new Node(Token.STRING, "prototype");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        Assert.assertNotNull(NodeUtil.getPrototypeName(getprop));
    }

    @Test
    public void testIsPrototypeProperty() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "x");
        Node prop = new Node(Token.STRING, "prototype");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        Assert.assertTrue(NodeUtil.isPrototypeProperty(getprop));
    }

    @Test
    public void testIsPrototypePropertyNot() {
        Node getprop = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "x");
        Node prop = new Node(Token.STRING, "y");
        getprop.addChildToBack(obj);
        getprop.addChildToBack(prop);
        Assert.assertFalse(NodeUtil.isPrototypeProperty(getprop));
    }

    @Test
    public void testIsPrototypePropertyNotGetProp() {
        Assert.assertFalse(NodeUtil.isPrototypeProperty(new Node(Token.NAME)));
    }

    @Test
    public void testIsNameCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsNameCallNot() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETELEM));
        Assert.assertFalse(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsNameCallNoName() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsGetCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertTrue(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallNot() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallNoFirstChild() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsFunctionCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallNot() {
        Assert.assertFalse(NodeUtil.isFunctionCall(new Node(Token.NAME)));
    }

    @Test
    public void testIsFunctionCallNoFirstChild() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallName() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallGetElem() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETELEM));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallGetProp() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallString() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.STRING, "x"));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallFunction() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.FUNCTION));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallThis() {
        Node call = new Token.CALL;
        call.addChildToBack(new Node(Token.THIS));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallFalse() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsEvalCall() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "eval"));
        Assert.assertTrue(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNot() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNoName() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallGetter() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNameDifferent() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "evalx"));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNameCaseSensitive() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "EVAL"));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNameNull() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NULL));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsAllType() {
        Assert.assertTrue(NodeUtil.isAllType(new Node(Token.NAME, "All")));
    }

    @Test
    public void testIsAllTypeNot() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "x")));
    }

    @Test
    public void testIsAllTypeString() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.STRING, "All")));
    }

    @Test
    public void testIsAllTypeGetProp() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.GETPROP)));
    }

    @Test
    public void testIsAllTypeNull() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NULL)));
    }

    @Test
    public void testIsAllTypeNumber() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NUMBER, 1.0)));
    }

    @Test
    public void testIsAllTypeVar() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.VAR)));
    }

    @Test
    public void testIsAllTypeBlock() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.BLOCK)));
    }

    @Test
    public void testIsAllTypeScript() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.SCRIPT)));
    }

    @Test
    public void testIsAllTypeEmpty() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.EMPTY)));
    }

    @Test
    public void testIsAllTypeFunction() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.FUNCTION)));
    }

    @Test
    public void testIsAllTypeArrayLit() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.ARRAYLIT)));
    }

    @Test
    public void testIsAllTypeObjectLit() {
        Assert.assertFalse(NodeUtil.isAllType(new Node(Token.OBJECTLIT)));
    }

    @Test public void testIsAllTypeRegexp() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.REGEXP))); }
    @Test public void testIsAllTypeAdd() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.ADD))); }
    @Test public void testIsAllTypeSub() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.SUB))); }
    @Test public void testIsAllTypeMul() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.MUL))); }
    @Test public void testIsAllTypeDiv() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.DIV))); }
    @Test public void testIsAllTypeMod() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.MOD))); }
    @Test public void testIsAllTypeInc() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.INC))); }
    @Test public void testIsAllTypeDec() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.DEC))); }
    @Test public void testIsAllTypeNot() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NOT))); }
    @Test public void testIsAllTypeAnd() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.AND))); }
    @Test public void testIsAllTypeOr() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.OR))); }
    @Test public void testIsAllTypeHook() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.HOOK))); }
    @Test public void testIsAllTypeCall() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.CALL))); }
    @Test public void testIsAllTypeComma() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.COMMA))); }
    @Test public void testIsAllTypeGetElem() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.GETELEM))); }
    @Test public void testIsAllTypeGetProp2() { Node n = new Node(Token.GETPROP); Assert.assertFalse(NodeUtil.isAllType(n)); }
    @Test public void testIsAllTypeNameNull() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "null"))); }
    @Test public void testIsAllTypeNameUndefined() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "undefined"))); }
    @Test public void testIsAllTypeNameInfinity() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "Infinity"))); }
    @Test public void testIsAllTypeNameNaN() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "NaN"))); }
    @Test public void testIsAllTypeNameEval() { Assert.assertFalse(NodeUtil.isAllType(new Node(Token.NAME, "eval"))); }

    @Test
    public void testGetBooleanValueHookBothFalse() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        hook.addChildToBack(new Node(Token.FALSE));
        hook.addChildToBack(new Node(Token.FALSE));
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueHookBothTrue() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        hook.addChildToBack(new Node(Token.TRUE));
        hook.addChildToBack(new Node(Token.TRUE));
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueHookBothUnknown() {
        Node hook = new Node(Token.HOOK);
        hook.addChildToBack(new Node(Token.NAME, "cond"));
        Node unknown1 = new Node(Token.NAME, "x");
        hook.addChildToBack(unknown1);
        Node unknown2 = new Node(Token.NAME, "y");
        hook.addChildToBack(unknown2);
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(hook));
    }

    @Test
    public void testGetBooleanValueAndFirstUnknown() {
        Node and = new Node(Token.AND);
        Node unknown = new Node(Token.NAME, "x");
        and.addChildToBack(unknown);
        and.addChildToBack(new Node(Token.TRUE));
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueOrFirstUnknown() {
        Node or = new Node(Token.OR);
        Node unknown = new Node(Token.NAME, "x");
        or.addChildToBack(unknown);
        or.addChildToBack(new Node(Token.FALSE));
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(or));
    }

    @Test
    public void testGetBooleanValueAndSecondUnknown() {
        Node and = new Node(Token.AND);
        and.addChildToBack(new Node(Token.TRUE));
        Node unknown = new Node(Token.NAME, "x");
        and.addChildToBack(unknown);
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueOrSecondUnknown() {
        Node or = new Node(Token.OR);
        or.addChildToBack(new Node(Token.FALSE));
        Node unknown = new Node(Token.NAME, "x");
        or.addChildToBack(unknown);
        Assert.assertEquals(TernaryValue.UNKNOWN, NodeUtil.getBooleanValue(or));
    }

    @Test
    public void testGetBooleanValueAndOneFalse() {
        Node and = new Node(Token.AND);
        and.addChildToBack(new Node(Token.FALSE));
        Node unknown = new Node(Token.NAME, "x");
        and.addChildToBack(unknown);
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueOrOneTrue() {
        Node or = new Node(Token.OR);
        or.addChildToBack(new Node(Token.TRUE));
        Node unknown = new Node(Token.NAME, "x");
        or.addChildToBack(unknown);
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(or));
    }

    @Test
    public void testGetBooleanValueAndTwoFalse() {
        Node and = new Node(Token.AND);
        and.addChildToBack(new Node(Token.FALSE));
        and.addChildToBack(new Node(Token.TRUE));
        Assert.assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(and));
    }

    @Test
    public void testGetBooleanValueOrTwoTrue() {
        Node or = new Node(Token.OR);
        or.addChildToBack(new Node(Token.TRUE));
        or.addChildToBack(new Node(Token.FALSE));
        Assert.assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(or));
    }

    @Test
    public void testIsNameCallSimple() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsNameCallGetProp() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertFalse(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsNameCallNull() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isNameCall(call));
    }

    @Test
    public void testIsGetCallGetProp() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertTrue(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallGetElem() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETELEM));
        Assert.assertTrue(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallName() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallNull() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallString() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.STRING));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallFunction() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.FUNCTION));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallThis() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.THIS));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsGetCallNumber() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isGetCall(call));
    }

    @Test
    public void testIsFunctionCallName2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallGetProp2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.GETPROP));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallString2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.STRING, "x"));
        Assert.assertTrue(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallNumber2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NUMBER, 1.0));
        Assert.assertFalse(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsFunctionCallNull2() {
        Node call = new Node(Token.CALL);
        Assert.assertFalse(NodeUtil.isFunctionCall(call));
    }

    @Test
    public void testIsEvalCallName2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "eval"));
        Assert.assertTrue(NodeUtil.isEvalCall(call));
    }

    @Test
    public void testIsEvalCallNot2() {
        Node call = new Node(Token.CALL);
        call.addChildToBack(new Node(Token.NAME, "x"));
        Assert.assertFalse(NodeUtil.isEvalCall(call));
    }
}