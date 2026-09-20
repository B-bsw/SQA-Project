package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optim.OptimizationData;
import org.junit.Assert;
import org.junit.Test;

public class WeightTest {

    private static final double EPSILON = 1e-15;

    @Test
    public void constructorArray_givenValidDiagonalArray_shouldCreateCorrectDiagonalMatrix() {
        // Arrange
        double[] diag = new double[] { 1.5, 2.0, 4.25 };

        // Act
        Weight weight = new Weight(diag);
        RealMatrix matrix = weight.getWeight();

        // Assert
        Assert.assertNotNull(matrix);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(3, matrix.getColumnDimension());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    Assert.assertEquals(diag[i], matrix.getEntry(i, j), EPSILON);
                } else {
                    Assert.assertEquals(0.0, matrix.getEntry(i, j), EPSILON);
                }
            }
        }
    }

    @Test
    public void constructorArray_givenSingleElementArray_shouldCreate1x1Matrix() {
        // Arrange
        double[] diag = new double[] { 7.0 };

        // Act
        Weight weight = new Weight(diag);
        RealMatrix matrix = weight.getWeight();

        // Assert
        Assert.assertNotNull(matrix);
        Assert.assertEquals(1, matrix.getRowDimension());
        Assert.assertEquals(1, matrix.getColumnDimension());
        Assert.assertEquals(7.0, matrix.getEntry(0, 0), EPSILON);
    }

    @Test(expected = NullPointerException.class)
    public void constructorArray_givenNullArray_shouldThrowNullPointerException() {
        // Arrange
        double[] diag = null;

        // Act
        new Weight(diag);
    }

    @Test
    public void constructorMatrix_givenSquareMatrix_shouldStoreAccurateCopy() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix originalMatrix = new Array2DRowRealMatrix(data);

        // Act
        Weight weight = new Weight(originalMatrix);
        RealMatrix retrievedMatrix = weight.getWeight();

        // Assert
        Assert.assertNotNull(retrievedMatrix);
        Assert.assertEquals(2, retrievedMatrix.getRowDimension());
        Assert.assertEquals(2, retrievedMatrix.getColumnDimension());
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Assert.assertEquals(data[i][j], retrievedMatrix.getEntry(i, j), EPSILON);
            }
        }
    }

    @Test
    public void constructorMatrix_givenOriginalMatrixModified_shouldNotAffectStoredMatrix() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };
        RealMatrix originalMatrix = new Array2DRowRealMatrix(data);
        Weight weight = new Weight(originalMatrix);

        // Act
        originalMatrix.setEntry(0, 0, 99.0);

        // Assert
        RealMatrix retrievedMatrix = weight.getWeight();
        Assert.assertEquals(1.0, retrievedMatrix.getEntry(0, 0), EPSILON);
    }

    @Test
    public void constructorMatrix_givenNonSquareMatrixMoreColumns_shouldThrowNonSquareMatrixException() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 }
        };
        RealMatrix nonSquareMatrix = new Array2DRowRealMatrix(data);

        // Act & Assert
        try {
            new Weight(nonSquareMatrix);
            Assert.fail("Expected NonSquareMatrixException was not thrown.");
        } catch (NonSquareMatrixException ex) {
            Assert.assertEquals(3, ex.getArgument());
            Assert.assertEquals(2, ex.getDimension());
        }
    }

    @Test
    public void constructorMatrix_givenNonSquareMatrixMoreRows_shouldThrowNonSquareMatrixException() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 },
            { 5.0, 6.0 }
        };
        RealMatrix nonSquareMatrix = new Array2DRowRealMatrix(data);

        // Act & Assert
        try {
            new Weight(nonSquareMatrix);
            Assert.fail("Expected NonSquareMatrixException was not thrown.");
        } catch (NonSquareMatrixException ex) {
            Assert.assertEquals(2, ex.getArgument());
            Assert.assertEquals(3, ex.getDimension());
        }
    }

    @Test(expected = NullPointerException.class)
    public void constructorMatrix_givenNullMatrix_shouldThrowNullPointerException() {
        // Arrange
        RealMatrix matrix = null;

        // Act
        new Weight(matrix);
    }

    @Test
    public void getWeight_givenRetrievedMatrixModified_shouldMaintainInternalStateImmutability() {
        // Arrange
        double[] diag = new double[] { 5.0, 10.0 };
        Weight weight = new Weight(diag);

        // Act
        RealMatrix firstCopy = weight.getWeight();
        firstCopy.setEntry(0, 0, 999.0);
        RealMatrix secondCopy = weight.getWeight();

        // Assert
        Assert.assertNotSame(firstCopy, secondCopy);
        Assert.assertEquals(5.0, secondCopy.getEntry(0, 0), EPSILON);
    }

    @Test
    public void weight_givenInstance_shouldImplementOptimizationData() {
        // Arrange
        Weight weight = new Weight(new double[] { 1.0 });

        // Act & Assert
        Assert.assertTrue(weight instanceof OptimizationData);
    }
}