package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeepholeOptimizationsPassTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
    }

    private static class TrackingOptimization extends AbstractPeepholeOptimization {
        private int beginTraversalCount = 0;
        private int endTraversalCount = 0;
        private List<Node> visitedNodes = new ArrayList<Node>();

        @Override
        public void beginTraversal(AbstractCompiler compiler) {
            super.beginTraversal(compiler);
            beginTraversalCount++;
        }

        @Override
        public void endTraversal(AbstractCompiler compiler) {
            super.endTraversal(compiler);
            endTraversalCount++;
        }

        @Override
        Node optimizeSubtree(Node subtree) {
            visitedNodes.add(subtree);
            return subtree;
        }
    }

    private static class ReplacingOptimization extends AbstractPeepholeOptimization {
        private final Node targetNode;
        private final Node replacementNode;
        private int replacementsDone = 0;

        ReplacingOptimization(Node targetNode, Node replacementNode) {
            this.targetNode = targetNode;
            this.replacementNode = replacementNode;
        }

        @Override
        Node optimizeSubtree(Node subtree) {
            if (subtree == targetNode && replacementsDone == 0) {
                replacementsDone++;
                return replacementNode;
            }
            return subtree;
        }
    }

    private static class NullReturningOptimization extends AbstractPeepholeOptimization {
        private final Node targetNode;
        private boolean returnedNull = false;

        NullReturningOptimization(Node targetNode) {
            this.targetNode = targetNode;
        }

        @Override
        Node optimizeSubtree(Node subtree) {
            if (subtree == targetNode) {
                returnedNull = true;
                return null;
            }
            return subtree;
        }
    }

    private static class ChangeReportingOptimization extends AbstractPeepholeOptimization {
        private final AbstractCompiler compilerRef;
        private final Node triggerNode;
        private int triggerLimit;
        private int triggerCount = 0;

        ChangeReportingOptimization(AbstractCompiler compilerRef, Node triggerNode, int triggerLimit) {
            this.compilerRef = compilerRef;
            this.triggerNode = triggerNode;
            this.triggerLimit = triggerLimit;
        }

        @Override
        Node optimizeSubtree(Node subtree) {
            if (subtree == triggerNode && triggerCount < triggerLimit) {
                triggerCount++;
                compilerRef.reportCodeChange();
            }
            return subtree;
        }
    }

    @Test
    public void getCompiler_givenCompilerInstance_shouldReturnSameInstance() {
        // Arrange
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);

        // Act
        AbstractCompiler actualCompiler = pass.getCompiler();

        // Assert
        Assert.assertSame(compiler, actualCompiler);
    }

    @Test
    public void process_givenEmptyRoot_shouldInvokeBeginAndEndTraversal() {
        // Arrange
        TrackingOptimization opt = new TrackingOptimization();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);
        Node root = new Node(Token.BLOCK);

        // Act
        pass.process(null, root);

        // Assert
        Assert.assertEquals(1, opt.beginTraversalCount);
        Assert.assertEquals(1, opt.endTraversalCount);
        Assert.assertEquals(1, opt.visitedNodes.size());
        Assert.assertSame(root, opt.visitedNodes.get(0));
    }

    @Test
    public void process_givenNodeHierarchy_shouldTraversePostOrder() {
        // Arrange
        TrackingOptimization opt = new TrackingOptimization();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

        Node root = new Node(Token.BLOCK);
        Node child1 = new Node(Token.EMPTY);
        Node child2 = new Node(Token.EMPTY);
        root.addChildToBack(child1);
        root.addChildToBack(child2);

        // Act
        pass.process(null, root);

        // Assert
        Assert.assertEquals(3, opt.visitedNodes.size());
        Assert.assertSame(child1, opt.visitedNodes.get(0));
        Assert.assertSame(child2, opt.visitedNodes.get(1));
        Assert.assertSame(root, opt.visitedNodes.get(2));
    }

    @Test
    public void visit_givenOptimizationReplacesNode_shouldPropagateReplacement() {
        // Arrange
        Node originalNode = new Node(Token.EMPTY);
        Node replacementNode = new Node(Token.EMPTY);
        ReplacingOptimization replacingOpt = new ReplacingOptimization(originalNode, replacementNode);
        TrackingOptimization trackingOpt = new TrackingOptimization();

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, replacingOpt, trackingOpt);

        // Act
        pass.visit(originalNode);

        // Assert
        Assert.assertEquals(1, replacingOpt.replacementsDone);
        Assert.assertTrue(trackingOpt.visitedNodes.contains(replacementNode));
    }

    @Test
    public void visit_givenOptimizationReturnsNull_shouldReturnImmediately() {
        // Arrange
        Node target = new Node(Token.EMPTY);
        NullReturningOptimization nullOpt = new NullReturningOptimization(target);
        TrackingOptimization subsequentOpt = new TrackingOptimization();

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, nullOpt, subsequentOpt);

        // Act
        pass.visit(target);

        // Assert
        Assert.assertTrue(nullOpt.returnedNull);
        Assert.assertEquals(0, subsequentOpt.visitedNodes.size());
    }

    @Test
    public void process_givenScriptNodeWithReportedChange_shouldRetraverseScript() {
        // Arrange
        Node scriptNode = new Node(Token.SCRIPT);
        Node child = new Node(Token.EMPTY);
        scriptNode.addChildToBack(child);

        ChangeReportingOptimization opt = new ChangeReportingOptimization(compiler, child, 1);
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

        // Act
        pass.process(null, scriptNode);

        // Assert
        Assert.assertEquals(1, opt.triggerCount);
    }

    @Test
    public void process_givenFunctionNodeWithParentAndReportedChange_shouldRetraverse() {
        // Arrange
        Node root = new Node(Token.BLOCK);
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        root.addChildToBack(funcNode);

        ChangeReportingOptimization opt = new ChangeReportingOptimization(compiler, funcNode, 1);
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

        // Act
        pass.process(null, root);

        // Assert
        Assert.assertEquals(1, opt.triggerCount);
    }

    @Test
    public void process_givenFunctionNodeWithoutParentAndReportedChange_shouldNotRetraverse() {
        // Arrange
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

        ChangeReportingOptimization opt = new ChangeReportingOptimization(compiler, funcNode, 2);
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

        // Act
        pass.process(null, funcNode);

        // Assert
        Assert.assertEquals(1, opt.triggerCount);
    }

    @Test
    public void process_givenRetraversedFunction_shouldSkipChildFunctionsDuringRetraversal() {
        // Arrange
        Node rootScript = new Node(Token.SCRIPT);
        Node outerFunc = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node innerFunc = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

        outerFunc.getLastChild().addChildToBack(innerFunc);
        rootScript.addChildToBack(outerFunc);

        final List<Node> visitedFunctions = new ArrayList<Node>();
        AbstractPeepholeOptimization opt = new AbstractPeepholeOptimization() {
            private boolean changedOnce = false;

            @Override
            Node optimizeSubtree(Node subtree) {
                if (subtree.isFunction()) {
                    visitedFunctions.add(subtree);
                }
                if (subtree == outerFunc && !changedOnce) {
                    changedOnce = true;
                    compiler.reportCodeChange();
                }
                return subtree;
            }
        };

        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, opt);

        // Act
        pass.process(null, rootScript);

        // Assert
        int innerFuncVisits = 0;
        int outerFuncVisits = 0;
        for (int i = 0; i < visitedFunctions.size(); i++) {
            Node n = visitedFunctions.get(i);
            if (n == innerFunc) {
                innerFuncVisits++;
            } else if (n == outerFunc) {
                outerFuncVisits++;
            }
        }
        Assert.assertEquals(1, innerFuncVisits);
        Assert.assertEquals(2, outerFuncVisits);
    }

    @Test
    public void process_givenDeeplyNestedScopes_shouldPushAndPopStateStackCorrectly() {
        // Arrange
        Node script1 = new Node(Token.SCRIPT);
        Node script2 = new Node(Token.SCRIPT);
        Node func1 = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node func2 = new Node(Token.FUNCTION, new Node(Token.NAME), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));

        script1.addChildToBack(script2);
        script2.addChildToBack(func1);
        func1.getLastChild().addChildToBack(func2);

        TrackingOptimization trackingOpt = new TrackingOptimization();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, trackingOpt);

        // Act
        pass.process(null, script1);

        // Assert
        Assert.assertTrue(trackingOpt.visitedNodes.contains(func2));
        Assert.assertTrue(trackingOpt.visitedNodes.contains(func1));
        Assert.assertTrue(trackingOpt.visitedNodes.contains(script2));
        Assert.assertTrue(trackingOpt.visitedNodes.contains(script1));
    }

    @Test(expected = IllegalStateException.class)
    public void process_givenInfiniteRetraversalLoop_shouldThrowIllegalStateException() {
        // Arrange
        Node scriptNode = new Node(Token.SCRIPT);
        ChangeReportingOptimization infiniteOpt = new ChangeReportingOptimization(compiler, scriptNode, 20000);
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, infiniteOpt);

        // Act
        pass.process(null, scriptNode);
    }

    @Test
    public void process_givenNoOptimizations_shouldTraverseTreeWithoutException() {
        // Arrange
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        Node root = new Node(Token.BLOCK);
        Node child = new Node(Token.VAR);
        root.addChildToBack(child);

        // Act & Assert
        try {
            pass.process(null, root);
        } catch (Exception e) {
            Assert.fail("Processing with zero optimizations threw an exception: " + e.getMessage());
        }
    }
}