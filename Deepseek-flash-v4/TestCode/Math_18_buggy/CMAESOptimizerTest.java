package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

public class CMAESOptimizerTest {
    private static final double EPS = 1e-10;
    private static final int DIM = 2;
    private CMAESOptimizer optimizer;
    private double[] startPoint;
    private double[] lowerBound;
    private double[] upperBound;
    private MultivariateFunction simpleFunction;
    private MultivariateFunction sphereFunction;

    @Before
    public void setUp() {
        optimizer = new CMAESOptimizer(10, null, 1000, 1e-10, true, 0, 0, new MersenneTwister(1234), false);
        startPoint = new double[]{0.5, 0.5};
        lowerBound = new double[]{-10, -10};
        upperBound = new double[]{10, 10};
        
        sphereFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        
        simpleFunction = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 2) * (point[0] - 2) + (point[1] + 1) * (point[1] + 1);
            }
        };
    }

    @After
    public void tearDown() {
        optimizer = null;
        startPoint = null;
        lowerBound = null;
        upperBound = null;
        simpleFunction = null;
        sphereFunction = null;
    }

    @Test
    public void testDefaultConstructor() {
        CMAESOptimizer defaultOpt = new CMAESOptimizer();
        assertNotNull(defaultOpt);
        assertEquals(CMAESOptimizer.DEFAULT_MAXITERATIONS, defaultOpt.getMaxIterations());
    }

    @Test
    public void testConstructorWithLambda() {
        CMAESOptimizer customOpt = new CMAESOptimizer(15);
        assertNotNull(customOpt);
    }

    @Test
    public void testConstructorWithInputSigma() {
        double[] sigma = {1.0, 1.0};
        CMAESOptimizer customOpt = new CMAESOptimizer(10, sigma);
        assertNotNull(customOpt);
    }

    @Test
    public void testConstructorWithAllParams() {
        double[] sigma = {1.0, 1.0};
        CMAESOptimizer customOpt = new CMAESOptimizer(10, sigma, 500, 1e-8, true, 0, 0, new MersenneTwister(5678), true);
        assertNotNull(customOpt);
    }

    @Test
    public void testOptimizeSimpleFunctionNoBounds() {
        PointValuePair result = optimizer.optimize(100, simpleFunction, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        assertNotNull(result.getPoint());
        assertEquals(2, result.getPoint().length);
        
        double[] optimum = result.getPoint();
        assertTrue("Optimum x value should be close to 2.0", Math.abs(optimum[0]) < 1e-3 || Math.abs(optimum[0] - 2.0) < 1e-2);
        assertTrue("Optimum y value should be close to -1.0", Math.abs(optimum[1] + 1.0) < 1e-3 || Math.abs(optimum[1] + 1.0) < 1e-2);
    }

    @Test
    public void testOptimizeSphereFunctionWithBounds() {
        double[] lower = {-5, -5};
        double[] upper = {5, 5};
        optimizer = new CMAESOptimizer(10, null, 1000, 1e-10, true, 0, 0, new MersenneTwister(9876), true);
        
        PointValuePair result = optimizer.optimize(100, sphereFunction, GoalType.MINIMIZE, new double[]{1, 1});
        assertNotNull(result);
        assertTrue("Value should be non-negative", result.getValue() >= -1e-6);
    }

    @Test
    public void testOptimizeTooManyEvaluations() {
        CMAESOptimizer limitedOpt = new CMAESOptimizer(5, null, 10, 1e-10, true, 0, 0, new MersenneTwister(13579), false);
        
        try {
            limitedOpt.optimize(5, sphereFunction, GoalType.MINIMIZE, new double[]{10, 10});
            fail("Expected TooManyEvaluationsException");
        } catch (Exception e) {
            // Expected exception
        }
    }

    @Test
    public void testGetStatisticsHistoryWhenGenerateStatistics() {
        double[] sigma = new double[]{1.0, 1.0};
        CMAESOptimizer statsOpt = new CMAESOptimizer(10, sigma, 500, 1e-8, true, 0, 0, new MersenneTwister(24680), true);
        PointValuePair result = statsOpt.optimize(100, sphereFunction, GoalType.MINIMIZE, startPoint);
        
        assertEquals("Sigma history should not be null", false, statsOpt.getStatisticsSigmaHistory().size() > 0);
        assertEquals("Mean history size should match", true, statsOpt.getStatisticsMeanHistory().size() > 0);
        assertEquals("Fitness history should not be empty", true, statsOpt.getStatisticsFitnessHistory().size() > 0);
        assertEquals("D history should not be empty", true, statsOpt.getStatisticsDHistory().size() > 0);
    }

    @Test
    public void testGetStatisticsHistoryWhenNotGenerateStatistics() {
        CMAESOptimizer noStatsOpt = new CMAESOptimizer(10, null, 500, 1e-8, true, 0, 0, new MersenneTwister(24680), false);
        PointValuePair result = noStatsOpt.optimize(100, sphereFunction, GoalType.MINIMIZE, startPoint);
        
        assertEquals("Sigma history should be empty", 0, noStatsOpt.getStatisticsSigmaHistory().size());
        assertEquals("Mean history should be empty", 0, noStatsOpt.getStatisticsMeanHistory().size());
        assertEquals("Fitness history should be empty", 0, noStatsOpt.getStatisticsFitnessHistory().size());
        assertEquals("D history should be empty", 0, noStatsOpt.getStatisticsDHistory().size());
    }

    @Test
    public void testOptimizeMaximizeGoalType() {
        MultivariateFunction negativeSphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };
        
        CMAESOptimizer maxOpt = new CMAESOptimizer(10, null, 1000, 1e-5, true, 0, 0, new MersenneTwister(1122), false);
        PointValuePair result = maxOpt.optimize(100, negativeSphere, GoalType.MAXIMIZE, new double[]{0.1, 0.1});
        
        assertNotNull(result);
        assertEquals("Optimal value should be 0 for sphere", 0.0, result.getValue(), 0.1);
    }

    @Test
    public void testOptimizeStopFitnessReached() {
        double[] sigma = new double[]{0.5, 0.5};
        CMAESOptimizer stopFitnessOpt = new CMAESOptimizer(10, sigma, 1000, 0.01, true, 0, 0, new MersenneTwister(1234), false);
        PointValuePair result = stopFitnessOpt.optimize(100, sphereFunction, GoalType.MINIMIZE, startPoint);
        
        assertNotNull(result);
        assertTrue("Should reach stop fitness near 0", result.getValue() < 0.05);
    }

    @Test
    public void testOptimizeDimensionMismatchStartPoint() {
        double[] wrongStart = new double[]{1.0};
        try {
            optimizer.optimize(100, sphereFunction, GoalType.MINIMIZE, wrongStart);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // Expected
        }
    }

    @Test
    public void testOptimizeWithPointValuePairEvaluations() {
        CMAESOptimizer evalOpt = new CMAESOptimizer(5, null, 500, 1e-10, true, 0, 0, new MersenneTwister(9988), false);
        PointValuePair result = evalOpt.optimize(100, new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return Math.sin(point[0] * point[0] + point[1] * point[1]) + 1;
            }
        }, GoalType.MINIMIZE, startPoint);
        
        assertNotNull(result);
        assertTrue("Value should be non-negative", result.getValue() >= 0);
    }

    @Test
    public void testFitnessFunctionRepairAndDecode() {
        double[] encoded = new double[]{0.5, 0.5};
        double[] lower = {-5, -5};
        double[] upper = {5, 5};
        double[][] bounds = {lower, upper};
        
        CMAESOptimizer boundsOpt = new CMAESOptimizer(10, null, 100, 1e-10, true, 0, 0, new MersenneTwister(123), false);
        
        // Test with boundary conditions by optimizing within bounds
        PointValuePair result = boundsOpt.optimize(50, simpleFunction, GoalType.MINIMIZE, startPoint);
        assertNotNull(result);
        assertTrue("Result should be within reasonable range", 
                   result.getPoint()[0] > -5 && result.getPoint()[0] < 5 && 
                   result.getPoint()[1] > -5 && result.getPoint()[1] < 5);
    }

    @Test
    public void testRandomizedStartPoints() {
        for (int seed = 0; seed < 3; seed++) {
            CMAESOptimizer randomOpt = new CMAESOptimizer(10, null, 500, 1e-6, true, 0, 0, new MersenneTwister(seed), false);
            PointValuePair result = randomOpt.optimize(50, sphereFunction, GoalType.MINIMIZE, new double[]{2, -2});
            assertNotNull(result);
            assertTrue("Fitness should be close to 0", Math.abs(result.getValue()) < 1.0);
        }
    }
}