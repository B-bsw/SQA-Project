package org.apache.commons.math.linear;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BigMatrixImplTest {

    private static BigDecimal bd(int value) {
        return BigDecimal.valueOf(value);
    }

    private static BigMatrixImpl matrix(int[][] values) {
        BigDecimal[][] data = new BigDecimal[values.length][values[0].length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                data[i][j] = BigDecimal.valueOf(values[i][j]);
            }
        }
        return new BigMatrixImpl(data);
    }

    @Test
    public void testConstructorWithDimensions() {
        BigMatrixImpl m = new BigMatrixImpl(2, 3);
        assertEquals(2, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
        assertNull(m.getDataRef()[0][0]);
    }

    @Test
    public void testConstructorRejectsNonPositiveDimensions() {
        try {
            new BigMatrixImpl(0, 1);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            new BigMatrixImpl(1, 0);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testConstructorCopiesInput() {
        BigDecimal[][] input = new BigDecimal[][]{{bd(1), bd(2)}, {bd(3), bd(4)}};
        BigMatrixImpl m = new BigMatrixImpl(input);
        assertNotSame(input, m.getDataRef());
        input[0][0] = bd(9);
        assertEquals(bd(1), m.getEntry(0, 0));
    }

    @Test
    public void testConstructorNoCopyAndArrayValidation() {
        BigDecimal[][] input = new BigDecimal[][]{{bd(1), bd(2)}, {bd(3), bd(4)}};
        BigMatrixImpl m = new BigMatrixImpl(input, false);
        assertSame(input, m.getDataRef());
        input[0][0] = bd(9);
        assertEquals(bd(9), m.getEntry(0, 0));

        try {
            new BigMatrixImpl((BigDecimal[][]) null, false);
            fail();
        } catch (NullPointerException e) {
        }
        try {
            new BigMatrixImpl(new BigDecimal[0][0], false);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testDoubleConstructorValidation() {
        try {
            new BigMatrixImpl(new double[0][0]);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            new BigMatrixImpl(new double[1][0]);
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            new BigMatrixImpl(new double[][]{{1.0}, {2.0, 3.0}});
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testStringConstructor() {
        BigMatrixImpl m = new BigMatrixImpl(new String[][]{{"1", "2"}, {"3", "4"}});
        assertEquals(bd(1), m.getEntry(0, 0));
        assertEquals(bd(4), m.getEntry(1, 1));
    }

    @Test
    public void testConstructorFromVector() {
        BigMatrixImpl v = new BigMatrixImpl(new BigDecimal[]{bd(7), bd(8), bd(9)});
        assertEquals(3, v.getRowDimension());
        assertEquals(1, v.getColumnDimension());
        assertEquals(bd(9), v.getEntry(2, 0));
    }

    @Test
    public void testAddAndSubtract() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl b = matrix(new int[][]{{5, 6}, {7, 8}});

        BigMatrixImpl sum = a.add(b);
        assertEquals(bd(6), sum.getEntry(0, 0));
        assertEquals(bd(12), sum.getEntry(1, 1));

        BigMatrixImpl diff = a.subtract(b);
        assertEquals(bd(-4), diff.getEntry(0, 0));
        assertEquals(bd(-4), diff.getEntry(1, 1));
    }

    @Test
    public void testAddDimensionMismatchThrows() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        try {
            a.add(new BigMatrixImpl(3, 3));
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            a.subtract(new BigMatrixImpl(3, 3));
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testScalarAddAndMultiply() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl added = (BigMatrixImpl) a.scalarAdd(bd(10));
        assertEquals(bd(11), added.getEntry(0, 0));

        BigMatrixImpl multiplied = (BigMatrixImpl) a.scalarMultiply(bd(3));
        assertEquals(bd(3), multiplied.getEntry(0, 0));
        assertEquals(bd(12), multiplied.getEntry(1, 1));
    }

    @Test
    public void testMultiply() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl b = matrix(new int[][]{{5, 6}, {7, 8}});
        BigMatrixImpl product = a.multiply(b);
        assertEquals(bd(19), product.getEntry(0, 0));
        assertEquals(bd(22), product.getEntry(0, 1));
        assertEquals(bd(43), product.getEntry(1, 0));
        assertEquals(bd(50), product.getEntry(1, 1));

        BigMatrixImpl one = new BigMatrixImpl(new BigDecimal[][]{{bd(2)}});
        assertEquals(bd(4), one.multiply(one).getEntry(0, 0));
    }

    @Test
    public void testMultiplyDimensionMismatchThrows() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        try {
            a.multiply(new BigMatrixImpl(3, 2));
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testGetNorm() {
        BigMatrixImpl m = matrix(new int[][]{{1, -2}, {-3, 4}});
        assertEquals(bd(6), m.getNorm());
    }

    @Test
    public void testGetDataMethods() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});
        BigDecimal[][] copy = m.getData();
        copy[0][0] = bd(99);
        assertEquals(bd(1), m.getEntry(0, 0));

        double[][] d = m.getDataAsDoubleArray();
        assertEquals(1.0, d[0][0], 0.0);
        assertEquals(2.0, d[0][1], 0.0);
        assertSame(m.getDataRef(), m.getDataRef());
    }

    @Test
    public void testGetSubMatrixRange() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        BigMatrixImpl sub = (BigMatrixImpl) m.getSubMatrix(1, 2, 0, 1);
        assertEquals(2, sub.getRowDimension());
        assertEquals(2, sub.getColumnDimension());
        assertEquals(bd(4), sub.getEntry(0, 0));
        assertEquals(bd(6), sub.getEntry(0, 1));
        assertEquals(bd(7), sub.getEntry(1, 0));
        assertEquals(bd(8), sub.getEntry(1, 1));
    }

    @Test
    public void testGetSubMatrixBySelection() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        BigMatrixImpl sub = (BigMatrixImpl) m.getSubMatrix(new int[]{2, 0}, new int[]{1, 2});
        assertEquals(bd(8), sub.getEntry(0, 0));
        assertEquals(bd(9), sub.getEntry(0, 1));
        assertEquals(bd(2), sub.getEntry(1, 0));
        assertEquals(bd(3), sub.getEntry(1, 1));
    }

    @Test
    public void testGetSubMatrixInvalidArguments() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        try {
            m.getSubMatrix(-1, 0, 0, 0);
            fail();
        } catch (MatrixIndexException e) {
        }
        try {
            m.getSubMatrix(new int[]{0}, new int[]{});
            fail();
        } catch (MatrixIndexException e) {
        }
        try {
            m.getSubMatrix(new int[]{0}, new int[]{99});
            fail();
        } catch (MatrixIndexException e) {
        }
    }

    @Test
    public void testSetSubMatrix() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});
        m.setSubMatrix(new BigDecimal[][]{{bd(9), bd(8)}, {bd(7), bd(6)}}, 0, 0);
        assertEquals(bd(9), m.getEntry(0, 0));
        assertEquals(bd(6), m.getEntry(1, 1));

        try {
            m.setSubMatrix(new BigDecimal[][]{{bd(1)}}, -1, 0);
            fail();
        } catch (MatrixIndexException e) {
        }
        try {
            m.setSubMatrix(new BigDecimal[0][0], 0, 0);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSetSubMatrixOnNullMatrix() {
        BigMatrixImpl empty = new BigMatrixImpl();
        empty.setSubMatrix(new BigDecimal[][]{{bd(1), bd(2)}}, 0, 0);
        assertEquals(1, empty.getRowDimension());
        assertEquals(2, empty.getColumnDimension());
        assertEquals(bd(1), empty.getEntry(0, 0));
        assertEquals(bd(2), empty.getEntry(0, 1));

        BigMatrixImpl empty2 = new BigMatrixImpl();
        try {
            empty2.setSubMatrix(new BigDecimal[][]{{bd(1)}}, 1, 0);
            fail();
        } catch (MatrixIndexException e) {
        }
    }

    @Test
    public void testGetRowColumnEntry() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});
        BigDecimal[] row = m.getRow(0);
        assertEquals(bd(1), row[0]);
        assertEquals(bd(2), row[1]);
        row[0] = bd(99);
        assertEquals(bd(1), m.getEntry(0, 0));

        BigDecimal[] col = m.getColumn(1);
        assertEquals(bd(2), col[0]);
        assertEquals(bd(4), col[1]);

        assertEquals(bd(4), m.getEntry(1, 1));

        BigMatrix rowMatrix = m.getRowMatrix(1);
        assertEquals(bd(3), rowMatrix.getEntry(0, 0));
        BigMatrix colMatrix = m.getColumnMatrix(0);
        assertEquals(bd(3), colMatrix.getEntry(1, 0));

        try {
            m.getRow(2);
            fail();
        } catch (MatrixIndexException e) {
        }
        try {
            m.getColumn(-1);
            fail();
        } catch (MatrixIndexException e) {
        }
        try {
            m.getEntry(5, 5);
            fail();
        } catch (MatrixIndexException e) {
        }
    }

    @Test
    public void testTranspose() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl t = (BigMatrixImpl) m.transpose();
        assertEquals(bd(1), t.getEntry(0, 0));
        assertEquals(bd(3), t.getEntry(0, 1));
        assertEquals(bd(2), t.getEntry(1, 0));
        assertEquals(bd(4), t.getEntry(1, 1));
    }

    @Test
    public void testTrace() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});
        assertEquals(bd(5), m.getTrace());
        try {
            new BigMatrixImpl(2, 3).getTrace();
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testDeterminantAndIsSingular() {
        BigMatrixImpl diag = matrix(new int[][]{{2, 0}, {0, 3}});
        assertFalse(diag.isSingular());
        assertEquals(0, bd(6).compareTo(diag.getDeterminant()));

        BigMatrix inv = diag.inverse();
        assertEquals(0.5, inv.getEntryAsDouble(0, 0), 1e-12);
        assertEquals(0.0, inv.getEntryAsDouble(0, 1), 1e-12);

        BigMatrixImpl singular = matrix(new int[][]{{1, 1}, {1, 1}});
        assertTrue(singular.isSingular());
        assertEquals(0, BigDecimal.ZERO.compareTo(singular.getDeterminant()));

        BigMatrixImpl perm = matrix(new int[][]{{0, 1}, {1, 0}});
        assertEquals(0, BigDecimal.valueOf(-1).compareTo(perm.getDeterminant()));

        try {
            new BigMatrixImpl(2, 3).getDeterminant();
            fail();
        } catch (InvalidMatrixException e) {
        }
    }

    @Test
    public void testSolve() {
        BigMatrixImpl m = matrix(new int[][]{{2, 0}, {0, 3}});
        BigDecimal[] solution = m.solve(new BigDecimal[]{bd(6), bd(12)});
        assertEquals(0, bd(3).compareTo(solution[0]));
        assertEquals(0, bd(4).compareTo(solution[1]));

        BigMatrixImpl perm = matrix(new int[][]{{0, 1}, {1, 0}});
        BigDecimal[] permSolution = perm.solve(new BigDecimal[]{bd(2), bd(3)});
        assertEquals(0, bd(3).compareTo(permSolution[0]));
        assertEquals(0, bd(2).compareTo(permSolution[1]));
    }

    @Test
    public void testSolveErrors() {
        BigMatrixImpl m = matrix(new int[][]{{2, 0}, {0, 3}});
        try {
            m.solve(new BigDecimal[]{bd(1)});
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            new BigMatrixImpl(2, 3).solve(new BigDecimal[]{bd(1), bd(2)});
            fail();
        } catch (InvalidMatrixException e) {
        }
        try {
            matrix(new int[][]{{1, 1}, {1, 1}}).solve(new BigDecimal[]{bd(1), bd(2)});
            fail();
        } catch (InvalidMatrixException e) {
        }
    }

    @Test
    public void testOperateAndPreMultiply() {
        BigMatrixImpl m = matrix(new int[][]{{1, 2}, {3, 4}});

        BigDecimal[] result = m.operate(new BigDecimal[]{bd(5), bd(6)});
        assertEquals(bd(17), result[0]);
        assertEquals(bd(39), result[1]);

        BigDecimal[] doubleResult = m.operate(new double[]{1, 2});
        assertEquals(5, doubleResult[0].intValue());
        assertEquals(11, doubleResult[1].intValue());

        BigDecimal[] pre = m.preMultiply(new BigDecimal[]{bd(1), bd(2)});
        assertEquals(bd(7), pre[0]);
        assertEquals(bd(10), pre[1]);

        try {
            m.operate(new BigDecimal[]{bd(1)});
            fail();
        } catch (IllegalArgumentException e) {
        }
        try {
            m.preMultiply(new BigDecimal[]{bd(1)});
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testEqualsHashCodeToString() {
        BigMatrixImpl a = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl b = matrix(new int[][]{{1, 2}, {3, 4}});
        BigMatrixImpl c = matrix(new int[][]{{1, 2}, {3, 5}});

        assertTrue(a.equals(a));
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals(null));
        assertFalse(a.equals("x"));
        assertEquals(a.hashCode(), b.hashCode());
        assertTrue(a.toString().startsWith("BigMatrixImpl{"));
    }

    @Test
    public void testSettings() {
        BigMatrixImpl m = new BigMatrixImpl(1, 1);
        m.setRoundingMode(BigDecimal.ROUND_CEILING);
        assertEquals(BigDecimal.ROUND_CEILING, m.getRoundingMode());
        m.setScale(10);
        assertEquals(10, m.getScale());
    }
}