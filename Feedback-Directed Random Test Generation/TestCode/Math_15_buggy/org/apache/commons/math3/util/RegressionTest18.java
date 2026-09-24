package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 2.852214E30f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-22));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 126.99998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.026525393350093d + "'", double1 == 5.026525393350093d);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.5319611009760749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        float float2 = org.apache.commons.math3.util.FastMath.max(749.99994f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        int int2 = org.apache.commons.math3.util.FastMath.min(22025, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(689.5549024078317d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.0028897723334217395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002889768311459359d) + "'", double1 == (-0.002889768311459359d));
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2L), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1023.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0f + "'", float1 == 1024.0f);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.5481985207131723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.352915182171494d + "'", double1 == 6.352915182171494d);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1500.0003333332963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.17994459767847d + "'", double1 == 26.17994459767847d);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 63L, 0.9892996786096249d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5550944478479611d + "'", double2 == 1.5550944478479611d);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0013810679320049757d, 0.7528415227961108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0013810679320049757d + "'", double2 == 0.0013810679320049757d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.5707860170342276d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        double double1 = org.apache.commons.math3.util.FastMath.acos(10.142599071873668d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        int int1 = org.apache.commons.math3.util.FastMath.round(32.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.709498192047019E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.709497688640562E-4d + "'", double1 == 6.709497688640562E-4d);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.566031181432495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-125.1935622327275d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.17992474214638624d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.960562308042776E17d, 718053.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 718053.0d + "'", double2 == 718053.0d);
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-24));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.303891005617736E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.303891005617736E-43d + "'", double1 == 5.303891005617736E-43d);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1927423644675912d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.010613055774744197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010613255021887393d + "'", double1 == 0.010613255021887393d);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-18L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-17.999998f) + "'", float1 == (-17.999998f));
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.59511985013459d + "'", double1 == 4.59511985013459d);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.814697720372351E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697720390854E-6d + "'", double1 == 3.814697720390854E-6d);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.20945043706303793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20792237885175105d + "'", double1 == 0.20792237885175105d);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5662191695169728d, 1.149937061583715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4575422581490166d + "'", double2 == 0.4575422581490166d);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.2281805647428924E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.09220376963371192d), (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01152547120421399d) + "'", double2 == (-0.01152547120421399d));
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.6843418860808015E-14d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.8058394E32f), 5.4975581E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8058394E32f + "'", float2 == 5.8058394E32f);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2533141373155003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.7285236038432762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.5835191503837134d, 2.649558242894909d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5835191503837134d + "'", double2 == 3.5835191503837134d);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9953743246511807d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6984787287238104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.37928799478267655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3985873642507372d) + "'", double1 == (-0.3985873642507372d));
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.97364275804712E-8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.6916735960212525E41d, (int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1368684E-13f + "'", float1 == 1.1368684E-13f);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        double double1 = org.apache.commons.math3.util.FastMath.acos(9.223372036854776E18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.041199826559248d) + "'", double1 == (-12.041199826559248d));
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.9342812E25f, (-13));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3611831E21f + "'", float2 == 2.3611831E21f);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.7712889028347941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        int int2 = org.apache.commons.math3.util.FastMath.max(491, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 491 + "'", int2 == 491);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.1884223E32f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39890397745201317d) + "'", double1 == (-0.39890397745201317d));
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.17453290855467615d, 0.4261581559972684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3887115991997514d + "'", double2 == 0.3887115991997514d);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8414710492169446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.319776974130475d + "'", double1 == 1.319776974130475d);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.942437867146782d), (double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.942437867146782d + "'", double2 == 0.942437867146782d);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.01744846757651d, 2.5725986423097538E-55d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.01744846757651d + "'", double2 == 2.01744846757651d);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0159153328244164E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007926253663638E-6d + "'", double1 == 1.007926253663638E-6d);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-148.99998f), 126);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2675516869730743E40d) + "'", double2 == (-1.2675516869730743E40d));
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2986.098517434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.7252903E-9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7252903E-9f + "'", float1 == 3.7252903E-9f);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9933953994253428d, 0.027415567780803778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 542.7661979669267d + "'", double2 == 542.7661979669267d);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5640850181635741d, 5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.119122635657405d + "'", double2 == 50.119122635657405d);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        long long2 = org.apache.commons.math3.util.FastMath.min(128L, (long) (-6));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4096L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9056071494359416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.617207988524648d + "'", double1 == 0.617207988524648d);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.6536436208636119d), (-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6608477233233698d + "'", double2 == 0.6608477233233698d);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 3.5963016834733655E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        double double1 = org.apache.commons.math3.util.FastMath.log(18128.26395102926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.805227543567195d + "'", double1 == 9.805227543567195d);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 6, 1.0842022E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-15L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        long long1 = org.apache.commons.math3.util.FastMath.abs(91555L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 91555L + "'", long1 == 91555L);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 31, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1911036946760945E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1911036946760945E-44d + "'", double1 == 1.1911036946760945E-44d);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-2147483648));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.490388801525532d), (-0.8141342142776004d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.490388801525532d) + "'", double2 == (-0.490388801525532d));
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1317761108019555d) + "'", double1 == (-2.1317761108019555d));
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-6.1944148E10f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5491382441002744E12d) + "'", double1 == (-3.5491382441002744E12d));
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.6770294200238824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8851932049196716d + "'", double1 == 0.8851932049196716d);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1.1884223E32f), 1.0785793105465808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1884223409998995E32d) + "'", double2 == (-1.1884223409998995E32d));
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5707453850936495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        float float2 = org.apache.commons.math3.util.FastMath.min(1024.0001f, 9.6714065E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.0405935286659937d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.929946017359989E43d + "'", double1 == 6.929946017359989E43d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.6503694795665515E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8804381292861606E38d + "'", double1 == 2.8804381292861606E38d);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.080594477611303E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594477611303E-9d + "'", double1 == 2.080594477611303E-9d);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 52.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.05284163291d) + "'", double1 == (-6.05284163291d));
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5707846912665506d, 0.26697894345395573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707846912665506d + "'", double2 == 1.5707846912665506d);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.2949673E9f, 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.223015277861142E-61d, 1.570793586881831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570793586881831d + "'", double2 == 1.570793586881831d);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(20.0f, (-4));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.25f + "'", float2 == 1.25f);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        double double2 = org.apache.commons.math3.util.FastMath.max(11.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.8996937401571152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9562112315661497d + "'", double1 == 0.9562112315661497d);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1031.411577317404d, 0.699521118285311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1031.411577317404d + "'", double2 == 1031.411577317404d);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.2676505246703655E30d), (-0.05235987755982989d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05235987755982989d) + "'", double2 == (-0.05235987755982989d));
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        long long1 = org.apache.commons.math3.util.FastMath.round(10.882734304052615d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.1197783433152602d), 1.5705521861747473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705521861747473d + "'", double2 == 1.5705521861747473d);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.6702884E-4f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6702884E-4f + "'", float2 == 2.6702884E-4f);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.6634567844538422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.032901175362929E306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.2483916387378414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8218158288739401d + "'", double1 == 1.8218158288739401d);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.38991180981350987d), 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.945107843125297E-11d) + "'", double2 == (-5.945107843125297E-11d));
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.923076923076923d + "'", double1 == 0.923076923076923d);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        double double1 = org.apache.commons.math3.util.FastMath.sin(96.99999237060545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37961479733204306d + "'", double1 == 0.37961479733204306d);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        float float2 = org.apache.commons.math3.util.FastMath.min(144.00002f, (float) 1023L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 144.00002f + "'", float2 == 144.00002f);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.29100619138474915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.234410735800729d) + "'", double1 == (-1.234410735800729d));
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.3197768247158534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.74258603134906d + "'", double1 == 2.74258603134906d);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5632219282013815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5103640569244964d + "'", double1 == 0.5103640569244964d);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.0f, 46);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.40737488E14f + "'", float2 == 1.40737488E14f);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 40, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9541884483339822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5782710483547281d + "'", double1 == 0.5782710483547281d);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        float float2 = org.apache.commons.math3.util.FastMath.max(152576.0f, 7.7309411E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7309411E10f + "'", float2 == 7.7309411E10f);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.852214E30f, 2.0769192E34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.852214E30f + "'", float2 == 2.852214E30f);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5728101655170956d, (double) (-5.4470154E9f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5728101655170956d + "'", double2 == 1.5728101655170956d);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(32.012825901536246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 95L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        int int1 = org.apache.commons.math3.util.FastMath.round(35.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.9565213251730015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016694446489808196d) + "'", double1 == (-0.016694446489808196d));
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.035952442790704d), 1.6634567844538422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.035952442790704d) + "'", double2 == (-1.035952442790704d));
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(91.45331109916607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.526703772217925d + "'", double1 == 4.526703772217925d);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.2698187618349674d, 4583.662361046586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.272740699632835d, 74.20321057778874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.20321057778874d + "'", double2 == 74.20321057778874d);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        float float2 = org.apache.commons.math3.util.FastMath.min((-148.99997f), (float) 22025L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99997f) + "'", float2 == (-148.99997f));
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4096.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.731673471130767d, 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4134023217187222E12d + "'", double2 == 1.4134023217187222E12d);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8604993868447559d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4229508134974652d + "'", double1 == 0.4229508134974652d);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.150426909772811E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.938953933193034E-64d, 1.007926253663638E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9237061502716802E-58d + "'", double2 == 1.9237061502716802E-58d);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.331580545039619E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3315805450392256E-6d + "'", double1 == 1.3315805450392256E-6d);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-149.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.008007012061949E27d, 97.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.3312028E-30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9997926233378113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5428369586927122d + "'", double1 == 1.5428369586927122d);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-10));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-9.999999f) + "'", float1 == (-9.999999f));
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7616681427904104d, 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14871697379123927d + "'", double2 == 0.14871697379123927d);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.26697894345395573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00465966159676729d + "'", double1 == 0.00465966159676729d);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.08933569103737334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08957411090233484d) + "'", double1 == (-0.08957411090233484d));
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.8058397E32f, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-1023L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-58613.58244188321d) + "'", double1 == (-58613.58244188321d));
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.03079199E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.05191062988041d + "'", double1 == 26.05191062988041d);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        int int2 = org.apache.commons.math3.util.FastMath.min(491, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.997430371134407E-6d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002045368700041633d + "'", double2 == 0.002045368700041633d);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.447014912E9d) + "'", double1 == (-5.447014912E9d));
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9746486480944884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6502358819528935d + "'", double1 == 1.6502358819528935d);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.08100514452844133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5628918379719732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2291505608351976d + "'", double1 == 1.2291505608351976d);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.8387762206112901d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.08957411090233484d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09384277895632799d) + "'", double1 == (-0.09384277895632799d));
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(458.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0349923532670324E198d + "'", double1 == 4.0349923532670324E198d);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7854589990470453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1934134844133713d + "'", double1 == 2.1934134844133713d);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        float float1 = org.apache.commons.math3.util.FastMath.signum(99.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.475789056E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015625E-7d + "'", double1 == 2.384185791015625E-7d);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.19209275E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920928E-7f + "'", float1 == 1.1920928E-7f);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        int int2 = org.apache.commons.math3.util.FastMath.min((-12), (-58));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.132641710488177d, 0.17889431650439688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.132641710488177d + "'", double2 == 2.132641710488177d);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(631011.7625152355d, 7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7245108309088053d) + "'", double2 == (-1.7245108309088053d));
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 5.8058394E32f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.0592232274909887d), 3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.970566590482209E45d + "'", double2 == 3.970566590482209E45d);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.15655567643651128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(18.582769399647436d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(142.97737232337548d, 1.522997974471263E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3622751527519704E-9d + "'", double2 == 1.3622751527519704E-9d);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8230640525110062d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.874503450949394E225d + "'", double2 == 4.874503450949394E225d);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-97.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 149, (long) 75);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 75L + "'", long2 == 75L);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 14.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-148.99997f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693147180044656d + "'", double1 == 10.693147180044656d);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(31.594603878732347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.146383875253181d + "'", double1 == 4.146383875253181d);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5664551939031287d, 0.9872429529221711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02258986917884267d + "'", double2 == 0.02258986917884267d);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-58), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58L) + "'", long2 == (-58L));
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-40), 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1018L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1018.0000000000001d + "'", double1 == 1018.0000000000001d);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.6302967986234014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7295694068782594d) + "'", double1 == (-0.7295694068782594d));
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-6L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        float float2 = org.apache.commons.math3.util.FastMath.max(75.99999f, 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884224E32f + "'", float2 == 1.1884224E32f);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 384L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6636564336219596d + "'", double1 == 0.6636564336219596d);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5550944478479611d, 0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030765742067207565d + "'", double2 == 0.030765742067207565d);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 0, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.1884223409998995E32d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.011481803329747568d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        int int2 = org.apache.commons.math3.util.FastMath.max(17, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4096.0005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.0480573415747148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8119200707031418d + "'", double1 == 3.8119200707031418d);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.335516632346646d, 12.000001907348633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26338.81768250355d + "'", double2 == 26338.81768250355d);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1024.9999f, (-9.215233751015083E-4d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9998f + "'", float2 == 1024.9998f);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.8146972655972444E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972655787406E-6d + "'", double1 == 3.8146972655787406E-6d);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        long long2 = org.apache.commons.math3.util.FastMath.min(1023L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(201.7156361224559d, (-29));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.757246511475293E-7d + "'", double2 == 3.757246511475293E-7d);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.09951163E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.299737579712394E13d + "'", double1 == 6.299737579712394E13d);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.0014019802331286901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0014029634668535d + "'", double1 == 1.0014029634668535d);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32.00001f, 6.5659969E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.193701610660931d + "'", double2 == 5.193701610660931d);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5305894532583966d, 0.13925318512771137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13925318512771137d + "'", double2 == 0.13925318512771137d);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-3.0948500982134507E26d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7732184885327904E28d) + "'", double1 == (-1.7732184885327904E28d));
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.7966228647962957d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        double double1 = org.apache.commons.math3.util.FastMath.tan(96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8826122347595406d) + "'", double1 == (-1.8826122347595406d));
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 491);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.732170406228067E213d + "'", double1 == 1.732170406228067E213d);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 12, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.408103815583578E-37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.35574818593391d) + "'", double1 == (-36.35574818593391d));
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1025, (-1.9174489497410363d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9999f + "'", float2 == 1024.9999f);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.0000005f, (float) 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-8), (long) 187);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        int int2 = org.apache.commons.math3.util.FastMath.max(458, 6400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6400 + "'", int2 == 6400);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-105.99999f), (-95));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.675816E-27f) + "'", float2 == (-2.675816E-27f));
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.6702884E-4f, (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.94762912722163E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6320731716081741d) + "'", double1 == (-0.6320731716081741d));
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        double double1 = org.apache.commons.math3.util.FastMath.tan(79.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4956775331813735d + "'", double1 == 0.4956775331813735d);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 255.99998f, (-0.16193403859934294d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16193403859934294d) + "'", double2 == (-0.16193403859934294d));
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.2676505246703657E30d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(26.179943040972688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.000244140625d + "'", double1 == 1500.000244140625d);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        float float2 = org.apache.commons.math3.util.FastMath.min(22026.002f, 4096.001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.001f + "'", float2 == 4096.001f);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.6071863961886731E72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2677485540077233E36d + "'", double1 == 1.2677485540077233E36d);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.548258033850413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.5523011999578556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9856741962082413d + "'", double1 == 0.9856741962082413d);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.3132203057100895d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 31L, (-106));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.821045E-31f + "'", float2 == 3.821045E-31f);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5510703289701874E21d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        int int2 = org.apache.commons.math3.util.FastMath.max(99, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.5136814478622125d), 0.8602422030507897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3465607551885772d + "'", double2 == 0.3465607551885772d);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.23794004E27f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4757395E20f + "'", float1 == 1.4757395E20f);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.194983122255699E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403548280338642E98d + "'", double1 == 2.403548280338642E98d);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 458, 2979L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2979L + "'", long2 == 2979L);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        long long1 = org.apache.commons.math3.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.7363713281677684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012852104193811222d) + "'", double1 == (-0.012852104193811222d));
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.701627437177594d + "'", double1 == 12.701627437177594d);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-5.8282604197892285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4008731049272538d) + "'", double1 == (-1.4008731049272538d));
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(187.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 187.00002f + "'", float1 == 187.00002f);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        int int1 = org.apache.commons.math3.util.FastMath.abs(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.73480027861034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7465529249723732d + "'", double1 == 1.7465529249723732d);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        double double1 = org.apache.commons.math3.util.FastMath.log10(20.50895781851543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3119435918570213d + "'", double1 == 1.3119435918570213d);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0024151728426471814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.5172160209448105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4773253761765821d + "'", double1 == 0.4773253761765821d);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-17), 0.9996666852588395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.512060043241628d) + "'", double2 == (-1.512060043241628d));
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.739913065842745E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.739916819407977E-6d + "'", double1 == 2.739916819407977E-6d);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.53680964411134d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.8414038674724426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3753630084935735d + "'", double1 == 1.3753630084935735d);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(97.7057641025183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.88462260799664d + "'", double1 == 9.88462260799664d);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        double double2 = org.apache.commons.math3.util.FastMath.log(15.33750100937614d, 1.5293379817722996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15560004901740182d + "'", double2 == 0.15560004901740182d);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.016697371032360686d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1.9843748f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9843748f + "'", float1 == 1.9843748f);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1024.999755859375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698207171159557d + "'", double1 == 1.5698207171159557d);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 113);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.00000000000001d + "'", double1 == 113.00000000000001d);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.31475050324190496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1559750071966712d) + "'", double1 == (-1.1559750071966712d));
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 187.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.231108616854587d + "'", double1 == 5.231108616854587d);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-7.623359472495549E-46d), 53.80040108927525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.623359472495549E-46d + "'", double2 == 7.623359472495549E-46d);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.942437867146782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.229847641836995d) + "'", double1 == (-1.229847641836995d));
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        double double2 = org.apache.commons.math3.util.FastMath.min(430.07458243245395d, (-1.0208471007628152E39d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0208471007628152E39d) + "'", double2 == (-1.0208471007628152E39d));
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        double double1 = org.apache.commons.math3.util.FastMath.exp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(5.045031552153607E46d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.7782794100389228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.923689848499634d) + "'", double1 == (-6.923689848499634d));
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1218112307612413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48870348902037325d + "'", double1 == 0.48870348902037325d);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.12522031689999574d), 0.10876056725620209d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.016459749643793653d) + "'", double2 == (-0.016459749643793653d));
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.565996913733051E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.6071863961886731E72d, 2.3016241492783763E19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.8473424962137006E18d) + "'", double2 == (-4.8473424962137006E18d));
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.7778932E22f, (-750.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-750.0f) + "'", float2 == (-750.0f));
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8013707341213301d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.570796326880503d, (-7.23494048220588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326880503d + "'", double2 == 1.570796326880503d);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7243954228040914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5663168272343027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079207E11f, (double) 1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079207E11f + "'", float2 == 1.03079207E11f);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        double double2 = org.apache.commons.math3.util.FastMath.min((-10.07608628613008d), 29.885930658415557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.07608628613008d) + "'", double2 == (-10.07608628613008d));
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.736158605041556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3218504913802663d + "'", double1 == 0.3218504913802663d);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(57.92410399097922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.162897504863918E24d + "'", double1 == 7.162897504863918E24d);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(97.19293729440321d, (-4.8473424962137006E18d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        double double2 = org.apache.commons.math3.util.FastMath.pow(92.11639988914972d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6585072831013276E208d + "'", double2 == 1.6585072831013276E208d);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.000053996151583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000179983932502d + "'", double1 == 1.0000179983932502d);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        double double1 = org.apache.commons.math3.util.FastMath.rint(192.21757041936067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.0d + "'", double1 == 192.0d);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5707886974003655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012797588617087d + "'", double1 == 2.3012797588617087d);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-4L), (float) 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.6502358819528935d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-3.120909654024235E11d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 58);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.060443010546419d + "'", double1 == 4.060443010546419d);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.5353358E26f), 7.555787E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5353358E26f + "'", float2 == 1.5353358E26f);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 54);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 54L + "'", long1 == 54L);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.5f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        float float2 = org.apache.commons.math3.util.FastMath.min(100.0f, 32.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000008f + "'", float2 == 32.000008f);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.5673717388783177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034245812227677703d + "'", double1 == 0.0034245812227677703d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(32.012825901536246d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6854304746023417E8d + "'", double2 == 2.6854304746023417E8d);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.05938145312611983d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05938145312611983d) + "'", double2 == (-0.05938145312611983d));
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(71.57358444733086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.067122724452812E30d + "'", double1 == 6.067122724452812E30d);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        long long2 = org.apache.commons.math3.util.FastMath.max(76L, (long) 6400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6400L + "'", long2 == 6400L);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.01669581953729926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016694268388183147d) + "'", double1 == (-0.016694268388183147d));
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 384L, 3.27151120192428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 384.0d + "'", double2 == 384.0d);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(138.0088572840262d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-7.263102063200969E31d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.263102063200969E31d + "'", double1 == 7.263102063200969E31d);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1975712214073553d, 0.7911843097149077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.197571221407355d + "'", double2 == 1.197571221407355d);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.2281805647428924E20d, (double) 187.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11077313933148569d + "'", double2 == 0.11077313933148569d);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-31.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4524424832623713E13d) + "'", double1 == (-1.4524424832623713E13d));
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.008726646259971648d, 0.018471250572709978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44136145796865006d + "'", double2 == 0.44136145796865006d);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.14672230633339658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4235424286497185d + "'", double1 == 1.4235424286497185d);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        int int2 = org.apache.commons.math3.util.FastMath.min(25, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-12));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.021986227279203782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02198799865777131d) + "'", double1 == (-0.02198799865777131d));
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 22025, 91555L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.822713036326232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05944444878960272d + "'", double1 == 0.05944444878960272d);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600540585471551d + "'", double1 == 2.600540585471551d);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.016694268388183147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01669504393031421d) + "'", double1 == (-0.01669504393031421d));
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        double double1 = org.apache.commons.math3.util.FastMath.log(303.5697911758657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.715611538515039d + "'", double1 == 5.715611538515039d);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 102400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.229789172123647d + "'", double1 == 12.229789172123647d);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(12.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.22374095013561138d), 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1069958542442103E-15d) + "'", double2 == (-1.1069958542442103E-15d));
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.12520241624226194d, 1.1977461928657025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2042722231942349d + "'", double2 == 1.2042722231942349d);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.20893701516559085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2104878579383556d + "'", double1 == 0.2104878579383556d);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0124843102732668d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.825057577012692E22d + "'", double2 == 3.825057577012692E22d);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8547811746108328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014918745881023593d) + "'", double1 == (-0.014918745881023593d));
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8898290414478994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.5537689358093707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4071815998801638d + "'", double1 == 0.4071815998801638d);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.014810290931637665d, 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9385244584858893E-57d + "'", double2 == 1.9385244584858893E-57d);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-13), (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13L) + "'", long2 == (-13L));
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.18387663746222113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 18, 54L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.7033631291413862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5326046080411152d + "'", double1 == 0.5326046080411152d);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        double double2 = org.apache.commons.math3.util.FastMath.log(8.665547095541333d, 1.0130505418701649E-214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-228.18861657988955d) + "'", double2 == (-228.18861657988955d));
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1023L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.16295463120745166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-10), 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-81920.0f) + "'", float2 == (-81920.0f));
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        long long2 = org.apache.commons.math3.util.FastMath.min(1023L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.1011072703299664E-10d, 4.5849675565215335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.763640597454251E-11d + "'", double2 == 6.763640597454251E-11d);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.027188589065316054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027185240457135752d) + "'", double1 == (-0.027185240457135752d));
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(96.99999999999956d, (-1.5707846912665506d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999955d + "'", double2 == 96.99999999999955d);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-24.225019901583217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.5631773624134415E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 152737.5477241231d + "'", double1 == 152737.5477241231d);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8414700862537113d, (double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.134967001436558d + "'", double2 == 3.134967001436558d);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 2.14748352E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.14748352E9d + "'", double1 == 2.14748352E9d);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6916437678655323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9969954337286333d + "'", double1 == 1.9969954337286333d);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.15707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9876883405951378d + "'", double1 == 0.9876883405951378d);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.017453291479645992d), 0.7712901770311058d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01745329147964599d) + "'", double2 == (-0.01745329147964599d));
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-15L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-253.99998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.888867008940965E-111d + "'", double1 == 4.888867008940965E-111d);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        int int1 = org.apache.commons.math3.util.FastMath.abs(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.000008f, 3.7778936E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.7778936E22f + "'", float2 == 3.7778936E22f);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.4304874857964348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.358015285337246d + "'", double1 == 0.358015285337246d);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(22026.002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.30829220390157d, (-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.30829220390157d + "'", double2 == 5.30829220390157d);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.3278128830900011d, (double) 149);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3278128830900011d + "'", double2 == 1.3278128830900011d);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.004420564839032246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.421487799420931d) + "'", double1 == (-5.421487799420931d));
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.1239687940820016E33d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.103E-42f, 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.6827E-41f + "'", float2 == 1.6827E-41f);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1023.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.2261911708835171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0326329306069673d) + "'", double1 == (-1.0326329306069673d));
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(53247.99609374999d, (-41.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-53247.99609374999d) + "'", double2 == (-53247.99609374999d));
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3817208956030992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46480319506176976d + "'", double1 == 0.46480319506176976d);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(39.999996f, 1.20892575E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.735936195599085E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.735936195599085E-13d + "'", double1 == 6.735936195599085E-13d);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(12.182493960703473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 15.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 859.4366926962348d + "'", double1 == 859.4366926962348d);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.9999999f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1023L), 491L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023L) + "'", long2 == (-1023L));
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 127L, 2.998223140086234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0353861803779d + "'", double2 == 127.0353861803779d);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.171871484450947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1718714844509472d + "'", double1 == 3.1718714844509472d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.688523605579533E-19d + "'", double1 == 9.688523605579533E-19d);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-1.1884223E32f), 0.13608771814969906d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4564611501574685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.9999998f) + "'", float1 == (-2.9999998f));
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.7245108309088053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3131817430873023d) + "'", double1 == (-1.3131817430873023d));
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.2169445E35f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.366949567869811d, (double) 91555L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        float float1 = org.apache.commons.math3.util.FastMath.signum(126.99998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        double double1 = org.apache.commons.math3.util.FastMath.floor(41.000008589004516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.0d + "'", double1 == 41.0d);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1638400.1f, (-812.3305865367872d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-70.66804469982867d) + "'", double2 == (-70.66804469982867d));
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-41));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2L), 79L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79L + "'", long2 == 79L);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.014609506662591823d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014503305630723837d) + "'", double1 == (-0.014503305630723837d));
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        double double1 = org.apache.commons.math3.util.FastMath.cos(9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999995453d + "'", double1 == 0.9999999999995453d);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(91555.1670122018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.011481803329747568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01148129881402415d) + "'", double1 == (-0.01148129881402415d));
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 8, 1.5698207171159557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.1846511283989136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1686057168823844d) + "'", double1 == (-0.1686057168823844d));
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.9999999f), 12.000003f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 18L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.01831563888873418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001677360029693d + "'", double1 == 1.0001677360029693d);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1500.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1499.9999f) + "'", float1 == (-1499.9999f));
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999969540041d + "'", double1 == 0.999999969540041d);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.682208564883936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6822085648839359d) + "'", double1 == (-0.6822085648839359d));
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22542773337036262d + "'", double1 == 0.22542773337036262d);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.401298464324817E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1190346870425511E-15d + "'", double1 == 1.1190346870425511E-15d);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.2559109434391555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30970749210249116d + "'", double1 == 0.30970749210249116d);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        long long2 = org.apache.commons.math3.util.FastMath.max(40L, (-18L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.366949567869811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1098156141715485d + "'", double1 == 1.1098156141715485d);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(182.7525636550004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1678846581090771E79d + "'", double1 == 1.1678846581090771E79d);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.00855711691964206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.449917992279107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.80412134742886d + "'", double1 == 42.80412134742886d);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.14672230633339658d, 11.55574042944425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2750964157712537d) + "'", double2 == (-1.2750964157712537d));
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.8058394E32f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5172160209448105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-13L), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7430898918006683d) + "'", double1 == (-0.7430898918006683d));
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, 83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7951117725632785d + "'", double1 == 0.7951117725632785d);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.7632731405797343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-5.945107843125297E-11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2924697071141057E-26d + "'", double1 == 1.2924697071141057E-26d);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8376078965335373d, 1.5060119336077026E83d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1080.8037039957246d) + "'", double2 == (-1080.8037039957246d));
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.0363257828322695E43d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 143 + "'", int1 == 143);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 2.1E-43f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6685908008412536E-45d + "'", double1 == 3.6685908008412536E-45d);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.01183377622733977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011833500047838525d + "'", double1 == 0.011833500047838525d);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 5.4975581E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.149868789856197E13d + "'", double1 == 3.149868789856197E13d);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 22026L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.0f + "'", float1 == 22026.0f);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 54.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.16125382097679095d), 1.588250504492026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5964155034948735d + "'", double2 == 1.5964155034948735d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.50795741233152E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.155827134643942E16d + "'", double1 == 3.155827134643942E16d);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        long long1 = org.apache.commons.math3.util.FastMath.abs(127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 61944147371L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.792000279484455d + "'", double1 == 10.792000279484455d);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) -1, (float) 40L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.6975132016108923d, 97.01274530769818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6975132016108923d + "'", double2 == 3.6975132016108923d);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-31.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1025.1141356311623d, (-0.3985873642507372d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1025.1141356311623d) + "'", double2 == (-1025.1141356311623d));
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.025817018473160622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.777893186295716E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.164573350259754E24d + "'", double1 == 2.164573350259754E24d);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-127), (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-127L) + "'", long2 == (-127L));
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(12.378790834633142d, 3.176091259055682d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.378790834633142d + "'", double2 == 12.378790834633142d);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.842171E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8421713E-14f + "'", float1 == 2.8421713E-14f);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7220087218417287d, (double) 5.4975581E11f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7220087218417287d + "'", double2 == 0.7220087218417287d);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-22), 144);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, 1023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5262586308923471d, 2.0677263196157526E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5262586308923471d + "'", double2 == 1.5262586308923471d);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.48571428571429d + "'", double1 == 17.48571428571429d);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(23.1114808588885d, 1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5793500848110944d + "'", double2 == 0.5793500848110944d);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 102400.0f, (-0.9969063677702439d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102400.0d + "'", double2 == 102400.0d);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.5877813477142805d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(53247.996f, 67);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.858017E24f + "'", float2 == 7.858017E24f);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.016451973321653327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9426286359925616d + "'", double1 == 0.9426286359925616d);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.76837158203125E-7d, 91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.76837158203125E-7d + "'", double2 == 4.76837158203125E-7d);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7341433604804715d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5640850181635741d, 1.0011995791823076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.564924489102427d + "'", double2 == 1.564924489102427d);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-52.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.644483341943245d) + "'", double1 == (-4.644483341943245d));
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.76837158203125E-7d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.044629098073146E23d + "'", double2 == 6.044629098073146E23d);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8996937401571152d, 8.700388696552714d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8996937401571152d + "'", double2 == 1.8996937401571152d);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.733241996798949E32d, 0.7920349615599266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.733241996798949E32d + "'", double2 == 3.733241996798949E32d);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.536743E-7f, 7.7309411E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536743E-7f + "'", float2 == 9.536743E-7f);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 138);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999992724d + "'", double1 == 0.999999999992724d);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.008726646259971648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.688523605579533E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.688523605579533E-19d + "'", double1 == 9.688523605579533E-19d);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3427276565203914d + "'", double1 == 1.3427276565203914d);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.7400166479096761d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47710597263777993d + "'", double1 == 0.47710597263777993d);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.22122547E12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.22122547E12f + "'", float1 == 3.22122547E12f);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        double double1 = org.apache.commons.math3.util.FastMath.acos(89.36395823877761d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-9223372036854775808L), 75.69676347110224d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 144L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 144.0f + "'", float1 == 144.0f);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.220446049250313E-16d, (double) 511.99997f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 511.9999694824219d + "'", double2 == 511.9999694824219d);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        double double2 = org.apache.commons.math3.util.FastMath.min(1501.9343928329747d, 4.342915917084086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.342915917084086d + "'", double2 == 4.342915917084086d);
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(18.02648053791345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 97.000015f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3795936223522175d + "'", double1 == 0.3795936223522175d);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.820766E-11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.820767E-11f + "'", float1 == 5.820767E-11f);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.997430371134407E-6d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1829554707706782E220d + "'", double2 == 1.1829554707706782E220d);
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.3076604860118306d, 4.078211580357636E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3076604860118306d + "'", double2 == 1.3076604860118306d);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 7.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6339157938496336d + "'", double1 == 2.6339157938496336d);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-41L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-41.0d) + "'", double1 == (-41.0d));
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.294967296E9d, 7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796325165082d + "'", double2 == 1.570796325165082d);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974482d) + "'", double1 == (-0.7853981633974482d));
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.948711661578621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.626485134661138d + "'", double1 == 2.626485134661138d);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.570796326880503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810477381377159d + "'", double1 == 3.810477381377159d);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1604860206486705d + "'", double1 == 1.1604860206486705d);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        int int2 = org.apache.commons.math3.util.FastMath.min(113, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2.14748352E9f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8342233605065102d, (-1.1529510720305247E-14d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1025.1141356311623d), 3269017.3724721107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1025.1141356311623d) + "'", double2 == (-1025.1141356311623d));
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.30970749210249116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5090482885424269d) + "'", double1 == (-0.5090482885424269d));
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        int int2 = org.apache.commons.math3.util.FastMath.max(15, (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 8.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.12717101690833E64d + "'", double1 == 5.12717101690833E64d);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.6674909751808555d), 7.342690407571987E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.667490975180855d) + "'", double2 == (-2.667490975180855d));
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9875650456761653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7563221378721828d + "'", double1 == 0.7563221378721828d);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-253.99998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-3), (double) 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.047583103276983396d) + "'", double2 == (-0.047583103276983396d));
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.555789E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1638400.0f, 1.5376614260315677d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638399.9f + "'", float2 == 1638399.9f);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.16589945506899414d, (-100));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0363442695397117E78d + "'", double2 == 1.0363442695397117E78d);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.0065821320002953E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0065821320002953E46d + "'", double1 == 4.0065821320002953E46d);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.2855802432114244d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.789432859409374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013778202620127075d + "'", double1 == 0.013778202620127075d);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.4293757289532156d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

