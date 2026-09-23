package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.QName;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ExpressionTest {

    private Expression expression;
    private EvalContext context;
    private NodePointer nodePointer;

    @Before
    public void setUp() {
        context = mock(EvalContext.class);
        nodePointer = mock(NodePointer.class);
    }

    @Test
    public void testIsContextDependent_CachedValue() {
        expression = new TestExpression(true);
        assertTrue(expression.isContextDependent());
        // Second call should use cached value
        expression.computeContextDependentCalled = false;
        assertTrue(expression.isContextDependent());
        assertFalse("computeContextDependent should not be called again", expression.computeContextDependentCalled);
    }

    @Test
    public void testIsContextDependent_NotCached() {
        expression = new TestExpression(false);
        assertFalse(expression.isContextDependent());
        assertTrue(expression.computeContextDependentCalled);
    }

    @Test
    public void testIsContextDependent_FirstCallComputes() {
        expression = new TestExpression(true);
        assertFalse(expression.contextDependencyKnown);
        assertTrue(expression.isContextDependent());
        assertTrue(expression.contextDependencyKnown);
        assertTrue(expression.contextDependent);
    }

    @Test
    public void testIterate_NormalResult() {
        expression = new TestExpression("value");
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iterate(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        assertEquals("value", result.next());
    }

    @Test
    public void testIterate_NullResult() {
        expression = new TestExpression(null);
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iterate(context);
        assertNotNull(result);
        assertFalse(result.hasNext());
    }

    @Test
    public void testIterate_EvalContextResult() {
        EvalContext evalContext = mock(EvalContext.class);
        expression = new TestExpression(evalContext);
        Iterator result = expression.iterate(context);
        assertNotNull(result);
        assertTrue(result instanceof Iterator);
    }

    @Test
    public void testIteratePointers_NullResult() {
        expression = new TestExpression(null);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertFalse(result.hasNext());
    }

    @Test
    public void testIteratePointers_EvalContextResult() {
        EvalContext evalContext = mock(EvalContext.class);
        expression = new TestExpression(evalContext);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result instanceof EvalContext);
    }

    @Test
    public void testIteratePointers_IterableResult() {
        expression = new TestExpression(Arrays.asList("a", "b"));
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        assertTrue(first instanceof Pointer);
        Pointer pointer = (Pointer) first;
        assertNotNull(pointer);
    }

    @Test
    public void testIteratePointers_PointerResult() {
        Pointer pointer = mock(Pointer.class);
        expression = new TestExpression(pointer);
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        assertSame(pointer, first);
    }

    @Test
    public void testIteratePointers_IterableWithPointers() {
        Pointer pointer1 = mock(Pointer.class);
        Pointer pointer2 = mock(Pointer.class);
        expression = new TestExpression(Arrays.asList(pointer1, pointer2));
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        assertSame(pointer1, result.next());
        assertTrue(result.hasNext());
        assertSame(pointer2, result.next());
        assertFalse(result.hasNext());
    }

    @Test
    public void testComputeValue_NullContext() {
        expression = new TestExpression("value");
        try {
            expression.computeValue(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCompute_NullContext() {
        expression = new TestExpression("value");
        try {
            expression.compute(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testComputeValue_NonNullContext() {
        expression = new TestExpression("value");
        assertEquals("value", expression.computeValue(context));
    }

    @Test
    public void testCompute_NonNullContext() {
        expression = new TestExpression("value");
        assertEquals("value", expression.compute(context));
    }

    @Test
    public void testValueIterator_HasNextAndNext() {
        Iterator<String> inner = Arrays.asList("a", "b").iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        assertTrue(vi.hasNext());
        assertEquals("a", vi.next());
        assertTrue(vi.hasNext());
        assertEquals("b", vi.next());
        assertFalse(vi.hasNext());
    }

    @Test
    public void testValueIterator_NextWithPointer() {
        Pointer pointer = mock(Pointer.class);
        when(pointer.getValue()).thenReturn("value");
        Iterator<Pointer> inner = Arrays.asList(pointer).iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        assertTrue(vi.hasNext());
        assertEquals("value", vi.next());
    }

    @Test
    public void testValueIterator_NextWithNullPointer() {
        Pointer pointer = mock(Pointer.class);
        when(pointer.getValue()).thenReturn(null);
        Iterator<Pointer> inner = Arrays.asList(pointer).iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        assertTrue(vi.hasNext());
        assertNull(vi.next());
    }

    @Test
    public void testValueIterator_Remove() {
        Iterator<String> inner = Collections.<String>emptyList().iterator();
        Expression.ValueIterator vi = new Expression.ValueIterator(inner);
        try {
            vi.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testPointerIterator_HasNextAndNext() {
        Iterator<String> inner = Arrays.asList("a", "b").iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(inner, new QName("test"), Locale.US);
        assertTrue(pi.hasNext());
        Object first = pi.next();
        assertNotNull(first);
        assertTrue(first instanceof Pointer);
        Pointer pointer = (Pointer) first;
        assertEquals("a", pointer.getValue());
        assertTrue(pi.hasNext());
        Object second = pi.next();
        assertNotNull(second);
        assertTrue(second instanceof Pointer);
        Pointer pointer2 = (Pointer) second;
        assertEquals("b", pointer2.getValue());
        assertFalse(pi.hasNext());
    }

    @Test
    public void testPointerIterator_NextWithPointer() {
        Pointer pointer = mock(Pointer.class);
        Iterator<Pointer> inner = Arrays.asList(pointer).iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(inner, new QName("test"), Locale.US);
        assertTrue(pi.hasNext());
        assertSame(pointer, pi.next());
    }

    @Test
    public void testPointerIterator_Remove() {
        Iterator<String> inner = Collections.<String>emptyList().iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(inner, new QName("test"), Locale.US);
        try {
            pi.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testPointerIterator_NextWithNullPointer() {
        Iterator<Object> inner = Arrays.asList((Object) null).iterator();
        Expression.PointerIterator pi = new Expression.PointerIterator(inner, new QName("test"), Locale.US);
        assertTrue(pi.hasNext());
        Object result = pi.next();
        assertNotNull(result);
        assertTrue(result instanceof Pointer);
        Pointer pointer = (Pointer) result;
        assertNotNull(pointer.getValue());
    }

    @Test
    public void testIteratePointers_WithComputeResultingInEvalContext() {
        EvalContext evalContext = mock(EvalContext.class);
        expression = new TestExpression(evalContext);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result instanceof EvalContext);
        assertSame(evalContext, result);
    }

    @Test
    public void testIterate_PointerResult() {
        Pointer pointer = mock(Pointer.class);
        expression = new TestExpression(pointer);
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iterate(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        // Should return the pointer itself
        assertSame(pointer, first);
    }

    @Test
    public void testIterate_WithPointerResultAndNext() {
        Pointer pointer = mock(Pointer.class);
        when(pointer.getValue()).thenReturn("value");
        expression = new TestExpression(pointer);
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iterate(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        assertEquals("value", first);
    }

    @Test
    public void testIteratePointers_WithPointerResult() {
        Pointer pointer = mock(Pointer.class);
        expression = new TestExpression(pointer);
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        assertSame(pointer, first);
    }

    @Test
    public void testIteratePointers_WithIterableNotEmpty() {
        expression = new TestExpression(Arrays.asList("a", "b", "c"));
        when(context.getRootContext()).thenReturn(mock(EvalContext.class));
        when(context.getRootContext().getCurrentNodePointer()).thenReturn(nodePointer);
        when(nodePointer.getLocale()).thenReturn(Locale.US);
        Iterator result = expression.iteratePointers(context);
        assertNotNull(result);
        assertTrue(result.hasNext());
        Object first = result.next();
        assertTrue(first instanceof Pointer);
        Pointer pointer = (Pointer) first;
        assertNotNull(pointer);
        assertTrue(result.hasNext());
        Object second = result.next();
        assertTrue(second instanceof Pointer);
        assertTrue(result.hasNext());
        Object third = result.next();
        assertTrue(third instanceof Pointer);
        assertFalse(result.hasNext());
    }

    private class TestExpression extends Expression {
        private final Object result;
        boolean computeContextDependentCalled = false;

        public TestExpression(boolean contextDependent) {
            this.result = null;
            this.contextDependent = contextDependent;
        }

        public TestExpression(Object result) {
            this.result = result;
            this.contextDependent = false;
        }

        @Override
        public boolean computeContextDependent() {
            computeContextDependentCalled = true;
            return contextDependent;
        }

        @Override
        public Object computeValue(EvalContext context) {
            return result;
        }

        @Override
        public Object compute(EvalContext context) {
            return result;
        }
    }
}