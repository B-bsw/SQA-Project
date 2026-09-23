package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.junit.Before;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathInternalError;
import org.apache.commons.math.util.FastMath;
import static org.junit.Assert.*;

public class BaseSecantSolverTest {

    private static final double EPS = 1e-9;

    private BaseSecantSolver solver;

    // Test implementation of abstract solver with a simple quadratic function
    private static class TestSolver extends BaseSecantSolver {
        public TestSolver(double absoluteAccuracy, Method method) {
            super(absoluteAccuracy, method);
        }

        public TestSolver(double relativeAccuracy, double absoluteAccuracy, double functionValueAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }

        @Override
        protected double doSolve() {
            // Simple quadratic function: (x - 2)^2 - 1, roots at x = 1 and x = 3
            double x0 = getMin();
            double x1 = getMax();
            double f0 = computeObjectiveValue(x0);
            double f1 = computeObjectiveValue(x1);
            
            if (f0 == 0.0) return x0;
            if (f1 == 0.0) return x1;
            
            double inverted = false;
            while (true) {
                double x = x1 - ((f1 * (x1 - x0)) / (f1 - f0));
                double fx = computeObjectiveValue(x);
                
                if (FastMath.abs(fx) < getFunctionValueAccuracy()) {
                    return x;
                }
                
                if (f1 * fx < 0) {
                    x0 = x1;
                    f0 = f1;
                    inverted = !inverted;
                } else {
                    x0 = x;
                    f0 = fx;
                }
                
                if (FastMath.abs(x1 - x0) < getAbsoluteAccuracy()) {
                    return (x0 + x1) / 2.0;
                }
                
                x1 = x;
                f1 = fx;
            }
        }
    }

    @Before
    public void setUp() {
        solver = new TestSolver(1e-6, Method.REGULA_FALSI);
    }

    @Test
    public void testSolveWithQuadraticFunction() {
        // Function: (x - 2)^2 - 1, root at x = 1 or x = 3
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        double result = solver.solve(100, f, 0, 2.5, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithLinearFunction() {
        // Function: 2x - 4, root at x = 2
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2 * x - 4;
            }
        };
        
        double result = solver.solve(100, f, 0, 5, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveRootAtBoundary() {
        // Function: x - 3, root at x = 3 (right boundary)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 3;
            }
        };
        
        double result = solver.solve(100, f, 0, 3, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(3.0, result, 1e-6);
    }

    @Test
    public void testSolveWithLeftSideAllowed() {
        // Function: (x - 2)^2 - 1, root at x = 1 or x = 3
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        double result = solver.solve(100, f, 0, 2.5, 1.0, AllowedSolution.LEFT_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithRightSideAllowed() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        double result = solver.solve(100, f, 0, 2.5, 1.0, AllowedSolution.RIGHT_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithBelowSideAllowed() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        double result = solver.solve(100, f, 0, 2.5, 1.0, AllowedSolution.BELOW_SIDE);
        assertTrue(result >= 0.9999 && result <= 1.0001);
    }

    @Test
    public void testSolveWithAboveSideAllowed() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        double result = solver.solve(100, f, 0, 2.5, 1.0, AllowedSolution.ABOVE_SIDE);
        assertTrue(result >= 0.9999 && result <= 1.0001);
    }

    @Test(expected = ConvergenceException.class)
    public void testSolveNonConvergentFunction() {
        // Function that doesn't cross zero in the interval
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1;
            }
        };
        
        solver.solve(100, f, 0, 10, 1.0, AllowedSolution.ANY_SIDE);
        fail("Should throw ConvergenceException");
    }

    @Test
    public void testSolveWithExactRootAtStart() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1;
            }
        };
        
        double result = solver.solve(100, f, 1, 2, 1.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithBoundaryAndAllowedSolutions() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2) * (x - 2) - 1;
            }
        };
        
        // Test with exact root at boundary
        double result = solver.solve(100, f, 1.0, 2.0, 1.5, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveWithLinearAndBoundary() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2 * x - 4;
            }
        };
        
        double result = solver.solve(100, f, 2.0, 5.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, result, 1e-6);
    }
}