package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
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

    @After
    public void tearDown() {
        solver = null;
    }

    private static class LinearFunction implements UnivariateRealFunction {
        private final double a;
        private final double b;
        LinearFunction(double a, double b) { this.a = a; this.b = b; }
        @Override
        public double value(double x) throws FunctionEvaluationException {
            return a * x + b;
        }
    }

    private static class QuadraticFunction implements UnivariateRealFunction {
        private final double a;
        private final double b;
        private final double c;
        QuadraticFunction(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
        @Override
        public double value(double x) throws FunctionEvaluationException {
            return a * x * x + b * x + c;
        }
    }

    private static class ThrowingFunction implements UnivariateRealFunction {
        private final int callLimit;
        private int callCount = 0;
        ThrowingFunction(int limit) { this.callLimit = limit; }
        @Override
        public double value(double x) throws FunctionEvaluationException {
            callCount++;
            if (callCount > callLimit) {
                throw new FunctionEvaluationException(x);
            }
            return x - 5.0;
        }
    }

    @Test
    public void testSolveTwoArgsBasic() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        double result = solver.solve(f, 0.0, 5.0);
        assertEquals(2.0, result, 1e-6);
        assertTrue(solver.getFunctionValueAccuracy() >= Math.abs(solver.getFunctionValue()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArgsNoBracketing() throws Exception {
        UnivariateRealFunction f = new QuadraticFunction(1.0, -6.0, 10.0);
        solver.solve(f, 0.0, 5.0);
    }

    @Test
    public void testSolveTwoArgsMinIsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -1.0);
        double result = solver.solve(f, 1.0, 5.0);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveTwoArgsMaxIsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -1.0);
        double result = solver.solve(f, 0.0, 1.0);
        assertEquals(1.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArgsInvalidInterval() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -1.0);
        solver.solve(f, 5.0, 0.0);
    }

    @Test
    public void testSolveThreeArgsBasic() throws Exception {
        UnivariateRealFunction f = new QuadraticFunction(1.0, 0.0, -1.0);
        double result = solver.solve(f, -5.0, 5.0, 2.0);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveThreeArgsInitialBrackets() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -3.0);
        double result = solver.solve(f, 0.0, 10.0, 4.0);
        assertEquals(3.0, result, 1e-6);
    }

    @Test
    public void testSolveThreeArgsInitialIsRoot() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -5.0);
        double result = solver.solve(f, -10.0, 10.0, 5.0);
        assertEquals(5.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArgsInvalidSequence() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -1.0);
        solver.solve(f, 0.0, 5.0, 10.0);
    }

    @Test
    public void testSolveLinearFunctionFewIterations() throws Exception {
        UnivariateRealFunction f = new LinearFunction(100.0, -200.0);
        double result = solver.solve(f, 0.0, 10.0, 5.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveTwoArgsFBracketZeroAtMin() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, 0.0);
        double result = solver.solve(f, 0.0, 5.0);
        assertEquals(0.0, result, 1e-6);
    }

    @Test
    public void testSolveTwoArgsFBracketZeroAtMax() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -5.0);
        double result = solver.solve(f, 0.0, 5.0);
        assertEquals(5.0, result, 1e-6);
    }

    @Test
    public void testSolveThreeArgsSameSignEndpoints() throws Exception {
        UnivariateRealFunction f = new QuadraticFunction(1.0, -2.0, 0.0);
        double result = solver.solve(f, -1.0, 3.0, 1.0);
        assertEquals(0.0, result, 1e-6);
    }

    @Test
    public void testSolveWithQuadraticInterpolationPath() throws Exception {
        UnivariateRealFunction f = new QuadraticFunction(1.0, 0.0, -2.0);
        double result = solver.solve(f, 0.0, 5.0, 1.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testSolveReturnsResult() throws Exception {
        UnivariateRealFunction f = new LinearFunction(1.0, -10.0);
        double result = solver.solve(f, 0.0, 20.0);
        assertEquals(10.0, result, 1e-6);
        assertTrue(solver.getIterationCount() > 0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testSolveFunctionEvaluationError() throws Exception {
        UnivariateRealFunction f = new ThrowingFunction(0);
        solver.solve(f, 0.0, 10.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            private int count = 0;
            @Override
            public double value(double x) throws FunctionEvaluationException {
                count++;
                if (count > 1) {
                    return (x - 0.5) * (x - 0.5) + 0.1;
                }
                return -(x - 0.5) * (x - 0.5) - 0.1;
            }
        };
        solver.solve(f, 0.0, 1.0);
    }
}