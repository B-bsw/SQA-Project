package org.apache.commons.math.analysis;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrentSolverTest {

    private static final double EPS = 1e-6;

    @Test
    public void testSolve2FindsRoot() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        assertEquals(2.0, solver.solve(0.0, 4.0), EPS);
    }

    @Test
    public void testSolve2NonLinearFunction() throws Exception {
        BrentSolver solver = new BrentSolver(new CubicMinusTwoFunction());
        assertEquals(1.2599210498948732, solver.solve(0.0, 2.0), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve2NonBracketing() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        solver.solve(3.0, 6.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve2InvalidInterval() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        solver.solve(4.0, 4.0);
    }

    @Test
    public void testSolve3InitialRootAtMaxBoundary() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(10.0));
        assertEquals(10.0, solver.solve(0.0, 10.0, 10.0), EPS);
    }

    @Test
    public void testSolve3MinEndpointRoot() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(0.0));
        assertEquals(0.0, solver.solve(0.0, 10.0, 5.0), EPS);
    }

    @Test
    public void testSolve3MaxEndpointRoot() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(0.0));
        assertEquals(0.0, solver.solve(-10.0, 0.0, -5.0), EPS);
    }

    @Test
    public void testSolve3BracketingWithMinAndInitial() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        assertEquals(2.0, solver.solve(0.0, 10.0, 3.0), EPS);
    }

    @Test
    public void testSolve3BracketingWithInitialAndMax() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(8.0));
        assertEquals(8.0, solver.solve(0.0, 10.0, 5.0), EPS);
    }

    @Test
    public void testSolve3FullBrentWithSameSignEndpoints() throws Exception {
        BrentSolver solver = new BrentSolver(new QuadraticFunction(3.0));
        assertEquals(3.0, solver.solve(0.0, 5.0, 1.0), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve3InitialGuessBelowInterval() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        solver.solve(0.0, 10.0, -1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve3InitialGuessAboveIntervalEvenIfRoot() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        solver.solve(0.0, 1.0, 2.0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testSolvePropagatesFunctionEvaluationException() throws Exception {
        BrentSolver solver = new BrentSolver(new ThrowingFunction());
        solver.solve(0.0, 10.0, 5.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        BrentSolver solver = new BrentSolver(new LinearFunction(2.0));
        solver.setMaximalIterationCount(1);
        solver.solve(0.0, 4.0);
    }

    private static class LinearFunction implements UnivariateRealFunction {
        private final double root;

        LinearFunction(double root) {
            this.root = root;
        }

        @Override
        public double value(double x) throws FunctionEvaluationException {
            return x - root;
        }
    }

    private static class QuadraticFunction implements UnivariateRealFunction {
        private final double root;

        QuadraticFunction(double root) {
            this.root = root;
        }

        @Override
        public double value(double x) throws FunctionEvaluationException {
            double diff = x - root;
            return diff * diff;
        }
    }

    private static class CubicMinusTwoFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) throws FunctionEvaluationException {
            return x * x * x - 2.0;
        }
    }

    private static class ThrowingFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) throws FunctionEvaluationException {
            throw new FunctionEvaluationException(x);
        }
    }
}