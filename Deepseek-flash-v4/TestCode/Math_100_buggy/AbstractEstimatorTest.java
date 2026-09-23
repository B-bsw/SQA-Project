package org.apache.commons.math.estimation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class AbstractEstimatorTest {

    private static class TestMeasurement extends WeightedMeasurement {
        private static final long serialVersionUID = 1L;

        public TestMeasurement(double weight, double value) {
            super(weight, value, null);
        }

        @Override
        public double getPartial(EstimatedParameter parameter) {
            return 1.0;
        }

        @Override
        public double getResidual() {
            return getValue() - 0.0; 
        }
    }

    private static class TestParameter extends EstimatedParameter {
        private static final long serialVersionUID = 1L;

        public TestParameter(String name, double value) {
            super(name, value);
        }
    }

    private static class TestEstimationProblem implements EstimationProblem {
        private WeightedMeasurement[] measurements;
        private EstimatedParameter[] parameters;

        public TestEstimationProblem(WeightedMeasurement[] measurements, EstimatedParameter[] parameters) {
            this.measurements = measurements;
            this.parameters = parameters;
        }

        @Override
        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }

        @Override
        public EstimatedParameter[] getAllParameters() {
            return parameters;
        }

        @Override
        public EstimatedParameter[] getUnboundParameters() {
            return parameters;
        }

        @Override
        public WeightedMeasurement[] getMeasurements() {
            return measurements;
        }
    }

    private static class TestEstimator extends AbstractEstimator {
        @Override
        public void estimate(EstimationProblem problem) throws EstimationException {
            // stub
        }
    }

    private TestEstimator estimator;

    @Before
    public void setUp() {
        estimator = new TestEstimator();
    }

    @Test
    public void testSetAndGetMaxCostEval() {
        estimator.setMaxCostEval(100);
        assertEquals(100, estimator.getCostEvaluations());
    }

    @Test
    public void testGetCostEvaluationsInitial() {
        assertEquals(0, estimator.getCostEvaluations());
    }

    @Test
    public void testGetJacobianEvaluationsInitial() {
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testInitializeEstimate() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { new TestMeasurement(1.0, 2.0), new TestMeasurement(2.0, 3.0) };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        EstimationProblem problem = new TestEstimationProblem(ms, ps);
        estimator.initializeEstimate(problem);
        assertEquals(0, estimator.getCostEvaluations());
        assertEquals(0, estimator.getJacobianEvaluations());
    }

    @Test
    public void testUpdateJacobianSingleMeasurement() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { new TestMeasurement(4.0, 1.0) };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 2.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateJacobian();
        assertEquals(1, estimator.getJacobianEvaluations());
        assertArrayEquals(new double[] { -2.0 }, estimator.jacobian, 1e-12);
    }

    @Test
    public void testUpdateJacobianMultipleMeasurements() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 1.0), 
            new TestMeasurement(4.0, 2.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0), new TestParameter("p2", 2.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateJacobian();
        assertEquals(1, estimator.getJacobianEvaluations());
        double[] expected = new double[] { -1.0, -1.0, -2.0, -2.0 };
        assertArrayEquals(expected, estimator.jacobian, 1e-12);
    }

    @Test
    public void testUpdateResidualsAndCost() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 2.0), 
            new TestMeasurement(4.0, 3.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateResidualsAndCost();
        assertEquals(1, estimator.getCostEvaluations());
        double expectedCost = Math.sqrt(2.0*2.0 + 4.0*3.0*3.0);
        assertEquals(expectedCost, estimator.cost, 1e-12);
    }

    @Test(expected = EstimationException.class)
    public void testUpdateResidualsAndCostExceedMax() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { new TestMeasurement(1.0, 1.0) };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.setMaxCostEval(0);
        estimator.updateResidualsAndCost();
    }

    @Test
    public void testGetRMS() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 2.0), 
            new TestMeasurement(4.0, 3.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        TestEstimationProblem problem = new TestEstimationProblem(ms, ps);
        double rms = estimator.getRMS(problem);
        double expected = Math.sqrt((1.0*2.0*2.0 + 4.0*3.0*3.0) / 2.0);
        assertEquals(expected, rms, 1e-12);
    }

    @Test
    public void testGetChiSquare() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 2.0), 
            new TestMeasurement(4.0, 3.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        TestEstimationProblem problem = new TestEstimationProblem(ms, ps);
        double chi = estimator.getChiSquare(problem);
        assertEquals(2.0*2.0/1.0 + 3.0*3.0/4.0, chi, 1e-12);
    }

    @Test
    public void testIncrementJacobianEvaluationsCounter() {
        estimator.incrementJacobianEvaluationsCounter();
        estimator.incrementJacobianEvaluationsCounter();
        assertEquals(2, estimator.getJacobianEvaluations());
    }

    @Test
    public void testGetCovariances() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 1.0), 
            new TestMeasurement(1.0, 2.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateJacobian();
        double[][] covar = estimator.getCovariances(new TestEstimationProblem(ms, ps));
        assertEquals(1, covar.length);
        assertEquals(1, covar[0].length);
        assertTrue(covar[0][0] > 0);
    }

    @Test(expected = EstimationException.class)
    public void testGetCovariancesSingular() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(0.0, 1.0), 
            new TestMeasurement(0.0, 2.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateJacobian();
        estimator.getCovariances(new TestEstimationProblem(ms, ps));
    }

    @Test
    public void testGuessParametersErrors() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 1.0), 
            new TestMeasurement(1.0, 2.0), 
            new TestMeasurement(1.0, 3.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
        TestEstimationProblem problem = new TestEstimationProblem(ms, ps);
        double[] errors = estimator.guessParametersErrors(problem);
        assertEquals(1, errors.length);
        assertTrue(errors[0] >= 0);
    }

    @Test(expected = EstimationException.class)
    public void testGuessParametersErrorsTooManyParameters() throws EstimationException {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { 
            new TestMeasurement(1.0, 1.0), 
            new TestMeasurement(1.0, 2.0) 
        };
        EstimatedParameter[] ps = new EstimatedParameter[] { 
            new TestParameter("p1", 1.0), 
            new TestParameter("p2", 2.0) 
        };
        TestEstimationProblem problem = new TestEstimationProblem(ms, ps);
        estimator.guessParametersErrors(problem);
    }

    @Test
    public void testGuessParametersErrorsZeroMeasurements() {
        try {
            WeightedMeasurement[] ms = new WeightedMeasurement[0];
            EstimatedParameter[] ps = new EstimatedParameter[] { new TestParameter("p1", 1.0) };
            TestEstimationProblem problem = new TestEstimationProblem(ms, ps);
            estimator.guessParametersErrors(problem);
            fail("Expected EstimationException");
        } catch (EstimationException e) {
            // expected
        }
    }

    @Test
    public void testUpdateJacobianNoParameters() {
        WeightedMeasurement[] ms = new WeightedMeasurement[] { new TestMeasurement(1.0, 1.0) };
        EstimatedParameter[] ps = new EstimatedParameter[0];
        estimator.initializeEstimate(new TestEstimationProblem(ms, ps));
        estimator.updateJacobian();
        assertEquals(1, estimator.getJacobianEvaluations());
        assertEquals(0, estimator.jacobian.length);
    }
}