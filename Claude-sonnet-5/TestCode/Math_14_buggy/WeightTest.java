package org.apache.commons.math3.optim.nonlinear.vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.junit.Test;

public class WeightTest {

    @Test
    public void testDoubleArrayConstructorNormalCase() {
        double[] weights = {1.0, 2.0, 3.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(3, matrix.getRowDimension());
        assertEquals(3, matrix.getColumnDimension());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    assertEquals(weights[i], matrix.getEntry(i, j), 1e-12);
                } else {
                    assertEquals(0.0, matrix.getEntry(i, j), 1e-12);
                }
            }
        }
    }

    @Test
    public void testDoubleArrayConstructorSingleElement() {
        double[] weights = {5.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(1, matrix.getRowDimension());
        assertEquals(1, matrix.getColumnDimension());
        assertEquals(5.0, matrix.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testDoubleArrayConstructorEmptyArray() {
        double[] weights = {};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(0, matrix.getRowDimension());
        assertEquals(0, matrix.getColumnDimension());
    }

    @Test(expected = NullPointerException.class)
    public void testDoubleArrayConstructorNullInput() {
        double[] weights = null;
        new Weight(weights);
    }

    @Test
    public void testRealMatrixConstructorNormalCase() {
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight w = new Weight(inputMatrix);
        RealMatrix resultMatrix = w.getWeight();

        assertEquals(3, resultMatrix.getRowDimension());
        assertEquals(3, resultMatrix.getColumnDimension());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(data[i][j], resultMatrix.getEntry(i, j), 1e-12);
            }
        }
    }

    @Test
    public void testRealMatrixConstructorSingleElement() {
        double[][] data = {{7.0}};
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight w = new Weight(inputMatrix);
        RealMatrix resultMatrix = w.getWeight();

        assertEquals(1, resultMatrix.getRowDimension());
        assertEquals(1, resultMatrix.getColumnDimension());
        assertEquals(7.0, resultMatrix.getEntry(0, 0), 1e-12);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testRealMatrixConstructorNonSquareMatrixMoreRows() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        new Weight(inputMatrix);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testRealMatrixConstructorNonSquareMatrixMoreColumns() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        new Weight(inputMatrix);
    }

    @Test(expected = NullPointerException.class)
    public void testRealMatrixConstructorNullInput() {
        RealMatrix inputMatrix = null;
        new Weight(inputMatrix);
    }

    @Test
    public void testGetWeightReturnsCopyNotSameReference() {
        double[] weights = {1.0, 2.0, 3.0};
        Weight w = new Weight(weights);
        RealMatrix matrix1 = w.getWeight();
        RealMatrix matrix2 = w.getWeight();

        assertNotSame(matrix1, matrix2);
        assertEquals(matrix1.getEntry(0, 0), matrix2.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testGetWeightDoesNotModifyOriginal() {
        double[][] data = {
            {1.0, 0.0},
            {0.0, 2.0}
        };
        RealMatrix inputMatrix = new Array2DRowRealMatrix(data);
        Weight w = new Weight(inputMatrix);

        RealMatrix resultMatrix = w.getWeight();
        resultMatrix.setEntry(0, 0, 999.0);

        RealMatrix resultMatrix2 = w.getWeight();
        assertEquals(1.0, resultMatrix2.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testDoubleArrayConstructorMultipleLoopIterations() {
        double[] weights = {1.0, 2.0, 3.0, 4.0, 5.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(5, matrix.getRowDimension());
        assertEquals(5, matrix.getColumnDimension());

        for (int i = 0; i < 5; i++) {
            assertEquals(weights[i], matrix.getEntry(i, i), 1e-12);
        }