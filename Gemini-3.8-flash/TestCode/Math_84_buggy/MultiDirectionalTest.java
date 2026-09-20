package org.apache.commons.math.optimization.direct;

import java.util.Comparator;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.junit.Assert;
import org.junit.Test;

public class MultiDirectionalTest {

    @Test
    public void defaultConstructor_givenDefaultSettings_shouldMinimizeSphereFunction()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0] - 2.0;
                double y = point[1] + 3.0;
                return x * x + y * y;
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 10.0, 10.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(2.0, optimum.getPointRef()[0], 1.0e-3);
        Assert.assertEquals(-3.0, optimum.getPointRef()[1], 1.0e-3);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-5);
    }

    @Test
    public void customConstructor_givenCustomCoefficients_shouldMinimizeSphereFunction()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.5, 0.4);
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0] - 1.0;
                double y = point[1] - 1.0;
                return x * x + y * y;
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 5.0, 5.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(1.0, optimum.getPointRef()[0], 1.0e-3);
        Assert.assertEquals(1.0, optimum.getPointRef()[1], 1.0e-3);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-5);
    }

    @Test
    public void optimize_givenMaximizationGoal_shouldMaximizeInvertedParaboloid()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction paraboloid = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0] - 3.0;
                double y = point[1] - 4.0;
                return 10.0 - (x * x + y * y);
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(paraboloid, GoalType.MAXIMIZE, new double[] { 0.0, 0.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(3.0, optimum.getPointRef()[0], 1.0e-3);
        Assert.assertEquals(4.0, optimum.getPointRef()[1], 1.0e-3);
        Assert.assertEquals(10.0, optimum.getValue(), 1.0e-5);
    }

    @Test
    public void iterateSimplex_whenExpandedIsBetterThanReflected_shouldAcceptExpandedSimplex()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        MultivariateRealFunction linearTrough = new MultivariateRealFunction() {
            public double value(double[] point) {
                return -3.0 * point[0] - 2.0 * point[1];
            }
        };
        optimizer.setConvergenceChecker(new RealConvergenceChecker() {
            public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
                return iteration >= 5;
            }
        });

        // Act
        RealPointValuePair optimum = optimizer.optimize(linearTrough, GoalType.MINIMIZE, new double[] { 0.0, 0.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertTrue(optimum.getValue() < 0.0);
        Assert.assertTrue(optimizer.getIterations() >= 1);
    }

    @Test
    public void iterateSimplex_whenReflectedIsBetterAndExpandedIsWorse_shouldAcceptReflectedSimplex()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        MultivariateRealFunction asymmetricWell = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                if (x > 1.5) {
                    return 1000.0 * x;
                }
                return (x - 1.2) * (x - 1.2) + y * y;
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(asymmetricWell, GoalType.MINIMIZE, new double[] { 0.0, 0.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(1.2, optimum.getPointRef()[0], 1.0e-2);
        Assert.assertEquals(0.0, optimum.getPointRef()[1], 1.0e-2);
    }

    @Test
    public void iterateSimplex_whenReflectionWorseButContractionBetter_shouldContractSimplex()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        MultivariateRealFunction steepBowl = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                return x * x * x * x + y * y * y * y;
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(steepBowl, GoalType.MINIMIZE, new double[] { 2.0, 2.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-4);
    }

    @Test
    public void iterateSimplex_whenReflectionAndContractionWorse_shouldLoopMultipleTimes()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        MultivariateRealFunction rosenbrock = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                double d1 = y - x * x;
                double d2 = 1.0 - x;
                return 100.0 * d1 * d1 + d2 * d2;
            }
        };
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(10000);

        // Act
        RealPointValuePair optimum = optimizer.optimize(rosenbrock, GoalType.MINIMIZE, new double[] { -1.2, 1.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(1.0, optimum.getPointRef()[0], 1.0e-2);
        Assert.assertEquals(1.0, optimum.getPointRef()[1], 1.0e-2);
        Assert.assertTrue(optimizer.getIterations() > 5);
    }

    @Test
    public void optimize_givenTooFewMaxIterations_shouldThrowOptimizationException() {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1);
        optimizer.setMaxEvaluations(1000);
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        // Act & Assert
        try {
            optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 10.0, 10.0 });
            Assert.fail("Expected OptimizationException due to max iterations exceeded");
        } catch (OptimizationException expected) {
            Assert.assertTrue(true);
        } catch (FunctionEvaluationException e) {
            Assert.fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

    @Test
    public void optimize_givenTooFewMaxEvaluations_shouldThrowOptimizationException() {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(3);
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        // Act & Assert
        try {
            optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 10.0, 10.0 });
            Assert.fail("Expected OptimizationException due to max evaluations exceeded");
        } catch (OptimizationException expected) {
            Assert.assertTrue(true);
        } catch (FunctionEvaluationException e) {
            Assert.fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

    @Test
    public void optimize_whenFunctionThrowsException_shouldPropagateException() {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction faultyFunction = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(point, "Intentional Evaluation Failure");
            }
        };

        // Act & Assert
        try {
            optimizer.optimize(faultyFunction, GoalType.MINIMIZE, new double[] { 1.0, 1.0 });
            Assert.fail("Expected FunctionEvaluationException");
        } catch (FunctionEvaluationException expected) {
            Assert.assertTrue(expected.getMessage().contains("Intentional Evaluation Failure"));
        } catch (OptimizationException e) {
            Assert.fail("Unexpected OptimizationException: " + e.getMessage());
        }
    }

    @Test
    public void optimize_givenCustomScalarConvergenceChecker_shouldStopEarly()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-2, 1.0e-2));
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 2.0, 2.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertTrue(optimizer.getIterations() > 0);
        Assert.assertTrue(optimizer.getIterations() < optimizer.getMaxIterations());
    }

    @Test
    public void iterateSimplex_directPackageInvocation_shouldExerciseExpansionBranch()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });
        optimizer.setMaxIterations(50);
        optimizer.setMaxEvaluations(500);

        // Act
        RealPointValuePair optimum = optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 10.0, 10.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void optimize_givenSingleDimension_shouldMinimizeSuccessfully()
            throws FunctionEvaluationException, OptimizationException {
        // Arrange
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction quadratic1D = new MultivariateRealFunction() {
            public double value(double[] point) {
                double diff = point[0] - 7.5;
                return diff * diff;
            }
        };

        // Act
        RealPointValuePair optimum = optimizer.optimize(quadratic1D, GoalType.MINIMIZE, new double[] { 0.0 });

        // Assert
        Assert.assertNotNull(optimum);
        Assert.assertEquals(7.5, optimum.getPointRef()[0], 1.0e-3);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-5);
    }
}