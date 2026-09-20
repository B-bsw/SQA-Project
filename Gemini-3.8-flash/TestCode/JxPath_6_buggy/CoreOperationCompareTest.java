package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoreOperationCompareTest {

    private ConcreteOperationCompare operation;
    private DummyExpression dummyExpr1;
    private DummyExpression dummyExpr2;

    private static class ConcreteOperationCompare extends CoreOperationCompare {
        public ConcreteOperationCompare(Expression arg1, Expression arg2) {
            super(arg1, arg2);
        }

        public Object computeValue(EvalContext context) {
            return equal(context, args[0], args[1]) ? Boolean.TRUE : Boolean.FALSE;
        }

        public String getSymbol() {
            return "==";
        }
    }

    private static class DummyExpression extends Expression {
        private Object value;

        public DummyExpression(Object value) {
            this.value = value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }
    }

    private static class TestPointer implements Pointer {
        private final Object value;
        private final boolean forceEquals;

        public TestPointer(Object value) {
            this(value, false);
        }

        public TestPointer(Object value, boolean forceEquals) {
            this.value = value;
            this.forceEquals = forceEquals;
        }

        public Object getValue() {
            return value;
        }

        public Object getNode() {
            return value;
        }

        public void setValue(Object value) {
        }

        public Object getRootNode() {
            return null;
        }

        public int compareTo(Object o) {
            return 0;
        }

        public String asPath() {
            return "";
        }

        public Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (forceEquals && (obj instanceof Pointer)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    private static class TestInitialContext extends InitialContext {
        private final Pointer pointer;

        public TestInitialContext(Pointer pointer) {
            super(null);
            this.pointer = pointer;
        }

        public Pointer getSingleNodePointer() {
            return pointer;
        }
    }

    private static class TestSelfContext extends SelfContext {
        private final Pointer pointer;

        public TestSelfContext(Pointer pointer) {
            super(null, null);
            this.pointer = pointer;
        }

        public Pointer getSingleNodePointer() {
            return pointer;
        }
    }

    private static class CustomObject {
        private final String id;

        public CustomObject(String id) {
            this.id = id;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomObject) {
                CustomObject other = (CustomObject) obj;
                return this.id == null ? other.id == null : this.id.equals(other.id);
            }
            return false;
        }

        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

        public String toString() {
            return id;
        }
    }

    @Before
    public void setUp() {
        dummyExpr1 = new DummyExpression(null);
        dummyExpr2 = new DummyExpression(null);
        operation = new ConcreteOperationCompare(dummyExpr1, dummyExpr2);
    }

    @Test
    public void equal_givenBothNullDirect_shouldReturnTrue() {
        // Arrange
        Object left = null;
        Object right = null;

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenSameObjectReference_shouldReturnTrue() {
        // Arrange
        Object obj = new Object();

        // Act
        boolean result = operation.equal(obj, obj);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothPointersEqual_shouldReturnTrueImmediately() {
        // Arrange
        Pointer leftPointer = new TestPointer("val1", true);
        Pointer rightPointer = new TestPointer("val2", true);

        // Act
        boolean result = operation.equal(leftPointer, rightPointer);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenPointersNotEqualButValuesEqual_shouldReturnTrue() {
        // Arrange
        Pointer leftPointer = new TestPointer("sameValue", false);
        Pointer rightPointer = new TestPointer("sameValue", false);

        // Act
        boolean result = operation.equal(leftPointer, rightPointer);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftPointerAndRightValue_shouldUnwrapLeftPointer() {
        // Arrange
        Pointer leftPointer = new TestPointer("alpha", false);
        String rightValue = "alpha";

        // Act
        boolean result = operation.equal(leftPointer, rightValue);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftValueAndRightPointer_shouldUnwrapRightPointer() {
        // Arrange
        String leftValue = "beta";
        Pointer rightPointer = new TestPointer("beta", false);

        // Act
        boolean result = operation.equal(leftValue, rightPointer);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothBooleansEqual_shouldReturnTrue() {
        // Arrange
        Boolean left = Boolean.TRUE;
        Boolean right = Boolean.TRUE;

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothBooleansDifferent_shouldReturnFalse() {
        // Arrange
        Boolean left = Boolean.TRUE;
        Boolean right = Boolean.FALSE;

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftBooleanAndRightString_shouldConvertAndCompare() {
        // Arrange
        Boolean left = Boolean.TRUE;
        String right = "hello";

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftStringAndRightBoolean_shouldConvertAndCompare() {
        // Arrange
        String left = "";
        Boolean right = Boolean.FALSE;

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothNumbersEqual_shouldReturnTrue() {
        // Arrange
        Integer left = new Integer(100);
        Double right = new Double(100.0);

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothNumbersDifferent_shouldReturnFalse() {
        // Arrange
        Integer left = new Integer(100);
        Double right = new Double(200.0);

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftNumberAndRightString_shouldConvertAndCompare() {
        // Arrange
        Integer left = new Integer(42);
        String right = "42.0";

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftStringAndRightNumber_shouldConvertAndCompare() {
        // Arrange
        String left = "12.34";
        Double right = new Double(12.34);

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothStringsEqual_shouldReturnTrue() {
        // Arrange
        String left = "jxpath";
        String right = "jxpath";

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenBothStringsDifferent_shouldReturnFalse() {
        // Arrange
        String left = "foo";
        String right = "bar";

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftStringAndRightCustomObject_shouldConvertAndCompare() {
        // Arrange
        String left = "custom-1";
        CustomObject right = new CustomObject("custom-1");

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenLeftCustomObjectAndRightString_shouldConvertAndCompare() {
        // Arrange
        CustomObject left = new CustomObject("custom-2");
        String right = "custom-2";

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenCustomObjectsEqual_shouldReturnTrue() {
        // Arrange
        CustomObject left = new CustomObject("test");
        CustomObject right = new CustomObject("test");

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equal_givenCustomObjectsDifferent_shouldReturnFalse() {
        // Arrange
        CustomObject left = new CustomObject("test1");
        CustomObject right = new CustomObject("test2");

        // Act
        boolean result = operation.equal(left, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equal_givenLeftPointerWithNullValueAndRightCustomObject_shouldReturnFalse() {
        // Arrange
        Pointer leftPointer = new TestPointer(null, false);
        CustomObject right = new CustomObject("obj");

        // Act
        boolean result = operation.equal(leftPointer, right);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void contains_givenEmptyIterator_shouldReturnFalse() {
        // Arrange
        List list = new ArrayList();
        Iterator iterator = list.iterator();
        Object target = "target";

        // Act
        boolean result = operation.contains(iterator, target);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void contains_givenIteratorWithMatchingElement_shouldReturnTrue() {
        // Arrange
        List list = Arrays.asList(new Object[] { "apple", "banana", "cherry" });
        Iterator iterator = list.iterator();
        Object target = "banana";

        // Act
        boolean result = operation.contains(iterator, target);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void contains_givenIteratorWithoutMatchingElement_shouldReturnFalse() {
        // Arrange
        List list = Arrays.asList(new Object[] { "apple", "banana" });
        Iterator iterator = list.iterator();
        Object target = "grape";

        // Act
        boolean result = operation.contains(iterator, target);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenEmptyLeftIterator_shouldReturnFalse() {
        // Arrange
        Iterator leftIterator = Collections.EMPTY_LIST.iterator();
        Iterator rightIterator = Arrays.asList(new Object[] { "x" }).iterator();

        // Act
        boolean result = operation.findMatch(leftIterator, rightIterator);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenEmptyRightIterator_shouldReturnFalse() {
        // Arrange
        Iterator leftIterator = Arrays.asList(new Object[] { "x" }).iterator();
        Iterator rightIterator = Collections.EMPTY_LIST.iterator();

        // Act
        boolean result = operation.findMatch(leftIterator, rightIterator);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void findMatch_givenMatchingElements_shouldReturnTrue() {
        // Arrange
        Iterator leftIterator = Arrays.asList(new Object[] { new Integer(1), new Integer(2) }).iterator();
        Iterator rightIterator = Arrays.asList(new Object[] { new Integer(3), new Integer(2) }).iterator();

        // Act
        boolean result = operation.findMatch(leftIterator, rightIterator);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void findMatch_givenNoMatchingElements_shouldReturnFalse() {
        // Arrange
        Iterator leftIterator = Arrays.asList(new Object[] { "a", "b" }).iterator();
        Iterator rightIterator = Arrays.asList(new Object[] { "c", "d" }).iterator();

        // Act
        boolean result = operation.findMatch(leftIterator, rightIterator);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalWithContext_givenInitialContexts_shouldUnwrapPointers() {
        // Arrange
        Pointer leftPointer = new TestPointer("same");
        Pointer rightPointer = new TestPointer("same");
        TestInitialContext leftContext = new TestInitialContext(leftPointer);
        TestInitialContext rightContext = new TestInitialContext(rightPointer);

        dummyExpr1.setValue(leftContext);
        dummyExpr2.setValue(rightContext);

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenSelfContexts_shouldUnwrapPointers() {
        // Arrange
        Pointer leftPointer = new TestPointer("diff1");
        Pointer rightPointer = new TestPointer("diff2");
        TestSelfContext leftContext = new TestSelfContext(leftPointer);
        TestSelfContext rightContext = new TestSelfContext(rightPointer);

        dummyExpr1.setValue(leftContext);
        dummyExpr2.setValue(rightContext);

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalWithContext_givenLeftInitialAndRightSelfContext_shouldUnwrapBoth() {
        // Arrange
        Pointer leftPointer = new TestPointer(new Integer(50));
        Pointer rightPointer = new TestPointer("50.0");
        TestInitialContext leftContext = new TestInitialContext(leftPointer);
        TestSelfContext rightContext = new TestSelfContext(rightPointer);

        dummyExpr1.setValue(leftContext);
        dummyExpr2.setValue(rightContext);

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenBothCollectionsMatching_shouldReturnTrue() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { "one", "two" });
        Set rightSet = new HashSet(Arrays.asList(new Object[] { "two", "three" }));

        dummyExpr1.setValue(leftList);
        dummyExpr2.setValue(rightSet);

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenBothCollectionsNotMatching_shouldReturnFalse() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { "one", "two" });
        Set rightSet = new HashSet(Arrays.asList(new Object[] { "three", "four" }));

        dummyExpr1.setValue(leftList);
        dummyExpr2.setValue(rightSet);

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalWithContext_givenLeftIteratorAndRightScalarMatching_shouldReturnTrue() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { new Integer(10), new Integer(20) });
        dummyExpr1.setValue(leftList.iterator());
        dummyExpr2.setValue(new Integer(20));

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenLeftIteratorAndRightScalarNotMatching_shouldReturnFalse() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { new Integer(10), new Integer(20) });
        dummyExpr1.setValue(leftList.iterator());
        dummyExpr2.setValue(new Integer(30));

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalWithContext_givenLeftScalarAndRightIteratorMatching_shouldReturnTrue() {
        // Arrange
        List rightList = Arrays.asList(new Object[] { "cat", "dog" });
        dummyExpr1.setValue("cat");
        dummyExpr2.setValue(rightList.iterator());

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenLeftScalarAndRightIteratorNotMatching_shouldReturnFalse() {
        // Arrange
        List rightList = Arrays.asList(new Object[] { "cat", "dog" });
        dummyExpr1.setValue("bird");
        dummyExpr2.setValue(rightList.iterator());

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void equalWithContext_givenBothDirectIterators_shouldCallFindMatch() {
        // Arrange
        List leftList = Arrays.asList(new Object[] { "x", "y" });
        List rightList = Arrays.asList(new Object[] { "y", "z" });
        dummyExpr1.setValue(leftList.iterator());
        dummyExpr2.setValue(rightList.iterator());

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equalWithContext_givenBothScalars_shouldDirectlyCompare() {
        // Arrange
        dummyExpr1.setValue("constant");
        dummyExpr2.setValue("constant");

        // Act
        boolean result = operation.equal(null, dummyExpr1, dummyExpr2);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void computeValue_givenSubclassImplementation_shouldExecuteWithoutException() {
        // Arrange
        dummyExpr1.setValue("abc");
        dummyExpr2.setValue("abc");

        // Act
        Object result = operation.computeValue(null);

        // Assert
        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals("==", operation.getSymbol());
    }
}