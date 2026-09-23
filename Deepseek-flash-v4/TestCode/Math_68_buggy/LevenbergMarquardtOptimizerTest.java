package org.apache.commons.math.optimization.general;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;

public class LevenbergMarquardtOptimizerTest {

    private LevenbergMarquardtOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(100);
    }

    @Test
    public void testLinearTwoParameters()
            throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{p[0] + p[1], p[0] - p[1]};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{1, 1}, {1, -1}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{2.0, 0.0});
        optimizer.setWeight(new double[]{1.0, 1.0});
        VectorialPointValuePair result =
                optimizer.optimize(new double[]{0.0, 0.0});
        assertNotNull(result);
        double[] point = result.getPoint();
        assertEquals(1.0, point[0], 1.0e-10);
        assertEquals(1.0, point[1], 1.0e-10);
    }

    @Test
    public void testOneParameterOneObservation()
            throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{p[0]};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{1.0}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{5.0});
        optimizer.setWeight(new double[]{1.0});
        VectorialPointValuePair result =
                optimizer.optimize(new double[]{0.0});
        assertNotNull(result);
        assertEquals(5.0, result.getPoint()[0], 1.0e-10);
    }

    @Test
    public void testSingularJacobian()
            throws FunctionEvaluationException, OptimizationException {
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{p[0] + p[1], 2.0 * p[0] + 2.0 * p[1]};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{1, 1}, {2, 2}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{3.0, 6.0});
        optimizer.setWeight(new double[]{1.0, 1.0});
        VectorialPointValuePair result =
                optimizer.optimize(new double[]{0.5, 0.5});
        assertNotNull(result);
        double sum = result.getPoint()[0] + result.getPoint()[1];
        assertEquals(3.0, sum, 1.0e-8);
    }

    @Test(expected = OptimizationException.class)
    public void testCostRelativeToleranceTooSmall()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setCostRelativeTolerance(2.2204e-16);
        optimizer.setParRelativeTolerance(2.2204e-16);
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{1.0};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{0.0, 0.0}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{1.0});
        optimizer.setWeight(new double[]{1.0});
        optimizer.optimize(new double[]{0.0, 0.0});
    }

    @Test(expected = OptimizationException.class)
    public void testParRelativeToleranceTooSmall()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setCostRelativeTolerance(2.2204e-16);
        optimizer.setParRelativeTolerance(2.2204e-16);
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{1.0, 2.0};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{1.0, 0.0}, {0.0, 1.0}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{1.0, 2.0});
        optimizer.setWeight(new double[]{1.0, 1.0});
        optimizer.optimize(new double[]{0.0, 0.0});
    }

    @Test(expected = OptimizationException.class)
    public void testOrthogonalityToleranceTooSmall()
            throws FunctionEvaluationException, OptimizationException {
        optimizer.setOrthoTolerance(2.2204e-16);
        DifferentiableMultivariateVectorialFunction func =
                new DifferentiableMultivariateVectorialFunction() {
                    public double[] value(double[] p) {
                        return new double[]{p[0] + p[1]};
                    }
                    public MultivariateMatrixFunction jacobian() {
                        return new MultivariateMatrixFunction() {
                            public double[][] value(double[] p) {
                                return new double[][]{{1.0, 1.0}};
                            }
                        };
                    }
                };
        optimizer.setObjective(func);
        optimizer.setTarget(new double[]{0.0});
        optimizer.setWeight(new double[]{1.0});
        optimizer.optimize(new double[]{1.0, -1.0});
    }

    @Test
    public void testSetInitialStepBoundFactor() {
        optimizer.setInitialStepBoundFactor(50.0);
    }

    @Test
    public void testSetCostRelativeTolerance() {
        optimizer.setCostRelativeTolerance(1.0e-8);
    }

    @Test
    public void testSetParRelativeTolerance() {
        optimizer.setParRelativeTolerance(1.0e-8);
    }

    @Test
    public void testSetOrthoTolerance() {
        optimizer.setOrthoTolerance(1.0e-8);
    }
}