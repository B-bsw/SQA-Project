package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;

/**
 * JUnit 4 test suite for BaseSecantSolver.
 */
public class BaseSecantSolverTest {

    private static final double EPS = 1e-8;

    // Concrete solver subclass for testing
    private static class TestSecantSolver extends BaseSecantSolver {
        TestSecantSolver(double absoluteAccuracy, Method method) {
            super(absoluteAccuracy, method);
        }

        TestSecantSolver(double relativeAccuracy, double absoluteAccuracy, Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }
    }

    private UnivariateRealFunction simpleQuadratic;
    private UnivariateRealFunction linear;
    private UnivariateRealFunction constantPositive;

    @Before
    public void setUp() {
        simpleQuadratic = new UnivariateRealFunction() {
            @Override public double value(double x) { return x * x - 4.0; }
        };
        linear = new UnivariateRealFunction() {
            @Override public double value(double x) { return x - 2.0; }
        };
        constantPositive = new UnivariateRealFunction() {
            @Override public double value(double x) { return 1.0; }
        };
    }

    @After
    public void tearDown() {
        // no cleanup
    }

    // 1. Normal case: root in interval, ANY_SIDE
    @Test
    public void testSolveAnySide() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        double root = solver.solve(100, simpleQuadratic, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 2. Root exactly at left bound
    @Test
    public void testSolveRootAtLeftBound() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.PEGASUS);
        double root = solver.solve(100, linear, 2.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 3. Root exactly at right bound
    @Test
    public void testSolveRootAtRightBound() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.REGULA_FALSI);
        double root = solver.solve(100, linear, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 4. No bracketing -> exception
    @Test(expected = IllegalArgumentException.class)
    public void testSolveNoBracketing() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        solver.solve(100, linear, 3.0, 4.0, AllowedSolution.ANY_SIDE);
    }

    // 5. Null function -> NullPointerException
    @Test(expected = NullPointerException.class)
    public void testSolveNullFunction() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        solver.solve(100, null, 1.0, 2.0, AllowedSolution.ANY_SIDE);
    }

    // 6. Solve with startValue (three-argument solve)
    @Test
    public void testSolveWithStartValue() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        double root = solver.solve(100, linear, 1.0, 3.0, 1.5, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 7. AllowedSolution.LEFT_SIDE with inverted interval
    @Test
    public void testSolveLeftSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        // f(x) = x - 2 on [1,3] -> root 2, f0 negative, f1 positive, eventually inverted? We'll just check no exception.
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.LEFT_SIDE);
        assertTrue("Root should be close to 2", Math.abs(root - 2.0) < 0.1);
    }

    // 8. AllowedSolution.RIGHT_SIDE
    @Test
    public void testSolveRightSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.PEGASUS);
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.RIGHT_SIDE);
        assertTrue("Root should be close to 2", Math.abs(root - 2.0) < 0.1);
    }

    // 9. AllowedSolution.BELOW_SIDE (function value <= 0)
    @Test
    public void testSolveBelowSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.REGULA_FALSI);
        // f(x)=x-2, at root f=0, satisfies BELOW_SIDE (f<=0)
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.BELOW_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 10. AllowedSolution.ABOVE_SIDE (function value >= 0)
    @Test
    public void testSolveAboveSide() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        // Use a function with root where f>=0 at solution, e.g., f(x)= (x-2)^2? Actually value zero. Use linear: f=0 at root => satisfies above.
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.ABOVE_SIDE);
        assertEquals(2.0, root, EPS);
    }

    // 11. Regula Falsi special case: x == x1 triggers update
    @Test
    public void testRegulaFalsiStagnation() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.REGULA_FALSI);
        // Use a function that may cause stagnation: f(x)= x^3 - 2x^2 + ...? We'll just run and verify no infinite loop.
        UnivariateRealFunction stagnationFunc = new UnivariateRealFunction() {
            @Override public double value(double x) {
                return (x - 1.0) * (x - 2.0); // roots at 1 and 2
            }
        };
        double root = solver.solve(100, stagnationFunc, 0.5, 1.5, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, root, 0.1); // may converge to 1
    }

    // 12. Test with relative and absolute accuracy constructor
    @Test
    public void testSolveWithTwoAccuracies() {
        TestSecantSolver solver = new TestSecantSolver(1e-4, 1e-8, Method.ILLINOIS);
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-4);
    }

    // 13. Test with three accuracies constructor (via AbstractUnivariateRealSolver)
    @Test
    public void testSolveWithThreeAccuracies() {
        TestSecantSolver solver = new TestSecantSolver(1e-4, 1e-8, 1e-12, Method.ILLINOIS) {};
        double root = solver.solve(100, linear, 1.0, 3.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-4);
    }

    // 14. Edge case: very tight tolerance, many iterations
    @Test
    public void testSolveHighAccuracy() {
        TestSecantSolver solver = new TestSecantSolver(1e-12, Method.ILLINOIS);
        double root = solver.solve(1000, simpleQuadratic, 0.1, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-10);
    }

    // 15. Test with a cosine function to exercise different branches
    @Test
    public void testSolveCosine() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.PEGASUS);
        UnivariateRealFunction cosFunc = new UnivariateRealFunction() {
            @Override public double value(double x) { return Math.cos(x); }
        };
        double root = solver.solve(100, cosFunc, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(Math.PI / 2.0, root, 1e-4);
    }

    // 16. Test with negative root
    @Test
    public void testSolveNegativeRoot() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        UnivariateRealFunction func = new UnivariateRealFunction() {
            @Override public double value(double x) { return x + 3.0; }
        };
        double root = solver.solve(100, func, -5.0, -1.0, AllowedSolution.ANY_SIDE);
        assertEquals(-3.0, root, EPS);
    }

    // 17. Test all three methods produce same root
    @Test
    public void testAllMethodsSameRoot() {
        double rootIllinois, rootPegasus, rootRegulaFalsi;
        TestSecantSolver solverIllinois = new TestSecantSolver(1e-8, Method.ILLINOIS);
        rootIllinois = solverIllinois.solve(100, simpleQuadratic, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        TestSecantSolver solverPegasus = new TestSecantSolver(1e-8, Method.PEGASUS);
        rootPegasus = solverPegasus.solve(100, simpleQuadratic, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        TestSecantSolver solverRegula = new TestSecantSolver(1e-8, Method.REGULA_FALSI);
        rootRegulaFalsi = solverRegula.solve(100, simpleQuadratic, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, rootIllinois, 1e-4);
        assertEquals(2.0, rootPegasus, 1e-4);
        assertEquals(2.0, rootRegulaFalsi, 1e-4);
    }

    // 18. Test that invalid method enum never reaches default case (implicitly tested)
    // No direct test needed.

    // 19. Test with function that converges to ftol before tolerance
    @Test
    public void testConvergenceViaFunctionValue() {
        // Use a function that becomes very flat near root.
        UnivariateRealFunction flatFunc = new UnivariateRealFunction() {
            @Override public double value(double x) {
                double r = x - 1.234;
                return r * r * r; // root at 1.234
            }
        };
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        double root = solver.solve(100, flatFunc, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        assertEquals(1.234, root, 1e-4);
    }

    // 20. Test with invalid interval (min > max) -> exception
    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinGreaterThanMax() {
        TestSecantSolver solver = new TestSecantSolver(1e-8, Method.ILLINOIS);
        solver.solve(100, linear, 3.0, 1.0, AllowedSolution.ANY_SIDE);
    }
}