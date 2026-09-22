package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link SimpleRegression}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class SimpleRegressionTest {

    @Test
    public void addDataAndPredict_givenLinearData_shouldFitModel() {
        // Arrange: y = 2x + 1
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 3.0);
        regression.addData(2.0, 5.0);
        regression.addData(3.0, 7.0);
        regression.addData(4.0, 9.0);

        // Act
        double slope = regression.getSlope();
        double intercept = regression.getIntercept();
        double predicted = regression.predict(5.0);
        double r2 = regression.getRSquare();

        // Assert
        assertEquals(4, regression.getN());
        assertEquals(2.0, slope, 1e-9);
        assertEquals(1.0, intercept, 1e-9);
        assertEquals(11.0, predicted, 1e-9);
        assertEquals(1.0, r2, 1e-9);
        assertEquals(0.0, regression.getSumSquaredErrors(), 1e-9);
    }

    @Test
    public void addDataArray_given2DArray_shouldFitModel() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 2.0 },
            { 2.0, 4.0 },
            { 3.0, 6.0 }
        };
        SimpleRegression regression = new SimpleRegression();

        // Act
        regression.addData(data);

        // Assert
        assertEquals(3, regression.getN());
        assertEquals(2.0, regression.getSlope(), 1e-9);
        assertEquals(0.0, regression.getIntercept(), 1e-9);
        assertEquals(1.0, regression.getR(), 1e-9);
    }

    @Test
    public void clear_shouldResetAllStatistics() {
        // Arrange
        SimpleRegression regression = new SimpleRegression();
        regression.addData(1.0, 2.0);
        regression.addData(2.0, 3.0);

        // Act
        regression.clear();

        // Assert
        assertEquals(0, regression.getN());
        assertTrue(Double.isNaN(regression.getSlope()));
        assertTrue(Double.isNaN(regression.getIntercept()));
    }
}
