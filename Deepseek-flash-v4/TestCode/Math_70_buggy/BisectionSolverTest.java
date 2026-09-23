package org.apache.commons.math.analysis.solvers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class BisectionSolverTest {
    private BisectionSolver solver;

    @Before
    public void setUp() {
        solver = new BisectionSolver();
    }

    @Test
    public void testSolve_BasicRoot() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        double result = solver.solve(f, 0.0, 2.0);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve_WithAccuracy() throws Exception {
        solver.setAbsoluteAccuracy(0.5);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        double result = solver.solve(f, 0.0, 2.0);
        assertEquals(1.0, result, 0.5);
        assertTrue(solver.getIterationCount() <= 2);
    }

    @Test(expected = NullPointerException.class)
    public void testSolve_NullFunction() throws Exception {
        solver.solve((UnivariateRealFunction) null, 0.0, 2.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_NoSignChange() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        solver.solve(f, -2.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_InvalidInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        solver.solve(f, 2.0, 0.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testSolve_MaxIterationsExceeded() throws Exception {
        solver.setMaximalIterationCount(3);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0;
            }
        };
        solver.solve(f, -2.0, 2.0);
    }

    @Test
    public void testSolve_ImmediateConvergence() throws Exception {
        solver.setAbsoluteAccuracy(1.0);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        double result = solver.solve(f, 0.0, 0.5);
        assertEquals(0.25, result, 1e-12);
        assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void testSolve_BranchIfFmFminPositive() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        double result = solver.solve(f, 0.0, 3.0);
        assertEquals(2.0, result, 1e-6);
        assertTrue(solver.getIterationCount() > 0);
    }

    @Test
    public void testSolve_RootAtMidpoint() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        double result = solver.solve(f, 0.0, 4.0);
        assertEquals(2.0, result, 1e-6);
    }
}