package org.apache.commons.math.dfp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.dfp.DfpField.RoundingMode;

public class DfpTest {
    private DfpField field;
    private Dfp zero;
    private Dfp one;
    private Dfp two;
    private Dfp ten;
    private Dfp half;

    @Before
    public void setUp() {
        field = new DfpField(20);
        zero = field.newDfp(0);
        one = field.newDfp(1);
        two = field.newDfp(2);
        ten = field.newDfp(10);
        half = field.newDfp(0.5);
    }

    @After
    public void tearDown() {
        field = null;
        zero = null;
        one = null;
        two = null;
        ten = null;
        half = null;
    }

    @Test
    public void testConstants() {
        assertEquals(10000, Dfp.RADIX);
        assertEquals(-32767, Dfp.MIN_EXP);
        assertEquals(32768, Dfp.MAX_EXP);
        assertEquals(0, Dfp.FINITE);
        assertEquals(1, Dfp.INFINITE);
        assertEquals(2, Dfp.SNAN);
        assertEquals(3, Dfp.QNAN);
    }

    @Test
    public void testConstructorDfpStringNormal() {
        Dfp d = new Dfp(field, "123.456");
        assertEquals("123.456", d.toString());
        Dfp d2 = new Dfp(field, "-0.001");
        assertEquals("-0.001", d2.toString());
    }

    @Test
    public void testConstructorDfpStringSpecial() {
        Dfp posInf = new Dfp(field, "Infinity");
        assertTrue(posInf.isInfinite());
        assertEquals(1, posInf.getSign());
        Dfp negInf = new Dfp(field, "-Infinity");
        assertTrue(negInf.isInfinite());
        assertEquals(-1, negInf.getSign());
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(nan.isNaN());
    }

    @Test
    public void testConstructorDfpStringScientific() {
        Dfp d = new Dfp(field, "1e3");
        assertEquals("1000", d.toString());
        Dfp d2 = new Dfp(field, "1.5e-2");
        assertEquals("0.015", d2.toString());
        Dfp d3 = new Dfp(field, "-2.5E+2");
        assertEquals("-250", d3.toString());
    }

    @Test
    public void testConstructorDfpDfp() {
        Dfp original = new Dfp(field, "42.5");
        Dfp copy = new Dfp(original);
        assertEquals(original, copy);
        assertEquals(original.hashCode(), copy.hashCode());
    }

    @Test
    public void testNewInstance() {
        Dfp d = one.newInstance();
        assertNotNull(d);
        assertEquals(0, d.intValue());
        Dfp dByte = one.newInstance((byte) 5);
        assertEquals(5, dByte.intValue());
        Dfp dInt = one.newInstance(10);
        assertEquals(10, dInt.intValue());
        Dfp dLong = one.newInstance(100L);
        assertEquals(100L, dLong.longValue());
        Dfp dDouble = one.newInstance(2.5);
        assertEquals(2.5, dDouble.toDouble(), 0.0);
        Dfp dStr = one.newInstance("7");
        assertEquals(7, dStr.intValue());
        Dfp dSpecial = one.newInstance((byte) 0, (byte) Dfp.INFINITE);
        assertTrue(dSpecial.isInfinite());
    }

    @Test
    public void testGetFieldAndConstants() {
        assertSame(field, one.getField());
        assertEquals(20, one.getRadixDigits());
        assertTrue(zero.getZero().equals(zero));
        assertTrue(one.getOne().equals(one));
        assertEquals(2, two.getTwo().intValue());
    }

    @Test
    public void testIsInfiniteIsNaN() {
        Dfp inf = new Dfp(field, "Infinity");
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(inf.isInfinite());
        assertFalse(inf.isNaN());
        assertTrue(nan.isNaN());
        assertFalse(nan.isInfinite());
        assertFalse(one.isInfinite());
        assertFalse(one.isNaN());
    }

    @Test
    public void testLessThanGreaterThan() {
        assertTrue(one.lessThan(two));
        assertFalse(two.lessThan(one));
        assertFalse(one.lessThan(one));
        assertTrue(two.greaterThan(one));
        assertFalse(one.greaterThan(two));
        assertFalse(one.greaterThan(one));
        Dfp nan = new Dfp(field, "NaN");
        assertFalse(one.lessThan(nan));
        assertFalse(one.greaterThan(nan));
    }

    @Test
    public void testEqualsAndHashCode() {
        Dfp d1 = new Dfp(field, "1.0");
        Dfp d2 = new Dfp(field, "1");
        Dfp d3 = new Dfp(field, "2");
        assertEquals(d1, d2);
        assertFalse(d1.equals(d3));
        assertEquals(d1.hashCode(), d2.hashCode());
        assertFalse(d1.equals(null));
        assertFalse(d1.equals("not a dfp"));
    }

