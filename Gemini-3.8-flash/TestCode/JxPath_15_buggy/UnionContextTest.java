package org.apache.commons.jxpath.ri.axes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class UnionContextTest {

    private static class StubEvalContext extends EvalContext {
        private List sets;
        private int currentSetIndex;
        private int currentNodeIndex;
        private int docOrder;
        private int nextSetCallCount;
        private int nextNodeCallCount;

        public StubEvalContext(EvalContext parentContext) {
            super(parentContext);
            this.sets = new ArrayList();
            this.currentSetIndex = -1;
            this.currentNodeIndex = -1;
            this.docOrder = 0;
            this.nextSetCallCount = 0;
            this.nextNodeCallCount = 0;
        }

        public void addSet(List nodes) {
            this.sets.add(nodes);
        }

        public void setDocumentOrder(int docOrder) {
            this.docOrder = docOrder;
        }

        public int getDocumentOrder() {
            return this.docOrder;
        }

        public boolean nextSet() {
            this.nextSetCallCount++;
            this.currentSetIndex++;
            this.currentNodeIndex = -1;
            return this.currentSetIndex < this.sets.size();
        }

        public boolean nextNode() {
            this.nextNodeCallCount++;
            if (this.currentSetIndex < 0 || this.currentSetIndex >= this.sets.size()) {
                return false;
            }
            List currentNodes = (List) this.sets.get(this.currentSetIndex);
            this.currentNodeIndex++;
            return this.currentNodeIndex < currentNodes.size();
        }

        public NodePointer getCurrentNodePointer() {
            if (this.currentSetIndex < 0 || this.currentSetIndex >= this.sets.size()) {
                return null;
            }
            List currentNodes = (List) this.sets.get(this.currentSetIndex);
            if (this.currentNodeIndex < 0 || this.currentNodeIndex >= currentNodes.size()) {
                return null;
            }
            return (NodePointer) currentNodes.get(this.currentNodeIndex);
        }

        public int getNextSetCallCount() {
            return this.nextSetCallCount;
        }

        public int getNextNodeCallCount() {
            return this.nextNodeCallCount;
        }
    }

    private NodePointer createPointer(String value) {
        return NodePointer.newNodePointer(new QName(value), value, Locale.US);
    }

    @Test
    public void getDocumentOrder_givenMoreThanOneContext_shouldReturnOne() {
        // Arrange
        EvalContext ctx1 = new StubEvalContext(null);
        EvalContext ctx2 = new StubEvalContext(null);
        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        int order = unionContext.getDocumentOrder();

        // Assert
        Assert.assertEquals(1, order);
    }

    @Test
    public void getDocumentOrder_givenExactlyOneContext_shouldReturnSuperDocumentOrder() {
        // Arrange
        StubEvalContext parent = new StubEvalContext(null);
        parent.setDocumentOrder(0);
        StubEvalContext ctx1 = new StubEvalContext(null);
        EvalContext[] contexts = new EvalContext[] { ctx1 };
        UnionContext unionContext = new UnionContext(parent, contexts);

        // Act
        int order = unionContext.getDocumentOrder();

        // Assert
        Assert.assertEquals(0, order);
    }

    @Test
    public void getDocumentOrder_givenEmptyContextsArray_shouldReturnSuperDocumentOrder() {
        // Arrange
        StubEvalContext parent = new StubEvalContext(null);
        parent.setDocumentOrder(0);
        EvalContext[] contexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(parent, contexts);

        // Act
        int order = unionContext.getDocumentOrder();

        // Assert
        Assert.assertEquals(0, order);
    }

    @Test
    public void getDocumentOrder_givenNullContextsArray_shouldThrowNullPointerException() {
        // Arrange
        UnionContext unionContext = new UnionContext(null, null);

        // Act & Assert
        try {
            unionContext.getDocumentOrder();
            Assert.fail("Expected NullPointerException when contexts array is null");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void setPosition_givenEmptyContexts_shouldReturnFalseForPositionOne() {
        // Arrange
        EvalContext[] contexts = new EvalContext[0];
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        boolean result = unionContext.setPosition(1);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals(0, unionContext.getPosition());
    }

    @Test
    public void setPosition_givenDisjointNodesAcrossMultipleContexts_shouldUnionAndIterateAllNodes() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        NodePointer ptrB = createPointer("B");
        NodePointer ptrC = createPointer("C");

        StubEvalContext ctx1 = new StubEvalContext(null);
        List nodes1 = new ArrayList();
        nodes1.add(ptrA);
        nodes1.add(ptrB);
        ctx1.addSet(nodes1);

        StubEvalContext ctx2 = new StubEvalContext(null);
        List nodes2 = new ArrayList();
        nodes2.add(ptrC);
        ctx2.addSet(nodes2);

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertTrue("Position 1 should exist", unionContext.setPosition(1));
        Assert.assertEquals(ptrA, unionContext.getCurrentNodePointer());

        Assert.assertTrue("Position 2 should exist", unionContext.setPosition(2));
        Assert.assertEquals(ptrB, unionContext.getCurrentNodePointer());

        Assert.assertTrue("Position 3 should exist", unionContext.setPosition(3));
        Assert.assertEquals(ptrC, unionContext.getCurrentNodePointer());

        Assert.assertFalse("Position 4 should not exist", unionContext.setPosition(4));
    }

    @Test
    public void setPosition_givenDuplicateNodesAcrossContexts_shouldFilterDuplicates() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        NodePointer ptrB = createPointer("B");
        NodePointer ptrDuplicateA = createPointer("A");

        StubEvalContext ctx1 = new StubEvalContext(null);
        List nodes1 = new ArrayList();
        nodes1.add(ptrA);
        nodes1.add(ptrB);
        ctx1.addSet(nodes1);

        StubEvalContext ctx2 = new StubEvalContext(null);
        List nodes2 = new ArrayList();
        nodes2.add(ptrDuplicateA);
        ctx2.addSet(nodes2);

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertTrue("Position 1 should exist", unionContext.setPosition(1));
        Assert.assertEquals(ptrA, unionContext.getCurrentNodePointer());

        Assert.assertTrue("Position 2 should exist", unionContext.setPosition(2));
        Assert.assertEquals(ptrB, unionContext.getCurrentNodePointer());

        Assert.assertFalse("Position 3 should not exist due to deduplication", unionContext.setPosition(3));
    }

    @Test
    public void setPosition_givenDuplicateNodesWithinSameContext_shouldFilterDuplicates() {
        // Arrange
        NodePointer ptrA1 = createPointer("A");
        NodePointer ptrA2 = createPointer("A");

        StubEvalContext ctx = new StubEvalContext(null);
        List nodes = new ArrayList();
        nodes.add(ptrA1);
        nodes.add(ptrA2);
        ctx.addSet(nodes);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertTrue("First occurrence of A should be present", unionContext.setPosition(1));
        Assert.assertEquals(ptrA1, unionContext.getCurrentNodePointer());

        Assert.assertFalse("Second occurrence of A should be deduplicated", unionContext.setPosition(2));
    }

    @Test
    public void setPosition_calledMultipleTimes_shouldOnlyPrepareOnce() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        StubEvalContext ctx = new StubEvalContext(null);
        List nodes = new ArrayList();
        nodes.add(ptrA);
        ctx.addSet(nodes);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        unionContext.setPosition(1);
        int setCallsAfterFirst = ctx.getNextSetCallCount();
        int nodeCallsAfterFirst = ctx.getNextNodeCallCount();

        unionContext.setPosition(1);
        int setCallsAfterSecond = ctx.getNextSetCallCount();
        int nodeCallsAfterSecond = ctx.getNextNodeCallCount();

        // Assert
        Assert.assertTrue("Context nextSet should have been called at least once", setCallsAfterFirst > 0);
        Assert.assertEquals("nextSet should not be called again after preparation", setCallsAfterFirst, setCallsAfterSecond);
        Assert.assertEquals("nextNode should not be called again after preparation", nodeCallsAfterFirst, nodeCallsAfterSecond);
    }

    @Test
    public void setPosition_givenMultipleSetsInSingleContext_shouldTraverseAllSets() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        NodePointer ptrB = createPointer("B");

        StubEvalContext ctx = new StubEvalContext(null);
        List set1 = new ArrayList();
        set1.add(ptrA);
        List set2 = new ArrayList();
        set2.add(ptrB);
        ctx.addSet(set1);
        ctx.addSet(set2);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertTrue(unionContext.setPosition(1));
        Assert.assertEquals(ptrA, unionContext.getCurrentNodePointer());

        Assert.assertTrue(unionContext.setPosition(2));
        Assert.assertEquals(ptrB, unionContext.getCurrentNodePointer());

        Assert.assertFalse(unionContext.setPosition(3));
    }

    @Test
    public void setPosition_givenEmptySetInsideContext_shouldHandleGracefully() {
        // Arrange
        StubEvalContext ctx = new StubEvalContext(null);
        List emptySet = new ArrayList();
        ctx.addSet(emptySet);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        boolean result = unionContext.setPosition(1);

        // Assert
        Assert.assertFalse("Empty set should result in false for position 1", result);
    }

    @Test
    public void setPosition_givenContextWhereNextSetReturnsFalseImmediately_shouldHandleGracefully() {
        // Arrange
        StubEvalContext ctx = new StubEvalContext(null); // No sets added
        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        boolean result = unionContext.setPosition(1);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void setPosition_givenPositionZeroOrNegative_shouldReturnFalse() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        StubEvalContext ctx = new StubEvalContext(null);
        List nodes = new ArrayList();
        nodes.add(ptrA);
        ctx.addSet(nodes);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertFalse("Position 0 should return false", unionContext.setPosition(0));
        Assert.assertFalse("Position -1 should return false", unionContext.setPosition(-1));
    }

    @Test
    public void setPosition_givenNullContextsArray_shouldThrowNullPointerExceptionOnFirstCall() {
        // Arrange
        UnionContext unionContext = new UnionContext(null, null);

        // Act & Assert
        try {
            unionContext.setPosition(1);
            Assert.fail("Expected NullPointerException when contexts array is null during preparation");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void nextNode_givenMultipleNodes_shouldIterateSequentially() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        NodePointer ptrB = createPointer("B");

        StubEvalContext ctx = new StubEvalContext(null);
        List nodes = new ArrayList();
        nodes.add(ptrA);
        nodes.add(ptrB);
        ctx.addSet(nodes);

        EvalContext[] contexts = new EvalContext[] { ctx };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act & Assert
        Assert.assertTrue(unionContext.nextNode());
        Assert.assertEquals(1, unionContext.getPosition());
        Assert.assertEquals(ptrA, unionContext.getCurrentNodePointer());

        Assert.assertTrue(unionContext.nextNode());
        Assert.assertEquals(2, unionContext.getPosition());
        Assert.assertEquals(ptrB, unionContext.getCurrentNodePointer());

        Assert.assertFalse(unionContext.nextNode());
    }

    @Test
    public void getNodeSet_afterPrepared_shouldContainExactUnionNodes() {
        // Arrange
        NodePointer ptrA = createPointer("A");
        NodePointer ptrB = createPointer("B");

        StubEvalContext ctx1 = new StubEvalContext(null);
        List nodes1 = new ArrayList();
        nodes1.add(ptrA);
        ctx1.addSet(nodes1);

        StubEvalContext ctx2 = new StubEvalContext(null);
        List nodes2 = new ArrayList();
        nodes2.add(ptrB);
        ctx2.addSet(nodes2);

        EvalContext[] contexts = new EvalContext[] { ctx1, ctx2 };
        UnionContext unionContext = new UnionContext(null, contexts);

        // Act
        unionContext.setPosition(1);
        BasicNodeSet nodeSet = (BasicNodeSet) unionContext.getNodeSet();

        // Assert
        Assert.assertNotNull(nodeSet);
        List pointers = nodeSet.getPointers();
        Assert.assertEquals(2, pointers.size());
        Assert.assertEquals(ptrA, pointers.get(0));
        Assert.assertEquals(ptrB, pointers.get(1));
    }
}