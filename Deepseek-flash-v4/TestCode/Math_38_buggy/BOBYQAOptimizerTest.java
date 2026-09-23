package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

public class BOBYQAOptimizerTest {

    private static final double EPSILON = 1e-10;
    private static final double LOWER_BOUND = -10.0;
    private static final double UPPER_BOUND = 10.0;
    private static final double INITIAL_RADIUS = 5.0;
    private static final double STOPPING_RADIUS = 1e-8;

    private BOBYQAOptimizer optimizer;
    private MultivariateFunction quadraticFunction;
    private MultivariateFunction rosenbrockFunction;
    private MultivariateFunction constantFunction;

    @Before
    public void setUp() {
        optimizer = new BOBYQAOptimizer(5);
        quadraticFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };
        rosenbrockFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                return (1 - x) * (1 - x) + 100 * (y - x * x) * (y - x * x);
            }
        };
        constantFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return 42.0;
            }
        };
    }

    @After
    public void tearDown() {
        optimizer = null;
        quadraticFunction = null;
        rosenbrockFunction = null;
        constantFunction = null;
    }

    @Test
    public void testConstructorValidInputs() {
        BOBYQAOptimizer opt = new BOBYQAOptimizer(10);
        Assert.assertNotNull(opt);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorInterpolationPointsTooSmall() {
        new BOBYQAOptimizer(0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testConstructorInterpolationPointsTooLarge() {
        new BOBYQAOptimizer(101);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimizeInvalidDimension() {
        double[] startPoint = new double[] { 1.0 };
        optimizer.optimize(1, quadraticFunction, GoalType.MINIMIZE, startPoint);
    }

    @Test
    public void testOptimizeQuadraticMinimize() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getPoint());
        Assert.assertEquals(2, result.getPoint().length);
        double[] expected = new double[] { 0.0, 0.0 };
        for (int i = 0; i < result.getPoint().length; i++) {
            Assert.assertEquals(expected[i], result.getPoint()[i], 0.1);
        }
        Assert.assertTrue(result.getValue() <= 1e-6);
    }

    @Test
    public void testOptimizeQuadraticMaximize() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MAXIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getPoint());
        Assert.assertEquals(2, result.getPoint().length);
        double[] expected = new double[] { 0.0, 0.0 };
        for (int i = 0; i < result.getPoint().length; i++) {
            Assert.assertEquals(expected[i], result.getPoint()[i], 0.1);
        }
        Assert.assertTrue(result.getValue() >= -1e-6);
    }

    @Test
    public void testOptimizeRosenbrockMinimize() {
        double[] startPoint = new double[] { -1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, rosenbrockFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getPoint());
        Assert.assertEquals(2, result.getPoint().length);
        Assert.assertEquals(1.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(1.0, result.getPoint()[1], 0.1);
        Assert.assertTrue(result.getValue() < 1e-4);
    }

    @Test
    public void testOptimizeWithBounds() {
        double[] startPoint = new double[] { 0.5, 0.5 };
        double[] lower = new double[] { -0.5, -0.5 };
        double[] upper = new double[] { 0.5, 0.5 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
        Assert.assertNotNull(result);
        for (int i = 0; i < result.getPoint().length; i++) {
            Assert.assertTrue(result.getPoint()[i] >= lower[i] - 1e-3);
            Assert.assertTrue(result.getPoint()[i] <= upper[i] + 1e-3);
        }
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimizeStartPointOutOfLowerBound() {
        double[] startPoint = new double[] { -20.0, -20.0 };
        double[] lower = new double[] { -10.0, -10.0 };
        double[] upper = new double[] { 10.0, 10.0 };
        optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimizeStartPointOutOfUpperBound() {
        double[] startPoint = new double[] { 20.0, 20.0 };
        double[] lower = new double[] { -10.0, -10.0 };
        double[] upper = new double[] { 10.0, 10.0 };
        optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimizeLowerBoundGreaterThanUpper() {
        double[] startPoint = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { 10.0, 10.0 };
        double[] upper = new double[] { -10.0, -10.0 };
        optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
    }

    @Test
    public void testOptimizeConstantFunction() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, constantFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(42.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimizeZeroDimensionResult() {
        MultivariateFunction zeroDimFunc = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point.length == 0 ? 0.0 : point[0] * point[0];
            }
        };
        double[] emptyPoint = new double[] {};
        RealPointValuePair result = optimizer.optimize(0, zeroDimFunc, GoalType.MINIMIZE, emptyPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimizeSmallDimension() {
        MultivariateFunction linearFunc = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0];
            }
        };
        double[] startPoint = new double[] { 1.0 };
        double[] lower = new double[] { -5.0 };
        double[] upper = new double[] { 5.0 };
        RealPointValuePair result = optimizer.optimize(1, linearFunc, GoalType.MINIMIZE, lower, upper, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(-5.0, result.getPoint()[0], 1e-3);
    }

    @Test
    public void testOptimizeNoBounds() {
        double[] startPoint = new double[] { 3.0, -2.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, startPoint, 1e-6, 100);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getPoint().length);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
    }

    @Test
    public void testOptimizeWithUnequalBounds() {
        double[] startPoint = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { -10.0, -5.0 };
        double[] upper = new double[] { 5.0, 10.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
        Assert.assertNotNull(result);
        for (int i = 0; i < result.getPoint().length; i++) {
            Assert.assertTrue(result.getPoint()[i] >= lower[i] - 1e-3);
            Assert.assertTrue(result.getPoint()[i] <= upper[i] + 1e-3);
        }
    }

    @Test
    public void testOptimizeHighPrecisionStopping() {
        double[] startPoint = new double[] { 0.1, 0.1 };
        double tolerance = 1e-12;
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, startPoint, tolerance, 1000);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint()[0] < 1e-3);
        Assert.assertTrue(result.getPoint()[1] < 1e-3);
        Assert.assertTrue(result.getValue() < 1e-6);
    }

    @Test
    public void testOptimizeWithNegativeStartValues() {
        double[] startPoint = new double[] { -3.0, -3.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
        Assert.assertTrue(result.getValue() <= 1e-6);
    }

    @Test
    public void testOptimizeAtBoundary() {
        double[] startPoint = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 1e-3);
        Assert.assertEquals(0.0, result.getPoint()[1], 1e-3);
        Assert.assertTrue(result.getValue() <= 1e-6);
    }

    @Test
    public void testOptimizeWithLargeBounds() {
        double[] startPoint = new double[] { 1000.0, 1000.0 };
        double[] lower = new double[] { -10000.0, -10000.0 };
        double[] upper = new double[] { 10000.0, 10000.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, lower, upper, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
    }

    @Test
    public void testOptimizeWithToleranceZero() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        RealPointValuePair result = optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, startPoint, 0.0, 100);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getPoint());
        Assert.assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOptimizeNullFunction() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        optimizer.optimize(2, null, GoalType.MINIMIZE, startPoint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOptimizeNullGoalType() {
        double[] startPoint = new double[] { 1.0, 1.0 };
        optimizer.optimize(2, quadraticFunction, null, startPoint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOptimizeNullStartPoint() {
        optimizer.optimize(2, quadraticFunction, GoalType.MINIMIZE, (double[]) null);
    }
}