    @Test
    public void testUnequal() {
        assertTrue(one.unequal(two));
        assertFalse(one.unequal(new Dfp(field, "1")));
    }

    @Test
    public void testCompare() {
        Dfp a = new Dfp(field, "1.5");
        Dfp b = new Dfp(field, "2.5");
        assertTrue(Dfp.compare(a, b) < 0);
        assertTrue(Dfp.compare(b, a) > 0);
        assertEquals(0, Dfp.compare(a, a));
        Dfp na = new Dfp(field, "-1.5");
        Dfp nb = new Dfp(field, "-2.5");
        assertTrue(Dfp.compare(na, nb) > 0);
        assertTrue(Dfp.compare(nb, na) < 0);
        Dfp zeros = new Dfp(field, "0");
        Dfp nzero = new Dfp(field, "-0");
        assertEquals(0, Dfp.compare(zeros, nzero));
        assertEquals(0, Dfp.compare(nzero, zeros));
    }

    @Test
    public void testRintFloorCeil() {
        Dfp d1 = new Dfp(field, "2.5");
        Dfp d2 = new Dfp(field, "-2.5");
        assertEquals(2, d1.rint().intValue());
        assertEquals(-2, d2.rint().intValue());
        assertEquals(2, d1.floor().intValue());
        assertEquals(-3, d2.floor().intValue());
        assertEquals(3, d1.ceil().intValue());
        assertEquals(-2, d2.ceil().intValue());
    }

    @Test
    public void testRemainder() {
        Dfp d1 = new Dfp(field, "10");
        Dfp d2 = new Dfp(field, "3");
        Dfp rem = d1.remainder(d2);
        assertEquals(1, rem.intValue());
        Dfp d3 = new Dfp(field, "-10");
        Dfp rem2 = d3.remainder(d2);
        assertEquals(-1, rem2.intValue());
    }

    @Test
    public void testIntValueOverflow() {
        Dfp d = new Dfp(field, "2147483648");
        assertEquals(2147483647, d.intValue());
        Dfp d2 = new Dfp(field, "-2147483649");
        assertEquals(-2147483648, d2.intValue());
    }

    @Test
    public void testLog10KAndPower10K() {
        Dfp d = new Dfp(field, "1000");
        assertEquals(2, d.log10K());
        Dfp p = one.power10K(3);
        assertEquals("10000000", p.toString());
    }

    @Test
    public void testLog10() {
        Dfp d1 = new Dfp(field, "1");
        assertEquals(0, d1.log10());
        Dfp d2 = new Dfp(field, "10");
        assertEquals(1, d2.log10());
        Dfp d3 = new Dfp(field, "100");
        assertEquals(2, d3.log10());
        Dfp d4 = new Dfp(field, "0.1");
        assertEquals(-1, d4.log10());
    }

    @Test
    public void testPower10() {
        Dfp r = one.power10(2);
        assertEquals(100, r.intValue());
        Dfp r2 = one.power10(-2);
        assertEquals("0.01", r2.toString());
        Dfp r3 = one.power10(0);
        assertEquals(1, r3.intValue());
    }

    @Test
    public void testAdd() {
        Dfp a = new Dfp(field, "1");
        Dfp b = new Dfp(field, "2");
        assertEquals(3, a.add(b).intValue());
        Dfp neg = new Dfp(field, "-1");
        assertEquals(0, a.add(neg).intValue());
        assertEquals(1, a.add(0).intValue());
    }

    @Test
    public void testAddWithNaN() {
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(nan.add(one).isNaN());
        assertTrue(one.add(nan).isNaN());
    }

    @Test
    public void testAddWithInfinity() {
        Dfp inf = new Dfp(field, "Infinity");
        Dfp ninf = new Dfp(field, "-Infinity");
        assertEquals(inf, one.add(inf));
        assertEquals(ninf, one.add(ninf));
        assertTrue(inf.add(ninf).isNaN());
        assertTrue(ninf.add(inf).isNaN());
    }

    @Test
    public void testSubtract() {
        Dfp a = new Dfp(field, "5");
        Dfp b = new Dfp(field, "3");
        assertEquals(2, a.subtract(b).intValue());
        assertEquals(8, a.subtract(b.negate()).intValue());
    }

    @Test
    public void testMultiply() {
        Dfp a = new Dfp(field, "2");
        Dfp b = new Dfp(field, "3");
        assertEquals(6, a.multiply(b).intValue());
        Dfp c = new Dfp(field, "-2");
        assertEquals(-6, c.multiply(b).intValue());
        assertEquals(0, a.multiply(0).intValue());
    }

    @Test
    public void testMultiplyInt() {
        assertEquals(6, two.multiply(3).intValue());
        assertEquals(-6, two.multiply(-3).intValue());
        assertEquals(0, two.multiply(0).intValue());
    }

