package org.apache.commons.jxpath.ri.axes;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UnionContextTest {

    private UnionContext unionContext;
    private EvalContext mockContext1;
    private EvalContext mockContext2;

    @Before
    public void setUp() {
        mockContext1 = new MockEvalContext();
        mockContext2 = new MockEvalContext();
    }

    @After
    public void tearDown() {
        unionContext = null;
        mockContext1 = null;
        mockContext2 = null;
    }

    @Test
    public void testGetDocumentOrder_SingleContext() {
        unionContext = new UnionContext(null, new EvalContext[]{mockContext1});
        assertEquals(0, unionContext.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_MultipleContexts() {
        unionContext = new UnionContext(null, new EvalContext[]{mockContext1, mockContext2});
        assertEquals(1, unionContext.getDocumentOrder());
    }

    @Test
    public void testSetPosition_EmptyContexts() {
        unionContext = new UnionContext(null, new EvalContext[0]);
        assertTrue(unionContext.setPosition(0));
    }

    @Test
    public void testSetPosition_PreparesUnion() {
        MockEvalContext ctx1 = new MockEvalContext();
        MockEvalContext ctx2 = new MockEvalContext();
        ctx1.addNodePointer(new MockNodePointer("node1"));
        ctx2.addNodePointer(new MockNodePointer("node2"));

        unionContext = new UnionContext(null, new EvalContext[]{ctx1, ctx2});
        assertTrue(unionContext.setPosition(0));

        BasicNodeSet nodeSet = (BasicNodeSet) unionContext.getNodeSet();
        assertEquals(2, nodeSet.getPointers().size());
    }

    @Test
    public void testSetPosition_PreparesUnion_UsesSuperSetPosition() {
        MockEvalContext ctx = new MockEvalContext();
        ctx.addNodePointer(new MockNodePointer("node1"));
        unionContext = new UnionContext(null, new EvalContext[]{ctx});

        assertTrue(unionContext.setPosition(0));
        assertFalse(unionContext.setPosition(1));
    }

    @Test
    public void testSetPosition_SecondCallPreservesPreparedState() {
        MockEvalContext ctx = new MockEvalContext();
        ctx.addNodePointer(new MockNodePointer("node1"));
        unionContext = new UnionContext(null, new EvalContext[]{ctx});

        assertTrue(unionContext.setPosition(0));
        assertFalse(unionContext.setPosition(1));
    }

    @Test
    public void testSetPosition_SingleContextWithNoNodes() {
        unionContext = new UnionContext(null, new EvalContext[]{mockContext1});
        assertTrue(unionContext.setPosition(0));
        assertFalse(unionContext.setPosition(1));
    }

    private static class MockEvalContext extends EvalContext {
        private final ArrayList<NodePointer> pointers = new ArrayList<NodePointer>();
        private int currentNodeIndex = -1;

        public MockEvalContext() {
            super(null);
        }

        public void addNodePointer(NodePointer pointer) {
            pointers.add(pointer);
        }

        @Override
        public boolean nextSet() {
            return currentNodeIndex < 0;
        }

        @Override
        public boolean nextNode() {
            if (currentNodeIndex < pointers.size() - 1) {
                currentNodeIndex++;
                return true;
            }
            return false;
        }

        @Override
        public NodePointer getCurrentNodePointer() {
            return pointers.get(currentNodeIndex);
        }

        @Override
        public boolean setPosition(int position) {
            if (position >= 0 && position < pointers.size()) {
                currentNodeIndex = position;
                return true;
            }
            return false;
        }
    }

    private static class MockNodePointer extends NodePointer {
        private final Object value;

        public MockNodePointer(Object value) {
            super(null);
            this.value = value;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object getNodeValue() {
            return value;
        }

        @Override
        public boolean isLeaf() {
            return true;
        }

        @Override
        public NodePointer getImmediateParentPointer() {
            return null;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        @Override
        public boolean testNode(org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest) {
            return false;
        }

        @Override
        public String asPath() {
            return value != null ? value.toString() : "null";
        }

        @Override
        public Object getBaseValue() {
            return value;
        }

        @Override
        public NodePointer getPointer() {
            return this;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MockNodePointer) {
                MockNodePointer other = (MockNodePointer) obj;
                if (value == null) {
                    return other.value == null;
                }
                return value.equals(other.value);
            }
            return false;
        }

        @Override
        public boolean isActual() {
            return true;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public int getLength() {
            return 1;
        }

        @Override
        public Object getImmediateNode() {
            return value;
        }

        @Override
        public Object getNode() {
            return value;
        }

        @Override
        public boolean isNode() {
            return false;
        }

        @Override
        public boolean isContainer() {
            return false;
        }

        @Override
        public String getName() {
            return "mock";
        }

        @Override
        public NodePointer getParent() {
            return null;
        }

        @Override
        public NodePointer getChild(int index) {
            return null;
        }

        @Override
        public int getIndex() {
            return 0;
        }

        @Override
        public boolean isRoot() {
            return true;
        }
    }
}