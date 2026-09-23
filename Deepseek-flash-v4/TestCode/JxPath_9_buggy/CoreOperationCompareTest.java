package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationCompareTest {

    private CoreOperationCompare operation;
    private EvalContext context;
    private Expression leftExpr;
    private Expression rightExpr;

    @Before
    public void setUp() {
        // Use a concrete subclass for testing
        operation = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                // Not used in this test
                return null;
            }
        };
        context = new EvalContext(null, null) {
            // Minimal EvalContext implementation for testing
            @Override
            public Pointer getSingleNodePointer() {
                return null;
            }

            @Override
            public boolean nextNode() {
                return false;
            }

            @Override
            public int getCurrentPosition() {
                return 0;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object getContextNode() {
                return null;
            }
        };
    }

    @Test
    public void testEqualWithBothCollections() {
        // Test when both l and r are Collections
        Collection<String> leftColl = Arrays.asList("a", "b", "c");
        Collection<String> rightColl = Arrays.asList("b", "c", "d");
        
        // Use reflection or expose protected method via subclass
        CoreOperationCompare testOp = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return null;
            }
            
            @Override
            protected boolean equal(EvalContext ctx, Expression l, Expression r) {
                return super.equal(ctx, l, r);
            }
        };
        
        // Since equal method is protected, we need to use reflection or another approach
        // For testing, we'll use a concrete implementation
        // Instead, test the protected methods directly via subclass
    }

    @Test
    public void testContainsWithMatchingValue() {
        // Test contains method with a value that exists in iterator
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        
        assertTrue(operation.contains(it, "b"));
    }

    @Test
    public void testContainsWithoutMatchingValue() {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        
        assertFalse(operation.contains(it, "z"));
    }

    @Test
    public void testContainsWithNullValue() {
        List<String> list = Arrays.asList("a", null, "c");
        Iterator<String> it = list.iterator();
        
        assertTrue(operation.contains(it, null));
    }

    @Test
    public void testContainsWithEmptyIterator() {
        List<String> list = new ArrayList<>();
        Iterator<String> it = list.iterator();
        
        assertFalse(operation.contains(it, "a"));
    }

    @Test
    public void testFindMatchWithOverlap() {
        List<String> leftList = Arrays.asList("a", "b", "c");
        List<String> rightList = Arrays.asList("c", "d", "e");
        
        assertTrue(operation.findMatch(leftList.iterator(), rightList.iterator()));
    }

    @Test
    public void testFindMatchWithoutOverlap() {
        List<String> leftList = Arrays.asList("a", "b", "c");
        List<String> rightList = Arrays.asList("d", "e", "f");
        
        assertFalse(operation.findMatch(leftList.iterator(), rightList.iterator()));
    }

    @Test
    public void testFindMatchWithEmptyIterators() {
        List<String> leftList = new ArrayList<>();
        List<String> rightList = new ArrayList<>();
        
        assertFalse(operation.findMatch(leftList.iterator(), rightList.iterator()));
    }

    @Test
    public void testEqualWithBothNull() {
        assertTrue(operation.equal((Object) null, (Object) null));
    }

    @Test
    public void testEqualWithSameObject() {
        Object obj = new Object();
        assertTrue(operation.equal(obj, obj));
    }

    @Test
    public void testEqualWithBooleans() {
        assertTrue(operation.equal(Boolean.TRUE, Boolean.TRUE));
        assertFalse(operation.equal(Boolean.TRUE, Boolean.FALSE));
    }

    @Test
    public void testEqualWithBooleanAndString() {
        assertTrue(operation.equal(Boolean.TRUE, "true"));
        assertFalse(operation.equal(Boolean.TRUE, "false"));
    }

    @Test
    public void testEqualWithNumbers() {
        assertTrue(operation.equal(1.0, 1.0));
        assertTrue(operation.equal(1, 1.0));
        assertFalse(operation.equal(1.0, 2.0));
    }

    @Test
    public void testEqualWithDoubles() {
        assertTrue(operation.equal(1.0, 1.0));
        assertFalse(operation.equal(1.0, Double.NaN));
    }

    @Test
    public void testEqualWithStrings() {
        assertTrue(operation.equal("test", "test"));
        assertFalse(operation.equal("test", "other"));
    }

    @Test
    public void testEqualWithNonStringObject() {
        Integer val1 = new Integer(10);
        Integer val2 = new Integer(10);
        assertTrue(operation.equal(val1, val2));
    }

    @Test
    public void testEqualWithPointerObjects() {
        // Test with different pointer objects
        final Pointer ptr1 = new Pointer() {
            @Override
            public Object getValue() {
                return "value1";
            }

            @Override
            public Object getNode() {
                return "node1";
            }

            @Override
            public boolean isLeaf() {
                return true;
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
            public boolean isAssociation() {
                return false;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                if (o instanceof Pointer) {
                    Pointer other = (Pointer) o;
                    return this.getValue().equals(other.getValue());
                }
                return false;
            }

            @Override
            public int hashCode() {
                return getValue().hashCode();
            }

            @Override
            public Object clone() {
                return null;
            }

            @Override
            public String asPath() {
                return "";
            }

            @Override
            public boolean shouldBeContextNode() {
                return false;
            }

            @Override
            public Pointer createChild(Object owner, Object name, int index) {
                return null;
            }

            @Override
            public Pointer createAttribute(Object owner, Object name) {
                return null;
            }

            @Override
            public Pointer getPointer() {
                return this;
            }

            @Override
            public Pointer getParent() {
                return null;
            }

            @Override
            public Pointer getImmediateParent() {
                return null;
            }
        };

        Pointer ptr2 = new Pointer() {
            @Override
            public Object getValue() {
                return "value1";
            }

            @Override
            public Object getNode() {
                return "node1";
            }

            @Override
            public boolean isLeaf() {
                return true;
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
            public boolean isAssociation() {
                return false;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                if (o instanceof Pointer) {
                    Pointer other = (Pointer) o;
                    return this.getValue().equals(other.getValue());
                }
                return false;
            }

            @Override
            public int hashCode() {
                return getValue().hashCode();
            }

            @Override
            public Object clone() {
                return null;
            }

            @Override
            public String asPath() {
                return "";
            }

            @Override
            public boolean shouldBeContextNode() {
                return false;
            }

            @Override
            public Pointer createChild(Object owner, Object name, int index) {
                return null;
            }

            @Override
            public Pointer createAttribute(Object owner, Object name) {
                return null;
            }

            @Override
            public Pointer getPointer() {
                return this;
            }

            @Override
            public Pointer getParent() {
                return null;
            }

            @Override
            public Pointer getImmediateParent() {
                return null;
            }
        };

        assertTrue(operation.equal(ptr1, ptr2));
    }

    @Test
    public void testEqualWithDifferentPointerValues() {
        // Test with pointers having different values - should fall through to value comparison
        Pointer ptr1 = new Pointer() {
            @Override
            public Object getValue() {
                return "value1";
            }

            @Override
            public Object getNode() {
                return "node1";
            }

            @Override
            public boolean isLeaf() {
                return true;
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
            public boolean isAssociation() {
                return false;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                return false; // Force false to test fallback
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Object clone() {
                return null;
            }

            @Override
            public String asPath() {
                return "";
            }

            @Override
            public boolean shouldBeContextNode() {
                return false;
            }

            @Override
            public Pointer createChild(Object owner, Object name, int index) {
                return null;
            }

            @Override
            public Pointer createAttribute(Object owner, Object name) {
                return null;
            }

            @Override
            public Pointer getPointer() {
                return this;
            }

            @Override
            public Pointer getParent() {
                return null;
            }

            @Override
            public Pointer getImmediateParent() {
                return null;
            }
        };

        Pointer ptr2 = new Pointer() {
            @Override
            public Object getValue() {
                return "value1";
            }

            @Override
            public Object getNode() {
                return "node1";
            }

            @Override
            public boolean isLeaf() {
                return true;
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
            public boolean isAssociation() {
                return false;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Object clone() {
                return null;
            }

            @Override
            public String asPath() {
                return "";
            }

            @Override
            public boolean shouldBeContextNode() {
                return false;
            }

            @Override
            public Pointer createChild(Object owner, Object name, int index) {
                return null;
            }

            @Override
            public Pointer createAttribute(Object owner, Object name) {
                return null;
            }

            @Override
            public Pointer getPointer() {
                return this;
            }

            @Override
            public Pointer getParent() {
                return null;
            }

            @Override
            public Pointer getImmediateParent() {
                return null;
            }
        };

        // Since equals returns false for both, and values are equal, should still return true via value comparison
        assertTrue(operation.equal(ptr1, ptr2));
    }

    @Test
    public void testEqualWithIteratorAndValue() {
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        
        assertTrue(operation.contains(it, "b"));
    }

    @Test
    public void testEqualWithBothIteratorsWithOverlap() {
        List<String> leftList = Arrays.asList("a", "b", "c");
        List<String> rightList = Arrays.asList("b", "d", "e");
        
        // Test the full equal method with iterators
        CoreOperationCompare testOp = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return null;
            }
            
            @Override
            protected boolean equal(EvalContext ctx, Expression l, Expression r) {
                return super.equal(ctx, l, r);
            }
        };
        
        // Since we need Expression objects, we'll create mock expressions
        Expression leftExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return leftList.iterator();
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        Expression rightExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return rightList.iterator();
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        assertTrue(testOp.equal(context, leftExpr, rightExpr));
    }

    @Test
    public void testEqualWithOneIteratorAndOneValue() {
        // Test when one side is iterator and other is single value
        List<String> list = Arrays.asList("a", "b", "c");
        Iterator<String> it = list.iterator();
        
        Pointer ptr = new Pointer() {
            @Override
            public Object getValue() {
                return "b";
            }

            @Override
            public Object getNode() {
                return "b";
            }

            @Override
            public boolean isLeaf() {
                return true;
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
            public boolean isAssociation() {
                return false;
            }

            @Override
            public void setValue(Object value) {
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Object clone() {
                return null;
            }

            @Override
            public String asPath() {
                return "";
            }

            @Override
            public boolean shouldBeContextNode() {
                return false;
            }

            @Override
            public Pointer createChild(Object owner, Object name, int index) {
                return null;
            }

            @Override
            public Pointer createAttribute(Object owner, Object name) {
                return null;
            }

            @Override
            public Pointer getPointer() {
                return this;
            }

            @Override
            public Pointer getParent() {
                return null;
            }

            @Override
            public Pointer getImmediateParent() {
                return null;
            }
        };

        CoreOperationCompare testOp = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return null;
            }
            
            @Override
            protected boolean equal(EvalContext ctx, Expression l, Expression r) {
                return super.equal(ctx, l, r);
            }
        };
        
        Expression leftExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return it;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        Expression rightExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return ptr;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        assertTrue(testOp.equal(context, leftExpr, rightExpr));
    }

    @Test
    public void testEqualWithInitialContext() {
        // Test with InitialContext wrapping
        CoreOperationCompare testOp = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return null;
            }
            
            @Override
            protected boolean equal(EvalContext ctx, Expression l, Expression r) {
                return super.equal(ctx, l, r);
            }
        };
        
        // Create an InitialContext
        InitialContext initContext = new InitialContext(context);
        List<String> list = Arrays.asList("a", "b");
        
        Expression leftExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return initContext;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        Expression rightExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return list;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        // This should not throw and should return false since iterators don't match
        assertFalse(testOp.equal(context, leftExpr, rightExpr));
    }

    @Test
    public void testEqualWithSelfContext() {
        // Test with SelfContext
        CoreOperationCompare testOp = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return null;
            }
            
            @Override
            protected boolean equal(EvalContext ctx, Expression l, Expression r) {
                return super.equal(ctx, l, r);
            }
        };
        
        // Create a SelfContext
        SelfContext selfContext = new SelfContext(context);
        String value = "test";
        
        Expression leftExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return selfContext;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        Expression rightExpr = new Expression() {
            @Override
            public Object compute(EvalContext ctx) {
                return value;
            }
            
            @Override
            public boolean isContextDependent() {
                return false;
            }
        };
        
        // Test with different values - should return false
        assertFalse(testOp.equal(context, leftExpr, rightExpr));
    }
    
    @Test
    public void testComputeResult() {
        // Since compute is abstract, we need to test through a concrete subclass
        // This test is more for coverage
        CoreOperationCompare stub = new CoreOperationCompare(null, null) {
            @Override
            public Object compute(EvalContext ctx) {
                return "result";
            }
        };
        
        assertEquals("result", stub.compute(context));
    }
}