    @Test
    public void testDivide() {
        Dfp a = new Dfp(field, "6");
        Dfp b = new Dfp(field, "2");
        assertEquals(3, a.divide(b).intValue());
        assertEquals("2.5", new Dfp(field, "5").divide(new Dfp(field, "2")).toString());
    }

    @Test
    public void testDivideInt() {
        assertEquals(3, new Dfp(field, "6").divide(2).intValue());
        assertEquals("0.5", one.divide(2).toString());
        assertEquals("0.25", one.divide(4).toString());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        one.divide(0);
    }

    @Test
    public void testDivideIntByZero() {
        Dfp result = one.divide(0);
        assertTrue(result.isInfinite());
        assertEquals(1, result.getSign());
    }

    @Test
    public void testDivideIntByZeroNegative() {
        Dfp result = new Dfp(field, "-1").divide(0);
        assertTrue(result.isInfinite());
        assertEquals(-1, result.getSign());
    }

    @Test
    public void testSqrt() {
        Dfp d = new Dfp(field, "4");
        assertEquals(2, d.sqrt().intValue());
        Dfp d2 = new Dfp(field, "2");
        Dfp sqrt2 = d2.sqrt();
        assertEquals("1.4142135623730950488", sqrt2.toString());
    }

    @Test
    public void testSqrtInvalid() {
        Dfp neg = new Dfp(field, "-1");
        Dfp result = neg.sqrt();
        assertTrue(result.isNaN());
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(nan.sqrt().isNaN());
    }

    @Test
    public void testSqrtSpecial() {
        Dfp posInf = new Dfp(field, "Infinity");
        assertTrue(posInf.sqrt().isInfinite());
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(nan.sqrt().isNaN());
    }

    @Test
    public void testToString() {
        assertEquals("123", new Dfp(field, "123").toString());
        assertEquals("-123", new Dfp(field, "-123").toString());
        Dfp nan = new Dfp(field, "NaN");
        assertEquals("NaN", nan.toString());
    }

    @Test
    public void testNegate() {
        Dfp d = new Dfp(field, "5");
        assertEquals(-5, d.negate().intValue());
        Dfp inf = new Dfp(field, "Infinity");
        assertEquals(-1, inf.negate().getSign());
    }

    @Test
    public void testClassify() {
        assertEquals(Dfp.FINITE, one.classify());
        Dfp inf = new Dfp(field, "Infinity");
        assertEquals(Dfp.INFINITE, inf.classify());
        Dfp nan = new Dfp(field, "NaN");
        assertEquals(Dfp.QNAN, nan.classify());
    }

    @Test
    public void testCopySign() {
        Dfp pos = new Dfp(field, "5");
        Dfp neg = new Dfp(field, "-5");
        Dfp result = Dfp.copysign(pos, neg);
        assertEquals(-5, result.intValue());
        Dfp result2 = Dfp.copysign(neg, pos);
        assertEquals(5, result2.intValue());
    }

    @Test
    public void testNextAfter() {
        Dfp d = new Dfp(field, "1");
        Dfp up = d.nextAfter(new Dfp(field, "2"));
        assertTrue(up.greaterThan(d));
        Dfp down = d.nextAfter(new Dfp(field, "0"));
        assertTrue(down.lessThan(d));
    }

    @Test
    public void testNextAfterEqual() {
        Dfp d = new Dfp(field, "1");
        Dfp result = d.nextAfter(d);
        assertEquals(d, result);
    }

    @Test
    public void testNextAfterZero() {
        Dfp z = field.newDfp(0);
        Dfp next = z.nextAfter(one);
        assertTrue(next.greaterThan(z));
        Dfp nextNeg = z.nextAfter(one.negate());
        assertTrue(nextNeg.lessThan(z));
    }

    @Test
    public void testToDouble() {
        assertEquals(1.0, one.toDouble(), 0.0);
        assertEquals(-1.0, one.negate().toDouble(), 0.0);
        assertEquals(0.0, zero.toDouble(), 0.0);
        Dfp inf = new Dfp(field, "Infinity");
        assertEquals(Double.POSITIVE_INFINITY, inf.toDouble(), 0.0);
        Dfp ninf = new Dfp(field, "-Infinity");
        assertEquals(Double.NEGATIVE_INFINITY, ninf.toDouble(), 0.0);
        Dfp nan = new Dfp(field, "NaN");
        assertTrue(Double.isNaN(nan.toDouble()));
    }

    @Test
    public void testToSplitDouble() {
        double[] split = one.toSplitDouble();
        assertEquals(2, split.length);
        double sum = split[0] + split[1];
        assertEquals(1.0, sum, 0.0);
    }
}