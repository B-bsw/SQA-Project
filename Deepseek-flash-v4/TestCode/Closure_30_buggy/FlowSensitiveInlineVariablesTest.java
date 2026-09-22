package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.List;

public class FlowSensitiveInlineVariablesTest {
    private FlowSensitiveInlineVariables pass;
    private AbstractCompiler compiler;
    private Node root;

    @Before
    public void setUp() {
        compiler = Compiler.getInstance();
        pass = new FlowSensitiveInlineVariables(compiler);
        root = new Node(Token.SCRIPT);
    }

    @Test
    public void testProcessWithNullExterns() {
        try {
            pass.process(null, root);
            fail("Expected NullPointerException for null externs");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testProcessWithNullRoot() {
        try {
            pass.process(new Node(Token.EMPTY), null);
            fail("Expected NullPointerException for null root");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testEnterScopeWithGlobalScope() {
        NodeTraversal t = new NodeTraversal(compiler, pass);
        t.enterScope(new NodeTraversal.ScopedCallback() {
            @Override
            public void enterScope(NodeTraversal traversal) {}
            @Override
            public void exitScope(NodeTraversal traversal) {}
            @Override
            public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
                return true;
            }
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        pass.enterScope(t);
        assertTrue(pass.candidates.isEmpty());
    }

    @Test
    public void testProcessWithFunction() {
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "f");
        Node paramList = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        func.addChildToBack(name);
        func.addChildToBack(paramList);
        func.addChildToBack(body);
        root.addChildToBack(func);
        
        try {
            pass.process(null, root);
            assertTrue(pass.candidates.isEmpty());
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGatherCandiatesWithNoVariables() {
        Node block = new Node(Token.BLOCK);
        Node expr = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString(Token.NAME, "foo"));
        expr.addChildToBack(call);
        block.addChildToBack(expr);
        
        assertTrue(pass.candidates.isEmpty());
    }

    @Test
    public void testCandidateCanInlineWithNonNullCheck() {
        Candidate c = createEmptyCandidate();
        assertFalse(c.canInline());
    }

    private Candidate createEmptyCandidate() {
        Node defCfgNode = new Node(Token.BLOCK);
        Node use = Node.newString(Token.NAME, "x");
        Node useCfgNode = new Node(Token.BLOCK);
        return pass.new Candidate("x", defCfgNode, use, useCfgNode);
    }

    @Test
    public void testCandidateCanInlineWithDefAsFunction() {
        Node defCfgNode = new Node(Token.FUNCTION);
        Node use = Node.newString(Token.NAME, "x");
        Node useCfgNode = new Node(Token.BLOCK);
        Candidate c = pass.new Candidate("x", defCfgNode, use, useCfgNode);
        assertFalse(c.canInline());
    }

    @Test
    public void testCandidateCanInlineWithNoDefFound() {
        Node defCfgNode = new Node(Token.NAME);
        Node use = Node.newString(Token.NAME, "x");
        Node useCfgNode = new Node(Token.BLOCK);
        Candidate c = pass.new Candidate("x", defCfgNode, use, useCfgNode);
        assertFalse(c.canInline());
    }

    @Test
    public void testSideEffectPredicate() {
        FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.getClass();
        Predicate<Node> pred = FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE;
        assertFalse(pred.apply(null));
    }

    @Test
    public void testSideEffectPredicateWithCall() {
        Node call = new Node(Token.CALL);
        assertTrue(FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(call));
    }

    @Test
    public void testSideEffectPredicateWithNew() {
        Node newExpr = new Node(Token.NEW);
        assertTrue(FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(newExpr));
    }

    @Test
    public void testSideEffectPredicateWithNoSideEffects() {
        Node name = Node.newString(Token.NAME, "x");
        assertFalse(FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(name));
    }

    @Test
    public void testGetDefWithNameNode() {
        Node parent = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "x");
        parent.addChildToBack(name);
        try {
            pass.getDefinition(name, parent);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInlineVariableWithDefAssign() {
        Node defCfgNode = new Node(Token.EXPR_RESULT);
        Node def = new Node(Token.ASSIGN);
        def.addChildToBack(Node.newString(Token.NAME, "x"));
        def.addChildToBack(Node.newString(Token.NUMBER, "1"));
        defCfgNode.addChildToBack(def);
        
        Node useParent = new Node(Token.EXPR_RESULT);
        Node use = Node.newString(Token.NAME, "x");
        useParent.addChildToBack(use);
        
        Candidate c = pass.new Candidate("x", defCfgNode, use, new Node(Token.BLOCK));
        try {
            c.inlineVariable();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testInlineVariableWithDefVar() {
        Node defCfgNode = new Node(Token.VAR);
        Node def = Node.newString(Token.NAME, "x");
        def.addChildToBack(Node.newString(Token.NUMBER, "1"));
        defCfgNode.addChildToBack(def);
        
        Node useParent = new Node(Token.EXPR_RESULT);
        Node use = Node.newString(Token.NAME, "x");
        useParent.addChildToBack(use);
        
        Candidate c = pass.new Candidate("x", defCfgNode, use, new Node(Token.BLOCK));
        try {
            c.inlineVariable();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testVisitWithNameNode() {
        NodeTraversal t = new NodeTraversal(compiler, pass);
        Node parent = new Node(Token.NAME);
        Node n = Node.newString(Token.NAME, "foo");
        parent.addChildToBack(n);
        try {
            pass.visit(t, n, parent);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testVisitWithNoParent() {
        NodeTraversal t = new NodeTraversal(compiler, pass);
        Node n = Node.newString(Token.NAME, "foo");
        try {
            pass.visit(t, n, null);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }
}