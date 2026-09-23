package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;

public class CMAESOptimizerTest {
    private CMAESOptimizer optimizer;
    private MultivariateFunction sphereFunction;
    private MultivariateFunction rastriginFunction;
    private MultivariateFunction boundedFunction;
    private static final double EPSILON = 1e-8;

    @Before
    public void setUp() {
        optimizer = new CMAESOptimizer(10, null, 1000, 0, true, 0, 0, null, false);
        sphereFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };
        rastriginFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 10 * point.length;
                for (double v : point) {
                    sum += v * v - 10 * Math.cos(2 * Math.PI * v);
                }
                return sum;
            }
        };
        boundedFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                for (double v : point) {
                    if (v < 0 || v > 1) {
                        return Double.MAX_VALUE;
                    }
                }
                return sphereFunction.value(point);
            }
        };
    }

    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testDefaultConstructor() {
        CMAESOptimizer defaultOpt = new CMAESOptimizer();
        Assert.assertNotNull(defaultOpt);
        Assert.assertEquals(0, defaultOpt.getStatisticsSigmaHistory().size());
    }

    @Test
    public void testOptimizeSphereUnboundedMinimize() {
        double[] startPoint = {1.0, 2.0, 3.0};
        PointValuePair result = optimizer.optimize(1000, sphereFunction, GoalType.MINIMIZE, startPoint);
        double[] point = result.getPoint();
        Assert.assertNotNull(point);
        Assert.assertEquals(3, point.length);
        Assert.assertTrue(result.getValue() >= 0);
    }

    @Test
    public void testOptimizeSphereUnboundedMaximize() {
        double[] startPoint = {-1.0, -2.0};
        PointValuePair result = optimizer.optimize(1000, sphereFunction, GoalType.MAXIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
    }

    @Test
    public void testOptimizeRastriginUnbounded() {
        double[] startPoint = {0.5, 0.5};
        PointValuePair result = optimizer.optimize(2000, rastriginFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
    }

    @Test
    public void testOptimizeWithBounds() {
        double[] lowerBound = {0, 0};
        double[] upperBound = {1, 1};
        double[] startPoint = {0.5, 0.5};
        CMAESOptimizer boundOpt = new CMAESOptimizer(10, null, 1000, 0, true, 0, 0, null, false);
        PointValuePair result = boundOpt.optimize(1000, boundedFunction, GoalType.MINIMIZE, startPoint, lowerBound, upperBound);
        double[] point = result.getPoint();
        Assert.assertNotNull(point);
        for (double v : point) {
            Assert.assertTrue(v >= 0 && v <= 1);
        }
    }

    @Test
    public void testOptimizeWithInputSigma() {
        double[] inputSigma = {0.5, 0.5};
        CMAESOptimizer sigmaOpt = new CMAESOptimizer(10, inputSigma, 1000, 0, true, 0, 0, null, false);
        double[] startPoint = {1.0, 1.0};
        PointValuePair result = sigmaOpt.optimize(1000, sphereFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
    }

    @Test
    public void testOptimizeInputSigmaDimensionMismatch() {
        double[] inputSigma = {0.5};
        double[] startPoint = {1.0, 2.0};
        try {
            new CMAESOptimizer(10, inputSigma, 1000, 0, true, 0, 0, null, false).optimize(1000, sphereFunction, GoalType.MINIMIZE, startPoint);
            Assert.fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeInvalidLambda() {
        try {
            new CMAESOptimizer(-1, null, 1000, 0, true, 0, 0, null, false);
            Assert.fail("Expected NotPositiveException");
        } catch (NotPositiveException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeStopFitnessReached() {
        MultivariateFunction zeroFunc = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return 0;
            }
        };
        double[] startPoint = {5.0, 5.0};
        PointValuePair result = optimizer.optimize(1000, zeroFunc, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
        Assert.assertTrue(result.getValue() <= 0.0);
    }

    @Test
    public void testStatisticsHistoryWithGenerateStatistics() {
        CMAESOptimizer statOpt = new CMAESOptimizer(10, null, 10, 0, true, 0, 0, null, true);
        double[] startPoint = {1.0, 2.0};
        statOpt.optimize(10, sphereFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertTrue(statOpt.getStatisticsSigmaHistory().size() > 0);
        Assert.assertTrue(statOpt.getStatisticsFitnessHistory().size() > 0);
        Assert.assertTrue(statOpt.getStatisticsDHistory().size() >= 0);
    }

    @Test
    public void testRepairAndDecodeWithBounds() {
        final double[] lower = {-1, -1};
        final double[] upper = {1, 1};
        CMAESOptimizer testOpt = new CMAESOptimizer(5, null, 10, 0, true, 0, 0, null, false) {
            @Override
            protected double[][] getBounds() {
                double[][] bounds = new double[2][dimension];
                bounds[0] = lower;
                bounds[1] = upper;
                return bounds;
            }
        };
        FitnessFunction ff = testOpt.new FitnessFunction();
        double[] point = new double[]{-2.0, 2.0};
        double[] repaired = ff.repairAndDecode(point);
        Assert.assertFalse(repaired[0] < 0);
        Assert.assertFalse(repaired[1] > 1);
    }

    @Test
    public void testFitnessFunctionEncodeNoBounds() {
        CMAESOptimizer testOpt = new CMAESOptimizer(5, null, 10, 0, true, 0, 0, null, false);
        FitnessFunction ff = testOpt.new FitnessFunction();
        double[] x = {1.0, 2.0};
        double[] encoded = ff.encode(x);
        Assert.assertArrayEquals(x, encoded, EPSILON);
    }

    @Test
    public void testFitnessFunctionValueMaximize() {
        CMAESOptimizer testOpt = new CMAESOptimizer(5, null, 10, 0, true, 0, 0, null, false);
        testOpt.isMinimize = false;
        FitnessFunction ff = testOpt.new FitnessFunction();
        double[] point = {1.0, 2.0};
        double value = ff.value(point);
        Assert.assertEquals(-sphereFunction.value(point), value, EPSILON);
    }

    @Test
    public void testFitnessFunctionValueMinimize() {
        CMAESOptimizer testOpt = new CMAESOptimizer(5, null, 10, 0, true, 0, 0, null, false);
        testOpt.isMinimize = true;
        FitnessFunction ff = testOpt.new FitnessFunction();
        double[] point = {1.0, 2.0};
        double value = ff.value(point);
        Assert.assertEquals(sphereFunction.value(point), value, EPSILON);
    }

    @Test
    public void testOptimizeWithOneDimension() {
        double[] startPoint = {1.0};
        PointValuePair result = optimizer.optimize(100, new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 3) * (point[0] - 3);
            }
        }, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
        Assert.assertEquals(1, result.getPoint().length);
        Assert.assertTrue(Math.abs(result.getPoint()[0] - 3) < 1e-5);
    }

    @Test
    public void testOptimizeWithZeroIterations() {
        double[] startPoint = {1.0, 2.0};
        PointValuePair result = optimizer.optimize(0, sphereFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result.getPoint());
        Assert.assertArrayEquals(startPoint, result.getPoint(), EPSILON);
    }

    @Test
    public void testSplitIndices() throws Exception {
        java.lang.reflect.Method method = CMAESOptimizer.class.getDeclaredMethod("splitIndices", int[].class, int.class);
        method.setAccessible(true);
        double[] idx = (double[]) method.invoke(optimizer, new int[]{1,2,3,4,5}, 2);
        Assert.assertNotNull(idx);
        Assert.assertEquals(6, idx.length);
    }

    @Test
    public void testLog() {
        double result = CMAESOptimizer.log(Math.exp(2.0));
        Assert.assertEquals(2.0, result, EPSILON);
    }

    @Test
    public void testSqrtPositive() {
        RealMatrix result = CMAESOptimizer.sqrt(new Array2DRowRealMatrix(new double[][]{{4.0, 9.0}}));
        Assert.assertEquals(2.0, result.getEntry(0, 0), EPSILON);
        Assert.assertEquals(3.0, result.getEntry(0, 1), EPSILON);
    }

    @Test
    public void testSqrtZeros() {
        RealMatrix result = CMAESOptimizer.sqrt(new Array2DRowRealMatrix(2, 2));
        Assert.assertEquals(0.0, result.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testOptimizeHugeIntegerPoints() {
        double[] startPoint = {1e15, 2e15};
        PointValuePair result = optimizer.optimize(100, sphereFunction, GoalType.MINIMIZE, startPoint);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getPoint().length);
    }
}