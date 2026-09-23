package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.analysis.UnivariateRealFunction;

public class UnivariateRealSolverUtilsTest {

    // Stub function implementations
    private static class LinearFunction implements UnivariateRealFunction {
        private final double a;
        private final double b;
        LinearFunction(double a, double b) { this.a = a; this.b = b; }
        @Override
        public double value(double x) { return a * x + b; }
    }

    private static class ZeroFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) { return 0; }
    }

    private static class PositiveConstantFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) { return 1.0; }
    }

    private static class QuadraticPositiveFunction implements UnivariateRealFunction {
        @Override
        public double value(double x) { return x * x + 1; }
    }

    // ---------- solve tests ----------
    @Test(expected = IllegalArgumentException.class)
    public void testSolveNullFunction() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0);
    }

    @Test
    public void testSolveValid() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 4.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveNullFunctionWithAccuracy() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0, 1e-6);
    }

    @Test
    public void testSolveWithAccuracy() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        double result = UnivariateRealSolverUtils.solve(f, 0.0, 4.0, 1e-8);
        assertEquals(2.0, result, 1e-6);
    }

    // ---------- bracket tests ----------
    @Test(expected = IllegalArgumentException.class)
    public void testBracketNullFunction() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealSolverUtils.bracket(null, 1.0, 0.0, 10.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketNullFunctionWithMaxIter() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealSolverUtils.bracket(null, 1.0, 0.0, 10.0, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketMaxIterNonPositive() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketMaxIterNegative() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialBelowLower() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        UnivariateRealSolverUtils.bracket(f, -1.0, 0.0, 10.0, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialAboveUpper() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        UnivariateRealSolverUtils.bracket(f, 11.0, 0.0, 10.0, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketLowerBoundGEUpperBound() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        UnivariateRealSolverUtils.bracket(f, 5.0, 10.0, 5.0, 100);
    }

    @Test
    public void testBracketSuccess() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0, 100);
        double a = bracket[0];
        double b = bracket[1];
        double fa = f.value(a);
        double fb = f.value(b);
        assertTrue("bracket should contain a sign change (fa*fb <= 0)", fa * fb <= 0);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketConvergenceExceptionNoRoot() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new QuadraticPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0, 100);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketConvergenceExceptionMaxIterExceeded() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new PositiveConstantFunction();
        UnivariateRealSolverUtils.bracket(f, 5.0, 0.0, 10.0, 1);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketConvergenceExceptionMaxIterZeroHitBounds() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new QuadraticPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 3.0, 2.0, 4.0, 100);
    }

    @Test
    public void testBracketSuccessWithZeroFunction() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new ZeroFunction();
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 2.0, 0.0, 5.0, 100);
        double fa = f.value(bracket[0]);
        double fb = f.value(bracket[1]);
        assertTrue("fa*fb should be 0 because f is zero", fa * fb == 0.0);
    }

    @Test
    public void testBracketOverloadDefaultMaxIterSuccess() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new LinearFunction(1.0, -2.0);
        double[] bracket = UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0);
        assertNotNull(bracket);
        assertEquals(2, bracket.length);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketOverloadDefaultMaxIterNoRoot() throws ConvergenceException, FunctionEvaluationException {
        UnivariateRealFunction f = new QuadraticPositiveFunction();
        UnivariateRealSolverUtils.bracket(f, 1.0, 0.0, 10.0);
    }

    // ---------- midpoint tests ----------
    @Test
    public void testMidpointNormal() {
        double mid = UnivariateRealSolverUtils.midpoint(2.0, 4.0);
        assertEquals(3.0, mid, 1e-12);
    }

    @Test
    public void testMidpointSameValues() {
        double mid = UnivariateRealSolverUtils.midpoint(5.0, 5.0);
        assertEquals(5.0, mid, 1e-12);
    }

    @Test
    public void testMidpointNegative() {
        double mid = UnivariateRealSolverUtils.midpoint(-3.0, 1.0);
        assertEquals(-1.0, mid, 1e-12);
    }

    @Test
    public void testMidpointLargeValues() {
        double a = 1e100;
        double b = 2e100;
        double mid = UnivariateRealSolverUtils.midpoint(a, b);
        assertEquals(1.5e100, mid, 1e85);
    }

    @Test
    public void testMidpointDoubleNan() {
        double mid = UnivariateRealSolverUtils.midpoint(Double.NaN, 1.0);
        assertTrue(Double.isNaN(mid));
    }
}