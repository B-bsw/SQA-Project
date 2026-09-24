package org.apache.commons.math.fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.TWO;
        int int5 = fraction4.intValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction9.divide(fraction13);
        boolean boolean16 = fraction9.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        boolean boolean28 = fraction21.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.negate();
        boolean boolean30 = fraction9.equals((java.lang.Object) fraction29);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction40.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction38.subtract(fraction40);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction29.divide(fraction51);
        int int53 = fraction4.compareTo(fraction51);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction57.divide(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction63.add(fraction67);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction61.subtract(fraction63);
        org.apache.commons.math.fraction.Fraction fraction78 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction78.divide(fraction82);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction63.add(fraction78);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction4.subtract(fraction63);
        int int86 = fraction3.compareTo(fraction63);
        long long87 = fraction63.longValue();
        org.apache.commons.math.fraction.Fraction fraction88 = fraction63.negate();
        int int89 = fraction63.intValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 2L + "'", long87 == 2L);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-10.0f), (double) (short) 18, (int) (short) -2);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -5, 5);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction9.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction7.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction9.add(fraction24);
        float float31 = fraction30.floatValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction30.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((int) (short) 100, 12);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.multiply(fraction35);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 12.0f + "'", float31 == 12.0f);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.negate();
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        boolean boolean14 = fraction7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.divide(fraction24);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction16.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction7.multiply(fraction16);
        int int38 = fraction16.getNumerator();
        boolean boolean40 = fraction16.equals((java.lang.Object) (short) 20);
        int int41 = fraction16.intValue();
        double double42 = fraction16.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction16.divide(fraction44);
        float float46 = fraction44.floatValue();
        float float47 = fraction44.floatValue();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction44.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction2.add(fraction44);
        long long50 = fraction44.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.0d + "'", double42 == 2.0d);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        float float11 = fraction3.floatValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.add(fraction17);
        double double24 = fraction13.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction25.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction25.add(fraction39);
        float float46 = fraction39.floatValue();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction13.multiply(fraction39);
        int int48 = fraction12.compareTo(fraction47);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction47.abs();
        int int50 = fraction47.intValue();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction47.reciprocal();
        float float52 = fraction51.floatValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20 + "'", int50 == 20);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.05f + "'", float52 == 0.05f);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        float float1 = fraction0.floatValue();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.divide(fraction9);
        boolean boolean12 = fraction5.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction5.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        boolean boolean24 = fraction17.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction26.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction40.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction26.add(fraction40);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction17.multiply(fraction26);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction13.divide(fraction47);
        int int49 = fraction0.compareTo(fraction47);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction0.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction51 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction51.add(fraction55);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction65.divide(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction51.add(fraction65);
        int int72 = fraction50.compareTo(fraction65);
        long long73 = fraction65.longValue();
        org.apache.commons.math.fraction.Fraction fraction75 = new org.apache.commons.math.fraction.Fraction((double) 0.5f);
        int int76 = fraction75.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction77 = fraction75.abs();
        org.apache.commons.math.fraction.Fraction fraction78 = fraction65.add(fraction75);
        org.apache.commons.math.fraction.Fraction fraction80 = new org.apache.commons.math.fraction.Fraction((double) (byte) 20);
        org.apache.commons.math.fraction.Fraction fraction84 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long85 = fraction84.longValue();
        org.apache.commons.math.fraction.Fraction fraction88 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction89 = fraction88.abs();
        int int90 = fraction84.compareTo(fraction88);
        org.apache.commons.math.fraction.Fraction fraction91 = fraction80.multiply(fraction88);
        org.apache.commons.math.fraction.Fraction fraction92 = fraction88.reciprocal();
        boolean boolean93 = fraction75.equals((java.lang.Object) fraction92);
        int int94 = fraction92.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 100L + "'", long85 == 100L);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 13 + "'", int94 == 13);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 12, (-30));
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction2.multiply(fraction11);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        boolean boolean24 = fraction17.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        boolean boolean36 = fraction29.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction38.add(fraction42);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction52.divide(fraction56);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction38.add(fraction52);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction29.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction25.divide(fraction59);
        int int61 = fraction59.getDenominator();
        double double62 = fraction59.doubleValue();
        boolean boolean63 = fraction11.equals((java.lang.Object) fraction59);
        int int64 = fraction59.getDenominator();
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 20.0d + "'", double62 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 8L, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 8 to fraction (-7/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(125, 2);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 62 + "'", short3 == (short) 62);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        long long11 = fraction10.longValue();
        int int12 = fraction10.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double8 = fraction7.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction10 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        double double23 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        float float45 = fraction38.floatValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction12.multiply(fraction38);
        int int47 = fraction46.getNumerator();
        int int48 = fraction46.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction46.negate();
        double double50 = fraction46.doubleValue();
        boolean boolean51 = fraction10.equals((java.lang.Object) fraction46);
        float float52 = fraction10.floatValue();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) 12);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction(8, (int) (byte) 2);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((int) (short) 4, 10);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction57.multiply(fraction60);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction54.subtract(fraction61);
        int int63 = fraction10.compareTo(fraction61);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction7.subtract(fraction61);
        boolean boolean65 = fraction1.equals((java.lang.Object) fraction64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.0d + "'", double23 == 2.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 20.0d + "'", double50 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        boolean boolean36 = fraction12.equals((java.lang.Object) (short) 20);
        int int37 = fraction12.intValue();
        double double38 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction39.abs();
        int int41 = fraction40.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction44 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 100);
        int int45 = fraction44.getDenominator();
        int int46 = fraction44.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction40.multiply(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        int int57 = fraction56.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction58 = fraction56.reciprocal();
        double double59 = fraction56.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction63 = fraction56.divide(fraction62);
        int int64 = fraction40.compareTo(fraction63);
        double double65 = fraction40.doubleValue();
        float float66 = fraction40.floatValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.0d + "'", double38 == 2.0d);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.5d + "'", double65 == 0.5d);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.5f + "'", float66 == 0.5f);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        boolean boolean7 = fraction3.equals((java.lang.Object) 12);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fraction3.compareTo(fraction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (short) -100, (int) (short) -30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -100 to fraction (101/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction38 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 100, (int) (short) 2);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        boolean boolean49 = fraction42.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction42.negate();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        boolean boolean61 = fraction54.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction54.negate();
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction63.add(fraction67);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction77.divide(fraction81);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction63.add(fraction77);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction54.multiply(fraction63);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction50.divide(fraction84);
        int int86 = fraction50.intValue();
        org.apache.commons.math.fraction.Fraction fraction87 = fraction38.multiply(fraction50);
        org.apache.commons.math.fraction.Fraction fraction91 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction92 = fraction91.negate();
        org.apache.commons.math.fraction.Fraction fraction93 = fraction91.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction94 = fraction87.add(fraction93);
        org.apache.commons.math.fraction.Fraction fraction95 = fraction35.subtract(fraction87);
        org.apache.commons.math.fraction.Fraction fraction96 = fraction95.abs();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-10) + "'", int86 == (-10));
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertNotNull(fraction96);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 4, (double) 9, 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction11.divide(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction47.add(fraction51);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction61.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction47.add(fraction61);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction11.divide(fraction47);
        org.apache.commons.math.fraction.Fraction fraction69 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction73.divide(fraction77);
        org.apache.commons.math.fraction.Fraction fraction79 = fraction69.add(fraction73);
        double double80 = fraction69.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction81 = fraction68.add(fraction69);
        int int82 = fraction69.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction83 = fraction69.reciprocal();
        float float84 = fraction83.floatValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 2.0d + "'", double80 == 2.0d);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.5f + "'", float84 == 0.5f);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction3.negate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        boolean boolean36 = fraction12.equals((java.lang.Object) (short) 20);
        long long37 = fraction12.longValue();
        float float38 = fraction12.floatValue();
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long43 = fraction42.longValue();
        float float44 = fraction42.floatValue();
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.multiply(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction12.subtract(fraction46);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction48.add(fraction51);
        int int53 = fraction52.intValue();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction52.negate();
        java.lang.Class<?> wildcardClass55 = fraction54.getClass();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.0f + "'", float38 == 2.0f);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 33 + "'", int53 == 33);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) -15, (int) (byte) -5);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        float float14 = fraction13.floatValue();
        float float15 = fraction13.floatValue();
        int int16 = fraction13.getDenominator();
        int int17 = fraction12.compareTo(fraction13);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        boolean boolean28 = fraction21.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction30.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction30.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction21.multiply(fraction30);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        boolean boolean62 = fraction60.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction63 = fraction30.subtract(fraction60);
        org.apache.commons.math.fraction.Fraction fraction64 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction65 = fraction63.subtract(fraction64);
        double double66 = fraction65.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction12.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        boolean boolean72 = fraction12.equals((java.lang.Object) (-1.0d));
        int int73 = fraction12.intValue();
        int int74 = fraction12.intValue();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction12.negate();
        int int76 = fraction75.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-2) + "'", int73 == (-2));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-2) + "'", int74 == (-2));
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(1, (int) (short) -2);
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction(10.0d);
        long long16 = fraction15.longValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction19.add(fraction23);
        double double30 = fraction19.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction31.add(fraction45);
        float float52 = fraction45.floatValue();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction19.multiply(fraction45);
        int int54 = fraction53.getNumerator();
        int int55 = fraction53.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction53.negate();
        double double57 = fraction53.doubleValue();
        boolean boolean58 = fraction17.equals((java.lang.Object) fraction53);
        float float59 = fraction17.floatValue();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction15.multiply(fraction17);
        int int61 = fraction11.compareTo(fraction17);
        float float62 = fraction17.floatValue();
        org.apache.commons.math.fraction.Fraction fraction63 = fraction2.multiply(fraction17);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.0d + "'", double30 == 2.0d);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 10.0f + "'", float52 == 10.0f);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20 + "'", int54 == 20);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 20.0d + "'", double57 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertNotNull(fraction63);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        float float10 = fraction9.floatValue();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.multiply(fraction9);
        int int14 = fraction8.getDenominator();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(319, (int) (byte) 33);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-30), (double) 3, (int) (byte) -15);
        int int4 = fraction3.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.abs();
        int int6 = fraction3.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-30) + "'", int4 == (-30));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-30) + "'", int6 == (-30));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) 'a');
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction15.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction6.multiply(fraction15);
        int int37 = fraction6.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) 'a', (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction46.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = org.apache.commons.math.fraction.Fraction.TWO;
        float float53 = fraction52.floatValue();
        float float54 = fraction52.floatValue();
        int int55 = fraction52.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.multiply(fraction52);
        int int57 = fraction42.compareTo(fraction51);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction61.divide(fraction65);
        boolean boolean68 = fraction61.equals((java.lang.Object) (byte) 10);
        float float69 = fraction61.floatValue();
        int int70 = fraction61.intValue();
        org.apache.commons.math.fraction.Fraction fraction71 = fraction61.abs();
        org.apache.commons.math.fraction.Fraction fraction72 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction80 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction76.divide(fraction80);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction72.add(fraction76);
        org.apache.commons.math.fraction.Fraction fraction86 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction90 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction91 = fraction86.divide(fraction90);
        org.apache.commons.math.fraction.Fraction fraction92 = fraction72.add(fraction86);
        org.apache.commons.math.fraction.Fraction fraction93 = fraction71.divide(fraction72);
        org.apache.commons.math.fraction.Fraction fraction94 = fraction42.multiply(fraction93);
        int int95 = fraction42.intValue();
        int int96 = fraction6.compareTo(fraction42);
        org.apache.commons.math.fraction.Fraction fraction97 = fraction2.subtract(fraction42);
        int int98 = fraction2.getNumerator();
        byte byte99 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 2.0f + "'", float53 == 2.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 2.0f + "'", float54 == 2.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 10.0f + "'", float69 == 10.0f);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertNotNull(fraction97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) 0 + "'", byte99 == (byte) 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.add(fraction11);
        long long14 = fraction13.longValue();
        org.apache.commons.math.fraction.Fraction fraction15 = fraction1.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        boolean boolean26 = fraction19.equals((java.lang.Object) (byte) 10);
        float float27 = fraction19.floatValue();
        int int28 = fraction19.intValue();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction19.abs();
        java.lang.Class<?> wildcardClass30 = fraction29.getClass();
        boolean boolean31 = fraction15.equals((java.lang.Object) fraction29);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction29.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction32.multiply(fraction35);
        float float37 = fraction35.floatValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 4, 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        boolean boolean36 = fraction12.equals((java.lang.Object) (short) 20);
        int int37 = fraction12.intValue();
        double double38 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction12.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction12.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        boolean boolean52 = fraction48.equals((java.lang.Object) 12);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction43.multiply(fraction48);
        java.lang.Class<?> wildcardClass54 = fraction53.getClass();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.0d + "'", double38 == 2.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1.0f, (double) 11, (int) 'a');
        int int4 = fraction3.intValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 25);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1000, 200);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        boolean boolean23 = fraction16.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction25.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction25.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction16.multiply(fraction25);
        int int47 = fraction25.getNumerator();
        boolean boolean49 = fraction25.equals((java.lang.Object) (short) 20);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction0.subtract(fraction25);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction50.negate();
        int int52 = fraction50.intValue();
        double double53 = fraction50.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction50.abs();
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (-12.0f), (double) (short) 100, 10);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.multiply(fraction58);
        int int60 = fraction54.intValue();
        org.apache.commons.math.fraction.Fraction fraction61 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction65.divide(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction61.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction75 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction79 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction75.divide(fraction79);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction61.add(fraction75);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction54.divide(fraction75);
        int int83 = fraction82.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 20, (-101));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) '4', (int) (short) 8);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        float float6 = fraction2.floatValue();
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.divide(fraction15);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction7.add(fraction11);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        org.apache.commons.math.fraction.Fraction fraction27 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.divide(fraction35);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction27.add(fraction31);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction25.subtract(fraction27);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction17.subtract(fraction27);
        int int40 = fraction17.intValue();
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        int int50 = fraction49.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction49.reciprocal();
        double double52 = fraction49.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction56 = fraction49.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction17.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction2.divide(fraction17);
        byte byte59 = fraction17.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 12 + "'", int40 == 12);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 12 + "'", byte59 == (byte) 12);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.1f, (int) (byte) 0);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -1, 10);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double8 = fraction7.doubleValue();
        boolean boolean10 = fraction7.equals((java.lang.Object) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction2.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        int int14 = fraction13.intValue();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.divide(fraction22);
        boolean boolean25 = fraction18.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        boolean boolean37 = fraction30.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction30.negate();
        boolean boolean39 = fraction18.equals((java.lang.Object) fraction38);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction43.divide(fraction47);
        org.apache.commons.math.fraction.Fraction fraction49 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction53.divide(fraction57);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction49.add(fraction53);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction47.subtract(fraction49);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction38.divide(fraction60);
        int int62 = fraction13.compareTo(fraction60);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction60.negate();
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((int) (short) 2, 32);
        long long67 = fraction66.longValue();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction60.multiply(fraction66);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction68.negate();
        org.apache.commons.math.fraction.Fraction fraction70 = fraction12.add(fraction68);
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction(200, 11);
        boolean boolean74 = fraction12.equals((java.lang.Object) 11);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 97);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0, (int) (short) -20);
        long long3 = fraction2.longValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        boolean boolean14 = fraction7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.divide(fraction24);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction16.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction7.multiply(fraction16);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.negate();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction2.subtract(fraction38);
        float float40 = fraction39.floatValue();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction39.reciprocal();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 20.0f + "'", float40 == 20.0f);
        org.junit.Assert.assertNotNull(fraction41);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (short) -10, 20);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double11 = fraction10.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction6.divide(fraction10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction2.subtract(fraction13);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        boolean boolean29 = fraction22.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction22.negate();
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        boolean boolean41 = fraction34.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction34.negate();
        org.apache.commons.math.fraction.Fraction fraction43 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction47.divide(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction43.add(fraction47);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction57.divide(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction43.add(fraction57);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction34.multiply(fraction43);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction30.divide(fraction64);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction64.negate();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction17.subtract(fraction64);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction2.subtract(fraction17);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        float float11 = fraction3.floatValue();
        int int12 = fraction3.intValue();
        float float13 = fraction3.floatValue();
        double double14 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double19 = fraction18.doubleValue();
        long long20 = fraction18.longValue();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction27.divide(fraction31);
        boolean boolean34 = fraction27.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction27.negate();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction40.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction36.add(fraction40);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction50.divide(fraction54);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction36.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction27.multiply(fraction36);
        float float58 = fraction36.floatValue();
        org.apache.commons.math.fraction.Fraction fraction59 = fraction23.subtract(fraction36);
        int int60 = fraction36.getDenominator();
        float float61 = fraction36.floatValue();
        org.apache.commons.math.fraction.Fraction fraction62 = fraction18.divide(fraction36);
        int int63 = fraction36.intValue();
        org.apache.commons.math.fraction.Fraction fraction64 = fraction3.subtract(fraction36);
        int int65 = fraction64.intValue();
        org.apache.commons.math.fraction.Fraction fraction66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction67 = fraction64.subtract(fraction66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 2.0f + "'", float58 == 2.0f);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 2.0f + "'", float61 == 2.0f);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 8 + "'", int65 == 8);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int2 = fraction1.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.abs();
        double double4 = fraction3.doubleValue();
        float float5 = fraction3.floatValue();
        java.lang.Class<?> wildcardClass6 = fraction3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-1.0f));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-2.0f), (double) (byte) 4, (-12));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        float float33 = fraction26.floatValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction0.multiply(fraction26);
        int int35 = fraction34.getNumerator();
        int int36 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction34.negate();
        java.lang.Object obj38 = null;
        boolean boolean39 = fraction34.equals(obj38);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(2.0d, (double) 0.61538464f, 319);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        int int5 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(125, 2);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.divide(fraction22);
        boolean boolean25 = fraction18.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction18.negate();
        boolean boolean27 = fraction6.equals((java.lang.Object) fraction26);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.divide(fraction35);
        org.apache.commons.math.fraction.Fraction fraction37 = org.apache.commons.math.fraction.Fraction.TWO;
        float float38 = fraction37.floatValue();
        float float39 = fraction37.floatValue();
        int int40 = fraction37.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction36.multiply(fraction37);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction26.subtract(fraction41);
        int int43 = fraction2.compareTo(fraction41);
        int int44 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.0f + "'", float38 == 2.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 2.0f + "'", float39 == 2.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 125 + "'", int44 == 125);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (byte) -12, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -12 to fraction (13/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.divide(fraction12);
        boolean boolean15 = fraction13.equals((java.lang.Object) '#');
        int int16 = fraction3.compareTo(fraction13);
        double double17 = fraction13.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        boolean boolean29 = fraction22.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction22.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction31.add(fraction45);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction22.multiply(fraction31);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.divide(fraction60);
        boolean boolean63 = fraction61.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction64 = fraction31.subtract(fraction61);
        org.apache.commons.math.fraction.Fraction fraction65 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction66 = fraction64.subtract(fraction65);
        double double67 = fraction66.doubleValue();
        int int68 = fraction66.intValue();
        org.apache.commons.math.fraction.Fraction fraction70 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction66.add(fraction70);
        int int72 = fraction66.intValue();
        org.apache.commons.math.fraction.Fraction fraction73 = fraction18.subtract(fraction66);
        int int74 = fraction66.getDenominator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction32.abs();
        long long34 = fraction33.longValue();
        long long35 = fraction33.longValue();
        int int36 = fraction33.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.divide(fraction12);
        boolean boolean15 = fraction13.equals((java.lang.Object) '#');
        int int16 = fraction3.compareTo(fraction13);
        int int17 = fraction13.getDenominator();
        double double18 = fraction13.doubleValue();
        int int19 = fraction13.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction21 = fraction13.abs();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction36 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction10.subtract(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction38.add(fraction42);
        double double49 = fraction38.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        boolean boolean61 = fraction54.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction54.negate();
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction63.add(fraction67);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction77.divide(fraction81);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction63.add(fraction77);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction54.multiply(fraction63);
        int int85 = fraction63.getNumerator();
        boolean boolean87 = fraction63.equals((java.lang.Object) (short) 20);
        org.apache.commons.math.fraction.Fraction fraction88 = fraction38.subtract(fraction63);
        org.apache.commons.math.fraction.Fraction fraction89 = fraction88.negate();
        org.apache.commons.math.fraction.Fraction fraction90 = fraction37.add(fraction89);
        long long91 = fraction37.longValue();
        int int92 = fraction37.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction95 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-100), (int) (short) -400);
        org.apache.commons.math.fraction.Fraction fraction96 = fraction37.add(fraction95);
        org.apache.commons.math.fraction.Fraction fraction97 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction98 = fraction96.multiply(fraction97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2.0d + "'", double49 == 2.0d);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-20L) + "'", long91 == (-20L));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertNotNull(fraction96);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        int int33 = fraction10.intValue();
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        int int43 = fraction42.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction42.reciprocal();
        double double45 = fraction42.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((int) '4', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction49 = fraction42.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction10.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction51 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction51.add(fraction55);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction65.divide(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction51.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction10.multiply(fraction51);
        org.apache.commons.math.fraction.Fraction fraction75 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 1, (int) (short) 2);
        int int76 = fraction10.compareTo(fraction75);
        int int77 = fraction10.intValue();
        byte byte78 = fraction10.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 12 + "'", int77 == 12);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 12 + "'", byte78 == (byte) 12);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long4 = fraction3.longValue();
        float float5 = fraction3.floatValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        byte byte10 = fraction8.byteValue();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction9.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction7.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction9.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction41.add(fraction45);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction39.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction39.negate();
        int int54 = fraction39.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction31.subtract(fraction39);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction31.negate();
        byte byte57 = fraction56.byteValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -2 + "'", byte57 == (byte) -2);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction0.add(fraction14);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        boolean boolean31 = fraction24.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction24.negate();
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction33.add(fraction37);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction47.divide(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction33.add(fraction47);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction24.multiply(fraction33);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction0.add(fraction24);
        int int56 = fraction55.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction57 = fraction55.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(fraction57);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(2.0d, (double) 0.61538464f, 319);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        int int46 = fraction24.getNumerator();
        boolean boolean48 = fraction24.equals((java.lang.Object) (short) 20);
        int int49 = fraction24.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction11.divide(fraction24);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction50.abs();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction(11, (int) (short) -20);
        int int55 = fraction51.compareTo(fraction54);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction54.abs();
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction(97, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction59.negate();
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.subtract(fraction59);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction5.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction5.reciprocal();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 500, (double) 4.0f, 1292);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-5.0f), (double) 5, 10);
        int int4 = fraction3.intValue();
        int int5 = fraction3.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction9.divide(fraction13);
        boolean boolean16 = fraction9.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction18.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction32.divide(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction18.add(fraction32);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction9.multiply(fraction18);
        int int40 = fraction18.getNumerator();
        boolean boolean42 = fraction18.equals((java.lang.Object) (short) 20);
        int int43 = fraction18.intValue();
        double double44 = fraction18.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction18.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        int int51 = fraction50.intValue();
        org.apache.commons.math.fraction.Fraction fraction52 = fraction50.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction53 = fraction47.divide(fraction50);
        float float54 = fraction50.floatValue();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction3.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction3.reciprocal();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5) + "'", int4 == (-5));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-5) + "'", int5 == (-5));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2.0d + "'", double44 == 2.0d);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.61538464f + "'", float54 == 0.61538464f);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) -30);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) -6, (double) 18.0f, (int) (short) 1);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction8.equals((java.lang.Object) '#');
        int int11 = fraction8.intValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.abs();
        java.lang.Object obj13 = null;
        boolean boolean14 = fraction8.equals(obj13);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction18 = fraction8.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction20 = fraction8.negate();
        float float21 = fraction20.floatValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(35, (-1000));
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction(11, 100);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction(0.1d, 1.0d, (int) ' ');
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction5.subtract(fraction11);
        int int13 = fraction5.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        boolean boolean24 = fraction17.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction17.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction26.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction40.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction26.add(fraction40);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction17.multiply(fraction26);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        boolean boolean58 = fraction56.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction59 = fraction26.subtract(fraction56);
        int int60 = fraction56.intValue();
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction63.subtract(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = org.apache.commons.math.fraction.Fraction.TWO;
        float float68 = fraction67.floatValue();
        float float69 = fraction67.floatValue();
        float float70 = fraction67.floatValue();
        org.apache.commons.math.fraction.Fraction fraction71 = fraction66.divide(fraction67);
        boolean boolean72 = fraction56.equals((java.lang.Object) fraction66);
        boolean boolean73 = fraction5.equals((java.lang.Object) fraction66);
        int int74 = fraction2.compareTo(fraction5);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction5.reciprocal();
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 2.0f + "'", float68 == 2.0f);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 2.0f + "'", float69 == 2.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 2.0f + "'", float70 == 2.0f);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(fraction75);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-2), 2);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction18.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction16.subtract(fraction18);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction16.negate();
        long long31 = fraction30.longValue();
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.reciprocal();
        boolean boolean35 = fraction30.equals((java.lang.Object) fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction34.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) 0.5f, (-10));
        int int40 = fraction39.intValue();
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction41.add(fraction45);
        double double52 = fraction41.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction53 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction57.divide(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction53.add(fraction57);
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction53.add(fraction67);
        float float74 = fraction67.floatValue();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction41.multiply(fraction67);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction39.add(fraction41);
        float float77 = fraction76.floatValue();
        int int78 = fraction76.intValue();
        int int79 = fraction36.compareTo(fraction76);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction8.subtract(fraction76);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction4.divide(fraction8);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-10L) + "'", long31 == (-10L));
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2.0d + "'", double52 == 2.0d);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 10.0f + "'", float74 == 10.0f);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 2.0f + "'", float77 == 2.0f);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-6), (int) (byte) 2);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 12);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction15.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction6.multiply(fraction15);
        int int37 = fraction15.getNumerator();
        boolean boolean39 = fraction15.equals((java.lang.Object) (short) 20);
        long long40 = fraction15.longValue();
        float float41 = fraction15.floatValue();
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long46 = fraction45.longValue();
        float float47 = fraction45.floatValue();
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.multiply(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction15.subtract(fraction49);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction51.add(fraction54);
        int int56 = fraction55.intValue();
        org.apache.commons.math.fraction.Fraction fraction57 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction58 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction58.add(fraction66);
        long long69 = fraction68.longValue();
        org.apache.commons.math.fraction.Fraction fraction70 = fraction55.multiply(fraction68);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction1.multiply(fraction68);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction71.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 2.0f + "'", float41 == 2.0f);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 33 + "'", int56 == 33);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        long long11 = fraction10.longValue();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction25.divide(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction21.add(fraction25);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction19.subtract(fraction21);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction36.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction21.add(fraction36);
        org.apache.commons.math.fraction.Fraction fraction43 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction47.divide(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction43.add(fraction47);
        double double54 = fraction43.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction55 = fraction43.negate();
        org.apache.commons.math.fraction.Fraction fraction56 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction60.divide(fraction64);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction56.add(fraction60);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction43.divide(fraction60);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction42.subtract(fraction67);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction67.negate();
        int int70 = fraction67.intValue();
        boolean boolean71 = fraction10.equals((java.lang.Object) fraction67);
        short short72 = fraction10.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2.0d + "'", double54 == 2.0d);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + short72 + "' != '" + (short) 11 + "'", short72 == (short) 11);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 9, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        float float14 = fraction13.floatValue();
        float float15 = fraction13.floatValue();
        int int16 = fraction13.getDenominator();
        int int17 = fraction12.compareTo(fraction13);
        double double18 = fraction13.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction13.abs();
        int int20 = fraction19.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        boolean boolean31 = fraction24.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction24.negate();
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction36.divide(fraction40);
        boolean boolean43 = fraction36.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction36.negate();
        org.apache.commons.math.fraction.Fraction fraction45 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction49.divide(fraction53);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction45.add(fraction49);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction63 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction59.divide(fraction63);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction45.add(fraction59);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction36.multiply(fraction45);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction32.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction66.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction69 = fraction19.add(fraction66);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction19.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        long long2 = fraction1.longValue();
        double double3 = fraction1.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (-100.0f), (double) 1292, 12);
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.TWO;
        int int5 = fraction4.intValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction9.divide(fraction13);
        boolean boolean16 = fraction9.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        boolean boolean28 = fraction21.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.negate();
        boolean boolean30 = fraction9.equals((java.lang.Object) fraction29);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction40.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction38.subtract(fraction40);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction29.divide(fraction51);
        int int53 = fraction4.compareTo(fraction51);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction51.negate();
        int int55 = fraction51.intValue();
        int int56 = fraction3.compareTo(fraction51);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 100, 30);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction18.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction16.subtract(fraction18);
        int int30 = fraction29.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction29.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double47 = fraction46.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        boolean boolean58 = fraction56.equals((java.lang.Object) '#');
        int int59 = fraction46.compareTo(fraction56);
        double double60 = fraction56.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction61 = fraction29.multiply(fraction56);
        boolean boolean62 = fraction8.equals((java.lang.Object) fraction56);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction2.divide(fraction56);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction63.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((int) (short) 20, (int) (short) -3);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) '#', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction10 = fraction6.add(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.add(fraction6);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        float float14 = fraction13.floatValue();
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction18.divide(fraction22);
        boolean boolean25 = fraction18.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction18.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        boolean boolean37 = fraction30.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction30.negate();
        org.apache.commons.math.fraction.Fraction fraction39 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction43.divide(fraction47);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction39.add(fraction43);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction53.divide(fraction57);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction39.add(fraction53);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction30.multiply(fraction39);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction26.divide(fraction60);
        int int62 = fraction13.compareTo(fraction60);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction13.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction64 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction68 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction68.divide(fraction72);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction64.add(fraction68);
        org.apache.commons.math.fraction.Fraction fraction78 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction78.divide(fraction82);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction64.add(fraction78);
        int int85 = fraction63.compareTo(fraction78);
        int int86 = fraction63.getNumerator();
        int int87 = fraction63.intValue();
        org.apache.commons.math.fraction.Fraction fraction88 = fraction3.subtract(fraction63);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(fraction88);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        float float16 = fraction15.floatValue();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.divide(fraction24);
        boolean boolean27 = fraction20.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction20.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction32.divide(fraction36);
        boolean boolean39 = fraction32.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction32.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction41.add(fraction45);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction41.add(fraction55);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction32.multiply(fraction41);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction28.divide(fraction62);
        int int64 = fraction15.compareTo(fraction62);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction62.abs();
        org.apache.commons.math.fraction.Fraction fraction66 = fraction14.add(fraction62);
        int int67 = fraction14.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction1.multiply(fraction14);
        int int69 = fraction14.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-10) + "'", int67 == (-10));
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-10) + "'", int69 == (-10));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.negate();
        java.lang.Object obj10 = null;
        boolean boolean11 = fraction8.equals(obj10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction8.abs();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 0, (double) (short) 10, (int) (short) 0);
        boolean boolean20 = fraction15.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction8.add(fraction15);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction25.divide(fraction29);
        boolean boolean32 = fraction25.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction25.negate();
        org.apache.commons.math.fraction.Fraction fraction34 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction34.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction48.divide(fraction52);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction34.add(fraction48);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction25.multiply(fraction34);
        int int56 = fraction34.getNumerator();
        boolean boolean58 = fraction34.equals((java.lang.Object) (short) 20);
        long long59 = fraction34.longValue();
        float float60 = fraction34.floatValue();
        int int61 = fraction8.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction8.negate();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 2L + "'", long59 == 2L);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 2.0f + "'", float60 == 2.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(fraction62);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 0.5f);
        float float2 = fraction1.floatValue();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction1.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.negate();
        int int6 = fraction5.getNumerator();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.1d, 1.0d, (int) ' ');
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.abs();
        long long6 = fraction4.longValue();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.negate();
        int int8 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double15 = fraction14.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction8.multiply(fraction16);
        float float18 = fraction17.floatValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction17.reciprocal();
        int int20 = fraction19.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long25 = fraction24.longValue();
        float float26 = fraction24.floatValue();
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.multiply(fraction28);
        long long30 = fraction28.longValue();
        org.apache.commons.math.fraction.Fraction fraction33 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction28.add(fraction33);
        int int35 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction34.abs();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction19.subtract(fraction34);
        int int38 = fraction19.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1000.0f) + "'", float18 == (-1000.0f));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) -20, (double) 20.0f, (int) (byte) -12);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        double double5 = fraction4.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double10 = fraction9.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        boolean boolean21 = fraction19.equals((java.lang.Object) '#');
        int int22 = fraction9.compareTo(fraction19);
        double double23 = fraction19.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        boolean boolean35 = fraction28.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction28.negate();
        org.apache.commons.math.fraction.Fraction fraction37 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction41.divide(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction37.add(fraction41);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction37.add(fraction51);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction28.multiply(fraction37);
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        boolean boolean69 = fraction67.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction70 = fraction37.subtract(fraction67);
        org.apache.commons.math.fraction.Fraction fraction71 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction72 = fraction70.subtract(fraction71);
        double double73 = fraction72.doubleValue();
        int int74 = fraction72.intValue();
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.add(fraction76);
        int int78 = fraction72.intValue();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction24.subtract(fraction72);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction4.subtract(fraction79);
        org.apache.commons.math.fraction.Fraction fraction83 = new org.apache.commons.math.fraction.Fraction(30, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction4.add(fraction83);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction86 = fraction85.abs();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-1.0d) + "'", double73 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(fraction86);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -1, 33);
        float float3 = fraction2.floatValue();
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) 15);
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        boolean boolean7 = fraction2.equals((java.lang.Object) fraction5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.030303031f) + "'", float3 == (-0.030303031f));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.20618556701030927d, 120.0d, (int) (short) 20);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 1, (int) (short) 10);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.divide(fraction15);
        boolean boolean18 = fraction11.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        boolean boolean30 = fraction23.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction23.negate();
        boolean boolean32 = fraction11.equals((java.lang.Object) fraction31);
        long long33 = fraction11.longValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction11.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction36 = fraction7.multiply(fraction11);
        float float37 = fraction11.floatValue();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        int int48 = fraction47.getDenominator();
        float float49 = fraction47.floatValue();
        int int50 = fraction47.intValue();
        org.apache.commons.math.fraction.Fraction fraction51 = fraction11.subtract(fraction47);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction2.subtract(fraction47);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((int) (short) 99, (-10));
        org.apache.commons.math.fraction.Fraction fraction56 = fraction2.subtract(fraction55);
        int int57 = fraction55.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 10.0f + "'", float37 == 10.0f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-99) + "'", int57 == (-99));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 0, (double) (short) 10, (int) (short) 0);
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction4.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        double double26 = fraction15.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.divide(fraction35);
        boolean boolean38 = fraction31.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction31.negate();
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction40.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction40.add(fraction54);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction31.multiply(fraction40);
        int int62 = fraction40.getNumerator();
        boolean boolean64 = fraction40.equals((java.lang.Object) (short) 20);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction15.subtract(fraction40);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction8.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction75 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction71.divide(fraction75);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction67.add(fraction71);
        double double78 = fraction67.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction79 = fraction67.negate();
        int int80 = fraction67.getDenominator();
        int int81 = fraction8.compareTo(fraction67);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction3.subtract(fraction67);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction82.reciprocal();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.0d + "'", double26 == 2.0d);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 2.0d + "'", double78 == 2.0d);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 250, (int) (short) -12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 250 to fraction (-249/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        boolean boolean14 = fraction7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.divide(fraction24);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction16.add(fraction20);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction16.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction7.multiply(fraction16);
        int int38 = fraction16.getNumerator();
        boolean boolean40 = fraction16.equals((java.lang.Object) (short) 20);
        int int41 = fraction16.intValue();
        double double42 = fraction16.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction16.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction49.divide(fraction53);
        org.apache.commons.math.fraction.Fraction fraction55 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction63 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction59.divide(fraction63);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction55.add(fraction59);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction53.subtract(fraction55);
        boolean boolean67 = fraction44.equals((java.lang.Object) fraction55);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction2.multiply(fraction55);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction55.negate();
        int int70 = fraction55.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.0d + "'", double42 == 2.0d);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 2, (-2));
        int int3 = fraction2.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, 10);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.add(fraction7);
        long long9 = fraction8.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        org.apache.commons.math.fraction.Fraction fraction18 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction22.divide(fraction26);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction18.add(fraction22);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction16.subtract(fraction18);
        int int30 = fraction29.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction29.subtract(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction3.multiply(fraction41);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction41.negate();
        org.apache.commons.math.fraction.Fraction fraction45 = fraction41.reciprocal();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction34 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction34.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction48.divide(fraction52);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction34.add(fraction48);
        float float55 = fraction48.floatValue();
        org.apache.commons.math.fraction.Fraction fraction56 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction60.divide(fraction64);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction56.add(fraction60);
        double double67 = fraction56.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction68 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.divide(fraction76);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction68.add(fraction72);
        org.apache.commons.math.fraction.Fraction fraction82 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction86 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction87 = fraction82.divide(fraction86);
        org.apache.commons.math.fraction.Fraction fraction88 = fraction68.add(fraction82);
        float float89 = fraction82.floatValue();
        org.apache.commons.math.fraction.Fraction fraction90 = fraction56.multiply(fraction82);
        int int91 = fraction90.getNumerator();
        int int92 = fraction90.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction93 = fraction90.negate();
        double double94 = fraction90.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction95 = fraction48.divide(fraction90);
        org.apache.commons.math.fraction.Fraction fraction96 = fraction33.add(fraction90);
        int int97 = fraction90.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 10.0f + "'", float55 == 10.0f);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2.0d + "'", double67 == 2.0d);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 10.0f + "'", float89 == 10.0f);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 20 + "'", int91 == 20);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 20.0d + "'", double94 == 20.0d);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertNotNull(fraction96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 20 + "'", int97 == 20);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 12, (-30));
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction6.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int10 = fraction9.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction11 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction2.multiply(fraction11);
        int int14 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction11.divide(fraction45);
        int int47 = fraction45.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction52.divide(fraction56);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction48.add(fraction52);
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.divide(fraction76);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction68.add(fraction72);
        org.apache.commons.math.fraction.Fraction fraction79 = fraction66.subtract(fraction68);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction58.subtract(fraction68);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction58.negate();
        org.apache.commons.math.fraction.Fraction fraction84 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction58.subtract(fraction84);
        org.apache.commons.math.fraction.Fraction fraction86 = fraction45.multiply(fraction84);
        java.lang.Class<?> wildcardClass87 = fraction84.getClass();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction8);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double15 = fraction14.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction17 = fraction8.multiply(fraction16);
        float float18 = fraction17.floatValue();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction(0, (int) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        boolean boolean29 = fraction25.equals((java.lang.Object) 12);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction21.multiply(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction17.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction30.reciprocal();
        int int34 = fraction33.intValue();
        org.apache.commons.math.fraction.Fraction fraction35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction36 = fraction33.add(fraction35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1000.0f) + "'", float18 == (-1000.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.1d, (double) (byte) -6, (int) (byte) 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 0.1 to fraction (9,223,372,036,854,775,807/-9)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (byte) 12, 97);
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-400));
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.abs();
        double double3 = fraction1.doubleValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-400.0d) + "'", double3 == (-400.0d));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(319, 319);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, (int) (short) 32);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-0.08333333333333333d), (-1.5151515151515151d), 240);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -0.083 to fraction (-56,294,995,342,132/675,539,944,105,583)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        boolean boolean45 = fraction38.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction47.add(fraction51);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction61.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction47.add(fraction61);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction38.multiply(fraction47);
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.divide(fraction76);
        boolean boolean79 = fraction77.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction80 = fraction47.subtract(fraction77);
        org.apache.commons.math.fraction.Fraction fraction84 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction88 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction89 = fraction84.divide(fraction88);
        org.apache.commons.math.fraction.Fraction fraction90 = fraction80.add(fraction89);
        org.apache.commons.math.fraction.Fraction fraction91 = fraction12.add(fraction90);
        long long92 = fraction12.longValue();
        org.apache.commons.math.fraction.Fraction fraction93 = fraction12.abs();
        int int94 = fraction93.intValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 2L + "'", long92 == 2L);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2 + "'", int94 == 2);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 32.0f);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction3 = fraction1.negate();
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32) + "'", int4 == (-32));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        int int4 = fraction3.getDenominator();
        float float5 = fraction3.floatValue();
        float float6 = fraction3.floatValue();
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long11 = fraction10.longValue();
        float float12 = fraction10.floatValue();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction10.multiply(fraction14);
        int int16 = fraction15.intValue();
        org.apache.commons.math.fraction.Fraction fraction17 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction17.add(fraction25);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction15.divide(fraction25);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (short) 1, (double) 0.61538464f, (int) ' ');
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((-1.0d), (double) 1.0f, (int) (short) 1);
        int int37 = fraction36.intValue();
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long42 = fraction41.longValue();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction36.multiply(fraction41);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction32.subtract(fraction36);
        double double45 = fraction32.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction28.subtract(fraction32);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long51 = fraction50.longValue();
        float float52 = fraction50.floatValue();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction50.multiply(fraction54);
        int int56 = fraction55.intValue();
        org.apache.commons.math.fraction.Fraction fraction57 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction61.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction57.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction55.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        int int72 = fraction71.intValue();
        org.apache.commons.math.fraction.Fraction fraction73 = fraction55.subtract(fraction71);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction75 = fraction46.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction3.subtract(fraction46);
        long long77 = fraction76.longValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-10L) + "'", long77 == (-10L));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 240, (int) (byte) 11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 240 to fraction (-239/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction(0.0d);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) (byte) 1, (double) (short) 100, (int) (short) 32);
        int int6 = fraction5.getNumerator();
        int int7 = fraction1.compareTo(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 0, (int) (byte) 100);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 1, (int) (short) 4);
        org.apache.commons.math.fraction.Fraction fraction7 = fraction2.add(fraction6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-10), (int) (short) 62);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction6 = org.apache.commons.math.fraction.Fraction.TWO;
        float float7 = fraction6.floatValue();
        float float8 = fraction6.floatValue();
        float float9 = fraction6.floatValue();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.divide(fraction6);
        double double11 = fraction5.doubleValue();
        boolean boolean13 = fraction5.equals((java.lang.Object) (byte) 31);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        boolean boolean36 = fraction12.equals((java.lang.Object) (short) 20);
        int int37 = fraction12.intValue();
        double double38 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction39 = fraction12.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction39.abs();
        int int41 = fraction40.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction44 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 100);
        int int45 = fraction44.getDenominator();
        int int46 = fraction44.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction40.multiply(fraction44);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction44.reciprocal();
        float float49 = fraction44.floatValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.0d + "'", double38 == 2.0d);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.1f + "'", float49 == 0.1f);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) -1, 0.1d, (int) (short) 1);
        float float4 = fraction3.floatValue();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction10 = fraction9.abs();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        boolean boolean21 = fraction14.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction27.divide(fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction23.add(fraction27);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction23.add(fraction37);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction14.multiply(fraction23);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction48.divide(fraction52);
        boolean boolean55 = fraction53.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction56 = fraction23.subtract(fraction53);
        org.apache.commons.math.fraction.Fraction fraction57 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction58 = fraction56.subtract(fraction57);
        double double59 = fraction58.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction58.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction61 = fraction60.abs();
        org.apache.commons.math.fraction.Fraction fraction62 = fraction9.divide(fraction60);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long67 = fraction66.longValue();
        org.apache.commons.math.fraction.Fraction fraction70 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction71 = fraction70.abs();
        int int72 = fraction66.compareTo(fraction70);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction66.abs();
        org.apache.commons.math.fraction.Fraction fraction74 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((int) (short) -10, 20);
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double82 = fraction81.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction83 = fraction81.negate();
        org.apache.commons.math.fraction.Fraction fraction84 = fraction77.divide(fraction81);
        int int85 = fraction84.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction89 = new org.apache.commons.math.fraction.Fraction((double) (-10), 0.05d, 100);
        boolean boolean90 = fraction84.equals((java.lang.Object) (-10));
        long long91 = fraction84.longValue();
        org.apache.commons.math.fraction.Fraction fraction92 = fraction66.add(fraction84);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(fraction92);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.negate();
        double double7 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction11.divide(fraction15);
        boolean boolean18 = fraction11.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction11.negate();
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        boolean boolean30 = fraction23.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction32 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction36.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction32.add(fraction36);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction46.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction32.add(fraction46);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction23.multiply(fraction32);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction19.subtract(fraction53);
        int int55 = fraction19.intValue();
        int int56 = fraction6.compareTo(fraction19);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-10) + "'", int55 == (-10));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        boolean boolean7 = fraction3.equals((java.lang.Object) 12);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.abs();
        int int9 = fraction3.getNumerator();
        long long10 = fraction3.longValue();
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        boolean boolean21 = fraction14.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction14.negate();
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        boolean boolean33 = fraction26.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction26.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction35.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction49.divide(fraction53);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction35.add(fraction49);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction26.multiply(fraction35);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction22.divide(fraction56);
        org.apache.commons.math.fraction.Fraction fraction58 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction58.add(fraction62);
        org.apache.commons.math.fraction.Fraction fraction72 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction77 = fraction72.divide(fraction76);
        org.apache.commons.math.fraction.Fraction fraction78 = fraction58.add(fraction72);
        org.apache.commons.math.fraction.Fraction fraction79 = fraction22.divide(fraction58);
        org.apache.commons.math.fraction.Fraction fraction80 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction81 = fraction80.abs();
        org.apache.commons.math.fraction.Fraction fraction82 = fraction79.multiply(fraction81);
        int int83 = fraction82.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction84 = fraction3.add(fraction82);
        org.apache.commons.math.fraction.Fraction fraction87 = org.apache.commons.math.fraction.Fraction.getReducedFraction(2, (int) '#');
        org.apache.commons.math.fraction.Fraction fraction88 = fraction82.divide(fraction87);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction77);
        org.junit.Assert.assertNotNull(fraction78);
        org.junit.Assert.assertNotNull(fraction79);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertNotNull(fraction88);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction(1292, (-5));
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.subtract(fraction7);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) -10, (double) (byte) 100, (-10));
        long long4 = fraction3.longValue();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.divide(fraction12);
        boolean boolean15 = fraction8.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction16 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction20.divide(fraction24);
        boolean boolean27 = fraction20.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction20.negate();
        org.apache.commons.math.fraction.Fraction fraction29 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction33.divide(fraction37);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction29.add(fraction33);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction43.divide(fraction47);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction29.add(fraction43);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction20.multiply(fraction29);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction16.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.divide(fraction60);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction52.add(fraction56);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction66.divide(fraction70);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction52.add(fraction66);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction16.divide(fraction52);
        org.apache.commons.math.fraction.Fraction fraction74 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction75 = fraction74.abs();
        org.apache.commons.math.fraction.Fraction fraction76 = fraction73.multiply(fraction75);
        int int77 = fraction76.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction78 = fraction3.add(fraction76);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-10L) + "'", long4 == (-10L));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(fraction78);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, 50);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 0, (int) (short) 9);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) -10, 20);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double7 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction2.divide(fraction6);
        int int10 = fraction2.getNumerator();
        long long11 = fraction2.longValue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 8);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction5.divide(fraction9);
        org.apache.commons.math.fraction.Fraction fraction11 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction11.add(fraction15);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction9.subtract(fraction11);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math.fraction.Fraction fraction25 = fraction1.add(fraction24);
        float float26 = fraction25.floatValue();
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        int int29 = fraction28.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction30 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction30.add(fraction38);
        long long41 = fraction40.longValue();
        org.apache.commons.math.fraction.Fraction fraction42 = fraction28.add(fraction40);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction46.divide(fraction50);
        boolean boolean53 = fraction46.equals((java.lang.Object) (byte) 10);
        float float54 = fraction46.floatValue();
        int int55 = fraction46.intValue();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction46.abs();
        java.lang.Class<?> wildcardClass57 = fraction56.getClass();
        boolean boolean58 = fraction42.equals((java.lang.Object) fraction56);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction56.abs();
        org.apache.commons.math.fraction.Fraction fraction60 = fraction59.reciprocal();
        int int61 = fraction25.compareTo(fraction60);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction25.negate();
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 18.0f + "'", float26 == 18.0f);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 11L + "'", long41 == 11L);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10.0f + "'", float54 == 10.0f);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(fraction62);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.divide(fraction12);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction4.add(fraction8);
        double double15 = fraction4.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction16 = fraction4.negate();
        double double17 = fraction16.doubleValue();
        double double18 = fraction16.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction19 = fraction2.subtract(fraction16);
        org.apache.commons.math.fraction.Fraction fraction22 = new org.apache.commons.math.fraction.Fraction((int) (short) -10, 20);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double27 = fraction26.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction28 = fraction26.negate();
        org.apache.commons.math.fraction.Fraction fraction29 = fraction22.divide(fraction26);
        float float30 = fraction26.floatValue();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction19.subtract(fraction26);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((int) (short) -10, 20);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double39 = fraction38.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction38.negate();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction42.negate();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction43.reciprocal();
        double double45 = fraction44.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction46 = fraction31.divide(fraction44);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-2.0d) + "'", double17 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.01d + "'", double45 == 0.01d);
        org.junit.Assert.assertNotNull(fraction46);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) -400, (double) '4', 0);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) (-6.1538463f), 99);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -20, (int) (short) 9);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-99), 50);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((-4.03125d), (double) 6, (int) (byte) -6);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction(8.0d);
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction2.add(fraction6);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction2.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        boolean boolean33 = fraction26.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction26.negate();
        org.apache.commons.math.fraction.Fraction fraction35 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction35.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction49.divide(fraction53);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction35.add(fraction49);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction26.multiply(fraction35);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction2.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((int) (byte) -20, (int) '#');
        boolean boolean61 = fraction2.equals((java.lang.Object) (byte) -20);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction1.add(fraction2);
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction64 = fraction63.abs();
        boolean boolean65 = fraction2.equals((java.lang.Object) fraction63);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction63.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fraction66);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        float float33 = fraction26.floatValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction0.multiply(fraction26);
        int int35 = fraction34.getNumerator();
        int int36 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction37 = fraction34.negate();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction37.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        boolean boolean49 = fraction42.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction42.negate();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        boolean boolean61 = fraction54.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction54.negate();
        boolean boolean63 = fraction42.equals((java.lang.Object) fraction62);
        long long64 = fraction42.longValue();
        org.apache.commons.math.fraction.Fraction fraction65 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction66 = fraction42.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction66.negate();
        int int68 = fraction67.intValue();
        org.apache.commons.math.fraction.Fraction fraction69 = fraction67.abs();
        int int70 = fraction67.getNumerator();
        boolean boolean71 = fraction38.equals((java.lang.Object) int70);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (short) -5, (-1.6666666666666667d), (int) (short) 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert -5 to fraction (-9,223,372,036,854,775,802/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) -10, (int) (byte) 19);
        int int3 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction0.add(fraction14);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction29.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = fraction14.multiply(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction14.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long4 = fraction3.longValue();
        float float5 = fraction3.floatValue();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.multiply(fraction7);
        long long9 = fraction7.longValue();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction7.add(fraction12);
        int int14 = fraction12.intValue();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        double double26 = fraction15.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction27 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.divide(fraction35);
        boolean boolean38 = fraction31.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction31.negate();
        org.apache.commons.math.fraction.Fraction fraction40 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction40.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction40.add(fraction54);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction31.multiply(fraction40);
        int int62 = fraction40.getNumerator();
        boolean boolean64 = fraction40.equals((java.lang.Object) (short) 20);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction15.subtract(fraction40);
        int int66 = fraction12.compareTo(fraction15);
        java.lang.Class<?> wildcardClass67 = fraction15.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.0d + "'", double26 == 2.0d);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(67, 6);
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.ZERO;
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        boolean boolean14 = fraction7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        boolean boolean26 = fraction19.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction28 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction32.divide(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction28.add(fraction32);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction28.add(fraction42);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction19.multiply(fraction28);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction15.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction51.add(fraction55);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction65.divide(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction51.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction15.divide(fraction51);
        int int73 = fraction51.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction74 = fraction3.multiply(fraction51);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction51.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction76 = fraction2.divide(fraction75);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        float float10 = fraction9.floatValue();
        float float11 = fraction9.floatValue();
        int int12 = fraction9.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction8.multiply(fraction9);
        long long14 = fraction8.longValue();
        int int15 = fraction8.getNumerator();
        boolean boolean17 = fraction8.equals((java.lang.Object) 0.1f);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction8.negate();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction(8.0d);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction18.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction22.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction36.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction42 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction46.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction42.add(fraction46);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction40.subtract(fraction42);
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction57.divide(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction42.add(fraction57);
        int int64 = fraction22.compareTo(fraction57);
        long long65 = fraction57.longValue();
        org.apache.commons.math.fraction.Fraction fraction66 = fraction57.negate();
        org.apache.commons.math.fraction.Fraction fraction67 = fraction21.subtract(fraction57);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10);
        int int8 = fraction7.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(0.0d, (double) 'a', (int) (short) -1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = org.apache.commons.math.fraction.Fraction.TWO;
        float float23 = fraction22.floatValue();
        float float24 = fraction22.floatValue();
        int int25 = fraction22.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.multiply(fraction22);
        int int27 = fraction12.compareTo(fraction21);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction31.divide(fraction35);
        boolean boolean38 = fraction31.equals((java.lang.Object) (byte) 10);
        float float39 = fraction31.floatValue();
        int int40 = fraction31.intValue();
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.abs();
        org.apache.commons.math.fraction.Fraction fraction42 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction46.divide(fraction50);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction42.add(fraction46);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.divide(fraction60);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction42.add(fraction56);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction41.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction12.multiply(fraction63);
        boolean boolean65 = fraction7.equals((java.lang.Object) fraction64);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction3.subtract(fraction7);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 2.0f + "'", float23 == 2.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 2.0f + "'", float24 == 2.0f);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 10.0f + "'", float39 == 10.0f);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fraction66);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) 35);
        byte byte2 = fraction1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 35 + "'", byte2 == (byte) 35);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        int int12 = fraction3.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.abs();
        int int14 = fraction3.intValue();
        double double15 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        boolean boolean23 = fraction16.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction16.negate();
        org.apache.commons.math.fraction.Fraction fraction25 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction25.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction39.divide(fraction43);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction25.add(fraction39);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction16.multiply(fraction25);
        int int47 = fraction25.getNumerator();
        boolean boolean49 = fraction25.equals((java.lang.Object) (short) 20);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction0.subtract(fraction25);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction50.negate();
        int int52 = fraction50.intValue();
        double double53 = fraction50.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction56 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction50.multiply(fraction56);
        int int58 = fraction50.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        int int34 = fraction12.getNumerator();
        boolean boolean36 = fraction12.equals((java.lang.Object) (short) 20);
        int int37 = fraction12.intValue();
        double double38 = fraction12.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction12.divide(fraction40);
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.divide(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction55.divide(fraction59);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction51.add(fraction55);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction49.subtract(fraction51);
        boolean boolean63 = fraction40.equals((java.lang.Object) fraction51);
        int int64 = fraction40.intValue();
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 100);
        double double67 = fraction66.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction68 = fraction40.multiply(fraction66);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction68.negate();
        org.apache.commons.math.fraction.Fraction fraction70 = fraction68.abs();
        int int71 = fraction68.intValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.0d + "'", double38 == 2.0d);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10000 + "'", int71 == 10000);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        double double4 = fraction3.doubleValue();
        long long5 = fraction3.longValue();
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.divide(fraction16);
        boolean boolean19 = fraction12.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction12.negate();
        org.apache.commons.math.fraction.Fraction fraction21 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction25.divide(fraction29);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction21.add(fraction25);
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction21.add(fraction35);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction12.multiply(fraction21);
        float float43 = fraction21.floatValue();
        org.apache.commons.math.fraction.Fraction fraction44 = fraction8.subtract(fraction21);
        int int45 = fraction21.getDenominator();
        float float46 = fraction21.floatValue();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction3.divide(fraction21);
        int int48 = fraction21.intValue();
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction52.divide(fraction56);
        boolean boolean59 = fraction52.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction52.negate();
        org.apache.commons.math.fraction.Fraction fraction61 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction65.divide(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction61.add(fraction65);
        org.apache.commons.math.fraction.Fraction fraction75 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction79 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction80 = fraction75.divide(fraction79);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction61.add(fraction75);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction52.multiply(fraction61);
        int int83 = fraction61.getNumerator();
        boolean boolean85 = fraction61.equals((java.lang.Object) (short) 20);
        int int86 = fraction61.intValue();
        double double87 = fraction61.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction88 = fraction61.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction89 = fraction88.abs();
        org.apache.commons.math.fraction.Fraction fraction90 = fraction21.divide(fraction89);
        float float91 = fraction89.floatValue();
        org.apache.commons.math.fraction.Fraction fraction92 = fraction89.abs();
        int int93 = fraction92.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction94 = fraction92.negate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 2.0f + "'", float43 == 2.0f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 2.0f + "'", float46 == 2.0f);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction80);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2 + "'", int86 == 2);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 2.0d + "'", double87 == 2.0d);
        org.junit.Assert.assertNotNull(fraction88);
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 0.5f + "'", float91 == 0.5f);
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(fraction94);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(1292, (-400));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(99.38461538461539d, 1);
        int int3 = fraction2.intValue();
        int int4 = fraction2.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction6 = fraction2.subtract(fraction5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (short) 12);
        org.apache.commons.math.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction15.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction6.multiply(fraction15);
        int int37 = fraction15.getNumerator();
        boolean boolean39 = fraction15.equals((java.lang.Object) (short) 20);
        long long40 = fraction15.longValue();
        float float41 = fraction15.floatValue();
        org.apache.commons.math.fraction.Fraction fraction45 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long46 = fraction45.longValue();
        float float47 = fraction45.floatValue();
        org.apache.commons.math.fraction.Fraction fraction49 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction45.multiply(fraction49);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction15.subtract(fraction49);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction51.add(fraction54);
        int int56 = fraction55.intValue();
        org.apache.commons.math.fraction.Fraction fraction57 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction58 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction58.add(fraction66);
        long long69 = fraction68.longValue();
        org.apache.commons.math.fraction.Fraction fraction70 = fraction55.multiply(fraction68);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction1.multiply(fraction68);
        int int72 = fraction68.intValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 2.0f + "'", float41 == 2.0f);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 33 + "'", int56 == 33);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 11L + "'", long69 == 11L);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 11 + "'", int72 == 11);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        boolean boolean44 = fraction37.equals((java.lang.Object) (byte) 10);
        float float45 = fraction37.floatValue();
        int int46 = fraction37.intValue();
        org.apache.commons.math.fraction.Fraction fraction47 = fraction37.abs();
        org.apache.commons.math.fraction.Fraction fraction48 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction52.divide(fraction56);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction48.add(fraction52);
        org.apache.commons.math.fraction.Fraction fraction62 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction62.divide(fraction66);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction48.add(fraction62);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction47.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction33.subtract(fraction69);
        org.apache.commons.math.fraction.Fraction fraction71 = fraction33.negate();
        org.apache.commons.math.fraction.Fraction fraction72 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction76 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction80 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction81 = fraction76.divide(fraction80);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction72.add(fraction76);
        double double83 = fraction72.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction84 = fraction72.negate();
        org.apache.commons.math.fraction.Fraction fraction85 = org.apache.commons.math.fraction.Fraction.TWO;
        float float86 = fraction85.floatValue();
        float float87 = fraction85.floatValue();
        int int88 = fraction85.getDenominator();
        int int89 = fraction84.compareTo(fraction85);
        double double90 = fraction85.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction91 = fraction85.abs();
        org.apache.commons.math.fraction.Fraction fraction93 = new org.apache.commons.math.fraction.Fraction((double) 8);
        boolean boolean94 = fraction91.equals((java.lang.Object) 8);
        org.apache.commons.math.fraction.Fraction fraction95 = fraction33.multiply(fraction91);
        long long96 = fraction33.longValue();
        int int97 = fraction33.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 10.0f + "'", float45 == 10.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction81);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 2.0d + "'", double83 == 2.0d);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 2.0f + "'", float86 == 2.0f);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 2.0f + "'", float87 == 2.0f);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 2.0d + "'", double90 == 2.0d);
        org.junit.Assert.assertNotNull(fraction91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(fraction95);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + (-12L) + "'", long96 == (-12L));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-12) + "'", int97 == (-12));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 10, (int) (short) 100);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        boolean boolean11 = fraction7.equals((java.lang.Object) 12);
        int int12 = fraction7.intValue();
        int int13 = fraction2.compareTo(fraction7);
        int int14 = fraction7.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((-8.125d));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (-0.01d), (int) (byte) 19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long13 = fraction12.longValue();
        float float14 = fraction12.floatValue();
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction12.multiply(fraction16);
        int int18 = fraction17.intValue();
        org.apache.commons.math.fraction.Fraction fraction19 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = fraction23.divide(fraction27);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction19.add(fraction27);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction17.divide(fraction27);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        int int34 = fraction33.intValue();
        org.apache.commons.math.fraction.Fraction fraction35 = fraction17.subtract(fraction33);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction8.divide(fraction33);
        int int37 = fraction36.getDenominator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction11.divide(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction45.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction48 = fraction47.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction49 = fraction47.abs();
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (-10));
        org.apache.commons.math.fraction.Fraction fraction52 = fraction49.add(fraction51);
        short short53 = fraction52.shortValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + short53 + "' != '" + (short) -9 + "'", short53 == (short) -9);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (short) 20, (int) (byte) 10);
        int int3 = fraction2.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction4 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction7 = fraction4.negate();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction2.divide(fraction4);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.abs();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 100.0f, (double) '4', (-1));
        double double4 = fraction3.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction6 = fraction5.abs();
        double double7 = fraction6.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction8 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction9 = fraction8.reciprocal();
        long long10 = fraction9.longValue();
        byte byte11 = fraction9.byteValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(250, (int) (short) 97);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction(0.5d, (double) (byte) 20, (int) (byte) -2);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        boolean boolean14 = fraction7.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction15 = fraction7.negate();
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        boolean boolean26 = fraction19.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction27 = fraction19.negate();
        org.apache.commons.math.fraction.Fraction fraction28 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction36 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction32.divide(fraction36);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction28.add(fraction32);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction28.add(fraction42);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction19.multiply(fraction28);
        int int50 = fraction28.getNumerator();
        boolean boolean52 = fraction28.equals((java.lang.Object) (short) 20);
        int int53 = fraction28.intValue();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction15.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction55 = org.apache.commons.math.fraction.Fraction.TWO;
        float float56 = fraction55.floatValue();
        float float57 = fraction55.floatValue();
        org.apache.commons.math.fraction.Fraction fraction58 = fraction15.subtract(fraction55);
        org.apache.commons.math.fraction.Fraction fraction59 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction63 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction63.divide(fraction67);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction59.add(fraction63);
        double double70 = fraction59.doubleValue();
        int int71 = fraction59.getDenominator();
        boolean boolean73 = fraction59.equals((java.lang.Object) (byte) 20);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction15.add(fraction59);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction3.subtract(fraction59);
        org.apache.commons.math.fraction.Fraction fraction76 = fraction59.abs();
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 2.0f + "'", float56 == 2.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 2.0f + "'", float57 == 2.0f);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 2.0d + "'", double70 == 2.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction76);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-33));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 4, (int) (short) -100);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) (short) 33, 319);
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) -5, (double) (byte) 20, 20);
        org.apache.commons.math.fraction.Fraction fraction7 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction8 = fraction7.abs();
        float float9 = fraction7.floatValue();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) 1, 1);
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction(100.0d, (double) 2, 2);
        long long17 = fraction16.longValue();
        float float18 = fraction16.floatValue();
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.multiply(fraction20);
        int int22 = fraction21.intValue();
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction27.divide(fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction23.add(fraction31);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction21.divide(fraction31);
        int int35 = fraction34.getDenominator();
        int int36 = fraction12.compareTo(fraction34);
        org.apache.commons.math.fraction.Fraction fraction37 = fraction7.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction6.divide(fraction34);
        int int39 = fraction6.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction40 = fraction2.divide(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(fraction40);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 10000, (int) (byte) -15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 10,000 to fraction (-9,999/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction(0.1d, (-5));
        org.apache.commons.math.fraction.Fraction fraction3 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction12 = fraction7.divide(fraction11);
        org.apache.commons.math.fraction.Fraction fraction13 = fraction3.add(fraction7);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction27 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction27.divide(fraction31);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction23.add(fraction27);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction21.subtract(fraction23);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction13.subtract(fraction23);
        int int36 = fraction23.intValue();
        float float37 = fraction23.floatValue();
        org.apache.commons.math.fraction.Fraction fraction38 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        org.apache.commons.math.fraction.Fraction fraction48 = fraction38.add(fraction42);
        double double49 = fraction38.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction50 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        org.apache.commons.math.fraction.Fraction fraction60 = fraction50.add(fraction54);
        org.apache.commons.math.fraction.Fraction fraction64 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction68 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction69 = fraction64.divide(fraction68);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction50.add(fraction64);
        float float71 = fraction64.floatValue();
        org.apache.commons.math.fraction.Fraction fraction72 = fraction38.multiply(fraction64);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction72.negate();
        org.apache.commons.math.fraction.Fraction fraction74 = fraction23.add(fraction73);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction2.divide(fraction74);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.0f + "'", float37 == 2.0f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 2.0d + "'", double49 == 2.0d);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
        org.junit.Assert.assertNotNull(fraction69);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 10.0f + "'", float71 == 10.0f);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 0.5f, (-20));
        int int3 = fraction2.intValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        int int46 = fraction24.getNumerator();
        boolean boolean48 = fraction24.equals((java.lang.Object) (short) 20);
        int int49 = fraction24.intValue();
        org.apache.commons.math.fraction.Fraction fraction50 = fraction11.divide(fraction24);
        org.apache.commons.math.fraction.Fraction fraction51 = org.apache.commons.math.fraction.Fraction.TWO;
        float float52 = fraction51.floatValue();
        float float53 = fraction51.floatValue();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction11.subtract(fraction51);
        org.apache.commons.math.fraction.Fraction fraction55 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction59 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction63 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction59.divide(fraction63);
        org.apache.commons.math.fraction.Fraction fraction65 = fraction55.add(fraction59);
        double double66 = fraction55.doubleValue();
        int int67 = fraction55.getDenominator();
        boolean boolean69 = fraction55.equals((java.lang.Object) (byte) 20);
        org.apache.commons.math.fraction.Fraction fraction70 = fraction11.add(fraction55);
        int int71 = fraction55.intValue();
        int int72 = fraction55.getNumerator();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 2.0f + "'", float52 == 2.0f);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 2.0f + "'", float53 == 2.0f);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 2.0d + "'", double66 == 2.0d);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 0.61538464f, (double) 10, (int) (short) 100);
        byte byte4 = fraction3.byteValue();
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((-6), (-2));
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction(0.5263157894736842d);
        int int5 = fraction2.compareTo(fraction4);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (short) 9);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        boolean boolean44 = fraction42.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction45 = fraction12.subtract(fraction42);
        org.apache.commons.math.fraction.Fraction fraction46 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction47 = fraction45.subtract(fraction46);
        double double48 = fraction47.doubleValue();
        int int49 = fraction47.intValue();
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction47.add(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction52.abs();
        org.apache.commons.math.fraction.Fraction fraction54 = org.apache.commons.math.fraction.Fraction.ONE;
        org.apache.commons.math.fraction.Fraction fraction55 = fraction54.negate();
        org.apache.commons.math.fraction.Fraction fraction56 = fraction54.reciprocal();
        int int57 = fraction56.getDenominator();
        boolean boolean58 = fraction53.equals((java.lang.Object) fraction56);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction15.divide(fraction19);
        boolean boolean22 = fraction15.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction15.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction32 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction28.divide(fraction32);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction24.add(fraction28);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction43 = fraction38.divide(fraction42);
        org.apache.commons.math.fraction.Fraction fraction44 = fraction24.add(fraction38);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction15.multiply(fraction24);
        org.apache.commons.math.fraction.Fraction fraction46 = fraction11.divide(fraction45);
        org.apache.commons.math.fraction.Fraction fraction47 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction51.divide(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction47.add(fraction51);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction65 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction66 = fraction61.divide(fraction65);
        org.apache.commons.math.fraction.Fraction fraction67 = fraction47.add(fraction61);
        org.apache.commons.math.fraction.Fraction fraction68 = fraction11.divide(fraction47);
        float float69 = fraction47.floatValue();
        long long70 = fraction47.longValue();
        org.apache.commons.math.fraction.Fraction fraction71 = fraction47.abs();
        org.apache.commons.math.fraction.Fraction fraction72 = fraction71.abs();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertNotNull(fraction68);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 2.0f + "'", float69 == 2.0f);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 2L + "'", long70 == 2L);
        org.junit.Assert.assertNotNull(fraction71);
        org.junit.Assert.assertNotNull(fraction72);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) 1.6666666f, (double) (byte) 33, (-99));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction6 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction10 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction6.divide(fraction10);
        boolean boolean13 = fraction6.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction6.negate();
        org.apache.commons.math.fraction.Fraction fraction15 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction19 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction23 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction19.divide(fraction23);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction15.add(fraction19);
        org.apache.commons.math.fraction.Fraction fraction29 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction33 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = fraction29.divide(fraction33);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction15.add(fraction29);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction6.multiply(fraction15);
        float float37 = fraction15.floatValue();
        org.apache.commons.math.fraction.Fraction fraction38 = fraction2.subtract(fraction15);
        org.apache.commons.math.fraction.Fraction fraction42 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction46 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction47 = fraction42.divide(fraction46);
        boolean boolean49 = fraction42.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction42.negate();
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction58 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction54.divide(fraction58);
        boolean boolean61 = fraction54.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction54.negate();
        org.apache.commons.math.fraction.Fraction fraction63 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction63.add(fraction67);
        org.apache.commons.math.fraction.Fraction fraction77 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction81 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction82 = fraction77.divide(fraction81);
        org.apache.commons.math.fraction.Fraction fraction83 = fraction63.add(fraction77);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction54.multiply(fraction63);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction50.divide(fraction84);
        boolean boolean86 = fraction15.equals((java.lang.Object) fraction50);
        float float87 = fraction50.floatValue();
        double double88 = fraction50.doubleValue();
        int int89 = fraction50.intValue();
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 2.0f + "'", float37 == 2.0f);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction82);
        org.junit.Assert.assertNotNull(fraction83);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + (-10.0f) + "'", float87 == (-10.0f));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-10.0d) + "'", double88 == (-10.0d));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-10) + "'", int89 == (-10));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction20.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction18.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction10.subtract(fraction20);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction10.negate();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction33.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction9.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction7.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction24.divide(fraction28);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction9.add(fraction24);
        org.apache.commons.math.fraction.Fraction fraction31 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction35 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction35.divide(fraction39);
        org.apache.commons.math.fraction.Fraction fraction41 = fraction31.add(fraction35);
        double double42 = fraction31.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction43 = fraction31.negate();
        org.apache.commons.math.fraction.Fraction fraction44 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction53 = fraction48.divide(fraction52);
        org.apache.commons.math.fraction.Fraction fraction54 = fraction44.add(fraction48);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction31.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction30.subtract(fraction55);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction58 = fraction55.negate();
        org.apache.commons.math.fraction.Fraction fraction61 = org.apache.commons.math.fraction.Fraction.getReducedFraction(10, (int) (byte) 2);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction55.multiply(fraction61);
        int int63 = fraction62.getNumerator();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.0d + "'", double42 == 2.0d);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        org.apache.commons.math.fraction.Fraction fraction14 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction14.divide(fraction18);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction0.add(fraction14);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction20.abs();
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (short) 8, (double) 125, 0);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.add(fraction25);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((double) 6, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.fraction.FractionConversionException; message: Overflow trying to convert 6 to fraction (-5/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math.fraction.FractionConversionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        int int3 = fraction2.intValue();
        org.apache.commons.math.fraction.Fraction fraction4 = fraction2.reciprocal();
        long long5 = fraction4.longValue();
        org.apache.commons.math.fraction.Fraction fraction9 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction14 = fraction9.divide(fraction13);
        boolean boolean16 = fraction9.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction17 = fraction9.negate();
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction26 = fraction21.divide(fraction25);
        boolean boolean28 = fraction21.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction29 = fraction21.negate();
        org.apache.commons.math.fraction.Fraction fraction30 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction38 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction39 = fraction34.divide(fraction38);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction30.add(fraction34);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        org.apache.commons.math.fraction.Fraction fraction50 = fraction30.add(fraction44);
        org.apache.commons.math.fraction.Fraction fraction51 = fraction21.multiply(fraction30);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction17.divide(fraction51);
        org.apache.commons.math.fraction.Fraction fraction53 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction57 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction62 = fraction57.divide(fraction61);
        org.apache.commons.math.fraction.Fraction fraction63 = fraction53.add(fraction57);
        org.apache.commons.math.fraction.Fraction fraction67 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction71 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction72 = fraction67.divide(fraction71);
        org.apache.commons.math.fraction.Fraction fraction73 = fraction53.add(fraction67);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction17.divide(fraction53);
        org.apache.commons.math.fraction.Fraction fraction75 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction79 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction79.divide(fraction83);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction75.add(fraction79);
        double double86 = fraction75.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction87 = fraction74.add(fraction75);
        float float88 = fraction74.floatValue();
        org.apache.commons.math.fraction.Fraction fraction89 = fraction74.negate();
        org.apache.commons.math.fraction.Fraction fraction90 = fraction4.subtract(fraction74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction53);
        org.junit.Assert.assertNotNull(fraction62);
        org.junit.Assert.assertNotNull(fraction63);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertNotNull(fraction73);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 2.0d + "'", double86 == 2.0d);
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + (-5.0f) + "'", float88 == (-5.0f));
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) (byte) -1, (int) (byte) 112);
        org.apache.commons.math.fraction.Fraction fraction5 = new org.apache.commons.math.fraction.Fraction(15, (int) '#');
        int int6 = fraction2.compareTo(fraction5);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((-0.06666666666666667d));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = fraction0.negate();
        org.apache.commons.math.fraction.Fraction fraction13 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction17.divide(fraction21);
        org.apache.commons.math.fraction.Fraction fraction23 = fraction13.add(fraction17);
        org.apache.commons.math.fraction.Fraction fraction24 = fraction0.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction25 = fraction17.reciprocal();
        org.apache.commons.math.fraction.Fraction fraction26 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        org.apache.commons.math.fraction.Fraction fraction36 = fraction26.add(fraction30);
        org.apache.commons.math.fraction.Fraction fraction40 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction45 = fraction40.divide(fraction44);
        org.apache.commons.math.fraction.Fraction fraction46 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction50 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction54 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction55 = fraction50.divide(fraction54);
        org.apache.commons.math.fraction.Fraction fraction56 = fraction46.add(fraction50);
        org.apache.commons.math.fraction.Fraction fraction57 = fraction44.subtract(fraction46);
        org.apache.commons.math.fraction.Fraction fraction58 = fraction36.subtract(fraction46);
        org.apache.commons.math.fraction.Fraction fraction59 = fraction58.abs();
        long long60 = fraction59.longValue();
        long long61 = fraction59.longValue();
        boolean boolean62 = fraction17.equals((java.lang.Object) fraction59);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction55);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.fraction.Fraction fraction0 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction4.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction10 = fraction0.add(fraction4);
        double double11 = fraction0.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        float float33 = fraction26.floatValue();
        org.apache.commons.math.fraction.Fraction fraction34 = fraction0.multiply(fraction26);
        int int35 = fraction34.getNumerator();
        int int36 = fraction34.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction39 = new org.apache.commons.math.fraction.Fraction((int) (short) 20, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction40 = fraction34.subtract(fraction39);
        int int41 = fraction39.getDenominator();
        double double42 = fraction39.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.fraction.Fraction fraction1 = new org.apache.commons.math.fraction.Fraction((double) (-400L));
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-400L) + "'", long2 == (-400L));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.fraction.Fraction fraction2 = org.apache.commons.math.fraction.Fraction.getReducedFraction(0, (int) (byte) -1);
        org.apache.commons.math.fraction.Fraction fraction4 = new org.apache.commons.math.fraction.Fraction(100.0d);
        org.apache.commons.math.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math.fraction.Fraction fraction8 = org.apache.commons.math.fraction.Fraction.getReducedFraction((int) ' ', (int) (short) 100);
        org.apache.commons.math.fraction.Fraction fraction9 = fraction5.divide(fraction8);
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.divide(fraction17);
        boolean boolean20 = fraction13.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction13.negate();
        org.apache.commons.math.fraction.Fraction fraction24 = new org.apache.commons.math.fraction.Fraction(12, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction28 = new org.apache.commons.math.fraction.Fraction((double) (byte) 0, (double) (short) 10, (int) (short) 0);
        boolean boolean29 = fraction24.equals((java.lang.Object) (short) 0);
        org.apache.commons.math.fraction.Fraction fraction30 = fraction13.subtract(fraction24);
        double double31 = fraction13.doubleValue();
        org.apache.commons.math.fraction.Fraction fraction32 = fraction9.subtract(fraction13);
        int int33 = fraction32.getDenominator();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        org.apache.commons.math.fraction.Fraction fraction9 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction13 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction17 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction18 = fraction13.divide(fraction17);
        org.apache.commons.math.fraction.Fraction fraction19 = fraction9.add(fraction13);
        org.apache.commons.math.fraction.Fraction fraction20 = fraction7.subtract(fraction9);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction7.negate();
        int int22 = fraction7.getDenominator();
        org.apache.commons.math.fraction.Fraction fraction25 = new org.apache.commons.math.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math.fraction.Fraction fraction26 = fraction25.abs();
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction34 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction35 = fraction30.divide(fraction34);
        boolean boolean37 = fraction30.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction38 = fraction30.negate();
        org.apache.commons.math.fraction.Fraction fraction39 = org.apache.commons.math.fraction.Fraction.TWO;
        float float40 = fraction39.floatValue();
        org.apache.commons.math.fraction.Fraction fraction44 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction48 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction49 = fraction44.divide(fraction48);
        boolean boolean51 = fraction44.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction44.negate();
        org.apache.commons.math.fraction.Fraction fraction56 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction60 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction61 = fraction56.divide(fraction60);
        boolean boolean63 = fraction56.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction64 = fraction56.negate();
        org.apache.commons.math.fraction.Fraction fraction65 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction69 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction73 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction74 = fraction69.divide(fraction73);
        org.apache.commons.math.fraction.Fraction fraction75 = fraction65.add(fraction69);
        org.apache.commons.math.fraction.Fraction fraction79 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction83 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction84 = fraction79.divide(fraction83);
        org.apache.commons.math.fraction.Fraction fraction85 = fraction65.add(fraction79);
        org.apache.commons.math.fraction.Fraction fraction86 = fraction56.multiply(fraction65);
        org.apache.commons.math.fraction.Fraction fraction87 = fraction52.divide(fraction86);
        int int88 = fraction39.compareTo(fraction86);
        org.apache.commons.math.fraction.Fraction fraction89 = fraction86.abs();
        org.apache.commons.math.fraction.Fraction fraction90 = fraction38.add(fraction86);
        int int91 = fraction38.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction92 = fraction25.multiply(fraction38);
        org.apache.commons.math.fraction.Fraction fraction93 = fraction7.multiply(fraction92);
        org.apache.commons.math.fraction.Fraction fraction94 = fraction93.negate();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 2.0f + "'", float40 == 2.0f);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertNotNull(fraction61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNotNull(fraction84);
        org.junit.Assert.assertNotNull(fraction85);
        org.junit.Assert.assertNotNull(fraction86);
        org.junit.Assert.assertNotNull(fraction87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(fraction89);
        org.junit.Assert.assertNotNull(fraction90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-10) + "'", int91 == (-10));
        org.junit.Assert.assertNotNull(fraction92);
        org.junit.Assert.assertNotNull(fraction93);
        org.junit.Assert.assertNotNull(fraction94);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.fraction.Fraction fraction2 = new org.apache.commons.math.fraction.Fraction((-1000), 20);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.fraction.Fraction fraction3 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction7 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction8 = fraction3.divide(fraction7);
        boolean boolean10 = fraction3.equals((java.lang.Object) (byte) 10);
        org.apache.commons.math.fraction.Fraction fraction11 = fraction3.negate();
        org.apache.commons.math.fraction.Fraction fraction12 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction16 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction20 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction21 = fraction16.divide(fraction20);
        org.apache.commons.math.fraction.Fraction fraction22 = fraction12.add(fraction16);
        org.apache.commons.math.fraction.Fraction fraction26 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction30 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction31 = fraction26.divide(fraction30);
        org.apache.commons.math.fraction.Fraction fraction32 = fraction12.add(fraction26);
        org.apache.commons.math.fraction.Fraction fraction33 = fraction3.multiply(fraction12);
        org.apache.commons.math.fraction.Fraction fraction37 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction41 = new org.apache.commons.math.fraction.Fraction((double) (byte) 10, (double) (short) 100, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction42 = fraction37.divide(fraction41);
        boolean boolean44 = fraction42.equals((java.lang.Object) '#');
        org.apache.commons.math.fraction.Fraction fraction45 = fraction12.subtract(fraction42);
        org.apache.commons.math.fraction.Fraction fraction46 = org.apache.commons.math.fraction.Fraction.TWO;
        org.apache.commons.math.fraction.Fraction fraction47 = fraction45.subtract(fraction46);
        org.apache.commons.math.fraction.Fraction fraction51 = new org.apache.commons.math.fraction.Fraction((double) (byte) -1, 0.1d, (int) (short) 1);
        org.apache.commons.math.fraction.Fraction fraction52 = fraction47.subtract(fraction51);
        int int53 = fraction47.getNumerator();
        org.apache.commons.math.fraction.Fraction fraction54 = fraction47.reciprocal();
        byte byte55 = fraction47.byteValue();
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fraction45);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(fraction54);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) -1 + "'", byte55 == (byte) -1);
    }
}

