package org.apache.commons.math.linear;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SingularValueDecompositionImplTest {

    private RealMatrix squareMatrix;
    private RealMatrix tallMatrix;
    private RealMatrix wideMatrix;
    private static final double EPS = 1e-12;

    @Before
    public void setUp() {
        // 2x2 identity matrix
        squareMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 0.0},
            {0.0, 1.0}
        });
        // 3x2 matrix (m > n)
        tallMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        });
        // 2x3 matrix (m < n)
        wideMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        });
    }

    @Test
    public void testConstructorSquareMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        assertNotNull(svd);
        double[] singularValues = svd.getSingularValues();
        assertEquals(2, singularValues.length);
        assertEquals(1.0, singularValues[0], EPS);
        assertEquals(1.0, singularValues[1], EPS);
    }

    @Test
    public void testConstructorTallMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(tallMatrix);
        assertNotNull(svd);
        double[] singularValues = svd.getSingularValues();
        assertTrue(singularValues.length <= 2); // rank >= 1
        // check non-negative
        for (double v : singularValues) assertTrue(v > 0);
    }

    @Test
    public void testConstructorWideMatrix() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(wideMatrix);
        assertNotNull(svd);
        double[] singularValues = svd.getSingularValues();
        assertTrue(singularValues.length <= 2); 
        for (double v : singularValues) assertTrue(v > 0);
    }

    @Test
    public void testConstructorWithMax() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix, 1);
        double[] singularValues = svd.getSingularValues();
        assertEquals(1, singularValues.length);
        assertEquals(1.0, singularValues[0], EPS);
    }

    @Test
    public void testGetU() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix u = svd.getU();
        assertNotNull(u);
        assertEquals(2, u.getRowDimension());
        assertEquals(2, u.getColumnDimension());
        // U*U^T should be identity (orthogonal)
        RealMatrix uut = u.multiply(svd.getUT());
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        assertMatrixEquals(identity, uut, EPS);
    }

    @Test
    public void testGetV() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix v = svd.getV();
        assertNotNull(v);
        assertEquals(2, v.getRowDimension());
        assertEquals(2, v.getColumnDimension());
        RealMatrix vvt = v.multiply(svd.getVT());
        RealMatrix identity = MatrixUtils.createRealIdentityMatrix(2);
        assertMatrixEquals(identity, vvt, EPS);
    }

    @Test
    public void testGetS() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix s = svd.getS();
        assertNotNull(s);
        assertEquals(2, s.getRowDimension());
        assertEquals(2, s.getColumnDimension());
        // S should be diagonal with singular values
        assertEquals(1.0, s.getEntry(0,0), EPS);
        assertEquals(1.0, s.getEntry(1,1), EPS);
        assertEquals(0.0, s.getEntry(0,1), EPS);
        assertEquals(0.0, s.getEntry(1,0), EPS);
    }

    @Test
    public void testReconstruction() {
        // A = U * S * V^T
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix reconstructed = svd.getU().multiply(svd.getS()).multiply(svd.getVT());
        assertMatrixEquals(squareMatrix, reconstructed, EPS);
    }

    @Test
    public void testGetNorm() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        assertEquals(1.0, svd.getNorm(), EPS);
    }

    @Test
    public void testGetConditionNumber() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        assertEquals(1.0, svd.getConditionNumber(), EPS);
    }

    @Test
    public void testGetRank() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        assertEquals(2, svd.getRank());
        // singular matrix (zero singular values) would return 0, but we have full rank
        // test with scaled identity
        RealMatrix scaled = MatrixUtils.createRealMatrix(new double[][]{{2.0,0},{0,0}});
        SingularValueDecompositionImpl svd2 = new SingularValueDecompositionImpl(scaled);
        // singular values: ~2 and 0 (threshold should exclude zero)
        assertEquals(1, svd2.getRank());
    }

    @Test
    public void testGetCovariance() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix cov = svd.getCovariance(0.5);
        assertNotNull(cov);
        assertEquals(2, cov.getRowDimension());
        assertEquals(2, cov.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCovarianceCutoffTooHigh() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        svd.getCovariance(10.0);
    }

    @Test
    public void testGetSolver() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        DecompositionSolver solver = svd.getSolver();
        assertNotNull(solver);
        assertTrue(solver.isNonSingular());
        // solve linear system A*x = b
        RealVector b = new ArrayRealVector(new double[]{2.0, 3.0});
        RealVector x = solver.solve(b);
        assertEquals(2.0, x.getEntry(0), EPS);
        assertEquals(3.0, x.getEntry(1), EPS);
        // test solve(RealMatrix)
        RealMatrix bMat = new Array2DRowRealMatrix(new double[][]{{2.0},{3.0}});
        RealMatrix xMat = solver.solve(bMat);
        assertEquals(2.0, xMat.getEntry(0,0), EPS);
        assertEquals(3.0, xMat.getEntry(1,0), EPS);
        // test getInverse
        RealMatrix inv = solver.getInverse();
        assertMatrixEquals(squareMatrix, inv, EPS);
    }

    @Test
    public void testGetSingularValuesClone() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        double[] values = svd.getSingularValues();
        double[] valuesClone = svd.getSingularValues();
        assertNotSame(values, valuesClone);
        assertArrayEquals(values, valuesClone, EPS);
    }

    @Test
    public void testGetUT() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix ut = svd.getUT();
        assertNotNull(ut);
        assertEquals(2, ut.getRowDimension());
        assertEquals(2, ut.getColumnDimension());
        // UT = U^T
        RealMatrix expectedUt = svd.getU().transpose();
        assertMatrixEquals(expectedUt, ut, EPS);
    }

    @Test
    public void testGetVT() {
        SingularValueDecompositionImpl svd = new SingularValueDecompositionImpl(squareMatrix);
        RealMatrix vt = svd.getVT();
        assertNotNull(vt);
        assertEquals(2, vt.getRowDimension());
        assertEquals(2, vt.getColumnDimension());
        RealMatrix expectedVt = svd.getV().transpose();
        assertMatrixEquals(expectedVt, vt, EPS);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testConstructorWithInvalidMatrix() {
        // matrix with NaN may cause convergence exception wrapped in InvalidMatrixException
        RealMatrix nanMatrix = MatrixUtils.createRealMatrix(new double[][]{{Double.NaN, 0},{0,1}});
        new SingularValueDecompositionImpl(nanMatrix);
    }

    // helper method to compare matrices
    private void assertMatrixEquals(RealMatrix expected, RealMatrix actual, double tol) {
        assertEquals(expected.getRowDimension(), actual.getRowDimension());
        assertEquals(expected.getColumnDimension(), actual.getColumnDimension());
        for (int i = 0; i < expected.getRowDimension(); i++) {
            for (int j = 0; j < expected.getColumnDimension(); j++) {
                assertEquals(expected.getEntry(i,j), actual.getEntry(i,j), tol);
            }
        }
    }
}