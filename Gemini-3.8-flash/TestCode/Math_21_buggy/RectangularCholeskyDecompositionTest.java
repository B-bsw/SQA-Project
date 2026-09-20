package org.apache.commons.math3.linear;

import org.junit.Assert;
import org.junit.Test;

public class RectangularCholeskyDecompositionTest {

    private static final double DEFAULT_THRESHOLD = 1.0e-10;

    @Test
    public void constructor_givenIdentityMatrix_shouldDecomposeSuccessfully() {
        // Arrange
        double[][] data = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertNotNull(root);
        Assert.assertEquals(2, decomp.getRank());
        Assert.assertEquals(2, root.getRowDimension());
        Assert.assertEquals(2, root.getColumnDimension());

        RealMatrix rebuilt = root.multiply(root.transpose());
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                Assert.assertEquals(data[i][j], rebuilt.getEntry(i, j), 1.0e-12);
            }
        }
    }

    @Test
    public void constructor_given3x3PositiveDefiniteMatrix_shouldExecuteInnerLoopsAndDecompose() {
        // Arrange: 3x3 positive definite matrix to ensure j-loop runs (for j = r + 1; j < i; ++j)
        double[][] data = new double[][] {
            { 4.0, 1.0, 1.0 },
            { 1.0, 3.0, 1.0 },
            { 1.0, 1.0, 2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertNotNull(root);
        Assert.assertEquals(3, decomp.getRank());
        Assert.assertEquals(3, root.getRowDimension());
        Assert.assertEquals(3, root.getColumnDimension());

        RealMatrix rebuilt = root.multiply(root.transpose());
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                Assert.assertEquals(data[i][j], rebuilt.getEntry(i, j), 1.0e-12);
            }
        }
    }

    @Test
    public void constructor_givenUnorderedDiagonalElements_shouldPerformDiagonalSwapping() {
        // Arrange: c[1][1] > c[0][0] triggers swap[r] != r branch
        double[][] data = new double[][] {
            { 1.0, 1.0 },
            { 1.0, 5.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertNotNull(root);
        Assert.assertEquals(2, decomp.getRank());
        RealMatrix rebuilt = root.multiply(root.transpose());
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                Assert.assertEquals(data[i][j], rebuilt.getEntry(i, j), 1.0e-12);
            }
        }
    }

    @Test
    public void constructor_given1x1PositiveMatrix_shouldDecomposeSingleElement() {
        // Arrange
        double[][] data = new double[][] {
            { 9.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertEquals(1, decomp.getRank());
        Assert.assertEquals(1, root.getRowDimension());
        Assert.assertEquals(1, root.getColumnDimension());
        Assert.assertEquals(3.0, root.getEntry(0, 0), 1.0e-12);
    }

    @Test
    public void constructor_givenRankDeficientPositiveSemidefiniteMatrix_shouldTerminateWhenDiagonalBelowThreshold() {
        // Arrange: rank 1 matrix with identical rows
        double[][] data = new double[][] {
            { 2.0, 2.0 },
            { 2.0, 2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertNotNull(root);
        Assert.assertEquals(2, decomp.getRank());
        RealMatrix rebuilt = root.multiply(root.transpose());
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                Assert.assertEquals(data[i][j], rebuilt.getEntry(i, j), 1.0e-12);
            }
        }
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void constructor_givenInitialDiagonalSmallerThanSmall_shouldThrowNonPositiveDefiniteMatrixException() {
        // Arrange: first diagonal element is zero and threshold is positive -> r == 0 branch
        double[][] data = new double[][] {
            { 0.0, 0.0 },
            { 0.0, 0.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void constructor_givenNegativeDiagonalAtFirstStep_shouldThrowNonPositiveDefiniteMatrixException() {
        // Arrange
        double[][] data = new double[][] {
            { -1.0, 0.0 },
            { 0.0, -2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
    }

    @Test(expected = NonPositiveDefiniteMatrixException.class)
    public void constructor_givenIndefiniteMatrix_shouldThrowExceptionWhenRemainingDiagonalNegative() {
        // Arrange: c[1][1] becomes negative (< -small) during transformation at r > 0
        double[][] data = new double[][] {
            { 1.0, 3.0 },
            { 3.0, 1.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
    }

    @Test
    public void constructor_given3x3RankDeficientMatrix_shouldVerifyExactRankAndRebuild() {
        // Arrange: 3x3 positive semidefinite with rank 2
        double[][] data = new double[][] {
            { 2.0, 1.0, 1.0 },
            { 1.0, 2.0, 1.0 },
            { 1.0, 1.0, 2.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);
        RealMatrix root = decomp.getRootMatrix();

        // Assert
        Assert.assertEquals(3, decomp.getRank());
        RealMatrix rebuilt = root.multiply(root.transpose());
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                Assert.assertEquals(data[i][j], rebuilt.getEntry(i, j), 1.0e-12);
            }
        }
    }

    @Test
    public void getRootMatrix_givenValidDecomposition_shouldReturnSameMatrixReference() {
        // Arrange
        double[][] data = new double[][] {
            { 4.0, 0.0 },
            { 0.0, 4.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);

        // Act
        RealMatrix root1 = decomp.getRootMatrix();
        RealMatrix root2 = decomp.getRootMatrix();

        // Assert
        Assert.assertSame(root1, root2);
    }

    @Test
    public void getRank_givenDiagonalMatrix_shouldReturnFullDimension() {
        // Arrange
        double[][] data = new double[][] {
            { 2.0, 0.0, 0.0 },
            { 0.0, 3.0, 0.0 },
            { 0.0, 0.0, 5.0 }
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Act
        RectangularCholeskyDecomposition decomp = new RectangularCholeskyDecomposition(matrix, DEFAULT_THRESHOLD);

        // Assert
        Assert.assertEquals(3, decomp.getRank());
    }
}