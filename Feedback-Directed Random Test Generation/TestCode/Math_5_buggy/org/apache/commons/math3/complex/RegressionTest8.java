package org.apache.commons.math3.complex;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex6.divide(10.0d);
        org.apache.commons.math3.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math3.complex.Complex complex10 = complex9.atan();
        double double11 = complex10.getArgument();
        org.apache.commons.math3.complex.Complex complex13 = complex10.add(11013.232920103323d);
        org.apache.commons.math3.complex.Complex complex16 = complex10.createComplex(0.004999833343332619d, 80.76394854134472d);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((-0.936138998631535d), 5.917286776895572d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = complex0.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math3.complex.Complex complex5 = complex4.asin();
        org.apache.commons.math3.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = complex5.subtract((double) (-1.0f));
        java.lang.String str9 = complex8.toString();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(NaN, NaN)" + "'", str9, "(NaN, NaN)");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex18 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex19 = complex12.cos();
        org.apache.commons.math3.complex.Complex complex20 = complex12.exp();
        org.apache.commons.math3.complex.Complex complex21 = complex12.log();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList2 = complex0.nthRoot(1);
        double double3 = complex0.getImaginary();
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex6 = complex5.cosh();
        java.lang.Object obj7 = complex5.readResolve();
        org.apache.commons.math3.complex.Complex complex8 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex10 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex12 = complex10.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex13 = complex12.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList15 = complex12.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex16 = complex12.sinh();
        org.apache.commons.math3.complex.Complex complex17 = complex12.log();
        org.apache.commons.math3.complex.Complex complex18 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math3.complex.Complex complex22 = complex18.divide(complex21);
        org.apache.commons.math3.complex.Complex complex23 = complex17.add(complex21);
        org.apache.commons.math3.complex.Complex complex24 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex26 = complex24.pow(0.0d);
        double double27 = complex24.getArgument();
        org.apache.commons.math3.complex.Complex complex28 = complex17.add(complex24);
        org.apache.commons.math3.complex.Complex complex30 = complex28.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex31 = complex8.add(complex28);
        org.apache.commons.math3.complex.Complex complex32 = complex28.exp();
        org.apache.commons.math3.complex.Complex complex35 = complex28.createComplex(1.0000000000000113E97d, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex36 = complex0.subtract(complex35);
        org.apache.commons.math3.complex.Complex complex37 = complex36.sin();
        org.apache.commons.math3.complex.Complex complex39 = complex37.multiply((-1));
        org.apache.commons.math3.complex.Complex complex40 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex42 = complex40.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math3.complex.Complex complex44 = complex42.sqrt();
        org.apache.commons.math3.complex.Complex complex46 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex48 = complex46.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex49 = complex46.reciprocal();
        org.apache.commons.math3.complex.Complex complex50 = complex46.cos();
        org.apache.commons.math3.complex.Complex complex51 = complex42.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex52 = complex42.sinh();
        org.apache.commons.math3.complex.Complex complex53 = complex42.cosh();
        org.apache.commons.math3.complex.Complex complex54 = complex53.negate();
        org.apache.commons.math3.complex.Complex complex55 = complex54.reciprocal();
        org.apache.commons.math3.complex.Complex complex57 = complex54.multiply((double) 10L);
        org.apache.commons.math3.complex.Complex complex58 = complex39.multiply(complex54);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complexList2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(10.0, 0.0)");
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complexList15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.7853981633974483d + "'", double27 == 0.7853981633974483d);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex19 = complex17.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex21 = complex19.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex22 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex24 = complex22.divide(0.0d);
        double double25 = complex22.getImaginary();
        org.apache.commons.math3.complex.Complex complex28 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex29 = complex22.add(complex28);
        org.apache.commons.math3.complex.Complex complex30 = complex21.pow(complex28);
        org.apache.commons.math3.complex.Complex complex31 = complex30.tan();
        org.apache.commons.math3.complex.Complex complex32 = complex12.divide(complex30);
        org.apache.commons.math3.complex.Complex complex33 = complex12.atan();
        org.apache.commons.math3.complex.Complex complex34 = complex33.log();
        org.apache.commons.math3.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math3.complex.Complex complex36 = complex35.cos();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex9 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex10 = complex3.divide(complex9);
        org.apache.commons.math3.complex.Complex complex12 = complex9.divide(10.0d);
        double double13 = complex9.getReal();
        org.apache.commons.math3.complex.ComplexField complexField14 = complex9.getField();
        boolean boolean15 = complex9.isNaN();
        double double16 = complex9.getArgument();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + Double.POSITIVE_INFINITY + "'", double13 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertNotNull(complexField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.7853981633974483d + "'", double16 == 0.7853981633974483d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(0.10033534773107562d);
        org.apache.commons.math3.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((-14143.549766589716d));
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 0L, (double) (short) 10);
        org.apache.commons.math3.complex.Complex complex3 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex4 = complex2.add(complex3);
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((double) (short) 1);
        java.lang.Object obj7 = complex4.readResolve();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(Infinity, Infinity)");
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.tan();
        boolean boolean3 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = complex0.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex3 = complex0.tan();
        double double4 = complex3.getReal();
        org.apache.commons.math3.complex.Complex complex5 = complex3.acos();
        org.apache.commons.math3.complex.Complex complex6 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex7 = complex6.negate();
        org.apache.commons.math3.complex.Complex complex8 = complex6.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math3.complex.Complex complex2 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.reciprocal();
        org.apache.commons.math3.complex.Complex complex4 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex6 = complex4.multiply((int) (byte) 0);
        java.lang.Object obj7 = complex4.readResolve();
        org.apache.commons.math3.complex.Complex complex9 = complex4.divide((double) 100);
        org.apache.commons.math3.complex.Complex complex10 = complex4.reciprocal();
        org.apache.commons.math3.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math3.complex.Complex complex12 = complex11.exp();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "(Infinity, Infinity)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "(Infinity, Infinity)");
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.sin();
        java.lang.Object obj9 = complex3.readResolve();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "(1.0000000000000113E97, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "(1.0000000000000113E97, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "(1.0000000000000113E97, 0.0)");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex2 = complex0.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex4 = complex2.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex5 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex7 = complex5.divide(0.0d);
        double double8 = complex5.getImaginary();
        org.apache.commons.math3.complex.Complex complex11 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex12 = complex5.add(complex11);
        org.apache.commons.math3.complex.Complex complex13 = complex4.pow(complex11);
        org.apache.commons.math3.complex.Complex complex15 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex15.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex18 = complex17.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList20 = complex17.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex21 = complex17.sinh();
        org.apache.commons.math3.complex.Complex complex22 = complex17.asin();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        org.apache.commons.math3.complex.Complex complex24 = complex4.add(complex23);
        org.apache.commons.math3.complex.Complex complex25 = org.apache.commons.math3.complex.Complex.ZERO;
        java.util.List<org.apache.commons.math3.complex.Complex> complexList27 = complex25.nthRoot(1);
        double double28 = complex25.getImaginary();
        org.apache.commons.math3.complex.Complex complex29 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex31 = complex29.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex33 = complex31.pow((double) (short) 10);
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex36 = complex34.divide(0.0d);
        double double37 = complex34.getImaginary();
        org.apache.commons.math3.complex.Complex complex40 = new org.apache.commons.math3.complex.Complex((double) (short) 100, 1.0d);
        org.apache.commons.math3.complex.Complex complex41 = complex34.add(complex40);
        org.apache.commons.math3.complex.Complex complex42 = complex33.pow(complex40);
        org.apache.commons.math3.complex.Complex complex43 = complex42.tan();
        org.apache.commons.math3.complex.Complex complex44 = complex25.divide(complex42);
        org.apache.commons.math3.complex.Complex complex45 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex47 = complex45.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex48 = complex47.conjugate();
        org.apache.commons.math3.complex.Complex complex49 = complex47.sqrt();
        org.apache.commons.math3.complex.Complex complex51 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex53 = complex51.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex54 = complex51.reciprocal();
        org.apache.commons.math3.complex.Complex complex55 = complex51.cos();
        org.apache.commons.math3.complex.Complex complex56 = complex47.subtract(complex55);
        org.apache.commons.math3.complex.Complex complex57 = complex47.sinh();
        org.apache.commons.math3.complex.Complex complex59 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex61 = complex59.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex62 = complex61.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList64 = complex61.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex65 = complex61.sinh();
        org.apache.commons.math3.complex.Complex complex66 = complex61.asin();
        org.apache.commons.math3.complex.Complex complex67 = complex66.cosh();
        boolean boolean68 = complex47.equals((java.lang.Object) complex67);
        org.apache.commons.math3.complex.Complex complex71 = complex47.createComplex((double) (short) 10, (double) (-1L));
        org.apache.commons.math3.complex.Complex complex72 = complex71.sqrt();
        org.apache.commons.math3.complex.Complex complex73 = complex25.divide(complex71);
        org.apache.commons.math3.complex.Complex complex74 = complex4.pow(complex71);
        org.apache.commons.math3.complex.Complex complex75 = complex4.log();
        org.apache.commons.math3.complex.Complex complex77 = complex4.add((double) (short) 100);
        org.apache.commons.math3.complex.Complex complex79 = complex4.subtract((-0.04983432624558102d));
        org.apache.commons.math3.complex.Complex complex81 = complex4.multiply(0.5707963267948966d);
        java.lang.Object obj82 = complex4.readResolve();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complexList20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complexList27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complexList64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertEquals(obj82.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "(NaN, NaN)");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex2 = complex1.cosh();
        java.lang.Object obj3 = complex1.readResolve();
        org.apache.commons.math3.complex.Complex complex4 = complex1.atan();
        org.apache.commons.math3.complex.Complex complex6 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex8 = complex6.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex9 = complex8.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList11 = complex8.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex12 = complex8.sinh();
        org.apache.commons.math3.complex.Complex complex13 = complex8.log();
        org.apache.commons.math3.complex.Complex complex14 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex17 = complex16.cosh();
        org.apache.commons.math3.complex.Complex complex18 = complex14.divide(complex17);
        org.apache.commons.math3.complex.Complex complex19 = complex13.add(complex17);
        org.apache.commons.math3.complex.Complex complex20 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex22 = complex20.pow(0.0d);
        double double23 = complex20.getArgument();
        org.apache.commons.math3.complex.Complex complex24 = complex13.add(complex20);
        org.apache.commons.math3.complex.Complex complex26 = complex24.multiply((int) (byte) 0);
        org.apache.commons.math3.complex.Complex complex27 = complex4.add(complex24);
        org.apache.commons.math3.complex.Complex complex28 = complex24.exp();
        double double29 = complex28.getReal();
        org.apache.commons.math3.complex.Complex complex30 = complex28.sinh();
        org.apache.commons.math3.complex.Complex complex32 = complex28.subtract((-1.5682486337366561d));
        org.apache.commons.math3.complex.Complex complex33 = complex28.log();
        org.apache.commons.math3.complex.Complex complex34 = org.apache.commons.math3.complex.Complex.INF;
        org.apache.commons.math3.complex.Complex complex36 = complex34.pow(0.0d);
        org.apache.commons.math3.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math3.complex.Complex complex38 = complex37.sqrt();
        java.lang.Object obj39 = complex37.readResolve();
        org.apache.commons.math3.complex.Complex complex42 = complex37.createComplex(35.138169410605144d, (double) 0);
        org.apache.commons.math3.complex.Complex complex43 = complex33.subtract(complex37);
        boolean boolean44 = complex43.isNaN();
        boolean boolean45 = complex43.isNaN();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "(10.0, 0.0)");
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complexList11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.7853981633974483d + "'", double23 == 0.7853981633974483d);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "(NaN, NaN)");
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex3.asin();
        org.apache.commons.math3.complex.Complex complex10 = complex8.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex12 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex14 = complex12.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex15 = complex12.reciprocal();
        org.apache.commons.math3.complex.Complex complex16 = complex10.divide(complex12);
        org.apache.commons.math3.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math3.complex.Complex complex19 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex20 = complex19.cosh();
        java.lang.Object obj21 = complex19.readResolve();
        org.apache.commons.math3.complex.Complex complex22 = complex19.atan();
        org.apache.commons.math3.complex.Complex complex23 = complex22.cosh();
        boolean boolean24 = complex22.isInfinite();
        org.apache.commons.math3.complex.Complex complex26 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex28 = complex26.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex29 = complex26.reciprocal();
        org.apache.commons.math3.complex.Complex complex30 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex32 = complex26.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex33 = complex26.atan();
        org.apache.commons.math3.complex.Complex complex34 = complex26.cos();
        org.apache.commons.math3.complex.Complex complex35 = complex22.add(complex34);
        org.apache.commons.math3.complex.Complex complex36 = complex16.subtract(complex35);
        java.lang.Object obj37 = complex36.readResolve();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "(10.0, 0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "(10.0, 0.0)");
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "(-0.5749765125477926, -22.40439012009824)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "(-0.5749765125477926, -22.40439012009824)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "(-0.5749765125477926, -22.40439012009824)");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math3.complex.Complex complex1 = new org.apache.commons.math3.complex.Complex(10.0d);
        boolean boolean3 = complex1.equals((java.lang.Object) 100.0d);
        org.apache.commons.math3.complex.Complex complex4 = complex1.tan();
        org.apache.commons.math3.complex.Complex complex6 = complex4.add((-1.5637853321581656d));
        org.apache.commons.math3.complex.Complex complex7 = complex4.tanh();
        org.apache.commons.math3.complex.Complex complex8 = complex4.acos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex2 = complex0.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math3.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math3.complex.Complex complex5 = complex2.exp();
        org.apache.commons.math3.complex.Complex complex6 = complex5.asin();
        org.apache.commons.math3.complex.Complex complex7 = complex5.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.I;
        org.apache.commons.math3.complex.Complex complex10 = complex8.divide(0.0d);
        org.apache.commons.math3.complex.Complex complex11 = complex8.tanh();
        org.apache.commons.math3.complex.Complex complex12 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex13 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex14 = complex7.add(complex13);
        org.apache.commons.math3.complex.Complex complex15 = complex7.tan();
        org.apache.commons.math3.complex.Complex complex18 = complex15.createComplex(6.3665657429170555d, 90.0d);
        double double19 = complex15.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = complex5.sqrt1z();
        org.apache.commons.math3.complex.Complex complex7 = complex5.acos();
        org.apache.commons.math3.complex.Complex complex8 = complex5.exp();
        org.apache.commons.math3.complex.Complex complex10 = complex8.multiply((int) ' ');
        org.apache.commons.math3.complex.Complex complex13 = complex10.createComplex(2.5707963267948966d, (-1.568908914836579d));
        org.apache.commons.math3.complex.Complex complex15 = complex10.pow(2.574798930242685d);
        org.apache.commons.math3.complex.Complex complex16 = complex10.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math3.complex.Complex complex1 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex1.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex4 = complex3.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList6 = complex3.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex7 = complex3.sinh();
        org.apache.commons.math3.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math3.complex.Complex complex9 = complex8.log();
        boolean boolean10 = complex8.isNaN();
        org.apache.commons.math3.complex.Complex complex12 = complex8.add(2.2426113737960498E223d);
        java.lang.Object obj13 = complex12.readResolve();
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complexList6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "(NaN, NaN)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "(NaN, NaN)");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math3.complex.Complex complex0 = org.apache.commons.math3.complex.Complex.ZERO;
        org.apache.commons.math3.complex.Complex complex2 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex3 = complex2.cosh();
        org.apache.commons.math3.complex.Complex complex4 = complex0.divide(complex3);
        org.apache.commons.math3.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math3.complex.Complex complex6 = complex3.atan();
        org.apache.commons.math3.complex.Complex complex8 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex10 = complex8.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex11 = complex8.reciprocal();
        org.apache.commons.math3.complex.Complex complex12 = complex8.cos();
        org.apache.commons.math3.complex.Complex complex14 = complex8.add((double) 0.0f);
        org.apache.commons.math3.complex.Complex complex16 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex18 = complex16.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex19 = complex18.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList21 = complex18.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex22 = complex18.sinh();
        org.apache.commons.math3.complex.Complex complex23 = complex22.asin();
        org.apache.commons.math3.complex.Complex complex24 = complex23.reciprocal();
        org.apache.commons.math3.complex.Complex complex25 = complex14.subtract(complex23);
        org.apache.commons.math3.complex.Complex complex26 = complex3.add(complex14);
        boolean boolean27 = complex3.isInfinite();
        org.apache.commons.math3.complex.Complex complex28 = complex3.log();
        org.apache.commons.math3.complex.Complex complex30 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math3.complex.Complex complex33 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex35 = complex33.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex36 = complex35.cos();
        java.util.List<org.apache.commons.math3.complex.Complex> complexList38 = complex35.nthRoot((int) (short) 100);
        org.apache.commons.math3.complex.Complex complex39 = complex35.sinh();
        org.apache.commons.math3.complex.Complex complex40 = complex35.asin();
        org.apache.commons.math3.complex.Complex complex42 = complex40.subtract((double) (short) 1);
        org.apache.commons.math3.complex.Complex complex44 = org.apache.commons.math3.complex.Complex.valueOf((double) 10);
        org.apache.commons.math3.complex.Complex complex46 = complex44.pow((double) 'a');
        org.apache.commons.math3.complex.Complex complex47 = complex44.reciprocal();
        org.apache.commons.math3.complex.Complex complex48 = complex42.divide(complex44);
        org.apache.commons.math3.complex.Complex complex49 = complex30.subtract(complex44);
        org.apache.commons.math3.complex.Complex complex50 = complex30.atan();
        org.apache.commons.math3.complex.Complex complex51 = complex28.subtract(complex50);
        org.apache.commons.math3.complex.Complex complex53 = complex28.multiply((int) (byte) -1);
        java.lang.Object obj54 = complex53.readResolve();
        org.apache.commons.math3.complex.Complex complex56 = complex53.add((double) 100.0f);
        org.apache.commons.math3.complex.Complex complex57 = complex56.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complexList21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complexList38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "(-9.306852821501208, -0.0)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "(-9.306852821501208, -0.0)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "(-9.306852821501208, -0.0)");
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
    }
}

