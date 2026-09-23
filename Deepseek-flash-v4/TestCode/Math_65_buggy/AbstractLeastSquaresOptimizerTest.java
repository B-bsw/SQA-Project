package org.apache.commons.math.optimization.general;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxEvaluationsExceededException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.exception.LocalizedFormats;
import org.apache.commons.math.linear.InvalidMatrixException;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.VectorialPointValuePair;

public class AbstractLeastSquaresOptimizerTest {

    private TestOptimizer optimizer;
    private StubFunction stubFunction;
    private StubJacobian stubJacobian;

    // Helper stub for DifferentiableMultivariateVectorialFunction
    static class StubFunction implements DifferentiableMultivariateVectorialFunction {
        private double[] valueResult;
        private MultivariateMatrixFunction jacobianResult;
        public void setValueResult(double[] v) { this.valueResult = v; }
        public void setJacobianResult(MultivariateMatrixFunction j) { this.jacobianResult = j; }
        @Override
        public double[] value(double[] point) throws FunctionEvaluationException {
            return valueResult;
        }
        @Override
        public MultivariateMatrixFunction jacobian() {
            return jacobianResult;
        }
    }

    // Helper stub for MultivariateMatrixFunction
    static class StubJacobian implements MultivariateMatrixFunction {
        private double[][] jacobianResult;
        public void setJacobianResult(double[][] j) { this.jacobianResult = j; }
        @Override
        public double[][] value(double[] point) throws FunctionEvaluationException {
            return jacobianResult;
        }
    }

    // Concrete subclass that exposes protected methods and fields for testing
    static class TestOptimizer extends AbstractLeastSquaresOptimizer {
        @Override
        protected VectorialPointValuePair doOptimize() {
            // For testing optimize() we return a dummy pair
            return new VectorialPointValuePair(point, objective);
        }

        // Expose protected methods
        public void callIncrementIterationsCounter() throws OptimizationException {
            incrementIterationsCounter();
        }
        public void callUpdateJacobian() throws FunctionEvaluationException {
            updateJacobian();
        }
        public void callUpdateResidualsAndCost() throws FunctionEvaluationException {
            updateResidualsAndCost();
        }

        // Expose fields via setters
        public void setFunction(DifferentiableMultivariateVectorialFunction f) { this.function = f; }
        public void setJF(MultivariateMatrixFunction jF) { this.jF = jF; }
        public void setTargetValues(double[] t) { this.targetValues = t; }
        public void setResidualsWeights(double[] w) { this.residualsWeights = w; }
        public void setPoint(double[] p) { this.point = p; }
        public void setResiduals(double[] r) { this.residuals = r; }
        public void setRows(int r) { this.rows = r; }
        public void setCols(int c) { this.cols = c; }
        public void setJacobian(double[][] j) { this.jacobian = j; }
        public void setObjective(double[] o) { this.objective = o; }
        public void setCost(double c) { this.cost = c; }

        // Getters for verification
        public double[] getResiduals() { return residuals; }
        public double getCost() { return cost; }
    }

    @Before
    public void setUp() {
        optimizer = new TestOptimizer();
        stubFunction = new StubFunction();
        stubJacobian = new StubJacobian();
        // Default settings: 2 rows, 1 col
        optimizer.setRows(2);
        optimizer.setCols(1);
        optimizer.setPoint(new double[]{1.0});
        optimizer.setTargetValues(new double[]{0.0, 0.0});
        optimizer.setResidualsWeights(new double[]{1.0, 2.0});
        optimizer.setResiduals(new double[2]);
        optimizer.setJacobian(new double[2][1]);
        optimizer.setObjective(new double[]{0.5, -0.3});
        optimizer.setCost(0.0);
    }

    // --- Getters / Setters ---

    @Test
    public void testSetMaxIterations() {
        optimizer.setMaxIterations(50);
        assertEquals(50, optimizer.getMaxIterations());
    }

    @Test
    public void testDefaultMaxIterations() {
        assertEquals(100, optimizer.getMaxIterations());
    }

    @Test
    public void testSetMaxEvaluations() {
        optimizer.setMaxEvaluations(200);
        assertEquals(200, optimizer.getMaxEvaluations());
    }

