package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.util.Precision;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LevenbergMarquardtOptimizerTest {

    private static final double[] X = {1.0, 2.0, 3.0, 4.0};
    private static final double[] Y = {2.0, 4.0, 6.0, 8.0};

    private static MultivariateVectorFunction linearModel() {
        return new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                final double[] result = new double[X.length];
                for (int i = 0; i < X.length; i++) {
                    result[i] = p[0] * X[i] + p[1];
                }
                return result;
            }
        };
    }

    private static MultivariateMatrixFunction linearJacobian() {
        return new MultivariateMatrixFunction() {
            public double[][] value(double[] p) {
                final double[][] jac = new double[X.length][2];
                for (int i = 0; i < X.length; i++) {
                    jac[i][0] = X[i];
                    jac[i][1] = 1.0;
                }
                return jac;
            }
        };
    }

    @Test
    public void testDefaultConstructorInitialState() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        assertNotNull(optimizer);
        assertEquals(0, optimizer.getIterations());
        assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testConstructorWithChecker() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(
            100,
            new ConvergenceChecker<PointVectorValuePair>() {
                public boolean converged(int iteration,
                                         PointVectorValuePair previous,
                                         PointVectorValuePair current) {
                    return true;
                }
            },
            1e-10,
            1e-10,
            1e-10,
            Precision.SAFE_MIN);

        assertNotNull(optimizer);
    }

    @Test
    public void testLinearFitting() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        final double[] weights = new double[X.length];
        Arrays.fill(weights, 1.0);

        final PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new Target(Y),
            new Weight(weights),
            new InitialGuess(new double[] {1.0, 1.0}),
            new ModelFunction(linearModel()),
            new ModelFunctionJacobian(linearJacobian()));

        assertNotNull(result);

        final double[] point = result.getPoint();
        assertEquals(2.0, point[0], 1e-6);
        assertEquals(0.0, point[1], 1e-6);

        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testEarlyConvergenceStopsOptimization() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(
            100,
            new ConvergenceChecker<PointVectorValuePair>() {
                public boolean converged(int iteration,
                                         PointVectorValuePair previous,
                                         PointVectorValuePair current) {
                    return true;
                }
            },
            1e-10,
            1e-10,
            1e-10,
            Precision.SAFE_MIN);

        final double[] weights = new double[X.length];
        Arrays.fill(weights, 1.0);

        final PointVectorValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new Target(Y),
            new Weight(weights),
            new InitialGuess(new double[] {1.0, 1.0}),
            new ModelFunction(linearModel()),
            new ModelFunctionJacobian(linearJacobian()));

        assertNotNull(result);
        assertTrue(optimizer.getIterations() > 0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchThrows() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        final double[] badTarget = {1.0, 2.0, 3.0};
        final double[] weights = {1.0, 1.0, 1.0, 1.0};

        optimizer.optimize(
            new MaxEval(100),
            new Target(badTarget),
            new Weight(weights),
            new InitialGuess(new double[] {1.0, 1.0}),
            new ModelFunction(linearModel()),
            new ModelFunctionJacobian(linearJacobian()));
    }
}