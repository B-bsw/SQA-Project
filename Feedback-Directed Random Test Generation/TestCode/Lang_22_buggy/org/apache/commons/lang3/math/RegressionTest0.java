package org.apache.commons.lang3.math;

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
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction3.pow((int) (byte) 10);
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
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction1.subtract(fraction3);
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
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
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
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        byte byte2 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        short short7 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 1, 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 35 + "'", byte4 == (byte) 35);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.negate();
        short short11 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        double double6 = fraction5.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction5.divideBy(fraction17);
        java.lang.Class<?> wildcardClass19 = fraction17.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.02857142857143d + "'", double6 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        int int8 = fraction5.compareTo(fraction6);
        byte byte9 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction0.add(fraction10);
        short short12 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        java.lang.String str14 = fraction5.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        short short11 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 9 + "'", short11 == (short) 9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction6.pow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) (short) 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        short short7 = fraction6.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -10 + "'", short7 == (short) -10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        int int8 = fraction5.compareTo(fraction6);
        java.lang.Class<?> wildcardClass9 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        short short6 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (short) 0, (int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = fraction9.equals((java.lang.Object) fraction11);
        java.lang.Class<?> wildcardClass13 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int1 = fraction0.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        byte byte6 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 33 + "'", byte6 == (byte) 33);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        java.lang.Class<?> wildcardClass15 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        short short7 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 33 + "'", short7 == (short) 33);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        java.lang.Class<?> wildcardClass14 = fraction13.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        double double7 = fraction5.doubleValue();
        java.lang.Class<?> wildcardClass8 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.01d + "'", double7 == 0.01d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.invert();
        int int5 = fraction4.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        int int4 = fraction0.getProperNumerator();
        int int5 = fraction0.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction13 = fraction1.invert();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction10.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction15 = fraction13.pow((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction8 = fraction2.multiplyBy(fraction7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.invert();
        java.lang.Class<?> wildcardClass5 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        byte byte2 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = fraction9.equals((java.lang.Object) fraction11);
        byte byte13 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("0");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 35 + "'", short4 == (short) 35);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        int int8 = fraction5.compareTo(fraction6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction10 = fraction5.pow((int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        boolean boolean9 = fraction6.equals((java.lang.Object) 10.0f);
        byte byte10 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -10 + "'", byte10 == (byte) -10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction8.subtract(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        byte byte1 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(33, 5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.add(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.subtract(fraction9);
        int int11 = fraction1.compareTo(fraction9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction0.divideBy(fraction9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The fraction to divide by must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(2, (int) (short) -10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 33, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getProperWhole();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction8 = fraction3.pow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int3 = fraction2.getProperNumerator();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        java.lang.Class<?> wildcardClass15 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        long long13 = fraction12.longValue();
        java.lang.Class<?> wildcardClass14 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        short short14 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        short short10 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        short short11 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
        short short5 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        int int14 = fraction13.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.add(fraction11);
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction7.divideBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long18 = fraction17.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction11.invert();
        int int21 = fraction11.getProperNumerator();
        boolean boolean22 = fraction0.equals((java.lang.Object) int21);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.reduce();
        java.lang.String str12 = fraction11.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9 2/5" + "'", str12, "9 2/5");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.abs();
        int int10 = fraction9.getDenominator();
        float float11 = fraction9.floatValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction13.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.subtract(fraction21);
        int int23 = fraction13.compareTo(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction9.subtract(fraction21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction26 = fraction9.pow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.028572f + "'", float11 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int2 = fraction1.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.01d);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1226, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 35);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(7.0d);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction3.compareTo(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow(1716);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '4');
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        int int4 = fraction0.getProperNumerator();
        java.lang.Object obj5 = null;
        boolean boolean6 = fraction0.equals(obj5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.pow((int) (byte) 0);
        int int9 = fraction8.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction14.getProperWhole();
        long long16 = fraction14.longValue();
        int int17 = fraction14.getNumerator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction19 = fraction14.pow(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 19L + "'", long16 == 19L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        int int12 = fraction1.intValue();
        byte byte13 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        int int5 = fraction4.getProperWhole();
        long long6 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.invert();
        boolean boolean18 = fraction15.equals((java.lang.Object) fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.reduce();
        int int20 = fraction19.getNumerator();
        int int21 = fraction19.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction4.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.invert();
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction4.add(fraction24);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction2.subtract(fraction4);
        java.lang.Class<?> wildcardClass34 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction10.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.invert();
        short short14 = fraction13.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        int int10 = fraction7.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1716, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        int int7 = fraction2.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction8.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction2.divideBy(fraction11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction15 = fraction2.pow((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE;
        int int4 = fraction3.getProperWhole();
        long long5 = fraction3.longValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction7.add(fraction10);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction7.abs();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction7.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        boolean boolean17 = fraction14.equals((java.lang.Object) fraction15);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction15.reduce();
        int int19 = fraction18.getNumerator();
        int int20 = fraction18.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction3.add(fraction18);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        java.lang.String str26 = fraction23.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction3.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction2.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction34 = fraction3.multiplyBy(fraction33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction7.add(fraction13);
        java.lang.Class<?> wildcardClass17 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction10.divideBy(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction14.getProperWhole();
        long long16 = fraction14.longValue();
        int int17 = fraction14.getProperNumerator();
        float float18 = fraction14.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 19L + "'", long16 == 19L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 19.0f + "'", float18 == 19.0f);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        long long7 = fraction6.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction6.pow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        float float1 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.6f + "'", float1 == 0.6f);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = fraction9.equals((java.lang.Object) fraction11);
        double double13 = fraction11.doubleValue();
        short short14 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.25d + "'", double13 == 0.25d);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (short) 10, (int) '#');
        java.lang.String str4 = fraction3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction6 = fraction3.pow((int) (byte) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1235/35" + "'", str4, "1235/35");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        java.lang.String str11 = fraction8.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35L);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow((int) (short) 1);
        java.lang.String str21 = fraction18.toProperString();
        float float22 = fraction18.floatValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.negate();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction27.abs();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction27.abs();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction24.add(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction23.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction23.reduce();
        int int38 = fraction5.compareTo(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction37.negate();
        java.lang.Class<?> wildcardClass40 = fraction39.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35 1/35" + "'", str21, "35 1/35");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 35.028572f + "'", float22 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.negate();
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction10.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.reduce();
        short short15 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 9 + "'", short15 == (short) 9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        byte byte13 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.negate();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction9.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction8.multiplyBy(fraction20);
        float float22 = fraction20.floatValue();
        double double23 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        float float26 = fraction24.floatValue();
        java.lang.String str27 = fraction24.toString();
        int int28 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction24.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction20.divideBy(fraction30);
        short short34 = fraction30.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.4f + "'", float22 == 1.4f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.4d + "'", double23 == 1.4d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.4f + "'", float26 == 0.4f);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2/5" + "'", str27, "2/5");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 10 + "'", short34 == (short) 10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 20 + "'", short9 == (short) 20);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -1, 100);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction11.divideBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.invert();
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction11.add(fraction29);
        short short31 = fraction30.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 21 + "'", short31 == (short) 21);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        byte byte6 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 35 + "'", byte6 == (byte) 35);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', (int) (short) 20);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 52);
        org.apache.commons.lang3.math.Fraction fraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        long long7 = fraction3.longValue();
        int int8 = fraction3.getProperWhole();
        float float9 = fraction3.floatValue();
        short short10 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.028572f + "'", float9 == 35.028572f);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 35 + "'", short10 == (short) 35);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        float float28 = fraction26.floatValue();
        int int29 = fraction26.getDenominator();
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction11.add(fraction26);
        float float33 = fraction26.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        double double11 = fraction10.doubleValue();
        java.lang.Class<?> wildcardClass12 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction5.add(fraction10);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction4.subtract(fraction5);
        java.lang.String str19 = fraction18.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3/5" + "'", str6, "3/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1/1" + "'", str19, "-1/1");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.invert();
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.invert();
        float float15 = fraction13.floatValue();
        int int16 = fraction13.getDenominator();
        java.lang.String str17 = fraction13.toString();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.subtract(fraction13);
        int int19 = fraction18.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean23 = fraction18.equals((java.lang.Object) fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction3.divideBy(fraction22);
        short short25 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1/1" + "'", str17, "1/1");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 1 + "'", short25 == (short) 1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        double double6 = fraction5.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction5.divideBy(fraction17);
        byte byte19 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.02857142857143d + "'", double6 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -10 + "'", byte19 == (byte) -10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        boolean boolean13 = fraction10.equals((java.lang.Object) fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow((int) (byte) 0);
        int int21 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction18);
        boolean boolean23 = fraction1.equals((java.lang.Object) fraction11);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction11.pow(2);
        byte byte26 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int3 = fraction2.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow(1716);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.abs();
        int int10 = fraction9.getDenominator();
        float float11 = fraction9.floatValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction14 = fraction9.pow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.028572f + "'", float11 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        byte byte10 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        java.lang.String str17 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int20 = fraction14.compareTo(fraction19);
        short short21 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1/1" + "'", str17, "-1/1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        int int4 = fraction0.getProperNumerator();
        int int5 = fraction0.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 35, (int) (short) -10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.invert();
        int int3 = fraction2.getProperWhole();
        int int4 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.01d);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.invert();
        java.lang.Class<?> wildcardClass9 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        java.lang.Class<?> wildcardClass8 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-2), (int) (short) -1, (int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        java.lang.String str10 = fraction9.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "47/5" + "'", str10, "47/5");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        short short4 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(10, (int) (short) 20);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction3);
        short short8 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction5.divideBy(fraction15);
        byte byte17 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -109 + "'", byte4 == (byte) -109);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1226, (int) (byte) 10);
        java.lang.String str3 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "122 3/5" + "'", str3, "122 3/5");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
        byte byte8 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1235/35");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(19, (int) (byte) 33, (int) (short) 35);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int3 = fraction2.getProperNumerator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        boolean boolean4 = fraction1.equals((java.lang.Object) fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        float float16 = fraction14.floatValue();
        int int17 = fraction14.getDenominator();
        java.lang.String str18 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction13.subtract(fraction14);
        int int20 = fraction19.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction1.subtract(fraction19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow((int) (short) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1/1" + "'", str18, "1/1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("33/1");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) (byte) -1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        boolean boolean21 = fraction18.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((int) (byte) 0);
        int int29 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction19.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction19);
        long long32 = fraction19.longValue();
        float float33 = fraction19.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        int int14 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        float float25 = fraction20.floatValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction20.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        int int39 = fraction38.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction30.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction8.add(fraction40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 7L);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 21, (int) (byte) -109, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction0.compareTo(fraction3);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/3" + "'", str4, "1/3");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction0.pow((int) (byte) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.divideBy(fraction11);
        java.lang.String str13 = fraction10.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20/1" + "'", str13, "20/1");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction7.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction7.pow((int) (byte) -1);
        int int19 = fraction18.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        int int8 = fraction5.compareTo(fraction6);
        short short9 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.subtract(fraction8);
        int int10 = fraction0.compareTo(fraction8);
        java.lang.Class<?> wildcardClass11 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        int int2 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.invert();
        byte byte12 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-10");
        int int2 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        boolean boolean20 = fraction17.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((int) (byte) 0);
        int int28 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction25);
        boolean boolean30 = fraction8.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction8);
        byte byte32 = fraction31.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean12 = fraction9.equals((java.lang.Object) fraction11);
        short short13 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        java.lang.Class<?> wildcardClass7 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        double double11 = fraction10.doubleValue();
        byte byte12 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.0d + "'", double11 == 7.0d);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 7 + "'", byte12 == (byte) 7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        java.lang.String str1 = fraction0.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2/3" + "'", str1, "2/3");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 33, (int) (byte) -10, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-10");
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -10 + "'", byte2 == (byte) -10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fraction2.compareTo(fraction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow((int) (short) 1);
        double double21 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.add(fraction27);
        java.lang.String str30 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction20.divideBy(fraction32);
        double double34 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction5.divideBy(fraction20);
        byte byte36 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.02857142857143d + "'", double21 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.02857142857143d + "'", double34 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        int int7 = fraction2.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction8.multiplyBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction2.divideBy(fraction11);
        int int14 = fraction11.intValue();
        float float15 = fraction11.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-10), (-3), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((int) (byte) 0);
        int int18 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction8.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        float float30 = fraction25.floatValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int32 = fraction31.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.invert();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction25.add(fraction31);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction8.subtract(fraction25);
        byte byte36 = fraction25.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 10 + "'", byte36 == (byte) 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (byte) 35, (int) '4');
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, 1226, (int) (byte) 10);
        boolean boolean14 = fraction1.equals((java.lang.Object) 1226);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        double double6 = fraction5.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction5.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.invert();
        byte byte20 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.02857142857143d + "'", double6 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -10 + "'", byte20 == (byte) -10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction0.add(fraction5);
        int int13 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        java.lang.String str13 = fraction12.toProperString();
        java.lang.Class<?> wildcardClass14 = fraction12.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction9.floatValue();
        double double11 = fraction9.doubleValue();
        java.lang.Class<?> wildcardClass12 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getNumerator();
        byte byte4 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.add(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction0.add(fraction10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int19 = fraction15.compareTo(fraction18);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction13.multiplyBy(fraction21);
        long long23 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction11.subtract(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 7L + "'", long23 == 7L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "7" + "'", str25, "7");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        java.lang.String str5 = fraction3.toProperString();
        int int6 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/10" + "'", str4, "1/10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1/10" + "'", str5, "1/10");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (byte) 10);
        int int4 = fraction3.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1024 + "'", int4 == 1024);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.divideBy(fraction6);
        float float8 = fraction6.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/10" + "'", str4, "1/10");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.6666667f + "'", float8 == 0.6666667f);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.abs();
        float float4 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.pow((int) (byte) 7);
        int int9 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, 33, (int) (short) 35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow(1024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction10.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.reduce();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction16 = fraction10.pow((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        int int9 = fraction8.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        short short8 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        float float7 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction8.add(fraction10);
        int int13 = fraction8.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-10.0f) + "'", float7 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) '4', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(10035, (int) (short) 35, 10035);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.abs();
        java.lang.String str2 = fraction1.toProperString();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2/4" + "'", str2, "2/4");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction12.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        float float38 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.pow(5);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction1.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.pow(9);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.pow((int) (short) 1);
        java.lang.String str53 = fraction50.toProperString();
        long long54 = fraction50.longValue();
        int int55 = fraction50.getProperWhole();
        float float56 = fraction50.floatValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction57 = fraction46.divideBy(fraction50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/5" + "'", str7, "3/5");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.02857142857143d + "'", double19 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.1f + "'", float38 == 0.1f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "35 1/35" + "'", str53, "35 1/35");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 35L + "'", long54 == 35L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 35.028572f + "'", float56 == 35.028572f);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, (-10), 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        int int8 = fraction6.getProperWhole();
        int int9 = fraction6.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.add(fraction6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction4.pow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        double double12 = fraction11.doubleValue();
        long long13 = fraction11.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction15 = fraction11.pow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-40.0d) + "'", double12 == (-40.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-40L) + "'", long13 == (-40L));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction14.getProperWhole();
        long long16 = fraction14.longValue();
        short short17 = fraction14.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 19L + "'", long16 == 19L);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 19 + "'", short17 == (short) 19);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        java.lang.Class<?> wildcardClass11 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1.0f));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        int int12 = fraction11.getNumerator();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        float float16 = fraction14.floatValue();
        int int17 = fraction14.getDenominator();
        int int18 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.subtract(fraction14);
        int int20 = fraction14.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 33);
        int int2 = fraction1.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        short short5 = fraction4.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        float float7 = fraction5.floatValue();
        float float8 = fraction5.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        java.lang.String str7 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        float float3 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow(2);
        float float6 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        int int15 = fraction12.getDenominator();
        java.lang.String str16 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.subtract(fraction12);
        int int18 = fraction12.intValue();
        int int19 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction0.multiplyBy(fraction12);
        byte byte21 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1/1" + "'", str16, "1/1");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        int int10 = fraction9.getProperNumerator();
        short short11 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 9 + "'", short11 == (short) 9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        int int12 = fraction11.getNumerator();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.reduce();
        byte byte15 = fraction14.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.abs();
        byte byte15 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 35, (int) (short) 19, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((int) (byte) 0);
        int int18 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction8.divideBy(fraction15);
        double double20 = fraction19.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.subtract(fraction6);
        double double8 = fraction6.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.multiplyBy(fraction12);
        int int14 = fraction6.compareTo(fraction9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction15 = fraction2.divideBy(fraction6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The fraction to divide by must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) -1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getNumerator();
        int int7 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction12.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction9.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.add(fraction23);
        java.lang.String str26 = fraction23.toProperString();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction19.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long30 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.pow((int) (short) 1);
        java.lang.String str39 = fraction36.toProperString();
        float float40 = fraction36.floatValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.add(fraction48);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.abs();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction45.abs();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction42.add(fraction52);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction41.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction41.reduce();
        int int56 = fraction23.compareTo(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction17.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction3.multiplyBy(fraction17);
        short short59 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1226 + "'", int6 == 1226);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1226 + "'", int7 == 1226);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3/5" + "'", str13, "3/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "35 1/35" + "'", str39, "35 1/35");
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 35.028572f + "'", float40 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 35 + "'", short59 == (short) 35);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction("10 2/5");
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.multiplyBy(fraction14);
        int int16 = fraction14.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction7.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str20 = fraction19.toString();
        int int21 = fraction19.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction18.multiplyBy(fraction19);
        int int23 = fraction19.getDenominator();
        byte byte24 = fraction19.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.028572f + "'", float16 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/3" + "'", str20, "1/3");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 35, 100);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow(10035);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10035 + "'", int4 == 10035);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction3.compareTo(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.negate();
        java.lang.String str11 = fraction3.toProperString();
        int int12 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33" + "'", str11, "33");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.reduce();
        boolean boolean6 = fraction0.equals((java.lang.Object) fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int14 = fraction10.compareTo(fraction13);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction8.multiplyBy(fraction16);
        int int18 = fraction17.getProperNumerator();
        int int19 = fraction0.compareTo(fraction17);
        java.lang.String str20 = fraction17.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "7/1" + "'", str20, "7/1");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.invert();
        int int3 = fraction2.getProperWhole();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction2.divideBy(fraction13);
        int int15 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 5);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.divideBy(fraction13);
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction1.add(fraction14);
        int int17 = fraction1.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2/5" + "'", str6, "2/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.7182131f + "'", float15 == 1.7182131f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(35, (int) (byte) 1, (int) (byte) 33);
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 35 + "'", short4 == (short) 35);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean9 = fraction7.equals((java.lang.Object) (byte) 100);
        int int10 = fraction7.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long23 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction16.invert();
        int int26 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction7.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction3.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction31.add(fraction34);
        java.lang.String str37 = fraction34.toProperString();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction30.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction30.pow((int) (byte) 0);
        int int41 = fraction30.intValue();
        int int42 = fraction28.compareTo(fraction30);
        double double43 = fraction30.doubleValue();
        short short44 = fraction30.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10" + "'", str37, "10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + short44 + "' != '" + (short) 10 + "'", short44 == (short) 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        int int10 = fraction9.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.pow(0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1, 19);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.6f);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 33, 3, 48);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.pow((int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.multiplyBy(fraction5);
        java.lang.Class<?> wildcardClass10 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 10);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        long long2 = fraction0.longValue();
        double double3 = fraction0.doubleValue();
        int int4 = fraction0.getDenominator();
        java.lang.String str5 = fraction0.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        int int12 = fraction11.getNumerator();
        int int13 = fraction11.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.reduce();
        byte byte15 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        int int11 = fraction8.getProperNumerator();
        java.lang.String str12 = fraction8.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1/100" + "'", str12, "1/100");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        boolean boolean21 = fraction18.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((int) (byte) 0);
        int int29 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction19.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction19);
        long long32 = fraction19.longValue();
        int int33 = fraction19.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction7.add(fraction13);
        int int17 = fraction16.getProperWhole();
        java.lang.String str18 = fraction16.toString();
        java.lang.Class<?> wildcardClass19 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "52/5" + "'", str18, "52/5");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        int int9 = fraction8.getProperWhole();
        long long10 = fraction8.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.invert();
        int int12 = fraction11.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction7.multiplyBy(fraction11);
        java.lang.Class<?> wildcardClass14 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.invert();
        byte byte16 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        int int7 = fraction1.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction9.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long20 = fraction19.longValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction13.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction6.divideBy(fraction13);
        long long23 = fraction6.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(33, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/1");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction3.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.abs();
        float float14 = fraction13.floatValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction1.subtract(fraction13);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.4f + "'", float14 == 0.4f);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (byte) 100, (int) (short) 19);
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 37 + "'", short4 == (short) 37);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.abs();
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2/4" + "'", str2, "2/4");
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction9.floatValue();
        int int11 = fraction9.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int15 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.invert();
        int int17 = fraction16.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction8.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.reduce();
        byte byte20 = fraction19.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 21 + "'", byte20 == (byte) 21);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', 10, (int) (byte) -109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        int int7 = fraction5.getProperWhole();
        short short8 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction6.divideBy(fraction10);
        byte byte12 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-40L));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 35, 0, 291);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        float float28 = fraction26.floatValue();
        int int29 = fraction26.getDenominator();
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction11.add(fraction26);
        byte byte33 = fraction26.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 1 + "'", byte33 == (byte) 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 37, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.invert();
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction5.subtract(fraction20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction1.multiplyBy(fraction2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction5.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.004078303425774877d + "'", double3 == 0.004078303425774877d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        byte byte9 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        int int4 = fraction0.getProperWhole();
        float float5 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction6.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str11 = fraction10.toString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.multiplyBy(fraction12);
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.pow((int) 'a');
        org.apache.commons.lang3.math.Fraction fraction19 = fraction0.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.add(fraction26);
        java.lang.String str29 = fraction26.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction22.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.negate();
        float float36 = fraction35.floatValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction32.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -1, 100);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.divideBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.intValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.invert();
        java.lang.String str46 = fraction43.toProperString();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction43.subtract(fraction49);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction32.add(fraction50);
        boolean boolean52 = fraction20.equals((java.lang.Object) fraction51);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3/5" + "'", str11, "3/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-1.0f) + "'", float36 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction7.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction7.reduce();
        java.lang.String str20 = fraction19.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.028572f + "'", float16 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-10" + "'", str20, "-10");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.reduce();
        java.lang.String str4 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1" + "'", str4, "1/1");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        byte byte6 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean9 = fraction7.equals((java.lang.Object) (byte) 100);
        int int10 = fraction7.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long23 = fraction22.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction16.invert();
        int int26 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction7.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction3.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.add(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction15.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((int) (short) 1);
        double double28 = fraction27.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction31.add(fraction34);
        java.lang.String str37 = fraction34.toProperString();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction30.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.negate();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction27.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction21.add(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.intValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.invert();
        float float47 = fraction46.floatValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction46.pow(5);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction41.add(fraction46);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.ONE;
        int int54 = fraction53.getProperWhole();
        long long55 = fraction53.longValue();
        double double56 = fraction53.doubleValue();
        int int57 = fraction53.getDenominator();
        double double58 = fraction53.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction50.multiplyBy(fraction53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction60 = fraction4.divideBy(fraction59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The fraction to divide by must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3/5" + "'", str16, "3/5");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.02857142857143d + "'", double28 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10" + "'", str37, "10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.1f + "'", float47 == 0.1f);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(fraction59);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        int int7 = fraction6.getProperWhole();
        long long8 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        boolean boolean20 = fraction17.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.reduce();
        int int22 = fraction21.getNumerator();
        int int23 = fraction21.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction6.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.invert();
        java.lang.String str29 = fraction26.toProperString();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction6.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction4.multiplyBy(fraction26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction37 = fraction35.pow(1024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -1);
        int int10 = fraction7.intValue();
        int int11 = fraction7.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.negate();
        boolean boolean11 = fraction6.equals((java.lang.Object) fraction10);
        java.lang.Class<?> wildcardClass12 = fraction10.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long2 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        int int15 = fraction12.getDenominator();
        java.lang.String str16 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.subtract(fraction12);
        int int18 = fraction12.intValue();
        int int19 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction1.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction1.add(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction27 = fraction1.multiplyBy(fraction26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1/1" + "'", str16, "1/1");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.1d);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.multiplyBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction0.multiplyBy(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1" + "'", str4, "1/1");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        int int2 = fraction1.getProperWhole();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, (int) (byte) -10);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction("10 2/5");
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.reduce();
        java.lang.Class<?> wildcardClass17 = fraction16.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 10, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.pow((int) (byte) 0);
        int int12 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((int) (short) 1);
        java.lang.String str20 = fraction17.toProperString();
        float float21 = fraction17.floatValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction23.add(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction22.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE;
        int int37 = fraction36.getProperWhole();
        long long38 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.invert();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction40.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction48.invert();
        boolean boolean50 = fraction47.equals((java.lang.Object) fraction48);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.reduce();
        int int52 = fraction51.getNumerator();
        int int53 = fraction51.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction36.add(fraction51);
        int int55 = fraction54.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction22.divideBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction9.divideBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction4.divideBy(fraction9);
        java.lang.Class<?> wildcardClass59 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 1/35" + "'", str20, "35 1/35");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 35.028572f + "'", float21 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 33, (int) (byte) -10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getNumerator();
        int int7 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.add(fraction9);
        java.lang.String str11 = fraction10.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1226 + "'", int6 == 1226);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1226 + "'", int7 == 1226);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2459/70" + "'", str11, "2459/70");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        boolean boolean20 = fraction17.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((int) (byte) 0);
        int int28 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction25);
        boolean boolean30 = fraction8.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        float float34 = fraction32.floatValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.abs();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean41 = fraction39.equals((java.lang.Object) (byte) 100);
        int int42 = fraction39.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.add(fraction48);
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction44.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long55 = fraction54.longValue();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction48.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction48.invert();
        int int58 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction39.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction35.add(fraction48);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int64 = fraction63.intValue();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int67 = fraction66.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction63.add(fraction66);
        java.lang.String str69 = fraction66.toProperString();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction62.divideBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction62.pow((int) (byte) 0);
        int int73 = fraction62.intValue();
        int int74 = fraction60.compareTo(fraction62);
        double double75 = fraction62.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int77 = fraction76.intValue();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int80 = fraction79.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction76.add(fraction79);
        long long82 = fraction81.longValue();
        int int83 = fraction81.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction62.add(fraction81);
        int int85 = fraction0.compareTo(fraction81);
        org.apache.commons.lang3.math.Fraction fraction86 = fraction81.negate();
        java.lang.Class<?> wildcardClass87 = fraction81.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 33 + "'", int42 == 33);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "10" + "'", str69, "10");
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 10L + "'", long82 == 10L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        java.lang.String str1 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2/3" + "'", str1, "2/3");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.multiplyBy(fraction8);
        java.lang.String str10 = fraction7.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2/5" + "'", str10, "2/5");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 9.4f);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction1.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.invert();
        java.lang.Class<?> wildcardClass15 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(10035, (int) (byte) -109, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (short) -10, (int) (byte) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction12.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        float float38 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.pow(5);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction1.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.pow(9);
        java.lang.Class<?> wildcardClass47 = fraction46.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/5" + "'", str7, "3/5");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.02857142857143d + "'", double19 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.1f + "'", float38 == 0.1f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int4 = fraction3.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction5.getProperWhole();
        int int7 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        java.lang.String str12 = fraction9.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction5.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction2.add(fraction5);
        byte byte19 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(2);
        int int5 = fraction2.intValue();
        java.lang.String str6 = fraction2.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97/2" + "'", str6, "97/2");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        java.lang.String str13 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        float float20 = fraction18.floatValue();
        int int21 = fraction18.getDenominator();
        java.lang.String str22 = fraction18.toString();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.subtract(fraction18);
        int int24 = fraction18.intValue();
        int int25 = fraction18.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction1.multiplyBy(fraction18);
        java.lang.Class<?> wildcardClass27 = fraction26.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1/1" + "'", str22, "1/1");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        boolean boolean21 = fraction18.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((int) (byte) 0);
        int int29 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction19.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction19);
        java.lang.String str32 = fraction31.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction34 = fraction31.pow(33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2/5" + "'", str32, "2/5");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str9 = fraction8.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction7.add(fraction8);
        short short11 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3/5" + "'", str9, "3/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -10 + "'", byte3 == (byte) -10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2459/70");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long2 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        int int15 = fraction12.getDenominator();
        java.lang.String str16 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.subtract(fraction12);
        int int18 = fraction12.intValue();
        int int19 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction1.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.negate();
        int int25 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction23.invert();
        int int27 = fraction26.getDenominator();
        int int28 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.subtract(fraction26);
        java.lang.String str30 = fraction21.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1/1" + "'", str16, "1/1");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.pow((int) (short) 1);
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.divideBy(fraction8);
        int int13 = fraction12.getProperNumerator();
        short short14 = fraction12.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 1/35" + "'", str11, "35 1/35");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 175 + "'", int13 == 175);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.pow((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        boolean boolean21 = fraction18.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.pow((int) (byte) 0);
        int int29 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction19.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction19);
        byte byte32 = fraction19.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 1 + "'", byte32 == (byte) 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (-35));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (short) 9, 25);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(291, (int) (byte) 33);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        int int8 = fraction7.getProperWhole();
        int int9 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction11.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.negate();
        float float25 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.subtract(fraction24);
        java.lang.String str27 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction32.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        float float39 = fraction37.floatValue();
        java.lang.String str40 = fraction37.toString();
        long long41 = fraction37.longValue();
        int int42 = fraction37.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction37.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction32.add(fraction47);
        long long49 = fraction32.longValue();
        int int50 = fraction29.compareTo(fraction32);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction24.add(fraction29);
        boolean boolean52 = fraction7.equals((java.lang.Object) fraction29);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int55 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction7.subtract(fraction54);
        byte byte57 = fraction54.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1/1" + "'", str27, "-1/1");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3/5" + "'", str33, "3/5");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.4f + "'", float39 == 0.4f);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2/5" + "'", str40, "2/5");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 3 + "'", byte57 == (byte) 3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.intValue();
        float float4 = fraction1.floatValue();
        long long5 = fraction1.longValue();
        int int6 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.negate();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction9.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction8.multiplyBy(fraction20);
        float float22 = fraction20.floatValue();
        double double23 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        int int25 = fraction24.getProperWhole();
        long long26 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int29 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.add(fraction31);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction28.abs();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.abs();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.invert();
        boolean boolean38 = fraction35.equals((java.lang.Object) fraction36);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.reduce();
        int int40 = fraction39.getNumerator();
        int int41 = fraction39.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction24.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.intValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.invert();
        java.lang.String str47 = fraction44.toProperString();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction44.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction24.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction20.subtract(fraction52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction55 = fraction52.pow(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.4f + "'", float22 == 1.4f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.4d + "'", double23 == 1.4d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("20/1");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((int) (short) 1);
        java.lang.String str18 = fraction15.toProperString();
        float float19 = fraction15.floatValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.reduce();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction10.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction2.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction2.divideBy(fraction23);
        long long25 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35 1/35" + "'", str18, "35 1/35");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 35.028572f + "'", float19 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-10L) + "'", long25 == (-10L));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.negate();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction12.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction9.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction8.multiplyBy(fraction20);
        float float22 = fraction21.floatValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.invert();
        float float24 = fraction23.floatValue();
        java.lang.Object obj25 = null;
        boolean boolean26 = fraction23.equals(obj25);
        short short27 = fraction23.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 49.04f + "'", float22 == 49.04f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.020391516f + "'", float24 == 0.020391516f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.intValue();
        int int8 = fraction3.getDenominator();
        java.lang.String str9 = fraction3.toString();
        short short10 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1226/35" + "'", str9, "1226/35");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 35 + "'", short10 == (short) 35);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        float float14 = fraction12.floatValue();
        java.lang.String str15 = fraction12.toString();
        long long16 = fraction12.longValue();
        int int17 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.add(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction3.add(fraction25);
        int int27 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3/5" + "'", str8, "3/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.4f + "'", float14 == 0.4f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2/5" + "'", str15, "2/5");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1);
        int int2 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction4.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long15 = fraction14.longValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction1.add(fraction17);
        byte byte19 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((int) (short) 1);
        java.lang.String str18 = fraction15.toProperString();
        float float19 = fraction15.floatValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.reduce();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction10.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction2.subtract(fraction21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction24 = fraction22.pow((int) (short) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35 1/35" + "'", str18, "35 1/35");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 35.028572f + "'", float19 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.pow((int) (short) -1);
        long long15 = fraction14.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int4 = fraction3.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction5.getProperWhole();
        int int7 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        java.lang.String str12 = fraction9.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction5.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.invert();
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        float float34 = fraction32.floatValue();
        int int35 = fraction32.getDenominator();
        java.lang.String str36 = fraction32.toString();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction31.subtract(fraction32);
        int int38 = fraction37.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean42 = fraction37.equals((java.lang.Object) fraction41);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction22.divideBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction18.multiplyBy(fraction22);
        int int45 = fraction22.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1/1" + "'", str36, "1/1");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 19 + "'", int38 == 19);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        int int10 = fraction5.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction5.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction0.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        int int19 = fraction17.getNumerator();
        java.lang.String str20 = fraction17.toProperString();
        byte byte21 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-3/5" + "'", str20, "-3/5");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction0.add(fraction5);
        short short13 = fraction5.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        int int2 = fraction1.getNumerator();
        byte byte3 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 21, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        int int3 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.add(fraction7);
        java.lang.String str10 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.divideBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.negate();
        float float17 = fraction16.floatValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.invert();
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        float float30 = fraction28.floatValue();
        int int31 = fraction28.getDenominator();
        java.lang.String str32 = fraction28.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction27.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction13.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.invert();
        boolean boolean36 = fraction1.equals((java.lang.Object) fraction28);
        int int37 = fraction28.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1/1" + "'", str32, "1/1");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction9.intValue();
        int int16 = fraction9.getProperNumerator();
        int int17 = fraction9.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int24 = fraction20.compareTo(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        float float27 = fraction25.floatValue();
        java.lang.String str28 = fraction25.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction20.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int31 = fraction29.compareTo(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction9.add(fraction30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction34 = fraction32.pow(291);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.4f + "'", float27 == 0.4f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2/5" + "'", str28, "2/5");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (byte) 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getNumerator();
        int int7 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str13 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction12.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction9.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.add(fraction23);
        java.lang.String str26 = fraction23.toProperString();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction19.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long30 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.pow((int) (short) 1);
        java.lang.String str39 = fraction36.toProperString();
        float float40 = fraction36.floatValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.negate();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.add(fraction48);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction45.abs();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction45.abs();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction42.add(fraction52);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction41.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction41.reduce();
        int int56 = fraction23.compareTo(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction17.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction3.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int63 = fraction62.intValue();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int66 = fraction65.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction62.add(fraction65);
        java.lang.String str68 = fraction65.toProperString();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction61.divideBy(fraction65);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction61.pow((int) (byte) 0);
        int int72 = fraction61.intValue();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int74 = fraction73.intValue();
        float float75 = fraction73.floatValue();
        java.lang.String str76 = fraction73.toString();
        int int77 = fraction61.compareTo(fraction73);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction59.add(fraction73);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1226 + "'", int6 == 1226);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1226 + "'", int7 == 1226);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3/5" + "'", str13, "3/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "35 1/35" + "'", str39, "35 1/35");
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 35.028572f + "'", float40 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "10" + "'", str68, "10");
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.4f + "'", float75 == 0.4f);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "2/5" + "'", str76, "2/5");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(fraction78);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        int int4 = fraction0.getProperWhole();
        float float5 = fraction0.floatValue();
        float float6 = fraction0.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.pow((int) (byte) 0);
        int int12 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((int) (short) 1);
        java.lang.String str20 = fraction17.toProperString();
        float float21 = fraction17.floatValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction23.add(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction22.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE;
        int int37 = fraction36.getProperWhole();
        long long38 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.invert();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction40.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction48.invert();
        boolean boolean50 = fraction47.equals((java.lang.Object) fraction48);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.reduce();
        int int52 = fraction51.getNumerator();
        int int53 = fraction51.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction36.add(fraction51);
        int int55 = fraction54.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction22.divideBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction9.divideBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction4.divideBy(fraction9);
        long long59 = fraction9.longValue();
        short short60 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 1/35" + "'", str20, "35 1/35");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 35.028572f + "'", float21 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 1 + "'", short60 == (short) 1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(25, (int) (short) 10, (int) 'a');
        short short4 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 25 + "'", short4 == (short) 25);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        int int8 = fraction7.getProperNumerator();
        short short9 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 33);
        long long2 = fraction1.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        boolean boolean4 = fraction1.equals((java.lang.Object) fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        float float16 = fraction14.floatValue();
        int int17 = fraction14.getDenominator();
        java.lang.String str18 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction13.subtract(fraction14);
        int int20 = fraction19.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction1.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.reduce();
        double double23 = fraction22.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1/1" + "'", str18, "1/1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-16.0d) + "'", double23 == (-16.0d));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        java.lang.String str12 = fraction9.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        float float19 = fraction17.floatValue();
        int int20 = fraction17.getDenominator();
        java.lang.String str21 = fraction17.toString();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction16.subtract(fraction17);
        int int23 = fraction17.intValue();
        int int24 = fraction17.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction6.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction17.abs();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction3.subtract(fraction26);
        java.lang.Class<?> wildcardClass28 = fraction3.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1/1" + "'", str21, "1/1");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow(25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction1.multiplyBy(fraction2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, 7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.invert();
        int int3 = fraction2.getProperWhole();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction2.divideBy(fraction13);
        java.lang.String str15 = fraction13.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20" + "'", str15, "20");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.getNumerator();
        float float2 = fraction0.floatValue();
        java.lang.Class<?> wildcardClass3 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.25f + "'", float2 == 0.25f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction12.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        float float38 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.pow(5);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction1.subtract(fraction41);
        java.lang.Class<?> wildcardClass45 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/5" + "'", str7, "3/5");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.02857142857143d + "'", double19 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.1f + "'", float38 == 0.1f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-2), 1, (int) (short) 35);
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -2 + "'", byte4 == (byte) -2);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.01f);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int2 = fraction1.getNumerator();
        float float3 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
        long long5 = fraction4.longValue();
        int int6 = fraction4.getNumerator();
        java.lang.String str7 = fraction4.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/4" + "'", str7, "3/4");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.reduce();
        byte byte11 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction6);
        int int8 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getNumerator();
        int int4 = fraction1.getProperWhole();
        int int5 = fraction1.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(2, 52, (int) '4');
        int int4 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', 0, 9);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.abs();
        java.lang.String str7 = fraction5.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        float float11 = fraction10.floatValue();
        java.lang.String str12 = fraction10.toProperString();
        int int13 = fraction5.compareTo(fraction10);
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1/1" + "'", str7, "1/1");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0040783035f + "'", float11 == 0.0040783035f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5/1226" + "'", str12, "5/1226");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, 9, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        double double10 = fraction4.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6d + "'", double10 == 0.6d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.7182131f);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long2 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        int int15 = fraction12.getDenominator();
        java.lang.String str16 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.subtract(fraction12);
        int int18 = fraction12.intValue();
        int int19 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction1.multiplyBy(fraction12);
        java.lang.String str21 = fraction1.toString();
        int int22 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1/1" + "'", str16, "1/1");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10/1" + "'", str21, "10/1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        boolean boolean20 = fraction17.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((int) (byte) 0);
        int int28 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction25);
        boolean boolean30 = fraction8.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        float float34 = fraction32.floatValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.abs();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean41 = fraction39.equals((java.lang.Object) (byte) 100);
        int int42 = fraction39.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction45.add(fraction48);
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction44.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long55 = fraction54.longValue();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction48.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction48.invert();
        int int58 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction39.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction35.add(fraction48);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int64 = fraction63.intValue();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int67 = fraction66.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction63.add(fraction66);
        java.lang.String str69 = fraction66.toProperString();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction62.divideBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction62.pow((int) (byte) 0);
        int int73 = fraction62.intValue();
        int int74 = fraction60.compareTo(fraction62);
        double double75 = fraction62.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int77 = fraction76.intValue();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int80 = fraction79.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction76.add(fraction79);
        long long82 = fraction81.longValue();
        int int83 = fraction81.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction62.add(fraction81);
        int int85 = fraction0.compareTo(fraction81);
        org.apache.commons.lang3.math.Fraction fraction86 = fraction81.negate();
        float float87 = fraction81.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 33 + "'", int42 == 33);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "10" + "'", str69, "10");
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 10L + "'", long82 == 10L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 10.4f + "'", float87 == 10.4f);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, (int) (byte) 10);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long19 = fraction18.longValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.subtract(fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction12.invert();
        int int22 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction3.multiplyBy(fraction12);
        int int24 = fraction23.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        float float21 = fraction20.floatValue();
        double double22 = fraction20.doubleValue();
        int int23 = fraction20.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction8.subtract(fraction20);
        byte byte25 = fraction24.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction7.add(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) fraction12);
        byte byte14 = fraction12.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long22 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.pow((int) (short) 1);
        java.lang.String str31 = fraction28.toProperString();
        float float32 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.reduce();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.negate();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction37.add(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.abs();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.abs();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction34.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction33.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction33.reduce();
        int int48 = fraction15.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction9.subtract(fraction15);
        float float50 = fraction9.floatValue();
        java.lang.Class<?> wildcardClass51 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "35 1/35" + "'", str31, "35 1/35");
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 35.028572f + "'", float32 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 9.4f + "'", float50 == 9.4f);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.reduce();
        boolean boolean14 = fraction0.equals((java.lang.Object) fraction11);
        int int15 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(97, 5);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction8.add(fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int27 = fraction23.compareTo(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction21.multiplyBy(fraction29);
        long long31 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction19.subtract(fraction30);
        int int33 = fraction3.compareTo(fraction32);
        int int34 = fraction32.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 7L + "'", long31 == 7L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        float float28 = fraction26.floatValue();
        int int29 = fraction26.getDenominator();
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction11.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.negate();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int37 = fraction36.intValue();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction36.abs();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction36.abs();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction33.add(fraction43);
        int int45 = fraction26.compareTo(fraction44);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.add(fraction11);
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction7.divideBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long18 = fraction17.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.add(fraction26);
        java.lang.String str29 = fraction26.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.reduce();
        int int32 = fraction11.compareTo(fraction31);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction4.divideBy(fraction11);
        byte byte34 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 10 + "'", byte34 == (byte) 10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        int int10 = fraction5.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction5.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction0.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int22 = fraction21.getDenominator();
        int int23 = fraction21.getProperWhole();
        int int24 = fraction0.compareTo(fraction21);
        byte byte25 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-35) + "'", int23 == (-35));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        int int10 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.invert();
        int int3 = fraction2.getProperWhole();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction2.divideBy(fraction13);
        java.lang.Class<?> wildcardClass15 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        int int3 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        float float28 = fraction26.floatValue();
        int int29 = fraction26.getDenominator();
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction11.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.pow((int) (byte) 35);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long37 = fraction36.longValue();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.intValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.invert();
        java.lang.String str42 = fraction39.toProperString();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction39.subtract(fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction48 = fraction47.invert();
        float float49 = fraction47.floatValue();
        int int50 = fraction47.getDenominator();
        java.lang.String str51 = fraction47.toString();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction46.subtract(fraction47);
        int int53 = fraction47.intValue();
        int int54 = fraction47.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction36.multiplyBy(fraction47);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int59 = fraction58.intValue();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int62 = fraction61.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction58.add(fraction61);
        java.lang.String str64 = fraction61.toProperString();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction57.divideBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction57.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.invert();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction68.negate();
        float float71 = fraction70.floatValue();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction67.subtract(fraction70);
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int75 = fraction74.intValue();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction74.invert();
        java.lang.String str77 = fraction74.toProperString();
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction74.subtract(fraction80);
        org.apache.commons.lang3.math.Fraction fraction82 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction83 = fraction82.invert();
        float float84 = fraction82.floatValue();
        int int85 = fraction82.getDenominator();
        java.lang.String str86 = fraction82.toString();
        org.apache.commons.lang3.math.Fraction fraction87 = fraction81.subtract(fraction82);
        org.apache.commons.lang3.math.Fraction fraction88 = fraction67.add(fraction82);
        org.apache.commons.lang3.math.Fraction fraction89 = fraction82.invert();
        int int90 = fraction47.compareTo(fraction82);
        org.apache.commons.lang3.math.Fraction fraction91 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction92 = fraction91.invert();
        double double93 = fraction91.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction94 = fraction91.negate();
        java.lang.String str95 = fraction91.toString();
        org.apache.commons.lang3.math.Fraction fraction96 = fraction47.subtract(fraction91);
        org.apache.commons.lang3.math.Fraction fraction97 = fraction34.divideBy(fraction47);
        int int98 = fraction47.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "10" + "'", str42, "10");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1/1" + "'", str51, "1/1");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "10" + "'", str64, "10");
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + (-1.0f) + "'", float71 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "10" + "'", str77, "10");
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 1.0f + "'", float84 == 1.0f);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1/1" + "'", str86, "1/1");
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1/1" + "'", str95, "1/1");
        org.junit.Assert.assertNotNull(fraction96);
        org.junit.Assert.assertNotNull(fraction97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        int int14 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        float float25 = fraction20.floatValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction20.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        int int39 = fraction38.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction30.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction8.add(fraction40);
        int int42 = fraction8.intValue();
        long long43 = fraction8.longValue();
        int int44 = fraction8.intValue();
        byte byte45 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 20L + "'", long43 == 20L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 20 + "'", byte45 == (byte) 20);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1L);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 19, 20);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(7, (int) (short) 33, (int) (byte) -10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        long long11 = fraction10.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        java.lang.String str10 = fraction1.toProperString();
        java.lang.String str11 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10/1" + "'", str11, "10/1");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction12.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        float float38 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.pow(5);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction1.subtract(fraction41);
        java.lang.String str45 = fraction41.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/5" + "'", str7, "3/5");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.02857142857143d + "'", double19 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.1f + "'", float38 == 0.1f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0/1" + "'", str45, "0/1");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow((int) (short) 1);
        double double21 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.add(fraction27);
        java.lang.String str30 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction20.divideBy(fraction32);
        double double34 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction5.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction20.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction20.reduce();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.02857142857143d + "'", double21 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.02857142857143d + "'", double34 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.pow((int) (short) 1);
        double double21 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.add(fraction27);
        java.lang.String str30 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction20.divideBy(fraction32);
        double double34 = fraction20.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction5.divideBy(fraction20);
        java.lang.Class<?> wildcardClass36 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.02857142857143d + "'", double21 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.02857142857143d + "'", double34 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        java.lang.String str8 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1/1" + "'", str8, "1/1");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.add(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        boolean boolean11 = fraction8.equals((java.lang.Object) fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction9.reduce();
        int int13 = fraction12.getNumerator();
        int int14 = fraction12.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.invert();
        float float17 = fraction15.floatValue();
        int int18 = fraction15.getDenominator();
        int int19 = fraction15.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.subtract(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction0.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction23 = fraction21.multiplyBy(fraction22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        float float7 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        byte byte9 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-10.0f) + "'", float7 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        java.lang.String str7 = fraction3.toString();
        java.lang.String str8 = fraction3.toProperString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1226/35" + "'", str7, "1226/35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35 1/35" + "'", str8, "35 1/35");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        int int4 = fraction0.getProperWhole();
        int int5 = fraction0.getDenominator();
        int int6 = fraction0.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.reduce();
        long long12 = fraction11.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.multiplyBy(fraction9);
        int int11 = fraction4.intValue();
        java.lang.Class<?> wildcardClass12 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction10.compareTo(fraction11);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.negate();
        short short14 = fraction11.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1226/25");
        double double2 = fraction1.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.04d + "'", double2 == 49.04d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -109, (int) (byte) 1);
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-109) + "'", int3 == (-109));
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 25, (int) (short) 21);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10L);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 21, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        float float13 = fraction12.floatValue();
        double double14 = fraction12.doubleValue();
        double double15 = fraction12.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.add(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.reduce();
        java.lang.Class<?> wildcardClass12 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        boolean boolean10 = fraction7.equals((java.lang.Object) fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((int) (byte) 0);
        int int18 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction8.divideBy(fraction15);
        int int20 = fraction15.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction15.pow((int) (byte) 97);
        long long23 = fraction15.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        short short7 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("3/4");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-109));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.invert();
        float float28 = fraction26.floatValue();
        int int29 = fraction26.getDenominator();
        java.lang.String str30 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction11.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.pow((int) (byte) 35);
        byte byte35 = fraction34.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 1 + "'", byte35 == (byte) 1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        boolean boolean20 = fraction17.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction18.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow((int) (byte) 0);
        int int28 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.divideBy(fraction25);
        boolean boolean30 = fraction8.equals((java.lang.Object) fraction18);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction0.divideBy(fraction8);
        java.lang.String str32 = fraction31.toProperString();
        double double33 = fraction31.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1/25" + "'", str32, "1/25");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.04d + "'", double33 == 0.04d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long22 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.pow((int) (short) 1);
        java.lang.String str31 = fraction28.toProperString();
        float float32 = fraction28.floatValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.reduce();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.negate();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction37.add(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.abs();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.abs();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction34.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction33.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction33.reduce();
        int int48 = fraction15.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction9.subtract(fraction15);
        float float50 = fraction9.floatValue();
        byte byte51 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "35 1/35" + "'", str31, "35 1/35");
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 35.028572f + "'", float32 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 9.4f + "'", float50 == 9.4f);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 9 + "'", byte51 == (byte) 9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction7.multiplyBy(fraction11);
        short short20 = fraction7.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -33 + "'", short20 == (short) -33);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 3, (int) (byte) -109);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.invert();
        java.lang.String str20 = fraction17.toProperString();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction17.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        float float27 = fraction25.floatValue();
        int int28 = fraction25.getDenominator();
        java.lang.String str29 = fraction25.toString();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction24.subtract(fraction25);
        int int31 = fraction9.compareTo(fraction25);
        java.lang.String str32 = fraction25.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1/1" + "'", str29, "1/1");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        int int11 = fraction1.intValue();
        byte byte12 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 35 + "'", byte12 == (byte) 35);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        int int5 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        boolean boolean19 = fraction16.equals((java.lang.Object) fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.reduce();
        int int21 = fraction20.getNumerator();
        int int22 = fraction20.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction2.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean30 = fraction28.equals((java.lang.Object) (byte) 100);
        int int31 = fraction28.getProperWhole();
        int int32 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction24.add(fraction28);
        java.lang.Class<?> wildcardClass34 = fraction33.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 33 + "'", int31 == 33);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 33 + "'", int32 == 33);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 20, 1226);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(97, 19);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        boolean boolean19 = fraction16.equals((java.lang.Object) fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.reduce();
        int int21 = fraction20.getNumerator();
        int int22 = fraction20.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction2.add(fraction23);
        double double25 = fraction24.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.0d + "'", double25 == 2.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(19, (int) (byte) 97);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.pow((int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.multiplyBy(fraction5);
        java.lang.String str10 = fraction5.toProperString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2/5" + "'", str10, "2/5");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        int int3 = fraction0.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 35, 100);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.reduce();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10035 + "'", int4 == 10035);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.reduce();
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.pow((int) (short) 0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20" + "'", str11, "20");
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction15);
        int int17 = fraction15.getProperNumerator();
        int int18 = fraction15.getProperWhole();
        byte byte19 = fraction15.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(35, (-35));
        int int3 = fraction2.getProperNumerator();
        long long4 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow((int) (byte) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        float float3 = fraction2.floatValue();
        short short4 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0040783035f + "'", float3 == 0.0040783035f);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 33, 5);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.6f + "'", float3 == 6.6f);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.add(fraction7);
        java.lang.String str10 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.divideBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction0.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.invert();
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction0.add(fraction15);
        java.lang.String str20 = fraction0.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1/3" + "'", str1, "1/3");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/3" + "'", str20, "1/3");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean7 = fraction5.equals((java.lang.Object) (byte) 100);
        int int8 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction5.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.multiplyBy(fraction10);
        float float13 = fraction10.floatValue();
        int int14 = fraction10.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        java.lang.Class<?> wildcardClass7 = fraction4.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(25, 291, (int) (short) -33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int8 = fraction7.getDenominator();
        int int9 = fraction7.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.divideBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = fraction10.compareTo(fraction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/10" + "'", str4, "1/10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction9.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction9.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        boolean boolean19 = fraction16.equals((java.lang.Object) fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.reduce();
        int int21 = fraction20.getNumerator();
        int int22 = fraction20.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction2.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean30 = fraction28.equals((java.lang.Object) (byte) 100);
        int int31 = fraction28.getProperWhole();
        int int32 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction24.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction28.abs();
        java.lang.Class<?> wildcardClass35 = fraction28.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 33 + "'", int31 == 33);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 33 + "'", int32 == 33);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        float float14 = fraction12.floatValue();
        java.lang.String str15 = fraction12.toString();
        long long16 = fraction12.longValue();
        int int17 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction7.add(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction3.add(fraction25);
        java.lang.String str27 = fraction26.toProperString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3/5" + "'", str8, "3/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.4f + "'", float14 == 0.4f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2/5" + "'", str15, "2/5");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "31 1/3" + "'", str27, "31 1/3");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.invert();
        int int16 = fraction11.getDenominator();
        byte byte17 = fraction11.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        int int14 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        float float25 = fraction20.floatValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction20.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        int int39 = fraction38.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction30.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction8.add(fraction40);
        long long42 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.ONE;
        int int44 = fraction43.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.reduce();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.pow((int) (byte) 7);
        int int48 = fraction41.compareTo(fraction47);
        short short49 = fraction41.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 30L + "'", long42 == 30L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 30 + "'", short49 == (short) 30);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100/1" + "'", str2, "100/1");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction0.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.add(fraction18);
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction14.divideBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.negate();
        boolean boolean24 = fraction5.equals((java.lang.Object) fraction18);
        short short25 = fraction18.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str7 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.subtract(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.reduce();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction21.divideBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction18.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction12.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        float float38 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.pow(5);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction1.subtract(fraction41);
        byte byte45 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3/5" + "'", str7, "3/5");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.02857142857143d + "'", double19 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.1f + "'", float38 == 0.1f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 10 + "'", byte45 == (byte) 10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        long long7 = fraction6.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction6.pow(47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(2, (int) (short) 0, (int) (short) -33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        int int7 = fraction6.getDenominator();
        int int8 = fraction6.intValue();
        byte byte9 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        java.lang.String str7 = fraction6.toProperString();
        byte byte8 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-10" + "'", str7, "-10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -10 + "'", byte8 == (byte) -10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean16 = fraction14.equals((java.lang.Object) (byte) 100);
        int int17 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction14.compareTo(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction14.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction6.divideBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        float float25 = fraction23.floatValue();
        int int26 = fraction23.getDenominator();
        int int27 = fraction14.compareTo(fraction23);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction23.pow((int) (short) 100);
        java.lang.String str30 = fraction23.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1/1" + "'", str30, "1/1");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.pow((int) (short) 1);
        double double17 = fraction16.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.add(fraction23);
        java.lang.String str26 = fraction23.toProperString();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction19.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction16.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction10.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int34 = fraction33.intValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.invert();
        float float36 = fraction35.floatValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction35.pow(5);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction30.add(fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.02857142857143d + "'", double17 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.1f + "'", float36 == 0.1f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -1, 100);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction11.divideBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.invert();
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction22.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction11.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction11.negate();
        java.lang.Class<?> wildcardClass32 = fraction31.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        int int8 = fraction7.getProperWhole();
        int int9 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction11.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.negate();
        float float25 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.subtract(fraction24);
        java.lang.String str27 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction32.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        float float39 = fraction37.floatValue();
        java.lang.String str40 = fraction37.toString();
        long long41 = fraction37.longValue();
        int int42 = fraction37.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction37.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction32.add(fraction47);
        long long49 = fraction32.longValue();
        int int50 = fraction29.compareTo(fraction32);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction24.add(fraction29);
        boolean boolean52 = fraction7.equals((java.lang.Object) fraction29);
        java.lang.String str53 = fraction7.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1/1" + "'", str27, "-1/1");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3/5" + "'", str33, "3/5");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.4f + "'", float39 == 0.4f);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2/5" + "'", str40, "2/5");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1/100" + "'", str53, "-1/100");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(175, (int) (byte) -2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction7.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str20 = fraction19.toString();
        int int21 = fraction19.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction18.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.pow(2);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.abs();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (short) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.multiplyBy(fraction29);
        float float31 = fraction30.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.028572f + "'", float16 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/3" + "'", str20, "1/3");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.90580916f + "'", float31 == 0.90580916f);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        int int2 = fraction1.getNumerator();
        float float3 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        double double12 = fraction11.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.negate();
        java.lang.String str16 = fraction14.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 9, (int) (short) 9);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.negate();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction14.add(fraction17);
        java.lang.String str20 = fraction17.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction13.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long24 = fraction23.longValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction17.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction8.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction8.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction10.divideBy(fraction11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 30, (int) (short) 35);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.add(fraction7);
        java.lang.String str10 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.divideBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long14 = fraction13.longValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction7.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean21 = fraction19.equals((java.lang.Object) (byte) 100);
        int int22 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction19.compareTo(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction7.divideBy(fraction19);
        boolean boolean27 = fraction1.equals((java.lang.Object) fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.abs();
        int int29 = fraction26.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 33 + "'", int29 == 33);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        int int8 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction6);
        java.lang.Class<?> wildcardClass10 = fraction0.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1" + "'", str4, "1/1");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        short short9 = fraction8.shortValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 35 + "'", short9 == (short) 35);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        java.lang.String str7 = fraction6.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str6 = fraction5.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction5.add(fraction10);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction4.subtract(fraction5);
        int int19 = fraction4.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.invert();
        java.lang.String str24 = fraction21.toProperString();
        int int25 = fraction21.getProperNumerator();
        int int26 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction4.subtract(fraction21);
        int int28 = fraction27.getProperNumerator();
        java.lang.String str29 = fraction27.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3/5" + "'", str6, "3/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-52/5" + "'", str29, "-52/5");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        java.lang.String str17 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        float float29 = fraction27.floatValue();
        java.lang.String str30 = fraction27.toString();
        long long31 = fraction27.longValue();
        int int32 = fraction27.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction27.divideBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction22.add(fraction37);
        long long39 = fraction22.longValue();
        int int40 = fraction19.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction14.add(fraction19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction43 = fraction41.pow(10035);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1/1" + "'", str17, "-1/1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3/5" + "'", str23, "3/5");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.4f + "'", float29 == 0.4f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2/5" + "'", str30, "2/5");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fraction41);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        float float3 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow(2);
        byte byte6 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-3/5");
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.invert();
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction5.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        float float27 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction5.add(fraction26);
        int int29 = fraction5.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long2 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        int int15 = fraction12.getDenominator();
        java.lang.String str16 = fraction12.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.subtract(fraction12);
        int int18 = fraction12.intValue();
        int int19 = fraction12.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction1.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction1.add(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.negate();
        long long27 = fraction25.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1/1" + "'", str16, "1/1");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11L + "'", long27 == 11L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, (-1));
        long long3 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction0.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.add(fraction18);
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction14.divideBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.negate();
        boolean boolean24 = fraction5.equals((java.lang.Object) fraction18);
        java.lang.Class<?> wildcardClass25 = fraction5.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Unable to invert zero.");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        int int3 = fraction0.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        java.lang.String str4 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        int int8 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction13.toString();
        java.lang.String str15 = fraction13.toProperString();
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.add(fraction13);
        int int18 = fraction0.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1" + "'", str4, "1/1");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1/10" + "'", str14, "1/10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1/10" + "'", str15, "1/10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        java.lang.String str3 = fraction2.toString();
        int int4 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1/1" + "'", str3, "1/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        double double6 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 33.0d + "'", double6 == 33.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction1.pow((int) (short) -1);
        short short14 = fraction13.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (int) (byte) 9, 5);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.reduce();
        int int16 = fraction14.getProperNumerator();
        double double17 = fraction14.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 19.0d + "'", double17 == 19.0d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        long long9 = fraction5.longValue();
        int int10 = fraction5.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction5.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction0.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow((int) (byte) 0);
        int int24 = fraction21.intValue();
        boolean boolean25 = fraction0.equals((java.lang.Object) fraction21);
        byte byte26 = fraction21.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3/5" + "'", str1, "3/5");
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2/5" + "'", str8, "2/5");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 1 + "'", byte26 == (byte) 1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        int int8 = fraction7.getProperWhole();
        int int9 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.add(fraction15);
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction11.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction11.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.negate();
        float float25 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.subtract(fraction24);
        java.lang.String str27 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str33 = fraction32.toString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction32.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        float float39 = fraction37.floatValue();
        java.lang.String str40 = fraction37.toString();
        long long41 = fraction37.longValue();
        int int42 = fraction37.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction37.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction32.add(fraction47);
        long long49 = fraction32.longValue();
        int int50 = fraction29.compareTo(fraction32);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction24.add(fraction29);
        boolean boolean52 = fraction7.equals((java.lang.Object) fraction29);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int55 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction7.subtract(fraction54);
        java.lang.Class<?> wildcardClass57 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1/1" + "'", str27, "-1/1");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3/5" + "'", str33, "3/5");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.4f + "'", float39 == 0.4f);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2/5" + "'", str40, "2/5");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction7.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str20 = fraction19.toString();
        int int21 = fraction19.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction18.multiplyBy(fraction19);
        float float23 = fraction22.floatValue();
        int int24 = fraction22.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.028572f + "'", float16 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/3" + "'", str20, "1/3");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.09516041f) + "'", float23 == (-0.09516041f));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1839 + "'", int24 == 1839);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-2), 25);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction8.add(fraction18);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int27 = fraction23.compareTo(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction21.multiplyBy(fraction29);
        long long31 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction19.subtract(fraction30);
        int int33 = fraction3.compareTo(fraction32);
        java.lang.String str34 = fraction32.toString();
        int int35 = fraction32.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 7L + "'", long31 == 7L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-28/5" + "'", str34, "-28/5");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-28) + "'", int35 == (-28));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) -10);
        int int2 = fraction1.getProperWhole();
        int int3 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.negate();
        float float15 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.subtract(fraction14);
        java.lang.String str17 = fraction14.toString();
        java.lang.Class<?> wildcardClass18 = fraction14.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1/1" + "'", str17, "-1/1");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        int int5 = fraction1.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.negate();
        int int7 = fraction6.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        java.lang.String str13 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.subtract(fraction9);
        int int15 = fraction9.intValue();
        int int16 = fraction9.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1/1" + "'", str13, "1/1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction12 = fraction8.pow(175);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        float float10 = fraction5.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int12 = fraction11.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        boolean boolean16 = fraction11.equals((java.lang.Object) fraction15);
        int int17 = fraction11.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1024, (int) (byte) 33, (int) 'a');
        org.junit.Assert.assertNotNull(fraction3);
    }
}

