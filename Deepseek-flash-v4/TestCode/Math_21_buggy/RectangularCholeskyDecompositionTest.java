package org.apache.commons.math3.linear;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class RectangularCholeskyDecompositionTest {

    private static final double EPS = 1e-10;

    // Test cases for identity matrix
    @Test
    public void testIdentityMatrix() throws Exception {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        });
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be 3 for full rank matrix", 3, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals("Root matrix should have 3 rows", 3, root.getRowDimension());
        assertEquals("Root matrix should have 3 columns", 3, root.getColumnDimension());
    }

    @Test
    public void testSingularMatrix() throws Exception {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        });
        RectangularCholeskyDecomposition decomposition = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be 1 for rank-1 matrix", 1, decomposition.getRank());
        RealMatrix root = decomposition.getRootMatrix();
        assertEquals("Root matrix should have 3 rows", 3, root.getRowDimension());
        assertEquals("Root matrix should have 1 column", 1, root.getColumnDimension());
    }

    @Test
    public void testZeroMatrixThrows() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {0, 0},
                {0, 0}
        });
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-10);
            fail("Expected NonPositiveDefiniteMatrixException for zero matrix with positive small threshold");
        } catch (NonPositiveDefiniteMatrixException e) {
            // expected exception
        }
    }

    @Test
    public void testNegativeDiagonalThrows() {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {1, 0},
                {0, -1}
        });
        try {
            new RectangularCholeskyDecomposition(matrix, 1e-10);
            fail("Expected NonPositiveDefiniteMatrixException for matrix with negative diagonal element");
        } catch (NonPositiveDefiniteMatrixException e) {
            // expected exception
        }
    }

    @Test
    public void testBoundarySmallThreshold() throws Exception {
        // diagonal element equals to threshold, should be accepted
        RealMatrix matrix1 = new Array2DRowRealMatrix(new double[][]{{1e-10}});
        RectangularCholeskyDecomposition d1 = new RectangularCholeskyDecomposition(matrix1, 1e-10);
        assertEquals("Rank should be 1 when diagonal equals threshold", 1, d1.getRank());

        // diagonal element less than threshold but positive, should be accepted (but all remaining zeros)
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{
                {0.5, 0, 0},
                {0, 1e-12, 0},
                {0, 0, 0}
        });
        RectangularCholeskyDecomposition d2 = new RectangularCholeskyDecomposition(matrix2, 1e-10);
        assertEquals("Rank should be 1 for second matrix", 1, d2.getRank());
    }

    @Test
    public void test3x3Diagonal() throws Exception {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {4, 0, 0},
                {0, 9, 0},
                {0, 0, 16}
        });
        RectangularCholeskyDecomposition d = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be 3", 3, d.getRank());
        RealMatrix root = d.getRootMatrix();
        RealMatrix product = root.multiply(root.transpose());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double expected = (i == j) ? (i == 0 ? 4 : (i == 1 ? 9 : 16)) : 0;
                assertEquals("Product element mismatch at [" + i + "][" + j + "]", expected, product.getEntry(i, j), EPS);
            }
        }
    }

    @Test
    public void testNonSymmetricMatrixWithPositiveDefinite() throws Exception {
        // Not symmetric but positive definite (will fail if not symmetric)
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{
                {4, 1},
                {1, 3}
        });
        RectangularCholeskyDecomposition d = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be 2", 2, d.getRank());
    }

    @Test
    public void testSingleElementMatrix() throws Exception {
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{{5}});
        RectangularCholeskyDecomposition d = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be 1", 1, d.getRank());
        RealMatrix root = d.getRootMatrix();
        RealMatrix product = root.multiply(root.transpose());
        assertEquals("Product should be original", 5.0, product.getEntry(0, 0), EPS);
    }

    @Test
    public void testLargeMatrix() throws Exception {
        int n = 5;
        RealMatrix matrix = new Array2DRowRealMatrix(n, n);
        for (int i = 0; i < n; i++) {
            matrix.setEntry(i, i, i + 1.0);
            for (int j = i + 1; j < n; j++) {
                // create positive definite symmetric matrix: diagonal dominates
                matrix.setEntry(i, j, 0.1);
                matrix.setEntry(j, i, 0.1);
            }
        }
        // Make it positive definite by ensuring diagonal dominance
        for (int i = 0; i < n; i++) {
            matrix.setEntry(i, i, 10);
        }
        RectangularCholeskyDecomposition d = new RectangularCholeskyDecomposition(matrix, 1e-10);
        assertEquals("Rank should be " + n, n, d.getRank());
        RealMatrix root = d.getRootMatrix();
        RealMatrix product = root.multiply(root.transpose());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                assertEquals("Product mismatch", matrix.getEntry(i, j), product.getEntry(i, j), 1e-8);
            }
        }
    }

    @Test
    public void testNullMatrixThrows() {
        try {
            new RectangularCholeskyDecomposition(null, 1e-10);
            fail("Expected NullPointerException or IllegalArgumentException");
        } catch (IllegalArgumentException | NullPointerException e) {
            // expected
        }
    }
}