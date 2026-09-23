package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GaussNewtonOptimizerTest {

    private static class TestConvergenceChecker implements ConvergenceChecker<PointVectorValuePair> {
        private final int maxIterations;
        private int iterationCount = 0;

        TestConvergenceChecker(int maxIterations) {
            this.maxIterations = maxIterations;
        }

        @Override
        public boolean converged(int iteration, PointVectorValuePair previous, PointVectorValuePair current) {
            iterationCount++;
            return iteration >= maxIterations;
        }

        int getIterationCount() {
            return iterationCount;
        }
    }

    private static class TestOptimizer extends GaussNewtonOptimizer {
        private double[] target;
        private double[] startPoint;
        private double[] objective;
        private double[][] jacobian;
        private double[] residuals;
        private int nR;
        private int nC;

        TestOptimizer(boolean useLU, ConvergenceChecker<PointVectorValuePair> checker) {
            super(useLU, checker);
        }

        void setData(double[] target, double[] startPoint, double[] objective, double[][] jacobian) {
            this.target = target;
            this.startPoint = startPoint;
            this.objective = objective;
            this.jacobian = jacobian;
            this.nR = target.length;
            this.nC = startPoint.length;
            this.residuals = new double[nR];
            for (int i = 0; i < nR; i++) {
                residuals[i] = objective[i] - target[i];
            }
        }

        @Override
        public double[] getTarget() {
            return target;
        }

        @Override
        public double[] getStartPoint() {
            return startPoint;
        }

        @Override
        public RealMatrix getWeight() {
            return new Array2DRowRealMatrix(nR, nR);
        }

        @Override
        public double[] computeObjectiveValue(double[] point) {
            return objective;
        }

        @Override
        public double[] computeResiduals(double[] objective) {
            return residuals;
        }

        @Override
        public RealMatrix computeWeightedJacobian(double[] point) {
            return new Array2DRowRealMatrix(jacobian);
        }

        @Override
        protected double computeCost(double[] residuals) {
            double cost = 0;
            for (double r : residuals) {
                cost += r * r;
            }
            return cost;
        }

        @Override
        public PointVectorValuePair optimize(OptimizationData... optData) {
            // Simplified optimization for testing
            return doOptimize();
        }
    }

    private TestOptimizer optimizer;
    private final double[] target = {1.0, 2.0, 3.0};
    private final double[] startPoint = {0.0, 0.0};
    private final double[] objective = {0.5, 1.5, 2.5};
    private final double[][] jacobian = {
        {1.0, 0.5},
        {0.0, 1.0},
        {0.5, 0.5}
    };

    @Before
    public void setUp() {
        optimizer = new TestOptimizer(true, new TestConvergenceChecker(10));
        optimizer.setData(target, startPoint, objective, jacobian);
    }

    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testConstructorWithDefaultUseLU() {
        GaussNewtonOptimizer opt = new GaussNewtonOptimizer(new TestConvergenceChecker(5));
        assertNotNull(opt);
        assertTrue(opt.isUseLU());
    }

    @Test
    public void testConstructorWithUseLUFalse() {
        GaussNewtonOptimizer opt = new GaussNewtonOptimizer(false, new TestConvergenceChecker(5));
        assertNotNull(opt);
        assertFalse(opt.isUseLU());
    }

    @Test
    public void testNullCheckerThrowsException() {
        GaussNewtonOptimizer opt = new GaussNewtonOptimizer(true, null);
        try {
            opt.doOptimize();
            fail("Expected NullArgumentException");
        } catch (NullArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testBoundedOptimizationThrowsUnsupportedOperation() {
        final double[] lb = { -10.0 };
        final double[] ub = { 10.0 };
        final double[] start = { 0.0 };
        final double[] target = { 1.0 };
        final double[] objective = { 1.2 };
        final double[][] jac = { {1.0} };
        
        TestOptimizer opt = new TestOptimizer(true, new TestConvergenceChecker(5)) {
            @Override
            public double[] getLowerBound() {
                return lb;
            }
            
            @Override
            public double[] getUpperBound() {
                return ub;
            }
            
            @Override
            public double[] getStartPoint() {
                return start;
            }
            
            @Override
            public double[] getTarget() {
                return target;
            }
            
            @Override
            public double[] computeObjectiveValue(double[] point) {
                return objective;
            }
            
            @Override
            public RealMatrix computeWeightedJacobian(double[] point) {
                return new Array2DRowRealMatrix(jac);
            }
            
            @Override
            public double[] computeResiduals(double[] objective) {
                double[] res = new double[objective.length];
                for (int i = 0; i < objective.length; i++) {
                    res[i] = objective[i] - target[i];
                }
                return res;
            }
            
            @Override
            protected double computeCost(double[] residuals) {
                double cost = 0;
                for (double r : residuals) {
                    cost += r * r;
                }
                return cost;
            }
        };
        
        try {
            opt.optimize();
            fail("Expected MathUnsupportedOperationException");
        } catch (MathUnsupportedOperationException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testOptimizationLUDecomposition() {
        // Setup data for a simple least squares problem
        final double[] t = {1.0, 2.0, 3.0};
        final double[] s = {1.0, 1.0};
        final double[] obj = {1.0, 2.0, 3.0};
        final double[][] jac = {
            {1.0, 0.0},
            {0.0, 1.0},
            {1.0, 0.0}
        };
        
        TestOptimizer opt = new TestOptimizer(true, new TestConvergenceChecker(10));
        opt.setData(t, s, obj, jac);
        
        PointVectorValuePair result = opt.optimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertNotNull(point);
        assertEquals(s.length, point.length);
    }

    @Test
    public void testOptimizationQRDecomposition() {
        final double[] t = {1.0, 2.0, 3.0};
        final double[] s = {1.0, 1.0};
        final double[] obj = {1.0, 2.0, 3.0};
        final double[][] jac = {
            {1.0, 0.0},
            {0.0, 1.0},
            {1.0, 0.0}
        };
        
        TestOptimizer opt = new TestOptimizer(false, new TestConvergenceChecker(10));
        opt.setData(t, s, obj, jac);
        
        PointVectorValuePair result = opt.optimize();
        assertNotNull(result);
        double[] point = result.getPoint();
        assertNotNull(point);
        assertEquals(s.length, point.length);
    }

    @Test
    public void testConvergenceAfterZeroIterations() {
        final double[] t = {1.0, 2.0, 3.0};
        final double[] s = {1.0, 1.0};
        final double[] obj = {1.0, 2.0, 3.0};
        final double[][] jac = {
            {1.0, 0.0},
            {0.0, 1.0},
            {1.0, 0.0}
        };
        
        TestConvergenceChecker checker = new TestConvergenceChecker(0);
        TestOptimizer opt = new TestOptimizer(true, checker);
        opt.setData(t, s, obj, jac);
        
        PointVectorValuePair result = opt.optimize();
        assertNotNull(result);
    }

    @Test
    public void testSingularMatrixThrowsConvergence() {
        final double[] t = {1.0, 2.0, 3.0};
        final double[] s = {1.0, 1.0};
        final double[] obj = {1.0, 2.0, 3.0};
        final double[][] jac = {
            {0.0, 0.0},
            {0.0, 0.0},
            {0.0, 0.0}
        };
        
        TestOptimizer opt = new TestOptimizer(true, new TestConvergenceChecker(10));
        opt.setData(t, s, obj, jac);
        
        try {
            opt.optimize();
            fail("Expected ConvergenceException");
        } catch (ConvergenceException e) {
            assertNotNull(e.getMessage());
        }
    }
}