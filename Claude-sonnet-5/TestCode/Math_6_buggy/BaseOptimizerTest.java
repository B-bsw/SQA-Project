package org.apache.commons.math3.optim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;

public class BaseOptimizerTest {

    /**
     * Simple concrete convergence checker used for testing purposes.
     */
    private static class SimpleChecker implements ConvergenceChecker<Double> {
        public boolean converged(int iteration, Double previous, Double current) {
            return true;
        }
    }

    /**
     * Concrete implementation of the abstract BaseOptimizer used for tests.
     * The doOptimize method increments the evaluation and iteration counters
     * a configurable number of times before returning a fixed value.
     */
    private static class TestOptimizer extends BaseOptimizer<Double> {
        private int numEvalIncrements = 0;
        private int numIterIncrements = 0;

        protected TestOptimizer(ConvergenceChecker<Double> checker) {
            super(checker);
        }

        void setNumEvalIncrements(int n) {
            this.numEvalIncrements = n;
        }

        void setNumIterIncrements(int n) {
            this.numIterIncrements = n;
        }

        @Override
        protected Double doOptimize() {
            for (int i = 0; i < numEvalIncrements; i++) {
                incrementEvaluationCount();
            }
            for (int i = 0; i < numIterIncrements; i++) {
                incrementIterationCount();
            }
            return 1.0;
        }
    }

    // ----------------------------------------------------------------
    // Constructor / getConvergenceChecker tests
    // ----------------------------------------------------------------

    @Test
    public void testGetConvergenceCheckerNotNull() {
        SimpleChecker checker = new SimpleChecker();
        TestOptimizer optimizer = new TestOptimizer(checker);
        assertNotNull(optimizer.getConvergenceChecker());
        assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testGetConvergenceCheckerNull() {
        TestOptimizer optimizer = new TestOptimizer(null);
        assertNull(optimizer.getConvergenceChecker());
    }

    // ----------------------------------------------------------------
    // getMaxEvaluations / getMaxIterations default values
    // ----------------------------------------------------------------

    @Test
    public void testDefaultMaxEvaluationsAndIterations() {
        TestOptimizer optimizer = new TestOptimizer(null);
        // Default maximal count for Incrementor is Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxIterations());
    }

    // ----------------------------------------------------------------
    // getEvaluations / getIterations before any optimize call
    // ----------------------------------------------------------------

    @Test
    public void testGetEvaluationsAndIterationsInitial() {
        TestOptimizer optimizer = new TestOptimizer(null);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    // ----------------------------------------------------------------
    // optimize with no optimization data (0-iteration loop in parseOptimizationData)
    // ----------------------------------------------------------------

    @Test
    public void testOptimizeNoOptimizationData() {
        TestOptimizer optimizer = new TestOptimizer(null);
        optimizer.setNumEvalIncrements(0);
        optimizer.setNumIterIncrements(0);

        Double result = optimizer.optimize();

        assertEquals(1.0, result, 0.0);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        // Default maximal counts remain unchanged.
        assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        ass