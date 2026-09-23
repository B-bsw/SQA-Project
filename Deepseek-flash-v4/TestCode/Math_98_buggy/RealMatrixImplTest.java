package org.apache.commons.math.linear;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RealMatrixImplTest {

    private RealMatrixImpl m2x2;
    private RealMatrixImpl singular;
    private RealMatrixImpl identity;
    private RealMatrixImpl nonSquare;

    @Before
    public void setUp() {
        m2x2 = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        singular = new RealMatrixImpl(new double[][]{{1, 2}, {2, 4}});
        identity = new RealMatrixImpl(new double[][]{{1, 0}, {0, 1}});
        nonSquare = new RealMatrixImpl(new double[][]{{1, 2, 3}, {4, 5, 6}});
    }

    private void assertMatrixEquals(double[][] expected, RealMatrix actual) {
        assertEquals(expected.length, actual.getRowDimension());
        assertEquals(expected[0].length, actual.getColumnDimension());
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals("entry[" + i + "][" + j + "]", expected[i][j], actual.getEntry(i, j), 1e-12);
            }
        }
    }

    @Test
    public void testDefaultConstructor() {
        RealMatrixImpl m = new RealMatrixImpl();
        assertNotNull(m);
    }

    @Test
    public void testConstructorDimensions() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        assertEquals(2, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
        assertMatrixEquals(new double[][]{{0, 0, 0}, {0, 0, 0}}, m);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDimensionsInvalid() {
        new RealMatrixImpl(0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDimensionsInvalidColumn() {
        new RealMatrixImpl(2, -1);
    }

    @Test
    public void testConstructorFromArrayCopy() {
        double[][] input = {{1, 2}, {3, 4}};
        RealMatrixImpl m = new RealMatrixImpl(input, true);
        input[0][0] = 99;
        assertEquals(1.0, m.getEntry(0, 0), 0.0);
        assertNotSame(input, m.getDataRef());
    }

    @Test
    public void testConstructorFromArrayNoCopy() {
        double[][] input = {{1, 2}, {3, 4}};
        RealMatrixImpl m = new RealMatrixImpl(input, false);
        input[0][0] = 99;
        assertEquals(99.0, m.getEntry(0, 0), 0.0);
        assertSame(input, m.getDataRef());
    }

    @Test
    public void testConstructorFromArrayNull() {
        try {
            new RealMatrixImpl((double[][]) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
        try {
            new RealMatrixImpl(null, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
        try {
            new RealMatrixImpl(null, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testConstructorFromEmptyArray() {
        try {
            new RealMatrixImpl(new double[0][0]);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        try {
            new RealMatrixImpl(new double[0][0], true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
        try {
            new RealMatrixImpl(new double[0][0], false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testConstructorFromVector() {
        RealMatrixImpl m = new RealMatrixImpl(new double[]{1, 2, 3});
        assertEquals(3, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(2.0, m.getEntry(1, 0), 0.0);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorFromNullVector() {
        new RealMatrixImpl((double[]) null);
    }

    @Test
    public void testAdd() {
        RealMatrixImpl sum = m2x2.add(new RealMatrixImpl(new double[][]{{5, 6}, {7, 8}}));
        assertMatrixEquals(new double[][]{{6, 8}, {10, 12}}, sum);
        assertMatrixEquals(new double[][]{{1, 2}, {3, 4}}, m2x2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDimensionMismatch() {
        m2x2.add(new RealMatrixImpl(new double[][]{{1}}));
    }

    @Test
    public void testSubtract() {
        RealMatrixImpl diff = m2x2.subtract(new RealMatrixImpl(new double[][]{{1, 1}, {1, 1}}));
        assertMatrixEquals(new double[][]{{0, 1}, {2, 3}}, diff);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractDimensionMismatch() {
        m2x2.subtract(new RealMatrixImpl(new double[][]{{1}}));
    }

    @Test
    public void testScalarAdd() {
        assertMatrixEquals(new double[][]{{3, 4}, {5, 6}}, m2x2.scalarAdd(2));
    }

    @Test
    public void testScalarMultiply() {
        assertMatrixEquals(new double[][]{{2, 4}, {6, 8}}, m2x2.scalarMultiply(2));
    }

    @Test
    public void testMultiply() {
        RealMatrix product = m2x2.multiply(new RealMatrixImpl(new double[][]{{0, 1}, {1, 0}}));
        assertMatrixEquals(new double[][]{{2, 1}, {4, 3}}, product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyDimensionMismatch() {
        m2x2.multiply(new RealMatrixImpl(new double[][]{{1, 2, 3}}));
    }

    @Test
    public void testPreMultiply() {
        assertMatrixEquals(new double[][]{{1, 2}, {3, 4}}, m2x2.preMultiply(identity));
    }

    @Test
    public void testGetDataReturnsCopy() {
        double[][] data = m2x2.getData();
        data[0][0] = 99;
        assertEquals(1.0, m2x2.getEntry(0, 0), 0.0);
    }

    @Test
    public void testGetDataRefReturnsInternal() {
        double[][] data = m2x2.getDataRef();
        data[0][0] = 99;
        assertEquals(99.0, m2x2.getEntry(0, 0), 0.0);
    }

    @Test
    public void testGetNorm() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1, -2}, {3, 4}});
        assertEquals(6.0, m.getNorm(), 0.0);
    }

    @Test
    public void testGetSubMatrixRange() {
        assertMatrixEquals(new double[][]{{1, 2}, {3, 4}}, m2x2.getSubMatrix(0, 1, 0, 1));
        assertMatrixEquals(new double[][]{{2}, {4}}, m2x2.getSubMatrix(0, 1, 1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalid() {
        m2x2.getSubMatrix(-1, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixRangeInvalidOrder() {
        m2x2.getSubMatrix(1, 0, 0, 1);
    }

    @Test
    public void testGetSubMatrixSelected() {
        assertMatrixEquals(new double[][]{{1, 2}, {3, 4}},
                m2x2.getSubMatrix(new int[]{0, 1}, new int[]{0, 1}));
        assertMatrixEquals(new double[][]{{3}}, m2x2.getSubMatrix(new int[]{1}, new int[]{0}));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixSelectedEmpty() {
        m2x2.getSubMatrix(new int[0], new int[]{0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixSelectedOutOfBounds() {
        m2x2.getSubMatrix(new int[]{5}, new int[]{0});
    }

    @Test
    public void testSetSubMatrix() {
        m2x2.setSubMatrix(new double[][]{{9, 9}}, 1, 0);
        assertMatrixEquals(new double[][]{{1, 2}, {9, 9}}, m2x2);
    }

    @Test
    public void testSetSubMatrixOnUninitialized() {
        RealMatrixImpl m = new RealMatrixImpl();
        m.setSubMatrix(new double[][]{{1, 2}, {3, 4}}, 0, 0);
        assertMatrixEquals(new double[][]{{1, 2}, {3, 4}}, m);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixNegativePosition() {
        m2x2.setSubMatrix(new double[][]{{1}}, -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixEmpty() {
        m2x2.setSubMatrix(new double[0][0], 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrixRagged() {
        m2x2.setSubMatrix(new double[][]{{1}, {2, 3}}, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrixOverflow() {
        m2x2.setSubMatrix(new double[][]{{1, 2}, {3, 4}}, 1, 1);
    }

    @Test
    public void testGetRowMatrix() {
        assertMatrixEquals(new double[][]{{3, 4}}, m2x2.getRowMatrix(1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrixInvalid() {
        m2x2.getRowMatrix(2);
    }

    @Test
    public void testGetColumnMatrix() {
        assertMatrixEquals(new double[][]{{1}, {3}}, m2x2.getColumnMatrix(0));
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrixInvalid() {
        m2x2.getColumnMatrix(-1);
    }

    @Test
    public void testGetRow() {
        assertArrayEquals(new double[]{3, 4}, m2x2.getRow(1), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowInvalid() {
        m2x2.getRow(5);
    }

    @Test
    public void testGetColumn() {
        assertArrayEquals(new double[]{2, 4}, m2x2.getColumn(1), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnInvalid() {
        m2x2.getColumn(2);
    }

    @Test
    public void testGetEntry() {
        assertEquals(3.0, m2x2.getEntry(1, 0), 0.0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntryOutOfBounds() {
        m2x2.getEntry(2, 0);
    }

    @Test
    public void testTranspose() {
        assertMatrixEquals(new double[][]{{1, 3}, {2, 4}}, m2x2.transpose());
    }

    @Test
    public void testInverse() {
        RealMatrix inv = m2x2.inverse();
        assertMatrixEquals(new double[][]{{-2, 1}, {1.5, -0.5}}, inv);
    }

    @Test
    public void testGetDeterminant() {
        assertEquals(-2.0, m2x2.getDeterminant(), 0.0);
        assertEquals(1.0, identity.getDeterminant(), 0.0);
        assertEquals(0.0, singular.getDeterminant(), 0.0);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminantNonSquare() {
        nonSquare.getDeterminant();
    }

    @Test
    public void testIsSquare() {
        assertTrue(m2x2.isSquare());
        assertFalse(nonSquare.isSquare());
    }

    @Test
    public void testIsSingular() {
        assertTrue(singular.isSingular());
        assertFalse(m2x2.isSingular());
    }

    @Test
    public void testGetTrace() {
        assertEquals(5.0, m2x2.getTrace(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTraceNonSquare() {
        nonSquare.getTrace();
    }

    @Test
    public void testOperate() {
        assertArrayEquals(new double[]{3, 7}, m2x2.operate(new double[]{1, 1}), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperateWrongLength() {
        m2x2.operate(new double[]{1});
    }

    @Test
    public void testPreMultiplyVector() {
        assertArrayEquals(new double[]{4, 6}, m2x2.preMultiply(new double[]{1, 1}), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVectorWrongLength() {
        m2x2.preMultiply(new double[]{1, 2, 3});
    }

    @Test
    public void testSolveVector() {
        assertArrayEquals(new double[]{0, 0.5}, m2x2.solve(new double[]{1, 2}), 1e-12);
    }

    @Test
    public void testSolveMatrix() {
        RealMatrix solution = m2x2.solve(identity);
        assertMatrixEquals(new double[][]{{-2, 1}, {1.5, -0.5}}, solution);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveVectorWrongLength() {
        m2x2.solve(new double[]{1, 2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMatrixWrongRowDimension() {
        m2x2.solve(new RealMatrixImpl(3, 2));
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveNonSquare() {
        nonSquare.solve(identity);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveSingular() {
        singular.solve(identity);
    }

    @Test
    public void testLuDecompose() {
        m2x2.luDecompose();
        assertNotNull(m2x2.lu);
        assertArrayEquals(new int[]{1, 0}, m2x2.getPermutation());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeNonSquare() {
        nonSquare.luDecompose();
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecomposeSingular() {
        singular.luDecompose();
    }

    @Test
    public void testGetLUMatrix() {
        RealMatrix lu = m2x2.getLUMatrix();
        assertEquals(2, lu.getRowDimension());
        assertEquals(2, lu.getColumnDimension());
    }

    @Test
    public void testToString() {
        assertEquals("RealMatrixImpl{{1.0,2.0},{3.0,4.0}}", m2x2.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(m2x2.equals(m2x2));
        assertTrue(m2x2.equals(new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}})));
        assertFalse(m2x2.equals(null));
        assertFalse(m2x2.equals("not a matrix"));
        assertFalse(m2x2.equals(new RealMatrixImpl(new double[][]{{1, 2}, {3, 5}})));
        assertFalse(m2x2.equals(nonSquare));
    }

    @Test
    public void testHashCode() {
        RealMatrixImpl same = new RealMatrixImpl(new double[][]{{1, 2}, {3, 4}});
        assertEquals(m2x2.hashCode(), same.hashCode());
    }
}