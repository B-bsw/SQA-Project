package org.apache.commons.jxpath.ri.compiler;

/*
 * ============================================================================
 * Phase 1 - Code Analysis & Test Matrix
 * ============================================================================
 * Class Under Test: CoreOperationCompare (abstract class)
 * Direct Dependencies:
 *   - org.apache.commons.jxpath.Pointer
 *   - org.apache.commons.jxpath.ri.EvalContext
 *   - org.apache.commons.jxpath.ri.InfoSetUtil
 *   - org.apache.commons.jxpath.ri.axes.InitialContext
 *   - org.apache.commons.jxpath.ri.axes.SelfContext
 *
 * Methods to cover:
 *   1. getPrecedence() -> returns 2
 *   2. isSymmetric() -> returns true
 *   3. equal(EvalContext, Expression, Expression)
 *      - InitialContext reset branch (left and right)
 *      - SelfContext getSingleNodePointer branch (left and right)
 *      - Collection to Iterator transformation (left and right)
 *      - Iterator / Iterator matching via findMatch()
 *      - Iterator / Non-Iterator matching via contains() (left Iterator, right Iterator)
 *      - Non-Iterator fallback to equal(Object, Object)
 *   4. contains(Iterator, Object)
 *      - Empty iterator -> false
 *      - Iterator matches on first element -> true
 *      - Iterator matches on subsequent element -> true
 *      - Iterator does not match -> false
 *   5. findMatch(Iterator, Iterator)
 *      - Both empty -> false
 *      - Left empty, Right has elements -> false
 *      - Left has elements, Right empty -> false
 *      - Element in Right matches element in Left -> true
 *      - No overlapping elements -> false
 *   6. equal(Object, Object)
 *      - Pointer & Pointer: equals() true -> true
 *      - Pointer & Pointer: equals() false -> compare extracted values
 *      - Pointer & non-Pointer -> extract value and compare
 *      - non-Pointer & Pointer -> extract value and compare
 *      - l == r (same reference, both null) -> true
 *      - Boolean comparisons (either side Boolean)
 *      - Number comparisons (either side Number)
 *      - NaN comparison (either side NaN) -> false
 *      - String comparisons (either side String)
 *      - Fallback custom object equals and null safety
 * ============================================================================
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationCompareTest {

    // Concrete test implementation of abstract CoreOperationCompare
    private static class TestableCoreOperationCompare extends CoreOperationCompare {

        public TestableCoreOperationCompare(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        public Object computeValue(EvalContext context) {
            return equal(context, getArg1(), getArg2()) ? Boolean.TRUE : Boolean.FALSE;
        }

        public String getSymbol() {
            return "==";
        }

        private Expression getArg1() {
            return this.args[0];
        }

        private Expression getArg2() {
            return this.args[1];
        }

        public int testGetPrecedence() {
            return getPrecedence();
        }

        public boolean testIsSymmetric() {
            return isSymmetric();
        }

        public boolean testEqual(EvalContext context, Expression left, Expression right) {
            return equal(context, left, right);
        }

        public boolean testContains(Iterator it, Object value) {
            return contains(it, value);
        }

        public boolean testFindMatch(Iterator lit, Iterator rit) {
            return findMatch(lit, rit);
        }

        public boolean testEqual(Object l, Object r) {
            return equal(l, r);
        }
    }

    // Concrete dummy Expression returning specified constant value
    private static class MockExpression extends Expression {
        private final Object value;

        public MockExpression(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    // Mock InitialContext tracking reset() invocations
    private static class MockInitialContext extends InitialContext {
        private boolean resetCalled = false;
        private final Iterator iterator;

        public MockInitialContext(Iterator iterator) {
            super(null);
            this.iterator = iterator;
        }

        public void reset() {
            this.resetCalled = true;
        }

        public boolean isResetCalled() {
            return resetCalled;
        }

        public boolean hasNext() {
            return iterator != null && iterator.hasNext();
        }

        public Object next() {
            return iterator != null ? iterator.next() : null;
        }

        public void remove() {
            if (iterator != null) {
                iterator.remove();
            }
        }
    }

    // Mock SelfContext returning configured Pointer
    private static class MockSelfContext extends SelfContext {
        private final Pointer pointer;

        public MockSelfContext(Pointer pointer) {
            super(null, null);
            this.pointer = pointer;
        }

        public Pointer getSingleNodePointer() {
            return pointer;
        }
    }

    // Custom test object for fallback equals comparison
    private static class CustomValue {
        private final String key;

        public CustomValue(String key) {
            this.key = key;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CustomValue other = (CustomValue) obj;
            return key == null ? other.key == null : key.equals(other.key);
        }

        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }

    // Helper dynamic proxy implementation for Pointer interface
    private static class PointerInvocationHandler implements InvocationHandler {
        private final Object value;
        private final Object pointerId;

        public PointerInvocationHandler(Object value, Object pointerId) {
            this.value = value;
            this.pointerId = pointerId;
        }

        public Object getValue() {
            return value;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("getValue".equals(name)) {
                return value;
            }
            if ("equals".equals(name)) {
                if (args != null && args.length == 1 && args[0] != null) {
                    if (args[0] == proxy) {
                        return Boolean.TRUE;
                    }
                    if (Proxy.isProxyClass(args[0].getClass())) {
                        InvocationHandler handler = Proxy.getInvocationHandler(args[0]);
                        if (handler instanceof PointerInvocationHandler) {
                            PointerInvocationHandler other = (PointerInvocationHandler) handler;
                            return Boolean.valueOf(pointerId != null && pointerId.equals(other.pointerId));
                        }
                    }
                }
                return Boolean.FALSE;
            }
            if ("hashCode".equals(name)) {
                return new Integer(pointerId == null ? 0 : pointerId.hashCode());
            }
            if ("toString".equals(name)) {
                return "MockPointer[" + pointerId + ", " + value + "]";
            }
            return null;
        }
    }

    private Pointer createPointer(Object value, Object pointerId) {
        return (Pointer) Proxy.newProxyInstance(
            Pointer.class.getClassLoader(),
            new Class[] { Pointer.class },
            new PointerInvocationHandler(value, pointerId)
        );
    }

    private TestableCoreOperationCompare operation;

    @Before
    public void setUp() {
        Expression left = new MockExpression("defaultLeft");
        Expression right = new MockExpression("defaultRight");
        operation = new TestableCoreOperationCompare(left, right);
    }

    // =========================================================================
    // Metadata Tests: getPrecedence & isSymmetric
    // =========================================================================

    @Test
    public void getPrecedence_normalCall_shouldReturnTwo() {
        // Arrange & Act
        int precedence = operation.testGetPrecedence();

        // Assert
        Assert.assertEquals(2, precedence);
    }

    @Test
    public void isSymmetric_normalCall_shouldReturnTrue() {
        // Arrange & Act
        boolean symmetric = operation.testIsSymmetric();

        // Assert
        Assert.assertTrue(symmetric);
    }

    // =========================================================================
    // equal(EvalContext, Expression, Expression) Tests
    // =========================================================================

    @Test
    public void equalContext_givenInitialContextLeft_shouldResetAndMatch() {
        // Arrange
        List list = new ArrayList();
        list.add("testVal");
        MockInitialContext initCtx = new MockInitialContext(list.iterator());
        Expression left = new MockExpression(initCtx);
        Expression right = new MockExpression("testVal");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(initCtx.isResetCalled());
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenInitialContextRight_shouldResetAndMatch() {
        // Arrange
        List list = new ArrayList();
        list.add("testVal");
        MockInitialContext initCtx = new MockInitialContext(list.iterator());
        Expression left = new MockExpression("testVal");
        Expression right = new MockExpression(initCtx);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(initCtx.isResetCalled());
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenSelfContextLeft_shouldExtractPointerAndMatch() {
        // Arrange
        Pointer ptr = createPointer("valueA", "ptrA");
        MockSelfContext selfCtx = new MockSelfContext(ptr);
        Expression left = new MockExpression(selfCtx);
        Expression right = new MockExpression("valueA");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenSelfContextRight_shouldExtractPointerAndMatch() {
        // Arrange
        Pointer ptr = createPointer("valueB", "ptrB");
        MockSelfContext selfCtx = new MockSelfContext(ptr);
        Expression left = new MockExpression("valueB");
        Expression right = new MockExpression(selfCtx);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenCollectionsBothMatching_shouldReturnTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("a");
        leftList.add("b");

        List rightList = new ArrayList();
        rightList.add("c");
        rightList.add("b");

        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(rightList);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenCollectionsNoMatch_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("a");
        leftList.add("b");

        List rightList = new ArrayList();
        rightList.add("x");
        rightList.add("y");

        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression(rightList);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalContext_givenLeftCollectionAndRightScalarMatching_shouldReturnTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("item1");
        leftList.add("item2");

        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression("item2");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenLeftCollectionAndRightScalarNotMatching_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("item1");
        leftList.add("item2");

        Expression left = new MockExpression(leftList);
        Expression right = new MockExpression("item3");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalContext_givenLeftScalarAndRightCollectionMatching_shouldReturnTrue() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add("item1");
        rightList.add("item2");

        Expression left = new MockExpression("item1");
        Expression right = new MockExpression(rightList);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenLeftScalarAndRightCollectionNotMatching_shouldReturnFalse() {
        // Arrange
        List rightList = new ArrayList();
        rightList.add("item1");
        rightList.add("item2");

        Expression left = new MockExpression("item0");
        Expression right = new MockExpression(rightList);

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalContext_givenScalarsEqual_shouldReturnTrue() {
        // Arrange
        Expression left = new MockExpression("equalVal");
        Expression right = new MockExpression("equalVal");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalContext_givenScalarsNotEqual_shouldReturnFalse() {
        // Arrange
        Expression left = new MockExpression("val1");
        Expression right = new MockExpression("val2");

        // Act
        boolean result = operation.testEqual(null, left, right);

        // Assert
        Assert.assertFalse(result);
    }

    // =========================================================================
    // contains(Iterator, Object) Tests
    // =========================================================================

    @Test
    public void contains_givenEmptyIterator_shouldReturnFalse() {
        // Arrange
        List emptyList = Collections.EMPTY_LIST;
        Iterator it = emptyList.iterator();

        // Act
        boolean result = operation.testContains(it, "any");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void contains_givenMatchAtFirstPosition_shouldReturnTrue() {
        // Arrange
        List list = new ArrayList();
        list.add("target");
        list.add("second");
        Iterator it = list.iterator();

        // Act
        boolean result = operation.testContains(it, "target");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void contains_givenMatchAtSecondPosition_shouldReturnTrue() {
        // Arrange
        List list = new ArrayList();
        list.add("first");
        list.add("target");
        Iterator it = list.iterator();

        // Act
        boolean result = operation.testContains(it, "target");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void contains_givenNoMatch_shouldReturnFalse() {
        // Arrange
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        Iterator it = list.iterator();

        // Act
        boolean result = operation.testContains(it, "missing");

        // Assert
        Assert.assertFalse(result);
    }

    // =========================================================================
    // findMatch(Iterator, Iterator) Tests
    // =========================================================================

    @Test
    public void findMatch_givenBothIteratorsEmpty_shouldReturnFalse() {
        // Arrange
        Iterator lit = Collections.EMPTY_LIST.iterator();
        Iterator rit = Collections.EMPTY_LIST.iterator();

        // Act
        boolean result = operation.testFindMatch(lit, rit);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenLeftEmptyRightNonEmpty_shouldReturnFalse() {
        // Arrange
        Iterator lit = Collections.EMPTY_LIST.iterator();
        List rightList = new ArrayList();
        rightList.add("elem1");
        Iterator rit = rightList.iterator();

        // Act
        boolean result = operation.testFindMatch(lit, rit);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenLeftNonEmptyRightEmpty_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("elem1");
        Iterator lit = leftList.iterator();
        Iterator rit = Collections.EMPTY_LIST.iterator();

        // Act
        boolean result = operation.testFindMatch(lit, rit);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenMatchingElements_shouldReturnTrue() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("a");
        leftList.add("b");
        leftList.add("c");

        List rightList = new ArrayList();
        rightList.add("d");
        rightList.add("b");

        // Act
        boolean result = operation.testFindMatch(leftList.iterator(), rightList.iterator());

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void findMatch_givenNoMatchingElements_shouldReturnFalse() {
        // Arrange
        List leftList = new ArrayList();
        leftList.add("a");
        leftList.add("b");

        List rightList = new ArrayList();
        rightList.add("x");
        rightList.add("y");

        // Act
        boolean result = operation.testFindMatch(leftList.iterator(), rightList.iterator());

        // Assert
        Assert.assertFalse(result);
    }

    // =========================================================================
    // equal(Object, Object) Tests: Pointers & References
    // =========================================================================

    @Test
    public void equal_givenIdenticalPointers_shouldReturnTrueFastPath() {
        // Arrange: pointers with equal identity
        Pointer p1 = createPointer("val1", "id1");
        Pointer p2 = createPointer("val2", "id1");

        // Act
        boolean result = operation.testEqual(p1, p2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenDifferentPointersWithSameValues_shouldReturnTrueAfterExtraction() {
        // Arrange: pointers not equal, but extracted values equal
        Pointer p1 = createPointer("commonValue", "id1");
        Pointer p2 = createPointer("commonValue", "id2");

        // Act
        boolean result = operation.testEqual(p1, p2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenDifferentPointersWithDifferentValues_shouldReturnFalse() {
        // Arrange: pointers not equal and values not equal
        Pointer p1 = createPointer("val1", "id1");
        Pointer p2 = createPointer("val2", "id2");

        // Act
        boolean result = operation.testEqual(p1, p2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftPointerAndRightValueEqual_shouldReturnTrue() {
        // Arrange
        Pointer p1 = createPointer("val1", "id1");

        // Act
        boolean result = operation.testEqual(p1, "val1");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftValueAndRightPointerEqual_shouldReturnTrue() {
        // Arrange
        Pointer p2 = createPointer("val2", "id2");

        // Act
        boolean result = operation.testEqual("val2", p2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothNull_shouldReturnTrue() {
        // Act
        boolean result = operation.testEqual(null, null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenSameInstance_shouldReturnTrue() {
        // Arrange
        Object obj = new Object();

        // Act
        boolean result = operation.testEqual(obj, obj);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftNullRightNonNull_shouldReturnFalse() {
        // Act
        boolean result = operation.testEqual(null, new CustomValue("nonNull"));

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftNonNullRightNull_shouldReturnFalse() {
        // Act
        boolean result = operation.testEqual(new CustomValue("nonNull"), null);

        // Assert
        Assert.assertFalse(result);
    }

    // =========================================================================
    // equal(Object, Object) Tests: Booleans
    // =========================================================================

    @Test
    public void equal_givenBothBooleansSame_shouldReturnTrue() {
        // Act & Assert
        Assert.assertTrue(operation.testEqual(Boolean.TRUE, Boolean.TRUE));
        Assert.assertTrue(operation.testEqual(Boolean.FALSE, Boolean.FALSE));
    }

    @Test
    public void equal_givenBothBooleansDifferent_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(operation.testEqual(Boolean.TRUE, Boolean.FALSE));
        Assert.assertFalse(operation.testEqual(Boolean.FALSE, Boolean.TRUE));
    }

    @Test
    public void equal_givenBooleanAndStringEquivalent_shouldReturnTrue() {
        // In XPath / InfoSetUtil, non-empty strings are true
        // Act & Assert
        Assert.assertTrue(operation.testEqual(Boolean.TRUE, "true"));
        Assert.assertTrue(operation.testEqual("non-empty", Boolean.TRUE));
    }

    @Test
    public void equal_givenBooleanAndEmptyStringEquivalent_shouldReturnTrueForFalse() {
        // In XPath / InfoSetUtil, empty string booleanValue is false
        // Act & Assert
        Assert.assertTrue(operation.testEqual(Boolean.FALSE, ""));
        Assert.assertTrue(operation.testEqual("", Boolean.FALSE));
    }

    @Test
    public void equal_givenBooleanAndNumber_shouldCompareBooleanRepresentations() {
        // Non-zero number is true, zero is false
        // Act & Assert
        Assert.assertTrue(operation.testEqual(Boolean.TRUE, new Integer(1)));
        Assert.assertTrue(operation.testEqual(new Integer(1), Boolean.TRUE));
        Assert.assertTrue(operation.testEqual(Boolean.FALSE, new Integer(0)));
        Assert.assertTrue(operation.testEqual(new Integer(0), Boolean.FALSE));
    }

    // =========================================================================
    // equal(Object, Object) Tests: Numbers & NaN
    // =========================================================================

    @Test
    public void equal_givenNumbersEqual_shouldReturnTrue() {
        // Arrange
        Integer intVal = new Integer(42);
        Double doubleVal = new Double(42.0);

        // Act & Assert
        Assert.assertTrue(operation.testEqual(intVal, doubleVal));
        Assert.assertTrue(operation.testEqual(doubleVal, intVal));
    }

    @Test
    public void equal_givenNumbersDifferent_shouldReturnFalse() {
        // Arrange
        Integer intVal1 = new Integer(10);
        Integer intVal2 = new Integer(20);

        // Act & Assert
        Assert.assertFalse(operation.testEqual(intVal1, intVal2));
    }

    @Test
    public void equal_givenNumberAndEquivalentString_shouldReturnTrue() {
        // Arrange
        Integer intVal = new Integer(100);
        String strVal = "100.0";

        // Act & Assert
        Assert.assertTrue(operation.testEqual(intVal, strVal));
        Assert.assertTrue(operation.testEqual(strVal, intVal));
    }

    @Test
    public void equal_givenNumberAndNonEquivalentString_shouldReturnFalse() {
        // Arrange
        Integer intVal = new Integer(100);
        String strVal = "200";

        // Act & Assert
        Assert.assertFalse(operation.testEqual(intVal, strVal));
    }

    @Test
    public void equal_givenNaNLeft_shouldReturnFalse() {
        // Arrange
        Double nan = new Double(Double.NaN);
        Double num = new Double(10.0);

        // Act & Assert (XPath specification: comparison involving NaN always false)
        Assert.assertFalse(operation.testEqual(nan, num));
        Assert.assertFalse(operation.testEqual(nan, nan));
    }

    @Test
    public void equal_givenNaNRight_shouldReturnFalse() {
        // Arrange
        Double nan = new Double(Double.NaN);
        Double num = new Double(10.0);

        // Act & Assert
        Assert.assertFalse(operation.testEqual(num, nan));
    }

    // =========================================================================
    // equal(Object, Object) Tests: Strings
    // =========================================================================

    @Test
    public void equal_givenStringsEqual_shouldReturnTrue() {
        // Act & Assert
        Assert.assertTrue(operation.testEqual("hello", "hello"));
    }

    @Test
    public void equal_givenStringsDifferent_shouldReturnFalse() {
        // Act & Assert
        Assert.assertFalse(operation.testEqual("hello", "world"));
    }

    @Test
    public void equal_givenEmptyStrings_shouldReturnTrue() {
        // Act & Assert
        Assert.assertTrue(operation.testEqual("", ""));
    }

    // =========================================================================
    // equal(Object, Object) Tests: Custom Fallback Objects
    // =========================================================================

    @Test
    public void equal_givenCustomObjectsEqual_shouldReturnTrue() {
        // Arrange
        CustomValue c1 = new CustomValue("key1");
        CustomValue c2 = new CustomValue("key1");

        // Act
        boolean result = operation.testEqual(c1, c2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenCustomObjectsNotEqual_shouldReturnFalse() {
        // Arrange
        CustomValue c1 = new CustomValue("key1");
        CustomValue c2 = new CustomValue("key2");

        // Act
        boolean result = operation.testEqual(c1, c2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void computeValue_givenExpressionsComparingEqual_shouldReturnBooleanTrue() {
        // Arrange
        Expression left = new MockExpression("test");
        Expression right = new MockExpression("test");
        TestableCoreOperationCompare op = new TestableCoreOperationCompare(left, right);

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals("==", op.getSymbol());
    }

    @Test
    public void computeValue_givenExpressionsComparingNotEqual_shouldReturnBooleanFalse() {
        // Arrange
        Expression left = new MockExpression("test1");
        Expression right = new MockExpression("test2");
        TestableCoreOperationCompare op = new TestableCoreOperationCompare(left, right);

        // Act
        Object result = op.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.FALSE, result);
    }
}