package org.apache.commons.lang.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
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
        org.apache.commons.lang.math.Fraction fraction33 = fraction22.pow((-2));
        int int34 = fraction33.intValue();
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
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        int int38 = fraction37.getDenominator();
        int int39 = fraction37.getDenominator();
        int int40 = fraction37.intValue();
        int int41 = fraction35.compareTo((java.lang.Object) fraction37);
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction(0, 1002);
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long48 = fraction47.longValue();
        int int49 = fraction47.getNumerator();
        org.apache.commons.lang.math.Fraction fraction50 = fraction44.multiplyBy(fraction47);
        org.apache.commons.lang.math.Fraction fraction52 = org.apache.commons.lang.math.Fraction.getFraction((double) 165);
        org.apache.commons.lang.math.Fraction fraction53 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int56 = fraction55.intValue();
        org.apache.commons.lang.math.Fraction fraction57 = fraction55.invert();
        org.apache.commons.lang.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang.math.Fraction fraction60 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int61 = fraction60.intValue();
        org.apache.commons.lang.math.Fraction fraction62 = fraction60.invert();
        org.apache.commons.lang.math.Fraction fraction63 = fraction62.invert();
        org.apache.commons.lang.math.Fraction fraction64 = fraction57.subtract(fraction62);
        int int65 = fraction57.getDenominator();
        org.apache.commons.lang.math.Fraction fraction66 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction67 = fraction66.negate();
        boolean boolean68 = fraction57.equals((java.lang.Object) fraction67);
        int int69 = fraction57.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction70 = fraction53.add(fraction57);
        org.apache.commons.lang.math.Fraction fraction71 = fraction52.subtract(fraction70);
        org.apache.commons.lang.math.Fraction fraction72 = fraction50.subtract(fraction71);
        java.lang.String str73 = fraction50.toProperString();
        org.apache.commons.lang.math.Fraction fraction74 = fraction50.abs();
        boolean boolean75 = fraction37.equals((java.lang.Object) fraction50);
        org.apache.commons.lang.math.Fraction fraction76 = fraction37.abs();
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
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-10L) + "'", long48 == (-10L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-10) + "'", int49 == (-10));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "0" + "'", str73, "0");
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(fraction76);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(11, (int) (short) 100, 120);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction10 = fraction4.subtract(fraction9);
        int int11 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int13 = fraction12.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction14 = fraction4.multiplyBy(fraction12);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int16 = fraction15.intValue();
        int int17 = fraction15.getDenominator();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int21 = fraction20.getDenominator();
        org.apache.commons.lang.math.Fraction fraction22 = fraction15.divideBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int24 = fraction23.getProperNumerator();
        int int25 = fraction22.compareTo((java.lang.Object) fraction23);
        org.apache.commons.lang.math.Fraction fraction26 = fraction4.add(fraction22);
        int int27 = fraction26.getProperNumerator();
        int int28 = fraction26.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int30 = fraction29.intValue();
        org.apache.commons.lang.math.Fraction fraction31 = fraction26.divideBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.negate();
        java.lang.String str34 = fraction32.toProperString();
        long long35 = fraction32.longValue();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction("33/1");
        org.apache.commons.lang.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.ONE;
        int int40 = fraction39.getProperWhole();
        int int41 = fraction39.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction42 = fraction39.negate();
        double double43 = fraction39.doubleValue();
        int int44 = fraction39.getNumerator();
        org.apache.commons.lang.math.Fraction fraction45 = fraction39.invert();
        org.apache.commons.lang.math.Fraction fraction46 = fraction38.multiplyBy(fraction39);
        org.apache.commons.lang.math.Fraction fraction47 = fraction26.multiplyBy(fraction46);
        org.apache.commons.lang.math.Fraction fraction49 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int50 = fraction49.intValue();
        org.apache.commons.lang.math.Fraction fraction51 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int52 = fraction51.intValue();
        float float53 = fraction51.floatValue();
        java.lang.String str54 = fraction51.toString();
        org.apache.commons.lang.math.Fraction fraction55 = fraction49.subtract(fraction51);
        int int56 = fraction49.getProperWhole();
        double double57 = fraction49.doubleValue();
        org.apache.commons.lang.math.Fraction fraction58 = fraction26.subtract(fraction49);
        org.apache.commons.lang.math.Fraction fraction59 = fraction3.add(fraction58);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.4f + "'", float53 == 0.4f);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2/5" + "'", str54, "2/5");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(11, (int) (short) -32);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction10 = fraction7.multiplyBy(fraction9);
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int12 = fraction11.getDenominator();
        java.lang.String str13 = fraction11.toString();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.negate();
        org.apache.commons.lang.math.Fraction fraction17 = fraction14.pow(0);
        int int18 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction11.divideBy(fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int22 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang.math.Fraction fraction26 = fraction21.add(fraction24);
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = fraction11.divideBy(fraction24);
        org.apache.commons.lang.math.Fraction fraction29 = fraction10.multiplyBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction30 = fraction10.abs();
        boolean boolean31 = fraction2.equals((java.lang.Object) fraction30);
        java.lang.String str32 = fraction30.toProperString();
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int36 = fraction35.intValue();
        double double37 = fraction35.doubleValue();
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.intValue();
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int42 = fraction41.intValue();
        float float43 = fraction41.floatValue();
        java.lang.String str44 = fraction41.toString();
        org.apache.commons.lang.math.Fraction fraction45 = fraction39.subtract(fraction41);
        java.lang.String str46 = fraction41.toProperString();
        org.apache.commons.lang.math.Fraction fraction47 = fraction41.invert();
        org.apache.commons.lang.math.Fraction fraction48 = fraction35.divideBy(fraction47);
        org.apache.commons.lang.math.Fraction fraction51 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int52 = fraction51.intValue();
        double double53 = fraction51.doubleValue();
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int56 = fraction55.intValue();
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int58 = fraction57.intValue();
        float float59 = fraction57.floatValue();
        java.lang.String str60 = fraction57.toString();
        org.apache.commons.lang.math.Fraction fraction61 = fraction55.subtract(fraction57);
        java.lang.String str62 = fraction57.toProperString();
        org.apache.commons.lang.math.Fraction fraction63 = fraction57.invert();
        org.apache.commons.lang.math.Fraction fraction64 = fraction51.divideBy(fraction63);
        org.apache.commons.lang.math.Fraction fraction65 = fraction47.subtract(fraction63);
        java.lang.String str66 = fraction47.toString();
        int int67 = fraction30.compareTo((java.lang.Object) fraction47);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4/5" + "'", str13, "4/5");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "33 1/3" + "'", str32, "33 1/3");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.4f + "'", float43 == 0.4f);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2/5" + "'", str44, "2/5");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2/5" + "'", str46, "2/5");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.4f + "'", float59 == 0.4f);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2/5" + "'", str60, "2/5");
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "2/5" + "'", str62, "2/5");
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "5/2" + "'", str66, "5/2");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 100);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        float float6 = fraction4.floatValue();
        java.lang.String str7 = fraction4.toString();
        long long8 = fraction4.longValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction4.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction13 = fraction4.add(fraction12);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction15.add(fraction18);
        int int21 = fraction20.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = fraction28.invert();
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang.math.Fraction fraction32 = fraction25.divideBy(fraction28);
        org.apache.commons.lang.math.Fraction fraction33 = fraction23.add(fraction25);
        org.apache.commons.lang.math.Fraction fraction34 = fraction20.add(fraction23);
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int36 = fraction35.intValue();
        float float37 = fraction35.floatValue();
        java.lang.String str38 = fraction35.toString();
        long long39 = fraction35.longValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction35.negate();
        org.apache.commons.lang.math.Fraction fraction41 = fraction20.multiplyBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction42 = fraction13.multiplyBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction43 = fraction2.multiplyBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction44 = fraction2.reduce();
        int int45 = fraction2.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction46 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int47 = fraction46.intValue();
        org.apache.commons.lang.math.Fraction fraction49 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int50 = fraction49.getNumerator();
        org.apache.commons.lang.math.Fraction fraction51 = fraction46.add(fraction49);
        java.lang.String str52 = fraction49.toProperString();
        org.apache.commons.lang.math.Fraction fraction53 = fraction49.invert();
        org.apache.commons.lang.math.Fraction fraction56 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction57 = fraction56.invert();
        float float58 = fraction56.floatValue();
        org.apache.commons.lang.math.Fraction fraction59 = fraction53.subtract(fraction56);
        int int60 = fraction56.getNumerator();
        int int61 = fraction56.getDenominator();
        org.apache.commons.lang.math.Fraction fraction62 = fraction56.negate();
        org.apache.commons.lang.math.Fraction fraction63 = fraction2.divideBy(fraction62);
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
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 18 + "'", int14 == 18);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.4f + "'", float37 == 0.4f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2/5" + "'", str38, "2/5");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10" + "'", str52, "10");
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-10.0f) + "'", float58 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-10) + "'", int60 == (-10));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int7 = fraction6.intValue();
        int int8 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int12 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = fraction6.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction15 = fraction11.pow(6);
        org.apache.commons.lang.math.Fraction fraction16 = fraction4.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        float float21 = fraction19.floatValue();
        java.lang.String str22 = fraction19.toString();
        long long23 = fraction19.longValue();
        int int24 = fraction17.compareTo((java.lang.Object) fraction19);
        java.lang.String str25 = fraction17.toProperString();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction32 = fraction30.invert();
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang.math.Fraction fraction34 = fraction27.divideBy(fraction30);
        org.apache.commons.lang.math.Fraction fraction36 = fraction34.pow((int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.intValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction38.invert();
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.intValue();
        org.apache.commons.lang.math.Fraction fraction45 = fraction43.invert();
        org.apache.commons.lang.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang.math.Fraction fraction47 = fraction40.subtract(fraction45);
        int int48 = fraction40.getDenominator();
        org.apache.commons.lang.math.Fraction fraction49 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction50 = fraction49.negate();
        boolean boolean51 = fraction40.equals((java.lang.Object) fraction50);
        org.apache.commons.lang.math.Fraction fraction52 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction53 = fraction52.invert();
        org.apache.commons.lang.math.Fraction fraction54 = fraction40.divideBy(fraction53);
        org.apache.commons.lang.math.Fraction fraction55 = fraction40.reduce();
        long long56 = fraction40.longValue();
        org.apache.commons.lang.math.Fraction fraction57 = fraction34.multiplyBy(fraction40);
        org.apache.commons.lang.math.Fraction fraction58 = fraction17.divideBy(fraction57);
        org.apache.commons.lang.math.Fraction fraction59 = fraction58.negate();
        org.apache.commons.lang.math.Fraction fraction60 = fraction11.subtract(fraction58);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.4f + "'", float21 == 0.4f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2/5" + "'", str22, "2/5");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3/5" + "'", str25, "3/5");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.reduce();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction(6, (int) 'a', 7);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, 20);
        org.apache.commons.lang.math.Fraction fraction16 = fraction12.multiplyBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.abs();
        org.apache.commons.lang.math.Fraction fraction18 = fraction8.multiplyBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction((double) 35.3f);
        long long21 = fraction20.longValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction8.subtract(fraction20);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(fraction22);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 20, (-20));
        float float3 = fraction2.floatValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.pow(0);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.invert();
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction19 = fraction12.divideBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction20 = fraction10.add(fraction12);
        double double21 = fraction20.doubleValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.getNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = fraction22.add(fraction25);
        java.lang.String str28 = fraction25.toProperString();
        java.lang.String str29 = fraction25.toProperString();
        org.apache.commons.lang.math.Fraction fraction30 = fraction20.add(fraction25);
        org.apache.commons.lang.math.Fraction fraction31 = fraction6.add(fraction20);
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction38 = fraction32.subtract(fraction37);
        org.apache.commons.lang.math.Fraction fraction39 = fraction31.add(fraction37);
        org.apache.commons.lang.math.Fraction fraction40 = fraction39.negate();
        org.apache.commons.lang.math.Fraction fraction41 = fraction2.add(fraction39);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 110.0d + "'", double21 == 110.0d);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10" + "'", str28, "10");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("4 2/5");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(31, (int) (short) -15);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 4, 18);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.reduce();
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.abs();
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.abs();
        int int8 = fraction2.compareTo((java.lang.Object) fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction2.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 180, 1002);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(656, (int) (byte) -27);
        int int3 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("1 2/3");
        float float2 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6666666f + "'", float2 == 1.6666666f);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.negate();
        java.lang.String str5 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-3" + "'", str5, "-3");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(4, (int) (byte) 56);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        int int5 = fraction3.getDenominator();
        long long6 = fraction3.longValue();
        int int7 = fraction3.getDenominator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int11 = fraction10.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.abs();
        java.lang.String str13 = fraction12.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction("1/4");
        org.apache.commons.lang.math.Fraction fraction16 = fraction12.subtract(fraction15);
        boolean boolean17 = fraction3.equals((java.lang.Object) fraction16);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction22.invert();
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction19.divideBy(fraction22);
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang.math.Fraction fraction29 = fraction22.subtract(fraction27);
        boolean boolean30 = fraction3.equals((java.lang.Object) fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int34 = fraction33.intValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.invert();
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.intValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction38.invert();
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang.math.Fraction fraction42 = fraction35.subtract(fraction40);
        int int43 = fraction35.getDenominator();
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction45 = fraction44.negate();
        boolean boolean46 = fraction35.equals((java.lang.Object) fraction45);
        int int47 = fraction35.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction48 = fraction31.add(fraction35);
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int51 = fraction48.compareTo((java.lang.Object) fraction50);
        org.apache.commons.lang.math.Fraction fraction52 = fraction48.invert();
        org.apache.commons.lang.math.Fraction fraction53 = fraction52.negate();
        org.apache.commons.lang.math.Fraction fraction54 = fraction53.negate();
        org.apache.commons.lang.math.Fraction fraction55 = fraction29.add(fraction54);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = fraction0.pow((int) (short) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        java.lang.String str9 = fraction8.toProperString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction11 = fraction8.invert();
        int int12 = fraction8.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str16 = fraction15.toString();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int23 = fraction22.intValue();
        float float24 = fraction22.floatValue();
        java.lang.String str25 = fraction22.toString();
        long long26 = fraction22.longValue();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = fraction22.add(fraction27);
        org.apache.commons.lang.math.Fraction fraction30 = fraction21.multiplyBy(fraction27);
        long long31 = fraction30.longValue();
        boolean boolean32 = fraction15.equals((java.lang.Object) fraction30);
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction35 = fraction33.abs();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int38 = fraction37.intValue();
        org.apache.commons.lang.math.Fraction fraction39 = fraction37.invert();
        org.apache.commons.lang.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang.math.Fraction fraction42 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int43 = fraction42.intValue();
        org.apache.commons.lang.math.Fraction fraction44 = fraction42.invert();
        org.apache.commons.lang.math.Fraction fraction45 = fraction44.invert();
        org.apache.commons.lang.math.Fraction fraction46 = fraction39.subtract(fraction44);
        int int47 = fraction39.getDenominator();
        org.apache.commons.lang.math.Fraction fraction48 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction49 = fraction48.negate();
        boolean boolean50 = fraction39.equals((java.lang.Object) fraction49);
        org.apache.commons.lang.math.Fraction fraction51 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang.math.Fraction fraction53 = fraction39.divideBy(fraction52);
        org.apache.commons.lang.math.Fraction fraction54 = fraction33.multiplyBy(fraction53);
        org.apache.commons.lang.math.Fraction fraction55 = fraction54.reduce();
        int int56 = fraction55.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction57 = fraction30.add(fraction55);
        long long58 = fraction57.longValue();
        org.apache.commons.lang.math.Fraction fraction59 = fraction8.add(fraction57);
        org.apache.commons.lang.math.Fraction fraction62 = org.apache.commons.lang.math.Fraction.getReducedFraction(18, (-199));
        boolean boolean63 = fraction57.equals((java.lang.Object) 18);
        org.apache.commons.lang.math.Fraction fraction64 = fraction57.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-10/1" + "'", str16, "-10/1");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.4f + "'", float24 == 0.4f);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2/5" + "'", str25, "2/5");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 4L + "'", long31 == 4L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 4L + "'", long58 == 4L);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fraction64);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-1), 18);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.pow(2);
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.negate();
        int int13 = fraction2.compareTo((java.lang.Object) fraction5);
        int int14 = fraction2.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        float float4 = fraction2.floatValue();
        java.lang.String str5 = fraction2.toString();
        long long6 = fraction2.longValue();
        int int7 = fraction0.compareTo((java.lang.Object) fraction2);
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction10.add(fraction13);
        java.lang.String str16 = fraction13.toProperString();
        double double17 = fraction13.doubleValue();
        long long18 = fraction13.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction0.divideBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.invert();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction25);
        int int27 = fraction20.getProperNumerator();
        float float28 = fraction20.floatValue();
        boolean boolean29 = fraction0.equals((java.lang.Object) float28);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 9L);
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.reduce();
        org.apache.commons.lang.math.Fraction fraction33 = fraction0.multiplyBy(fraction32);
        java.lang.String str34 = fraction0.toProperString();
        org.apache.commons.lang.math.Fraction fraction35 = fraction0.abs();
        int int36 = fraction35.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.4f + "'", float4 == 0.4f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2/5" + "'", str5, "2/5");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3/5" + "'", str34, "3/5");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', (int) (short) 110, 52);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.subtract(fraction14);
        int int17 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction4.add(fraction14);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        float float21 = fraction19.floatValue();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int24 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        float float27 = fraction25.floatValue();
        java.lang.String str28 = fraction25.toString();
        org.apache.commons.lang.math.Fraction fraction29 = fraction23.subtract(fraction25);
        int int30 = fraction19.compareTo((java.lang.Object) fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = fraction29.reduce();
        org.apache.commons.lang.math.Fraction fraction32 = fraction18.divideBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang.math.Fraction fraction34 = fraction3.subtract(fraction32);
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getReducedFraction(2, (int) (short) -32);
        java.lang.String str38 = fraction37.toProperString();
        org.apache.commons.lang.math.Fraction fraction39 = fraction32.subtract(fraction37);
        org.apache.commons.lang.math.Fraction fraction40 = fraction39.reduce();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.4f + "'", float21 == 0.4f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.4f + "'", float27 == 0.4f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2/5" + "'", str28, "2/5");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-1/16" + "'", str38, "-1/16");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        int int9 = fraction8.getProperWhole();
        double double10 = fraction8.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 67 + "'", int9 == 67);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 67.3076923076923d + "'", double10 == 67.3076923076923d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("4/11");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        java.lang.String str2 = fraction0.toProperString();
        int int3 = fraction0.getProperWhole();
        long long4 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-34 1/2");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int7 = fraction6.intValue();
        boolean boolean8 = fraction1.equals((java.lang.Object) int7);
        org.apache.commons.lang.math.Fraction fraction9 = fraction1.negate();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.invert();
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction13.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.divideBy(fraction20);
        org.apache.commons.lang.math.Fraction fraction23 = fraction21.pow(18);
        org.apache.commons.lang.math.Fraction fraction24 = fraction23.reduce();
        boolean boolean25 = fraction1.equals((java.lang.Object) fraction23);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction(0.5614035087719298d);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.add(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        float float10 = fraction8.floatValue();
        java.lang.String str11 = fraction8.toString();
        long long12 = fraction8.longValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.add(fraction13);
        int int16 = fraction8.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = fraction8.abs();
        int int18 = fraction8.getDenominator();
        org.apache.commons.lang.math.Fraction fraction19 = fraction8.reduce();
        org.apache.commons.lang.math.Fraction fraction20 = fraction7.multiplyBy(fraction19);
        int int21 = fraction7.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.4f + "'", float10 == 0.4f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2/5" + "'", str11, "2/5");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction7 = fraction4.multiplyBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int9 = fraction8.getDenominator();
        java.lang.String str10 = fraction8.toString();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.negate();
        org.apache.commons.lang.math.Fraction fraction14 = fraction11.pow(0);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction8.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction17 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        org.apache.commons.lang.math.Fraction fraction25 = fraction8.divideBy(fraction21);
        org.apache.commons.lang.math.Fraction fraction26 = fraction7.multiplyBy(fraction8);
        java.lang.String str27 = fraction26.toProperString();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int29 = fraction28.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = fraction28.negate();
        float float31 = fraction28.floatValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction("110/1");
        org.apache.commons.lang.math.Fraction fraction34 = fraction33.reduce();
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        boolean boolean36 = fraction33.equals((java.lang.Object) fraction35);
        org.apache.commons.lang.math.Fraction fraction37 = fraction28.subtract(fraction33);
        org.apache.commons.lang.math.Fraction fraction38 = fraction33.abs();
        org.apache.commons.lang.math.Fraction fraction39 = fraction26.divideBy(fraction38);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4/5" + "'", str10, "4/5");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "26 2/3" + "'", str27, "26 2/3");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.4f + "'", float31 == 0.4f);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(272, 193);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
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
        org.apache.commons.lang.math.Fraction fraction42 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int43 = fraction42.intValue();
        double double44 = fraction42.doubleValue();
        int int45 = fraction42.intValue();
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.intValue();
        org.apache.commons.lang.math.Fraction fraction49 = fraction47.invert();
        org.apache.commons.lang.math.Fraction fraction51 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int52 = fraction51.intValue();
        org.apache.commons.lang.math.Fraction fraction53 = fraction51.invert();
        org.apache.commons.lang.math.Fraction fraction54 = fraction53.invert();
        long long55 = fraction54.longValue();
        org.apache.commons.lang.math.Fraction fraction56 = fraction47.add(fraction54);
        int int57 = fraction54.getDenominator();
        org.apache.commons.lang.math.Fraction fraction58 = fraction42.add(fraction54);
        org.apache.commons.lang.math.Fraction fraction59 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int60 = fraction59.intValue();
        org.apache.commons.lang.math.Fraction fraction62 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int63 = fraction62.getNumerator();
        org.apache.commons.lang.math.Fraction fraction64 = fraction59.add(fraction62);
        int int65 = fraction64.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction67 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int68 = fraction67.intValue();
        org.apache.commons.lang.math.Fraction fraction69 = fraction67.invert();
        org.apache.commons.lang.math.Fraction fraction70 = fraction69.invert();
        int int71 = fraction69.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction72 = fraction64.add(fraction69);
        float float73 = fraction64.floatValue();
        org.apache.commons.lang.math.Fraction fraction74 = fraction54.subtract(fraction64);
        org.apache.commons.lang.math.Fraction fraction75 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction76 = fraction75.invert();
        org.apache.commons.lang.math.Fraction fraction77 = fraction75.abs();
        org.apache.commons.lang.math.Fraction fraction78 = fraction75.reduce();
        org.apache.commons.lang.math.Fraction fraction79 = fraction74.subtract(fraction75);
        org.apache.commons.lang.math.Fraction fraction81 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int82 = fraction81.intValue();
        org.apache.commons.lang.math.Fraction fraction83 = fraction81.invert();
        org.apache.commons.lang.math.Fraction fraction84 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int85 = fraction84.intValue();
        org.apache.commons.lang.math.Fraction fraction87 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int88 = fraction87.getNumerator();
        org.apache.commons.lang.math.Fraction fraction89 = fraction84.add(fraction87);
        int int90 = fraction81.compareTo((java.lang.Object) fraction84);
        long long91 = fraction84.longValue();
        org.apache.commons.lang.math.Fraction fraction92 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction93 = fraction92.negate();
        org.apache.commons.lang.math.Fraction fraction94 = fraction84.subtract(fraction93);
        org.apache.commons.lang.math.Fraction fraction95 = fraction75.subtract(fraction93);
        org.apache.commons.lang.math.Fraction fraction96 = fraction3.multiplyBy(fraction93);
        short short97 = fraction3.shortValue();
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
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2 + "'", int65 == 2);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 10.4f + "'", float73 == 10.4f);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertNotNull(fraction96);
        org.junit.Assert.assertTrue("'" + short97 + "' != '" + (short) 0 + "'", short97 == (short) 0);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        java.lang.String str7 = fraction4.toProperString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.divideBy(fraction4);
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.pow((int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction21 = fraction14.subtract(fraction19);
        int int22 = fraction14.getDenominator();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction24 = fraction23.negate();
        boolean boolean25 = fraction14.equals((java.lang.Object) fraction24);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction27 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction28 = fraction14.divideBy(fraction27);
        org.apache.commons.lang.math.Fraction fraction29 = fraction14.reduce();
        long long30 = fraction14.longValue();
        org.apache.commons.lang.math.Fraction fraction31 = fraction8.multiplyBy(fraction14);
        java.lang.Class<?> wildcardClass32 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        int int17 = fraction0.getProperNumerator();
        java.lang.String str18 = fraction0.toString();
        long long19 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long23 = fraction22.longValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        double double27 = fraction25.doubleValue();
        int int28 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.intValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction34.invert();
        org.apache.commons.lang.math.Fraction fraction37 = fraction36.invert();
        long long38 = fraction37.longValue();
        org.apache.commons.lang.math.Fraction fraction39 = fraction30.add(fraction37);
        int int40 = fraction37.getDenominator();
        org.apache.commons.lang.math.Fraction fraction41 = fraction25.add(fraction37);
        float float42 = fraction37.floatValue();
        int int43 = fraction37.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction44 = fraction22.divideBy(fraction37);
        org.apache.commons.lang.math.Fraction fraction45 = fraction44.reduce();
        org.apache.commons.lang.math.Fraction fraction46 = fraction44.abs();
        org.apache.commons.lang.math.Fraction fraction48 = fraction44.pow(0);
        org.apache.commons.lang.math.Fraction fraction49 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int50 = fraction49.getProperNumerator();
        int int51 = fraction49.intValue();
        org.apache.commons.lang.math.Fraction fraction53 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int54 = fraction53.intValue();
        org.apache.commons.lang.math.Fraction fraction55 = fraction53.invert();
        org.apache.commons.lang.math.Fraction fraction56 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int57 = fraction56.intValue();
        org.apache.commons.lang.math.Fraction fraction59 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int60 = fraction59.getNumerator();
        org.apache.commons.lang.math.Fraction fraction61 = fraction56.add(fraction59);
        int int62 = fraction53.compareTo((java.lang.Object) fraction56);
        int int63 = fraction56.getDenominator();
        org.apache.commons.lang.math.Fraction fraction64 = fraction49.divideBy(fraction56);
        org.apache.commons.lang.math.Fraction fraction65 = fraction49.negate();
        org.apache.commons.lang.math.Fraction fraction66 = fraction44.multiplyBy(fraction65);
        org.apache.commons.lang.math.Fraction fraction67 = fraction0.divideBy(fraction66);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3/5" + "'", str18, "3/5");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-10L) + "'", long23 == (-10L));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
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
        int int23 = fraction11.getNumerator();
        int int24 = fraction11.getProperNumerator();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 110 + "'", int23 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        boolean boolean15 = fraction1.equals((java.lang.Object) fraction14);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction19 = fraction16.multiplyBy(fraction18);
        org.apache.commons.lang.math.Fraction fraction21 = fraction18.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction28 = fraction22.subtract(fraction27);
        int int29 = fraction22.getProperNumerator();
        float float30 = fraction22.floatValue();
        org.apache.commons.lang.math.Fraction fraction31 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        float float34 = fraction32.floatValue();
        java.lang.String str35 = fraction32.toString();
        long long36 = fraction32.longValue();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        org.apache.commons.lang.math.Fraction fraction39 = fraction32.add(fraction37);
        org.apache.commons.lang.math.Fraction fraction40 = fraction39.reduce();
        org.apache.commons.lang.math.Fraction fraction41 = fraction39.invert();
        org.apache.commons.lang.math.Fraction fraction42 = fraction22.divideBy(fraction41);
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 10, (int) (byte) 10);
        float float46 = fraction45.floatValue();
        org.apache.commons.lang.math.Fraction fraction47 = fraction22.multiplyBy(fraction45);
        org.apache.commons.lang.math.Fraction fraction48 = fraction1.subtract(fraction22);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.4f + "'", float34 == 0.4f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2/5" + "'", str35, "2/5");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int3 = fraction2.getNumerator();
        int int4 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.reduce();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-10), (int) (byte) 100);
        double double3 = fraction2.doubleValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.abs();
        java.lang.String str5 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1d) + "'", double3 == (-0.1d));
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-10/100" + "'", str5, "-10/100");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang.math.Fraction fraction20 = fraction13.subtract(fraction18);
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        float float23 = fraction22.floatValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction13.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction25 = fraction9.add(fraction24);
        int int26 = fraction25.getProperNumerator();
        int int27 = fraction25.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        float float4 = fraction2.floatValue();
        java.lang.String str5 = fraction2.toString();
        long long6 = fraction2.longValue();
        int int7 = fraction0.compareTo((java.lang.Object) fraction2);
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.reduce();
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.reduce();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.4f + "'", float4 == 0.4f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2/5" + "'", str5, "2/5");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
        int int21 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int23 = fraction22.intValue();
        int int24 = fraction22.getDenominator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int28 = fraction27.getDenominator();
        org.apache.commons.lang.math.Fraction fraction29 = fraction22.divideBy(fraction27);
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int31 = fraction30.getProperNumerator();
        int int32 = fraction29.compareTo((java.lang.Object) fraction30);
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction30.divideBy(fraction33);
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.intValue();
        double double40 = fraction38.doubleValue();
        int int41 = fraction38.intValue();
        float float42 = fraction38.floatValue();
        org.apache.commons.lang.math.Fraction fraction43 = fraction30.subtract(fraction38);
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) -1);
        double double46 = fraction45.doubleValue();
        java.lang.String str47 = fraction45.toProperString();
        int int48 = fraction38.compareTo((java.lang.Object) fraction45);
        boolean boolean49 = fraction5.equals((java.lang.Object) fraction45);
        java.lang.String str50 = fraction45.toProperString();
        int int51 = fraction45.getProperWhole();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.4f + "'", float35 == 0.4f);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 10.0f + "'", float42 == 10.0f);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-1" + "'", str50, "-1");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        int int17 = fraction16.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int19 = fraction18.getDenominator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction18.reduce();
        float float21 = fraction18.floatValue();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.multiplyBy(fraction18);
        org.apache.commons.lang.math.Fraction fraction23 = fraction13.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.reduce();
        boolean boolean27 = fraction13.equals((java.lang.Object) fraction25);
        org.apache.commons.lang.math.Fraction fraction28 = fraction1.add(fraction25);
        int int29 = fraction25.getProperWhole();
        java.lang.String str30 = fraction25.toProperString();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int32 = fraction31.intValue();
        int int33 = fraction31.getDenominator();
        org.apache.commons.lang.math.Fraction fraction36 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int37 = fraction36.getDenominator();
        org.apache.commons.lang.math.Fraction fraction38 = fraction31.divideBy(fraction36);
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int40 = fraction39.getProperNumerator();
        int int41 = fraction38.compareTo((java.lang.Object) fraction39);
        org.apache.commons.lang.math.Fraction fraction42 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int43 = fraction42.intValue();
        float float44 = fraction42.floatValue();
        org.apache.commons.lang.math.Fraction fraction45 = fraction39.divideBy(fraction42);
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.intValue();
        double double49 = fraction47.doubleValue();
        int int50 = fraction47.intValue();
        float float51 = fraction47.floatValue();
        org.apache.commons.lang.math.Fraction fraction52 = fraction39.subtract(fraction47);
        org.apache.commons.lang.math.Fraction fraction53 = fraction25.add(fraction52);
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.getFraction("-11/1");
        org.apache.commons.lang.math.Fraction fraction56 = fraction52.subtract(fraction55);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.4f + "'", float44 == 0.4f);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 10.0f + "'", float51 == 10.0f);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang.math.Fraction fraction7 = fraction1.subtract(fraction3);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        long long13 = fraction12.longValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.ONE_FIFTH;
        boolean boolean23 = fraction15.equals((java.lang.Object) fraction22);
        org.apache.commons.lang.math.Fraction fraction24 = fraction14.multiplyBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction25 = fraction3.divideBy(fraction15);
        double double26 = fraction25.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2/5" + "'", str6, "2/5");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.4d + "'", double26 == 0.4d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(3, 2);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.add(fraction8);
        org.apache.commons.lang.math.Fraction fraction11 = fraction5.pow(2);
        org.apache.commons.lang.math.Fraction fraction12 = fraction5.negate();
        org.apache.commons.lang.math.Fraction fraction13 = fraction2.divideBy(fraction5);
        int int14 = fraction5.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        float float8 = fraction0.floatValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.pow((int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction11 = fraction0.invert();
        double double12 = fraction11.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 26, (int) (short) 22);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 52, (int) (byte) -110);
        int int3 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-26) + "'", int3 == (-26));
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        float float18 = fraction16.floatValue();
        java.lang.String str19 = fraction16.toString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction14.subtract(fraction16);
        java.lang.String str21 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int24 = fraction23.getProperNumerator();
        int int25 = fraction23.intValue();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int34 = fraction33.getNumerator();
        org.apache.commons.lang.math.Fraction fraction35 = fraction30.add(fraction33);
        int int36 = fraction27.compareTo((java.lang.Object) fraction30);
        int int37 = fraction30.getDenominator();
        org.apache.commons.lang.math.Fraction fraction38 = fraction23.divideBy(fraction30);
        org.apache.commons.lang.math.Fraction fraction39 = fraction38.negate();
        org.apache.commons.lang.math.Fraction fraction40 = fraction22.subtract(fraction39);
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.negate();
        org.apache.commons.lang.math.Fraction fraction42 = fraction12.add(fraction41);
        org.apache.commons.lang.math.Fraction fraction43 = fraction42.invert();
        int int44 = fraction42.getProperWhole();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.4f + "'", float18 == 0.4f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2/5" + "'", str19, "2/5");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 48 + "'", int44 == 48);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.intValue();
        double double4 = fraction1.doubleValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        int int11 = fraction10.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int13 = fraction12.getDenominator();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.reduce();
        float float15 = fraction12.floatValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction10.multiplyBy(fraction12);
        org.apache.commons.lang.math.Fraction fraction17 = fraction7.divideBy(fraction10);
        org.apache.commons.lang.math.Fraction fraction18 = fraction1.divideBy(fraction17);
        java.lang.Object obj19 = null;
        boolean boolean20 = fraction18.equals(obj19);
        int int21 = fraction18.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
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
        org.apache.commons.lang.math.Fraction fraction43 = fraction42.reduce();
        java.lang.Object obj44 = null;
        boolean boolean45 = fraction42.equals(obj44);
        org.apache.commons.lang.math.Fraction fraction46 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int47 = fraction46.intValue();
        int int48 = fraction46.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.intValue();
        org.apache.commons.lang.math.Fraction fraction52 = fraction50.invert();
        org.apache.commons.lang.math.Fraction fraction53 = fraction52.invert();
        java.lang.String str54 = fraction53.toProperString();
        org.apache.commons.lang.math.Fraction fraction55 = fraction53.reduce();
        org.apache.commons.lang.math.Fraction fraction56 = fraction46.add(fraction55);
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int58 = fraction57.getDenominator();
        java.lang.String str59 = fraction57.toString();
        java.lang.String str60 = fraction57.toProperString();
        org.apache.commons.lang.math.Fraction fraction62 = org.apache.commons.lang.math.Fraction.getFraction("2/5");
        org.apache.commons.lang.math.Fraction fraction63 = fraction57.divideBy(fraction62);
        org.apache.commons.lang.math.Fraction fraction64 = fraction56.add(fraction62);
        java.lang.String str65 = fraction64.toProperString();
        org.apache.commons.lang.math.Fraction fraction66 = fraction64.invert();
        boolean boolean67 = fraction42.equals((java.lang.Object) fraction64);
        java.lang.String str68 = fraction64.toString();
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
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10" + "'", str54, "10");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4/5" + "'", str59, "4/5");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4/5" + "'", str60, "4/5");
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "10 4/5" + "'", str65, "10 4/5");
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "54/5" + "'", str68, "54/5");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction(0.25d);
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction7.subtract(fraction12);
        int int15 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction2.add(fraction12);
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.divideBy(fraction2);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = fraction17.compareTo(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
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
        byte byte24 = fraction23.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 40 + "'", byte24 == (byte) 40);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long1 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction2 = fraction0.reduce();
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.reduce();
        java.lang.Class<?> wildcardClass5 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("52 10/32");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang.math.Fraction fraction9 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        float float14 = fraction12.floatValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction9.subtract(fraction12);
        int int16 = fraction12.getNumerator();
        int int17 = fraction12.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction12.abs();
        org.apache.commons.lang.math.Fraction fraction19 = fraction1.divideBy(fraction12);
        int int20 = fraction1.getDenominator();
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int22 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction21.invert();
        org.apache.commons.lang.math.Fraction fraction24 = fraction21.abs();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 100, (int) (short) 10, 10);
        org.apache.commons.lang.math.Fraction fraction29 = fraction21.multiplyBy(fraction28);
        double double30 = fraction21.doubleValue();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long34 = fraction33.longValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction33.pow(1);
        org.apache.commons.lang.math.Fraction fraction37 = fraction21.subtract(fraction36);
        org.apache.commons.lang.math.Fraction fraction38 = fraction1.multiplyBy(fraction37);
        float float39 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-10.0f) + "'", float14 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-10) + "'", int16 == (-10));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.25d + "'", double30 == 0.25d);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-10L) + "'", long34 == (-10L));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 52.3125f + "'", float39 == 52.3125f);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(0, (-112));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        int int5 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        long long15 = fraction14.longValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction7.add(fraction14);
        int int17 = fraction14.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction2.add(fraction14);
        java.lang.String str19 = fraction14.toProperString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction0.divideBy(fraction14);
        int int21 = fraction0.getDenominator();
        int int22 = fraction0.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -110, (int) (short) 120);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '#', 4, 52);
        long long4 = fraction3.longValue();
        int int5 = fraction3.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction10 = fraction7.divideBy(fraction9);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.reduce();
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.abs();
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.divideBy(fraction15);
        java.lang.String str17 = fraction15.toProperString();
        org.apache.commons.lang.math.Fraction fraction18 = fraction3.multiplyBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        float float21 = fraction19.floatValue();
        java.lang.String str22 = fraction19.toString();
        long long23 = fraction19.longValue();
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction19.add(fraction24);
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction28 = fraction19.add(fraction27);
        org.apache.commons.lang.math.Fraction fraction29 = fraction19.reduce();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = fraction31.invert();
        org.apache.commons.lang.math.Fraction fraction36 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int37 = fraction36.intValue();
        double double38 = fraction36.doubleValue();
        boolean boolean39 = fraction33.equals((java.lang.Object) fraction36);
        int int40 = fraction19.compareTo((java.lang.Object) fraction33);
        boolean boolean41 = fraction18.equals((java.lang.Object) fraction19);
        org.apache.commons.lang.math.Fraction fraction42 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int43 = fraction42.intValue();
        float float44 = fraction42.floatValue();
        java.lang.String str45 = fraction42.toString();
        long long46 = fraction42.longValue();
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int48 = fraction47.intValue();
        org.apache.commons.lang.math.Fraction fraction49 = fraction42.add(fraction47);
        int int50 = fraction42.getDenominator();
        org.apache.commons.lang.math.Fraction fraction52 = org.apache.commons.lang.math.Fraction.getFraction((double) 0.4f);
        boolean boolean53 = fraction42.equals((java.lang.Object) fraction52);
        int int54 = fraction52.getProperNumerator();
        int int55 = fraction52.getNumerator();
        int int56 = fraction52.getNumerator();
        org.apache.commons.lang.math.Fraction fraction57 = fraction19.divideBy(fraction52);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.4f + "'", float21 == 0.4f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2/5" + "'", str22, "2/5");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.4f + "'", float44 == 0.4f);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2/5" + "'", str45, "2/5");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(fraction57);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(1718, (int) (byte) 40, (int) (byte) 8);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 1, 1002);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.ZERO;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction11.subtract(fraction16);
        int int19 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction20 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.negate();
        boolean boolean22 = fraction11.equals((java.lang.Object) fraction21);
        int int23 = fraction11.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction7.add(fraction11);
        org.apache.commons.lang.math.Fraction fraction25 = fraction5.multiplyBy(fraction24);
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.negate();
        org.apache.commons.lang.math.Fraction fraction27 = fraction4.add(fraction26);
        org.apache.commons.lang.math.Fraction fraction28 = fraction2.multiplyBy(fraction26);
        int int29 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1002 + "'", int29 == 1002);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 120);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120L + "'", long2 == 120L);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.pow(0);
        java.lang.String str4 = fraction3.toProperString();
        int int5 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(110, (int) (short) 9, 1002);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -66, 93, 679);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(4, 5);
        java.lang.String str3 = fraction2.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction(100, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) '#');
        int int18 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction19 = fraction14.divideBy(fraction17);
        org.apache.commons.lang.math.Fraction fraction20 = fraction10.subtract(fraction17);
        org.apache.commons.lang.math.Fraction fraction21 = fraction20.negate();
        org.apache.commons.lang.math.Fraction fraction22 = fraction6.subtract(fraction21);
        boolean boolean23 = fraction2.equals((java.lang.Object) fraction22);
        int int24 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction25 = fraction2.negate();
        int int26 = fraction25.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4/5" + "'", str3, "4/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
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
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
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
        int int34 = fraction22.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction35 = fraction18.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int38 = fraction35.compareTo((java.lang.Object) fraction37);
        int int39 = fraction35.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction40 = fraction17.multiplyBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction(6, (int) 'a', 6);
        org.apache.commons.lang.math.Fraction fraction45 = fraction44.negate();
        org.apache.commons.lang.math.Fraction fraction46 = fraction17.subtract(fraction44);
        org.apache.commons.lang.math.Fraction fraction47 = fraction17.reduce();
        int int48 = fraction17.getProperNumerator();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 17 + "'", int39 == 17);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 4);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(2491, 4);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction9 = fraction8.invert();
        int int10 = fraction9.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int12 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.reduce();
        float float14 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction9.multiplyBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.divideBy(fraction9);
        org.apache.commons.lang.math.Fraction fraction17 = fraction3.subtract(fraction16);
        byte byte18 = fraction16.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 52 + "'", byte18 == (byte) 52);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 20, 22540);
        int int3 = fraction2.intValue();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.negate();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.pow((-1));
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction15 = fraction14.reduce();
        org.apache.commons.lang.math.Fraction fraction16 = fraction10.multiplyBy(fraction15);
        double double17 = fraction16.doubleValue();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        long long23 = fraction22.longValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction22.invert();
        float float25 = fraction22.floatValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction22.negate();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.pow((int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction29 = fraction16.subtract(fraction26);
        org.apache.commons.lang.math.Fraction fraction30 = fraction2.subtract(fraction16);
        double double31 = fraction16.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-330.0d) + "'", double17 == (-330.0d));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-330.0d) + "'", double31 == (-330.0d));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        int int7 = fraction5.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction8 = fraction5.abs();
        org.apache.commons.lang.math.Fraction fraction9 = fraction3.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction10 = fraction5.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) -112, (int) (short) 33);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(23, 7);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, 20);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction5.getNumerator();
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
        org.apache.commons.lang.math.Fraction fraction23 = fraction5.multiplyBy(fraction22);
        org.apache.commons.lang.math.Fraction fraction25 = fraction5.pow((int) (short) -10);
        org.apache.commons.lang.math.Fraction fraction26 = fraction5.abs();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.pow(0);
        int int29 = fraction2.compareTo((java.lang.Object) fraction26);
        java.lang.Class<?> wildcardClass30 = fraction2.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
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
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) -112, (-110));
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 100);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int9 = fraction8.intValue();
        double double10 = fraction8.doubleValue();
        float float11 = fraction8.floatValue();
        int int12 = fraction8.getProperNumerator();
        boolean boolean13 = fraction5.equals((java.lang.Object) int12);
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        float float16 = fraction14.floatValue();
        java.lang.String str17 = fraction14.toString();
        long long18 = fraction14.longValue();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction14.add(fraction19);
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.abs();
        org.apache.commons.lang.math.Fraction fraction23 = fraction5.multiplyBy(fraction22);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        org.apache.commons.lang.math.Fraction fraction27 = fraction25.invert();
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int29 = fraction28.intValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang.math.Fraction fraction33 = fraction28.add(fraction31);
        int int34 = fraction25.compareTo((java.lang.Object) fraction28);
        long long35 = fraction28.longValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction28.invert();
        int int37 = fraction36.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int41 = fraction40.intValue();
        double double42 = fraction40.doubleValue();
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.intValue();
        org.apache.commons.lang.math.Fraction fraction46 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int47 = fraction46.intValue();
        float float48 = fraction46.floatValue();
        java.lang.String str49 = fraction46.toString();
        org.apache.commons.lang.math.Fraction fraction50 = fraction44.subtract(fraction46);
        java.lang.String str51 = fraction46.toProperString();
        org.apache.commons.lang.math.Fraction fraction52 = fraction46.invert();
        org.apache.commons.lang.math.Fraction fraction53 = fraction40.divideBy(fraction52);
        org.apache.commons.lang.math.Fraction fraction54 = fraction36.subtract(fraction40);
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int56 = fraction55.intValue();
        float float57 = fraction55.floatValue();
        org.apache.commons.lang.math.Fraction fraction58 = fraction40.add(fraction55);
        org.apache.commons.lang.math.Fraction fraction59 = fraction40.abs();
        org.apache.commons.lang.math.Fraction fraction60 = fraction40.abs();
        org.apache.commons.lang.math.Fraction fraction61 = fraction60.abs();
        int int62 = fraction61.getNumerator();
        org.apache.commons.lang.math.Fraction fraction63 = fraction61.reduce();
        org.apache.commons.lang.math.Fraction fraction64 = fraction5.add(fraction63);
        long long65 = fraction5.longValue();
        org.apache.commons.lang.math.Fraction fraction66 = fraction2.divideBy(fraction5);
        int int67 = fraction5.getProperWhole();
        java.lang.String str68 = fraction5.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.4f + "'", float16 == 0.4f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2/5" + "'", str17, "2/5");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.4f + "'", float48 == 0.4f);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2/5" + "'", str49, "2/5");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2/5" + "'", str51, "2/5");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.4f + "'", float57 == 0.4f);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1/100" + "'", str68, "1/100");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -1, (-20));
        int int3 = fraction2.getProperNumerator();
        long long4 = fraction2.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 180, 1674, (int) (byte) -66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.reduce();
        float float3 = fraction1.floatValue();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction("-10/1");
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1L));
        org.apache.commons.lang.math.Fraction fraction8 = fraction5.divideBy(fraction7);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.reduce();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.abs();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.reduce();
        org.apache.commons.lang.math.Fraction fraction14 = fraction7.divideBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        org.apache.commons.lang.math.Fraction fraction17 = fraction16.negate();
        org.apache.commons.lang.math.Fraction fraction18 = fraction7.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction20 = fraction7.pow(100);
        org.apache.commons.lang.math.Fraction fraction21 = fraction1.add(fraction7);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("1");
        float float2 = fraction1.floatValue();
        long long3 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (short) 0, (int) (short) 100);
        long long4 = fraction3.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction16 = fraction6.divideBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.pow(18);
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
        org.apache.commons.lang.math.Fraction fraction51 = fraction33.subtract(fraction49);
        boolean boolean52 = fraction16.equals((java.lang.Object) fraction51);
        org.apache.commons.lang.math.Fraction fraction53 = fraction3.add(fraction16);
        int int54 = fraction16.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
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
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction7 = fraction4.multiplyBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        int int9 = fraction8.getNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.negate();
        int int11 = fraction10.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-99), 120);
        int int3 = fraction2.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-32), (int) (byte) 3);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 4, (int) (short) 5, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction7 = fraction6.reduce();
        org.apache.commons.lang.math.Fraction fraction8 = fraction2.add(fraction7);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.invert();
        boolean boolean11 = fraction8.equals((java.lang.Object) fraction9);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        java.lang.String str17 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.reduce();
        org.apache.commons.lang.math.Fraction fraction19 = fraction9.add(fraction16);
        org.apache.commons.lang.math.Fraction fraction20 = fraction19.reduce();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.intValue();
        int int2 = fraction0.getDenominator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int6 = fraction5.getDenominator();
        org.apache.commons.lang.math.Fraction fraction7 = fraction0.divideBy(fraction5);
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        int int10 = fraction7.compareTo((java.lang.Object) fraction8);
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction("10/1");
        org.apache.commons.lang.math.Fraction fraction13 = fraction8.multiplyBy(fraction12);
        int int14 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 1, 217);
        org.apache.commons.lang.math.Fraction fraction18 = fraction8.add(fraction17);
        short short19 = fraction17.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        long long16 = fraction10.longValue();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-10L) + "'", long16 == (-10L));
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) -1, (int) (byte) 100, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-2), (-66));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) 'a', 20);
        org.apache.commons.lang.math.Fraction fraction3 = fraction2.reduce();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int5 = fraction4.getProperNumerator();
        int int6 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.invert();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = fraction11.add(fraction14);
        int int17 = fraction8.compareTo((java.lang.Object) fraction11);
        int int18 = fraction11.getDenominator();
        org.apache.commons.lang.math.Fraction fraction19 = fraction4.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction20 = fraction4.negate();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) 1);
        float float24 = fraction23.floatValue();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int26 = fraction25.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        int int28 = fraction25.compareTo((java.lang.Object) fraction27);
        org.apache.commons.lang.math.Fraction fraction29 = fraction23.add(fraction27);
        org.apache.commons.lang.math.Fraction fraction30 = fraction20.divideBy(fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang.math.Fraction fraction34 = fraction31.multiplyBy(fraction33);
        org.apache.commons.lang.math.Fraction fraction35 = fraction34.negate();
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.abs();
        org.apache.commons.lang.math.Fraction fraction37 = fraction20.subtract(fraction35);
        org.apache.commons.lang.math.Fraction fraction38 = fraction3.multiplyBy(fraction37);
        org.apache.commons.lang.math.Fraction fraction39 = fraction38.invert();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.negate();
        java.lang.String str42 = fraction40.toProperString();
        java.lang.String str43 = fraction40.toString();
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int46 = fraction45.getNumerator();
        org.apache.commons.lang.math.Fraction fraction48 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang.math.Fraction fraction50 = fraction48.invert();
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang.math.Fraction fraction52 = fraction45.divideBy(fraction48);
        org.apache.commons.lang.math.Fraction fraction54 = fraction52.pow((int) (short) -1);
        int int55 = fraction54.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction57 = fraction54.pow((int) (byte) -110);
        boolean boolean58 = fraction40.equals((java.lang.Object) fraction54);
        org.apache.commons.lang.math.Fraction fraction59 = fraction40.negate();
        int int60 = fraction39.compareTo((java.lang.Object) fraction59);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 3.0f + "'", float24 == 3.0f);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0/1" + "'", str43, "0/1");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(13231, 133);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-1), 10, 110);
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        int int7 = fraction5.intValue();
        double double8 = fraction5.doubleValue();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((int) '4', (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction("10");
        org.apache.commons.lang.math.Fraction fraction14 = fraction13.invert();
        int int15 = fraction14.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int17 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.reduce();
        float float19 = fraction16.floatValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction14.multiplyBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.divideBy(fraction14);
        org.apache.commons.lang.math.Fraction fraction22 = fraction5.divideBy(fraction21);
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        int int25 = fraction24.getDenominator();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang.math.Fraction fraction29 = fraction27.invert();
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang.math.Fraction fraction31 = fraction29.negate();
        org.apache.commons.lang.math.Fraction fraction32 = fraction24.multiplyBy(fraction31);
        org.apache.commons.lang.math.Fraction fraction35 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.abs();
        int int37 = fraction35.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int41 = fraction40.intValue();
        double double42 = fraction40.doubleValue();
        float float43 = fraction40.floatValue();
        org.apache.commons.lang.math.Fraction fraction44 = fraction35.multiplyBy(fraction40);
        org.apache.commons.lang.math.Fraction fraction45 = fraction32.multiplyBy(fraction44);
        org.apache.commons.lang.math.Fraction fraction46 = fraction21.multiplyBy(fraction32);
        int int47 = fraction32.getNumerator();
        org.apache.commons.lang.math.Fraction fraction48 = fraction3.add(fraction32);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-10) + "'", int37 == (-10));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-10) + "'", int47 == (-10));
        org.junit.Assert.assertNotNull(fraction48);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("1/10");
        int int2 = fraction1.getProperWhole();
        int int3 = fraction1.intValue();
        int int4 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.invert();
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang.math.Fraction fraction13 = fraction8.divideBy(fraction11);
        org.apache.commons.lang.math.Fraction fraction14 = fraction11.negate();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction17 = fraction11.subtract(fraction16);
        int int18 = fraction6.compareTo((java.lang.Object) fraction11);
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction23 = fraction21.invert();
        org.apache.commons.lang.math.Fraction fraction24 = fraction23.invert();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction30 = fraction23.subtract(fraction28);
        int int31 = fraction23.getDenominator();
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.negate();
        boolean boolean34 = fraction23.equals((java.lang.Object) fraction33);
        int int35 = fraction23.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction36 = fraction19.add(fraction23);
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.getFraction("3/5");
        int int39 = fraction36.compareTo((java.lang.Object) fraction38);
        org.apache.commons.lang.math.Fraction fraction40 = fraction36.invert();
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.negate();
        org.apache.commons.lang.math.Fraction fraction42 = fraction6.divideBy(fraction40);
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction46 = fraction45.invert();
        float float47 = fraction45.floatValue();
        org.apache.commons.lang.math.Fraction fraction48 = fraction45.abs();
        org.apache.commons.lang.math.Fraction fraction49 = fraction42.subtract(fraction45);
        java.lang.String str50 = fraction42.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-10.0f) + "'", float47 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-17/200" + "'", str50, "-17/200");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        int int34 = fraction17.getDenominator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction36 = fraction17.pow((int) (short) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 35, (int) (byte) 5, (int) (byte) 2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getDenominator();
        java.lang.String str2 = fraction0.toString();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang.math.Fraction fraction6 = fraction3.pow(0);
        int int7 = fraction6.intValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = fraction10.add(fraction13);
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang.math.Fraction fraction17 = fraction0.divideBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.abs();
        int int19 = fraction18.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long23 = fraction22.longValue();
        int int24 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction25 = fraction22.invert();
        org.apache.commons.lang.math.Fraction fraction26 = fraction25.reduce();
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        int int30 = fraction29.getDenominator();
        org.apache.commons.lang.math.Fraction fraction31 = fraction25.subtract(fraction29);
        org.apache.commons.lang.math.Fraction fraction32 = fraction18.divideBy(fraction25);
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        float float35 = fraction33.floatValue();
        java.lang.String str36 = fraction33.toString();
        long long37 = fraction33.longValue();
        org.apache.commons.lang.math.Fraction fraction38 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int39 = fraction38.intValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction33.add(fraction38);
        org.apache.commons.lang.math.Fraction fraction41 = fraction40.reduce();
        org.apache.commons.lang.math.Fraction fraction42 = fraction40.invert();
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction46 = fraction45.abs();
        org.apache.commons.lang.math.Fraction fraction47 = fraction46.negate();
        org.apache.commons.lang.math.Fraction fraction48 = fraction42.divideBy(fraction47);
        float float49 = fraction48.floatValue();
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int51 = fraction50.getDenominator();
        java.lang.String str52 = fraction50.toString();
        java.lang.String str53 = fraction50.toProperString();
        int int54 = fraction50.getDenominator();
        org.apache.commons.lang.math.Fraction fraction55 = fraction48.multiplyBy(fraction50);
        org.apache.commons.lang.math.Fraction fraction56 = fraction18.divideBy(fraction48);
        java.lang.String str57 = fraction18.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4/5" + "'", str2, "4/5");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-10L) + "'", long23 == (-10L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
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
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-0.125f) + "'", float49 == (-0.125f));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4/5" + "'", str52, "4/5");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "4/5" + "'", str53, "4/5");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10/1" + "'", str57, "10/1");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("165/1");
        double double2 = fraction1.doubleValue();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction("-14/205");
        org.apache.commons.lang.math.Fraction fraction5 = fraction1.subtract(fraction4);
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.invert();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 165.0d + "'", double2 == 165.0d);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-33), 0, (int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.reduce();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int7 = fraction6.intValue();
        float float8 = fraction6.floatValue();
        java.lang.String str9 = fraction6.toString();
        org.apache.commons.lang.math.Fraction fraction10 = fraction4.subtract(fraction6);
        int int11 = fraction0.compareTo((java.lang.Object) fraction10);
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.reduce();
        int int13 = fraction12.getNumerator();
        int int14 = fraction12.getDenominator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction("-110/1");
        org.apache.commons.lang.math.Fraction fraction17 = fraction12.multiplyBy(fraction16);
        double double18 = fraction12.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.4f + "'", float8 == 0.4f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2/5" + "'", str9, "2/5");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.6d + "'", double18 == 9.6d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction6.getDenominator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang.math.Fraction fraction13 = fraction8.add(fraction11);
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang.math.Fraction fraction15 = fraction11.invert();
        org.apache.commons.lang.math.Fraction fraction18 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction19 = fraction18.invert();
        float float20 = fraction18.floatValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.subtract(fraction18);
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 100);
        org.apache.commons.lang.math.Fraction fraction25 = fraction24.reduce();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        float float28 = fraction26.floatValue();
        java.lang.String str29 = fraction26.toString();
        long long30 = fraction26.longValue();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        org.apache.commons.lang.math.Fraction fraction33 = fraction26.add(fraction31);
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction35 = fraction26.add(fraction34);
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang.math.Fraction fraction42 = fraction37.add(fraction40);
        int int43 = fraction42.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction47 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.intValue();
        org.apache.commons.lang.math.Fraction fraction52 = fraction50.invert();
        java.lang.String str53 = fraction50.toProperString();
        org.apache.commons.lang.math.Fraction fraction54 = fraction47.divideBy(fraction50);
        org.apache.commons.lang.math.Fraction fraction55 = fraction45.add(fraction47);
        org.apache.commons.lang.math.Fraction fraction56 = fraction42.add(fraction45);
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int58 = fraction57.intValue();
        float float59 = fraction57.floatValue();
        java.lang.String str60 = fraction57.toString();
        long long61 = fraction57.longValue();
        org.apache.commons.lang.math.Fraction fraction62 = fraction57.negate();
        org.apache.commons.lang.math.Fraction fraction63 = fraction42.multiplyBy(fraction57);
        org.apache.commons.lang.math.Fraction fraction64 = fraction35.multiplyBy(fraction57);
        org.apache.commons.lang.math.Fraction fraction65 = fraction24.multiplyBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction66 = fraction15.subtract(fraction35);
        org.apache.commons.lang.math.Fraction fraction67 = fraction6.multiplyBy(fraction66);
        java.lang.Class<?> wildcardClass68 = fraction6.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-10.0f) + "'", float20 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.4f + "'", float28 == 0.4f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18 + "'", int36 == 18);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10" + "'", str53, "10");
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.4f + "'", float59 == 0.4f);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2/5" + "'", str60, "2/5");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((int) 'a', 20, 110);
        org.apache.commons.lang.math.Fraction fraction4 = fraction3.abs();
        long long5 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction(0.25d);
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction14 = fraction7.subtract(fraction12);
        int int15 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = fraction2.add(fraction12);
        org.apache.commons.lang.math.Fraction fraction17 = fraction1.divideBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 100, (int) (short) 9, (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction22 = fraction17.divideBy(fraction21);
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction(0, 1);
        org.apache.commons.lang.math.Fraction fraction27 = fraction25.pow(0);
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.intValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction34.invert();
        java.lang.String str37 = fraction34.toProperString();
        org.apache.commons.lang.math.Fraction fraction38 = fraction31.divideBy(fraction34);
        org.apache.commons.lang.math.Fraction fraction39 = fraction29.add(fraction31);
        double double40 = fraction39.doubleValue();
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int42 = fraction41.intValue();
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang.math.Fraction fraction46 = fraction41.add(fraction44);
        java.lang.String str47 = fraction44.toProperString();
        java.lang.String str48 = fraction44.toProperString();
        org.apache.commons.lang.math.Fraction fraction49 = fraction39.add(fraction44);
        org.apache.commons.lang.math.Fraction fraction50 = fraction25.add(fraction39);
        org.apache.commons.lang.math.Fraction fraction51 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang.math.Fraction fraction56 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction57 = fraction51.subtract(fraction56);
        org.apache.commons.lang.math.Fraction fraction58 = fraction50.add(fraction56);
        org.apache.commons.lang.math.Fraction fraction59 = fraction17.multiplyBy(fraction50);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10" + "'", str37, "10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 110.0d + "'", double40 == 110.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10" + "'", str48, "10");
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        java.lang.String str2 = fraction1.toProperString();
        int int3 = fraction1.getProperNumerator();
        int int4 = fraction1.intValue();
        byte byte5 = fraction1.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 2 + "'", byte5 == (byte) 2);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
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
        int int20 = fraction17.getProperWhole();
        int int21 = fraction17.getProperWhole();
        int int22 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction23 = fraction17.abs();
        double double24 = fraction23.doubleValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction("52 10/32");
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang.math.Fraction fraction32 = fraction27.add(fraction30);
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang.math.Fraction fraction34 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction37 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction38 = fraction37.invert();
        float float39 = fraction37.floatValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction34.subtract(fraction37);
        int int41 = fraction37.getNumerator();
        int int42 = fraction37.getDenominator();
        org.apache.commons.lang.math.Fraction fraction43 = fraction37.abs();
        org.apache.commons.lang.math.Fraction fraction44 = fraction26.divideBy(fraction37);
        int int45 = fraction26.getDenominator();
        org.apache.commons.lang.math.Fraction fraction46 = org.apache.commons.lang.math.Fraction.ONE_QUARTER;
        int int47 = fraction46.intValue();
        org.apache.commons.lang.math.Fraction fraction48 = fraction46.invert();
        org.apache.commons.lang.math.Fraction fraction49 = fraction46.abs();
        org.apache.commons.lang.math.Fraction fraction53 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 100, (int) (short) 10, 10);
        org.apache.commons.lang.math.Fraction fraction54 = fraction46.multiplyBy(fraction53);
        double double55 = fraction46.doubleValue();
        org.apache.commons.lang.math.Fraction fraction58 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long59 = fraction58.longValue();
        org.apache.commons.lang.math.Fraction fraction61 = fraction58.pow(1);
        org.apache.commons.lang.math.Fraction fraction62 = fraction46.subtract(fraction61);
        org.apache.commons.lang.math.Fraction fraction63 = fraction26.multiplyBy(fraction62);
        int int64 = fraction63.intValue();
        org.apache.commons.lang.math.Fraction fraction65 = fraction23.divideBy(fraction63);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-10.0f) + "'", float39 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-10) + "'", int41 == (-10));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.25d + "'", double55 == 0.25d);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-10L) + "'", long59 == (-10L));
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 536 + "'", int64 == 536);
        org.junit.Assert.assertNotNull(fraction65);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("4/1");
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = fraction3.add(fraction6);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction16.invert();
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction13.divideBy(fraction16);
        org.apache.commons.lang.math.Fraction fraction21 = fraction11.add(fraction13);
        org.apache.commons.lang.math.Fraction fraction22 = fraction8.add(fraction11);
        org.apache.commons.lang.math.Fraction fraction23 = fraction1.add(fraction11);
        int int24 = fraction11.getNumerator();
        java.lang.Class<?> wildcardClass25 = fraction11.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("3/2");
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction6 = fraction4.negate();
        int int7 = fraction1.compareTo((java.lang.Object) fraction6);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.abs();
        int int12 = fraction10.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang.math.Fraction fraction24 = fraction23.invert();
        float float25 = fraction23.floatValue();
        org.apache.commons.lang.math.Fraction fraction26 = fraction20.subtract(fraction23);
        int int27 = fraction23.getNumerator();
        int int28 = fraction10.compareTo((java.lang.Object) fraction23);
        org.apache.commons.lang.math.Fraction fraction29 = fraction1.divideBy(fraction10);
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        float float34 = fraction32.floatValue();
        java.lang.String str35 = fraction32.toString();
        long long36 = fraction32.longValue();
        int int37 = fraction30.compareTo((java.lang.Object) fraction32);
        org.apache.commons.lang.math.Fraction fraction38 = fraction30.reduce();
        org.apache.commons.lang.math.Fraction fraction39 = fraction30.abs();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int41 = fraction40.intValue();
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang.math.Fraction fraction45 = fraction40.add(fraction43);
        java.lang.String str46 = fraction43.toProperString();
        double double47 = fraction43.doubleValue();
        long long48 = fraction43.longValue();
        org.apache.commons.lang.math.Fraction fraction49 = fraction30.divideBy(fraction43);
        org.apache.commons.lang.math.Fraction fraction50 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction56 = fraction50.subtract(fraction55);
        int int57 = fraction50.getProperNumerator();
        float float58 = fraction50.floatValue();
        boolean boolean59 = fraction30.equals((java.lang.Object) float58);
        org.apache.commons.lang.math.Fraction fraction61 = org.apache.commons.lang.math.Fraction.getFraction((double) 165);
        int int62 = fraction61.getNumerator();
        org.apache.commons.lang.math.Fraction fraction63 = fraction30.divideBy(fraction61);
        org.apache.commons.lang.math.Fraction fraction64 = fraction63.negate();
        int int65 = fraction29.compareTo((java.lang.Object) fraction63);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-10.0f) + "'", float25 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.4f + "'", float34 == 0.4f);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2/5" + "'", str35, "2/5");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 165 + "'", int62 == 165);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.negate();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.invert();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction12 = fraction11.invert();
        long long13 = fraction12.longValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction5.add(fraction12);
        org.apache.commons.lang.math.Fraction fraction15 = fraction3.subtract(fraction12);
        int int16 = fraction15.getProperWhole();
        int int17 = fraction15.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-11) + "'", int16 == (-11));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-11) + "'", int17 == (-11));
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-19683), (int) (short) 165);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        int int20 = fraction17.getProperWhole();
        int int21 = fraction17.getProperWhole();
        int int22 = fraction17.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction23 = fraction17.abs();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        int int27 = fraction25.intValue();
        double double28 = fraction25.doubleValue();
        int int29 = fraction23.compareTo((java.lang.Object) fraction25);
        org.apache.commons.lang.math.Fraction fraction30 = fraction23.negate();
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.abs();
        org.apache.commons.lang.math.Fraction fraction32 = fraction30.abs();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.ONE;
        int int34 = fraction33.getProperWhole();
        int int35 = fraction33.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction36 = fraction33.negate();
        double double37 = fraction33.doubleValue();
        int int38 = fraction33.getNumerator();
        org.apache.commons.lang.math.Fraction fraction39 = fraction30.subtract(fraction33);
        org.apache.commons.lang.math.Fraction fraction40 = fraction33.invert();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) (-11));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
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
        int int26 = fraction24.getProperNumerator();
        long long27 = fraction24.longValue();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction(3, (int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.abs();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 110, 6);
        org.apache.commons.lang.math.Fraction fraction35 = fraction30.multiplyBy(fraction34);
        org.apache.commons.lang.math.Fraction fraction36 = fraction24.add(fraction34);
        double double37 = fraction36.doubleValue();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 17.333333333333332d + "'", double37 == 17.333333333333332d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
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
        float float20 = fraction2.floatValue();
        long long21 = fraction2.longValue();
        long long22 = fraction2.longValue();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-10.0f) + "'", float20 == (-10.0f));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-10L) + "'", long21 == (-10L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-10L) + "'", long22 == (-10L));
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
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
        float float24 = fraction11.floatValue();
        org.apache.commons.lang.math.Fraction fraction27 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) '4', 3);
        boolean boolean28 = fraction11.equals((java.lang.Object) 3);
        int int29 = fraction11.getDenominator();
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 110.0f + "'", float24 == 110.0f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(1681, (-143));
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.755245f) + "'", float3 == (-11.755245f));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE_HALF;
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction3 = fraction0.multiplyBy(fraction2);
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.pow((int) (byte) 10);
        org.apache.commons.lang.math.Fraction fraction6 = fraction2.reduce();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int8 = fraction7.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction19 = fraction12.subtract(fraction17);
        int int20 = fraction17.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction7.add(fraction17);
        java.lang.String str22 = fraction21.toString();
        org.apache.commons.lang.math.Fraction fraction24 = fraction21.pow(4);
        org.apache.commons.lang.math.Fraction fraction25 = fraction2.add(fraction21);
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getFraction((-66), 4, 110);
        org.apache.commons.lang.math.Fraction fraction30 = fraction25.subtract(fraction29);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "7/10" + "'", str22, "7/10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 4L);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction4 = fraction1.invert();
        float float5 = fraction4.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.25f + "'", float5 == 0.25f);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(10, (int) (byte) -1);
        long long3 = fraction2.longValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction((double) 1);
        org.apache.commons.lang.math.Fraction fraction7 = fraction2.subtract(fraction6);
        org.apache.commons.lang.math.Fraction fraction8 = fraction6.abs();
        org.apache.commons.lang.math.Fraction fraction10 = fraction8.pow(99);
        org.apache.commons.lang.math.Fraction fraction11 = fraction10.reduce();
        int int12 = fraction11.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) -25, (int) (short) 100);
        float float3 = fraction2.floatValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.25f) + "'", float3 == (-0.25f));
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        long long2 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getFraction(100, 2, (int) (short) 10);
        double double7 = fraction6.doubleValue();
        org.apache.commons.lang.math.Fraction fraction8 = fraction0.divideBy(fraction6);
        org.apache.commons.lang.math.Fraction fraction9 = fraction6.invert();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.2d + "'", double7 == 100.2d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(109, 1674);
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        double double6 = fraction4.doubleValue();
        int int7 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.intValue();
        org.apache.commons.lang.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang.math.Fraction fraction15 = fraction13.invert();
        org.apache.commons.lang.math.Fraction fraction16 = fraction15.invert();
        long long17 = fraction16.longValue();
        org.apache.commons.lang.math.Fraction fraction18 = fraction9.add(fraction16);
        int int19 = fraction16.getDenominator();
        org.apache.commons.lang.math.Fraction fraction20 = fraction4.add(fraction16);
        float float21 = fraction16.floatValue();
        int int22 = fraction16.getProperWhole();
        int int23 = fraction16.getProperNumerator();
        int int24 = fraction16.getNumerator();
        org.apache.commons.lang.math.Fraction fraction25 = fraction2.multiplyBy(fraction16);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((-15), (int) (byte) -82, 600);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (byte) -1, (-20));
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.invert();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        org.apache.commons.lang.math.Fraction fraction5 = fraction0.negate();
        int int6 = fraction5.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.abs();
        int int8 = fraction7.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        java.lang.String str5 = fraction1.toString();
        java.lang.String str6 = fraction1.toProperString();
        int int7 = fraction1.getProperNumerator();
        int int8 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction11 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int12 = fraction11.intValue();
        double double13 = fraction11.doubleValue();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        float float19 = fraction17.floatValue();
        java.lang.String str20 = fraction17.toString();
        org.apache.commons.lang.math.Fraction fraction21 = fraction15.subtract(fraction17);
        java.lang.String str22 = fraction17.toProperString();
        org.apache.commons.lang.math.Fraction fraction23 = fraction17.invert();
        org.apache.commons.lang.math.Fraction fraction24 = fraction11.divideBy(fraction23);
        double double25 = fraction11.doubleValue();
        int int26 = fraction11.intValue();
        int int27 = fraction1.compareTo((java.lang.Object) fraction11);
        org.apache.commons.lang.math.Fraction fraction29 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.getNumerator();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.intValue();
        org.apache.commons.lang.math.Fraction fraction36 = fraction34.invert();
        java.lang.String str37 = fraction34.toProperString();
        org.apache.commons.lang.math.Fraction fraction38 = fraction31.divideBy(fraction34);
        org.apache.commons.lang.math.Fraction fraction39 = fraction29.add(fraction31);
        double double40 = fraction39.doubleValue();
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int42 = fraction41.intValue();
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang.math.Fraction fraction46 = fraction41.add(fraction44);
        java.lang.String str47 = fraction44.toProperString();
        java.lang.String str48 = fraction44.toProperString();
        org.apache.commons.lang.math.Fraction fraction49 = fraction39.add(fraction44);
        org.apache.commons.lang.math.Fraction fraction50 = fraction49.negate();
        int int51 = fraction49.getNumerator();
        org.apache.commons.lang.math.Fraction fraction52 = fraction11.subtract(fraction49);
        org.apache.commons.lang.math.Fraction fraction54 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int55 = fraction54.intValue();
        org.apache.commons.lang.math.Fraction fraction56 = fraction54.invert();
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int58 = fraction57.intValue();
        org.apache.commons.lang.math.Fraction fraction60 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int61 = fraction60.getNumerator();
        org.apache.commons.lang.math.Fraction fraction62 = fraction57.add(fraction60);
        int int63 = fraction54.compareTo((java.lang.Object) fraction57);
        int int64 = fraction57.getDenominator();
        int int65 = fraction57.intValue();
        org.apache.commons.lang.math.Fraction fraction67 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int68 = fraction67.getNumerator();
        org.apache.commons.lang.math.Fraction fraction70 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int71 = fraction70.intValue();
        org.apache.commons.lang.math.Fraction fraction72 = fraction70.invert();
        java.lang.String str73 = fraction70.toProperString();
        org.apache.commons.lang.math.Fraction fraction74 = fraction67.divideBy(fraction70);
        org.apache.commons.lang.math.Fraction fraction76 = fraction74.pow((int) (short) -1);
        org.apache.commons.lang.math.Fraction fraction77 = fraction57.add(fraction76);
        boolean boolean78 = fraction11.equals((java.lang.Object) fraction77);
        short short79 = fraction77.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.4f + "'", float19 == 0.4f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2/5" + "'", str22, "2/5");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "10" + "'", str37, "10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 110.0d + "'", double40 == 110.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10" + "'", str48, "10");
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 120 + "'", int51 == 120);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 5 + "'", int64 == 5);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "10" + "'", str73, "10");
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 1 + "'", short79 == (short) 1);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction("-34 1/2");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        java.lang.String str4 = fraction3.toProperString();
        org.apache.commons.lang.math.Fraction fraction5 = fraction3.reduce();
        int int6 = fraction3.getProperWhole();
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.lang.math.Fraction fraction8 = fraction1.multiplyBy(fraction3);
        float float9 = fraction8.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100/1" + "'", str7, "100/1");
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-3450.0f) + "'", float9 == (-3450.0f));
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 165);
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
        org.apache.commons.lang.math.Fraction fraction20 = fraction1.subtract(fraction19);
        int int21 = fraction1.intValue();
        int int22 = fraction1.getNumerator();
        org.apache.commons.lang.math.Fraction fraction25 = org.apache.commons.lang.math.Fraction.getFraction((int) (short) 0, 33);
        org.apache.commons.lang.math.Fraction fraction26 = fraction1.multiplyBy(fraction25);
        int int27 = fraction26.getDenominator();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 165 + "'", int21 == 165);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 165 + "'", int22 == 165);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
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
        org.apache.commons.lang.math.Fraction fraction10 = fraction9.abs();
        int int11 = fraction10.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction13 = org.apache.commons.lang.math.Fraction.getFraction((double) (-1));
        int int14 = fraction13.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.TWO_THIRDS;
        long long16 = fraction15.longValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.reduce();
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.subtract(fraction15);
        org.apache.commons.lang.math.Fraction fraction19 = fraction10.multiplyBy(fraction13);
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.intValue();
        double double23 = fraction21.doubleValue();
        int int24 = fraction21.intValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction30 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction33 = fraction32.invert();
        long long34 = fraction33.longValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction26.add(fraction33);
        int int36 = fraction33.getDenominator();
        org.apache.commons.lang.math.Fraction fraction37 = fraction21.add(fraction33);
        java.lang.String str38 = fraction33.toProperString();
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.getReducedFraction(110, (int) (byte) 1);
        org.apache.commons.lang.math.Fraction fraction42 = fraction33.subtract(fraction41);
        double double43 = fraction41.doubleValue();
        double double44 = fraction41.doubleValue();
        org.apache.commons.lang.math.Fraction fraction45 = fraction41.reduce();
        int int46 = fraction10.compareTo((java.lang.Object) fraction41);
        int int47 = fraction10.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 110.0d + "'", double43 == 110.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 110.0d + "'", double44 == 110.0d);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
        int int19 = fraction13.getDenominator();
        short short20 = fraction13.shortValue();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        int int15 = fraction12.getDenominator();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 0.01f);
        org.apache.commons.lang.math.Fraction fraction2 = fraction1.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.ONE_FIFTH;
        boolean boolean8 = fraction0.equals((java.lang.Object) fraction7);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.FOUR_FIFTHS;
        int int10 = fraction9.getDenominator();
        java.lang.String str11 = fraction9.toString();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        org.apache.commons.lang.math.Fraction fraction15 = fraction12.pow(0);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction9.divideBy(fraction15);
        org.apache.commons.lang.math.Fraction fraction18 = fraction9.invert();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction19.add(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction26 = fraction9.divideBy(fraction22);
        double double27 = fraction9.doubleValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction7.add(fraction9);
        org.apache.commons.lang.math.Fraction fraction30 = fraction28.pow((int) (short) 100);
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction32 = fraction31.invert();
        org.apache.commons.lang.math.Fraction fraction36 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction37 = fraction31.subtract(fraction36);
        double double38 = fraction36.doubleValue();
        long long39 = fraction36.longValue();
        org.apache.commons.lang.math.Fraction fraction40 = fraction36.reduce();
        org.apache.commons.lang.math.Fraction fraction41 = fraction30.divideBy(fraction40);
        double double42 = fraction41.doubleValue();
        java.lang.Class<?> wildcardClass43 = fraction41.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4/5" + "'", str11, "4/5");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.8d + "'", double27 == 0.8d);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 33.0d + "'", double38 == 33.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 33L + "'", long39 == 33L);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.030303030303030304d + "'", double42 == 0.030303030303030304d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(6, (int) 'a', 6);
        int int4 = fraction3.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction3.abs();
        double double6 = fraction5.doubleValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.166666666666668d + "'", double6 == 22.166666666666668d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        org.apache.commons.lang.math.Fraction fraction15 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang.math.Fraction fraction17 = fraction15.invert();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang.math.Fraction fraction22 = fraction21.invert();
        long long23 = fraction22.longValue();
        org.apache.commons.lang.math.Fraction fraction24 = fraction15.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction25 = fraction10.divideBy(fraction24);
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction27 = fraction26.invert();
        org.apache.commons.lang.math.Fraction fraction31 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction32 = fraction26.subtract(fraction31);
        boolean boolean34 = fraction31.equals((java.lang.Object) 3);
        java.lang.String str35 = fraction31.toString();
        org.apache.commons.lang.math.Fraction fraction36 = fraction25.subtract(fraction31);
        org.apache.commons.lang.math.Fraction fraction37 = fraction25.reduce();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "33/1" + "'", str35, "33/1");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction(23841, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang.math.Fraction fraction4 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang.math.Fraction fraction9 = fraction4.add(fraction7);
        int int10 = fraction1.compareTo((java.lang.Object) fraction4);
        org.apache.commons.lang.math.Fraction fraction11 = fraction1.negate();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction13 = fraction12.negate();
        java.lang.String str14 = fraction13.toProperString();
        int int15 = fraction13.getDenominator();
        org.apache.commons.lang.math.Fraction fraction17 = org.apache.commons.lang.math.Fraction.getFraction((double) (-0.1f));
        org.apache.commons.lang.math.Fraction fraction18 = fraction13.subtract(fraction17);
        float float19 = fraction17.floatValue();
        org.apache.commons.lang.math.Fraction fraction20 = fraction11.divideBy(fraction17);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.1f) + "'", float19 == (-0.1f));
        org.junit.Assert.assertNotNull(fraction20);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((int) (byte) 10, (int) (byte) -1);
        java.lang.String str3 = fraction2.toString();
        int int4 = fraction2.getNumerator();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.abs();
        org.apache.commons.lang.math.Fraction fraction7 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int10 = fraction9.getNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang.math.Fraction fraction14 = fraction12.invert();
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang.math.Fraction fraction16 = fraction9.divideBy(fraction12);
        org.apache.commons.lang.math.Fraction fraction17 = fraction7.add(fraction9);
        double double18 = fraction17.doubleValue();
        org.apache.commons.lang.math.Fraction fraction19 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang.math.Fraction fraction22 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang.math.Fraction fraction24 = fraction19.add(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        java.lang.String str26 = fraction22.toProperString();
        org.apache.commons.lang.math.Fraction fraction27 = fraction17.add(fraction22);
        org.apache.commons.lang.math.Fraction fraction29 = fraction17.pow((int) (short) 0);
        org.apache.commons.lang.math.Fraction fraction30 = fraction2.subtract(fraction29);
        org.apache.commons.lang.math.Fraction fraction31 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int33 = fraction32.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction34 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang.math.Fraction fraction35 = fraction34.invert();
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang.math.Fraction fraction37 = fraction32.divideBy(fraction35);
        org.apache.commons.lang.math.Fraction fraction38 = fraction35.negate();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction41 = fraction35.subtract(fraction40);
        org.apache.commons.lang.math.Fraction fraction43 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int46 = fraction45.getNumerator();
        org.apache.commons.lang.math.Fraction fraction48 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang.math.Fraction fraction50 = fraction48.invert();
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang.math.Fraction fraction52 = fraction45.divideBy(fraction48);
        org.apache.commons.lang.math.Fraction fraction53 = fraction43.add(fraction45);
        double double54 = fraction53.doubleValue();
        org.apache.commons.lang.math.Fraction fraction55 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int56 = fraction55.intValue();
        org.apache.commons.lang.math.Fraction fraction58 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int59 = fraction58.getNumerator();
        org.apache.commons.lang.math.Fraction fraction60 = fraction55.add(fraction58);
        java.lang.String str61 = fraction58.toProperString();
        java.lang.String str62 = fraction58.toProperString();
        org.apache.commons.lang.math.Fraction fraction63 = fraction53.add(fraction58);
        org.apache.commons.lang.math.Fraction fraction64 = fraction41.multiplyBy(fraction63);
        java.lang.String str65 = fraction41.toString();
        org.apache.commons.lang.math.Fraction fraction66 = fraction41.invert();
        int int67 = fraction31.compareTo((java.lang.Object) fraction41);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10/1" + "'", str3, "-10/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 110.0d + "'", double18 == 110.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 110.0d + "'", double54 == 110.0d);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "10" + "'", str61, "10");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "10" + "'", str62, "10");
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "5/3" + "'", str65, "5/3");
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction(100, (int) (short) 10);
        int int3 = fraction2.getDenominator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang.math.Fraction fraction5 = fraction2.invert();
        org.apache.commons.lang.math.Fraction fraction7 = fraction5.pow(3);
        org.apache.commons.lang.math.Fraction fraction10 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int11 = fraction10.intValue();
        double double12 = fraction10.doubleValue();
        org.apache.commons.lang.math.Fraction fraction14 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang.math.Fraction fraction16 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        float float18 = fraction16.floatValue();
        java.lang.String str19 = fraction16.toString();
        org.apache.commons.lang.math.Fraction fraction20 = fraction14.subtract(fraction16);
        java.lang.String str21 = fraction16.toProperString();
        org.apache.commons.lang.math.Fraction fraction22 = fraction16.invert();
        org.apache.commons.lang.math.Fraction fraction23 = fraction10.divideBy(fraction22);
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
        org.apache.commons.lang.math.Fraction fraction40 = fraction22.subtract(fraction38);
        org.apache.commons.lang.math.Fraction fraction41 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int42 = fraction41.intValue();
        int int43 = fraction41.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction45 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int46 = fraction45.intValue();
        org.apache.commons.lang.math.Fraction fraction47 = fraction45.invert();
        org.apache.commons.lang.math.Fraction fraction48 = fraction47.invert();
        java.lang.String str49 = fraction48.toProperString();
        org.apache.commons.lang.math.Fraction fraction50 = fraction48.reduce();
        org.apache.commons.lang.math.Fraction fraction51 = fraction41.add(fraction50);
        java.lang.String str52 = fraction50.toString();
        boolean boolean53 = fraction38.equals((java.lang.Object) fraction50);
        boolean boolean54 = fraction7.equals((java.lang.Object) fraction50);
        org.apache.commons.lang.math.Fraction fraction55 = fraction50.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.4f + "'", float18 == 0.4f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2/5" + "'", str19, "2/5");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2/5" + "'", str21, "2/5");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
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
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "10" + "'", str49, "10");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10/1" + "'", str52, "10/1");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(fraction55);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction((double) 100);
        int int2 = fraction1.getDenominator();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang.math.Fraction fraction4 = fraction1.reduce();
        org.apache.commons.lang.math.Fraction fraction5 = fraction1.invert();
        double double6 = fraction5.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction8 = fraction5.pow((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.01d + "'", double6 == 0.01d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.apache.commons.lang.math.Fraction fraction3 = org.apache.commons.lang.math.Fraction.getFraction(217, (int) (byte) 10, 679);
        org.apache.commons.lang.math.Fraction fraction6 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 3, (int) (short) 5);
        org.apache.commons.lang.math.Fraction fraction9 = org.apache.commons.lang.math.Fraction.getFraction(1003833, (-20));
        org.apache.commons.lang.math.Fraction fraction10 = fraction6.add(fraction9);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang.math.Fraction fraction12 = fraction3.add(fraction10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1003821) + "'", int11 == (-1003821));
        org.junit.Assert.assertNotNull(fraction12);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getReducedFraction((-20), (int) (byte) 26);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
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
        java.lang.String str24 = fraction23.toProperString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "110" + "'", str24, "110");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        org.apache.commons.lang.math.Fraction fraction21 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int22 = fraction21.intValue();
        float float23 = fraction21.floatValue();
        java.lang.String str24 = fraction21.toString();
        long long25 = fraction21.longValue();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        org.apache.commons.lang.math.Fraction fraction28 = fraction21.add(fraction26);
        org.apache.commons.lang.math.Fraction fraction29 = fraction28.reduce();
        org.apache.commons.lang.math.Fraction fraction30 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction32 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int33 = fraction32.intValue();
        org.apache.commons.lang.math.Fraction fraction34 = fraction32.invert();
        org.apache.commons.lang.math.Fraction fraction35 = fraction34.invert();
        long long36 = fraction35.longValue();
        org.apache.commons.lang.math.Fraction fraction37 = fraction35.invert();
        org.apache.commons.lang.math.Fraction fraction40 = org.apache.commons.lang.math.Fraction.getReducedFraction((int) (short) 10, (int) (byte) 10);
        int int41 = fraction40.intValue();
        double double42 = fraction40.doubleValue();
        org.apache.commons.lang.math.Fraction fraction44 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.intValue();
        org.apache.commons.lang.math.Fraction fraction46 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int47 = fraction46.intValue();
        float float48 = fraction46.floatValue();
        java.lang.String str49 = fraction46.toString();
        org.apache.commons.lang.math.Fraction fraction50 = fraction44.subtract(fraction46);
        java.lang.String str51 = fraction46.toProperString();
        org.apache.commons.lang.math.Fraction fraction52 = fraction46.invert();
        org.apache.commons.lang.math.Fraction fraction53 = fraction40.divideBy(fraction52);
        int int54 = fraction53.getNumerator();
        org.apache.commons.lang.math.Fraction fraction55 = fraction37.add(fraction53);
        org.apache.commons.lang.math.Fraction fraction57 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int58 = fraction57.intValue();
        org.apache.commons.lang.math.Fraction fraction59 = fraction57.invert();
        org.apache.commons.lang.math.Fraction fraction60 = fraction37.multiplyBy(fraction57);
        org.apache.commons.lang.math.Fraction fraction61 = fraction28.divideBy(fraction57);
        org.apache.commons.lang.math.Fraction fraction62 = fraction20.multiplyBy(fraction61);
        org.apache.commons.lang.math.Fraction fraction64 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int65 = fraction64.intValue();
        org.apache.commons.lang.math.Fraction fraction66 = fraction64.invert();
        org.apache.commons.lang.math.Fraction fraction67 = org.apache.commons.lang.math.Fraction.TWO_FIFTHS;
        int int68 = fraction67.intValue();
        org.apache.commons.lang.math.Fraction fraction70 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int71 = fraction70.getNumerator();
        org.apache.commons.lang.math.Fraction fraction72 = fraction67.add(fraction70);
        int int73 = fraction64.compareTo((java.lang.Object) fraction67);
        long long74 = fraction67.longValue();
        org.apache.commons.lang.math.Fraction fraction75 = fraction67.invert();
        org.apache.commons.lang.math.Fraction fraction76 = fraction67.negate();
        org.apache.commons.lang.math.Fraction fraction77 = fraction61.multiplyBy(fraction76);
        int int78 = fraction77.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.4f + "'", float23 == 0.4f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2/5" + "'", str24, "2/5");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.4f + "'", float48 == 0.4f);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2/5" + "'", str49, "2/5");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2/5" + "'", str51, "2/5");
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-4) + "'", int78 == (-4));
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.apache.commons.lang.math.Fraction fraction2 = org.apache.commons.lang.math.Fraction.getFraction((-2), 110);
        int int3 = fraction2.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
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
        org.apache.commons.lang.math.Fraction fraction23 = org.apache.commons.lang.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang.math.Fraction fraction24 = org.apache.commons.lang.math.Fraction.ZERO;
        int int25 = fraction24.getProperWhole();
        org.apache.commons.lang.math.Fraction fraction26 = org.apache.commons.lang.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang.math.Fraction fraction28 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang.math.Fraction fraction30 = fraction28.invert();
        org.apache.commons.lang.math.Fraction fraction31 = fraction30.invert();
        org.apache.commons.lang.math.Fraction fraction33 = org.apache.commons.lang.math.Fraction.getFraction((double) 10);
        int int34 = fraction33.intValue();
        org.apache.commons.lang.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang.math.Fraction fraction36 = fraction35.invert();
        org.apache.commons.lang.math.Fraction fraction37 = fraction30.subtract(fraction35);
        int int38 = fraction30.getDenominator();
        org.apache.commons.lang.math.Fraction fraction39 = org.apache.commons.lang.math.Fraction.ZERO;
        org.apache.commons.lang.math.Fraction fraction40 = fraction39.negate();
        boolean boolean41 = fraction30.equals((java.lang.Object) fraction40);
        int int42 = fraction30.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction43 = fraction26.add(fraction30);
        org.apache.commons.lang.math.Fraction fraction44 = fraction24.multiplyBy(fraction43);
        org.apache.commons.lang.math.Fraction fraction45 = fraction44.negate();
        org.apache.commons.lang.math.Fraction fraction46 = fraction23.add(fraction45);
        org.apache.commons.lang.math.Fraction fraction48 = fraction23.pow(6);
        org.apache.commons.lang.math.Fraction fraction49 = fraction23.negate();
        int int50 = fraction20.compareTo((java.lang.Object) fraction49);
        java.lang.Class<?> wildcardClass51 = fraction20.getClass();
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
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.apache.commons.lang.math.Fraction fraction1 = org.apache.commons.lang.math.Fraction.getFraction(0.025d);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.apache.commons.lang.math.Fraction fraction0 = org.apache.commons.lang.math.Fraction.ONE;
        org.apache.commons.lang.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang.math.Fraction fraction5 = org.apache.commons.lang.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction8 = org.apache.commons.lang.math.Fraction.THREE_FIFTHS;
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang.math.Fraction fraction10 = fraction0.multiplyBy(fraction8);
        float float11 = fraction0.floatValue();
        org.apache.commons.lang.math.Fraction fraction12 = fraction0.abs();
        org.apache.commons.lang.math.Fraction fraction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.math.Fraction fraction14 = fraction12.divideBy(fraction13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(fraction12);
    }
}

