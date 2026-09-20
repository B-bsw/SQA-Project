package org.apache.commons.jxpath.ri.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.Assert;
import org.junit.Test;

public class CoreOperationRelationalExpressionTest {

    private static class MockExpression extends Expression {
        private Object value;

        public MockExpression(Object value) {
            this.value = value;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public Object compute(EvalContext context) {
            return value;
        }

        public boolean isContextDependent() {
            return false;
        }
    }

    private static class TestRelationalExpression extends CoreOperationRelationalExpression {
        private int lastCompare = -999;
        private int compareMode = 0; // 0: LessThan (<), 1: LessThanOrEqual (<=), 2: GreaterThan (>)

        public TestRelationalExpression(Expression[] args) {
            super(args);
        }

        public TestRelationalExpression(Expression[] args, int compareMode) {
            super(args);
            this.compareMode = compareMode;
        }

        protected boolean evaluateCompare(int compare) {
            this.lastCompare = compare;
            if (compareMode == 0) {
                return compare < 0;
            } else if (compareMode == 1) {
                return compare <= 0;
            } else if (compareMode == 2) {
                return compare > 0;
            }
            return false;
        }

        public int getLastCompare() {
            return lastCompare;
        }
    }

    private static class TestInitialContext extends InitialContext {
        private boolean resetCalled = false;

        public TestInitialContext() {
            super(null);
        }

        public void reset() {
            resetCalled = true;
        }

        public boolean isResetCalled() {
            return resetCalled;
        }
    }

    private static class TestSelfContext extends SelfContext {
        public TestSelfContext() {
            super(null, null);
        }

        public Pointer getSingleNodePointer() {
            return null;
        }
    }

    @Test
    public void getPrecedence_shouldReturnThree() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);

