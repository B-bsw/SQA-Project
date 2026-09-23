package org.apache.commons.jxpath.ri.axes;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AttributeContextTest {

    private AttributeContext context;
    private EvalContext parentContext;
    private NodeTest nodeTest;
    private NodePointer nodePointer;
    private NodeIterator nodeIterator;

    @Before
    public void setUp() {
        parentContext = new MockEvalContext();
        nodeTest = new NodeNameTest(new QName("testAttr"));
        nodePointer = new MockNodePointer();
        nodeIterator = new MockNodeIterator();
        context = new AttributeContext(parentContext, nodeTest);
    }

    @Test
    public void testInitialState() {
        assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testReset() {
        context.setPosition(2);
        context.reset();
        assertNull(context.getCurrentNodePointer());
        assertFalse(context.nextNode());
    }

    @Test
    public void testSetPositionWithValidPosition() {
        context.setPosition(2);
        assertEquals(2, context.getCurrentPosition());
    }

    @Test
    public void testSetPositionWithReset() {
        context.setPosition(2);
        context.setPosition(1);
        assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testNextNodeWithNameTest() {
        nodeTest = new NodeNameTest(new QName("name"));
        context = new AttributeContext(parentContext, nodeTest);
        ((MockEvalContext) parentContext).currentNodePointer = nodePointer;
        assertTrue(context.nextNode());
        assertNotNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNodeWithNonNameTest() {
        nodeTest = new NodeTest() {};
        context = new AttributeContext(parentContext, nodeTest);
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNodeWhenIteratorNull() {
        context = new AttributeContext(parentContext, new NodeNameTest(new QName("test")));
        ((MockEvalContext) parentContext).currentNodePointer = new MockNodePointer() {
            @Override
            public NodeIterator attributeIterator(QName name) {
                return null;
            }
        };
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNodeWhenIteratorExhausted() {
        nodeIterator = new MockNodeIterator() {
            @Override
            public boolean setPosition(int position) {
                return position <= 1;
            }
        };
        ((MockEvalContext) parentContext).currentNodePointer = new MockNodePointer() {
            @Override
            public NodeIterator attributeIterator(QName name) {
                return nodeIterator;
            }
        };
        assertTrue(context.nextNode());
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNodeReturnsFalseOnFirstIterationFailure() {
        nodeIterator = new MockNodeIterator() {
            @Override
            public boolean setPosition(int position) {
                return false;
            }
        };
        ((MockEvalContext) parentContext).currentNodePointer = new MockNodePointer() {
            @Override
            public NodeIterator attributeIterator(QName name) {
                return nodeIterator;
            }
        };
        assertFalse(context.nextNode());
    }

    private static class MockEvalContext extends EvalContext {
        public NodePointer currentNodePointer = new MockNodePointer();

        public MockEvalContext() {
            super(null);
        }

        @Override
        public NodePointer getCurrentNodePointer() {
            return currentNodePointer;
        }

        @Override
        public boolean nextNode() {
            return false;
        }

        @Override
        public boolean setPosition(int position) {
            if (position <= 0) return false;
            return true;
        }

        @Override
        public int getCurrentPosition() {
            return 0;
        }
    }

    private static class MockNodePointer extends NodePointer {
        public MockNodePointer() {
            super((NodePointer) null);
        }

        @Override
        public NodeIterator attributeIterator(QName name) {
            return new MockNodeIterator();
        }
    }

    private static class MockNodeIterator implements NodeIterator {
        private int position = 0;

        @Override
        public boolean setPosition(int position) {
            this.position = position;
            return position <= 1;
        }

        @Override
        public NodePointer getNodePointer() {
            return new MockNodePointer();
        }

        @Override
        public int getPosition() {
            return position;
        }
    }
}