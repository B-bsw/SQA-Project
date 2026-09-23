package org.apache.commons.math.analysis.solvers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BrentSolverTest {

    private BrentSolver solver;

    @Before
    public void setUp() {
        solver = new BrentSolver();
    }

    // Helper function: linear
    private static class LinearFunction implements UnivariateRealFunction {
        private final double slope;
        private final double intercept;

        LinearFunction(double slope, double intercept) {
            this.slope = slope;
            this.intercept = intercept;
        }

        public double value(double x) {
            return slope * x + intercept;
        }
    }

    // f(x) = x - 1 has root at 1
    private static final UnivariateRealFunction LINEAR_ROOT_1 = new LinearFunction(1.0, -1.0);

    // f(x) = x^2 - 4 has root at 2 and -2
    private static class QuadraticFunction implements UnivariateRealFunction {
        public double value(double x) {
            return x * x - 4.0;
        }
    }

    private static final UnivariateRealFunction QUADRATIC = new QuadraticFunction();

    @Test
    public void testSolveLinearBracketing() throws Exception {
        double result = solver.solve(LINEAR_ROOT_1, 0.0, 2.0);
        assertEquals("Linear root should be 1.0", 1.0, result, 1e-6);
    }

    @Test
    public void testSolveEndpointRoot() throws Exception {
        // min is exactly a root
        double result = solver.solve(LINEAR_ROOT_1, 1.0, 2.0);
        assertEquals("Endpoint min is root", 1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithInitialGuess() throws Exception {
        double result = solver.solve(LINEAR_ROOT_1, 0.0, 2.0, 1.5);
        assertEquals("With initial guess, root should be 1.0", 1.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveNonBracketingException() throws Exception {
        // f(x) = x^2 + 1 has no real root, endpoints have same sign
        UnivariateRealFunction noRootFunc = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        solver.solve(noRootFunc, -1.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidSequence() throws Exception {
        // initial is not between min and max
        solver.solve(LINEAR_ROOT_1, 0.0, 2.0, 3.0);
    }

    @Test
    public void testSolveQuadraticBracketing() throws Exception {
        // f(x) = x^2 - 4, interval [0,5] gives opposite signs at endpoints
        double result = solver.solve(QUADRATIC, 0.0, 5.0);
        assertEquals("Root should be 2.0", 2.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidMinMax() throws Exception {
        // min > max should throw IllegalArgumentException via verifyInterval
        solver.solve(LINEAR_ROOT_1, 3.0, 1.0);
    }

    @Test
    public void testSolveOneEndpointZero() throws Exception {
        // f(x) = x, root at 0, interval [-1, 0] sign = -1 * 0 = 0, should return min or max where y=0
        UnivariateRealFunction identity = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        double result = solver.solve(identity, -1.0, 0.0);
        assertEquals("Root should be 0.0", 0.0, result, 1e-12);
    }

    @Test
    public void testSolveBothEndpointsZero() throws Exception {
        // interval where both endpoints are zero (trivial)
        UnivariateRealFunction zeroFunc = new UnivariateRealFunction() {
            public double value(double x) {
                return 0.0;
            }
        };
        double result = solver.solve(zeroFunc, -1.0, 2.0);
        // either endpoint may be returned (depends on which is checked first)
        assertTrue("Result should be -1.0 or 2.0", result == -1.0 || result == 2.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolveMaxIterationsExceeded() throws Exception {
        // Use a function that oscillates and small interval to force many iterations
        // Reduce max iterations via solver's inherited setMaximalIterationCount
        BrentSolver limitedSolver = new BrentSolver();
        // default is 100, but we can set to 1 to force exception quickly
        limitedSolver.setMaximalIterationCount(1);
        UnivariateRealFunction func = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(1.0 / (x - 0.5)); // very oscillatory near 0.5
            }
        };
        limitedSolver.solve(func, -1.0, 2.0, 0.0);
    }
}