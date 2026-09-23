package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.util.MathUtils;

public class LevenbergMarquardtOptimizerTest {

    private TestableLMO optimizer;

    @Before
    public void setUp() throws Exception {
        optimizer = new TestableLMO();
    }

    // Inner class that exposes private methods and fields for testing
    static class TestableLMO extends LevenbergMarquardtOptimizer {
        @Override
        protected void updateResidualsAndCost() {
            // No operation – fields are set directly via reflection
        }
        @Override
        protected void updateJacobian() {
            // No operation – fields are set directly via reflection
        }

        // Public wrappers for private methods
        public void publicQrDecomposition() throws OptimizationException {
            qrDecomposition();
        }
        public void publicQTy(double[] y) {
            qTy(y);
        }
        public void publicDetermineLMParameter(double[] qy, double delta, double[] diag,
                double[] work1, double[] work2, double[] work3) {
            determineLMParameter(qy, delta, diag, work1, work2, work3);
        }
        public void publicDetermineLMDirection(double[] qy, double[] diag,
                double[] lmDiag, double[] work) {
            determineLMDirection(qy, diag, lmDiag, work);
        }

        // Reflection‑based access to private fields of LevenbergMarquardtOptimizer
        public void setPrivateField(String name, Object value) throws Exception {
            Field f = LevenbergMarquardtOptimizer.class.getDeclaredField(name);
            f.setAccessible(true);
            f.set(this, value);
        }
        public Object getPrivateField(String name) throws Exception {
            Field f = LevenbergMarquardtOptimizer.class.getDeclaredField(name);
            f.setAccessible(true);
            return f.get(this);
        }

        // Reflection‑based access to protected fields of AbstractLeastSquaresOptimizer
        public void setSuperPrivateField(String name, Object value) throws Exception {
            Field f = LevenbergMarquardtOptimizer.class.getSuperclass().getDeclaredField(name);
            f.setAccessible(true);
            f.set(this, value);
        }
        public Object getSuperPrivateField(String name) throws Exception {
            Field f = LevenbergMarquardtOptimizer.class.getSuperclass().getDeclaredField(name);
            f.setAccessible(true);
            return f.get(this);
        }
    }

    // --- Tests for public setters ---

    @Test
    public void testSetInitialStepBoundFactor() throws Exception {
        optimizer.setInitialStepBoundFactor(50.0);
        assertEquals(50.0, (Double) optimizer.getPrivateField("initialStepBoundFactor"), 1e-15);
    }

    @Test
    public void testSetCostRelativeTolerance() throws Exception {
        optimizer.setCostRelativeTolerance(1e-8);
        assertEquals(1e-8, (Double) optimizer.getPrivateField("costRelativeTolerance"), 1e-20);
    }

    @Test
    public void testSetParRelativeTolerance() throws Exception {
        optimizer.setParRelativeTolerance(1e-12);
        assertEquals(1e-12, (Double) optimizer.getPrivateField("parRelativeTolerance"), 1e-20);
    }

    @Test
    public void testSetOrthoTolerance() throws Exception {
        optimizer.setOrthoTolerance(1e-9);
        assertEquals(1e-9, (Double) optimizer.getPrivateField("orthoTolerance"), 1e-20);
    }

    @Test
    public void testSetQRRankingThreshold() throws Exception {
        optimizer.setQRRankingThreshold(1e-12);
        assertEquals(1e-12, (Double) optimizer.getPrivateField("qrRankingThreshold"), 1e-20);
    }

    // --- Tests for qrDecomposition ---

    @Test
    public void testQrDecompositionNormal() throws Exception {
        double[][] jac = new double[][] {{1,2},{3,4},{5,6},{7,8},{9,10}};
        optimizer.setSuperPrivateField("rows", 5);
        optimizer.setSuperPrivateField("cols", 2);
        optimizer.setSuperPrivateField("jacobian", jac);
        optimizer.setPrivateField("solvedCols", 2);
        optimizer.setPrivateField("jacNorm", new double[2]);
        optimizer.setPrivateField("diagR", new double[2]);
        optimizer.setPrivateField("beta", new double[2]);
        optimizer.setPrivateField("permutation", new int[2]);
        optimizer.setPrivateField("qrRankingThreshold", MathUtils.SAFE_MIN);

        optimizer.publicQrDecomposition();

        int rank = (Integer) optimizer.getPrivateField("rank");
        assertEquals(2, rank);

        int[] perm = (int[]) optimizer.getPrivateField("permutation");
        assertArrayEquals(new int[]{1, 0}, perm);

        double[] diagR = (double[]) optimizer.getPrivateField("diagR");
        assertEquals(-Math.sqrt(220), diagR[perm[0]], 1e-12);
    }