    @Test
    public void testDefaultEvaluations() {
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getJacobianEvaluations());
    }

    @Test
    public void testSetConvergenceChecker() {
        VectorialConvergenceChecker checker = new SimpleVectorialValueChecker();
        optimizer.setConvergenceChecker(checker);
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    // --- incrementIterationsCounter ---

    @Test
    public void testIncrementIterationsCounterNormal() throws OptimizationException {
        optimizer.setMaxIterations(5);
        for (int i = 0; i < 5; i++) {
            optimizer.callIncrementIterationsCounter();
        }
        assertEquals(5, optimizer.getIterations());
    }

    @Test(expected = OptimizationException.class)
    public void testIncrementIterationsCounterExceeded() throws OptimizationException {
        optimizer.setMaxIterations(1);
        optimizer.callIncrementIterationsCounter(); // OK, iterations=1
        optimizer.callIncrementIterationsCounter(); // Should throw
    }

    // --- updateJacobian ---

    @Test
    public void testUpdateJacobianNormal() throws FunctionEvaluationException {
        optimizer.setRows(2);
        optimizer.setCols(1);
        optimizer.setResidualsWeights(new double[]{4.0, 9.0}); // sqrt = 2.0 and 3.0
        double[][] jac = new double[][]{{2.0}, {3.0}};
        optimizer.setJacobian(jac);
        // set jF to return the same jacobian (we will call updateJacobian after setting jF)
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(jac);
        optimizer.setJF(stubJ);
        optimizer.callUpdateJacobian();
        // After update, jacobian[0][0] should be 2.0 * (-sqrt(4.0)) = -4.0
        // jacobian[1][0] should be 3.0 * (-sqrt(9.0)) = -9.0
        double[][] updated = optimizer.jacobian;
        assertEquals(-4.0, updated[0][0], 1e-12);
        assertEquals(-9.0, updated[1][0], 1e-12);
        assertEquals(1, optimizer.getJacobianEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobianDimensionMismatch() throws FunctionEvaluationException {
        optimizer.setRows(2);
        optimizer.setCols(1);
        double[][] wrongJac = new double[3][1]; // rows=3, but expected 2
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(wrongJac);
        optimizer.setJF(stubJ);
        optimizer.callUpdateJacobian();
    }

    // --- updateResidualsAndCost ---

    @Test
    public void testUpdateResidualsAndCostNormal() throws FunctionEvaluationException {
        optimizer.setRows(2);
        optimizer.setCols(1);
        optimizer.setPoint(new double[]{1.0});
        optimizer.setTargetValues(new double[]{0.0, 0.0});
        optimizer.setResidualsWeights(new double[]{1.0, 2.0});
        optimizer.setObjective(new double[]{0.3, -0.4});

        StubFunction stubF = new StubFunction();
        stubF.setValueResult(new double[]{0.3, -0.4});
        optimizer.setFunction(stubF);

        optimizer.callUpdateResidualsAndCost();

        // residuals = target - objective = [0.0-0.3, 0.0-(-0.4)] = [-0.3, 0.4]
        assertArrayEquals(new double[]{-0.3, 0.4}, optimizer.getResiduals(), 1e-12);
        // cost = sqrt(1.0 * (-0.3)^2 + 2.0 * (0.4)^2) = sqrt(0.09 + 0.32) = sqrt(0.41) ≈ 0.6403124237
        double expectedCost = Math.sqrt(0.41);
        assertEquals(expectedCost, optimizer.getCost(), 1e-12);
        assertEquals(1, optimizer.getEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCostExceedMaxEvaluations() throws FunctionEvaluationException {
        optimizer.setMaxEvaluations(0);
        optimizer.callUpdateResidualsAndCost();
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCostDimensionMismatch() throws FunctionEvaluationException {
        optimizer.setRows(2);
        StubFunction stubF = new StubFunction();
        stubF.setValueResult(new double[3]); // length=3, but rows=2
        optimizer.setFunction(stubF);
        optimizer.callUpdateResidualsAndCost();
    }

    // --- getRMS ---

    @Test
    public void testGetRMS() {
        optimizer.setRows(2);
        optimizer.setResiduals(new double[]{-0.3, 0.4});
        optimizer.setResidualsWeights(new double[]{1.0, 2.0});
        // criterion = (-0.3)^2*1 + (0.4)^2*2 = 0.09 + 0.32 = 0.41
        // RMS = sqrt(0.41/2) = sqrt(0.205) ≈ 0.452769
        double expected = Math.sqrt(0.205);
        assertEquals(expected, optimizer.getRMS(), 1e-12);
    }

    // --- getChiSquare ---

    @Test
    public void testGetChiSquare() {
        optimizer.setRows(2);
        optimizer.setResiduals(new double[]{-0.3, 0.4});
        optimizer.setResidualsWeights(new double[]{1.0, 2.0});
        // chi-square = (-0.3)^2/1 + (0.4)^2/2 = 0.09 + 0.08 = 0.17
        assertEquals(0.17, optimizer.getChiSquare(), 1e-12);
    }

    // --- getCovariances ---

    @Test
    public void testGetCovariancesNormal() throws Exception {
        // Set up jacobian: 2 rows, 2 cols => identity after update? Actually updateJacobian multiplies by -sqrt(weight)
        // Let's make a simple case: jacobian initially identity, weights all 1
        optimizer.setRows(2);
        optimizer.setCols(2);
        optimizer.setResidualsWeights(new double[]{1.0, 1.0});
        double[][] jac = new double[][]{{1.0, 0.0}, {0.0, 1.0}};
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(jac);
        optimizer.setJF(stubJ);
        // After updateJacobian internally: ji[j] *= -sqrt(1) = -1, so jac = {{-1,0},{0,-1}}
        // jTj = identity (since diagonal -1*-1=1)
        // Inverse of identity = identity
        double[][] cov = optimizer.getCovariances();
        assertEquals(2, cov.length);
        assertEquals(2, cov[0].length);
        assertEquals(1.0, cov[0][0], 1e-12);
        assertEquals(0.0, cov[0][1], 1e-12);
        assertEquals(0.0, cov[1][0], 1e-12);
        assertEquals(1.0, cov[1][1], 1e-12);
    }

    @Test(expected = OptimizationException.class)
    public void testGetCovariancesSingular() throws Exception {
        optimizer.setRows(2);
        optimizer.setCols(2);
        optimizer.setResidualsWeights(new double[]{1.0, 1.0});
        // All zeros => jTj singular
        double[][] jac = new double[][]{{0.0, 0.0}, {0.0, 0.0}};
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(jac);
        optimizer.setJF(stubJ);
        optimizer.getCovariances();
    }

    // --- guessParametersErrors ---

    @Test
    public void testGuessParametersErrorsNormal() throws Exception {
        // rows=3, cols=2 => degrees of freedom = 1
        optimizer.setRows(3);
        optimizer.setCols(2);
        optimizer.setResiduals(new double[]{1.0, 0.0, -1.0}); // arbitrary
        optimizer.setResidualsWeights(new double[]{1.0, 1.0, 1.0});
        double[][] jac = new double[][]{{1.0, 0.0}, {0.0, 1.0}, {1.0, 1.0}};
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(jac);
        optimizer.setJF(stubJ);
        // Need to also set function? Actually guessParametersErrors internally calls getChiSquare() which uses residuals/weights
        // and getCovariances() which uses jF
        // We already set jF, residuals, weights, rows, cols
        // getChiSquare = 1^2/1 + 0^2/1 + (-1)^2/1 = 2
        double[] errors = optimizer.guessParametersErrors();
        assertNotNull(errors);
        assertEquals(2, errors.length);
        // covariances computed internally from jacobian (after update)
        // c = sqrt(2 / (3-2)) = sqrt(2) ≈ 1.4142
        // errors[i] = sqrt(covar[i][i]) * c
        // We just check they are positive
        assertTrue(errors[0] > 0);
        assertTrue(errors[1] > 0);
    }

    @Test(expected = OptimizationException.class)
    public void testGuessParametersErrorsNoDegreesOfFreedom() throws Exception {
        optimizer.setRows(2);
        optimizer.setCols(2);
        optimizer.guessParametersErrors();
    }

    // --- optimize ---

    @Test
    public void testOptimizeNormal() throws Exception {
        // Setup a simple function that returns objective and jacobian
        double[] target = new double[]{0.0, 0.0};
        double[] weights = new double[]{1.0, 1.0};
        double[] startPoint = new double[]{1.0, 2.0};

        StubFunction stubF = new StubFunction();
        stubF.setValueResult(new double[]{0.5, -0.3});
        StubJacobian stubJ = new StubJacobian();
        stubJ.setJacobianResult(new double[][]{{1.0, 0.0}, {0.0, 1.0}});
        stubF.setJacobianResult(stubJ);

        TestOptimizer opt = new TestOptimizer();
        VectorialPointValuePair result = opt.optimize(stubF, target, weights, startPoint);

        // Verify counters reset
        assertEquals(0, opt.getIterations());
        assertEquals(0, opt.getEvaluations());
        assertEquals(0, opt.getJacobianEvaluations());
        // Check that internal fields are set
        assertNotNull(opt.point);
        assertNotNull(opt.objective);
        assertEquals(2, opt.rows);
        assertEquals(2, opt.cols);
        // DoOptimize returned the point/objective we set via stub? Actually our stub doOptimize returns new VectorialPointValuePair(point, objective)
        // so the result should be startPoint and the objective from stub?
        // In our test stub, doOptimize returns new VectorialPointValuePair(point, objective) where point is set from optimize (startPoint.clone())
        // and objective is initially null? Actually in optimize, after calling doOptimize, the returned pair is what doOptimize returns.
        // Our doOptimize uses the fields point and objective. In our TestOptimizer, point was set by optimize to startPoint.clone(),
        // but objective is null because we didn't call updateResidualsAndCost. So it will return null objective. That's fine for test.
        // Actually our doOptimize is naive: it returns new VectorialPointValuePair(point, objective) where objective is the field,
        // which is null after reset. That's okay for testing that optimize does not throw.
        assertArrayEquals(startPoint, result.getPoint(), 1e-12);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimizeDimensionMismatch() throws Exception {
        double[] target = new double[]{0.0, 0.0};
        double[] weights = new double[]{1.0, 1.0, 1.0}; // length mismatch
        TestOptimizer opt = new TestOptimizer();
        opt.optimize(stubFunction, target, weights, new double[]{1.0});
    }
}