package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;

public class CoreOperationRelationalExpressionTest {

    private CoreOperationRelationalExpression expression;

    @Before
    public void setUp() {
        expression = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("1"), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
    }

    @Test
    public void testComputeValueBothNumbers() {
        assertTrue((Boolean) expression.computeValue(null));
    }

    @Test
    public void testComputeValueWithNaNLeft() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("NaN"), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithNaNRight() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("1"), new Constant("NaN")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorLeft() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorRight() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("2"), new Constant(list.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithBothIterators() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "2", "3"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("3", "4"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithNoMatchIterators() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "2"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("3", "4"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithCollection() {
        final Collection<String> coll = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(coll), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSelfContext() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(selfContext), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // SelfContext with null pointer -> doubleValue returns 0.0, compare == 0
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithInitialContext() {
        final InitialContext initialContext = new InitialContext(new org.apache.commons.jxpath.ri.model.VariablePointer(
                new org.apache.commons.jxpath.JXPathContext(new org.apache.commons.jxpath.JXPathContext(
                        new org.apache.commons.jxpath.JXPathContext(null, null), null), null), null));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(initialContext), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // InitialContext with no reset -> doubleValue returns 0.0, compare == 0
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithDifferentTypes() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("1"), new Constant(true)
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithNull() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(null), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testGetPrecedence() {
        assertEquals(RELATIONAL_EXPR_PRECEDENCE, expression.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        assertFalse(expression.isSymmetric());
    }

    @Test
    public void testComputeValueWithEmptyIterators() {
        final List<String> emptyLeft = new ArrayList<>();
        final List<String> emptyRight = new ArrayList<>();
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(emptyLeft.iterator()), new Constant(emptyRight.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithBothIteratorsNoMatch() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "2"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("3", "4"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare > 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorLeftNoMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("3")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare > 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorRightNoMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("3"), new Constant(list.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithMultipleIterators() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("a", "b"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("b", "c"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithCollectionIterator() {
        final Collection<String> coll = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(coll), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithNullIterator() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant((Iterator)null), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // Iterator null -> doubleValue of null is 0.0
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithDifferentIteratorTypes() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1.5", "2.5"));
        final Set<String> rightSet = new HashSet<>(Arrays.asList("2.5", "3.5"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightSet.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSelfAndIterator() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        final List<String> list = new ArrayList<>(Arrays.asList("0", "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(selfContext), new Constant(list.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // selfContext double 0.0, list may contain 0.0 -> match
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithLargeNumbers() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("123456789012345678901234567890"), new Constant("123456789012345678901234567891")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithNegativeNumbers() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("-5"), new Constant("-3")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare < 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithZeroAndNegative() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant("0"), new Constant("-1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare > 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithBooleanAndNumber() {
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(true), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithEmptyCollection() {
        final Collection<String> coll = new ArrayList<>();
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(coll), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        // empty collection -> iterator -> no elements -> false
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSingleElementCollection() {
        final Collection<String> coll = new ArrayList<>(Arrays.asList("1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(coll), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithMultipleElementCollection() {
        final Collection<String> coll = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(coll), new Constant("3")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueMatchFirst() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueMatchLast() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueNoMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("3")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsMatchInSecond() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "2"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsNoMatchEmptyLeft() {
        final List<String> leftList = new ArrayList<>();
        final List<String> rightList = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsNoMatchEmptyRight() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "2"));
        final List<String> rightList = new ArrayList<>();
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSelfContextAndValue() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(selfContext), new Constant("0")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSelfContextAndIterator() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        final List<String> list = new ArrayList<>(Arrays.asList("0", "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(selfContext), new Constant(list.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithInitialContextAndValue() {
        final InitialContext initialContext = new InitialContext(new org.apache.commons.jxpath.ri.model.VariablePointer(
                new org.apache.commons.jxpath.JXPathContext(new org.apache.commons.jxpath.JXPathContext(null, null), null), null));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(initialContext), new Constant("0")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithInitialContextAndIterator() {
        final InitialContext initialContext = new InitialContext(new org.apache.commons.jxpath.ri.model.VariablePointer(
                new org.apache.commons.jxpath.JXPathContext(new org.apache.commons.jxpath.JXPathContext(null, null), null), null));
        final List<String> list = new ArrayList<>(Arrays.asList("0", "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(initialContext), new Constant(list.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsDuplicateValues() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "1", "2"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("2", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsNoMatchDuplicateValues() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("1", "1", "2"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("3", "3", "4"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueDuplicateMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueDuplicateNoMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("3")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueMatchMiddle() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("2")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueNoMatchEnd() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("4")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueNoMatchStart() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("0")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueNoMatchMiddle() {
        final List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("4")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSingleIteratorAndValue() {
        final List<String> list = new ArrayList<>(Arrays.asList("5"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("5")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSingleIteratorNoMatchValue() {
        final List<String> list = new ArrayList<>(Arrays.asList("5"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("6")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithMultipleIteratorsAndDuplicateValues() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("a", "b", "a"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("b", "c"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithMultipleIteratorsNoDuplicateValues() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("a", "b", "a"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("c", "d"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndNullValue() {
        final List<String> list = new ArrayList<>(Arrays.asList(null, "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // null element doubleValue = 0.0, but we compare with 1 -> no match unless compare==0
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndNullValueMatch() {
        final List<String> list = new ArrayList<>(Arrays.asList(null, "0"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("0")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // null element doubleValue = 0.0, matches 0.0 -> true
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndNaN() {
        final List<String> list = new ArrayList<>(Arrays.asList("NaN", "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // NaN with 1 -> no match, but NaN double -> NaN, 
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsOneEmpty() {
        final List<String> leftList = new ArrayList<>();
        final List<String> rightList = new ArrayList<>(Arrays.asList("1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsBothEmpty() {
        final List<String> leftList = new ArrayList<>();
        final List<String> rightList = new ArrayList<>();
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsOneNullElement() {
        final List<String> leftList = new ArrayList<>(Arrays.asList(null, "1"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsBothNullElement() {
        final List<String> leftList = new ArrayList<>(Arrays.asList(null, "1"));
        final List<String> rightList = new ArrayList<>(Arrays.asList(null, "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsOneNaN() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("NaN", "1"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("1", "2"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        // NaN with 1 -> no match, but containsMatch with NaN -> false for all until match
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndValueNaN() {
        final List<String> list = new ArrayList<>(Arrays.asList("NaN"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant("1")
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        // NaN with 1 -> no match, compute(element, value) returns false due to NaN
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithTwoIteratorsAndNaNBoth() {
        final List<String> leftList = new ArrayList<>(Arrays.asList("NaN"));
        final List<String> rightList = new ArrayList<>(Arrays.asList("NaN"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(leftList.iterator()), new Constant(rightList.iterator())
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return true;
            }
        };
        // NaN == NaN is false, but containsMatch with NaN: computes double(NaN)=NaN, then false
        assertFalse((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithSelfContextAndNullPointer() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(selfContext), new Constant(null)
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // null doubleValue = 0.0, selfContext pointer null doubleValue = 0.0
        assertTrue((Boolean) exp.computeValue(null));
    }

    @Test
    public void testComputeValueWithIteratorAndSelfContext() {
        final SelfContext selfContext = new SelfContext(new InitialContext(null), null);
        final List<String> list = new ArrayList<>(Arrays.asList("0", "1"));
        CoreOperationRelationalExpression exp = new CoreOperationRelationalExpression(new Expression[]{
                new Constant(list.iterator()), new Constant(selfContext)
        }) {
            @Override
            protected boolean evaluateCompare(int compare) {
                return compare == 0;
            }
        };
        // iterator with 0 matches selfContext 0.0
        assertTrue((Boolean) exp.computeValue(null));
    }
}