    @Test(expected = OptimizationException.class)
    public void testQrDecompositionNaNValues() throws Exception {
        double[][] jac = new double[][] {{Double.NaN, 1},{2,3},{4,5},{6,7},{8,9}};
        optimizer.setSuperPrivateField("rows", 5);
        optimizer.setSuperPrivateField("cols", 2);
        optimizer.setSuperPrivateField("jacobian", jac);
        optimizer.setPrivateField("solvedCols", 2);
        optimizer.setPrivateField("jacNorm", new double[2]);
        optimizer.setPrivateField("diagR", new double[2]);
        optimizer.setPrivateField("beta", new double[2]);
        optimizer.setPrivateField("permutation", new int[2]);
        optimizer.publicQrDecomposition();
    }

    // --- Test qTy ---

    @Test
    public void testQTy() throws Exception {
        double[][] jac = new double[][] {{1,0},{0,1},{0,0}};
        optimizer.setSuperPrivateField("rows", 3);
        optimizer.setSuperPrivateField("cols", 2);
        optimizer.setSuperPrivateField("jacobian", jac);
        optimizer.setPrivateField("solvedCols", 2);
        optimizer.setPrivateField("permutation", new int[]{0, 1});
        optimizer.setPrivateField("beta", new double[]{1.0, 1.0});

        double[] y = new double[]{2, 3, 4};
        optimizer.publicQTy(y);
        assertArrayEquals(new double[]{0, 0, 0}, y, 1e-12);
    }

    // --- Test determineLMParameter (basic correctness) ---

    @Test
    public void testDetermineLMParameter() throws Exception {
        optimizer.setSuperPrivateField("rows", 2);
        optimizer.setSuperPrivateField("cols", 2);
        optimizer.setSuperPrivateField("jacobian", new double[][]{{1,0},{0,1}});
        optimizer.setPrivateField("solvedCols", 2);
        optimizer.setPrivateField("rank", 2);
        optimizer.setPrivateField("permutation", new int[]{0, 1});
        optimizer.setPrivateField("diagR", new double[]{1.0, 1.0});
        optimizer.setPrivateField("lmDir", new double[2]);

        double[] qy = {1.0, 0.5};
        double delta = 1.0;
        double[] diag = {1.0, 1.0};
        double[] work1 = new double[2];
        double[] work2 = new double[2];
        double[] work3 = new double[2];

        optimizer.publicDetermineLMParameter(qy, delta, diag, work1, work2, work3);

        double[] lmDir = (double[]) optimizer.getPrivateField("lmDir");
        assertArrayEquals(new double[]{1.0, 0.5}, lmDir, 1e-12);
    }

    // --- Test doOptimize convergence via checker (simple case) ---

    @Test
    public void testDoOptimizeConvergedByChecker() throws Exception {
        optimizer.setConvergenceChecker(
            new org.apache.commons.math.optimization.SimpleVectorialValueChecker() {
                @Override
                public boolean converged(int iteration,
                        VectorialPointValuePair previous,
                        VectorialPointValuePair current) {
                    return true;
                }
            }
        );

        optimizer.setSuperPrivateField("point", new double[]{0.0});
        optimizer.setSuperPrivateField("objective", new double[]{0.0});
        optimizer.setSuperPrivateField("residuals", new double[]{0.0});
        optimizer.setSuperPrivateField("cost", 0.0);
        optimizer.setSuperPrivateField("jacobian", new double[][]{{1.0}});
        optimizer.setSuperPrivateField("rows", 1);
        optimizer.setSuperPrivateField("cols", 1);
        optimizer.setPrivateField("solvedCols", 1);
        optimizer.setPrivateField("permutation", new int[]{0});
        optimizer.setPrivateField("jacNorm", new double[]{1.0});
        optimizer.setPrivateField("diagR", new double[]{0.0});
        optimizer.setPrivateField("beta", new double[]{0.0});
        optimizer.setPrivateField("lmDir", new double[1]);

        VectorialPointValuePair result = optimizer.doOptimize();
        assertNotNull(result);
    }
}