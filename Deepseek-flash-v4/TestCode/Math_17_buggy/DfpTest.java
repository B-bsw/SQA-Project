package org.apache.commons.math3.dfp;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;

public class DfpTest {
    
    private DfpField field;
    private Dfp zero;
    private Dfp one;
    private Dfp two;
    private Dfp ten;
    
    @Before
    public void setUp() {
        field = new DfpField(20);
        zero = field.getZero();
        one = field.getOne();
        two = field.getTwo();
        ten = one.add(one).multiply(5);
    }
    
    @After
    public void tearDown() {
        field = null;
        zero = null;
        one = null;
        two = null;
        ten = null;
    }
    
    @Test
    public void testConstants() {
        assertEquals(10000, Dfp.RADIX);
        assertEquals(-32767, Dfp.MIN_EXP);
        assertEquals(32768, Dfp.MAX_EXP);
        assertEquals(32760, Dfp.ERR_SCALE);
        assertEquals(0, Dfp.FINITE);
        assertEquals(1, Dfp.INFINITE);
        assertEquals(2, Dfp.SNAN);
        assertEquals(3, Dfp.QNAN);
    }
    
    @Test
    public void testBasicArithmetic() {
        Dfp a = new Dfp(field, 10);
        Dfp b = new Dfp(field, 20);
        assertEquals(30, a.add(b).intValue());
        assertEquals(-10, a.subtract(b).intValue());
        assertEquals(200, a.multiply(b).intValue());
        assertEquals(0, a.divide(b).intValue());
    }
    
    @Test
    public void testBoundaryValues() {
        Dfp max = new Dfp(field, Double.MAX_VALUE);
        Dfp min = new Dfp(field, Double.MIN_VALUE);
        assertTrue(max.greaterThan(min));
        assertTrue(min.lessThan(max));
        assertTrue(!max.lessThan(min));
        assertTrue(!min.greaterThan(max));
    }
    
    @Test
    public void testNullAndEmpty() {
        Dfp nullDfp = null;
        assertNull(nullDfp);
        Dfp nan = new Dfp(field, Double.NaN);
        assertTrue(nan.isNaN());
    }
    
    @Test
    public void testSpecialValues() {
        Dfp posInf = new Dfp(field, Double.POSITIVE_INFINITY);
        Dfp negInf = new Dfp(field, Double.NEGATIVE_INFINITY);
        assertTrue(posInf.isInfinite());
        assertTrue(negInf.isInfinite());
        assertFalse(posInf.equals(negInf));
        assertTrue(posInf.greaterThan(one));
        assertTrue(negInf.lessThan(zero));
    }
    
    @Test
    public void testCompareToAndEquals() {
        Dfp a = new Dfp(field, 5);
        Dfp b = new Dfp(field, 5);
        Dfp c = new Dfp(field, 6);
        assertEquals(0, a.compareTo(b));
        assertTrue(a.equals(b));
        assertFalse(a.equals(c));
        assertFalse(a.equals(null));
        assertFalse(a.equals("not a dfp"));
        assertTrue(a.unequal(c));
        assertFalse(a.unequal(b));
    }
    
    @Test
    public void testHashCode() {
        Dfp a = new Dfp(field, 5);
        Dfp b = new Dfp(field, 5);
        assertEquals(a.hashCode(), b.hashCode());
    }
    
    @Test
    public void testNegateAndAbs() {
        Dfp negative = new Dfp(field, -7);
        Dfp positive = new Dfp(field, 7);
        assertEquals(7, negative.abs().intValue());
        assertEquals(-7, positive.negate().intValue());
        assertTrue(negative.strictlyNegative());
        assertTrue(positive.strictlyPositive());
        assertFalse(negative.positiveOrNull());
        assertFalse(positive.negativeOrNull());
    }
    
    @Test
    public void testIsZeroAndNaNAndInfinite() {
        assertTrue(zero.isZero());
        assertFalse(one.isZero());
        assertFalse(one.isNaN());
        assertFalse(one.isInfinite());
        Dfp nan = new Dfp(field, Double.NaN);
        assertTrue(nan.isNaN());
        Dfp inf = new Dfp(field, Double.POSITIVE_INFINITY);
        assertTrue(inf.isInfinite());
        assertFalse(inf.isNaN());
    }
    
