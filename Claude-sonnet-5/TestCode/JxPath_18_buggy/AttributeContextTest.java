package org.apache.commons.jxpath.ri.axes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Before;
import org.junit.Test;

public class AttributeContextTest {

    private EvalContext parentContext;
    private NodePointer parentNodePointer;

    @Before
    public void setUp() {
        parentContext = mock(EvalContext.class);
        parentNodePointer = mock(NodePointer.class);
        when(parentContext.getCurrentNodePointer()).thenReturn(parentNodePointer);
    }

    @Test
    public void testGetCurrentNodePointerInitiallyNull() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_NotNodeNameTest_ReturnsFalse() {
        NodeTest nonNameTest = mock(NodeTest.class);
        AttributeContext context = new AttributeContext(parentContext, nonNameTest);
        assertFalse(context.nextNode());
        assertNull(context.getCurrentNodePointer());
        // second call also false because setStarted stays true, iterator remains null
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNode_NoAttributes_ReturnsFalse() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator = mock(NodeIterator.class);
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(iterator);
        when(iterator.getPosition()).thenReturn(0);
        when(iterator.setPosition(1)).thenReturn(false);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertFalse(context.nextNode());
        assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_NullIterator_ReturnsFalse() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(null);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertFalse(context.nextNode());
        assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testNextNode_SingleAttribute() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator = mock(NodeIterator.class);
        NodePointer attrPointer = mock(NodePointer.class);
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(iterator);
        when(iterator.getPosition()).thenReturn(0, 1);
        when(iterator.setPosition(1)).thenReturn(true);
        when(iterator.setPosition(2)).thenReturn(false);
        when(iterator.getNodePointer()).thenReturn(attrPointer);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.nextNode());
        assertSame(attrPointer, context.getCurrentNodePointer());
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNode_MultipleAttributes() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator = mock(NodeIterator.class);
        NodePointer attrPointer1 = mock(NodePointer.class);
        NodePointer attrPointer2 = mock(NodePointer.class);
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(iterator);
        when(iterator.getPosition()).thenReturn(0, 1, 2);
        when(iterator.setPosition(1)).thenReturn(true);
        when(iterator.setPosition(2)).thenReturn(true);
        when(iterator.setPosition(3)).thenReturn(false);
        when(iterator.getNodePointer()).thenReturn(attrPointer1, attrPointer2);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.nextNode());
        assertSame(attrPointer1, context.getCurrentNodePointer());
        assertTrue(context.nextNode());
        assertSame(attrPointer2, context.getCurrentNodePointer());
        assertFalse(context.nextNode());
    }

    @Test
    public void testSetPosition_AdvancesThroughMultipleNodes() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator = mock(NodeIterator.class);
        NodePointer attrPointer1 = mock(NodePointer.class);
        NodePointer attrPointer2 = mock(NodePointer.class);
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(iterator);
        when(iterator.getPosition()).thenReturn(0, 1);
        when(iterator.setPosition(1)).thenReturn(true);
        when(iterator.setPosition(2)).thenReturn(true);
        when(iterator.getNodePointer()).thenReturn(attrPointer1, attrPointer2);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.setPosition(2));
        assertSame(attrPointer2, context.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_BeyondAvailable_ReturnsFalse() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator = mock(NodeIterator.class);
        NodePointer attrPointer1 = mock(NodePointer.class);
        when(parentNodePointer.attributeIterator(any(QName.class))).thenReturn(iterator);
        when(iterator.getPosition()).thenReturn(0, 1);
        when(iterator.setPosition(1)).thenReturn(true);
        when(iterator.setPosition(2)).thenReturn(false);
        when(iterator.getNodePointer()).thenReturn(attrPointer1);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertFalse(context.setPosition(2));
    }

    @Test
    public void testSetPosition_ZeroPosition_ReturnsTrueWithoutAdvancing() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.setPosition(0));
        assertNull(context.getCurrentNodePointer());
    }

    @Test
    public void testSetPosition_ResetWhenPositionLessThanCurrent() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator1 = mock(NodeIterator.class);
        NodeIterator iterator2 = mock(NodeIterator.class);
        NodePointer attrPointer1 = mock(NodePointer.class);
        NodePointer attrPointer2 = mock(NodePointer.class);
        NodePointer attrPointer3 = mock(NodePointer.class);

        when(parentNodePointer.attributeIterator(any(QName.class)))
            .thenReturn(iterator1, iterator2);

        // First iterator used for initial forward navigation
        when(iterator1.getPosition()).thenReturn(0, 1);
        when(iterator1.setPosition(1)).thenReturn(true);
        when(iterator1.setPosition(2)).thenReturn(true);
        when(iterator1.getNodePointer()).thenReturn(attrPointer1, attrPointer2);

        // Second iterator returned after reset
        when(iterator2.getPosition()).thenReturn(0);
        when(iterator2.setPosition(1)).thenReturn(true);
        when(iterator2.getNodePointer()).thenReturn(attrPointer3);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.setPosition(2));
        assertSame(attrPointer2, context.getCurrentNodePointer());

        // Now move back to position 1, triggering reset
        assertTrue(context.setPosition(1));
        assertSame(attrPointer3, context.getCurrentNodePointer());

        verify(parentNodePointer, times(2)).attributeIterator(any(QName.class));
    }

    @Test
    public void testReset() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        NodeIterator iterator1 = mock(NodeIterator.class);
        NodeIterator iterator2 = mock(NodeIterator.class);
        NodePointer attrPointer1 = mock(NodePointer.class);
        NodePointer attrPointer2 = mock(NodePointer.class);

        when(parentNodePointer.attributeIterator(any(QName.class)))
            .thenReturn(iterator1, iterator2);

        when(iterator1.getPosition()).thenReturn(0);
        when(iterator1.setPosition(1)).thenReturn(true);
        when(iterator1.getNodePointer()).thenReturn(attrPointer1);

        when(iterator2.getPosition()).thenReturn(0);
        when(iterator2.setPosition(1)).thenReturn(true);
        when(iterator2.getNodePointer()).thenReturn(attrPointer2);

        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        assertTrue(context.nextNode());
        assertSame(attrPointer1, context.getCurrentNodePointer());

        context.reset();
        assertTrue(context.nextNode());
        assertSame(attrPointer2, context.getCurrentNodePointer());

        verify(parentNodePointer, times(2)).attributeIterator(any(QName.class));
    }

    @Test(expected = NullPointerException.class)
    public void testNextNode_ParentNodePointerNull_ThrowsNPE() {
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr"));
        when(parentContext.getCurrentNodePointer()).thenReturn(null);
        AttributeContext context = new AttributeContext(parentContext, nodeTest);
        context.nextNode();
    }
}