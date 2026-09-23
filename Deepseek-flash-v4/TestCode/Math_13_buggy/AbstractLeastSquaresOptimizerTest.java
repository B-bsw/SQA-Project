package org.apache.commons.math3.optimization.general;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.RealMatrix;

public class AbstractLeastSquaresOptimizerTest {

    private AbstractLeastSquaresOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new TestOptimizer();
    }

    @After
    public void tearDown() {
        optimizer = null;
    }

    @Test
    public void testGetJacobianEvaluationsInitialZero() {
        Assert.assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testComputeCostPositive() {
        double[] residuals = {1.0, 2.0, 3.0};
        double cost = optimizer.computeCost(residuals);
        Assert.assertEquals(Math.sqrt(14.0), cost, 1e-12);
    }

    @Test
    public void testComputeCostZero() {
        double[] residuals = {0.0, 0.0, 0.0};
        double cost = optimizer.computeCost(residuals);
        Assert.assertEquals(0.0, cost, 1e-12);
    }

    @Test
    public void testComputeCostNegative() {
        double[] residuals = {-1.0, -2.0, -3.0};
        double cost = optimizer.computeCost(residuals);
        Assert.assertEquals(Math.sqrt(14.0), cost, 1e-12);
    }

    @Test
    public void testGetRMS() {
        optimizer.setCost(3.0);
        optimizer.setRows(3);
        Assert.assertEquals(Math.sqrt(3.0), optimizer.getRMS(), 1e-12);
    }

    @Test
    public void testGetRMSZeroRows() {
        optimizer.setCost(0.0);
        optimizer.setRows(0);
        Assert.assertEquals(Double.NaN, optimizer.getRMS(), 1e-12);
    }

    @Test
    public void testGetChiSquare() {
        optimizer.setCost(4.0);
        Assert.assertEquals(16.0, optimizer.getChiSquare(), 1e-12);
    }

    @Test
    public void testGetWeightSquareRootNotNull() {
        optimizer.setWeightMatrixSqrt(createDiagonalMatrix(new double[]{2.0, 3.0}));
        RealMatrix sqrt = optimizer.getWeightSquareRoot();
        Assert.assertNotNull(sqrt);
        Assert.assertEquals(2.0, sqrt.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testGetCovariancesDefaultThreshold() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setPoint(new double[]{1.0, 2.0});
        testOpt.setRows(2);
        testOpt.setCols(2);
        testOpt.setCost(1.0);
        testOpt.setJacAndValueFunctions();
        double[][] cov = testOpt.getCovariances();
        Assert.assertNotNull(cov);
        Assert.assertEquals(2, cov.length);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobianDimensionMismatch() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setPoint(new double[]{1.0});
        testOpt.setRows(3);
        testOpt.setCols(1);
        testOpt.setJacAndValueFunctions();
        testOpt.computeWeightedJacobian(new double[]{1.0});
    }

    @Test
    public void testGuessParametersErrorsThrowsNumberIsTooSmall() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(2);
        testOpt.setCols(3);
        try {
            testOpt.guessParametersErrors();
            Assert.fail("Expected NumberIsTooSmallException");
        } catch (NumberIsTooSmallException e) {
            Assert.assertTrue(e.getMessage().length() > 0);
        }
    }

    @Test
    public void testGuessParametersErrorsComputesCorrectly() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(3);
        testOpt.setCols(2);
        testOpt.setPoint(new double[]{1.0, 2.0});
        testOpt.setCost(2.0);
        testOpt.setJacAndValueFunctions();
        double[] errors = testOpt.guessParametersErrors();
        Assert.assertNotNull(errors);
        Assert.assertEquals(2, errors.length);
        Assert.assertTrue(errors[0] > 0);
    }

    @Test
    public void testOptimizeWithValidArguments() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(2);
        testOpt.setCols(1);
        testOpt.setJacAndValueFunctions();
        PointVectorValuePair result = testOpt.optimize(100, 
            FunctionUtils.toMultivariateDifferentiableVectorFunction(
                (double[] params) -> { return new double[]{params[0], params[0]}; }),
            new Target(new double[]{1.0, 2.0}),
            new Weight(new double[]{1.0, 1.0}),
            new InitialGuess(new double[]{0.5}));
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getPointRef());
    }

    @Test
    public void testComputeSigma() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(3);
        testOpt.setCols(2);
        testOpt.setPoint(new double[]{1.0, 2.0});
        testOpt.setCost(2.0);
        testOpt.setJacAndValueFunctions();
        double[] sigma = testOpt.computeSigma(new double[]{0.0, 0.0}, 1e-14);
        Assert.assertNotNull(sigma);
        Assert.assertEquals(2, sigma.length);
        Assert.assertTrue(sigma[0] >= 0);
    }

    @Test
    public void testComputeCovariancesWithThreshold() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(2);
        testOpt.setCols(2);
        testOpt.setPoint(new double[]{1.0, 2.0});
        testOpt.setCost(1.0);
        testOpt.setJacAndValueFunctions();
        double[][] cov = testOpt.computeCovariances(new double[]{0.0, 0.0}, 1e-14);
        Assert.assertNotNull(cov);
        Assert.assertEquals(2, cov.length);
        Assert.assertNotNull(cov[0]);
    }

    @Test
    public void testUpdateResidualsAndCost() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(2);
        testOpt.setCols(1);
        testOpt.setPoint(new double[]{0.5});
        testOpt.setJacAndValueFunctions();
        testOpt.updateResidualsAndCost();
        Assert.assertTrue(testOpt.getCost() >= 0);
        Assert.assertNotNull(testOpt.getObjective());
        Assert.assertNotNull(testOpt.getWeightedResiduals());
    }

    @Test
    public void testComputeWeightedJacobian() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setRows(2);
        testOpt.setCols(1);
        testOpt.setPoint(new double[]{0.5});
        testOpt.setJacAndValueFunctions();
        RealMatrix matrix = testOpt.computeWeightedJacobian(new double[]{0.5});
        Assert.assertNotNull(matrix);
        Assert.assertEquals(2, matrix.getRowDimension());
        Assert.assertEquals(1, matrix.getColumnDimension());
    }

    @Test
    public void testGetWeightSquareRootCopyDoesNotAffectInternal() {
        TestOptimizer testOpt = new TestOptimizer();
        testOpt.setWeightMatrixSqrt(createDiagonalMatrix(new double[]{2.0}));
        RealMatrix copy = testOpt.getWeightSquareRoot();
        copy.setEntry(0, 0, 100.0);
        RealMatrix internal = testOpt.getWeightSquareRoot();
        Assert.assertEquals(2.0, internal.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testComputeCostWithSingleElement() {
        double[] residuals = {4.0};
        Assert.assertEquals(2.0, optimizer.computeCost(residuals), 1e-12);
    }

    @Test
    public void testGetRMSWithZeroRowsInCostFunction() {
        optimizer.setCost(4.0);
        optimizer.setRows(2);
        Assert.assertEquals(Math.sqrt(2.0), optimizer.getRMS(), 1e-12);
    }

    private RealMatrix createDiagonalMatrix(double[] diagonal) {
        int n = diagonal.length;
        double[][] data = new double[n][n];
        for (int i = 0; i < n; i++) {
            data[i][i] = diagonal[i];
        }
        return new org.apache.commons.math3.linear.Array2DRowRealMatrix(data);
    }

    private static class TestOptimizer extends AbstractLeastSquaresOptimizer {

        private MultivariateDifferentiableVectorFunction jacAndValueFunction;

        public TestOptimizer() {
            super((ConvergenceChecker<PointVectorValuePair>) (evaluation, previous) -> false);
            setWeightMatrixSqrt(createDiagonalMatrix(new double[]{1.0, 1.0, 1.0}));
        }

        public void setPoint(double[] p) {
            this.point = p;
        }

        public void setRows(int r) {
            this.rows = r;
        }

        public void setCols(int c) {
            this.cols = c;
        }

        public void setCost(double c) {
            this.cost = c;
        }

        public double[] getObjective() {
            return objective;
        }

        public double[] getWeightedResiduals() {
            return weightedResiduals;
        }

        public void setWeightMatrixSqrt(RealMatrix matrix) {
            this.weightMatrixSqrt = matrix;
        }

        public void setJacAndValueFunctions() {
            this.jF = (double[] point) -> {
                DerivativeStructure[] dsParams = new DerivativeStructure[point.length];
                for (int i = 0; i < point.length; i++) {
                    dsParams[i] = new DerivativeStructure(point.length, 1, i, point[i]);
                }
                DerivativeStructure[] dsValue = new DerivativeStructure[rows];
                for (int i = 0; i < rows; i++) {
                    dsValue[i] = dsParams[0].multiply(i + 1); // simple linear function
                }
                return dsValue;
            };
            this.jacf = jacAndValueFunction;
        }

        @Override
        protected MultivariateDifferentiableVectorFunction getObjectiveFunction() {
            return jF;
        }

        @Override
        public PointVectorValuePair optimizeInternal(int maxEval, org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer.OptimizationData... optData) {
            return null; // Not used in tests
        }
    }
}