package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PowellOptimizerTest {

    private static final double EPS = 1e-10;
    private PowellOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new PowellOptimizer(1e-8, 1e-8);
    }

    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testConstructorWithNullChecker() {
        PowellOptimizer opt = new PowellOptimizer(1e-6, 1e-6, null);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorWithThresholds() {
        PowellOptimizer opt = new PowellOptimizer(0.5, 0.25, 0.1, 0.05);
        assertNotNull(opt);
    }

    @Test
    public void testConstructorWithLineSearchThresholds() {
        PowellOptimizer opt = new PowellOptimizer(0.5, 0.25, 0.1, 0.05, null);
        assertNotNull(opt);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall() {
        new PowellOptimizer(1e-15, 1e-8);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsNonPositive() {
        new PowellOptimizer(1e-1, 0.0);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeWithBounds() {
        optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.InitialGuess(new double[]{1.0, 1.0}),
            new org.apache.commons.math3.optim.SimpleBounds(new double[]{0.0, 0.0}, new double[]{2.0, 2.0}),
            GoalType.MINIMIZE
        );
    }

    @Test
    public void testOptimizeQuadraticFunction() {
        double[] start = {3.0, 3.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MINIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> point[0]*point[0] + point[1]*point[1])
        );
        assertEquals(0.0, result.getPoint()[0], 1e-4);
        assertEquals(0.0, result.getPoint()[1], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeRosenbrockFunction() {
        double[] start = {-1.2, 1.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(2000),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MINIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> (1 - point[0])*(1 - point[0]) + 100 * (point[1] - point[0]*point[0])*(point[1] - point[0]*point[0]))
        );
        assertEquals(1.0, result.getPoint()[0], 1e-3);
        assertEquals(1.0, result.getPoint()[1], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimizeMaximize() {
        double[] start = {0.5, 0.5};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MAXIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> -((point[0]-1)*(point[0]-1) + (point[1]+2)*(point[1]+2)))
        );
        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(-2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimizeSingleVariable() {
        double[] start = {3.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MINIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> (point[0]-2)*(point[0]-2))
        );
        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimizeFlatFunction() {
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MINIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> 5.0)
        );
        assertEquals(5.0, result.getValue(), 1e-6);
    }

    @Test
    public void testDoOptimizeWithCustomChecker() {
        final org.apache.commons.math3.optim.SimpleValueChecker<String> customChecker = 
            new org.apache.commons.math3.optim.SimpleValueChecker<String>(1e-6, 1e-6);
        ConvergenceChecker<PointValuePair> checker = new ConvergenceChecker<PointValuePair>() {
            @Override
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return false;
            }
        };
        PowellOptimizer opt = new PowellOptimizer(1e-6, 1e-6, checker);
        double[] start = {2.0, 2.0};
        PointValuePair result = opt.optimize(
            new MaxEval(100),
            new org.apache.commons.math3.optim.InitialGuess(start),
            GoalType.MINIMIZE,
            new org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction(point -> point[0]*point[0] + point[1]*point[1])
        );
        assertNotNull(result.getPoint());
    }

    @Test
    public void testLineSearchSearch() {
        PowellOptimizer opt = new PowellOptimizer(1e-6, 1e-6);
        try {
            java.lang.reflect.Field lineField = PowellOptimizer.class.getDeclaredField("line");
            lineField.setAccessible(true);
            Object lineObj = lineField.get(opt);
            java.lang.reflect.Method searchMethod = lineObj.getClass().getDeclaredMethod("search", double[].class, double[].class);
            searchMethod.setAccessible(true);
            double[] p = {1.0, 1.0};
            double[] d = {-1.0, -1.0};
            UnivariatePointValuePair result = (UnivariatePointValuePair) searchMethod.invoke(lineObj, p, d);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testNewPointAndDirection() {
        PowellOptimizer opt = new PowellOptimizer(1e-6, 1e-6);
        try {
            java.lang.reflect.Method method = PowellOptimizer.class.getDeclaredMethod("newPointAndDirection", double[].class, double[].class, double.class);
            method.setAccessible(true);
            double[] p = {1.0, 2.0};
            double[] d = {0.5, -1.0};
            double[][] result = (double[][]) method.invoke(opt, p, d, 2.0);
            assertEquals(2, result.length);
            assertEquals(1.0 + 0.5*2.0, result[0][0], 1e-10);
            assertEquals(2.0 + (-1.0)*2.0, result[0][1], 1e-10);
            assertEquals(1.0, result[1][0], 1e-10);
            assertEquals(-2.0, result[1][1], 1e-10);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}