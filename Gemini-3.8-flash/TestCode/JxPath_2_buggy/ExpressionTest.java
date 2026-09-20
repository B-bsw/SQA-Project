package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ExpressionTest {

    private static class MockPointer implements Pointer {
        private Object value;

        public MockPointer(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getNode() {
            return this.value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getRootNode() {
            return null;
        }

        public String asPath() {
            return "/mock";
        }

        public Pointer clone() {
            return this;
        }

        public int compareTo(Object o) {
            return 0;
        }
    }

    private static class MockRootContext extends RootContext {
        private NodePointer rootNodePointer;

        public MockRootContext(NodePointer rootNodePointer) {
            super(null, rootNodePointer);
            this.rootNodePointer = rootNodePointer;
        }

        public NodePointer getCurrentNodePointer() {
            return this.rootNodePointer;
        }
    }

    private static class MockEvalContext extends EvalContext {
        private RootContext rootContext;
        private List elements;
        private int currentIndex = 0;

        public MockEvalContext(RootContext rootContext) {
            super(null);
            this.rootContext = rootContext;
            this.elements = Collections.EMPTY_LIST;
        }

        public MockEvalContext(List elements) {
            super(null);
            this.elements = elements != null ? elements : Collections.EMPTY_LIST;
        }

        public RootContext getRootContext() {
            return this.rootContext;
        }

        public boolean nextNode() {
            return false;
        }

        public boolean nextSet() {
            return false;
        }

        public boolean setPosition(int position) {
            return false;
        }

        public NodePointer getCurrentNodePointer() {
            return null;
        }

        public boolean hasNext() {
            return currentIndex < elements.size();
        }

        public Object next() {
            return elements.get(currentIndex++);
        }
    }

    private static class TestableExpression extends Expression {
        private boolean contextDependentResult = false;
        private int computeContextDependentCallCount = 0;
        private Object computeResult = null;
        private Object computeValueResult = null;

        public TestableExpression(boolean contextDependentResult) {
            this.contextDependentResult = contextDependentResult;
        }

        public TestableExpression(Object computeResult, Object computeValueResult) {
            this.computeResult = computeResult;
            this.computeValueResult = computeValueResult;
        }

        public boolean computeContextDependent() {
            computeContextDependentCallCount++;
            return contextDependentResult;
        }

        public Object compute(EvalContext context) {
            return computeResult;
        }

        public Object computeValue(EvalContext context) {
            return computeValueResult;
        }

        public int getComputeContextDependentCallCount() {
            return computeContextDependentCallCount;
        }
    }

    @Test
    public void constants_verifyValues_shouldMatchExpectedConstants() {
        // Arrange & Act & Assert
        Assert.assertEquals(new Double(0.0), Expression.ZERO);
        Assert.assertEquals(new Double(1.0), Expression.ONE);
        Assert.assertTrue(Expression.NOT_A_NUMBER.isNaN());
    }

    @Test
    public void isContextDependent_givenDependentExpression_shouldReturnTrueAndCacheResult() {
        // Arrange
        TestableExpression expression = new TestableExpression(true);

        // Act
        boolean firstCall = expression.isContextDependent();
        boolean secondCall = expression.isContextDependent();

        // Assert
        Assert.assertTrue(firstCall);
        Assert.assertTrue(secondCall);
        Assert.assertEquals(1, expression.getComputeContextDependentCallCount());
    }

    @Test
    public void isContextDependent_givenIndependentExpression_shouldReturnFalseAndCacheResult() {
        // Arrange
        TestableExpression expression = new TestableExpression(false);

        // Act
        boolean firstCall = expression.isContextDependent();
        boolean secondCall = expression.isContextDependent();

        // Assert
        Assert.assertFalse(firstCall);
        Assert.assertFalse(secondCall);
        Assert.assertEquals(1, expression.getComputeContextDependentCallCount());
    }

    @Test
    public void computeValue_givenContext_shouldReturnConfiguredValue() {
        // Arrange
        String expectedValue = "expectedTestValue";
        TestableExpression expression = new TestableExpression("computed", expectedValue);
        MockEvalContext context = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Object actualValue = expression.computeValue(context);

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void iterate_givenComputeReturnsEvalContext_shouldReturnValueIterator() {
        // Arrange
        List items = new ArrayList();
        items.add("item1");
        items.add(new MockPointer("item2Value"));
        MockEvalContext evalContextResult = new MockEvalContext(items);
        TestableExpression expression = new TestableExpression(evalContextResult, null);
        MockEvalContext passedContext = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Iterator iterator = expression.iterate(passedContext);

        // Assert
        Assert.assertTrue(iterator instanceof Expression.ValueIterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("item1", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("item2Value", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate_givenComputeReturnsCollection_shouldReturnStandardIterator() {
        // Arrange
        List list = Arrays.asList(new String[]{"alpha", "beta"});
        TestableExpression expression = new TestableExpression(list, null);
        MockEvalContext context = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Iterator iterator = expression.iterate(context);

        // Assert
        Assert.assertNotNull(iterator);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("alpha", iterator.next());
        Assert.assertTrue(iterator.hasNext());
        Assert.assertEquals("beta", iterator.next());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void iterate_givenComputeReturnsNull_shouldReturnEmptyIterator() {
        // Arrange
        TestableExpression expression = new TestableExpression(null, null);
        MockEvalContext context = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Iterator iterator = expression.iterate(context);

        // Assert
        Assert.assertNotNull(iterator);
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void iteratePointers_givenComputeReturnsNull_shouldReturnEmptyIterator() {
        // Arrange
        TestableExpression expression = new TestableExpression(null, null);
        MockEvalContext context = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Iterator iterator = expression.iteratePointers(context);

        // Assert
        Assert.assertNotNull(iterator);
        Assert.assertFalse(iterator.hasNext());
        Assert.assertSame(Collections.EMPTY_LIST.iterator().getClass(), iterator.getClass());
    }

    @Test
    public void iteratePointers_givenComputeReturnsEvalContext_shouldReturnSameEvalContext() {
        // Arrange
        MockEvalContext evalContextResult = new MockEvalContext(Collections.EMPTY_LIST);
        TestableExpression expression = new TestableExpression(evalContextResult, null);
        MockEvalContext passedContext = new MockEvalContext(Collections.EMPTY_LIST);

        // Act
        Iterator iterator = expression.iteratePointers(passedContext);

        // Assert
        Assert.assertSame(evalContextResult, iterator);
    }

    @Test
    public void iteratePointers_givenComputeReturnsObject_shouldReturnPointerIterator() {
        // Arrange
        NodePointer rootPointer = NodePointer.newNodePointer(new QName(null, "root"), "rootData", Locale.US);
        MockRootContext rootContext = new MockRootContext(rootPointer);
        MockEvalContext context = new MockEvalContext(rootContext);

        List dataList = Arrays.asList(new String[]{"data1"});
        TestableExpression expression = new TestableExpression(dataList, null);

        // Act
        Iterator iterator = expression.iteratePointers(context);

        // Assert
        Assert.assertTrue(iterator instanceof Expression.PointerIterator);
        Assert.assertTrue(iterator.hasNext());
        Object nextItem = iterator.next();
        Assert.assertTrue(nextItem instanceof Pointer);
        Assert.assertEquals("data1", ((Pointer) nextItem).getValue());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void pointerIterator_hasNext_givenEmptyIterator_shouldReturnFalse() {
        // Arrange
        Iterator emptyIt = Collections.EMPTY_LIST.iterator();
        Expression.PointerIterator iterator = new Expression.PointerIterator(emptyIt, new QName("name"), Locale.US);

        // Act
        boolean hasNext = iterator.hasNext();

        // Assert
        Assert.assertFalse(hasNext);
    }

    @Test
    public void pointerIterator_next_givenElementIsPointer_shouldReturnSamePointerInstance() {
        // Arrange
        Pointer existingPointer = new MockPointer("pointerValue");
        Iterator baseIt = Collections.singletonList(existingPointer).iterator();
        Expression.PointerIterator iterator = new Expression.PointerIterator(baseIt, new QName("name"), Locale.US);

        // Act
        Assert.assertTrue(iterator.hasNext());
        Object result = iterator.next();

        // Assert
        Assert.assertSame(existingPointer, result);
    }

    @Test
    public void pointerIterator_next_givenElementIsNotPointer_shouldWrapInNodePointer() {
        // Arrange
        String rawValue = "plainString";
        Iterator baseIt = Collections.singletonList(rawValue).iterator();
        QName qname = new QName(null, "customValue");
        Expression.PointerIterator iterator = new Expression.PointerIterator(baseIt, qname, Locale.GERMANY);

        // Act
        Assert.assertTrue(iterator.hasNext());
        Object result = iterator.next();

        // Assert
        Assert.assertTrue(result instanceof NodePointer);
        NodePointer nodePointer = (NodePointer) result;
        Assert.assertEquals(rawValue, nodePointer.getValue());
        Assert.assertEquals(Locale.GERMANY, nodePointer.getLocale());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void pointerIterator_remove_shouldThrowUnsupportedOperationException() {
        // Arrange
        Expression.PointerIterator iterator = new Expression.PointerIterator(Collections.EMPTY_LIST.iterator(), new QName("name"), Locale.US);

        // Act
        iterator.remove();
    }

    @Test
    public void valueIterator_hasNext_givenEmptyIterator_shouldReturnFalse() {
        // Arrange
        Expression.ValueIterator iterator = new Expression.ValueIterator(Collections.EMPTY_LIST.iterator());

        // Act
        boolean hasNext = iterator.hasNext();

        // Assert
        Assert.assertFalse(hasNext);
    }

    @Test
    public void valueIterator_next_givenElementIsPointer_shouldReturnExtractedValue() {
        // Arrange
        String underlyingValue = "extractedValue";
        Pointer pointer = new MockPointer(underlyingValue);
        Expression.ValueIterator iterator = new Expression.ValueIterator(Collections.singletonList(pointer).iterator());

        // Act
        Assert.assertTrue(iterator.hasNext());
        Object result = iterator.next();

        // Assert
        Assert.assertEquals(underlyingValue, result);
    }

    @Test
    public void valueIterator_next_givenElementIsNotPointer_shouldReturnRawObject() {
        // Arrange
        Integer rawObject = new Integer(42);
        Expression.ValueIterator iterator = new Expression.ValueIterator(Collections.singletonList(rawObject).iterator());

        // Act
        Assert.assertTrue(iterator.hasNext());
        Object result = iterator.next();

        // Assert
        Assert.assertEquals(rawObject, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void valueIterator_remove_shouldThrowUnsupportedOperationException() {
        // Arrange
        Expression.ValueIterator iterator = new Expression.ValueIterator(Collections.EMPTY_LIST.iterator());

        // Act
        iterator.remove();
    }
}