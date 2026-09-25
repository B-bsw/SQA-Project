package org.apache.commons.math.complex;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math.complex.Complex complex7 = complex4.acos();
        org.apache.commons.math.complex.Complex complex8 = complex0.subtract(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt();
        org.apache.commons.math.complex.Complex complex11 = complex9.sinh();
        double double12 = complex9.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex14 = complex8.exp();
        boolean boolean15 = complex0.equals((java.lang.Object) complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex9", complex2.equals(complex9) ? complex2.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex2.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex10.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        boolean boolean16 = complex8.equals((java.lang.Object) complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        boolean boolean4 = complex3.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex16.acos();
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        boolean boolean20 = complex13.equals((java.lang.Object) complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = complex24.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.sinh();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex27.pow(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex27.exp();
        org.apache.commons.math.complex.Complex complex34 = complex21.subtract(complex27);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex35.acos();
        double double38 = complex35.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex35.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = complex43.sin();
        boolean boolean45 = complex44.isNaN();
        org.apache.commons.math.complex.Complex complex46 = complex41.divide(complex44);
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex49 = complex47.add(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex48.asin();
        boolean boolean51 = complex35.equals((java.lang.Object) complex48);
        org.apache.commons.math.complex.Complex complex52 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex53 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex56 = new org.apache.commons.math.complex.Complex((double) 10L, 0.0d);
        org.apache.commons.math.complex.Complex complex57 = complex53.multiply(complex56);
        boolean boolean58 = complex27.equals((java.lang.Object) complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex37", complex8.equals(complex37) ? complex8.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj12 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = complex11.acos();
        org.apache.commons.math.complex.Complex complex15 = complex2.pow(complex14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        boolean boolean17 = complex15.equals((java.lang.Object) "(0.8414709848078965, 0.0)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        java.lang.String str8 = complex5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex17.tan();
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex21.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex21.pow(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex14.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex5 = complex2.multiply((-1.1102230246251565E-16d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex14.createComplex((double) 10.0f, 2.3899553468592085d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        double double24 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex21.createComplex((double) (byte) 100, (double) 1L);
        double double28 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex29 = complex18.divide(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex10.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = complex14.log();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.subtract(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.add(complex21);
        org.apache.commons.math.complex.ComplexField complexField23 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = complex19.tan();
        org.apache.commons.math.complex.Complex complex25 = complex19.exp();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = complex26.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex30 = complex19.add(complex26);
        org.apache.commons.math.complex.Complex complex31 = complex19.sinh();
        boolean boolean32 = complex16.equals((java.lang.Object) complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex26", complex17.equals(complex26) ? complex17.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        org.apache.commons.math.complex.Complex complex16 = complex14.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        double double5 = complex3.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex5.createComplex(0.9635907245418334d, (double) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        boolean boolean16 = complex15.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.asin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex13.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex13.asin();
        org.apache.commons.math.complex.Complex complex24 = complex1.add(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex6.log();
        org.apache.commons.math.complex.Complex complex9 = complex0.multiply(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        java.lang.String str7 = complex6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex28 = complex26.add(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex30.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex34.sinh();
        double double37 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex39 = complex33.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        double double41 = complex40.abs();
        boolean boolean42 = complex26.equals((java.lang.Object) complex40);
        org.apache.commons.math.complex.Complex complex43 = complex18.multiply(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex34", complex2.equals(complex34) ? complex2.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) 'a');
        double double25 = complex22.getReal();
        org.apache.commons.math.complex.Complex complex26 = complex16.multiply(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj8 = complex7.readResolve();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex6.asin();
        org.apache.commons.math.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.multiply(0.0d);
        org.apache.commons.math.complex.Complex complex15 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex16.acos();
        double double19 = complex16.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList21 = complex16.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex22.divide(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex30 = complex28.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.asin();
        boolean boolean32 = complex16.equals((java.lang.Object) complex29);
        org.apache.commons.math.complex.Complex complex33 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex34 = complex16.sqrt();
        double double35 = complex34.abs();
        org.apache.commons.math.complex.Complex complex36 = complex34.negate();
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex38 = complex15.divide(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex18", complex14.equals(complex18) ? complex14.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = complex3.acos();
        double double6 = complex3.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex3.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex9.divide(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex17 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.asin();
        boolean boolean19 = complex3.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex20 = complex3.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex21.asin();
        org.apache.commons.math.complex.Complex complex23 = complex0.divide(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex21.createComplex(1.305979828850128d, 2.3899553468592085d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex26.acos();
        double double29 = complex26.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList31 = complex26.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        boolean boolean36 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex37 = complex32.divide(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex40 = complex38.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex39.asin();
        boolean boolean42 = complex26.equals((java.lang.Object) complex39);
        org.apache.commons.math.complex.Complex complex43 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex45 = complex44.cosh();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = complex47.add(complex49);
        org.apache.commons.math.complex.ComplexField complexField51 = complex47.getField();
        org.apache.commons.math.complex.Complex complex52 = complex47.tan();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex54 = complex53.sin();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex56 = complex55.sin();
        org.apache.commons.math.complex.Complex complex57 = complex54.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex54.tan();
        org.apache.commons.math.complex.Complex complex59 = complex47.divide(complex54);
        org.apache.commons.math.complex.Complex complex60 = complex54.cos();
        org.apache.commons.math.complex.Complex complex61 = complex60.sinh();
        org.apache.commons.math.complex.Complex complex64 = complex61.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex65 = complex61.sqrt1z();
        org.apache.commons.math.complex.Complex complex68 = complex65.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.ComplexField complexField69 = complex65.getField();
        org.apache.commons.math.complex.Complex complex70 = complex45.pow(complex65);
        org.apache.commons.math.complex.Complex complex71 = complex25.pow(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex28", complex8.equals(complex28) ? complex8.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        java.lang.String str7 = complex4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = complex3.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.add(complex25);
        org.apache.commons.math.complex.ComplexField complexField27 = complex23.getField();
        org.apache.commons.math.complex.Complex complex28 = complex23.tan();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex32 = complex23.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        boolean boolean37 = complex36.isNaN();
        org.apache.commons.math.complex.Complex complex38 = complex33.divide(complex36);
        org.apache.commons.math.complex.Complex complex39 = complex38.atan();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex41 = complex39.add(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex39.exp();
        org.apache.commons.math.complex.Complex complex43 = complex31.pow(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex42.acos();
        org.apache.commons.math.complex.Complex complex45 = complex21.subtract(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex2.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.sin();
        org.apache.commons.math.complex.Complex complex23 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex24 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex20.sin();
        org.apache.commons.math.complex.Complex complex26 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex18.pow(complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.ComplexField complexField20 = complex16.getField();
        org.apache.commons.math.complex.Complex complex21 = complex16.tan();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex25 = complex16.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex13.add(complex16);
        org.apache.commons.math.complex.Complex complex27 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex28.asin();
        org.apache.commons.math.complex.Complex complex30 = complex12.multiply(complex29);
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex(0.0d, 1.1189396031849523d);
        org.apache.commons.math.complex.Complex complex34 = complex33.cos();
        org.apache.commons.math.complex.Complex complex37 = complex33.createComplex(2.3899553468592085d, 141.4213562373095d);
        org.apache.commons.math.complex.Complex complex38 = complex30.pow(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex34", complex7.equals(complex34) ? complex7.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.atan();
        java.lang.String str30 = complex27.toString();
        org.apache.commons.math.complex.Complex complex32 = complex27.multiply((double) 10);
        boolean boolean33 = complex27.isInfinite();
        org.apache.commons.math.complex.Complex complex34 = complex5.divide(complex27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex27", complex9.equals(complex27) ? complex9.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((-1.2742514467513933E-16d), (double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.sinh();
        double double30 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex32 = complex26.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        double double34 = complex33.abs();
        org.apache.commons.math.complex.Complex complex35 = complex33.sin();
        boolean boolean36 = complex21.equals((java.lang.Object) complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex27", complex2.equals(complex27) ? complex2.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex12.add(complex15);
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex27.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex31 = complex27.asin();
        boolean boolean32 = complex11.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.ComplexField complexField38 = complex34.getField();
        org.apache.commons.math.complex.Complex complex39 = complex34.tan();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex41.tan();
        org.apache.commons.math.complex.Complex complex46 = complex34.divide(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex41.cos();
        org.apache.commons.math.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math.complex.Complex complex49 = complex11.add(complex48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex48", complex1.equals(complex48) ? complex1.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        boolean boolean17 = complex15.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex15.cos();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex19.acos();
        double double22 = complex19.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex19.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex33 = complex31.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex32.asin();
        boolean boolean35 = complex19.equals((java.lang.Object) complex32);
        org.apache.commons.math.complex.Complex complex36 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex38 = complex19.sin();
        org.apache.commons.math.complex.Complex complex39 = complex15.multiply(complex38);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex45.sinh();
        double double48 = complex45.getImaginary();
        org.apache.commons.math.complex.Complex complex49 = complex44.pow(complex45);
        org.apache.commons.math.complex.Complex complex50 = complex44.exp();
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.tanh();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex57 = complex56.sin();
        org.apache.commons.math.complex.Complex complex58 = complex55.add(complex57);
        org.apache.commons.math.complex.ComplexField complexField59 = complex55.getField();
        org.apache.commons.math.complex.Complex complex60 = complex55.tan();
        org.apache.commons.math.complex.Complex complex63 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex64 = complex55.add(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex52.add(complex55);
        org.apache.commons.math.complex.Complex complex66 = complex50.add(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex39.multiply(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex45", complex21.equals(complex45) ? complex21.hashCode() == complex45.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex1.cos();
        org.apache.commons.math.complex.Complex complex11 = complex1.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.cos();
        org.apache.commons.math.complex.ComplexField complexField19 = complex13.getField();
        org.apache.commons.math.complex.Complex complex20 = complex1.multiply(complex13);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        double double24 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex27 = complex21.createComplex((double) (byte) 100, (double) 1L);
        double double28 = complex21.getReal();
        boolean boolean29 = complex21.isInfinite();
        org.apache.commons.math.complex.Complex complex30 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex13.add(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex30", complex21.equals(complex30) ? complex21.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex14.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.tan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex21.tan();
        org.apache.commons.math.complex.Complex complex26 = complex14.divide(complex21);
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex27.pow(complex28);
        java.lang.String str30 = complex28.toString();
        org.apache.commons.math.complex.Complex complex31 = complex8.add(complex28);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        double double35 = complex32.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex32.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        boolean boolean42 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex46 = complex44.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex45.asin();
        boolean boolean48 = complex32.equals((java.lang.Object) complex45);
        org.apache.commons.math.complex.Complex complex49 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex50 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.ComplexField complexField57 = complex53.getField();
        org.apache.commons.math.complex.Complex complex58 = complex53.tan();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.add(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex60.tan();
        org.apache.commons.math.complex.Complex complex65 = complex53.divide(complex60);
        org.apache.commons.math.complex.Complex complex66 = complex60.cos();
        org.apache.commons.math.complex.Complex complex67 = complex66.sinh();
        org.apache.commons.math.complex.Complex complex70 = complex67.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex67.sqrt1z();
        org.apache.commons.math.complex.Complex complex74 = complex71.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.ComplexField complexField75 = complex71.getField();
        org.apache.commons.math.complex.Complex complex76 = complex51.pow(complex71);
        org.apache.commons.math.complex.Complex complex77 = complex31.divide(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex34", complex8.equals(complex34) ? complex8.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex9.tan();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 10, (double) 0);
        org.apache.commons.math.complex.Complex complex19 = complex14.add(complex18);
        java.lang.Object obj20 = complex14.readResolve();
        boolean boolean21 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex22 = complex6.acos();
        org.apache.commons.math.complex.Complex complex25 = complex6.createComplex((double) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math.complex.Complex complex25 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex25.cos();
        org.apache.commons.math.complex.Complex complex27 = complex26.negate();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex28.acos();
        double double31 = complex28.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex28.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        boolean boolean38 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex39 = complex34.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex42 = complex40.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.asin();
        boolean boolean44 = complex28.equals((java.lang.Object) complex41);
        org.apache.commons.math.complex.Complex complex45 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex46 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex47 = complex26.subtract(complex28);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = complex49.add(complex51);
        double double53 = complex52.getImaginary();
        org.apache.commons.math.complex.Complex complex54 = complex52.atan();
        org.apache.commons.math.complex.Complex complex55 = complex47.multiply(complex52);
        org.apache.commons.math.complex.Complex complex56 = complex55.tanh();
        org.apache.commons.math.complex.Complex complex57 = complex20.divide(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.asin();
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.ComplexField complexField21 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = complex17.tan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = complex24.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex24.tan();
        org.apache.commons.math.complex.Complex complex29 = complex17.divide(complex24);
        java.lang.Object obj30 = complex24.readResolve();
        org.apache.commons.math.complex.Complex complex31 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex15.divide(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex8.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        double double15 = complex14.getReal();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex17.tan();
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        double double25 = complex24.getArgument();
        org.apache.commons.math.complex.Complex complex26 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex27 = complex14.divide(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex24 and complex26", complex24.equals(complex26) ? complex24.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        double double7 = complex4.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        org.apache.commons.math.complex.Complex complex4 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = complex0.pow(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        double double12 = complex9.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        boolean boolean25 = complex9.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.sin();
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        boolean boolean32 = complex31.isInfinite();
        org.apache.commons.math.complex.Complex complex33 = complex31.cosh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex34.sinh();
        double double37 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex40 = complex34.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex41 = complex40.asin();
        org.apache.commons.math.complex.Complex complex42 = complex31.add(complex40);
        java.util.List<org.apache.commons.math.complex.Complex> complexList44 = complex42.nthRoot((int) (short) 10);
        boolean boolean45 = complex8.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex28", complex11.equals(complex28) ? complex11.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        org.apache.commons.math.complex.Complex complex4 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex4.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex0.asin();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        double double15 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex20.createComplex((double) (byte) 10, 0.0d);
        double double26 = complex20.abs();
        org.apache.commons.math.complex.Complex complex27 = complex16.divide(complex20);
        boolean boolean28 = complex6.equals((java.lang.Object) complex20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex12", complex2.equals(complex12) ? complex2.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        double double2 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        boolean boolean5 = complex3.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.abs();
        boolean boolean17 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex7.pow(complex13);
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex25.sinh();
        double double28 = complex25.getImaginary();
        org.apache.commons.math.complex.Complex complex29 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt1z();
        boolean boolean31 = complex18.equals((java.lang.Object) complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex25", complex15.equals(complex25) ? complex15.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex1.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex15.sinh();
        double double18 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex21 = complex15.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex22 = complex15.cos();
        boolean boolean23 = complex1.equals((java.lang.Object) complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.ComplexField complexField12 = complex8.getField();
        org.apache.commons.math.complex.Complex complex15 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex8.divide(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex8.asin();
        org.apache.commons.math.complex.Complex complex19 = complex6.pow(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex18", complex6.equals(complex18) ? complex6.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.sinh();
        double double14 = complex11.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex5.add(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.sinh();
        double double30 = complex27.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex32 = complex26.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        boolean boolean34 = complex32.isInfinite();
        org.apache.commons.math.complex.Complex complex35 = complex21.multiply(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex21", complex0.equals(complex21) ? complex0.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex8.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex2.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex5 = complex2.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj7 = complex6.readResolve();
        double double8 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex6.asin();
        org.apache.commons.math.complex.Complex complex10 = complex6.tanh();
        boolean boolean11 = complex2.equals((java.lang.Object) complex6);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex12.acos();
        double double15 = complex12.abs();
        boolean boolean16 = complex12.isInfinite();
        org.apache.commons.math.complex.Complex complex17 = complex12.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj26 = complex25.readResolve();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex24.asin();
        org.apache.commons.math.complex.Complex complex29 = complex12.subtract(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex2.add(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        boolean boolean8 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        boolean boolean13 = complex12.isNaN();
        org.apache.commons.math.complex.Complex complex14 = complex9.divide(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex17 = complex15.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex19.log();
        org.apache.commons.math.complex.Complex complex22 = complex16.subtract(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex6.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.tan();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex34 = complex25.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.acos();
        double double36 = complex35.getImaginary();
        org.apache.commons.math.complex.Complex complex37 = complex23.divide(complex35);
        double double38 = complex35.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex37", complex18.equals(complex37) ? complex18.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex12.add(complex15);
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex27.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex31 = complex27.asin();
        boolean boolean32 = complex11.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.ComplexField complexField38 = complex34.getField();
        org.apache.commons.math.complex.Complex complex39 = complex34.tan();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex41.tan();
        org.apache.commons.math.complex.Complex complex46 = complex34.divide(complex41);
        org.apache.commons.math.complex.Complex complex47 = complex41.cos();
        org.apache.commons.math.complex.Complex complex48 = complex47.sinh();
        org.apache.commons.math.complex.Complex complex51 = complex48.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex52 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex56 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = complex11.add(complex57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex48 and complex57", complex48.equals(complex57) ? complex48.hashCode() == complex57.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex1.cos();
        org.apache.commons.math.complex.Complex complex11 = complex1.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex1.multiply(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex1.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex17.acos();
        double double20 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex21 = complex17.tanh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex22.divide(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj30 = complex29.readResolve();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex28.asin();
        org.apache.commons.math.complex.Complex complex33 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        boolean boolean38 = complex37.isNaN();
        org.apache.commons.math.complex.Complex complex39 = complex34.divide(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj42 = complex41.readResolve();
        org.apache.commons.math.complex.Complex complex43 = complex40.pow(complex41);
        double double44 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex45 = complex28.multiply(complex40);
        org.apache.commons.math.complex.Complex complex46 = complex17.multiply(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math.complex.Complex complex51 = complex48.add(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex45.subtract(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex16.add(complex45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex19", complex12.equals(complex19) ? complex12.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.conjugate();
        boolean boolean22 = complex17.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex21", complex17.equals(complex21) ? complex17.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = complex24.multiply((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex24", complex15.equals(complex24) ? complex15.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        double double14 = complex13.abs();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.ComplexField complexField20 = complex16.getField();
        org.apache.commons.math.complex.Complex complex21 = complex16.tan();
        org.apache.commons.math.complex.Complex complex22 = complex16.exp();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex16.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField28 = complex27.getField();
        org.apache.commons.math.complex.Complex complex29 = complex27.tan();
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex13.subtract(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex30", complex5.equals(complex30) ? complex5.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        java.lang.Class<?> wildcardClass3 = complex1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        double double2 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        java.lang.Object obj5 = complex4.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        java.lang.String str5 = complex0.toString();
        org.apache.commons.math.complex.Complex complex6 = complex0.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        double double26 = complex25.abs();
        org.apache.commons.math.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex0.pow(complex28);
        double double32 = complex31.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex31", complex0.equals(complex31) ? complex0.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex3 = complex1.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        double double11 = complex10.abs();
        org.apache.commons.math.complex.Complex complex12 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex14.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.tan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex21.tan();
        org.apache.commons.math.complex.Complex complex26 = complex14.divide(complex21);
        org.apache.commons.math.complex.Complex complex27 = complex21.cos();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        boolean boolean29 = complex27.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex30 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex10.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex12", complex5.equals(complex12) ? complex5.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex20.add(complex22);
        org.apache.commons.math.complex.ComplexField complexField24 = complex20.getField();
        org.apache.commons.math.complex.Complex complex25 = complex20.tan();
        org.apache.commons.math.complex.Complex complex26 = complex20.exp();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex20.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex35.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex38 = complex31.pow(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex35.negate();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex41.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math.complex.Complex complex51 = complex48.add(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex48.tan();
        org.apache.commons.math.complex.Complex complex53 = complex52.acos();
        org.apache.commons.math.complex.Complex complex54 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex56 = complex52.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex57 = complex56.atan();
        double double58 = complex56.getArgument();
        org.apache.commons.math.complex.Complex complex59 = complex46.add(complex56);
        org.apache.commons.math.complex.Complex complex60 = complex35.add(complex46);
        boolean boolean61 = complex18.equals((java.lang.Object) complex35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex27", complex2.equals(complex27) ? complex2.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        double double16 = complex15.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.add(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex12.tan();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math.complex.Complex complex20 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex18.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex25 = complex22.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex24", complex18.equals(complex24) ? complex18.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex21", complex20.equals(complex21) ? complex20.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex22.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex33.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        double double39 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex27.add(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex16.add(complex27);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex45.add(complex47);
        org.apache.commons.math.complex.ComplexField complexField49 = complex45.getField();
        org.apache.commons.math.complex.Complex complex50 = complex45.tan();
        org.apache.commons.math.complex.Complex complex53 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex54 = complex45.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex42.add(complex45);
        org.apache.commons.math.complex.Complex complex56 = complex55.sin();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex58 = complex55.add(complex57);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = complex59.acos();
        double double62 = complex59.abs();
        boolean boolean63 = complex59.isInfinite();
        org.apache.commons.math.complex.Complex complex64 = complex59.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList66 = complex59.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex67 = complex59.asin();
        org.apache.commons.math.complex.Complex complex68 = complex67.cosh();
        org.apache.commons.math.complex.Complex complex69 = complex55.divide(complex67);
        org.apache.commons.math.complex.Complex complex70 = complex41.subtract(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex61", complex8.equals(complex61) ? complex8.hashCode() == complex61.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        double double9 = complex8.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex21.add(complex24);
        java.lang.Object obj26 = complex21.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex6.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        double double13 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex15 = complex9.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        double double17 = complex16.abs();
        double double18 = complex16.getArgument();
        boolean boolean19 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj28 = complex27.readResolve();
        org.apache.commons.math.complex.Complex complex29 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex30 = complex26.asin();
        org.apache.commons.math.complex.Complex complex31 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        boolean boolean36 = complex35.isNaN();
        org.apache.commons.math.complex.Complex complex37 = complex32.divide(complex35);
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj40 = complex39.readResolve();
        org.apache.commons.math.complex.Complex complex41 = complex38.pow(complex39);
        double double42 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex43 = complex26.multiply(complex38);
        org.apache.commons.math.complex.Complex complex44 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex45 = complex16.subtract(complex38);
        boolean boolean46 = complex0.equals((java.lang.Object) complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex10", complex2.equals(complex10) ? complex2.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = complex0.log();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        double double10 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex6.pow(complex7);
        org.apache.commons.math.complex.ComplexField complexField12 = complex11.getField();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex14.acos();
        double double17 = complex14.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex14.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        boolean boolean24 = complex23.isNaN();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex28 = complex26.add(complex27);
        org.apache.commons.math.complex.Complex complex29 = complex27.asin();
        boolean boolean30 = complex14.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex31 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex32.asin();
        org.apache.commons.math.complex.Complex complex34 = complex11.subtract(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex16", complex7.equals(complex16) ? complex7.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.ComplexField complexField8 = complex4.getField();
        org.apache.commons.math.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.cos();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex11);
        org.apache.commons.math.complex.Complex complex19 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.add(complex25);
        org.apache.commons.math.complex.ComplexField complexField27 = complex23.getField();
        org.apache.commons.math.complex.Complex complex28 = complex23.tan();
        org.apache.commons.math.complex.Complex complex31 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex32 = complex23.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex20.add(complex23);
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.negate();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex38.acos();
        double double41 = complex38.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList43 = complex38.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        boolean boolean48 = complex47.isNaN();
        org.apache.commons.math.complex.Complex complex49 = complex44.divide(complex47);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex52 = complex50.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.asin();
        boolean boolean54 = complex38.equals((java.lang.Object) complex51);
        org.apache.commons.math.complex.Complex complex55 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex38.sqrt();
        double double57 = complex56.abs();
        org.apache.commons.math.complex.Complex complex58 = complex56.negate();
        org.apache.commons.math.complex.Complex complex59 = complex58.tanh();
        org.apache.commons.math.complex.Complex complex60 = complex33.subtract(complex58);
        org.apache.commons.math.complex.Complex complex61 = complex2.pow(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex40", complex0.equals(complex40) ? complex0.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(complex7);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex5.tan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.add(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex12.tan();
        org.apache.commons.math.complex.Complex complex17 = complex5.divide(complex12);
        org.apache.commons.math.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math.complex.Complex complex19 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        double double24 = complex23.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex0.multiply(complex23);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.ComplexField complexField31 = complex27.getField();
        org.apache.commons.math.complex.Complex complex32 = complex27.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex34.tan();
        org.apache.commons.math.complex.Complex complex39 = complex27.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex42 = complex40.pow(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math.complex.Complex complex44 = complex43.cos();
        boolean boolean45 = complex25.equals((java.lang.Object) complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex44", complex0.equals(complex44) ? complex0.hashCode() == complex44.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.ComplexField complexField37 = complex35.getField();
        org.apache.commons.math.complex.Complex complex38 = complex35.exp();
        org.apache.commons.math.complex.Complex complex39 = complex35.cos();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.sqrt();
        org.apache.commons.math.complex.Complex complex42 = complex40.sin();
        org.apache.commons.math.complex.Complex complex43 = complex42.sqrt();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex45.add(complex47);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex49.sinh();
        double double52 = complex49.getImaginary();
        org.apache.commons.math.complex.Complex complex53 = complex48.pow(complex49);
        org.apache.commons.math.complex.Complex complex54 = complex48.exp();
        org.apache.commons.math.complex.Complex complex55 = complex42.divide(complex48);
        org.apache.commons.math.complex.Complex complex56 = complex48.asin();
        double double57 = complex48.getImaginary();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex61 = complex60.sin();
        org.apache.commons.math.complex.Complex complex62 = complex59.add(complex61);
        org.apache.commons.math.complex.ComplexField complexField63 = complex59.getField();
        org.apache.commons.math.complex.Complex complex64 = complex59.tan();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex66 = complex65.sin();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex68 = complex67.sin();
        org.apache.commons.math.complex.Complex complex69 = complex66.add(complex68);
        org.apache.commons.math.complex.Complex complex70 = complex66.tan();
        org.apache.commons.math.complex.Complex complex71 = complex59.divide(complex66);
        org.apache.commons.math.complex.Complex complex72 = complex66.cos();
        org.apache.commons.math.complex.Complex complex73 = complex72.sinh();
        org.apache.commons.math.complex.Complex complex74 = complex72.tanh();
        org.apache.commons.math.complex.Complex complex75 = complex48.pow(complex72);
        org.apache.commons.math.complex.Complex complex76 = complex75.atan();
        org.apache.commons.math.complex.Complex complex77 = complex39.add(complex76);
        org.apache.commons.math.complex.Complex complex78 = complex27.pow(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex40", complex9.equals(complex40) ? complex9.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.acos();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex6.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        double double13 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex14 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex17 = complex14.createComplex((double) 0, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex20.add(complex22);
        org.apache.commons.math.complex.ComplexField complexField24 = complex20.getField();
        org.apache.commons.math.complex.Complex complex25 = complex20.tan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex27.tan();
        org.apache.commons.math.complex.Complex complex32 = complex20.divide(complex27);
        org.apache.commons.math.complex.Complex complex33 = complex27.cos();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.I;
        boolean boolean35 = complex33.equals((java.lang.Object) complex34);
        org.apache.commons.math.complex.Complex complex36 = complex34.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex37.exp();
        boolean boolean39 = complex18.equals((java.lang.Object) complex38);
        boolean boolean40 = complex3.equals((java.lang.Object) complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex5.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.ComplexField complexField15 = complex11.getField();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex18.tan();
        org.apache.commons.math.complex.Complex complex23 = complex11.divide(complex18);
        org.apache.commons.math.complex.Complex complex24 = complex18.cos();
        org.apache.commons.math.complex.Complex complex25 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex25.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex29 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = complex5.multiply(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.acos();
        org.apache.commons.math.complex.Complex complex36 = complex35.acos();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex38.acos();
        org.apache.commons.math.complex.Complex complex41 = complex38.acos();
        org.apache.commons.math.complex.Complex complex42 = complex41.exp();
        org.apache.commons.math.complex.Complex complex43 = complex36.subtract(complex42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex42", complex0.equals(complex42) ? complex0.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.add(complex16);
        org.apache.commons.math.complex.ComplexField complexField18 = complex14.getField();
        org.apache.commons.math.complex.Complex complex19 = complex14.tan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex21.tan();
        org.apache.commons.math.complex.Complex complex26 = complex14.divide(complex21);
        org.apache.commons.math.complex.Complex complex27 = complex26.sqrt();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = complex27.pow(complex28);
        java.lang.String str30 = complex28.toString();
        org.apache.commons.math.complex.Complex complex31 = complex8.add(complex28);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        double double35 = complex32.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex32.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        boolean boolean42 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex46 = complex44.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex45.asin();
        boolean boolean48 = complex32.equals((java.lang.Object) complex45);
        org.apache.commons.math.complex.Complex complex49 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex50 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.ComplexField complexField57 = complex53.getField();
        org.apache.commons.math.complex.Complex complex58 = complex53.tan();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.add(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex60.tan();
        org.apache.commons.math.complex.Complex complex65 = complex53.divide(complex60);
        org.apache.commons.math.complex.Complex complex66 = complex60.cos();
        org.apache.commons.math.complex.Complex complex67 = complex66.sinh();
        org.apache.commons.math.complex.Complex complex70 = complex67.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex71 = complex67.sqrt1z();
        org.apache.commons.math.complex.Complex complex74 = complex71.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.ComplexField complexField75 = complex71.getField();
        org.apache.commons.math.complex.Complex complex76 = complex51.pow(complex71);
        org.apache.commons.math.complex.Complex complex77 = complex28.subtract(complex76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex34", complex8.equals(complex34) ? complex8.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        double double5 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex7.getField();
        org.apache.commons.math.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math.complex.Complex complex13 = complex7.exp();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex7.add(complex14);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex20.add(complex22);
        org.apache.commons.math.complex.ComplexField complexField24 = complex20.getField();
        org.apache.commons.math.complex.Complex complex25 = complex20.tan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex27.tan();
        org.apache.commons.math.complex.Complex complex32 = complex20.divide(complex27);
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex35 = complex33.pow(complex34);
        java.lang.String str36 = complex34.toString();
        org.apache.commons.math.complex.Complex complex37 = complex14.add(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex3.divide(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex6", complex3.equals(complex6) ? complex3.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        double double23 = complex22.abs();
        org.apache.commons.math.complex.Complex complex24 = complex20.add(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex21", complex2.equals(complex21) ? complex2.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        boolean boolean5 = complex4.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex9.tan();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 10, (double) 0);
        org.apache.commons.math.complex.Complex complex19 = complex14.add(complex18);
        java.lang.Object obj20 = complex14.readResolve();
        boolean boolean21 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex22 = complex6.acos();
        boolean boolean23 = complex22.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex0.log();
        boolean boolean7 = complex6.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex16.atan();
        org.apache.commons.math.complex.Complex complex20 = complex16.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        boolean boolean25 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex26 = complex21.divide(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex29 = complex27.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex34 = complex32.log();
        org.apache.commons.math.complex.Complex complex35 = complex34.asin();
        java.lang.Object obj36 = complex34.readResolve();
        org.apache.commons.math.complex.Complex complex37 = complex28.add(complex34);
        org.apache.commons.math.complex.Complex complex38 = complex20.multiply(complex28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex31", complex17.equals(complex31) ? complex17.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex13.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex19.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex27 = complex25.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.asin();
        boolean boolean29 = complex13.equals((java.lang.Object) complex26);
        double double30 = complex26.getReal();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex36 = complex31.divide(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex39 = complex37.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex38.asin();
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex26.subtract(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.sqrt1z();
        org.apache.commons.math.complex.Complex complex44 = complex7.subtract(complex43);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.sin();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = complex46.add(complex48);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.sqrt();
        org.apache.commons.math.complex.Complex complex52 = complex50.sinh();
        double double53 = complex50.getImaginary();
        org.apache.commons.math.complex.Complex complex54 = complex49.pow(complex50);
        org.apache.commons.math.complex.Complex complex55 = complex49.cos();
        org.apache.commons.math.complex.Complex complex56 = complex49.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList58 = complex56.nthRoot((int) '4');
        org.apache.commons.math.complex.Complex complex59 = complex56.atan();
        org.apache.commons.math.complex.Complex complex60 = complex7.divide(complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex50", complex15.equals(complex50) ? complex15.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex22.tan();
        org.apache.commons.math.complex.Complex complex27 = complex15.divide(complex22);
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex30 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math.complex.Complex complex32 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex33 = complex30.atan();
        org.apache.commons.math.complex.Complex complex34 = complex33.tan();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex36 = complex13.add(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex31", complex8.equals(complex31) ? complex8.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        java.lang.Class<?> wildcardClass7 = complex5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex21.add(complex24);
        boolean boolean26 = complex21.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex10 = complex1.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex12.acos();
        double double15 = complex12.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList17 = complex12.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex26 = complex24.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex25.asin();
        boolean boolean28 = complex12.equals((java.lang.Object) complex25);
        org.apache.commons.math.complex.Complex complex29 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex30 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 10L, 0.0d);
        org.apache.commons.math.complex.Complex complex34 = complex30.multiply(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex11.add(complex33);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex37.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex41.sinh();
        double double44 = complex41.getImaginary();
        org.apache.commons.math.complex.Complex complex45 = complex40.pow(complex41);
        org.apache.commons.math.complex.Complex complex46 = complex45.sqrt1z();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList51 = complex49.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex54 = complex49.createComplex((double) (byte) 10, 0.0d);
        double double55 = complex49.abs();
        org.apache.commons.math.complex.Complex complex56 = complex45.divide(complex49);
        java.lang.Object obj57 = complex56.readResolve();
        org.apache.commons.math.complex.Complex complex58 = complex33.multiply(complex56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex41", complex14.equals(complex41) ? complex14.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex4.asin();
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((-0.12300730628485634d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex16 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex12.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex11.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex11", complex7.equals(complex11) ? complex7.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        double double2 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = complex0.asin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex5.tan();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex7.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex11", complex7.equals(complex11) ? complex7.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex30.add(complex32);
        org.apache.commons.math.complex.ComplexField complexField34 = complex30.getField();
        org.apache.commons.math.complex.Complex complex35 = complex30.tan();
        org.apache.commons.math.complex.Complex complex36 = complex30.exp();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = complex37.sin();
        org.apache.commons.math.complex.Complex complex40 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex30.add(complex37);
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        org.apache.commons.math.complex.Complex complex43 = complex41.tan();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((-1.2742514467513933E-16d), (-5.644890957062384d));
        boolean boolean47 = complex46.isNaN();
        org.apache.commons.math.complex.Complex complex48 = complex41.pow(complex46);
        org.apache.commons.math.complex.Complex complex49 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex49.multiply(1.1883951057781212d);
        org.apache.commons.math.complex.Complex complex52 = complex27.divide(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex9 and complex37", complex9.equals(complex37) ? complex9.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.log();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = complex4.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex3.multiply(complex10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.ComplexField complexField8 = complex4.getField();
        org.apache.commons.math.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.cos();
        org.apache.commons.math.complex.Complex complex18 = complex0.pow(complex11);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList23 = complex21.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex24 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex21.cos();
        org.apache.commons.math.complex.Complex complex26 = complex21.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex25", complex0.equals(complex25) ? complex0.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        double double7 = complex4.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex4.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex18 = complex16.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        boolean boolean20 = complex4.equals((java.lang.Object) complex17);
        org.apache.commons.math.complex.Complex complex21 = complex4.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex4.sqrt();
        double double23 = complex22.abs();
        org.apache.commons.math.complex.Complex complex24 = complex22.negate();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex3.pow(complex25);
        double double27 = complex25.abs();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.sin();
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex31.negate();
        boolean boolean33 = complex25.equals((java.lang.Object) complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex28", complex6.equals(complex28) ? complex6.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.ComplexField complexField26 = complex22.getField();
        org.apache.commons.math.complex.Complex complex27 = complex22.tan();
        org.apache.commons.math.complex.Complex complex28 = complex22.exp();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex29.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex33 = complex22.add(complex29);
        org.apache.commons.math.complex.Complex complex34 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        boolean boolean40 = complex39.isNaN();
        org.apache.commons.math.complex.Complex complex41 = complex36.divide(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex44 = complex42.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.sqrt();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex48 = complex47.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex47.log();
        org.apache.commons.math.complex.Complex complex50 = complex49.asin();
        java.lang.Object obj51 = complex49.readResolve();
        org.apache.commons.math.complex.Complex complex52 = complex43.add(complex49);
        org.apache.commons.math.complex.Complex complex53 = complex49.atan();
        org.apache.commons.math.complex.Complex complex54 = complex35.pow(complex49);
        org.apache.commons.math.complex.Complex complex55 = complex49.cosh();
        boolean boolean56 = complex20.equals((java.lang.Object) complex55);
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex58 = complex57.sin();
        org.apache.commons.math.complex.Complex complex59 = complex57.acos();
        double double60 = complex57.abs();
        boolean boolean61 = complex57.isInfinite();
        org.apache.commons.math.complex.Complex complex62 = complex57.sin();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex64 = complex63.sin();
        org.apache.commons.math.complex.Complex complex65 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex66 = complex65.sin();
        boolean boolean67 = complex66.isNaN();
        org.apache.commons.math.complex.Complex complex68 = complex63.divide(complex66);
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj71 = complex70.readResolve();
        org.apache.commons.math.complex.Complex complex72 = complex69.pow(complex70);
        org.apache.commons.math.complex.Complex complex73 = complex69.asin();
        org.apache.commons.math.complex.Complex complex74 = complex57.subtract(complex73);
        org.apache.commons.math.complex.Complex complex75 = complex20.pow(complex74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex59", complex8.equals(complex59) ? complex8.hashCode() == complex59.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.acos();
        org.apache.commons.math.complex.Complex complex14 = complex12.cosh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj16 = complex15.readResolve();
        double double17 = complex15.getImaginary();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex14.add(complex18);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex20.acos();
        double double23 = complex20.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList25 = complex20.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex34 = complex32.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex33.asin();
        boolean boolean36 = complex20.equals((java.lang.Object) complex33);
        double double37 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        boolean boolean42 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex46 = complex44.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex45.asin();
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex33.subtract(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex48.sqrt1z();
        org.apache.commons.math.complex.Complex complex51 = complex14.subtract(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex0.pow(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex22", complex0.equals(complex22) ? complex0.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        double double9 = complex8.getArgument();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex10.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex1 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = complex3.tan();
        org.apache.commons.math.complex.Complex complex6 = complex3.asin();
        org.apache.commons.math.complex.Complex complex7 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex8 = complex7.cos();
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        double double13 = complex10.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex10.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex16.divide(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex24 = complex22.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex23.asin();
        boolean boolean26 = complex10.equals((java.lang.Object) complex23);
        org.apache.commons.math.complex.Complex complex27 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex8.subtract(complex10);
        org.apache.commons.math.complex.Complex complex30 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex8.multiply(2.778096253560203d);
        org.apache.commons.math.complex.Complex complex33 = complex8.acos();
        org.apache.commons.math.complex.Complex complex34 = complex1.pow(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex33", complex7.equals(complex33) ? complex7.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex21.createComplex(1.305979828850128d, 2.3899553468592085d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math.complex.Complex complex29 = complex26.asin();
        org.apache.commons.math.complex.Complex complex30 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex36 = complex32.createComplex((double) 10, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.apache.commons.math.complex.Complex complex38 = complex21.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex38", complex8.equals(complex38) ? complex8.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj17 = complex16.readResolve();
        org.apache.commons.math.complex.Complex complex18 = complex16.atan();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (-1L));
        org.apache.commons.math.complex.Complex complex22 = complex18.subtract(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        java.lang.String str24 = complex23.toString();
        org.apache.commons.math.complex.ComplexField complexField25 = complex23.getField();
        java.util.List<org.apache.commons.math.complex.Complex> complexList27 = complex23.nthRoot((int) (short) 10);
        java.lang.String str28 = complex23.toString();
        org.apache.commons.math.complex.Complex complex29 = complex13.divide(complex23);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex30.acos();
        double double33 = complex30.getArgument();
        org.apache.commons.math.complex.Complex complex34 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math.complex.Complex complex41 = complex38.add(complex40);
        org.apache.commons.math.complex.ComplexField complexField42 = complex38.getField();
        org.apache.commons.math.complex.Complex complex43 = complex38.tan();
        org.apache.commons.math.complex.Complex complex46 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex47 = complex38.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex35.add(complex38);
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex51 = complex48.add(complex50);
        boolean boolean52 = complex50.isInfinite();
        org.apache.commons.math.complex.Complex complex53 = complex50.cos();
        org.apache.commons.math.complex.Complex complex54 = complex30.subtract(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex29.pow(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex32", complex15.equals(complex32) ? complex15.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = complex5.conjugate();
        boolean boolean29 = complex5.equals((java.lang.Object) "(0.11238145395442382, 0.0)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex27", complex5.equals(complex27) ? complex5.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(complex7);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex12 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = complex5.divide(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex3.divide(complex5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.acos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj25 = complex24.readResolve();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        org.apache.commons.math.complex.Complex complex29 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (-1L));
        org.apache.commons.math.complex.Complex complex30 = complex26.subtract(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex30.asin();
        org.apache.commons.math.complex.Complex complex33 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex23.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.sqrt();
        org.apache.commons.math.complex.Complex complex37 = complex36.sqrt();
        double double38 = complex37.getReal();
        org.apache.commons.math.complex.Complex complex39 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex23.subtract(complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex35", complex2.equals(complex35) ? complex2.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex28 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex29 = complex7.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex28", complex7.equals(complex28) ? complex7.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.asin();
        org.apache.commons.math.complex.ComplexField complexField7 = complex6.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.createComplex((double) 0L, (double) (-1));
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.abs();
        boolean boolean17 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex19.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj27 = complex26.readResolve();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex25.asin();
        org.apache.commons.math.complex.Complex complex30 = complex13.subtract(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex7.multiply(complex29);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        boolean boolean46 = complex45.isNaN();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex50 = complex48.add(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex49.asin();
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex40.subtract(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex7.subtract(complex52);
        org.apache.commons.math.complex.Complex complex55 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex57 = complex56.tanh();
        org.apache.commons.math.complex.Complex complex58 = complex57.log();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.add(complex62);
        org.apache.commons.math.complex.Complex complex64 = complex60.tan();
        org.apache.commons.math.complex.Complex complex65 = complex64.acos();
        org.apache.commons.math.complex.Complex complex66 = complex64.cosh();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj68 = complex67.readResolve();
        double double69 = complex67.getImaginary();
        org.apache.commons.math.complex.Complex complex70 = complex67.tanh();
        org.apache.commons.math.complex.Complex complex71 = complex66.add(complex70);
        org.apache.commons.math.complex.Complex complex72 = complex66.atan();
        org.apache.commons.math.complex.Complex complex74 = complex72.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex75 = complex74.sqrt();
        org.apache.commons.math.complex.Complex complex76 = complex57.add(complex75);
        org.apache.commons.math.complex.Complex complex77 = complex75.cosh();
        org.apache.commons.math.complex.Complex complex78 = complex52.multiply(complex77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex74", complex15.equals(complex74) ? complex15.hashCode() == complex74.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList4 = complex2.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex7 = complex2.createComplex((double) (byte) 10, 0.0d);
        org.apache.commons.math.complex.Complex complex10 = complex2.createComplex((double) 100L, (double) 0);
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.tanh();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.ComplexField complexField20 = complex16.getField();
        org.apache.commons.math.complex.Complex complex21 = complex16.tan();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex25 = complex16.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex13.add(complex16);
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex26.negate();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex31.acos();
        double double34 = complex31.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList36 = complex31.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        boolean boolean41 = complex40.isNaN();
        org.apache.commons.math.complex.Complex complex42 = complex37.divide(complex40);
        org.apache.commons.math.complex.Complex complex43 = complex42.atan();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex45 = complex43.add(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex44.asin();
        boolean boolean47 = complex31.equals((java.lang.Object) complex44);
        org.apache.commons.math.complex.Complex complex48 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex49 = complex31.sqrt();
        double double50 = complex49.abs();
        org.apache.commons.math.complex.Complex complex51 = complex49.negate();
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex26.subtract(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex26.atan();
        org.apache.commons.math.complex.Complex complex55 = complex11.subtract(complex26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex33", complex0.equals(complex33) ? complex0.hashCode() == complex33.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        double double2 = complex0.getImaginary();
        java.lang.Object obj3 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math.complex.Complex complex7 = complex4.negate();
        org.apache.commons.math.complex.Complex complex8 = complex4.acos();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj10 = complex9.readResolve();
        org.apache.commons.math.complex.Complex complex11 = complex9.atan();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (-1L));
        org.apache.commons.math.complex.Complex complex15 = complex11.subtract(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex15.asin();
        org.apache.commons.math.complex.Complex complex18 = complex15.tanh();
        boolean boolean19 = complex4.equals((java.lang.Object) complex18);
        org.apache.commons.math.complex.Complex complex21 = complex18.multiply((double) ' ');
        org.apache.commons.math.complex.Complex complex22 = complex0.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        double double5 = complex3.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex3.cos();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.ComplexField complexField12 = complex8.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex15.tan();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex15.negate();
        org.apache.commons.math.complex.Complex complex22 = complex15.cos();
        org.apache.commons.math.complex.Complex complex23 = complex6.subtract(complex15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex7", complex3.equals(complex7) ? complex3.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        double double11 = complex10.abs();
        org.apache.commons.math.complex.Complex complex12 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex12", complex5.equals(complex12) ? complex5.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        double double2 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex3 = complex0.log();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        boolean boolean6 = complex5.isNaN();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex5.divide(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex5.cos();
        org.apache.commons.math.complex.Complex complex15 = complex5.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex16 = complex5.acos();
        org.apache.commons.math.complex.Complex complex17 = complex0.divide(complex16);
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.add(complex21);
        org.apache.commons.math.complex.ComplexField complexField23 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = complex19.tan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex26.tan();
        org.apache.commons.math.complex.Complex complex31 = complex19.divide(complex26);
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex34 = complex32.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex34.acos();
        org.apache.commons.math.complex.Complex complex36 = complex34.tanh();
        boolean boolean37 = complex36.isNaN();
        java.lang.String str38 = complex36.toString();
        org.apache.commons.math.complex.Complex complex39 = complex17.multiply(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex35", complex0.equals(complex35) ? complex0.hashCode() == complex35.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex(1.305979828850128d, (double) 0L);
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex19.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.sqrt();
        double double3 = complex2.getReal();
        org.apache.commons.math.complex.Complex complex4 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        boolean boolean9 = complex8.isNaN();
        org.apache.commons.math.complex.Complex complex10 = complex5.divide(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex10.atan();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex14 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex15 = complex12.acos();
        double double16 = complex12.getArgument();
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.tanh();
        org.apache.commons.math.complex.Complex complex20 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex17.add(complex20);
        org.apache.commons.math.complex.Complex complex23 = complex2.divide(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        org.apache.commons.math.complex.Complex complex8 = complex6.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex9 = complex8.negate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.ComplexField complexField15 = complex11.getField();
        org.apache.commons.math.complex.Complex complex16 = complex11.tan();
        org.apache.commons.math.complex.Complex complex17 = complex11.exp();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex11.add(complex18);
        org.apache.commons.math.complex.ComplexField complexField23 = complex22.getField();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex24.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex26.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex29 = complex22.pow(complex26);
        org.apache.commons.math.complex.Complex complex30 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.tanh();
        org.apache.commons.math.complex.Complex complex32 = complex9.subtract(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex18", complex8.equals(complex18) ? complex8.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        double double19 = complex17.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex5.subtract(complex7);
        org.apache.commons.math.complex.Complex complex27 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex5.multiply(2.778096253560203d);
        org.apache.commons.math.complex.Complex complex30 = complex5.acos();
        double double31 = complex5.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex30", complex4.equals(complex30) ? complex4.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.asin();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex4 = complex2.multiply(0.44865848583902246d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.cos();
        double double19 = complex18.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        java.lang.Object obj21 = complex18.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex16 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.conjugate();
        double double18 = complex17.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        double double5 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex7 = complex1.add(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        double double13 = complex10.abs();
        boolean boolean14 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex16.divide(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj24 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex22.asin();
        org.apache.commons.math.complex.Complex complex27 = complex10.subtract(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.cos();
        double double29 = complex26.getReal();
        boolean boolean30 = complex9.equals((java.lang.Object) complex26);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex31.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList35 = complex33.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex36 = complex33.acos();
        boolean boolean37 = complex9.equals((java.lang.Object) complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex31", complex12.equals(complex31) ? complex12.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math.complex.Complex complex6 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        double double12 = complex11.getImaginary();
        java.lang.String str13 = complex11.toString();
        org.apache.commons.math.complex.Complex complex14 = complex4.add(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex6", complex4.equals(complex6) ? complex4.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex16 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.add(complex21);
        org.apache.commons.math.complex.ComplexField complexField23 = complex19.getField();
        org.apache.commons.math.complex.Complex complex24 = complex19.tan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex26.tan();
        org.apache.commons.math.complex.Complex complex31 = complex19.divide(complex26);
        org.apache.commons.math.complex.Complex complex32 = complex26.cos();
        org.apache.commons.math.complex.Complex complex33 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex36 = complex33.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex37 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex40 = complex37.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex40.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex40.sqrt();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex45.add(complex47);
        org.apache.commons.math.complex.ComplexField complexField49 = complex45.getField();
        org.apache.commons.math.complex.Complex complex50 = complex45.cos();
        org.apache.commons.math.complex.Complex complex52 = complex50.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex53 = complex52.acos();
        org.apache.commons.math.complex.Complex complex54 = complex43.subtract(complex52);
        org.apache.commons.math.complex.Complex complex55 = complex12.pow(complex52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = complex16.tanh();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) ' ');
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex23.acos();
        double double26 = complex23.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList28 = complex23.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex29 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex20.pow(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex29", complex2.equals(complex29) ? complex2.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.asin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField25 = complex21.getField();
        org.apache.commons.math.complex.Complex complex28 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = complex21.divide(complex29);
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex32.tan();
        org.apache.commons.math.complex.Complex complex37 = complex36.exp();
        org.apache.commons.math.complex.Complex complex38 = complex36.log();
        org.apache.commons.math.complex.Complex complex39 = complex38.exp();
        org.apache.commons.math.complex.Complex complex40 = complex30.multiply(complex38);
        org.apache.commons.math.complex.Complex complex42 = complex38.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        double double44 = complex43.getImaginary();
        double double45 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex43.log();
        org.apache.commons.math.complex.Complex complex47 = complex38.subtract(complex43);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = complex49.add(complex51);
        org.apache.commons.math.complex.ComplexField complexField53 = complex49.getField();
        org.apache.commons.math.complex.Complex complex54 = complex49.tan();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex56 = complex55.sin();
        org.apache.commons.math.complex.Complex complex57 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex58 = complex57.sin();
        org.apache.commons.math.complex.Complex complex59 = complex56.add(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex56.tan();
        org.apache.commons.math.complex.Complex complex61 = complex49.divide(complex56);
        org.apache.commons.math.complex.Complex complex62 = complex56.cos();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.I;
        boolean boolean64 = complex62.equals((java.lang.Object) complex63);
        org.apache.commons.math.complex.Complex complex65 = complex63.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex65.sin();
        java.lang.Object obj67 = complex66.readResolve();
        org.apache.commons.math.complex.Complex complex68 = complex47.add(complex66);
        org.apache.commons.math.complex.Complex complex69 = complex19.divide(complex47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex43", complex2.equals(complex43) ? complex2.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex0.conjugate();
        java.lang.Class<?> wildcardClass8 = complex7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex12 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex9.acos();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex22 = complex20.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = complex24.add(complex26);
        org.apache.commons.math.complex.ComplexField complexField28 = complex24.getField();
        org.apache.commons.math.complex.Complex complex29 = complex24.tan();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = complex31.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex31.tan();
        org.apache.commons.math.complex.Complex complex36 = complex24.divide(complex31);
        org.apache.commons.math.complex.Complex complex37 = complex31.cos();
        org.apache.commons.math.complex.Complex complex38 = complex37.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex38.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex42 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex22.divide(complex38);
        org.apache.commons.math.complex.Complex complex44 = complex38.atan();
        org.apache.commons.math.complex.Complex complex47 = complex38.createComplex((-2.099129903615287E-16d), 2.3470051471515414d);
        org.apache.commons.math.complex.Complex complex48 = complex9.divide(complex38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex13", complex5.equals(complex13) ? complex5.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.ComplexField complexField8 = complex4.getField();
        org.apache.commons.math.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.cos();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex11);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex19.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex30.add(complex32);
        org.apache.commons.math.complex.ComplexField complexField34 = complex30.getField();
        org.apache.commons.math.complex.Complex complex35 = complex30.exp();
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = complex35.asin();
        org.apache.commons.math.complex.Complex complex38 = complex28.subtract(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex18.divide(complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cos();
        org.apache.commons.math.complex.Complex complex42 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex40.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex39.multiply(complex43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex43", complex0.equals(complex43) ? complex0.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.add(complex14);
        org.apache.commons.math.complex.Complex complex16 = complex12.tan();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.log();
        org.apache.commons.math.complex.Complex complex19 = complex18.exp();
        org.apache.commons.math.complex.Complex complex20 = complex10.multiply(complex18);
        org.apache.commons.math.complex.Complex complex22 = complex18.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(0.5825848535059511d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex18 and complex24", complex18.equals(complex24) ? complex18.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex7.log();
        double double10 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex11 = complex9.tanh();
        org.apache.commons.math.complex.Complex complex14 = new org.apache.commons.math.complex.Complex((-0.5936929170897928d), 2.718281828459045d);
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex11.multiply(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex0.divide(complex16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex9.tan();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 10, (double) 0);
        org.apache.commons.math.complex.Complex complex19 = complex14.add(complex18);
        java.lang.Object obj20 = complex14.readResolve();
        boolean boolean21 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex22 = complex6.acos();
        org.apache.commons.math.complex.Complex complex23 = complex6.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex2.nthRoot((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        double double5 = complex3.abs();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex6.acos();
        double double9 = complex6.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList11 = complex6.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        boolean boolean16 = complex15.isNaN();
        org.apache.commons.math.complex.Complex complex17 = complex12.divide(complex15);
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex20 = complex18.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex19.asin();
        boolean boolean22 = complex6.equals((java.lang.Object) complex19);
        org.apache.commons.math.complex.Complex complex23 = complex19.atan();
        org.apache.commons.math.complex.Complex complex24 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex24.tanh();
        boolean boolean26 = complex25.isNaN();
        boolean boolean27 = complex3.equals((java.lang.Object) complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex8", complex0.equals(complex8) ? complex0.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex15.tan();
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        double double21 = complex20.abs();
        java.lang.Object obj22 = null;
        boolean boolean23 = complex20.equals(obj22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.tan();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex32.tan();
        org.apache.commons.math.complex.Complex complex37 = complex25.divide(complex32);
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex38.pow(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex20.subtract(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex8.pow(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex42.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = complex45.conjugate();
        org.apache.commons.math.complex.Complex complex47 = complex45.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex45 and complex46", complex45.equals(complex46) ? complex45.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex12.add(complex15);
        org.apache.commons.math.complex.Complex complex26 = complex10.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex10.exp();
        org.apache.commons.math.complex.Complex complex28 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex30 = complex29.cos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex29", complex10.equals(complex29) ? complex10.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        double double7 = complex5.abs();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex5.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        double double4 = complex3.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.asin();
        org.apache.commons.math.complex.Complex complex7 = complex0.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex21.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.ComplexField complexField31 = complex27.getField();
        org.apache.commons.math.complex.Complex complex32 = complex27.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex34.tan();
        org.apache.commons.math.complex.Complex complex39 = complex27.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex39.asin();
        java.lang.Object obj41 = complex39.readResolve();
        java.lang.Object obj42 = complex39.readResolve();
        boolean boolean43 = complex21.equals((java.lang.Object) complex39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex8.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex10", complex8.equals(complex10) ? complex8.hashCode() == complex10.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        double double10 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex0.divide(complex11);
        boolean boolean13 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex14 = complex0.log();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex18 = complex14.createComplex((-0.0d), (double) 0L);
        org.apache.commons.math.complex.Complex complex19 = complex18.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex18", complex7.equals(complex18) ? complex7.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        double double7 = complex6.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex3.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex3.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex8.cos();
        org.apache.commons.math.complex.Complex complex12 = complex7.multiply(complex8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex11", complex5.equals(complex11) ? complex5.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        java.lang.String str17 = complex15.toString();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex18.acos();
        double double21 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex22 = complex18.sinh();
        org.apache.commons.math.complex.Complex complex23 = complex15.divide(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex31.nthRoot((int) (short) 10);
        double double34 = complex31.getImaginary();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        boolean boolean39 = complex38.isNaN();
        org.apache.commons.math.complex.Complex complex40 = complex35.divide(complex38);
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj43 = complex42.readResolve();
        org.apache.commons.math.complex.Complex complex44 = complex41.pow(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex31.divide(complex42);
        org.apache.commons.math.complex.Complex complex46 = complex42.log();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        boolean boolean51 = complex50.isNaN();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj55 = complex54.readResolve();
        org.apache.commons.math.complex.Complex complex56 = complex53.pow(complex54);
        org.apache.commons.math.complex.Complex complex58 = complex54.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex59 = complex54.sinh();
        org.apache.commons.math.complex.Complex complex60 = complex42.divide(complex59);
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex64 = complex63.sin();
        boolean boolean65 = complex64.isNaN();
        org.apache.commons.math.complex.Complex complex66 = complex61.divide(complex64);
        org.apache.commons.math.complex.Complex complex67 = complex66.atan();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex69 = complex67.add(complex68);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex71 = complex70.sqrt();
        org.apache.commons.math.complex.Complex complex72 = complex71.cosh();
        org.apache.commons.math.complex.Complex complex73 = complex71.log();
        org.apache.commons.math.complex.Complex complex74 = complex68.subtract(complex73);
        org.apache.commons.math.complex.Complex complex75 = complex59.divide(complex68);
        double double76 = complex75.getReal();
        org.apache.commons.math.complex.Complex complex77 = complex23.subtract(complex75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex20 and complex46", complex20.equals(complex46) ? complex20.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.conjugate();
        boolean boolean9 = complex5.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex8", complex5.equals(complex8) ? complex5.hashCode() == complex8.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        org.apache.commons.math.complex.Complex complex4 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(complex7);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex5.tan();
        org.apache.commons.math.complex.Complex complex11 = complex5.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex5.add(complex12);
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex16.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex20.negate();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        double double43 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex31.add(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex20.add(complex31);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex(100.0d, (double) (-1));
        org.apache.commons.math.complex.Complex complex49 = complex45.pow(complex48);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = complex51.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex51.tan();
        org.apache.commons.math.complex.Complex complex56 = complex55.acos();
        org.apache.commons.math.complex.Complex complex57 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex58 = complex55.atan();
        org.apache.commons.math.complex.Complex complex59 = complex49.multiply(complex55);
        org.apache.commons.math.complex.Complex complex60 = complex2.multiply(complex49);
        org.apache.commons.math.complex.Complex complex61 = complex2.sin();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex63 = complex62.sin();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex65 = complex64.sin();
        boolean boolean66 = complex65.isNaN();
        org.apache.commons.math.complex.Complex complex67 = complex62.divide(complex65);
        org.apache.commons.math.complex.Complex complex68 = complex67.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList70 = complex68.nthRoot((int) (short) 10);
        double double71 = complex68.getImaginary();
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex73 = complex72.sin();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex75 = complex74.sin();
        boolean boolean76 = complex75.isNaN();
        org.apache.commons.math.complex.Complex complex77 = complex72.divide(complex75);
        org.apache.commons.math.complex.Complex complex78 = complex77.atan();
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj80 = complex79.readResolve();
        org.apache.commons.math.complex.Complex complex81 = complex78.pow(complex79);
        org.apache.commons.math.complex.Complex complex82 = complex68.divide(complex79);
        org.apache.commons.math.complex.Complex complex83 = complex2.subtract(complex79);
        org.apache.commons.math.complex.Complex complex84 = complex83.asin();
        org.apache.commons.math.complex.Complex complex85 = complex84.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex84", complex0.equals(complex84) ? complex0.hashCode() == complex84.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex7.getField();
        org.apache.commons.math.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math.complex.Complex complex13 = complex7.exp();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex7.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex18.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.negate();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = complex28.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex28.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex35.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex35.tan();
        org.apache.commons.math.complex.Complex complex40 = complex39.acos();
        org.apache.commons.math.complex.Complex complex41 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex39.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        double double45 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex33.add(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex22.add(complex33);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex(100.0d, (double) (-1));
        org.apache.commons.math.complex.Complex complex51 = complex47.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex53.tan();
        org.apache.commons.math.complex.Complex complex58 = complex57.acos();
        org.apache.commons.math.complex.Complex complex59 = complex57.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex57.atan();
        org.apache.commons.math.complex.Complex complex61 = complex51.multiply(complex57);
        org.apache.commons.math.complex.Complex complex62 = complex0.multiply(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex62.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex62", complex0.equals(complex62) ? complex0.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex19 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex19.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex26 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex27.acos();
        org.apache.commons.math.complex.Complex complex30 = complex29.exp();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex30", complex0.equals(complex30) ? complex0.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        double double16 = complex14.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.Complex complex27 = complex22.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex33.acos();
        org.apache.commons.math.complex.Complex complex35 = complex33.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex33.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        double double39 = complex37.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex27.add(complex37);
        org.apache.commons.math.complex.Complex complex41 = complex16.add(complex27);
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex(100.0d, (double) (-1));
        org.apache.commons.math.complex.Complex complex45 = complex41.pow(complex44);
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex46.tan();
        org.apache.commons.math.complex.Complex complex49 = complex46.asin();
        org.apache.commons.math.complex.Complex complex50 = complex46.tanh();
        org.apache.commons.math.complex.Complex complex51 = complex50.cos();
        org.apache.commons.math.complex.Complex complex52 = complex51.negate();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex54 = complex53.sin();
        org.apache.commons.math.complex.Complex complex55 = complex53.acos();
        double double56 = complex53.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList58 = complex53.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        boolean boolean63 = complex62.isNaN();
        org.apache.commons.math.complex.Complex complex64 = complex59.divide(complex62);
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex67 = complex65.add(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex66.asin();
        boolean boolean69 = complex53.equals((java.lang.Object) complex66);
        org.apache.commons.math.complex.Complex complex70 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex71 = complex53.sqrt();
        org.apache.commons.math.complex.Complex complex72 = complex51.subtract(complex53);
        org.apache.commons.math.complex.Complex complex73 = complex51.conjugate();
        org.apache.commons.math.complex.Complex complex74 = complex45.add(complex73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex55", complex8.equals(complex55) ? complex8.hashCode() == complex55.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex9 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex10 = complex1.add(complex9);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        boolean boolean15 = complex14.isNaN();
        org.apache.commons.math.complex.Complex complex16 = complex11.divide(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex19 = complex17.add(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex17.exp();
        org.apache.commons.math.complex.Complex complex21 = complex9.pow(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex21.log();
        org.apache.commons.math.complex.Complex complex24 = complex22.multiply(0.9045568943023813d);
        org.apache.commons.math.complex.Complex complex25 = complex22.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.ComplexField complexField31 = complex27.getField();
        org.apache.commons.math.complex.Complex complex32 = complex27.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex34.tan();
        org.apache.commons.math.complex.Complex complex39 = complex27.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex34.cos();
        org.apache.commons.math.complex.Complex complex41 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex41.createComplex((double) 1, (double) 1);
        double double45 = complex44.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex44.tan();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex48.cosh();
        org.apache.commons.math.complex.Complex complex50 = complex48.log();
        org.apache.commons.math.complex.Complex complex51 = complex48.acos();
        org.apache.commons.math.complex.ComplexField complexField52 = complex51.getField();
        org.apache.commons.math.complex.Complex complex53 = complex46.multiply(complex51);
        org.apache.commons.math.complex.Complex complex55 = complex53.multiply((-1.1102230246251565E-16d));
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex25.subtract(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex56", complex0.equals(complex56) ? complex0.hashCode() == complex56.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        double double15 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex11.exp();
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        double double19 = complex18.abs();
        org.apache.commons.math.complex.Complex complex20 = complex18.sin();
        org.apache.commons.math.complex.Complex complex21 = complex6.add(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex13.sinh();
        double double16 = complex13.getImaginary();
        org.apache.commons.math.complex.Complex complex17 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex20 = complex17.createComplex((double) 0, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex21 = complex17.exp();
        org.apache.commons.math.complex.Complex complex22 = complex21.cos();
        org.apache.commons.math.complex.Complex complex23 = complex7.pow(complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex7", complex4.equals(complex7) ? complex4.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.conjugate();
        double double13 = complex12.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex12", complex11.equals(complex12) ? complex11.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex7.getField();
        org.apache.commons.math.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.add(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex14.tan();
        org.apache.commons.math.complex.Complex complex19 = complex7.divide(complex14);
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex22 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex22.tanh();
        boolean boolean25 = complex24.isNaN();
        java.lang.String str26 = complex24.toString();
        org.apache.commons.math.complex.Complex complex27 = complex5.pow(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex15.createComplex((double) 1, (double) 1);
        double double19 = complex18.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex18.tan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex24 = complex22.log();
        org.apache.commons.math.complex.Complex complex25 = complex22.acos();
        org.apache.commons.math.complex.ComplexField complexField26 = complex25.getField();
        org.apache.commons.math.complex.Complex complex27 = complex20.multiply(complex25);
        org.apache.commons.math.complex.Complex complex29 = complex27.multiply((-1.1102230246251565E-16d));
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex32.tan();
        org.apache.commons.math.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math.complex.Complex complex38 = complex36.cosh();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        boolean boolean43 = complex42.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex39.divide(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex47 = complex45.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex46.asin();
        org.apache.commons.math.complex.Complex complex49 = complex36.pow(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex49.log();
        org.apache.commons.math.complex.Complex complex51 = complex50.tan();
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex51.acos();
        org.apache.commons.math.complex.Complex complex54 = complex29.divide(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex30", complex0.equals(complex30) ? complex0.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.tan();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex6 and complex15", complex6.equals(complex15) ? complex6.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex12 = complex9.createComplex((double) 0, (double) (short) 1);
        org.apache.commons.math.complex.Complex complex13 = complex12.cos();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex22.tan();
        org.apache.commons.math.complex.Complex complex27 = complex15.divide(complex22);
        org.apache.commons.math.complex.Complex complex28 = complex22.cos();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.I;
        boolean boolean30 = complex28.equals((java.lang.Object) complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex32.exp();
        boolean boolean34 = complex13.equals((java.lang.Object) complex33);
        boolean boolean35 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex37.add(complex39);
        org.apache.commons.math.complex.ComplexField complexField41 = complex37.getField();
        org.apache.commons.math.complex.Complex complex44 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex37.divide(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math.complex.Complex complex51 = complex48.add(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex48.tan();
        org.apache.commons.math.complex.Complex complex53 = complex52.exp();
        org.apache.commons.math.complex.Complex complex54 = complex52.log();
        org.apache.commons.math.complex.Complex complex55 = complex54.exp();
        org.apache.commons.math.complex.Complex complex56 = complex46.multiply(complex54);
        org.apache.commons.math.complex.Complex complex58 = complex54.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex59 = complex58.acos();
        org.apache.commons.math.complex.Complex complex60 = complex58.conjugate();
        org.apache.commons.math.complex.Complex complex61 = complex13.multiply(complex58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex54 and complex60", complex54.equals(complex60) ? complex54.hashCode() == complex60.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex19 = complex16.createComplex(1.305979828850128d, (double) 0L);
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        java.lang.Object obj21 = complex20.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj13 = complex12.readResolve();
        double double14 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex16 = complex11.add(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex12.conjugate();
        java.lang.Object obj18 = complex12.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex17", complex12.equals(complex17) ? complex12.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        double double12 = complex9.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        boolean boolean25 = complex9.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex28 = complex9.log();
        boolean boolean30 = complex9.equals((java.lang.Object) 1.0375557555027446d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex28", complex11.equals(complex28) ? complex11.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = complex14.acos();
        java.lang.Class<?> wildcardClass16 = complex15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex15", complex1.equals(complex15) ? complex1.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.tan();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex22 = complex13.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex23.divide(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex31 = complex29.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex29.exp();
        org.apache.commons.math.complex.Complex complex33 = complex21.pow(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex32.acos();
        org.apache.commons.math.complex.Complex complex35 = complex34.tanh();
        org.apache.commons.math.complex.Complex complex37 = complex34.multiply(0.7853981633974483d);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex38.sinh();
        double double41 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = complex38.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = complex37.multiply(complex44);
        boolean boolean47 = complex11.equals((java.lang.Object) complex37);
        double double48 = complex37.getImaginary();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.tanh();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex52 = complex51.sin();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex54 = complex53.sin();
        org.apache.commons.math.complex.Complex complex55 = complex52.add(complex54);
        org.apache.commons.math.complex.ComplexField complexField56 = complex52.getField();
        org.apache.commons.math.complex.Complex complex57 = complex52.tan();
        org.apache.commons.math.complex.Complex complex60 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex61 = complex52.add(complex60);
        org.apache.commons.math.complex.Complex complex62 = complex49.add(complex52);
        org.apache.commons.math.complex.Complex complex63 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex64 = complex49.cosh();
        org.apache.commons.math.complex.Complex complex66 = complex49.multiply((-1.0d));
        double double67 = complex49.getImaginary();
        boolean boolean68 = complex49.isNaN();
        org.apache.commons.math.complex.Complex complex69 = complex49.conjugate();
        org.apache.commons.math.complex.Complex complex70 = complex37.multiply(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex49 and complex69", complex49.equals(complex69) ? complex49.hashCode() == complex69.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex20.add(complex22);
        org.apache.commons.math.complex.ComplexField complexField24 = complex20.getField();
        org.apache.commons.math.complex.Complex complex25 = complex20.tan();
        org.apache.commons.math.complex.Complex complex26 = complex20.exp();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex27.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex20.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField32 = complex31.getField();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList37 = complex35.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex38 = complex31.pow(complex35);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math.complex.Complex complex41 = complex38.multiply(complex40);
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = complex43.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.sqrt();
        org.apache.commons.math.complex.Complex complex49 = complex47.sinh();
        double double50 = complex47.getImaginary();
        org.apache.commons.math.complex.Complex complex51 = complex46.pow(complex47);
        org.apache.commons.math.complex.Complex complex52 = complex46.exp();
        org.apache.commons.math.complex.Complex complex53 = complex40.subtract(complex46);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex18.pow(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.ComplexField complexField26 = complex22.getField();
        org.apache.commons.math.complex.Complex complex27 = complex22.tan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex29.cos();
        org.apache.commons.math.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        java.lang.Object obj45 = complex43.readResolve();
        org.apache.commons.math.complex.Complex complex46 = complex20.subtract(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex20.log();
        org.apache.commons.math.complex.Complex complex49 = complex48.conjugate();
        org.apache.commons.math.complex.Complex complex50 = complex49.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex48 and complex49", complex48.equals(complex49) ? complex48.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj6 = complex5.readResolve();
        org.apache.commons.math.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math.complex.Complex complex10 = new org.apache.commons.math.complex.Complex((double) (-1), (double) (-1L));
        org.apache.commons.math.complex.Complex complex11 = complex7.subtract(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.asin();
        org.apache.commons.math.complex.Complex complex14 = complex11.tanh();
        boolean boolean15 = complex0.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt();
        org.apache.commons.math.complex.Complex complex18 = complex16.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.cos();
        org.apache.commons.math.complex.Complex complex20 = complex19.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.acos();
        org.apache.commons.math.complex.Complex complex22 = complex14.multiply(complex21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj8 = complex7.readResolve();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex6.asin();
        org.apache.commons.math.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        java.lang.Object obj14 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.asin();
        org.apache.commons.math.complex.Complex complex16 = complex12.tan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        double double18 = complex17.getImaginary();
        double double19 = complex17.getArgument();
        org.apache.commons.math.complex.Complex complex20 = complex17.log();
        org.apache.commons.math.complex.Complex complex21 = complex17.negate();
        org.apache.commons.math.complex.Complex complex22 = complex21.negate();
        org.apache.commons.math.complex.Complex complex23 = complex22.cos();
        boolean boolean24 = complex12.equals((java.lang.Object) complex22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex23", complex0.equals(complex23) ? complex0.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex17.acos();
        double double20 = complex17.abs();
        boolean boolean21 = complex17.isInfinite();
        org.apache.commons.math.complex.Complex complex22 = complex17.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex25 = complex17.asin();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex13.divide(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex25.sinh();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex30.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex34.sinh();
        double double37 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex39 = complex33.exp();
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        double double41 = complex40.abs();
        double double42 = complex40.abs();
        org.apache.commons.math.complex.Complex complex43 = complex40.exp();
        org.apache.commons.math.complex.Complex complex44 = complex40.sqrt();
        boolean boolean45 = complex28.equals((java.lang.Object) complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex34", complex19.equals(complex34) ? complex19.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex1.cos();
        org.apache.commons.math.complex.Complex complex11 = complex1.multiply((double) '#');
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex1.multiply(complex13);
        java.lang.Object obj16 = complex1.readResolve();
        org.apache.commons.math.complex.Complex complex17 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex18 = complex1.asin();
        org.apache.commons.math.complex.Complex complex19 = complex1.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.acos();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField25 = complex21.getField();
        org.apache.commons.math.complex.Complex complex26 = complex21.tan();
        org.apache.commons.math.complex.Complex complex27 = complex21.exp();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex28.sin();
        org.apache.commons.math.complex.Complex complex31 = complex28.sinh();
        org.apache.commons.math.complex.Complex complex32 = complex21.add(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex32.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex32.multiply(10.0d);
        org.apache.commons.math.complex.ComplexField complexField36 = complex32.getField();
        org.apache.commons.math.complex.Complex complex37 = complex32.cosh();
        org.apache.commons.math.complex.Complex complex38 = complex19.pow(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex28", complex17.equals(complex28) ? complex17.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.ComplexField complexField8 = complex4.getField();
        org.apache.commons.math.complex.Complex complex9 = complex4.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex4.divide(complex11);
        org.apache.commons.math.complex.Complex complex17 = complex11.cos();
        org.apache.commons.math.complex.Complex complex18 = complex2.add(complex11);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.sqrt();
        org.apache.commons.math.complex.Complex complex21 = complex19.sin();
        org.apache.commons.math.complex.Complex complex22 = complex19.tanh();
        org.apache.commons.math.complex.Complex complex23 = complex19.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex25 = complex24.cos();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex24.multiply(complex27);
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = complex30.add(complex32);
        org.apache.commons.math.complex.ComplexField complexField34 = complex30.getField();
        org.apache.commons.math.complex.Complex complex35 = complex30.exp();
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = complex35.asin();
        org.apache.commons.math.complex.Complex complex38 = complex28.subtract(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex18.divide(complex28);
        org.apache.commons.math.complex.Complex complex40 = complex18.cos();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = complex41.acos();
        double double44 = complex41.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex41.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        boolean boolean51 = complex50.isNaN();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex55 = complex53.add(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex54.asin();
        boolean boolean57 = complex41.equals((java.lang.Object) complex54);
        org.apache.commons.math.complex.Complex complex58 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex59 = complex41.sqrt();
        double double60 = complex59.abs();
        org.apache.commons.math.complex.Complex complex61 = complex59.negate();
        org.apache.commons.math.complex.Complex complex62 = complex61.sqrt();
        double double63 = complex61.getReal();
        org.apache.commons.math.complex.Complex complex64 = complex40.pow(complex61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex43", complex0.equals(complex43) ? complex0.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        org.apache.commons.math.complex.Complex complex4 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex4.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex4", complex0.equals(complex4) ? complex0.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex7 = complex6.asin();
        org.apache.commons.math.complex.Complex complex10 = complex6.createComplex((double) (-1.0f), 0.871274682446377d);
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField16 = complex12.getField();
        org.apache.commons.math.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math.complex.Complex complex19 = complex17.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math.complex.Complex complex21 = complex10.add(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex19", complex0.equals(complex19) ? complex0.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex13.negate();
        org.apache.commons.math.complex.Complex complex18 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex19 = complex18.acos();
        double double20 = complex19.getReal();
        org.apache.commons.math.complex.Complex complex21 = complex19.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.sqrt();
        org.apache.commons.math.complex.Complex complex24 = complex22.sin();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        boolean boolean26 = complex25.isInfinite();
        org.apache.commons.math.complex.Complex complex27 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex29.log();
        org.apache.commons.math.complex.Complex complex32 = complex31.asin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex34 = complex33.sqrt();
        org.apache.commons.math.complex.Complex complex35 = complex33.atan();
        java.lang.String str36 = complex33.toString();
        org.apache.commons.math.complex.Complex complex37 = complex33.sin();
        org.apache.commons.math.complex.Complex complex38 = complex32.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex25.add(complex37);
        org.apache.commons.math.complex.Complex complex40 = complex37.asin();
        org.apache.commons.math.complex.Complex complex41 = complex21.divide(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex40", complex22.equals(complex40) ? complex22.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex19 = complex16.atan();
        org.apache.commons.math.complex.Complex complex21 = complex16.multiply((double) (byte) 10);
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex23", complex21.equals(complex23) ? complex21.hashCode() == complex23.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex1.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        double double7 = complex4.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList9 = complex4.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex18 = complex16.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex17.asin();
        boolean boolean20 = complex4.equals((java.lang.Object) complex17);
        double double21 = complex17.getReal();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex22.divide(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex30 = complex28.add(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex29.asin();
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex17.subtract(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex17.exp();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = complex36.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex36.tan();
        org.apache.commons.math.complex.Complex complex41 = complex40.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex40.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex34.pow(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex3.add(complex44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex0.log();
        org.apache.commons.math.complex.Complex complex7 = complex0.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj14 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex12.asin();
        org.apache.commons.math.complex.Complex complex17 = complex0.subtract(complex16);
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sin();
        org.apache.commons.math.complex.Complex complex20 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.acos();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.exp();
        org.apache.commons.math.complex.Complex complex31 = complex30.exp();
        org.apache.commons.math.complex.Complex complex32 = complex30.asin();
        org.apache.commons.math.complex.Complex complex33 = complex32.cos();
        double double34 = complex33.getArgument();
        org.apache.commons.math.complex.Complex complex35 = complex33.conjugate();
        double double36 = complex33.getArgument();
        boolean boolean37 = complex20.equals((java.lang.Object) complex33);
        org.apache.commons.math.complex.Complex complex38 = complex33.cos();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex39.atan();
        java.lang.String str42 = complex39.toString();
        org.apache.commons.math.complex.Complex complex44 = complex39.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex45 = complex39.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = complex47.add(complex49);
        org.apache.commons.math.complex.ComplexField complexField51 = complex47.getField();
        org.apache.commons.math.complex.Complex complex52 = complex47.tan();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex54 = complex53.sin();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex56 = complex55.sin();
        org.apache.commons.math.complex.Complex complex57 = complex54.add(complex56);
        org.apache.commons.math.complex.Complex complex58 = complex54.tan();
        org.apache.commons.math.complex.Complex complex59 = complex47.divide(complex54);
        org.apache.commons.math.complex.Complex complex60 = complex54.cos();
        org.apache.commons.math.complex.Complex complex61 = complex54.tan();
        org.apache.commons.math.complex.Complex complex62 = complex61.log();
        boolean boolean63 = complex39.equals((java.lang.Object) complex61);
        org.apache.commons.math.complex.Complex complex64 = complex38.subtract(complex61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex39", complex2.equals(complex39) ? complex2.hashCode() == complex39.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex13.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex19.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex27 = complex25.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.asin();
        boolean boolean29 = complex13.equals((java.lang.Object) complex26);
        double double30 = complex26.getReal();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        boolean boolean35 = complex34.isNaN();
        org.apache.commons.math.complex.Complex complex36 = complex31.divide(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex36.atan();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex39 = complex37.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex38.asin();
        org.apache.commons.math.complex.Complex complex41 = complex40.atan();
        org.apache.commons.math.complex.Complex complex42 = complex26.subtract(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.sqrt1z();
        org.apache.commons.math.complex.Complex complex44 = complex7.subtract(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex7.asin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = complex47.add(complex49);
        org.apache.commons.math.complex.ComplexField complexField51 = complex47.getField();
        org.apache.commons.math.complex.Complex complex52 = complex47.tan();
        org.apache.commons.math.complex.Complex complex53 = complex47.exp();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex56 = complex54.sin();
        org.apache.commons.math.complex.Complex complex57 = complex54.sinh();
        org.apache.commons.math.complex.Complex complex58 = complex47.add(complex54);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.add(complex62);
        org.apache.commons.math.complex.ComplexField complexField64 = complex60.getField();
        org.apache.commons.math.complex.Complex complex65 = complex60.tan();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex67 = complex66.sin();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math.complex.Complex complex70 = complex67.add(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex67.tan();
        org.apache.commons.math.complex.Complex complex72 = complex60.divide(complex67);
        org.apache.commons.math.complex.Complex complex73 = complex72.sqrt();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex75 = complex73.pow(complex74);
        java.lang.String str76 = complex74.toString();
        org.apache.commons.math.complex.Complex complex77 = complex54.add(complex74);
        org.apache.commons.math.complex.Complex complex78 = complex74.tanh();
        org.apache.commons.math.complex.Complex complex79 = complex45.add(complex78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex54", complex15.equals(complex54) ? complex15.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        double double12 = complex9.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        boolean boolean25 = complex9.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex28 = complex9.log();
        boolean boolean29 = complex28.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex28", complex11.equals(complex28) ? complex11.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        double double7 = complex0.getReal();
        boolean boolean8 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply((double) '4');
        org.apache.commons.math.complex.Complex complex11 = complex0.asin();
        org.apache.commons.math.complex.Complex complex12 = complex0.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = complex1.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        java.lang.String str4 = complex2.toString();
        org.apache.commons.math.complex.Complex complex7 = complex2.createComplex((double) 100, 0.4830193999617323d);
        org.apache.commons.math.complex.Complex complex10 = complex2.createComplex((double) (-1L), 0.1377979873845826d);
        org.apache.commons.math.complex.Complex complex11 = complex2.cosh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex15.negate();
        org.apache.commons.math.complex.Complex complex17 = complex16.cosh();
        boolean boolean18 = complex11.equals((java.lang.Object) complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex17", complex0.equals(complex17) ? complex0.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        double double7 = complex0.getReal();
        boolean boolean8 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply((double) '4');
        org.apache.commons.math.complex.Complex complex11 = complex0.asin();
        java.lang.Class<?> wildcardClass12 = complex11.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        java.lang.Class<?> wildcardClass7 = complex6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = complex0.log();
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        double double12 = complex9.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        boolean boolean25 = complex9.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.log();
        org.apache.commons.math.complex.Complex complex34 = complex8.pow(complex29);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = complex36.add(complex38);
        org.apache.commons.math.complex.ComplexField complexField40 = complex36.getField();
        org.apache.commons.math.complex.Complex complex41 = complex36.tan();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = complex43.add(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex43.tan();
        org.apache.commons.math.complex.Complex complex48 = complex36.divide(complex43);
        org.apache.commons.math.complex.Complex complex49 = complex48.sqrt();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex51 = complex49.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = complex51.acos();
        org.apache.commons.math.complex.Complex complex53 = complex51.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex34.divide(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex53", complex0.equals(complex53) ? complex0.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.asin();
        org.apache.commons.math.complex.Complex complex12 = complex1.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.negate();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex9.acos();
        double double12 = complex9.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex9.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex23 = complex21.add(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.asin();
        boolean boolean25 = complex9.equals((java.lang.Object) complex22);
        org.apache.commons.math.complex.Complex complex26 = complex9.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex28 = complex9.log();
        double double29 = complex28.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex28", complex11.equals(complex28) ? complex11.hashCode() == complex28.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.ComplexField complexField10 = complex9.getField();
        org.apache.commons.math.complex.Complex complex11 = complex9.log();
        org.apache.commons.math.complex.Complex complex12 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex9.createComplex(3.33066907387547E-16d, (-0.7237368419565787d));
        org.apache.commons.math.complex.Complex complex16 = complex15.log();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex18.tan();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj26 = complex25.readResolve();
        double double27 = complex25.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex25.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex24.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex30.acos();
        double double33 = complex30.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList35 = complex30.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        boolean boolean40 = complex39.isNaN();
        org.apache.commons.math.complex.Complex complex41 = complex36.divide(complex39);
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex44 = complex42.add(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex43.asin();
        boolean boolean46 = complex30.equals((java.lang.Object) complex43);
        double double47 = complex43.getReal();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        boolean boolean52 = complex51.isNaN();
        org.apache.commons.math.complex.Complex complex53 = complex48.divide(complex51);
        org.apache.commons.math.complex.Complex complex54 = complex53.atan();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex56 = complex54.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex55.asin();
        org.apache.commons.math.complex.Complex complex58 = complex57.atan();
        org.apache.commons.math.complex.Complex complex59 = complex43.subtract(complex58);
        org.apache.commons.math.complex.Complex complex60 = complex58.sqrt1z();
        org.apache.commons.math.complex.Complex complex61 = complex24.subtract(complex60);
        org.apache.commons.math.complex.Complex complex62 = complex24.asin();
        org.apache.commons.math.complex.Complex complex63 = complex16.multiply(complex62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex32", complex5.equals(complex32) ? complex5.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex0.multiply((-1.0d));
        double double18 = complex0.getImaginary();
        boolean boolean19 = complex0.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex20", complex0.equals(complex20) ? complex0.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.asin();
        java.lang.Object obj7 = complex0.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        double double7 = complex0.getReal();
        boolean boolean8 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply((double) '4');
        java.lang.Object obj11 = complex10.readResolve();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.conjugate();
        org.apache.commons.math.complex.ComplexField complexField14 = complex10.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        boolean boolean16 = complex15.isInfinite();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex15", complex11.equals(complex15) ? complex11.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        boolean boolean20 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex21.asin();
        org.apache.commons.math.complex.Complex complex26 = complex21.sin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        java.lang.String str19 = complex18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math.complex.Complex complex15 = complex8.asin();
        org.apache.commons.math.complex.Complex complex16 = complex8.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        double double11 = complex10.abs();
        org.apache.commons.math.complex.Complex complex12 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex13 = complex10.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex12", complex5.equals(complex12) ? complex5.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex15.tan();
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        double double21 = complex20.abs();
        java.lang.Object obj22 = null;
        boolean boolean23 = complex20.equals(obj22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.tan();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex32.tan();
        org.apache.commons.math.complex.Complex complex37 = complex25.divide(complex32);
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex38.pow(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex20.subtract(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex8.pow(complex42);
        org.apache.commons.math.complex.Complex complex45 = complex42.conjugate();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex48 = complex46.atan();
        java.lang.String str49 = complex46.toString();
        org.apache.commons.math.complex.Complex complex51 = complex46.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex52 = complex51.tanh();
        boolean boolean53 = complex42.equals((java.lang.Object) complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex46", complex41.equals(complex46) ? complex41.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex5 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        boolean boolean20 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex26 = complex25.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        java.lang.Object obj5 = complex3.readResolve();
        java.lang.String str6 = complex3.toString();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex3.nthRoot((int) (byte) 1);
        org.apache.commons.math.complex.Complex complex9 = complex3.conjugate();
        double double10 = complex3.getArgument();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex9", complex1.equals(complex9) ? complex1.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex17.tan();
        org.apache.commons.math.complex.ComplexField complexField19 = complex17.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex18", complex17.equals(complex18) ? complex17.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        double double17 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex26 = complex24.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex25.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex13.subtract(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex13.exp();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.ComplexField complexField36 = complex32.getField();
        org.apache.commons.math.complex.Complex complex37 = complex32.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.asin();
        double double39 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex40 = complex38.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex41.cos();
        org.apache.commons.math.complex.Complex complex43 = complex30.pow(complex42);
        java.util.List<org.apache.commons.math.complex.Complex> complexList45 = complex30.nthRoot((int) (byte) 1);
        org.apache.commons.math.complex.Complex complex47 = complex30.multiply((-1.0612750619050357d));
        org.apache.commons.math.complex.Complex complex48 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex52 = complex51.sin();
        org.apache.commons.math.complex.Complex complex53 = complex50.add(complex52);
        double double54 = complex50.getArgument();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex56 = complex50.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex50.sqrt();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex61 = complex60.sin();
        org.apache.commons.math.complex.Complex complex62 = complex59.add(complex61);
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex64 = complex63.sqrt();
        org.apache.commons.math.complex.Complex complex65 = complex63.sinh();
        double double66 = complex63.getImaginary();
        org.apache.commons.math.complex.Complex complex67 = complex62.pow(complex63);
        org.apache.commons.math.complex.Complex complex68 = complex62.exp();
        double double69 = complex62.abs();
        org.apache.commons.math.complex.Complex complex70 = complex57.add(complex62);
        org.apache.commons.math.complex.Complex complex71 = complex47.add(complex70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex63", complex2.equals(complex63) ? complex2.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.atan();
        java.lang.String str8 = complex5.toString();
        org.apache.commons.math.complex.Complex complex10 = complex5.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex11 = complex5.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        java.util.List<org.apache.commons.math.complex.Complex> complexList14 = complex12.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.ComplexField complexField20 = complex16.getField();
        org.apache.commons.math.complex.Complex complex21 = complex16.tan();
        org.apache.commons.math.complex.Complex complex22 = complex16.exp();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex23.sin();
        org.apache.commons.math.complex.Complex complex26 = complex23.sinh();
        org.apache.commons.math.complex.Complex complex27 = complex16.add(complex23);
        org.apache.commons.math.complex.ComplexField complexField28 = complex27.getField();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList33 = complex31.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex34 = complex27.pow(complex31);
        org.apache.commons.math.complex.Complex complex35 = complex31.sinh();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex37.add(complex39);
        org.apache.commons.math.complex.ComplexField complexField41 = complex37.getField();
        org.apache.commons.math.complex.Complex complex42 = complex37.tan();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = complex43.sin();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.sin();
        org.apache.commons.math.complex.Complex complex47 = complex44.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex44.tan();
        org.apache.commons.math.complex.Complex complex49 = complex37.divide(complex44);
        org.apache.commons.math.complex.Complex complex50 = complex44.cos();
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex54 = complex51.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex55 = complex51.sqrt1z();
        org.apache.commons.math.complex.Complex complex58 = complex55.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex59 = complex58.atan();
        java.lang.Object obj60 = complex58.readResolve();
        org.apache.commons.math.complex.Complex complex61 = complex35.subtract(complex58);
        org.apache.commons.math.complex.Complex complex62 = complex35.tanh();
        org.apache.commons.math.complex.Complex complex63 = complex35.log();
        org.apache.commons.math.complex.Complex complex64 = complex12.divide(complex35);
        boolean boolean65 = complex4.equals((java.lang.Object) complex12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex5", complex2.equals(complex5) ? complex2.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex21.add(complex24);
        java.lang.Object obj26 = complex25.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        boolean boolean19 = complex16.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        double double12 = complex11.abs();
        double double13 = complex11.getArgument();
        boolean boolean14 = complex11.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        boolean boolean19 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex20 = complex15.divide(complex18);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj23 = complex22.readResolve();
        org.apache.commons.math.complex.Complex complex24 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex21.asin();
        org.apache.commons.math.complex.Complex complex26 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        boolean boolean31 = complex30.isNaN();
        org.apache.commons.math.complex.Complex complex32 = complex27.divide(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex32.atan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj35 = complex34.readResolve();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        double double37 = complex33.getImaginary();
        org.apache.commons.math.complex.Complex complex38 = complex21.multiply(complex33);
        org.apache.commons.math.complex.Complex complex39 = complex33.sqrt1z();
        org.apache.commons.math.complex.Complex complex40 = complex11.subtract(complex33);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = complex41.acos();
        double double44 = complex41.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList46 = complex41.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex50 = complex49.sin();
        boolean boolean51 = complex50.isNaN();
        org.apache.commons.math.complex.Complex complex52 = complex47.divide(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex52.atan();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex55 = complex53.add(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex54.asin();
        boolean boolean57 = complex41.equals((java.lang.Object) complex54);
        double double58 = complex54.getReal();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        boolean boolean63 = complex62.isNaN();
        org.apache.commons.math.complex.Complex complex64 = complex59.divide(complex62);
        org.apache.commons.math.complex.Complex complex65 = complex64.atan();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex67 = complex65.add(complex66);
        org.apache.commons.math.complex.Complex complex68 = complex66.asin();
        org.apache.commons.math.complex.Complex complex69 = complex68.atan();
        org.apache.commons.math.complex.Complex complex70 = complex54.subtract(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex70.sqrt();
        org.apache.commons.math.complex.Complex complex72 = complex71.sinh();
        org.apache.commons.math.complex.Complex complex73 = complex11.multiply(complex71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex43", complex5.equals(complex43) ? complex5.hashCode() == complex43.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math.complex.Complex complex15 = complex8.asin();
        org.apache.commons.math.complex.Complex complex16 = complex8.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex3.createComplex(0.9045568943023813d, 1.4305152963847985d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex21.createComplex(1.305979828850128d, 2.3899553468592085d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math.complex.Complex complex29 = complex26.asin();
        org.apache.commons.math.complex.Complex complex30 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex36 = complex32.createComplex((double) 10, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.apache.commons.math.complex.Complex complex38 = complex21.multiply(complex37);
        boolean boolean39 = complex38.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex38", complex8.equals(complex38) ? complex8.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.conjugate();
        double double19 = complex18.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex1.exp();
        org.apache.commons.math.complex.Complex complex3 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex6 = complex1.createComplex((double) (-1.0f), 0.8414709848078965d);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.ComplexField complexField12 = complex8.getField();
        org.apache.commons.math.complex.Complex complex13 = complex8.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex15.tan();
        org.apache.commons.math.complex.Complex complex20 = complex8.divide(complex15);
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex23 = complex21.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = complex24.acos();
        double double27 = complex24.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex24.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        boolean boolean34 = complex33.isNaN();
        org.apache.commons.math.complex.Complex complex35 = complex30.divide(complex33);
        org.apache.commons.math.complex.Complex complex36 = complex35.atan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex38 = complex36.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex37.asin();
        boolean boolean40 = complex24.equals((java.lang.Object) complex37);
        org.apache.commons.math.complex.Complex complex41 = complex24.sinh();
        org.apache.commons.math.complex.Complex complex42 = complex24.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex24.sin();
        org.apache.commons.math.complex.Complex complex44 = complex23.divide(complex43);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.sin();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = complex46.add(complex48);
        org.apache.commons.math.complex.ComplexField complexField50 = complex46.getField();
        org.apache.commons.math.complex.Complex complex51 = complex46.tan();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex53.tan();
        org.apache.commons.math.complex.Complex complex58 = complex46.divide(complex53);
        org.apache.commons.math.complex.Complex complex59 = complex58.sqrt();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex61 = complex59.pow(complex60);
        org.apache.commons.math.complex.Complex complex62 = complex61.acos();
        org.apache.commons.math.complex.Complex complex63 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex64 = complex61.atan();
        org.apache.commons.math.complex.Complex complex65 = complex61.sinh();
        org.apache.commons.math.complex.Complex complex66 = complex65.tan();
        org.apache.commons.math.complex.Complex complex67 = complex23.multiply(complex65);
        org.apache.commons.math.complex.Complex complex68 = complex65.atan();
        boolean boolean69 = complex1.equals((java.lang.Object) complex65);
        org.apache.commons.math.complex.Complex complex70 = complex1.asin();
        org.apache.commons.math.complex.Complex complex71 = complex70.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex70", complex0.equals(complex70) ? complex0.hashCode() == complex70.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.ComplexField complexField26 = complex22.getField();
        org.apache.commons.math.complex.Complex complex27 = complex22.tan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex29.cos();
        org.apache.commons.math.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        java.lang.Object obj45 = complex43.readResolve();
        org.apache.commons.math.complex.Complex complex46 = complex20.subtract(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex49 = complex48.acos();
        org.apache.commons.math.complex.Complex complex50 = complex49.acos();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex49", complex8.equals(complex49) ? complex8.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.negate();
        org.apache.commons.math.complex.Complex complex21 = complex20.sinh();
        org.apache.commons.math.complex.Complex complex22 = complex21.negate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex21", complex8.equals(complex21) ? complex8.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex15", complex11.equals(complex15) ? complex11.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        boolean boolean8 = complex7.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex4.divide(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.atan();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj12 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex11.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex16 = complex11.sinh();
        java.lang.Object obj17 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex18 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex3.divide(complex18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex4", complex3.equals(complex4) ? complex3.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        double double7 = complex0.getReal();
        boolean boolean8 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply((double) '4');
        java.lang.Object obj11 = complex10.readResolve();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex10.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        double double6 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        double double15 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex20.createComplex((double) (byte) 10, 0.0d);
        double double26 = complex20.abs();
        org.apache.commons.math.complex.Complex complex27 = complex16.divide(complex20);
        org.apache.commons.math.complex.Complex complex28 = complex1.divide(complex20);
        boolean boolean29 = complex20.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex20.cos();
        java.lang.Object obj31 = complex20.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex30", complex0.equals(complex30) ? complex0.hashCode() == complex30.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex3.isInfinite();
        double double5 = complex3.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex3.exp();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex5.getReal();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex8.acos();
        double double11 = complex8.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList13 = complex8.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex22 = complex20.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.asin();
        boolean boolean24 = complex8.equals((java.lang.Object) complex21);
        org.apache.commons.math.complex.Complex complex25 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex5.multiply(complex26);
        java.util.List<org.apache.commons.math.complex.Complex> complexList30 = complex28.nthRoot(100);
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex34 = complex32.atan();
        java.lang.String str35 = complex32.toString();
        org.apache.commons.math.complex.Complex complex37 = complex32.multiply((double) 10);
        boolean boolean38 = complex32.isInfinite();
        java.lang.String str39 = complex32.toString();
        org.apache.commons.math.complex.Complex complex40 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex41 = complex28.subtract(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex32", complex10.equals(complex32) ? complex10.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = complex12.atan();
        org.apache.commons.math.complex.Complex complex15 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex16 and complex17", complex16.equals(complex17) ? complex16.hashCode() == complex17.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = complex0.asin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex9 = complex8.acos();
        org.apache.commons.math.complex.Complex complex10 = complex8.asin();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex20 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex13.divide(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = complex24.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex24.tan();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex28.log();
        org.apache.commons.math.complex.Complex complex31 = complex30.exp();
        org.apache.commons.math.complex.Complex complex32 = complex22.multiply(complex30);
        org.apache.commons.math.complex.Complex complex34 = complex30.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex35 = complex11.subtract(complex30);
        org.apache.commons.math.complex.Complex complex36 = complex30.log();
        org.apache.commons.math.complex.Complex complex37 = complex6.divide(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cos();
        org.apache.commons.math.complex.Complex complex2 = complex1.log();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex2", complex0.equals(complex2) ? complex0.hashCode() == complex2.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex5 = complex4.cos();
        org.apache.commons.math.complex.Complex complex6 = complex5.negate();
        org.apache.commons.math.complex.Complex complex7 = complex6.acos();
        org.apache.commons.math.complex.ComplexField complexField8 = complex6.getField();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.sinh();
        double double17 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex18 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex19 = complex13.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        boolean boolean26 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex22.divide(complex25);
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj30 = complex29.readResolve();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex33 = complex29.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex34 = complex19.pow(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex6.divide(complex19);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex36.acos();
        double double39 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex40 = complex36.sinh();
        org.apache.commons.math.complex.Complex complex41 = complex40.asin();
        org.apache.commons.math.complex.ComplexField complexField42 = complex41.getField();
        boolean boolean43 = complex6.equals((java.lang.Object) complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex38", complex14.equals(complex38) ? complex14.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.ComplexField complexField26 = complex22.getField();
        org.apache.commons.math.complex.Complex complex27 = complex22.tan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex29.cos();
        org.apache.commons.math.complex.Complex complex36 = complex35.sinh();
        org.apache.commons.math.complex.Complex complex39 = complex36.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex40.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        java.lang.Object obj45 = complex43.readResolve();
        org.apache.commons.math.complex.Complex complex46 = complex20.subtract(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex48 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex49 = complex48.acos();
        double double50 = complex49.getReal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex49", complex8.equals(complex49) ? complex8.hashCode() == complex49.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.getArgument();
        org.apache.commons.math.complex.Complex complex4 = complex0.sqrt1z();
        java.lang.Object obj5 = null;
        boolean boolean6 = complex4.equals(obj5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex4", complex2.equals(complex4) ? complex2.hashCode() == complex4.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex5 = complex0.multiply((double) 10);
        org.apache.commons.math.complex.Complex complex6 = complex0.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex0.tan();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex7", complex0.equals(complex7) ? complex0.hashCode() == complex7.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sinh();
        double double3 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex6 = complex0.createComplex((double) (byte) 100, (double) 1L);
        double double7 = complex0.getReal();
        boolean boolean8 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply((double) '4');
        java.lang.Object obj11 = complex10.readResolve();
        double double12 = complex10.getImaginary();
        org.apache.commons.math.complex.Complex complex13 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        boolean boolean18 = complex17.isNaN();
        org.apache.commons.math.complex.Complex complex19 = complex14.divide(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj22 = complex21.readResolve();
        org.apache.commons.math.complex.Complex complex23 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex20.asin();
        org.apache.commons.math.complex.Complex complex25 = complex20.tanh();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        boolean boolean30 = complex29.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex26.divide(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj34 = complex33.readResolve();
        org.apache.commons.math.complex.Complex complex35 = complex32.pow(complex33);
        double double36 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex37 = complex20.multiply(complex32);
        org.apache.commons.math.complex.Complex complex38 = complex32.sqrt1z();
        java.util.List<org.apache.commons.math.complex.Complex> complexList40 = complex38.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex44 = complex43.sin();
        org.apache.commons.math.complex.Complex complex45 = complex42.add(complex44);
        org.apache.commons.math.complex.Complex complex46 = complex42.tan();
        org.apache.commons.math.complex.Complex complex47 = complex46.acos();
        org.apache.commons.math.complex.Complex complex48 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex49 = complex46.atan();
        org.apache.commons.math.complex.Complex complex50 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex51 = complex50.cosh();
        org.apache.commons.math.complex.Complex complex52 = complex38.multiply(complex50);
        org.apache.commons.math.complex.Complex complex53 = complex50.negate();
        org.apache.commons.math.complex.Complex complex54 = complex13.multiply(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex13", complex0.equals(complex13) ? complex0.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex3.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.tanh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.ComplexField complexField13 = complex9.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.tan();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex18 = complex9.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex6.add(complex9);
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex22 = complex19.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex24 = complex23.sqrt();
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        boolean boolean26 = complex24.isNaN();
        org.apache.commons.math.complex.Complex complex27 = complex24.sin();
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = complex21.pow(complex27);
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex34 = complex31.multiply(0.5825848535059511d);
        org.apache.commons.math.complex.Complex complex35 = complex3.divide(complex34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.acos();
        org.apache.commons.math.complex.Complex complex6 = complex5.cos();
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex7.log();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex10.add(complex12);
        org.apache.commons.math.complex.Complex complex14 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) (byte) 100, 0.9635907245418334d);
        boolean boolean18 = complex12.equals((java.lang.Object) (byte) 100);
        org.apache.commons.math.complex.Complex complex19 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex7.divide(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex10 and complex19", complex10.equals(complex19) ? complex10.hashCode() == complex19.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex6.sin();
        org.apache.commons.math.complex.Complex complex9 = complex6.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex9", complex0.equals(complex9) ? complex0.hashCode() == complex9.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex2.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex4 and complex5", complex4.equals(complex5) ? complex4.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.cos();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        boolean boolean16 = complex14.equals((java.lang.Object) complex15);
        org.apache.commons.math.complex.Complex complex17 = complex14.tan();
        double double18 = complex14.getImaginary();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        double double21 = complex19.abs();
        org.apache.commons.math.complex.Complex complex22 = complex19.log();
        org.apache.commons.math.complex.Complex complex23 = complex22.exp();
        org.apache.commons.math.complex.Complex complex24 = complex14.pow(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex24.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex24", complex0.equals(complex24) ? complex0.hashCode() == complex24.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex0.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex8 = complex0.asin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex12 = complex11.sin();
        org.apache.commons.math.complex.Complex complex13 = complex10.add(complex12);
        org.apache.commons.math.complex.ComplexField complexField14 = complex10.getField();
        org.apache.commons.math.complex.Complex complex17 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex18 = complex17.atan();
        org.apache.commons.math.complex.Complex complex19 = complex10.divide(complex18);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.sin();
        org.apache.commons.math.complex.Complex complex24 = complex21.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex21.tan();
        org.apache.commons.math.complex.Complex complex26 = complex25.exp();
        org.apache.commons.math.complex.Complex complex27 = complex25.log();
        org.apache.commons.math.complex.Complex complex28 = complex27.exp();
        org.apache.commons.math.complex.Complex complex29 = complex19.multiply(complex27);
        org.apache.commons.math.complex.Complex complex31 = complex27.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex32 = complex31.acos();
        org.apache.commons.math.complex.Complex complex33 = complex0.pow(complex32);
        org.apache.commons.math.complex.Complex complex35 = complex0.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex37 = complex35.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = complex39.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.sqrt();
        org.apache.commons.math.complex.Complex complex45 = complex43.sinh();
        double double46 = complex43.getImaginary();
        org.apache.commons.math.complex.Complex complex47 = complex42.pow(complex43);
        org.apache.commons.math.complex.Complex complex48 = complex42.exp();
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.tanh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.ComplexField complexField57 = complex53.getField();
        org.apache.commons.math.complex.Complex complex58 = complex53.tan();
        org.apache.commons.math.complex.Complex complex61 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex62 = complex53.add(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex50.add(complex53);
        org.apache.commons.math.complex.Complex complex64 = complex48.add(complex63);
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt();
        org.apache.commons.math.complex.Complex complex66 = complex64.tanh();
        org.apache.commons.math.complex.Complex complex67 = complex37.pow(complex66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex37", complex2.equals(complex37) ? complex2.hashCode() == complex37.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = complex12.add(complex15);
        org.apache.commons.math.complex.Complex complex26 = complex10.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex10.exp();
        java.util.List<org.apache.commons.math.complex.Complex> complexList29 = complex27.nthRoot(1);
        org.apache.commons.math.complex.Complex complex30 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.ComplexField complexField36 = complex32.getField();
        org.apache.commons.math.complex.Complex complex37 = complex32.tan();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = complex39.add(complex41);
        org.apache.commons.math.complex.Complex complex43 = complex39.tan();
        org.apache.commons.math.complex.Complex complex44 = complex32.divide(complex39);
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex47 = complex45.pow(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex47.acos();
        org.apache.commons.math.complex.Complex complex49 = complex47.tanh();
        org.apache.commons.math.complex.Complex complex50 = complex47.atan();
        org.apache.commons.math.complex.Complex complex51 = complex50.tan();
        org.apache.commons.math.complex.Complex complex52 = complex27.pow(complex50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex48", complex5.equals(complex48) ? complex5.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        double double1 = complex0.getImaginary();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        org.apache.commons.math.complex.Complex complex3 = complex2.asin();
        double double4 = complex2.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        boolean boolean20 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex27.tan();
        org.apache.commons.math.complex.Complex complex30 = complex27.asin();
        org.apache.commons.math.complex.Complex complex31 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex34 = complex27.createComplex((double) 100, 1.4816627996986553d);
        boolean boolean35 = complex34.isInfinite();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex36.tan();
        org.apache.commons.math.complex.Complex complex39 = complex36.asin();
        org.apache.commons.math.complex.Complex complex40 = complex36.tanh();
        double double41 = complex36.getArgument();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj43 = complex42.readResolve();
        double double44 = complex42.getImaginary();
        org.apache.commons.math.complex.Complex complex45 = complex42.tanh();
        org.apache.commons.math.complex.Complex complex46 = complex42.acos();
        org.apache.commons.math.complex.Complex complex47 = complex46.negate();
        org.apache.commons.math.complex.Complex complex48 = complex36.subtract(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex34.divide(complex36);
        org.apache.commons.math.complex.Complex complex50 = complex25.pow(complex49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex46", complex17.equals(complex46) ? complex17.hashCode() == complex46.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = complex11.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex11.tan();
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex18.tan();
        org.apache.commons.math.complex.Complex complex23 = complex16.divide(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex22.multiply(1.1883951057781212d);
        org.apache.commons.math.complex.Complex complex27 = complex26.atan();
        org.apache.commons.math.complex.Complex complex28 = complex7.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        org.apache.commons.math.complex.Complex complex30 = complex29.tan();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex31.sin();
        org.apache.commons.math.complex.Complex complex34 = complex31.cos();
        org.apache.commons.math.complex.Complex complex35 = complex34.sinh();
        double double36 = complex34.getImaginary();
        org.apache.commons.math.complex.Complex complex37 = complex34.asin();
        org.apache.commons.math.complex.Complex complex38 = complex29.subtract(complex37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex34", complex0.equals(complex34) ? complex0.hashCode() == complex34.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = complex16.exp();
        org.apache.commons.math.complex.Complex complex18 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex19.acos();
        double double22 = complex19.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex19.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex33 = complex31.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex32.asin();
        boolean boolean35 = complex19.equals((java.lang.Object) complex32);
        org.apache.commons.math.complex.Complex complex36 = complex19.sinh();
        org.apache.commons.math.complex.Complex complex37 = complex19.sqrt();
        double double38 = complex37.abs();
        org.apache.commons.math.complex.Complex complex39 = complex37.negate();
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        org.apache.commons.math.complex.Complex complex41 = complex18.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex13.add(complex40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex21", complex5.equals(complex21) ? complex5.hashCode() == complex21.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.ComplexField complexField13 = complex12.getField();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList18 = complex16.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex19 = complex12.pow(complex16);
        org.apache.commons.math.complex.Complex complex20 = complex16.sinh();
        org.apache.commons.math.complex.Complex complex21 = complex20.tanh();
        double double22 = complex21.getReal();
        org.apache.commons.math.complex.Complex complex25 = complex21.createComplex(1.305979828850128d, 2.3899553468592085d);
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex26.tan();
        org.apache.commons.math.complex.Complex complex29 = complex26.asin();
        org.apache.commons.math.complex.Complex complex30 = complex26.tanh();
        org.apache.commons.math.complex.Complex complex31 = complex30.cos();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex36 = complex32.createComplex((double) 10, (double) 1.0f);
        org.apache.commons.math.complex.Complex complex37 = complex36.cos();
        org.apache.commons.math.complex.Complex complex38 = complex21.multiply(complex37);
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = complex40.add(complex42);
        org.apache.commons.math.complex.ComplexField complexField44 = complex40.getField();
        org.apache.commons.math.complex.Complex complex45 = complex40.tan();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = complex47.add(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex47.tan();
        org.apache.commons.math.complex.Complex complex52 = complex40.divide(complex47);
        org.apache.commons.math.complex.Complex complex55 = complex52.createComplex((double) (-1), (double) (byte) 0);
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex57 = complex56.sin();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        org.apache.commons.math.complex.Complex complex60 = complex57.add(complex59);
        org.apache.commons.math.complex.ComplexField complexField61 = complex57.getField();
        org.apache.commons.math.complex.Complex complex62 = complex57.tan();
        org.apache.commons.math.complex.Complex complex63 = complex57.exp();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex65 = complex64.sqrt();
        org.apache.commons.math.complex.Complex complex66 = complex64.sin();
        org.apache.commons.math.complex.Complex complex67 = complex64.sinh();
        org.apache.commons.math.complex.Complex complex68 = complex57.add(complex64);
        org.apache.commons.math.complex.Complex complex69 = complex68.sinh();
        org.apache.commons.math.complex.Complex complex71 = complex68.multiply(10.0d);
        org.apache.commons.math.complex.ComplexField complexField72 = complex68.getField();
        org.apache.commons.math.complex.Complex complex73 = complex55.subtract(complex68);
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex75 = complex74.sin();
        org.apache.commons.math.complex.Complex complex76 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex77 = complex76.sin();
        org.apache.commons.math.complex.Complex complex78 = complex75.add(complex77);
        org.apache.commons.math.complex.ComplexField complexField79 = complex75.getField();
        org.apache.commons.math.complex.Complex complex80 = complex75.tan();
        org.apache.commons.math.complex.Complex complex81 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex82 = complex81.sin();
        org.apache.commons.math.complex.Complex complex83 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex84 = complex83.sin();
        org.apache.commons.math.complex.Complex complex85 = complex82.add(complex84);
        org.apache.commons.math.complex.Complex complex86 = complex82.tan();
        org.apache.commons.math.complex.Complex complex87 = complex75.divide(complex82);
        org.apache.commons.math.complex.Complex complex88 = complex87.asin();
        java.lang.Object obj89 = complex87.readResolve();
        java.lang.Object obj90 = complex87.readResolve();
        org.apache.commons.math.complex.Complex complex91 = complex68.add(complex87);
        org.apache.commons.math.complex.Complex complex92 = complex21.add(complex91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex8 and complex38", complex8.equals(complex38) ? complex8.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex1.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex5", complex1.equals(complex5) ? complex1.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        double double3 = complex2.abs();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = complex5.add(complex7);
        org.apache.commons.math.complex.ComplexField complexField9 = complex5.getField();
        org.apache.commons.math.complex.Complex complex10 = complex5.tan();
        org.apache.commons.math.complex.Complex complex11 = complex5.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sin();
        org.apache.commons.math.complex.Complex complex15 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex16 = complex5.add(complex12);
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex23 = complex16.pow(complex20);
        org.apache.commons.math.complex.Complex complex24 = complex20.negate();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex26.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex41 = complex37.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex42 = complex41.atan();
        double double43 = complex41.getArgument();
        org.apache.commons.math.complex.Complex complex44 = complex31.add(complex41);
        org.apache.commons.math.complex.Complex complex45 = complex20.add(complex31);
        org.apache.commons.math.complex.Complex complex48 = new org.apache.commons.math.complex.Complex(100.0d, (double) (-1));
        org.apache.commons.math.complex.Complex complex49 = complex45.pow(complex48);
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = complex51.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = complex51.tan();
        org.apache.commons.math.complex.Complex complex56 = complex55.acos();
        org.apache.commons.math.complex.Complex complex57 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex58 = complex55.atan();
        org.apache.commons.math.complex.Complex complex59 = complex49.multiply(complex55);
        org.apache.commons.math.complex.Complex complex60 = complex2.multiply(complex49);
        org.apache.commons.math.complex.Complex complex61 = complex2.sin();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex63 = complex62.sin();
        org.apache.commons.math.complex.Complex complex64 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex65 = complex64.sin();
        boolean boolean66 = complex65.isNaN();
        org.apache.commons.math.complex.Complex complex67 = complex62.divide(complex65);
        org.apache.commons.math.complex.Complex complex68 = complex67.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList70 = complex68.nthRoot((int) (short) 10);
        double double71 = complex68.getImaginary();
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex73 = complex72.sin();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex75 = complex74.sin();
        boolean boolean76 = complex75.isNaN();
        org.apache.commons.math.complex.Complex complex77 = complex72.divide(complex75);
        org.apache.commons.math.complex.Complex complex78 = complex77.atan();
        org.apache.commons.math.complex.Complex complex79 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj80 = complex79.readResolve();
        org.apache.commons.math.complex.Complex complex81 = complex78.pow(complex79);
        org.apache.commons.math.complex.Complex complex82 = complex68.divide(complex79);
        org.apache.commons.math.complex.Complex complex83 = complex2.subtract(complex79);
        org.apache.commons.math.complex.Complex complex84 = complex83.asin();
        org.apache.commons.math.complex.Complex complex85 = complex84.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex84", complex0.equals(complex84) ? complex0.hashCode() == complex84.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex15.exp();
        org.apache.commons.math.complex.Complex complex17 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex20 = complex15.createComplex((double) (-1.0f), 0.8414709848078965d);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex22.add(complex24);
        org.apache.commons.math.complex.ComplexField complexField26 = complex22.getField();
        org.apache.commons.math.complex.Complex complex27 = complex22.tan();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex22.divide(complex29);
        org.apache.commons.math.complex.Complex complex35 = complex34.sqrt();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex37 = complex35.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = complex38.acos();
        double double41 = complex38.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList43 = complex38.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        boolean boolean48 = complex47.isNaN();
        org.apache.commons.math.complex.Complex complex49 = complex44.divide(complex47);
        org.apache.commons.math.complex.Complex complex50 = complex49.atan();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex52 = complex50.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex51.asin();
        boolean boolean54 = complex38.equals((java.lang.Object) complex51);
        org.apache.commons.math.complex.Complex complex55 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex56 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex57 = complex38.sin();
        org.apache.commons.math.complex.Complex complex58 = complex37.divide(complex57);
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex60 = complex59.sin();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.add(complex62);
        org.apache.commons.math.complex.ComplexField complexField64 = complex60.getField();
        org.apache.commons.math.complex.Complex complex65 = complex60.tan();
        org.apache.commons.math.complex.Complex complex66 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex67 = complex66.sin();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex69 = complex68.sin();
        org.apache.commons.math.complex.Complex complex70 = complex67.add(complex69);
        org.apache.commons.math.complex.Complex complex71 = complex67.tan();
        org.apache.commons.math.complex.Complex complex72 = complex60.divide(complex67);
        org.apache.commons.math.complex.Complex complex73 = complex72.sqrt();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex75 = complex73.pow(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex75.acos();
        org.apache.commons.math.complex.Complex complex77 = complex75.tanh();
        org.apache.commons.math.complex.Complex complex78 = complex75.atan();
        org.apache.commons.math.complex.Complex complex79 = complex75.sinh();
        org.apache.commons.math.complex.Complex complex80 = complex79.tan();
        org.apache.commons.math.complex.Complex complex81 = complex37.multiply(complex79);
        org.apache.commons.math.complex.Complex complex82 = complex79.atan();
        boolean boolean83 = complex15.equals((java.lang.Object) complex79);
        org.apache.commons.math.complex.Complex complex84 = complex15.asin();
        org.apache.commons.math.complex.Complex complex85 = complex13.divide(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex84", complex0.equals(complex84) ? complex0.hashCode() == complex84.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        boolean boolean20 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex21.sin();
        org.apache.commons.math.complex.Complex complex25 = complex24.asin();
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex25", complex17.equals(complex25) ? complex17.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj9 = complex8.readResolve();
        double double10 = complex8.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.atan();
        org.apache.commons.math.complex.Complex complex15 = complex13.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        boolean boolean17 = complex16.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex16.cos();
        org.apache.commons.math.complex.Complex complex19 = complex16.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex18", complex0.equals(complex18) ? complex0.hashCode() == complex18.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        double double5 = complex1.getArgument();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex7 = complex1.add(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex7.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.acos();
        double double13 = complex10.abs();
        boolean boolean14 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex15 = complex10.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        boolean boolean20 = complex19.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex16.divide(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj24 = complex23.readResolve();
        org.apache.commons.math.complex.Complex complex25 = complex22.pow(complex23);
        org.apache.commons.math.complex.Complex complex26 = complex22.asin();
        org.apache.commons.math.complex.Complex complex27 = complex10.subtract(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex26.cos();
        double double29 = complex26.getReal();
        boolean boolean30 = complex9.equals((java.lang.Object) complex26);
        org.apache.commons.math.complex.Complex complex31 = complex9.log();
        org.apache.commons.math.complex.Complex complex33 = complex9.multiply(100.0d);
        double double34 = complex33.getReal();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = complex36.add(complex38);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.sqrt();
        org.apache.commons.math.complex.Complex complex42 = complex40.sinh();
        double double43 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex45 = complex44.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.sqrt();
        org.apache.commons.math.complex.Complex complex48 = complex46.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList50 = complex48.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex53 = complex48.createComplex((double) (byte) 10, 0.0d);
        double double54 = complex48.abs();
        org.apache.commons.math.complex.Complex complex55 = complex44.divide(complex48);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply(1.305979828850128d);
        org.apache.commons.math.complex.Complex complex58 = complex55.atan();
        org.apache.commons.math.complex.Complex complex59 = complex55.log();
        org.apache.commons.math.complex.Complex complex60 = complex55.sqrt1z();
        org.apache.commons.math.complex.Complex complex61 = complex33.subtract(complex60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex40", complex12.equals(complex40) ? complex12.hashCode() == complex40.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt1z();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex20", complex2.equals(complex20) ? complex2.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        boolean boolean20 = complex18.isNaN();
        org.apache.commons.math.complex.Complex complex21 = complex18.sin();
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = complex23.conjugate();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = complex27.add(complex29);
        org.apache.commons.math.complex.ComplexField complexField31 = complex27.getField();
        org.apache.commons.math.complex.Complex complex32 = complex27.tan();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex34.add(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex34.tan();
        org.apache.commons.math.complex.Complex complex39 = complex27.divide(complex34);
        org.apache.commons.math.complex.Complex complex40 = complex34.cos();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.I;
        boolean boolean42 = complex40.equals((java.lang.Object) complex41);
        org.apache.commons.math.complex.Complex complex43 = complex41.sinh();
        org.apache.commons.math.complex.Complex complex44 = complex43.sin();
        org.apache.commons.math.complex.Complex complex45 = complex25.subtract(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex25.negate();
        org.apache.commons.math.complex.Complex complex47 = complex46.atan();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex49 = complex48.sqrt();
        org.apache.commons.math.complex.Complex complex50 = complex48.atan();
        java.lang.String str51 = complex48.toString();
        org.apache.commons.math.complex.Complex complex52 = complex48.tanh();
        org.apache.commons.math.complex.Complex complex53 = complex48.negate();
        org.apache.commons.math.complex.Complex complex54 = complex53.asin();
        org.apache.commons.math.complex.Complex complex55 = complex47.multiply(complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex54", complex17.equals(complex54) ? complex17.hashCode() == complex54.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        double double17 = complex13.getReal();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex21 = complex20.sin();
        boolean boolean22 = complex21.isNaN();
        org.apache.commons.math.complex.Complex complex23 = complex18.divide(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex26 = complex24.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex25.asin();
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex13.subtract(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex29.sqrt();
        org.apache.commons.math.complex.Complex complex31 = complex30.acos();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.sqrt();
        org.apache.commons.math.complex.Complex complex34 = complex32.sinh();
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.ComplexField complexField36 = complex32.getField();
        org.apache.commons.math.complex.Complex complex37 = complex30.subtract(complex32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex32", complex2.equals(complex32) ? complex2.hashCode() == complex32.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.negate();
        org.apache.commons.math.complex.Complex complex6 = complex4.atan();
        double double7 = complex4.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex6", complex2.equals(complex6) ? complex2.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        java.lang.String str5 = complex0.toString();
        org.apache.commons.math.complex.Complex complex6 = complex0.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        double double10 = complex7.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList12 = complex7.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        boolean boolean17 = complex16.isNaN();
        org.apache.commons.math.complex.Complex complex18 = complex13.divide(complex16);
        org.apache.commons.math.complex.Complex complex19 = complex18.atan();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex21 = complex19.add(complex20);
        org.apache.commons.math.complex.Complex complex22 = complex20.asin();
        boolean boolean23 = complex7.equals((java.lang.Object) complex20);
        org.apache.commons.math.complex.Complex complex24 = complex7.sinh();
        org.apache.commons.math.complex.Complex complex25 = complex7.sqrt();
        double double26 = complex25.abs();
        org.apache.commons.math.complex.Complex complex27 = complex25.negate();
        org.apache.commons.math.complex.Complex complex28 = complex27.tanh();
        org.apache.commons.math.complex.Complex complex29 = complex28.exp();
        double double30 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex31 = complex0.pow(complex28);
        java.lang.Class<?> wildcardClass32 = complex0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex31", complex0.equals(complex31) ? complex0.hashCode() == complex31.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.cos();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex11.cos();
        boolean boolean15 = complex4.equals((java.lang.Object) complex11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex14", complex0.equals(complex14) ? complex0.hashCode() == complex14.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = complex1.divide(complex9);
        org.apache.commons.math.complex.Complex complex11 = complex1.asin();
        double double12 = complex11.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex11", complex0.equals(complex11) ? complex0.hashCode() == complex11.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex14.exp();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.ComplexField complexField21 = complex17.getField();
        org.apache.commons.math.complex.Complex complex24 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = complex17.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = complex17.exp();
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.tanh();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = complex31.add(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex31.getField();
        org.apache.commons.math.complex.Complex complex36 = complex31.tan();
        org.apache.commons.math.complex.Complex complex39 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex40 = complex31.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex28.add(complex31);
        org.apache.commons.math.complex.Complex complex42 = complex41.sin();
        org.apache.commons.math.complex.Complex complex43 = complex42.log();
        org.apache.commons.math.complex.Complex complex44 = complex43.negate();
        org.apache.commons.math.complex.Complex complex45 = complex43.acos();
        org.apache.commons.math.complex.Complex complex46 = complex17.pow(complex45);
        org.apache.commons.math.complex.Complex complex47 = complex15.add(complex46);
        org.apache.commons.math.complex.Complex complex48 = complex47.conjugate();
        org.apache.commons.math.complex.Complex complex49 = complex47.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex47 and complex48", complex47.equals(complex48) ? complex47.hashCode() == complex48.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        boolean boolean2 = complex1.isNaN();
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex4 = complex3.sin();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = complex4.add(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex1.divide(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex1.cos();
        org.apache.commons.math.complex.Complex complex10 = complex9.asin();
        org.apache.commons.math.complex.Complex complex13 = complex9.createComplex(100.0d, (double) 100L);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex22 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex23 = complex22.atan();
        org.apache.commons.math.complex.Complex complex24 = complex15.divide(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = complex26.tan();
        org.apache.commons.math.complex.Complex complex31 = complex30.exp();
        org.apache.commons.math.complex.Complex complex32 = complex30.log();
        org.apache.commons.math.complex.Complex complex33 = complex32.exp();
        org.apache.commons.math.complex.Complex complex34 = complex24.multiply(complex32);
        org.apache.commons.math.complex.Complex complex36 = complex32.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex37 = complex36.acos();
        org.apache.commons.math.complex.Complex complex38 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex39 = complex9.divide(complex36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex32 and complex38", complex32.equals(complex38) ? complex32.hashCode() == complex38.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj1 = complex0.readResolve();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        double double10 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex11 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex12 = complex0.divide(complex11);
        java.lang.Object obj13 = complex12.readResolve();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.ComplexField complexField19 = complex15.getField();
        org.apache.commons.math.complex.Complex complex20 = complex15.tan();
        org.apache.commons.math.complex.Complex complex23 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex24 = complex15.add(complex23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        boolean boolean29 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex30 = complex25.divide(complex28);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex33 = complex31.add(complex32);
        org.apache.commons.math.complex.Complex complex34 = complex31.exp();
        org.apache.commons.math.complex.Complex complex35 = complex23.pow(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex34.acos();
        org.apache.commons.math.complex.Complex complex37 = complex36.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex36.multiply(0.7853981633974483d);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.ComplexField complexField45 = complex41.getField();
        org.apache.commons.math.complex.Complex complex46 = complex41.tan();
        org.apache.commons.math.complex.Complex complex47 = complex36.divide(complex46);
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = complex48.acos();
        double double51 = complex48.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList53 = complex48.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex57 = complex56.sin();
        boolean boolean58 = complex57.isNaN();
        org.apache.commons.math.complex.Complex complex59 = complex54.divide(complex57);
        org.apache.commons.math.complex.Complex complex60 = complex59.atan();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex62 = complex60.add(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex61.asin();
        boolean boolean64 = complex48.equals((java.lang.Object) complex61);
        org.apache.commons.math.complex.Complex complex65 = complex61.atan();
        org.apache.commons.math.complex.Complex complex66 = complex46.pow(complex61);
        org.apache.commons.math.complex.Complex complex67 = complex61.acos();
        org.apache.commons.math.complex.Complex complex68 = complex12.multiply(complex67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex7 and complex50", complex7.equals(complex50) ? complex7.hashCode() == complex50.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        double double6 = complex1.getImaginary();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sinh();
        double double15 = complex12.getImaginary();
        org.apache.commons.math.complex.Complex complex16 = complex11.pow(complex12);
        org.apache.commons.math.complex.Complex complex17 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.sqrt();
        org.apache.commons.math.complex.Complex complex20 = complex18.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex20.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex20.createComplex((double) (byte) 10, 0.0d);
        double double26 = complex20.abs();
        org.apache.commons.math.complex.Complex complex27 = complex16.divide(complex20);
        org.apache.commons.math.complex.Complex complex28 = complex1.divide(complex20);
        org.apache.commons.math.complex.Complex complex29 = complex1.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.createComplex(100.0d, (double) (byte) 100);
        org.apache.commons.math.complex.Complex complex33 = complex32.log();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex34.acos();
        double double37 = complex34.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList39 = complex34.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        boolean boolean44 = complex43.isNaN();
        org.apache.commons.math.complex.Complex complex45 = complex40.divide(complex43);
        org.apache.commons.math.complex.Complex complex46 = complex45.atan();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex48 = complex46.add(complex47);
        org.apache.commons.math.complex.Complex complex49 = complex47.asin();
        boolean boolean50 = complex34.equals((java.lang.Object) complex47);
        org.apache.commons.math.complex.Complex complex51 = complex34.sinh();
        org.apache.commons.math.complex.Complex complex52 = complex34.sqrt();
        double double53 = complex52.abs();
        org.apache.commons.math.complex.Complex complex54 = complex52.negate();
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex56 = complex54.tan();
        boolean boolean57 = complex32.equals((java.lang.Object) complex54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex36", complex12.equals(complex36) ? complex12.hashCode() == complex36.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex4 = complex0.acos();
        double double5 = complex0.getReal();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = complex7.add(complex9);
        org.apache.commons.math.complex.ComplexField complexField11 = complex7.getField();
        org.apache.commons.math.complex.Complex complex12 = complex7.tan();
        org.apache.commons.math.complex.Complex complex13 = complex7.exp();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex14.sin();
        org.apache.commons.math.complex.Complex complex17 = complex14.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex7.add(complex14);
        org.apache.commons.math.complex.ComplexField complexField19 = complex18.getField();
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.sqrt();
        org.apache.commons.math.complex.Complex complex22 = complex20.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList24 = complex22.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex25 = complex18.pow(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.negate();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex30 = complex29.sin();
        org.apache.commons.math.complex.Complex complex31 = complex28.add(complex30);
        org.apache.commons.math.complex.Complex complex33 = complex28.multiply((double) 100.0f);
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex35.add(complex37);
        org.apache.commons.math.complex.Complex complex39 = complex35.tan();
        org.apache.commons.math.complex.Complex complex40 = complex39.acos();
        org.apache.commons.math.complex.Complex complex41 = complex39.cosh();
        org.apache.commons.math.complex.Complex complex43 = complex39.multiply((double) (short) 10);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        double double45 = complex43.getArgument();
        org.apache.commons.math.complex.Complex complex46 = complex33.add(complex43);
        org.apache.commons.math.complex.Complex complex47 = complex22.add(complex33);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex(100.0d, (double) (-1));
        org.apache.commons.math.complex.Complex complex51 = complex47.pow(complex50);
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex53 = complex52.sin();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.add(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex53.tan();
        org.apache.commons.math.complex.Complex complex58 = complex57.acos();
        org.apache.commons.math.complex.Complex complex59 = complex57.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex57.atan();
        org.apache.commons.math.complex.Complex complex61 = complex51.multiply(complex57);
        org.apache.commons.math.complex.Complex complex62 = complex0.multiply(complex61);
        java.lang.Object obj63 = complex0.readResolve();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex62", complex0.equals(complex62) ? complex0.hashCode() == complex62.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex19.acos();
        org.apache.commons.math.complex.Complex complex22 = complex19.negate();
        org.apache.commons.math.complex.Complex complex23 = complex19.acos();
        org.apache.commons.math.complex.Complex complex24 = complex23.negate();
        org.apache.commons.math.complex.Complex complex25 = complex23.atan();
        org.apache.commons.math.complex.Complex complex26 = complex18.multiply(complex23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex25", complex2.equals(complex25) ? complex2.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex0.negate();
        org.apache.commons.math.complex.Complex complex4 = complex0.asin();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex7.acos();
        org.apache.commons.math.complex.Complex complex10 = complex7.negate();
        org.apache.commons.math.complex.Complex complex11 = complex4.subtract(complex7);
        java.lang.Object obj12 = complex11.readResolve();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex13.sin();
        org.apache.commons.math.complex.Complex complex16 = complex11.multiply(complex13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex13", complex2.equals(complex13) ? complex2.hashCode() == complex13.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex5 = complex4.sin();
        org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
        org.apache.commons.math.complex.ComplexField complexField7 = complex3.getField();
        org.apache.commons.math.complex.Complex complex8 = complex3.tan();
        org.apache.commons.math.complex.Complex complex11 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex12 = complex3.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex0.add(complex3);
        org.apache.commons.math.complex.Complex complex14 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex15 = complex3.tan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex16.tan();
        org.apache.commons.math.complex.Complex complex19 = complex16.asin();
        org.apache.commons.math.complex.Complex complex20 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex21 = complex20.cos();
        org.apache.commons.math.complex.Complex complex22 = complex21.negate();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        org.apache.commons.math.complex.ComplexField complexField24 = complex22.getField();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex30.sinh();
        double double33 = complex30.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex29.pow(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex29.exp();
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.sin();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        boolean boolean42 = complex41.isNaN();
        org.apache.commons.math.complex.Complex complex43 = complex38.divide(complex41);
        org.apache.commons.math.complex.Complex complex44 = complex43.atan();
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj46 = complex45.readResolve();
        org.apache.commons.math.complex.Complex complex47 = complex44.pow(complex45);
        org.apache.commons.math.complex.Complex complex49 = complex45.multiply((double) (-1));
        org.apache.commons.math.complex.Complex complex50 = complex35.pow(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex22.divide(complex35);
        org.apache.commons.math.complex.Complex complex52 = complex51.cos();
        org.apache.commons.math.complex.Complex complex53 = complex51.conjugate();
        org.apache.commons.math.complex.Complex complex54 = complex15.subtract(complex53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex51 and complex53", complex51.equals(complex53) ? complex51.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.tan();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex0.createComplex((double) 100, 1.4816627996986553d);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex7.subtract(complex9);
        org.apache.commons.math.complex.Complex complex14 = complex7.acos();
        org.apache.commons.math.complex.Complex complex15 = complex14.log();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.ComplexField complexField21 = complex17.getField();
        org.apache.commons.math.complex.Complex complex22 = complex17.tan();
        org.apache.commons.math.complex.Complex complex23 = complex22.acos();
        boolean boolean24 = complex22.isInfinite();
        org.apache.commons.math.complex.Complex complex25 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex14.divide(complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex22 and complex25", complex22.equals(complex25) ? complex22.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.cos();
        boolean boolean7 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.Complex complex13 = complex9.tan();
        org.apache.commons.math.complex.Complex complex14 = complex13.acos();
        double double15 = complex14.abs();
        org.apache.commons.math.complex.Complex complex18 = new org.apache.commons.math.complex.Complex((double) 10, (double) 0);
        org.apache.commons.math.complex.Complex complex19 = complex14.add(complex18);
        java.lang.Object obj20 = complex14.readResolve();
        boolean boolean21 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex22 = complex6.acos();
        org.apache.commons.math.complex.Complex complex25 = complex6.createComplex(1.6557321146188588d, 7.456241416655579d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex1 and complex22", complex1.equals(complex22) ? complex1.hashCode() == complex22.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex3.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex3", complex0.equals(complex3) ? complex0.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        boolean boolean4 = complex0.isInfinite();
        org.apache.commons.math.complex.Complex complex5 = complex0.sin();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex0.nthRoot((int) (short) 100);
        org.apache.commons.math.complex.Complex complex8 = complex0.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.tanh();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.ComplexField complexField17 = complex13.getField();
        org.apache.commons.math.complex.Complex complex18 = complex13.tan();
        org.apache.commons.math.complex.Complex complex21 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex22 = complex13.add(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex10.add(complex13);
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex26 = complex23.add(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.sqrt();
        org.apache.commons.math.complex.Complex complex29 = complex28.sqrt();
        boolean boolean30 = complex28.isNaN();
        org.apache.commons.math.complex.Complex complex31 = complex28.sin();
        org.apache.commons.math.complex.Complex complex32 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = complex25.pow(complex31);
        boolean boolean34 = complex8.equals((java.lang.Object) complex25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex27", complex2.equals(complex27) ? complex2.hashCode() == complex27.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = complex0.acos();
        double double3 = complex0.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList5 = complex0.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex7 = complex6.sin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        boolean boolean10 = complex9.isNaN();
        org.apache.commons.math.complex.Complex complex11 = complex6.divide(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.atan();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex14 = complex12.add(complex13);
        org.apache.commons.math.complex.Complex complex15 = complex13.asin();
        boolean boolean16 = complex0.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex17 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex18 = complex0.cos();
        org.apache.commons.math.complex.Complex complex19 = complex0.asin();
        org.apache.commons.math.complex.Complex complex20 = complex19.conjugate();
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex20", complex19.equals(complex20) ? complex19.hashCode() == complex20.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj8 = complex7.readResolve();
        org.apache.commons.math.complex.Complex complex9 = complex6.pow(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex6.asin();
        org.apache.commons.math.complex.Complex complex11 = complex6.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        java.lang.String str14 = complex13.toString();
        org.apache.commons.math.complex.Complex complex15 = complex13.log();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex19 = new org.apache.commons.math.complex.Complex(0.9443504370351303d, (double) 1L);
        org.apache.commons.math.complex.Complex complex20 = complex16.multiply(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex24 = complex21.asin();
        org.apache.commons.math.complex.Complex complex25 = complex21.tanh();
        org.apache.commons.math.complex.Complex complex26 = complex21.sqrt1z();
        org.apache.commons.math.complex.Complex complex28 = complex26.multiply(Double.POSITIVE_INFINITY);
        org.apache.commons.math.complex.Complex complex29 = complex26.asin();
        org.apache.commons.math.complex.Complex complex30 = complex16.pow(complex29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex26 and complex29", complex26.equals(complex29) ? complex26.hashCode() == complex29.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex11.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList15 = complex13.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex18 = complex13.createComplex((double) (byte) 10, 0.0d);
        double double19 = complex13.abs();
        org.apache.commons.math.complex.Complex complex20 = complex9.divide(complex13);
        double double21 = complex20.getReal();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex23 = complex22.tanh();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.tan();
        org.apache.commons.math.complex.Complex complex33 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex34 = complex25.add(complex33);
        org.apache.commons.math.complex.Complex complex35 = complex22.add(complex25);
        org.apache.commons.math.complex.Complex complex36 = complex35.sin();
        org.apache.commons.math.complex.Complex complex37 = complex20.multiply(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex39 = complex38.tanh();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex41 = complex40.sin();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = complex41.add(complex43);
        org.apache.commons.math.complex.ComplexField complexField45 = complex41.getField();
        org.apache.commons.math.complex.Complex complex46 = complex41.tan();
        org.apache.commons.math.complex.Complex complex49 = new org.apache.commons.math.complex.Complex((double) 100, (double) 100.0f);
        org.apache.commons.math.complex.Complex complex50 = complex41.add(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex38.add(complex41);
        org.apache.commons.math.complex.Complex complex52 = complex51.sin();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex54 = complex51.add(complex53);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.sqrt();
        org.apache.commons.math.complex.Complex complex57 = complex56.sqrt();
        boolean boolean58 = complex56.isNaN();
        org.apache.commons.math.complex.Complex complex59 = complex56.sin();
        org.apache.commons.math.complex.Complex complex60 = complex59.sqrt1z();
        org.apache.commons.math.complex.Complex complex61 = complex53.pow(complex59);
        org.apache.commons.math.complex.Complex complex62 = complex59.sin();
        org.apache.commons.math.complex.Complex complex63 = complex59.asin();
        org.apache.commons.math.complex.Complex complex64 = complex35.pow(complex59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex63", complex5.equals(complex63) ? complex5.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(1.070036977518573E-16d, (double) 0);
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.log();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex2 and complex3", complex2.equals(complex3) ? complex2.hashCode() == complex3.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        double double7 = complex5.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex6", complex5.equals(complex6) ? complex5.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex17.acos();
        double double20 = complex17.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList22 = complex17.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex24 = complex23.sin();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        boolean boolean27 = complex26.isNaN();
        org.apache.commons.math.complex.Complex complex28 = complex23.divide(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.atan();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex31 = complex29.add(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.asin();
        boolean boolean33 = complex17.equals((java.lang.Object) complex30);
        org.apache.commons.math.complex.Complex complex34 = complex17.sinh();
        org.apache.commons.math.complex.Complex complex35 = complex17.sqrt();
        org.apache.commons.math.complex.Complex complex36 = complex17.sin();
        org.apache.commons.math.complex.Complex complex37 = complex16.divide(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex37.log();
        org.apache.commons.math.complex.Complex complex39 = complex38.negate();
        org.apache.commons.math.complex.Complex complex40 = complex39.conjugate();
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.sqrt();
        org.apache.commons.math.complex.Complex complex43 = complex42.cosh();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex47 = complex46.sin();
        org.apache.commons.math.complex.Complex complex48 = complex45.add(complex47);
        org.apache.commons.math.complex.ComplexField complexField49 = complex45.getField();
        org.apache.commons.math.complex.Complex complex50 = complex45.tan();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex52 = complex51.sin();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex54 = complex53.sin();
        org.apache.commons.math.complex.Complex complex55 = complex52.add(complex54);
        org.apache.commons.math.complex.Complex complex56 = complex52.tan();
        org.apache.commons.math.complex.Complex complex57 = complex45.divide(complex52);
        org.apache.commons.math.complex.Complex complex58 = complex52.cos();
        org.apache.commons.math.complex.Complex complex59 = complex43.add(complex52);
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex61 = complex60.sqrt();
        org.apache.commons.math.complex.Complex complex62 = complex60.sin();
        org.apache.commons.math.complex.Complex complex63 = complex60.tanh();
        org.apache.commons.math.complex.Complex complex64 = complex60.acos();
        org.apache.commons.math.complex.Complex complex65 = complex64.acos();
        org.apache.commons.math.complex.Complex complex66 = complex65.cos();
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex68 = complex67.sinh();
        org.apache.commons.math.complex.Complex complex69 = complex65.multiply(complex68);
        org.apache.commons.math.complex.Complex complex70 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex71 = complex70.sin();
        org.apache.commons.math.complex.Complex complex72 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex73 = complex72.sin();
        org.apache.commons.math.complex.Complex complex74 = complex71.add(complex73);
        org.apache.commons.math.complex.ComplexField complexField75 = complex71.getField();
        org.apache.commons.math.complex.Complex complex76 = complex71.exp();
        org.apache.commons.math.complex.Complex complex77 = complex76.exp();
        org.apache.commons.math.complex.Complex complex78 = complex76.asin();
        org.apache.commons.math.complex.Complex complex79 = complex69.subtract(complex78);
        org.apache.commons.math.complex.Complex complex80 = complex59.divide(complex69);
        org.apache.commons.math.complex.Complex complex81 = complex40.subtract(complex69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex19 and complex41", complex19.equals(complex41) ? complex19.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = complex4.asin();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex6", complex0.equals(complex6) ? complex0.hashCode() == complex6.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.cos();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.sqrt();
        org.apache.commons.math.complex.Complex complex14 = complex12.sin();
        org.apache.commons.math.complex.Complex complex15 = complex14.sqrt();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex19 = complex18.sin();
        org.apache.commons.math.complex.Complex complex20 = complex17.add(complex19);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.sqrt();
        org.apache.commons.math.complex.Complex complex23 = complex21.sinh();
        double double24 = complex21.getImaginary();
        org.apache.commons.math.complex.Complex complex25 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex26 = complex20.exp();
        org.apache.commons.math.complex.Complex complex27 = complex14.divide(complex20);
        org.apache.commons.math.complex.Complex complex28 = complex20.asin();
        double double29 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = complex31.add(complex33);
        org.apache.commons.math.complex.ComplexField complexField35 = complex31.getField();
        org.apache.commons.math.complex.Complex complex36 = complex31.tan();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex38 = complex37.sin();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex40 = complex39.sin();
        org.apache.commons.math.complex.Complex complex41 = complex38.add(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex38.tan();
        org.apache.commons.math.complex.Complex complex43 = complex31.divide(complex38);
        org.apache.commons.math.complex.Complex complex44 = complex38.cos();
        org.apache.commons.math.complex.Complex complex45 = complex44.sinh();
        org.apache.commons.math.complex.Complex complex46 = complex44.tanh();
        org.apache.commons.math.complex.Complex complex47 = complex20.pow(complex44);
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = complex11.add(complex48);
        org.apache.commons.math.complex.Complex complex50 = complex11.sqrt1z();
        java.lang.Object obj51 = null;
        boolean boolean52 = complex50.equals(obj51);
        org.apache.commons.math.complex.Complex complex53 = complex50.acos();
        org.apache.commons.math.complex.Complex complex54 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex55 = complex54.sin();
        org.apache.commons.math.complex.Complex complex56 = complex54.tan();
        org.apache.commons.math.complex.Complex complex57 = complex54.asin();
        org.apache.commons.math.complex.Complex complex58 = complex54.tanh();
        org.apache.commons.math.complex.Complex complex59 = complex58.cos();
        org.apache.commons.math.complex.Complex complex60 = complex59.negate();
        org.apache.commons.math.complex.Complex complex61 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex62 = complex61.sin();
        org.apache.commons.math.complex.Complex complex63 = complex61.acos();
        double double64 = complex61.abs();
        java.util.List<org.apache.commons.math.complex.Complex> complexList66 = complex61.nthRoot((int) (byte) 100);
        org.apache.commons.math.complex.Complex complex67 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex68 = complex67.sin();
        org.apache.commons.math.complex.Complex complex69 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex70 = complex69.sin();
        boolean boolean71 = complex70.isNaN();
        org.apache.commons.math.complex.Complex complex72 = complex67.divide(complex70);
        org.apache.commons.math.complex.Complex complex73 = complex72.atan();
        org.apache.commons.math.complex.Complex complex74 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex75 = complex73.add(complex74);
        org.apache.commons.math.complex.Complex complex76 = complex74.asin();
        boolean boolean77 = complex61.equals((java.lang.Object) complex74);
        org.apache.commons.math.complex.Complex complex78 = complex61.sinh();
        org.apache.commons.math.complex.Complex complex79 = complex61.sqrt();
        org.apache.commons.math.complex.Complex complex80 = complex59.subtract(complex61);
        org.apache.commons.math.complex.Complex complex81 = complex61.tanh();
        org.apache.commons.math.complex.Complex complex82 = complex61.atan();
        org.apache.commons.math.complex.Complex complex83 = complex82.sin();
        org.apache.commons.math.complex.Complex complex84 = complex83.cos();
        org.apache.commons.math.complex.Complex complex85 = complex50.divide(complex84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex12 and complex63", complex12.equals(complex63) ? complex12.hashCode() == complex63.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.log();
        org.apache.commons.math.complex.Complex complex14 = complex13.asin();
        java.lang.Object obj15 = complex13.readResolve();
        org.apache.commons.math.complex.Complex complex16 = complex7.add(complex13);
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = complex18.add(complex20);
        org.apache.commons.math.complex.ComplexField complexField22 = complex18.getField();
        org.apache.commons.math.complex.Complex complex25 = new org.apache.commons.math.complex.Complex((double) 10L, (double) (byte) -1);
        org.apache.commons.math.complex.Complex complex26 = complex25.atan();
        org.apache.commons.math.complex.Complex complex27 = complex18.divide(complex26);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex29 = complex28.sin();
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex31 = complex30.sin();
        org.apache.commons.math.complex.Complex complex32 = complex29.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex29.tan();
        org.apache.commons.math.complex.Complex complex34 = complex33.exp();
        org.apache.commons.math.complex.Complex complex35 = complex33.log();
        org.apache.commons.math.complex.Complex complex36 = complex35.exp();
        org.apache.commons.math.complex.Complex complex37 = complex27.multiply(complex35);
        org.apache.commons.math.complex.Complex complex39 = complex35.multiply((double) 1);
        org.apache.commons.math.complex.Complex complex40 = complex39.acos();
        org.apache.commons.math.complex.Complex complex41 = complex39.conjugate();
        org.apache.commons.math.complex.Complex complex42 = complex13.multiply(complex41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex35 and complex41", complex35.equals(complex41) ? complex35.hashCode() == complex41.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.sinh();
        org.apache.commons.math.complex.Complex complex4 = complex3.negate();
        org.apache.commons.math.complex.Complex complex5 = complex3.asin();
        org.apache.commons.math.complex.Complex complex6 = complex3.asin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex5", complex0.equals(complex5) ? complex0.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.sinh();
        double double5 = complex3.getImaginary();
        java.util.List<org.apache.commons.math.complex.Complex> complexList7 = complex3.nthRoot((int) '#');
        org.apache.commons.math.complex.Complex complex8 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex11 = complex3.createComplex((-0.5309649148733836d), 0.6891425285553854d);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.tanh();
        org.apache.commons.math.complex.Complex complex14 = complex13.log();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex16.tan();
        org.apache.commons.math.complex.Complex complex21 = complex20.acos();
        org.apache.commons.math.complex.Complex complex22 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj24 = complex23.readResolve();
        double double25 = complex23.getImaginary();
        org.apache.commons.math.complex.Complex complex26 = complex23.tanh();
        org.apache.commons.math.complex.Complex complex27 = complex22.add(complex26);
        org.apache.commons.math.complex.Complex complex28 = complex22.atan();
        org.apache.commons.math.complex.Complex complex30 = complex28.multiply((double) (byte) 0);
        org.apache.commons.math.complex.Complex complex31 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex32 = complex13.add(complex31);
        org.apache.commons.math.complex.Complex complex33 = complex32.log();
        org.apache.commons.math.complex.Complex complex34 = complex11.pow(complex33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex12", complex3.equals(complex12) ? complex3.hashCode() == complex12.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.atan();
        java.lang.String str3 = complex0.toString();
        org.apache.commons.math.complex.Complex complex4 = complex0.tanh();
        double double5 = complex4.abs();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex4.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex9 = complex8.sin();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex9.add(complex11);
        org.apache.commons.math.complex.ComplexField complexField13 = complex9.getField();
        org.apache.commons.math.complex.Complex complex14 = complex9.tan();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex16.tan();
        org.apache.commons.math.complex.Complex complex21 = complex9.divide(complex16);
        org.apache.commons.math.complex.Complex complex22 = complex16.cos();
        org.apache.commons.math.complex.Complex complex23 = complex22.sinh();
        org.apache.commons.math.complex.Complex complex26 = complex23.createComplex((double) 1, (double) 1);
        org.apache.commons.math.complex.Complex complex27 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex30 = complex27.createComplex((double) 100, (double) (short) 100);
        org.apache.commons.math.complex.Complex complex31 = complex30.atan();
        org.apache.commons.math.complex.Complex complex32 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex33 = complex30.sqrt();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math.complex.Complex complex38 = complex35.add(complex37);
        org.apache.commons.math.complex.ComplexField complexField39 = complex35.getField();
        org.apache.commons.math.complex.Complex complex40 = complex35.cos();
        org.apache.commons.math.complex.Complex complex42 = complex40.multiply((double) 0L);
        org.apache.commons.math.complex.Complex complex43 = complex42.acos();
        org.apache.commons.math.complex.Complex complex44 = complex33.subtract(complex42);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.sin();
        boolean boolean47 = complex46.isNaN();
        org.apache.commons.math.complex.Complex complex48 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex49 = complex48.sin();
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex51 = complex50.sin();
        org.apache.commons.math.complex.Complex complex52 = complex49.add(complex51);
        org.apache.commons.math.complex.Complex complex53 = complex46.divide(complex51);
        boolean boolean54 = complex46.isInfinite();
        org.apache.commons.math.complex.Complex complex55 = complex33.divide(complex46);
        org.apache.commons.math.complex.Complex complex57 = complex55.multiply((double) (short) -1);
        org.apache.commons.math.complex.Complex complex58 = complex7.subtract(complex55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex42", complex0.equals(complex42) ? complex0.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex17 = complex16.sin();
        org.apache.commons.math.complex.Complex complex18 = complex15.add(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex15.tan();
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        double double21 = complex20.abs();
        java.lang.Object obj22 = null;
        boolean boolean23 = complex20.equals(obj22);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex25 = complex24.sin();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex27 = complex26.sin();
        org.apache.commons.math.complex.Complex complex28 = complex25.add(complex27);
        org.apache.commons.math.complex.ComplexField complexField29 = complex25.getField();
        org.apache.commons.math.complex.Complex complex30 = complex25.tan();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex32 = complex31.sin();
        org.apache.commons.math.complex.Complex complex33 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex34 = complex33.sin();
        org.apache.commons.math.complex.Complex complex35 = complex32.add(complex34);
        org.apache.commons.math.complex.Complex complex36 = complex32.tan();
        org.apache.commons.math.complex.Complex complex37 = complex25.divide(complex32);
        org.apache.commons.math.complex.Complex complex38 = complex37.sqrt();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex40 = complex38.pow(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex40.acos();
        org.apache.commons.math.complex.Complex complex42 = complex40.tanh();
        org.apache.commons.math.complex.Complex complex43 = complex20.subtract(complex42);
        org.apache.commons.math.complex.Complex complex44 = complex8.pow(complex42);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex46 = complex45.sin();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex48 = complex47.sin();
        org.apache.commons.math.complex.Complex complex49 = complex46.add(complex48);
        org.apache.commons.math.complex.ComplexField complexField50 = complex46.getField();
        org.apache.commons.math.complex.Complex complex51 = complex46.tan();
        org.apache.commons.math.complex.Complex complex52 = complex46.exp();
        org.apache.commons.math.complex.Complex complex53 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex54 = complex53.sqrt();
        org.apache.commons.math.complex.Complex complex55 = complex53.sin();
        org.apache.commons.math.complex.Complex complex56 = complex53.sinh();
        org.apache.commons.math.complex.Complex complex57 = complex46.add(complex53);
        org.apache.commons.math.complex.Complex complex58 = complex46.sinh();
        org.apache.commons.math.complex.Complex complex59 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex60 = complex59.sqrt();
        org.apache.commons.math.complex.Complex complex61 = complex59.sinh();
        double double62 = complex59.getImaginary();
        org.apache.commons.math.complex.Complex complex65 = complex59.createComplex((double) (byte) 100, (double) 1L);
        org.apache.commons.math.complex.Complex complex66 = complex46.divide(complex65);
        org.apache.commons.math.complex.Complex complex67 = complex65.asin();
        org.apache.commons.math.complex.Complex complex68 = complex44.subtract(complex65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex41 and complex53", complex41.equals(complex53) ? complex41.hashCode() == complex53.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList8 = complex6.nthRoot((int) (short) 10);
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex10.divide(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj18 = complex17.readResolve();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex6.divide(complex17);
        org.apache.commons.math.complex.Complex complex21 = complex17.asin();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        double double23 = complex22.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex22.atan();
        org.apache.commons.math.complex.Complex complex25 = complex21.add(complex24);
        double double26 = complex24.abs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex21 and complex25", complex21.equals(complex25) ? complex21.hashCode() == complex25.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex9.atan();
        org.apache.commons.math.complex.Complex complex13 = complex9.sin();
        org.apache.commons.math.complex.Complex complex14 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex16 = complex15.sin();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex18 = complex17.sin();
        org.apache.commons.math.complex.Complex complex19 = complex16.add(complex18);
        org.apache.commons.math.complex.Complex complex20 = complex16.tan();
        org.apache.commons.math.complex.Complex complex21 = complex20.acos();
        double double22 = complex21.abs();
        java.lang.Object obj23 = null;
        boolean boolean24 = complex21.equals(obj23);
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex26 = complex25.sin();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex28 = complex27.sin();
        org.apache.commons.math.complex.Complex complex29 = complex26.add(complex28);
        org.apache.commons.math.complex.ComplexField complexField30 = complex26.getField();
        org.apache.commons.math.complex.Complex complex31 = complex26.tan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = complex26.divide(complex33);
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex41 = complex39.pow(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex41.acos();
        org.apache.commons.math.complex.Complex complex43 = complex41.tanh();
        org.apache.commons.math.complex.Complex complex44 = complex21.subtract(complex43);
        org.apache.commons.math.complex.Complex complex45 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex46 = complex45.tan();
        org.apache.commons.math.complex.Complex complex49 = complex46.createComplex(100.0d, 0.7237368419565787d);
        boolean boolean50 = complex49.isNaN();
        org.apache.commons.math.complex.Complex complex51 = complex49.exp();
        org.apache.commons.math.complex.Complex complex52 = complex14.pow(complex51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex5 and complex42", complex5.equals(complex42) ? complex5.hashCode() == complex42.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex16 = complex14.pow(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex16.acos();
        org.apache.commons.math.complex.Complex complex18 = complex16.tanh();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        double double22 = complex21.getImaginary();
        double double23 = complex21.getArgument();
        org.apache.commons.math.complex.Complex complex24 = complex21.log();
        org.apache.commons.math.complex.Complex complex25 = complex20.divide(complex24);
        org.apache.commons.math.complex.Complex complex26 = complex16.divide(complex24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex17 and complex26", complex17.equals(complex26) ? complex17.hashCode() == complex26.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex4.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.sin();
        org.apache.commons.math.complex.Complex complex12 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.sin();
        boolean boolean14 = complex13.isNaN();
        org.apache.commons.math.complex.Complex complex15 = complex13.conjugate();
        boolean boolean16 = complex13.isNaN();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex11 and complex15", complex11.equals(complex15) ? complex11.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex2 = complex0.sin();
        org.apache.commons.math.complex.Complex complex3 = complex0.cos();
        org.apache.commons.math.complex.Complex complex4 = complex3.exp();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex6 = complex5.sin();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = complex6.add(complex8);
        org.apache.commons.math.complex.Complex complex10 = complex6.tan();
        org.apache.commons.math.complex.Complex complex11 = complex10.exp();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex15 = complex14.sin();
        org.apache.commons.math.complex.Complex complex16 = complex13.add(complex15);
        org.apache.commons.math.complex.Complex complex17 = complex13.tan();
        org.apache.commons.math.complex.Complex complex18 = complex11.divide(complex17);
        org.apache.commons.math.complex.Complex complex19 = complex18.asin();
        org.apache.commons.math.complex.Complex complex20 = complex19.negate();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        double double22 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex23 = complex3.multiply(complex19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex3 and complex5", complex3.equals(complex5) ? complex3.hashCode() == complex5.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = complex1.exp();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex8.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex12 = complex1.add(complex8);
        org.apache.commons.math.complex.Complex complex13 = complex12.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex12.multiply(10.0d);
        org.apache.commons.math.complex.Complex complex16 = complex15.conjugate();
        org.apache.commons.math.complex.ComplexField complexField17 = complex16.getField();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex16", complex15.equals(complex16) ? complex15.hashCode() == complex16.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = complex1.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math.complex.Complex complex7 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex7.sqrt();
        org.apache.commons.math.complex.ComplexField complexField9 = complex7.getField();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex7.tanh();
        boolean boolean12 = complex11.isNaN();
        org.apache.commons.math.complex.Complex complex13 = complex11.asin();
        org.apache.commons.math.complex.Complex complex14 = complex13.sinh();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex14 and complex15", complex14.equals(complex15) ? complex14.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.ComplexField complexField5 = complex1.getField();
        org.apache.commons.math.complex.Complex complex6 = complex1.tan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        org.apache.commons.math.complex.Complex complex11 = complex8.add(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex8.tan();
        org.apache.commons.math.complex.Complex complex13 = complex1.divide(complex8);
        org.apache.commons.math.complex.Complex complex14 = complex8.negate();
        org.apache.commons.math.complex.Complex complex15 = complex8.asin();
        double double16 = complex8.getImaginary();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex15", complex0.equals(complex15) ? complex0.hashCode() == complex15.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex0.divide(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex8 = complex6.add(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt();
        org.apache.commons.math.complex.Complex complex12 = complex7.createComplex((double) 0L, (double) (-1));
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex14 = complex13.sin();
        org.apache.commons.math.complex.Complex complex15 = complex13.acos();
        double double16 = complex13.abs();
        boolean boolean17 = complex13.isInfinite();
        org.apache.commons.math.complex.Complex complex18 = complex13.sin();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex20 = complex19.sin();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex22 = complex21.sin();
        boolean boolean23 = complex22.isNaN();
        org.apache.commons.math.complex.Complex complex24 = complex19.divide(complex22);
        org.apache.commons.math.complex.Complex complex25 = complex24.atan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj27 = complex26.readResolve();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex25.asin();
        org.apache.commons.math.complex.Complex complex30 = complex13.subtract(complex29);
        org.apache.commons.math.complex.Complex complex31 = complex7.multiply(complex29);
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex33 = complex32.sin();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex35 = complex34.sin();
        org.apache.commons.math.complex.Complex complex36 = complex33.add(complex35);
        org.apache.commons.math.complex.Complex complex37 = complex33.tan();
        org.apache.commons.math.complex.Complex complex38 = complex37.acos();
        org.apache.commons.math.complex.Complex complex39 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex40 = complex39.sqrt();
        double double41 = complex40.getArgument();
        org.apache.commons.math.complex.Complex complex42 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex43 = complex42.sin();
        org.apache.commons.math.complex.Complex complex44 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex45 = complex44.sin();
        boolean boolean46 = complex45.isNaN();
        org.apache.commons.math.complex.Complex complex47 = complex42.divide(complex45);
        org.apache.commons.math.complex.Complex complex48 = complex47.atan();
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.NaN;
        org.apache.commons.math.complex.Complex complex50 = complex48.add(complex49);
        org.apache.commons.math.complex.Complex complex51 = complex49.asin();
        org.apache.commons.math.complex.Complex complex52 = complex51.atan();
        org.apache.commons.math.complex.Complex complex53 = complex40.subtract(complex52);
        org.apache.commons.math.complex.Complex complex54 = complex7.subtract(complex52);
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex56 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex57 = complex56.sin();
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex59 = complex58.sin();
        boolean boolean60 = complex59.isNaN();
        org.apache.commons.math.complex.Complex complex61 = complex56.divide(complex59);
        org.apache.commons.math.complex.Complex complex62 = complex61.atan();
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ONE;
        java.lang.Object obj64 = complex63.readResolve();
        org.apache.commons.math.complex.Complex complex65 = complex62.pow(complex63);
        org.apache.commons.math.complex.Complex complex66 = complex62.asin();
        org.apache.commons.math.complex.Complex complex67 = complex62.exp();
        org.apache.commons.math.complex.Complex complex68 = complex67.tan();
        org.apache.commons.math.complex.Complex complex69 = complex68.tan();
        java.lang.Object obj70 = complex68.readResolve();
        org.apache.commons.math.complex.Complex complex71 = complex68.asin();
        org.apache.commons.math.complex.Complex complex72 = complex68.tan();
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex74 = complex73.sin();
        org.apache.commons.math.complex.Complex complex75 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex76 = complex75.sin();
        org.apache.commons.math.complex.Complex complex77 = complex74.add(complex76);
        org.apache.commons.math.complex.ComplexField complexField78 = complex74.getField();
        org.apache.commons.math.complex.Complex complex79 = complex74.tan();
        org.apache.commons.math.complex.Complex complex80 = complex74.exp();
        org.apache.commons.math.complex.Complex complex81 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex82 = complex81.sqrt();
        org.apache.commons.math.complex.Complex complex83 = complex81.sin();
        org.apache.commons.math.complex.Complex complex84 = complex81.sinh();
        org.apache.commons.math.complex.Complex complex85 = complex74.add(complex81);
        org.apache.commons.math.complex.Complex complex86 = complex85.sinh();
        org.apache.commons.math.complex.Complex complex88 = complex85.multiply(10.0d);
        java.lang.Object obj89 = complex85.readResolve();
        org.apache.commons.math.complex.Complex complex90 = complex68.add(complex85);
        org.apache.commons.math.complex.Complex complex91 = complex85.tanh();
        org.apache.commons.math.complex.Complex complex92 = complex54.multiply(complex85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex15 and complex81", complex15.equals(complex81) ? complex15.hashCode() == complex81.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex1 = complex0.sin();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex1.add(complex3);
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex5.sinh();
        double double8 = complex5.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex10 = complex9.sqrt1z();
        double double11 = complex9.getArgument();
        org.apache.commons.math.complex.Complex complex12 = complex9.atan();
        org.apache.commons.math.complex.Complex complex13 = complex9.sin();
        org.apache.commons.math.complex.Complex complex14 = complex9.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex16 = complex15.sqrt();
        org.apache.commons.math.complex.Complex complex17 = complex15.atan();
        java.util.List<org.apache.commons.math.complex.Complex> complexList19 = complex17.nthRoot((int) 'a');
        org.apache.commons.math.complex.Complex complex22 = complex17.createComplex((double) (byte) 10, 0.0d);
        org.apache.commons.math.complex.Complex complex25 = complex17.createComplex(Double.NaN, 10.0d);
        org.apache.commons.math.complex.Complex complex26 = complex17.cos();
        org.apache.commons.math.complex.Complex complex27 = complex9.divide(complex17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on complex0 and complex26", complex0.equals(complex26) ? complex0.hashCode() == complex26.hashCode() : true);
    }
}

