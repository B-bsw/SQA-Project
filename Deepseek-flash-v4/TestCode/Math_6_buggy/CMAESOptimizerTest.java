package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.FastMath;

public class CMAESOptimizerTest {
    private static final double EPS = 1e-10;
    private static final int DIM = 3;
    private static final int MAX_ITER = 100;
    private static final double STOP_FITNESS = 0.0;
    private static final int DIAGONAL_ONLY = 0;
    private static final int CHECK_FEASABLE_COUNT = 0;
    private static final boolean GENERATE_STATISTICS = true;
    private static final boolean IS_ACTIVE = true;
    private RandomGenerator random;
    private CMAESOptimizer optimizer;
    private CMAESOptimizer.Sigma sigma;
    private CMAESOptimizer.PopulationSize populationSize;

    @Before
    public void setUp() {
        random = new JDKRandomGenerator();
        random.setSeed(42L);
        optimizer = new CMAESOptimizer(MAX_ITER, STOP_FITNESS, IS_ACTIVE, DIAGONAL_ONLY, 
                                       CHECK_FEASABLE_COUNT, random, GENERATE_STATISTICS, 
                                       new SimpleConvergenceChecker());
        sigma = new CMAESOptimizer.Sigma(new double[] {0.5, 0.5, 0.5});
        populationSize = new CMAESOptimizer.PopulationSize(10);
    }

