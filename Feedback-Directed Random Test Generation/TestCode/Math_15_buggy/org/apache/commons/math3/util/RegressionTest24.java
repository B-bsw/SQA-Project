package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

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
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.8949219476567826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2530518493268907d) + "'", double1 == (-2.2530518493268907d));
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 12.125f, 62);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.591669297343208E19d + "'", double2 == 5.591669297343208E19d);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        float float1 = org.apache.commons.math3.util.FastMath.abs(11012.999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11012.999f + "'", float1 == 11012.999f);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-8.0f), 694.6843595023288d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.9999995f) + "'", float2 == (-7.9999995f));
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.9073489E-6f, (-6.044629E23f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9073489E-6f) + "'", float2 == (-1.9073489E-6f));
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0000001685874083d, 100.00371790007361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001685874083d + "'", double2 == 1.0000001685874083d);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 115L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 115.0d + "'", double1 == 115.0d);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        double double1 = org.apache.commons.math3.util.FastMath.log10(718052.9999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.856156501008383d + "'", double1 == 5.856156501008383d);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 161, 144.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 144.0f + "'", float2 == 144.0f);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 750);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        long long2 = org.apache.commons.math3.util.FastMath.max(17L, 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.359610000063081E-28d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-91) + "'", int1 == (-91));
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0192837000737716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006387019160123d + "'", double1 == 1.006387019160123d);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 127.0f, (double) 1.5353358E26f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.7105054E-20f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7381167090762502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7381167090762503d + "'", double1 == 0.7381167090762503d);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        double double1 = org.apache.commons.math3.util.FastMath.rint(7.4499804372832909E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.4499804372832909E17d + "'", double1 == 7.4499804372832909E17d);
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.41797794906338553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4302552175296737d + "'", double1 == 0.4302552175296737d);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        long long2 = org.apache.commons.math3.util.FastMath.min(22026L, (long) (-54));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54L) + "'", long2 == (-54L));
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.4470159E9f, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8715804E20f + "'", float2 == 1.8715804E20f);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(12.000003f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12288.003f + "'", float2 == 12288.003f);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.972630067242408d), 0.49153001315302697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010429959063645966d + "'", double2 == 0.010429959063645966d);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.5353358E26f), (-458.00003f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5353358E26f) + "'", float2 == (-1.5353358E26f));
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.08032752400444744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08024116616352057d + "'", double1 == 0.08024116616352057d);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.013432001936747d, 0.8812778905541143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36959833027440414d + "'", double2 == 0.36959833027440414d);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, (long) 33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8192341800450601d, 328280.725258389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4955293351400453E-6d + "'", double2 == 2.4955293351400453E-6d);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.8218521846480703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3571628841079042d + "'", double1 == 1.3571628841079042d);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.57079626275941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848033860241d + "'", double1 == 1.0038848033860241d);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-108));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        double double1 = org.apache.commons.math3.util.FastMath.tan(13.61257747613688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7280948367459874d + "'", double1 == 1.7280948367459874d);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.002991102666190215d, (-2.2530518493268907d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.002991102666190215d) + "'", double2 == (-0.002991102666190215d));
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(186.99998474121094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2.3646862E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3646862246096137E-11d + "'", double1 == 2.3646862246096137E-11d);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.465643948356059E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.794019012057285E94d + "'", double1 == 7.794019012057285E94d);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        float float2 = org.apache.commons.math3.util.FastMath.max(19.999998f, 2.842171E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.027298433348069678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027301824971275052d) + "'", double1 == (-0.027301824971275052d));
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.548045480055047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.244204758090503d + "'", double1 == 1.244204758090503d);
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 144L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.662972536245079d + "'", double1 == 5.662972536245079d);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.950642552587727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.6061400801265278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4738338347137225d + "'", double1 == 0.4738338347137225d);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        int int2 = org.apache.commons.math3.util.FastMath.max((-91), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.6855647465563859d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(75.000015f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.500008f + "'", float2 == 37.500008f);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.142599071873668d, 4.70926996097583d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54730.382015306546d + "'", double2 == 54730.382015306546d);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(38.73535314562644d, 10.792000279484455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.432647972311379d) + "'", double2 == (-4.432647972311379d));
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.031149732764242856d), 0.37961479733204306d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 48);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 48L + "'", long1 == 48L);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7246231833006227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6270611563527957d + "'", double1 == 0.6270611563527957d);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-39L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 39.0f + "'", float1 == 39.0f);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.275957614183426E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.275957614156956E-12d + "'", double1 == 7.275957614156956E-12d);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.2684529660545276d, (-0.8909429718644172d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2684529660545276d + "'", double2 == 1.2684529660545276d);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.826483428138438E7d, 1023.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707403175268588d + "'", double2 == 1.5707403175268588d);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.294967296E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 115L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 115.0f + "'", float1 == 115.0f);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.003946203537474d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.682271752098324d + "'", double2 == 0.682271752098324d);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        double double2 = org.apache.commons.math3.util.FastMath.max((-5.447014912E9d), 0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22168521914039824d + "'", double2 == 0.22168521914039824d);
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        long long2 = org.apache.commons.math3.util.FastMath.max(127L, 79L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.49782137E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7181765752430962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7181765752430964d + "'", double1 == 1.7181765752430964d);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.516582543750002E7d, (-11));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9001114910046946E-82d + "'", double2 == 3.9001114910046946E-82d);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.05010842414258889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 6.338253E29f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5053817087238509d) + "'", double1 == (-0.5053817087238509d));
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.010613055774744197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010669574017979503d + "'", double1 == 0.010669574017979503d);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1500.0002f, 69);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.8544386E23f + "'", float2 == 8.8544386E23f);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.820766E-11f, (float) 5447015486L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.820766E-11f + "'", float2 == 5.820766E-11f);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3057780432045403d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        double double1 = org.apache.commons.math3.util.FastMath.tan(13.818172485058252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0277908362047263d + "'", double1 == 3.0277908362047263d);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9760322118920343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9760322118920343d + "'", double1 == 0.9760322118920343d);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        long long1 = org.apache.commons.math3.util.FastMath.abs(458L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 458L + "'", long1 == 458L);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1008.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9333634218998555d), (-30.708115498279298d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9333634218998555d) + "'", double2 == (-0.9333634218998555d));
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-5.9325167282148206E-15d), 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1433134923316977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.885315488201766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.725046003969731d) + "'", double1 == (-5.725046003969731d));
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-54.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        long long1 = org.apache.commons.math3.util.FastMath.abs(33L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33L + "'", long1 == 33L);
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5265890341390445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.423035857164402d + "'", double1 == 0.423035857164402d);
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        int int2 = org.apache.commons.math3.util.FastMath.max((-58), 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.22565008544035375d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22756990697517282d) + "'", double1 == (-0.22756990697517282d));
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483648L, (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483648L + "'", long2 == 2147483648L);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0307922329600002E11d, (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0307922329600002E11d + "'", double2 == 1.0307922329600002E11d);
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.15782930550131322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1465469637099587d + "'", double1 == 0.1465469637099587d);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-91));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 91.0f + "'", float1 == 91.0f);
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-409600.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.03125f + "'", float1 == 0.03125f);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0159153328244164E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.221933116817157d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6054440805936159d) + "'", double1 == (-0.6054440805936159d));
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.094947E-13f, (float) (-13));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.094947E-13f) + "'", float2 == (-9.094947E-13f));
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.999999f), 2.852214E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.852214E30f + "'", float2 == 2.852214E30f);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.4876550949064553d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.23297517878d + "'", double2 == 11013.23297517878d);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.03165064858562794d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        double double2 = org.apache.commons.math3.util.FastMath.pow(17.854732660012964d, 6400);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        int int1 = org.apache.commons.math3.util.FastMath.abs(116);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.691673596021347E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.2913289205442933d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.12520241624226194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1255297774892652d + "'", double1 == 0.1255297774892652d);
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.715611538515039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-27.294593628126286d), 32.376000838461856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.08140721033557d + "'", double2 == 5.08140721033557d);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.8163004800929856d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0000005f + "'", float1 == 7.0000005f);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.1368683772161602E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5137759876372815E-12d + "'", double1 == 6.5137759876372815E-12d);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.172958301684023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.739916819407977E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.562262621639636d) + "'", double1 == (-5.562262621639636d));
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.00262719563966585d, 1.1172687352477229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0023514403604268036d + "'", double2 == 0.0023514403604268036d);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.009266E-36f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-118) + "'", int1 == (-118));
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.102E-42f, 41);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.622231866529366E-30d + "'", double2 == 4.622231866529366E-30d);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-6.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.9373628E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9373632E13f + "'", float1 == 5.9373632E13f);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.735936195599085E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        long long1 = org.apache.commons.math3.util.FastMath.abs(187L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 187L + "'", long1 == 187L);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(101.46782120377229d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.1718714844509472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.265388724405803d + "'", double1 == 1.265388724405803d);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.5514298635472507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5798038327300861d + "'", double1 == 0.5798038327300861d);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-8.0d), 0.5574077842595472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5012327794046536d) + "'", double2 == (-1.5012327794046536d));
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.039790063769915E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.03979006376992E14d + "'", double1 == 5.03979006376992E14d);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5677465296093194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2317641548923273d + "'", double1 == 1.2317641548923273d);
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5707962971309473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104772382675964d + "'", double1 == 3.8104772382675964d);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        float float2 = org.apache.commons.math3.util.FastMath.max(1638400.0f, 1.9999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638400.0f + "'", float2 == 1638400.0f);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.9367639518780573d, 1.8851621707325812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5885166410320594d + "'", double2 == 0.5885166410320594d);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.15707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.47613874298999065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49625853135521636d + "'", double1 == 0.49625853135521636d);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.2599150451156507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.039442958352624305d + "'", double1 == 0.039442958352624305d);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6156614228606675d, 1.2018710074591044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5582338752976463d + "'", double2 == 0.5582338752976463d);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.05440166227522499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.627430214775713E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998675736d + "'", double1 == 0.9999999998675736d);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 984, (long) 6400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 984L + "'", long2 == 984L);
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-6912));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6912 + "'", int1 == 6912);
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 0, (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0801551973528744d, (-0.41032129904822556d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8166972756934276d + "'", double2 == 2.8166972756934276d);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 187L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 187.0f + "'", float1 == 187.0f);
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7396130970112139d), 1.570796326794887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794887d + "'", double2 == 1.570796326794887d);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.3025849976266093d, (-0.41033021298278366d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.41033021298278366d) + "'", double2 == (-0.41033021298278366d));
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9760322118920343d, 1.332063396007248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9682011207825635d + "'", double2 == 0.9682011207825635d);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.16772245730490729d), 41.000008589004516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004090767965633776d) + "'", double2 == (-0.004090767965633776d));
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 72L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 12.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.000000953674316d + "'", double1 == 12.000000953674316d);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        double double1 = org.apache.commons.math3.util.FastMath.signum(378077.081374287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9537631068020545d + "'", double1 == 1.9537631068020545d);
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-10.07608628613008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.15988498802696d) + "'", double1 == (-2.15988498802696d));
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.980648102686758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.058427491974119d + "'", double1 == 2.058427491974119d);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.555789E22f, (-0.027298433348069678d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.555788E22f + "'", float2 == 7.555788E22f);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.163399870121596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16487785279305836d + "'", double1 == 0.16487785279305836d);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.04548581173721E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.04548581173721E-18d + "'", double1 == 8.04548581173721E-18d);
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1102230246251565E-16d, 1499.999666666629d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.19907068801479763d) + "'", double2 == (-0.19907068801479763d));
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.14285256881990374d), (double) 0.001953125f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001953125d + "'", double2 == 0.001953125d);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-126.99998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0304438949608627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.802309489713823d + "'", double1 == 2.802309489713823d);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5101864143818207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.8008737853888865E24d, (double) (-1.426107E30f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        int int2 = org.apache.commons.math3.util.FastMath.min(75, 86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-21.999998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 21.999998f + "'", float1 == 21.999998f);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.844222393007231E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4944083668132526E-24d + "'", double1 == 4.4944083668132526E-24d);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(86.87770167840647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.157615458252736d + "'", double1 == 5.157615458252736d);
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.355466754254918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3720769788584683d + "'", double1 == 0.3720769788584683d);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.0000000037838663d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000037838663d + "'", double2 == 1.0000000037838663d);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9999999999998128d, 0.22168521914039824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3526391714247434d + "'", double2 == 1.3526391714247434d);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6935165886908714d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1024.9998f, 2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9996f + "'", float2 == 1024.9996f);
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.99999994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0038848033860241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5476577157425222d + "'", double1 == 1.5476577157425222d);
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.11494454941766914d, (double) 1.4757397E20f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11494454941766914d + "'", double2 == 0.11494454941766914d);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        double double1 = org.apache.commons.math3.util.FastMath.signum(30.829470556638885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.6109948509855884E-13d, 3.9383630215740486E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6109948509855884E-13d + "'", double2 == 1.6109948509855884E-13d);
    }
}

