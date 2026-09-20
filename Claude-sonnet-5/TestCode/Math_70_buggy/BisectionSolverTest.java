package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Before;
import org.junit.Test;

public class BisectionSolverTest {

    private UnivariateRealFunction linearFunction;
    private UnivariateRealFunction quadraticFunction;
    private BisectionSolver solver;

    @Before
    public void setUp() {
        // f(x) = x - 1, root at x = 1
        linearFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 1;
            }
        };

        // f(x) = x^2 - 2, root at sqrt(2)
        quadraticFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x * x - 2;
            }
        };

        solver = new BisectionSolver();
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor() {
        BisectionSolver s = new BisectionSolver();
        assertEquals(100, s.getMaximalIterationCount());
        assertEquals(1E-6, s.getAbsoluteAccuracy(), 0);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructor() {
        BisectionSolver s = new BisectionSolver(linearFunction);
        assertEquals(100, s.getMaximalIterationCount());
        assertEquals(1E-6, s.getAbsoluteAccuracy(), 0);
    }

    // ---------- solve(UnivariateRealFunction f, double min, double max) - normal case ----------

    @Test
    public void testSolveNormalCaseLinear() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(linearFunction, 0, 6);
        assertEquals(1.0, result, 1E-5);
    }

    @Test
    public void testSolveNormalCaseQuadratic() throws MaxIterationsExceededException, FunctionEvaluationException {
        double result = solver.solve(quadraticFunction, 0, 2);
        assertEquals(Math.sqrt(2), result, 1E-5);
    }

    // ---------- Branch coverage: fm * fmin > 0 (min = m) vs else (max = m) ----------

    @Test
    public void testSolveBranchMinReplaced() throws MaxIterationsExceededException, FunctionEvaluationException {
        // f(x) = x - 5, root at 5, interval [0, 10]
        // at min=0: f=-5 (neg), at m=5: f=0 -> not >0 branch triggers first depends on values
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                return x - 5;
            }
        };
        double result = solver.solve(f, 0, 10);