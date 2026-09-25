package org.apache.commons.lang.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction7 = fraction3.pow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction1.subtract(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction5 = fraction1.add(fraction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fraction0.compareTo((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Byte is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        long long9 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.add(fraction8);
        byte byte11 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(3, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        byte byte2 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-1), (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        long long9 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.add(fraction8);
        byte byte11 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int3 = fraction2.getNumerator();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        java.lang.Class<?> wildcardClass11 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        short short1 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        byte byte1 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        java.lang.String str5 = fraction1.toString();
        java.lang.String str6 = fraction1.toProperString();
        int int7 = fraction1.getProperNumerator();
        byte byte8 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -10 + "'", short4 == (short) -10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int7 = fraction6.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fraction2.compareTo((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(0, 5);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang.math.Fraction fraction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction8 = fraction5.subtract(fraction7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        java.lang.String str15 = fraction3.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1/10" + "'", str15, "1/10");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = fraction3.compareTo((java.lang.Object) 110.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Double is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 33 + "'", byte4 == (byte) 33);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.Class<?> wildcardClass6 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(0, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(3, 2);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        byte byte7 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -32 + "'", byte7 == (byte) -32);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1.0f));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(0, (-10), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.pow((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        short short8 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction14 = fraction1.pow((int) (byte) -32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        byte byte15 = fraction13.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        int int18 = fraction17.getNumerator();
        java.lang.Class<?> wildcardClass19 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 33, (int) (byte) 1, (int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.add(fraction10);
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.abs();
        boolean boolean14 = fraction2.equals((java.lang.Object) fraction12);
        java.lang.Class<?> wildcardClass15 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 1, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        int int5 = fraction3.getProperWhole();
        int int6 = fraction3.getDenominator();
        short short7 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) -1);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.reduce();
        byte byte4 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.abs();
        byte byte9 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = fraction2.toString();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.abs();
        short short6 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10/1" + "'", str3, "-10/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -10 + "'", short6 == (short) -10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        java.lang.String str20 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction16);
        double double22 = fraction11.doubleValue();
        short short23 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.0d + "'", double12 == 110.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 110.0d + "'", double22 == 110.0d);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 110 + "'", short23 == (short) 110);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction19 = fraction16.subtract(fraction18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) ' ', (-10), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction10 = fraction1.pow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction7 = fraction0.pow((int) (byte) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        float float3 = fraction1.floatValue();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        double double7 = fraction5.doubleValue();
        int int8 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        long long18 = fraction17.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction10.add(fraction17);
        int int20 = fraction17.getDenominator();
        org.apache.commons.lang.math.Fraction fraction21 = fraction5.add(fraction17);
        float float22 = fraction17.floatValue();
        int int23 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction24 = fraction2.divideBy(fraction17);
        byte byte25 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -10 + "'", byte25 == (byte) -10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        long long10 = fraction6.longValue();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.add(fraction11);
        int int14 = fraction6.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fraction4.compareTo((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        int int3 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 0, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.abs();
        int int6 = fraction2.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        long long9 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.add(fraction8);
        int int11 = fraction10.getNumerator();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = fraction10.compareTo(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(33, 52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow((int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(4, (int) (short) 110);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        short short4 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction3.negate();
        int int6 = fraction5.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(52, (int) (short) 10, (int) ' ');
        int int4 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        double double9 = fraction1.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction11 = fraction1.pow((int) (byte) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.Class<?> wildcardClass6 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        java.lang.String str18 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction23 = fraction21.pow(0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = fraction13.compareTo((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 0, (-10), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction9 = fraction5.pow(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        int int14 = fraction12.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction16 = fraction12.pow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        int int1 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        int int18 = fraction6.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction19 = fraction2.add(fraction6);
        org.apache.commons.lang.math.Fraction fraction20 = fraction0.multiplyBy(fraction19);
        double double21 = fraction19.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.85d + "'", double21 == 0.85d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        int int3 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        long long11 = fraction3.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction3.negate();
        java.lang.Class<?> wildcardClass13 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.subtract(fraction8);
        int int10 = fraction2.compareTo((java.lang.Object) fraction8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fraction2.compareTo((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -10 + "'", byte5 == (byte) -10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE;
        int int12 = fraction11.getProperWhole();
        int int13 = fraction11.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        short short15 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        java.lang.String str13 = fraction1.toString();
        long long14 = fraction1.longValue();
        int int15 = fraction1.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10/1" + "'", str13, "10/1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int5 = fraction4.getDenominator();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.reduce();
        float float7 = fraction4.floatValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction2.multiplyBy(fraction4);
        java.lang.String str9 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1/10" + "'", str9, "1/10");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(52, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        int int5 = fraction3.getProperWhole();
        int int6 = fraction3.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fraction3.compareTo((java.lang.Object) "3/1");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.String is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        int int6 = fraction5.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        byte byte25 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction5.getProperNumerator();
        double double7 = fraction5.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.4d + "'", double7 == 10.4d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -32, (int) (short) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        java.lang.String str13 = fraction1.toString();
        java.lang.String str14 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10/1" + "'", str13, "10/1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10/1" + "'", str14, "10/1");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int3 = fraction0.compareTo((java.lang.Object) fraction2);
        short short4 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -1, (int) (short) -10);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction5 = fraction2.add(fraction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long1 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        java.lang.String str4 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int6 = fraction5.intValue();
        int int7 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int11 = fraction10.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.divideBy(fraction10);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int14 = fraction13.getProperNumerator();
        int int15 = fraction12.compareTo((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        int int17 = fraction16.getProperWhole();
        int int18 = fraction16.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.divideBy(fraction16);
        int int20 = fraction16.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = fraction0.compareTo((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/2" + "'", str4, "1/2");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        int int25 = fraction22.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        int int12 = fraction4.getDenominator();
        java.lang.Class<?> wildcardClass13 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction22);
        java.lang.String str27 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction30 = fraction12.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction31);
        java.lang.String str35 = fraction34.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1 2/5" + "'", str35, "1 2/5");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        java.lang.String str20 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction16);
        double double22 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction11.abs();
        short short24 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.0d + "'", double12 == 110.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 110.0d + "'", double22 == 110.0d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 110 + "'", short24 == (short) 110);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        java.lang.String str20 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction16);
        int int22 = fraction11.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.0d + "'", double12 == 110.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(165, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        int int10 = fraction8.getProperWhole();
        int int11 = fraction3.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.pow(0);
        org.apache.commons.lang.math.Fraction fraction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction15 = fraction3.multiplyBy(fraction14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(52, (int) (short) 10, (int) ' ');
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.reduce();
        int int5 = fraction4.intValue();
        java.lang.Class<?> wildcardClass6 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (byte) -10);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction3.invert();
        int int8 = fraction7.getDenominator();
        short short9 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        java.lang.String str4 = fraction0.toProperString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction6 = fraction0.pow((int) (short) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/2" + "'", str4, "1/2");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        double double25 = fraction22.doubleValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int29 = fraction28.intValue();
        float float30 = fraction28.floatValue();
        java.lang.String str31 = fraction28.toString();
        long long32 = fraction28.longValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction28.add(fraction33);
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.abs();
        org.apache.commons.lang.math.Fraction fraction37 = fraction27.multiplyBy(fraction36);
        int int38 = fraction22.compareTo((java.lang.Object) fraction27);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.6d + "'", double25 == 9.6d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.4f + "'", float30 == 0.4f);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2/5" + "'", str31, "2/5");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(52, (int) (short) 10, (int) ' ');
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.reduce();
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        boolean boolean8 = fraction5.equals((java.lang.Object) 3);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.negate();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction10.add(fraction13);
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction17 = fraction13.invert();
        int int18 = fraction17.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = fraction9.compareTo((java.lang.Object) int18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.negate();
        boolean boolean15 = fraction4.equals((java.lang.Object) fraction14);
        int int16 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction0.add(fraction4);
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int21 = fraction20.intValue();
        double double22 = fraction20.doubleValue();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        float float28 = fraction26.floatValue();
        java.lang.String str29 = fraction26.toString();
        org.apache.commons.lang.math.Fraction fraction30 = fraction24.subtract(fraction26);
        java.lang.String str31 = fraction26.toProperString();
        org.apache.commons.lang.math.Fraction fraction32 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction33 = fraction20.divideBy(fraction32);
        int int34 = fraction33.getNumerator();
        org.apache.commons.lang.math.Fraction fraction35 = fraction17.subtract(fraction33);
        short short36 = fraction33.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.4f + "'", float28 == 0.4f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2/5" + "'", str31, "2/5");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 0 + "'", short36 == (short) 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction22);
        java.lang.String str27 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction30 = fraction12.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction31);
        short short35 = fraction31.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.add(fraction8);
        byte byte10 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction4.getDenominator();
        int int12 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction4.pow(3);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.negate();
        boolean boolean15 = fraction4.equals((java.lang.Object) fraction14);
        int int16 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction0.add(fraction4);
        byte byte18 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.reduce();
        org.apache.commons.lang.math.Fraction fraction23 = fraction22.negate();
        short short24 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        java.lang.String str13 = fraction1.toString();
        long long14 = fraction1.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction16 = fraction1.add(fraction15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10/1" + "'", str13, "10/1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        float float6 = fraction4.floatValue();
        java.lang.String str7 = fraction4.toString();
        long long8 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.subtract(fraction4);
        java.lang.Class<?> wildcardClass13 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.4f + "'", float6 == 0.4f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2/5" + "'", str7, "2/5");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int10 = fraction9.intValue();
        double double11 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.subtract(fraction15);
        java.lang.String str20 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction6.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int26 = fraction25.intValue();
        int int27 = fraction25.getDenominator();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int31 = fraction30.getDenominator();
        org.apache.commons.lang.math.Fraction fraction32 = fraction25.divideBy(fraction30);
        float float33 = fraction32.floatValue();
        int int34 = fraction24.compareTo((java.lang.Object) fraction32);
        int int35 = fraction24.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.4f + "'", float17 == 0.4f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.025f + "'", float33 == 0.025f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        float float13 = fraction4.floatValue();
        boolean boolean14 = fraction0.equals((java.lang.Object) float13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction16 = fraction0.pow(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.1f + "'", float13 == 0.1f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        java.lang.String str20 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction23 = fraction11.pow((int) (short) 0);
        byte byte24 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.0d + "'", double12 == 110.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 110 + "'", byte24 == (byte) 110);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow((int) (short) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        int int1 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        int int18 = fraction6.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction19 = fraction2.add(fraction6);
        org.apache.commons.lang.math.Fraction fraction20 = fraction0.multiplyBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.negate();
        short short22 = fraction21.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.reduce();
        double double4 = fraction3.doubleValue();
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.negate();
        boolean boolean15 = fraction4.equals((java.lang.Object) fraction14);
        int int16 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction0.add(fraction4);
        byte byte18 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        int int5 = fraction3.getDenominator();
        long long6 = fraction3.longValue();
        int int7 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        int int10 = fraction8.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.invert();
        java.lang.String str16 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.reduce();
        org.apache.commons.lang.math.Fraction fraction18 = fraction8.add(fraction17);
        boolean boolean19 = fraction3.equals((java.lang.Object) fraction18);
        int int20 = fraction18.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.pow((int) (short) -1);
        double double11 = fraction10.doubleValue();
        java.lang.Class<?> wildcardClass12 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getDenominator();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) ' ', 23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        int int18 = fraction16.getProperWhole();
        java.lang.Class<?> wildcardClass19 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, 2, (int) (short) 10);
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1002 + "'", int4 == 1002);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        java.lang.Class<?> wildcardClass7 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int19 = fraction18.intValue();
        double double20 = fraction18.doubleValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        float float26 = fraction24.floatValue();
        java.lang.String str27 = fraction24.toString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.subtract(fraction24);
        java.lang.String str29 = fraction24.toProperString();
        org.apache.commons.lang.math.Fraction fraction30 = fraction24.invert();
        org.apache.commons.lang.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang.math.Fraction fraction32 = fraction14.subtract(fraction30);
        short short33 = fraction32.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.4f + "'", float26 == 0.4f);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 0 + "'", short33 == (short) 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        float float4 = fraction2.floatValue();
        java.lang.String str5 = fraction2.toString();
        long long6 = fraction2.longValue();
        int int7 = fraction0.compareTo((java.lang.Object) fraction2);
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.reduce();
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.4f + "'", float4 == 0.4f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2/5" + "'", str5, "2/5");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        java.lang.Class<?> wildcardClass6 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 0.4f);
        boolean boolean11 = fraction0.equals((java.lang.Object) fraction10);
        java.lang.String str12 = fraction10.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        float float8 = fraction0.floatValue();
        byte byte9 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction19 = fraction13.pow(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        java.lang.Class<?> wildcardClass9 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        java.lang.String str22 = fraction21.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/10" + "'", str22, "1/10");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        float float12 = fraction10.floatValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction7.subtract(fraction10);
        int int14 = fraction13.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-10.0f) + "'", float12 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow((int) (short) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction19 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.divideBy(fraction16);
        byte byte21 = fraction20.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        java.lang.String str7 = fraction3.toProperString();
        java.lang.Class<?> wildcardClass8 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        int int19 = fraction16.intValue();
        float float20 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction8.subtract(fraction16);
        java.lang.Class<?> wildcardClass22 = fraction21.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.pow((int) (short) -1);
        short short8 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.reduce();
        int int4 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        byte byte11 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.pow((-1));
        int int18 = fraction17.getNumerator();
        int int19 = fraction17.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int10 = fraction9.intValue();
        int int11 = fraction9.getDenominator();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int15 = fraction14.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int18 = fraction17.getProperNumerator();
        int int19 = fraction16.compareTo((java.lang.Object) fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        float float22 = fraction20.floatValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction17.divideBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction24 = fraction0.multiplyBy(fraction17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction26 = fraction0.pow(23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.4f + "'", float22 == 0.4f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        float float13 = fraction12.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction3.add(fraction12);
        java.lang.Class<?> wildcardClass15 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fraction2.compareTo((java.lang.Object) "0");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.String is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -10, (int) 'a');
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction7.divideBy(fraction10);
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.subtract(fraction10);
        short short14 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(23, (int) (short) 110, (int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 10, (int) '4', 4);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("1/4");
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        float float12 = fraction10.floatValue();
        java.lang.String str13 = fraction10.toString();
        long long14 = fraction10.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction10.add(fraction15);
        org.apache.commons.lang.math.Fraction fraction18 = fraction9.multiplyBy(fraction15);
        boolean boolean19 = fraction4.equals((java.lang.Object) fraction9);
        byte byte20 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.4f + "'", float12 == 0.4f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-10), (-10), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        java.lang.String str3 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.divideBy(fraction5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction8 = fraction0.pow(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4/5" + "'", str3, "4/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 1.0f);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction7 = fraction4.pow(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        float float7 = fraction4.floatValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction4.negate();
        java.lang.Class<?> wildcardClass9 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.reduce();
        int int23 = fraction22.getProperWhole();
        int int24 = fraction22.getNumerator();
        byte byte25 = fraction22.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        int int2 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        double double25 = fraction22.doubleValue();
        int int26 = fraction22.getNumerator();
        java.lang.Class<?> wildcardClass27 = fraction22.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 9.6d + "'", double25 == 9.6d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int3 = fraction2.intValue();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        java.lang.Object obj9 = null;
        boolean boolean10 = fraction0.equals(obj9);
        java.lang.Class<?> wildcardClass11 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 110, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        java.lang.String str3 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.divideBy(fraction5);
        float float7 = fraction5.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4/5" + "'", str3, "4/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        java.lang.String str5 = fraction1.toString();
        int int6 = fraction1.getProperWhole();
        int int7 = fraction1.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction9 = fraction1.pow(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        int int12 = fraction10.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.add(fraction10);
        java.lang.String str14 = fraction10.toProperString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction16 = fraction10.pow(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1/10" + "'", str14, "1/10");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction24 = fraction22.pow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.add(fraction10);
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.abs();
        boolean boolean14 = fraction2.equals((java.lang.Object) fraction12);
        int int15 = fraction2.getDenominator();
        int int16 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction15 = fraction4.divideBy(fraction14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        java.lang.String str2 = fraction1.toProperString();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        int int30 = fraction28.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction31 = fraction23.add(fraction28);
        java.lang.String str32 = fraction28.toProperString();
        org.apache.commons.lang.math.Fraction fraction33 = fraction17.subtract(fraction28);
        java.lang.Class<?> wildcardClass34 = fraction28.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1/10" + "'", str32, "1/10");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.add(fraction10);
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.abs();
        boolean boolean14 = fraction2.equals((java.lang.Object) fraction12);
        double double15 = fraction2.doubleValue();
        int int16 = fraction2.getNumerator();
        java.lang.Class<?> wildcardClass17 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-10.0d) + "'", double15 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -32, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.reduce();
        int int23 = fraction22.getProperWhole();
        int int24 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long26 = fraction25.longValue();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = fraction22.compareTo((java.lang.Object) long26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(1003833);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        int int25 = fraction3.intValue();
        short short26 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        java.lang.String str18 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction25 = fraction19.subtract(fraction24);
        int int26 = fraction13.compareTo((java.lang.Object) fraction24);
        int int27 = fraction24.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33 + "'", int27 == 33);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.invert();
        java.lang.String str24 = fraction18.toString();
        java.lang.Class<?> wildcardClass25 = fraction18.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1/40" + "'", str24, "1/40");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction1.subtract(fraction3);
        java.lang.String str8 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int11 = fraction10.getProperNumerator();
        int int12 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang.math.Fraction fraction22 = fraction17.add(fraction20);
        int int23 = fraction14.compareTo((java.lang.Object) fraction17);
        int int24 = fraction17.getDenominator();
        org.apache.commons.lang.math.Fraction fraction25 = fraction10.divideBy(fraction17);
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang.math.Fraction fraction27 = fraction9.subtract(fraction26);
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2/5" + "'", str6, "2/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.negate();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang.math.Fraction fraction23 = fraction16.subtract(fraction21);
        int int24 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.negate();
        boolean boolean27 = fraction16.equals((java.lang.Object) fraction26);
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction30 = fraction16.divideBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang.math.Fraction fraction36 = fraction31.add(fraction34);
        int int37 = fraction36.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.intValue();
        org.apache.commons.lang.math.Fraction fraction41 = fraction39.invert();
        org.apache.commons.lang.math.Fraction fraction42 = fraction41.invert();
        int int43 = fraction41.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction44 = fraction36.add(fraction41);
        java.lang.String str45 = fraction41.toProperString();
        org.apache.commons.lang.math.Fraction fraction46 = fraction30.subtract(fraction41);
        int int47 = fraction12.compareTo((java.lang.Object) fraction46);
        int int48 = fraction12.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = fraction5.compareTo((java.lang.Object) int48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1/10" + "'", str45, "1/10");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-100) + "'", int48 == (-100));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 0, (int) (byte) 110);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("110/1");
        int int2 = fraction1.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        float float13 = fraction4.floatValue();
        boolean boolean14 = fraction0.equals((java.lang.Object) float13);
        long long15 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.1f + "'", float13 == 0.1f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3/1" + "'", str3, "3/1");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.subtract(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.invert();
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction13.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction13);
        double double22 = fraction21.doubleValue();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang.math.Fraction fraction28 = fraction23.add(fraction26);
        java.lang.String str29 = fraction26.toProperString();
        java.lang.String str30 = fraction26.toProperString();
        org.apache.commons.lang.math.Fraction fraction31 = fraction21.add(fraction26);
        org.apache.commons.lang.math.Fraction fraction32 = fraction9.multiplyBy(fraction31);
        int int33 = fraction9.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 110.0d + "'", double22 == 110.0d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 10, 17, (int) '#');
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 100, (int) (byte) 33);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int4 = fraction3.intValue();
        int int5 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int9 = fraction8.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        int int13 = fraction10.compareTo((java.lang.Object) fraction11);
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.ONE;
        int int15 = fraction14.getProperWhole();
        int int16 = fraction14.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction11.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction18 = fraction2.add(fraction17);
        byte byte19 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 3 + "'", byte19 == (byte) 3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("1/1");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction19 = fraction12.subtract(fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = fraction8.multiplyBy(fraction19);
        int int21 = fraction20.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction23 = fraction20.pow((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(5, (int) ' ', (int) (short) 110);
        java.lang.String str4 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "582/110" + "'", str4, "582/110");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int10 = fraction9.intValue();
        double double11 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.subtract(fraction15);
        java.lang.String str20 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction6.add(fraction22);
        double double25 = fraction6.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.4f + "'", float17 == 0.4f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.1d + "'", double25 == 0.1d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction22);
        java.lang.String str27 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction30 = fraction12.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction31);
        short short35 = fraction34.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 1 + "'", short35 == (short) 1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        float float3 = fraction1.floatValue();
        org.apache.commons.lang.math.Fraction fraction5 = fraction1.pow((int) (short) 0);
        byte byte6 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction8.reduce();
        short short12 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 165);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.ONE_FIFTH;
        boolean boolean8 = fraction0.equals((java.lang.Object) fraction7);
        java.lang.String str9 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1/1" + "'", str9, "1/1");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-10");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 100, 33);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int10 = fraction9.intValue();
        double double11 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.subtract(fraction15);
        java.lang.String str20 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction6.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction6.multiplyBy(fraction26);
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = fraction26.compareTo(obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.4f + "'", float17 == 0.4f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("5/3");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.pow((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction22);
        java.lang.String str27 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction30 = fraction12.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction31);
        org.apache.commons.lang.math.Fraction fraction35 = fraction16.abs();
        java.lang.String str36 = fraction16.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1/1" + "'", str36, "1/1");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        java.lang.String str18 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction25 = fraction19.subtract(fraction24);
        int int26 = fraction13.compareTo((java.lang.Object) fraction24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction28 = fraction24.pow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        float float4 = fraction2.floatValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int8 = fraction7.intValue();
        double double9 = fraction7.doubleValue();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        float float15 = fraction13.floatValue();
        java.lang.String str16 = fraction13.toString();
        org.apache.commons.lang.math.Fraction fraction17 = fraction11.subtract(fraction13);
        java.lang.String str18 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction7.divideBy(fraction19);
        int int21 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction2.multiplyBy(fraction19);
        java.lang.String str23 = fraction19.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.4f + "'", float15 == 0.4f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2/5" + "'", str16, "2/5");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2 1/2" + "'", str23, "2 1/2");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(4, 165);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.pow(0);
        int int4 = fraction3.intValue();
        boolean boolean6 = fraction3.equals((java.lang.Object) 0.025f);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', 4, 52);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int6 = fraction5.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int8 = fraction5.compareTo((java.lang.Object) fraction7);
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.subtract(fraction5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction11 = fraction3.pow(1003833);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.pow(6);
        java.lang.String str10 = fraction5.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10/1" + "'", str10, "10/1");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        java.lang.String str2 = fraction1.toProperString();
        short short3 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int19 = fraction18.intValue();
        double double20 = fraction18.doubleValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        float float26 = fraction24.floatValue();
        java.lang.String str27 = fraction24.toString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.subtract(fraction24);
        java.lang.String str29 = fraction24.toProperString();
        org.apache.commons.lang.math.Fraction fraction30 = fraction24.invert();
        org.apache.commons.lang.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang.math.Fraction fraction32 = fraction14.subtract(fraction30);
        short short33 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.4f + "'", float26 == 0.4f);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 2 + "'", short33 == (short) 2);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction5.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction17 = fraction10.divideBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction18 = fraction8.add(fraction10);
        org.apache.commons.lang.math.Fraction fraction19 = fraction5.add(fraction8);
        byte byte20 = fraction19.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 110 + "'", byte20 == (byte) 110);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) -10, (int) (byte) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.invert();
        java.lang.String str24 = fraction18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction26 = fraction18.pow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1/40" + "'", str24, "1/40");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        int int30 = fraction28.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction31 = fraction23.add(fraction28);
        java.lang.String str32 = fraction28.toProperString();
        org.apache.commons.lang.math.Fraction fraction33 = fraction17.subtract(fraction28);
        java.lang.Class<?> wildcardClass34 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1/10" + "'", str32, "1/10");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(4, 1003833, (-66));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.subtract(fraction6);
        short short8 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(0, (int) (byte) -32);
        java.lang.String str3 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        long long23 = fraction22.longValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction22.invert();
        float float25 = fraction22.floatValue();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int30 = fraction29.intValue();
        float float31 = fraction29.floatValue();
        java.lang.String str32 = fraction29.toString();
        org.apache.commons.lang.math.Fraction fraction33 = fraction27.subtract(fraction29);
        int int34 = fraction29.intValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction22.multiplyBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction36 = fraction17.divideBy(fraction35);
        byte byte37 = fraction35.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.4f + "'", float31 == 0.4f);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2/5" + "'", str32, "2/5");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 4 + "'", byte37 == (byte) 4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction6.abs();
        int int10 = fraction6.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 100, (int) ' ');
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 3 + "'", byte3 == (byte) 3);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        float float9 = fraction1.floatValue();
        java.lang.String str10 = fraction1.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        float float7 = fraction4.floatValue();
        double double8 = fraction4.doubleValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int10 = fraction9.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int12 = fraction9.compareTo((java.lang.Object) fraction11);
        org.apache.commons.lang.math.Fraction fraction13 = fraction9.reduce();
        boolean boolean14 = fraction4.equals((java.lang.Object) fraction13);
        java.lang.Class<?> wildcardClass15 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        java.lang.String str20 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction16);
        double double22 = fraction11.doubleValue();
        java.lang.String str23 = fraction11.toString();
        short short24 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 110.0d + "'", double12 == 110.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 110.0d + "'", double22 == 110.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "110/1" + "'", str23, "110/1");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 110 + "'", short24 == (short) 110);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.abs();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.negate();
        org.apache.commons.lang.math.Fraction fraction15 = fraction9.divideBy(fraction14);
        float float16 = fraction15.floatValue();
        short short17 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-0.125f) + "'", float16 == (-0.125f));
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction3.getDenominator();
        byte byte7 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.add(fraction6);
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        int int15 = fraction13.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.invert();
        long long26 = fraction25.longValue();
        org.apache.commons.lang.math.Fraction fraction27 = fraction18.add(fraction25);
        org.apache.commons.lang.math.Fraction fraction28 = fraction13.divideBy(fraction27);
        int int29 = fraction1.compareTo((java.lang.Object) fraction13);
        java.lang.String str30 = fraction13.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/10" + "'", str30, "1/10");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        java.lang.String str8 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        int int19 = fraction16.intValue();
        float float20 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction8.subtract(fraction16);
        java.lang.Class<?> wildcardClass22 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        int int3 = fraction0.getProperNumerator();
        short short4 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-99), (int) (short) 1, 23);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        float float18 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(0);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction8);
        double double17 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        java.lang.String str25 = fraction21.toProperString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction27 = fraction2.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.negate();
        org.apache.commons.lang.math.Fraction fraction36 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int37 = fraction36.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction38 = fraction36.negate();
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long40 = fraction39.longValue();
        org.apache.commons.lang.math.Fraction fraction41 = fraction39.reduce();
        org.apache.commons.lang.math.Fraction fraction42 = fraction36.add(fraction41);
        org.apache.commons.lang.math.Fraction fraction43 = fraction32.add(fraction42);
        int int44 = fraction43.intValue();
        org.apache.commons.lang.math.Fraction fraction45 = fraction2.multiplyBy(fraction43);
        int int46 = fraction43.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-66) + "'", int44 == (-66));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-66) + "'", int46 == (-66));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        boolean boolean7 = fraction5.equals((java.lang.Object) "3/5");
        int int8 = fraction5.getProperWhole();
        byte byte9 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 165 + "'", int8 == 165);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -91 + "'", byte9 == (byte) -91);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 2);
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction1.add(fraction2);
        java.lang.Object obj6 = null;
        boolean boolean7 = fraction5.equals(obj6);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        java.lang.String str10 = fraction7.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4/5" + "'", str10, "4/5");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        int int5 = fraction1.intValue();
        java.lang.Class<?> wildcardClass6 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.add(fraction8);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction11.add(fraction14);
        int int17 = fraction16.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction24.invert();
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction21.divideBy(fraction24);
        org.apache.commons.lang.math.Fraction fraction29 = fraction19.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction30 = fraction16.add(fraction19);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        java.lang.String str34 = fraction31.toString();
        long long35 = fraction31.longValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction31.negate();
        org.apache.commons.lang.math.Fraction fraction37 = fraction16.multiplyBy(fraction31);
        org.apache.commons.lang.math.Fraction fraction38 = fraction9.multiplyBy(fraction31);
        org.apache.commons.lang.math.Fraction fraction39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction40 = fraction38.add(fraction39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 18 + "'", int10 == 18);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2/5" + "'", str34, "2/5");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-66), 1002, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(5, (-66), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        java.lang.String str5 = fraction1.toString();
        int int6 = fraction1.getProperWhole();
        int int7 = fraction1.intValue();
        short short8 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.negate();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction21);
        int int23 = fraction16.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int25 = fraction24.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.multiplyBy(fraction24);
        int int27 = fraction15.compareTo((java.lang.Object) fraction16);
        int int28 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = fraction1.divideBy(fraction15);
        byte byte30 = fraction29.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) -25 + "'", byte30 == (byte) -25);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 0, 100);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction19 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.divideBy(fraction16);
        short short21 = fraction15.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) -1, 0, (int) (byte) -25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        int int15 = fraction13.intValue();
        byte byte16 = fraction13.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 100);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction13 = fraction4.multiplyBy(fraction12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(32, 5, 52);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(20, (int) (short) 1, 2);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        java.lang.String str5 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "41/2" + "'", str5, "41/2");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        java.lang.String str3 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.reduce();
        double double8 = fraction5.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4/5" + "'", str3, "4/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.4d + "'", double8 == 0.4d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int10 = fraction9.intValue();
        double double11 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.subtract(fraction15);
        java.lang.String str20 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction6.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction6.multiplyBy(fraction26);
        byte byte30 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.4f + "'", float17 == 0.4f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 2);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow((int) (short) -10);
        java.lang.Class<?> wildcardClass5 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int8 = fraction7.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        float float10 = fraction7.floatValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.multiplyBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.divideBy(fraction5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction14 = fraction2.pow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        long long15 = fraction14.longValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int20 = fraction19.intValue();
        double double21 = fraction19.doubleValue();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        float float27 = fraction25.floatValue();
        java.lang.String str28 = fraction25.toString();
        org.apache.commons.lang.math.Fraction fraction29 = fraction23.subtract(fraction25);
        java.lang.String str30 = fraction25.toProperString();
        org.apache.commons.lang.math.Fraction fraction31 = fraction25.invert();
        org.apache.commons.lang.math.Fraction fraction32 = fraction19.divideBy(fraction31);
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction32);
        org.apache.commons.lang.math.Fraction fraction36 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int37 = fraction36.intValue();
        org.apache.commons.lang.math.Fraction fraction38 = fraction36.invert();
        org.apache.commons.lang.math.Fraction fraction39 = fraction16.multiplyBy(fraction36);
        org.apache.commons.lang.math.Fraction fraction40 = fraction7.divideBy(fraction36);
        int int41 = fraction36.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.4f + "'", float27 == 0.4f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2/5" + "'", str28, "2/5");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2/5" + "'", str30, "2/5");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.negate();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long12 = fraction11.longValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.reduce();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = fraction4.add(fraction14);
        byte byte16 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -66 + "'", byte16 == (byte) -66);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 2);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow((int) (short) -10);
        java.lang.String str5 = fraction4.toString();
        float float6 = fraction4.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/1024" + "'", str5, "1/1024");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.765625E-4f + "'", float6 == 9.765625E-4f);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-16), 1002);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = fraction2.compareTo((java.lang.Object) "52 10/32");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.String is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.invert();
        java.lang.String str10 = fraction9.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5/4" + "'", str10, "5/4");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        int int4 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int8 = fraction7.intValue();
        double double9 = fraction7.doubleValue();
        float float10 = fraction7.floatValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction2.multiplyBy(fraction7);
        int int12 = fraction2.getProperNumerator();
        java.lang.Class<?> wildcardClass13 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 1);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(0, 20, (-99));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        java.lang.String str5 = fraction1.toString();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.multiplyBy(fraction8);
        int int11 = fraction8.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(18, (int) (byte) -10, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction27 = fraction25.invert();
        org.apache.commons.lang.math.Fraction fraction28 = fraction27.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction22.subtract(fraction27);
        int int30 = fraction22.getDenominator();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.negate();
        boolean boolean33 = fraction22.equals((java.lang.Object) fraction32);
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang.math.Fraction fraction36 = fraction22.divideBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction37 = fraction16.multiplyBy(fraction36);
        org.apache.commons.lang.math.Fraction fraction38 = fraction37.reduce();
        org.apache.commons.lang.math.Fraction fraction39 = fraction2.divideBy(fraction38);
        org.apache.commons.lang.math.Fraction fraction40 = fraction38.invert();
        int int41 = fraction40.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.add(fraction3);
        java.lang.Class<?> wildcardClass12 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(3, 2);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.pow(2);
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.negate();
        org.apache.commons.lang.math.Fraction fraction13 = fraction2.divideBy(fraction5);
        int int14 = fraction13.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 1);
        int int2 = fraction1.getProperNumerator();
        long long3 = fraction1.longValue();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        float float12 = fraction10.floatValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction7.subtract(fraction10);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        float float18 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int22 = fraction21.intValue();
        double double23 = fraction21.doubleValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        float float29 = fraction27.floatValue();
        java.lang.String str30 = fraction27.toString();
        org.apache.commons.lang.math.Fraction fraction31 = fraction25.subtract(fraction27);
        java.lang.String str32 = fraction27.toProperString();
        org.apache.commons.lang.math.Fraction fraction33 = fraction27.invert();
        org.apache.commons.lang.math.Fraction fraction34 = fraction21.divideBy(fraction33);
        int int35 = fraction33.intValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction16.multiplyBy(fraction33);
        boolean boolean37 = fraction10.equals((java.lang.Object) fraction33);
        int int38 = fraction10.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-10.0f) + "'", float12 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-10.0f) + "'", float18 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.4f + "'", float29 == 0.4f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2/5" + "'", str30, "2/5");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2/5" + "'", str32, "2/5");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-10) + "'", int38 == (-10));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -91, (-1), (int) (byte) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction7.subtract(fraction12);
        long long15 = fraction7.longValue();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = fraction2.compareTo((java.lang.Object) long15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Long is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int10 = fraction9.intValue();
        double double11 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        float float17 = fraction15.floatValue();
        java.lang.String str18 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.subtract(fraction15);
        java.lang.String str20 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction6.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction6.multiplyBy(fraction26);
        int int30 = fraction29.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.4f + "'", float17 == 0.4f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2/5" + "'", str18, "2/5");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.add(fraction6);
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        int int15 = fraction13.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.invert();
        long long26 = fraction25.longValue();
        org.apache.commons.lang.math.Fraction fraction27 = fraction18.add(fraction25);
        org.apache.commons.lang.math.Fraction fraction28 = fraction13.divideBy(fraction27);
        int int29 = fraction1.compareTo((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction30 = fraction13.negate();
        byte byte31 = fraction13.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int3 = fraction2.getNumerator();
        int int4 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(5, (int) ' ', (int) (short) 110);
        org.apache.commons.lang.math.Fraction fraction9 = fraction2.add(fraction8);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        java.lang.String str2 = fraction1.toString();
        long long3 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10/1" + "'", str2, "10/1");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 110, (int) (byte) -32);
        java.lang.String str3 = fraction2.toString();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-55/16" + "'", str3, "-55/16");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(0);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction8);
        double double17 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        java.lang.String str25 = fraction21.toProperString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction27 = fraction2.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction34 = fraction28.subtract(fraction33);
        org.apache.commons.lang.math.Fraction fraction35 = fraction27.add(fraction33);
        java.lang.Class<?> wildcardClass36 = fraction27.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int10 = fraction9.intValue();
        int int11 = fraction9.getDenominator();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int15 = fraction14.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int18 = fraction17.getProperNumerator();
        int int19 = fraction16.compareTo((java.lang.Object) fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        float float22 = fraction20.floatValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction17.divideBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction24 = fraction0.multiplyBy(fraction17);
        int int25 = fraction17.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.4f + "'", float22 == 0.4f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(3, 2);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(4, 32);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        int int2 = fraction0.intValue();
        byte byte3 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int8 = fraction7.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        float float10 = fraction7.floatValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.multiplyBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        java.lang.String str18 = fraction17.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction17.reduce();
        int int20 = fraction5.compareTo((java.lang.Object) fraction17);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = fraction17.compareTo((java.lang.Object) "9");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.String is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -66, 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        int int3 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        double double7 = fraction5.doubleValue();
        long long8 = fraction5.longValue();
        short short9 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 33.0d + "'", double7 == 33.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 33L + "'", long8 == 33L);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 33 + "'", short9 == (short) 33);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        int int11 = fraction1.intValue();
        int int12 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.negate();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction21);
        int int23 = fraction16.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int25 = fraction24.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.multiplyBy(fraction24);
        int int27 = fraction15.compareTo((java.lang.Object) fraction16);
        int int28 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = fraction1.divideBy(fraction15);
        java.lang.String str30 = fraction15.toString();
        float float31 = fraction15.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-2/5" + "'", str30, "-2/5");
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-0.4f) + "'", float31 == (-0.4f));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.add(fraction18);
        int int21 = fraction12.compareTo((java.lang.Object) fraction15);
        long long22 = fraction15.longValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction15.invert();
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int28 = fraction27.intValue();
        double double29 = fraction27.doubleValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        java.lang.String str36 = fraction33.toString();
        org.apache.commons.lang.math.Fraction fraction37 = fraction31.subtract(fraction33);
        java.lang.String str38 = fraction33.toProperString();
        org.apache.commons.lang.math.Fraction fraction39 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction40 = fraction27.divideBy(fraction39);
        org.apache.commons.lang.math.Fraction fraction41 = fraction23.subtract(fraction27);
        org.apache.commons.lang.math.Fraction fraction42 = fraction9.divideBy(fraction41);
        long long43 = fraction41.longValue();
        float float44 = fraction41.floatValue();
        java.lang.Class<?> wildcardClass45 = fraction41.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.4f + "'", float35 == 0.4f);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2/5" + "'", str36, "2/5");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2/5" + "'", str38, "2/5");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.5f + "'", float44 == 1.5f);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int4 = fraction3.intValue();
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33 + "'", int4 == 33);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 33 + "'", short5 == (short) 33);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-32), (-10), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        short short11 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("3/1");
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3/1" + "'", str2, "3/1");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(6, (-32), (int) (byte) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) 'a', (int) ' ');
        long long3 = fraction2.longValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.reduce();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fraction4.compareTo(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(0);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction8);
        double double17 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        java.lang.String str25 = fraction21.toProperString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction27 = fraction2.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction28 = fraction16.reduce();
        short short29 = fraction28.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 110.0d + "'", double17 == 110.0d);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 110 + "'", short29 == (short) 110);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        int int4 = fraction2.getNumerator();
        int int5 = fraction2.getProperNumerator();
        int int6 = fraction2.getDenominator();
        double double7 = fraction2.doubleValue();
        byte byte8 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6666666666666667d + "'", double7 == 1.6666666666666667d);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.add(fraction8);
        int int10 = fraction0.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction2.pow(2);
        int int9 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        double double7 = fraction3.doubleValue();
        long long8 = fraction3.longValue();
        java.lang.Class<?> wildcardClass9 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.divideBy(fraction16);
        int int18 = fraction17.getNumerator();
        int int19 = fraction17.getProperNumerator();
        byte byte20 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) 'a', (int) ' ');
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.03125d + "'", double3 == 3.03125d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.abs();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction("4/1");
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang.math.Fraction fraction27 = fraction18.subtract(fraction26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction29 = fraction26.pow(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction5.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        java.lang.String str1 = fraction0.toString();
        short short2 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1/4" + "'", str1, "1/4");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        int int2 = fraction0.intValue();
        long long3 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        double double7 = fraction5.doubleValue();
        int int8 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        long long18 = fraction17.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction10.add(fraction17);
        int int20 = fraction17.getDenominator();
        org.apache.commons.lang.math.Fraction fraction21 = fraction5.add(fraction17);
        float float22 = fraction17.floatValue();
        int int23 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction24 = fraction2.divideBy(fraction17);
        int int25 = fraction17.getNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction27 = fraction17.multiplyBy(fraction26);
        int int28 = fraction27.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 0.4f);
        boolean boolean11 = fraction0.equals((java.lang.Object) fraction10);
        int int12 = fraction0.getProperNumerator();
        int int13 = fraction0.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction2.pow(2);
        short short9 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        int int4 = fraction2.getNumerator();
        int int5 = fraction2.getProperNumerator();
        byte byte6 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        float float4 = fraction2.floatValue();
        java.lang.String str5 = fraction2.toString();
        long long6 = fraction2.longValue();
        int int7 = fraction0.compareTo((java.lang.Object) fraction2);
        byte byte8 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.4f + "'", float4 == 0.4f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2/5" + "'", str5, "2/5");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(0);
        org.apache.commons.lang.math.Fraction fraction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction6 = fraction4.multiplyBy(fraction5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.reduce();
        org.apache.commons.lang.math.Fraction fraction23 = fraction22.negate();
        short short24 = fraction22.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        short short15 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        float float12 = fraction10.floatValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction7.subtract(fraction10);
        int int14 = fraction10.getNumerator();
        int int15 = fraction10.getDenominator();
        byte byte16 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-10.0f) + "'", float12 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10) + "'", int14 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -10 + "'", byte16 == (byte) -10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 1, (int) (short) 1, 4);
        int int4 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        double double9 = fraction1.doubleValue();
        int int10 = fraction1.getProperWhole();
        int int11 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(52, (-99), (int) (byte) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) ' ', 33, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction5 = fraction3.pow((int) (byte) -25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        int int5 = fraction3.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        int int8 = fraction6.getDenominator();
        boolean boolean9 = fraction3.equals((java.lang.Object) int8);
        org.apache.commons.lang.math.Fraction fraction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction11 = fraction3.multiplyBy(fraction10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        float float3 = fraction0.floatValue();
        double double4 = fraction0.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(2, (int) (byte) 10);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int16 = fraction15.getDenominator();
        java.lang.String str17 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.negate();
        org.apache.commons.lang.math.Fraction fraction21 = fraction18.pow(0);
        int int22 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction15.divideBy(fraction21);
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int25 = fraction24.intValue();
        int int26 = fraction24.getDenominator();
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int30 = fraction29.getDenominator();
        org.apache.commons.lang.math.Fraction fraction31 = fraction24.divideBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int33 = fraction32.getProperNumerator();
        int int34 = fraction31.compareTo((java.lang.Object) fraction32);
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int36 = fraction35.intValue();
        float float37 = fraction35.floatValue();
        org.apache.commons.lang.math.Fraction fraction38 = fraction32.divideBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction39 = fraction15.multiplyBy(fraction32);
        org.apache.commons.lang.math.Fraction fraction40 = fraction3.divideBy(fraction15);
        short short41 = fraction40.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4/5" + "'", str17, "4/5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.4f + "'", float37 == 0.4f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 0 + "'", short41 == (short) 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int3 = fraction0.compareTo((java.lang.Object) fraction2);
        org.apache.commons.lang.math.Fraction fraction4 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.reduce();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) -1);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-16), (int) (byte) -10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        java.lang.String str2 = fraction1.toProperString();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction3.reduce();
        float float8 = fraction3.floatValue();
        org.apache.commons.lang.math.Fraction fraction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction10 = fraction3.multiplyBy(fraction9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        java.lang.String str2 = fraction1.toString();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = fraction1.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10/1" + "'", str2, "10/1");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-16), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction19 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.divideBy(fraction16);
        float float21 = fraction20.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.6f + "'", float21 == 0.6f);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, 4);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 3, 32);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 100);
        int int3 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = fraction2.toString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        float float11 = fraction9.floatValue();
        java.lang.String str12 = fraction9.toString();
        long long13 = fraction9.longValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.add(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = fraction8.multiplyBy(fraction14);
        long long18 = fraction17.longValue();
        boolean boolean19 = fraction2.equals((java.lang.Object) fraction17);
        int int20 = fraction17.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10/1" + "'", str3, "-10/1");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.4f + "'", float11 == 0.4f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4L + "'", long18 == 4L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.abs();
        java.lang.String str5 = fraction4.toProperString();
        java.lang.String str6 = fraction4.toString();
        double double7 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3" + "'", str5, "3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3/1" + "'", str6, "3/1");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', 4, 52);
        long long4 = fraction3.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        java.lang.String str12 = fraction9.toProperString();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.divideBy(fraction9);
        java.lang.String str14 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction16 = fraction3.multiplyBy(fraction13);
        byte byte17 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 35 + "'", byte17 == (byte) 35);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.add(fraction13);
        float float18 = fraction13.floatValue();
        int int19 = fraction13.getNumerator();
        byte byte20 = fraction13.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        long long9 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.abs();
        byte byte12 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        float float3 = fraction0.floatValue();
        boolean boolean5 = fraction0.equals((java.lang.Object) "582/110");
        int int6 = fraction0.getProperNumerator();
        short short7 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.negate();
        long long7 = fraction3.longValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.invert();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction5 = fraction3.pow((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(1002, (int) (short) 5);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.abs();
        int int10 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction11 = fraction0.reduce();
        int int12 = fraction11.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction8);
        java.lang.String str13 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction2.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction27 = fraction25.invert();
        org.apache.commons.lang.math.Fraction fraction28 = fraction27.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction22.subtract(fraction27);
        int int30 = fraction22.getDenominator();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.negate();
        boolean boolean33 = fraction22.equals((java.lang.Object) fraction32);
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang.math.Fraction fraction36 = fraction22.divideBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction37 = fraction16.multiplyBy(fraction36);
        org.apache.commons.lang.math.Fraction fraction38 = fraction37.reduce();
        org.apache.commons.lang.math.Fraction fraction39 = fraction2.divideBy(fraction38);
        byte byte40 = fraction39.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2/5" + "'", str13, "2/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 10 + "'", byte40 == (byte) 10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        java.lang.String str29 = fraction26.toProperString();
        boolean boolean30 = fraction22.equals((java.lang.Object) str29);
        int int31 = fraction22.getDenominator();
        short short32 = fraction22.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) 9 + "'", short32 == (short) 9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.negate();
        double double4 = fraction0.doubleValue();
        long long5 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.negate();
        int int3 = fraction0.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        long long14 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction6.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang.math.Fraction fraction27 = fraction20.subtract(fraction25);
        int int28 = fraction20.getDenominator();
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction30 = fraction29.negate();
        boolean boolean31 = fraction20.equals((java.lang.Object) fraction30);
        int int32 = fraction20.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction33 = fraction16.add(fraction20);
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int36 = fraction33.compareTo((java.lang.Object) fraction35);
        int int37 = fraction33.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction38 = fraction13.add(fraction33);
        int int39 = fraction4.compareTo((java.lang.Object) fraction38);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 17 + "'", int37 == 17);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -32, (int) (short) -10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction(100, 2, (int) (short) 10);
        org.apache.commons.lang.math.Fraction fraction14 = fraction0.subtract(fraction13);
        int int15 = fraction0.getNumerator();
        java.lang.Class<?> wildcardClass16 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow((-16));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.negate();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long12 = fraction11.longValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.reduce();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction15 = fraction4.add(fraction14);
        int int16 = fraction4.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-100) + "'", int16 == (-100));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.subtract(fraction11);
        int int14 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.negate();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction6.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction0.multiplyBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.reduce();
        int int23 = fraction22.getProperWhole();
        int int24 = fraction22.getNumerator();
        double double25 = fraction22.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.1d + "'", double25 == 0.1d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        int int19 = fraction16.intValue();
        float float20 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction8.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = fraction21.compareTo((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.apache.commons.lang.math.Fraction (java.lang.Byte is in module java.base of loader 'bootstrap'; org.apache.commons.lang.math.Fraction is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        float float4 = fraction2.floatValue();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.abs();
        float float6 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-10.0f) + "'", float4 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-10.0f) + "'", float6 == (-10.0f));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(0, 10, (int) '#');
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int5 = fraction4.getDenominator();
        java.lang.String str6 = fraction4.toString();
        int int7 = fraction4.getProperWhole();
        int int8 = fraction3.compareTo((java.lang.Object) fraction4);
        java.lang.String str9 = fraction3.toProperString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/5" + "'", str6, "4/5");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10/35" + "'", str9, "10/35");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        int int6 = fraction5.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22540 + "'", int6 == 22540);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.multiplyBy(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.reduce();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.abs();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction9);
        long long11 = fraction3.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.subtract(fraction9);
        int int12 = fraction4.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.negate();
        boolean boolean15 = fraction4.equals((java.lang.Object) fraction14);
        int int16 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction0.add(fraction4);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int20 = fraction17.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.abs();
        org.apache.commons.lang.math.Fraction fraction27 = fraction25.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction28 = fraction17.subtract(fraction27);
        org.apache.commons.lang.math.Fraction fraction29 = fraction27.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        int int1 = fraction0.getProperWhole();
        byte byte2 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = fraction0.pow((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.abs();
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.invert();
        short short7 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = fraction7.add(fraction10);
        java.lang.String str13 = fraction10.toProperString();
        org.apache.commons.lang.math.Fraction fraction14 = fraction10.reduce();
        int int15 = fraction14.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.add(fraction14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction18 = fraction14.pow(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.abs();
        byte byte10 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        double double7 = fraction5.doubleValue();
        int int8 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        long long18 = fraction17.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction10.add(fraction17);
        int int20 = fraction17.getDenominator();
        org.apache.commons.lang.math.Fraction fraction21 = fraction5.add(fraction17);
        float float22 = fraction17.floatValue();
        int int23 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction24 = fraction2.divideBy(fraction17);
        int int25 = fraction17.getNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction27 = fraction17.multiplyBy(fraction26);
        org.apache.commons.lang.math.Fraction fraction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction29 = fraction17.subtract(fraction28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = fraction2.toString();
        int int4 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction7 = fraction5.pow(33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10/1" + "'", str3, "-10/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        int int12 = fraction10.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.add(fraction10);
        long long14 = fraction13.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 2, (int) (byte) 35);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -32, (int) (short) -10);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(2, (int) (byte) 10);
        java.lang.String str3 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/10" + "'", str3, "2/10");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction3.negate();
        int int6 = fraction5.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction4.pow(1);
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.negate();
        int int10 = fraction9.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-10L) + "'", long5 == (-10L));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) -10, (int) (short) -10);
        int int3 = fraction2.getDenominator();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        int int3 = fraction2.getProperWhole();
        java.lang.String str4 = fraction2.toProperString();
        short short5 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/10" + "'", str4, "1/10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(18, (-100));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        int int4 = fraction2.getNumerator();
        int int5 = fraction2.getProperNumerator();
        int int6 = fraction2.getDenominator();
        double double7 = fraction2.doubleValue();
        double double8 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.6666666666666667d + "'", double7 == 1.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.6666666666666667d + "'", double8 == 1.6666666666666667d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        java.lang.String str29 = fraction26.toProperString();
        boolean boolean30 = fraction22.equals((java.lang.Object) str29);
        int int31 = fraction22.getDenominator();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1));
        int int34 = fraction33.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long36 = fraction35.longValue();
        org.apache.commons.lang.math.Fraction fraction37 = fraction35.reduce();
        org.apache.commons.lang.math.Fraction fraction38 = fraction33.subtract(fraction35);
        org.apache.commons.lang.math.Fraction fraction39 = fraction22.subtract(fraction33);
        byte byte40 = fraction33.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) '4', (int) (short) 9);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.abs();
        int int5 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        int int10 = fraction8.getProperWhole();
        int int11 = fraction3.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.pow(0);
        double double14 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -32, (int) (short) -10);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 52);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        double double7 = fraction3.doubleValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.invert();
        long long9 = fraction3.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-1");
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        int int8 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 0.4f);
        boolean boolean11 = fraction0.equals((java.lang.Object) fraction10);
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.abs();
        java.lang.Class<?> wildcardClass13 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction19 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.invert();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 33, (int) (short) -10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        float float6 = fraction4.floatValue();
        java.lang.String str7 = fraction4.toString();
        long long8 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.subtract(fraction4);
        int int13 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.4f + "'", float6 == 0.4f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2/5" + "'", str7, "2/5");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        int int19 = fraction16.intValue();
        float float20 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction8.subtract(fraction16);
        int int22 = fraction16.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        float float2 = fraction1.floatValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction6 = fraction4.pow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        long long1 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.add(fraction5);
        int int8 = fraction5.getDenominator();
        int int9 = fraction5.getNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.subtract(fraction5);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction4 = fraction2.pow(165);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction11.add(fraction14);
        java.lang.String str17 = fraction14.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        int int23 = fraction21.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction24 = fraction14.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.invert();
        long long34 = fraction33.longValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction26.add(fraction33);
        org.apache.commons.lang.math.Fraction fraction36 = fraction21.divideBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction37 = fraction35.reduce();
        org.apache.commons.lang.math.Fraction fraction38 = fraction10.subtract(fraction37);
        short short39 = fraction37.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 20 + "'", short39 == (short) 20);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(22540, (int) (short) 20, (int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) -10, 11, (-66));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE;
        int int12 = fraction11.getProperWhole();
        int int13 = fraction11.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        int int15 = fraction11.getNumerator();
        long long16 = fraction11.longValue();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction24.invert();
        org.apache.commons.lang.math.Fraction fraction27 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction28 = fraction21.subtract(fraction26);
        int int29 = fraction21.getDenominator();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.negate();
        boolean boolean32 = fraction21.equals((java.lang.Object) fraction31);
        int int33 = fraction21.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction34 = fraction17.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int38 = fraction37.intValue();
        double double39 = fraction37.doubleValue();
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int42 = fraction41.intValue();
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int44 = fraction43.intValue();
        float float45 = fraction43.floatValue();
        java.lang.String str46 = fraction43.toString();
        org.apache.commons.lang.math.Fraction fraction47 = fraction41.subtract(fraction43);
        java.lang.String str48 = fraction43.toProperString();
        org.apache.commons.lang.math.Fraction fraction49 = fraction43.invert();
        org.apache.commons.lang.math.Fraction fraction50 = fraction37.divideBy(fraction49);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang.math.Fraction fraction52 = fraction34.subtract(fraction50);
        org.apache.commons.lang.math.Fraction fraction53 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int54 = fraction53.intValue();
        int int55 = fraction53.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int58 = fraction57.intValue();
        org.apache.commons.lang.math.Fraction fraction59 = fraction57.invert();
        org.apache.commons.lang.math.Fraction fraction60 = fraction59.invert();
        java.lang.String str61 = fraction60.toProperString();
        org.apache.commons.lang.math.Fraction fraction62 = fraction60.reduce();
        org.apache.commons.lang.math.Fraction fraction63 = fraction53.add(fraction62);
        org.apache.commons.lang.math.Fraction fraction65 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int66 = fraction65.intValue();
        org.apache.commons.lang.math.Fraction fraction67 = fraction65.invert();
        org.apache.commons.lang.math.Fraction fraction68 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int69 = fraction68.intValue();
        org.apache.commons.lang.math.Fraction fraction71 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int72 = fraction71.getNumerator();
        org.apache.commons.lang.math.Fraction fraction73 = fraction68.add(fraction71);
        int int74 = fraction65.compareTo((java.lang.Object) fraction68);
        long long75 = fraction68.longValue();
        org.apache.commons.lang.math.Fraction fraction76 = fraction68.invert();
        int int77 = fraction76.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction80 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int81 = fraction80.intValue();
        double double82 = fraction80.doubleValue();
        org.apache.commons.lang.math.Fraction fraction84 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int85 = fraction84.intValue();
        org.apache.commons.lang.math.Fraction fraction86 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int87 = fraction86.intValue();
        float float88 = fraction86.floatValue();
        java.lang.String str89 = fraction86.toString();
        org.apache.commons.lang.math.Fraction fraction90 = fraction84.subtract(fraction86);
        java.lang.String str91 = fraction86.toProperString();
        org.apache.commons.lang.math.Fraction fraction92 = fraction86.invert();
        org.apache.commons.lang.math.Fraction fraction93 = fraction80.divideBy(fraction92);
        org.apache.commons.lang.math.Fraction fraction94 = fraction76.subtract(fraction80);
        org.apache.commons.lang.math.Fraction fraction95 = fraction62.divideBy(fraction94);
        org.apache.commons.lang.math.Fraction fraction96 = fraction95.reduce();
        org.apache.commons.lang.math.Fraction fraction97 = fraction34.divideBy(fraction95);
        int int98 = fraction34.getNumerator();
        boolean boolean99 = fraction11.equals((java.lang.Object) int98);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.4f + "'", float45 == 0.4f);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2/5" + "'", str46, "2/5");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2/5" + "'", str48, "2/5");
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "10" + "'", str61, "10");
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.4f + "'", float88 == 0.4f);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "2/5" + "'", str89, "2/5");
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "2/5" + "'", str91, "2/5");
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertNotNull(fraction96);
        org.junit.Assert.assertNotNull(fraction97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 17 + "'", int98 == 17);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction4.negate();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fraction4.compareTo(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((-0.1d));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 4L);
        long long2 = fraction1.longValue();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction(20, 35, (int) (short) 10);
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.subtract(fraction12);
        byte byte14 = fraction13.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 76 + "'", byte14 == (byte) 76);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 100, (int) ' ');
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 3 + "'", short3 == (short) 3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(33, 52);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.negate();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        int int10 = fraction2.compareTo((java.lang.Object) fraction9);
        org.apache.commons.lang.math.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction12 = fraction9.add(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction19 = fraction12.subtract(fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = fraction8.multiplyBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = fraction8.invert();
        short short22 = fraction21.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.subtract(fraction8);
        int int11 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        long long23 = fraction22.longValue();
        int int24 = fraction3.compareTo((java.lang.Object) fraction22);
        int int25 = fraction22.getProperNumerator();
        int int26 = fraction22.getDenominator();
        org.apache.commons.lang.math.Fraction fraction27 = fraction22.negate();
        int int28 = fraction27.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = fraction2.toString();
        int int4 = fraction2.getProperWhole();
        byte byte5 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10/1" + "'", str3, "-10/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -10 + "'", byte5 == (byte) -10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        byte byte8 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        double double7 = fraction5.doubleValue();
        int int8 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        long long18 = fraction17.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction10.add(fraction17);
        int int20 = fraction17.getDenominator();
        org.apache.commons.lang.math.Fraction fraction21 = fraction5.add(fraction17);
        float float22 = fraction17.floatValue();
        int int23 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction24 = fraction2.divideBy(fraction17);
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.reduce();
        byte byte26 = fraction25.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.invert();
        int int24 = fraction18.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.add(fraction18);
        int int21 = fraction12.compareTo((java.lang.Object) fraction15);
        long long22 = fraction15.longValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction15.invert();
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int28 = fraction27.intValue();
        double double29 = fraction27.doubleValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        java.lang.String str36 = fraction33.toString();
        org.apache.commons.lang.math.Fraction fraction37 = fraction31.subtract(fraction33);
        java.lang.String str38 = fraction33.toProperString();
        org.apache.commons.lang.math.Fraction fraction39 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction40 = fraction27.divideBy(fraction39);
        org.apache.commons.lang.math.Fraction fraction41 = fraction23.subtract(fraction27);
        org.apache.commons.lang.math.Fraction fraction42 = fraction9.divideBy(fraction41);
        long long43 = fraction41.longValue();
        float float44 = fraction41.floatValue();
        short short45 = fraction41.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.4f + "'", float35 == 0.4f);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2/5" + "'", str36, "2/5");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2/5" + "'", str38, "2/5");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.5f + "'", float44 == 1.5f);
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 1 + "'", short45 == (short) 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        float float5 = fraction2.floatValue();
        int int6 = fraction2.getProperNumerator();
        int int7 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.subtract(fraction8);
        int int10 = fraction3.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction13 = fraction3.multiplyBy(fraction11);
        int int14 = fraction2.compareTo((java.lang.Object) fraction3);
        java.lang.String str15 = fraction3.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        java.lang.String str10 = fraction7.toProperString();
        java.lang.String str11 = fraction7.toString();
        java.lang.String str12 = fraction7.toProperString();
        int int13 = fraction7.getProperNumerator();
        java.lang.String str14 = fraction7.toProperString();
        boolean boolean15 = fraction3.equals((java.lang.Object) fraction7);
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.pow(3);
        java.lang.Class<?> wildcardClass18 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10/1" + "'", str11, "10/1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.abs();
        java.lang.String str5 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.abs();
        org.apache.commons.lang.math.Fraction fraction7 = fraction4.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3" + "'", str5, "3");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-110), 1002, 100);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction12 = fraction6.subtract(fraction11);
        int int13 = fraction6.getProperNumerator();
        float float14 = fraction6.floatValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction5.multiplyBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int17 = fraction16.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction24.invert();
        org.apache.commons.lang.math.Fraction fraction27 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction28 = fraction21.subtract(fraction26);
        int int29 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = fraction16.add(fraction26);
        java.lang.String str31 = fraction30.toString();
        boolean boolean32 = fraction15.equals((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "7/10" + "'", str31, "7/10");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction1.subtract(fraction3);
        int int8 = fraction3.intValue();
        java.lang.Class<?> wildcardClass9 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2/5" + "'", str6, "2/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int12 = fraction11.getDenominator();
        java.lang.String str13 = fraction11.toString();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction17 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction18 = fraction10.add(fraction16);
        java.lang.String str19 = fraction18.toProperString();
        int int20 = fraction18.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4/5" + "'", str13, "4/5");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4/5" + "'", str14, "4/5");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 4/5" + "'", str19, "10 4/5");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        int int10 = fraction9.getDenominator();
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.subtract(fraction9);
        java.lang.Class<?> wildcardClass12 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.negate();
        java.lang.Class<?> wildcardClass7 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-16), (-99));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        double double3 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.add(fraction6);
        java.lang.String str8 = fraction6.toString();
        double double9 = fraction6.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4/1" + "'", str8, "4/1");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        int int7 = fraction0.intValue();
        java.lang.Class<?> wildcardClass8 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.negate();
        int int8 = fraction5.compareTo((java.lang.Object) fraction7);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.negate();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int14 = fraction13.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.negate();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long17 = fraction16.longValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction19 = fraction13.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction20 = fraction9.divideBy(fraction19);
        org.apache.commons.lang.math.Fraction fraction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction22 = fraction19.subtract(fraction21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(3, 2);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.pow(2);
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.negate();
        org.apache.commons.lang.math.Fraction fraction13 = fraction2.divideBy(fraction5);
        int int14 = fraction13.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.subtract(fraction8);
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.negate();
        long long11 = fraction10.longValue();
        long long12 = fraction10.longValue();
        byte byte13 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.invert();
        int int4 = fraction3.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.add(fraction18);
        int int21 = fraction12.compareTo((java.lang.Object) fraction15);
        long long22 = fraction15.longValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction15.invert();
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int28 = fraction27.intValue();
        double double29 = fraction27.doubleValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        java.lang.String str36 = fraction33.toString();
        org.apache.commons.lang.math.Fraction fraction37 = fraction31.subtract(fraction33);
        java.lang.String str38 = fraction33.toProperString();
        org.apache.commons.lang.math.Fraction fraction39 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction40 = fraction27.divideBy(fraction39);
        org.apache.commons.lang.math.Fraction fraction41 = fraction23.subtract(fraction27);
        org.apache.commons.lang.math.Fraction fraction42 = fraction9.divideBy(fraction41);
        java.lang.String str43 = fraction41.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.4f + "'", float35 == 0.4f);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2/5" + "'", str36, "2/5");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2/5" + "'", str38, "2/5");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3/2" + "'", str43, "3/2");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        long long11 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction4.invert();
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int17 = fraction16.intValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction22);
        java.lang.String str27 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction30 = fraction12.subtract(fraction16);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        float float33 = fraction31.floatValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction16.add(fraction31);
        org.apache.commons.lang.math.Fraction fraction35 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction36 = fraction16.abs();
        int int37 = fraction36.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.4f + "'", float33 == 0.4f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction13 = fraction7.subtract(fraction12);
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.ONE_FIFTH;
        boolean boolean15 = fraction7.equals((java.lang.Object) fraction14);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.multiplyBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction18 = fraction6.subtract(fraction17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 100, 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        boolean boolean7 = fraction5.equals((java.lang.Object) "3/5");
        int int8 = fraction5.getProperWhole();
        float float9 = fraction5.floatValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction10.multiplyBy(fraction12);
        org.apache.commons.lang.math.Fraction fraction15 = fraction12.pow((int) (byte) 10);
        boolean boolean16 = fraction5.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 165 + "'", int8 == 165);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 165.38171f + "'", float9 == 165.38171f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.divideBy(fraction10);
        byte byte12 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -1, (int) (short) -10);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.invert();
        long long8 = fraction7.longValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int13 = fraction12.intValue();
        double double14 = fraction12.doubleValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        float float20 = fraction18.floatValue();
        java.lang.String str21 = fraction18.toString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.subtract(fraction18);
        java.lang.String str23 = fraction18.toProperString();
        org.apache.commons.lang.math.Fraction fraction24 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction25 = fraction12.divideBy(fraction24);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = fraction9.add(fraction25);
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.intValue();
        org.apache.commons.lang.math.Fraction fraction31 = fraction29.invert();
        org.apache.commons.lang.math.Fraction fraction32 = fraction9.multiplyBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        java.lang.String str36 = fraction33.toString();
        long long37 = fraction33.longValue();
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int39 = fraction38.intValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction33.add(fraction38);
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.reduce();
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.intValue();
        org.apache.commons.lang.math.Fraction fraction45 = fraction43.invert();
        org.apache.commons.lang.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang.math.Fraction fraction48 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang.math.Fraction fraction50 = fraction48.invert();
        org.apache.commons.lang.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang.math.Fraction fraction52 = fraction45.subtract(fraction50);
        org.apache.commons.lang.math.Fraction fraction53 = fraction41.multiplyBy(fraction52);
        int int54 = fraction52.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction55 = fraction9.multiplyBy(fraction52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction56 = fraction2.divideBy(fraction55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The fraction to divide by must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.4f + "'", float20 == 0.4f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2/5" + "'", str23, "2/5");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.4f + "'", float35 == 0.4f);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2/5" + "'", str36, "2/5");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(fraction55);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.divideBy(fraction3);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction11.add(fraction14);
        int int17 = fraction8.compareTo((java.lang.Object) fraction11);
        long long18 = fraction11.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction11.invert();
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction19.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction25 = fraction23.invert();
        int int26 = fraction25.getNumerator();
        int int27 = fraction25.getDenominator();
        boolean boolean28 = fraction19.equals((java.lang.Object) fraction25);
        org.apache.commons.lang.math.Fraction fraction29 = fraction5.add(fraction25);
        float float30 = fraction25.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.1f + "'", float30 == 0.1f);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.abs();
        java.lang.String str3 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(1003833, (int) (short) 10, (int) 'a');
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 57 + "'", byte4 == (byte) 57);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(1002, (int) (byte) 76);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 5);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -32, (int) (short) 100);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        byte byte6 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.pow(3);
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        double double3 = fraction1.doubleValue();
        int int4 = fraction1.intValue();
        int int5 = fraction1.getDenominator();
        double double6 = fraction1.doubleValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        double double10 = fraction8.doubleValue();
        int int11 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction19.invert();
        long long21 = fraction20.longValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction13.add(fraction20);
        int int23 = fraction20.getDenominator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction8.add(fraction20);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang.math.Fraction fraction30 = fraction25.add(fraction28);
        int int31 = fraction30.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int34 = fraction33.intValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.invert();
        int int37 = fraction35.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction38 = fraction30.add(fraction35);
        float float39 = fraction30.floatValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction20.subtract(fraction30);
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction42 = fraction41.invert();
        org.apache.commons.lang.math.Fraction fraction43 = fraction41.abs();
        org.apache.commons.lang.math.Fraction fraction44 = fraction41.reduce();
        org.apache.commons.lang.math.Fraction fraction45 = fraction40.subtract(fraction41);
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.intValue();
        org.apache.commons.lang.math.Fraction fraction49 = fraction47.invert();
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int51 = fraction50.intValue();
        org.apache.commons.lang.math.Fraction fraction53 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int54 = fraction53.getNumerator();
        org.apache.commons.lang.math.Fraction fraction55 = fraction50.add(fraction53);
        int int56 = fraction47.compareTo((java.lang.Object) fraction50);
        long long57 = fraction50.longValue();
        org.apache.commons.lang.math.Fraction fraction58 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction59 = fraction58.negate();
        org.apache.commons.lang.math.Fraction fraction60 = fraction50.subtract(fraction59);
        org.apache.commons.lang.math.Fraction fraction61 = fraction41.subtract(fraction59);
        org.apache.commons.lang.math.Fraction fraction62 = fraction1.multiplyBy(fraction41);
        java.lang.Class<?> wildcardClass63 = fraction41.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.4f + "'", float39 == 10.4f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.reduce();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.abs();
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction10 = fraction3.divideBy(fraction9);
        org.apache.commons.lang.math.Fraction fraction11 = fraction3.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.abs();
        byte byte13 = fraction12.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction4 = fraction1.divideBy(fraction3);
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        boolean boolean7 = fraction5.equals((java.lang.Object) "3/5");
        org.apache.commons.lang.math.Fraction fraction8 = fraction5.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction10 = fraction8.pow(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-1), 10, 110);
        long long4 = fraction3.longValue();
        java.lang.Class<?> wildcardClass5 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int7 = fraction6.intValue();
        double double8 = fraction6.doubleValue();
        boolean boolean9 = fraction3.equals((java.lang.Object) fraction6);
        int int10 = fraction3.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 76, (-10), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        float float13 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction11.pow((int) (short) -1);
        java.lang.String str17 = fraction11.toString();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.abs();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.negate();
        double double23 = fraction21.doubleValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int27 = fraction26.intValue();
        double double28 = fraction26.doubleValue();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        float float34 = fraction32.floatValue();
        java.lang.String str35 = fraction32.toString();
        org.apache.commons.lang.math.Fraction fraction36 = fraction30.subtract(fraction32);
        java.lang.String str37 = fraction32.toProperString();
        org.apache.commons.lang.math.Fraction fraction38 = fraction32.invert();
        org.apache.commons.lang.math.Fraction fraction39 = fraction26.divideBy(fraction38);
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction44 = fraction41.divideBy(fraction43);
        boolean boolean45 = fraction38.equals((java.lang.Object) fraction41);
        org.apache.commons.lang.math.Fraction fraction46 = fraction21.add(fraction38);
        int int47 = fraction11.compareTo((java.lang.Object) fraction46);
        int int48 = fraction46.intValue();
        int int49 = fraction46.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2/5" + "'", str17, "2/5");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.4f + "'", float34 == 0.4f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2/5" + "'", str35, "2/5");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2/5" + "'", str37, "2/5");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 12 + "'", int48 == 12);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        float float6 = fraction4.floatValue();
        java.lang.String str7 = fraction4.toString();
        long long8 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.subtract(fraction4);
        int int13 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.4f + "'", float6 == 0.4f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2/5" + "'", str7, "2/5");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        long long9 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction1.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction15.subtract(fraction20);
        int int23 = fraction15.getDenominator();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.negate();
        boolean boolean26 = fraction15.equals((java.lang.Object) fraction25);
        int int27 = fraction15.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction28 = fraction11.add(fraction15);
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int31 = fraction28.compareTo((java.lang.Object) fraction30);
        int int32 = fraction28.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction33 = fraction8.add(fraction28);
        int int34 = fraction33.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 17 + "'", int32 == 17);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 217 + "'", int34 == 217);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (byte) 4);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 4 + "'", byte2 == (byte) 4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.invert();
        int int5 = fraction4.getDenominator();
        long long6 = fraction4.longValue();
        int int7 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        int int2 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = fraction7.add(fraction10);
        int int13 = fraction4.compareTo((java.lang.Object) fraction7);
        int int14 = fraction7.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction0.divideBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction16 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        float float20 = fraction19.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int22 = fraction21.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int24 = fraction21.compareTo((java.lang.Object) fraction23);
        org.apache.commons.lang.math.Fraction fraction25 = fraction19.add(fraction23);
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.divideBy(fraction25);
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction(6, (int) 'a', 6);
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.negate();
        org.apache.commons.lang.math.Fraction fraction32 = fraction25.subtract(fraction30);
        org.apache.commons.lang.math.Fraction fraction33 = fraction25.negate();
        java.lang.String str34 = fraction25.toProperString();
        int int35 = fraction25.intValue();
        short short36 = fraction25.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 3.0f + "'", float20 == 3.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3 2/3" + "'", str34, "3 2/3");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 3 + "'", short36 == (short) 3);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int12 = fraction11.intValue();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int20 = fraction19.getProperNumerator();
        int int21 = fraction18.compareTo((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction0.add(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.invert();
        java.lang.String str24 = fraction18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction26 = fraction18.pow((-99));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1/40" + "'", str24, "1/40");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int8 = fraction7.getDenominator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.reduce();
        float float10 = fraction7.floatValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.multiplyBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction12 = fraction2.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        java.lang.String str18 = fraction17.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction17.reduce();
        int int20 = fraction5.compareTo((java.lang.Object) fraction17);
        java.lang.Class<?> wildcardClass21 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        boolean boolean8 = fraction5.equals((java.lang.Object) 3);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.negate();
        int int10 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        int int15 = fraction14.getNumerator();
        int int16 = fraction14.getDenominator();
        float float17 = fraction14.floatValue();
        java.lang.String str18 = fraction14.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction5.add(fraction14);
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.negate();
        java.lang.Class<?> wildcardClass22 = fraction20.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.1f + "'", float17 == 0.1f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1/10" + "'", str18, "1/10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(101, (int) (byte) -91, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int7 = fraction6.intValue();
        boolean boolean8 = fraction1.equals((java.lang.Object) int7);
        int int9 = fraction1.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.pow(0);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction21.invert();
        java.lang.String str24 = fraction21.toProperString();
        org.apache.commons.lang.math.Fraction fraction25 = fraction18.divideBy(fraction21);
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.add(fraction18);
        double double27 = fraction26.doubleValue();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int29 = fraction28.intValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang.math.Fraction fraction33 = fraction28.add(fraction31);
        java.lang.String str34 = fraction31.toProperString();
        java.lang.String str35 = fraction31.toProperString();
        org.apache.commons.lang.math.Fraction fraction36 = fraction26.add(fraction31);
        org.apache.commons.lang.math.Fraction fraction37 = fraction12.add(fraction26);
        org.apache.commons.lang.math.Fraction fraction38 = fraction1.divideBy(fraction26);
        float float39 = fraction38.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 110.0d + "'", double27 == 110.0d);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10" + "'", str34, "10");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10" + "'", str35, "10");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.09090909f + "'", float39 == 0.09090909f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(110, 15, 23);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction1.subtract(fraction3);
        java.lang.String str8 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.invert();
        double double10 = fraction3.doubleValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction3.abs();
        short short12 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2/5" + "'", str6, "2/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.4d + "'", double10 == 0.4d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        int int2 = fraction0.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = fraction7.add(fraction10);
        int int13 = fraction4.compareTo((java.lang.Object) fraction7);
        int int14 = fraction7.getDenominator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction0.divideBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction16 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        float float20 = fraction19.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int22 = fraction21.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int24 = fraction21.compareTo((java.lang.Object) fraction23);
        org.apache.commons.lang.math.Fraction fraction25 = fraction19.add(fraction23);
        org.apache.commons.lang.math.Fraction fraction26 = fraction16.divideBy(fraction25);
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction30 = fraction27.multiplyBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.negate();
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.abs();
        org.apache.commons.lang.math.Fraction fraction33 = fraction16.subtract(fraction31);
        java.lang.String str34 = fraction33.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 3.0f + "'", float20 == 3.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "7/30" + "'", str34, "7/30");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 3);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) (short) 10);
        org.junit.Assert.assertNotNull(fraction2);
    }
}

