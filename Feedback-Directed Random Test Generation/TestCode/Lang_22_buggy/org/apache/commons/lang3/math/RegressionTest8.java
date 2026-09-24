package org.apache.commons.lang3.math;

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
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) 20);
        int int39 = fraction38.intValue();
        int int40 = fraction38.getProperWhole();
        boolean boolean41 = fraction28.equals((java.lang.Object) fraction38);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int43 = fraction42.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.invert();
        int int45 = fraction44.getProperWhole();
        int int46 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.invert();
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction48.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction44.divideBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int60 = fraction59.intValue();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int63 = fraction62.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction59.add(fraction62);
        java.lang.String str65 = fraction62.toProperString();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction58.divideBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction58.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction70 = fraction69.invert();
        org.apache.commons.lang3.math.Fraction fraction71 = fraction69.negate();
        float float72 = fraction71.floatValue();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction68.subtract(fraction71);
        int int74 = fraction71.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction55.subtract(fraction71);
        org.apache.commons.lang3.math.Fraction fraction79 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean81 = fraction79.equals((java.lang.Object) (byte) 100);
        int int82 = fraction79.getProperWhole();
        int int83 = fraction79.intValue();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction71.subtract(fraction79);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction79.reduce();
        int int86 = fraction28.compareTo(fraction85);
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
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20 + "'", int39 == 20);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20 + "'", int40 == 20);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "10" + "'", str65, "10");
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-1.0f) + "'", float72 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 33 + "'", int82 == 33);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 33 + "'", int83 == 33);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("3/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.pow((int) (short) 1);
        int int9 = fraction6.getNumerator();
        int int10 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction6.abs();
        long long12 = fraction11.longValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.invert();
        java.lang.String str17 = fraction16.toString();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int21 = fraction20.getDenominator();
        int int22 = fraction20.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction11.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction2.subtract(fraction11);
        java.lang.String str26 = fraction11.toProperString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1226 + "'", int9 == 1226);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1226 + "'", int10 == 1226);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1/10" + "'", str17, "1/10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-35) + "'", int22 == (-35));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "35 1/35" + "'", str26, "35 1/35");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction(20, (int) (byte) 97);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction20.add(fraction25);
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
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(7, 7);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, (-9));
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction2.multiplyBy(fraction8);
        int int11 = fraction8.getProperWhole();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -44, 1005216, (int) (byte) 97);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean19 = fraction17.equals((java.lang.Object) (byte) 100);
        int int20 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction17.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction5.divideBy(fraction17);
        int int25 = fraction24.getProperNumerator();
        int int26 = fraction24.intValue();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-3), 52, 175);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, 1);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.negate();
        int int9 = fraction8.getNumerator();
        byte byte10 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("3 37/70");
        int int2 = fraction1.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.pow((int) (short) 1);
        double double23 = fraction22.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.add(fraction29);
        java.lang.String str32 = fraction29.toProperString();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction25.divideBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction22.divideBy(fraction34);
        boolean boolean36 = fraction16.equals((java.lang.Object) fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE;
        int int38 = fraction37.getProperWhole();
        long long39 = fraction37.longValue();
        double double40 = fraction37.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction35.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.reduce();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.02857142857143d + "'", double23 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10" + "'", str32, "10");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        int int27 = fraction25.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1024, 3);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str32 = fraction31.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.subtract(fraction33);
        long long36 = fraction35.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.reduce();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction30.subtract(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction25.multiplyBy(fraction37);
        int int40 = fraction37.getProperWhole();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "3/5" + "'", str32, "3/5");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.lang.String str56 = fraction36.toString();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction28.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction28.reduce();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35.028572f);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction58.divideBy(fraction60);
        java.lang.String str62 = fraction60.toString();
        double double63 = fraction60.doubleValue();
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10/1" + "'", str56, "10/1");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1226/35" + "'", str62, "1226/35");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 35.02857142857143d + "'", double63 == 35.02857142857143d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', (int) (byte) 0, (int) (byte) 33);
        int int4 = fraction3.getNumerator();
        float float5 = fraction3.floatValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1716 + "'", int4 == 1716);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 52.0f + "'", float5 == 52.0f);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.invert();
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction24.subtract(fraction30);
        int int32 = fraction31.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction31.divideBy(fraction35);
        java.lang.String str37 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction22.add(fraction35);
        int int39 = fraction38.getProperNumerator();
        double double40 = fraction38.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction38.reduce();
        java.lang.String str42 = fraction41.toProperString();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-10), (int) (byte) 100);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int49 = fraction48.intValue();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int52 = fraction51.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction48.add(fraction51);
        java.lang.String str54 = fraction51.toProperString();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction47.divideBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction47.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction58.negate();
        float float61 = fraction60.floatValue();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction57.subtract(fraction60);
        java.lang.String str63 = fraction60.toString();
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        int int66 = fraction60.compareTo(fraction65);
        int int67 = fraction65.getProperNumerator();
        int int68 = fraction65.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction45.divideBy(fraction65);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction41.subtract(fraction45);
        short short71 = fraction70.shortValue();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-10" + "'", str37, "-10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 175 + "'", int39 == 175);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-10.095160413268081d) + "'", double40 == (-10.095160413268081d));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-10 175/1839" + "'", str42, "-10 175/1839");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10" + "'", str54, "10");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-1/1" + "'", str63, "-1/1");
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + short71 + "' != '" + (short) -9 + "'", short71 == (short) -9);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.add(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction18.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long29 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction22.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction7.divideBy(fraction31);
        int int33 = fraction32.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction36.add(fraction39);
        double double41 = fraction39.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int43 = fraction42.intValue();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int46 = fraction45.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction42.add(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction42.abs();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction42.abs();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        boolean boolean52 = fraction49.equals((java.lang.Object) fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction50.reduce();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.invert();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction57.pow((int) (byte) 0);
        int int60 = fraction57.intValue();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction50.divideBy(fraction57);
        int int62 = fraction57.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction39.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction32.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction64.invert();
        short short66 = fraction64.shortValue();
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
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.01d + "'", double41 == 0.01d);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 0 + "'", short66 == (short) 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        int int15 = fraction11.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        float float18 = fraction16.floatValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction16.abs();
        int int20 = fraction16.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction11.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str23 = fraction22.toString();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.ONE;
        int int28 = fraction27.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction24.subtract(fraction27);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int32 = fraction31.intValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction31.add(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction31.abs();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction31.abs();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        boolean boolean41 = fraction38.equals((java.lang.Object) fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction39.reduce();
        int int43 = fraction42.getNumerator();
        int int44 = fraction42.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction42.reduce();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction24.add(fraction45);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.invert();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int53 = fraction52.intValue();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction52.invert();
        java.lang.String str55 = fraction52.toProperString();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction52.subtract(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction61 = fraction60.invert();
        float float62 = fraction60.floatValue();
        int int63 = fraction60.getDenominator();
        java.lang.String str64 = fraction60.toString();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction59.subtract(fraction60);
        int int66 = fraction65.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean70 = fraction65.equals((java.lang.Object) fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction50.divideBy(fraction69);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction50.reduce();
        boolean boolean73 = fraction46.equals((java.lang.Object) fraction50);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction21.multiplyBy(fraction50);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.4f + "'", float18 == 0.4f);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3/5" + "'", str23, "3/5");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "10" + "'", str55, "10");
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1/1" + "'", str64, "1/1");
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 19 + "'", int66 == 19);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(fraction74);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(350, (-14));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.pow((int) (short) 1);
        java.lang.String str25 = fraction22.toProperString();
        float float26 = fraction22.floatValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.reduce();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction17.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction8.divideBy(fraction29);
        short short31 = fraction30.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35 1/35" + "'", str25, "35 1/35");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 35.028572f + "'", float26 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) -2 + "'", short31 == (short) -2);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        java.lang.Class<?> wildcardClass37 = fraction1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.Class<?> wildcardClass32 = fraction0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1600 1/2");
        int int2 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1600 + "'", int2 == 1600);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.negate();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction52.abs();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction4.multiplyBy(fraction54);
        java.lang.String str56 = fraction55.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3/5" + "'", str12, "3/5");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.02857142857143d + "'", double24 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.1f + "'", float43 == 0.1f);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2007/2" + "'", str56, "2007/2");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        org.apache.commons.lang3.math.Fraction fraction36 = fraction25.reduce();
        int int37 = fraction25.getDenominator();
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
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean19 = fraction17.equals((java.lang.Object) (byte) 100);
        int int20 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction17.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction5.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.intValue();
        int int28 = fraction26.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction26.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.invert();
        java.lang.String str31 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE;
        int int33 = fraction32.getProperWhole();
        long long34 = fraction32.longValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction32.invert();
        boolean boolean36 = fraction26.equals((java.lang.Object) fraction32);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction24.multiplyBy(fraction32);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int42 = fraction41.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int45 = fraction41.compareTo(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.invert();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.invert();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction39.multiplyBy(fraction47);
        double double49 = fraction48.doubleValue();
        int int50 = fraction48.getProperNumerator();
        int int51 = fraction37.compareTo(fraction48);
        int int52 = fraction37.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10/1" + "'", str31, "10/1");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.0d + "'", double49 == 7.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((int) (byte) 0);
        int int8 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction11 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.negate();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction13.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.abs();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction10.add(fraction20);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int29 = fraction25.compareTo(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction23.multiplyBy(fraction31);
        long long33 = fraction32.longValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction21.subtract(fraction32);
        int int35 = fraction5.compareTo(fraction34);
        float float36 = fraction34.floatValue();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        float float39 = fraction37.floatValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.abs();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean46 = fraction44.equals((java.lang.Object) (byte) 100);
        int int47 = fraction44.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int51 = fraction50.intValue();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int54 = fraction53.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction50.add(fraction53);
        java.lang.String str56 = fraction53.toProperString();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction49.divideBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction59 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long60 = fraction59.longValue();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction53.subtract(fraction59);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction53.invert();
        int int63 = fraction53.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction44.multiplyBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction40.add(fraction53);
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int69 = fraction68.intValue();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int72 = fraction71.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction68.add(fraction71);
        java.lang.String str74 = fraction71.toProperString();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction67.divideBy(fraction71);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction67.pow((int) (byte) 0);
        int int78 = fraction67.intValue();
        int int79 = fraction65.compareTo(fraction67);
        double double80 = fraction67.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction81 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int82 = fraction81.intValue();
        org.apache.commons.lang3.math.Fraction fraction84 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int85 = fraction84.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction86 = fraction81.add(fraction84);
        long long87 = fraction86.longValue();
        int int88 = fraction86.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction89 = fraction67.add(fraction86);
        org.apache.commons.lang3.math.Fraction fraction90 = fraction34.add(fraction89);
        org.apache.commons.lang3.math.Fraction fraction91 = fraction1.subtract(fraction34);
        short short92 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 7L + "'", long33 == 7L);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-5.6f) + "'", float36 == (-5.6f));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 33 + "'", int47 == 33);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10" + "'", str56, "10");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "10" + "'", str74, "10");
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 10L + "'", long87 == 10L);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 52 + "'", int88 == 52);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 10 + "'", short92 == (short) 10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.subtract(fraction1);
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        int int5 = fraction4.getProperWhole();
        long long6 = fraction4.longValue();
        double double7 = fraction4.doubleValue();
        int int8 = fraction4.getDenominator();
        int int9 = fraction4.intValue();
        int int10 = fraction4.intValue();
        int int11 = fraction0.compareTo(fraction4);
        double double12 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int18 = fraction14.compareTo(fraction17);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.negate();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction0.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.abs();
        long long26 = fraction24.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction12.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = fraction9.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.add(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction18.abs();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int27 = fraction26.getNumerator();
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
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.pow((int) (byte) 0);
        int int46 = fraction43.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction36.divideBy(fraction43);
        boolean boolean48 = fraction26.equals((java.lang.Object) fraction36);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction18.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction26.invert();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        boolean boolean52 = fraction9.equals((java.lang.Object) fraction51);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.abs();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction("5/1");
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.subtract(fraction58);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction9.subtract(fraction59);
        int int61 = fraction9.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
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
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1226 + "'", int61 == 1226);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction3.add(fraction8);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int19 = fraction18.intValue();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int22 = fraction21.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.add(fraction21);
        java.lang.String str24 = fraction21.toProperString();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction17.divideBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.negate();
        boolean boolean27 = fraction8.equals((java.lang.Object) fraction21);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction2.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int34 = fraction30.compareTo(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int36 = fraction35.intValue();
        float float37 = fraction35.floatValue();
        java.lang.String str38 = fraction35.toString();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction30.subtract(fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int42 = fraction41.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.invert();
        java.lang.String str44 = fraction41.toProperString();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction41.subtract(fraction47);
        int int49 = fraction48.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int52 = fraction51.intValue();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction51.invert();
        java.lang.String str54 = fraction51.toProperString();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction51.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction64 = fraction62.pow((int) (short) 1);
        java.lang.String str65 = fraction62.toProperString();
        float float66 = fraction62.floatValue();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction62.reduce();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction57.divideBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction69 = fraction57.reduce();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction48.divideBy(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction39.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction28.subtract(fraction39);
        java.lang.Class<?> wildcardClass73 = fraction28.getClass();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3/5" + "'", str4, "3/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.4f + "'", float37 == 0.4f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2/5" + "'", str38, "2/5");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10" + "'", str44, "10");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10" + "'", str54, "10");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "35 1/35" + "'", str65, "35 1/35");
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 35.028572f + "'", float66 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        float float5 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        float float16 = fraction12.floatValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.negate();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int22 = fraction21.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.add(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction21.abs();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction21.abs();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction18.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction17.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction1.add(fraction31);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.invert();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        java.lang.String str38 = fraction37.toString();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int42 = fraction41.getDenominator();
        int int43 = fraction41.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction37.divideBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int46 = fraction45.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.invert();
        boolean boolean48 = fraction41.equals((java.lang.Object) fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction31.add(fraction47);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.028572f + "'", float16 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1/10" + "'", str38, "1/10");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-35) + "'", int43 == (-35));
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        long long7 = fraction3.longValue();
        int int8 = fraction3.getProperWhole();
        float float9 = fraction3.floatValue();
        int int10 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.invert();
        java.lang.String str12 = fraction11.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.028572f + "'", float9 == 35.028572f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35/1226" + "'", str12, "35/1226");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        float float19 = fraction18.floatValue();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -44, (int) (short) 19);
        float float23 = fraction22.floatValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction18.multiplyBy(fraction22);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.6666666f) + "'", float19 == (-1.6666666f));
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-2.3157895f) + "'", float23 == (-2.3157895f));
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        org.apache.commons.lang3.math.Fraction fraction53 = fraction32.add(fraction47);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction47.invert();
        int int55 = fraction12.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction57 = fraction56.invert();
        double double58 = fraction56.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.negate();
        java.lang.String str60 = fraction56.toString();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction12.subtract(fraction56);
        int int62 = fraction61.getProperNumerator();
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
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1/1" + "'", str60, "1/1");
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.add(fraction7);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.abs();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction4.abs();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        boolean boolean14 = fraction11.equals((java.lang.Object) fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.reduce();
        int int16 = fraction15.getNumerator();
        int int17 = fraction15.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction0.add(fraction15);
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.invert();
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction20.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction0.add(fraction20);
        long long29 = fraction28.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction31 = fraction28.pow(109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11L + "'", long29 == 11L);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.negate();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str15 = fraction14.toString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.invert();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction14.subtract(fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        int int20 = fraction19.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction16.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction23.abs();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.abs();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.invert();
        boolean boolean33 = fraction30.equals((java.lang.Object) fraction31);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction31.reduce();
        int int35 = fraction34.getNumerator();
        int int36 = fraction34.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.reduce();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction16.add(fraction37);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean44 = fraction42.equals((java.lang.Object) (byte) 100);
        int int45 = fraction42.getProperWhole();
        int int46 = fraction42.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction38.add(fraction42);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction48.abs();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.invert();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction48.subtract(fraction52);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction42.subtract(fraction52);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction12.subtract(fraction52);
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
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3/5" + "'", str15, "3/5");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 33 + "'", int45 == 33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 33 + "'", int46 == 33);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        double double7 = fraction6.doubleValue();
        java.lang.String str8 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction6.reduce();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.reduce();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-10" + "'", str8, "-10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.reduce();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.abs();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction19.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        int int28 = fraction27.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.negate();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.subtract(fraction29);
        double double31 = fraction25.doubleValue();
        int int32 = fraction25.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction14.multiplyBy(fraction25);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-10" + "'", str13, "-10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.004078303425774877d + "'", double31 == 0.004078303425774877d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        double double8 = fraction6.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.01d + "'", double8 == 0.01d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.invert();
        int int3 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 3);
        int int7 = fraction6.getNumerator();
        int int8 = fraction0.compareTo(fraction6);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction("7");
        java.lang.String str11 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction0.divideBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction10.reduce();
        int int14 = fraction13.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(40, 9);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.pow((int) (short) 35);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0);
        long long10 = fraction9.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.add(fraction9);
        int int12 = fraction11.getNumerator();
        java.lang.String str13 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction2.add(fraction11);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.invert();
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction12 = fraction5.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.pow((int) (short) 1);
        java.lang.String str19 = fraction16.toProperString();
        float float20 = fraction16.floatValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction11.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str24 = fraction23.toString();
        int int25 = fraction23.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction22.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction23.add(fraction32);
        float float34 = fraction23.floatValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction3.multiplyBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction3.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35 1/35" + "'", str19, "35 1/35");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 35.028572f + "'", float20 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1/3" + "'", str24, "1/3");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.33333334f + "'", float34 == 0.33333334f);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        float float11 = fraction9.floatValue();
        java.lang.String str12 = fraction9.toString();
        long long13 = fraction9.longValue();
        int int14 = fraction9.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction9.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction4.add(fraction19);
        long long21 = fraction4.longValue();
        int int22 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int27 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction26.invert();
        int int29 = fraction28.getProperWhole();
        int int30 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int33 = fraction32.intValue();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction32.invert();
        java.lang.String str35 = fraction32.toProperString();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction32.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction28.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction25.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.invert();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.invert();
        java.lang.String str50 = fraction47.toProperString();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction47.subtract(fraction53);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction56 = fraction55.invert();
        float float57 = fraction55.floatValue();
        int int58 = fraction55.getDenominator();
        java.lang.String str59 = fraction55.toString();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction54.subtract(fraction55);
        int int61 = fraction60.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean65 = fraction60.equals((java.lang.Object) fraction64);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction45.divideBy(fraction64);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction41.multiplyBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction1.add(fraction41);
        int int69 = fraction68.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.4f + "'", float11 == 0.4f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "10" + "'", str35, "10");
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "10" + "'", str50, "10");
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1/1" + "'", str59, "1/1");
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 19 + "'", int61 == 19);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -14, 8161);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.48f);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        float float7 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction6.negate();
        java.lang.Class<?> wildcardClass10 = fraction9.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-10.0f) + "'", float7 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 4, 524);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction14.invert();
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
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.pow((-1));
        float float9 = fraction6.floatValue();
        float float10 = fraction6.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        int int12 = fraction11.getProperWhole();
        long long13 = fraction11.longValue();
        double double14 = fraction11.doubleValue();
        int int15 = fraction11.getDenominator();
        double double16 = fraction11.doubleValue();
        boolean boolean17 = fraction6.equals((java.lang.Object) fraction11);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int13 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int16 = fraction12.compareTo(fraction15);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        float float19 = fraction17.floatValue();
        java.lang.String str20 = fraction17.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction12.subtract(fraction17);
        int int22 = fraction12.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction12.pow(2);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        float float27 = fraction25.floatValue();
        int int28 = fraction25.getDenominator();
        int int29 = fraction25.getProperNumerator();
        java.lang.Object obj30 = null;
        boolean boolean31 = fraction25.equals(obj30);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction25.pow((int) (byte) 0);
        int int34 = fraction12.compareTo(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction9.subtract(fraction33);
        short short36 = fraction9.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.4f + "'", float19 == 0.4f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2/5" + "'", str20, "2/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 10 + "'", short36 == (short) 10);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.pow(0);
        short short24 = fraction21.shortValue();
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
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.negate();
        java.lang.String str11 = fraction10.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-10/1" + "'", str11, "-10/1");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        org.apache.commons.lang3.math.Fraction fraction17 = fraction11.add(fraction16);
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        int int2 = fraction1.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.add(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction3.add(fraction8);
        int int16 = fraction15.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.reduce();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction1.divideBy(fraction17);
        double double19 = fraction18.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.abs();
        int int21 = fraction20.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.negate();
        short short23 = fraction22.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3/5" + "'", str4, "3/5");
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -10 + "'", short23 == (short) -10);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        java.lang.String str5 = fraction4.toString();
        double double6 = fraction4.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.ONE;
        int int13 = fraction12.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.reduce();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction9.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction16.abs();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.abs();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        boolean boolean26 = fraction23.equals((java.lang.Object) fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.reduce();
        int int28 = fraction27.getNumerator();
        int int29 = fraction27.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction27.reduce();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction9.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean37 = fraction35.equals((java.lang.Object) (byte) 100);
        int int38 = fraction35.getProperWhole();
        int int39 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction31.add(fraction35);
        int int41 = fraction4.compareTo(fraction40);
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.pow((int) (short) 1);
        double double48 = fraction47.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int52 = fraction51.intValue();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int55 = fraction54.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction51.add(fraction54);
        java.lang.String str57 = fraction54.toProperString();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction50.divideBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction47.divideBy(fraction59);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction59.invert();
        int int62 = fraction61.intValue();
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int65 = fraction64.intValue();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction64.invert();
        int int67 = fraction66.getNumerator();
        int int68 = fraction66.intValue();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction61.add(fraction66);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction40.add(fraction69);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 37);
        int int73 = fraction72.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction69.subtract(fraction72);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10/1" + "'", str5, "10/1");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3/5" + "'", str8, "3/5");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 33 + "'", int38 == 33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 33 + "'", int39 == 33);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.02857142857143d + "'", double48 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10" + "'", str57, "10");
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(fraction74);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        java.lang.String str17 = fraction14.toProperString();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction10.divideBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction10.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.negate();
        float float24 = fraction23.floatValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.subtract(fraction23);
        int int26 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction3.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction3.reduce();
        java.lang.String str29 = fraction3.toProperString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "33" + "'", str29, "33");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
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
        boolean boolean23 = fraction7.equals((java.lang.Object) fraction16);
        int int24 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        boolean boolean35 = fraction32.equals((java.lang.Object) fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.reduce();
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction("10 2/5");
        org.apache.commons.lang3.math.Fraction fraction40 = fraction36.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str43 = fraction42.toString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction42.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction47.abs();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction42.add(fraction47);
        java.lang.String str55 = fraction42.toProperString();
        int int56 = fraction39.compareTo(fraction42);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction16.divideBy(fraction42);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction63 = fraction61.pow((int) (short) 1);
        java.lang.String str64 = fraction61.toProperString();
        float float65 = fraction61.floatValue();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction61.reduce();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction66.abs();
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction74 = fraction70.add(fraction73);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction67.multiplyBy(fraction70);
        int int76 = fraction67.getProperWhole();
        double double77 = fraction67.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction16.divideBy(fraction67);
        int int79 = fraction78.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3/5" + "'", str43, "3/5");
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "3/5" + "'", str55, "3/5");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "35 1/35" + "'", str64, "35 1/35");
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 35.028572f + "'", float65 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 35.02857142857143d + "'", double77 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 350 + "'", int79 == 350);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction13.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.abs();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction20.add(fraction26);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction32.add(fraction35);
        java.lang.String str38 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction31.divideBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long42 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction35.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction35.abs();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction20.divideBy(fraction44);
        int int46 = fraction45.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.pow((int) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        float float54 = fraction53.floatValue();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction50.divideBy(fraction53);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.negate();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.add(fraction57);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction45.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction0.divideBy(fraction60);
        int int62 = fraction60.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-10.0f) + "'", float54 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) 1);
        double double10 = fraction9.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction1.compareTo(fraction9);
        double double24 = fraction1.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction1.reduce();
        double double26 = fraction1.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.02857142857143d + "'", double10 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        long long2 = fraction0.longValue();
        double double3 = fraction0.doubleValue();
        int int4 = fraction0.getDenominator();
        int int5 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.negate();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction0.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        float float15 = fraction14.floatValue();
        java.lang.String str16 = fraction14.toProperString();
        double double17 = fraction14.doubleValue();
        int int18 = fraction10.compareTo(fraction14);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0040783035f + "'", float15 == 0.0040783035f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "5/1226" + "'", str16, "5/1226");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.004078303425774877d + "'", double17 == 0.004078303425774877d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.reduce();
        java.lang.String str15 = fraction10.toString();
        short short16 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-10" + "'", str13, "-10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-10/1" + "'", str15, "-10/1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -10 + "'", short16 == (short) -10);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
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
        boolean boolean23 = fraction7.equals((java.lang.Object) fraction16);
        int int24 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        boolean boolean35 = fraction32.equals((java.lang.Object) fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.reduce();
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction("10 2/5");
        org.apache.commons.lang3.math.Fraction fraction40 = fraction36.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str43 = fraction42.toString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction42.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction47.abs();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction42.add(fraction47);
        java.lang.String str55 = fraction42.toProperString();
        int int56 = fraction39.compareTo(fraction42);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction16.divideBy(fraction42);
        int int58 = fraction57.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3/5" + "'", str43, "3/5");
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "3/5" + "'", str55, "3/5");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long9 = fraction8.longValue();
        java.lang.String str10 = fraction8.toProperString();
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction14.add(fraction17);
        java.lang.String str20 = fraction17.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction13.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction13.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.negate();
        float float27 = fraction26.floatValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.intValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction30.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.invert();
        float float40 = fraction38.floatValue();
        int int41 = fraction38.getDenominator();
        java.lang.String str42 = fraction38.toString();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.subtract(fraction38);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction23.add(fraction38);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction38.pow((int) (byte) 35);
        boolean boolean47 = fraction8.equals((java.lang.Object) fraction46);
        int int48 = fraction5.compareTo(fraction8);
        java.lang.Class<?> wildcardClass49 = fraction8.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1/1" + "'", str42, "1/1");
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction11.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction16 = fraction11.pow((int) (byte) -44);
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
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 9, 0, 39);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 10, (int) (short) 35);
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
        org.apache.commons.lang3.math.Fraction fraction28 = fraction6.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction1.multiplyBy(fraction28);
        long long31 = fraction30.longValue();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1/1" + "'", str23, "1/1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1028L) + "'", long31 == (-1028L));
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-29), 35, 48);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.pow(97);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction0.multiplyBy(fraction24);
        int int29 = fraction0.getDenominator();
        short short30 = fraction0.shortValue();
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 0 + "'", short30 == (short) 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0);
        long long30 = fraction29.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.negate();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.multiplyBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction35.invert();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction36.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.negate();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction38.abs();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction32.subtract(fraction38);
        int int42 = fraction41.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction41.pow((int) (short) 30);
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
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        long long4 = fraction0.longValue();
        int int5 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean16 = fraction14.equals((java.lang.Object) (byte) 100);
        int int17 = fraction14.getProperWhole();
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
        int int33 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction14.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction23.abs();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction8.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction8.negate();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction40.add(fraction43);
        int int45 = fraction40.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.subtract(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction46.multiplyBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction40.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction40.reduce();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int56 = fraction55.intValue();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int59 = fraction58.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction55.add(fraction58);
        java.lang.String str61 = fraction58.toProperString();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction54.divideBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction64 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long65 = fraction64.longValue();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction58.subtract(fraction64);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction58.reduce();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.pow(1);
        int int70 = fraction52.compareTo(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction37.multiplyBy(fraction69);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "10" + "'", str61, "10");
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(fraction71);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 58, (int) (byte) 97);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.subtract(fraction20);
        long long22 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.reduce();
        int int32 = fraction24.compareTo(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction16.add(fraction30);
        java.lang.String str34 = fraction16.toString();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1/1" + "'", str34, "1/1");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        org.apache.commons.lang3.math.Fraction fraction20 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.pow((int) (short) 1);
        java.lang.String str42 = fraction39.toProperString();
        float float43 = fraction39.floatValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction34.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction26.subtract(fraction45);
        boolean boolean47 = fraction22.equals((java.lang.Object) fraction46);
        boolean boolean48 = fraction20.equals((java.lang.Object) fraction46);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction46.abs();
        int int50 = fraction46.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "35 1/35" + "'", str42, "35 1/35");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 35.028572f + "'", float43 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-9) + "'", int50 == (-9));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        int int2 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) '4');
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int8 = fraction7.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.invert();
        int int10 = fraction9.getProperWhole();
        int int11 = fraction9.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.invert();
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction9.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction6.add(fraction9);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.invert();
        float float38 = fraction36.floatValue();
        int int39 = fraction36.getDenominator();
        java.lang.String str40 = fraction36.toString();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction35.subtract(fraction36);
        int int42 = fraction41.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean46 = fraction41.equals((java.lang.Object) fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction26.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction22.multiplyBy(fraction26);
        int int49 = fraction48.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction53 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (short) 21, 100);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction48.divideBy(fraction53);
        int int55 = fraction48.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction48.negate();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction3.divideBy(fraction56);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1/1" + "'", str40, "1/1");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 19 + "'", int42 == 19);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.divideBy(fraction12);
        int int14 = fraction12.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.reduce();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-10) + "'", int14 == (-10));
        org.junit.Assert.assertNotNull(fraction15);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.multiplyBy(fraction3);
        long long5 = fraction4.longValue();
        int int6 = fraction4.getNumerator();
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
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction25.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.add(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction14.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction4.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction4.reduce();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        int int31 = fraction30.intValue();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int35 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.add(fraction37);
        java.lang.String str40 = fraction37.toProperString();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction33.divideBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction33.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction45.invert();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction30.divideBy(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction48.multiplyBy(fraction51);
        long long53 = fraction52.longValue();
        int int54 = fraction52.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int56 = fraction55.intValue();
        org.apache.commons.lang3.math.Fraction fraction58 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int59 = fraction58.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction55.add(fraction58);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction55.abs();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction55.abs();
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction64 = fraction63.invert();
        boolean boolean65 = fraction62.equals((java.lang.Object) fraction63);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction68.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 35);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction73.pow(10035);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction70.add(fraction75);
        org.apache.commons.lang3.math.Fraction fraction77 = fraction75.reduce();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction62.add(fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction52.divideBy(fraction78);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction52.invert();
        org.apache.commons.lang3.math.Fraction fraction81 = fraction47.divideBy(fraction52);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10" + "'", str40, "10");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
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
        boolean boolean23 = fraction7.equals((java.lang.Object) fraction16);
        int int24 = fraction7.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction7.reduce();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction25);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction24.pow(97);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction0.multiplyBy(fraction24);
        int int29 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.abs();
        java.lang.String str33 = fraction31.toString();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        float float37 = fraction36.floatValue();
        java.lang.String str38 = fraction36.toProperString();
        int int39 = fraction31.compareTo(fraction36);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction0.multiplyBy(fraction31);
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1/1" + "'", str33, "1/1");
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0040783035f + "'", float37 == 0.0040783035f);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "5/1226" + "'", str38, "5/1226");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction17);
        int int19 = fraction18.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction9.multiplyBy(fraction22);
        java.lang.Class<?> wildcardClass25 = fraction24.getClass();
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
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, 100, 100);
        float float4 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        java.lang.String str9 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction6.subtract(fraction12);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction19 = fraction17.pow((int) (short) 1);
        java.lang.String str20 = fraction17.toProperString();
        float float21 = fraction17.floatValue();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.reduce();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction12.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str25 = fraction24.toString();
        int int26 = fraction24.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction23.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction3.subtract(fraction23);
        int int29 = fraction3.getProperWhole();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 1/35" + "'", str20, "35 1/35");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 35.028572f + "'", float21 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1/3" + "'", str25, "1/3");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int15 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction11.add(fraction14);
        java.lang.String str17 = fraction14.toProperString();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction10.divideBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction10.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.negate();
        float float24 = fraction23.floatValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction20.subtract(fraction23);
        int int26 = fraction23.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction3.multiplyBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int30 = fraction29.intValue();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int33 = fraction32.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction29.add(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction29.abs();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction29.abs();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        boolean boolean39 = fraction36.equals((java.lang.Object) fraction37);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction37.reduce();
        int int41 = fraction40.getNumerator();
        int int42 = fraction40.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.invert();
        float float45 = fraction43.floatValue();
        int int46 = fraction43.getDenominator();
        int int47 = fraction43.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction40.subtract(fraction43);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction28.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int53 = fraction52.intValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction52.add(fraction55);
        java.lang.String str58 = fraction55.toProperString();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction51.divideBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int64 = fraction63.intValue();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction63.invert();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int67 = fraction63.compareTo(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction66.invert();
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction70.negate();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction66.divideBy(fraction71);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction72.negate();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction61.subtract(fraction73);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction28.subtract(fraction73);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction23.add(fraction73);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "10" + "'", str58, "10");
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-35), (int) (short) 2, (int) (short) 115);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(179, 351, (int) (short) 70);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        float float4 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.pow(5);
        int int7 = fraction6.getNumerator();
        float float8 = fraction6.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.1f + "'", float4 == 0.1f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0E-5f + "'", float8 == 1.0E-5f);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(875, 27, (int) (short) 19);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-10L));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-28), (-34));
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        java.lang.String str4 = fraction2.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.abs();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction2.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 21, 97, 35);
        long long16 = fraction15.longValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.reduce();
        int int18 = fraction7.compareTo(fraction15);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "14/17" + "'", str4, "14/17");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 23L + "'", long16 == 23L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        double double7 = fraction6.doubleValue();
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
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction20 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.negate();
        float float22 = fraction21.floatValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction21.pow(2);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction16.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1);
        int int28 = fraction27.getDenominator();
        int int29 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction21.add(fraction27);
        int int31 = fraction6.compareTo(fraction27);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        float float4 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.abs();
        java.lang.String str10 = fraction9.toString();
        boolean boolean11 = fraction0.equals((java.lang.Object) fraction9);
        int int12 = fraction9.getProperWhole();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1/1" + "'", str10, "1/1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int3 = fraction2.getProperNumerator();
        int int4 = fraction2.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        java.lang.String str38 = fraction37.toString();
        boolean boolean39 = fraction4.equals((java.lang.Object) fraction37);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int42 = fraction41.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int47 = fraction46.intValue();
        int int48 = fraction46.getProperWhole();
        int int49 = fraction46.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction44.add(fraction46);
        long long51 = fraction50.longValue();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.invert();
        boolean boolean53 = fraction37.equals((java.lang.Object) fraction52);
        java.lang.String str54 = fraction37.toString();
        double double55 = fraction37.doubleValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction57 = fraction37.pow((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1/10" + "'", str38, "1/10");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 20L + "'", long51 == 20L);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1/10" + "'", str54, "1/10");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.1d + "'", double55 == 0.1d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-34));
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 6, 304);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getNumerator();
        int int7 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.abs();
        long long9 = fraction8.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction13.toString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int18 = fraction17.getDenominator();
        int int19 = fraction17.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction13.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction8.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.add(fraction27);
        java.lang.String str30 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction23.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction35 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.negate();
        float float37 = fraction36.floatValue();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction33.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -1, 100);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction33.divideBy(fraction41);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.abs();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction47.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction43.subtract(fraction47);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction41.subtract(fraction49);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction21.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction21.invert();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1226 + "'", int6 == 1226);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1226 + "'", int7 == 1226);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1/10" + "'", str14, "1/10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-35) + "'", int19 == (-35));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long2 = fraction1.longValue();
        java.lang.String str3 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        float float6 = fraction4.floatValue();
        int int7 = fraction4.getDenominator();
        java.lang.String str8 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        int int12 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction4.multiplyBy(fraction10);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction1.add(fraction13);
        java.lang.String str15 = fraction13.toString();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        float float18 = fraction16.floatValue();
        java.lang.String str19 = fraction16.toString();
        int int20 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str26 = fraction25.toString();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction25.subtract(fraction27);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.reduce();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.pow((int) (short) 1);
        double double38 = fraction37.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int42 = fraction41.intValue();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int45 = fraction44.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction41.add(fraction44);
        java.lang.String str47 = fraction44.toProperString();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction40.divideBy(fraction44);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction44.negate();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction37.divideBy(fraction49);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.invert();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction31.add(fraction51);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction16.divideBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction13.add(fraction53);
        int int55 = fraction53.getNumerator();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1/1" + "'", str8, "1/1");
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10/1" + "'", str15, "10/1");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.4f + "'", float18 == 0.4f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2/5" + "'", str19, "2/5");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "3/5" + "'", str26, "3/5");
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.02857142857143d + "'", double38 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "10" + "'", str47, "10");
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int14 = fraction13.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction10.add(fraction13);
        java.lang.String str16 = fraction13.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction9.divideBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction9.pow((int) (byte) 0);
        double double20 = fraction19.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.negate();
        int int22 = fraction19.intValue();
        boolean boolean23 = fraction4.equals((java.lang.Object) fraction19);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.invert();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction3);
        int int8 = fraction7.intValue();
        int int9 = fraction7.getNumerator();
        java.lang.Class<?> wildcardClass10 = fraction7.getClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        int int6 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction3);
        int int8 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) (byte) 100, (-35));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-0.2d));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(25, 20, (int) (short) 100);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long6 = fraction5.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.invert();
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.invert();
        float float18 = fraction16.floatValue();
        int int19 = fraction16.getDenominator();
        java.lang.String str20 = fraction16.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction16);
        int int22 = fraction16.intValue();
        int int23 = fraction16.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction5.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.add(fraction30);
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction37.negate();
        float float40 = fraction39.floatValue();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.intValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.invert();
        java.lang.String str46 = fraction43.toProperString();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction43.subtract(fraction49);
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.invert();
        float float53 = fraction51.floatValue();
        int int54 = fraction51.getDenominator();
        java.lang.String str55 = fraction51.toString();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction50.subtract(fraction51);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction36.add(fraction51);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction51.invert();
        int int59 = fraction16.compareTo(fraction51);
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 1);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction51.multiplyBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction3.divideBy(fraction62);
        org.apache.commons.lang3.math.Fraction fraction65 = fraction3.abs();
        float float66 = fraction65.floatValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/1" + "'", str20, "1/1");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1/1" + "'", str55, "1/1");
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 25.2f + "'", float66 == 25.2f);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (byte) 100);
        int int6 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction3.getNumerator();
        int int9 = fraction3.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.abs();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.abs();
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        float float5 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2/4" + "'", str2, "2/4");
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2/4" + "'", str4, "2/4");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 180);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 10, (int) (short) 35);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long6 = fraction5.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int9 = fraction8.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.invert();
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction8.subtract(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.invert();
        float float18 = fraction16.floatValue();
        int int19 = fraction16.getDenominator();
        java.lang.String str20 = fraction16.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction15.subtract(fraction16);
        int int22 = fraction16.intValue();
        int int23 = fraction16.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction5.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction3.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.reduce();
        int int27 = fraction24.getNumerator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1/1" + "'", str20, "1/1");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.abs();
        java.lang.String str35 = fraction34.toProperString();
        java.lang.String str36 = fraction34.toProperString();
        org.apache.commons.lang3.math.Fraction fraction37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction38 = fraction34.subtract(fraction37);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1/2" + "'", str35, "1/2");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1/2" + "'", str36, "1/2");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.invert();
        java.lang.String str6 = fraction1.toString();
        int int7 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10/1" + "'", str6, "10/1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("19/35");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction6.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.pow((int) (short) 1);
        double double22 = fraction21.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction24.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.negate();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction21.divideBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction15.add(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction0.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction15.negate();
        java.lang.String str39 = fraction38.toProperString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3/5" + "'", str10, "3/5");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.02857142857143d + "'", double22 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-9 2/5" + "'", str39, "-9 2/5");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE;
        int int9 = fraction8.getProperWhole();
        long long10 = fraction8.longValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.invert();
        java.lang.String str12 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction13.pow((int) (short) 37);
        int int16 = fraction13.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction7.subtract(fraction13);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction("1226/35");
        org.apache.commons.lang3.math.Fraction fraction20 = fraction7.divideBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        float float23 = fraction21.floatValue();
        int int24 = fraction21.getDenominator();
        java.lang.String str25 = fraction21.toString();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction26.multiplyBy(fraction29);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction21.multiplyBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.reduce();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        float float35 = fraction33.floatValue();
        int int36 = fraction33.getDenominator();
        java.lang.String str37 = fraction33.toString();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.getNumerator();
        int int41 = fraction39.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction33.multiplyBy(fraction39);
        int int43 = fraction42.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction32.add(fraction44);
        int int46 = fraction19.compareTo(fraction44);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1/1" + "'", str25, "1/1");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1/1" + "'", str37, "1/1");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.add(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction18.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long29 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.subtract(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction22.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction7.divideBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.abs();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int35 = fraction34.intValue();
        float float36 = fraction34.floatValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.abs();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str39 = fraction38.toString();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction38.subtract(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction37.multiplyBy(fraction40);
        float float44 = fraction40.floatValue();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.pow((int) 'a');
        boolean boolean47 = fraction33.equals((java.lang.Object) fraction40);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction40.invert();
        java.lang.String str49 = fraction48.toProperString();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.abs();
        float float51 = fraction50.floatValue();
        int int52 = fraction50.getNumerator();
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
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.4f + "'", float36 == 0.4f);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "3/5" + "'", str39, "3/5");
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1" + "'", str49, "1");
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.reduce();
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long14 = fraction13.longValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.invert();
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction16.subtract(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.invert();
        float float26 = fraction24.floatValue();
        int int27 = fraction24.getDenominator();
        java.lang.String str28 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction23.subtract(fraction24);
        int int30 = fraction24.intValue();
        int int31 = fraction24.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction13.multiplyBy(fraction24);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction24.abs();
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
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.invert();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction47.invert();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction34.divideBy(fraction50);
        boolean boolean52 = fraction24.equals((java.lang.Object) fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction9.subtract(fraction50);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1/1" + "'", str28, "1/1");
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(fraction32);
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
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction53);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        int int5 = fraction1.getProperNumerator();
        int int6 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction13 = fraction1.add(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction("2/3");
        org.apache.commons.lang3.math.Fraction fraction16 = fraction15.negate();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction13.divideBy(fraction16);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction5.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction19 = fraction18.invert();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction18.abs();
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.abs();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 33);
        float float25 = fraction24.floatValue();
        boolean boolean26 = fraction22.equals((java.lang.Object) fraction24);
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 33.0f + "'", float25 == 33.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.invert();
        int int8 = fraction5.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.pow((int) (short) 1);
        java.lang.String str15 = fraction12.toProperString();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction5.divideBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction12.pow((-2));
        org.apache.commons.lang3.math.Fraction fraction19 = fraction0.add(fraction18);
        int int20 = fraction19.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 1/35" + "'", str15, "35 1/35");
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        int int32 = fraction8.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction8.abs();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction35 = fraction8.pow((int) (byte) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fraction33);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-14 1/2");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        org.apache.commons.lang3.math.Fraction fraction45 = fraction8.invert();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction47 = fraction8.pow((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 20L + "'", long43 == 20L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertNotNull(fraction45);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -109, (int) (byte) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (-35));
        double double6 = fraction5.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.multiplyBy(fraction5);
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
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction23.pow((int) (byte) 0);
        int int26 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction16.divideBy(fraction23);
        int int28 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction7.subtract(fraction23);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.02857142857142857d) + "'", double6 == (-0.02857142857142857d));
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
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.abs();
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
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.reduce();
        int int26 = fraction24.getProperNumerator();
        int int27 = fraction8.compareTo(fraction24);
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.pow((int) (short) 1);
        java.lang.String str34 = fraction31.toProperString();
        float float35 = fraction31.floatValue();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction31.reduce();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.invert();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction40.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction37.add(fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction36.multiplyBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.reduce();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.reduce();
        int int52 = fraction51.getProperNumerator();
        double double53 = fraction51.doubleValue();
        boolean boolean54 = fraction8.equals((java.lang.Object) fraction51);
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str56 = fraction55.toString();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction55.subtract(fraction57);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str61 = fraction60.toString();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction63 = fraction62.invert();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction60.subtract(fraction62);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int66 = fraction65.intValue();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int69 = fraction68.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction70 = fraction65.add(fraction68);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction65.abs();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction60.add(fraction65);
        org.apache.commons.lang3.math.Fraction fraction73 = fraction59.subtract(fraction60);
        int int74 = fraction59.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction76 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int78 = fraction77.intValue();
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int81 = fraction80.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction82 = fraction77.add(fraction80);
        java.lang.String str83 = fraction80.toProperString();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction76.divideBy(fraction80);
        org.apache.commons.lang3.math.Fraction fraction86 = fraction76.pow((int) (byte) 0);
        double double87 = fraction86.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction88 = fraction86.negate();
        org.apache.commons.lang3.math.Fraction fraction89 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction90 = fraction89.invert();
        double double91 = fraction89.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction92 = fraction89.negate();
        boolean boolean93 = fraction88.equals((java.lang.Object) fraction89);
        org.apache.commons.lang3.math.Fraction fraction94 = fraction59.subtract(fraction89);
        int int95 = fraction8.compareTo(fraction89);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1/1" + "'", str23, "1/1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "35 1/35" + "'", str34, "35 1/35");
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 35.028572f + "'", float35 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
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
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 49.04d + "'", double53 == 49.04d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "3/5" + "'", str56, "3/5");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "3/5" + "'", str61, "3/5");
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "10" + "'", str83, "10");
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
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
        boolean boolean23 = fraction7.equals((java.lang.Object) fraction16);
        int int24 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction25.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction34 = fraction33.invert();
        boolean boolean35 = fraction32.equals((java.lang.Object) fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.reduce();
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction("10 2/5");
        org.apache.commons.lang3.math.Fraction fraction40 = fraction36.multiplyBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str43 = fraction42.toString();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction42.subtract(fraction44);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int48 = fraction47.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int51 = fraction50.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction47.abs();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction42.add(fraction47);
        java.lang.String str55 = fraction42.toProperString();
        int int56 = fraction39.compareTo(fraction42);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction16.divideBy(fraction42);
        java.lang.String str58 = fraction57.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3/5" + "'", str43, "3/5");
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "3/5" + "'", str55, "3/5");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "100/3" + "'", str58, "100/3");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        java.lang.String str8 = fraction7.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        int int30 = fraction28.getProperWhole();
        int int31 = fraction28.getDenominator();
        java.lang.String str32 = fraction28.toString();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.add(fraction28);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction28.negate();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-25/2" + "'", str25, "-25/2");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10/1" + "'", str32, "10/1");
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.invert();
        double double5 = fraction4.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int8 = fraction7.intValue();
        int int9 = fraction7.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 10, 1716);
        int int13 = fraction7.compareTo(fraction12);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.add(fraction19);
        java.lang.String str22 = fraction19.toProperString();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction15.divideBy(fraction19);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long26 = fraction25.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction19.subtract(fraction25);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction12.divideBy(fraction19);
        int int29 = fraction28.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction4.add(fraction28);
        byte byte31 = fraction28.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1d + "'", double5 == 0.1d);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("40");
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) 1);
        double double10 = fraction9.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction9.divideBy(fraction21);
        int int23 = fraction1.compareTo(fraction9);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) -35);
        boolean boolean26 = fraction9.equals((java.lang.Object) (byte) -35);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.02857142857143d + "'", double10 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4380, (-52));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int8 = fraction4.compareTo(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.reduce();
        java.lang.String str10 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction7.reduce();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction2.divideBy(fraction7);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        float float15 = fraction13.floatValue();
        java.lang.String str16 = fraction13.toString();
        long long17 = fraction13.longValue();
        int int18 = fraction13.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int22 = fraction21.intValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction13.divideBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean29 = fraction27.equals((java.lang.Object) (byte) 100);
        int int30 = fraction27.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction33.add(fraction36);
        java.lang.String str39 = fraction36.toProperString();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction32.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long43 = fraction42.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction36.subtract(fraction42);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction36.invert();
        int int46 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction27.multiplyBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction48 = fraction36.abs();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction21.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.abs();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction7.multiplyBy(fraction50);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1/5" + "'", str10, "1/5");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.4f + "'", float15 == 0.4f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2/5" + "'", str16, "2/5");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 33 + "'", int30 == 33);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10" + "'", str39, "10");
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.negate();
        float float9 = fraction8.floatValue();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction8.pow(2);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean19 = fraction17.equals((java.lang.Object) (byte) 100);
        int int20 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction17.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction13.multiplyBy(fraction22);
        float float25 = fraction22.floatValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction11.add(fraction22);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction4.add(fraction26);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 6);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction("100");
        long long17 = fraction16.longValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction14.multiplyBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.pow((int) (short) 1);
        java.lang.String str25 = fraction22.toProperString();
        float float26 = fraction22.floatValue();
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.reduce();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.abs();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction31.add(fraction34);
        long long36 = fraction35.longValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction27.add(fraction35);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.negate();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getReducedFraction(5, 52);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction41.abs();
        java.lang.String str43 = fraction41.toString();
        org.apache.commons.lang3.math.Fraction fraction45 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction47 = fraction45.pow((int) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        float float51 = fraction50.floatValue();
        org.apache.commons.lang3.math.Fraction fraction52 = fraction47.divideBy(fraction50);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.negate();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction52.add(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction41.add(fraction56);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction37.subtract(fraction56);
        boolean boolean59 = fraction16.equals((java.lang.Object) fraction58);
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
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35 1/35" + "'", str25, "35 1/35");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 35.028572f + "'", float26 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "5/52" + "'", str43, "5/52");
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-10.0f) + "'", float51 == (-10.0f));
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        long long3 = fraction1.longValue();
        int int4 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        int int14 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction16 = fraction12.invert();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, 1226, (int) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        float float11 = fraction9.floatValue();
        java.lang.String str12 = fraction9.toString();
        long long13 = fraction9.longValue();
        int int14 = fraction9.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction9.divideBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction4.add(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction4.negate();
        int int22 = fraction21.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction3.multiplyBy(fraction21);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        float float28 = fraction26.floatValue();
        java.lang.String str29 = fraction26.toString();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int32 = fraction31.intValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction31.invert();
        java.lang.String str34 = fraction31.toProperString();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction31.subtract(fraction37);
        int int39 = fraction38.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction38.divideBy(fraction42);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction26.subtract(fraction42);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction25.multiplyBy(fraction44);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction21.add(fraction45);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction46.negate();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3/5" + "'", str5, "3/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.4f + "'", float11 == 0.4f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.4f + "'", float28 == 0.4f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "10" + "'", str34, "10");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        org.apache.commons.lang3.math.Fraction fraction20 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int24 = fraction23.intValue();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int27 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction23.add(fraction26);
        java.lang.String str29 = fraction26.toProperString();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction22.divideBy(fraction26);
        int int31 = fraction26.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int35 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int38 = fraction37.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction34.add(fraction37);
        java.lang.String str40 = fraction37.toProperString();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction33.divideBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction33.pow((int) (byte) 0);
        double double44 = fraction43.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.negate();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction26.divideBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction52 = fraction50.pow((int) (short) 1);
        java.lang.String str53 = fraction50.toProperString();
        int int54 = fraction50.intValue();
        int int55 = fraction50.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction56 = fraction46.subtract(fraction50);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction20.subtract(fraction50);
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10" + "'", str29, "10");
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10" + "'", str40, "10");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "35 1/35" + "'", str53, "35 1/35");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction5.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction17.pow((int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.pow((int) (short) 1);
        java.lang.String str27 = fraction24.toProperString();
        float float28 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.negate();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction33.add(fraction36);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction33.abs();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction33.abs();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction30.add(fraction40);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction29.multiplyBy(fraction41);
        float float43 = fraction42.floatValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction42.invert();
        float float45 = fraction44.floatValue();
        java.lang.Object obj46 = null;
        boolean boolean47 = fraction44.equals(obj46);
        float float48 = fraction44.floatValue();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction17.add(fraction44);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction49.reduce();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "35 1/35" + "'", str27, "35 1/35");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 35.028572f + "'", float28 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 49.04f + "'", float43 == 49.04f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.020391516f + "'", float45 == 0.020391516f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.020391516f + "'", float48 == 0.020391516f);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.reduce();
        int int16 = fraction15.getNumerator();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.4f);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        int int8 = fraction7.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int15 = fraction14.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int18 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = fraction14.add(fraction17);
        org.apache.commons.lang3.math.Fraction fraction20 = fraction14.abs();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction9.add(fraction14);
        int int22 = fraction21.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.reduce();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction7.divideBy(fraction23);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction1.subtract(fraction7);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3/5" + "'", str10, "3/5");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/4");
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.abs();
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction6.abs();
        boolean boolean10 = fraction1.equals((java.lang.Object) fraction6);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        int int32 = fraction25.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int35 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction34.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str38 = fraction37.toString();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.subtract(fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction34.subtract(fraction37);
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
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction63 = fraction61.pow((int) (short) 1);
        java.lang.String str64 = fraction61.toProperString();
        float float65 = fraction61.floatValue();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction61.reduce();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction68 = fraction67.invert();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction67.negate();
        org.apache.commons.lang3.math.Fraction fraction70 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int71 = fraction70.intValue();
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int74 = fraction73.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction75 = fraction70.add(fraction73);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction70.abs();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction70.abs();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction67.add(fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction66.multiplyBy(fraction78);
        org.apache.commons.lang3.math.Fraction fraction80 = fraction66.reduce();
        int int81 = fraction48.compareTo(fraction80);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction42.subtract(fraction48);
        float float83 = fraction42.floatValue();
        float float84 = fraction42.floatValue();
        org.apache.commons.lang3.math.Fraction fraction85 = fraction25.subtract(fraction42);
        org.apache.commons.lang3.math.Fraction fraction87 = fraction85.pow(0);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "3/5" + "'", str38, "3/5");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
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
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "35 1/35" + "'", str64, "35 1/35");
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 35.028572f + "'", float65 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 9.4f + "'", float83 == 9.4f);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 9.4f + "'", float84 == 9.4f);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(fraction87);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10.0f);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction16.invert();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str20 = fraction19.toString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.invert();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction19.subtract(fraction21);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.subtract(fraction19);
        org.apache.commons.lang3.math.Fraction fraction25 = fraction24.reduce();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.pow((int) (short) 1);
        double double32 = fraction31.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int39 = fraction38.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction35.add(fraction38);
        java.lang.String str41 = fraction38.toProperString();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction34.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction38.negate();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction31.divideBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction45 = fraction43.invert();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction25.add(fraction45);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.invert();
        float float51 = fraction50.floatValue();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction50.pow(5);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction45.add(fraction50);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction54.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction57 = fraction14.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction57.pow(9);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction10.add(fraction59);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction59.abs();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "3/5" + "'", str20, "3/5");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.02857142857143d + "'", double32 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "10" + "'", str41, "10");
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.1f + "'", float51 == 0.1f);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        java.lang.String str25 = fraction24.toString();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long33 = fraction32.longValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.intValue();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.invert();
        java.lang.String str38 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction35.subtract(fraction41);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.invert();
        float float45 = fraction43.floatValue();
        int int46 = fraction43.getDenominator();
        java.lang.String str47 = fraction43.toString();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction42.subtract(fraction43);
        int int49 = fraction43.intValue();
        int int50 = fraction43.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction32.multiplyBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction43.abs();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction29.subtract(fraction52);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction24.subtract(fraction29);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction57.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int61 = fraction60.intValue();
        org.apache.commons.lang3.math.Fraction fraction62 = fraction60.invert();
        java.lang.String str63 = fraction60.toProperString();
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction60.subtract(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.invert();
        float float70 = fraction68.floatValue();
        int int71 = fraction68.getDenominator();
        java.lang.String str72 = fraction68.toString();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction67.subtract(fraction68);
        int int74 = fraction73.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction77 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        boolean boolean78 = fraction73.equals((java.lang.Object) fraction77);
        org.apache.commons.lang3.math.Fraction fraction79 = fraction58.divideBy(fraction77);
        org.apache.commons.lang3.math.Fraction fraction81 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 33);
        double double82 = fraction81.doubleValue();
        long long83 = fraction81.longValue();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction77.multiplyBy(fraction81);
        org.apache.commons.lang3.math.Fraction fraction85 = fraction24.subtract(fraction77);
        long long86 = fraction77.longValue();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0/1" + "'", str25, "0/1");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1/1" + "'", str47, "1/1");
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "10" + "'", str63, "10");
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1/1" + "'", str72, "1/1");
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 19 + "'", int74 == 19);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 33.0d + "'", double82 == 33.0d);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 33L + "'", long83 == 33L);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 48L + "'", long86 == 48L);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        int int32 = fraction0.getProperNumerator();
        double double33 = fraction0.doubleValue();
        short short34 = fraction0.shortValue();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.4d + "'", double33 == 0.4d);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-64190/1839");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        float float4 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean11 = fraction9.equals((java.lang.Object) (byte) 100);
        int int12 = fraction9.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int19 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction15.add(fraction18);
        java.lang.String str21 = fraction18.toProperString();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction14.divideBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long25 = fraction24.longValue();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction18.subtract(fraction24);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction18.invert();
        int int28 = fraction18.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction9.multiplyBy(fraction18);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction5.add(fraction18);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int34 = fraction33.intValue();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int37 = fraction36.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction33.add(fraction36);
        java.lang.String str39 = fraction36.toProperString();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction32.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction32.pow((int) (byte) 0);
        int int43 = fraction32.intValue();
        int int44 = fraction30.compareTo(fraction32);
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int50 = fraction49.intValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.invert();
        java.lang.String str52 = fraction49.toProperString();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction49.subtract(fraction55);
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction62 = fraction60.pow((int) (short) 1);
        java.lang.String str63 = fraction60.toProperString();
        float float64 = fraction60.floatValue();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction60.reduce();
        org.apache.commons.lang3.math.Fraction fraction66 = fraction55.divideBy(fraction60);
        org.apache.commons.lang3.math.Fraction fraction67 = fraction47.subtract(fraction66);
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction47.divideBy(fraction68);
        int int70 = fraction32.compareTo(fraction47);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction72 = fraction1.subtract(fraction71);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "10" + "'", str39, "10");
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "10" + "'", str52, "10");
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "35 1/35" + "'", str63, "35 1/35");
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 35.028572f + "'", float64 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        float float3 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow(2);
        int int6 = fraction5.getProperNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(21, (int) (short) 5);
        java.lang.String str3 = fraction2.toProperString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4 1/5" + "'", str3, "4 1/5");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 10, (int) (short) 35);
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
        org.apache.commons.lang3.math.Fraction fraction28 = fraction6.multiplyBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction1.multiplyBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction28.abs();
        java.lang.Class<?> wildcardClass33 = fraction32.getClass();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1/1" + "'", str23, "1/1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean16 = fraction14.equals((java.lang.Object) (byte) 100);
        int int17 = fraction14.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction14.compareTo(fraction19);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction10.multiplyBy(fraction19);
        boolean boolean22 = fraction8.equals((java.lang.Object) fraction21);
        long long23 = fraction21.longValue();
        float float24 = fraction21.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-9L));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        org.apache.commons.lang3.math.Fraction fraction17 = fraction16.abs();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 58, (int) (byte) 97);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction16.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction21.abs();
        java.lang.String str23 = fraction22.toProperString();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "39/97" + "'", str23, "39/97");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        org.apache.commons.lang3.math.Fraction fraction15 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction5.pow(2);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction((-35), 25, (int) (short) 100);
        int int22 = fraction5.compareTo(fraction21);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction5.invert();
        java.lang.Class<?> wildcardClass24 = fraction5.getClass();
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
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        org.apache.commons.lang3.math.Fraction fraction20 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction22.negate();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 1);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction41 = fraction39.pow((int) (short) 1);
        java.lang.String str42 = fraction39.toProperString();
        float float43 = fraction39.floatValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction34.divideBy(fraction39);
        org.apache.commons.lang3.math.Fraction fraction46 = fraction26.subtract(fraction45);
        boolean boolean47 = fraction22.equals((java.lang.Object) fraction46);
        boolean boolean48 = fraction20.equals((java.lang.Object) fraction46);
        int int49 = fraction46.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "35 1/35" + "'", str42, "35 1/35");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 35.028572f + "'", float43 == 35.028572f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-9) + "'", int49 == (-9));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', 0, 9);
        java.lang.String str4 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "468/9" + "'", str4, "468/9");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(40.0d);
        int int2 = fraction1.intValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        org.apache.commons.lang3.math.Fraction fraction21 = fraction11.abs();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 2);
        org.apache.commons.lang3.math.Fraction fraction26 = fraction24.pow(2);
        int int27 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.ONE;
        int int29 = fraction28.getProperWhole();
        long long30 = fraction28.longValue();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction32.add(fraction35);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction32.abs();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction32.abs();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        boolean boolean42 = fraction39.equals((java.lang.Object) fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction40.reduce();
        int int44 = fraction43.getNumerator();
        int int45 = fraction43.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction28.add(fraction43);
        org.apache.commons.lang3.math.Fraction fraction48 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int49 = fraction48.intValue();
        org.apache.commons.lang3.math.Fraction fraction50 = fraction48.invert();
        java.lang.String str51 = fraction48.toProperString();
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction48.subtract(fraction54);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction28.add(fraction48);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction24.divideBy(fraction48);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction48.negate();
        int int59 = fraction11.compareTo(fraction48);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.negate();
        int int63 = fraction61.getNumerator();
        int int64 = fraction61.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction61.negate();
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getFraction(35, 10035, 10035);
        org.apache.commons.lang3.math.Fraction fraction70 = fraction61.add(fraction69);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction11.divideBy(fraction70);
        org.apache.commons.lang3.math.Fraction fraction72 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int73 = fraction72.intValue();
        org.apache.commons.lang3.math.Fraction fraction75 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int76 = fraction75.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction77 = fraction72.add(fraction75);
        org.apache.commons.lang3.math.Fraction fraction78 = fraction72.abs();
        org.apache.commons.lang3.math.Fraction fraction79 = fraction72.abs();
        org.apache.commons.lang3.math.Fraction fraction80 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str81 = fraction80.toString();
        org.apache.commons.lang3.math.Fraction fraction82 = fraction79.add(fraction80);
        long long83 = fraction80.longValue();
        org.apache.commons.lang3.math.Fraction fraction84 = fraction11.add(fraction80);
        int int85 = fraction84.getNumerator();
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
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "3/5" + "'", str81, "3/5");
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 8 + "'", int85 == 8);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        java.lang.String str56 = fraction36.toString();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction28.divideBy(fraction36);
        org.apache.commons.lang3.math.Fraction fraction58 = fraction28.reduce();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction28.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int61 = fraction60.intValue();
        org.apache.commons.lang3.math.Fraction fraction63 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int64 = fraction63.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction60.add(fraction63);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction60.abs();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction60.abs();
        org.apache.commons.lang3.math.Fraction fraction68 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.invert();
        boolean boolean70 = fraction67.equals((java.lang.Object) fraction68);
        org.apache.commons.lang3.math.Fraction fraction71 = fraction68.reduce();
        int int72 = fraction71.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction28.add(fraction71);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10/1" + "'", str56, "10/1");
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(fraction73);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1);
        int int5 = fraction4.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.multiplyBy(fraction4);
        long long7 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.intValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        int int13 = fraction12.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction12.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.reduce();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.negate();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int22 = fraction21.intValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int25 = fraction24.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction21.add(fraction24);
        java.lang.String str27 = fraction24.toProperString();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction20.divideBy(fraction24);
        float float29 = fraction24.floatValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int31 = fraction30.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.invert();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction24.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction34 = fraction17.multiplyBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction8.add(fraction34);
        double double36 = fraction34.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.06d + "'", double36 == 1.06d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, 1600);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 4, (-109));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        org.apache.commons.lang3.math.Fraction fraction13 = fraction8.pow((int) (byte) 1);
        java.lang.String str14 = fraction13.toProperString();
        long long15 = fraction13.longValue();
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
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-47), (int) (short) 30);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(2, (int) (short) 25);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.negate();
        org.apache.commons.lang3.math.Fraction fraction54 = fraction52.abs();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction4.multiplyBy(fraction54);
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int58 = fraction57.intValue();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction57.invert();
        java.lang.String str60 = fraction59.toString();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction59.negate();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction63 = fraction59.divideBy(fraction62);
        int int64 = fraction55.compareTo(fraction62);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3/5" + "'", str12, "3/5");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.02857142857143d + "'", double24 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.1f + "'", float43 == 0.1f);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1/10" + "'", str60, "1/10");
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction10 = fraction8.pow((int) (short) 1);
        java.lang.String str11 = fraction8.toProperString();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction1.divideBy(fraction8);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction8.pow((-2));
        java.lang.String str15 = fraction8.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 1/35" + "'", str11, "35 1/35");
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1226/35" + "'", str15, "1226/35");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 3, (int) (byte) -10);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction0.add(fraction9);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (-10));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.02857142857142857d);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction1.getDenominator();
        int int5 = fraction1.getProperNumerator();
        java.lang.String str6 = fraction1.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.invert();
        float float8 = fraction1.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10/1" + "'", str6, "10/1");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 100, 10035);
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int6 = fraction5.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int8 = fraction7.intValue();
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int11 = fraction10.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction7.add(fraction10);
        java.lang.String str13 = fraction10.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = fraction10.abs();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction5.divideBy(fraction14);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction4.divideBy(fraction15);
        short short17 = fraction16.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1672 + "'", short17 == (short) 1672);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        float float27 = fraction25.floatValue();
        java.lang.String str28 = fraction25.toString();
        long long29 = fraction25.longValue();
        int int30 = fraction25.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int34 = fraction33.intValue();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction25.divideBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int37 = fraction36.intValue();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction36.abs();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction36.abs();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction45 = fraction44.invert();
        boolean boolean46 = fraction43.equals((java.lang.Object) fraction44);
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.reduce();
        org.apache.commons.lang3.math.Fraction fraction50 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction51 = fraction50.invert();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction51.pow((int) (byte) 0);
        int int54 = fraction51.intValue();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction44.divideBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction56 = fraction25.divideBy(fraction44);
        double double57 = fraction56.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction20.divideBy(fraction56);
        org.apache.commons.lang3.math.Fraction fraction59 = fraction56.reduce();
        org.apache.commons.lang3.math.Fraction fraction62 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction63 = fraction62.invert();
        org.apache.commons.lang3.math.Fraction fraction65 = fraction63.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction66 = fraction65.invert();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction56.multiplyBy(fraction66);
        org.apache.commons.lang3.math.Fraction fraction69 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction71 = fraction69.pow((int) (byte) 10);
        long long72 = fraction69.longValue();
        org.apache.commons.lang3.math.Fraction fraction73 = fraction69.reduce();
        org.apache.commons.lang3.math.Fraction fraction74 = fraction67.divideBy(fraction69);
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
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.4f + "'", float27 == 0.4f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2/5" + "'", str28, "2/5");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.4d + "'", double57 == 0.4d);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1226);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.multiplyBy(fraction9);
        java.lang.String str11 = fraction4.toString();
        java.lang.String str12 = fraction4.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1/1" + "'", str11, "1/1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1/1" + "'", str12, "1/1");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (byte) 7);
        int int5 = fraction4.getProperNumerator();
        int int6 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-3));
        java.lang.String str2 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-3" + "'", str2, "-3");
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        int int31 = fraction30.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction30.reduce();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.4f);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction38 = fraction34.multiplyBy(fraction37);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction38.invert();
        org.apache.commons.lang3.math.Fraction fraction40 = fraction32.divideBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction41 = org.apache.commons.lang3.math.Fraction.ONE;
        int int42 = fraction41.getProperWhole();
        long long43 = fraction41.longValue();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction41.invert();
        java.lang.String str45 = fraction44.toProperString();
        org.apache.commons.lang3.math.Fraction fraction46 = fraction44.abs();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction38.divideBy(fraction46);
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction47.abs();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int53 = fraction52.intValue();
        org.apache.commons.lang3.math.Fraction fraction55 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int56 = fraction55.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction57 = fraction52.add(fraction55);
        java.lang.String str58 = fraction55.toProperString();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction51.divideBy(fraction55);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction61 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction63 = fraction51.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction64 = fraction63.invert();
        org.apache.commons.lang3.math.Fraction fraction67 = org.apache.commons.lang3.math.Fraction.getReducedFraction(700, 52);
        org.apache.commons.lang3.math.Fraction fraction68 = fraction64.multiplyBy(fraction67);
        boolean boolean69 = fraction49.equals((java.lang.Object) fraction68);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 40 + "'", int48 == 40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "10" + "'", str58, "10");
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) -20, (-17));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-10.4f));
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str10 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction9.subtract(fraction11);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction6.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction15 = fraction14.reduce();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.pow((int) (short) 1);
        double double22 = fraction21.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int26 = fraction25.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction25.add(fraction28);
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction24.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.negate();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction21.divideBy(fraction33);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction15.add(fraction35);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction0.divideBy(fraction15);
        org.apache.commons.lang3.math.Fraction fraction38 = fraction15.negate();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.invert();
        int int41 = fraction39.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction39.reduce();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.reduce();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction38.multiplyBy(fraction43);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3/5" + "'", str10, "3/5");
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.02857142857143d + "'", double22 == 35.02857142857143d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, 320);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str31 = fraction30.toString();
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.invert();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction30.subtract(fraction32);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction27.subtract(fraction30);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction35.reduce();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 35);
        org.apache.commons.lang3.math.Fraction fraction39 = fraction36.multiplyBy(fraction38);
        org.apache.commons.lang3.math.Fraction fraction40 = fraction39.abs();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction24.subtract(fraction40);
        int int42 = fraction24.getProperNumerator();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "3/5" + "'", str31, "3/5");
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.invert();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -109);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        org.apache.commons.lang3.math.Fraction fraction14 = fraction5.reduce();
        long long15 = fraction5.longValue();
        int int16 = fraction5.getProperNumerator();
        java.lang.String str17 = fraction5.toProperString();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 1, 3, 35);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean10 = fraction8.equals((java.lang.Object) (byte) 100);
        int int11 = fraction8.getProperWhole();
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
        org.apache.commons.lang3.math.Fraction fraction26 = fraction17.invert();
        int int27 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction8.multiplyBy(fraction17);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction17.abs();
        boolean boolean30 = fraction4.equals((java.lang.Object) fraction17);
        long long31 = fraction17.longValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) (byte) 100, 2);
        int int36 = fraction17.compareTo(fraction35);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
        java.lang.String str8 = fraction7.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.invert();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1/5" + "'", str8, "1/5");
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 20, (int) (byte) 35);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 35);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int10 = fraction6.compareTo(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction9.invert();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction4.multiplyBy(fraction12);
        org.apache.commons.lang3.math.Fraction fraction14 = fraction2.multiplyBy(fraction13);
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int18 = fraction17.intValue();
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int21 = fraction20.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = fraction17.add(fraction20);
        java.lang.String str23 = fraction20.toProperString();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction16.divideBy(fraction20);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long27 = fraction26.longValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction20.subtract(fraction26);
        int int29 = fraction26.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction32 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int33 = fraction32.intValue();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int36 = fraction35.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction32.add(fraction35);
        java.lang.String str38 = fraction35.toProperString();
        org.apache.commons.lang3.math.Fraction fraction39 = fraction31.divideBy(fraction35);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction31.pow((int) (byte) 0);
        double double42 = fraction41.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction43 = fraction41.negate();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction26.multiplyBy(fraction43);
        java.lang.String str45 = fraction44.toString();
        boolean boolean46 = fraction14.equals((java.lang.Object) fraction44);
        short short47 = fraction44.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-10/1" + "'", str45, "-10/1");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -10 + "'", short47 == (short) -10);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int2 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.reduce();
        float float7 = fraction6.floatValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.subtract(fraction6);
        int int8 = fraction5.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.ONE;
        int int10 = fraction9.getProperWhole();
        long long11 = fraction9.longValue();
        double double12 = fraction9.doubleValue();
        int int13 = fraction9.getDenominator();
        int int14 = fraction9.intValue();
        int int15 = fraction9.intValue();
        int int16 = fraction5.compareTo(fraction9);
        double double17 = fraction5.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int20 = fraction19.intValue();
        org.apache.commons.lang3.math.Fraction fraction21 = fraction19.invert();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int23 = fraction19.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction26.negate();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction22.divideBy(fraction27);
        org.apache.commons.lang3.math.Fraction fraction29 = fraction5.multiplyBy(fraction22);
        int int30 = fraction5.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction4.subtract(fraction5);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 32, (-102));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(27, 47);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        org.apache.commons.lang3.math.Fraction fraction33 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction33.invert();
        org.apache.commons.lang3.math.Fraction fraction37 = fraction23.subtract(fraction36);
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int41 = fraction40.intValue();
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int44 = fraction43.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction45 = fraction40.add(fraction43);
        java.lang.String str46 = fraction43.toProperString();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction39.divideBy(fraction43);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction39.pow((int) (byte) 0);
        double double50 = fraction49.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction49.negate();
        org.apache.commons.lang3.math.Fraction fraction52 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction53 = fraction52.invert();
        double double54 = fraction52.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction55 = fraction52.negate();
        boolean boolean56 = fraction51.equals((java.lang.Object) fraction52);
        org.apache.commons.lang3.math.Fraction fraction57 = fraction37.multiplyBy(fraction51);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 10, (int) (short) 35);
        int int62 = fraction61.getDenominator();
        int int63 = fraction61.intValue();
        org.apache.commons.lang3.math.Fraction fraction64 = fraction37.divideBy(fraction61);
        org.apache.commons.lang3.math.Fraction fraction66 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int67 = fraction66.intValue();
        org.apache.commons.lang3.math.Fraction fraction68 = fraction66.invert();
        org.apache.commons.lang3.math.Fraction fraction69 = fraction68.invert();
        long long70 = fraction69.longValue();
        org.apache.commons.lang3.math.Fraction fraction74 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 9, (int) (byte) 7);
        org.apache.commons.lang3.math.Fraction fraction75 = fraction69.subtract(fraction74);
        org.apache.commons.lang3.math.Fraction fraction76 = fraction64.divideBy(fraction69);
        int int77 = fraction64.getNumerator();
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
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "10" + "'", str46, "10");
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-10) + "'", int63 == (-10));
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 10L + "'", long70 == 10L);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-2779) + "'", int77 == (-2779));
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.intValue();
        int int8 = fraction6.getProperWhole();
        int int9 = fraction6.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction4.add(fraction6);
        long long11 = fraction10.longValue();
        org.apache.commons.lang3.math.Fraction fraction12 = fraction10.invert();
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 175, 175);
        org.apache.commons.lang3.math.Fraction fraction16 = fraction10.multiplyBy(fraction15);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20L + "'", long11 == 20L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 10035);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        int int10 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction12 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction13 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int14 = fraction13.intValue();
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int17 = fraction16.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = fraction13.add(fraction16);
        java.lang.String str19 = fraction16.toProperString();
        org.apache.commons.lang3.math.Fraction fraction20 = fraction12.divideBy(fraction16);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction12.pow((int) (byte) 0);
        double double23 = fraction22.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction5.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.pow((int) (short) 1);
        java.lang.String str32 = fraction29.toProperString();
        int int33 = fraction29.intValue();
        int int34 = fraction29.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction25.subtract(fraction29);
        byte byte36 = fraction29.byteValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "35 1/35" + "'", str32, "35 1/35");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 35 + "'", byte36 == (byte) 35);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction6.divideBy(fraction10);
        int int12 = fraction6.getDenominator();
        long long13 = fraction6.longValue();
        int int14 = fraction6.intValue();
        int int15 = fraction6.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(27, (int) (short) 3);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int8 = fraction4.compareTo(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int10 = fraction9.intValue();
        float float11 = fraction9.floatValue();
        java.lang.String str12 = fraction9.toString();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction4.subtract(fraction9);
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean19 = fraction17.equals((java.lang.Object) (byte) 100);
        int int20 = fraction17.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction17.compareTo(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction17.negate();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction9.divideBy(fraction17);
        int int26 = fraction9.intValue();
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int29 = fraction28.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        java.lang.String str31 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction35 = fraction28.subtract(fraction34);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction36.invert();
        float float38 = fraction36.floatValue();
        int int39 = fraction36.getDenominator();
        java.lang.String str40 = fraction36.toString();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction35.subtract(fraction36);
        int int42 = fraction36.intValue();
        int int43 = fraction36.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction9.add(fraction36);
        boolean boolean45 = fraction2.equals((java.lang.Object) fraction36);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.4f + "'", float11 == 0.4f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1/1" + "'", str40, "1/1");
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 48, 96);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 19, 49);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        org.apache.commons.lang3.math.Fraction fraction11 = fraction6.abs();
        java.lang.String str12 = fraction6.toProperString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2/5" + "'", str12, "2/5");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        org.apache.commons.lang3.math.Fraction fraction22 = fraction20.reduce();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction20.negate();
        int int24 = fraction20.getDenominator();
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
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (short) -10);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 33, (int) (byte) 3);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction6.multiplyBy(fraction9);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 19, (int) (byte) 23);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(97, 1226);
        int int3 = fraction2.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((-29), (int) (byte) 5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction6);
        int int8 = fraction6.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-301), (int) (short) 40, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        org.apache.commons.lang3.math.Fraction fraction26 = fraction25.abs();
        int int27 = fraction25.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean33 = fraction31.equals((java.lang.Object) (byte) 100);
        int int34 = fraction31.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int38 = fraction37.intValue();
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int41 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction37.add(fraction40);
        java.lang.String str43 = fraction40.toProperString();
        org.apache.commons.lang3.math.Fraction fraction44 = fraction36.divideBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        long long47 = fraction46.longValue();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction40.subtract(fraction46);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction40.invert();
        int int50 = fraction40.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction31.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction52 = fraction40.abs();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction25.divideBy(fraction52);
        float float54 = fraction53.floatValue();
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
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30625 + "'", int27 == 30625);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 33 + "'", int34 == 33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 9.0555043E-4f + "'", float54 == 9.0555043E-4f);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getNumerator();
        int int4 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction(35, 10035, 10035);
        org.apache.commons.lang3.math.Fraction fraction10 = fraction1.add(fraction9);
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
        org.apache.commons.lang3.math.Fraction fraction23 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction24 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int25 = fraction24.intValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int28 = fraction27.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction24.add(fraction27);
        java.lang.String str30 = fraction27.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction23.divideBy(fraction27);
        float float32 = fraction31.floatValue();
        double double33 = fraction31.doubleValue();
        int int34 = fraction31.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction19.subtract(fraction31);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction10.multiplyBy(fraction31);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(fraction5);
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.subtract(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.reduce();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int12 = fraction11.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction11.invert();
        java.lang.String str14 = fraction11.toProperString();
        org.apache.commons.lang3.math.Fraction fraction17 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction11.subtract(fraction17);
        int int19 = fraction18.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction23 = fraction18.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction9.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 100, 10035);
        int int28 = fraction27.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction24.multiplyBy(fraction27);
        float float31 = fraction24.floatValue();
        java.lang.String str32 = fraction24.toString();
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
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0/1" + "'", str32, "0/1");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("63752/175");
        int int2 = fraction1.getProperWhole();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 364 + "'", int2 == 364);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(21, 16);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) '#', (-1));
        int int8 = fraction7.getDenominator();
        int int9 = fraction7.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction10 = fraction3.divideBy(fraction7);
        java.lang.String str11 = fraction3.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/10" + "'", str4, "1/10");
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-35) + "'", int9 == (-35));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1/10" + "'", str11, "1/10");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, 0, 320);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("93/100");
        java.lang.String str2 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "93/100" + "'", str2, "93/100");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        org.apache.commons.lang3.math.Fraction fraction20 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction21 = fraction20.negate();
        float float22 = fraction20.floatValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction1.subtract(fraction20);
        org.apache.commons.lang3.math.Fraction fraction24 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction25 = org.apache.commons.lang3.math.Fraction.ONE;
        int int26 = fraction25.getProperWhole();
        long long27 = fraction25.longValue();
        org.apache.commons.lang3.math.Fraction fraction28 = fraction25.invert();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction1.divideBy(fraction28);
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.reduce();
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
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        java.lang.String str7 = fraction6.toString();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1/1" + "'", str7, "-1/1");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        java.lang.String str29 = fraction28.toProperString();
        org.apache.commons.lang3.math.Fraction fraction31 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        int int32 = fraction31.getDenominator();
        int int33 = fraction28.compareTo(fraction31);
        java.lang.String str34 = fraction31.toString();
        org.apache.commons.lang3.math.Fraction fraction35 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction37 = fraction35.add(fraction36);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-2), (int) (short) 100);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction40.invert();
        org.apache.commons.lang3.math.Fraction fraction42 = fraction36.multiplyBy(fraction40);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction42.invert();
        org.apache.commons.lang3.math.Fraction fraction44 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int45 = fraction44.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int48 = fraction47.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction49 = fraction44.add(fraction47);
        org.apache.commons.lang3.math.Fraction fraction50 = fraction44.abs();
        org.apache.commons.lang3.math.Fraction fraction51 = fraction44.abs();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction51.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction54 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int55 = fraction54.intValue();
        org.apache.commons.lang3.math.Fraction fraction57 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int58 = fraction57.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction54.add(fraction57);
        org.apache.commons.lang3.math.Fraction fraction60 = fraction51.add(fraction57);
        int int61 = fraction42.compareTo(fraction57);
        int int62 = fraction31.compareTo(fraction57);
        int int63 = fraction31.intValue();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "20" + "'", str29, "20");
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2/5" + "'", str34, "2/5");
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        int int11 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction13 = fraction1.pow(2);
        org.apache.commons.lang3.math.Fraction fraction15 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int16 = fraction15.intValue();
        org.apache.commons.lang3.math.Fraction fraction17 = fraction15.invert();
        java.lang.String str18 = fraction15.toProperString();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction22 = fraction15.subtract(fraction21);
        int int23 = fraction22.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction27 = fraction22.divideBy(fraction26);
        org.apache.commons.lang3.math.Fraction fraction28 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int29 = fraction28.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction28.invert();
        int int31 = fraction30.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction22.add(fraction30);
        org.apache.commons.lang3.math.Fraction fraction33 = fraction32.reduce();
        int int34 = fraction13.compareTo(fraction32);
        org.apache.commons.lang3.math.Fraction fraction37 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction40 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        org.apache.commons.lang3.math.Fraction fraction41 = fraction37.add(fraction40);
        double double42 = fraction40.doubleValue();
        int int43 = fraction13.compareTo(fraction40);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.01d + "'", double42 == 0.01d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        long long7 = fraction3.longValue();
        int int8 = fraction3.getProperWhole();
        float float9 = fraction3.floatValue();
        int int10 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction11 = fraction3.invert();
        int int12 = fraction11.getNumerator();
        int int13 = fraction11.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35 1/35" + "'", str6, "35 1/35");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.028572f + "'", float9 == 35.028572f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1226 + "'", int13 == 1226);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction10 = org.apache.commons.lang3.math.Fraction.getReducedFraction(3, 5);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction6.divideBy(fraction10);
        int int12 = fraction6.getDenominator();
        java.lang.String str13 = fraction6.toProperString();
        org.apache.commons.lang3.math.Fraction fraction14 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction16 = org.apache.commons.lang3.math.Fraction.getFraction("3/5");
        org.apache.commons.lang3.math.Fraction fraction17 = fraction14.add(fraction16);
        org.apache.commons.lang3.math.Fraction fraction18 = fraction17.invert();
        org.apache.commons.lang3.math.Fraction fraction21 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (-35));
        double double22 = fraction21.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction17.multiplyBy(fraction21);
        float float24 = fraction17.floatValue();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction6.subtract(fraction17);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        float float28 = fraction26.floatValue();
        java.lang.String str29 = fraction26.toString();
        long long30 = fraction26.longValue();
        int int31 = fraction26.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction34 = org.apache.commons.lang3.math.Fraction.getFraction(1, 100);
        int int35 = fraction34.intValue();
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.divideBy(fraction34);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction34.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction37.reduce();
        int int39 = fraction6.compareTo(fraction37);
        org.apache.commons.lang3.math.Fraction fraction43 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction44 = fraction43.abs();
        int int45 = fraction44.intValue();
        org.apache.commons.lang3.math.Fraction fraction47 = fraction44.pow((int) (byte) -1);
        boolean boolean48 = fraction37.equals((java.lang.Object) fraction47);
        org.apache.commons.lang3.math.Fraction fraction49 = fraction37.reduce();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2/5" + "'", str3, "2/5");
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 3/97" + "'", str13, "1 3/97");
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.02857142857142857d) + "'", double22 == (-0.02857142857142857d));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.4f + "'", float24 == 1.4f);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.4f + "'", float28 == 0.4f);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2/5" + "'", str29, "2/5");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fraction49);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        long long57 = fraction56.longValue();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction56.invert();
        org.apache.commons.lang3.math.Fraction fraction59 = fraction58.invert();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction8.multiplyBy(fraction58);
        double double61 = fraction60.doubleValue();
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
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "10" + "'", str43, "10");
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.0f + "'", float50 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1/1" + "'", str52, "1/1");
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.1d + "'", double61 == 0.1d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        org.apache.commons.lang3.math.Fraction fraction30 = fraction23.negate();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction30.abs();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction31.invert();
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
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        int int7 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction11 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        boolean boolean13 = fraction11.equals((java.lang.Object) (byte) 100);
        int int14 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction15 = fraction11.negate();
        int int16 = fraction11.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction18 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction19 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int20 = fraction19.intValue();
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int23 = fraction22.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction24 = fraction19.add(fraction22);
        java.lang.String str25 = fraction22.toProperString();
        org.apache.commons.lang3.math.Fraction fraction26 = fraction18.divideBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction18.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction30 = fraction29.invert();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction29.negate();
        float float32 = fraction31.floatValue();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction28.subtract(fraction31);
        int int34 = fraction31.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction11.multiplyBy(fraction31);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction5.divideBy(fraction11);
        org.apache.commons.lang3.math.Fraction fraction37 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction38 = fraction5.negate();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.abs();
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
        org.apache.commons.lang3.math.Fraction fraction33 = fraction11.invert();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction5.divideBy(fraction33);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
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
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        org.apache.commons.lang3.math.Fraction fraction24 = fraction22.invert();
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int28 = fraction27.intValue();
        org.apache.commons.lang3.math.Fraction fraction30 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int31 = fraction30.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction32 = fraction27.add(fraction30);
        java.lang.String str33 = fraction30.toProperString();
        org.apache.commons.lang3.math.Fraction fraction34 = fraction26.divideBy(fraction30);
        org.apache.commons.lang3.math.Fraction fraction36 = fraction26.pow((int) (byte) 0);
        int int37 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction38 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int39 = fraction38.intValue();
        float float40 = fraction38.floatValue();
        java.lang.String str41 = fraction38.toString();
        int int42 = fraction26.compareTo(fraction38);
        org.apache.commons.lang3.math.Fraction fraction43 = fraction22.subtract(fraction26);
        org.apache.commons.lang3.math.Fraction fraction44 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction46 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int47 = fraction46.intValue();
        org.apache.commons.lang3.math.Fraction fraction48 = fraction46.invert();
        org.apache.commons.lang3.math.Fraction fraction49 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str50 = fraction49.toString();
        org.apache.commons.lang3.math.Fraction fraction51 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction52 = fraction51.invert();
        org.apache.commons.lang3.math.Fraction fraction53 = fraction49.subtract(fraction51);
        org.apache.commons.lang3.math.Fraction fraction54 = fraction46.subtract(fraction49);
        org.apache.commons.lang3.math.Fraction fraction55 = fraction54.reduce();
        org.apache.commons.lang3.math.Fraction fraction56 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        boolean boolean57 = fraction54.equals((java.lang.Object) fraction56);
        double double58 = fraction56.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction60 = org.apache.commons.lang3.math.Fraction.getFraction((double) 3);
        org.apache.commons.lang3.math.Fraction fraction61 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction62 = fraction61.invert();
        boolean boolean63 = fraction60.equals((java.lang.Object) fraction62);
        org.apache.commons.lang3.math.Fraction fraction65 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int66 = fraction65.intValue();
        org.apache.commons.lang3.math.Fraction fraction67 = fraction65.invert();
        java.lang.String str68 = fraction65.toProperString();
        org.apache.commons.lang3.math.Fraction fraction71 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction72 = fraction65.subtract(fraction71);
        org.apache.commons.lang3.math.Fraction fraction73 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction74 = fraction73.invert();
        float float75 = fraction73.floatValue();
        int int76 = fraction73.getDenominator();
        java.lang.String str77 = fraction73.toString();
        org.apache.commons.lang3.math.Fraction fraction78 = fraction72.subtract(fraction73);
        int int79 = fraction78.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction80 = fraction60.subtract(fraction78);
        int int81 = fraction56.compareTo(fraction80);
        org.apache.commons.lang3.math.Fraction fraction82 = fraction44.add(fraction56);
        org.apache.commons.lang3.math.Fraction fraction84 = fraction82.pow((int) (byte) 4);
        int int85 = fraction82.getProperWhole();
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
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10" + "'", str33, "10");
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.4f + "'", float40 == 0.4f);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2/5" + "'", str41, "2/5");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "3/5" + "'", str50, "3/5");
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.25d + "'", double58 == 0.25d);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "10" + "'", str68, "10");
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 1.0f + "'", float75 == 1.0f);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1/1" + "'", str77, "1/1");
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 19 + "'", int79 == 19);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        long long25 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction27 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction28 = fraction27.negate();
        int int29 = fraction0.compareTo(fraction28);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        java.lang.String str4 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10/1" + "'", str4, "10/1");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        float float3 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow(2);
        double double6 = fraction2.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.subtract(fraction8);
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
        org.apache.commons.lang3.math.Fraction fraction27 = fraction7.multiplyBy(fraction19);
        double double28 = fraction27.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction29 = fraction27.invert();
        org.apache.commons.lang3.math.Fraction fraction30 = fraction2.add(fraction29);
        int int31 = fraction30.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1/1" + "'", str23, "1/1");
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.add(fraction1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-2), (int) (short) 100);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.multiplyBy(fraction5);
        org.apache.commons.lang3.math.Fraction fraction9 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 1);
        int int10 = fraction1.compareTo(fraction9);
        org.apache.commons.lang3.math.Fraction fraction11 = fraction1.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        long long22 = fraction21.longValue();
        org.apache.commons.lang3.math.Fraction fraction23 = fraction21.negate();
        float float24 = fraction21.floatValue();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, 48);
        long long3 = fraction2.longValue();
        byte byte4 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -6, (int) (short) 9);
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
        org.apache.commons.lang3.math.Fraction fraction22 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        java.lang.String str23 = fraction22.toString();
        int int24 = fraction22.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction25 = fraction21.multiplyBy(fraction22);
        org.apache.commons.lang3.math.Fraction fraction26 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int27 = fraction26.intValue();
        org.apache.commons.lang3.math.Fraction fraction29 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int30 = fraction29.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction31 = fraction26.add(fraction29);
        org.apache.commons.lang3.math.Fraction fraction32 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction33 = fraction26.abs();
        org.apache.commons.lang3.math.Fraction fraction35 = fraction33.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction36 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int37 = fraction36.intValue();
        org.apache.commons.lang3.math.Fraction fraction39 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int40 = fraction39.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction41 = fraction36.add(fraction39);
        org.apache.commons.lang3.math.Fraction fraction42 = fraction33.add(fraction39);
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
        org.apache.commons.lang3.math.Fraction fraction57 = fraction48.abs();
        org.apache.commons.lang3.math.Fraction fraction58 = fraction33.divideBy(fraction57);
        int int59 = fraction58.intValue();
        org.apache.commons.lang3.math.Fraction fraction60 = fraction22.multiplyBy(fraction58);
        org.apache.commons.lang3.math.Fraction fraction61 = fraction2.add(fraction60);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1/3" + "'", str23, "1/3");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
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
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
    }
}

