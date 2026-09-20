package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Complete JUnit Test Suite for {@link BisectionSolver}.
 * Designed for Java 1.4 / Java 7 compatibility and maximum branch coverage.
 */
public class BisectionSolverTest {

    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1E-6;

    @Test
    public void solve_givenDeprecatedConstructorAndMinMax_shouldFindRoot() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        BisectionSolver solver = new BisectionSolver(f);

        // Act
        double result = solver.solve(1.0, 3.0);

        // Assert
        Assert.assertEquals(2.0, result, DEFAULT_ABSOLUTE_ACCURACY);
        Assert.assertEquals(2.0, solver.getResult(), DEFAULT_ABSOLUTE_ACCURACY);
        Assert.assertTrue(solver.getIterationCount() > 0);
    }

    @Test
    public void solve_givenDeprecatedConstructorAndMinMaxInitial_shouldFindRoot() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x * x) - 4.0;
            }
        };
        BisectionSolver solver = new BisectionSolver(f);

        // Act
        double result = solver.solve(0.0, 5.0, 1.0);

        // Assert
        Assert.assertEquals(2.0, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenDefaultConstructorAndFunctionMinMax_shouldFindRoot() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act
        double result = solver.solve(f, 3.0, 4.0);

        // Assert
        Assert.assertEquals(Math.PI, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenRootInUpperHalfInterval_shouldBranchMinEqualsMidpoint() throws Exception {
        // Arrange
        // Root is at 0.75; in [0.0, 1.0], midpoint is 0.5.
        // f(0.0) = -0.75, f(0.5) = -0.25 -> fm * fmin = 0.1875 > 0 -> min becomes m (0.5)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.75;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act
        double result = solver.solve(f, 0.0, 1.0);

        // Assert
        Assert.assertEquals(0.75, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenRootInLowerHalfInterval_shouldBranchMaxEqualsMidpoint() throws Exception {
        // Arrange
        // Root is at 0.25; in [0.0, 1.0], midpoint is 0.5.
        // f(0.0) = -0.25, f(0.5) = 0.25 -> fm * fmin = -0.0625 <= 0 -> max becomes m (0.5)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.25;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act
        double result = solver.solve(f, 0.0, 1.0);

        // Assert
        Assert.assertEquals(0.25, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenExactRootAtMidpoint_shouldConvergeViaElseBranch() throws Exception {
        // Arrange
        // Root is exactly at midpoint 0.0 in interval [-1.0, 1.0].
        // f(0.0) = 0.0 -> fm * fmin = 0.0 -> enters else branch (max = m)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act
        double result = solver.solve(f, -1.0, 1.0);

        // Assert
        Assert.assertEquals(0.0, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenIntervalAlreadyWithinAbsoluteAccuracy_shouldReturnImmediately() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.05;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        solver.setAbsoluteAccuracy(0.5);

        // Act: interval width is 0.2, which is <= 0.5 on the very first iteration
        double result = solver.solve(f, 1.0, 1.2);

        // Assert
        Assert.assertEquals(1.1, result, 1E-6);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void solve_givenMinEqualsMax_shouldThrowIllegalArgumentException() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act & Assert
        try {
            solver.solve(f, 2.0, 2.0);
            Assert.fail("Expected IllegalArgumentException when min == max");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }

    @Test
    public void solve_givenMinGreaterThanMax_shouldThrowIllegalArgumentException() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act & Assert
        try {
            solver.solve(f, 5.0, 2.0);
            Assert.fail("Expected IllegalArgumentException when min > max");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }

    @Test
    public void solve_givenMaximalIterationCountExceeded_shouldThrowMaxIterationsExceededException() throws Exception {
        // Arrange
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 0.3333333333333333;
            }
        };
        BisectionSolver solver = new BisectionSolver();
        solver.setMaximalIterationCount(2);
        solver.setAbsoluteAccuracy(1E-15);

        // Act & Assert
        try {
            solver.solve(f, 0.0, 1.0);
            Assert.fail("Expected MaxIterationsExceededException when iterations exceeded");
        } catch (MaxIterationsExceededException ex) {
            Assert.assertEquals(2, ex.getMaximalIterationCount());
        }
    }

    @Test
    public void solve_givenFunctionEvaluationException_shouldPropagateException() throws Exception {
        // Arrange
        final FunctionEvaluationException fee = new FunctionEvaluationException(0.5, "Evaluation error simulated");
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                if (x > 0.1) {
                    throw fee;
                }
                return -1.0;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act & Assert
        try {
            solver.solve(f, 0.0, 1.0);
            Assert.fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException ex) {
            Assert.assertSame(fee, ex);
        }
    }

    @Test
    public void solve_givenSolverWithFunctionAndSolveWithInitial_shouldUseInternalFunction() throws Exception {
        // Arrange
        // The 4-argument solve(f, min, max, initial) delegates to solve(min, max),
        // which delegates to solve(this.f, min, max).
        UnivariateRealFunction internalFunction = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 4.0;
            }
        };
        UnivariateRealFunction dummyFunction = new UnivariateRealFunction() {
            public double value(double x) {
                return x + 100.0;
            }
        };
        BisectionSolver solver = new BisectionSolver(internalFunction);

        // Act
        double result = solver.solve(dummyFunction, 3.0, 5.0, 3.5);

        // Assert
        Assert.assertEquals(4.0, result, DEFAULT_ABSOLUTE_ACCURACY);
    }

    @Test
    public void solve_givenDefaultConstructorAndSolveWithInitial_shouldThrowNullPointerException() throws Exception {
        // Arrange
        // When constructed with default constructor, this.f is null.
        // solve(f, min, max, initial) calls solve(min, max) which uses this.f (null).
        UnivariateRealFunction dummyFunction = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        BisectionSolver solver = new BisectionSolver();

        // Act & Assert
        try {
            solver.solve(dummyFunction, 0.0, 1.0, 0.5);
            Assert.fail("Expected NullPointerException because solve(f, min, max, initial) delegates to solve(min, max) without storing f");
        } catch (NullPointerException ex) {
            // Expected behavior given the legacy implementation
        }
    }
}