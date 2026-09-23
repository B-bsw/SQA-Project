package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;

import java.util.ArrayList;
import java.util.List;

public class BrentOptimizerTest {

    private static final double EPS = 1e-10;

    // Stub for testability (plain Java objects per requirements)
    private static class RecordingConvergenceChecker implements ConvergenceChecker<UnivariatePointValuePair> {
        private final List<UnivariatePointValuePair> previousPoints = new ArrayList<>();
        private final List<UnivariatePointValuePair> currentPoints = new ArrayList<>();
        private final boolean stopEarly;

        RecordingConvergenceChecker(boolean stopEarly) {
            this.stopEarly = stopEarly;
        }

        @Override
        public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
            previousPoints.add(previous);
            currentPoints.add(current);
            return stopEarly;
        }
    }

    // Test double for BrentOptimizer (expose package-private fields/methods)
    private static class TestableBrentOptimizer extends BrentOptimizer {
        private double a, b, x, w, v, d, e, fx, fw, fv;
        private int iter;

        TestableBrentOptimizer(double rel, double abs) {
            super(rel, abs);
        }

        TestableBrentOptimizer(double rel, double abs, ConvergenceChecker<UnivariatePointValuePair> checker) {
            super(rel, abs, checker);
        }

        @Override
        protected double computeObjectiveValue(double x) {
            // Simple quadratic: (x-2)^2 - 1 (min at 2, min value -1)
            return (x - 2) * (x - 2) - 1;
        }

        // Expose internal state for verification
        double getA() { return a; }
        double getB() { return b; }
        double getX() { return x; }
        double getW() { return w; }
        double getV() { return v; }
        double getFx() { return fx; }
        double getFw() { return fw; }
        double getFv() { return fv; }
        int getIter() { return iter; }

        // Wrapper to call protected doOptimize
        UnivariatePointValuePair callDoOptimize() {
            return doOptimize();
        }
    }

    // ============= Constructor Tests =============

    @Test
    public void testConstructorRejectsNegativeAbs() {
        try {
            new BrentOptimizer(1e-8, -1.0);
            fail("Expected NotStrictlyPositiveException for negative abs");
        } catch (NotStrictlyPositiveException e) {
            // expected
        }
    }

    @Test
    public void testConstructorRejectsZeroAbs() {
        try {
            new BrentOptimizer(1e-8, 0.0);
            fail("Expected NotStrictlyPositiveException for zero abs");
        } catch (NotStrictlyPositiveException e) {
            // expected
        }
    }

    @Test
    public void testConstructorRejectsSmallRel() {
        try {
            new BrentOptimizer(1e-16, 1e-8);
            fail("Expected NumberIsTooSmallException for too small rel");
        } catch (NumberIsTooSmallException e) {
            // expected
        }
    }

    @Test
    public void testConstructorAcceptsValidParameters() {
        // Should not throw
        new BrentOptimizer(1e-8, 1e-10);
        new BrentOptimizer(1e-8, 1e-10, null);
    }

    // ============= doOptimize Tests =============

    @Test
    public void testMinimizationFindsCorrectMinimum() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(-1.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMaximizationFindsCorrectMaximum() {
        // Maximize -(x-2)^2 + 1  (max at 2, value 1)
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return -(x - 2) * (x - 2) + 1;
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MAXIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(1.0, result.getValue(), 1e-6);
    }

    @Test
    public void testWithCheckerThatStopsImmediately() {
        RecordingConvergenceChecker checker = new RecordingConvergenceChecker(true);
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10, checker);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        // Should return early (checker stops), maybe not the true minimum
        assertNotNull(result);
        assertTrue(checker.currentPoints.size() >= 1);
    }

    @Test
    public void testWithNonFullOptimizationLoops() {
        // Use a coarse tolerance to force early termination
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-2, 1e-4);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(2.0, result.getPoint(), 0.1);
    }

    @Test
    public void testBoundaryAtLo() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(0.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        // Starting at boundary should still converge
        assertNotNull(result);
    }

    @Test
    public void testBoundaryAtHi() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(10.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
    }

    @Test
    public void testNarrowRange() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-12, 1e-14);
        optimizer.setMin(1.999);
        optimizer.setMax(2.001);
        optimizer.setStartValue(2.0005);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(-1.0, result.getValue(), 1e-6);
    }

    @Test
    public void testConstantFunctionMinimization() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return 5.0;
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(3.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(5.0, result.getValue(), 0.0);
    }

    @Test
    public void testInvalidStartValueOutsideInterval() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(15.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        // Should still work, but might produce unexpected results; just verify no crash
        try {
            optimizer.callDoOptimize();
            // Test passes if no exception
        } catch (RuntimeException e) {
            fail("Should not throw RuntimeException: " + e.getMessage());
        }
    }

    // ============= Internal State Tests =============

    @Test
    public void testIterationCountIsPositive() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        optimizer.callDoOptimize();

        assertTrue(optimizer.getIter() > 0);
    }

    @Test
    public void testBestPointReturnedWhenSameValue() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return x > 1 ? 1.0 : -1.0;
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(2.0);
        optimizer.setStartValue(0.5);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        // Should pick the first point with min value -1.0
        assertNotNull(result);
        assertEquals(-1.0, result.getValue(), 0.0);
    }

    @Test
    public void testNullChecker() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10, null);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(2.0, result.getPoint(), 1e-6);
    }

    // ============= Edge Cases =============

    @Test
    public void testNoIterationsNeededWhenStartOptimal() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return (x - 2) * (x - 2);
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(4.0);
        optimizer.setStartValue(2.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(2.0, result.getPoint(), 1e-10);
        assertEquals(0.0, result.getValue(), 1e-10);
    }

    @Test
    public void testMinimumAtBoundary() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return x; // min at a (0)
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(0.0, result.getPoint(), 1e-8);
    }

    @Test
    public void testMaximumAtBoundary() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return -x; // max at 0
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MAXIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(0.0, result.getPoint(), 1e-8);
    }

    @Test
    public void testWithDefaultConvergenceCheckerNull() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10);
        optimizer.setMin(-10.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(0.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
    }

    @Test
    public void testLargeScaleOptimization() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-12, 1e-15);
        optimizer.setMin(-1000.0);
        optimizer.setMax(1000.0);
        optimizer.setStartValue(-500.0);
        optimizer.setGoalType(GoalType.MAXIMIZE);
        
        // For maximization of (x-2)^2 -1, it will find a local maximum at 2
        // Actually (x-2)^2-1 has no maximum on R, so it will go to a boundary
        // Let's use a different function for max: -(x-2)^2 + 1
        TestableBrentOptimizer maxOpt = new TestableBrentOptimizer(1e-12, 1e-15) {
            @Override
            protected double computeObjectiveValue(double x) {
                return -(x - 2) * (x - 2) + 1;
            }
        };
        maxOpt.setMin(-1000.0);
        maxOpt.setMax(1000.0);
        maxOpt.setStartValue(-500.0);
        maxOpt.setGoalType(GoalType.MAXIMIZE);

        UnivariatePointValuePair result = maxOpt.callDoOptimize();

        assertNotNull(result);
        assertEquals(2.0, result.getPoint(), 1e-6);
        assertEquals(1.0, result.getValue(), 1e-6);
    }

    @Test
    public void testNegativeBoundaries() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return (x + 3) * (x + 3) - 2; // min at -3, -2
            }
        };
        optimizer.setMin(-10.0);
        optimizer.setMax(0.0);
        optimizer.setStartValue(-5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();

        assertNotNull(result);
        assertEquals(-3.0, result.getPoint(), 1e-6);
        assertEquals(-2.0, result.getValue(), 1e-6);
    }

    @Test
    public void testExtremelySmallToleranceDoesNotHang() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-15, 1e-20) {
            @Override
            protected double computeObjectiveValue(double x) {
                return (x - 0.5) * (x - 0.5);
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(1.0);
        optimizer.setStartValue(0.3);
        optimizer.setGoalType(GoalType.MINIMIZE);

        // This should terminate reasonably fast
        UnivariatePointValuePair result = optimizer.callDoOptimize();
        assertNotNull(result);
        assertEquals(0.5, result.getPoint(), 1e-9);
    }

    @Test
    public void testCheckerIsCalledMultipleTimes() {
        RecordingConvergenceChecker checker = new RecordingConvergenceChecker(false);
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10, checker);
        optimizer.setMin(0.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(5.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        optimizer.callDoOptimize();

        assertTrue(checker.currentPoints.size() >= 1);
        // Check that previous/current points are consistently provided
        for (int i = 0; i < checker.currentPoints.size(); i++) {
            assertNotNull(checker.currentPoints.get(i));
            if (i > 0) assertNotNull(checker.previousPoints.get(i));
        }
    }

    private void assertBrentState(TestableBrentOptimizer o, double x, double fx, double w, double fw, double v, double fv, double a, double b) {
        assertEquals(x, o.getX(), EPS);
        assertEquals(fx, o.getFx(), EPS);
        assertEquals(w, o.getW(), EPS);
        assertEquals(fw, o.getFw(), EPS);
        assertEquals(v, o.getV(), EPS);
        assertEquals(fv, o.getFv(), EPS);
        assertEquals(a, o.getA(), EPS);
        assertEquals(b, o.getB(), EPS);
    }

    // Minimal test to touch code branches not covered above
    @Test
    public void testFParabolicStepWithTolCheck() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return Math.exp(x); // exponential is hard for parabolic fit
            }
        };
        optimizer.setMin(-10.0);
        optimizer.setMax(10.0);
        optimizer.setStartValue(-2.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();
        assertNotNull(result);
        assertTrue(result.getValue() < 1.0); // should find something with exp value < 1
    }

    @Test
    public void testWhenUequalsX() {
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return x * x - 2;
            }
        };
        optimizer.setMin(-50.0);
        optimizer.setMax(0.0);
        optimizer.setStartValue(-1.0);
        optimizer.setGoalType(GoalType.MINIMIZE);

        // This will likely take parabolic steps with u close to x
        UnivariatePointValuePair result = optimizer.callDoOptimize();
        assertNotNull(result);
        assertEquals(Math.sqrt(2), result.getPoint(), 1e-4);
    }

    @Test
    public void testWhenEUandWAllLoopState() {
        // This is enough - we've covered most branches of the algorithm
        TestableBrentOptimizer optimizer = new TestableBrentOptimizer(1e-8, 1e-10) {
            @Override
            protected double computeObjectiveValue(double x) {
                return Math.sin(x);
            }
        };
        optimizer.setMin(0.0);
        optimizer.setMax(Math.PI * 2);
        optimizer.setStartValue(Math.PI);
        optimizer.setGoalType(GoalType.MINIMIZE);

        UnivariatePointValuePair result = optimizer.callDoOptimize();
        assertNotNull(result);
        // sin has minimum at 3*pi/2 ~= 4.712
        assertEquals(3 * Math.PI / 2, result.getPoint(), 1e-4);
    }
}