package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.516582543750002E7d, (double) 75.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25335889026443714d + "'", double2 == 0.25335889026443714d);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.6469779601696886E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.646977960169689E-23d + "'", double1 == 2.646977960169689E-23d);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(148.41315910257663d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.6839344803124224E17d + "'", double2 == 6.6839344803124224E17d);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.1674533972268024E8d), 1.7320508763943914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1674533972268023E8d) + "'", double2 == (-1.1674533972268023E8d));
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1500.0002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.179943040972688d + "'", double1 == 26.179943040972688d);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-4.5474735E-13f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.547473508864641E-13d) + "'", double1 == (-4.547473508864641E-13d));
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(15.851614849324065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3830353.554453491d + "'", double1 == 3830353.554453491d);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.478946455040302d, 0.6033115335528957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.332063396007248d + "'", double2 == 1.332063396007248d);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        long long1 = org.apache.commons.math3.util.FastMath.round(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.0017254920184673012d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.536743E-7f, (double) 1.15292144E18f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.15292143588737024E18d + "'", double2 == 1.15292143588737024E18d);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.1481568901940804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.7845440269863d + "'", double1 == 65.7845440269863d);
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 5, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5604874128378783d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-41.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-106L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 106.0f + "'", float1 == 106.0f);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.4161468365471424d), 0.42637126919570534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7732631947845782d) + "'", double2 == (-0.7732631947845782d));
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        long long1 = org.apache.commons.math3.util.FastMath.abs(53248L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53248L + "'", long1 == 53248L);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.25484119874557287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3131128505754994d + "'", double1 == 1.3131128505754994d);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        float float2 = org.apache.commons.math3.util.FastMath.min(1500.0001f, (float) (-63L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.0f) + "'", float2 == (-63.0f));
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 2147483648L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.01183377622733977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.436797444206759d) + "'", double1 == (-4.436797444206759d));
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-2L), (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0344439834794175d) + "'", double2 == (-2.0344439834794175d));
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(750.0000000000001d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0000000000001d + "'", double2 == 750.0000000000001d);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9999998807907104d, 3.191374943865368E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907104d + "'", double2 == 0.9999998807907104d);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        double double1 = org.apache.commons.math3.util.FastMath.asin(26.179943040972688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.0f, 23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9360128E8f + "'", float2 == 2.9360128E8f);
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.16244735150962653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9868344195994365d + "'", double1 == 0.9868344195994365d);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.2204589790200114E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029911026661902144d + "'", double1 == 0.0029911026661902144d);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.7782794100389228d, 76.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.523254369123166d + "'", double2 == 7.523254369123166d);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-52.0f), 1.03079223E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5136814478622124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1348610631725198d + "'", double1 == 1.1348610631725198d);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 100, 1024.0000003439764d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.00001f + "'", float2 == 100.00001f);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(9.094947017729282E-13d, 0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8731400784750731d + "'", double2 == 0.8731400784750731d);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.974779993689529E12d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, (-12));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 126.99999f, 16.25264603450008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5573161188080163E34d + "'", double2 == 1.5573161188080163E34d);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.4696084840113481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 18, (long) 106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        long long2 = org.apache.commons.math3.util.FastMath.max((-18L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.7554474551938102d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.1702617153949575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3365121092855193d + "'", double1 == 0.3365121092855193d);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.026544854745010848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-2.778726E7f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.778726E7d) + "'", double1 == (-2.778726E7d));
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098494453571889d + "'", double1 == 0.6098494453571889d);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7.313219942645561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12763976692167592d + "'", double1 == 0.12763976692167592d);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        float float1 = org.apache.commons.math3.util.FastMath.signum(79.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 187 + "'", int1 == 187);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.03413309100327678d, 6.310887241768095E67d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03413309100327678d + "'", double2 == 0.03413309100327678d);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.007245784937053269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007272099154055d + "'", double1 == 1.007272099154055d);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-17));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 17.0f + "'", float1 == 17.0f);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9500520559216498d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.08100514452844133d, 0.025817018473160622d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.262265463851092d + "'", double2 == 1.262265463851092d);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.7243954228040914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.789432859409374d + "'", double1 == 0.789432859409374d);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7237368419565787d, 1018);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.032901175362929E306d + "'", double2 == 2.032901175362929E306d);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.337497748560931d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1.5347691E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18604304878552d + "'", double1 == 22.18604304878552d);
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        double double1 = org.apache.commons.math3.util.FastMath.signum(18.99935244416265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.001799908286954d, 1.5685946486297746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5683625544019231d + "'", double2 == 0.5683625544019231d);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.00507775325695467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07125835569920674d + "'", double1 == 0.07125835569920674d);
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.019119947239050028d, 0.008022730733654788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9687524870063974d + "'", double2 == 0.9687524870063974d);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.9999999999999999d), 74.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.857680860275251d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.15292144E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.58883077399207d + "'", double1 == 41.58883077399207d);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1529215E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.15292164E18f + "'", float1 == 1.15292164E18f);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.2779475125273763d, 0.9872429529221711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2779475125273763d + "'", double2 == 2.2779475125273763d);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 52, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.57079626275941d, 2.2420775429197073E-44d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707962627594099d + "'", double2 == 1.5707962627594099d);
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.3710953E7d, 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.147124287800051E46d + "'", double2 == 1.147124287800051E46d);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        float float1 = org.apache.commons.math3.util.FastMath.signum(79.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        int int2 = org.apache.commons.math3.util.FastMath.min((-20), (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 175, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9822099981282539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9940344827457154d) + "'", double1 == (-0.9940344827457154d));
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-126.99999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7208914127261735d), 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7208914127261735d) + "'", double2 == (-0.7208914127261735d));
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-0.07545690704752087d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.3241189037517391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3186965710060212d + "'", double1 == 0.3186965710060212d);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        int int1 = org.apache.commons.math3.util.FastMath.abs(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4096L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.447015486E9d, 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        double double1 = org.apache.commons.math3.util.FastMath.atan(223.2377295332742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5663168272343027d + "'", double1 == 1.5663168272343027d);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.945924865824463d), 1.6643970310541525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9459248658244629d) + "'", double2 == (-0.9459248658244629d));
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5707093340779579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038597321273568d + "'", double1 == 1.0038597321273568d);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(18629.058771181848d, (-1.4280592992577826E77d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-18629.058771181848d) + "'", double2 == (-18629.058771181848d));
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.2261911708835171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7065920069739766d) + "'", double1 == (-0.7065920069739766d));
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 76.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.288292537319899d + "'", double1 == 5.288292537319899d);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.877472E-39f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-18.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.308860714383271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.701953726147942d + "'", double1 == 2.701953726147942d);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5430806348152437d, (double) (-12));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5430806348152435d + "'", double2 == 1.5430806348152435d);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7717075948257832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7717075948257832d + "'", double1 == 0.7717075948257832d);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.0995616862503343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019190971753849196d) + "'", double1 == (-0.019190971753849196d));
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39367939279923997d) + "'", double1 == (-0.39367939279923997d));
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.1561034226520874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4029088829471815d + "'", double1 == 0.4029088829471815d);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.002469861007409331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.310720664591689E-5d + "'", double1 == 4.310720664591689E-5d);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        double double2 = org.apache.commons.math3.util.FastMath.pow(32768.0d, 175);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.094948E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.094948E-13f + "'", float1 == 9.094948E-13f);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.025819886105840354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996666852588395d + "'", double1 == 0.9996666852588395d);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6252248588609128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6420926159343308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7617262217813369d + "'", double1 == 0.7617262217813369d);
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        int int2 = org.apache.commons.math3.util.FastMath.max(63, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        double double1 = org.apache.commons.math3.util.FastMath.rint(138.00002158667908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.0d + "'", double1 == 138.0d);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 6400L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.006506382083938511d, 0.8230640525110062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006506382083938512d + "'", double2 == 0.006506382083938512d);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.000053996151583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000053996151583d + "'", double1 == 1.000053996151583d);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-17));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2077476376787629E7d) + "'", double1 == (-1.2077476376787629E7d));
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7187551267105248d, 111.70107212763709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7187551267105248d + "'", double2 == 0.7187551267105248d);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-13));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.2238399254752328d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6302320770101165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8780463800814613d + "'", double1 == 1.8780463800814613d);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-2L), 6.666665679012609E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(201.7156361224559d, 0.9526653544745283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5660735482843895d + "'", double2 == 1.5660735482843895d);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5707935868818308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570793586881831d + "'", double1 == 1.570793586881831d);
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.019190971753849196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.4738240626447961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(44.3614195558365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1143659906583754d, 0.9682413013090552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1105402564171805d + "'", double2 == 1.1105402564171805d);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 5L, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0325944886750007d, 18128.263951029265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18128.26395105857d + "'", double2 == 18128.26395105857d);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.2367438401448574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03903854453422948d + "'", double1 == 0.03903854453422948d);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-106.0d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3437096362419232E32d) + "'", double2 == (-1.3437096362419232E32d));
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        long long2 = org.apache.commons.math3.util.FastMath.max(4294967296L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.15919038274063185d, 0.25335889026443714d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25335889026443714d + "'", double2 == 0.25335889026443714d);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.382026634673881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996875488204968d + "'", double1 == 0.9996875488204968d);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        double double2 = org.apache.commons.math3.util.FastMath.max(181.97662449228235d, 3.179785437699879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 181.97662449228235d + "'", double2 == 181.97662449228235d);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 3.777893E23f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        float float2 = org.apache.commons.math3.util.FastMath.max(76.0f, (float) 127L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(22025.998f, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11012.999f + "'", float2 == 11012.999f);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41078129050290885d + "'", double1 == 0.41078129050290885d);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9868344195994365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9933953994253428d + "'", double1 == 0.9933953994253428d);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-15.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-14.999999f) + "'", float1 == (-14.999999f));
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.06698009627141037d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5707963266113099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989018466428d + "'", double1 == 2.3012989018466428d);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        double double1 = org.apache.commons.math3.util.FastMath.atan(175.0006414538025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5650821242203692d + "'", double1 == 1.5650821242203692d);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.7065920069739766d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.355466754254918d + "'", double1 == 2.355466754254918d);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1746969338774258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06992583518487835d + "'", double1 == 0.06992583518487835d);
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.023667627328711145d, 3.0092655367037576E-36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(22025.998046875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, (long) 1500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-14), (-41.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-14.0f) + "'", float2 == (-14.0f));
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.185891831851989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.185891831851989d + "'", double1 == 4.185891831851989d);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        long long1 = org.apache.commons.math3.util.FastMath.round(91555.1670122018d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 91555L + "'", long1 == 91555L);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-5.999999523162841d), 10.052274715955628d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5381220624782704d) + "'", double2 == (-0.5381220624782704d));
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.12136893780784676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12196840867706697d) + "'", double1 == (-0.12196840867706697d));
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6916437678655323d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), 96L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96L + "'", long2 == 96L);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5182433006558598E-6d, (-100.31218449629624d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 458.00003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.820015239488859d + "'", double1 == 6.820015239488859d);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5347691E22f, (float) 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5347691E22f + "'", float2 == 1.5347691E22f);
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        int int2 = org.apache.commons.math3.util.FastMath.min((-95), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-95) + "'", int2 == (-95));
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.08957411090233484d), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08933569103737334d) + "'", double2 == (-0.08933569103737334d));
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(55.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        int int2 = org.apache.commons.math3.util.FastMath.min(9, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.8508150333851735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8508150333851734d) + "'", double1 == (-0.8508150333851734d));
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        long long2 = org.apache.commons.math3.util.FastMath.max(5447015486L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.505149952433937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1460227958966358d + "'", double1 == 1.1460227958966358d);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.0785812159379906E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0785812159379906E-5d + "'", double1 == 4.0785812159379906E-5d);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.16125382097679095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1758471462676247d) + "'", double1 == (-0.1758471462676247d));
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.01404813814356523d, 0.03819718351263449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.35242532392588855d + "'", double2 == 0.35242532392588855d);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.002893947719693431d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0028939436802585513d) + "'", double1 == (-0.0028939436802585513d));
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.57976306301391E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.57976306301391E-10d) + "'", double1 == (-1.57976306301391E-10d));
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 5.545972E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.9342812E25f, 76);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-6912.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.124197661557911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        int int2 = org.apache.commons.math3.util.FastMath.min(58, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-17.0f), (-9.876755530286335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.66088247777911d + "'", double2 == 19.66088247777911d);
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8812778905541143d, (-0.782532834469048d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 3.777893E23f, 0.2536968024812311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.777892826007745E23d + "'", double2 == 3.777892826007745E23d);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-14.999999f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-15L) + "'", long1 == (-15L));
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 383.4369511116792d + "'", double1 == 383.4369511116792d);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.8808637063441951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.586176193003373d), 2.449489742783178d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.12763976692167592d, (-0.8648790814947103d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9950692581555907d + "'", double2 == 2.9950692581555907d);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9620773500730718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03866042606741437d) + "'", double1 == (-0.03866042606741437d));
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0124843102732668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.752430419492189d + "'", double1 == 2.752430419492189d);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        float float2 = org.apache.commons.math3.util.FastMath.max(1500.0f, Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.00724572153624304d, (double) 22026L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 8, 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094948E-13f + "'", float2 == 9.094948E-13f);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.24999999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7788007830714049d + "'", double1 == 0.7788007830714049d);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.570796326562066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.39367939279923997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9235039398260111d + "'", double1 == 0.9235039398260111d);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-4));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(127.0f, 175);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 7.6770294200238824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8569259205417066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.2721850946649906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        double double1 = org.apache.commons.math3.util.FastMath.abs(6.285615910267171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.285615910267171d + "'", double1 == 6.285615910267171d);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        int int1 = org.apache.commons.math3.util.FastMath.abs(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.05691340783384365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.055352780953117735d + "'", double1 == 0.055352780953117735d);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7911843097149077d, 0.7888705944722437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1172687352477229d + "'", double2 == 1.1172687352477229d);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.0633645101086056d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 2.4576E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4576E7d + "'", double1 == 2.4576E7d);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        float float2 = org.apache.commons.math3.util.FastMath.max(Float.NEGATIVE_INFINITY, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.1761948595190557E-53d, 91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1761948595190557E-53d + "'", double2 == 4.1761948595190557E-53d);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-15.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.4023066454805946d) + "'", double1 == (-3.4023066454805946d));
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        double double2 = org.apache.commons.math3.util.FastMath.log(178.34851573024756d, (-0.06037557856845913d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-3.8504903148613345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5673717388783177d) + "'", double1 == (-1.5673717388783177d));
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.5474735E-13f, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5474732E-13f + "'", float2 == 4.5474732E-13f);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, 106L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.855486072473502E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.5885478940499735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8013707341213301d + "'", double1 == 0.8013707341213301d);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(149.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152576.0f + "'", float2 == 152576.0f);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(23844.919681868952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.772473643383616d + "'", double1 == 10.772473643383616d);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8526676855528264E78d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.067366354190164E72d + "'", double2 == 7.067366354190164E72d);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 75L, 0.09473991049806847d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.99999f + "'", float2 == 74.99999f);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-22), (double) 108);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.0d + "'", double2 == 22.0d);
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 187L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.166540501084165E80d + "'", double1 == 8.166540501084165E80d);
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1024.0008978929602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00001402957443d + "'", double1 == 32.00001402957443d);
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        float float2 = org.apache.commons.math3.util.FastMath.min((-52.0f), (float) 6400);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.0f) + "'", float2 == (-52.0f));
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.026538621740554002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026532393125271468d + "'", double1 == 0.026532393125271468d);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.002893947719693431d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        double double1 = org.apache.commons.math3.util.FastMath.acos(18.99935244416265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.48412958879172E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.484129588791721E-9d + "'", double1 == 6.484129588791721E-9d);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.000003517638176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931489393774867d + "'", double1 == 0.6931489393774867d);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.332063396007248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.0092655367037576E-36d, 0.2612473073318639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2612473073318639d + "'", double2 == 0.2612473073318639d);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1934352946829203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6123757901317819d + "'", double1 == 0.6123757901317819d);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.0006493254743547d), 12.03500342028484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0006493254743547d) + "'", double2 == (-2.0006493254743547d));
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5485138357157244d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.00498431552268554d, 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 167245.87627249642d + "'", double2 == 167245.87627249642d);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        long long1 = org.apache.commons.math3.util.FastMath.abs(8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(750.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6670173837384175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9953743246511807d + "'", double1 == 0.9953743246511807d);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.8189894E-12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2863311.3185695773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.560636497313808d + "'", double1 == 15.560636497313808d);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 144L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.976733742420574d + "'", double1 == 4.976733742420574d);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 175L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 175.00002f + "'", float1 == 175.00002f);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8029079379718067d, (-1.6290482690107402d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3828306757967154d + "'", double2 == 0.3828306757967154d);
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(19.999998f, 4.41541687366796d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999996f + "'", float2 == 19.999996f);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 187);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 187L + "'", long1 == 187L);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.5385716311211011d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 2.1E-43f, (-1.949823557438858d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.949823557438858d + "'", double2 == 1.949823557438858d);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-54.0f), 1023.99994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.15655890067882908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15655890067882908d + "'", double1 == 0.15655890067882908d);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.12049738039639d, 7.624632610454212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.388468079419638d + "'", double2 == 0.388468079419638d);
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.802596928649635E-45d, (double) 8.796093E12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8025969286496354E-45d + "'", double2 == 2.8025969286496354E-45d);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7992353978425616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5873617956816182d + "'", double1 == 0.5873617956816182d);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 76);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8808135922807914d + "'", double1 == 1.8808135922807914d);
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 8.796093E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.944289813551192d + "'", double1 == 12.944289813551192d);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        int int2 = org.apache.commons.math3.util.FastMath.max((-95), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.6358572501411002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7511881486202506d) + "'", double1 == (-0.7511881486202506d));
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        int int2 = org.apache.commons.math3.util.FastMath.max(31, 22026);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22026 + "'", int2 == 22026);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3241189037517391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.57064524538159d + "'", double1 == 18.57064524538159d);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4764498148372358E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        long long1 = org.apache.commons.math3.util.FastMath.abs(138L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 138L + "'", long1 == 138L);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.950423060997261E-65d, (-9.210991634471118E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.210991634471118E-4d) + "'", double2 == (-9.210991634471118E-4d));
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-61.239152961159384d), 0.99975823473606d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.263102496115639E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.05609214199065d + "'", double1 == 74.05609214199065d);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-22));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(31.594603878732343d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, 75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1018.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.557407724654902d), 1.0000001685874083d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.552211244862155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2233801800560518d + "'", double1 == 1.2233801800560518d);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.5403024061792943d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7065920069739766d), (double) 76L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 76.0d + "'", double2 == 76.0d);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.2470996758325354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2470996758325352d) + "'", double1 == (-1.2470996758325352d));
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707185961068686d, 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.097754435449949E14d + "'", double2 == 5.097754435449949E14d);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.031640083996804645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03165064858562794d) + "'", double1 == (-0.03165064858562794d));
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0726495045964528d, (-0.7331672126158295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2992733051078518d + "'", double2 == 1.2992733051078518d);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.39178164015958883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.47961458771971d + "'", double1 == 1.47961458771971d);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 5.308769561254787d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(99.99999f, 186.99998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8790267201163946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7931961188674407d + "'", double1 == 0.7931961188674407d);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.031835271646539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0318352716465395d + "'", double1 == 3.0318352716465395d);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.5365721132383438d), 28.03100307406022d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(38.73535314562644d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.6685791825735485d, 23);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.238566467956993E7d + "'", double2 == 2.238566467956993E7d);
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        float float2 = org.apache.commons.math3.util.FastMath.min((-18.0f), (-1.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18.0f) + "'", float2 == (-18.0f));
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(10.693080631879683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1866294642075362d + "'", double1 == 0.1866294642075362d);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-16.999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.527224344196591d) + "'", double1 == (-3.527224344196591d));
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.0065821320002953E46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4218267465845745E15d + "'", double1 == 3.4218267465845745E15d);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.343805421853684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6316366591210418d + "'", double1 == 1.6316366591210418d);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 58, (long) 128);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.026544854745010848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5209081446769386d + "'", double1 == 1.5209081446769386d);
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        double double2 = org.apache.commons.math3.util.FastMath.log(223.2377295332742d, 0.7341433604804715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.057144489200644466d) + "'", double2 == (-0.057144489200644466d));
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0042780229528336d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.7712889028347941d), 3.831008000716577E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        float float2 = org.apache.commons.math3.util.FastMath.max((-126.99998f), (-97.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-97.0f) + "'", float2 == (-97.0f));
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(15.560636497313808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9446972630753057d + "'", double1 == 3.9446972630753057d);
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        long long2 = org.apache.commons.math3.util.FastMath.min(750L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        float float2 = org.apache.commons.math3.util.FastMath.max(54.0f, 19.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.41032129904824216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5705714871469996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.9871176371083d + "'", double1 == 89.9871176371083d);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8999083480823814d) + "'", double1 == (-0.8999083480823814d));
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.4E-45f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.9444389791664403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8007285372835489d + "'", double1 == 1.8007285372835489d);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5405377776318283d + "'", double1 == 1.5405377776318283d);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        int int2 = org.apache.commons.math3.util.FastMath.min((-18), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18) + "'", int2 == (-18));
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2652169031666407d + "'", double1 == 2.2652169031666407d);
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.000000000000002d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.4661381914791386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7632731405797343d) + "'", double1 == (-0.7632731405797343d));
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.6888846723792674d, 1.5677465296093194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6888846723792674d + "'", double2 == 1.6888846723792674d);
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.633123935319537E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7945743751980148d, (-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2654839796256415d + "'", double2 == 0.2654839796256415d);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.092963241182991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3239394786643683d + "'", double1 == 1.3239394786643683d);
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.695600561273704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.816703495911541d + "'", double1 == 2.816703495911541d);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        float float2 = org.apache.commons.math3.util.FastMath.max(7.629395E-6f, (float) 95L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 95.0f + "'", float2 == 95.0f);
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.46680851797176126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.1310943457077296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.511152727081865d) + "'", double1 == (-7.511152727081865d));
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        long long2 = org.apache.commons.math3.util.FastMath.max(1500L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.003127495644813641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0031274905463775614d + "'", double1 == 0.0031274905463775614d);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0124843102732666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8481505370769319d + "'", double1 == 0.8481505370769319d);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.12763976692167592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12763976692167592d + "'", double1 == 0.12763976692167592d);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        int int2 = org.apache.commons.math3.util.FastMath.min((-5), 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.29378315946961E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04132408178025465d) + "'", double1 == (-0.04132408178025465d));
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.5474732E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474732E-13f + "'", float1 == 4.5474732E-13f);
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.747801550829054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6913874931811929d + "'", double1 == 0.6913874931811929d);
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.02036584543290461d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997926233378113d + "'", double1 == 0.9997926233378113d);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.1961198770301516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 11.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 162754.63620401348d + "'", double1 == 162754.63620401348d);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.2261911708835171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.3351068943768114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1L, (-126.999985f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22.18604304878552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.710206263932135d + "'", double1 == 4.710206263932135d);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        double double1 = org.apache.commons.math3.util.FastMath.signum(162754.63620401348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        double double1 = org.apache.commons.math3.util.FastMath.floor(200.33682775424077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        float float1 = org.apache.commons.math3.util.FastMath.abs(15.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 15.0f + "'", float1 == 15.0f);
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.33970476966674595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4688983553218883d) + "'", double1 == (-0.4688983553218883d));
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32768.0d + "'", double2 == 32768.0d);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-63L), 1018.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1025);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.8370630725347682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8370630725347681d) + "'", double1 == (-0.8370630725347681d));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 76, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76L + "'", long2 == 76L);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-106L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.732623491163369d) + "'", double1 == (-4.732623491163369d));
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5706791906040234d), 1.7526551608216967d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144236d + "'", double1 == 53.598150033144236d);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5188871811480065d, 1500.0003333332966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5188871811480065d + "'", double2 == 0.5188871811480065d);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        int int1 = org.apache.commons.math3.util.FastMath.round(18.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-9.2233715E18f) + "'", float1 == (-9.2233715E18f));
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.026931837701290248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02729777739900466d + "'", double1 == 0.02729777739900466d);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6984787287238104d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        int int2 = org.apache.commons.math3.util.FastMath.max(79, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        long long2 = org.apache.commons.math3.util.FastMath.max(76L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 76L + "'", long2 == 76L);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.82421255E9d + "'", double1 == 5.82421255E9d);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (double) (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.5714470418077833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5106764997393833d + "'", double1 == 2.5106764997393833d);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-9.999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.236605282015445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 694.6843595023288d + "'", double1 == 694.6843595023288d);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.9444389791664403d, (double) 175.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9444389791664403d + "'", double2 == 2.9444389791664403d);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.7778936E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6255581242493435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.054734431114726374d) + "'", double1 == (-0.054734431114726374d));
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-2.0879347118439774E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.9325167282148206E-15d) + "'", double1 == (-5.9325167282148206E-15d));
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.23606797749979d, (-13.4200655606939d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.23606797749979d + "'", double2 == 2.23606797749979d);
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.8626451E-9f, (-22));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.440892E-16f + "'", float2 == 4.440892E-16f);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1023.0008257531325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.854732660012964d + "'", double1 == 17.854732660012964d);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.5826474541736284d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0227318499062852E110d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 253.306837560651d + "'", double1 == 253.306837560651d);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-9.2233715E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4975581E11f + "'", float1 == 5.4975581E11f);
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.45760881147219573d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.9342813E25f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.375957754343412E23d + "'", double1 == 3.375957754343412E23d);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.565996913733051E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5659969E7d + "'", double1 == 6.5659969E7d);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5708537835451057d, 230.25850929940458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 230.26386752244318d + "'", double2 == 230.26386752244318d);
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        double double2 = org.apache.commons.math3.util.FastMath.pow(52.0d, (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.9177770887761845E-18d + "'", double2 == 6.9177770887761845E-18d);
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-99.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        float float2 = org.apache.commons.math3.util.FastMath.min(15.000001f, 511.99997f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.000001f + "'", float2 == 15.000001f);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.027398523555245483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-48.212736012209476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.152059189427851E-21d + "'", double1 == 1.152059189427851E-21d);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0026306558026923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008761174615937d + "'", double1 == 1.0008761174615937d);
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.191374943865368E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.191374943865368E23d + "'", double1 == 3.191374943865368E23d);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5707846912665506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9439841391523142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702010852965063d + "'", double1 == 1.5702010852965063d);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        float float1 = org.apache.commons.math3.util.FastMath.signum(750.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        double double1 = org.apache.commons.math3.util.FastMath.acos(102.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 749.99994f, 3.1011072703299664E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 749.9999389648438d + "'", double2 == 749.9999389648438d);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-10.0f), 1.0384596E34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7563221378721827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5632219282013815d + "'", double1 == 0.5632219282013815d);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.70926996097583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 152576.0f, 0.24897964224240698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030335641787932688d + "'", double2 == 0.030335641787932688d);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-63.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-62.99999999999999d) + "'", double1 == (-62.99999999999999d));
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.1920928E-7f, (-11));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8207657E-11f + "'", float2 == 5.8207657E-11f);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 5.9604645E-8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.960464477539059E-8d + "'", double1 == 5.960464477539059E-8d);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.361831799193183E34d, 1.565804732394659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.420081748504423E270d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.420081748504423E270d + "'", double1 == 4.420081748504423E270d);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        int int2 = org.apache.commons.math3.util.FastMath.max((-12), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 108, (-106));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3312028E-30f + "'", float2 == 1.3312028E-30f);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-79.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-89.23288960379848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-90.0d) + "'", double1 == (-90.0d));
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        int int2 = org.apache.commons.math3.util.FastMath.min(1500, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.737125245533627E25d, 128);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        int int2 = org.apache.commons.math3.util.FastMath.min(76, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        int int2 = org.apache.commons.math3.util.FastMath.min(22025, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54) + "'", int2 == (-54));
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3759503453871893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.958837198432438d + "'", double1 == 3.958837198432438d);
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-750.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 1025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2836764218990301d + "'", double1 == 0.2836764218990301d);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5557.690612768986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.54992027339121d + "'", double1 == 74.54992027339121d);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.011298952859327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011235596485252857d + "'", double1 == 0.011235596485252857d);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-750.0f), (-4.5474735E-13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-750.0f) + "'", float2 == (-750.0f));
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0165168535073021E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.824212550988658E9d + "'", double1 == 5.824212550988658E9d);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-18.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.522997974471263E-8d + "'", double1 == 1.522997974471263E-8d);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.07552869653363556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        int int2 = org.apache.commons.math3.util.FastMath.min(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.70197740328915E-38d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.70197740328915E-38d + "'", double2 == 4.70197740328915E-38d);
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.026532393125271468d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 37.68977774747066d + "'", double2 == 37.68977774747066d);
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 59.45881643099403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.2260966286709531d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9948848769417228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8386962757735319d + "'", double1 == 0.8386962757735319d);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.054734431114726374d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0016057530318482293d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.7220087218417287d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        double double1 = org.apache.commons.math3.util.FastMath.floor(223.23772953327415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.0d + "'", double1 == 223.0d);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.15707963267948966d, 4.718623469602896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.718623469602896d + "'", double2 == 4.718623469602896d);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 1.09951163E12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.6255581242493435d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        double double1 = org.apache.commons.math3.util.FastMath.log((-7.2712028923680645d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.0384596E34f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.01877882225232d + "'", double1 == 79.01877882225232d);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.472691046113234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7845032792819188d) + "'", double1 == (-0.7845032792819188d));
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.5849394142282115E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(138.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.00003f + "'", float1 == 138.00003f);
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6061400801265278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.606140080126528d + "'", double1 == 1.606140080126528d);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.12136893780784676d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.258096538021482d + "'", double1 == 3.258096538021482d);
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 186.99998f, 5.3554640413010734E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 186.99998474121094d + "'", double2 == 186.99998474121094d);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.9932207207429933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47613874298999065d + "'", double1 == 0.47613874298999065d);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(171.8873521996253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.560083416183179d + "'", double1 == 5.560083416183179d);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        double double1 = org.apache.commons.math3.util.FastMath.log10(8.576232349627925E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.066703461467262d) + "'", double1 == (-4.066703461467262d));
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        int int2 = org.apache.commons.math3.util.FastMath.max((-63), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-149));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.7412648893537577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.2688682312579694E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0678933985571917d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1023), (float) 106);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 106.0f + "'", float2 == 106.0f);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.2913289205442933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(192.2168091200164d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.22304735158536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34078238922659015d + "'", double1 == 0.34078238922659015d);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 25);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-9.235280381378425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.235280381378423d) + "'", double1 == (-9.235280381378423d));
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        int int2 = org.apache.commons.math3.util.FastMath.max(22026, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22026 + "'", int2 == 22026);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 18.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999996d + "'", double1 == 0.9999999999999996d);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31046516452991896d + "'", double1 == 0.31046516452991896d);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.938953933193034E-64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3841130178712614E-66d + "'", double1 == 3.3841130178712614E-66d);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 258047.98f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.5365721132383438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.490388801525532d) + "'", double1 == (-0.490388801525532d));
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.03079207E11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.8207657E-11f, 0.6217880014903024d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.820766E-11f + "'", float2 == 5.820766E-11f);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-127.0f), 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.17136825E21f) + "'", float2 == (-1.17136825E21f));
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(9.536743E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1368684E-13f + "'", float1 == 1.1368684E-13f);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.3241189037517391d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        int int1 = org.apache.commons.math3.util.FastMath.abs(491);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 491 + "'", int1 == 491);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0001761935342754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.476794584436373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-2147483648));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2844135865397565E222d + "'", double1 == 2.2844135865397565E222d);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6302967986234014d) + "'", double1 == (-0.6302967986234014d));
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.08032752400444744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0801551973528744d + "'", double1 == 0.0801551973528744d);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8360035413770986E37d, 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.29191991346996E54d + "'", double2 == 5.29191991346996E54d);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.09746678486527317d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 53248);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53248L + "'", long1 == 53248L);
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.64808806136277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0842023017324751E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4074124304840448E-35d + "'", double1 == 2.4074124304840448E-35d);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.2532797083404758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0322471432828675d + "'", double1 == 1.0322471432828675d);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.162191050793719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 353.06753976376604d + "'", double1 == 353.06753976376604d);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.7208914127261735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3758840075233607d + "'", double1 == 2.3758840075233607d);
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5707846912665506d, (-0.37460659341591257d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707846912665506d) + "'", double2 == (-1.5707846912665506d));
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-9223372036854775808L), 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 4.5474732E-13f, 53247.99609374999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3829375507164952d) + "'", double2 == (-0.3829375507164952d));
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 2.9360128E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 664.6392450369414d + "'", double1 == 664.6392450369414d);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.913180823778077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5463474835799746d + "'", double1 == 1.5463474835799746d);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.06686586213046941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.064679345157476d) + "'", double1 == (-0.064679345157476d));
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6209036226920994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

