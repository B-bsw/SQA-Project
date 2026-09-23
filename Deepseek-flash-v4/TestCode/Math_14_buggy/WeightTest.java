package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math3.linear.MatrixUtils;

public class WeightTest {
    
    private Weight weight;
    private static final double[] WEIGHT_VALUES = {1.0, 2.0, 3.0};
    private static final double EPSILON = 1e-10;

    @Before
    public void setUp() {
        weight = new Weight(WEIGHT_VALUES.clone());
    }

    @After
    public void tearDown() {
        weight = null;
    }

    @Test
    public void testConstructorDoubleArray() {
        RealMatrix result = weight.getWeight();
        assertNotNull("Matrix should not be null", result);
        assertEquals("Row dimension incorrect", WEIGHT_VALUES.length, result.getRowDimension());
        assertEquals("Column dimension incorrect", WEIGHT_VALUES.length, result.getColumnDimension());
        
        for (int i = 0; i < WEIGHT_VALUES.length; i++) {
            assertEquals("Diagonal entry mismatch at index " + i, WEIGHT_VALUES[i], 
                         result.getEntry(i, i), EPSILON);
            for (int j = 0; j < WEIGHT_VALUES.length; j++) {
                if (i != j) {
                    assertEquals("Off-diagonal entry should be zero", 0.0, 
                                 result.getEntry(i, j), EPSILON);
                }
            }
        }
    }

    @Test
    public void testConstructorRealMatrixSquare() {
        double[][] data = {{1.0, 0.0}, {0.0, 2.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        weight = new Weight(matrix);
        RealMatrix result = weight.getWeight();
        
        assertEquals("Row dimension mismatch", 2, result.getRowDimension());
        assertEquals("Column dimension mismatch", 2, result.getColumnDimension());
        assertEquals("Entry [0][0] mismatch", 1.0, result.getEntry(0, 0), EPSILON);
        assertEquals("Entry [1][1] mismatch", 2.0, result.getEntry(1, 1), EPSILON);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorRealMatrixNonSquareThrows() {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        new Weight(matrix);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullDoubleArray() {
        new Weight((double[]) null);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullRealMatrix() {
        new Weight((RealMatrix) null);
    }

    @Test
    public void testGetWeightReturnsCopy() {
        RealMatrix original = weight.getWeight();
        original.setEntry(0, 0, 999.0);
        
        RealMatrix second = weight.getWeight();
        assertEquals("Original weight matrix should not be modified", 1.0, 
                     second.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testEmptyDoubleArray() {
        double[] emptyArray = new double[0];
        weight = new Weight(emptyArray);
        RealMatrix result = weight.getWeight();
        
        assertEquals("Row dimension should be zero", 0, result.getRowDimension());
        assertEquals("Column dimension should be zero", 0, result.getColumnDimension());
    }

    @Test
    public void testSingleElementDoubleArray() {
        double[] single = {42.0};
        weight = new Weight(single);
        RealMatrix result = weight.getWeight();
        
        assertEquals(1, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals("Diagonal entry mismatch", 42.0, result.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testConstructorRealMatrixWithDiagonalValues() {
        double[][] data = {{1.0, 0.5}, {0.5, 1.0}};
        RealMatrix matrix = new DiagonalMatrix(new double[] {1.0, 2.0});
        weight = new Weight(matrix);
        
        RealMatrix result = weight.getWeight();
        assertEquals("Row dimension mismatch", 2, result.getRowDimension());
        assertEquals("Column dimension mismatch", 2, result.getColumnDimension());
        assertEquals("Value at [0][0] mismatch", 1.0, result.getEntry(0, 0), EPSILON);
        assertEquals("Value at [1][1] mismatch", 2.0, result.getEntry(1, 1), EPSILON);
        assertEquals("Off-diagonal mismatch", 0.0, result.getEntry(0, 1), EPSILON);
        assertEquals("Off-diagonal mismatch", 0.0, result.getEntry(1, 0), EPSILON);
    }

    @Test
    public void testGetWeightMultipleCallsIndependence() {
        RealMatrix firstCall = weight.getWeight();
        RealMatrix secondCall = weight.getWeight();
        
        assertNotSame("Different instances should be returned for each call", 
                     firstCall, secondCall);
        assertEquals("Matrices should be equal", firstCall, secondCall);
        
        firstCall.setEntry(0, 0, 999.0);
        assertEquals("Modifying first retrieved matrix should not affect data", 
                     1.0, weight.getWeight().getEntry(0, 0), EPSILON);
    }

    @Test
    public void testLargeMatrixPerformance() {
        int size = 10;
        double[] values = new double[size];
        for (int i = 0; i < size; i++) {
            values[i] = (i + 1) * 1.5;
        }
        
        weight = new Weight(values);
        RealMatrix result = weight.getWeight();
        
        assertEquals(size, result.getRowDimension());
        assertEquals(size, result.getColumnDimension());
        for (int i = 0; i < size; i++) {
            assertEquals(values[i], result.getEntry(i, i), EPSILON);
        }
    }

    @Test
    public void testNonSymmetricMatrixAccepted() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        weight = new Weight(matrix);
        
        RealMatrix result = weight.getWeight();
        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), EPSILON);
        assertEquals(2.0, result.getEntry(0, 1), EPSILON);
        assertEquals(3.0, result.getEntry(1, 0), EPSILON);
        assertEquals(4.0, result.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testNegativeValuesInDiagonal() {
        double[] negativeValues = {-1.0, -2.0, -3.0};
        weight = new Weight(negativeValues);
        
        RealMatrix result = weight.getWeight();
        for (int i = 0; i < negativeValues.length; i++) {
            assertEquals(negativeValues[i], result.getEntry(i, i), EPSILON);
        }
    }

    @Test
    public void testZeroValuesOnDiagonal() {
        double[] zeros = {0.0, 0.0, 0.0};
        weight = new Weight(zeros);
        
        RealMatrix result = weight.getWeight();
        for (int i = 0; i < zeros.length; i++) {
            assertEquals(0.0, result.getEntry(i, i), EPSILON);
        }
    }

    @Test
    public void testLargeValues() {
        double[] largeValues = {Double.MAX_VALUE, -Double.MAX_VALUE, 1.0};
        weight = new Weight(largeValues);
        
        RealMatrix result = weight.getWeight();
        for (int i = 0; i < largeValues.length; i++) {
            assertEquals(largeValues[i], result.getEntry(i, i), 1e-10);
        }
    }

    @Test
    public void testBoundarySquareMatrix() {
        double[][] data = {{1.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        weight = new Weight(matrix);
        
        RealMatrix result = weight.getWeight();
        assertEquals(1, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testMixedMatrixDimensions() {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        weight = new Weight(matrix);
        
        RealMatrix result = weight.getWeight();
        assertEquals("Row dimension incorrect", 3, result.getRowDimension());
        assertEquals("Column dimension incorrect", 3, result.getColumnDimension());
    }
}