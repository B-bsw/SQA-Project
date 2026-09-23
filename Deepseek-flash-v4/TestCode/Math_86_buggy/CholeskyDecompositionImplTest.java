package org.apache.commons.math.linear;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CholeskyDecompositionImplTest {

    private double[][] symmetricPositiveDefinite2x2;
    private double[][] symmetricPositiveDefinite3x3;
    private double[][] nonSquare;
    private double[][] notSymmetric;
    private double[][] notPositiveDefinite;

    @Before
    public void setUp() {
        symmetricPositiveDefinite2x2 = new double[][]{{4, 0}, {0, 9}};
        symmetricPositiveDefinite3x3 = new double[][]{{4, 2, -2}, {2, 10, 0}, {-2, 0, 5}};
        nonSquare = new double[][]{{1, 2, 3}, {4, 5, 6}};
        notSymmetric = new double[][]{{1, 2}, {3, 4}};
        notPositiveDefinite = new double[][]{{1, 0}, {0, -1}};
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testNonSquareMatrix() {
        RealMatrix m = new RealMatrixImpl(nonSquare);
        new CholeskyDecompositionImpl(m);
    }

    @Test(expected = NotSymmetricMatrixException.class)
    public void testNotSymmetricMatrix() {
        RealMatrix m = new RealMatrixImpl(notSymmetric);
        new CholeskyDecompositionImpl(m);
    }

    @Test(expected = NotPositiveDefiniteMatrixException.class)
    public void testNotPositiveDefiniteMatrix() {
        RealMatrix m = new RealMatrixImpl(notPositiveDefinite);
        new CholeskyDecompositionImpl(m);
    }

    @Test
    public void testCholeskyDecompositionPositiveDefinite2x2() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite2x2);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        RealMatrix l = ch.getL();
        RealMatrix lt = ch.getLT();
        assertNotNull(l);
        assertNotNull(lt);
        // Verify A = L * LT
        RealMatrix a = l.multiply(lt);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(m.getEntry(i, j), a.getEntry(i, j), 1.0e-12);
            }
        }
        // Determinant for diagonal 4,9 -> 36
        assertEquals(36.0, ch.getDeterminant(), 1.0e-12);
        // Solver is non-singular
        assertTrue(ch.getSolver().isNonSingular());
    }

    @Test
    public void testCholeskyDecomposition3x3() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite3x3);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        RealMatrix l = ch.getL();
        RealMatrix lt = ch.getLT();
        RealMatrix a = l.multiply(lt);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(m.getEntry(i, j), a.getEntry(i, j), 1.0e-12);
            }
        }
        assertTrue(ch.getDeterminant() > 0);
    }

    @Test
    public void testSolverSolve() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite2x2);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        DecompositionSolver solver = ch.getSolver();
        double[] b = {1.0, 2.0};
        double[] x = solver.solve(b);
        assertEquals(0.25, x[0], 1.0e-12);
        assertEquals(2.0 / 9.0, x[1], 1.0e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolverSolveDimensionMismatch() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite2x2);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        double[] b = {1.0, 2.0, 3.0};
        ch.getSolver().solve(b);
    }

    @Test
    public void testSolverSolveRealMatrix() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite2x2);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        DecompositionSolver solver = ch.getSolver();
        RealMatrix b = new RealMatrixImpl(new double[][]{{1, 0}, {0, 1}});
        RealMatrix x = solver.solve(b);
        assertEquals(0.25, x.getEntry(0, 0), 1.0e-12);
        assertEquals(0.0, x.getEntry(0, 1), 1.0e-12);
        assertEquals(0.0, x.getEntry(1, 0), 1.0e-12);
        assertEquals(1.0 / 9.0, x.getEntry(1, 1), 1.0e-12);
    }

    @Test
    public void testGetInverse() {
        RealMatrix m = new RealMatrixImpl(symmetricPositiveDefinite2x2);
        CholeskyDecompositionImpl ch = new CholeskyDecompositionImpl(m);
        RealMatrix inv = ch.getSolver().getInverse();
        RealMatrix product = m.multiply(inv);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    assertEquals(1.0, product.getEntry(i, j), 1.0e-12);
                } else {
                    assertEquals(0.0, product.getEntry(i, j), 1.0e-12);
                }
            }
        }
    }
}