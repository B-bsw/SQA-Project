package org.apache.commons.math3.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-17.0f), (double) 8, 13);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 2L);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(0);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) '#', (-2));
        int int7 = fraction3.compareTo(fraction6);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (byte) 1, 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction8.divide((int) '#');
        double double14 = bigFraction13.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.add((int) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.divide(4L);
        java.math.BigInteger bigInteger21 = bigFraction18.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction16.divide(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction32.add((long) 2);
        java.math.BigInteger bigInteger36 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction28.subtract(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.subtract((int) (short) -2);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction16.divide(bigFraction38);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.3142857142857143d) + "'", double14 == (-0.3142857142857143d));
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction41);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        java.math.BigInteger bigInteger7 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.multiply(4L);
        float float11 = bigFraction8.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 6, 200);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(102, 13);
        int int3 = fraction2.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 52);
        double double2 = fraction1.percentageValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5200.0d + "'", double2 == 5200.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        java.lang.String str3 = bigFraction2.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.subtract((long) '4');
        java.math.BigDecimal bigDecimal8 = bigFraction5.bigDecimalValue((int) (short) -1, 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add((long) 2);
        java.math.BigInteger bigInteger16 = bigFraction12.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction(bigInteger16);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction(bigInteger16);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction(bigInteger16);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction5.add(bigInteger16);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal25 = bigFraction24.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction24.abs();
        double double27 = bigFraction26.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction32.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal39 = bigFraction38.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add((long) 2);
        java.math.BigInteger bigInteger42 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction34.subtract(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction26.divide(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.add((long) 100);
        java.math.BigInteger bigInteger47 = bigFraction44.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction48.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction44.multiply(bigFraction49);
        java.lang.String str51 = bigFraction50.toString();
        int int52 = bigFraction5.compareTo(bigFraction50);
        double double53 = bigFraction5.percentageValue();
        int int54 = bigFraction5.getDenominatorAsInt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigInteger47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "3 / 5" + "'", str51, "3 / 5");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-5200.0d) + "'", double53 == (-5200.0d));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.add((int) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.divide((int) (short) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        long long26 = bigFraction25.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal31 = bigFraction30.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction30.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.add((long) 2);
        java.math.BigInteger bigInteger40 = bigFraction36.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = new org.apache.commons.math3.fraction.BigFraction(bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction32.divide(bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction25.add(bigInteger40);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction43.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction22.divide(bigFraction43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction43.subtract(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal52 = bigFraction51.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction51.abs();
        double double54 = bigFraction51.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction51.add((long) (short) 100);
        boolean boolean58 = bigFraction56.equals((java.lang.Object) 1.0d);
        java.math.BigInteger bigInteger59 = bigFraction56.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction56.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction43.divide(bigFraction60);
        boolean boolean62 = fraction12.equals((java.lang.Object) bigFraction60);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((double) 50, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 50 to fraction (-49/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(200);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.add(5);
        java.lang.String str7 = fraction1.toString();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction1.negate();
        int int9 = fraction1.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2 / 3" + "'", str7, "2 / 3");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.add((long) 2);
        java.math.BigInteger bigInteger24 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction16.subtract(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction9.divide(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction5.divide(bigFraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal32 = bigFraction31.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal39 = bigFraction38.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add((long) 2);
        java.math.BigInteger bigInteger42 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction31.add(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction27.add(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction27.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction46.subtract((long) 50);
        long long49 = bigFraction48.longValue();
        double double51 = bigFraction48.pow((double) 0.6f);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-49L) + "'", long49 == (-49L));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply((int) (short) 0);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        boolean boolean29 = fraction21.equals((java.lang.Object) bigFraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction7.add(fraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.abs();
        double double39 = bigFraction38.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal51 = bigFraction50.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction50.add((long) 2);
        java.math.BigInteger bigInteger54 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction46.subtract(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction38.divide(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction56.add((long) 100);
        java.math.BigInteger bigInteger59 = bigFraction56.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction56.multiply(bigFraction61);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField63 = bigFraction62.getField();
        boolean boolean64 = fraction21.equals((java.lang.Object) bigFraction62);
        org.apache.commons.math3.fraction.FractionField fractionField65 = fraction21.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFractionField63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(fractionField65);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.5d, 6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal5 = bigFraction4.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.abs();
        double double7 = bigFraction6.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal19 = bigFraction18.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction18.add((long) 2);
        java.math.BigInteger bigInteger22 = bigFraction18.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction14.subtract(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction6.divide(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction0.add(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        long long29 = bigFraction28.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal34 = bigFraction33.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction33.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal40 = bigFraction39.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction39.add((long) 2);
        java.math.BigInteger bigInteger43 = bigFraction39.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction35.divide(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction28.add(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction25.divide(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal52 = bigFraction51.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction51.abs();
        double double54 = bigFraction53.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction53.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal60 = bigFraction59.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction59.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal66 = bigFraction65.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction65.add((long) 2);
        java.math.BigInteger bigInteger69 = bigFraction65.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction61.subtract(bigInteger69);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = bigFraction53.divide(bigInteger69);
        java.math.BigInteger bigInteger72 = bigFraction71.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = new org.apache.commons.math3.fraction.BigFraction(bigInteger43, bigInteger72);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = bigFraction73.multiply((long) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = bigFraction73.add(1700);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigInteger69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigInteger72);
        org.junit.Assert.assertNotNull(bigFraction75);
        org.junit.Assert.assertNotNull(bigFraction77);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, 6);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal5 = bigFraction4.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction4.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction7.multiply(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add((long) 2);
        java.math.BigInteger bigInteger30 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction22.subtract(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction15.divide(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction11.multiply(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal38 = bigFraction37.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction37.abs();
        float float40 = bigFraction37.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction33.divide(bigFraction37);
        boolean boolean42 = fraction0.equals((java.lang.Object) bigFraction41);
        double double43 = bigFraction41.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction45.multiply((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.subtract(1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction41.subtract(bigFraction47);
        byte byte51 = bigFraction41.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 0 + "'", byte51 == (byte) 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        boolean boolean6 = fraction4.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction4.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction4.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.multiply(fraction27);
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.add(5);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean35 = fraction33.equals((java.lang.Object) fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction4.subtract(fraction33);
        float float38 = fraction37.floatValue();
        double double39 = fraction37.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 4.0f + "'", float38 == 4.0f);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(0);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.subtract(35);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.multiply((int) (short) 14);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = bigFraction0.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply(100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.reduce();
        double double6 = bigFraction4.pow((-2.2d));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply((int) (short) 0);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        boolean boolean29 = fraction21.equals((java.lang.Object) bigFraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction7.add(fraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.abs();
        double double39 = bigFraction38.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal51 = bigFraction50.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction50.add((long) 2);
        java.math.BigInteger bigInteger54 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction46.subtract(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction38.divide(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction56.add((long) 100);
        java.math.BigInteger bigInteger59 = bigFraction56.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction56.multiply(bigFraction61);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField63 = bigFraction62.getField();
        boolean boolean64 = fraction21.equals((java.lang.Object) bigFraction62);
        org.apache.commons.math3.fraction.Fraction fraction65 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction65.divide((int) 'a');
        org.apache.commons.math3.fraction.FractionField fractionField68 = fraction65.getField();
        double double69 = fraction65.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction70 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField71 = fraction70.getField();
        org.apache.commons.math3.fraction.Fraction fraction72 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int73 = fraction72.intValue();
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction70.multiply(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction75 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField76 = fraction75.getField();
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction70.divide(fraction75);
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction65.add(fraction70);
        double double79 = fraction78.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction80 = fraction21.subtract(fraction78);
        int int81 = fraction78.getDenominator();
        int int82 = fraction78.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFractionField63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fractionField68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.2d + "'", double69 == 0.2d);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fractionField71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fractionField76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.2d + "'", double79 == 2.2d);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5 + "'", int82 == 5);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction1.negate();
        long long3 = bigFraction2.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction2.divide(50L);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 32, 32L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction3.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.abs();
        double double15 = bigFraction14.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        java.math.BigInteger bigInteger29 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction21.subtract(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction14.pow(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction3.subtract(bigFraction31);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction3.multiply((long) (byte) 100);
        long long35 = bigFraction34.getDenominatorAsLong();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(4, (int) (byte) 1);
        double double3 = fraction2.percentageValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 400.0d + "'", double3 == 400.0d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        java.lang.String str6 = bigFraction5.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = org.apache.commons.math3.fraction.BigFraction.TWO_QUARTERS;
        double double8 = bigFraction7.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction7.subtract(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction5.subtract(bigFraction17);
        java.lang.Class<?> wildcardClass20 = bigFraction5.getClass();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1" + "'", str6, "1");
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (byte) 0);
        long long2 = bigFraction1.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.multiply((long) (-2));
        int int5 = bigFraction1.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-11.0d), (double) 8.0f, (int) (byte) 10);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.abs();
        double double15 = bigFraction12.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction12.subtract((long) (-1));
        double double19 = bigFraction17.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal24 = bigFraction23.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction23.add((long) 2);
        java.math.BigInteger bigInteger27 = bigFraction23.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction17.subtract(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction8.divide(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction3.divide(bigInteger27);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.pow((int) (byte) 1);
        java.lang.String str34 = bigFraction33.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction33.add((-2));
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.multiply((long) 0);
        int int41 = bigFraction40.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction40.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction33.subtract(bigFraction40);
        int int44 = bigFraction43.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1" + "'", str34, "1");
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        double double2 = bigFraction0.pow(0.0d);
        double double3 = bigFraction0.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction9.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.add((long) 2);
        java.math.BigInteger bigInteger19 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction11.add(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction5.subtract(bigFraction11);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction0.subtract(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25.0d + "'", double3 == 25.0d);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.add((int) '#');
        double double8 = bigFraction5.percentageValue();
        int int9 = bigFraction5.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction5.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.TWO;
        int int13 = bigFraction12.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal18 = bigFraction17.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal23 = bigFraction22.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal29 = bigFraction28.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add((long) 2);
        java.math.BigInteger bigInteger32 = bigFraction28.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction24.subtract(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction17.divide(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction17.multiply(10L);
        java.math.BigInteger bigInteger37 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction12.pow(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction11.pow(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction39.divide((long) (byte) -1);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField42 = bigFraction41.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction41.add((int) (byte) 8);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFractionField42);
        org.junit.Assert.assertNotNull(bigFraction44);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal5 = bigFraction4.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal11 = bigFraction10.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction10.add((long) 2);
        java.math.BigInteger bigInteger14 = bigFraction10.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction6.add(bigInteger14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction6.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.abs();
        double double23 = bigFraction22.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal28 = bigFraction27.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction27.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal34 = bigFraction33.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction33.add((long) 2);
        java.math.BigInteger bigInteger37 = bigFraction33.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction29.subtract(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction22.pow(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal44 = bigFraction43.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction43.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal50 = bigFraction49.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction49.add((long) 2);
        java.math.BigInteger bigInteger53 = bigFraction49.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction45.add(bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction22.add(bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction16.multiply(bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction16.pow(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction58.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction59.multiply((long) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction61.divide(4);
        boolean boolean64 = fraction0.equals((java.lang.Object) bigFraction63);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction66 = fraction0.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal5 = bigFraction4.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.abs();
        double double7 = bigFraction4.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction4.subtract((long) (-1));
        double double11 = bigFraction9.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.add((long) 2);
        java.math.BigInteger bigInteger19 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction9.subtract(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction0.divide(bigInteger19);
        double double23 = bigFraction0.doubleValue();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.4d + "'", double23 == 0.4d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction8.multiply(bigFraction17);
        int int19 = bigFraction18.getDenominatorAsInt();
        long long20 = bigFraction18.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal25 = bigFraction24.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction24.abs();
        double double27 = bigFraction26.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal32 = bigFraction31.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction31.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal38 = bigFraction37.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction37.add((long) 2);
        java.math.BigInteger bigInteger41 = bigFraction37.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction33.subtract(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction26.pow(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal48 = bigFraction47.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction53.add((long) 2);
        java.math.BigInteger bigInteger57 = bigFraction53.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction49.add(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction26.add(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction18.pow(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.abs();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11L + "'", long20 == 11L);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction5.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal11 = bigFraction10.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        java.math.BigInteger bigInteger20 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction12.subtract(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction5.pow(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction32.add((long) 2);
        java.math.BigInteger bigInteger36 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction28.divide(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction5.divide(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction5.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction5.multiply((long) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction5.subtract(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.subtract(0);
        java.math.BigDecimal bigDecimal47 = bigFraction46.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction46.multiply((long) (short) -1);
        java.math.BigDecimal bigDecimal50 = bigFraction49.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigDecimal47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal50);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(5);
        int int3 = fraction0.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply((int) (short) 0);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        boolean boolean29 = fraction21.equals((java.lang.Object) bigFraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction7.add(fraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.abs();
        double double39 = bigFraction38.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal51 = bigFraction50.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction50.add((long) 2);
        java.math.BigInteger bigInteger54 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction46.subtract(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction38.divide(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction56.add((long) 100);
        java.math.BigInteger bigInteger59 = bigFraction56.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction60.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction56.multiply(bigFraction61);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField63 = bigFraction62.getField();
        boolean boolean64 = fraction21.equals((java.lang.Object) bigFraction62);
        org.apache.commons.math3.fraction.Fraction fraction65 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction65.divide((int) 'a');
        org.apache.commons.math3.fraction.FractionField fractionField68 = fraction65.getField();
        double double69 = fraction65.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction70 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField71 = fraction70.getField();
        org.apache.commons.math3.fraction.Fraction fraction72 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int73 = fraction72.intValue();
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction70.multiply(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction75 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField76 = fraction75.getField();
        org.apache.commons.math3.fraction.Fraction fraction77 = fraction70.divide(fraction75);
        org.apache.commons.math3.fraction.Fraction fraction78 = fraction65.add(fraction70);
        double double79 = fraction78.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction80 = fraction21.subtract(fraction78);
        org.apache.commons.math3.fraction.Fraction fraction84 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 8, (double) 2.0f, 0);
        org.apache.commons.math3.fraction.Fraction fraction85 = fraction78.add(fraction84);
        org.apache.commons.math3.fraction.BigFraction bigFraction88 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction((int) (byte) -5, (int) (short) 11);
        boolean boolean89 = fraction78.equals((java.lang.Object) bigFraction88);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigFractionField63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fractionField68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.2d + "'", double69 == 0.2d);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fractionField71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fractionField76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.2d + "'", double79 == 2.2d);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(bigFraction88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) 'a');
        float float5 = fraction4.floatValue();
        java.lang.String str6 = fraction4.toString();
        int int7 = fraction4.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.negate();
        double double14 = bigFraction13.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.divide(5);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction13.abs();
        java.lang.String str18 = bigFraction13.toString();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean21 = fraction19.equals((java.lang.Object) fraction20);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) '#', (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction19.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction24.abs();
        double double27 = fraction26.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.divide((int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        boolean boolean36 = fraction34.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction34.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction39 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int43 = fraction42.intValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction40.multiply(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField46 = fraction45.getField();
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int48 = fraction47.intValue();
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction45.multiply(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction44.subtract(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction39.multiply(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction34.subtract(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction34.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction55 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField56 = fraction55.getField();
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int58 = fraction57.intValue();
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction55.multiply(fraction57);
        java.lang.String str60 = fraction59.toString();
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction59.add(5);
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction64 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean65 = fraction63.equals((java.lang.Object) fraction64);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction62.add(fraction63);
        org.apache.commons.math3.fraction.Fraction fraction67 = fraction34.subtract(fraction63);
        org.apache.commons.math3.fraction.Fraction fraction68 = fraction26.subtract(fraction34);
        boolean boolean69 = bigFraction13.equals((java.lang.Object) fraction68);
        boolean boolean70 = fraction4.equals((java.lang.Object) boolean69);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-92.0f) + "'", float5 == (-92.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-92" + "'", str6, "-92");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-92) + "'", int7 == (-92));
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 36.08247422680412d + "'", double27 == 36.08247422680412d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fractionField46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fractionField56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4" + "'", str60, "4");
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        boolean boolean6 = fraction4.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction4.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction4.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.multiply(fraction27);
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction29.add(5);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean35 = fraction33.equals((java.lang.Object) fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction32.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction4.subtract(fraction33);
        float float38 = fraction37.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction37.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField41 = fraction40.getField();
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int43 = fraction42.intValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction40.multiply(fraction42);
        boolean boolean46 = fraction44.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction44.subtract(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField52 = fraction51.getField();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int54 = fraction53.intValue();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction51.multiply(fraction53);
        boolean boolean57 = fraction55.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction55.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction60 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction61 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField62 = fraction61.getField();
        org.apache.commons.math3.fraction.Fraction fraction63 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int64 = fraction63.intValue();
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction61.multiply(fraction63);
        org.apache.commons.math3.fraction.Fraction fraction66 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField67 = fraction66.getField();
        org.apache.commons.math3.fraction.Fraction fraction68 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int69 = fraction68.intValue();
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction66.multiply(fraction68);
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction65.subtract(fraction66);
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction60.multiply(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction55.subtract(fraction72);
        int int74 = fraction49.compareTo(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction39.multiply(fraction49);
        double double76 = fraction75.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 4.0f + "'", float38 == 4.0f);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fractionField41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fractionField52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fractionField62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fractionField67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 250.0d + "'", double76 == 250.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        java.math.BigInteger bigInteger13 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction5.add((long) 32);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 121);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(6.0466176E7d, (int) (byte) 99);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 60,466,176 to fraction (-60,466,175/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float1 = bigFraction0.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal7 = bigFraction6.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction6.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.abs();
        double double18 = bigFraction15.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction15.subtract((long) (-1));
        double double22 = bigFraction20.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add((long) 2);
        java.math.BigInteger bigInteger30 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction20.subtract(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction11.divide(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction6.divide(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction34.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction0.divide(bigFraction34);
        java.lang.String str37 = bigFraction36.toString();
        float float38 = bigFraction36.floatValue();
        java.lang.String str39 = bigFraction36.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25f + "'", float1 == 0.25f);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1 / 4" + "'", str37, "1 / 4");
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.25f + "'", float38 == 0.25f);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1 / 4" + "'", str39, "1 / 4");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        boolean boolean20 = fraction12.equals((java.lang.Object) bigFraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction12.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField25 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int27 = fraction26.intValue();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction24.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField30 = fraction29.getField();
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int32 = fraction31.intValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction29.multiply(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction28.subtract(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction23.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction22.add(fraction28);
        float float37 = fraction28.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fractionField30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 4.0f + "'", float37 == 4.0f);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((int) (byte) 71, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.ZeroException; message: denominator must be different from 0");
        } catch (org.apache.commons.math3.exception.ZeroException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(4);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.divide((-92));
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.add((-683606016));
        java.math.BigDecimal bigDecimal6 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(100L, (long) 1);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField3 = bigFraction2.getField();
        org.junit.Assert.assertNotNull(bigFractionField3);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) 100);
        long long2 = bigFraction1.longValue();
        java.math.BigInteger bigInteger3 = bigFraction1.getNumerator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        double double6 = bigFraction5.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.divide(5);
        java.lang.String str9 = bigFraction5.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.abs();
        long long16 = bigFraction15.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add((long) 2);
        java.math.BigInteger bigInteger30 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction22.divide(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction22.multiply((long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.add((long) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction15.multiply(bigFraction34);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction5.divide(bigFraction15);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal43 = bigFraction42.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction42.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.add((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction15.subtract(bigFraction46);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction46.pow(5);
        java.math.BigInteger bigInteger50 = bigFraction46.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal55 = bigFraction54.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction54.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction56.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction56.pow((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal65 = bigFraction64.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction64.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal71 = bigFraction70.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction70.add((long) 2);
        java.math.BigInteger bigInteger74 = bigFraction70.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = new org.apache.commons.math3.fraction.BigFraction(bigInteger74);
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction66.divide(bigInteger74);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = bigFraction60.multiply(bigInteger74);
        org.apache.commons.math3.fraction.BigFraction bigFraction78 = bigFraction46.subtract(bigInteger74);
        java.math.BigInteger bigInteger79 = bigFraction78.getDenominator();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigDecimal55);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigDecimal71);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigInteger74);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigFraction77);
        org.junit.Assert.assertNotNull(bigFraction78);
        org.junit.Assert.assertNotNull(bigInteger79);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal9 = bigFraction8.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction14.add((long) 2);
        java.math.BigInteger bigInteger18 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction10.subtract(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction3.divide(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction3.multiply(10L);
        java.math.BigInteger bigInteger23 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction3.add((-2));
        org.apache.commons.math3.fraction.BigFractionField bigFractionField26 = bigFraction3.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal31 = bigFraction30.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction30.negate();
        double double33 = bigFraction32.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction32.divide(5);
        java.lang.String str36 = bigFraction32.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal41 = bigFraction40.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction40.abs();
        long long43 = bigFraction42.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal48 = bigFraction47.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction53.add((long) 2);
        java.math.BigInteger bigInteger57 = bigFraction53.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = new org.apache.commons.math3.fraction.BigFraction(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction49.divide(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction49.multiply((long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction61.add((long) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction42.multiply(bigFraction61);
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction32.divide(bigFraction42);
        java.math.BigInteger bigInteger66 = bigFraction65.getNumerator();
        int int67 = bigFraction65.getNumeratorAsInt();
        java.math.BigDecimal bigDecimal68 = bigFraction65.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction3.multiply(bigFraction65);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFractionField26);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1" + "'", str36, "1");
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigInteger66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigFraction69);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean2 = fraction0.equals((java.lang.Object) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) '#', (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.abs();
        double double8 = fraction7.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 8);
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.add(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction10.subtract(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.add((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        int int25 = fraction21.compareTo(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.multiply(fraction21);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 36.08247422680412d + "'", double8 == 36.08247422680412d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        double double6 = bigFraction5.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.divide(5);
        java.lang.String str9 = bigFraction5.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.abs();
        long long16 = bigFraction15.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add((long) 2);
        java.math.BigInteger bigInteger30 = bigFraction26.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction22.divide(bigInteger30);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction22.multiply((long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.add((long) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction15.multiply(bigFraction34);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction5.divide(bigFraction15);
        java.math.BigInteger bigInteger39 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal44 = bigFraction43.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction43.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal50 = bigFraction49.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction49.add((long) 2);
        java.math.BigInteger bigInteger53 = bigFraction49.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction(bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction45.divide(bigInteger53);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = new org.apache.commons.math3.fraction.BigFraction(bigInteger39, bigInteger53);
        long long57 = bigFraction56.getDenominatorAsLong();
        double double58 = bigFraction56.percentageValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigDecimal44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigDecimal50);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-100.0d) + "'", double58 == (-100.0d));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.getReducedFraction(52, (-11));
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.add((int) '#');
        double double8 = bigFraction5.percentageValue();
        int int9 = bigFraction5.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction5.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.TWO;
        int int13 = bigFraction12.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal18 = bigFraction17.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal23 = bigFraction22.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal29 = bigFraction28.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add((long) 2);
        java.math.BigInteger bigInteger32 = bigFraction28.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction24.subtract(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction17.divide(bigInteger32);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction17.multiply(10L);
        java.math.BigInteger bigInteger37 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction12.pow(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction11.pow(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction39.divide((long) (byte) -1);
        double double42 = bigFraction41.doubleValue();
        double double43 = bigFraction41.doubleValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.add((long) 2);
        java.math.BigInteger bigInteger24 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction16.subtract(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction9.divide(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction5.divide(bigFraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal32 = bigFraction31.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction31.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal39 = bigFraction38.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add((long) 2);
        java.math.BigInteger bigInteger42 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction31.add(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction27.add(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction27.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction46.subtract((long) (short) 11);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigDecimal32);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction48);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction8.multiply(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.pow((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.pow(2L);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        double double29 = bigFraction26.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction26.subtract((long) (-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal36 = bigFraction35.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction35.abs();
        double double38 = bigFraction37.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction37.abs();
        double double41 = bigFraction39.pow((double) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal46 = bigFraction45.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction45.abs();
        double double48 = bigFraction47.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction53.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal60 = bigFraction59.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction59.add((long) 2);
        java.math.BigInteger bigInteger63 = bigFraction59.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction55.subtract(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction47.divide(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction39.add(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction31.add(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal72 = bigFraction71.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction71.abs();
        double double74 = bigFraction71.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction71.add((long) (short) 100);
        boolean boolean78 = bigFraction76.equals((java.lang.Object) 1.0d);
        java.math.BigInteger bigInteger79 = bigFraction76.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction80 = new org.apache.commons.math3.fraction.BigFraction(bigInteger63, bigInteger79);
        org.apache.commons.math3.fraction.BigFraction bigFraction81 = bigFraction20.subtract(bigInteger79);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigDecimal72);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(bigFraction81);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 9, 8);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((double) (short) 100, (-78));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 100 to fraction (-99/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction5.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal11 = bigFraction10.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        java.math.BigInteger bigInteger20 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction12.subtract(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction5.pow(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction22.pow(5);
        java.math.BigDecimal bigDecimal26 = bigFraction24.bigDecimalValue((int) (byte) 0);
        long long27 = bigFraction24.longValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(5000.0d);
        double double2 = fraction1.doubleValue();
        double double3 = fraction1.percentageValue();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5000.0d + "'", double2 == 5000.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 500000.0d + "'", double3 == 500000.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_QUARTERS;
        double double1 = bigFraction0.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction5.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction0.subtract(bigFraction10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction11.abs();
        long long13 = bigFraction11.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        long long15 = bigFraction14.getNumeratorAsLong();
        boolean boolean16 = bigFraction11.equals((java.lang.Object) bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction14.add(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction14.add(97);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal25 = bigFraction24.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction24.abs();
        double double27 = bigFraction24.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction24.add((long) (short) 100);
        int int30 = bigFraction24.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal35 = bigFraction34.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.add((int) '#');
        double double39 = bigFraction36.percentageValue();
        int int40 = bigFraction36.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction36.divide((int) (byte) -1);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = org.apache.commons.math3.fraction.BigFraction.TWO;
        int int44 = bigFraction43.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal49 = bigFraction48.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction53.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal60 = bigFraction59.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction59.add((long) 2);
        java.math.BigInteger bigInteger63 = bigFraction59.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction55.subtract(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction48.divide(bigInteger63);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction48.multiply(10L);
        java.math.BigInteger bigInteger68 = bigFraction48.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction43.pow(bigInteger68);
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction42.pow(bigInteger68);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = bigFraction24.add(bigInteger68);
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = bigFraction71.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction14.subtract(bigFraction72);
        org.apache.commons.math3.fraction.BigFraction bigFraction75 = bigFraction14.add((-35));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
        org.junit.Assert.assertNotNull(bigDecimal6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigDecimal25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigDecimal60);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertNotNull(bigFraction71);
        org.junit.Assert.assertNotNull(bigFraction72);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigFraction75);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 1);
        int int2 = bigFraction1.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction1.pow(35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(5);
        int int6 = fraction2.compareTo(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction14.multiply(fraction16);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction13.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.multiply(fraction21);
        java.lang.String str23 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction3.add(fraction8);
        int int25 = fraction8.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal11 = bigFraction10.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction10.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        java.math.BigInteger bigInteger20 = bigFraction16.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction12.divide(bigInteger20);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal28 = bigFraction27.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction27.abs();
        double double30 = bigFraction27.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction27.subtract((long) (-1));
        double double34 = bigFraction32.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal39 = bigFraction38.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction38.add((long) 2);
        java.math.BigInteger bigInteger42 = bigFraction38.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction32.subtract(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction23.divide(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = new org.apache.commons.math3.fraction.BigFraction(bigInteger20, bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction3.divide(bigInteger42);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.multiply(3);
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction53.add((long) 2);
        java.math.BigInteger bigInteger57 = bigFraction53.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = new org.apache.commons.math3.fraction.BigFraction(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = new org.apache.commons.math3.fraction.BigFraction(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal64 = bigFraction63.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction63.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction59.multiply(bigFraction63);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction47.multiply(bigFraction63);
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal73 = bigFraction72.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction74 = bigFraction72.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction78 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal79 = bigFraction78.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction81 = bigFraction78.add((long) 2);
        java.math.BigInteger bigInteger82 = bigFraction78.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction83 = new org.apache.commons.math3.fraction.BigFraction(bigInteger82);
        org.apache.commons.math3.fraction.BigFraction bigFraction84 = bigFraction74.divide(bigInteger82);
        org.apache.commons.math3.fraction.BigFraction bigFraction85 = bigFraction84.abs();
        int int86 = bigFraction47.compareTo(bigFraction84);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigDecimal28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal39);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigDecimal64);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigDecimal73);
        org.junit.Assert.assertNotNull(bigFraction74);
        org.junit.Assert.assertNotNull(bigDecimal79);
        org.junit.Assert.assertNotNull(bigFraction81);
        org.junit.Assert.assertNotNull(bigInteger82);
        org.junit.Assert.assertNotNull(bigFraction84);
        org.junit.Assert.assertNotNull(bigFraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        float float1 = bigFraction0.floatValue();
        double double3 = bigFraction0.pow((double) 1L);
        java.math.BigDecimal bigDecimal4 = bigFraction0.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction0.divide(50L);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction0.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.25f + "'", float1 == 0.25f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.25d + "'", double3 == 0.25d);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction7);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        java.math.BigInteger bigInteger13 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction(12);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add(bigFraction18);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction19);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) 50);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction3.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (-1));
        double double10 = bigFraction8.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction14.add((long) 2);
        java.math.BigInteger bigInteger18 = bigFraction14.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction8.subtract(bigInteger18);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.pow(5);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = org.apache.commons.math3.fraction.BigFraction.TWO;
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.divide((long) '4');
        int int26 = bigFraction23.getNumeratorAsInt();
        java.math.BigDecimal bigDecimal27 = bigFraction23.bigDecimalValue();
        int int28 = bigFraction22.compareTo(bigFraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField36 = fraction35.getField();
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int38 = fraction37.intValue();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction35.multiply(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction34.subtract(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction29.multiply(fraction34);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal46 = bigFraction45.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction45.abs();
        boolean boolean48 = fraction29.equals((java.lang.Object) bigFraction45);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction45.multiply(4);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction52 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField53 = fraction52.getField();
        org.apache.commons.math3.fraction.Fraction fraction54 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int55 = fraction54.intValue();
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction52.multiply(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField58 = fraction57.getField();
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int60 = fraction59.intValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction57.multiply(fraction59);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction56.subtract(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction51.multiply(fraction56);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal68 = bigFraction67.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction67.add((long) 2);
        boolean boolean71 = fraction63.equals((java.lang.Object) bigFraction70);
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction70.divide(35);
        org.apache.commons.math3.fraction.BigFraction bigFraction74 = bigFraction45.multiply(bigFraction70);
        boolean boolean75 = bigFraction23.equals((java.lang.Object) bigFraction70);
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction70.negate();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fractionField36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(bigDecimal46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fractionField53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fractionField58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(bigDecimal68);
        org.junit.Assert.assertNotNull(bigFraction70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bigFraction73);
        org.junit.Assert.assertNotNull(bigFraction74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(bigFraction76);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.divide(1);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean2 = fraction0.equals((java.lang.Object) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) '#', (int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.abs();
        double double8 = fraction7.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.divide((int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField12 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int14 = fraction13.intValue();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction11.multiply(fraction13);
        boolean boolean17 = fraction15.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction20.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction15.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction15.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField37 = fraction36.getField();
        org.apache.commons.math3.fraction.Fraction fraction38 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int39 = fraction38.intValue();
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction36.multiply(fraction38);
        java.lang.String str41 = fraction40.toString();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction40.add(5);
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean46 = fraction44.equals((java.lang.Object) fraction45);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.add(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction15.subtract(fraction44);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction7.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction7.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField52 = fraction51.getField();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int54 = fraction53.intValue();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction51.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction53.add((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction57.subtract(0);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction7.divide(fraction59);
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction62.multiply((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction64.pow((long) 2);
        org.apache.commons.math3.fraction.Fraction fraction69 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 1);
        java.lang.String str70 = fraction69.toString();
        org.apache.commons.math3.fraction.Fraction fraction71 = fraction69.abs();
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction69.reciprocal();
        boolean boolean73 = bigFraction66.equals((java.lang.Object) fraction72);
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction60.add(fraction72);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 36.08247422680412d + "'", double8 == 36.08247422680412d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fractionField12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fractionField37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4" + "'", str41, "4");
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fractionField52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "10" + "'", str70, "10");
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(fraction74);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((-112));
        long long2 = bigFraction1.getNumeratorAsLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-112L) + "'", long2 == (-112L));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        double double11 = fraction5.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction5.subtract(35);
        long long15 = fraction5.longValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction5.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction5.subtract((-11));
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int22 = fraction21.intValue();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction19.multiply(fraction21);
        boolean boolean25 = fraction23.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction23.divide((int) ' ');
        long long28 = fraction27.longValue();
        int int29 = fraction27.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField34 = fraction33.getField();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int36 = fraction35.intValue();
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction33.multiply(fraction35);
        boolean boolean39 = fraction37.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction37.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction42 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField44 = fraction43.getField();
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int46 = fraction45.intValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction43.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction48 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction48.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int51 = fraction50.intValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction48.multiply(fraction50);
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction47.subtract(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction42.multiply(fraction47);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction37.subtract(fraction54);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction32.subtract(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction57 = org.apache.commons.math3.fraction.Fraction.TWO;
        java.lang.String str58 = fraction57.toString();
        int int59 = fraction32.compareTo(fraction57);
        float float60 = fraction32.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction27.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction61.add((int) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction5.multiply(fraction61);
        int int65 = fraction64.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fractionField34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fractionField44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2" + "'", str58, "2");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 5.0f + "'", float60 == 5.0f);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-0.3142857142857143d), 0);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction(1.5d, 2.1113776745352554E33d, 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction3.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction4.reciprocal();
        double double6 = bigFraction5.percentageValue();
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int16 = fraction15.intValue();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction13.multiply(fraction15);
        boolean boolean19 = fraction17.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction12.divide(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.subtract((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction20.divide(2);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal29 = bigFraction28.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction28.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction28.subtract((long) (short) 10);
        java.math.BigDecimal bigDecimal36 = bigFraction33.bigDecimalValue((int) (byte) 1, 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction33.subtract((int) (short) 1);
        java.lang.String str39 = bigFraction33.toString();
        boolean boolean40 = fraction24.equals((java.lang.Object) bigFraction33);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(bigDecimal29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-11" + "'", str39, "-11");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0, (-1));
        float float3 = fraction2.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(200);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.add(5);
        double double8 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.add((int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ONE;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.multiply(fraction14);
        boolean boolean18 = fraction16.equals((java.lang.Object) 0.0d);
        boolean boolean19 = fraction11.equals((java.lang.Object) boolean18);
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction10.divide(fraction11);
        int int23 = fraction10.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 400.0d + "'", double8 == 400.0d);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        java.math.BigInteger bigInteger13 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.subtract(bigInteger13);
        int int15 = bigFraction5.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.negate();
        double double17 = bigFraction5.percentageValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction10.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((-1), 1);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction18.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int21 = fraction20.intValue();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction18.multiply(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField24 = fraction23.getField();
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int26 = fraction25.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction23.multiply(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction22.subtract(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction17.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction16.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction31 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField32 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int34 = fraction33.intValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction31.multiply(fraction33);
        boolean boolean37 = fraction35.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction35.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction35.subtract((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction35.abs();
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction16.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction45 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean46 = fraction44.equals((java.lang.Object) fraction45);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction35.add(fraction44);
        int int48 = fraction13.compareTo(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (byte) 2, (int) '#');
        int int52 = fraction13.compareTo(fraction51);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fractionField24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fractionField32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (byte) 1, 5);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField12 = bigFraction8.getField();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction8.pow((long) (short) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction14.reciprocal();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.abs();
        double double22 = bigFraction19.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction19.subtract((long) (-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction24.multiply((long) (short) -1);
        boolean boolean27 = bigFraction15.equals((java.lang.Object) bigFraction24);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigFractionField12);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(5);
        int int6 = fraction2.compareTo(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction8 = new org.apache.commons.math3.fraction.Fraction((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.subtract((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int17 = fraction16.intValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction14.multiply(fraction16);
        long long19 = fraction18.longValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.abs();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction13.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction8.multiply(fraction21);
        java.lang.String str23 = fraction8.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction3.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(35, 97);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction8.subtract(fraction27);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-50), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -50 to fraction (51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        boolean boolean20 = fraction12.equals((java.lang.Object) bigFraction19);
        long long21 = bigFraction19.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        java.math.BigInteger bigInteger29 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction19.pow(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal36 = bigFraction35.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction35.add((long) 2);
        java.math.BigInteger bigInteger39 = bigFraction35.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction31.divide(bigInteger39);
        long long41 = bigFraction31.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigDecimal36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        java.math.BigInteger bigInteger13 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction5.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction5.pow((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal23 = bigFraction22.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction22.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal31 = bigFraction30.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction30.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction30.subtract((long) (short) 10);
        java.math.BigDecimal bigDecimal38 = bigFraction35.bigDecimalValue((int) (byte) 1, 5);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction35.subtract((int) (short) 1);
        java.math.BigInteger bigInteger41 = bigFraction35.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction22.subtract(bigInteger41);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction42.subtract(151);
        int int45 = bigFraction5.compareTo(bigFraction42);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigDecimal23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (-78));
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction2.negate();
        boolean boolean4 = fraction1.equals((java.lang.Object) bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.subtract((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal8 = bigFraction7.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction7.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.add((long) 2);
        java.math.BigInteger bigInteger17 = bigFraction13.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction(bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction9.divide(bigInteger17);
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction19.reduce();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.pow((long) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction3.divide(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction22.multiply((-112));
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigDecimal8);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction25);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.divide((int) (short) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.add((long) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction(500.0d);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction10.subtract(bigFraction12);
        java.math.BigInteger bigInteger14 = bigFraction12.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction12.add((int) (byte) -101);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigFraction16);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
        int int3 = fraction0.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.add((int) (byte) 2);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-4), 53);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        java.math.BigInteger bigInteger7 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction(bigInteger7);
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction(bigInteger7);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction13.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction9.multiply(bigFraction13);
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = org.apache.commons.math3.fraction.BigFraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction18.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.subtract(bigFraction19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.pow((int) ' ');
        double double24 = bigFraction22.pow((double) 4);
        long long25 = bigFraction22.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal30 = bigFraction29.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction29.abs();
        double double32 = bigFraction31.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal43 = bigFraction42.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction42.add((long) 2);
        java.math.BigInteger bigInteger46 = bigFraction42.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction38.subtract(bigInteger46);
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction31.pow(bigInteger46);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction48.pow(5);
        java.math.BigInteger bigInteger51 = bigFraction48.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction22.add(bigInteger51);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.3407807929942593E26d + "'", double24 == 1.3407807929942593E26d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigFraction50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertNotNull(bigFraction52);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        java.math.BigInteger bigInteger7 = bigFraction3.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.multiply(4L);
        long long11 = bigFraction8.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction8.reduce();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(bigFraction12);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((int) (byte) 0);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(100, 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal7 = bigFraction6.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.abs();
        double double9 = bigFraction8.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction14.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal21 = bigFraction20.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction20.add((long) 2);
        java.math.BigInteger bigInteger24 = bigFraction20.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction16.subtract(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction8.divide(bigInteger24);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.add((long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal34 = bigFraction33.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction33.negate();
        double double36 = bigFraction35.percentageValue();
        java.math.BigInteger bigInteger37 = bigFraction35.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction29.multiply(bigInteger37);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction2.pow(bigInteger37);
        long long40 = bigFraction2.getNumeratorAsLong();
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigFraction16);
        org.junit.Assert.assertNotNull(bigDecimal21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) '#', (long) (short) 14);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.subtract(0L);
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal5 = bigFraction4.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction4.abs();
        double double7 = bigFraction6.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal19 = bigFraction18.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction18.add((long) 2);
        java.math.BigInteger bigInteger22 = bigFraction18.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction14.subtract(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction6.divide(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction0.add(bigInteger22);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        long long29 = bigFraction28.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal34 = bigFraction33.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction33.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal40 = bigFraction39.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = bigFraction39.add((long) 2);
        java.math.BigInteger bigInteger43 = bigFraction39.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction45 = bigFraction35.divide(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction28.add(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction25.divide(bigInteger43);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.multiply(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction49.negate();
        java.math.BigInteger bigInteger51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction49.add(bigInteger51);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigFraction42);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigFraction45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction50);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (double) 0.8f, (int) ' ');
        int int12 = fraction11.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction(100, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.multiply(5);
        int int20 = fraction16.compareTo(fraction17);
        int int21 = fraction16.getNumerator();
        double double22 = fraction16.percentageValue();
        int int23 = fraction13.compareTo(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction7.multiply(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction26.add(5);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction7.subtract(fraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal43 = bigFraction42.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal48 = bigFraction47.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal54 = bigFraction53.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction53.add((long) 2);
        java.math.BigInteger bigInteger57 = bigFraction53.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction49.subtract(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction42.divide(bigInteger57);
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction38.divide(bigFraction59);
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = bigFraction60.multiply((long) 100);
        boolean boolean63 = fraction26.equals((java.lang.Object) 100);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction26.divide(6);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5000.0d + "'", double22 == 5000.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigDecimal48);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigDecimal54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigFraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fraction65);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        boolean boolean6 = fraction4.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction4.subtract(fraction21);
        java.lang.String str23 = fraction4.toString();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction4.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE;
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = bigFraction0.reduce();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction1);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        boolean boolean6 = fraction4.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract((int) (short) -1);
        int int11 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction15 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (double) 0.8f, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.divide((int) '#');
        double double18 = fraction15.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField19 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.multiply(fraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction25.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction20.multiply(fraction25);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.add((long) 2);
        boolean boolean40 = fraction32.equals((java.lang.Object) bigFraction39);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction32.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction15.divide(fraction42);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction4.multiply(fraction15);
        double double45 = fraction4.percentageValue();
        double double46 = fraction4.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction4.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(fractionField19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 400.0d + "'", double45 == 400.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 400.0d + "'", double46 == 400.0d);
        org.junit.Assert.assertNotNull(fraction47);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction6.multiply(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal15 = bigFraction14.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        java.math.BigInteger bigInteger29 = bigFraction25.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction21.subtract(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction14.divide(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction10.multiply(bigInteger29);
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal37 = bigFraction36.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction36.abs();
        float float39 = bigFraction36.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction32.divide(bigFraction36);
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction44.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction47.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = bigFraction47.multiply(0L);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = bigFraction40.add(bigFraction51);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction51.multiply((int) (byte) 0);
        org.apache.commons.math3.fraction.BigFractionField bigFractionField55 = bigFraction54.getField();
        java.math.BigInteger bigInteger56 = bigFraction54.getDenominator();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigDecimal15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction32);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigFraction47);
        org.junit.Assert.assertNotNull(bigFraction49);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigFraction52);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFractionField55);
        org.junit.Assert.assertNotNull(bigInteger56);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(200.0d);
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction1.reciprocal();
        org.junit.Assert.assertNotNull(bigFraction2);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        long long1 = bigFraction0.getNumeratorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction0.pow((-112));
        java.math.BigInteger bigInteger4 = bigFraction3.getDenominator();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigFraction5);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        int int11 = fraction10.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField18 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int20 = fraction19.intValue();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction17.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction16.subtract(fraction17);
        double double23 = fraction17.percentageValue();
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction10.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField27 = fraction26.getField();
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int29 = fraction28.intValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction26.multiply(fraction28);
        long long31 = fraction30.longValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction30.subtract((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction34 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField35 = fraction34.getField();
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int37 = fraction36.intValue();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction34.multiply(fraction36);
        boolean boolean40 = fraction38.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction38.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField45 = fraction44.getField();
        org.apache.commons.math3.fraction.Fraction fraction46 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int47 = fraction46.intValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction44.multiply(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField50 = fraction49.getField();
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int52 = fraction51.intValue();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction49.multiply(fraction51);
        org.apache.commons.math3.fraction.Fraction fraction54 = fraction48.subtract(fraction49);
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction43.multiply(fraction48);
        org.apache.commons.math3.fraction.Fraction fraction56 = fraction38.subtract(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction58 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        int int59 = fraction55.compareTo(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction30.add(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction10.add(fraction55);
        org.apache.commons.math3.fraction.Fraction fraction63 = fraction61.divide((int) (byte) 100);
        double double64 = fraction63.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fractionField18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 200.0d + "'", double23 == 200.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fractionField27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4L + "'", long31 == 4L);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fractionField35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fractionField45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fractionField50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        java.math.BigInteger bigInteger13 = bigFraction9.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction5.add(bigInteger13);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction19.abs();
        double double22 = bigFraction21.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction32.add((long) 2);
        java.math.BigInteger bigInteger36 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = bigFraction28.subtract(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction21.pow(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal43 = bigFraction42.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction42.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal49 = bigFraction48.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = bigFraction48.add((long) 2);
        java.math.BigInteger bigInteger52 = bigFraction48.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction44.add(bigInteger52);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction21.add(bigInteger52);
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = bigFraction15.multiply(bigInteger52);
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction15.pow(0L);
        float float58 = bigFraction57.floatValue();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigFraction14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigDecimal49);
        org.junit.Assert.assertNotNull(bigFraction51);
        org.junit.Assert.assertNotNull(bigInteger52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigFraction55);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction5);
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField13 = fraction12.getField();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int15 = fraction14.intValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction12.multiply(fraction14);
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction14.getField();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction14.multiply((int) (short) 0);
        int int20 = fraction19.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField23 = fraction22.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int25 = fraction24.intValue();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction22.multiply(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField28 = fraction27.getField();
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int30 = fraction29.intValue();
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction27.multiply(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction26.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction21.multiply(fraction26);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal38 = bigFraction37.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction37.add((long) 2);
        boolean boolean41 = fraction33.equals((java.lang.Object) bigFraction40);
        org.apache.commons.math3.fraction.Fraction fraction43 = fraction33.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction19.add(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction45 = fraction10.subtract(fraction19);
        double double46 = fraction45.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction45.add(50);
        int int49 = fraction48.getNumerator();
        org.apache.commons.math3.fraction.FractionField fractionField50 = fraction48.getField();
        int int51 = fraction48.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction53 = fraction48.divide(200);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fractionField13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fractionField28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertNotNull(bigFraction40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 2.0d + "'", double46 == 2.0d);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(fractionField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction(1L, (long) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.pow((-6L));
        org.junit.Assert.assertNotNull(bigFraction4);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal11 = bigFraction10.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal22 = bigFraction21.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction21.add((long) 2);
        java.math.BigInteger bigInteger25 = bigFraction21.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction17.subtract(bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction10.divide(bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction6.add(bigInteger25);
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction6.divide((int) ' ');
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal35 = bigFraction34.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction34.negate();
        double double37 = bigFraction36.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction36.divide(5);
        java.lang.String str40 = bigFraction36.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.abs();
        long long47 = bigFraction46.getDenominatorAsLong();
        org.apache.commons.math3.fraction.BigFraction bigFraction51 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal52 = bigFraction51.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction51.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal58 = bigFraction57.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction57.add((long) 2);
        java.math.BigInteger bigInteger61 = bigFraction57.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction62 = new org.apache.commons.math3.fraction.BigFraction(bigInteger61);
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction53.divide(bigInteger61);
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction53.multiply((long) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction65.add((long) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction46.multiply(bigFraction65);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction36.divide(bigFraction46);
        java.math.BigInteger bigInteger70 = bigFraction69.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction74 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal75 = bigFraction74.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction76 = bigFraction74.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction80 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal81 = bigFraction80.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction83 = bigFraction80.add((long) 2);
        java.math.BigInteger bigInteger84 = bigFraction80.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction85 = new org.apache.commons.math3.fraction.BigFraction(bigInteger84);
        org.apache.commons.math3.fraction.BigFraction bigFraction86 = bigFraction76.divide(bigInteger84);
        org.apache.commons.math3.fraction.BigFraction bigFraction87 = new org.apache.commons.math3.fraction.BigFraction(bigInteger70, bigInteger84);
        org.apache.commons.math3.fraction.BigFraction bigFraction88 = bigFraction30.divide(bigInteger70);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigFraction17);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
        org.junit.Assert.assertNotNull(bigDecimal45);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(bigDecimal52);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigFraction63);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction67);
        org.junit.Assert.assertNotNull(bigFraction68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigInteger70);
        org.junit.Assert.assertNotNull(bigDecimal75);
        org.junit.Assert.assertNotNull(bigFraction76);
        org.junit.Assert.assertNotNull(bigDecimal81);
        org.junit.Assert.assertNotNull(bigFraction83);
        org.junit.Assert.assertNotNull(bigInteger84);
        org.junit.Assert.assertNotNull(bigFraction86);
        org.junit.Assert.assertNotNull(bigFraction88);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-18.04123711340206d));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(32);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, 2);
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 4 to fraction (-3/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(52, (int) '#');
        double double3 = fraction2.doubleValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4857142857142858d + "'", double3 == 1.4857142857142858d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int4 = fraction3.intValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.multiply(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField7 = fraction6.getField();
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int9 = fraction8.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.multiply(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction5.subtract(fraction6);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction0.multiply(fraction5);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = bigFraction16.add((long) 2);
        boolean boolean20 = fraction12.equals((java.lang.Object) bigFraction19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.divide(35);
        java.math.BigDecimal bigDecimal23 = bigFraction19.bigDecimalValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fractionField7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal23);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        java.math.BigDecimal bigDecimal11 = bigFraction8.bigDecimalValue((int) (byte) 1, 5);
        long long12 = bigFraction8.getDenominatorAsLong();
        int int13 = bigFraction8.getDenominatorAsInt();
        java.math.BigInteger bigInteger14 = bigFraction8.getNumerator();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bigInteger14);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction3.doubleValue();
        long long7 = bigFraction3.longValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction3.pow((long) (byte) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction3.add((long) 25);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.multiply((int) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction11.pow(55);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction11.pow(4L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction13);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigFraction17);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.add((int) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = bigFraction2.add(10);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal9 = bigFraction8.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal16 = bigFraction15.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction15.add((long) 2);
        java.math.BigInteger bigInteger19 = bigFraction15.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = new org.apache.commons.math3.fraction.BigFraction(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction8.add(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = new org.apache.commons.math3.fraction.BigFraction(bigInteger19);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction2.divide(bigInteger19);
        java.lang.String str24 = bigFraction23.toString();
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(bigFraction4);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigFraction21);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-52 / 5" + "'", str24, "-52 / 5");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.subtract(10L);
        double double9 = bigFraction8.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = org.apache.commons.math3.fraction.BigFraction.ONE_QUARTER;
        double double12 = bigFraction10.pow(0.0d);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction16.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction18.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction18.pow((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = bigFraction32.add((long) 2);
        java.math.BigInteger bigInteger36 = bigFraction32.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = bigFraction28.divide(bigInteger36);
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction22.multiply(bigInteger36);
        int int40 = bigFraction39.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction10.divide(bigFraction39);
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction41.multiply((long) (byte) 10);
        int int44 = bigFraction41.getDenominatorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction41.multiply((long) (-50));
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction8.subtract(bigFraction46);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-900.0d) + "'", double9 == (-900.0d));
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(bigDecimal17);
        org.junit.Assert.assertNotNull(bigFraction18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigDecimal27);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigInteger36);
        org.junit.Assert.assertNotNull(bigFraction38);
        org.junit.Assert.assertNotNull(bigFraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction47);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, (int) (byte) 2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction2.subtract((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        long long10 = fraction9.longValue();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.abs();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.add(fraction11);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.subtract(75);
        double double15 = fraction11.doubleValue();
        java.lang.Class<?> wildcardClass16 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4L + "'", long10 == 4L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) 'a');
        org.apache.commons.math3.fraction.FractionField fractionField3 = fraction0.getField();
        double double4 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction5.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int8 = fraction7.intValue();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.multiply(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction5.divide(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction0.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract((int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction16.getField();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int19 = fraction18.intValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction16.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField22 = fraction21.getField();
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int24 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction21.multiply(fraction23);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction20.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        boolean boolean36 = fraction34.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction34.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction34.subtract((int) (short) -1);
        int int41 = fraction34.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction45 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (double) 0.8f, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction45.divide((int) '#');
        double double48 = fraction45.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField49 = fraction45.getField();
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction51 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField52 = fraction51.getField();
        org.apache.commons.math3.fraction.Fraction fraction53 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int54 = fraction53.intValue();
        org.apache.commons.math3.fraction.Fraction fraction55 = fraction51.multiply(fraction53);
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField57 = fraction56.getField();
        org.apache.commons.math3.fraction.Fraction fraction58 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int59 = fraction58.intValue();
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction56.multiply(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction61 = fraction55.subtract(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction62 = fraction50.multiply(fraction55);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal67 = bigFraction66.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction66.add((long) 2);
        boolean boolean70 = fraction62.equals((java.lang.Object) bigFraction69);
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction62.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction73 = fraction45.divide(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction34.multiply(fraction45);
        org.apache.commons.math3.fraction.Fraction fraction76 = fraction74.multiply(100);
        boolean boolean77 = fraction26.equals((java.lang.Object) fraction74);
        float float78 = fraction74.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction80 = fraction74.subtract(13);
        int int81 = fraction15.compareTo(fraction74);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fractionField3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.2d + "'", double4 == 0.2d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fractionField22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(fractionField49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fractionField52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fractionField57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(bigDecimal67);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 4.0f + "'", float78 == 4.0f);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction6.divide((int) (short) 100);
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction8.add(10L);
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction8.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.TWO_QUARTERS;
        double double13 = bigFraction12.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal18 = bigFraction17.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction20.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction12.subtract(bigFraction22);
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction23.abs();
        long long25 = bigFraction23.longValue();
        int int26 = bigFraction23.intValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal31 = bigFraction30.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction30.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction30.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction35 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal40 = bigFraction39.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction41 = bigFraction39.abs();
        double double42 = bigFraction39.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction39.subtract((long) (-1));
        double double46 = bigFraction44.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal51 = bigFraction50.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction53 = bigFraction50.add((long) 2);
        java.math.BigInteger bigInteger54 = bigFraction50.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction55 = new org.apache.commons.math3.fraction.BigFraction(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction44.subtract(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction35.divide(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = bigFraction30.divide(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction59 = bigFraction23.pow(bigInteger54);
        org.apache.commons.math3.fraction.BigFraction bigFraction60 = bigFraction11.multiply(bigInteger54);
        int int61 = bigFraction11.getNumeratorAsInt();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction6);
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigFraction10);
        org.junit.Assert.assertNotNull(bigFraction11);
        org.junit.Assert.assertNotNull(bigFraction12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertNotNull(bigFraction20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigFraction23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction35);
        org.junit.Assert.assertNotNull(bigDecimal40);
        org.junit.Assert.assertNotNull(bigFraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(bigDecimal51);
        org.junit.Assert.assertNotNull(bigFraction53);
        org.junit.Assert.assertNotNull(bigInteger54);
        org.junit.Assert.assertNotNull(bigFraction56);
        org.junit.Assert.assertNotNull(bigFraction57);
        org.junit.Assert.assertNotNull(bigFraction58);
        org.junit.Assert.assertNotNull(bigFraction59);
        org.junit.Assert.assertNotNull(bigFraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math3.fraction.BigFraction bigFraction0 = org.apache.commons.math3.fraction.BigFraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = bigFraction0.pow((int) (byte) 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField9 = fraction8.getField();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int11 = fraction10.intValue();
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.multiply(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction7.subtract(fraction8);
        org.apache.commons.math3.fraction.FractionField fractionField14 = fraction13.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction17.getField();
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction17.multiply((int) (short) 0);
        int int23 = fraction22.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction29.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction24.multiply(fraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal41 = bigFraction40.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction40.add((long) 2);
        boolean boolean44 = fraction36.equals((java.lang.Object) bigFraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction36.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction22.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction13.subtract(fraction22);
        boolean boolean49 = bigFraction2.equals((java.lang.Object) fraction22);
        int int50 = fraction22.intValue();
        org.apache.commons.math3.fraction.Fraction fraction52 = fraction22.subtract(12);
        org.junit.Assert.assertNotNull(bigFraction0);
        org.junit.Assert.assertNotNull(bigFraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fractionField9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(fraction52);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction(25);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.add((int) (byte) 8);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.subtract((int) (short) 11);
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigDecimal6);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.divide((-92));
        java.math.BigDecimal bigDecimal4 = bigFraction1.bigDecimalValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigDecimal4);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(4.543907041812615E-199d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0);
        java.lang.Object obj2 = null;
        boolean boolean3 = fraction1.equals(obj2);
        java.lang.String str4 = fraction1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.pow((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add((long) 2);
        java.math.BigInteger bigInteger23 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction15.divide(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction9.multiply(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.subtract((int) '4');
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction28.add((int) (byte) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = bigFraction28.divide((long) 13);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertNotNull(bigFraction30);
        org.junit.Assert.assertNotNull(bigFraction32);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((-683606016), (int) (byte) 112);
        long long3 = bigFraction2.getDenominatorAsLong();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7L + "'", long3 == 7L);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply((long) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.subtract(1L);
        java.math.BigInteger bigInteger6 = bigFraction3.getDenominator();
        float float7 = bigFraction3.floatValue();
        float float8 = bigFraction3.floatValue();
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_THIRD;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.add((-1));
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int6 = fraction5.intValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction3.multiply(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.add((int) (byte) 100);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((int) (short) -1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.subtract((int) (byte) 0);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction11.add(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction0.add(fraction13);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = bigFraction5.pow((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add((long) 2);
        java.math.BigInteger bigInteger23 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = new org.apache.commons.math3.fraction.BigFraction(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction15.divide(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = bigFraction9.multiply(bigInteger23);
        float float27 = bigFraction26.floatValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction26.add(100L);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigFraction5);
        org.junit.Assert.assertNotNull(bigFraction7);
        org.junit.Assert.assertNotNull(bigFraction9);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertNotNull(bigFraction29);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(6);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        int int5 = bigFraction3.intValue();
        java.lang.String str6 = bigFraction3.toString();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) 5);
        java.math.BigInteger bigInteger9 = bigFraction3.getDenominator();
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(bigFraction8);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) (-15), 8L);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = org.apache.commons.math3.fraction.BigFraction.TWO;
        int int4 = bigFraction3.getNumeratorAsInt();
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal9 = bigFraction8.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal14 = bigFraction13.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction13.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction19 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal20 = bigFraction19.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction19.add((long) 2);
        java.math.BigInteger bigInteger23 = bigFraction19.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction24 = bigFraction15.subtract(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction8.divide(bigInteger23);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = bigFraction8.multiply(10L);
        java.math.BigInteger bigInteger28 = bigFraction8.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction29 = bigFraction3.pow(bigInteger28);
        org.apache.commons.math3.fraction.BigFraction bigFraction31 = bigFraction3.pow((int) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction3.pow(0);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction33.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction36 = bigFraction33.pow((int) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = org.apache.commons.math3.fraction.BigFraction.TWO_QUARTERS;
        double double38 = bigFraction37.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction42 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal43 = bigFraction42.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = bigFraction42.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction44.add((int) '#');
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction44.pow((long) (byte) 1);
        org.apache.commons.math3.fraction.BigFraction bigFraction52 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal53 = bigFraction52.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = bigFraction52.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction58 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal59 = bigFraction58.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = bigFraction58.add((long) 2);
        java.math.BigInteger bigInteger62 = bigFraction58.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = new org.apache.commons.math3.fraction.BigFraction(bigInteger62);
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction54.divide(bigInteger62);
        org.apache.commons.math3.fraction.BigFraction bigFraction65 = bigFraction48.multiply(bigInteger62);
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = bigFraction37.add(bigInteger62);
        double double67 = bigFraction37.doubleValue();
        java.math.BigInteger bigInteger68 = bigFraction37.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction36.pow(bigInteger68);
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction2.subtract(bigInteger68);
        org.junit.Assert.assertNotNull(bigFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigFraction15);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNotNull(bigFraction22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigFraction24);
        org.junit.Assert.assertNotNull(bigFraction25);
        org.junit.Assert.assertNotNull(bigFraction27);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigFraction29);
        org.junit.Assert.assertNotNull(bigFraction31);
        org.junit.Assert.assertNotNull(bigFraction33);
        org.junit.Assert.assertNotNull(bigFraction34);
        org.junit.Assert.assertNotNull(bigFraction36);
        org.junit.Assert.assertNotNull(bigFraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 50.0d + "'", double38 == 50.0d);
        org.junit.Assert.assertNotNull(bigDecimal43);
        org.junit.Assert.assertNotNull(bigFraction44);
        org.junit.Assert.assertNotNull(bigFraction46);
        org.junit.Assert.assertNotNull(bigFraction48);
        org.junit.Assert.assertNotNull(bigDecimal53);
        org.junit.Assert.assertNotNull(bigFraction54);
        org.junit.Assert.assertNotNull(bigDecimal59);
        org.junit.Assert.assertNotNull(bigFraction61);
        org.junit.Assert.assertNotNull(bigInteger62);
        org.junit.Assert.assertNotNull(bigFraction64);
        org.junit.Assert.assertNotNull(bigFraction65);
        org.junit.Assert.assertNotNull(bigFraction66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.5d + "'", double67 == 0.5d);
        org.junit.Assert.assertNotNull(bigInteger68);
        org.junit.Assert.assertNotNull(bigFraction69);
        org.junit.Assert.assertNotNull(bigFraction70);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction2.multiply((int) (short) 0);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal26 = bigFraction25.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction25.add((long) 2);
        boolean boolean29 = fraction21.equals((java.lang.Object) bigFraction28);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction21.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction32 = fraction7.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction7.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(bigDecimal26);
        org.junit.Assert.assertNotNull(bigFraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        boolean boolean6 = fraction4.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField11 = fraction10.getField();
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int13 = fraction12.intValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction10.multiply(fraction12);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField16 = fraction15.getField();
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int18 = fraction17.intValue();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.multiply(fraction17);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction9.multiply(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction4.subtract(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0);
        int int25 = fraction21.compareTo(fraction24);
        float float26 = fraction21.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction28 = org.apache.commons.math3.fraction.Fraction.ZERO;
        boolean boolean29 = fraction27.equals((java.lang.Object) fraction28);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction30.subtract(1);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction28.divide(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction21.subtract(fraction37);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fractionField11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 8.0f + "'", float26 == 8.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 2, (-111L));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int3 = fraction2.intValue();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction0.multiply(fraction2);
        long long5 = fraction4.longValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.abs();
        int int7 = fraction4.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(10, 2);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction4.subtract(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply(10);
        org.apache.commons.math3.fraction.Fraction fraction16 = new org.apache.commons.math3.fraction.Fraction(1700, (int) (byte) 9);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction11.subtract(fraction16);
        long long18 = fraction17.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-189L) + "'", long18 == (-189L));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract(8);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.multiply(fraction6);
        boolean boolean10 = fraction8.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.divide((int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction8.subtract((int) (short) -1);
        int int15 = fraction8.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction19 = new org.apache.commons.math3.fraction.Fraction((double) (byte) 1, (double) 0.8f, (int) ' ');
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction19.divide((int) '#');
        double double22 = fraction19.doubleValue();
        org.apache.commons.math3.fraction.FractionField fractionField23 = fraction19.getField();
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField26 = fraction25.getField();
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int28 = fraction27.intValue();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction25.multiply(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction30.getField();
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int33 = fraction32.intValue();
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction30.multiply(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction29.subtract(fraction30);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction24.multiply(fraction29);
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal41 = bigFraction40.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = bigFraction40.add((long) 2);
        boolean boolean44 = fraction36.equals((java.lang.Object) bigFraction43);
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction36.subtract(2);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction19.divide(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction8.multiply(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction50 = fraction48.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction3.subtract(fraction48);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(fractionField23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fractionField26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(97, 97);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(1.0d, (int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 1 to fraction (-9,223,372,036,854,775,808/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math3.fraction.BigFraction bigFraction2 = new org.apache.commons.math3.fraction.BigFraction((long) 200, (long) (byte) -3);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(10);
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO;
        org.apache.commons.math3.fraction.FractionField fractionField5 = fraction4.getField();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO;
        int int7 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.multiply(fraction6);
        boolean boolean10 = fraction8.equals((java.lang.Object) 0.0d);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.divide((int) ' ');
        int int13 = fraction3.compareTo(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction8.add(200);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(102, 13);
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction15.divide(fraction18);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fractionField5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
    }
}

