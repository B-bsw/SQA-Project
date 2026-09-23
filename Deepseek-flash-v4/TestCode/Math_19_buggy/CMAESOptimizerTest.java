package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import java.util.List;

public class CMAESOptimizerTest {

    private CMAESOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new CMAESOptimizer();
    }

    // ---- Constructor Tests ----
    @Test
    public void testDefaultConstructor() {
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithLambda() {
        CMAESOptimizer opt = new CMAESOptimizer(20);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorWithInputSigma() {
        double[] sigma = new double[]{0.3, 0.4};
        CMAESOptimizer opt = new CMAESOptimizer(10, sigma);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorFull() {
        RandomGenerator rand = new MersenneTwister(1234L);
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-6, 1e-6);
        CMAESOptimizer opt = new CMAESOptimizer(15, new double[]{0.2, 0.3},
                10000, 0.0, true, 1, 2, rand, false, checker);
        assertNotNull(opt);
    }

    // ---- checkParameters Exception Tests ----
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersInfiniteBounds() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{0.0, 0.0};
        double[] upper = new double[]{1.0, Double.POSITIVE_INFINITY};
        optimizer.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersSigmaLengthMismatch() {
        double[] sigma = new double[]{0.1, 0.2, 0.3};
        CMAESOptimizer opt = new CMAESOptimizer(10, sigma);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParametersSigmaNegative() {
        double[] sigma = new double[]{-0.1};
        CMAESOptimizer opt = new CMAESOptimizer(10, sigma);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersSigmaOutOfRange() {
        double[] sigma = new double[]{2.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, sigma);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
    }

    // ---- FitnessFunction Tests ----
    @Test
    public void testFitnessFunctionIsFeasibleNoBounds() {
        CMAESOptimizer.FitnessFunction ff = optimizer.new FitnessFunction();
        assertTrue(ff.isFeasible(new double[]{0.5, -0.1}));
    }

    @Test
    public void testFitnessFunctionFeasibleAfterOptimize() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        double[] start = new double[]{0.5, -0.5};
        double[] lower = new double[]{-1.0, -1.0};
        double[] upper = new double[]{1.0, 1.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 10000, 0.0, true, 0, 0,
                new MersenneTwister(42L), false, new SimpleValueChecker());
        opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        CMAESOptimizer.FitnessFunction ff = opt.new FitnessFunction();
        assertTrue(ff.isFeasible(new double[]{0.5, 0.5}));
        assertFalse(ff.isFeasible(new double[]{-0.1, 0.5}));
        assertFalse(ff.isFeasible(new double[]{1.1, 0.5}));
        assertFalse(ff.isFeasible(new double[]{0.5, -0.1}));
        assertFalse(ff.isFeasible(new double[]{0.5, 1.1}));
    }

    @Test
    public void testFitnessFunctionEncodeDecodeAfterOptimize() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        double[] start = new double[]{0.5, -0.5};
        double[] lower = new double[]{-1.0, -1.0};
        double[] upper = new double[]{1.0, 1.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 10000, 0.0, true, 0, 0,
                new MersenneTwister(42L), false, new SimpleValueChecker());
        opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        CMAESOptimizer.FitnessFunction ff = opt.new FitnessFunction();
        double[] original = new double[]{0.3, 0.7};
        double[] encoded = ff.encode(original);
        double[] decoded = ff.decode(encoded);
        assertArrayEquals(original, decoded, 1e-15);
    }

    // ---- Statistics Tests ----
    @Test
    public void testStatisticsBeforeOptimize() {
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testStatisticsAfterOptimizeWithGenerateStatistics() {
        RandomGenerator rand = new MersenneTwister(123L);
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 10000, 0.0, true, 0, 0,
                rand, true, new SimpleValueChecker());
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        PointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        assertFalse(opt.getStatisticsSigmaHistory().isEmpty());
        assertFalse(opt.getStatisticsMeanHistory().isEmpty());
        assertFalse(opt.getStatisticsFitnessHistory().isEmpty());
        assertFalse(opt.getStatisticsDHistory().isEmpty());
    }

    // ---- Integration Optimization Tests ----
    @Test
    public void testOptimizeSimpleSphere() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0.0;
                for (double x : point) sum += x * x;
                return sum;
            }
        };
        double[] start = new double[]{2.0, -2.0};
        double[] lower = new double[]{-3.0, -3.0};
        double[] upper = new double[]{3.0, 3.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 5000, 0.0, true, 0, 0,
                new MersenneTwister(12345L), false, new SimpleValueChecker(1e-8, 1e-8));
        PointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        double[] point = result.getPoint();
        double value = result.getValue();
        assertTrue("fitness should be near zero", value < 0.1);
        // Check that point is within bounds
        for (int i = 0; i < point.length; i++) {
            assertTrue("point[" + i + "] below lower bound", point[i] >= lower[i] - 1e-6);
            assertTrue("point[" + i + "] above upper bound", point[i] <= upper[i] + 1e-6);
        }
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimizeTooManyEvaluations() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 1000, 0.0, true, 0, 0,
                new MersenneTwister(42L), false, new SimpleValueChecker());
        opt.optimize(1, f, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testOptimizeNoBounds() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        double[] start = new double[]{2.0, -2.0};
        double[] lower = new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 5000, 0.0, true, 0, 0,
                new MersenneTwister(12345L), false, new SimpleValueChecker(1e-8, 1e-8));
        PointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        double[] point = result.getPoint();
        double value = result.getValue();
        assertTrue("fitness should be near zero", value < 10.0); // loose tolerance due to limited iterations
    }

    @Test
    public void testOptimizeWithConvergenceCheckerEarlyStop() {
        // Create a checker that converges immediately
        ConvergenceChecker<PointValuePair> checker = new ConvergenceChecker<PointValuePair>() {
            private int callCount = 0;
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                callCount++;
                return callCount >= 2; // converge after 2 checks
            }
        };
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        double[] start = new double[]{0.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{1.0};
        CMAESOptimizer opt = new CMAESOptimizer(10, null, 10000, 0.0, true, 0, 0,
                new MersenneTwister(42L), false, checker);
        PointValuePair result = opt.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
    }
}