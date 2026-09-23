package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.junit.Test;
import static org.junit.Assert.*;

public class BracketingNthOrderBrentSolverTest {

    private static final double EPS = 1e-8;

    private static class SinFunction implements UnivariateFunction {
        public double value(double x) {
            return Math.sin(x);
        }
    }

    private static class LinearFunction implements UnivariateFunction {
        public double value(double x) {
            return 2 * x - 4;
        }
    }

    private static class PolynomialFunction implements UnivariateFunction {
        public double value(double x) {
            return (x - 1) * (x - 3) * (x + 2);
        }
    }

    private static class ConstantFunction implements UnivariateFunction {
        public double value(double x) {
            return 1.0;
        }
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorThrowsWhenMaximalOrderLessThanTwo() {
        new BracketingNthOrderBrentSolver(1e-6, 1);
    }

    @Test
    public void testDefaultConstructor() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        assertEquals(5, solver.getMaximalOrder());
    }

    @Test
    public void testConstructorWithParameters() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 3);
        assertEquals(3, solver.getMaximalOrder());
    }

    @Test
    public void testNoBracketingThrowsException() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        try {
            solver.solve(100, new LinearFunction(), 0, 1, 0.5, AllowedSolution.ANY_SIDE);
            fail("Expected NoBracketingException");
        } catch (NoBracketingException e) {
            // expected
        }
    }

    @Test
    public void testSolveLinearFunctionAnySide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 5, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, EPS);
    }

    @Test
    public void testSolveLinearFunctionLeftSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 5, AllowedSolution.LEFT_SIDE);
        assertTrue(result <= 2.0 + EPS);
        assertEquals(2.0, result, 0.1);
    }

    @Test
    public void testSolveSinFunction() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 5);
        double result = solver.solve(100, new SinFunction(), 3, 4, 3.5, AllowedSolution.ANY_SIDE);
        assertEquals(Math.PI, result, 1e-6);
    }

    @Test
    public void testSolvePolynomialWithMultipleRoots() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new PolynomialFunction(), 0, 2, 1.5, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-6);

        result = solver.solve(100, new PolynomialFunction(), 2, 4, 3.5, AllowedSolution.ANY_SIDE);
        assertEquals(3.0, result, 1e-6);

        result = solver.solve(100, new PolynomialFunction(), -3, -1, -2, AllowedSolution.ANY_SIDE);
        assertEquals(-2.0, result, 1e-6);
    }

    @Test
    public void testSolveWhenStartValueIsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, EPS);
    }

    @Test
    public void testSolveWhenMinIsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 2.0, 10, 5, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, EPS);
    }

    @Test
    public void testSolveWhenMaxIsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, EPS);
    }

    @Test
    public void testSolveWithDefaultAllowedSolution() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double result = solver.solve(100, new LinearFunction(), 0, 10);
        assertEquals(2.0, result, EPS);
    }

    @Test
    public void testBelowSideSolution() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 5, AllowedSolution.BELOW_SIDE);
        assertTrue(result <= 2.0 + EPS);
    }

    @Test
    public void testAboveSideSolution() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 5, AllowedSolution.ABOVE_SIDE);
        assertTrue(result >= 2.0 - EPS);
    }

    @Test
    public void testNoBracketingWithConstantFunction() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 5);
        try {
            solver.solve(100, new ConstantFunction(), 0, 10, 5, AllowedSolution.ANY_SIDE);
            fail("Expected NoBracketingException");
        } catch (NoBracketingException e) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInvalidMaxEvaluations() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(-1, new LinearFunction(), 0, 10);
    }

    @Test
    public void testSolveWithToleranceHandling() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-12, 5);
        double result = solver.solve(100, new LinearFunction(), 0, 10, 5, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-10);
    }
}