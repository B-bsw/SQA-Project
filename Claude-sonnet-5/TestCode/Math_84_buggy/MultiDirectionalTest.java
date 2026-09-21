package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiDirectionalTest {

    /** Simple convergence checker based on function value delta. */
    private static class SimpleChecker implements RealConvergenceChecker {
        private final double threshold;
        SimpleChecker(final double threshold) {
            this.threshold = threshold;
        }
        public boolean converged(final int iteration,
                                  final RealPointValuePair previous,
                                  final RealPointValuePair current) {
            return Math.abs(previous.getValue() - current.getValue()) < threshold;
        }
    }

    /** Sum of squares function: f(x) = sum((x_i - target_i)^2). */
    private static class SumOfSquares implements MultivariateRealFunction {
        private final double[] target;
        SumOfSquares(final double[] target) {
            this.target = target;
        }
        public double value(final double[] point)
            throws FunctionEvaluationException, IllegalArgumentException {
            double sum = 0.0;
            for (int i = 0; i < point.length; ++i) {
                final double d = point[i] - target[i];
                sum += d * d;
            }
            return sum;
        }
    }

    /** Negative sum of squares, useful for MAXIMIZE goal testing. */
    private static class NegativeSumOfSquares implements MultivariateRealFunction {
        private final double[] target;
        NegativeSumOfSquares(final double[] target) {
            this.target = target;
        }
        public double value(final double[] point)
            throws FunctionEvaluationException, IllegalArgumentException {
            double sum = 0.0;
            for (int i = 0; i < point.length; ++i) {
                final double d = point[i] - target[i];
                sum += d * d;
            }
            return -sum;
        }
    }

    /** Constant function, causes iterateSimplex loop to never satisfy exit conditions. */
    private static class ConstantFunction implements MultivariateRealFunction {
        public double value(final double[] point)
            throws FunctionEvaluationException, IllegalArgumentException {
            return 1.0;
        }
    }

    /** Function that always throws a FunctionEvaluationException. */
    private static class ThrowingFunction implements MultivariateRealFunction {
        public double value(final double[] point)
            throws FunctionEvaluationException, IllegalArgumentException {
            throw new FunctionEvaluationException(point);
        }
    }

    @Test
    public void testDefaultConstructorConvergence2D()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);

        final double[] target = { 3.0, 4.0 };
        final double[] start  = { 0.0, 0.0 };

        final RealPointValuePair result =
            optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
        assertEquals(target[0], result.getPointRef()[0], 0.5);
        assertEquals(target[1], result.getPointRef()[1], 0.5);
        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testCustomCoefficientsConvergence()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional(3.0, 0.3);
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);

        final double[] target = { -2.0, 5.0 };
        final double[] start  = { 1.0, 1.0 };

        final RealPointValuePair result =
            optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
        assertEquals(target[0], result.getPointRef()[0], 0.5);
        assertEquals(target[1], result.getPointRef()[1], 0.5);
    }

    @Test
    public void testMaximizeGoal()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);

        final double[] target = { 2.0, 2.0 };
        final double[] start  = { 0.0, 0.0 };

        final RealPointValuePair result =
            optimizer.optimize(new NegativeSumOfSquares(target), GoalType.MAXIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
        assertEquals(target[0], result.getPointRef()[0], 0.5);
        assertEquals(target[1], result.getPointRef()[1], 0.5);
    }

    @Test
    public void testOneDimensional()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);

        final double[] target = { 5.0 };
        final double[] start  = { 0.0 };

        final RealPointValuePair result =
            optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
        assertEquals(target[0], result.getPointRef()[0], 0.5);
    }

    @Test
    public void testHighDimensional()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(2000);
        optimizer.setMaxEvaluations(200000);

        final double[] target = { 1.0, 2.0, 3.0 };
        final double[] start  = { 0.0, 0.0, 0.0 };

        final RealPointValuePair result =
            optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 5e-2);
        for (int i = 0; i < target.length; ++i) {
            assertEquals(target[i], result.getPointRef()[i], 0.5);
        }
    }

    @Test
    public void testMaxIterationsExceededThrowsException() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(3);
        optimizer.setMaxEvaluations(1000000);

        final double[] start = { 0.0, 0.0 };

        boolean thrown = false;
        try {
            optimizer.optimize(new ConstantFunction(), GoalType.MINIMIZE, start);
        } catch (OptimizationException oe) {
            thrown = true;
        } catch (FunctionEvaluationException fee) {
            fail("unexpected FunctionEvaluationException");
        }
        assertTrue(thrown);
    }

    @Test
    public void testMaxEvaluationsExceededThrowsException() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000000);
        optimizer.setMaxEvaluations(3);

        final double[] start = { 0.0, 0.0 };

        boolean thrown = false;
        try {
            optimizer.optimize(new ConstantFunction(), GoalType.MINIMIZE, start);
        } catch (OptimizationException oe) {
            thrown = true;
        } catch (FunctionEvaluationException fee) {
            fail("unexpected FunctionEvaluationException");
        }
        assertTrue(thrown);
    }

    @Test
    public void testFunctionEvaluationExceptionPropagates() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);

        final double[] start = { 0.0, 0.0 };

        boolean thrown = false;
        try {
            optimizer.optimize(new ThrowingFunction(), GoalType.MINIMIZE, start);
        } catch (FunctionEvaluationException fee) {
            thrown = true;
        } catch (OptimizationException oe) {
            fail("unexpected OptimizationException");
        }
        assertTrue(thrown);
    }

    @Test
    public void testNullStartPointThrowsException() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);

        boolean thrown = false;
        try {
            optimizer.optimize(new SumOfSquares(new double[] { 1.0, 1.0 }),
                                GoalType.MINIMIZE, null);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testEmptyStartPointThrowsException() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);

        boolean thrown = false;
        try {
            optimizer.optimize(new SumOfSquares(new double[0]),
                                GoalType.MINIMIZE, new double[0]);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testStartConfigurationSteps()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });

        final double[] target = { 2.0, -3.0 };
        final double[] start  = { 0.0, 0.0 };

        final RealPointValuePair result =
            optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testConvergenceCheckerGetterSetter() {

        final MultiDirectional optimizer = new MultiDirectional();
        final RealConvergenceChecker checker = new SimpleChecker(1e-6);
        optimizer.setConvergenceChecker(checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testMaxIterationsGetterSetter() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(42);
        assertEquals(42, optimizer.getMaxIterations());
    }

    @Test
    public void testMaxEvaluationsGetterSetter() {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxEvaluations(4242);
        assertEquals(4242, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGettersAfterSuccessfulOptimize()
        throws FunctionEvaluationException, OptimizationException {

        final MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleChecker(1e-10));
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(100000);

        final double[] target = { 0.5, 0.5 };
        final double[] start  = { 0.0, 0.0 };

        optimizer.optimize(new SumOfSquares(target), GoalType.MINIMIZE, start);

        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getEvaluations() > 0);
        assertTrue(optimizer.getEvaluations() >= optimizer.getIterations());
    }

}