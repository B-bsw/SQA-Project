package org.apache.commons.math3.optim;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;

public class BaseOptimizerTest {
    private BaseOptimizer<Object> optimizer;
    private Object result;
    private ConvergenceChecker<Object> checker;

    @Before
    public void setUp() {
        checker = new ConvergenceChecker<Object>() {
            public boolean converged(int iteration, Object previous, Object current) {
                return false;
            }
        };
        optimizer = new BaseOptimizer<Object>(checker) {
            @Override
            protected Object doOptimize() {
                return "result";
            }
        };
        result = null;
    }

    @Test
    public void testInitialCounts() {
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test
    public void testParseOptimizationDataUpdatesCounts() {
        optimizer.parseOptimizationData(new MaxEval(100), new MaxIter(50));
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(50, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimizeIncrementsCounts() {
        optimizer.parseOptimizationData(new MaxEval(100), new MaxIter(50));
        result = optimizer.optimize(new MaxEval(100), new MaxIter(50));
        assertNotNull(result);
        assertEquals("result", result);
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvaluationsExceeded() {
        optimizer.parseOptimizationData(new MaxEval(0), new MaxIter(1));
        optimizer.optimize(new MaxEval(0));
    }

    @Test(expected = TooManyIterationsException.class)
    public void testMaxIterationsExceeded() {
        optimizer.parseOptimizationData(new MaxEval(1), new MaxIter(0));
        optimizer.optimize(new MaxEval(1), new MaxIter(0));
    }

    @Test
    public void testGetConvergenceChecker() {
        assertNotNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeResetsCountsOnSecondCall() {
        optimizer.parseOptimizationData(new MaxEval(10), new MaxIter(5));
        optimizer.optimize(new MaxEval(10), new MaxIter(5));
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());
        optimizer.optimize(new MaxEval(5), new MaxIter(3));
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testIncrementEvaluationCount() {
        optimizer.parseOptimizationData(new MaxEval(2), new MaxIter(2));
        optimizer.incrementEvaluationCount();
        assertEquals(1, optimizer.getEvaluations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testIncrementEvaluationCountExceeded() {
        optimizer.parseOptimizationData(new MaxEval(1), new MaxIter(1));
        optimizer.incrementEvaluationCount();
        optimizer.incrementEvaluationCount();
    }

    @Test
    public void testIncrementIterationCount() {
        optimizer.parseOptimizationData(new MaxEval(2), new MaxIter(2));
        optimizer.incrementIterationCount();
        assertEquals(1, optimizer.getIterations());
    }

    @Test(expected = TooManyIterationsException.class)
    public void testIncrementIterationCountExceeded() {
        optimizer.parseOptimizationData(new MaxEval(1), new MaxIter(1));
        optimizer.incrementIterationCount();
        optimizer.incrementIterationCount();
    }

    @Test
    public void testParseOptimizationDataRetainsPreviousValues() {
        optimizer.parseOptimizationData(new MaxEval(100), new MaxIter(50));
        optimizer.parseOptimizationData();
        assertEquals(100, optimizer.getMaxEvaluations());
        assertEquals(50, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimizeWithNoData() {
        result = optimizer.optimize();
        assertNotNull(result);
        assertEquals("result", result);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testParseOptimizationDataIgnoresUnknownType() {
        optimizer.parseOptimizationData(new MaxEval(5), new OptimizationData() {}, new MaxIter(3));
        assertEquals(5, optimizer.getMaxEvaluations());
        assertEquals(3, optimizer.getMaxIterations());
    }

    @Test
    public void testParseOptimizationDataMultipleMaxEval() {
        optimizer.parseOptimizationData(new MaxEval(10), new MaxEval(20));
        assertEquals(20, optimizer.getMaxEvaluations());
    }
}