package org.apache.commons.math3.fraction;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add((long) 2);
        java.math.BigInteger bigInteger15 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction7.add(bigInteger15);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction7.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction1.subtract(bigFraction7);
        java.math.BigDecimal bigDecimal21 = bigFraction1.bigDecimalValue((int) (byte) 2, 2);
        double double23 = bigFraction1.pow((double) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal21", (bigDecimal6.compareTo(bigDecimal21) == 0) == bigDecimal6.equals(bigDecimal21));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add((long) 2);
        java.math.BigInteger bigInteger15 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction7.add(bigInteger15);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction7.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction1.subtract(bigFraction7);
        java.math.BigDecimal bigDecimal21 = bigFraction1.bigDecimalValue((int) (byte) 2, 2);
        short short22 = bigDecimal21.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal21", (bigDecimal6.compareTo(bigDecimal21) == 0) == bigDecimal6.equals(bigDecimal21));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply((long) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction1.divide(5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction5.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal18 = bigFraction17.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add((long) 2);
        java.math.BigInteger bigInteger21 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction13.subtract(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction5.divide(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.add((long) 100);
        java.math.BigInteger bigInteger26 = bigFraction23.getNumerator();
        java.math.BigDecimal bigDecimal29 = bigFraction23.bigDecimalValue(10, (int) (short) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction(0L, (long) '#');
        java.lang.String str33 = bigFraction32.toString();
        float float34 = bigFraction32.floatValue();
        int int35 = bigFraction23.compareTo(bigFraction32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal29", (bigDecimal4.compareTo(bigDecimal29) == 0) == bigDecimal4.equals(bigDecimal29));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply((long) (byte) 2);
        long long4 = bigFraction3.getNumeratorAsLong();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = bigFraction1.multiply((long) (byte) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction4 = org.apache.commons.math3.fraction.BigFraction.TWO_QUARTERS;
        double double5 = bigFraction4.percentageValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction9 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal10 = bigFraction9.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = bigFraction9.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction12.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction4.subtract(bigFraction14);
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction15.abs();
        int int17 = bigFraction3.compareTo(bigFraction15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction3", bigFraction1.equals(bigFraction3) ? bigFraction1.hashCode() == bigFraction3.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = bigFraction3.abs();
        double double6 = bigFraction5.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction13 = bigFraction11.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal18 = bigFraction17.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction20 = bigFraction17.add((long) 2);
        java.math.BigInteger bigInteger21 = bigFraction17.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction22 = bigFraction13.subtract(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction23 = bigFraction5.divide(bigInteger21);
        org.apache.commons.math3.fraction.BigFraction bigFraction25 = bigFraction23.add((long) 100);
        java.math.BigInteger bigInteger26 = bigFraction23.getNumerator();
        java.math.BigDecimal bigDecimal29 = bigFraction23.bigDecimalValue(10, (int) (short) 0);
        int int30 = bigFraction23.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal29", (bigDecimal4.compareTo(bigDecimal29) == 0) == bigDecimal4.equals(bigDecimal29));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math3.fraction.BigFraction bigFraction3 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal4 = bigFraction3.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction6 = bigFraction3.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction8 = bigFraction3.subtract((long) (short) 10);
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal13 = bigFraction12.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction15 = bigFraction12.add((long) 2);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction15.divide((-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction8.multiply(bigFraction17);
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = new org.apache.commons.math3.fraction.BigFraction((int) '4', (int) (byte) 100);
        int int22 = bigFraction8.compareTo(bigFraction21);
        org.apache.commons.math3.fraction.BigFraction bigFraction26 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal27 = bigFraction26.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction28 = bigFraction26.negate();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal33 = bigFraction32.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction37 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal38 = bigFraction37.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction39 = bigFraction37.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction43 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal44 = bigFraction43.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction46 = bigFraction43.add((long) 2);
        java.math.BigInteger bigInteger47 = bigFraction43.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction48 = bigFraction39.subtract(bigInteger47);
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction32.divide(bigInteger47);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction28.divide(bigFraction49);
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal55 = bigFraction54.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction57 = bigFraction54.multiply((long) (byte) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal62 = bigFraction61.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction64 = bigFraction61.add((long) 2);
        java.math.BigInteger bigInteger65 = bigFraction61.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction66 = new org.apache.commons.math3.fraction.BigFraction(bigInteger65);
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = bigFraction54.add(bigInteger65);
        org.apache.commons.math3.fraction.BigFraction bigFraction68 = bigFraction50.add(bigInteger65);
        org.apache.commons.math3.fraction.BigFraction bigFraction69 = bigFraction21.pow(bigInteger65);
        org.apache.commons.math3.fraction.BigFraction bigFraction71 = new org.apache.commons.math3.fraction.BigFraction(0.0d);
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = bigFraction21.multiply(bigFraction71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction57 and bigFraction71", bigFraction57.equals(bigFraction71) ? bigFraction57.hashCode() == bigFraction71.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) (-1L));
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal12 = bigFraction11.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction14 = bigFraction11.add((long) 2);
        java.math.BigInteger bigInteger15 = bigFraction11.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = bigFraction7.add(bigInteger15);
        org.apache.commons.math3.fraction.BigFraction bigFraction17 = bigFraction7.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction1.subtract(bigFraction7);
        java.math.BigDecimal bigDecimal21 = bigFraction1.bigDecimalValue((int) (byte) 2, 2);
        java.math.BigDecimal bigDecimal24 = bigFraction1.bigDecimalValue((-15), 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal21", (bigDecimal6.compareTo(bigDecimal21) == 0) == bigDecimal6.equals(bigDecimal21));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math3.fraction.BigFraction bigFraction1 = new org.apache.commons.math3.fraction.BigFraction((double) 0);
        org.apache.commons.math3.fraction.BigFraction bigFraction5 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal6 = bigFraction5.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction7 = bigFraction5.abs();
        double double8 = bigFraction5.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction10 = bigFraction5.subtract((long) (-1));
        org.apache.commons.math3.fraction.BigFraction bigFraction11 = bigFraction5.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction12 = org.apache.commons.math3.fraction.BigFraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.BigFraction bigFraction16 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal17 = bigFraction16.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction18 = bigFraction16.abs();
        double double19 = bigFraction16.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction21 = bigFraction16.subtract((long) (-1));
        double double23 = bigFraction21.pow((double) 1L);
        org.apache.commons.math3.fraction.BigFraction bigFraction27 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal28 = bigFraction27.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction30 = bigFraction27.add((long) 2);
        java.math.BigInteger bigInteger31 = bigFraction27.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction32 = new org.apache.commons.math3.fraction.BigFraction(bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction33 = bigFraction21.subtract(bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction12.divide(bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction38 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal39 = bigFraction38.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction40 = bigFraction38.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction44 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal45 = bigFraction44.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction47 = bigFraction44.add((long) 2);
        java.math.BigInteger bigInteger48 = bigFraction44.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction49 = bigFraction40.add(bigInteger48);
        org.apache.commons.math3.fraction.BigFraction bigFraction50 = bigFraction40.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction54 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal55 = bigFraction54.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction56 = bigFraction54.abs();
        double double57 = bigFraction56.doubleValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction61 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal62 = bigFraction61.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction63 = bigFraction61.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction67 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal68 = bigFraction67.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction70 = bigFraction67.add((long) 2);
        java.math.BigInteger bigInteger71 = bigFraction67.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction72 = bigFraction63.subtract(bigInteger71);
        org.apache.commons.math3.fraction.BigFraction bigFraction73 = bigFraction56.pow(bigInteger71);
        org.apache.commons.math3.fraction.BigFraction bigFraction77 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal78 = bigFraction77.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction79 = bigFraction77.abs();
        org.apache.commons.math3.fraction.BigFraction bigFraction83 = new org.apache.commons.math3.fraction.BigFraction((double) (byte) -1, (double) (short) 1, (int) '4');
        java.math.BigDecimal bigDecimal84 = bigFraction83.bigDecimalValue();
        org.apache.commons.math3.fraction.BigFraction bigFraction86 = bigFraction83.add((long) 2);
        java.math.BigInteger bigInteger87 = bigFraction83.getNumerator();
        org.apache.commons.math3.fraction.BigFraction bigFraction88 = bigFraction79.add(bigInteger87);
        org.apache.commons.math3.fraction.BigFraction bigFraction89 = bigFraction56.add(bigInteger87);
        org.apache.commons.math3.fraction.BigFraction bigFraction90 = bigFraction50.multiply(bigInteger87);
        org.apache.commons.math3.fraction.BigFraction bigFraction91 = new org.apache.commons.math3.fraction.BigFraction(bigInteger31, bigInteger87);
        org.apache.commons.math3.fraction.BigFraction bigFraction92 = bigFraction5.divide(bigInteger31);
        org.apache.commons.math3.fraction.BigFraction bigFraction93 = bigFraction1.divide(bigInteger31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigFraction1 and bigFraction10", bigFraction1.equals(bigFraction10) ? bigFraction1.hashCode() == bigFraction10.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        org.apache.commons.math3.fraction.BigFraction bigFraction34 = bigFraction3.subtract(50);
        java.math.BigDecimal bigDecimal37 = bigFraction3.bigDecimalValue((int) ' ', (int) (short) 0);
        java.math.BigInteger bigInteger38 = bigFraction3.getDenominator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal37", (bigDecimal4.compareTo(bigDecimal37) == 0) == bigDecimal4.equals(bigDecimal37));
    }
}

