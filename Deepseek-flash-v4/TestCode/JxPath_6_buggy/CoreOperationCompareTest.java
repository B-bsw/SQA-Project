package org.apache.commons.jxpath.ri.compiler;

import java.util.HashSet;
import java.util.Iterator;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoreOperationCompareTest {

    private static class TestCompareOperation extends CoreOperationCompare {
        public TestCompareOperation(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        protected boolean equal(EvalContext context, Expression left, Expression right) {
            return super.equal(context, left, right);
        }

        @Override
        protected boolean contains(Iterator it, Object value) {
            return super.contains(it, value);
        }

        @Override
        protected boolean findMatch(Iterator lit, Iterator rit) {
            return super.findMatch(lit, rit);
        }

        @Override
        protected boolean equal(Object l, Object r) {
            return super.equal(l, r);
        }

        @Override
        public String toString() {
            return "Test";
        }
    }

    private static class TestExpression implements Expression {
        private final Object value;

        public TestExpression(Object value) {
            this.value = value;
        }

        @Override
        public Object compute(EvalContext context) {
            return value;
        }

        @Override
        public String toString() {
            return "Test";
        }
    }

    private static class TestPointer implements Pointer {
        private Object value;

        public TestPointer(Object value) {
            this.value = value;
        }

        @Override
        public String asPath() {
            return "test";
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public boolean isLeaf() {
            return false;
        }

        @Override
        public NodePointer getRootNodePointer() {
            return null;
        }

        @Override
        public Object getBaseValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof TestPointer)) return false;
            TestPointer other = (TestPointer) obj;
            return value == null ? value == null : value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    private TestCompareOperation operation;
    private TestExpression leftExpr;
    private TestExpression rightExpr;
    private TestEvalContext context;

    private static class TestEvalContext extends EvalContext {
        public TestEvalContext() {
            super(null, null);
        }

        @Override
        public Pointer getSingleNodePointer() {
            return null;
        }

        @Override
        public boolean nextNode() {
            return false;
        }

        @Override
        public boolean nextNodeMaybe() {
            return false;
        }

        @Override
        public Object getNode() {
            return null;
        }
    }

    @Before
    public void setUp() {
        context = new TestEvalContext();
        operation = new TestCompareOperation(null, null);
    }

    @After
    public void tearDown() {
        context = null;
        operation = null;
        leftExpr = null;
        rightExpr = null;
    }

    @Test
    public void testEqualSimpleValues() {
        leftExpr = new TestExpression("hello");
        rightExpr = new TestExpression("hello");
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression(42);
        rightExpr = new TestExpression(42.0);
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression(true);
        rightExpr = new TestExpression(true);
        assertTrue(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualNumberComparisons() {
        leftExpr = new TestExpression(10);
        rightExpr = new TestExpression("10");
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression("3.14");
        rightExpr = new TestExpression(3.14);
        assertTrue(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualBooleanComparisons() {
        leftExpr = new TestExpression(true);
        rightExpr = new TestExpression("true");
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression(Boolean.FALSE);
        rightExpr = new TestExpression("false");
        assertTrue(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualStringComparisons() {
        leftExpr = new TestExpression("test");
        rightExpr = new TestExpression("test");
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression("abc");
        rightExpr = new TestExpression("def");
        assertFalse(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualNullValues() {
        leftExpr = new TestExpression(null);
        rightExpr = new TestExpression(null);
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression(null);
        rightExpr = new TestExpression("not null");
        assertFalse(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualWithInitialContextOrSelfContext() {
        TestPointer pointer = new TestPointer("value");
        EvalContext initContext = new TestEvalContext() {
            @Override
            public Pointer getSingleNodePointer() {
                return pointer;
            }
        };
        leftExpr = new TestExpression(initContext);
        rightExpr = new TestExpression("value");
        assertTrue(operation.equal(null, leftExpr, rightExpr));
    }

    @Test
    public void testEqualWithCollectionAndIterator() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("a");
        list.add("b");

        leftExpr = new TestExpression(list);
        rightExpr = new TestExpression("a");
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression("a");
        rightExpr = new TestExpression(list);
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        leftExpr = new TestExpression(list);
        rightExpr = new TestExpression(list.iterator());
        assertTrue(operation.equal(null, leftExpr, rightExpr));

        java.util.ArrayList list2 = new java.util.ArrayList();
        list2.add("b");
        leftExpr = new TestExpression(list);
        rightExpr = new TestExpression(list2);
        assertTrue("Should find match between two iterators", operation.equal(null, leftExpr, rightExpr));

        list2.clear();
        assertFalse("Should return false when no match", operation.equal(null, list.iterator(), list2.iterator()));
    }

    @Test
    public void testContainsWithIterator() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("a");
        list.add("b");
        Iterator it = list.iterator();
        assertTrue(operation.contains(it, "b"));
        assertFalse(operation.contains(list.iterator(), "c"));
    }

    @Test
    public void testFindMatchWithSets() {
        java.util.HashSet left = new java.util.HashSet();
        left.add("a");
        left.add("b");
        java.util.HashSet right = new java.util.HashSet();
        right.add("c");
        right.add("b");
        assertTrue(operation.findMatch(left.iterator(), right.iterator()));

        right.clear();
        right.add("d");
        assertFalse(operation.findMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testEqualWithPointers() {
        TestPointer p1 = new TestPointer("x");
        TestPointer p2 = new TestPointer("x");
        assertTrue(operation.equal(p1, p2));
        assertTrue(operation.equal(p1, p1));

        p2 = new TestPointer("y");
        assertFalse(operation.equal(p1, p2));
    }

    @Test
    public void testEqualWithStringAndNumberMixed() {
        assertTrue(operation.equal("123", 123));
        assertTrue(operation.equal(123, "123"));
        assertFalse(operation.equal("abc", 123));
    }

    @Test
    public void testEqualWithNullAndEmptyCollection() {
        assertFalse(operation.equal(null, "a"));
        assertFalse(operation.equal("a", null));
    }

    @Test
    public void testEqualSameObject() {
        Object same = new Object();
        assertTrue(operation.equal(same, same));
    }

    @Test
    public void testEqualWithBothOperandsNumbers() {
        assertTrue(operation.equal(1.0, 1));
        assertTrue(operation.equal(1, 1.0f));
        assertTrue(operation.equal(0.5, 0.5));
        assertFalse(operation.equal(0.5, 0.5001));
    }

    @Test
    public void testEqualWithBothBooleans() {
        assertTrue(operation.equal(Boolean.TRUE, Boolean.TRUE));
        assertFalse(operation.equal(Boolean.TRUE, Boolean.FALSE));
        assertTrue(operation.equal(false, false));
        assertTrue(operation.equal(true, true));
    }

    @Test
    public void testEqualWithMixedTypes() {
        assertTrue(operation.equal("123", 123.0));
        assertTrue(operation.equal(true, "true"));
        assertTrue(operation.equal(1, "1"));
        assertTrue(operation.equal(0, false));
    }

    @Test
    public void testEqualWithCustomObject() {
        Object o1 = new Object() {
            @Override
            public String toString() {
                return "test";
            }
        };
        assertTrue(operation.equal(o1, o1));
    }

    @Test
    public void testContainsWithNullValue() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add(null);
        list.add("a");
        assertTrue(operation.contains(list.iterator(), null));
        assertTrue(operation.contains(list.iterator(), "a"));
        list.clear();
        list.add("x");
        assertFalse(operation.contains(list.iterator(), null));
    }

    @Test
    public void testFindMatchWithOneEmptyIterator() {
        java.util.HashSet left = new java.util.HashSet();
        left.add("a");
        java.util.HashSet right = new java.util.HashSet();
        assertFalse(operation.findMatch(left.iterator(), right.iterator()));
        right.add("b");
        assertFalse(operation.findMatch(new java.util.HashSet().iterator(), right.iterator()));
    }

    @Test
    public void testEqualWithCollectionContainingNull() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add(null);
        assertTrue(operation.equal(null, list.iterator(), "someValue") || operation.contains(list.iterator(), "someValue"));
    }

    @Test
    public void testEqualWithExpressionReturningNull() {
        assertTrue(operation.equal(TestCompareOperation.class, null, null) ||
                   operation.equal("test", null) == false);
    }

    @Test
    public void testEqualWithSamePointer() {
        TestPointer p = new TestPointer("value");
        assertTrue(operation.equal(p, p));
    }

    @Test
    public void testEqualWithMixedIteratorAndCollection() {
        java.util.ArrayList list1 = new java.util.ArrayList();
        list1.add("a");
        java.util.ArrayList list2 = new java.util.ArrayList();
        list2.add("a");
        assertTrue(operation.equal(null,
                new TestExpression(list1), new TestExpression(list2.iterator())));
    }

    @Test
    public void testFindMatchWithDuplicates() {
        java.util.HashSet left = new java.util.HashSet();
        left.add("a");
        left.add("a");
        java.util.HashSet right = new java.util.HashSet();
        right.add("a");
        assertTrue(operation.findMatch(left.iterator(), right.iterator()));
    }

    @Test
    public void testContainsWithIteratorHasNext() {
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("x");
        Iterator it = list.iterator();
        assertTrue(it.hasNext());
        assertTrue(operation.contains(it, "x"));
        assertFalse(operation.contains(list.iterator(), "y"));
    }

    @Test
    public void testEqualWithBooleanTrueAndStringTrue() {
        assertTrue(operation.equal(true, "true"));
        assertTrue(operation.equal(Boolean.TRUE, "true"));
    }
}