        Assert.assertEquals(3, expr.getPrecedence());
    }

    @Test
    public void isSymmetric_shouldReturnFalse() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args);

        Assert.assertFalse(expr.isSymmetric());
    }

    @Test
    public void computeValue_givenLessThan_shouldReturnBooleanTrue() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(1.0)),
            new MockExpression(new Double(2.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals(-1, expr.getLastCompare());
    }

    @Test
    public void computeValue_givenGreaterThan_shouldReturnBooleanFalse() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(5.0)),
            new MockExpression(new Double(2.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
        Assert.assertEquals(1, expr.getLastCompare());
    }

    @Test
    public void compute_givenEqualNumbers_shouldPassZeroToEvaluateCompare() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(4.0)),
            new MockExpression(new Double(4.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 1);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals(0, expr.getLastCompare());
    }

    @Test
    public void compute_givenLeftLessThanRight_shouldPassNegativeOneToEvaluateCompare() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(-10.0)),
            new MockExpression(new Double(10.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals(-1, expr.getLastCompare());
    }

    @Test
    public void compute_givenLeftGreaterThanRight_shouldPassPositiveOneToEvaluateCompare() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(20.0)),
            new MockExpression(new Double(10.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 2);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
        Assert.assertEquals(1, expr.getLastCompare());
    }

    @Test
    public void compute_givenLeftIsNaN_shouldReturnFalse() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(Double.NaN)),
            new MockExpression(new Double(10.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenRightIsNaN_shouldReturnFalse() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(10.0)),
            new MockExpression(new Double(Double.NaN))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenBothAreNaN_shouldReturnFalse() {
        Expression[] args = new Expression[] {
            new MockExpression(new Double(Double.NaN)),
            new MockExpression(new Double(Double.NaN))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftInitialContext_shouldResetContext() {
        TestInitialContext leftContext = new TestInitialContext();
        Expression[] args = new Expression[] {
            new MockExpression(leftContext),
            new MockExpression(new Double(5.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertTrue(leftContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenRightInitialContext_shouldResetContext() {
        TestInitialContext rightContext = new TestInitialContext();
        Expression[] args = new Expression[] {
            new MockExpression(new Double(5.0)),
            new MockExpression(rightContext)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertTrue(rightContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenBothInitialContexts_shouldResetBothContexts() {
        TestInitialContext leftContext = new TestInitialContext();
        TestInitialContext rightContext = new TestInitialContext();
        Expression[] args = new Expression[] {
            new MockExpression(leftContext),
            new MockExpression(rightContext)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertTrue(leftContext.isResetCalled());
        Assert.assertTrue(rightContext.isResetCalled());
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftSelfContext_shouldExtractSingleNodePointer() {
        TestSelfContext selfContext = new TestSelfContext();
        Expression[] args = new Expression[] {
            new MockExpression(selfContext),
            new MockExpression(new Double(10.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenRightSelfContext_shouldExtractSingleNodePointer() {
        TestSelfContext selfContext = new TestSelfContext();
        Expression[] args = new Expression[] {
            new MockExpression(new Double(10.0)),
            new MockExpression(selfContext)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftCollection_whenMatchFound_shouldReturnTrue() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(2.0));

        Expression[] args = new Expression[] {
            new MockExpression(leftList),
            new MockExpression(new Double(5.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void compute_givenLeftCollection_whenNoMatch_shouldReturnFalse() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(20.0));

        Expression[] args = new Expression[] {
            new MockExpression(leftList),
            new MockExpression(new Double(5.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenRightCollection_whenMatchFound_shouldReturnTrue() {
        List rightList = new ArrayList();
        rightList.add(new Double(2.0));
        rightList.add(new Double(10.0));

        Expression[] args = new Expression[] {
            new MockExpression(new Double(5.0)),
            new MockExpression(rightList)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void compute_givenRightCollection_whenNoMatch_shouldReturnFalse() {
        List rightList = new ArrayList();
        rightList.add(new Double(20.0));
        rightList.add(new Double(30.0));

        Expression[] args = new Expression[] {
            new MockExpression(new Double(5.0)),
            new MockExpression(rightList)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenBothCollections_whenMatchFound_shouldReturnTrue() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        leftList.add(new Double(20.0));

        List rightList = new ArrayList();
        rightList.add(new Double(5.0));
        rightList.add(new Double(15.0));

        Expression[] args = new Expression[] {
            new MockExpression(leftList),
            new MockExpression(rightList)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void compute_givenBothCollections_whenNoMatchFound_shouldReturnFalse() {
        List leftList = new ArrayList();
        leftList.add(new Double(20.0));
        leftList.add(new Double(30.0));

        List rightList = new ArrayList();
        rightList.add(new Double(5.0));
        rightList.add(new Double(10.0));

        Expression[] args = new Expression[] {
            new MockExpression(leftList),
            new MockExpression(rightList)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftEmptyIterator_shouldReturnFalse() {
        Iterator emptyIt = Collections.EMPTY_LIST.iterator();
        Expression[] args = new Expression[] {
            new MockExpression(emptyIt),
            new MockExpression(new Double(5.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenRightEmptyIterator_shouldReturnFalse() {
        Iterator emptyIt = Collections.EMPTY_LIST.iterator();
        Expression[] args = new Expression[] {
            new MockExpression(new Double(5.0)),
            new MockExpression(emptyIt)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenBothEmptyIterators_shouldReturnFalse() {
        Iterator leftIt = Collections.EMPTY_LIST.iterator();
        Iterator rightIt = Collections.EMPTY_LIST.iterator();
        Expression[] args = new Expression[] {
            new MockExpression(leftIt),
            new MockExpression(rightIt)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftEmptyIteratorRightNonEmptyIterator_shouldReturnFalse() {
        Iterator leftIt = Collections.EMPTY_LIST.iterator();
        List rightList = new ArrayList();
        rightList.add(new Double(10.0));
        Iterator rightIt = rightList.iterator();

        Expression[] args = new Expression[] {
            new MockExpression(leftIt),
            new MockExpression(rightIt)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenLeftNonEmptyIteratorRightEmptyIterator_shouldReturnFalse() {
        List leftList = new ArrayList();
        leftList.add(new Double(10.0));
        Iterator leftIt = leftList.iterator();
        Iterator rightIt = Collections.EMPTY_LIST.iterator();

        Expression[] args = new Expression[] {
            new MockExpression(leftIt),
            new MockExpression(rightIt)
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void compute_givenNestedCollections_shouldRecursivelyCompute() {
        List innerList = new ArrayList();
        innerList.add(new Double(2.0));
        List outerList = new ArrayList();
        outerList.add(innerList);

        Expression[] args = new Expression[] {
            new MockExpression(outerList),
            new MockExpression(new Double(5.0))
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void compute_givenNumericStrings_shouldParseAndCompare() {
        Expression[] args = new Expression[] {
            new MockExpression("10.5"),
            new MockExpression("20.5")
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void compute_givenInvalidNumericString_shouldReturnFalse() {
        Expression[] args = new Expression[] {
            new MockExpression("not-a-number"),
            new MockExpression("10.0")
        };
        TestRelationalExpression expr = new TestRelationalExpression(args, 0);

        Object result = expr.computeValue(null);

        Assert.assertEquals(Boolean.FALSE, result);
    }
}