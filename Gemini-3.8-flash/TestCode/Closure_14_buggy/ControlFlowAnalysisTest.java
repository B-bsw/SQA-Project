package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ControlFlowAnalysisTest {

    private ControlFlowAnalysis cfa;
    private AbstractCompiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    @Test
    public void testIsBreakTargetReturnsTrueForBreakStructureWithMatchingLabel() {
        Node node = new Node(Token.BREAK);
        Node target = new Node(Token.LABEL);
        target.setParent(new Node(Token.BLOCK));
        target.getParent().addChildToFront(node);
        node.setParent(target);
        target.getFirstChild().setString("foo");
        assertTrue(ControlFlowAnalysis.isBreakTarget(target, "foo"));
    }

    @Test
    public void testIsBreakTargetReturnsFalseForNullLabel() {
        Node target = new Node(Token.LABEL);
        target.setParent(new Node(Token.BLOCK));
        assertFalse(ControlFlowAnalysis.isBreakTarget(target, null));
    }

    @Test
    public void testIsBreakTargetReturnsFalseForNonBreakStructure() {
        Node target = new Node(Token.LABEL);
        target.setParent(new Node(Token.BLOCK));
        target.setParent(new Node(Token.CONTINUE));
        assertFalse(ControlFlowAnalysis.isBreakTarget(target, "label"));
    }

    @Test
    public void testMayThrowExceptionReturnsTrueForCallNode() {
        Node call = new Node(Token.CALL);
        call.addChildToFront(new Node(Token.NAME, "foo"));
        assertTrue(ControlFlowAnalysis.mayThrowException(call));
    }

    @Test
    public void testMayThrowExceptionReturnsTrueForNewNode() {
        Node newNode = new Node(Token.NEW);
        newNode.addChildToFront(new Node(Token.NAME, "Foo"));
        assertTrue(ControlFlowAnalysis.mayThrowException(newNode));
    }

    @Test
    public void testMayThrowExceptionReturnsFalseForNameNode() {
        Node name = new Node(Token.NAME, "x");
        assertFalse(ControlFlowAnalysis.mayThrowException(name));
    }

    @Test
    public void testMayThrowExceptionReturnsTrueForAssignNode() {
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToFront(new Node(Token.NAME, "x"));
        assign.addChildToFront(new Node(Token.NUMBER, 1.0));
        assertTrue(ControlFlowAnalysis.mayThrowException(assign));
    }

    @Test
    public void testMayThrowExceptionReturnsTrueForInvalidNode() {
        Node invalid = new Node(Token.INC);
        invalid.addChildToFront(new Node(Token.NAME, "x"));
        assertTrue(ControlFlowAnalysis.mayThrowException(invalid));
    }

    @Test
    public void testHandleIfWithNullElseBlock() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "cond");
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(thenBlock);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, ifNode);
        // Just ensure it runs without exception
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleIfWithElseBlock() {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.NAME, "cond");
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(thenBlock);
        ifNode.addChildToFront(elseBlock);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, ifNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleWhile() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = new Node(Token.NAME, "cond");
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToFront(cond);
        whileNode.addChildToFront(body);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, whileNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleDo() {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        Node cond = new Node(Token.NAME, "cond");
        doNode.addChildToFront(body);
        doNode.addChildToFront(cond);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, doNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleForLoop() {
        Node forNode = new Node(Token.FOR);
        Node init = new Node(Token.NAME, "i");
        Node cond = new Node(Token.NAME, "cond");
        Node iter = new Node(Token.INC);
        Node body = new Node(Token.BLOCK);
        forNode.addChildToFront(init);
        forNode.addChildToFront(cond);
        forNode.addChildToFront(iter);
        forNode.addChildToFront(body);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, forNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleSwitch() {
        Node switchNode = new Node(Token.SWITCH);
        Node cond = new Node(Token.NAME, "x");
        Node case1 = new Node(Token.CASE);
        Node case2 = new Node(Token.CASE);
        switchNode.addChildToFront(cond);
        switchNode.addChildToFront(case1);
        switchNode.addChildToFront(case2);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, switchNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testHandleTry() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchBlock = new Node(Token.BLOCK);
        tryNode.addChildToFront(block);
        tryNode.addChildToFront(catchBlock);

        ControlFlowAnalysis spyCfa = new ControlFlowAnalysis(compiler, true, false);
        spyCfa.process(null, tryNode);
        assertNotNull(spyCfa.getCfg());
    }

    @Test
    public void testGetCfgReturnsNullBeforeProcess() {
        ControlFlowAnalysis newCfa = new ControlFlowAnalysis(compiler, true, true);
        assertNull(newCfa.getCfg());
    }
}