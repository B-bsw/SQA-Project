package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.4393749034754382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4393749034754382d + "'", double1 == 1.4393749034754382d);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-8.61536494421336E37d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.936240502683874E39d) + "'", double1 == (-4.936240502683874E39d));
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        int int2 = org.apache.commons.math3.util.FastMath.max(58, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.0518047429114125E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0518047433851296E-5d + "'", double1 == 3.0518047433851296E-5d);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 96.999985f, (double) 2.102E-42f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99998474121094d + "'", double2 == 96.99998474121094d);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 35L, 2.472691046113234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.472691046113234d + "'", double2 == 2.472691046113234d);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.235329763979993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1114538964707412d + "'", double1 == 1.1114538964707412d);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.186033145648624d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4913094094244397E39d + "'", double2 == 1.4913094094244397E39d);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        double double1 = org.apache.commons.math3.util.FastMath.tan(76.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6867476893515227d + "'", double1 == 0.6867476893515227d);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.39486927508948544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5707963266960232d, 3.011554682704359E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.802557433435273E-7d) + "'", double2 == (-4.802557433435273E-7d));
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.017453290439348693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998807907103d + "'", double1 == 0.9999998807907103d);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-3.658062037120332E-60d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(17.854732660012964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9367639518780573d + "'", double1 == 2.9367639518780573d);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-6), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-12.0d) + "'", double2 == (-12.0d));
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-22), 0.19198621771937624d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-21.999998f) + "'", float2 == (-21.999998f));
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8052885407089897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9361619813510174d) + "'", double1 == (-0.9361619813510174d));
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.1374665693876721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023992442472361235d + "'", double1 == 0.0023992442472361235d);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.307158536735294E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.363077438155115d + "'", double1 == 9.363077438155115d);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.965667148572021E12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 40L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.22191504464504894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22377804840311807d) + "'", double1 == (-0.22377804840311807d));
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7554474551938102d, 96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.018095422528908462d + "'", double2 == 0.018095422528908462d);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0619928668337089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.3600415E24f), 0.47613874298999065d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.3600414E24f) + "'", float2 == (-1.3600414E24f));
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.001f, 4096.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0005f + "'", float2 == 4096.0005f);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5729.577951308233d, 0.0017485286359640957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.015245761474795d + "'", double2 == 1.015245761474795d);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4936039667695802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(8.112963841460668E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.112963841460668E31d + "'", double1 == 8.112963841460668E31d);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.2654839796256415d, (double) 31.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2654839796256415d + "'", double2 == 0.2654839796256415d);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1529510720305247E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1529510720305247E-14d + "'", double1 == 1.1529510720305247E-14d);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.9999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 22.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0092655E-36f, 1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.009266E-36f + "'", float2 == 3.009266E-36f);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7500000000000001d + "'", double1 == 0.7500000000000001d);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-3.3201254043604727d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.194414737140372E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62939453125E-6d + "'", double1 == 7.62939453125E-6d);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        double double1 = org.apache.commons.math3.util.FastMath.log10(11.55574042944425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.062797777951831d + "'", double1 == 1.062797777951831d);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0023992442472361235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002399239643598489d + "'", double1 == 0.002399239643598489d);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 113, (long) 187);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-8.271399149115647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        double double1 = org.apache.commons.math3.util.FastMath.cos(74.2099485247879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37326060527019267d + "'", double1 == 0.37326060527019267d);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 3.0517578E-5f, 1.5707962971309473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9428094003595883E-5d + "'", double2 == 1.9428094003595883E-5d);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.17453290855467615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.6420926159343308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6045824459415916d) + "'", double1 == (-0.6045824459415916d));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.4280173086891232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.10876056725620209d, 22.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004943621874569219d + "'", double2 == 0.004943621874569219d);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        double double2 = org.apache.commons.math3.util.FastMath.pow(57.295779939969144d, 48);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4540675394221813E84d + "'", double2 == 2.4540675394221813E84d);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        double double1 = org.apache.commons.math3.util.FastMath.exp(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 442413.3920089205d + "'", double1 == 442413.3920089205d);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        long long1 = org.apache.commons.math3.util.FastMath.round(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.4757395E20f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.7592186E13f + "'", float1 == 1.7592186E13f);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        int int2 = org.apache.commons.math3.util.FastMath.min((-15), 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-15) + "'", int2 == (-15));
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.4470159E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 512.0f + "'", float1 == 512.0f);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-12.041199826559248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.0d) + "'", double1 == (-13.0d));
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.012793491209214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7532815500753123d + "'", double1 == 2.7532815500753123d);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.4103302129827837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41033021298278366d) + "'", double1 == (-0.41033021298278366d));
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0089894810243984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7428279344530537d + "'", double1 == 2.7428279344530537d);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-40.89635640269601d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0556231835692219d + "'", double1 == 0.0556231835692219d);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.1920928E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962075856141d + "'", double1 == 1.5707962075856141d);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6537329234338422d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2147483648), (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.6302967986234014d), 2.8844902699029284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8844902699029284d + "'", double2 == 2.8844902699029284d);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        double double1 = org.apache.commons.math3.util.FastMath.abs(8.03837595936612E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.03837595936612E29d + "'", double1 == 8.03837595936612E29d);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9426286359925617d, 1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.564939666262521d + "'", double2 == 1.564939666262521d);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.949823557438858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9498235574388583d + "'", double1 == 1.9498235574388583d);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.671406E24f, (-458.00003f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-458.00003f) + "'", float2 == (-458.00003f));
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.186033145648624d, 2.802596928649635E-45d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.186033145648624d + "'", double2 == 4.186033145648624d);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        long long1 = org.apache.commons.math3.util.FastMath.round(114.59155902616463d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 115L + "'", long1 == 115L);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.228037402771233d), 458);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6972432888005272E137d) + "'", double2 == (-1.6972432888005272E137d));
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.983978114526449E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.983978114526449E-12d + "'", double1 == 5.983978114526449E-12d);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 17, 1638399.9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1638399.9f + "'", float2 == 1638399.9f);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9315964599440727d + "'", double1 == 0.9315964599440727d);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 69, 0.07718758899559931d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 68.99999f + "'", float2 == 68.99999f);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.75006293476747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.75006293476747d + "'", double1 == 4.75006293476747d);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 100L, 1.4466780791229317d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.192093E-7f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.192093E-7f + "'", float2 == 1.192093E-7f);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7954220262240286d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5502.877435695553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.012849789557351724d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012849082387449818d) + "'", double1 == (-0.012849082387449818d));
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 126.99998f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(17.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1029.9685644157091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1030.0d + "'", double1 == 1030.0d);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 66);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        double double1 = org.apache.commons.math3.util.FastMath.rint(414.6269406615638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 415.0d + "'", double1 == 415.0d);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7298301084846842d) + "'", double1 == (-0.7298301084846842d));
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.8808135922807914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 107.76268088852854d + "'", double1 == 107.76268088852854d);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(32.00001402957443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4657482540374d + "'", double1 == 1833.4657482540374d);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.7453293851523841d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2546706148476159d) + "'", double2 == (-0.2546706148476159d));
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1920930376163597E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8390720478950319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4321113160474495d + "'", double1 == 0.4321113160474495d);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.255707955480526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.24869926123636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07415379103562517d + "'", double1 == 0.07415379103562517d);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8604993868447559d), (-0.10546875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8669387821448313d + "'", double2 == 0.8669387821448313d);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        float float2 = org.apache.commons.math3.util.FastMath.min(113.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-9.876755530286335d), 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0859607550250738E13d) + "'", double2 == (-1.0859607550250738E13d));
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        int int2 = org.apache.commons.math3.util.FastMath.min(11, (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-34) + "'", int2 == (-34));
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4179285755053868d + "'", double1 == 1.4179285755053868d);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.457588777712573d, 0.9181817501356361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2132441266225136d + "'", double2 == 1.2132441266225136d);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(Double.NEGATIVE_INFINITY, 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 54L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9949100540772481d, (double) 511.99997f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07333574898527641d + "'", double2 == 0.07333574898527641d);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.439626979519121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2353630293193767d + "'", double1 == 1.2353630293193767d);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(18629.058771181848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.50922131733647d + "'", double1 == 26.50922131733647d);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        int int1 = org.apache.commons.math3.util.FastMath.round((-458.00003f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-458) + "'", int1 == (-458));
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        int int2 = org.apache.commons.math3.util.FastMath.min((-100), (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6437583519585885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-8.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-7.9999995f) + "'", float1 == (-7.9999995f));
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.263102496115639E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.52238376049544E15d + "'", double1 == 8.52238376049544E15d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.958837198432438d, 8.699650102470575E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.699650102470575E-5d + "'", double2 == 8.699650102470575E-5d);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        int int2 = org.apache.commons.math3.util.FastMath.min((-149), 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.5904105265143091d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8925999050849018d) + "'", double1 == (-0.8925999050849018d));
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.006732012348487d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.006732012348487d + "'", double2 == 1.006732012348487d);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9105668365896491d, 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0469949809996943E-31d + "'", double2 == 3.0469949809996943E-31d);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        double double1 = org.apache.commons.math3.util.FastMath.sin(97.04617139798238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3365030074250319d + "'", double1 == 0.3365030074250319d);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.600540585471551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.772625870825157d + "'", double1 == 6.772625870825157d);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(460.90780529426263d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(28.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 718053L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 718053.06f + "'", float1 == 718053.06f);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.918595617854619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 453.70210857385814d + "'", double1 == 453.70210857385814d);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        int int1 = org.apache.commons.math3.util.FastMath.abs(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1023);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1023.00006f + "'", float1 == 1023.00006f);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1501.9343928329747d, 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.110817901531672E41d + "'", double2 == 5.110817901531672E41d);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.6836288453882233E-104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999998092651369d, (double) 39.999992f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.99999809265137d + "'", double2 == 9.99999809265137d);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1017.9999389648438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.5014100672382398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.728680658121966d + "'", double1 == 28.728680658121966d);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.490000558753344E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.976733742420574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 8L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.1994124557376138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6214760367237734d + "'", double1 == 0.6214760367237734d);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.4E-45f, (float) 11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.0f + "'", float2 == 11.0f);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        double double1 = org.apache.commons.math3.util.FastMath.sin(453.70210857385814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9668945844701841d + "'", double1 == 0.9668945844701841d);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 12L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4876550949064553d + "'", double1 == 1.4876550949064553d);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.204438512506361d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.1691263E29f, 491);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.10727605356188535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10748288465449647d) + "'", double1 == (-0.10748288465449647d));
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9921249019112125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.522997974471263E-8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.570796325165082d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        long long1 = org.apache.commons.math3.util.FastMath.round(4096.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-9));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2835960924048626d, 2.7144175303058917d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9693364199848673d + "'", double2 == 1.9693364199848673d);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        int int1 = org.apache.commons.math3.util.FastMath.abs(113);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.5325202929210884E272d, 3830353.554453491d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.0038343743032976875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4294967296L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5677741706249706d, (double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677741706249706d + "'", double2 == 1.5677741706249706d);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.307896633423856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.307896633423856d + "'", double1 == 2.307896633423856d);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.9421127E28f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.693147181075235d, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.64852731351979E-5d + "'", double2 == 7.64852731351979E-5d);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.199856919813021E23d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(128.0f, 4.3625831891367726E215d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.00002f + "'", float2 == 128.00002f);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.1826881112499317d, 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4994025859037354E12d + "'", double2 == 3.4994025859037354E12d);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        double double2 = org.apache.commons.math3.util.FastMath.pow(22026.465794806718d, (-0.9999999801317847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.539993878264153E-5d + "'", double2 == 4.539993878264153E-5d);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-1.9843745f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.256631323173906d) + "'", double1 == (-1.256631323173906d));
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        double double2 = org.apache.commons.math3.util.FastMath.pow(79.0d, 26.17994459767847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.783790114618505E49d + "'", double2 == 4.783790114618505E49d);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(102400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.469446951953614E-18d, (double) 17.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.1884223409998995E32d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        double double1 = org.apache.commons.math3.util.FastMath.abs(17.894443933771722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.894443933771722d + "'", double1 == 17.894443933771722d);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.011481803329747568d), 42.80412134742886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011481803329747568d + "'", double2 == 0.011481803329747568d);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9973716983851401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4982780015147925d + "'", double1 == 1.4982780015147925d);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.06037557856845913d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.060449046256455315d) + "'", double1 == (-0.060449046256455315d));
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.48052332892790506d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.03079223E11f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079223E11f + "'", float2 == 1.03079223E11f);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1018.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.1602900942795302d, 0.5403024061792941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16029009427953023d + "'", double2 == 0.16029009427953023d);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        long long2 = org.apache.commons.math3.util.FastMath.min(182L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        float float2 = org.apache.commons.math3.util.FastMath.min(138.00002f, 3.777893E23f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.00002f + "'", float2 == 138.00002f);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.633123935319537E16d, (-56.83127452036154d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-100));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        int int2 = org.apache.commons.math3.util.FastMath.min(149, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.051631822436730465d, 6.72875599861461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.051631822436730465d + "'", double2 == 0.051631822436730465d);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(26338.81768250355d, 0.9211679912654148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26338.817682503548d + "'", double2 == 26338.817682503548d);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0001761935342757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000880928869595d + "'", double1 == 1.0000880928869595d);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.172561160839341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.5826474541736284d), 2.2831781865614684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5826474541736282d) + "'", double2 == (-1.5826474541736282d));
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.551070328970187E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.143340907144686d) + "'", double1 == (-1.143340907144686d));
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.026938351971522147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.00507775325695467d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.850338976445283E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.850338976445283E14d + "'", double1 == 2.850338976445283E14d);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 22026L, 9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22026.0f + "'", float2 == 22026.0f);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8949219476567826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2470996758325354d + "'", double1 == 1.2470996758325354d);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        long long2 = org.apache.commons.math3.util.FastMath.min(6L, (long) (-458));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-458L) + "'", long2 == (-458L));
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5596953038813823d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.178679289503757E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        int int1 = org.apache.commons.math3.util.FastMath.round(75.000015f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.1329639571222294d), (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1329639571222294d + "'", double2 == 1.1329639571222294d);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.718548E31f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 63.000004f, 1.0088885951019526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0088885951019526d + "'", double2 == 1.0088885951019526d);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.9342813E25f, 2980.9579870417283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9342813113834065E25d + "'", double2 == 1.9342813113834065E25d);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.469030353138562E60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        int int2 = org.apache.commons.math3.util.FastMath.max(83, 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.024414062f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.8626451E-9f + "'", float1 == 1.8626451E-9f);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9323757820972908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5405377776318285d + "'", double1 == 1.5405377776318285d);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-5.999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5353358E26f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(489138.1461517498d, 6.299737579712394E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 489138.1461517499d + "'", double2 == 489138.1461517499d);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.332063396007248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 95L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 95.00001f + "'", float1 == 95.00001f);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 69, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.7208989266620003d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.513685102014876d) + "'", double1 == (-0.513685102014876d));
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.775558555041274E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.775558555041274E-17d + "'", double1 == 2.775558555041274E-17d);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-3.49782137E13f), 4.611686E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.49782137E13f + "'", float2 == 3.49782137E13f);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-6.044629E23f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.044629E23f + "'", float1 == 6.044629E23f);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7167209065866512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(11.955599251180722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155685.43808661395d + "'", double1 == 155685.43808661395d);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.7017203400855395d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.299737579712394E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948808d + "'", double1 == 1.5707963267948808d);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-2.9405615342893493E8d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.970065885654633d + "'", double1 == 1.970065885654633d);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0325944886750007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7500000000000001d, (double) (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.75d + "'", double2 == 0.75d);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.5849394142282115E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6077746776921858E-13d + "'", double1 == 1.6077746776921858E-13d);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        double double1 = org.apache.commons.math3.util.FastMath.exp(32.763865073340014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6949847969198603E14d + "'", double1 == 1.6949847969198603E14d);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-3.49782137E13f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-1.9999999f), 1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6439447237670752d) + "'", double2 == (-0.6439447237670752d));
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067811865476d + "'", double1 == 0.7071067811865476d);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        long long2 = org.apache.commons.math3.util.FastMath.max(31L, 116L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 116L + "'", long2 == 116L);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.5474732E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.7105054E-20f + "'", float1 == 2.7105054E-20f);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-4.0065821320002953E46d), 0.41797794906338553d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.9969063677702439d), 67);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4711741305367249E20d) + "'", double2 == (-1.4711741305367249E20d));
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 69L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11478481378318722d) + "'", double1 == (-0.11478481378318722d));
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.014502797227095314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8309490722465948d) + "'", double1 == (-0.8309490722465948d));
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.4293757289532156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2077748638002537d + "'", double1 == 2.2077748638002537d);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 48);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.430218907497497E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.00000762939453d + "'", double1 == 127.00000762939453d);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.8626451492309568E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8626451492309568E-9d + "'", double1 == 1.8626451492309568E-9d);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8360035413770986E37d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 123 + "'", int1 == 123);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.06443056647584822d), 0.9923318359313429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0644305664758482d) + "'", double2 == (-0.0644305664758482d));
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.14748352E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 187L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.3012797588617087d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3012797588617087d + "'", double2 == 2.3012797588617087d);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.15987052369731922d, 0.011299193276846486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15987052369731922d + "'", double2 == 0.15987052369731922d);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-22), (-0.9969063677702439d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-22.0d) + "'", double2 == (-22.0d));
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.1563151184255194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735577549352626d + "'", double1 == 0.9735577549352626d);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.7897890063461337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5702010852965063d, 28.419034402957756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5702010852965063d + "'", double2 == 1.5702010852965063d);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.623832501180273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2066693525504288d + "'", double1 == 1.2066693525504288d);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 7, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        float float1 = org.apache.commons.math3.util.FastMath.abs(3.7778936E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7778936E22f + "'", float1 == 3.7778936E22f);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.3509887E-38f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.3509886E-38f) + "'", float1 == (-2.3509886E-38f));
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0801551973528744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.03563663576856945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0006350521082672d + "'", double1 == 1.0006350521082672d);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.480455125209073d, 2.0705304252072893E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.480455125209073d + "'", double2 == 3.480455125209073d);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.306663311270204d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 173888.74338370204d + "'", double2 == 173888.74338370204d);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.724558910165124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-63), (long) 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-758.8784468386351d), 86);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.952343810326086E247d + "'", double2 == 4.952343810326086E247d);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.5987297191141082d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.641914201372862d) + "'", double1 == (-0.641914201372862d));
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.15978926741180702d, (-22.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15978926741180702d + "'", double2 == 0.15978926741180702d);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(54.0f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 55296.0f + "'", float2 == 55296.0f);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.0000002f, 3.04532039237905E-6d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.312221877264961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        long long1 = org.apache.commons.math3.util.FastMath.round(24.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7.21110307993129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.931970843299875d + "'", double1 == 1.931970843299875d);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 5.6843426E-14f, 3.011554682704359E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.684342563707159E-14d + "'", double2 == 5.684342563707159E-14d);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7817974362806785d + "'", double1 == 1.7817974362806785d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2470996758325354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6892675484321379d + "'", double1 == 0.6892675484321379d);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 26);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-3), (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.75d) + "'", double2 == (-0.75d));
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 5, (long) 108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 108L + "'", long2 == 108L);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-108));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0065821320002953E46d + "'", double1 == 4.0065821320002953E46d);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.6299036625652747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.972259404766724d + "'", double1 == 6.972259404766724d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.8189894E-12f, (float) 123);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8189894E-12f + "'", float2 == 1.8189894E-12f);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7576211478872673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7576211478872673d + "'", double1 == 0.7576211478872673d);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 116);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 116 + "'", int1 == 116);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5716460415244097E-138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6679190596134985d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        double double1 = org.apache.commons.math3.util.FastMath.asin(200.33512630760862d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.964889726830815d + "'", double1 == 18.964889726830815d);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 491);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.6379792E-12f, 8.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6379792E-12f + "'", float2 == 3.6379792E-12f);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 6.9999995f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.03034029473695931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0308052518784447d + "'", double1 == 1.0308052518784447d);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 256.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.8414709203988365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7647251047285971d) + "'", double1 == (-0.7647251047285971d));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5293379817722996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1521291323414964d + "'", double1 == 1.1521291323414964d);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 15.0f, 1.7125539158461947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7125539158461947d + "'", double2 == 1.7125539158461947d);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-40), (long) (-22));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22L) + "'", long2 == (-22L));
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.12099404093087916d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-35.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.2132441266225136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.641979420594022d + "'", double1 == 0.641979420594022d);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(402.4287934927351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23057.471421675487d + "'", double1 == 23057.471421675487d);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        float float2 = org.apache.commons.math3.util.FastMath.max(63.000004f, 6.718548E31f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.718548E31f + "'", float2 == 6.718548E31f);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 258047.98f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 258047.98437500003d + "'", double1 == 258047.98437500003d);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(62.692646897240664d, (-1.60978200584442592E17d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.60978200584442592E17d + "'", double2 == 1.60978200584442592E17d);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        double double1 = org.apache.commons.math3.util.FastMath.abs(22.14423310405345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.14423310405345d + "'", double1 == 22.14423310405345d);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        double double1 = org.apache.commons.math3.util.FastMath.exp(144.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.454660656717546E62d + "'", double1 == 3.454660656717546E62d);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.5707963057214724d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.78392357951125d, 0.7567679096855728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1695904042195342d + "'", double2 == 1.1695904042195342d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        double double1 = org.apache.commons.math3.util.FastMath.rint(31.594603878732347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.5247523005882602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009158655402680117d) + "'", double1 == (-0.009158655402680117d));
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.4414062E-4f, (float) 15L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4414062E-4f + "'", float2 == 2.4414062E-4f);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.09957181625497864d), (-1.2670214075185258d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09957181625497864d) + "'", double2 == (-0.09957181625497864d));
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.001739546146996826d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.33102839773286313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3310283977328632d + "'", double1 == 0.3310283977328632d);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1222007532741443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019586098012994355d + "'", double1 == 0.019586098012994355d);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 0.017578125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017577219768442984d + "'", double1 == 0.017577219768442984d);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.7433921305746446E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7433921305746446E-23d + "'", double1 == 3.7433921305746446E-23d);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.02198977063584929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021986226936647223d) + "'", double1 == (-0.021986226936647223d));
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 3.1011072703299664E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.055620329093743d, 2.3012989018466428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.055620329093743d + "'", double2 == 2.055620329093743d);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-4.936240502683874E39d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.265263931807735d, (-1.7636242638424793d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.385205764895947d + "'", double2 == 10.385205764895947d);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        int int2 = org.apache.commons.math3.util.FastMath.max(48, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.907348632810187E-6d + "'", double1 == 1.907348632810187E-6d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0000000037838663d, 53248.00390625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0002015036279417d + "'", double2 == 1.0002015036279417d);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5318551602504294d, 7.267933988921239E91d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.267933988921239E91d + "'", double2 == 7.267933988921239E91d);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.258096538021482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05686451193630348d + "'", double1 == 0.05686451193630348d);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.768371582031251E-7d, (-0.017452405451122824d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2892218228882044d + "'", double2 == 1.2892218228882044d);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.000000000000004d + "'", double1 == 25.000000000000004d);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-17.833235452775604d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.04430534570644151d), 7.162897504863918E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.185394343051295E-27d) + "'", double2 == (-6.185394343051295E-27d));
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.017577219768442984d, 1.192093108670653E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.945010423401025d + "'", double2 == 3.945010423401025d);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 106 + "'", int1 == 106);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.5422429081369673E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-22));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22.0f + "'", float1 == 22.0f);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4583.662361046586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5463474835799746d, 1.0000880928869595d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.45382870219394444d) + "'", double2 == (-0.45382870219394444d));
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3759503453871893d, 175);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8008737853888865E24d + "'", double2 == 1.8008737853888865E24d);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-4L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.01709518358122681d, (-5.4223192764501157E45d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.4223192764501157E45d + "'", double2 == 5.4223192764501157E45d);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        double double2 = org.apache.commons.math3.util.FastMath.pow(54.01378424630655d, 458);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6252248588609128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05440166227522499d) + "'", double1 == (-0.05440166227522499d));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-17L), 1.6144206905127136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.75862759563985d + "'", double2 == 0.75862759563985d);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.606140080126528d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9357524720632393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6604961253409587d + "'", double1 == 0.6604961253409587d);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1.1884224E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.074970842797875d + "'", double1 == 32.074970842797875d);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        long long2 = org.apache.commons.math3.util.FastMath.max(187L, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        int int2 = org.apache.commons.math3.util.FastMath.max(4, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        long long2 = org.apache.commons.math3.util.FastMath.min(106L, (long) 24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.842171E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.223373E19f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-125));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.52147691747826d) + "'", double1 == (-5.52147691747826d));
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 22026.004f, (-0.9131200615513249d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0823763028977422E-4d + "'", double2 == 1.0823763028977422E-4d);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1023.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.333557385554463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6935165886908714d + "'", double1 == 0.6935165886908714d);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        double double2 = org.apache.commons.math3.util.FastMath.log((-4.571853651987668E-5d), 0.9169927026825043d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-2.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547513344833d) + "'", double1 == (-0.9950547513344833d));
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.7845032792819188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7064737195127854d) + "'", double1 == (-0.7064737195127854d));
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.02567602146900736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996703890695808d + "'", double1 == 0.9996703890695808d);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.3457305902718723d, 1.47961458771971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22954417523049697d + "'", double2 == 0.22954417523049697d);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.3129623428552976E16d, 106);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.932979906154852E48d + "'", double2 == 5.932979906154852E48d);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-3L), 83);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.90142196707511E25d) + "'", double2 == (-2.90142196707511E25d));
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        double double2 = org.apache.commons.math3.util.FastMath.log(6.9363427358340495d, 1.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.279498109895582d + "'", double2 == 0.279498109895582d);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        long long2 = org.apache.commons.math3.util.FastMath.max(4096L, (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, 48);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.81474977E14f + "'", float2 == 2.81474977E14f);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.051759E-5f, (float) 25);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.051759E-5f + "'", float2 == 3.051759E-5f);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 63, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707961462678175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.3560551570236352d, 0.36787946309876646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3560551570236352d + "'", double2 == 1.3560551570236352d);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.3758840075233607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6930480294017594d + "'", double1 == 0.6930480294017594d);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.661011522946662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5840772787993332d + "'", double1 == 0.5840772787993332d);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.5228080019404568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.310720664591689E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.5596953038813823d, (-0.782532834469048d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.782532834469048d) + "'", double2 == (-0.782532834469048d));
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.051631822436730465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051608909506441425d + "'", double1 == 0.051608909506441425d);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9171523356089556d, 56.87326404219065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171523356089556d + "'", double2 == 0.9171523356089556d);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.014608467389253983d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(53.37233302232507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9315229407104687d + "'", double1 == 0.9315229407104687d);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4526698300124393E-4d + "'", double1 == 3.4526698300124393E-4d);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.236605282015445d, 0.6823220100278267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8590425780898756d + "'", double2 == 3.8590425780898756d);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 143);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9983453608739179d) + "'", double1 == (-0.9983453608739179d));
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 8.544922E-4f, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.526180544758368E-99d + "'", double2 == 6.526180544758368E-99d);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        long long1 = org.apache.commons.math3.util.FastMath.abs(46L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6679190596134985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5836093769897774d + "'", double1 == 0.5836093769897774d);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.844162835840419d, (double) 24.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.844162835840419d + "'", double2 == 3.844162835840419d);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.026928583045972357d, 3.8590425780898756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026928583045972357d + "'", double2 == 0.026928583045972357d);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(96.99998474121094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.689738504771d + "'", double1 == 5557.689738504771d);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.223372E18f, 1499.9999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-16.999998f), (-0.8625334306123279d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6214901230900174d) + "'", double2 == (-1.6214901230900174d));
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.4665671894765713d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.885315488201766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9014757E33f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1561034226520874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5707963266113099d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0177687694936988d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(302.99392026315724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17360.2728492023d + "'", double1 == 17360.2728492023d);
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        long long2 = org.apache.commons.math3.util.FastMath.max(187L, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187L + "'", long2 == 187L);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(4.060443010546419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.008620689655164d + "'", double1 == 29.008620689655164d);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 8.0f, 2.2557079554805255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.416462082982836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.416462082982836d + "'", double1 == 0.416462082982836d);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.026931837701290248d, (double) 0.024414062f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026931837701290248d + "'", double2 == 0.026931837701290248d);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        double double1 = org.apache.commons.math3.util.FastMath.rint(15.00402842524522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4056476107177884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.53767557677737d + "'", double1 == 80.53767557677737d);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.003433649623862475d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034336563709592006d) + "'", double1 == (-0.0034336563709592006d));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 20L, 1.8626451E-9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-56.83127452036154d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.83127452036154d + "'", double1 == 56.83127452036154d);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-2.556405539239385E-98d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        float float1 = org.apache.commons.math3.util.FastMath.signum(47.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.000003517638176d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        int int2 = org.apache.commons.math3.util.FastMath.min(108, 491);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 108 + "'", int2 == 108);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02366983698680812d + "'", double1 == 0.02366983698680812d);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 52, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        float float2 = org.apache.commons.math3.util.FastMath.min((-253.99998f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-253.99998f) + "'", float2 == (-253.99998f));
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7948748463561401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.584935296030974d + "'", double1 == 0.584935296030974d);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.001799908286954d, (double) (-54.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.6831251162316458d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) -1, 1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        double double2 = org.apache.commons.math3.util.FastMath.max(41.58883077399207d, 6.771877497737997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.58883077399207d + "'", double2 == 41.58883077399207d);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.9885260408288E48d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 161 + "'", int1 == 161);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.012849082387449818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        float float1 = org.apache.commons.math3.util.FastMath.signum(22026.002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.16193403859934294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5450621802626748d) + "'", double1 == (-0.5450621802626748d));
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 63, (float) (-458));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-458.0f) + "'", float2 == (-458.0f));
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1833.4657482540374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4657482540376d + "'", double1 == 1833.4657482540376d);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 192.2168091200164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2.3611831E21f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05574369764854615d + "'", double1 == 0.05574369764854615d);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0130505418701649E-214d, 2.4890291189784026d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0130505418701649E-214d + "'", double2 == 1.0130505418701649E-214d);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 5.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        long long2 = org.apache.commons.math3.util.FastMath.max(388L, 384L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 388L + "'", long2 == 388L);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        long long1 = org.apache.commons.math3.util.FastMath.abs(11L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11L + "'", long1 == 11L);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 12, (double) 1024L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.000000000000002d + "'", double2 == 12.000000000000002d);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.310887241768095E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        double double1 = org.apache.commons.math3.util.FastMath.log10(385.1183156145558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5855941734687002d + "'", double1 == 2.5855941734687002d);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        double double1 = org.apache.commons.math3.util.FastMath.atan(7.624619224577892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4403865801148885d + "'", double1 == 1.4403865801148885d);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.49153001315302697d, (double) 152575.98f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 152575.984375d + "'", double2 == 152575.984375d);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.775734173777395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8559103178194135d) + "'", double1 == (-0.8559103178194135d));
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 3.46573584319508d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        long long2 = org.apache.commons.math3.util.FastMath.min(2979L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.014918745881023593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8547811746108328d) + "'", double1 == (-0.8547811746108328d));
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 458L, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 458.0f + "'", float2 == 458.0f);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7005101697610547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1936025680325977d + "'", double1 == 1.1936025680325977d);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.16965243226939253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7704399095903134d) + "'", double1 == (-0.7704399095903134d));
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.272740699632835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        float float2 = org.apache.commons.math3.util.FastMath.max(32768.004f, 18.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.004f + "'", float2 == 32768.004f);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-3.5963016834733655E18d), 14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.05320843214628E259d + "'", double2 == 6.05320843214628E259d);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0018190895165525042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001819088513299853d + "'", double1 == 0.001819088513299853d);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.8E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.06703019001296902d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06708039624927777d) + "'", double1 == (-0.06708039624927777d));
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.012395549457626073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012395549457626073d + "'", double1 == 0.012395549457626073d);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-126.99998f), (-0.09715902486194199d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-126.9999771118164d) + "'", double2 == (-126.9999771118164d));
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8429167374147226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6873508701757689d + "'", double1 == 0.6873508701757689d);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.038197183512634486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2649934961235467d) + "'", double1 == (-3.2649934961235467d));
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        double double2 = org.apache.commons.math3.util.FastMath.min(89.54726317526658d, 168.50112223820605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.54726317526658d + "'", double2 == 89.54726317526658d);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.8123449763706567d, (-16.56785485576075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8123449763706565d + "'", double2 == 1.8123449763706565d);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 99L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 99.00001f + "'", float1 == 99.00001f);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        int int2 = org.apache.commons.math3.util.FastMath.max(25, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(20.000002f, 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.71798708E11f + "'", float2 == 1.71798708E11f);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9972507612813156d, 53248.00000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9972507612813157d + "'", double2 == 0.9972507612813157d);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-108));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 108 + "'", int1 == 108);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9426286359925616d, 1.407294356934878d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5901799193367706d + "'", double2 == 0.5901799193367706d);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0000000422840953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.228409444227011E-8d + "'", double1 == 4.228409444227011E-8d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6405565398607552E8d, 0.32282599469037687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 448.7585192176584d + "'", double2 == 448.7585192176584d);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10.142599071873668d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8149601367384811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7443075819860243d + "'", double1 == 0.7443075819860243d);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.4757397E20f, (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.4648862355425744d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.03798492218294381d, 0.9999999999995453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03798492218294381d + "'", double2 == 0.03798492218294381d);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 18, 1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 93.66090584521052d + "'", double2 == 93.66090584521052d);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.765584592358123E27d + "'", double1 == 2.765584592358123E27d);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.1884223E32f, 2.0769192E34f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884223E32f + "'", float2 == 1.1884223E32f);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.031250004f, (-5.877472E-39f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.877472E-39f) + "'", float2 == (-5.877472E-39f));
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.0f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5f + "'", float2 == 1.5f);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        long long1 = org.apache.commons.math3.util.FastMath.abs(384L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 384L + "'", long1 == 384L);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6952633082705699d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.9843749f, (-63));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.1514636E-19f + "'", float2 == 2.1514636E-19f);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-12L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.0f + "'", float1 == 12.0f);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-10.07608628613008d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        int int2 = org.apache.commons.math3.util.FastMath.min((-22), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.4477986981010615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.56286532599412d + "'", double1 == 11.56286532599412d);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-108));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.01450228138603884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8309195167311593d) + "'", double1 == (-0.8309195167311593d));
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9894279459928965d + "'", double1 == 1.9894279459928965d);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9816129037711879d, 29.008620689655164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9816129037711879d + "'", double2 == 0.9816129037711879d);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-148.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-148.0d) + "'", double1 == (-148.0d));
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-100L), 2.626485134661138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }
}

