package org.apache.commons.math.optimization.univariate;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.exception.NotStrictlyPositiveException;

public class BrentOptimizerTest {
    private BrentOptimizer optimizer;
    private static final double EPS = 1e-10;
    private static final double REL_EPS = 1.0e-14;

    @Before
    public void setUp() {
        optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(EPS);
        optimizer.setRelativeAccuracy(REL_EPS);
        optimizer.setMaximalIterationCount(100);
    }

    @Test
    public void testMinimizeQuadratic() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 3.0) * (x - 3.0) + 5.0;
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        assertEquals(3.0, result, 1e-5);
    }

    @Test
    public void testMaximizeQuadratic() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x - 2.0) * (x - 2.0) + 7.0;
            }
        };
        double result = optimizer.optimize(f, GoalType.MAXIMIZE, -10.0, 10.0, 0.0);
        assertEquals(2.0, result, 1e-5);
    }

    @Test
    public void testMinimizeWithIntervalOnly() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -5.0, 5.0);
        assertEquals(0.0, result, 1e-5);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNegativeRelativeAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // Set invalid relative accuracy (eps <= 0) - this will be used internally by localMin
        // We need to trigger branch that calls localMin with eps <= 0
        // Since localMin is private, we must rely on optimize calling it with getRelativeAccuracy()
        // which we set to 0 (invalid) below
        optimizer.setRelativeAccuracy(0.0);
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0, 0.5);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNegativeAbsoluteAccuracy() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        optimizer.setAbsoluteAccuracy(-1.0);
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0, 0.5);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                // oscillating function that never stops
                return Math.sin(1.0 / (x - 0.5));
            }
        };
        optimizer.setMaximalIterationCount(1);
        optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0, 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testNullFunction() throws Exception {
        optimizer.optimize(null, GoalType.MINIMIZE, 0.0, 1.0, 0.5);
    }

    @Test
    public void testLoGreaterThanHi() throws Exception {
        // localMin will swap lo and hi if lo > hi
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0);
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 10.0, -10.0, 0.0);
        assertEquals(1.0, result, 1e-5);
    }

    @Test
    public void testStartValueAtBoundary() throws Exception {
        // startValue equals min or max
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 4.0) * (x - 4.0);
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, 2.0, 6.0, 2.0);
        assertEquals(4.0, result, 1e-5);
    }

    @Test
    public void testFunctionWithMultipleEvaluations() throws Exception {
        // A function that requires many evaluation steps but converges
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x * x - 10.0 * x * x * x + 35.0 * x * x - 50.0 * x + 24.0;
            }
        };
        double result = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        // minimum near x=1.0 or x=4.0? Let's check approximate local minima
        // derivative 4x^3-30x^2+70x-50 = 0 -> roughly 1.0 and 4.0
        assertTrue("Result should be close to 1.0 or 4.0", Math.abs(result - 1.0) < 0.5 || Math.abs(result - 4.0) < 0.5);
    }

    @Test
    public void testDoOptimizeThrowsUnsupportedOperationException() {
        try {
            optimizer.doOptimize();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }
}