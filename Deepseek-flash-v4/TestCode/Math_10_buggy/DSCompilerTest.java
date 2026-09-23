package org.apache.commons.math3.analysis.differentiation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

public class DSCompilerTest {
    private static final double EPS = 1e-10;
    
    @Test
    public void testGetCompilerBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        assertNotNull(compiler);
        assertEquals(1, compiler.getFreeParameters());
        assertEquals(1, compiler.getOrder());
    }
    
    @Test
    public void testGetCompilerZeroParameters() {
        DSCompiler compiler = DSCompiler.getCompiler(0, 2);
        assertNotNull(compiler);
        assertEquals(0, compiler.getFreeParameters());
        assertEquals(2, compiler.getOrder());
    }
    
    @Test
    public void testGetCompilerZeroOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 0);
        assertNotNull(compiler);
        assertEquals(2, compiler.getFreeParameters());
        assertEquals(0, compiler.getOrder());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetCompilerNegativeParameters() {
        DSCompiler.getCompiler(-1, 1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetCompilerNegativeOrder() {
        DSCompiler.getCompiler(1, -1);
    }
    
    @Test
    public void testGetSizeZeroParametersZeroOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(0, 0);
        assertEquals(1, compiler.getSize());
    }
    
    @Test
    public void testGetSizeOneParameterOneOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        assertEquals(2, compiler.getSize());
    }
    
    @Test
    public void testGetSizeTwoParametersOneOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        assertEquals(3, compiler.getSize());
    }
    
    @Test
    public void testGetPartialDerivativeOrders() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        int[] orders = compiler.getPartialDerivativeOrders(0);
        assertEquals(1, orders.length);
        assertEquals(0, orders[0]);
        orders = compiler.getPartialDerivativeOrders(1);
        assertEquals(1, orders.length);
        assertEquals(1, orders[0]);
    }
    
    @Test
    public void testGetPartialDerivativeOrdersTwoParameters() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        int[] orders = compiler.getPartialDerivativeOrders(0);
        assertEquals(2, orders.length);
        orders = compiler.getPartialDerivativeOrders(1);
        assertEquals(2, orders.length);
        assertEquals(1, orders[0]);
        assertEquals(0, orders[1]);
    }
    
    @Test
    public void testGetPartialDerivativeIndexValid() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        assertEquals(0, compiler.getPartialDerivativeIndex(0));
        assertEquals(1, compiler.getPartialDerivativeIndex(1));
    }
    
    @Test
    public void testGetPartialDerivativeIndexTwoParameters() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        assertEquals(0, compiler.getPartialDerivativeIndex(0, 0));
        assertEquals(1, compiler.getPartialDerivativeIndex(1, 0));
        assertEquals(2, compiler.getPartialDerivativeIndex(0, 1));
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testGetPartialDerivativeIndexWrongLength() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        compiler.getPartialDerivativeIndex(0, 0);
    }
    
    @Test
    public void testGetPartialDerivativeIndexTooHighOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        assertEquals(0, compiler.getPartialDerivativeIndex(2));
    }
    
    @Test
    public void testAddOneParameter() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] lhs = new double[3];
        double[] rhs = new double[3];
        double[] result = new double[3];
        lhs[0] = 1.0; lhs[1] = 2.0; lhs[2] = 3.0;
        rhs[0] = 4.0; rhs[1] = 5.0; rhs[2] = 6.0;
        compiler.add(lhs, 0, rhs, 0, result, 0);
        assertArrayEquals(new double[] {5.0, 7.0, 9.0}, result, EPS);
    }
    
    @Test
    public void testAddTwoParameters() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        double[] lhs = new double[3];
        double[] rhs = new double[3];
        double[] result = new double[3];
        lhs[0] = 1.0; lhs[1] = 2.0; lhs[2] = 3.0;
        rhs[0] = 4.0; rhs[1] = 5.0; rhs[2] = 6.0;
        compiler.add(lhs, 0, rhs, 0, result, 0);
        assertArrayEquals(new double[] {5.0, 7.0, 9.0}, result, EPS);
    }
    
    @Test
    public void testSubtractOneParameter() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] lhs = new double[3];
        double[] rhs = new double[3];
        double[] result = new double[3];
        lhs[0] = 5.0; lhs[1] = 7.0; lhs[2] = 9.0;
        rhs[0] = 1.0; rhs[1] = 2.0; rhs[2] = 3.0;
        compiler.subtract(lhs, 0, rhs, 0, result, 0);
        assertArrayEquals(new double[] {4.0, 5.0, 6.0}, result, EPS);
    }
    
    @Test
    public void testMultiplyFirstOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] lhs = new double[2];
        double[] rhs = new double[2];
        double[] result = new double[2];
        lhs[0] = 2.0; lhs[1] = 3.0;
        rhs[0] = 4.0; rhs[1] = 5.0;
        compiler.multiply(lhs, 0, rhs, 0, result, 0);
        assertEquals(8.0, result[0], EPS);
        assertEquals(22.0, result[1], EPS);
    }
    
    @Test
    public void testMultiplyZeroParameters() {
        DSCompiler compiler = DSCompiler.getCompiler(0, 1);
        double[] lhs = new double[1];
        double[] rhs = new double[1];
        double[] result = new double[1];
        lhs[0] = 3.0; rhs[0] = 4.0;
        compiler.multiply(lhs, 0, rhs, 0, result, 0);
        assertEquals(12.0, result[0], EPS);
    }
    
    @Test
    public void testDivideBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] lhs = new double[2];
        double[] rhs = new double[2];
        double[] result = new double[2];
        lhs[0] = 6.0; lhs[1] = 3.0;
        rhs[0] = 2.0; rhs[1] = 1.0;
        compiler.divide(lhs, 0, rhs, 0, result, 0);
        assertEquals(3.0, result[0], EPS);
    }
    
    @Test
    public void testPowZeroOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(0, 0);
        double[] operand = new double[1];
        double[] result = new double[1];
        operand[0] = 3.0;
        compiler.pow(operand, 0, 0.0, result, 0);
        assertEquals(1.0, result[0], EPS);
    }
    
    @Test
    public void testPowIntegerZeroExponent() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 3.0; operand[1] = 2.0;
        compiler.pow(operand, 0, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
        assertEquals(0.0, result[1], EPS);
    }
    
    @Test
    public void testPowIntegerPositive() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 2.0; operand[1] = 1.0;
        compiler.pow(operand, 0, 3, result, 0);
        assertEquals(8.0, result[0], EPS);
        assertEquals(12.0, result[1], EPS);
    }
    
    @Test
    public void testPowIntegerNegative() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 2.0; operand[1] = 1.0;
        compiler.pow(operand, 0, -1, result, 0);
        assertEquals(0.5, result[0], EPS);
    }
    
    @Test
    public void testPowDoubleExponent() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 2.0; operand[1] = 1.0;
        compiler.pow(operand, 0, 2.0, result, 0);
        assertEquals(4.0, result[0], EPS);
        assertEquals(4.0, result[1], EPS);
    }
    
    @Test
    public void testRootNSquare() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 9.0; operand[1] = 1.0;
        compiler.rootN(operand, 0, 2, result, 0);
        assertEquals(3.0, result[0], EPS);
    }
    
    @Test
    public void testRootNCube() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 8.0; operand[1] = 1.0;
        compiler.rootN(operand, 0, 3, result, 0);
        assertEquals(2.0, result[0], EPS);
    }
    
    @Test
    public void testExpBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 1.0; operand[1] = 0.0;
        compiler.exp(operand, 0, result, 0);
        assertEquals(Math.E, result[0], EPS);
    }
    
    @Test
    public void testSinCos() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] sinResult = new double[2];
        double[] cosResult = new double[2];
        operand[0] = 0.0; operand[1] = 1.0;
        compiler.sin(operand, 0, sinResult, 0);
        compiler.cos(operand, 0, cosResult, 0);
        assertEquals(0.0, sinResult[0], EPS);
        assertEquals(1.0, cosResult[0], EPS);
    }
    
    @Test
    public void testTan() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 0.0; operand[1] = 1.0;
        compiler.tan(operand, 0, result, 0);
        assertEquals(0.0, result[0], EPS);
    }
    
    @Test
    public void testAcosAsinAtan() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] acosResult = new double[2];
        double[] asinResult = new double[2];
        double[] atanResult = new double[2];
        operand[0] = 0.5; operand[1] = 0.0;
        compiler.acos(operand, 0, acosResult, 0);
        compiler.asin(operand, 0, asinResult, 0);
        compiler.atan(operand, 0, atanResult, 0);
        assertEquals(Math.acos(0.5), acosResult[0], EPS);
        assertEquals(Math.asin(0.5), asinResult[0], EPS);
        assertEquals(Math.atan(0.5), atanResult[0], EPS);
    }
    
    @Test
    public void testAtan2Positive() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] y = new double[2];
        double[] x = new double[2];
        double[] result = new double[2];
        y[0] = 1.0; x[0] = 1.0;
        compiler.atan2(y, 0, x, 0, result, 0);
        assertEquals(Math.PI / 4.0, result[0], EPS);
    }
    
    @Test
    public void testAtan2Negative() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] y = new double[2];
        double[] x = new double[2];
        double[] result = new double[2];
        y[0] = 1.0; x[0] = -1.0;
        compiler.atan2(y, 0, x, 0, result, 0);
        assertEquals(3 * Math.PI / 4.0, result[0], EPS);
    }
    
    @Test
    public void testCoshSinhTanh() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] coshResult = new double[2];
        double[] sinhResult = new double[2];
        double[] tanhResult = new double[2];
        operand[0] = 1.0; operand[1] = 0.0;
        compiler.cosh(operand, 0, coshResult, 0);
        compiler.sinh(operand, 0, sinhResult, 0);
        compiler.tanh(operand, 0, tanhResult, 0);
        assertEquals(Math.cosh(1.0), coshResult[0], EPS);
        assertEquals(Math.sinh(1.0), sinhResult[0], EPS);
        assertEquals(Math.tanh(1.0), tanhResult[0], EPS);
    }
    
    @Test
    public void testAcoshAsinhAtanh() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] acoshResult = new double[2];
        double[] asinhResult = new double[2];
        double[] atanhResult = new double[2];
        operand[0] = 2.0; operand[1] = 0.0;
        compiler.acosh(operand, 0, acoshResult, 0);
        compiler.asinh(operand, 0, asinhResult, 0);
        operand[0] = 0.5;
        compiler.atanh(operand, 0, atanhResult, 0);
        assertEquals(Math.log(2.0 + Math.sqrt(3.0)), acoshResult[0], EPS);
        assertEquals(Math.log(2.0 + Math.sqrt(5.0)), asinhResult[0], EPS);
        assertEquals(0.5 * Math.log(3.0), atanhResult[0], EPS);
    }
    
    @Test
    public void testCompose() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] f = new double[2];
        double[] result = new double[2];
        operand[0] = 1.0; operand[1] = 1.0;
        f[0] = 2.0; f[1] = 3.0;
        compiler.compose(operand, 0, f, result, 0);
        assertEquals(2.0, result[0], EPS);
    }
    
    @Test
    public void testTaylorBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] ds = new double[2];
        ds[0] = 1.0; ds[1] = 1.0;
        double result = compiler.taylor(ds, 0);
        assertEquals(1.0, result, EPS);
    }
    
    @Test
    public void testCheckCompatibilityMatch() {
        DSCompiler compiler1 = DSCompiler.getCompiler(1, 1);
        DSCompiler compiler2 = DSCompiler.getCompiler(1, 1);
        compiler1.checkCompatibility(compiler2);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibilityMismatchParameters() {
        DSCompiler compiler1 = DSCompiler.getCompiler(1, 1);
        DSCompiler compiler2 = DSCompiler.getCompiler(2, 1);
        compiler1.checkCompatibility(compiler2);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibilityMismatchOrder() {
        DSCompiler compiler1 = DSCompiler.getCompiler(1, 1);
        DSCompiler compiler2 = DSCompiler.getCompiler(1, 2);
        compiler1.checkCompatibility(compiler2);
    }
    
    @Test
    public void testLogBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 2.0; operand[1] = 1.0;
        compiler.log(operand, 0, result, 0);
        assertEquals(Math.log(2.0), result[0], EPS);
    }
    
    @Test
    public void testLog1pBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 0.5; operand[1] = 1.0;
        compiler.log1p(operand, 0, result, 0);
        assertEquals(Math.log1p(0.5), result[0], EPS);
    }
    
    @Test
    public void testLog10Basic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 10.0; operand[1] = 1.0;
        compiler.log10(operand, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
    }
    
    @Test
    public void testExpm1Basic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = new double[2];
        double[] result = new double[2];
        operand[0] = 1.0; operand[1] = 0.0;
        compiler.expm1(operand, 0, result, 0);
        assertEquals(Math.expm1(1.0), result[0], EPS);
    }
    
    @Test
    public void testLinearCombinationBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = new double[2];
        double[] c2 = new double[2];
        double[] result = new double[2];
        c1[0] = 2.0; c1[1] = 1.0;
        c2[0] = 3.0; c2[1] = 1.0;
        compiler.linearCombination(1.0, c1, 0, 1.0, c2, 0, result, 0);
        assertEquals(5.0, result[0], EPS);
    }
    
    @Test
    public void testRemainderBasic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] lhs = new double[2];
        double[] rhs = new double[2];
        double[] result = new double[2];
        lhs[0] = 5.0; rhs[0] = 2.0;
        compiler.remainder(lhs, 0, rhs, 0, result, 0);
        assertEquals(1.0, result[0], EPS);
    }
}