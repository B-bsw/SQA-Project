package org.apache.commons.jxpath.ri.axes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

public class AttributeContextTest {

    private static class DummyNodeTest extends NodeTest {
    }

    private static class MockNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;
        private NodeIterator attributeIterator;

        public MockNodePointer(NodeIterator attributeIterator) {
            super(null);
            this.attributeIterator = attributeIterator;
        }

        public NodeIterator attributeIterator(QName name) {
            return attributeIterator;
        }

        public boolean isLeaf() {
            return false;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return null;
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public void setValue(Object value) {
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    private static class MockNodeIterator implements NodeIterator {
        private List pointers;
        private int position = 0;

        public MockNodeIterator(List pointers) {
            this.pointers = pointers != null ? pointers : Collections.EMPTY_LIST;
        }

        public int getPosition() {
            return position;
        }

        public boolean setPosition(int position) {
            this.position = position;
            return position >= 1 && position <= pointers.size();
        }

        public NodePointer getNodePointer() {
            if (position >= 1 && position <= pointers.size()) {
                return (NodePointer) pointers.get(position - 1);
            }
            return null;
        }
    }

    private static class MockEvalContext extends EvalContext {
        private NodePointer currentNodePointer;

        public MockEvalContext(NodePointer currentNodePointer) {
            super(null);
            this.currentNodePointer = currentNodePointer;
        }

        public NodePointer getCurrentNodePointer() {
            return currentNodePointer;
        }

        public boolean nextNode() {
            return false;
        }

        public boolean nextSet() {
            return false;
        }
    }

    @Test
    public void getCurrentNodePointer_initially_shouldReturnNull() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockEvalContext parentContext = new MockEvalContext(new MockNodePointer(null));
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        NodePointer result = context.getCurrentNodePointer();

        Assert.assertNull(result);
    }

    @Test
    public void nextNode_givenNonNodeNameTest_shouldReturnFalse() {
        DummyNodeTest dummyTest = new DummyNodeTest();
        MockEvalContext parentContext = new MockEvalContext(new MockNodePointer(null));
        AttributeContext context = new AttributeContext(parentContext, dummyTest);

        boolean result = context.nextNode();

        Assert.assertFalse(result);
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void nextNode_givenNullNodeTest_shouldReturnFalse() {
        MockEvalContext parentContext = new MockEvalContext(new MockNodePointer(null));
        AttributeContext context = new AttributeContext(parentContext, null);

        boolean result = context.nextNode();

        Assert.assertFalse(result);
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void nextNode_givenNullAttributeIterator_shouldReturnFalse() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer parentPointer = new MockNodePointer(null);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        boolean result = context.nextNode();

        Assert.assertFalse(result);
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void nextNode_givenEmptyIterator_shouldReturnFalse() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodeIterator emptyIterator = new MockNodeIterator(Collections.EMPTY_LIST);
        MockNodePointer parentPointer = new MockNodePointer(emptyIterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        boolean result = context.nextNode();

        Assert.assertFalse(result);
        Assert.assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void nextNode_givenSingleNodeInIterator_shouldIterateAndThenReturnFalse() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer expectedAttrPointer = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(expectedAttrPointer);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        boolean firstNext = context.nextNode();
        NodePointer firstPointer = context.getCurrentNodePointer();
        boolean secondNext = context.nextNode();

        Assert.assertTrue(firstNext);
        Assert.assertSame(expectedAttrPointer, firstPointer);
        Assert.assertFalse(secondNext);
    }

    @Test
    public void nextNode_givenMultipleNodesInIterator_shouldIterateSequentially() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        MockNodePointer pointer2 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        attrList.add(pointer2);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        Assert.assertTrue(context.nextNode());
        Assert.assertSame(pointer1, context.getCurrentNodePointer());

        Assert.assertTrue(context.nextNode());
        Assert.assertSame(pointer2, context.getCurrentNodePointer());

        Assert.assertFalse(context.nextNode());
    }

    @Test
    public void reset_afterAdvancing_shouldAllowReiteration() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        Assert.assertTrue(context.nextNode());
        Assert.assertSame(pointer1, context.getCurrentNodePointer());

        context.reset();
        Assert.assertEquals(0, context.getCurrentPosition());

        Assert.assertTrue(context.nextNode());
        Assert.assertSame(pointer1, context.getCurrentNodePointer());
    }

    @Test
    public void setPosition_givenValidForwardPosition_shouldReturnTrue() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        MockNodePointer pointer2 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        attrList.add(pointer2);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        boolean result = context.setPosition(2);

        Assert.assertTrue(result);
        Assert.assertEquals(2, context.getCurrentPosition());
        Assert.assertSame(pointer2, context.getCurrentNodePointer());
    }

    @Test
    public void setPosition_givenPositionExceedingLimit_shouldReturnFalse() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        boolean result = context.setPosition(3);

        Assert.assertFalse(result);
    }

    @Test
    public void setPosition_givenPositionLessThanCurrent_shouldResetAndReposition() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        MockNodePointer pointer2 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        attrList.add(pointer2);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        context.setPosition(2);
        Assert.assertSame(pointer2, context.getCurrentNodePointer());

        boolean result = context.setPosition(1);

        Assert.assertTrue(result);
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertSame(pointer1, context.getCurrentNodePointer());
    }

    @Test
    public void setPosition_givenCurrentPositionEqualsTargetPosition_shouldReturnTrueImmediately() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        context.setPosition(1);
        boolean result = context.setPosition(1);

        Assert.assertTrue(result);
        Assert.assertEquals(1, context.getCurrentPosition());
        Assert.assertSame(pointer1, context.getCurrentNodePointer());
    }

    @Test
    public void setPosition_givenPositionZero_shouldResetAndReturnTrue() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        MockNodePointer pointer1 = new MockNodePointer(null);
        List attrList = new ArrayList();
        attrList.add(pointer1);
        MockNodeIterator iterator = new MockNodeIterator(attrList);
        MockNodePointer parentPointer = new MockNodePointer(iterator);
        MockEvalContext parentContext = new MockEvalContext(parentPointer);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);

        context.setPosition(1);
        boolean result = context.setPosition(0);

        Assert.assertTrue(result);
        Assert.assertEquals(0, context.getCurrentPosition());
    }

    @Test(expected = NullPointerException.class)
    public void nextNode_givenNullParentContext_shouldThrowNullPointerException() {
        QName name = new QName("attr");
        NodeNameTest nodeTest = new NodeNameTest(name);
        AttributeContext context = new AttributeContext(null, nodeTest);

        context.nextNode();
    }
}