    @Test
    public void testOptimizeBasic() {
        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0] + point[1]*point[1] + point[2]*point[2]);
        org.apache.commons.math3.optim.InitialGuess initialGuess = 
            new org.apache.commons.math3.optim.InitialGuess(new double[] {1.0, 1.0, 1.0});
        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction.ValueRange valueRange = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction.ValueRange(0, 10);

        PointValuePair result = optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER), 
            org.apache.commons.math3.optim.nonlinear.scalar.GoalType.MINIMIZE,
            objFunc, initialGuess, sigma, populationSize, valueRange);
        
        assertNotNull(result);
        assertEquals(0.0, result.getKey()[0], 0.1);
        assertEquals(0.0, result.getKey()[1], 0.1);
        assertEquals(0.0, result.getKey()[2], 0.1);
    }

    @Test
    public void testSigmaConstructorPositive() {
        double[] sig = {1.0, 2.0, 3.0};
        CMAESOptimizer.Sigma s = new CMAESOptimizer.Sigma(sig);
        assertArrayEquals(sig, s.getSigma(), 0.0);
        assertNotSame(sig, s.getSigma());
        assertNotSame(sig, s.getSigma());
    }

    @Test(expected = NotPositiveException.class)
    public void testSigmaConstructorNegativeValue() {
        new CMAESOptimizer.Sigma(new double[] {1.0, -1.0, 2.0});
    }

    @Test(expected = NotPositiveException.class)
    public void testSigmaConstructorZeroValue() {
        new CMAESOptimizer.Sigma(new double[] {0.5, 0.0});
    }

    @Test
    public void testSigmaGetSigmaReturnsCopy() {
        double[] sig = {1.0, 2.0, 3.0};
        CMAESOptimizer.Sigma s = new CMAESOptimizer.Sigma(sig);
        double[] copy = s.getSigma();
        copy[0] = 99.0;
        assertNotEquals(99.0, s.getSigma()[0], EPS);
    }

    @Test
    public void testPopulationSizeValid() {
        CMAESOptimizer.PopulationSize ps = new CMAESOptimizer.PopulationSize(5);
        assertEquals(5, ps.getPopulationSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeZero() {
        new CMAESOptimizer.PopulationSize(0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSizeNegative() {
        new CMAESOptimizer.PopulationSize(-1);
    }

    @Test
    public void testPopulationSizeCopy() {
        CMAESOptimizer.PopulationSize ps = new CMAESOptimizer.PopulationSize(7);
        assertEquals(7, ps.getPopulationSize());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersDimensionMismatch() {
        double[] guess = {1.0, 1.0, 1.0};
        double[] sig = {1.0, 2.0, 3.0, 4.0};
        double[] lower = {0.0, 0.0, 0.0};
        double[] upper = {10.0, 10.0, 10.0};

        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);
        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0]);
        
        try {
            optimizer.optimize(
                new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
                GoalType.MINIMIZE, objFunc, ig, 
                new CMAESOptimizer.Sigma(sig), populationSize);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersSigmaOutOfRange() {
        double[] guess = {5.0, 5.0, 5.0};
        double[] sig = {1.0, 2.0, 3.0};
        double[] lower = {0.0, 0.0, 0.0};
        double[] upper = {2.0, 2.0, 2.0};

        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);
        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0]);
        
        try {
            optimizer.optimize(
                new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
                GoalType.MINIMIZE, objFunc, ig, 
                new CMAESOptimizer.Sigma(sig), populationSize,
                new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction.ValueRange(0, 2));
            fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            // expected
        }
    }

    @Test
    public void testOptimizeWithBoundaries() {
        double[] guess = {1.0, 1.0, 1.0};
        double[] sig = {0.5, 0.5, 0.5};
        double[] lower = {-2.0, -2.0, -2.0};
        double[] upper = {2.0, 2.0, 2.0};

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0] + point[1]*point[1] + point[2]*point[2]);
        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);

        PointValuePair result = optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MINIMIZE, objFunc, ig, 
            new CMAESOptimizer.Sigma(sig), populationSize);
        
        assertNotNull(result);
        assertEquals(0.0, result.getKey()[0], 0.5);
        assertEquals(0.0, result.getKey()[1], 0.5);
        assertEquals(0.0, result.getKey()[2], 0.5);
    }

    @Test
    public void testOptimizeMaximize() {
        double[] guess = {0.0, 0.0, 0.0};
        double[] sig = {0.5, 0.5, 0.5};
        double[] lower = {-2.0, -2.0, -2.0};
        double[] upper = {2.0, 2.0, 2.0};

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> -(point[0]*point[0] + point[1]*point[1] + point[2]*point[2]));
        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);

        PointValuePair result = optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MAXIMIZE, objFunc, ig, 
            new CMAESOptimizer.Sigma(sig), populationSize);
        
        assertNotNull(result);
        assertEquals(0.0, result.getKey()[0], 0.5);
        assertEquals(0.0, result.getKey()[1], 0.5);
        assertEquals(0.0, result.getKey()[2], 0.5);
    }

    @Test
    public void testOptimizeDiverseGradients() {
        double[] guess = {2.0, -1.0, 0.5};
        double[] sig = {0.1, 0.1, 0.1};
        double[] lower = {-3.0, -3.0, -3.0};
        double[] upper = {3.0, 3.0, 3.0};

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> (point[0]-1)*(point[0]-1) + (point[1]+2)*(point[1]+2) + (point[2]-0.5)*(point[2]-0.5));
        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);

        PointValuePair result = optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MINIMIZE, objFunc, ig, 
            new CMAESOptimizer.Sigma(sig), populationSize);
        
        assertNotNull(result);
        assertEquals(1.0, result.getKey()[0], 0.3);
        assertEquals(-2.0, result.getKey()[1], 0.3);
        assertEquals(0.5, result.getKey()[2], 0.3);
    }

    @Test
    public void testGetStatisticsInitialEmpty() {
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testGetStatisticsAfterSimpleOptimize() {
        double[] guess = {1.0, 1.0, 1.0};
        double[] sig = {0.5, 0.5, 0.5};
        double[] lower = {-2.0, -2.0, -2.0};
        double[] upper = {2.0, 2.0, 2.0};

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0]);
        org.apache.commons.math3.optim.InitialGuess ig = 
            new org.apache.commons.math3.optim.InitialGuess(guess);

        optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MINIMIZE, objFunc, ig, 
            new CMAESOptimizer.Sigma(sig), populationSize);

        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsSigmaHistory().size() > 0);
        assertEquals(optimizer.getStatisticsSigmaHistory().size(), 
                     optimizer.getStatisticsMeanHistory().size());
        assertEquals(optimizer.getStatisticsSigmaHistory().size(), 
                     optimizer.getStatisticsFitnessHistory().size());
        assertEquals(optimizer.getStatisticsSigmaHistory().size(), 
                     optimizer.getStatisticsDHistory().size());
    }

    @Test
    public void testOptimizeMultipleCalls() {
        double[] guess = {1.0, 1.0};
        double[] sig = {0.5, 0.5};
        double[] lower = {-2.0, -2.0};
        double[] upper = {2.0, 2.0};

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc1 = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> point[0]*point[0] + point[1]*point[1]);

        optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MINIMIZE, objFunc1, 
            new org.apache.commons.math3.optim.InitialGuess(guess),
            new CMAESOptimizer.Sigma(sig), populationSize);

        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        int firstHistorySize = optimizer.getStatisticsSigmaHistory().size();

        org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction objFunc2 = 
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(
                point -> (point[0]-1)*(point[0]-1) + (point[1]+1)*(point[1]+1));

        optimizer.optimize(
            new org.apache.commons.math3.optim.MaxEval(MAX_ITER),
            GoalType.MINIMIZE, objFunc2, 
            new org.apache.commons.math3.optim.InitialGuess(guess),
            new CMAESOptimizer.Sigma(sig), populationSize);

        assertTrue(optimizer.getStatisticsSigmaHistory().size() >= firstHistorySize);
    }

    private static class SimpleConvergenceChecker 
            implements ConvergenceChecker<PointValuePair> {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean converged(int iteration, PointValuePair previous, 
                                 PointValuePair current) {
            return false;
        }
    }

    @Test
    public void testDoubleIndexCompareToEqual() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(2.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(2.0, 1);
        assertEquals(0, di1.compareTo(di2));
    }

    @Test
    public void testDoubleIndexCompareToLess() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(1.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(2.0, 1);
        assertTrue(di1.compareTo(di2) < 0);
    }

    @Test
    public void testDoubleIndexCompareToGreater() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(3.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(2.0, 1);
        assertTrue(di1.compareTo(di2) > 0);
    }

    @Test
    public void testDoubleIndexEqualsSameObject() {
        CMAESOptimizer.DoubleIndex di = new CMAESOptimizer.DoubleIndex(5.0, 0);
        assertTrue(di.equals(di));
    }

    @Test
    public void testDoubleIndexEqualsNull() {
        CMAESOptimizer.DoubleIndex di = new CMAESOptimizer.DoubleIndex(5.0, 0);
        assertFalse(di.equals(null));
    }

    @Test
    public void testDoubleIndexEqualsDifferentClass() {
        CMAESOptimizer.DoubleIndex di = new CMAESOptimizer.DoubleIndex(5.0, 0);
        assertFalse(di.equals(new Object()));
    }

    @Test
    public void testDoubleIndexEqualsDifferentValue() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(6.0, 0);
        assertFalse(di1.equals(di2));
    }

    @Test
    public void testDoubleIndexEqualsSameValueDifferentIndex() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 1);
        assertTrue(di1.equals(di2));
    }

    @Test
    public void testDoubleIndexEqualsSameValueSameIndex() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        assertTrue(di1.equals(di2));
    }

    @Test
    public void testDoubleIndexHashCodeConsistency() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(5.0, 0);
        assertEquals(di1.hashCode(), di2.hashCode());
    }

    @Test
    public void testDoubleIndexEqualsNaN() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(Double.NaN, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(Double.NaN, 0);
        assertFalse(di1.equals(di2));
    }

    @Test
    public void testDoubleIndexEqualsInfinity() {
        CMAESOptimizer.DoubleIndex di1 = new CMAESOptimizer.DoubleIndex(Double.POSITIVE_INFINITY, 0);
        CMAESOptimizer.DoubleIndex di2 = new CMAESOptimizer.DoubleIndex(Double.POSITIVE_INFINITY, 0);
        assertTrue(di1.equals(di2));
    }
}