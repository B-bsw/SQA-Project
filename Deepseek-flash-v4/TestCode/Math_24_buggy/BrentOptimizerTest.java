package org.apache.commons.math3.optimization.univariate;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;

public class BrentOptimizerTest {

    private static class TestChecker implements ConvergenceChecker<UnivariatePointValuePair> {
        private final int maxIterations;
        private int iterationCount;

        TestChecker(int maxIterations) {
            this.maxIterations = maxIterations;
            this.iterationCount = 0;
        }

        @Override
        public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
            iterationCount++;
            return iteration >= maxIterations;
        }
    }

    private static class TestFunction implements UnivariateFunction {
        private final boolean isMinim;
        private final double minX;
        private final double minValue;

        TestFunction(boolean isMinim, double minX, double minValue) {
            this.isMinim = isMinim;
            this.minX = minX;
            this.minValue = minValue;
        }

        @Override
        public double value(double x) {
            if (isMinim) {
                return (x - minX) * (x - minX) + minValue;
            } else {
                return -(x - minX) * (x - minX) - minValue;
            }
        }
    }

    private UnivariateFunction minimFunc;
    private UnivariateFunction maximFunc;
    private double lo;
    private double hi;
    private double start;

    @Before
    public void setUp() {
        minimFunc = new TestFunction(true, 2.5, -10.0);
        maximFunc = new TestFunction(false, 1.5, 5.0);
        lo = -10.0;
        hi = 10.0;
        start = 0.0;
    }

    @After
    public void tearDown() {
        minimFunc = null;
        maximFunc = null;
    }

    @Test
    public void testConstructorWithNullChecker() {
        new BrentOptimizer(1e-8, 1e-8, null);
        Assert.assertEquals(1e-8, 1e-8, 1e-15);
    }

    @Test
    public void testConstructorRelativeThresholdTooSmall() {
        try {
            new BrentOptimizer(0.5e-8, 1e-8);
            Assert.fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            Assert.assertEquals(0.5e-8, e.getArgument(), 1e-15);
        }
    }

    @Test
    public void testConstructorAbsoluteThresholdNonPositive() {
        try {
            new BrentOptimizer(1e-8, 0.0);
            Assert.fail("Expected NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException e) {
            Assert.assertEquals(0.0, e.getArgument(), 1e-15);
        }
    }

    @Test
    public void testOptimizeMinimizer() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.optimize(100, minimFunc, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.5, result.getPoint(), 1e-4);
        Assert.assertEquals(-10.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeMaximizer() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.optimize(100, maximFunc, GoalType.MAXIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.5, result.getPoint(), 1e-4);
        Assert.assertEquals(5.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeWithConvergenceChecker() {
        TestChecker checker = new TestChecker(10);
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8, checker);
        UnivariatePointValuePair result = optimizer.optimize(1000, minimFunc, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertTrue(checker.iterationCount > 0);
    }

    @Test
    public void testOptimizeLoEqualsHi() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        double lo = 0.0;
        double hi = 0.0;
        double start = 0.0;
        UnivariatePointValuePair result = optimizer.optimize(100, minimFunc, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint(), 0.0);
        Assert.assertEquals(6.25, result.getValue(), 1e-4); // (0-2.5)^2 - 10 = 6.25
    }

    @Test
    public void testOptimizeStartOutsideRange() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.optimize(100, minimFunc, GoalType.MINIMIZE, -5.0, 5.0, 10.0);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint() >= -5.0);
        Assert.assertTrue(result.getPoint() <= 5.0);
    }

    @Test
    public void testOptimizeWithReversedBounds() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.optimize(100, minimFunc, GoalType.MINIMIZE, hi, lo, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.5, result.getPoint(), 1e-4);
        Assert.assertEquals(-10.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeWithMaxIterations() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.optimize(50, minimFunc, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.5, result.getPoint(), 1e-3);
    }

    @Test
    public void testBestMethodWithNullA() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair b = new UnivariatePointValuePair(1.0, 2.0);
        UnivariatePointValuePair result = optimizer.best(null, b, true);
        Assert.assertSame(b, result);
    }

    @Test
    public void testBestMethodWithNullB() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 2.0);
        UnivariatePointValuePair result = optimizer.best(a, null, true);
        Assert.assertSame(a, result);
    }

    @Test
    public void testBestMethodBothNull() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair result = optimizer.best(null, null, true);
        Assert.assertNull(result);
    }

    @Test
    public void testBestMethodMinim() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 3.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 2.0);
        UnivariatePointValuePair result = optimizer.best(a, b, true);
        Assert.assertSame(b, result);
    }

    @Test
    public void testBestMethodMaxim() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        UnivariatePointValuePair a = new UnivariatePointValuePair(1.0, 3.0);
        UnivariatePointValuePair b = new UnivariatePointValuePair(2.0, 2.0);
        UnivariatePointValuePair result = optimizer.best(a, b, false);
        Assert.assertSame(a, result);
    }

    @Test
    public void testOptimizeOnQuadraticFunction() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-10);
        UnivariateFunction func = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 0.25) * (x - 0.25) + 1.75;
            }
        };
        double lo = -1.0;
        double hi = 1.0;
        double start = 0.0;
        UnivariatePointValuePair result = optimizer.optimize(1000, func, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.25, result.getPoint(), 1e-4);
        Assert.assertEquals(1.75, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeWithTightTolerance() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-12, 1e-12);
        UnivariatePointValuePair result = optimizer.optimize(1000, minimFunc, GoalType.MINIMIZE, lo, hi, start);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.5, result.getPoint(), 1e-6);
        Assert.assertEquals(-10.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimizeWithLargeRange() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-8);
        double loLarge = -1000.0;
        double hiLarge = 1000.0;
        double startLarge = 500.0;
        UnivariatePointValuePair result = optimizer.optimize(100, minimFunc, GoalType.MINIMIZE, loLarge, hiLarge, startLarge);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.5, result.getPoint(), 1e-3);
        Assert.assertEquals(-10.0, result.getValue(), 1e-3);
    }
}