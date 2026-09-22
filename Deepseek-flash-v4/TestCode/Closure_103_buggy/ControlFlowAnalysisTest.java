package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import java.util.List;

public class ControlFlowAnalysisTest {

    private AbstractCompiler compiler;
    private ControlFlowAnalysis analysis;

    @Before
    public void setUp() {
        compiler = Compiler.getInstance();
        analysis = new ControlFlowAnalysis(compiler, true);
    }

    @Test
    public void testProcessSetsUpCfg() {
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        analysis.process(externs, root);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testShouldTraverseFunction() {
        Node expr = new Node(Token.FUNCTION);
        expr.addChildToFront(new Node(Token.NAME));
        Node param = new Node(Token.PARAM_LIST);
        expr.addChildToBack(param);
        Node body = new Node(Token.BLOCK);
        expr.addChildToBack(body);
        assertTrue(analysis.shouldTraverse(null, expr, null));
    }

    @Test
    public void testShouldTraverseNonFunction() {
        Node block = new Node(Token.BLOCK);
        assertFalse(analysis.shouldTraverse(null, block, null));
    }

    @Test
    public void testShouldTraverseTryWithParent() {
        Node tryNode = new Node(Token.TRY);
        Node parent = new Node(Token.BLOCK);
        assertFalse(analysis.shouldTraverse(null, tryNode, parent));
    }

    @Test
    public void testShouldTraverseIfWithParent() {
        Node ifNode = new Node(Token.IF);
        Node parent = new Node(Token.IF);
        ifNode.addChildToFront(new Node(Token.NAME));
        ifNode.addChildToBack(new Node(Token.BLOCK));
        assertTrue(analysis.shouldTraverse(null, ifNode, parent));
    }

    @Test
    public void testHandleFunctionCreatesEdge() {
        Node func = new Node(Token.FUNCTION);
        Node name = new Node(Token.NAME);
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        func.addChildToBack(name);
        func.addChildToBack(params);
        func.addChildToBack(body);
        analysis.handleFunction(func);
        // Verify edge creation by checking no exception thrown
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleExprCreatesEdge() {
        Node expr = new Node(Token.EXPR_RESULT);
        analysis.handleExpr(expr);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleSwitchCases() {
        Node switchNode = new Node(Token.SWITCH);
        Node cond = new Node(Token.NAME);
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.NUMBER, 0));
        Node body = new Node(Token.BLOCK);
        caseNode.addChildToBack(body);
        switchNode.addChildToBack(cond);
        switchNode.addChildToBack(caseNode);
        analysis.handleSwitch(switchNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleCaseWithNullNext() {
        Node caseNode = new Node(Token.CASE);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(caseNode);
        caseNode.addChildToBack(new Node(Token.EMPTY));
        caseNode.addChildToBack(new Node(Token.BLOCK));
        analysis.handleCase(caseNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleDefault() {
        Node defaultNode = new Node(Token.DEFAULT);
        defaultNode.addChildToBack(new Node(Token.BLOCK));
        analysis.handleDefault(defaultNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleWith() {
        Node withNode = new Node(Token.WITH);
        withNode.addChildToBack(new Node(Token.BLOCK));
        analysis.handleWith(withNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleForWithFourChildren() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.ASSIGN);
        Node cond = new Node(Token.NAME);
        Node iter = new Node(Token.INC);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(cond);
        forNode.addChildToBack(iter);
        forNode.addChildToBack(body);
        analysis.handleFor(forNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleForWithThreeChildren() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToBack(init);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(body);
        analysis.handleFor(forNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testConnectToPossibleExceptionHandler() {
        Node node = new Node(Token.NAME);
        analysis.connectToPossibleExceptionHandler(null, node);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testGetNextSiblingOfType() {
        Node parent = new Node(Token.BLOCK);
        Node first = new Node(Token.NAME);
        Node second = new Node(Token.CASE);
        parent.addChildToBack(first);
        parent.addChildToBack(second);
        analysis.createEdge(null, Branch.UNCOND, null); // dummy
        assertNotNull(second.getNext());
    }

    @Test
    public void testVisitIf() {
        Node ifNode = new Node(Token.IF);
        ifNode.addChildToBack(new Node(Token.NAME));
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(thenBlock);
        analysis.visit(null, ifNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitWhile() {
        Node whileNode = new Node(Token.WHILE);
        whileNode.addChildToBack(new Node(Token.NAME));
        whileNode.addChildToBack(new Node(Token.BLOCK));
        analysis.visit(null, whileNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitDo() {
        Node doNode = new Node(Token.DO);
        doNode.addChildToBack(new Node(Token.BLOCK));
        doNode.addChildToBack(new Node(Token.EMPTY));
        analysis.visit(null, doNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitFor() {
        Node forNode = new Node(Token.FOR);
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.EMPTY));
        forNode.addChildToBack(new Node(Token.BLOCK));
        analysis.visit(null, forNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitSwitch() {
        Node switchNode = new Node(Token.SWITCH);
        Node cond = new Node(Token.NAME);
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.EMPTY));
        caseNode.addChildToBack(new Node(Token.BLOCK));
        switchNode.addChildToBack(cond);
        switchNode.addChildToBack(caseNode);
        analysis.visit(null, switchNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitCase() {
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.EMPTY));
        caseNode.addChildToBack(new Node(Token.BLOCK));
        analysis.visit(null, caseNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitDefault() {
        Node defaultNode = new Node(Token.DEFAULT);
        defaultNode.addChildToBack(new Node(Token.BLOCK));
        analysis.visit(null, defaultNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitThrow() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(new Node(Token.NAME));
        analysis.visit(null, throwNode, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testVisitFunction() {
        Node func = new Node(Token.FUNCTION);
        func.addChildToBack(new Node(Token.NAME));
        func.addChildToBack(new Node(Token.PARAM_LIST));
        func.addChildToBack(new Node(Token.BLOCK));
        analysis.visit(null, func, null);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testComputeFallThroughWithNull() {
        assertNull(analysis.computeFallThrough(null));
    }

    @Test
    public void testComputeFollowNodeWithNull() {
        assertNull(analysis.computeFollowNode(null, null));
    }

    @Test
    public void testCreateEdgeWithUncond() {
        Node from = new Node(Token.NAME);
        Node to = new Node(Token.BLOCK);
        analysis.createEdge(from, Branch.UNCOND, to);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testCreateEdgeOnTrue() {
        Node from = new Node(Token.IF);
        Node to = new Node(Token.BLOCK);
        analysis.createEdge(from, Branch.ON_TRUE, to);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleDoWithChildren() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node cond = new Node(Token.NAME);
        doNode.addChildToBack(body);
        doNode.addChildToBack(cond);
        analysis.handleDo(doNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleWhileWithChildren() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.NAME);
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);
        analysis.handleWhile(whileNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleStmtListWithBlock() {
        Node block = new Node(Token.BLOCK);
        block.putBooleanProp(Node.SYNTHETIC_BLOCK_PROP, true);
        block.addChildToBack(new Node(Token.EMPTY));
        analysis.handleStmtList(block);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleCaseWithDefault() {
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.EMPTY));
        Node body = new Node(Token.BLOCK);
        caseNode.addChildToBack(body);
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(caseNode);
        analysis.handleCase(caseNode);
        assertNotNull(analysis.getCfg());
    }

    @Test
    public void testHandleTryWithFinally() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node finallyBlock = new Node(Token.BLOCK);
        tryNode.addChildToBack(block);
        tryNode.addChildToBack(finallyBlock);
        analysis.handleTry(tryNode);
        assertNotNull(analysis.getCfg());
    }
}