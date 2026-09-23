package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EigenDecompositionImplTest {

    private static final double TOL = 1e-10;

    private double[][] symmetric2x2 = new double[][] {{2.0, 1.0}, {1.0, 2.0}};
    private double[][] symmetric1x1 = new double[][] {{5.0}};
    private double[][] symmetric3x3 = new double[][] {{3.0, 1.0, 0.0}, {1.0, 3.0, 1.0}, {0.0, 1.0, 3.0}};
    private double[][] nonSymmetric2x2 = new double[][] {{1.0, 2.0}, {3.0, 4.0}};
    private double[][] singular2x2 = new double[][] {{1.0, 0.0}, {0.0, 0.0}};

    @Test
    public void testConstructorSymmetric1x1() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric1x1);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(1, ev.length);
        assertEquals(5.0, ev[0], TOL);
        assertNotNull(eig.getV());
        assertNotNull(eig.getD());
        assertNotNull(eig.getVT());
    }

    @Test
    public void testConstructorSymmetric2x2() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(2, ev.length);
        assertEquals(3.0, ev[0], TOL);
        assertEquals(1.0, ev[1], TOL);
        assertEquals(3.0 * 1.0, eig.getDeterminant(), TOL);
        // check eigenvector orthogonality
        RealVector v0 = eig.getEigenvector(0);
        RealVector v1 = eig.getEigenvector(1);
        assertEquals(0.0, v0.dotProduct(v1), TOL);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testConstructorNonSymmetric() {
        RealMatrix m = MatrixUtils.createRealMatrix(nonSymmetric2x2);
        new EigenDecompositionImpl(m, 1e-6);
    }

    @Test
    public void testConstructorArrays2x2() {
        double[] main = {2.0, 2.0};
        double[] secondary = {1.0};
        EigenDecompositionImpl eig = new EigenDecompositionImpl(main, secondary, 1e-6);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(2, ev.length);
        assertEquals(3.0, ev[0], TOL);
        assertEquals(1.0, ev[1], TOL);
        assertNotNull(eig.getV());
    }

    @Test
    public void testGetRealEigenvaluesSortedDescending() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric3x3);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(3, ev.length);
        // eigenvalues for this matrix: 3+√2, 3, 3-√2
        double expected1 = 3.0 + Math.sqrt(2.0);
        double expected2 = 3.0;
        double expected3 = 3.0 - Math.sqrt(2.0);
        assertEquals(expected1, ev[0], TOL);
        assertEquals(expected2, ev[1], TOL);
        assertEquals(expected3, ev[2], TOL);
    }

    @Test
    public void testGetEigenvectorNormalization() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        RealVector v = eig.getEigenvector(0);
        assertEquals(1.0, v.getNorm(), TOL);
    }

    @Test
    public void testDeterminant() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        double expected = 2.0 * 2.0 - 1.0 * 1.0;
        assertEquals(expected, eig.getDeterminant(), TOL);
    }

    @Test
    public void testSolverSolveVector() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        DecompositionSolver solver = eig.getSolver();
        RealVector b = new ArrayRealVector(new double[] {3.0, 5.0});
        RealVector x = solver.solve(b);
        RealVector expected = new ArrayRealVector(new double[] {1.0, 2.0}); // Ax = b -> x = A^{-1}b
        RealVector product = m.operate(x);
        assertEquals(b.getEntry(0), product.getEntry(0), TOL);
        assertEquals(b.getEntry(1), product.getEntry(1), TOL);
    }

    @Test(expected = SingularMatrixException.class)
    public void testSolverSingularMatrix() {
        RealMatrix m = MatrixUtils.createRealMatrix(singular2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        DecompositionSolver solver = eig.getSolver();
        assertFalse(solver.isNonSingular());
        solver.solve(new double[] {1.0, 0.0});
    }

    @Test
    public void testSolverGetInverse() {
        RealMatrix m = MatrixUtils.createRealMatrix(symmetric2x2);
        EigenDecompositionImpl eig = new EigenDecompositionImpl(m, 1e-6);
        DecompositionSolver solver = eig.getSolver();
        RealMatrix inv = solver.getInverse();
        RealMatrix product = m.multiply(inv);
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(identity.getEntry(i, j), product.getEntry(i, j), TOL);
            }
        }
    }

    @Test
    public void testConstructorArrays1x1() {
        double[] main = {7.0};
        double[] secondary = {};
        EigenDecompositionImpl eig = new EigenDecompositionImpl(main, secondary, 1e-6);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(1, ev.length);
        assertEquals(7.0, ev[0], TOL);
    }
}