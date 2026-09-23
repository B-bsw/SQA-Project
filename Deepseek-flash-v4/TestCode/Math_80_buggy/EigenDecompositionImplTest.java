package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.util.MathUtils;

public class EigenDecompositionImplTest {

    private static final double EPS = 1.0e-12;

    @After
    public void tearDown() {
        // no cleanup needed
    }

    @Test
    public void testSymmetric2x2() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{2, 1}, {1, 3}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        double[] realEigenvalues = eig.getRealEigenvalues();
        assertEquals(2, realEigenvalues.length);
        assertTrue(realEigenvalues[0] > realEigenvalues[1]);
        assertEquals(3.618033988749895, realEigenvalues[0], 1e-12);
        assertEquals(1.3819660112501051, realEigenvalues[1], 1e-12);
        assertEquals(5.0, eig.getDeterminant(), 1e-12);
        RealMatrix recovered = eig.getV().multiply(eig.getD()).multiply(eig.getVT());
        assertEquals(0.0, matrix.subtract(recovered).getNorm(), EPS);
        RealMatrix V = eig.getV();
        RealMatrix VtV = V.transpose().multiply(V);
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        assertEquals(0.0, VtV.subtract(identity).getNorm(), EPS);
        double[] imag = eig.getImagEigenvalues();
        for (double v : imag) assertEquals(0.0, v, 0.0);
    }

    @Test
    public void testSymmetric3x3() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{3, 1, 0}, {1, 2, 1}, {0, 1, 3}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(3, ev.length);
        assertEquals(12.0, eig.getDeterminant(), 1e-12);
        RealMatrix recovered = eig.getV().multiply(eig.getD()).multiply(eig.getVT());
        assertEquals(0.0, matrix.subtract(recovered).getNorm(), EPS);
    }

    @Test
    public void test1x1() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{7.0}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        assertEquals(1, eig.getRealEigenvalues().length);
        assertEquals(7.0, eig.getRealEigenvalue(0), 1e-12);
        assertEquals(7.0, eig.getDeterminant(), 1e-12);
        RealMatrix recovered = eig.getV().multiply(eig.getD()).multiply(eig.getVT());
        assertEquals(0.0, matrix.subtract(recovered).getNorm(), EPS);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testNonSymmetricMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1, 2}, {3, 4}});
        new EigenDecompositionImpl(matrix, 0.0);
    }

    @Test
    public void testSingularMatrix() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1, 0}, {0, 0}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(1.0, ev[0], 1e-12);
        assertEquals(0.0, ev[1], 1e-12);
        DecompositionSolver solver = eig.getSolver();
        assertFalse(solver.isNonSingular());
        try {
            solver.solve(new double[]{1.0, 2.0});
            fail("Expected SingularMatrixException");
        } catch (SingularMatrixException e) {
            // expected
        }
    }

    @Test
    public void testSolve() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{4, 1}, {1, 3}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        DecompositionSolver solver = eig.getSolver();
        double[] b = {1.0, 2.0};
        double[] x = solver.solve(b);
        double[] ax = {4 * x[0] + x[1], x[0] + 3 * x[1]};
        assertArrayEquals(b, ax, 1e-12);
    }

    @Test
    public void testArrayConstructor() {
        double[] main = {4, 1};
        double[] secondary = {2};
        EigenDecompositionImpl eig = new EigenDecompositionImpl(main, secondary, 0.0);
        double[] ev = eig.getRealEigenvalues();
        assertEquals(5.0, ev[0], 1e-12);
        assertEquals(0.0, ev[1], 1e-12);
        assertFalse(eig.getSolver().isNonSingular());
    }

    @Test
    public void testGetEigenvector() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{2, 0}, {0, 3}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        RealVector v0 = eig.getEigenvector(0);
        RealVector v1 = eig.getEigenvector(1);
        assertNotNull(v0);
        assertNotNull(v1);
        assertEquals(2, v0.getDimension());
        assertEquals(2, v1.getDimension());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetRealEigenvalueOutOfBounds() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        eig.getRealEigenvalue(2);
    }

    @Test
    public void testImagEigenvalue() {
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{3, 2}, {2, 1}});
        EigenDecompositionImpl eig = new EigenDecompositionImpl(matrix, 0.0);
        double im = eig.getImagEigenvalue(0);
        assertEquals(0.0, im, 0.0);
    }
}