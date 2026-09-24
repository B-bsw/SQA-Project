package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(11013.232874703393d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(694.6843595023288d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.784919058198862E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3201254043604727d) + "'", double1 == (-3.3201254043604727d));
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        double double1 = org.apache.commons.math3.util.FastMath.asin(25.751006598945605d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0000000000291038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531175985E-6d + "'", double1 == 7.629394531175985E-6d);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 22025L, 9.0071993E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0071993E15f + "'", float2 == 9.0071993E15f);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.49999997f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(95.0f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.5f + "'", float2 == 47.5f);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        double double2 = org.apache.commons.math3.util.FastMath.max(54.598150033144236d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.598150033144236d + "'", double2 == 54.598150033144236d);
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 54, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.289430284648579d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2855345016765238d) + "'", double1 == (-0.2855345016765238d));
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-41.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.973642758047121E-8d, 2.7399168194079767E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7515747242440782d + "'", double2 == 0.7515747242440782d);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8205677036841424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8205677036841424d + "'", double1 == 0.8205677036841424d);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 31, (-17L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1638400.1f, (-0.1612272431311002d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638400.0f + "'", float2 == 1638400.0f);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.007169486024867073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5636267793481837d + "'", double1 == 1.5636267793481837d);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9999751568045011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931347588850472d + "'", double1 == 0.6931347588850472d);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.9074079744350795E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.516582543750002E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9953429846907599d) + "'", double1 == (-0.9953429846907599d));
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3552527E-20f + "'", float1 == 1.3552527E-20f);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(126.999985f, 3.4900006E33f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.999985f + "'", float2 == 126.999985f);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        double double1 = org.apache.commons.math3.util.FastMath.rint(65.7845440269863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.0d + "'", double1 == 66.0d);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3817208956030992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38172089560309924d + "'", double1 == 0.38172089560309924d);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 20L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.689503868988906d + "'", double1 == 3.689503868988906d);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.6210082E32f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.6714065E24f + "'", float1 == 9.6714065E24f);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.14748365E9f, (-0.5136814478622124d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748352E9f + "'", float2 == 2.14748352E9f);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5137.518865003625d), (-0.08957411090233484d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4983023731160971E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.824400532615102d) + "'", double1 == (-4.824400532615102d));
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9687524870063974d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        int int2 = org.apache.commons.math3.util.FastMath.min(67, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.586176193003373d), (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        long long2 = org.apache.commons.math3.util.FastMath.min(99L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-29), 53247.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 29.0f + "'", float2 == 29.0f);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.26697894345395573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645723078325875d + "'", double1 == 0.9645723078325875d);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        float float1 = org.apache.commons.math3.util.FastMath.abs(32.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.00001f + "'", float1 == 32.00001f);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.3686469200204923d, (-0.24860975225892687d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11745060256877643d) + "'", double2 == (-0.11745060256877643d));
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.948711661578621d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8685889576973276d + "'", double2 == 0.8685889576973276d);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.031640083996804645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031645363382257624d) + "'", double1 == (-0.031645363382257624d));
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-2.0122792E-16f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1529510720305247E-14d) + "'", double1 == (-1.1529510720305247E-14d));
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(97.01274530769818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594902123519659d + "'", double1 == 4.594902123519659d);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        int int2 = org.apache.commons.math3.util.FastMath.min((-6), 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 22026, 25);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.3906992E11f + "'", float2 == 7.3906992E11f);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.15167488020881612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15109926591754116d + "'", double1 == 0.15109926591754116d);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.11812448149071139d, 7.236605282015445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.926562324824456d) + "'", double2 == (-0.926562324824456d));
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.935723255711777E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.12049738039639d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7450729502920265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.47381939152118935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7795984079551379d + "'", double1 == 0.7795984079551379d);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.5422429081369673E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2533141373155003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.01294875932935354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012948397502779277d) + "'", double1 == (-0.012948397502779277d));
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(138.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.41032129904822556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7430898918006583d) + "'", double1 == (-0.7430898918006583d));
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.2844135865397565E222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 512.0d + "'", double1 == 512.0d);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9816129037711879d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10.000002f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.142794603177835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.39153270995434547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37318574508451813d + "'", double1 == 0.37318574508451813d);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.551635497780683E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.551635497780683E154d + "'", double1 == 2.551635497780683E154d);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.147124287800051E46d, (double) (-5.9999995f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 67, (long) 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.05010842414258889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9934708510524944d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        double double2 = org.apache.commons.math3.util.FastMath.pow(223.23772953327423d, (-106));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0730865139526097E-249d + "'", double2 == 1.0730865139526097E-249d);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1.0384594E34f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3459005707375704d + "'", double1 == 3.3459005707375704d);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0592232274909887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0592232274909885d) + "'", double1 == (-1.0592232274909885d));
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000000037838663d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.913120061551325d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.02991027634527111d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        float float1 = org.apache.commons.math3.util.FastMath.signum(255.99998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.5797630630139097E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.5818829705452302d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 1.5209081446769386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5209081446769386d + "'", double2 == 1.5209081446769386d);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6931471805599453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-10.193662019676344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13366.606729185423d + "'", double1 == 13366.606729185423d);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        int int1 = org.apache.commons.math3.util.FastMath.round(17.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        long long1 = org.apache.commons.math3.util.FastMath.abs(144L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 144L + "'", long1 == 144L);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 12.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 6400L, 3.22122547E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.22122547E12f + "'", float2 == 3.22122547E12f);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.15919046908362347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-41));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1018L, 1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4551915E-11f + "'", float2 == 1.4551915E-11f);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9992687429159126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6927814851594889d + "'", double1 == 0.6927814851594889d);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9999991684716266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 1, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-148.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.646977960169689E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5319611009760749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        double double2 = org.apache.commons.math3.util.FastMath.pow(15.851614849324065d, (double) 22025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.38172089560309924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.08933569103737334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08921728642486809d) + "'", double1 == (-0.08921728642486809d));
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9996666852588395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4478088296491666E-4d) + "'", double1 == (-1.4478088296491666E-4d));
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.6578630036664289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0725440480531385d) + "'", double1 == (-1.0725440480531385d));
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8427442981938755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1218112307612413d + "'", double1 == 1.1218112307612413d);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.9443045E-31f, (-0.032630847141665004d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9443043E-31f + "'", float2 == 3.9443043E-31f);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2032471075153308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5153487167105644d + "'", double1 == 1.5153487167105644d);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0000002f + "'", float1 == 3.0000002f);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026925328154872162d + "'", double1 == 0.026925328154872162d);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3076604860118306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6975132016108923d + "'", double1 == 3.6975132016108923d);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        double double1 = org.apache.commons.math3.util.FastMath.abs(15.004028425245222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.004028425245222d + "'", double1 == 15.004028425245222d);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161605E-13d + "'", double1 == 1.1368683772161605E-13d);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.04452297315338434d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.993223037822113d, 6400);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-97.0f), 44051.931612313434d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-96.99999f) + "'", float2 == (-96.99999f));
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8886109.520507872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962142597092d + "'", double1 == 1.5707962142597092d);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        double double2 = org.apache.commons.math3.util.FastMath.log(89.94404710810622d, (double) 12.000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5523011999578556d + "'", double2 == 0.5523011999578556d);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1833.465381550741d, 0.6823220100278267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 168.50112223820605d + "'", double2 == 168.50112223820605d);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35213550975493585d + "'", double1 == 0.35213550975493585d);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.562922473770796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.491135983977936d + "'", double1 == 2.491135983977936d);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-11.447142425533318d), 0.9159937224722687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4909470424466322d) + "'", double2 == (-1.4909470424466322d));
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(31.999994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-14), (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14L) + "'", long2 == (-14L));
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        int int2 = org.apache.commons.math3.util.FastMath.min(138, (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-458) + "'", int2 == (-458));
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6699514281265647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6209479146173003d + "'", double1 == 0.6209479146173003d);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1746969338774258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16101018571185946d + "'", double1 == 0.16101018571185946d);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.0384596E34f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.418333678328555d + "'", double1 == 22.418333678328555d);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.17603073842084696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7544114892259424d) + "'", double1 == (-0.7544114892259424d));
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0029911026661902144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000004473350915d + "'", double1 == 1.000004473350915d);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.666667160494014E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.666667160494015E-4d + "'", double1 == 6.666667160494015E-4d);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.34078238922659015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40604723654186364d + "'", double1 == 0.40604723654186364d);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9999995f + "'", float1 == 5.9999995f);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        double double1 = org.apache.commons.math3.util.FastMath.exp(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.668093098623086E43d + "'", double1 == 7.668093098623086E43d);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-32.57791748631743d), 1018);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.0419684648175772E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.537544995867647E-7d, (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3519396962567498E-10d + "'", double2 == 1.3519396962567498E-10d);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(74.20321057778875d, (double) (-2.0122792E-16f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 74.20321057778874d + "'", double2 == 74.20321057778874d);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        double double2 = org.apache.commons.math3.util.FastMath.log(11.273085878361627d, (-6.3351006179351295d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        double double1 = org.apache.commons.math3.util.FastMath.asin(8.124202398230408E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.124202398230408E-43d + "'", double1 == 8.124202398230408E-43d);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.0799873446393424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8077504007366337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6304702040675718d + "'", double1 == 0.6304702040675718d);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.172561628611239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5014100672382398d + "'", double1 == 0.5014100672382398d);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6123757901317819d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999998d) + "'", double1 == (-0.9999999999999998d));
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.7771201292690524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.777120129269052d) + "'", double1 == (-2.777120129269052d));
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        float float2 = org.apache.commons.math3.util.FastMath.min((-16.0f), (float) 20L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.47407643548680184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4740764354868018d) + "'", double1 == (-0.4740764354868018d));
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000000074505806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000074505808d + "'", double1 == 1.0000000074505808d);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.9826981349689595d), 1.2334054821199578d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.11977834331526022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1197783433152602d) + "'", double1 == (-0.1197783433152602d));
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7341433604804716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0836962511904766d + "'", double1 == 2.0836962511904766d);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.80584E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.80584E32f + "'", float1 == 5.80584E32f);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 149L, (float) 83);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.032145479207474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.032145479207475d + "'", double1 == 9.032145479207475d);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.4218267465845745E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.960562308042776E17d + "'", double1 == 1.960562308042776E17d);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.587997411051078d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.24117260647275346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.818172485058252d + "'", double1 == 13.818172485058252d);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1448005255201223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5318551602504294d + "'", double1 == 0.5318551602504294d);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        int int1 = org.apache.commons.math3.util.FastMath.round((-5.8058394E32f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        double double1 = org.apache.commons.math3.util.FastMath.cos(17.247748258387595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031006365979496693d) + "'", double1 == (-0.031006365979496693d));
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.666667160494015E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03819718917147717d + "'", double1 == 0.03819718917147717d);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.16101018571185946d, 2.384185791015647E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16101018571185946d + "'", double2 == 0.16101018571185946d);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.2908404270262075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.52075533994181d + "'", double1 == 36.52075533994181d);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-10), 1.03079207E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.820766E-11f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8207657E-11f + "'", float2 == 5.8207657E-11f);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.124197661557911d, 32.01561737432803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.124197661557911d + "'", double2 == 4.124197661557911d);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-100), 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.013768389245705632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013767954273896781d + "'", double1 == 0.013767954273896781d);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.356564024018388d, (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.303891005617736E-43d + "'", double2 == 5.303891005617736E-43d);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 187L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-126.99998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 126.99998f + "'", float1 == 126.99998f);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 16.118368773084438d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        int int2 = org.apache.commons.math3.util.FastMath.min(14, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(22.18604304878552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.420081748504424E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.420081748504424E270d + "'", double1 == 4.420081748504424E270d);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6526145766592608d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.973642758047122E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.1578506894064046d), (double) 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1235582092889473E307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4, (-149));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6E-45f + "'", float2 == 5.6E-45f);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        double double1 = org.apache.commons.math3.util.FastMath.log10(111.70107212763709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0480573415747148d + "'", double1 == 2.0480573415747148d);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(35.74695984451546d, 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.74695984451546d + "'", double2 == 35.74695984451546d);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.5855175597800497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5545518537647774d + "'", double1 == 0.5545518537647774d);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-5L), 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9999995f) + "'", float2 == (-4.9999995f));
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.8808637063441951d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 9.536743E-7f, 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.570796326562066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326562066d + "'", double1 == 1.570796326562066d);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.6831251162316458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        int int2 = org.apache.commons.math3.util.FastMath.min((-106), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.1691263E29f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 99.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.092534979676547d) + "'", double1 == (-25.092534979676547d));
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.22122547E12f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.185039863261519d), (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20945043706303793d + "'", double2 == 0.20945043706303793d);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.017686511732454713d, 32.01561737432803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017686511732454713d + "'", double2 == 0.017686511732454713d);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(56.80745424105381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.844162835840419d + "'", double1 == 3.844162835840419d);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.33879047458320544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47006880877257834d) + "'", double1 == (-0.47006880877257834d));
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        float float2 = org.apache.commons.math3.util.FastMath.max(97.00002f, 15.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00002f + "'", float2 == 97.00002f);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114898.22225041104d + "'", double1 == 114898.22225041104d);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-11.447142425533318d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.0d) + "'", double1 == (-11.0d));
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (-100.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.36890068873573423d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.15349285356613754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15229867287702994d + "'", double1 == 0.15229867287702994d);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.5849675565215335d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5849675565215335d + "'", double2 == 4.5849675565215335d);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9974955918517059d + "'", double1 == 1.9974955918517059d);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 2147483647, 3000.0002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(8.69889334015925E-5d, 86.87770167836293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.87770167840647d + "'", double2 == 86.87770167840647d);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2924697E-26f + "'", float1 == 1.2924697E-26f);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.5353358E26f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5353358E26f) + "'", float2 == (-1.5353358E26f));
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        int int2 = org.apache.commons.math3.util.FastMath.max(76, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1368683772161602E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, 2147483648L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483648L + "'", long2 == 2147483648L);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.4874710524825647d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.3884476551279826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.723507743E9d, (double) 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.029437602008406172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.07E-43f), (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5596953038813823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.36395823877761d + "'", double1 == 89.36395823877761d);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 303.5697911758657d + "'", double1 == 303.5697911758657d);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.389765650634909d, 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.105759218111813E-7d + "'", double2 == 1.105759218111813E-7d);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(387.99999999999994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.771877497737997d + "'", double1 == 6.771877497737997d);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7576211478872673d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 17L, 76.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866269702728209d + "'", double1 == 0.9866269702728209d);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.44743247469394815d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36073261848147453d) + "'", double1 == (-0.36073261848147453d));
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.0f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.000000000000001d, 2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.000000000000001d + "'", double2 == 5.000000000000001d);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.054734431114726374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05473443111472637d) + "'", double1 == (-0.05473443111472637d));
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 26, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        double double1 = org.apache.commons.math3.util.FastMath.asin(35.000007629394524d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.794699111476132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7285236038432762d) + "'", double1 == (-0.7285236038432762d));
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.9843745f), 0.026925328154872162d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843744f) + "'", float2 == (-1.9843744f));
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10L, (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-5f + "'", float2 == 7.6293945E-5f);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4.5474732E-13f, (-0.031640086111471344d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.457588777712573d + "'", double2 == 2.457588777712573d);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.014608467389253983d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8370035265587495d) + "'", double1 == (-0.8370035265587495d));
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 175, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-12.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.999999999999998d) + "'", double1 == (-11.999999999999998d));
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.15292164E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.5797630630139097E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5797630631386922E-10d) + "'", double1 == (-1.5797630631386922E-10d));
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.9831006351425686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.457588777712573d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8104874485208914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7246231833006227d + "'", double1 == 0.7246231833006227d);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.771877497737997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.600428854878443d + "'", double1 == 2.600428854878443d);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(187.00002f, 1500.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 187.00002f + "'", float2 == 187.00002f);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1024.0002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.079369200195153d + "'", double1 == 10.079369200195153d);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(12.182493960703473d, 2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.182493960703471d + "'", double2 == 12.182493960703471d);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-29), 0.7102126686676506d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.2194703520389538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5258789061907882E-5d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8146972654769704E-6d + "'", double2 == 3.8146972654769704E-6d);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.2532797083404758d, 0.9999295221303693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999295221303693d + "'", double2 == 0.9999295221303693d);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        float float1 = org.apache.commons.math3.util.FastMath.signum(800.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-41.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.15867420742219507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17195606988869996d + "'", double1 == 0.17195606988869996d);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        double double1 = org.apache.commons.math3.util.FastMath.exp(35.74434308084386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3386505083722125E15d + "'", double1 == 3.3386505083722125E15d);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(20.500218349388472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.527716681660688d + "'", double1 == 4.527716681660688d);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.7182818284590458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.87715780174745d + "'", double1 == 2.87715780174745d);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5877852480805601d, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1701.9172863826855d + "'", double2 == 1701.9172863826855d);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.4942208E7d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963266113099d + "'", double1 == 1.5707963266113099d);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.1379847648958913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0000000397364284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 18.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5152978274179443d + "'", double1 == 1.5152978274179443d);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7920349615599266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.380260524190184d + "'", double1 == 45.380260524190184d);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 3.1691263E29f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        double double1 = org.apache.commons.math3.util.FastMath.sin(12.699208415745597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13244747258059736d + "'", double1 == 0.13244747258059736d);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 22025);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9709157047357585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012818474064463535d) + "'", double1 == (-0.012818474064463535d));
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.975693351829396E-16d + "'", double1 == 3.975693351829396E-16d);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073489E-6f + "'", float1 == 1.9073489E-6f);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.8197907155348637E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.999998f, (-750.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999998f + "'", float2 == 9.999998f);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-148.99997f), (-0.16267372390397128d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.3365121092855193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9439120952226965d + "'", double1 == 0.9439120952226965d);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 62, 61944147371L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61944147371L + "'", long2 == 61944147371L);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.09731253940776538d), (double) 3.9999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.024323338403252005d) + "'", double2 == (-0.024323338403252005d));
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 96.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.670213788753623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8909429718644172d) + "'", double1 == (-0.8909429718644172d));
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.4738240626447961d, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.639689313442987E-46d + "'", double2 == 6.639689313442987E-46d);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.9074079744350795E74d, (double) 750L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9074079744350795E74d + "'", double2 == 2.9074079744350795E74d);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0130295945424812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0130295945424814d + "'", double1 == 1.0130295945424814d);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.37076031045626007d, (-0.019190971753849196d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37076031045626007d + "'", double2 == 0.37076031045626007d);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.0688248503046665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.516582543750002E7d, 1.3002669166754288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3002669166754288d + "'", double2 == 1.3002669166754288d);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.002415168146714362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.27184586666843935d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.8395373E33f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.8395373E33f + "'", float2 == 2.8395373E33f);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7246231833006227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012647060384878258d + "'", double1 == 0.012647060384878258d);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 22025L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3978950994030255d, (double) 5.877473E-39f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.8972849022006305E-4d, (double) (-18));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.712409072799656E-6d, (double) 9.094949E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.712409072799656E-6d + "'", double2 == 4.712409072799656E-6d);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        double double1 = org.apache.commons.math3.util.FastMath.atan(182.7525636550004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5653245019422573d + "'", double1 == 1.5653245019422573d);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707963267948967d + "'", double1 == 0.5707963267948967d);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.017452405451122824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017452405451122824d + "'", double1 == 0.017452405451122824d);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-9.999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5305894532583966d, 4.505395525898652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5305894532583966d + "'", double2 == 0.5305894532583966d);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8894854184948215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9431253461204515d + "'", double1 == 0.9431253461204515d);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(53248.0f, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-24) + "'", int1 == (-24));
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        double double1 = org.apache.commons.math3.util.FastMath.floor(77.99158950487846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.0d + "'", double1 == 77.0d);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1934352946829203d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        long long2 = org.apache.commons.math3.util.FastMath.min(63L, 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-3.9999998f), (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9999998f + "'", float2 == 3.9999998f);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.008022730733654788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4596686112083139d + "'", double1 == 0.4596686112083139d);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.5707860170342276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999468544d) + "'", double1 == (-0.9999999999468544d));
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.586176193003373d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5301929214225978d) + "'", double1 == (-0.5301929214225978d));
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-57.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0000000000000263E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 340.78259376311877d + "'", double1 == 340.78259376311877d);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.04532039237905E-6d, 6.212020862233431E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.04532039237905E-6d + "'", double2 == 3.04532039237905E-6d);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 0.031250004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.6E-45f, 108);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8189894E-12f + "'", float2 == 1.8189894E-12f);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.035952442790704d), 0.9746486480944884d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.477888730288475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.9843744f), 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.5154934E30f) + "'", float2 == (-2.5154934E30f));
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.6316366591210418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.416180000182564d) + "'", double1 == (-16.416180000182564d));
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.2353297639799932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1114538964707412d + "'", double1 == 1.1114538964707412d);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.13590897899958626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 95.0f, 1.8780463800814613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8780463800814613d + "'", double2 == 1.8780463800814613d);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-2.9999998f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9999997615814205d) + "'", double2 == (-2.9999997615814205d));
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 144, 1025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.30043127241947d + "'", double1 == 238.30043127241947d);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.22011573792157446d), 4.359610000063081E-28d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22011573792157446d + "'", double2 == 0.22011573792157446d);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.6939756606048d + "'", double1 == 75.6939756606048d);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.772473643383616d, (-3.901552178612685E8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592625979055d + "'", double2 == 3.141592625979055d);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        long long1 = org.apache.commons.math3.util.FastMath.abs(95L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 95L + "'", long1 == 95L);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.026054000153417d, 12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32282599469037687d + "'", double2 == 0.32282599469037687d);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-15.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999998128d) + "'", double1 == (-0.9999999999998128d));
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 31L, 0.9956875083454144d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30.999998f + "'", float2 == 30.999998f);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        int int2 = org.apache.commons.math3.util.FastMath.max(23, (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        int int2 = org.apache.commons.math3.util.FastMath.max((-29), 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 149.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.206555615733702d + "'", double1 == 12.206555615733702d);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-17.999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.777893186295716E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.47712125471966244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6907396432228734d + "'", double1 == 0.6907396432228734d);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', (-12L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9962200055527257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0037871566807837786d) + "'", double1 == (-0.0037871566807837786d));
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.330733340286331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6365614433910027d + "'", double1 == 0.6365614433910027d);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-8.61536494421336E37d), (-4.323362308933902d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.615364944213357E37d) + "'", double2 == (-8.615364944213357E37d));
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.9360128E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.9360128E8f + "'", float1 == 2.9360128E8f);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.1754644578327482d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5662191695169728d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1018.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9923242899975806d + "'", double1 == 0.9923242899975806d);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        long long2 = org.apache.commons.math3.util.FastMath.max(138L, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(74.54992027339121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4271.395794702088d + "'", double1 == 4271.395794702088d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 7L, 22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5942587451767538d + "'", double2 == 1.5942587451767538d);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.333557385554463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3400745627078932d + "'", double1 == 0.3400745627078932d);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), (long) 144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.5514298635472507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.735733105846957d + "'", double1 == 0.735733105846957d);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        long long1 = org.apache.commons.math3.util.FastMath.round(8.665547095541333d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0726495045964528d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5101864143818207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9069721267647446d + "'", double1 == 0.9069721267647446d);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 10, (-0.07552869653363556d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(11.093347164296198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65731.39544457395d + "'", double1 == 65731.39544457395d);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4583.662361046586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.972578244439181E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.8350484101051d + "'", double1 == 84.8350484101051d);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 31L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.449489742783178d, 2979.0000000000005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.222521620513402E-4d + "'", double2 == 8.222521620513402E-4d);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2260966286709531d + "'", double1 == 0.2260966286709531d);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 53248.004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53248.00390625d + "'", double1 == 53248.00390625d);
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.357616567889211E-68d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9237725856325243E-66d + "'", double1 == 1.9237725856325243E-66d);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 491, (long) 1023);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 491L + "'", long2 == 491L);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.023384553485362353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        float float1 = org.apache.commons.math3.util.FastMath.signum(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        float float1 = org.apache.commons.math3.util.FastMath.signum(512.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(101.04822696504083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.657750622314778d + "'", double1 == 4.657750622314778d);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.0769192E34f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        long long2 = org.apache.commons.math3.util.FastMath.min((-106L), (long) (-8));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-106L) + "'", long2 == (-106L));
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9999999f, (-0.02735579744613546d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999998f + "'", float2 == 0.9999998f);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 1.2924697E-26f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8698592549372254E-42d + "'", double1 == 2.8698592549372254E-42d);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        long long2 = org.apache.commons.math3.util.FastMath.max(97L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        double double1 = org.apache.commons.math3.util.FastMath.asin(200.3351263076086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4096L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.1948273773478871d, 53247.99609375001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19482737734788713d + "'", double2 == 0.19482737734788713d);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.026538621740554002d, (double) 41L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.000008589004516d + "'", double2 == 41.000008589004516d);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.154262241479262d + "'", double1 == 15.154262241479262d);
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.4470154E9f), 34.999996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        float float2 = org.apache.commons.math3.util.FastMath.min(3000.0002f, 1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4551915E-11f + "'", float2 == 1.4551915E-11f);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.02198977097857152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021986227279203786d) + "'", double1 == (-0.021986227279203786d));
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.09246595244807976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9682413013090552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9839925311246296d + "'", double1 == 0.9839925311246296d);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 75, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.408103815583578E-37d + "'", double2 == 4.408103815583578E-37d);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.179785437699879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1568137220942976d + "'", double1 == 1.1568137220942976d);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024, 3.371747880871523E-7d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(9.999999046325684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453290855467615d + "'", double1 == 0.17453290855467615d);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.3459005707375704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.058396981403728045d + "'", double1 == 0.058396981403728045d);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0562853E-37f, 0.15978926741180702d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0562855E-37f + "'", float2 == 3.0562855E-37f);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7911843097149077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5828770266140352d + "'", double1 == 0.5828770266140352d);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.952895810720043E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        double double1 = org.apache.commons.math3.util.FastMath.exp(42.333333333333336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4273537190268989E18d + "'", double1 == 2.4273537190268989E18d);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(11.093347164296198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999995371172d + "'", double1 == 0.9999999995371172d);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7430585504480339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.6600602236808388d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 8, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.1578506894064046d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(18.0f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.852214E30f + "'", float2 == 2.852214E30f);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1561034226520874d, 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.61257747613688d + "'", double2 == 13.61257747613688d);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(23844.919681868952d, 9.00065713495353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704188603648326d + "'", double2 == 1.5704188603648326d);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.4900006E33f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0948501E26f + "'", float1 == 3.0948501E26f);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.15292144E18f, (-12.124999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.124999f) + "'", float2 == (-12.124999f));
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.46680851797176126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.775734173777395d) + "'", double1 == (-0.775734173777395d));
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.23514276401971068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23090266964395562d + "'", double1 == 0.23090266964395562d);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.23090266964395562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48052332892790506d + "'", double1 == 0.48052332892790506d);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.317766405137894d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0015484291388311E92d + "'", double2 == 1.0015484291388311E92d);
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 106L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0844638552900231E46d + "'", double1 == 1.0844638552900231E46d);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.23422432986760747d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.23422432986760747d) + "'", double2 == (-0.23422432986760747d));
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.2676505246703655E30d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0822639194654398E10d) + "'", double1 == (-1.0822639194654398E10d));
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.4965075614664807d, 1.3197768247158532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4965075614664807d + "'", double2 == 3.4965075614664807d);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.735936030883969E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0072456581364313665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.712409072799656E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.712409072817097E-6d + "'", double1 == 4.712409072817097E-6d);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 149L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.624216256515976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8546304418481443d + "'", double1 == 0.8546304418481443d);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.366949567869811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.366949567869811d + "'", double1 == 1.366949567869811d);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1638400.125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.00237797068112d + "'", double1 == 15.00237797068112d);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.001953125f, (-17.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.001953125f) + "'", float2 == (-0.001953125f));
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.000001f + "'", float1 == 8.000001f);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1499.9999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.9542141200785643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2670214075185258d) + "'", double1 == (-1.2670214075185258d));
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.0092655367037576E-36d, 1.522697550491263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.522697550491263d + "'", double2 == 1.522697550491263d);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 0.015625f, 0.6950751868245029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015625d + "'", double2 == 0.015625d);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(57.95729927114847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.7665309945044432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3340703503607398d + "'", double1 == 1.3340703503607398d);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        double double1 = org.apache.commons.math3.util.FastMath.log(8.03837595936612E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.85919476451072d + "'", double1 == 68.85919476451072d);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.1645736082970047E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        long long2 = org.apache.commons.math3.util.FastMath.max(31L, 53248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53248L + "'", long2 == 53248L);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-458));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 128, (long) 187);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(18.99935244416265d, 0.06537329234338424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.999352444162646d + "'", double2 == 18.999352444162646d);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.826820254353866E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0448443767581986d + "'", double1 == 0.0448443767581986d);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.2839005344264299d), 1.2032471075153308d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5.298292365610486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610487d + "'", double1 == 5.298292365610487d);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-8.615364944213357E37d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 126 + "'", int1 == 126);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9999998807907104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281504414619d + "'", double1 == 1.718281504414619d);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4515827052894548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        double double2 = org.apache.commons.math3.util.FastMath.min(6.223015277861142E-61d, 1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.223015277861142E-61d + "'", double2 == 6.223015277861142E-61d);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 138);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9520523170857447d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.949823557438858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.027447530353144d + "'", double1 == 7.027447530353144d);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        float float2 = org.apache.commons.math3.util.FastMath.min(17.0f, 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094947E-13f + "'", float2 == 9.094947E-13f);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9945090808761636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9972507612813156d + "'", double1 == 0.9972507612813156d);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9706244805940947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7489785816197908d + "'", double1 == 0.7489785816197908d);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.342915917084086d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(22.418333678328555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.41833367832856d + "'", double1 == 22.41833367832856d);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.2949673E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        double double1 = org.apache.commons.math3.util.FastMath.cos(544.5092619083326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.528695937731318d) + "'", double1 == (-0.528695937731318d));
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 0, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.6685791825735485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2998044433940747d + "'", double1 == 1.2998044433940747d);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7715524587962287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11263454038345821d) + "'", double1 == (-0.11263454038345821d));
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.169647840508743E306d, 1.0619928668337089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.169647840508743E306d + "'", double2 == 1.169647840508743E306d);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 58L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-5.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08726646259971647d) + "'", double1 == (-0.08726646259971647d));
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.002893947719693431d), 36.52075533994181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.52075545460172d + "'", double2 == 36.52075545460172d);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-13), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 12.125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (-106));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-106) + "'", int2 == (-106));
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(33.418366853490404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.780862120262894d + "'", double1 == 5.780862120262894d);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.796094483138759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0878565605508865d + "'", double1 == 1.0878565605508865d);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-9.223372036854776E18d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 36);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.030765742067207565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9522971143772588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04887819794816962d) + "'", double1 == (-0.04887819794816962d));
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1500);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1025.0f + "'", float1 == 1025.0f);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 7, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.3915327099543454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9376862167110295d) + "'", double1 == (-0.9376862167110295d));
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(149.0f, 9.754473730996652E91d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.00002f + "'", float2 == 149.00002f);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.1359036E-25f, 4.70197740328915E-38d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.135903E-25f + "'", float2 == 4.135903E-25f);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.9999995f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5614902362389387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5355239009113038d + "'", double1 == 0.5355239009113038d);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-126.99998f), 113);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3188432E36f) + "'", float2 == (-1.3188432E36f));
    }
}

