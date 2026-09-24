package org.apache.commons.lang3.math;

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
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.invert();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        double double33 = fraction32.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction32", (fraction2.compareTo(fraction32) == 0) == fraction2.equals(fraction32));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        short short33 = fraction3.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction32", (fraction2.compareTo(fraction32) == 0) == fraction2.equals(fraction32));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        byte byte7 = fraction6.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.negate();
        int int34 = fraction16.compareTo(fraction33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction24 and fraction31", (fraction24.compareTo(fraction31) == 0) == fraction24.equals(fraction31));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        int int7 = fraction5.getProperWhole();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        double double4 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.multiplyBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction7 and fraction8", (fraction7.compareTo(fraction8) == 0) == fraction7.equals(fraction8));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        java.lang.String str7 = fraction5.toProperString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction17.divideBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction12.subtract(fraction24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction11 and fraction17", (fraction11.compareTo(fraction17) == 0) == fraction11.equals(fraction17));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean11 = fraction9.equals((java.lang.Object) (byte) 100);
        int int12 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction9.compareTo(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction5.multiplyBy(fraction14);
        float float17 = fraction14.floatValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction3.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int24 = fraction23.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        int int26 = fraction25.getProperWhole();
        int int27 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.intValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.invert();
        java.lang.String str32 = fraction29.toProperString();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction29.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction25.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction22.add(fraction25);
        boolean boolean39 = fraction18.equals((java.lang.Object) fraction38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction5 and fraction22", (fraction5.compareTo(fraction22) == 0) == fraction5.equals(fraction22));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.subtract(fraction15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction11 and fraction15", (fraction11.compareTo(fraction15) == 0) == fraction11.equals(fraction15));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 35, 100);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str12 = fraction11.toString();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction8.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.reduce();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow((int) (short) 1);
        double double24 = fraction23.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.add(fraction30);
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction30.negate();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction23.divideBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction17.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction40.invert();
        float float43 = fraction42.floatValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction42.pow(5);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction37.add(fraction42);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction46.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction49 = fraction6.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction4.add(fraction49);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean56 = fraction54.equals((java.lang.Object) (byte) 100);
        int int57 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int65 = fraction64.intValue();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction64.invert();
        int int67 = fraction66.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction66.invert();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction62.divideBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction58.multiplyBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long73 = fraction72.longValue();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction70.add(fraction72);
        boolean boolean75 = fraction49.equals((java.lang.Object) fraction74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction13 and fraction62", (fraction13.compareTo(fraction62) == 0) == fraction13.equals(fraction62));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.invert();
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
        int int20 = fraction14.intValue();
        int int21 = fraction14.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction4.multiplyBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((-3), 52, 175);
        int int27 = fraction26.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.subtract(fraction26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction22", (fraction3.compareTo(fraction22) == 0) == fraction3.equals(fraction22));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        long long33 = fraction3.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction32", (fraction2.compareTo(fraction32) == 0) == fraction2.equals(fraction32));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction35.add(fraction38);
        java.lang.String str41 = fraction38.toProperString();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction34.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction34.pow((int) (byte) 0);
        int int45 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int47 = fraction46.intValue();
        float float48 = fraction46.floatValue();
        java.lang.String str49 = fraction46.toString();
        int int50 = fraction34.compareTo(fraction46);
        boolean boolean51 = fraction32.equals((java.lang.Object) fraction34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction32", (fraction2.compareTo(fraction32) == 0) == fraction2.equals(fraction32));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        long long11 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.abs();
        java.lang.String str20 = fraction19.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction10.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction23.reduce();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction8 and fraction23", (fraction8.compareTo(fraction23) == 0) == fraction8.equals(fraction23));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        int int24 = fraction23.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction15.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int34 = fraction33.getDenominator();
        int int35 = fraction33.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction29.divideBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction15.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction29.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean44 = fraction42.equals((java.lang.Object) (byte) 100);
        int int45 = fraction42.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction42.negate();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int53 = fraction52.intValue();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction52.invert();
        int int55 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction54.invert();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction50.divideBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction46.multiplyBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long61 = fraction60.longValue();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction58.add(fraction60);
        double double63 = fraction58.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction29.multiplyBy(fraction58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction50", (fraction9.compareTo(fraction50) == 0) == fraction9.equals(fraction50));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.multiplyBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int15 = fraction14.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        int int17 = fraction16.getProperWhole();
        long long18 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction20.abs();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.abs();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        boolean boolean30 = fraction27.equals((java.lang.Object) fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.reduce();
        int int32 = fraction31.getNumerator();
        int int33 = fraction31.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction16.add(fraction31);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int37 = fraction36.intValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.invert();
        java.lang.String str39 = fraction36.toProperString();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction36.subtract(fraction42);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction16.add(fraction36);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction14.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.invert();
        java.lang.String str50 = fraction49.toString();
        boolean boolean51 = fraction16.equals((java.lang.Object) fraction49);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction10.multiplyBy(fraction16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction34", (fraction9.compareTo(fraction34) == 0) == fraction9.equals(fraction34));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        long long5 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE;
        int int11 = fraction10.getProperWhole();
        long long12 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction14.add(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction14.abs();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction14.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        boolean boolean24 = fraction21.equals((java.lang.Object) fraction22);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction22.reduce();
        int int26 = fraction25.getNumerator();
        int int27 = fraction25.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction10.add(fraction25);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction10.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction9.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction4.subtract(fraction9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction39", (fraction9.compareTo(fraction39) == 0) == fraction9.equals(fraction39));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int13 = fraction12.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.pow((int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction6.add(fraction17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int11 = fraction7.compareTo(fraction10);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.multiplyBy(fraction13);
        long long15 = fraction14.longValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.invert();
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.abs();
        java.lang.String str24 = fraction23.toProperString();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.multiplyBy(fraction25);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction14.subtract(fraction25);
        boolean boolean28 = fraction1.equals((java.lang.Object) fraction27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction12 and fraction27", (fraction12.compareTo(fraction27) == 0) == fraction12.equals(fraction27));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(2);
        int int5 = fraction2.intValue();
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
        org.apache.commons.lang3.math.Fraction fraction35 = fraction2.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, 100, 100);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction35.add(fraction39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction6 and fraction39", (fraction6.compareTo(fraction39) == 0) == fraction6.equals(fraction39));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        long long11 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.abs();
        java.lang.String str20 = fraction19.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction10.subtract(fraction21);
        float float24 = fraction23.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction8 and fraction23", (fraction8.compareTo(fraction23) == 0) == fraction8.equals(fraction23));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int7 = fraction3.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.multiplyBy(fraction9);
        long long11 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.negate();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.abs();
        java.lang.String str20 = fraction19.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction10.subtract(fraction21);
        int int24 = fraction10.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction8 and fraction23", (fraction8.compareTo(fraction23) == 0) == fraction8.equals(fraction23));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int39 = fraction38.intValue();
        float float40 = fraction38.floatValue();
        java.lang.String str41 = fraction38.toString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction45 = fraction38.divideBy(fraction44);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 5);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction44.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean55 = fraction53.equals((java.lang.Object) (byte) 100);
        int int56 = fraction53.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction53.negate();
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int64 = fraction63.intValue();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction63.invert();
        int int66 = fraction65.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction65.invert();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction61.divideBy(fraction65);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction57.multiplyBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long72 = fraction71.longValue();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction69.add(fraction71);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction73.invert();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction49.multiplyBy(fraction73);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction75.abs();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction20.subtract(fraction76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction61", (fraction9.compareTo(fraction61) == 0) == fraction9.equals(fraction61));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) (byte) 100, 35);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        java.lang.String str5 = fraction4.toProperString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction4", (fraction3.compareTo(fraction4) == 0) == fraction3.equals(fraction4));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction6.multiplyBy(fraction9);
        float float13 = fraction9.floatValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.pow((int) 'a');
        org.apache.commons.lang3.math.Fraction fraction16 = fraction2.multiplyBy(fraction15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction9", (fraction2.compareTo(fraction9) == 0) == fraction2.equals(fraction9));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, 100, 100);
        int int4 = fraction3.getDenominator();
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
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction3.multiplyBy(fraction19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction3 and fraction14", (fraction3.compareTo(fraction14) == 0) == fraction3.equals(fraction14));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long22 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction19.add(fraction21);
        double double24 = fraction19.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.abs();
        float float31 = fraction29.floatValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction29.multiplyBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((-3), 52, 175);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction42.add(fraction45);
        int int47 = fraction42.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction48.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction42.divideBy(fraction51);
        int int54 = fraction53.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction39.add(fraction53);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction29.divideBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction25.add(fraction29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction11 and fraction49", (fraction11.compareTo(fraction49) == 0) == fraction11.equals(fraction49));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, (-1));
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long9 = fraction8.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        float float21 = fraction19.floatValue();
        int int22 = fraction19.getDenominator();
        java.lang.String str23 = fraction19.toString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction18.subtract(fraction19);
        int int25 = fraction19.intValue();
        int int26 = fraction19.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction8.multiplyBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction19.abs();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction19.pow((int) (byte) 35);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int35 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.add(fraction37);
        java.lang.String str40 = fraction37.toProperString();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction33.divideBy(fraction37);
        float float42 = fraction41.floatValue();
        double double43 = fraction41.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction41.pow(1716);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction19.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction((-2), 1226);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int55 = fraction54.intValue();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int58 = fraction57.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction54.add(fraction57);
        java.lang.String str60 = fraction57.toProperString();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction53.divideBy(fraction57);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction53.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.invert();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction64.negate();
        float float67 = fraction66.floatValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction63.subtract(fraction66);
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int71 = fraction70.intValue();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction70.invert();
        java.lang.String str73 = fraction70.toProperString();
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction70.subtract(fraction76);
        org.apache.commons.lang3.math.Fraction fraction78 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction79 = fraction78.invert();
        float float80 = fraction78.floatValue();
        int int81 = fraction78.getDenominator();
        java.lang.String str82 = fraction78.toString();
        org.apache.commons.lang3.math.Fraction fraction83 = fraction77.subtract(fraction78);
        org.apache.commons.lang3.math.Fraction fraction84 = fraction63.add(fraction78);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction78.invert();
        boolean boolean86 = fraction51.equals((java.lang.Object) fraction78);
        boolean boolean87 = fraction49.equals((java.lang.Object) fraction51);
        org.apache.commons.lang3.math.Fraction fraction88 = fraction49.abs();
        org.apache.commons.lang3.math.Fraction fraction89 = fraction46.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction90 = fraction49.reduce();
        boolean boolean91 = fraction6.equals((java.lang.Object) fraction49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction49 and fraction90", (fraction49.compareTo(fraction90) == 0) == fraction49.equals(fraction90));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.add(fraction23);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction20.abs();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.abs();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str29 = fraction28.toString();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction27.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction19.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, 100, 100);
        float float36 = fraction35.floatValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.intValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction38.invert();
        java.lang.String str41 = fraction38.toProperString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction38.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.pow((int) (short) 1);
        java.lang.String str52 = fraction49.toProperString();
        float float53 = fraction49.floatValue();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction49.reduce();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction44.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str57 = fraction56.toString();
        int int58 = fraction56.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.multiplyBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction35.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction31.multiplyBy(fraction60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction11 and fraction35", (fraction11.compareTo(fraction35) == 0) == fraction11.equals(fraction35));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(94, 1226);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.reduce();
        int int4 = fraction3.getProperNumerator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction3", (fraction2.compareTo(fraction3) == 0) == fraction2.equals(fraction3));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        org.apache.commons.lang3.math.Fraction fraction23 = fraction12.pow((int) (byte) 35);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.add(fraction30);
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.divideBy(fraction30);
        float float35 = fraction34.floatValue();
        double double36 = fraction34.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction34.pow(1716);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction12.multiplyBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction((-2), 1226);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.add(fraction50);
        java.lang.String str53 = fraction50.toProperString();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction46.divideBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction46.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction57.negate();
        float float60 = fraction59.floatValue();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction56.subtract(fraction59);
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int64 = fraction63.intValue();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction63.invert();
        java.lang.String str66 = fraction63.toProperString();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction63.subtract(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction72 = fraction71.invert();
        float float73 = fraction71.floatValue();
        int int74 = fraction71.getDenominator();
        java.lang.String str75 = fraction71.toString();
        org.apache.commons.lang3.math.Fraction fraction76 = fraction70.subtract(fraction71);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction56.add(fraction71);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction71.invert();
        boolean boolean79 = fraction44.equals((java.lang.Object) fraction71);
        boolean boolean80 = fraction42.equals((java.lang.Object) fraction44);
        org.apache.commons.lang3.math.Fraction fraction81 = fraction42.abs();
        org.apache.commons.lang3.math.Fraction fraction82 = fraction39.divideBy(fraction42);
        org.apache.commons.lang3.math.Fraction fraction83 = fraction42.reduce();
        long long84 = fraction83.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction42 and fraction83", (fraction42.compareTo(fraction83) == 0) == fraction42.equals(fraction83));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.negate();
        boolean boolean12 = fraction10.equals((java.lang.Object) 0L);
        java.lang.String str13 = fraction10.toProperString();
        long long14 = fraction10.longValue();
        java.lang.String str15 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean21 = fraction19.equals((java.lang.Object) (byte) 100);
        int int22 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, (int) (short) 21);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.intValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.invert();
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.invert();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction27.divideBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction23.multiplyBy(fraction27);
        java.lang.String str36 = fraction35.toString();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction10.divideBy(fraction35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction9 and fraction27", (fraction9.compareTo(fraction27) == 0) == fraction9.equals(fraction27));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 40, (int) (short) 100);
        int int3 = fraction2.getDenominator();
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction5.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction14 = fraction13.invert();
        boolean boolean15 = fraction12.equals((java.lang.Object) fraction13);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction17.divideBy(fraction21);
        float float26 = fraction25.floatValue();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction13.subtract(fraction25);
        java.lang.String str30 = fraction29.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.abs();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long38 = fraction37.longValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction40.invert();
        java.lang.String str43 = fraction40.toProperString();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction48.invert();
        float float50 = fraction48.floatValue();
        int int51 = fraction48.getDenominator();
        java.lang.String str52 = fraction48.toString();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction47.subtract(fraction48);
        int int54 = fraction48.intValue();
        int int55 = fraction48.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction37.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction48.abs();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction34.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction29.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int61 = fraction60.intValue();
        float float62 = fraction60.floatValue();
        java.lang.String str63 = fraction60.toString();
        long long64 = fraction60.longValue();
        int int65 = fraction60.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int69 = fraction68.intValue();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction60.divideBy(fraction68);
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean76 = fraction74.equals((java.lang.Object) (byte) 100);
        int int77 = fraction74.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int81 = fraction80.intValue();
        org.apache.commons.lang3.math.Fraction fraction83 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int84 = fraction83.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction85 = fraction80.add(fraction83);
        java.lang.String str86 = fraction83.toProperString();
        org.apache.commons.lang3.math.Fraction fraction87 = fraction79.divideBy(fraction83);
        org.apache.commons.lang3.math.Fraction fraction89 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long90 = fraction89.longValue();
        org.apache.commons.lang3.math.Fraction fraction91 = fraction83.subtract(fraction89);
        org.apache.commons.lang3.math.Fraction fraction92 = fraction83.invert();
        int int93 = fraction83.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction94 = fraction74.multiplyBy(fraction83);
        org.apache.commons.lang3.math.Fraction fraction95 = fraction83.abs();
        org.apache.commons.lang3.math.Fraction fraction96 = fraction68.divideBy(fraction83);
        boolean boolean97 = fraction29.equals((java.lang.Object) fraction83);
        org.apache.commons.lang3.math.Fraction fraction98 = fraction2.multiplyBy(fraction29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction5", (fraction2.compareTo(fraction5) == 0) == fraction2.equals(fraction5));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        double double7 = fraction2.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction2 and fraction6", (fraction2.compareTo(fraction6) == 0) == fraction2.equals(fraction6));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int33 = fraction32.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.pow((int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction30.multiplyBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction30.reduce();
        int int39 = fraction25.compareTo(fraction38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction30 and fraction38", (fraction30.compareTo(fraction38) == 0) == fraction30.equals(fraction38));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long22 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction19.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.pow((int) (short) 1);
        java.lang.String str32 = fraction29.toProperString();
        float float33 = fraction29.floatValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction29.reduce();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction36 = fraction35.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int39 = fraction38.intValue();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int42 = fraction41.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction38.add(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction38.abs();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction38.abs();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction35.add(fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction34.multiplyBy(fraction46);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ONE;
        int int49 = fraction48.getProperWhole();
        long long50 = fraction48.longValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction48.invert();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int53 = fraction52.intValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction52.add(fraction55);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction52.abs();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction52.abs();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.invert();
        boolean boolean62 = fraction59.equals((java.lang.Object) fraction60);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction60.reduce();
        int int64 = fraction63.getNumerator();
        int int65 = fraction63.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction48.add(fraction63);
        int int67 = fraction66.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction34.divideBy(fraction66);
        int int69 = fraction34.getNumerator();
        boolean boolean70 = fraction24.equals((java.lang.Object) fraction34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on fraction11 and fraction35", (fraction11.compareTo(fraction35) == 0) == fraction11.equals(fraction35));
    }
}