    @Test
    public void testIntValueBoundary() {
        Dfp minInt = new Dfp(field, Integer.MIN_VALUE);
        Dfp maxInt = new Dfp(field, Integer.MAX_VALUE);
        Dfp beyondMax = new Dfp(field, Integer.MAX_VALUE);
        beyondMax = beyondMax.add(one);
        Dfp beyondMin = new Dfp(field, Integer.MIN_VALUE);
        beyondMin = beyondMin.subtract(one);
        assertEquals(Integer.MIN_VALUE, minInt.intValue());
        assertEquals(Integer.MAX_VALUE, maxInt.intValue());
        assertEquals(Integer.MAX_VALUE, beyondMax.intValue());
        assertEquals(Integer.MIN_VALUE, beyondMin.intValue());
    }
    
    @Test
    public void testLog10AndPower10() {
        Dfp thousand = new Dfp(field, 1000);
        assertEquals(3, thousand.log10());
        Dfp p10 = ten.power10(3);
        assertEquals(1000, p10.intValue());
        Dfp p10neg = ten.power10(-1);
        assertEquals(0, p10neg.intValue());
        assertEquals(0, ten.log10K());
    }
    
    @Test
    public void testNextAfter() {
        Dfp a = new Dfp(field, 1);
        Dfp b = new Dfp(field, 2);
        Dfp next = a.nextAfter(b);
        assertTrue(a.lessThan(next));
        assertTrue(next.lessThan(b));
        Dfp same = a.nextAfter(a);
        assertTrue(a.equals(same));
        Dfp neg = a.negate();
        Dfp nextFromNeg = neg.nextAfter(zero);
        assertTrue(nextFromNeg.lessThan(zero));
        assertTrue(neg.lessThan(nextFromNeg));
    }
    
    @Test
    public void testToString() {
        Dfp a = new Dfp(field, 1234);
        assertEquals("1234", a.toString());
        Dfp negA = a.negate();
        assertEquals("-1234", negA.toString());
        Dfp nan = new Dfp(field, Double.NaN);
        assertEquals(nan.toString(), nan.toString());
    }
    
    @Test
    public void testRemainderAndDivide() {
        Dfp d1 = new Dfp(field, 17);
        Dfp d2 = new Dfp(field, 5);
        assertEquals(2, d1.remainder(d2).intValue());
        Dfp d3 = new Dfp(field, 18);
        assertEquals(0, d3.remainder(d2).intValue());
        try {
            Dfp zeroDfp = field.getZero();
            one.divide(zeroDfp);
            fail("Expected exception for division by zero");
        } catch (ArithmeticException e) {
            // expected
        }
    }
    
    @Test
    public void testSwitchBranches() {
        Dfp a = new Dfp(field, 5);
        Dfp b = new Dfp(field, 0);
        
        assertFalse(a.lessThan(b));
        assertTrue(b.lessThan(a));
        assertTrue(a.greaterThan(b));
        assertFalse(b.greaterThan(a));
        assertTrue(a.negativeOrNull() == false);
        assertTrue(b.negativeOrNull() == true);
        assertTrue(a.strictlyNegative() == false);
        assertTrue(b.strictlyNegative() == false);
        assertTrue(b.positiveOrNull() == true);
        assertTrue(a.positiveOrNull() == false);
        assertTrue(a.strictlyPositive() == true);
        assertTrue(b.strictlyPositive() == false);
        
        Dfp zeroDfp = field.getZero();
        assertTrue(zeroDfp.lessThan(one));
        assertTrue(zeroDfp.greaterThan(one.negate()));
    }
    
    @Test
    public void testToDouble() {
        Dfp a = new Dfp(field, 10.5);
        assertEquals(10.5, a.toDouble(), 0.0001);
        Dfp negA = new Dfp(field, -3.2);
        assertEquals(-3.2, negA.toDouble(), 0.0001);
        Dfp zeroDfp = field.getZero();
        assertEquals(0.0, zeroDfp.toDouble(), 0.0);
    }
}