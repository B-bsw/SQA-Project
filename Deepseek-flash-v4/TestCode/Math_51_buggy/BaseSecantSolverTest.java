package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method;

public class BaseSecantSolverTest {

    private static final double EPSILON = 1e-10;
    private static final double ABS_ACCURACY = 1e-6;
    private static final double REL_ACCURACY = 1e-14;
    private static final double FUNC_VALUE_ACCURACY = 1e-15;

    // Test implementation that exposes protected methods/fields for testing
    private static class TestSecantSolver extends BaseSecantSolver {
        protected TestSecantSolver(double absoluteAccuracy, Method method) {
            super(absoluteAccuracy, method);
        }

        protected TestSecantSolver(double relativeAccuracy, double absoluteAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        protected TestSecantSolver(double relativeAccuracy, double absoluteAccuracy,
                                   double functionValueAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }

        public double callDoSolve() {
            return doSolve();
        }

        public void setMinMax(double min, double max) {
            this.min = min;
            this.max = max;
            this.x0 = min;
            this.x1 = max;
            this.f0 = computeObjectiveValue(min);
            this.f1 = computeObjectiveValue(max);
        }

        public void setInverted(boolean inv) {
            this.inverted = inv;
        }

        public boolean isInverted() {
            return this.inverted;
        }
    }

    private TestSecantSolver solver;

    @Before
    public void setUp() {
        solver = new TestSecantSolver(ABS_ACCURACY, Method.REGULA_FALSI);
        solver.setMaxEvaluations(1000);
        solver.setFunctionValueAccuracy(FUNC_VALUE_ACCURACY);
    }

    // Test: Solve with linear function f(x)=x-2, root at x=2
    @Test
    public void testSolveLinearFunction() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        solver.setMinMax(0.0, 5.0);
        double result = solver.solve(100, f, 0.0, 5.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-5);
    }

