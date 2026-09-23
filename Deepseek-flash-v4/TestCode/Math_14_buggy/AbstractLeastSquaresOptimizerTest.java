package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import static org.junit.Assert.*;

import org.apache.commons.math3.linear.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractLeastSquaresOptimizerTest {

    private TestOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new TestOptimizer();
    }

    @Test
    public void testComputeWeightedJacobian() throws Exception {
        double[][] weightData = {{2.0, 0.0}, {0.0, 3.0}};
        RealMatrix weightSqrt = new DiagonalMatrix(new double[]{Math.sqrt(2), Math.sqrt(3)});
        setWeightMatrixSqrt(weightSqrt);

        double[] params = {1.0, 2.0};
        double[] jacobianRow0 = {1.0, 0.0};
        double[] jacobianRow1 = {0.0, 1.0};
        double[][] jacobianData = {jacobianRow0, jacobianRow1};
        optimizer.setJacobian(jacobianData);

        RealMatrix result = optimizer.computeWeightedJacobian(params);
        assertNotNull(result);
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        double[][] expected = {{Math.sqrt(2), 0}, {0, Math.sqrt(3)}};
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("Entry " + i + "," + j, expected[i][j], result.getEntry(i, j), 1e-12);
            }
        }
    }

    @Test
    public void testComputeCost() throws Exception {
        double[] residuals = {1.0, 2.0};
        optimizer.setWeightMatrixSqrt(new DiagonalMatrix(new double[]{Math.sqrt(2), Math.sqrt(3)}));
        optimizer.setWeight(new DiagonalMatrix(new double[]{2.0, 3.0}));
        double cost = optimizer.computeCost(residuals);
        // residual^T * W * residual = 1*2 + 4*3 = 14, cost = sqrt(14)
        assertEquals("Cost mismatch", Math.sqrt(14), cost, 1e-12);
    }

    @Test
    public void testComputeResiduals() {
        double[] target = {1.0, 2.0, 3.0};
        double[] objective = {4.0, 5.0, 6.0};
        optimizer.setTarget(target);
        double[] residuals = optimizer.computeResiduals(objective);
        assertArrayEquals("Residuals mismatch", new double[]{-3.0, -3.0, -3.0}, residuals, 1e-12);
    }

    @Test
    public void testComputeResidualsDimensionMismatch() {
        double[] target = {1.0, 2.0};
        double[] objective = {3.0};
        optimizer.setTarget(target);
        try {
            optimizer.computeResiduals(objective);
            fail("Expected DimensionMismatchException");
        } catch (DimensionMismatchException e) {
            // expected
        }
    }

    @Test
    public void testGetRMS() {
        optimizer.setCost(9.0);
        optimizer.setTargetSize(4);
        // chiSquare = cost^2 = 81, rms = sqrt(81/4) = 4.5
        assertEquals(4.5, optimizer.getRMS(), 1e-12);
    }

    @Test
    public void testGetRMSDivideByZero() {
        optimizer.setCost(9.0);
        optimizer.setTargetSize(0);
        assertEquals(Double.POSITIVE_INFINITY, optimizer.getRMS(), 0.0);
    }

    @Test
    public void testGetChiSquare() {
        optimizer.setCost(4.0);
        assertEquals(16.0, optimizer.getChiSquare(), 1e-12);
    }

    @Test
    public void testGetWeightSquareRoot() {
        double[][] data = {{4.0, 1.0}, {1.0, 3.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        optimizer.setWeightMatrixSqrt(matrix);
        RealMatrix copy = optimizer.getWeightSquareRoot();
        assertNotNull(copy);
        assertEquals(2, copy.getRowDimension());
        assertNotSame("Should return a copy", matrix, copy);
    }

    @Test
    public void testGetWeightSquareRootCopyIsIndependent() {
        double[][] data = {{2.0, 0.0}, {0.0, 2.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        optimizer.setWeightMatrixSqrt(matrix);
        RealMatrix copy = optimizer.getWeightSquareRoot();
        copy.setEntry(0, 0, 99.0);
        assertEquals("Original matrix should not be modified", 2.0, matrix.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testSetGetCost() {
        optimizer.setCost(3.14);
        assertEquals(3.14, optimizer.getCostForTest(), 1e-12);
    }

    @Test
    public void testComputeCovariances() {
        double[][] jacobianData = {{1.0, 0.0}, {0.0, 1.0}};
        optimizer.setJacobian(jacobianData);
        optimizer.setWeightMatrixSqrt(new DiagonalMatrix(new double[]{1.0, 1.0}));
        double threshold = 1e-12;
        double[][] covar = optimizer.computeCovariances(new double[]{1.0, 2.0}, threshold);
        assertNotNull(covar);
        assertEquals(2, covar.length);
        assertTrue("Covariance matrix should be identity", Math.abs(covar[0][0] - 1.0) < 1e-6);
        assertTrue("Covariance matrix should be identity", Math.abs(covar[1][1] - 1.0) < 1e-6);
    }

    @Test
    public void testComputeCovariancesSingular() {
        double[][] jacobianData = {{1.0, 0.0}, {0.0, 0.0}};
        optimizer.setJacobian(jacobianData);
        optimizer.setWeightMatrixSqrt(new DiagonalMatrix(new double[]{1.0, 1.0}));
        try {
            optimizer.computeCovariances(new double[]{1.0, 2.0}, 1e-3);
            fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // expected
        }
    }

    @Test
    public void testComputeSigma() {
        double[][] jacobianData = {{1.0, 0.0}, {0.0, 2.0}};
        optimizer.setJacobian(jacobianData);
        optimizer.setWeightMatrixSqrt(new DiagonalMatrix(new double[]{1.0, 1.0}));
        double[] sigma = optimizer.computeSigma(new double[]{1.0, 2.0}, 1e-12);
        assertNotNull(sigma);
        assertEquals(2, sigma.length);
        // covariance diagonal: 1, 1/4, so sigma[0] = 1, sigma[1] = 0.5
        assertEquals(1.0, sigma[0], 1e-6);
        assertEquals(0.5, sigma[1], 1e-6);
    }

    @Test
    public void testSquareRootOfWeightMatrix() throws Exception {
        double[][] data = {{4.0, 0.0}, {0.0, 9.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        optimizer.setWeightMatrixSqrt(matrix);
        // Indirect test: computeWeightedJacobian uses weightMatrixSqrt
        optimizer.setJacobian(new double[][]{{1.0}, {0.0}});
        RealMatrix result = optimizer.computeWeightedJacobian(new double[]{0.0});
        assertEquals(2, result.getRowDimension());
    }

    @Test
    public void testParseOptimizationData() throws Exception {
        Weight weight = new Weight(new double[]{2.0, 3.0});
        optimizer.parseOptimizationData(weight);
        RealMatrix sqrt = optimizer.getWeightSquareRootFromField();
        assertNotNull(sqrt);
        assertEquals("Incorrect sqrt matrix", Math.sqrt(2), sqrt.getEntry(0, 0), 1e-12);
        assertEquals("Incorrect sqrt matrix", Math.sqrt(3), sqrt.getEntry(1, 1), 1e-12);
    }

    @Test
    public void testParseOptimizationDataNull() throws Exception {
        optimizer.parseOptimizationData();
        assertNull(optimizer.getWeightSquareRootFromField());
    }

    @Test
    public void testOptimize() throws Exception {
        // Test that optimize delegates properly (basic flow)
        optimizer.setTarget(new double[]{1.0, 2.0});
        optimizer.setWeight(new DiagonalMatrix(new double[]{1.0, 1.0}));
        try {
            optimizer.optimize();
            fail("Expected TooManyEvaluationsException or similar");
        } catch (Exception e) {
            // expected for stub
        }
    }

    // ------------------------------------------------------------------
    // Helper methods for reflection
    // ------------------------------------------------------------------

    private void setWeightMatrixSqrt(RealMatrix matrix) throws Exception {
        Field field = AbstractLeastSquaresOptimizer.class.getDeclaredField("weightMatrixSqrt");
        field.setAccessible(true);
        field.set(optimizer, matrix);
    }

    // ------------------------------------------------------------------
    // TestOptimizer - concrete subclass
    // ------------------------------------------------------------------
    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {

        private double[] target;
        private double[][] jacobian;
        private double[] weight;
        private RealMatrix weightMatrix;
        private int targetSize;
        private double costValue;

        public TestOptimizer() {
            super(null); // no checker needed for tests
            this.costValue = 0;
        }

        @Override
        public PointVectorValuePair optimize(OptimizationData... optData) {
            return super.optimize(optData);
        }

        @Override
        protected RealMatrix computeJacobian(double[] params) {
            return new Array2DRowRealMatrix(jacobian);
        }

        @Override
        public double[] getTarget() {
            return target;
        }

        public void setTarget(double[] target) {
            this.target = target;
        }

        public void setJacobian(double[][] jacobian) {
            this.jacobian = jacobian;
        }

        public void setWeightMatrixSqrt(RealMatrix matrix) throws Exception {
            Field field = AbstractLeastSquaresOptimizer.class.getDeclaredField("weightMatrixSqrt");
            field.setAccessible(true);
            field.set(this, matrix);
        }

        public void setWeight(RealMatrix weightMatrix) {
            this.weightMatrix = weightMatrix;
        }

        public void setTargetSize(int size) {
            this.targetSize = size;
        }

        @Override
        protected int getTargetSize() {
            return targetSize;
        }

        @Override
        protected double getCost() {
            return costValue;
        }

        public void setCost(double cost) {
            this.costValue = cost;
        }

        public double getCostForTest() {
            return costValue;
        }

        public void setTargetForTest(double[] target) {
            this.target = target;
        }

        public void parseOptimizationData(OptimizationData... data) throws Exception {
            Method method = AbstractLeastSquaresOptimizer.class.getDeclaredMethod("parseOptimizationData", OptimizationData[].class);
            method.setAccessible(true);
            method.invoke(this, (Object) data);
        }

        public RealMatrix getWeightSquareRootFromField() throws Exception {
            Field field = AbstractLeastSquaresOptimizer.class.getDeclaredField("weightMatrixSqrt");
            field.setAccessible(true);
            return (RealMatrix) field.get(this);
        }

        @Override
        protected RealMatrix getWeight() {
            // Return square of weightMatrixSqrt for computeCost test
            return weightMatrix != null ? weightMatrix : super.getWeight();
        }

        @Override
        protected double[] computeObjectiveValue(double[] params) {
            return new double[0];
        }
    }
}