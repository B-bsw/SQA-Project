package org.apache.commons.math.stat.regression;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.MathException;

public class SimpleRegressionTest {
    private SimpleRegression regression;
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
        regression = new SimpleRegression();
    }

    @After
    public void tearDown() {
        regression = null;
    }

    @Test
    public void testInitialState() {
        assertEquals(0L, regression.getN());
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
        assertEquals(Double.NaN, regression.getIntercept(), 0.0);
        assertEquals(Double.NaN, regression.getR(), 0.0);
        assertEquals(Double.NaN, regression.getRSquare(), 0.0);
        assertEquals(Double.NaN, regression.predict(0.0), 0.0);
        assertEquals(Double.NaN, regression.getSumSquaredErrors(), 0.0);
        assertEquals(Double.NaN, regression.getTotalSumSquares(), 0.0);
        assertEquals(Double.NaN, regression.getRegressionSumSquares(), 0.0);
        assertEquals(Double.NaN, regression.getMeanSquareError(), 0.0);
        assertEquals(Double.NaN, regression.getInterceptStdErr(), 0.0);
        assertEquals(Double.NaN, regression.getSlopeStdErr(), 0.0);
        try {
            assertEquals(Double.NaN, regression.getSlopeConfidenceInterval(), 0.0);
            fail("Expected MathException");
        } catch (MathException e) {
            // expected
        }
        try {
            regression.getSignificance();
            fail("Expected MathException");
        } catch (MathException e) {
            // expected
        }
    }

    @Test
    public void testAddSingleObservation() {
        regression.addData(1.0, 2.0);
        assertEquals(1L, regression.getN());
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
        assertEquals(Double.NaN, regression.getIntercept(), 0.0);
        assertEquals(Double.NaN, regression.getR(), 0.0);
        assertEquals(Double.NaN, regression.getRSquare(), 0.0);
        assertEquals(Double.NaN, regression.predict(1.0), 0.0);
        assertEquals(Double.NaN, regression.getSumSquaredErrors(), 0.0);
        assertEquals(Double.NaN, regression.getTotalSumSquares(), 0.0);
        assertEquals(Double.NaN, regression.getRegressionSumSquares(), 0.0);
        assertEquals(Double.NaN, regression.getMeanSquareError(), 0.0);
    }

    @Test
    public void testAddTwoObservationsZeroSlope() {
        regression.addData(1.0, 2.0);
        regression.addData(3.0, 2.0);
        assertEquals(2L, regression.getN());
        assertEquals(0.0, regression.getSlope(), EPSILON);
        assertEquals(2.0, regression.getIntercept(), EPSILON);
        assertEquals(0.0, regression.getR(), EPSILON);
        assertEquals(0.0, regression.getRSquare(), EPSILON);
        assertEquals(2.0, regression.predict(5.0), EPSILON);
        assertEquals(0.0, regression.getSumSquaredErrors(), EPSILON);
        assertEquals(0.0, regression.getTotalSumSquares(), EPSILON);
        assertEquals(0.0, regression.getRegressionSumSquares(), EPSILON);
    }

    @Test
    public void testAddTwoObservationsPositiveSlope() {
        regression.addData(1.0, 2.0);
        regression.addData(3.0, 6.0);
        assertEquals(2L, regression.getN());
        assertEquals(2.0, regression.getSlope(), EPSILON);
        assertEquals(0.0, regression.getIntercept(), EPSILON);
        assertEquals(1.0, regression.getR(), EPSILON);
        assertEquals(1.0, regression.getRSquare(), EPSILON);
        assertEquals(10.0, regression.predict(5.0), EPSILON);
        assertEquals(0.0, regression.getSumSquaredErrors(), EPSILON);
        assertEquals(4.0, regression.getTotalSumSquares(), EPSILON);
        assertEquals(4.0, regression.getRegressionSumSquares(), EPSILON);
    }

    @Test
    public void testAddMultipleObservations() {
        double[][] data = {{1.0, 2.0}, {2.0, 4.0}, {3.0, 6.0}, {4.0, 8.0}};
        regression.addData(data);
        assertEquals(4L, regression.getN());
        assertEquals(2.0, regression.getSlope(), EPSILON);
        assertEquals(0.0, regression.getIntercept(), EPSILON);
        assertEquals(1.0, regression.getR(), EPSILON);
        assertEquals(1.0, regression.getRSquare(), EPSILON);
        assertEquals(20.0, regression.predict(10.0), EPSILON);
        assertEquals(0.0, regression.getSumSquaredErrors(), EPSILON);
        assertEquals(20.0, regression.getTotalSumSquares(), EPSILON);
        assertEquals(20.0, regression.getRegressionSumSquares(), EPSILON);
        assertEquals(0.0, regression.getMeanSquareError(), EPSILON);
        assertEquals(0.0, regression.getInterceptStdErr(), EPSILON);
        assertEquals(0.0, regression.getSlopeStdErr(), EPSILON);
    }

    @Test
    public void testPerfectLinearLargeValues() {
        double[][] data = {{100.0, 1000.0}, {200.0, 2000.0}, {300.0, 3000.0}};
        regression.addData(data);
        assertEquals(10.0, regression.getSlope(), EPSILON);
        assertEquals(0.0, regression.getIntercept(), EPSILON);
        assertEquals(1.0, regression.getR(), EPSILON);
        assertEquals(10000.0, regression.predict(1000.0), EPSILON);
    }

    @Test
    public void testAddObservationsNoVariationInX() {
        regression.addData(2.0, 3.0);
        regression.addData(2.0, 5.0);
        regression.addData(2.0, 7.0);
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
        assertEquals(Double.NaN, regression.getIntercept(), 0.0);
        assertEquals(Double.NaN, regression.getR(), 0.0);
        assertEquals(Double.NaN, regression.getRSquare(), 0.0);
        assertEquals(Double.NaN, regression.predict(2.0), 0.0);
        assertEquals(Double.NaN, regression.getSumSquaredErrors(), 0.0);
        assertEquals(Double.NaN, regression.getTotalSumSquares(), 0.0);
        assertEquals(Double.NaN, regression.getRegressionSumSquares(), 0.0);
    }

    @Test
    public void testClear() {
        double[][] data = {{1.0, 2.0}, {2.0, 4.0}, {3.0, 6.0}};
        regression.addData(data);
        assertEquals(3L, regression.getN());
        regression.clear();
        assertEquals(0L, regression.getN());
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
        assertEquals(Double.NaN, regression.getIntercept(), 0.0);
        assertEquals(Double.NaN, regression.getR(), 0.0);
        assertEquals(Double.NaN, regression.predict(0.0), 0.0);
    }

    @Test
    public void testAddDataAfterClear() {
        double[][] data1 = {{1.0, 1.0}, {2.0, 2.0}, {3.0, 3.0}};
        double[][] data2 = {{10.0, 20.0}, {20.0, 40.0}, {30.0, 60.0}};
        regression.addData(data1);
        regression.clear();
        regression.addData(data2);
        assertEquals(3L, regression.getN());
        assertEquals(2.0, regression.getSlope(), EPSILON);
        assertEquals(0.0, regression.getIntercept(), EPSILON);
        assertEquals(1.0, regression.getR(), EPSILON);
    }

    @Test
    public void testGetSlopeConfidenceIntervalValid() throws MathException {
        double[][] data = {{1.0, 2.0}, {2.0, 3.0}, {3.0, 5.0}, {4.0, 7.0}, {5.0, 11.0}, {6.0, 13.0}};
        regression.addData(data);
        double intervalDefault = regression.getSlopeConfidenceInterval();
        assertTrue(intervalDefault > 0.0);
        double intervalCustom = regression.getSlopeConfidenceInterval(0.10);
        assertTrue(intervalCustom > 0.0);
        assertTrue(intervalCustom < intervalDefault);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceIntervalInvalidAlphaHigh() throws MathException {
        double[][] data = {{1.0, 2.0}, {2.0, 3.0}, {3.0, 5.0}, {4.0, 7.0}, {5.0, 11.0}, {6.0, 13.0}};
        regression.addData(data);
        regression.getSlopeConfidenceInterval(1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSlopeConfidenceIntervalInvalidAlphaLow() throws MathException {
        double[][] data = {{1.0, 2.0}, {2.0, 3.0}, {3.0, 5.0}, {4.0, 7.0}, {5.0, 11.0}, {6.0, 13.0}};
        regression.addData(data);
        regression.getSlopeConfidenceInterval(0.0);
    }

    @Test
    public void testGetSignificanceValid() throws MathException {
        double[][] data = {{1.0, 2.0}, {2.0, 3.0}, {3.0, 5.0}, {4.0, 7.0}, {5.0, 11.0}, {6.0, 13.0}};
        regression.addData(data);
        double significance = regression.getSignificance();
        assertTrue(significance >= 0.0 && significance <= 1.0);
    }

    @Test(expected = MathException.class)
    public void testGetSignificanceInsufficientData() throws MathException {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);
        regression.getSignificance();
    }

    @Test
    public void testGetSlopeStdErrInsufficientData() {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);
        assertEquals(Double.NaN, regression.getSlopeStdErr(), 0.0);
    }

    @Test
    public void testGetInterceptStdErrInsufficientData() {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);
        assertEquals(Double.NaN, regression.getInterceptStdErr(), 0.0);
    }

    @Test
    public void testGetSlopeIntervalInsufficientData() throws MathException {
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);
        assertEquals(Double.NaN, regression.getSlopeConfidenceInterval(), 0.0);
    }

    @Test
    public void testPredictWithThreeObservations() {
        double[][] data = {{1.0, 3.0}, {2.0, 5.0}, {3.0, 7.0}};
        regression.addData(data);
        assertEquals(4.0, regression.predict(2.0), EPSILON);
        assertEquals(11.0, regression.predict(5.0), EPSILON);
    }

    @Test
    public void testNonPerfectRegression() throws MathException {
        double[][] data = {{0.0, 1.0}, {1.0, 3.0}, {2.0, 2.0}, {3.0, 5.0}, {4.0, 4.0}};
        regression.addData(data);
        double slope = regression.getSlope();
        double intercept = regression.getIntercept();
        assertEquals(0.9, slope, 0.1);
        assertEquals(1.1, intercept, 0.1);
        double r = regression.getR();
        assertTrue(r > 0.8 && r < 1.0);
        double r2 = regression.getRSquare();
        assertTrue(r2 > 0.7 && r2 < 1.0);
        double sse = regression.getSumSquaredErrors();
        assertTrue(sse > 0.0);
        double predY = regression.predict(5.0);
        assertTrue(predY > 5.0 && predY < 7.0);
        assertTrue(regression.getSlopeConfidenceInterval() > 0.0);
        double significance = regression.getSignificance();
        assertTrue(significance > 0.0 && significance < 0.5);
    }

    @Test
    public void testNegativeCorrelation() throws MathException {
        double[][] data = {{1.0, 9.0}, {2.0, 7.0}, {3.0, 5.0}, {4.0, 3.0}, {5.0, 1.0}};
        regression.addData(data);
        assertEquals(-2.0, regression.getSlope(), EPSILON);
        assertEquals(11.0, regression.getIntercept(), EPSILON);
        assertEquals(-1.0, regression.getR(), EPSILON);
        assertEquals(1.0, regression.getRSquare(), EPSILON);
        assertEquals(1.0, regression.predict(5.0), EPSILON);
    }

    @Test
    public void testLoopBoundaryZeroRows() {
        double[][] data = new double[0][0];
        regression.addData(data);
        assertEquals(0L, regression.getN());
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
    }

    @Test
    public void testLoopBoundaryOneRow() {
        double[][] data = {{1.0, 2.0}};
        regression.addData(data);
        assertEquals(1L, regression.getN());
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
    }

    @Test
    public void testExtremeValues() {
        double[][] data = {{Double.MAX_VALUE, Double.MAX_VALUE}, {Double.MAX_VALUE, Double.MAX_VALUE}, {Double.MAX_VALUE, Double.MAX_VALUE}};
        regression.addData(data);
        assertEquals(Double.NaN, regression.getSlope(), 0.0);
        assertEquals(Double.NaN, regression.getIntercept(), 0.0);
        assertEquals(Double.NaN, regression.getR(), 0.0);
    }
}