    // Test: Solve with quadratic function (x-1)^2 - 1, roots at x=0 and x=2
    @Test
    public void testSolveQuadratic() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0) - 1.0;
            }
        };
        solver.setMinMax(-1.0, 3.0);
        double result = solver.solve(100, f, -1.0, 3.0, 0.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, result, 1e-5);
    }

    // Test: Root at left bound - exact root at min
    @Test
    public void testSolveRootAtMinBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.setMinMax(0.0, 5.0);
        double result = solver.solve(100, f, 0.0, 5.0, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, result, 1e-10);
    }

    // Test: Root at right bound - exact root at max
    @Test
    public void testSolveRootAtMaxBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3.0;
            }
        };
        solver.setMinMax(0.0, 3.0);
        double result = solver.solve(100, f, 3.0, 5.0, 4.0, AllowedSolution.ANY_SIDE);
        assertEquals(3.0, result, 1e-10);
    }

    // Test: Solve with exact root at start value
    @Test
    public void testSolveExactRootAtStart() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 4.0;
            }
        };
        solver.setMinMax(0.0, 10.0);
        double result = solver.solve(100, f, 0.0, 10.0, 4.0, AllowedSolution.ANY_SIDE);
        assertEquals(4.0, result, 1e-10);
    }

    // Test: LEFT_SIDE allowed solution
    @Test
    public void testSolveLeftSide() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        solver.setMinMax(0.0, 5.0);
        double result = solver.solve(100, f, 0.0, 5.0, 1.0, AllowedSolution.LEFT_SIDE);
        // It should return the left bound (0.0) since allowed is LEFT_SIDE and not inverted
        assertTrue(result <= 2.0 + 1e-6);
    }

    // Test: RIGHT_SIDE allowed solution
    @Test
    public void testSolveRightSide() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        solver.setMinMax(0.0, 5.0);
        double result = solver.solve(100, f, 0.0, 5.0, 1.0, AllowedSolution.RIGHT_SIDE);
        assertTrue(result >= 2.0 - 1e-6);
    }

    // Test: BELOW_SIDE when f(x) <= 0 returns x1
    @Test
    public void testSolveBelowSide() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0; // f(0) = -2, f(5)=3
            }
        };
        solver.setMinMax(0.0, 5.0);
        double result = solver.solve(100, f, 0.0, 5.0, 2.5, AllowedSolution.BELOW_SIDE);
        assertTrue(result <= 2.0 + 1e-6); // Since f(x1) <= 0, returns x1
    }

    // Test: ABOVE_SIDE when f(x) >= 0 returns x1
    @Test
    public void testSolveAboveSide() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 2.0; // f(0)=2, f(-5)=-3
            }
        };
        solver.setMinMax(-5.0, 0.0);
        double result = solver.solve(100, f, -5.0, 0.0, -1.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(result >= -2.0 - 1e-6);
    }

    // Test: DoSolve with inverted interval
    @Test
    public void testDoSolveInverted() {
        final TestSecantSolver invertSolver = new TestSecantSolver(ABS_ACCURACY, Method.REGULA_FALSI);
        invertSolver.setInverted(true);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3.0;
            }
        };
        invertSolver.setMinMax(0.0, 5.0);
        double result = invertSolver.solve(100, f, 0.0, 5.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(3.0, result, 1e-5);
    }

    // Test: ILLINOIS method - handles f0 *= 0.5 case
    @Test
    public void testIllinoisMethod() {
        TestSecantSolver illSolver = new TestSecantSolver(ABS_ACCURACY, Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.5;
            }
        };
        illSolver.setMinMax(0.0, 1.0);
        double result = illSolver.solve(100, f, 0.0, 1.0, 0.8, AllowedSolution.ANY_SIDE);
        assertEquals(0.5, result, 1e-5);
    }

    // Test: PEGASUS method
    @Test
    public void testPegasusMethod() {
        TestSecantSolver pegSolver = new TestSecantSolver(ABS_ACCURACY, Method.PEGASUS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.5;
            }
        };
        pegSolver.setMinMax(0.0, 3.0);
        double result = pegSolver.solve(100, f, 0.0, 3.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.5, result, 1e-5);
    }

    // Test: Function with multiple roots - we get one of them
    @Test
    public void testMultipleRoots() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1) * (x - 2) * (x - 3); // roots at 1,2,3
            }
        };
        solver.setMinMax(0.0, 4.0);
        double result = solver.solve(100, f, 0.0, 4.0, 0.5, AllowedSolution.ANY_SIDE);
        assertTrue(Math.abs(result - 1) < 1e-5 || Math.abs(result - 2) < 1e-5 || Math.abs(result - 3) < 1e-5);
    }

    // Test: Constant function - no root (should not converge)
    @Test
    public void testNonBracketing() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 5.0; // always positive, no root
            }
        };
        solver.setMinMax(0.0, 1.0);
        try {
            solver.solve(100, f, 0.0, 1.0, 0.5, AllowedSolution.ANY_SIDE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test: Zero tolerance - exact root
    @Test
    public void testZeroTolerance() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.setMinMax(-1.0, 1.0);
        double result = solver.solve(100, f, -1.0, 1.0, 0.5, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, result, 0.0);
    }

    // Test: Small interval tolerance - returns X when within tolerance
    @Test
    public void testSmallIntervalTolerance() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        solver.setMinMax(0.9, 1.1);
        solver.setRelativeAccuracy(1e-3);
        solver.setAbsoluteAccuracy(1e-3);
        double result = solver.solve(100, f, 0.9, 1.1, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-3);
    }

    // Test: Function value too small - returns x1
    @Test
    public void testFunctionValueAccuracy() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.5;
            }
        };
        TestSecantSolver smallSolver = new TestSecantSolver(ABS_ACCURACY, Method.REGULA_FALSI);
        smallSolver.setFunctionValueAccuracy(1e-3);
        smallSolver.setMinMax(0.0, 1.0);
        double result = smallSolver.solve(100, f, 0.0, 1.0, 0.7, AllowedSolution.ANY_SIDE);
        assertTrue(Math.abs(result - 0.5) < 1e-3);
    }
}